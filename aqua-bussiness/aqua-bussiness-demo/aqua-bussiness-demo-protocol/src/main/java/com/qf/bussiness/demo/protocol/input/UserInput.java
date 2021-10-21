package com.qf.bussiness.demo.protocol.input;





import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author pww
 * @date 2021/10/18
 * @apiNote
 */
@Data
public class UserInput implements Serializable {

    @NotNull(message = "姓名不能为空")
    private String name;
    @NotNull(message = "年龄不能为空")
    @Max(value = 25, message = "年龄最大不能超过25岁")
    @Min(value = 10, message = "年龄最小不能超过10岁")
    private Integer age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Past(message = "生日不能超过今天的日期")
    @JsonFormat
    private Date birthday;
    @NotNull(message = "性别不能空")
    private String sex;
    @Email(message = "邮箱格式不正确")
    private String email;

}
