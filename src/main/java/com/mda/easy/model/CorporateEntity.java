package com.mda.easy.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "corporate_Entity")
public class CorporateEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    private String name;

//    @OneToMany(mappedBy = "corporateEntity", fetch = FetchType.LAZY)
//    private Set<Employee> employee;

//    public CorporateEntity(@NotBlank String name, Set<Employee> employee) {
//        this.name = name;
//        this.employee = employee;
//    }

    public CorporateEntity(@NotBlank String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Set<Employee> getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Set<Employee> employee) {
//        this.employee = employee;
//    }
}
