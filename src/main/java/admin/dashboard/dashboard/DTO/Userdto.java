package admin.dashboard.dashboard.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Userdto{
    private String userName;
    private String email;
    private String role;
    private String password;
}
