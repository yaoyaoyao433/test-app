package com.sankuai.waimai.store.newwidgets.labelview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class LabelImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;

    public LabelImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e13f9745a28a23bbc8a280f8c7b4594c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e13f9745a28a23bbc8a280f8c7b4594c");
        }
    }

    public LabelImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66f0771ba74dd674042267ce9fe37750", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66f0771ba74dd674042267ce9fe37750");
            return;
        }
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35f0211ec47d5bb194ca7315e15ce052", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35f0211ec47d5bb194ca7315e15ce052");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.borderWidth, R.attr.textColorNormal, R.attr.textColorSelected, R.attr.textColorPressed, R.attr.textColorDisabled, R.attr.solidColorNormal, R.attr.solidColorSelected, R.attr.solidColorPressed, R.attr.solidColorDisabled, R.attr.borderColorNormal, R.attr.borderColorSelected, R.attr.borderColorPressed, R.attr.borderColorDisabled, R.attr.radiusDefault, R.attr.radiusTopLeft, R.attr.radiusTopRight, R.attr.radiusBottomRight, R.attr.radiusBottomLeft, R.attr.iconNormal, R.attr.iconSelected, R.attr.iconPressed, R.attr.iconDisabled});
        setImageDrawable(b.b(obtainStyledAttributes));
        obtainStyledAttributes.recycle();
    }
}
