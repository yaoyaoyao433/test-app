package com.sankuai.waimai.platform.widget;

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
/* loaded from: classes5.dex */
public class RatioFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;

    public RatioFrameLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e735784e93c4332430f2e0b6c2ce12d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e735784e93c4332430f2e0b6c2ce12d4");
            return;
        }
        this.b = 1;
        this.c = 1;
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abb8fbb4d19aa8072e57b76ee43a426d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abb8fbb4d19aa8072e57b76ee43a426d");
            return;
        }
        this.b = 1;
        this.c = 1;
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c168090d80ee13d67c5b0ad9826d145", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c168090d80ee13d67c5b0ad9826d145");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5bd00fc15dfc52293a5de7fccbe54de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5bd00fc15dfc52293a5de7fccbe54de");
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) * getHeightRatio()) / getWidthRatio(), 1073741824));
        }
    }

    public void setHeightRatio(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae31ef790dac1c7cb2bc05c6440500de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae31ef790dac1c7cb2bc05c6440500de");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64bfd4a5adc138f28f435aa9e235de16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64bfd4a5adc138f28f435aa9e235de16");
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
