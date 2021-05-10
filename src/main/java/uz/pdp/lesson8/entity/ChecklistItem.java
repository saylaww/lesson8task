package uz.pdp.lesson8.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.lesson8task.entity.template.AbsLongEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ChecklistItem extends AbsLongEntity {

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Checklist checklist;

    private boolean resolved;

    @ManyToOne(fetch = FetchType.LAZY)
    private User assignedUser;


}
