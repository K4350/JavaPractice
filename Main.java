// Reverse a String
// Kaushik

class Main {
    public static void main(String[] args) {

        StringBuilder name = new StringBuilder("kaushik");

        for(int i = 0; i < name.length()/2; i++){
            int start = i;
            int end = name.length() - 1 -i;

            char font = name.charAt(start);
            char last = name.charAt(end);

            name.setCharAt(start, last);
            name.setCharAt(end, font);
        }

        System.out.println(name);
    }
}