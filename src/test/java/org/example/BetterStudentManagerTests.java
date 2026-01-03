package org.example;

import org.junit.Test;

public class  BetterStudentManagerTests {
    @Test
    public void testAddStudent() {
        BetterStudentManager  manager = new BetterStudentManager();
        manager.addStudent("John", 90.9);
        manager.addStudent("Jane", 88.3);
        assert manager.students.size() == 2;
        assert manager.students.get(0).name.equals("John");
        assert manager.students.get(0).grade == 90.9;
        assert manager.students.get(1).name.equals("Jane");
        assert manager.students.get(1).grade == 88.3;
    }
     @Test
    public void testAddEmptyStringName(){
        BetterStudentManager manager = new BetterStudentManager();
        manager.addStudent("", 98.7);
        manager.addStudent("", 88.8);
        manager.addStudent("Cara", 83.7);
        assert manager.students.size() == 3;
        assert manager.students.get(0).name.isEmpty();
        assert manager.students.get(0).grade == 98.7;
        assert manager.students.get(1).name.isEmpty();
        assert manager.students.get(1).grade == 88.8;
        assert manager.students.get(2).name.equals("Cara");
        assert manager.students.get(2).grade == 83.7;

    }

    @Test
    public void testRemoveStudent() {
        BetterStudentManager  manager = new BetterStudentManager();
        manager.addStudent("John", 90.9);
        manager.addStudent("Jane", 88.3);
        manager.removeStudent("John");
        assert manager.students.size() == 1;
        assert manager.students.getFirst().name.equals("Jane");
        assert manager.students.getFirst().grade == 88.3;
    }
@Test
public void testRemoveIncorrectStudentName(){
  BetterStudentManager manager = new BetterStudentManager();
  manager.addStudent("Ira", 98.9);
  manager.addStudent("Lara", 99.8);
  manager.addStudent("Lara", 98.8);
  manager.addStudent("Lara", 96.8);
  manager.removeStudent("Lara");

}

    @Test
    public void testGetStudentList() {
        BetterStudentManager  manager = new BetterStudentManager();
        manager.addStudent("John", 90.9);
        manager.addStudent("Jane", 88.3);
        assert manager.getStudentList().equals("\r\nJohn 90.9\r\nJane 88.3");
    }
}
