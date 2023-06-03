package demo.controller;

import demo.domain.Book;
import demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller//标记该类为控制类
public class GetInfo {
    @Autowired//注入mapper层接口,刚才我们用json把数据爬到数据库里边，现在可以使用mapper接口来查找出数据
    private BookMapper bookMapper;
    @ResponseBody//该方法的返回值被自动解析为json格式
    @RequestMapping("/GetInfo")//设置请求路径
    public List<Book> getBooks(){
        //调用mapper接口获取数据
        List<Book> books =bookMapper.selectList(null);
        return books;
    }
}
