package practice08;

public class Klass {

    private Integer number;
    private Student leader;

    public Klass(Integer number) {
        this.number = number;
    }
    public Klass(){

    }

    public Student getLeader() {
        return leader;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    public String getDisplayName(){
        return "Class "+this.number;
    }

    public void assignLeader(Student student){
        this.leader = student;
    }
}
