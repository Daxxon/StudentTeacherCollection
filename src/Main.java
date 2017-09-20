import java.util.*;

public class Main {
  public static void main(String[] args) {
    Student arnold = new Student();
    Student beatrice = new Student();
    Student charles = new Student();
    Student darlene = new Student();
    Student erik = new Student();
    Student francine = new Student();
    Student george = new Student();
    Student helga = new Student();
    Student ian = new Student();
    Student janice = new Student();
    Student karl = new Student();
    Student lauren = new Student();
    Student matt = new Student();
    Student nicole = new Student();
    Student olaf = new Student();

    List<Student> students = new ArrayList<>();

    arnold.setFirstName("Arnold");
    students.add(arnold);

    beatrice.setFirstName("Betty");
    students.add(beatrice);

    charles.setFirstName("Charles");
    students.add(charles);

    darlene.setFirstName("Darlene");
    students.add(darlene);

    erik.setFirstName("Erik");
    students.add(erik);

    francine.setFirstName("Francine");
    students.add(francine);

    george.setFirstName("George");
    students.add(george);

    helga.setFirstName("Helga");
    students.add(helga);

    ian.setFirstName("Ian");
    students.add(ian);

    janice.setFirstName("Janice");
    students.add(janice);

    karl.setFirstName("Karl");
    students.add(karl);

    lauren.setFirstName("Lauren");
    students.add(lauren);

    matt.setFirstName("Matt");
    students.add(matt);

    nicole.setFirstName("Nicole");
    students.add(nicole);

    olaf.setFirstName("Olaf");
    students.add(olaf);

    for (int i=0; i<students.size(); i++) {
      students.get(i).setLastName("Jenkins");
      students.get(i).setGrade(1);
      students.get(i).setId(i + 1);
    }

    List<Teacher> teachers = new ArrayList<>();

    Teacher paul = new Teacher();
    Teacher rita = new Teacher();
    Teacher stephen = new Teacher();

    paul.setFirstName("Paul");
    teachers.add(paul);

    rita.setFirstName("Rita");
    teachers.add(rita);

    stephen.setFirstName("Stephen");
    teachers.add(stephen);

    for (int i=0; i<teachers.size(); i++) {
      teachers.get(i).setLastName("Jones");
      teachers.get(i).setGrade(1);
      teachers.get(i).setId(i + 1);
    }

    Map<Teacher, Set> firstGradeRoster = new HashMap<>();

    Set<Student> firstGroup = new HashSet<>();
    firstGroup.add(arnold);
    firstGroup.add(beatrice);
    firstGroup.add(charles);
    firstGroup.add(darlene);
    firstGroup.add(erik);

    Set<Student> secondGroup = new HashSet<>();
    secondGroup.add(francine);
    secondGroup.add(george);
    secondGroup.add(helga);
    secondGroup.add(ian);
    secondGroup.add(janice);

    Set<Student> thirdGroup = new HashSet<>();
    thirdGroup.add(karl);
    thirdGroup.add(lauren);
    thirdGroup.add(matt);
    thirdGroup.add(nicole);
    thirdGroup.add(olaf);

    firstGradeRoster.put(paul, firstGroup);
    firstGradeRoster.put(rita, secondGroup);
    firstGradeRoster.put(stephen, thirdGroup);

//    lines 124 and 125 are only in this program because the assignment specifically asked for them.
//    lines 127-131 present the same data in an way that is easier to read.
//    System.out.println(firstGradeRoster.keySet());
//    System.out.println(firstGradeRoster.values());
//
//    for (Teacher teacher : firstGradeRoster.keySet()) {
//      System.out.print("Teacher: ");
//      System.out.println(teacher.toString());
//      System.out.print(teacher.toString() + "'s students: ");
//      System.out.println(firstGradeRoster.get(teacher));
//    }

//    using entrySet() for the extra cred
    Set mySet = firstGradeRoster.entrySet();
    System.out.println("Set values: " + mySet);

//    using entrySet() another way just in case first wasn't good enough
    for (Map.Entry<Teacher, java.util.Set> entry : firstGradeRoster.entrySet()) {
      System.out.println("Key : " + entry.getKey() + "\n" + "Value : " + entry.getValue());
    }
  }
}