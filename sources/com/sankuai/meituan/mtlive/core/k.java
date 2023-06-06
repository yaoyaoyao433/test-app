package com.sankuai.meituan.mtlive.core;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k {
    public static ChangeQuickRedirect a;
    Context b;
    j c;
    e d;
    e e;
    public int f;
    private i g;
    private int h;
    private String i;
    private String j;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void onInitialFailed();

        void onInitialSucceed();
    }

    public static k a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c4bd33374408f938b4db05cdd21080b", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c4bd33374408f938b4db05cdd21080b") : b.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        private static final k a = new k();
    }

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42a047fec956a2b89adc5ec1ccad6f3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42a047fec956a2b89adc5ec1ccad6f3f");
            return;
        }
        this.f = g.a;
        this.h = g.a;
        this.i = "liveEngine";
        this.j = "pusherForceUseTX";
    }

    public final synchronized void a(Context context, j jVar) {
        Object[] objArr = {context, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e83fe13935e94daf957dd88f436d52c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e83fe13935e94daf957dd88f436d52c7");
        } else if (context == null || jVar == null) {
        } else {
            this.b = context.getApplicationContext();
            this.c = jVar;
            com.sankuai.meituan.mtlive.core.b.a();
        }
    }

    public final void a(e eVar) {
        this.d = eVar;
    }

    public final void b(e eVar) {
        this.e = eVar;
    }

    private i c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39b806d4fd37e966ab7575bebaa3cfce", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39b806d4fd37e966ab7575bebaa3cfce");
        }
        if (this.g == null) {
            this.g = new i();
        }
        this.g.c = new e() { // from class: com.sankuai.meituan.mtlive.core.k.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtlive.core.e
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb0c41dd8d6640279960f00fdceed7c6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb0c41dd8d6640279960f00fdceed7c6") : k.this.e == null ? "" : k.this.e.a();
            }

            @Override // com.sankuai.meituan.mtlive.core.e
            public final String b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1fade995e1df495436eabfa2268f143", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1fade995e1df495436eabfa2268f143") : k.this.e == null ? "" : k.this.e.b();
            }
        };
        this.g.b = new e() { // from class: com.sankuai.meituan.mtlive.core.k.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtlive.core.e
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4e4bcf88f8e8468c2ed1be334027c96", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4e4bcf88f8e8468c2ed1be334027c96") : k.this.d == null ? "" : k.this.d.a();
            }

            @Override // com.sankuai.meituan.mtlive.core.e
            public final String b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c31ed3bb23b5596d39c8dc4d81ede7ec", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c31ed3bb23b5596d39c8dc4d81ede7ec") : k.this.d == null ? "" : k.this.d.b();
            }
        };
        return this.g;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21e5177e9d5cc0f98dd8d63652f730c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21e5177e9d5cc0f98dd8d63652f730c5")).booleanValue();
        }
        if (this.c != null) {
            return this.c.c;
        }
        return false;
    }

    public final synchronized boolean a(d dVar, final a aVar) {
        Object[] objArr = {dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9803c0312597b9dec48e2facedfb3c68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9803c0312597b9dec48e2facedfb3c68")).booleanValue();
        }
        if (dVar != null && this.b != null) {
            dVar.a(this.b, c());
            return dVar.b(new d.a() { // from class: com.sankuai.meituan.mtlive.core.k.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtlive.core.d.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6134b116915b4bdebf723473a24c727d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6134b116915b4bdebf723473a24c727d");
                    } else if (aVar != null) {
                        aVar.onInitialSucceed();
                    }
                }

                @Override // com.sankuai.meituan.mtlive.core.d.a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31c7147e09725c89948829a7992a35f6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31c7147e09725c89948829a7992a35f6");
                    } else if (aVar != null) {
                        aVar.onInitialFailed();
                    }
                }
            });
        }
        aVar.onInitialFailed();
        return false;
    }

    public final synchronized boolean a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09459efc7c1e2816d36a779ad7888ae4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09459efc7c1e2816d36a779ad7888ae4")).booleanValue();
        }
        if (dVar != null && this.b != null) {
            dVar.a(this.b, c());
            return dVar.a();
        }
        return false;
    }
}
