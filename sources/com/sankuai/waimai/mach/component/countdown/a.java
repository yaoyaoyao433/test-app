package com.sankuai.waimai.mach.component.countdown;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.component.e;
import com.sankuai.waimai.mach.component.interf.b;
import com.sankuai.waimai.mach.js.EventConstant;
import com.sankuai.waimai.mach.lifecycle.c;
import com.sankuai.waimai.mach.parser.d;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.mach.component.base.a<FrameLayout> implements b, c {
    public static ChangeQuickRedirect a;
    d b;
    private CountDownTimer c;
    private List<e> d;
    private long e;
    private com.sankuai.waimai.mach.component.interf.a f;

    @Override // com.sankuai.waimai.mach.lifecycle.c
    public final void b(boolean z) {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb5fd071a3c1ace6d7fbcbd069fa63b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb5fd071a3c1ace6d7fbcbd069fa63b2");
        } else {
            this.d = new ArrayList();
        }
    }

    public static /* synthetic */ void a(a aVar, long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "597df771d117f01560c2e2a33f02ac09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "597df771d117f01560c2e2a33f02ac09");
            return;
        }
        List<e> f = aVar.f();
        if (com.sankuai.waimai.mach.utils.e.a(f)) {
            return;
        }
        for (e eVar : f) {
            eVar.a(j);
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(FrameLayout frameLayout) {
        long currentTimeMillis;
        FrameLayout frameLayout2 = frameLayout;
        Object[] objArr = {frameLayout2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1599779e8cff036e03e9fb5caf3a5823", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1599779e8cff036e03e9fb5caf3a5823");
            return;
        }
        super.a((a) frameLayout2);
        if (this.f != null) {
            currentTimeMillis = this.f.a();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        long j = (this.e * 1000) - currentTimeMillis;
        if (j <= 0) {
            e();
            return;
        }
        this.c = new CountDownTimerC1002a(this, j + 500, 1000);
        this.c.start();
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ FrameLayout b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a0d81aeb3460fe946a6ab6c7d435bf", RobustBitConfig.DEFAULT_VALUE) ? (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a0d81aeb3460fe946a6ab6c7d435bf") : new FrameLayout(context);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d43bbabf7a4a1e8a50c810ddeb37ab5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d43bbabf7a4a1e8a50c810ddeb37ab5b");
            return;
        }
        super.b();
        if (this.c != null) {
            this.c.cancel();
        }
        this.m.removeViewTreeObserver(this);
        this.m.unregisterLifecycleObserver(this);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.component.countdown.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class CountDownTimerC1002a extends CountDownTimer {
        public static ChangeQuickRedirect a;
        private final WeakReference<a> b;

        public CountDownTimerC1002a(a aVar, long j, int i) {
            super(j, 1000L);
            Object[] objArr = {aVar, new Long(j), 1000};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f74b8cb03d3a51a9288b2057a4cb4cae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f74b8cb03d3a51a9288b2057a4cb4cae");
            } else {
                this.b = new WeakReference<>(aVar);
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45515a771aeb41783e6486939a342c0d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45515a771aeb41783e6486939a342c0d");
            } else if (j <= 0 || this.b == null || this.b.get() == null) {
            } else {
                a.a(this.b.get(), j);
            }
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e223cb0243de468ff391f060adf969f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e223cb0243de468ff391f060adf969f");
            } else if (this.b == null || this.b.get() == null) {
            } else {
                this.b.get().e();
                a aVar = this.b.get();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a5a6423293ad9a363b2caa7415b96ec9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a5a6423293ad9a363b2caa7415b96ec9");
                } else if (aVar.m == null || aVar.b == null) {
                } else {
                    aVar.m.asyncCallJSMethod(aVar.b.b, aVar.b.c);
                }
            }
        }
    }

    void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e44243a83718fc9dd099213f2a52def", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e44243a83718fc9dd099213f2a52def");
            return;
        }
        List<e> f = f();
        if (com.sankuai.waimai.mach.utils.e.a(f)) {
            return;
        }
        for (e eVar : f) {
            eVar.e();
        }
    }

    private List<e> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec1cce95dccd6d2e475baf63077371f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec1cce95dccd6d2e475baf63077371f");
        }
        if (!com.sankuai.waimai.mach.utils.e.a(this.d)) {
            return this.d;
        }
        this.d = new ArrayList();
        a(this.n, this.d);
        return this.d;
    }

    private void a(com.sankuai.waimai.mach.node.a aVar, List<e> list) {
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9c669ccbeb268e1d8e2842ee82d4fb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9c669ccbeb268e1d8e2842ee82d4fb8");
        } else if (aVar != null) {
            List<com.sankuai.waimai.mach.node.a> b = aVar.b();
            if (com.sankuai.waimai.mach.utils.e.a(b)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar2 : b) {
                com.sankuai.waimai.mach.lifecycle.d dVar = aVar2.h;
                if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = e.a;
                    if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "69d1c10b048c1587c55843a819d292d8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "69d1c10b048c1587c55843a819d292d8")).booleanValue() : eVar.i(eVar.c)) {
                        list.add(eVar);
                    }
                }
                a(aVar2, list);
            }
        }
    }

    @Override // com.sankuai.waimai.mach.lifecycle.d, com.sankuai.waimai.mach.lifecycle.b
    public final void onActivityDestroyed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6252145c338724206f8dfe3957f425e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6252145c338724206f8dfe3957f425e0");
            return;
        }
        super.onActivityDestroyed();
        this.m.removeViewTreeObserver(this);
        if (this.c != null) {
            this.c.cancel();
            this.c = null;
        }
        if (this.d != null) {
            this.d.clear();
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5389bf8dc78e465413826c302866148", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5389bf8dc78e465413826c302866148");
            return;
        }
        this.m.registerLifecycleObserver(this);
        this.m.addViewTreeObserver(this);
        this.f = this.m.getNtpClock();
        String a2 = a("time");
        if (k() != null && (k().get("@finish") instanceof d)) {
            this.b = (d) k().get("@finish");
        }
        this.e = new BigDecimal(e(a2)).longValue();
    }

    @Override // com.sankuai.waimai.mach.lifecycle.c
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0e98d3855a2310444d513b8e905e72b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0e98d3855a2310444d513b8e905e72b");
        } else {
            this.m.sendJsEvent(z ? EventConstant.MODULE_WILL_APPEAR : EventConstant.MODULE_WILL_DISAPPEAR, null);
        }
    }
}
