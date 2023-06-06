package com.sankuai.waimai.platform.net.interceptor.okhttp;

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
/* loaded from: classes5.dex */
public final class h implements Interceptor {
    public static ChangeQuickRedirect a;
    private String b;

    public h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e017f1d2dd91fd1f93f02535bbca7e68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e017f1d2dd91fd1f93f02535bbca7e68");
        } else {
            this.b = str;
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae8d341bf9c6dbd5cea38145e10f2bd5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae8d341bf9c6dbd5cea38145e10f2bd5");
        }
        Request.Builder newBuilder = chain.request().newBuilder();
        newBuilder.addHeader("network_lib", "mt-common-net/1.0");
        if (!TextUtils.isEmpty(this.b)) {
            newBuilder.addHeader(NetLogConstants.Tags.TUNNEL_SOURCE, this.b);
        }
        return chain.proceed(newBuilder.build());
    }
}
