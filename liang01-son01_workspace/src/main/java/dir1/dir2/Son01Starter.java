package dir1.dir2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author liangchao
 * @create 2021-04-09 16:35
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Son01Starter {
    public static void main(String[] args) {
        SpringApplication.run(Son01Starter.class, args); // 加了这行，spring 项目才能真正运行起来。
        System.out.println("this is son01");
    }
}
