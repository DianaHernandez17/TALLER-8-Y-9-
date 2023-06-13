package co.edu.sena.proyect_diana2687365.model.repository;

import co.edu.sena.proyect_diana2687365.model.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl {
    public  static void main(String [] args ) throws SQLException{
    Repository<User> repository = new UserRepositoryImpl();

    System.out.println("========== saveObj Insert ==========");//insert

    User userInsert = new User();
    userInsert.setUser_firstname("Carlos");
    userInsert.setUser_lastname("rojas");
    userInsert.setUser_email("carlos@LoQueSea.com");
    userInsert.setUser_password("CARLOS12345");
    repository.saveObj(userInsert);

    userInsert.setUser_firstname("pEpE");
    userInsert.setUser_lastname("perez");
    userInsert.setUser_email("PEPE@correo.com");
    userInsert.setUser_password("6780pEpE");
    repository.saveObj(userInsert);

    System.out.println("========= listAllObj =========");
    repository.listAllObj().forEach(System.out::println);
    System.out.println();

    System.out.println("========= byIdObj ===========");
    System.out.println(repository.byIdObj(1));
    System.out .println();

    System.out .println("========= saveObj =========="); //update
    User userUpdate;
        userUpdate = new User();
        userUpdate.setUser_id(2);
        userUpdate. setUser_firstname("Diana");
        userUpdate.setUser_lastname("Hernandez");
        userUpdate. setUser_email ("alejandra@email.com");
        userUpdate. setUser_password("129144534662");
        repository.saveObj(userInsert);


    repository. listAllObj().forEach(System.out::println);

    System.out.println();

    System.out.println("========== delete0bj ==========");
    repository.deleteObj(2);
    repository. listAllObj().forEach(System.out::println);

}
}// TestUserRepositoryImpl


