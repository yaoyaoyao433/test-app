package com.sankuai.waimai.platform.widget.labelview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class LabelImageView extends ImageView {
    public static ChangeQuickRedirect a;

    public LabelImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2378c793f71cb447e7907b421578c00e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2378c793f71cb447e7907b421578c00e");
        }
    }

    public LabelImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b6454855c8f3e121b112f9f469c5a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b6454855c8f3e121b112f9f469c5a1");
        } else {
            a(context, attributeSet);
        }
    }

    public LabelImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fb42f6a3f8ee55894904776a816ffec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fb42f6a3f8ee55894904776a816ffec");
        } else {
            a(context, attributeSet);
        }
    }

    @TargetApi(21)
    public LabelImageView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aae5a5ceccbee25a4c39961e336df0b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aae5a5ceccbee25a4c39961e336df0b0");
        } else {
            a(context, attributeSet);
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a974d71d57bb185c3d7dd9130ef0267", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a974d71d57bb185c3d7dd9130ef0267");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.borderWidth, R.attr.textColorNormal, R.attr.textColorSelected, R.attr.textColorPressed, R.attr.textColorDisabled, R.attr.solidColorNormal, R.attr.solidColorSelected, R.attr.solidColorPressed, R.attr.solidColorDisabled, R.attr.borderColorNormal, R.attr.borderColorSelected, R.attr.borderColorPressed, R.attr.borderColorDisabled, R.attr.radiusDefault, R.attr.radiusTopLeft, R.attr.radiusTopRight, R.attr.radiusBottomRight, R.attr.radiusBottomLeft, R.attr.iconNormal, R.attr.iconSelected, R.attr.iconPressed, R.attr.iconDisabled});
        setImageDrawable(b.b(obtainStyledAttributes));
        obtainStyledAttributes.recycle();
    }
}
