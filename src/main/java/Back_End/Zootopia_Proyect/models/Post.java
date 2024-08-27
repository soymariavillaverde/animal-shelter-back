package Back_End.Zootopia_Proyect.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name= "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private long id;
    @Column (name = "title", nullable = false)
    private String title;
    @Column (name = "description",columnDefinition = "LONGTEXT", nullable = false)
    private String description;
   // @Column (name = "date", nullable = false)
  //  private LocalDate date;
    @Column (columnDefinition = "LONGTEXT")
    private String urlImg;
   // @PrePersist
   // public void setDate() {
       // this.date = LocalDate.now();
   // }

}