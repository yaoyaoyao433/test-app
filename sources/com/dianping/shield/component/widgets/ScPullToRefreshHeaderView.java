package com.dianping.shield.component.widgets;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.component.utils.PageContainerThemeManager;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.component.utils.ViewUtils;
import com.dianping.shield.component.widgets.ScBaseRefreshHeaderView;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ScPullToRefreshHeaderView extends ScBaseRefreshHeaderView {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isBitmapRotate;
    private FrameLayout mRootView;
    private PageContainerThemePackage pageContainerThemePackage;
    private ImageView refreshImage;
    private View refreshViewContainer;
    private ObjectAnimator rotateAnim;

    public ScPullToRefreshHeaderView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8c0fc0ba680bc91970a5f60180e7a95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8c0fc0ba680bc91970a5f60180e7a95");
        } else {
            this.isBitmapRotate = false;
        }
    }

    public ScPullToRefreshHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cacaee9caf93e44dc82a5bbaefceb9aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cacaee9caf93e44dc82a5bbaefceb9aa");
        } else {
            this.isBitmapRotate = false;
        }
    }

    @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView
    public void initView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57657aa2e50ca5b3770e55d0967fad21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57657aa2e50ca5b3770e55d0967fad21");
            return;
        }
        this.pageContainerThemePackage = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().createTheme();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
        this.mRootView = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.shieldc_pull_to_refresh_header_refreshview, (ViewGroup) this, false);
        addView(this.mRootView, layoutParams);
        this.refreshViewContainer = this.mRootView.findViewById(R.id.refresh_view_container);
        this.refreshImage = (ImageView) this.mRootView.findViewById(R.id.refresh_header_image);
        this.rotateAnim = ObjectAnimator.ofFloat(this.refreshImage, RecceAnimUtils.ROTATION, 0.0f, 360.0f);
        this.rotateAnim.setDuration(600L);
        this.rotateAnim.setInterpolator(new LinearInterpolator());
        this.rotateAnim.setRepeatCount(-1);
        this.rotateAnim.setRepeatMode(1);
        updateViewsByThemePackage(this.pageContainerThemePackage);
    }

    private void updateViewsByThemePackage(@NonNull PageContainerThemePackage pageContainerThemePackage) {
        Object[] objArr = {pageContainerThemePackage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "284429f1dc96bd68e0d5e781271a42f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "284429f1dc96bd68e0d5e781271a42f4");
            return;
        }
        Drawable drawable = getResources().getDrawable(pageContainerThemePackage.getLoadingDefaultResId());
        if (drawable != null) {
            this.refreshImage.setImageDrawable(drawable);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.refreshImage.getLayoutParams();
        layoutParams.height = aq.a(getContext(), pageContainerThemePackage.getHeaderSize());
        layoutParams.width = aq.a(getContext(), pageContainerThemePackage.getHeaderSize());
        this.refreshImage.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.refreshViewContainer.getLayoutParams();
        layoutParams2.height = aq.a(getContext(), pageContainerThemePackage.getRefreshHeight());
        this.refreshViewContainer.setLayoutParams(layoutParams2);
    }

    public void setThemePackage(@NonNull PageContainerThemePackage pageContainerThemePackage) {
        Object[] objArr = {pageContainerThemePackage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddcb5543e38f124a92014bd83c7ad71f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddcb5543e38f124a92014bd83c7ad71f");
        } else if (pageContainerThemePackage != this.pageContainerThemePackage) {
            this.pageContainerThemePackage = pageContainerThemePackage;
            if (this.rotateAnim != null && this.rotateAnim.isRunning()) {
                this.rotateAnim.cancel();
            }
            this.refreshImage.setImageResource(this.pageContainerThemePackage.getLoadingDefaultResId());
            this.refreshImage.clearAnimation();
            resetLoadingStatus();
            updateViewsByThemePackage(this.pageContainerThemePackage);
        }
    }

    @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView
    public void onPullY(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11fbb6170949ad70b0133a00ac731886", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11fbb6170949ad70b0133a00ac731886");
            return;
        }
        if (!this.isLoading) {
            if (this.rotateAnim != null && this.rotateAnim.isRunning()) {
                this.rotateAnim.end();
                this.refreshImage.clearAnimation();
                this.isBitmapRotate = false;
            }
            if (this.pageContainerThemePackage.getDropDownArray() != null) {
                int floor = (int) Math.floor(Math.min(1.0f, i / getRefreshHeight()) * this.pageContainerThemePackage.getDropDownArray().length);
                if (floor < this.pageContainerThemePackage.getDropDownArray().length) {
                    this.refreshImage.setImageBitmap(ViewUtils.readBitMap(getContext(), this.pageContainerThemePackage.getDropDownArray()[floor]));
                    this.isBitmapRotate = true;
                } else if (this.isBitmapRotate) {
                    this.refreshImage.setImageBitmap(ViewUtils.readBitMap(getContext(), this.pageContainerThemePackage.getDropDownArray()[this.pageContainerThemePackage.getDropDownArray().length - 1]));
                }
            }
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mRootView.getLayoutParams();
        layoutParams.height = i;
        this.mRootView.setLayoutParams(layoutParams);
    }

    @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView
    public void setLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b238ce6169ec79b8fa0bfab9cf83a2fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b238ce6169ec79b8fa0bfab9cf83a2fc");
        } else if (isLoading()) {
        } else {
            this.isLoading = true;
            if (this.refreshImage != null) {
                this.refreshImage.clearAnimation();
                if (this.pageContainerThemePackage.getLoadingHeaderAnimId() != 0) {
                    this.refreshImage.setImageDrawable(getContext().getResources().getDrawable(this.pageContainerThemePackage.getLoadingHeaderAnimId()));
                    ((AnimationDrawable) this.refreshImage.getDrawable()).start();
                    return;
                }
                this.refreshImage.setImageResource(R.drawable.shieldc_loading);
                if (this.rotateAnim != null) {
                    this.rotateAnim.start();
                }
            }
        }
    }

    @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView
    public void onRefreshComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30151715b5ce0c83461c3b8b83ab6217", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30151715b5ce0c83461c3b8b83ab6217");
            return;
        }
        if (this.onRefreshCompleteListener != null) {
            this.onRefreshCompleteListener.onRefreshComplete();
        }
        resetRefreshHeaderView();
    }

    @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView
    public void setSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8173488175da46d8480c3da5cd4320dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8173488175da46d8480c3da5cd4320dc");
        } else if (this.pageContainerThemePackage.getLoadingSuccessResId() != 0) {
            if (this.rotateAnim != null && this.rotateAnim.isRunning()) {
                this.rotateAnim.end();
                this.refreshImage.clearAnimation();
            }
            loadAnimation(this.refreshImage, this.pageContainerThemePackage.getLoadingSuccessResId(), new ScBaseRefreshHeaderView.OnFrameAnimationListener() { // from class: com.dianping.shield.component.widgets.ScPullToRefreshHeaderView.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView.OnFrameAnimationListener
                public void onStart() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eba602398cb50bf5bf7785cb0875139d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eba602398cb50bf5bf7785cb0875139d");
                    }
                }

                @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView.OnFrameAnimationListener
                public void onEnd() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9d271dab3a7b79574b5553ca9205390d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9d271dab3a7b79574b5553ca9205390d");
                        return;
                    }
                    if (ScPullToRefreshHeaderView.this.onRefreshCompleteListener != null) {
                        ScPullToRefreshHeaderView.this.onRefreshCompleteListener.onRefreshComplete();
                    }
                    ScPullToRefreshHeaderView.this.resetRefreshHeaderView();
                }
            });
        } else {
            if (this.onRefreshCompleteListener != null) {
                this.onRefreshCompleteListener.onRefreshComplete();
            }
            resetRefreshHeaderView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetRefreshHeaderView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5112007b450df926bfa7204ac797cc88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5112007b450df926bfa7204ac797cc88");
            return;
        }
        this.refreshImage.setImageResource(this.pageContainerThemePackage.getLoadingDefaultResId());
        if (this.rotateAnim != null) {
            this.rotateAnim.cancel();
            this.rotateAnim.reverse();
        }
        super.releaseAnim();
    }

    @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView
    public void removeHeaderView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "859853509b4d1aa2b0dc762274714803", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "859853509b4d1aa2b0dc762274714803");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mRootView.getLayoutParams();
        layoutParams.height = 0;
        this.mRootView.setLayoutParams(layoutParams);
    }

    @Override // com.dianping.shield.component.widgets.ScBaseRefreshHeaderView
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "462b3d5c017cb2710ad3a2c653a5d452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "462b3d5c017cb2710ad3a2c653a5d452");
            return;
        }
        super.releaseAnim();
        if (this.rotateAnim != null) {
            this.rotateAnim.cancel();
        }
    }
}
