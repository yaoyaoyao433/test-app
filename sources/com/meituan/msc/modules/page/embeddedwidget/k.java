package com.meituan.msc.modules.page.embeddedwidget;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import com.meituan.msc.common.utils.t;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k {
    public static ChangeQuickRedirect a;
    public static volatile ConcurrentHashMap<String, ConcurrentHashMap<Integer, ConcurrentHashMap<String, g>>> b = new ConcurrentHashMap<>();
    public static Handler c = new Handler(Looper.getMainLooper());

    public static void a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c7ed495f66a33029ad942cd9f9e1920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c7ed495f66a33029ad942cd9f9e1920");
            return;
        }
        String b2 = gVar.b();
        if (!b.containsKey(b2)) {
            b.put(b2, new ConcurrentHashMap<>());
        }
        ConcurrentHashMap<Integer, ConcurrentHashMap<String, g>> concurrentHashMap = b.get(b2);
        int c2 = gVar.c();
        if (!concurrentHashMap.containsKey(Integer.valueOf(c2))) {
            concurrentHashMap.put(Integer.valueOf(c2), new ConcurrentHashMap<>());
        }
        concurrentHashMap.get(Integer.valueOf(c2)).put(gVar.d(), gVar);
    }

    public static void b(g gVar) {
        ConcurrentHashMap<String, g> concurrentHashMap;
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "364a22fad9133b9b49db262fad76fda2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "364a22fad9133b9b49db262fad76fda2");
            return;
        }
        ConcurrentHashMap<Integer, ConcurrentHashMap<String, g>> concurrentHashMap2 = b.get(gVar.b());
        if (concurrentHashMap2 == null || (concurrentHashMap = concurrentHashMap2.get(Integer.valueOf(gVar.c()))) == null) {
            return;
        }
        concurrentHashMap.remove(gVar.d());
    }

    public static void a(f fVar, com.meituan.msc.common.framework.a<Void> aVar, com.meituan.msc.modules.page.render.a aVar2) {
        Object[] objArr = {fVar, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "830f2519524e585f9acfa503cf02a5d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "830f2519524e585f9acfa503cf02a5d0");
        } else {
            a(fVar, 25, 200, aVar, aVar2);
        }
    }

    public static void a(final f fVar, final int i, final int i2, final com.meituan.msc.common.framework.a<Void> aVar, final com.meituan.msc.modules.page.render.a aVar2) {
        Object[] objArr = {fVar, Integer.valueOf(i), Integer.valueOf(i2), aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e056aa69e0553c810bdb714791064fb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e056aa69e0553c810bdb714791064fb1");
        } else if (fVar == null) {
            a(fVar, aVar2, aVar, "empty widget");
        } else if (DebugHelper.h) {
            a(fVar, aVar2, aVar, "test forceSameLayerErrorDowngrade");
        } else {
            g a2 = a(fVar.e());
            if (a2 != null && a2.e()) {
                a(fVar, aVar2, true, (String) null);
                aVar.a(null);
                a2.a(fVar);
            } else if (i == 0) {
                a(fVar, aVar2, aVar, "not found embed object for 5s");
            } else {
                c.postDelayed(new Runnable() { // from class: com.meituan.msc.modules.page.embeddedwidget.k.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58f597a718cd176772e95551fcd9c87d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58f597a718cd176772e95551fcd9c87d");
                        } else {
                            k.a(f.this, i - 1, i2, aVar, aVar2);
                        }
                    }
                }, i2);
            }
        }
    }

    private static void a(@Nullable f fVar, com.meituan.msc.modules.page.render.a aVar, boolean z, String str) {
        Object[] objArr = {fVar, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "979d03dfbf298921b88641bacbdcefe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "979d03dfbf298921b88641bacbdcefe4");
        } else if (aVar != null) {
            HashMap a2 = t.a(NotificationCompat.CATEGORY_ERROR, str, "component", fVar != null ? fVar.e().a() : "", "isRebind", fVar instanceof i ? Boolean.valueOf(((i) fVar).f) : "undefine");
            if (z) {
                aVar.b("msc.embed.render.bind").a(a2).a("state", "success").b();
            } else {
                aVar.b("msc.embed.render.bind").a(a2).a("state", "fail").b();
            }
        }
    }

    private static void a(@Nullable f fVar, com.meituan.msc.modules.page.render.a aVar, com.meituan.msc.common.framework.a aVar2, String str) {
        Object[] objArr = {fVar, aVar, aVar2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b06bcc06e86ec273cc6f81adb1100825", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b06bcc06e86ec273cc6f81adb1100825");
            return;
        }
        aVar2.a(str, null);
        a(fVar, aVar, false, str);
    }

    private static g a(e eVar) {
        ConcurrentHashMap<Integer, ConcurrentHashMap<String, g>> concurrentHashMap;
        ConcurrentHashMap<String, g> concurrentHashMap2;
        g gVar;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4aa47c24e3bbe698b251ca416ee21f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4aa47c24e3bbe698b251ca416ee21f1");
        }
        if (eVar == null || (concurrentHashMap = b.get(eVar.b())) == null || (concurrentHashMap2 = concurrentHashMap.get(Integer.valueOf(eVar.c()))) == null || (gVar = concurrentHashMap2.get(eVar.d())) == null) {
            return null;
        }
        return gVar;
    }
}
