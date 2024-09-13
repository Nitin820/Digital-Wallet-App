package array.com;

public class main {
    public static void main(String[] args) {
  
        Integer[] intArray = {10, 20, 5, 35, 50};
        MinMax<Integer> intMinMax = new integerMinMax();
        System.out.println("Integer Array Min: " + intMinMax.findMin(intArray));
        System.out.println("Integer Array Max: " + intMinMax.findMax(intArray));

      
        String[] strArray = {"Apple", "Banana", "Grape", "Mango"};
        MinMax<String> strMinMax = new stringMinMax();
        System.out.println("String Array Min: " + strMinMax.findMin(strArray));
        System.out.println("String Array Max: " + strMinMax.findMax(strArray));

       
        Character[] charArray = {'A', 'Z', 'K', 'D'};
        MinMax<Character> charMinMax = new characterMinMax();
        System.out.println("Character Array Min: " + charMinMax.findMin(charArray));
        System.out.println("Character Array Max: " + charMinMax.findMax(charArray));

       
        Float[] floatArray = {10.5f, 5.2f, 7.8f, 3.1f};
        MinMax<Float> floatMinMax = new floatMinMax();
        System.out.println("Float Array Min: " + floatMinMax.findMin(floatArray));
        System.out.println("Float Array Max: " + floatMinMax.findMax(floatArray));
    }
}
