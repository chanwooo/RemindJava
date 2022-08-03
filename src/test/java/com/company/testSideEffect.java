package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;

class testSideEffect {

    @Test
    void testSave() {
        UserEntity user = new UserEntity();

        UserRepository userRepository = Mockito.mock(UserRepository.class);

        Mockito.when(userRepository.save(any())).thenReturn(1);

        Answer<Void> ans = invocation -> {
            Object[] args = invocation.getArguments();
            System.out.println("called with arguments: " + Arrays.toString(args));
            user.Id = 1L;
            return null;
        };
        Mockito.when(userRepository.save(any())).thenAnswer(ans);

        userRepository.save(user);

        Assertions.assertEquals(1, user.Id);



    }

    @Test
    void test_generic() {
        List list = new ArrayList();
        list.add("ho");

//        String st = list.get(0);
        String st = (String) list.get(0);


        System.out.println(list.get(0));
    }


}

class UserEntity {
    Long Id;
    String name;
}

interface UserRepository {
    int save(UserEntity user);
}
/*
queue = [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
esult = [[3, 2, 1], [2, 3, 1], [2, 1, 3], [3, 1, 2], [1, 3, 2], [1, 2, 3]]

 */