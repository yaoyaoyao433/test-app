package com.sankuai.meituan.kernel.net.okhttp3;

import android.content.Context;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.Ok3CandyInterceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h implements Interceptor {
    public static ChangeQuickRedirect a;
    private Ok3CandyInterceptor b;

    public h(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93429378e1aff9c198f5ee0c4fb61345", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93429378e1aff9c198f5ee0c4fb61345");
        } else {
            this.b = new Ok3CandyInterceptor(context);
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "757c04fdd17f6196806234446ca78a5e", RobustBitConfig.DEFAULT_VALUE) ? (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "757c04fdd17f6196806234446ca78a5e") : this.b.intercept(chain);
    }
}
