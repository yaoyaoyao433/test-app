package com.dianping.shield.component.widgets.container;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.dianping.shield.component.interfaces.OnInterceptTouchListener;
import com.dianping.shield.sectionrecycler.ShieldLayoutManagerInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ContainerPullToZoomMode extends ContainerBaseMode {
    private static final double ZOOM_NUM = 0.5d;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final int duration = 250;
    private float mLastMotionY;
    private ValueAnimator valueAnimator;
    private View zoomView;
    private int zoomViewOrgHeight;

    public ContainerPullToZoomMode(CommonPageContainer commonPageContainer) {
        super(commonPageContainer);
        Object[] objArr = {commonPageContainer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c254535a0541f403daa599c17c748602", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c254535a0541f403daa599c17c748602");
            return;
        }
        this.mLastMotionY = 0.0f;
        init();
    }

    @Override // com.dianping.shield.component.widgets.container.ContainerBaseMode
    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95b921a8d0284b0c84841480903074df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95b921a8d0284b0c84841480903074df");
            return;
        }
        getCommonPageContainer().addOnInterceptTouchListener(new OnInterceptTouchListener() { // from class: com.dianping.shield.component.widgets.container.ContainerPullToZoomMode.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.component.interfaces.OnInterceptTouchListener
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cca62228681b65d66ee41f30a4d4bff6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cca62228681b65d66ee41f30a4d4bff6")).booleanValue();
                }
                if (motionEvent.getAction() == 0) {
                    if (ContainerPullToZoomMode.this.valueAnimator != null && ContainerPullToZoomMode.this.valueAnimator.isRunning()) {
                        ContainerPullToZoomMode.this.valueAnimator.cancel();
                    }
                    ContainerPullToZoomMode.this.mLastMotionY = motionEvent.getY();
                }
                return false;
            }
        });
        getCommonPageContainer().addOnTouchListener(new View.OnTouchListener() { // from class: com.dianping.shield.component.widgets.container.ContainerPullToZoomMode.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "21a91998142bd0cddbdc442e0f47db2d", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "21a91998142bd0cddbdc442e0f47db2d")).booleanValue();
                }
                if (ContainerPullToZoomMode.this.zoomView != null && (ContainerPullToZoomMode.this.getCommonPageContainer().mLinearLayoutManager instanceof ShieldLayoutManagerInterface)) {
                    switch (motionEvent.getAction()) {
                        case 2:
                            float y = motionEvent.getY();
                            float f = y - ContainerPullToZoomMode.this.mLastMotionY;
                            int top = ContainerPullToZoomMode.this.zoomView.getTop();
                            int height = ContainerPullToZoomMode.this.zoomView.getHeight();
                            int findFirstVisibleItemPosition = ((ShieldLayoutManagerInterface) ContainerPullToZoomMode.this.getCommonPageContainer().mLinearLayoutManager).findFirstVisibleItemPosition(false);
                            if (top != 0 || (height <= ContainerPullToZoomMode.this.zoomViewOrgHeight && (height != ContainerPullToZoomMode.this.zoomViewOrgHeight || f <= 0.0f || (findFirstVisibleItemPosition != 0 && findFirstVisibleItemPosition != 1)))) {
                                ContainerPullToZoomMode.this.mLastMotionY = y;
                                return false;
                            }
                            ViewGroup.LayoutParams layoutParams = ContainerPullToZoomMode.this.zoomView.getLayoutParams();
                            layoutParams.height = (int) (layoutParams.height + (f * ContainerPullToZoomMode.ZOOM_NUM));
                            if (layoutParams.height < ContainerPullToZoomMode.this.zoomViewOrgHeight) {
                                layoutParams.height = ContainerPullToZoomMode.this.zoomViewOrgHeight;
                            }
                            ContainerPullToZoomMode.this.zoomView.setLayoutParams(layoutParams);
                            ContainerPullToZoomMode.this.mLastMotionY = y;
                            return true;
                        case 1:
                            ContainerPullToZoomMode.this.mLastMotionY = 0.0f;
                            ContainerPullToZoomMode.this.endScaling();
                            break;
                    }
                    return false;
                }
                return false;
            }
        });
    }

    public void setZoomView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ee352f2e91fef005e72d46ad9b064a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ee352f2e91fef005e72d46ad9b064a6");
            return;
        }
        this.zoomView = view;
        getCommonPageContainer().setDescendantFocusability(393216);
        this.zoomView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.dianping.shield.component.widgets.container.ContainerPullToZoomMode.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "83e8d8c4a8343db1c3dbfce945e8498b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "83e8d8c4a8343db1c3dbfce945e8498b");
                    return;
                }
                ContainerPullToZoomMode.this.zoomView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                ContainerPullToZoomMode.this.zoomViewOrgHeight = ContainerPullToZoomMode.this.zoomView.getHeight();
            }
        });
    }

    public void endScaling() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "627181a99ac149787e4cc339162fc8eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "627181a99ac149787e4cc339162fc8eb");
            return;
        }
        this.valueAnimator = ValueAnimator.ofInt(this.zoomView.getHeight(), this.zoomViewOrgHeight);
        this.valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        this.valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.dianping.shield.component.widgets.container.ContainerPullToZoomMode.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "66f815fa2eb281c82999df49ea0e562d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "66f815fa2eb281c82999df49ea0e562d");
                    return;
                }
                ContainerPullToZoomMode.this.zoomView.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ContainerPullToZoomMode.this.zoomView.requestLayout();
            }
        });
        this.valueAnimator.setDuration(250L);
        this.valueAnimator.start();
    }
}
