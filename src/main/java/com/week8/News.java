package com.week8;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
public class News implements Mycomparbale{
    private Integer id;
    private String title;
    private Integer readCount;

    public News() {
    }

    public News(Integer id, String title, Integer readCount) {
        this.id = id;
        this.title = title;
        this.readCount = readCount;
    }

    @Override
    public int compareTo(Object obj) {
        News other =(News)obj;
        return this.readCount-other.readCount;
    }

    @Override
    public String toString() {
        return "News:[id="+this.id+"title="+this.title+"readCount:"+this.readCount;
    }
}
