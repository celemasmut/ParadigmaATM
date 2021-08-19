package SocialNetwork;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SocialNetworkFactory socialNetworkFactory = new SocialNetworkFactory();

        User user1 = new User("Cele");
        User user2 = new User("Indi");
        User user3 = new User("Murmu");
        User user4 = new User("Agus");

        user1.addFollower(user2);
        user1.addFollower(user3);
        user1.addFollower(user4);

        user1.sendMessage("Hola seguidores");

        user1.deleteFollower(user2);

        user1.sendMessage("Hola a todxs!");

        System.out.print("Ingrese el mensaje que desea postear: ");
        String message = scanner.next();
        scanner.nextLine();

        System.out.println("\nElija en qué red social desea postear su mensaje:\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int opcion = scanner.nextInt();
        SocialNetwork redSocial = socialNetworkFactory.creadorDeRedSocial(opcion, user1.getNombre(), "hola123");
        redSocial.post(message);
    }

    }

