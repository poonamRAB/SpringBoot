package com.geekster.UserManagementSystem.configuration;

import com.geekster.UserManagementSystem.model.Type;
import com.geekster.UserManagementSystem.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sound.sampled.EnumControl;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {

    @Bean
    public List<User> getInitializedList(){
        User initUser = new User(0,"Poonam","poonam@gmail.com","rudransh","9865741234",24, LocalDate.of(1998,09,20), Type.ADMIN);

        List<User> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }
}
