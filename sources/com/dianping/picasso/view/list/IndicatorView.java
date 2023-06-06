package com.dianping.picasso.view.list;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class IndicatorView extends FrameLayout {
    private static final int MAX_PROGRESS = 1000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mAnimating;
    private Integer mColor;
    private boolean mIndeterminate;
    private double mProgress;
    private ProgressBar mProgressBar;

    public static int getStyle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "561b5b9eb60d081408a11032d45abd9f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "561b5b9eb60d081408a11032d45abd9f")).intValue() : (i != 0 && i == 1) ? 16842874 : 16842873;
    }

    public IndicatorView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66455ad8862e5406b1c9eb182e76050e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66455ad8862e5406b1c9eb182e76050e");
            return;
        }
        this.mIndeterminate = true;
        this.mAnimating = true;
    }

    public IndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b82e504af7ce782834a51c889f5bce2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b82e504af7ce782834a51c889f5bce2d");
            return;
        }
        this.mIndeterminate = true;
        this.mAnimating = true;
    }

    public IndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e55179e1cdc84d4f4216060861202be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e55179e1cdc84d4f4216060861202be");
            return;
        }
        this.mIndeterminate = true;
        this.mAnimating = true;
    }

    public void setStyle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26785cccc8930d46c0e08afab554e8bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26785cccc8930d46c0e08afab554e8bb");
            return;
        }
        this.mProgressBar = new ProgressBar(getContext(), null, getStyle(i));
        this.mProgressBar.setMax(1000);
        removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.mProgressBar, layoutParams);
    }

    public void setColor(@Nullable Integer num) {
        this.mColor = num;
    }

    public void setIndeterminate(boolean z) {
        this.mIndeterminate = z;
    }

    public void setProgress(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "905e25b92bd2c75ae75c98d7417138f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "905e25b92bd2c75ae75c98d7417138f9");
        } else {
            this.mProgress = d;
        }
    }

    public void setAnimating(boolean z) {
        this.mAnimating = z;
    }

    public void apply() {
        Drawable progressDrawable;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1148825fbfa6e96654a49565670484c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1148825fbfa6e96654a49565670484c");
            return;
        }
        if (this.mProgressBar == null) {
            setStyle(0);
        }
        this.mProgressBar.setIndeterminate(this.mIndeterminate);
        this.mProgressBar.setProgress((int) (this.mProgress * 1000.0d));
        if (this.mAnimating) {
            this.mProgressBar.setVisibility(0);
        } else {
            this.mProgressBar.setVisibility(8);
        }
        if (this.mProgressBar.isIndeterminate()) {
            progressDrawable = this.mProgressBar.getIndeterminateDrawable();
        } else {
            progressDrawable = this.mProgressBar.getProgressDrawable();
        }
        if (progressDrawable == null) {
            return;
        }
        if (this.mColor != null) {
            progressDrawable.setColorFilter(this.mColor.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            progressDrawable.clearColorFilter();
        }
    }
}
