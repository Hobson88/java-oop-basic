import controller.UserController;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserMain {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.addUser("Robert", "Krawczak","hobson88", "1234","rob@t.pl", "700111700", LocalDate.of(1944,2,2), LocalDateTime.now());
        uc.addUser("Magdalena", "Krawczak","cudownaZonka", "0000","m@m.mk", "700111701", LocalDate.of(1993,12,3), LocalDateTime.now());
        uc.addUser("Franciszek", "Krawczak","synek", "kdi3djnjcnvnv","f@m.mk", "700111702", LocalDate.of(2017,12,11), LocalDateTime.now());
        uc.getAllUsers();
    }

}

