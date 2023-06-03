package demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import demo.domain.Book;
import org.springframework.stereotype.Component;


@Component
public interface BookMapper extends BaseMapper<Book> {
}
