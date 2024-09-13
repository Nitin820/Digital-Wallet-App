package array.com;

class characterMinMax implements MinMax<Character> {

    @Override
    public Character findMin(Character[] array) {
        Character min = array[0];
        for (Character ch : array) {
            if (ch.compareTo(min) < 0) {
                min = ch;
            }
        }
        return min;
    }

    @Override
    public Character findMax(Character[] array) {
        Character max = array[0];
        for (Character ch : array) {
            if (ch.compareTo(max) > 0) {
                max = ch;
            }
        }
        return max;
    }
}
