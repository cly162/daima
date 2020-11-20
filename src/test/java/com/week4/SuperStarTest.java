package com.week4;

import com.week8.SuperStar;
import org.junit.jupiter.api.Test;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yoRoll.z
 * @Date 2020/10/29
 **/
class SuperStarTest {

    SuperStar ss =new SuperStar("吴亦凡");

    @Test
    void actFilm() {
        ss.actFilm();
    }

    @Test
    void sing() {
        ss.sing();
    }

    @Test
    void TV() {
        ss.showTV();
    }

    @Test
    void introduce() {
        ss.introduce();
    }
}