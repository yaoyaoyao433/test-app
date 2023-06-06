package com.dianping.shield.component.utils;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ScrollDispatchHelper {
    private static final int MIN_EVENT_SEPARATION_MS = 10;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean allowNextScroll;
    private long mLastScrollEventTimeMs;
    private float mOffsetX;
    private float mOffsetY;
    private int mPrevX;
    private int mPrevY;
    private float mXFlingVelocity;
    private float mYFlingVelocity;
    private int throttle;

    public ScrollDispatchHelper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa88e853245c68d56633b6b4fe934004", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa88e853245c68d56633b6b4fe934004");
            return;
        }
        this.mPrevX = Integer.MIN_VALUE;
        this.mPrevY = Integer.MIN_VALUE;
        this.mXFlingVelocity = 0.0f;
        this.mYFlingVelocity = 0.0f;
        this.mOffsetX = 0.0f;
        this.mOffsetY = 0.0f;
        this.allowNextScroll = true;
        this.mLastScrollEventTimeMs = -1L;
    }

    public ScrollDispatchHelper(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4df02e74620602b52dfa43199f57d8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4df02e74620602b52dfa43199f57d8a");
            return;
        }
        this.mPrevX = Integer.MIN_VALUE;
        this.mPrevY = Integer.MIN_VALUE;
        this.mXFlingVelocity = 0.0f;
        this.mYFlingVelocity = 0.0f;
        this.mOffsetX = 0.0f;
        this.mOffsetY = 0.0f;
        this.allowNextScroll = true;
        setThrottle(i);
    }

    public void setThrottle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3dff416bda9acb6a8ea9f5ffb03290e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3dff416bda9acb6a8ea9f5ffb03290e");
            return;
        }
        this.throttle = i;
        this.mLastScrollEventTimeMs = -(i + 1);
    }

    public boolean onScrollChanged(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6966de4726db68605e5d5d8626cb6309", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6966de4726db68605e5d5d8626cb6309")).booleanValue() : onScrollChanged(i, i2, false);
    }

    public boolean onScrollChanged(int i, int i2, boolean z) {
        boolean z2 = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa9221edfe3236f2b3c15d8cd67cd026", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa9221edfe3236f2b3c15d8cd67cd026")).booleanValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.throttle > 0 && uptimeMillis - this.mLastScrollEventTimeMs > this.throttle && (this.mPrevX != i || this.mPrevY != i2)) {
            this.allowNextScroll = false;
            this.mLastScrollEventTimeMs = uptimeMillis;
            z2 = true;
        }
        if (z) {
            z2 = true;
        }
        if (uptimeMillis - this.mLastScrollEventTimeMs != 0) {
            this.mXFlingVelocity = (i - this.mPrevX) / ((float) (uptimeMillis - this.mLastScrollEventTimeMs));
            this.mYFlingVelocity = (i2 - this.mPrevY) / ((float) (uptimeMillis - this.mLastScrollEventTimeMs));
        }
        this.mPrevX = i;
        this.mPrevY = i2;
        this.mOffsetX += i;
        this.mOffsetY += i2;
        return z2;
    }

    public float getXFlingVelocity() {
        return this.mXFlingVelocity;
    }

    public float getYFlingVelocity() {
        return this.mYFlingVelocity;
    }

    public void setAllowNextScroll(boolean z) {
        this.allowNextScroll = z;
    }

    public int getOffsetX() {
        return (int) this.mOffsetX;
    }

    public int getOffsetY() {
        return (int) this.mOffsetY;
    }
}
