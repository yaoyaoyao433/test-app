package com.sankuai.meituan.kernel.net.msi.okhttp3;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb3830ac71f7e964591475183488e0f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb3830ac71f7e964591475183488e0f4");
        }
        Call call = chain.call();
        Request request = chain.request();
        if (request.headers() != null) {
            String header = request.header("CallHashCode");
            if (!TextUtils.isEmpty(header)) {
                com.sankuai.meituan.kernel.net.msi.log.a.b(" Ok3MonitorInterceptor intercept addCallMap");
                c.a(header, call);
                request = request.newBuilder().removeHeader("CallHashCode").build();
            } else {
                c.b(call);
            }
        }
        return chain.proceed(request);
    }
}
