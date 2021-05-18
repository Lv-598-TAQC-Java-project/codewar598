package util;

public enum UserNames {
    OREST(1L, "Orest");

    private final Long id;
    private final String studentName;

    UserNames(long id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public Long getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public static UserNames getById(Long id) {
        for (UserNames user : values()) {
            if (user.id.equals(id)) {
                return user;
            }
        }
        return null;
    }
}
