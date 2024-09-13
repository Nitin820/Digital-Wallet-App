package array.com;

class floatMinMax implements MinMax<Float> {

    @Override
    public Float findMin(Float[] array) {
        Float min = array[0];
        for (Float num : array) {
            if (num.compareTo(min) < 0) {
                min = num;
            }
        }
        return min;
    }

    @Override
    public Float findMax(Float[] array) {
        Float max = array[0];
        for (Float num : array) {
            if (num.compareTo(max) > 0) {
                max = num;
            }
        }
        return max;
    }
}
