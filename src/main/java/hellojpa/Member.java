package hellojpa;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author kangmoo Heo
 */
@Entity
@Data
public class Member {
    @Id
    private Long id;
    private String name;
}