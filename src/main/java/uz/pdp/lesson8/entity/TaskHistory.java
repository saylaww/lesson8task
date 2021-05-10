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
public class TaskHistory extends AbsUUIDEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private Task task;

    private String changeFieldName;

    private String before;
    private String after;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

}
