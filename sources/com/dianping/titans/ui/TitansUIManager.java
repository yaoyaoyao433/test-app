package com.dianping.titans.ui;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.view.View;
import com.dianping.titans.widget.BaseTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TitansUIManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mBackIconId;
    private int mBackgroudColor;
    private Drawable mBackgroundDrawable;
    private int mCloseIconId;
    private int mCustomBackIconId;
    private BaseTitleBar mDefaultTitleBar;
    private int mMaskLayoutResId;
    private int mProgressDrawableResId;
    private int mPullBackgroundColor;
    private int mPullTextColor;
    private ReceivedErrorListener mReceivedErrorListener;
    private int mSearchBarIconId;
    private int mSearchIconId;
    private int mShareIconId;
    private int mTitleBackgroudColor;
    private int mTitleHeight;
    private int mTitlePaddingBottom;
    private int mTitlePaddingLeft;
    private int mTitlePaddingRight;
    private int mTitlePaddingTop;
    private int mTitleShadowImgResId;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface ReceivedErrorListener {
        void onReceivedError(View view, int i, String str, String str2);
    }

    public TitansUIManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "949242ce95856c8166a9f2960dc1c7f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "949242ce95856c8166a9f2960dc1c7f4");
            return;
        }
        this.mBackIconId = R.drawable.knb_web_back;
        this.mShareIconId = R.drawable.knb_web_share;
        this.mSearchIconId = R.drawable.knb_web_search;
        this.mCustomBackIconId = R.drawable.knb_web_back_text;
        this.mCloseIconId = R.drawable.knb_web_close;
        this.mProgressDrawableResId = R.drawable.knb_webview_progress_bg;
        this.mMaskLayoutResId = R.layout.knb_error_item;
        this.mReceivedErrorListener = null;
        this.mSearchBarIconId = R.drawable.search_box_icon;
        this.mPullTextColor = Color.parseColor("#999999");
        this.mPullBackgroundColor = Color.parseColor("#f0f0f0");
        this.mTitleHeight = -1;
        this.mTitlePaddingLeft = -1;
        this.mTitlePaddingTop = -1;
        this.mTitlePaddingRight = -1;
        this.mTitlePaddingBottom = -1;
        this.mBackgroudColor = -1;
        this.mTitleBackgroudColor = -1;
        this.mTitleShadowImgResId = R.drawable.knb_title_shadow;
    }

    public void setBackIconId(int i) {
        this.mBackIconId = i;
    }

    public void setShareIconId(int i) {
        this.mShareIconId = i;
    }

    public void setSearchIconId(int i) {
        this.mSearchIconId = i;
    }

    public void setCustomBackIconId(int i) {
        this.mCustomBackIconId = i;
    }

    public void setCloseIconId(int i) {
        this.mCloseIconId = i;
    }

    public void setProgressDrawableResId(int i) {
        this.mProgressDrawableResId = i;
    }

    public void setMaskLayoutResId(int i) {
        this.mMaskLayoutResId = i;
    }

    public void setMaskLayoutResId(int i, ReceivedErrorListener receivedErrorListener) {
        this.mMaskLayoutResId = i;
        this.mReceivedErrorListener = receivedErrorListener;
    }

    public void setPullTextColor(int i) {
        this.mPullTextColor = i;
    }

    public void setPullBackgroundColor(int i) {
        this.mPullBackgroundColor = i;
    }

    public int getBackIconId() {
        return this.mBackIconId;
    }

    public int getShareIconId() {
        return this.mShareIconId;
    }

    public int getSearchIconId() {
        return this.mSearchIconId;
    }

    public int getCustomBackIconId() {
        return this.mCustomBackIconId;
    }

    public int getCloseIconId() {
        return this.mCloseIconId;
    }

    public int getProgressDrawableResId() {
        return this.mProgressDrawableResId;
    }

    public int getMaskLayoutResId() {
        return this.mMaskLayoutResId;
    }

    public ReceivedErrorListener getReceivedErrorListener() {
        return this.mReceivedErrorListener;
    }

    public int getPullBackgroundColor() {
        return this.mPullBackgroundColor;
    }

    public int getPullTextColor() {
        return this.mPullTextColor;
    }

    public int getSearchBarIconId() {
        return this.mSearchBarIconId;
    }

    public void setSearchBarIconId(int i) {
        this.mSearchBarIconId = i;
    }

    public void setTitleHeight(int i) {
        this.mTitleHeight = i;
    }

    public int getTitleHeight() {
        return this.mTitleHeight;
    }

    public void setTitlePadding(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "165c77333aa9e839f55c011cbe77c77a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "165c77333aa9e839f55c011cbe77c77a");
            return;
        }
        this.mTitlePaddingLeft = i;
        this.mTitlePaddingTop = i2;
        this.mTitlePaddingRight = i3;
        this.mTitlePaddingBottom = i4;
    }

    public int getTitlePaddingLeft() {
        return this.mTitlePaddingLeft;
    }

    public int getTitlePaddingTop() {
        return this.mTitlePaddingTop;
    }

    public int getTitlePaddingRight() {
        return this.mTitlePaddingRight;
    }

    public int getTitlePaddingBottom() {
        return this.mTitlePaddingBottom;
    }

    public Drawable getBackgroundDrawable() {
        return this.mBackgroundDrawable;
    }

    public void setBackgoundDrawable(Drawable drawable) {
        this.mBackgroundDrawable = drawable;
    }

    public int getBackgroudColor() {
        return this.mBackgroudColor;
    }

    public void setBackgroudColor(int i) {
        this.mBackgroudColor = i;
    }

    public void setDefaultTitleBar(BaseTitleBar baseTitleBar) {
        this.mDefaultTitleBar = baseTitleBar;
    }

    public BaseTitleBar getDefaultTitleBar() {
        return this.mDefaultTitleBar;
    }

    public int getTitleBackgroudColor() {
        return this.mTitleBackgroudColor;
    }

    public void setTitleBackgroudColor(int i) {
        this.mTitleBackgroudColor = i;
    }

    public void setTitleShadowResId(int i) {
        this.mTitleShadowImgResId = i;
    }

    public int getTitleShadowResId() {
        return this.mTitleShadowImgResId;
    }
}
