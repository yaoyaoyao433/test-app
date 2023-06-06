package com.sankuai.waimai.foundation.core.lifecycle;

import android.app.Service;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static CopyOnWriteArraySet<a> b = new CopyOnWriteArraySet<>();

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(Service service);

        void b(Service service);
    }

    public static void a(Service service) {
        Object[] objArr = {service};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b64512a27fa46257b7e52dd2f0c81e5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b64512a27fa46257b7e52dd2f0c81e5a");
            return;
        }
        Iterator<a> it = b.iterator();
        while (it.hasNext()) {
            it.next().a(service);
        }
    }

    public static void b(Service service) {
        Object[] objArr = {service};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "361d68da436a7783adb49e803a7a6a71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "361d68da436a7783adb49e803a7a6a71");
            return;
        }
        Iterator<a> it = b.iterator();
        while (it.hasNext()) {
            it.next().b(service);
        }
    }

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "375909f8cd6b6aa4549ebf35974e3ea7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "375909f8cd6b6aa4549ebf35974e3ea7");
        } else {
            b.add(aVar);
        }
    }
}
