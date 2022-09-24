package builder.lazy;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .phoneNumber("12123")
                .email("email")
                .name("Stefan")
                .cnp("123")
                .build();

        System.out.println(student);
    }
}
