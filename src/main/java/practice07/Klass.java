package practice07;

public class Klass {

    private Integer number;

    public Klass(Integer number) {
        this.number = number;
    }
    public Klass(){

    }
    public Integer getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class "+this.number;
    }
}
