package com.dianping.shield.component.widgets;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.dianping.shield.component.utils.AnimationsContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class ScBaseRefreshHeaderView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    private AnimationsContainer animationsContainer;
    protected boolean isLoading;
    protected OnRefreshCompleteListener onRefreshCompleteListener;
    private int refreshHeight;
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

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnRefreshListener {
        void onRefresh(ViewGroup viewGroup);
    }

    public abstract void initView(Context context);

    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d439f4afc23ffcf6600aa72e2434f629", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d439f4afc23ffcf6600aa72e2434f629");
        }
    }

    public abstract void onPullY(int i);

    public void onRefreshComplete() {
    }

    public void removeHeaderView() {
    }

    public abstract void setLoading();

    public void setSuccess() {
    }

    public ScBaseRefreshHeaderView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "343a76dc612208aea8398af526c2dba8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "343a76dc612208aea8398af526c2dba8");
        }
    }

    public ScBaseRefreshHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04fd67c3a7db9f3d8346a50cb2e58ec9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04fd67c3a7db9f3d8346a50cb2e58ec9");
        } else {
            initView(context);
        }
    }

    public boolean isLoading() {
        return this.isLoading;
    }

    public void setOnRefreshCompleteListener(OnRefreshCompleteListener onRefreshCompleteListener) {
        this.onRefreshCompleteListener = onRefreshCompleteListener;
    }

    public void resetLoadingStatus() {
        this.isLoading = false;
    }

    public int getRefreshHeight() {
        return this.refreshHeight;
    }

    public void setRefreshHeight(int i) {
        this.refreshHeight = i;
    }

    public void loadAnimation(ImageView imageView, int i, final OnFrameAnimationListener onFrameAnimationListener) {
        Object[] objArr = {imageView, Integer.valueOf(i), onFrameAnimationListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1e31f67a32cc5df741dd503e52d7ea1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1e31f67a32cc5df741dd503e52d7ea1");
            return;
        }
        if (this.animationsContainer == null) {
            this.animationsContainer = new AnimationsContainer(getContext(), i, 58);
            this.animationsContainer.isRecycle(false);
        }
        if (this.sequenceAnimation == null) {
            this.sequenceAnimation = this.animationsContainer.createProgressDialogAnim(imageView);
            this.sequenceAnimation.setOnAnimStopListener(new AnimationsContainer.OnAnimationStoppedListener() { // from class: com.dianping.shield.component.widgets.ScBaseRefreshHeaderView.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.component.utils.AnimationsContainer.OnAnimationStoppedListener
                public void AnimationStopped() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b3278599529e18d3161e95e4656dc4c7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b3278599529e18d3161e95e4656dc4c7");
                    } else if (onFrameAnimationListener != null) {
                        onFrameAnimationListener.onEnd();
                    }
                }
            });
        }
        this.sequenceAnimation.start();
    }

    public void releaseAnim() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1c2a6651e790a3a5ef8fdfaa7361da7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1c2a6651e790a3a5ef8fdfaa7361da7");
        } else if (this.sequenceAnimation != null) {
            this.sequenceAnimation.stop();
        }
    }
}
