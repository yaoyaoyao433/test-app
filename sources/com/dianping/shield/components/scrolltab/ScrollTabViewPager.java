package com.dianping.shield.components.scrolltab;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.dianping.shield.component.interfaces.OnDidInterceptTouchListener;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ScrollTabViewPager extends ViewPager implements ComponentScrollEventHelper.IScrollRange {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean disableHorizontalScroll;
    private int height;
    private float initialX;
    private float initialY;
    private float lastMotionX;
    private float lastMotionY;
    private int mTouchSlop;
    private OnDidInterceptTouchListener onDidInterceptTouchListener;
    private ComponentScrollEventHelper scrollEventHelper;

    public ScrollTabViewPager(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "751abfb1d6b4c41355b71d66bbcaf007", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "751abfb1d6b4c41355b71d66bbcaf007");
        }
    }

    public ScrollTabViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a450c11aff70dd726884c296bc153a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a450c11aff70dd726884c296bc153a4");
            return;
        }
        this.scrollEventHelper = null;
        this.onDidInterceptTouchListener = null;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    public void setScrollEventHelper(ComponentScrollEventHelper componentScrollEventHelper) {
        this.scrollEventHelper = componentScrollEventHelper;
    }

    public void setDidInterceptListener(OnDidInterceptTouchListener onDidInterceptTouchListener) {
        this.onDidInterceptTouchListener = onDidInterceptTouchListener;
    }

    public void setDisableHorizontalScroll(boolean z) {
        this.disableHorizontalScroll = z;
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        boolean z2 = false;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b017284baa5331ead0fba195fac5398", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b017284baa5331ead0fba195fac5398")).booleanValue();
        }
        if (this.disableHorizontalScroll) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.initialX = motionEvent.getX();
                this.initialY = motionEvent.getY();
            } else if (action == 2) {
                float x = motionEvent.getX() - this.initialX;
                float abs = Math.abs(x);
                z = (abs <= ((float) this.mTouchSlop) || ((double) abs) * 0.5d <= ((double) Math.abs(motionEvent.getY() - this.initialY))) ? false : false;
                this.initialX = x > 0.0f ? this.initialX + this.mTouchSlop : this.initialX - this.mTouchSlop;
                z2 = z;
            }
        } else {
            z2 = super.onInterceptTouchEvent(motionEvent);
        }
        if (z2 && this.onDidInterceptTouchListener != null) {
            this.onDidInterceptTouchListener.onViewDidIntercept(this, motionEvent);
        }
        return z2;
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7b5fdea97b512489f65cbaa793cb3da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7b5fdea97b512489f65cbaa793cb3da")).booleanValue();
        }
        if (this.scrollEventHelper != null) {
            if (this.scrollEventHelper.needDragEvent()) {
                this.scrollEventHelper.handleEndDragByTouchEvent(motionEvent);
            }
            if (this.scrollEventHelper.needMomentumEvent()) {
                this.scrollEventHelper.handleMomentumScrollAndDragEndByEvent(motionEvent);
            }
        }
        if (this.disableHorizontalScroll) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1c4972be6b10d2a8ef945c7563e14f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1c4972be6b10d2a8ef945c7563e14f9")).booleanValue();
        }
        try {
            if (getAdapter() != null && getAdapter().getCount() != 0) {
                if (getCurrentItem() == 0) {
                    switch (motionEvent.getAction()) {
                        case 0:
                            float x = motionEvent.getX();
                            this.lastMotionX = x;
                            this.initialX = x;
                            float y = motionEvent.getY();
                            this.lastMotionY = y;
                            this.initialY = y;
                            break;
                        case 1:
                        case 3:
                            this.initialX = -1.0f;
                            this.initialY = -1.0f;
                            break;
                        case 2:
                            float x2 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            float abs = Math.abs(x2 - this.lastMotionX);
                            float abs2 = Math.abs(y2 - this.lastMotionY);
                            if (abs > this.mTouchSlop && abs * 0.5d > abs2 && x2 > this.lastMotionX) {
                                z = false;
                            }
                            this.lastMotionX = motionEvent.getX();
                            this.lastMotionY = motionEvent.getY();
                            break;
                    }
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(z);
                }
                return super.dispatchTouchEvent(motionEvent);
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f009e40044bda840ab3b052204d149bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f009e40044bda840ab3b052204d149bc");
            return;
        }
        if (this.height != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.height, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void requestSize(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44c5b1ed9fd2675f414cd18551417a31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44c5b1ed9fd2675f414cd18551417a31");
        } else if (getMeasuredHeight() != i2) {
            this.height = i2;
            measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
            requestLayout();
        }
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IScrollRange
    public int getTotalVerticalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3d757a8f17df76df0f3c3b2fac8e3e6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3d757a8f17df76df0f3c3b2fac8e3e6")).intValue() : getHeight();
    }

    @Override // com.dianping.shield.component.utils.ComponentScrollEventHelper.IScrollRange
    public int getTotalHorizontalScrollRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbc2d750e008908afc78bb63d18a978a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbc2d750e008908afc78bb63d18a978a")).intValue() : getWidth() * getAdapter().getCount();
    }
}
