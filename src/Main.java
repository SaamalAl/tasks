public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        String[] words = {"hello","world"};

        Object[] combined = new Object[numbers.length+ words.length];

        int index = 0;
        for(int number : numbers){
            combined[index++]=number;
        }
        for(String word : words){
            combined[index++]=word;
        }

        for(Object obj : combined){
            System.out.println(obj);
        }
    }
}
