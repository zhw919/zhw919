package demo.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/*
实体类
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("book")
public class Book {

    private int id;
    private String img;
    private String name;
    private String price;

}
