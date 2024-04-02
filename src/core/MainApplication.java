package core;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
@author erwan
 */

public class MainApplication {
    
    public static void main(String[] args) throws ParseException{
        
        String nom;
        String email; 
        String address;
        String telNumber;
        String change;
        Date date_de_naissance;
        String code;
        Repertoire rep = new Repertoire();
        
        System.out.println("Bienvenu sur l'application de gestion de contacts");
        System.out.println("Nous vous proposons d'enregistrer les contacts avant de commencer");
        Integer j = 1;
        while (j!=0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez entrer le code ");
            code = sc.nextLine();
            System.out.println("Veuillez entrer le nom ");
            nom = sc.nextLine();
            System.out.println("Veuillez entrer la date de naissance ");
            change = sc.nextLine();
            date_de_naissance = new SimpleDateFormat("dd/MM/yyyy").parse(change);
            System.out.println("Veuillez entrer l'addresse ");
            address = sc.nextLine();
            System.out.println("Veuillez entrer l'email ");
            email = sc.nextLine();
            System.out.println("Veuillez entrer le numero de telephone");
            telNumber = sc.nextLine();
            Contact pers = new Contact(code,nom,date_de_naissance,address,email,telNumber);
            rep.ajoutContact(pers);
            System.out.println("Avez vous fini? 0 : Oui / 1: Non");
            Integer c = sc.nextInt();
            if(c==0){
                j=0;
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Selectionnez une opération parmi celles ci-dessous");
        System.out.println("1- Rechercher un contact");
        System.out.println("2- Ajouter un contact");
        System.out.println("3- Modifier un contact");
        Integer i  = sc.nextInt();
        if (i == 1){
            System.out.println("Veuillez entrer les identifiants de l'utilisateur que vous recherchez");
            System.out.println("le code ");
            code = sc.nextLine();
            System.out.println("le nom ");
            nom = sc.nextLine();
            System.out.println("la date de naissance ");
            change = sc.nextLine();
            date_de_naissance = new SimpleDateFormat("dd/MM/yyyy").parse(change);
            System.out.println("l'addresse ");
            address = sc.nextLine();
            System.out.println("l'email ");
            email = sc.nextLine();
            System.out.println("le numero de telephone");
            telNumber = sc.nextLine();
            Contact pers = new Contact(code,nom,date_de_naissance,address,email,telNumber);
            rep.rechercher_Contact(pers);
        
        }else if (i==2){
            System.out.println("Veuillez entrer les identifiants de l'utilisateur que vous recherchez");
            System.out.println("le code ");
            code = sc.nextLine();
            System.out.println("le nom ");
            nom = sc.nextLine();
            System.out.println("la date de naissance ");
            change = sc.nextLine();
            date_de_naissance = new SimpleDateFormat("dd/MM/yyyy").parse(change);
            System.out.println("l'addresse ");
            address = sc.nextLine();
            System.out.println("l'email ");
            email = sc.nextLine();
            System.out.println("le numero de telephone");
            telNumber = sc.nextLine();
            Contact pers = new Contact(code,nom,date_de_naissance,address,email,telNumber);
            rep.ajoutContact(pers);
        
        }else if (i == 3){
            System.out.println("Veuillez entrer les identifiants de l'utilisateur que vous recherchez");
            System.out.println("le code ");
            code = sc.nextLine();
            System.out.println("le nom ");
            nom = sc.nextLine();
            System.out.println("la date de naissance ");
            change = sc.nextLine();
            date_de_naissance = new SimpleDateFormat("dd/MM/yyyy").parse(change);
            System.out.println("l'addresse ");
            address = sc.nextLine();
            System.out.println("l'email ");
            email = sc.nextLine();
            System.out.println("le numero de telephone");
            telNumber = sc.nextLine();
            Contact pers = new Contact(code,nom,date_de_naissance,address,email,telNumber);
            rep.updateContact(pers);
        }
        

    }
}
