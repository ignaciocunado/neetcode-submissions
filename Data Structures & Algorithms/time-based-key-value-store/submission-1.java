class TimeMap {

    HashMap<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer, String> timestampToVal = map.get(key);
        if(timestampToVal == null) {
            return "";
        }

        List<Map.Entry<Integer, String>> vals = new ArrayList<>(timestampToVal.entrySet());

        int low = 0;
        int high = vals.size() - 1;
        String res = "";
        while(low <= high) {
            int mid = low + (high - low) / 2;
            
            if(vals.get(mid).getKey() == timestamp) {
                return vals.get(mid).getValue();
            }

            if(vals.get(mid).getKey() > timestamp) {
                high = mid - 1;
            }
            else {
                res = vals.get(mid).getValue();
                low = mid + 1;
            }
        }

        return res;
    }
}
