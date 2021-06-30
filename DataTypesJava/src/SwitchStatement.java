public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Dark";
        switch (colorModeSelected){
            case "Light":
                System.out.println("choosen Light Mode");
                break;
            case "Night":
                System.out.println("choosen Night Mode");
                break;
            case "Blue Dark":
                System.out.println("choosen Blue dark Mode");
                break;
            case "Dark":
                System.out.println("choosen Dark Mode");
                break;
            default:
                System.out.println("choose an option");
        }

    }
}
