package util;

public enum UserNames {
    OREST(1, "Orest"),
    ALONA(2, "Alona" ),
    OKSANA(3, "Oksana" ),
    OSTAP(4, "Ostap"),
    DMYTRO(5, "Dmytro"),
    VIKTORIA(6, "Viktoria"),
    ELVIRA(7, "Elvira"),
    VIKTORIASKIKUN(8, "ViktoriaSkikun");



    private final Integer id;
    private final String studentName;

    UserNames(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public static UserNames getById(int id) {
        for (UserNames user : values()) {
            if (user.id.equals(id)) {
                return user;
            }
        }
        return null;
    }
}
