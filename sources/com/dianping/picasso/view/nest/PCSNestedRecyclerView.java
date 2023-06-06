package com.dianping.picasso.view.nest;

import android.content.Context;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.dianping.picasso.view.scroller.CustomizedScrollView;
import com.dianping.picasso.view.scroller.PicassoScrollViewParentInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PCSNestedRecyclerView extends RecyclerView implements NestedScrollingParent2, PicassoNestScrollChild, PicassoNestScrollParent, PicassoScrollViewParentInterface {
    public static final int NEST_SCROLL_TYPE_CHILD = 1;
    public static final int NEST_SCROLL_TYPE_DEFAULT = 0;
    public static final int NEST_SCROLL_TYPE_PARENT = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean DEBUG;
    private boolean captureNestFling;
    private int captureResponderOffset;
    private boolean disableIntercept;
    private boolean disableInterceptByScrollView;
    private int mTouchSlop;
    private float mVelocityX;
    private float mVelocityY;
    private NestedScrollingParentHelper nestParentHelper;
    private int nestScrollType;
    private PicassoNestScrollChild picassoNestScrollChild;
    private PicassoNestScrollParent picassoNestScrollParent;
    private OnStopNestedScrollListener stopNestedScrollListener;
    private float xDown;
    private float yDown;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class OnStopNestedScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public void onStopNestedScroll(int i, float f, float f2) {
        }
    }

    public boolean isPullRefreshing() {
        return false;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    public PCSNestedRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0008f067239259aa606562815da4beb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0008f067239259aa606562815da4beb0");
            return;
        }
        this.nestScrollType = 0;
        this.xDown = 0.0f;
        this.yDown = 0.0f;
        this.disableIntercept = false;
        this.DEBUG = false;
        this.disableInterceptByScrollView = false;
        this.nestParentHelper = new NestedScrollingParentHelper(this);
        setNestedScrollingEnabled(true);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public void setNestScrollType(int i) {
        this.nestScrollType = i;
    }

    private boolean supportNestScroll() {
        return this.nestScrollType != 0;
    }

    @Override // com.dianping.picasso.view.nest.PicassoNestScrollParent
    public boolean parentNestedScrollEnabled() {
        return this.nestScrollType == 2;
    }

    @Override // com.dianping.picasso.view.nest.PicassoNestScrollParent
    public void setDisableIntercept(boolean z) {
        this.disableIntercept = z;
    }

    @Override // com.dianping.picasso.view.nest.PicassoNestScrollParent
    public int getVerticalScrollOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dfadc28812e37dcb6d977d64b349b34", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dfadc28812e37dcb6d977d64b349b34")).intValue() : computeVerticalScrollOffset();
    }

    @Override // com.dianping.picasso.view.nest.PicassoNestScrollParent
    public int getHorizontalScrollOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d713c52a6548fd0e06a3388e89f6a264", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d713c52a6548fd0e06a3388e89f6a264")).intValue() : computeHorizontalScrollOffset();
    }

    @Override // com.dianping.picasso.view.nest.PicassoNestScrollParent
    public boolean parentPullRefreshing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aec650bbbf56fd0338626c78009ba2b3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aec650bbbf56fd0338626c78009ba2b3")).booleanValue() : isPullRefreshing();
    }

    @Override // com.dianping.picasso.view.nest.PicassoNestScrollParent
    public void setNestScrollChildView(PicassoNestScrollChild picassoNestScrollChild) {
        this.picassoNestScrollChild = picassoNestScrollChild;
    }

    @Override // com.dianping.picasso.view.nest.PicassoNestScrollChild
    public boolean childNestedScrollEnabled() {
        return this.nestScrollType == 1;
    }

    @Override // com.dianping.picasso.view.nest.PicassoNestScrollChild
    public int getCaptureResponderOffset() {
        return this.captureResponderOffset;
    }

    @Override // com.dianping.picasso.view.nest.PicassoNestScrollChild
    public int currentScrollState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f43b4a16f4e7fabf895a031d998877a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f43b4a16f4e7fabf895a031d998877a")).intValue() : getScrollState();
    }

    @Override // com.dianping.picasso.view.nest.PicassoNestScrollChild
    public void forceStopScroll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ea315996c8e78868ce7aa9adf5bb9af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ea315996c8e78868ce7aa9adf5bb9af");
        } else {
            stopScroll();
        }
    }

    public void setCaptureNestFling(boolean z) {
        this.captureNestFling = z;
    }

    public void setCaptureResponderOffset(int i) {
        this.captureResponderOffset = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bb275b6a4825a1999e270c062f95b29", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bb275b6a4825a1999e270c062f95b29")).booleanValue() : super.dispatchTouchEvent(motionEvent);
    }

    private boolean isInScrollView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9f26f3161ac25ba0171e602c777f949", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9f26f3161ac25ba0171e602c777f949")).booleanValue();
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof CustomizedScrollView) {
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "220af8a1e380f2b2ee93ee11a63f2edd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "220af8a1e380f2b2ee93ee11a63f2edd")).booleanValue();
        }
        if (this.disableInterceptByScrollView) {
            return false;
        }
        if (parentNestedScrollEnabled()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.disableIntercept = false;
            } else if (action == 2 && this.picassoNestScrollChild != null && this.picassoNestScrollChild.currentScrollState() == 2) {
                this.picassoNestScrollChild.forceStopScroll();
            }
            if (this.disableIntercept) {
                return false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (childNestedScrollEnabled() && motionEvent.getAction() == 0) {
            ViewParent parent = getParent();
            while (true) {
                if (parent == null) {
                    break;
                } else if (parent instanceof PicassoNestScrollParent) {
                    this.picassoNestScrollParent = (PicassoNestScrollParent) parent;
                    this.picassoNestScrollParent.setNestScrollChildView(this);
                    this.picassoNestScrollParent.setDisableIntercept(this.picassoNestScrollParent.parentNestedScrollEnabled());
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        if (supportNestScroll() || isInScrollView()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                this.xDown = x;
                this.yDown = y;
            } else if (action2 == 2 && Math.abs(y - this.yDown) > Math.abs(x - this.xDown) && Math.abs(y - this.yDown) > this.mTouchSlop) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        Object[] objArr = {view, view2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "334df7a58bb70e47716224d89e7a0400", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "334df7a58bb70e47716224d89e7a0400");
        } else {
            this.nestParentHelper.onNestedScrollAccepted(view, view2, i, i2);
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f78b548f7b7c7c8903c6e119df41c13d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f78b548f7b7c7c8903c6e119df41c13d");
            return;
        }
        this.nestParentHelper.onStopNestedScroll(view, i);
        if (this.stopNestedScrollListener != null && parentNestedScrollEnabled()) {
            this.stopNestedScrollListener.onStopNestedScroll(i, this.mVelocityX, this.mVelocityY);
        }
        super.stopNestedScroll(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a25e5a2b3e9839651365eacf2b63c20", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a25e5a2b3e9839651365eacf2b63c20")).booleanValue();
        }
        this.mVelocityX = f;
        this.mVelocityY = f2;
        return super.onNestedFling(view, f, f2, z);
    }

    @Override // android.view.ViewGroup, android.support.v4.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e6a33eec01343596e53f0304f188127", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e6a33eec01343596e53f0304f188127")).intValue() : this.nestParentHelper.getNestedScrollAxes();
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        Object[] objArr = {view, view2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2effb851aae4352fd501f47367e030a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2effb851aae4352fd501f47367e030a")).booleanValue();
        }
        this.mVelocityX = 0.0f;
        this.mVelocityY = 0.0f;
        return i == 2;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8faf5b3c118f52d38872bb4b70e9984a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8faf5b3c118f52d38872bb4b70e9984a");
        } else if (supportNestScroll()) {
            if ((i2 < 0 && !canScrollVertically(-1)) || (i2 > 0 && isPullRefreshing())) {
                if (i3 == 1 && (view instanceof RecyclerView)) {
                    ((RecyclerView) view).stopScroll();
                }
                super.dispatchNestedPreScroll(i, i2, iArr, null, i3);
                return;
            }
            iArr[1] = i2;
            scrollBy(0, i2);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View, android.support.v4.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e986e8e64f50ea199ac7002efe2f0c3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e986e8e64f50ea199ac7002efe2f0c3e");
        } else {
            super.setNestedScrollingEnabled(z);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56901b755eda6fef1a74d08028c69391", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56901b755eda6fef1a74d08028c69391")).booleanValue() : super.isNestedScrollingEnabled();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcdb1a049065a0eff906d00480016d0c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcdb1a049065a0eff906d00480016d0c")).booleanValue() : super.hasNestedScrollingParent();
    }

    @Override // android.support.v7.widget.RecyclerView, android.support.v4.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35787c7e6516a0d43b2eca1538e94638", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35787c7e6516a0d43b2eca1538e94638")).booleanValue() : super.startNestedScroll(i, i2);
    }

    @Override // android.support.v7.widget.RecyclerView, android.support.v4.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), iArr, iArr2, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf1ff58398299235988c2b50a9d28c31", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf1ff58398299235988c2b50a9d28c31")).booleanValue();
        }
        if (!supportNestScroll()) {
            return super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        }
        if (isPullRefreshing()) {
            return super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        }
        if (i2 < 0 && !canScrollVertically(-1)) {
            if (this.captureNestFling && i3 == 1) {
                return false;
            }
            return super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        }
        if (i2 > 0 && i3 == 1 && this.picassoNestScrollChild != null && getVerticalScrollOffset() >= this.picassoNestScrollChild.getCaptureResponderOffset()) {
            forceStopScroll();
        }
        if (i2 > 0 && childNestedScrollEnabled() && this.picassoNestScrollParent != null && this.picassoNestScrollParent.parentNestedScrollEnabled()) {
            int verticalScrollOffset = this.picassoNestScrollParent.getVerticalScrollOffset();
            int i4 = verticalScrollOffset + i2;
            if (i4 < getCaptureResponderOffset() || this.picassoNestScrollParent.parentPullRefreshing()) {
                return super.dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
            }
            if (i4 > getCaptureResponderOffset() && verticalScrollOffset < getCaptureResponderOffset()) {
                return super.dispatchNestedPreScroll(i, getCaptureResponderOffset() - verticalScrollOffset, iArr, iArr2, i3);
            }
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView, android.support.v4.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), iArr, Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4602b8743c2b96881583f61751193c1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4602b8743c2b96881583f61751193c1")).booleanValue() : super.dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
    }

    @Override // android.support.v7.widget.RecyclerView, android.support.v4.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71bf9facf1b1c2a1daa45d94baa8ca9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71bf9facf1b1c2a1daa45d94baa8ca9b");
        } else {
            super.stopNestedScroll(i);
        }
    }

    @Override // com.dianping.picasso.view.scroller.PicassoScrollViewParentInterface
    public void disableParentIntercept(boolean z) {
        this.disableInterceptByScrollView = z;
    }

    public void setOnStopNestedScrollListener(OnStopNestedScrollListener onStopNestedScrollListener) {
        this.stopNestedScrollListener = onStopNestedScrollListener;
    }
}
