package exercise.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import java.util.stream.Collectors;
import static exercise.Data.getCompanies;

public class CompaniesServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                throws IOException, ServletException {
        // BEGIN
        List<String> companies = getCompanies();
        PrintWriter out = response.getWriter();
        String reqStr = request.getQueryString();
        String param = request.getParameter("search");
        String result = "";

        if (param == "" || reqStr == null || !reqStr.contains("search")) {
            companies.forEach(out::println);
        } else {
           result = companies.stream()
                   .filter(item -> item.contains(param))
                   .collect(Collectors.joining("\n"));
           out.print(result.equals("") ? "Companies not found" : result);
        }
        // END
    }
}
