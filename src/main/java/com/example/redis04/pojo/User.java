package com.example.redis04.pojo;

import io.lettuce.core.dynamic.annotation.CommandNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author jjm
 * @create 2023-05-08-15:59
 */

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {  // serializable 将对象序列化，在企业中所有的pojo都要序列化

    private String name;
    private int age;


}
