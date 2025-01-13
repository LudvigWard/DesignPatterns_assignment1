package task2;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private List<Role> roles = new ArrayList<>();

    public Employee(String name, String department, Role initialRole) {
        this.name = name;
        this.department = department;
        roles.add(initialRole);
    }

    public void addRole(Role newRole) {
        roles.add(newRole);
    }

    public void removeRole(String nameOfRoleToRemove) {
        roles.removeIf(r -> r.name().equals(nameOfRoleToRemove));
    }

    public String name() {
        return name;
    }

    public String department() {
        return department;
    }

    @Override
    public String toString() {
        return String.format("%s at %s with roles %s", name, department, roles);
    }
}