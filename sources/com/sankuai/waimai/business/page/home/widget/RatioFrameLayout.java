package com.sankuai.waimai.business.page.home.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RatioFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;

    public RatioFrameLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a208ae143dcc74990c752d200c6adb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a208ae143dcc74990c752d200c6adb7");
            return;
        }
        this.b = 1;
        this.c = 1;
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cbf3e83d0095a02c0c4d39f7ac2e2ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cbf3e83d0095a02c0c4d39f7ac2e2ac");
            return;
        }
        this.b = 1;
        this.c = 1;
        a(context, attributeSet);
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b50a834f7d1a32fb8c4fce3671666a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b50a834f7d1a32fb8c4fce3671666a6");
            return;
        }
        this.b = 1;
        this.c = 1;
        a(context, attributeSet);
    }

    @TargetApi(21)
    public RatioFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e0485c0cd751039ddc07cc300b5b06f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e0485c0cd751039ddc07cc300b5b06f");
            return;
        }
        this.b = 1;
        this.c = 1;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf4701ae75fc0302a5c365e1261fd7dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf4701ae75fc0302a5c365e1261fd7dc");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.widthRatio, R.attr.heightRatio});
        setHeightRatio(obtainStyledAttributes.getInt(1, this.c));
        setWidthRatio(obtainStyledAttributes.getInt(0, this.b));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34228f37eee4e59aee4c8c5255e31480", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34228f37eee4e59aee4c8c5255e31480");
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) ((View.MeasureSpec.getSize(i) * (this.c / this.b)) + 0.5f), 1073741824));
        }
    }

    public void setHeightRatio(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d5a73767cfa30b2aa58482db021fc6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d5a73767cfa30b2aa58482db021fc6a");
            return;
        }
        if (i <= 0) {
            i = 1;
        }
        if (i != this.c) {
            this.c = i;
            requestLayout();
        }
    }

    public int getHeightRatio() {
        return this.c;
    }

    public void setWidthRatio(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cc29ee2ea1c26da97ed99933484f75f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cc29ee2ea1c26da97ed99933484f75f");
            return;
        }
        if (i <= 0) {
            i = 1;
        }
        if (i != this.b) {
            this.b = i;
            requestLayout();
        }
    }

    public int getWidthRatio() {
        return this.b;
    }
}
