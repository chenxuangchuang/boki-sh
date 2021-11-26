package com.chenxc.cxcboki.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/7/18 20:06
 */
public class StudyStream {

    public static void main(String[] args) {
        List<UserEntity> userEntities = new ArrayList<>();
        UserEntity UserEntity = new UserEntity();
        UserEntity.setAge(18);
        UserEntity.setName("aa");
        userEntities.add(UserEntity);
        userEntities.add(UserEntity);
        //通过stream list转set去重
        Stream<UserEntity> stream = userEntities.stream();
        Set<UserEntity> collect = stream.collect(Collectors.toSet());
        collect.forEach(userEntity -> {
            System.out.println(userEntity);
        });
    }

}
