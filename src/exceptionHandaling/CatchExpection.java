package exceptionHandaling;

public class CatchExpection {
    static void main() {
        String name = null;
        boolean wasLowecase = false;
        try {
            if (name.equals(name.toLowerCase())){
                wasLowecase = true;
            }
        } catch (Exception e) {
            System.out.println("The name was not a word");
        }
        if (wasLowecase){
            System.out.println(name.toUpperCase());
        }
    }
}
/*
* so you can try that with the scanner when the user enters number instead of characters and things like that file IO also*/