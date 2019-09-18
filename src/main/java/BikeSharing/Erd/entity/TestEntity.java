package BikeSharing.Erd.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "testentity")
@Data
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    private LocalDateTime startapp;

    public void setStartapp(LocalDateTime withNano) {
        this.startapp = startapp;
    }//todo ломбок с компиляционными ошибками
}