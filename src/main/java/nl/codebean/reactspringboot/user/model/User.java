package nl.codebean.reactspringboot.user.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nl.codebean.reactspringboot.profile.model.Profile;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "users") // Define table name
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 65)
    private String firstName;

    @NotBlank
    @Size(max = 65)
    private String lastName;

    @NotBlank
    @Email
    @Size(max = 100)
    private String email;


    @NotBlank
    @Size(max = 128)
    private String password;

    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "user")

    private Profile Profile;

    public User(String firstName, String lastName, String email, String password, Profile Profile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.Profile = Profile;

    }
}
