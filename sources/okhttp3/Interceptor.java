package okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface Interceptor {

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        @Nullable
        Connection connection();

        Response proceed(Request request) throws IOException;

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i, TimeUnit timeUnit);

        Chain withReadTimeout(int i, TimeUnit timeUnit);

        Chain withWriteTimeout(int i, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    Response intercept(Chain chain) throws IOException;
}
