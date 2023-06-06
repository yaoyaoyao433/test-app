package com.sankuai.meituan.mapsdk.core.gesture;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
/* compiled from: ProGuard */
@UiThread
/* loaded from: classes4.dex */
public abstract class l<L> extends h<L> {
    public static ChangeQuickRedirect n;
    private boolean h;
    private boolean i;
    final Set<Integer> o;
    public VelocityTracker p;
    public float q;
    public float r;

    @NonNull
    public abstract Set<Integer> b();

    public l(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        Object[] objArr = {context, androidGesturesManager};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d304d8dd1cf4b082fc049601f10e7c5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d304d8dd1cf4b082fc049601f10e7c5f");
        } else {
            this.o = b();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h, com.sankuai.meituan.mapsdk.core.gesture.a
    public boolean a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60b51b2ee20c664565f68c16744287e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60b51b2ee20c664565f68c16744287e6")).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5 || actionMasked == 6 || actionMasked == 3) {
            d();
        }
        if (this.i) {
            this.i = false;
            d();
            e();
        }
        if (this.p != null) {
            this.p.addMovement(this.d);
        }
        boolean a = super.a(motionEvent);
        if (actionMasked == 1 || actionMasked == 6) {
            if (this.l.size() < f() && this.h) {
                e();
                return true;
            }
        } else if (actionMasked == 3 && this.h) {
            e();
            return true;
        }
        return a;
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5718e73607a15e29c4c49839a7f4cd80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5718e73607a15e29c4c49839a7f4cd80");
            return;
        }
        this.h = true;
        if (this.p == null) {
            this.p = VelocityTracker.obtain();
        }
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d3f6514f51d86ae1195171d9ae58fa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d3f6514f51d86ae1195171d9ae58fa4");
            return;
        }
        this.h = false;
        if (this.p != null) {
            this.p.computeCurrentVelocity(1000);
            this.q = this.p.getXVelocity();
            this.r = this.p.getYVelocity();
            this.p.recycle();
            this.p = null;
        }
        d();
    }

    public boolean k() {
        return this.h;
    }

    public void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bcc454c587dd8eb25f5194a764ee289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bcc454c587dd8eb25f5194a764ee289");
        } else if (k()) {
            this.i = true;
        }
    }
}
