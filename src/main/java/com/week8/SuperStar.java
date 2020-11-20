package com.week8;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class SuperStar implements Filmble,Singalbe,TVable {
    private String name;

    public SuperStar() {
        super();
    }

    public SuperStar(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void actFilm() {
        System.out.println(this.name + "can film");
    }

    @Override
    public void sing() {
        System.out.println(this.name + "can sing");
    }

    public void introduce(){
        System.out.println(name+"是三栖明星");
    }

    @Override
    public void showTV() {
        System.out.println(this.name + "can tv");
    }
}
