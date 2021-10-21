package com.qf.commons.web.valid;

import com.qf.commons.web.valid.constraint.CustomerConstraint;
import com.qf.commons.web.valid.extend.AquaValid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author pww
 * @date 2021/10/18
 * @apiNote
 */

@Documented
@Target(
        {ElementType.FIELD,
        ElementType.TYPE}
)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CustomerConstraint.class)
public @interface CustomerValid {

    /**
     * 校验失败后返回的字符串
     * @return
     */
    String message() default "";

    /**
     * 校验分组
     * @return
     */
    Class<?>[] groups() default { };

    /**
     * 校验负载
     * @return
     */
    Class<? extends Payload>[] payload() default { };

    /**
     * 自定义的校验实现类类型
     * @return
     */
    Class<? extends AquaValid> myValid();
}
