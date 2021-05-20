package util;

public enum UserNames {
    OREST(1L, "Orest"),
    ALONA(2L, "Alona" ),
    OKSANA(3L, "Oksana" ),
    OSTAP(4L, "Ostap"),
    DMYTRO(5L, "Dmytro"),
    VIKTORIA(6L, "Viktoria"),
    ELVIRA(7L, "Elvira"),
    VIKTORIASKIKUN(8L, "ViktoriaSkikun");



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
