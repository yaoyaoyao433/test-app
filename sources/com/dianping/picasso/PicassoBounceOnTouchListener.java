package com.dianping.picasso;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class PicassoBounceOnTouchListener implements View.OnTouchListener {
    public static final String ALL_BOUNCE = "all";
    private static final float DAMPING = 0.5f;
    public static final String FOOT_BOUNCE = "foot";
    public static final String HEAD_BOUNCE = "head";
    public static final String NO_BOUNCE = "none";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String bounce;
    @NonNull
    private View bounceView;
    private float lastY;
    private int margin;

    public abstract View findFirstVisibleView();

    public abstract View findLastVisibleView();

    public PicassoBounceOnTouchListener(@NonNull View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f088d416932f33dba96ab2f735779768", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f088d416932f33dba96ab2f735779768");
            return;
        }
        this.lastY = -1.0f;
        this.bounceView = view;
        this.bounce = str;
    }

    private Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a6cdf5359d6c7a143b357feace2343d", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a6cdf5359d6c7a143b357feace2343d") : this.bounceView.getContext();
    }

    private void bounce(final boolean z, final View view) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "effa68e36b3ee313fce059b0e00e0dc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "effa68e36b3ee313fce059b0e00e0dc9");
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(Math.abs(this.margin), 0);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.dianping.picasso.PicassoBounceOnTouchListener.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fb7c54aba4e8a222c94c685e6c9afd75", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fb7c54aba4e8a222c94c685e6c9afd75");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                if (z) {
                    marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                } else {
                    marginLayoutParams.bottomMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                }
                view.setLayoutParams(marginLayoutParams);
            }
        });
        ofInt.start();
    }

    private void overScroll(boolean z, float f, View view) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f), view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f617e7cae1551dac28ac149eca8a7662", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f617e7cae1551dac28ac149eca8a7662");
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (z) {
            this.margin = (int) ((((PicassoUtils.getScreenHeightPixels(getContext()) - iArr[1]) * f) * 0.5f) / PicassoUtils.getScreenHeightPixels(getContext()));
        } else {
            this.margin = (int) ((((-f) * iArr[1]) * 0.5f) / PicassoUtils.getScreenHeightPixels(getContext()));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int screenHeightPixels = PicassoUtils.getScreenHeightPixels(getContext());
        if (this.margin >= screenHeightPixels) {
            this.margin = screenHeightPixels;
        }
        if (z) {
            marginLayoutParams.topMargin = this.margin;
        } else {
            marginLayoutParams.bottomMargin = this.margin;
        }
    }

    private boolean canBounceHead() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a19c614b48f2c1608b11c36c8675ba8f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a19c614b48f2c1608b11c36c8675ba8f")).booleanValue() : HEAD_BOUNCE.equals(this.bounce) || "all".equals(this.bounce);
    }

    private boolean canBounceFoot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba1de517b231c6335948c12a2b58c57a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba1de517b231c6335948c12a2b58c57a")).booleanValue() : FOOT_BOUNCE.equals(this.bounce) || "all".equals(this.bounce);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a5806acaae40c932f94055bd45ea5de", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a5806acaae40c932f94055bd45ea5de")).booleanValue();
        }
        if (TextUtils.isEmpty(this.bounce) || "none".equals(this.bounce)) {
            return false;
        }
        if (this.lastY == -1.0f) {
            this.lastY = motionEvent.getRawY();
        }
        View findFirstVisibleView = findFirstVisibleView();
        View findLastVisibleView = findLastVisibleView();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.lastY = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = motionEvent.getRawY() - this.lastY;
            if (findLastVisibleView != null && findLastVisibleView.getBottom() <= this.bounceView.getHeight() && rawY < 0.0f && canBounceFoot()) {
                overScroll(false, rawY, findLastVisibleView);
            } else if (findFirstVisibleView != null && findFirstVisibleView.getTop() >= 0 && rawY > 0.0f && canBounceHead()) {
                overScroll(true, rawY, findFirstVisibleView);
            }
        } else {
            this.lastY = -1.0f;
            if (findLastVisibleView != null && findLastVisibleView.getBottom() < this.bounceView.getHeight() && canBounceFoot()) {
                bounce(false, findLastVisibleView);
            } else if (findFirstVisibleView != null && findFirstVisibleView.getTop() > 0 && canBounceHead()) {
                bounce(true, findFirstVisibleView);
            }
        }
        return false;
    }
}
