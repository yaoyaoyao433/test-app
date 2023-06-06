package com.dianping.shield.component.widgets;

import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class VelocityHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private VelocityTracker mVelocityTracker;
    private float mXVelocity;
    private float mYVelocity;

    public void calculateVelocity(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fa2343c7ccf273af3ec901d264778a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fa2343c7ccf273af3ec901d264778a3");
            return;
        }
        int action = motionEvent.getAction() & 255;
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        if (action == 1 || action == 3) {
            this.mVelocityTracker.computeCurrentVelocity(1);
            this.mXVelocity = this.mVelocityTracker.getXVelocity();
            this.mYVelocity = this.mVelocityTracker.getYVelocity();
            if (this.mVelocityTracker != null) {
                this.mVelocityTracker.recycle();
                this.mVelocityTracker = null;
            }
        }
    }

    public float getXVelocity() {
        return this.mXVelocity;
    }

    public float getYVelocity() {
        return this.mYVelocity;
    }
}
