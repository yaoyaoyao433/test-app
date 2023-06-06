package com.meituan.msc.uimanager.rlist;

import com.meituan.msc.jse.bridge.MSCReadableMap;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.UIImplementation;
import com.meituan.msc.uimanager.UIViewOperationQueue;
import com.meituan.msc.uimanager.aa;
import com.meituan.msc.uimanager.ab;
import com.meituan.msc.uimanager.ag;
import com.meituan.msc.uimanager.av;
import com.meituan.msc.uimanager.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends com.meituan.msc.uimanager.list.c {
    public static ChangeQuickRedirect D;
    public static long F;
    public static long G;
    public p E;
    private a H;

    @Override // com.meituan.msc.uimanager.list.c, com.meituan.msc.uimanager.j
    public final boolean c() {
        return true;
    }

    private b(ReactApplicationContext reactApplicationContext, av avVar, ag agVar, UIViewOperationQueue uIViewOperationQueue, com.meituan.msc.uimanager.events.b bVar, int i, a aVar) {
        super(reactApplicationContext, avVar, agVar, uIViewOperationQueue, bVar, i, null);
        Object[] objArr = {reactApplicationContext, avVar, agVar, uIViewOperationQueue, bVar, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bab1b9fdfdf4d5939634cfa7c99c61cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bab1b9fdfdf4d5939634cfa7c99c61cc");
        } else {
            this.H = aVar;
        }
    }

    public static b a(ReactApplicationContext reactApplicationContext, UIImplementation uIImplementation, int i, a aVar) {
        Object[] objArr = {reactApplicationContext, uIImplementation, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = D;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ea6cbe1435804ffe6e48444edd544c6", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ea6cbe1435804ffe6e48444edd544c6") : new b(reactApplicationContext, uIImplementation.f(), new ag(), new d(reactApplicationContext, new c(uIImplementation.f()), 0), uIImplementation.i, i, aVar);
    }

    public final void c(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "362a81d2094d9f977c582ba34fe7b734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "362a81d2094d9f977c582ba34fe7b734");
            return;
        }
        aa c = p().c(i);
        if (c != null) {
            c.a(i2, i3);
            f(this.x);
            return;
        }
        g.d("[MSCListItemUIImplementation@onBindViewHolder] ", "rootShadowNode null,tag:" + i);
    }

    @Override // com.meituan.msc.uimanager.list.c, com.meituan.msc.uimanager.j, com.meituan.msc.uimanager.UIImplementation
    public final void a(p pVar) {
        Object[] objArr = {pVar};
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a096eec56a0b75cd0e00a6a5ffe4b4b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a096eec56a0b75cd0e00a6a5ffe4b4b2");
        } else if (this.H == null) {
        } else {
            this.H.a(pVar);
        }
    }

    @Override // com.meituan.msc.uimanager.list.c, com.meituan.msc.uimanager.UIImplementation
    public final void c(aa aaVar) {
        Object[] objArr = {aaVar};
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb154ae721d77abf63ce14a491c7df3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb154ae721d77abf63ce14a491c7df3d");
            return;
        }
        long nanoTime = System.nanoTime();
        super.c(aaVar);
        G = System.nanoTime() - nanoTime;
    }

    @Override // com.meituan.msc.uimanager.j
    public final void a(int i, aa aaVar, int i2, JSONObject jSONObject) {
        Object[] objArr = {Integer.valueOf(i), aaVar, Integer.valueOf(i2), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d1bc727263c442d838eabdb6a431fa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d1bc727263c442d838eabdb6a431fa1");
            return;
        }
        long nanoTime = System.nanoTime();
        super.a(i, aaVar, i2, jSONObject);
        F = System.nanoTime() - nanoTime;
    }

    @Override // com.meituan.msc.uimanager.j
    public final void a(ThemedReactContext themedReactContext, int i, String str, int i2, ReadableMap readableMap) {
        Object[] objArr = {themedReactContext, Integer.valueOf(i), str, Integer.valueOf(i2), readableMap};
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0bed6b2591ac9dbd9c0582545505998", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0bed6b2591ac9dbd9c0582545505998");
            return;
        }
        super.a(themedReactContext, i, str, i2, readableMap);
        aa c = p().c(i);
        if (i == i2) {
            this.z = c;
            c.b(true);
            p().a(c);
            this.y = g(i);
        }
        c.g(i2);
    }

    public final void a(ThemedReactContext themedReactContext, int i, String str, int i2, JSONObject jSONObject) {
        Object[] objArr = {themedReactContext, Integer.valueOf(i), str, Integer.valueOf(i2), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "017b14a343c9cc8e9d74ab8a9016d330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "017b14a343c9cc8e9d74ab8a9016d330");
        } else {
            a(themedReactContext, i, str, i2, new MSCReadableMap(jSONObject));
        }
    }

    @Override // com.meituan.msc.uimanager.j
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = D;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e7593d0f08039bb17b0b9ca2cee10cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e7593d0f08039bb17b0b9ca2cee10cc");
            return;
        }
        p pVar = this.E;
        if (pVar == null || pVar.b == null || b(pVar.a) == null) {
            return;
        }
        b(pVar.a).a(new ab(pVar.b));
    }
}
