package np.edu.kathford.wastemanagementsystem.model;

import java.util.Date;

import lombok.Data;

@Data
public class User {

    private Long id;

    private String name;

    private String username;

    private String password;
    
    private String address;

    private String mobileNo;

    private String email;

    private String type;  // eg : driver / collector or user/client/general public
}
