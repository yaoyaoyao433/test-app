package com.sankuai.meituan.kernel.net.okhttp3;

import android.text.TextUtils;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class p implements Interceptor {
    public static ChangeQuickRedirect a;
    private String b;

    public p(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7859f2f0413cfc1daf1f1c4ba9a5a66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7859f2f0413cfc1daf1f1c4ba9a5a66");
        } else {
            this.b = str;
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd230750912cbd5dbe122640d4b1a044", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd230750912cbd5dbe122640d4b1a044");
        }
        Request.Builder newBuilder = chain.request().newBuilder();
        newBuilder.addHeader("network_lib", "mt-common-net/1.0");
        if (!TextUtils.isEmpty(this.b)) {
            newBuilder.addHeader(NetLogConstants.Tags.TUNNEL_SOURCE, this.b);
        }
        return chain.proceed(newBuilder.build());
    }
}
