package array.com;

class stringMinMax implements MinMax<String> {

    @Override
    public String findMin(String[] array) {
        String min = array[0];
        for (String str : array) {
            if (str.compareTo(min) < 0) {
                min = str;
            }
        }
        return min;
    }

    @Override
    public String findMax(String[] array) {
        String max = array[0];
        for (String str : array) {
            if (str.compareTo(max) > 0) {
                max = str;
            }
        }
        return max;
    }
}
