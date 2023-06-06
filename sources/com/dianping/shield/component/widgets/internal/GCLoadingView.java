package com.dianping.shield.component.widgets.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.dianping.shield.component.utils.AnimationsContainer;
import com.dianping.shield.preload.ShieldPreloadInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class GCLoadingView extends LinearLayout implements ShieldPreloadInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private AnimationsContainer animationsContainer;
    public OnRefreshCompleteListener refreshCompleteListener;
    private AnimationsContainer.FramesSequenceAnimation sequenceAnimation;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnFrameAnimationListener {
        void onEnd();

        void onStart();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnRefreshCompleteListener {
        void onRefreshComplete();
    }

    public abstract void onPullY(float f);

    public abstract void pullToRefresh();

    public void refreshComplete(boolean z) {
    }

    public abstract void refreshing();

    public abstract void releaseToRefresh();

    public abstract void reset();

    public abstract void setFrameImageBackground(Drawable drawable);

    public abstract void setFrameImageVisibility(int i);

    public void setHeaderTextVisibility(int i) {
    }

    public void setLoadingDrawable(Drawable drawable) {
    }

    public void setLoadingVisibility(int i) {
    }

    public void setPullImageDrawable(Drawable drawable) {
    }

    public void setPullImageVisibility(int i) {
    }

    public void setPullLabel(String str) {
    }

    public void setRefreshingLabel(String str) {
    }

    public void setReleaseLabel(String str) {
    }

    public void setSubHeaderText(CharSequence charSequence) {
    }

    public void setSubTextColor(int i) {
    }

    public void setSubTextColor(ColorStateList colorStateList) {
    }

    public void setTextColor(int i) {
    }

    public void setTextColor(ColorStateList colorStateList) {
    }

    public void shieldPreload() {
    }

    public GCLoadingView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b47ad47cf2b3b34a123b9a00f79a884", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b47ad47cf2b3b34a123b9a00f79a884");
        }
    }

    public GCLoadingView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c4609ab01daea85041a8de4186323d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c4609ab01daea85041a8de4186323d1");
        }
    }

    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4085ec5d271fc66439225728fa458dcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4085ec5d271fc66439225728fa458dcd");
            return;
        }
        releaseAnim();
        this.refreshCompleteListener = null;
        this.animationsContainer = null;
    }

    public void loadAnimation(ImageView imageView, int i, final OnFrameAnimationListener onFrameAnimationListener) {
        Object[] objArr = {imageView, Integer.valueOf(i), onFrameAnimationListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa71d728c2e9d8bc5d9ca9c7466927ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa71d728c2e9d8bc5d9ca9c7466927ce");
            return;
        }
        if (this.animationsContainer == null) {
            this.animationsContainer = new AnimationsContainer(getContext(), i, 58);
            this.animationsContainer.isRecycle(false);
        }
        this.sequenceAnimation = this.animationsContainer.createProgressDialogAnim(imageView);
        this.sequenceAnimation.setOnAnimStopListener(new AnimationsContainer.OnAnimationStoppedListener() { // from class: com.dianping.shield.component.widgets.internal.GCLoadingView.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.component.utils.AnimationsContainer.OnAnimationStoppedListener
            public void AnimationStopped() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5c618d8a487c59ad4782df1f37621931", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5c618d8a487c59ad4782df1f37621931");
                } else if (onFrameAnimationListener != null) {
                    onFrameAnimationListener.onEnd();
                }
            }
        });
        this.sequenceAnimation.start();
    }

    public void releaseAnim() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc2ef797369b70f2e0f13bc90c803dec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc2ef797369b70f2e0f13bc90c803dec");
        } else if (this.sequenceAnimation != null) {
            this.sequenceAnimation.stop();
        }
    }

    public void setRefreshCompleteListener(OnRefreshCompleteListener onRefreshCompleteListener) {
        this.refreshCompleteListener = onRefreshCompleteListener;
    }

    public OnRefreshCompleteListener getRefreshCompleteListener() {
        return this.refreshCompleteListener;
    }
}
