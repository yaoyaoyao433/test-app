package com.dianping.shield.component.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.dianping.picasso.view.scroller.CustomizedScrollView;
import com.dianping.shield.node.itemcallbacks.ContentOffsetListener;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ScDampingEmptyHeaderView extends FrameLayout implements ShieldPreloadInterface {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final float mFactor = 0.3f;
    private boolean canOffsetChangeWithDisableScroll;
    private boolean canScrollExtra;
    private ContentOffsetListener contentOffsetListener;
    private MyRunnable contentOffsetRunnable;
    private int dragDistance;
    private int duration;
    public int emptyViewHeight;
    private FrameLayout emptyViewLayout;
    private boolean enableFrozen;
    private boolean isDraging;
    private boolean isIntercept;
    private boolean isUpdateFinish;
    private float mLastMotionY;
    private boolean needAnimation;
    private View.OnTouchListener onTouchListener;
    public int orgViewHeight;
    private PageContainerRecyclerView pageContainerRecyclerView;
    private int shouldBeHeight;
    private ValueAnimator valueAnimator;
    private ViewHeightChangedAnimListener viewHeightChangedAnimListener;
    private int y;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface ViewHeightChangedAnimListener {
        void onFinish(int i);
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldPreload() {
    }

    public ScDampingEmptyHeaderView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "303923cc1a53c64679804970886260f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "303923cc1a53c64679804970886260f9");
            return;
        }
        this.mLastMotionY = 0.0f;
        this.duration = CustomizedScrollView.ANIMATED_SCROLL_GAP;
        this.orgViewHeight = 0;
        this.shouldBeHeight = this.orgViewHeight;
        this.dragDistance = 0;
        this.contentOffsetRunnable = new MyRunnable();
        this.enableFrozen = false;
        this.onTouchListener = new View.OnTouchListener() { // from class: com.dianping.shield.component.widgets.ScDampingEmptyHeaderView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d31113c5b0549e619cf186d1bdae892e", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d31113c5b0549e619cf186d1bdae892e")).booleanValue();
                }
                if (ScDampingEmptyHeaderView.this.emptyViewLayout == null || ScDampingEmptyHeaderView.this.pageContainerRecyclerView == null || !(ScDampingEmptyHeaderView.this.pageContainerRecyclerView.getLayoutManager() instanceof ShieldLayoutManagerInterface)) {
                    return false;
                }
                if (ScDampingEmptyHeaderView.this.canScrollExtra || ScDampingEmptyHeaderView.this.canOffsetChangeWithDisableScroll) {
                    switch (motionEvent.getAction()) {
                        case 1:
                        case 3:
                            ScDampingEmptyHeaderView.this.isDraging = false;
                            ScDampingEmptyHeaderView.this.mLastMotionY = 0.0f;
                            ScDampingEmptyHeaderView.this.dragDistance = 0;
                            if (ScDampingEmptyHeaderView.this.isIntercept) {
                                ScDampingEmptyHeaderView.this.updateHeaderView(true);
                                break;
                            }
                            break;
                        case 2:
                            if (!ScDampingEmptyHeaderView.this.isDraging) {
                                ScDampingEmptyHeaderView.this.mLastMotionY = motionEvent.getY();
                                ScDampingEmptyHeaderView.this.resetHeaderView();
                                ScDampingEmptyHeaderView.this.isDraging = true;
                                break;
                            } else {
                                float y = motionEvent.getY();
                                float f = y - ScDampingEmptyHeaderView.this.mLastMotionY;
                                int findFirstVisibleItemPosition = ((ShieldLayoutManagerInterface) ScDampingEmptyHeaderView.this.pageContainerRecyclerView.getLayoutManager()).findFirstVisibleItemPosition(true);
                                ScDampingEmptyHeaderView.this.mLastMotionY = y;
                                if (findFirstVisibleItemPosition <= 0 && findFirstVisibleItemPosition != -1) {
                                    if (f > 0.0f) {
                                        if (ScDampingEmptyHeaderView.this.emptyViewHeight >= ScDampingEmptyHeaderView.this.orgViewHeight && ((findFirstVisibleItemPosition == 0 || findFirstVisibleItemPosition == 1) && ScDampingEmptyHeaderView.this.getTop() == 0)) {
                                            ScDampingEmptyHeaderView.this.dragDistance = (int) (ScDampingEmptyHeaderView.this.dragDistance + f);
                                            ScDampingEmptyHeaderView.this.setEmptyHeaderViewHeight(((int) (ScDampingEmptyHeaderView.this.calculateHeight(ScDampingEmptyHeaderView.this.dragDistance) * f)) + ScDampingEmptyHeaderView.this.emptyViewHeight);
                                            ScDampingEmptyHeaderView.this.isIntercept = true;
                                            return true;
                                        }
                                    } else if (ScDampingEmptyHeaderView.this.emptyViewHeight > ScDampingEmptyHeaderView.this.orgViewHeight) {
                                        ScDampingEmptyHeaderView.this.dragDistance = (int) (ScDampingEmptyHeaderView.this.dragDistance + f);
                                        ScDampingEmptyHeaderView.this.setEmptyHeaderViewHeight(((int) (ScDampingEmptyHeaderView.this.calculateHeight(ScDampingEmptyHeaderView.this.dragDistance) * f)) + ScDampingEmptyHeaderView.this.emptyViewHeight);
                                        ScDampingEmptyHeaderView.this.isIntercept = true;
                                        return true;
                                    }
                                    ScDampingEmptyHeaderView.this.isIntercept = false;
                                    break;
                                } else {
                                    if (ScDampingEmptyHeaderView.this.emptyViewHeight != ScDampingEmptyHeaderView.this.orgViewHeight) {
                                        ScDampingEmptyHeaderView.this.setEmptyHeaderViewHeight(ScDampingEmptyHeaderView.this.orgViewHeight);
                                        ScDampingEmptyHeaderView.this.dragDistance = 0;
                                    }
                                    ScDampingEmptyHeaderView.this.isIntercept = false;
                                    break;
                                }
                            }
                    }
                    return false;
                }
                return false;
            }
        };
        init();
    }

    public ScDampingEmptyHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4132661331237ac5e332da492e788f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4132661331237ac5e332da492e788f1");
            return;
        }
        this.mLastMotionY = 0.0f;
        this.duration = CustomizedScrollView.ANIMATED_SCROLL_GAP;
        this.orgViewHeight = 0;
        this.shouldBeHeight = this.orgViewHeight;
        this.dragDistance = 0;
        this.contentOffsetRunnable = new MyRunnable();
        this.enableFrozen = false;
        this.onTouchListener = new View.OnTouchListener() { // from class: com.dianping.shield.component.widgets.ScDampingEmptyHeaderView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d31113c5b0549e619cf186d1bdae892e", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d31113c5b0549e619cf186d1bdae892e")).booleanValue();
                }
                if (ScDampingEmptyHeaderView.this.emptyViewLayout == null || ScDampingEmptyHeaderView.this.pageContainerRecyclerView == null || !(ScDampingEmptyHeaderView.this.pageContainerRecyclerView.getLayoutManager() instanceof ShieldLayoutManagerInterface)) {
                    return false;
                }
                if (ScDampingEmptyHeaderView.this.canScrollExtra || ScDampingEmptyHeaderView.this.canOffsetChangeWithDisableScroll) {
                    switch (motionEvent.getAction()) {
                        case 1:
                        case 3:
                            ScDampingEmptyHeaderView.this.isDraging = false;
                            ScDampingEmptyHeaderView.this.mLastMotionY = 0.0f;
                            ScDampingEmptyHeaderView.this.dragDistance = 0;
                            if (ScDampingEmptyHeaderView.this.isIntercept) {
                                ScDampingEmptyHeaderView.this.updateHeaderView(true);
                                break;
                            }
                            break;
                        case 2:
                            if (!ScDampingEmptyHeaderView.this.isDraging) {
                                ScDampingEmptyHeaderView.this.mLastMotionY = motionEvent.getY();
                                ScDampingEmptyHeaderView.this.resetHeaderView();
                                ScDampingEmptyHeaderView.this.isDraging = true;
                                break;
                            } else {
                                float y = motionEvent.getY();
                                float f = y - ScDampingEmptyHeaderView.this.mLastMotionY;
                                int findFirstVisibleItemPosition = ((ShieldLayoutManagerInterface) ScDampingEmptyHeaderView.this.pageContainerRecyclerView.getLayoutManager()).findFirstVisibleItemPosition(true);
                                ScDampingEmptyHeaderView.this.mLastMotionY = y;
                                if (findFirstVisibleItemPosition <= 0 && findFirstVisibleItemPosition != -1) {
                                    if (f > 0.0f) {
                                        if (ScDampingEmptyHeaderView.this.emptyViewHeight >= ScDampingEmptyHeaderView.this.orgViewHeight && ((findFirstVisibleItemPosition == 0 || findFirstVisibleItemPosition == 1) && ScDampingEmptyHeaderView.this.getTop() == 0)) {
                                            ScDampingEmptyHeaderView.this.dragDistance = (int) (ScDampingEmptyHeaderView.this.dragDistance + f);
                                            ScDampingEmptyHeaderView.this.setEmptyHeaderViewHeight(((int) (ScDampingEmptyHeaderView.this.calculateHeight(ScDampingEmptyHeaderView.this.dragDistance) * f)) + ScDampingEmptyHeaderView.this.emptyViewHeight);
                                            ScDampingEmptyHeaderView.this.isIntercept = true;
                                            return true;
                                        }
                                    } else if (ScDampingEmptyHeaderView.this.emptyViewHeight > ScDampingEmptyHeaderView.this.orgViewHeight) {
                                        ScDampingEmptyHeaderView.this.dragDistance = (int) (ScDampingEmptyHeaderView.this.dragDistance + f);
                                        ScDampingEmptyHeaderView.this.setEmptyHeaderViewHeight(((int) (ScDampingEmptyHeaderView.this.calculateHeight(ScDampingEmptyHeaderView.this.dragDistance) * f)) + ScDampingEmptyHeaderView.this.emptyViewHeight);
                                        ScDampingEmptyHeaderView.this.isIntercept = true;
                                        return true;
                                    }
                                    ScDampingEmptyHeaderView.this.isIntercept = false;
                                    break;
                                } else {
                                    if (ScDampingEmptyHeaderView.this.emptyViewHeight != ScDampingEmptyHeaderView.this.orgViewHeight) {
                                        ScDampingEmptyHeaderView.this.setEmptyHeaderViewHeight(ScDampingEmptyHeaderView.this.orgViewHeight);
                                        ScDampingEmptyHeaderView.this.dragDistance = 0;
                                    }
                                    ScDampingEmptyHeaderView.this.isIntercept = false;
                                    break;
                                }
                            }
                    }
                    return false;
                }
                return false;
            }
        };
        init();
    }

    public void updateHeaderView(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bed4dc3d8fbdef7d3f8a1c0f8bad3782", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bed4dc3d8fbdef7d3f8a1c0f8bad3782");
        } else if (z) {
            updateViewWithAnim();
        } else {
            setEmptyHeaderViewHeight(this.shouldBeHeight);
        }
    }

    public void setUpdateDuration(int i) {
        this.duration = i;
    }

    @Deprecated
    public void setViewHeightChangedAnimListener(ViewHeightChangedAnimListener viewHeightChangedAnimListener) {
        this.viewHeightChangedAnimListener = viewHeightChangedAnimListener;
    }

    private void updateViewWithAnim() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a511defc22cdd01e0aef2bba5a2085eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a511defc22cdd01e0aef2bba5a2085eb");
        } else if (getParent() == null) {
            this.needAnimation = true;
            setEmptyHeaderViewHeight(1);
            if (this.pageContainerRecyclerView == null || this.enableFrozen) {
                return;
            }
            this.pageContainerRecyclerView.scrollToPosition(0);
        } else {
            startAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22f665918a6479b4adb16e2e07ef59fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22f665918a6479b4adb16e2e07ef59fe");
            return;
        }
        super.onAttachedToWindow();
        if (this.needAnimation) {
            startAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33ae65928cdd5bf9c70d63fe5e0c84a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33ae65928cdd5bf9c70d63fe5e0c84a6");
        } else {
            super.onDetachedFromWindow();
        }
    }

    private void startAnimation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a260d31c85aa1f625274064cacffeb4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a260d31c85aa1f625274064cacffeb4a");
            return;
        }
        this.needAnimation = false;
        this.isUpdateFinish = false;
        this.valueAnimator.setIntValues(this.emptyViewHeight, this.shouldBeHeight);
        this.valueAnimator.setInterpolator(new DecelerateInterpolator());
        this.valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.dianping.shield.component.widgets.ScDampingEmptyHeaderView.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "274040ee80e8e18db6ed78b0c30c74be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "274040ee80e8e18db6ed78b0c30c74be");
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ScDampingEmptyHeaderView.this.setEmptyHeaderViewHeight(intValue);
                ScDampingEmptyHeaderView.this.postInvalidate();
                if (intValue != ScDampingEmptyHeaderView.this.shouldBeHeight || ScDampingEmptyHeaderView.this.pageContainerRecyclerView == null || ScDampingEmptyHeaderView.this.isUpdateFinish) {
                    return;
                }
                if (!ScDampingEmptyHeaderView.this.enableFrozen) {
                    ScDampingEmptyHeaderView.this.pageContainerRecyclerView.scrollToPosition(0);
                }
                if (ScDampingEmptyHeaderView.this.viewHeightChangedAnimListener != null) {
                    ScDampingEmptyHeaderView.this.viewHeightChangedAnimListener.onFinish(ScDampingEmptyHeaderView.this.shouldBeHeight);
                    ScDampingEmptyHeaderView.this.isUpdateFinish = true;
                }
            }
        });
        this.valueAnimator.setDuration(this.duration);
        this.valueAnimator.start();
    }

    public void onAttachToRecyclerView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad2990fc9b78fc7d83b56b9de27404b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad2990fc9b78fc7d83b56b9de27404b2");
        } else if (this.emptyViewLayout == null || !(getParent() instanceof PageContainerRecyclerView)) {
        } else {
            this.pageContainerRecyclerView = (PageContainerRecyclerView) getParent();
            this.pageContainerRecyclerView.removeOnTouchListener(this.onTouchListener);
            this.pageContainerRecyclerView.addOnTouchListener(this.onTouchListener);
        }
    }

    private void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6759355410b6901c8d998b492cdd308", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6759355410b6901c8d998b492cdd308");
            return;
        }
        this.valueAnimator = new ValueAnimator();
        this.emptyViewLayout = (FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.shieldc_empty_layout, (ViewGroup) this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.orgViewHeight);
        layoutParams.gravity = 80;
        addView(this.emptyViewLayout, layoutParams);
        setLayoutParams(new RecyclerView.g(-1, -2));
        this.emptyViewLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.dianping.shield.component.widgets.ScDampingEmptyHeaderView.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dcf43fdaf338401c1080886f430e2038", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dcf43fdaf338401c1080886f430e2038");
                } else if (ScDampingEmptyHeaderView.this.canOffsetChangeWithDisableScroll || ScDampingEmptyHeaderView.this.pageContainerRecyclerView == null) {
                } else {
                    ScDampingEmptyHeaderView.this.emptyViewLayout.removeCallbacks(ScDampingEmptyHeaderView.this.contentOffsetRunnable);
                    ScDampingEmptyHeaderView.this.contentOffsetRunnable.y = i2 - i4;
                    ScDampingEmptyHeaderView.this.emptyViewLayout.post(ScDampingEmptyHeaderView.this.contentOffsetRunnable);
                }
            }
        });
    }

    @Override // com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa044046deac521cfe98880a386fd2e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa044046deac521cfe98880a386fd2e3");
            return;
        }
        if (this.emptyViewLayout != null) {
            this.emptyViewLayout.removeAllViews();
            this.emptyViewLayout.removeCallbacks(this.contentOffsetRunnable);
        }
        this.contentOffsetListener = null;
        this.pageContainerRecyclerView = null;
        this.mLastMotionY = 0.0f;
        this.duration = CustomizedScrollView.ANIMATED_SCROLL_GAP;
        this.orgViewHeight = 0;
        this.shouldBeHeight = 0;
        this.emptyViewHeight = 0;
        this.dragDistance = 0;
        resetHeaderView();
        this.isDraging = false;
        this.isIntercept = false;
        this.canScrollExtra = false;
        this.canOffsetChangeWithDisableScroll = false;
        this.viewHeightChangedAnimListener = null;
        this.isUpdateFinish = false;
        this.needAnimation = false;
        this.y = 0;
        updateHeaderView(false);
        setEmptyHeaderViewHeight(0);
        setHeaderViewOrgHeight(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class MyRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int y;

        public MyRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e92a6e60826729e2f31e9818f386f05b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e92a6e60826729e2f31e9818f386f05b");
            } else if (ScDampingEmptyHeaderView.this.pageContainerRecyclerView == null || ScDampingEmptyHeaderView.this.pageContainerRecyclerView.isComputingLayout()) {
                ScDampingEmptyHeaderView.this.emptyViewLayout.post(this);
            } else if (ScDampingEmptyHeaderView.this.canOffsetChangeWithDisableScroll || ScDampingEmptyHeaderView.this.emptyViewHeight == 0) {
            } else {
                ScDampingEmptyHeaderView.this.contentOffsetCallBack(this.y);
            }
        }
    }

    public void resetHeaderView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e33c07778f96ef3a1223ea0ea1a4e9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e33c07778f96ef3a1223ea0ea1a4e9f");
        } else if (this.valueAnimator == null || !this.valueAnimator.isRunning()) {
        } else {
            this.valueAnimator.cancel();
        }
    }

    public void setFrozenEnabled(boolean z) {
        this.enableFrozen = z;
    }

    public void setHeaderViewOrgHeight(int i) {
        this.orgViewHeight = i;
    }

    public void setEmptyHeaderViewHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "618803dbad73619a0c69a548d7513c84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "618803dbad73619a0c69a548d7513c84");
            return;
        }
        if (i < this.orgViewHeight) {
            i = this.orgViewHeight;
        }
        this.emptyViewHeight = i;
        if (this.canOffsetChangeWithDisableScroll) {
            contentOffsetCallBack(-this.emptyViewHeight);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emptyViewLayout.getLayoutParams();
        layoutParams.height = this.emptyViewHeight;
        this.emptyViewLayout.setLayoutParams(layoutParams);
        if (this.emptyViewHeight == 0) {
            contentOffsetCallBack(0);
        } else {
            contentOffsetCallBack(-this.emptyViewLayout.getHeight());
        }
        this.emptyViewLayout.removeCallbacks(this.contentOffsetRunnable);
    }

    public void contentOffsetCallBack(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1312d35862f30c72ad5f2cb20716e2a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1312d35862f30c72ad5f2cb20716e2a6");
        } else if (i != this.y) {
            if (this.contentOffsetListener != null) {
                this.contentOffsetListener.offsetChanged(0, i);
            }
            this.y = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float calculateHeight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccb0cb3c48f8a356fd55e8fe66eb7f8c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccb0cb3c48f8a356fd55e8fe66eb7f8c")).floatValue();
        }
        if (this.emptyViewHeight < this.orgViewHeight || f < 0.0f) {
            return 0.5f;
        }
        float pow = (float) (1.0d - Math.pow(f / getResources().getDisplayMetrics().heightPixels, 0.30000001192092896d));
        if (pow <= 0.35f) {
            return 0.35f;
        }
        return pow;
    }

    public void setContentInset(int i) {
        if (i < 0) {
            i = 0;
        }
        this.shouldBeHeight = i;
    }

    public boolean isDraging() {
        return this.isDraging;
    }

    public void setContentOffsetListener(ContentOffsetListener contentOffsetListener) {
        this.contentOffsetListener = contentOffsetListener;
    }

    public void setPullExtraEnable(boolean z) {
        this.canScrollExtra = z;
    }

    public void setOffsetChangeWithDisableScrollEnable(boolean z) {
        this.canOffsetChangeWithDisableScroll = z;
    }

    public void setRefreshView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ea1af69d0a5426032715897d5ba66a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ea1af69d0a5426032715897d5ba66a2");
        } else if (this.emptyViewLayout != null) {
            this.emptyViewLayout.removeAllViews();
            this.emptyViewLayout.addView(view);
        }
    }
}
