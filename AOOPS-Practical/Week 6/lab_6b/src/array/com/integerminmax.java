package array.com;

class integerMinMax implements MinMax<Integer> {

    @Override
   public Integer findMin(Integer[] array) {
        Integer min = array[0];
        for (Integer num : array) {
            if (num.compareTo(min) < 0) {
                min = num;
            }
        }
        return min;
    }

    @Override
    public Integer findMax(Integer[] array) {
        Integer max = array[0];
        for (Integer num : array) {
            if (num.compareTo(max) > 0) {
                max = num;
            }
        }
        return max;
    }
}
