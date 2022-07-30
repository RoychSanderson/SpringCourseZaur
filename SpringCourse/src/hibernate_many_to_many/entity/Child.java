package hibernate_many_to_many.entity;

import org.hibernate.Session;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "children")
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String firstname;

    @Column(name = "age")
    private int age;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(name = "child_section"
            , joinColumns = @JoinColumn(name = "child_id")
            , inverseJoinColumns = @JoinColumn(name = "section_id"))
    private List<Section> sectionList;

    private Child() {

    }

    public Child(String firstname, int age) {
        this.firstname = firstname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Section> getSectionList() {
        return sectionList;
    }

    public void setSectionList(List<Section> sectionList) {
        this.sectionList = sectionList;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", age=" + age +
                '}';
    }

    public void addSectionToChild(Section section){
        if (sectionList == null){
            sectionList = new ArrayList<>();
        }
        sectionList.add(section);
    }
}
