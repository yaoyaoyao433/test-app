package com.sankuai.waimai.platform.widget.compat;

import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ViewPagerCompat extends ViewPager {
    public static ChangeQuickRedirect a;
    private boolean b;
    private int c;
    private float d;

    public void setViewTouchMode(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e97dca83e5d166a94ec7ca797e82c432", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e97dca83e5d166a94ec7ca797e82c432");
            return;
        }
        if (z && !isFakeDragging()) {
            beginFakeDrag();
        } else if (!z && isFakeDragging()) {
            endFakeDrag();
        }
        this.b = z;
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fac2a41aa50e61e7824f11af638c605a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fac2a41aa50e61e7824f11af638c605a")).booleanValue();
        }
        try {
            switch (motionEvent.getActionMasked()) {
                case 1:
                    this.c = -1;
                    break;
                case 2:
                    float x = motionEvent.getX() - this.d;
                    if (x <= 0.0f) {
                        if (x < 0.0f) {
                            this.c = 1;
                            break;
                        }
                    } else {
                        this.c = 0;
                        break;
                    }
                    break;
            }
            this.d = motionEvent.getX();
            if (this.b) {
                return false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e68c2e8a8452442f4975324f7fc4afe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e68c2e8a8452442f4975324f7fc4afe")).booleanValue();
        }
        try {
            getCurrentItem();
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            getCurrentItem();
            return onTouchEvent;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.support.v4.view.ViewPager
    public boolean arrowScroll(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64935736ee0bcecf4b96ba81de111b92", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64935736ee0bcecf4b96ba81de111b92")).booleanValue();
        }
        if (this.b) {
            return false;
        }
        if (i == 17 || i == 66) {
            return super.arrowScroll(i);
        }
        return false;
    }

    public int getMoveDirection() {
        return this.c;
    }
}
