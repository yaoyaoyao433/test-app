package com.meituan.android.base.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FixedAspectRatioImageView extends ImageView {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;

    public FixedAspectRatioImageView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f251f98f066d3117812554213f6bddbc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f251f98f066d3117812554213f6bddbc");
        }
    }

    private FixedAspectRatioImageView(Context context, AttributeSet attributeSet) {
        this(context, null, R.attr.fixedAspectRatioImage);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9b7f16038c5bcb0550eb011d6015022", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9b7f16038c5bcb0550eb011d6015022");
        }
    }

    public FixedAspectRatioImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aa68e557f706e4c6ceffacb85ae1467", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aa68e557f706e4c6ceffacb85ae1467");
            return;
        }
        Resources resources = getResources();
        int integer = resources.getInteger(R.integer.default_aspect_ratio_width);
        int integer2 = resources.getInteger(R.integer.default_aspect_ratio_height);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aspectRatioWidth, R.attr.aspectRatioHeight}, i, 0);
        this.b = obtainStyledAttributes.getInt(0, integer);
        this.c = obtainStyledAttributes.getInt(1, integer2);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca266f8af64b7bdecbb5430a2e82f657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca266f8af64b7bdecbb5430a2e82f657");
        } else if (View.MeasureSpec.getMode(i) == 0) {
            setMeasuredDimension(0, 0);
        } else {
            int size = View.MeasureSpec.getSize(i);
            setMeasuredDimension(size, (this.c * size) / this.b);
        }
    }
}
