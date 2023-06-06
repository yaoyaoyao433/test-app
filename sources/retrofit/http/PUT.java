package retrofit.http;

import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@RestMethod(hasBody = true, value = OneIdNetworkTool.PUT)
/* loaded from: classes7.dex */
public @interface PUT {
    String value();
}
