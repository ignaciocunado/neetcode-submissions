class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();

        for(String s : strs) {
            sb.append("" + s.length() + ",");
        }
        sb.append("#");

        for(String s : strs) {
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0) {
            return Collections.emptyList();
        }

        String[] lengths = str.substring(0, str.indexOf("#")).split(",");
        String strings = str.substring(str.indexOf("#") + 1, str.length());

        List<String> res = new ArrayList<>();
        int index = 0;
        for(String lengthS : lengths) {
            int length = Integer.parseInt(lengthS);
            res.add(strings.substring(index, index + length));
            index += length;
        }

        return res;
    }
}
