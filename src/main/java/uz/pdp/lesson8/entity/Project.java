package uz.pdp.lesson8.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.lesson8task.entity.template.AbsUUIDEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Project extends AbsUUIDEntity {

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Space space;

    private boolean accessType;
    private boolean archived;

    private String color;



}
