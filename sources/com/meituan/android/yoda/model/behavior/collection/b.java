package com.meituan.android.yoda.model.behavior.collection;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.android.yoda.model.behavior.entry.d;
import com.meituan.android.yoda.util.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect a;
    public static volatile b b;
    public volatile boolean c;
    public long d;
    public final c<com.meituan.android.yoda.model.behavior.entry.b> e;
    public final c<com.meituan.android.yoda.model.behavior.entry.c> f;
    public final c<d> g;
    public final c<com.meituan.android.yoda.model.behavior.entry.a> h;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dca1e2059ea70cf542208c83e0697e42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dca1e2059ea70cf542208c83e0697e42");
            return;
        }
        this.c = true;
        this.d = 0L;
        this.e = new c<>(15);
        this.f = new c<>(15, true);
        this.g = new c<>(60);
        this.h = new c<>(60);
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01cd0a794986b09f7fc1de304f451ac2", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01cd0a794986b09f7fc1de304f451ac2");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public final void a(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47045ca874ebed845de7150da702fb90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47045ca874ebed845de7150da702fb90");
        } else if (this.c) {
            this.e.a((c<com.meituan.android.yoda.model.behavior.entry.b>) com.meituan.android.yoda.model.behavior.entry.b.a(motionEvent.getRawX(), motionEvent.getRawY(), view == null ? "Empty Zone" : view.getClass().getName(), y.a(view)));
        }
    }

    public final void a(List<MotionEvent> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70c0737e67786e17e207fcfcaa1c1e65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70c0737e67786e17e207fcfcaa1c1e65");
        } else if (this.c) {
            for (MotionEvent motionEvent : list) {
                this.g.a((c<d>) d.a(motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getPointerCount(), b()));
            }
        }
    }

    public long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f60be9e964be9adc66599222847d8c4", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f60be9e964be9adc66599222847d8c4")).longValue() : System.currentTimeMillis() - this.d;
    }
}
