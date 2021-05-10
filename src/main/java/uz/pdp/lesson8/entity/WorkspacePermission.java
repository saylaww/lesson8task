package uz.pdp.lesson8.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.lesson8task.entity.enums.WorkspacePermissionName;
import uz.pdp.lesson8task.entity.template.AbsUUIDEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkspacePermission extends AbsUUIDEntity {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private WorkspaceRole workspaceRole;//O'RINBOSAR

    @Enumerated(EnumType.STRING)
    private WorkspacePermissionName permission;//add member,remove member
}
