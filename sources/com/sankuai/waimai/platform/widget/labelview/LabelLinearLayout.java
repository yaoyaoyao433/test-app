package com.sankuai.waimai.platform.widget.labelview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.labelview.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class LabelLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    public final b b;

    public LabelLinearLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c0d6bf5e796f5bce49c63732aa8fa82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c0d6bf5e796f5bce49c63732aa8fa82");
        } else {
            this.b = new b(new b.a() { // from class: com.sankuai.waimai.platform.widget.labelview.LabelLinearLayout.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.labelview.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a855fe13b12edbdf925df89a899fb5af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a855fe13b12edbdf925df89a899fb5af");
                    } else {
                        LabelLinearLayout.this.setBackgroundDrawable(LabelLinearLayout.this.b.a());
                    }
                }
            });
        }
    }

    public LabelLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52cd3d1a70dbeaa461ac1f226473adcb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52cd3d1a70dbeaa461ac1f226473adcb");
            return;
        }
        this.b = new b(new b.a() { // from class: com.sankuai.waimai.platform.widget.labelview.LabelLinearLayout.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.labelview.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a855fe13b12edbdf925df89a899fb5af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a855fe13b12edbdf925df89a899fb5af");
                } else {
                    LabelLinearLayout.this.setBackgroundDrawable(LabelLinearLayout.this.b.a());
                }
            }
        });
        a(context, attributeSet);
    }

    public LabelLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d881423acd34fc0daf5cb6a235d1d87c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d881423acd34fc0daf5cb6a235d1d87c");
            return;
        }
        this.b = new b(new b.a() { // from class: com.sankuai.waimai.platform.widget.labelview.LabelLinearLayout.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.labelview.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a855fe13b12edbdf925df89a899fb5af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a855fe13b12edbdf925df89a899fb5af");
                } else {
                    LabelLinearLayout.this.setBackgroundDrawable(LabelLinearLayout.this.b.a());
                }
            }
        });
        a(context, attributeSet);
    }

    @TargetApi(21)
    public LabelLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b907ca07af7e9b248ff69feb15420d61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b907ca07af7e9b248ff69feb15420d61");
            return;
        }
        this.b = new b(new b.a() { // from class: com.sankuai.waimai.platform.widget.labelview.LabelLinearLayout.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.labelview.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a855fe13b12edbdf925df89a899fb5af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a855fe13b12edbdf925df89a899fb5af");
                } else {
                    LabelLinearLayout.this.setBackgroundDrawable(LabelLinearLayout.this.b.a());
                }
            }
        });
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7b02c16c19049315af42547ac8619be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7b02c16c19049315af42547ac8619be");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.borderWidth, R.attr.textColorNormal, R.attr.textColorSelected, R.attr.textColorPressed, R.attr.textColorDisabled, R.attr.solidColorNormal, R.attr.solidColorSelected, R.attr.solidColorPressed, R.attr.solidColorDisabled, R.attr.borderColorNormal, R.attr.borderColorSelected, R.attr.borderColorPressed, R.attr.borderColorDisabled, R.attr.radiusDefault, R.attr.radiusTopLeft, R.attr.radiusTopRight, R.attr.radiusBottomRight, R.attr.radiusBottomLeft, R.attr.iconNormal, R.attr.iconSelected, R.attr.iconPressed, R.attr.iconDisabled});
        this.b.c(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public void setRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3755c606f261a84537dde5e633348d6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3755c606f261a84537dde5e633348d6e");
        } else {
            this.b.a(f);
        }
    }

    public void setBorderWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e1aeb81f98269874ad286b4fbc4a51f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e1aeb81f98269874ad286b4fbc4a51f");
        } else {
            this.b.a(i);
        }
    }

    public a getBorderColors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb9a6fd330f27366870cb2d8ee160f22", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb9a6fd330f27366870cb2d8ee160f22") : this.b.c;
    }

    public a getSolidColors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9e684afe579d50cc931e7df17d48b34", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9e684afe579d50cc931e7df17d48b34") : this.b.b;
    }
}
