package lt.simonasjankauskas.app;

public class Stringai {
    public static void main(String[] args) {
        // 1. Atsakymas
        System.out.println("Sveiki, Jonai,\nkaip sekasi?");
        // 2. Atsakymas
        String a = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        System.out.println(a.toLowerCase()); // Stringas į mažasias raides
        System.out.println(a.toUpperCase()); // Stringas į didžiasias raides
        System.out.println(a.replaceAll("o", "z")); // Stringo "o" raidės į "z" raides
        // Išsiaiškinti ar stringas baigiasi žodžiu elit, true or false
        boolean b = a.endsWith("elit");
        System.out.println("String a baigiasi su žodžiu elit:" + b);
    }
}
