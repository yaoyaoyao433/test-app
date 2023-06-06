package com.meituan.android.singleton;

import android.app.Application;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.INetFactory;
import com.sankuai.meituan.retrofit2.av;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.meituan.retrofit2.raw.c;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private static volatile INetFactory b;

    private static INetFactory b() {
        List a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "460cb36292a4fe420a8b393a1aa04bcc", RobustBitConfig.DEFAULT_VALUE)) {
            return (INetFactory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "460cb36292a4fe420a8b393a1aa04bcc");
        }
        if (b == null) {
            synchronized (INetFactory.class) {
                if (b == null && (a2 = com.sankuai.meituan.serviceloader.b.a(INetFactory.class, (String) null)) != null && a2.size() > 0) {
                    b = (INetFactory) a2.get(0);
                }
            }
        }
        return b;
    }

    public static a.InterfaceC0637a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1dfbca499a63c296048890fb47480277", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1dfbca499a63c296048890fb47480277");
        }
        INetFactory b2 = b();
        av.a(b2, "netFactory == null when call RetrofitCallFactorySingleton#getInstance(). Thread:" + Thread.currentThread().getName());
        return b2.a("oknv");
    }

    public static a.InterfaceC0637a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3eb404c82ad0f34e256faed6da8654c", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3eb404c82ad0f34e256faed6da8654c");
        }
        INetFactory b2 = b();
        av.a(b2, "netFactory == null when call RetrofitCallFactorySingleton#getInstance(key)，key=" + str + "Thread:" + Thread.currentThread().getName());
        if (TextUtils.isEmpty(str)) {
            str = "oknv";
        }
        return b2.a(str);
    }

    public static a.InterfaceC0637a a(@NonNull com.sankuai.meituan.kernel.net.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "760a5e716777fc3471614a1a26e2aafe", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "760a5e716777fc3471614a1a26e2aafe");
        }
        INetFactory b2 = b();
        av.a(b2, "netFactory == null. RetrofitCallFactorySingleton#init() should be executed first");
        return b2.a(dVar);
    }

    public static c.a a(@NonNull com.sankuai.meituan.kernel.net.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26b44c3fa4cf358026bcffed4dc602c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (c.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26b44c3fa4cf358026bcffed4dc602c3");
        }
        INetFactory b2 = b();
        av.a(b2, "netFactory == null. RetrofitCallFactorySingleton#init() should be executed first");
        return b2.a(eVar);
    }

    public static void a(Application application, INetFactory iNetFactory, com.sankuai.meituan.kernel.net.a aVar) {
        Object[] objArr = {application, iNetFactory, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a934353f078123b8c07f2f8a304d25f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a934353f078123b8c07f2f8a304d25f");
            return;
        }
        av.a(iNetFactory, "netFactoryImpl == null");
        if (b == null) {
            synchronized (INetFactory.class) {
                if (b == null) {
                    b = iNetFactory;
                }
            }
        }
        if (iNetFactory.a()) {
            return;
        }
        synchronized (INetFactory.class) {
            if (!iNetFactory.a()) {
                com.sankuai.meituan.kernel.net.c cVar = new com.sankuai.meituan.kernel.net.c();
                cVar.a = application;
                cVar.b = aVar;
                iNetFactory.a(cVar);
            }
        }
    }
}
