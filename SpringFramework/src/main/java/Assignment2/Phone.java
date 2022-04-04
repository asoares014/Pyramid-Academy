package Assignment2;

public class Phone extends org.genspark.Phone {
    private String mob;

    public String getMob(){
        return mob;
    }

    public void setMob(String mob){
        this.mob=mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }

}
