package com.sankuai.meituan.kernel.net.okhttp3;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.cipstorage.ah;
import com.meituan.android.cipstorage.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e implements ah, Interceptor {
    public static ChangeQuickRedirect a;
    private String b;

    public e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ea52ee098f855b8308529868d4c96fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ea52ee098f855b8308529868d4c96fa");
            return;
        }
        com.meituan.android.cipstorage.q a2 = com.sankuai.meituan.kernel.net.utils.d.a(com.sankuai.meituan.kernel.net.base.c.b);
        a2.a(this);
        this.b = x.a(a2).b("ADB_DEBUG_MOCK_URL", "", com.sankuai.meituan.kernel.net.base.c.b.getPackageName() + "_preferences");
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "628465f95518558fa9afd26330f9bce7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "628465f95518558fa9afd26330f9bce7");
        }
        Request request = chain.request();
        if (!TextUtils.isEmpty(this.b)) {
            String url = request.url().url().toString();
            Request.Builder newBuilder = request.newBuilder();
            request = newBuilder.url(this.b + url).build();
        }
        return chain.proceed(request);
    }

    @Override // com.meituan.android.cipstorage.ah
    public final void a(String str, com.meituan.android.cipstorage.u uVar, String str2) {
        Object[] objArr = {str, uVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "731955f6de2c7220938f5ab3f964c999", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "731955f6de2c7220938f5ab3f964c999");
            return;
        }
        com.meituan.android.cipstorage.q a2 = com.meituan.android.cipstorage.q.a(com.sankuai.meituan.kernel.net.base.c.b, str);
        if ("ADB_DEBUG_MOCK_URL".equals(str2)) {
            this.b = a2.b("ADB_DEBUG_MOCK_URL", "");
        }
    }
}
