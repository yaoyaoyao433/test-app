package com.meituan.msc.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class h {
    public static ChangeQuickRedirect e;
    protected int f;
    protected final float[] g;
    protected boolean h;
    protected long i;
    protected final ViewGroup j;
    protected final com.meituan.msc.uimanager.events.f k;

    public h(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75f63a3ab60615ac1e40a0c023910ff3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75f63a3ab60615ac1e40a0c023910ff3");
            return;
        }
        this.f = -1;
        this.g = new float[2];
        this.h = false;
        this.i = Long.MIN_VALUE;
        this.k = new com.meituan.msc.uimanager.events.f();
        this.j = viewGroup;
    }

    public void b(MotionEvent motionEvent, com.meituan.msc.uimanager.events.b bVar) {
        boolean z = false;
        Object[] objArr = {motionEvent, bVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "221ec9e1d32f5f6d5f51a85751651e05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "221ec9e1d32f5f6d5f51a85751651e05");
        } else if (this.h) {
        } else {
            if (bVar != null && bVar.b != null && bVar.b.getRuntimeDelegate().isNativeRenderType()) {
                z = true;
            }
            if (z) {
                return;
            }
            c(motionEvent, bVar);
            this.h = true;
            this.f = -1;
        }
    }

    private int a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dde28642ac1079548fd961d9a4c3b83", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dde28642ac1079548fd961d9a4c3b83")).intValue() : ak.a(motionEvent.getX(), motionEvent.getY(), this.j, this.g, (int[]) null);
    }

    private void c(MotionEvent motionEvent, com.meituan.msc.uimanager.events.b bVar) {
        Object[] objArr = {motionEvent, bVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "678cb7d0278c37d51e031c671a227347", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "678cb7d0278c37d51e031c671a227347");
        } else if (this.f == -1) {
            com.meituan.msc.modules.reporter.g.e("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
        } else {
            com.facebook.infer.annotation.a.a(!this.h, "Expected to not have already sent a cancel for this gesture");
            ((com.meituan.msc.uimanager.events.b) com.facebook.infer.annotation.a.a(bVar)).a(com.meituan.msc.uimanager.events.e.a(this.f, com.meituan.msc.uimanager.events.g.CANCEL, motionEvent, this.i, this.g[0], this.g[1], this.k));
        }
    }

    public void a(MotionEvent motionEvent, com.meituan.msc.uimanager.events.b bVar) {
        Object[] objArr = {motionEvent, bVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31eb8e55cfdcaee624a4bbc1301112cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31eb8e55cfdcaee624a4bbc1301112cb");
            return;
        }
        boolean z = (bVar == null || bVar.b == null || !bVar.b.getRuntimeDelegate().isNativeRenderType()) ? false : true;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.f != -1) {
                com.meituan.msc.modules.reporter.g.a("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.h = false;
            this.i = motionEvent.getEventTime();
            this.f = a(motionEvent);
            bVar.a(com.meituan.msc.uimanager.events.e.a(this.f, com.meituan.msc.uimanager.events.g.START, motionEvent, this.i, this.g[0], this.g[1], this.k));
        } else if (!this.h || z) {
            if (this.f == -1) {
                com.meituan.msc.modules.reporter.g.a("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            } else if (action == 1) {
                a(motionEvent);
                bVar.a(com.meituan.msc.uimanager.events.e.a(this.f, com.meituan.msc.uimanager.events.g.END, motionEvent, this.i, this.g[0], this.g[1], this.k));
                this.f = -1;
                this.i = Long.MIN_VALUE;
            } else if (action == 2) {
                a(motionEvent);
                bVar.a(com.meituan.msc.uimanager.events.e.a(this.f, com.meituan.msc.uimanager.events.g.MOVE, motionEvent, this.i, this.g[0], this.g[1], this.k));
            } else if (action == 5) {
                bVar.a(com.meituan.msc.uimanager.events.e.a(this.f, com.meituan.msc.uimanager.events.g.START, motionEvent, this.i, this.g[0], this.g[1], this.k));
            } else if (action == 6) {
                bVar.a(com.meituan.msc.uimanager.events.e.a(this.f, com.meituan.msc.uimanager.events.g.END, motionEvent, this.i, this.g[0], this.g[1], this.k));
            } else if (action == 3) {
                if (this.k.e(motionEvent.getDownTime())) {
                    c(motionEvent, bVar);
                } else {
                    com.meituan.msc.modules.reporter.g.a("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
                }
                this.f = -1;
                this.i = Long.MIN_VALUE;
            } else {
                com.meituan.msc.modules.reporter.g.e("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + this.f);
            }
        }
    }
}
