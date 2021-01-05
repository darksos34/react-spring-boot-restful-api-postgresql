package nl.codebean.reactspringboot.topics.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter

@Entity
@NoArgsConstructor
@Table(name = "topic_table") // Define table name
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "topic_name", unique = true, nullable = false)
    private String name;

    @Column(name = "topic_description", nullable = false)
    private String description;


    // Args constructor
    public Topic(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

}
