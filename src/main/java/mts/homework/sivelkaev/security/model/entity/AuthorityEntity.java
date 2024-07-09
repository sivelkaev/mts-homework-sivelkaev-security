package mts.homework.sivelkaev.security.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "authorities")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorityEntity {
    @Id
    @NotNull
    @Length(min = 1, max = 50)
    @Column(name = "username")
    private String username;

    @NotNull
    @Length(min = 1, max = 50)
    @Column(name = "role")
    private String role;
}
