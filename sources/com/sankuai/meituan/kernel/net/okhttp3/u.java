package com.sankuai.meituan.kernel.net.okhttp3;

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
public final class u implements Interceptor {
    public static ChangeQuickRedirect a;
    private String b;

    public u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab532ec6602d1d8c67d3eb74f0cf698", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab532ec6602d1d8c67d3eb74f0cf698");
        } else {
            this.b = null;
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aa314db77c3cd807a43913c9416281e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aa314db77c3cd807a43913c9416281e");
        }
        Request request = chain.request();
        if (TextUtils.isEmpty(this.b)) {
            this.b = com.sankuai.meituan.kernel.net.singleton.g.a();
        }
        if (!TextUtils.isEmpty(this.b)) {
            request = request.newBuilder().header("User-Agent", this.b).build();
        }
        return chain.proceed(request);
    }
}
