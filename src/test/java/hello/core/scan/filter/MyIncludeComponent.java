package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
// myincludecomponent가 붙은 것은 component에 추가할것이다.
public @interface MyIncludeComponent {


}
