package com.ListTest;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName StudentSort
 * @Description TODO
 * @Author 29180
 * @Date 2020/11/19
 **/
public class StudentSort {

    public static void main(String[] args) {

        Set<Student> stuMan = new TreeSet<>();
        Set<Student> stuWoman = new TreeSet<>();
        Student[] stu= new Student[]{
                Student.builder().age(56).name("asd").gender("男").num(1).build(),
        Student.builder().age(53).name("asd").gender("男").num(2).build(),
        Student.builder().age(51).name("asd").gender("男").num(3).build(),
        Student.builder().age(5).name("asd").gender("男").num(4).build(),
        Student.builder().age(26).name("asd").gender("男").num(5).build(),
        Student.builder().age(6).name("asd").gender("女").num(6).build(),
        Student.builder().age(7).name("asd").gender("女").num(7).build(),
        Student.builder().age(8).name("asd").gender("女").num(8).build(),
        Student.builder().age(9).name("asd").gender("女").num(9).build()
        };

        for(int i=0;i<stu.length;i++){
            if(stu[i].getGender().equals("男")){
                stuMan.add(stu[i]);
            }else{
                stuWoman.add(stu[i]);
            }
        }
        System.out.println(stuMan);
        System.out.println(stuWoman);
        stuMan.forEach(student -> {
            System.out.println("姓名："+student.getName() +
                    ",学号"+student.getNum()+
                    ",性别："+student.getGender()+
                    ",年龄："+student.getAge());
        });

        stuWoman.forEach(student -> {
            System.out.println("姓名："+student.getName() +
                    ",学号"+student.getNum()+
                    ",性别："+student.getGender()+
                    ",年龄："+student.getAge());
        });

        Map<String,Set<Student>> map1=new HashMap<>(20);
        Map<String,Set<Student>> map2=new HashMap<>(20);
        map1.put("男生",stuMan);
        map2.put("女生",stuWoman);

        System.out.println("*************");

        map1.forEach((key,value) ->{
            for(Student key1 : value){
                System.out.println("姓名："+key1.getName() +
                        ",学号"+key1.getNum()+
                        ",性别："+key1.getGender()+
                        ",年龄："+key1.getAge());
            }
        });

        map2.forEach((key,value) ->{
            for(Student key1 : value){
                System.out.println("姓名："+key1.getName() +
                        ",学号"+key1.getNum()+
                        ",性别："+key1.getGender()+
                        ",年龄："+key1.getAge());
            }
        });
    }

}
