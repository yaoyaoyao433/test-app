package com.dianping.picasso.view.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import com.dianping.picasso.view.scroller.PicassoScrollViewParentInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SlideMenuLayout extends ViewGroup implements PicassoScrollViewParentInterface {
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean disableInterceptByScrollView;
    private boolean enableMenu;
    private int mActionDownX;
    private int mActionDownY;
    private int mChildrenTotalWidth;
    private int mInitialTouchX;
    private boolean mOpen;
    private final Scroller mScroller;
    private int mState;
    private final int mTouchSlop;
    private final VelocityTracker mVelocityTracker;
    private SlideMenuListener slideMenuListener;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface SlideMenuListener {
        void onOpenChanged(SlideMenuLayout slideMenuLayout, boolean z);

        void onStateChanged(SlideMenuLayout slideMenuLayout, int i);
    }

    public SlideMenuLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b8242fa1951d3d36cf684180bb4d521", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b8242fa1951d3d36cf684180bb4d521");
        }
    }

    public SlideMenuLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f46129c51b0a0cb1ff571892ebf4e094", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f46129c51b0a0cb1ff571892ebf4e094");
        }
    }

    public SlideMenuLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab772ed0b5088df133f2fe4119f2ecbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab772ed0b5088df133f2fe4119f2ecbb");
            return;
        }
        this.mState = 0;
        this.mOpen = false;
        this.enableMenu = true;
        this.disableInterceptByScrollView = false;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mScroller = new Scroller(context);
        this.mVelocityTracker = VelocityTracker.obtain();
    }

    public void open() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3954f92656c530e05c88c8b4e1a91dd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3954f92656c530e05c88c8b4e1a91dd2");
            return;
        }
        this.mScroller.forceFinished(true);
        this.mScroller.startScroll(getScrollX(), 0, (this.mChildrenTotalWidth - getMeasuredWidth()) - getScrollX(), 0, 500);
        invalidate();
        setState(2);
        boolean z = this.mOpen;
        this.mOpen = true;
        if (z || this.slideMenuListener == null) {
            return;
        }
        this.slideMenuListener.onOpenChanged(this, true);
    }

    public void close() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3b1eff2f6157ae20c217b3759a6fe70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3b1eff2f6157ae20c217b3759a6fe70");
        } else {
            close(500);
        }
    }

    public void close(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13024687f072a42ba6097e42904e81f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13024687f072a42ba6097e42904e81f5");
            return;
        }
        this.mScroller.forceFinished(true);
        this.mScroller.startScroll(getScrollX(), 0, -getScrollX(), 0, i);
        invalidate();
        setState(2);
        boolean z = this.mOpen;
        this.mOpen = false;
        if (!z || this.slideMenuListener == null) {
            return;
        }
        this.slideMenuListener.onOpenChanged(this, false);
    }

    public void setEnableMenu(boolean z) {
        this.enableMenu = z;
    }

    public void resetScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90547ae5f7edcc1a16aeea40b9856ed1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90547ae5f7edcc1a16aeea40b9856ed1");
            return;
        }
        this.mScroller.abortAnimation();
        setScrollX(0);
        setScrollY(0);
    }

    public boolean isMenuOpen() {
        return this.mOpen;
    }

    public void setSlideMenuListener(SlideMenuListener slideMenuListener) {
        this.slideMenuListener = slideMenuListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r1 != 2) goto L39;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.picasso.view.list.SlideMenuLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5ec361c68bac78727293fb88a6e8877", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5ec361c68bac78727293fb88a6e8877")).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.mVelocityTracker.clear();
                this.mVelocityTracker.addMovement(motionEvent);
                this.mActionDownX = (int) motionEvent.getX();
                setState(0);
                break;
            case 1:
            case 3:
                this.mVelocityTracker.computeCurrentVelocity(100);
                if (((float) getScrollX()) - this.mVelocityTracker.getXVelocity() > ((float) ((this.mChildrenTotalWidth - getMeasuredWidth()) / 2))) {
                    open();
                } else {
                    close();
                }
                this.mVelocityTracker.clear();
                break;
            case 2:
                this.mVelocityTracker.addMovement(motionEvent);
                if (this.mActionDownX - motionEvent.getX() > this.mTouchSlop && !this.mOpen && this.mState != 1) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setState(1);
                    this.mInitialTouchX = (int) motionEvent.getX();
                }
                if (motionEvent.getX() - this.mActionDownX > this.mTouchSlop && this.mOpen && this.mState != 1) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    setState(1);
                    this.mInitialTouchX = (int) motionEvent.getX();
                }
                if (this.mState == 1) {
                    if (this.mOpen) {
                        int x = (int) (motionEvent.getX() - this.mInitialTouchX);
                        if (x < 0) {
                            x = 0;
                        } else if (x > this.mChildrenTotalWidth - getMeasuredWidth()) {
                            x = this.mChildrenTotalWidth - getMeasuredWidth();
                        }
                        scrollTo((this.mChildrenTotalWidth - getMeasuredWidth()) - x, 0);
                        break;
                    } else {
                        int x2 = (int) (this.mInitialTouchX - motionEvent.getX());
                        if (x2 < 0) {
                            x2 = 0;
                        } else if (x2 > this.mChildrenTotalWidth - getMeasuredWidth()) {
                            x2 = this.mChildrenTotalWidth - getMeasuredWidth();
                        }
                        scrollTo(x2, 0);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8510db7e1fb9fcba1e773e018411bf94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8510db7e1fb9fcba1e773e018411bf94");
            return;
        }
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        this.mChildrenTotalWidth = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                this.mChildrenTotalWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "650d064d83c48ae1c1ea93239455c9fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "650d064d83c48ae1c1ea93239455c9fe");
            return;
        }
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                childAt.layout(i5, 0, childAt.getMeasuredWidth() + i5, childAt.getMeasuredHeight());
                i5 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5bb253e5dcc11c630b978c0110ec602", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5bb253e5dcc11c630b978c0110ec602");
        } else if (this.mScroller.computeScrollOffset()) {
            scrollTo(this.mScroller.getCurrX(), this.mScroller.getCurrY());
            invalidate();
            if (this.mScroller.isFinished()) {
                setState(0);
            }
        }
    }

    private void setState(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e13638caa51c7361d03489e3309b18c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e13638caa51c7361d03489e3309b18c");
            return;
        }
        int i2 = this.mState;
        this.mState = i;
        if (this.mState == i2 || this.slideMenuListener == null) {
            return;
        }
        this.slideMenuListener.onStateChanged(this, this.mState);
    }

    @Override // com.dianping.picasso.view.scroller.PicassoScrollViewParentInterface
    public void disableParentIntercept(boolean z) {
        this.disableInterceptByScrollView = z;
    }
}
