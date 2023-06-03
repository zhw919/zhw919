package demo.controller;


import demo.domain.Book;
import demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//标记该类为控制类
public class SetInfo {
    @Autowired//注入mapper层接口,刚才我们用json把数据爬到数据库里边，现在可以使用mapper接口来查找出数据
    private BookMapper bookMapper;
    @ResponseBody//该方法的返回值被自动解析为json格式
    @RequestMapping("/SetInfo")//设置请求路径
    public void setBooks(String name,String price,String img){
        //调用mapper接口获取数据
        Book book = new Book();
        book.setPrice(price);
        book.setName(name);
        book.setImg(img);
        bookMapper.insert(book);
    }
}