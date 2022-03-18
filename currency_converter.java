import java.util.Scanner;

class currency_converter {

    static void process() {

        Scanner ask_mode = new Scanner(System.in);
        System.out.println("1.) Euros to kc [type '1']");
        System.out.println("2.) Kc to euros [type '2']");
        

        try {

            int mode_str = Integer.parseInt(ask_mode.nextLine());


            if (mode_str == 1 || mode_str == 2) {

                Scanner ask_amt = new Scanner(System.in);
                //clear();
                System.out.println("Enter how much money you have: ");
                

                try {
                    float money_amt = Float.parseFloat(ask_amt.nextLine());

                    if (mode_str == 1) {

                        float money_result = money_amt * 25;
                        System.out.println("You have " + money_result + " kc");
                        process();

                    }

                    else if (mode_str == 2) {

                        float money_result = money_amt / 25;
                        System.out.println("You have " + money_result + " eur");
                        

                    }

                }

                catch (Exception e) {

                    clear();
                    System.out.println("Error. You need to enter a number.");
                    process();

                }
                
                ask_amt.close();
                ask_mode.close();

            }
        


            else if (mode_str != 1 || mode_str != 2) {

                clear();
                System.out.println("Error, you need to type one of the 2 mentioned.");
                process();
                

            }
        }

        catch (Exception e) {

            clear();
            System.out.println("Error. Please enter a valid value.");
            process();

        }



    }


    public static void main(String[] args) {

        clear();
        //System.out.println("Hello");
        process();

    }

    static void clear() {

        System.out.print("\033[H\033[2J");  
        System.out.flush();  

    }

}