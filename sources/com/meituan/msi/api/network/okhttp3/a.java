package com.meituan.msi.api.network.okhttp3;

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
/* loaded from: classes3.dex */
public final class a implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b4bb3864d5b52a909637c430caa10be", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b4bb3864d5b52a909637c430caa10be");
        }
        Call call = chain.call();
        Request request = chain.request();
        if (request.headers() != null) {
            String header = request.header("CallHashCode");
            if (!TextUtils.isEmpty(header)) {
                c.a(header, call);
                request = request.newBuilder().removeHeader("CallHashCode").build();
            } else {
                c.b(call);
            }
        }
        return chain.proceed(request);
    }
}
