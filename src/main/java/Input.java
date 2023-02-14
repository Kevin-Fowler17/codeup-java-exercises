public class Input {

        public static void main(String[] args) {
//            Input input = new Input();
            Util.Input myInput = new Util.Input();
            System.out.println(myInput.getString("Enter a string: "));

//            System.out.println("Enter a string: ");
//            String str = myInput.getString("Enter a string: ");
//            System.out.println("You entered: " + str);

                int x = myInput.getInt(5, 10);
                System.out.println(x);
                double y = myInput.getDouble(5, 10);
                System.out.println(y);

        }

}
