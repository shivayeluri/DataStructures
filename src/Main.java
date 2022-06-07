import dataStructures.ChooseMenu;

public class Main {
    public static void main(String[] args) {
        try{
            new ChooseMenu().menuOf(Integer.parseInt(args[0]));
        }catch (Exception e){
            System.out.println(e);
        }

    }
}