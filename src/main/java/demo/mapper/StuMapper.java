package demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import demo.domain.Student;
import org.springframework.stereotype.Component;

@Component
public interface StuMapper extends BaseMapper<Student> {
}
