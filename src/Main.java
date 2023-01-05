public class Main {
    public static void main(String[] args) {
        try {

            Employee[] e_arr = new Employee[3];

            e_arr[0] = new Employee("Mihail", "Largin", 200);
           e_arr[1] = new Employee("Trevor", "Bacrit", 143);
            e_arr[2] = new Employee("Eduard", "Hovart", 20);

            for (int i = 0; i < e_arr.length; i++)
                System.out.println(e_arr[i]);

        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
           e.printStackTrace();
        }


    }
}