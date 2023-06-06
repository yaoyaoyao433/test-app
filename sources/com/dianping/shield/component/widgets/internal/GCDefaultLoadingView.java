package com.dianping.shield.component.widgets.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.component.utils.PageContainerThemeManager;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.component.widgets.internal.GCLoadingView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GCDefaultLoadingView extends GCLoadingView {
    private static final int STATE_COMPLETE = 3;
    private static final int STATE_NORMAL = 0;
    private static final int STATE_READY = 1;
    private static final int STATE_REFRESHING = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private LinearLayout headerTextLayout;
    private boolean isRefreshSuccess;
    private ImageView mBackgroundImage;
    private LinearLayout mContainer;
    private ImageView mHeaderImage;
    private int mHeaderViewHeight;
    private TextView mHintTextView;
    private int mState;
    public PageContainerThemePackage pageContainerThemePackage;

    @Override // com.dianping.shield.component.widgets.internal.GCLoadingView
    public void pullToRefresh() {
    }

    @Override // com.dianping.shield.component.widgets.internal.GCLoadingView
    public void releaseToRefresh() {
    }

    @Override // com.dianping.shield.component.widgets.internal.GCLoadingView
    public void setFrameImageVisibility(int i) {
    }

    public GCDefaultLoadingView(@NotNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b53cbc996d30e23c516ce1026a82fb13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b53cbc996d30e23c516ce1026a82fb13");
            return;
        }
        this.mState = 0;
        this.mContainer = null;
        this.mHeaderImage = null;
        this.mHintTextView = null;
        this.mBackgroundImage = null;
        this.mHeaderViewHeight = aq.a(getContext(), 80.0f);
        this.headerTextLayout = null;
        this.pageContainerThemePackage = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().createTheme();
        init();
    }

    public GCDefaultLoadingView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1f5fd6cd5d6f840a34ffaccda913b3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1f5fd6cd5d6f840a34ffaccda913b3b");
            return;
        }
        this.mState = 0;
        this.mContainer = null;
        this.mHeaderImage = null;
        this.mHintTextView = null;
        this.mBackgroundImage = null;
        this.mHeaderViewHeight = aq.a(getContext(), 80.0f);
        this.headerTextLayout = null;
        this.pageContainerThemePackage = PageContainerThemeManager.INSTANCE.getPageContainerThemeCreator().createTheme();
        init();
    }

    private void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a05a1ccdee2d5ee7f2b70d304cd2653e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a05a1ccdee2d5ee7f2b70d304cd2653e");
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.mContainer = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.vy_listview_header_dper, (ViewGroup) this, false);
        addView(this.mContainer, layoutParams);
        this.mBackgroundImage = (ImageView) findViewById(R.id.listview_header_background);
        this.mHeaderImage = (ImageView) findViewById(R.id.listview_header_image);
        this.mHintTextView = (TextView) findViewById(R.id.listview_header_hint_textview);
        this.headerTextLayout = (LinearLayout) findViewById(R.id.listview_header_text);
        this.mHeaderImage.setImageDrawable(getResources().getDrawable(getDefaultDrawableResId()));
        if (this.pageContainerThemePackage.getDropDownArray() != null) {
            this.headerTextLayout.setVisibility(8);
        } else {
            this.headerTextLayout.setVisibility(0);
        }
    }

    private void setState(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2abd0ca670cbd471808f862b26c0e25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2abd0ca670cbd471808f862b26c0e25");
        } else if (i == this.mState) {
        } else {
            switch (i) {
                case 0:
                    this.mHintTextView.setText(R.string.shield_component_listview_header_hint_normal);
                    break;
                case 1:
                    this.mHintTextView.setText(R.string.shield_component_listview_header_hint_ready);
                    break;
                case 2:
                    this.mHintTextView.setText(R.string.shield_component_listview_header_hint_loading);
                    this.mHeaderImage.clearAnimation();
                    this.mHeaderImage.setImageResource(this.pageContainerThemePackage.getLoadingResId());
                    Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), this.pageContainerThemePackage.getLoadingAnimId());
                    loadAnimation.setInterpolator(new LinearInterpolator());
                    this.mHeaderImage.startAnimation(loadAnimation);
                    break;
                case 3:
                    this.mHeaderImage.clearAnimation();
                    if (this.mState == 2) {
                        if (this.isRefreshSuccess && this.pageContainerThemePackage.getLoadingSuccessResId() != 0) {
                            loadAnimation(this.mHeaderImage, this.pageContainerThemePackage.getLoadingSuccessResId(), new GCLoadingView.OnFrameAnimationListener() { // from class: com.dianping.shield.component.widgets.internal.GCDefaultLoadingView.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // com.dianping.shield.component.widgets.internal.GCLoadingView.OnFrameAnimationListener
                                public void onStart() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "db4c79b9801b3c81d932be43313d8196", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "db4c79b9801b3c81d932be43313d8196");
                                    }
                                }

                                @Override // com.dianping.shield.component.widgets.internal.GCLoadingView.OnFrameAnimationListener
                                public void onEnd() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4fa8298f193c01cf0bddd0f5219949ba", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4fa8298f193c01cf0bddd0f5219949ba");
                                        return;
                                    }
                                    if (GCDefaultLoadingView.this.refreshCompleteListener != null) {
                                        GCDefaultLoadingView.this.refreshCompleteListener.onRefreshComplete();
                                    }
                                    GCDefaultLoadingView.this.reset();
                                }
                            });
                            break;
                        } else {
                            if (this.refreshCompleteListener != null) {
                                this.refreshCompleteListener.onRefreshComplete();
                            }
                            reset();
                            break;
                        }
                    }
                    break;
            }
            this.mState = i;
        }
    }

    public int getDefaultDrawableResId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94863a6b2e57d6f2993c77909916d8e5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94863a6b2e57d6f2993c77909916d8e5")).intValue() : this.pageContainerThemePackage.getLoadingDefaultResId();
    }

    @Override // com.dianping.shield.component.widgets.internal.GCLoadingView
    public void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ea21d50cdbdeb27b9b4d5a6a90457a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ea21d50cdbdeb27b9b4d5a6a90457a3");
            return;
        }
        this.mHeaderImage.setImageResource(getDefaultDrawableResId());
        this.mHeaderImage.clearAnimation();
        setState(0);
        super.releaseAnim();
    }

    @Override // com.dianping.shield.component.widgets.internal.GCLoadingView
    public void refreshComplete(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07fd937a008962ebdd7c7677da2e9aa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07fd937a008962ebdd7c7677da2e9aa1");
            return;
        }
        super.refreshComplete(z);
        this.isRefreshSuccess = z;
        setState(3);
    }

    @Override // com.dianping.shield.component.widgets.internal.GCLoadingView
    public void setLoadingDrawable(@NotNull Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eda951853094126bb6485e68f91dbcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eda951853094126bb6485e68f91dbcf");
            return;
        }
        super.setLoadingDrawable(drawable);
        this.mBackgroundImage.setBackgroundDrawable(drawable);
    }

    @Override // com.dianping.shield.component.widgets.internal.GCLoadingView
    public void refreshing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8aeb56d968c7cb38f6baeeb3c793997", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8aeb56d968c7cb38f6baeeb3c793997");
        } else {
            setState(2);
        }
    }

    @Override // com.dianping.shield.component.widgets.internal.GCLoadingView
    public void onPullY(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1df1d448579def843f0b950cd27f66ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1df1d448579def843f0b950cd27f66ec");
            return;
        }
        float f2 = f * this.mHeaderViewHeight;
        if (this.mState == 2 || this.pageContainerThemePackage.getDropDownArray() == null) {
            return;
        }
        if (f2 > this.mHeaderViewHeight) {
            setState(1);
            this.mHeaderImage.setImageResource(this.pageContainerThemePackage.getDropDownArray()[this.pageContainerThemePackage.getDropDownArray().length - 1]);
            return;
        }
        setState(0);
        int floor = (int) Math.floor(Math.min(1.0f, f2 / this.mHeaderViewHeight) * this.pageContainerThemePackage.getDropDownArray().length);
        if (floor < this.pageContainerThemePackage.getDropDownArray().length) {
            this.mHeaderImage.setImageResource(this.pageContainerThemePackage.getDropDownArray()[floor]);
        } else {
            this.mHeaderImage.setImageResource(this.pageContainerThemePackage.getDropDownArray()[this.pageContainerThemePackage.getDropDownArray().length - 1]);
        }
    }

    @Override // com.dianping.shield.component.widgets.internal.GCLoadingView
    public void setFrameImageBackground(@NotNull Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f6cc6c7cd28aa87456fea8f97fb7453", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f6cc6c7cd28aa87456fea8f97fb7453");
        } else {
            this.mHeaderImage.setImageDrawable(drawable);
        }
    }

    @Override // com.dianping.shield.component.widgets.internal.GCLoadingView, com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldPreload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd88f708f22a575171c3f89740f509f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd88f708f22a575171c3f89740f509f9");
        } else {
            super.shieldPreload();
        }
    }

    @Override // com.dianping.shield.component.widgets.internal.GCLoadingView, com.dianping.shield.preload.ShieldPreloadInterface
    public void shieldRecycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6748d50e6f1966c557611c4b2f43233b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6748d50e6f1966c557611c4b2f43233b");
            return;
        }
        super.shieldRecycle();
        this.mHeaderImage.setImageResource(getDefaultDrawableResId());
        this.mHeaderImage.clearAnimation();
        setState(0);
        this.isRefreshSuccess = false;
    }
}
