package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class PairedTag extends Tag {

    private String text;
    private List<Tag> tags;

    PairedTag(String data, Map<String, String> map,
              String inputText, List<Tag> inputTags) {
        super(data, map);
        this.text = inputText;
        this.tags = inputTags;
    }

    public String getText() {
        return text;
    }

    public List<Tag> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        String init = super.toString() + text;
        String end = "</" + super.getData() + ">";
        return tags.stream()
                .map(e -> e.toString())
                .collect(Collectors.joining("", init, end));

        /*
        result += this.text;
        for (Tag singleTag: this.list) {
            result += singleTag.toString();
        }
        result += "</" + super.getName() + ">";
        return result;

         */
    }
}
// END
