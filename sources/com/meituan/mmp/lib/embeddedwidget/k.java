package com.meituan.mmp.lib.embeddedwidget;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.NotificationCompat;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.utils.v;
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aed58fc3885344918a9f9e288ae3d6a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aed58fc3885344918a9f9e288ae3d6a7");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12e83a07f517e8271ffb02a09a5840f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12e83a07f517e8271ffb02a09a5840f7");
            return;
        }
        ConcurrentHashMap<Integer, ConcurrentHashMap<String, g>> concurrentHashMap2 = b.get(gVar.b());
        if (concurrentHashMap2 == null || (concurrentHashMap = concurrentHashMap2.get(Integer.valueOf(gVar.c()))) == null) {
            return;
        }
        concurrentHashMap.remove(gVar.d());
    }

    public static void a(f fVar, com.meituan.mmp.main.a<Void> aVar, com.meituan.mmp.lib.trace.h hVar) {
        Object[] objArr = {fVar, aVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f6c844a5cb99ca0ce94ae02052266e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f6c844a5cb99ca0ce94ae02052266e3");
        } else {
            a(fVar, 25, 200, aVar, hVar);
        }
    }

    public static void a(final f fVar, final int i, final int i2, final com.meituan.mmp.main.a<Void> aVar, final com.meituan.mmp.lib.trace.h hVar) {
        Object[] objArr = {fVar, Integer.valueOf(i), Integer.valueOf(i2), aVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92120d1f11644955a80147d3f8b79066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92120d1f11644955a80147d3f8b79066");
        } else if (fVar == null) {
            a(fVar, aVar, hVar, "empty widget");
        } else if (DebugHelper.n) {
            a(fVar, aVar, hVar, "test forceSameLayerErrorDowngrade");
        } else {
            g a2 = a(fVar.e());
            if (a2 != null && a2.e()) {
                a(fVar, hVar, true, (String) null);
                aVar.a(null);
                a2.a(fVar);
            } else if (i == 0) {
                a(fVar, aVar, hVar, "not found embed object for 5s");
            } else {
                c.postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.embeddedwidget.k.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3300ba3d3de2a77ed773d50cc4839239", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3300ba3d3de2a77ed773d50cc4839239");
                        } else {
                            k.a(f.this, i - 1, i2, aVar, hVar);
                        }
                    }
                }, i2);
            }
        }
    }

    private static void a(f fVar, com.meituan.mmp.lib.trace.h hVar, boolean z, String str) {
        Object[] objArr = {fVar, hVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fea945b7b8cfd35e9661b5904254e67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fea945b7b8cfd35e9661b5904254e67");
        } else if (hVar != null) {
            HashMap<String, Object> a2 = v.a(NotificationCompat.CATEGORY_ERROR, str, "component", fVar != null ? fVar.e().a() : "", "isRebind", fVar instanceof i ? Boolean.valueOf(((i) fVar).f) : "undefine");
            if (z) {
                hVar.d("mmp.embed.render.bind", a2);
            } else {
                hVar.e("mmp.embed.render.bind", a2);
            }
        }
    }

    private static void a(f fVar, com.meituan.mmp.main.a aVar, com.meituan.mmp.lib.trace.h hVar, String str) {
        Object[] objArr = {fVar, aVar, hVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5837b1a822dfcf4dc00902eb47b0a337", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5837b1a822dfcf4dc00902eb47b0a337");
            return;
        }
        aVar.a(str, null);
        a(fVar, hVar, false, str);
    }

    private static g a(e eVar) {
        ConcurrentHashMap<Integer, ConcurrentHashMap<String, g>> concurrentHashMap;
        ConcurrentHashMap<String, g> concurrentHashMap2;
        g gVar;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49c236b9c72e4b596323f228fdd4f377", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49c236b9c72e4b596323f228fdd4f377");
        }
        if (eVar == null || (concurrentHashMap = b.get(eVar.b())) == null || (concurrentHashMap2 = concurrentHashMap.get(Integer.valueOf(eVar.c()))) == null || (gVar = concurrentHashMap2.get(eVar.d())) == null) {
            return null;
        }
        return gVar;
    }
}
