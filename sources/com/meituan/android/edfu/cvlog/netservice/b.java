package com.meituan.android.edfu.cvlog.netservice;

import android.content.Context;
import com.dianping.nvnetwork.NVDefaultNetworkService;
import com.dianping.nvnetwork.j;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.metrics.traffic.reflection.SharkWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
import com.squareup.okhttp.v;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static a.InterfaceC0637a b;

    public static a.InterfaceC0637a a(Context context) {
        v a2;
        j a3;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1dfe5049951a65ddf8966b7cec54ae95", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1dfe5049951a65ddf8966b7cec54ae95");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "228953d482b8d01563e75f25576ba2a8", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = (v) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "228953d482b8d01563e75f25576ba2a8");
                    } else {
                        v vVar = new v();
                        OkHttp2Wrapper.addInterceptorToClient(vVar);
                        a2 = com.sankuai.waimai.launcher.util.aop.b.a(vVar);
                        a2.a(30L, TimeUnit.SECONDS);
                        a2.c(30L, TimeUnit.SECONDS);
                        a2.b(30L, TimeUnit.SECONDS);
                    }
                    Object[] objArr3 = {context};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1ab838edf29186c525dfe7f8a769b688", RobustBitConfig.DEFAULT_VALUE)) {
                        a3 = (j) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1ab838edf29186c525dfe7f8a769b688");
                    } else {
                        NVDefaultNetworkService.a aVar = new NVDefaultNetworkService.a(context);
                        SharkWrapper.addInterceptorToBuilder(aVar);
                        a3 = aVar.a();
                    }
                    com.sankuai.meituan.retrofit2.callfactory.oknv.a a4 = com.sankuai.meituan.retrofit2.callfactory.oknv.a.a(a2, a3);
                    a4.b = true;
                    b = a4;
                }
            }
        }
        return b;
    }
}
