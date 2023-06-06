package com.meituan.met.mercury.load.retrofit;

import com.meituan.android.singleton.i;
import com.meituan.met.mercury.load.core.c;
import com.meituan.met.mercury.load.core.e;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a.InterfaceC0637a b;
    private static volatile a.InterfaceC0637a c;

    public static a.InterfaceC0637a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7886ec346ca5adc733b2edf8c3a81138", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7886ec346ca5adc733b2edf8c3a81138");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = e.c().getCallFactory();
                }
                if (b == null && c.d) {
                    b = i.a();
                }
                if (b == null) {
                    b = c();
                }
            }
        }
        return b;
    }

    public static a.InterfaceC0637a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "397be0dd03b68fcc3f4313da2c8c818b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "397be0dd03b68fcc3f4313da2c8c818b");
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = c();
                }
            }
        }
        return c;
    }

    private static a.InterfaceC0637a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6434f5e34f79b4a466ef1003c66c937", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6434f5e34f79b4a466ef1003c66c937");
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        return com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(builder.connectTimeout(60L, TimeUnit.SECONDS).readTimeout(60L, TimeUnit.SECONDS).build());
    }
}
