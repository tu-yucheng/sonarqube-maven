package cn.tuyucheng.taketoday;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testUser() {
        User user = new User("tuyucheng", 18);

        System.out.println(user);

        assertEquals("tuyucheng", user.getName());
        assertEquals(Integer.valueOf(18), user.getAge());
    }
}