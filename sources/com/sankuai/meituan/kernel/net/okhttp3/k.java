package com.sankuai.meituan.kernel.net.okhttp3;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k implements Interceptor {
    public static ChangeQuickRedirect a;
    private final Context b;
    private String c;

    public k(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a244ce1c7b653e3c48b471358f0348c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a244ce1c7b653e3c48b471358f0348c");
            return;
        }
        this.c = "";
        this.b = context;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e70044f892d1602b18a53bc5bc4483dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e70044f892d1602b18a53bc5bc4483dc");
        }
        Request request = chain.request();
        if (TextUtils.isEmpty(this.c)) {
            try {
                this.c = com.sankuai.meituan.kernel.net.utils.b.e(com.sankuai.meituan.kernel.net.base.a.a());
            } catch (Exception unused) {
            }
        }
        if (request != null) {
            Request.Builder newBuilder = request.newBuilder();
            if (TextUtils.isEmpty(request.header("pragma-os"))) {
                newBuilder.header("pragma-os", this.c);
            }
            if (TextUtils.isEmpty(request.header("pragma-mtid"))) {
                newBuilder.header("pragma-mtid", com.sankuai.meituan.kernel.net.utils.b.a(this.b));
            }
            request = newBuilder.build();
        }
        return chain.proceed(request);
    }
}
