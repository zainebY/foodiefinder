//package com.example.demojava.Test;
//
//import com.example.demojava.Entitys.Users;
//import com.example.demojava.Services.ServiceUsers;
//
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//public class Test_User {
//    public static void main(String[] args) {
//
//        ServiceUsers ser = new ServiceUsers();
//
//        try {
//            Users p1 = new Users(1266, "amina", "zaineb", "zainebrdb@gmail.com", "zaineb123", "client");
//            Users p2 = new Users(126, "yaich", "zaineb", "zainebrbbdd@gmail.com", "zaineb123", "client");
//            Users p3 = new Users(12, "dammak", "zaineb", "zainebbbrbd@gmail.com", "zaineb123", "client");
//
//             ser.ajouter(p1);
//            //ser.ajouter(p2);
//            //ser.ajouter(p3);
//
//
//            System.out.println("user ajouté");
//
//
//            ArrayList<Users> l = null;
//
//            l = ser.consulterAll();
//
//            l.forEach(e -> System.out.println(e));
//
//            Users updateU = ser.get(76);
//            updateU.setNom("jamila");
//            updateU.setPrenom("prenom");
//            updateU.setEmail("email@gmail.com");
//            updateU.setMotDePasse("motdepasse ");
//            updateU.setTypeUtilisateur("typeutilisateur ");
//            ser.update(updateU);
//            System.out.println("mise à jour user avec succès!");
//            System.out.println(updateU);
//
//            Users deleteU = ser.get(43);
//            ser.delete(deleteU.getUserID());
//            System.out.println("Personne supprimée avec succès!");
//            System.out.println(deleteU);
//
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//
//
//    }
//}
