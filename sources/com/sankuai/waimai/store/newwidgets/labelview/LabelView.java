package com.sankuai.waimai.store.newwidgets.labelview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.labelview.b;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class LabelView extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    private final b b;

    public LabelView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23c6e1feade8288e0747e9c3511552a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23c6e1feade8288e0747e9c3511552a4");
        } else {
            this.b = new b(new b.a() { // from class: com.sankuai.waimai.store.newwidgets.labelview.LabelView.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.newwidgets.labelview.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55d52ff1ecb4dc95f781de97d9d4eda3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55d52ff1ecb4dc95f781de97d9d4eda3");
                        return;
                    }
                    LabelView labelView = LabelView.this;
                    b bVar = LabelView.this.b;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    labelView.setBackgroundDrawable(PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "4bb0e47ff3866a38e3a958cb13c14ea8", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "4bb0e47ff3866a38e3a958cb13c14ea8") : bVar.j.a());
                }
            });
        }
    }

    public LabelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a7f6627cf3306bc2c2fa0625fa413a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a7f6627cf3306bc2c2fa0625fa413a3");
            return;
        }
        this.b = new b(new b.a() { // from class: com.sankuai.waimai.store.newwidgets.labelview.LabelView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.labelview.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55d52ff1ecb4dc95f781de97d9d4eda3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55d52ff1ecb4dc95f781de97d9d4eda3");
                    return;
                }
                LabelView labelView = LabelView.this;
                b bVar = LabelView.this.b;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                labelView.setBackgroundDrawable(PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "4bb0e47ff3866a38e3a958cb13c14ea8", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "4bb0e47ff3866a38e3a958cb13c14ea8") : bVar.j.a());
            }
        });
        a(context, attributeSet);
    }

    public LabelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cb3a0685d723086588cba478b1338f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cb3a0685d723086588cba478b1338f4");
            return;
        }
        this.b = new b(new b.a() { // from class: com.sankuai.waimai.store.newwidgets.labelview.LabelView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.labelview.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55d52ff1ecb4dc95f781de97d9d4eda3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55d52ff1ecb4dc95f781de97d9d4eda3");
                    return;
                }
                LabelView labelView = LabelView.this;
                b bVar = LabelView.this.b;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                labelView.setBackgroundDrawable(PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "4bb0e47ff3866a38e3a958cb13c14ea8", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "4bb0e47ff3866a38e3a958cb13c14ea8") : bVar.j.a());
            }
        });
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9820ffc8da67118e54a1d2f347f622b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9820ffc8da67118e54a1d2f347f622b");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.borderWidth, R.attr.textColorNormal, R.attr.textColorSelected, R.attr.textColorPressed, R.attr.textColorDisabled, R.attr.solidColorNormal, R.attr.solidColorSelected, R.attr.solidColorPressed, R.attr.solidColorDisabled, R.attr.borderColorNormal, R.attr.borderColorSelected, R.attr.borderColorPressed, R.attr.borderColorDisabled, R.attr.radiusDefault, R.attr.radiusTopLeft, R.attr.radiusTopRight, R.attr.radiusBottomRight, R.attr.radiusBottomLeft, R.attr.iconNormal, R.attr.iconSelected, R.attr.iconPressed, R.attr.iconDisabled});
        setTextColor(b.a(obtainStyledAttributes));
        setIconLeft(b.b(obtainStyledAttributes));
        this.b.c(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public void setRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12493b8cb083d1f6ac350e502e50b713", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12493b8cb083d1f6ac350e502e50b713");
            return;
        }
        b bVar = this.b;
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a9e468e3aff1377606796a1c39de8c7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a9e468e3aff1377606796a1c39de8c7c");
            return;
        }
        Object[] objArr3 = {Float.valueOf(f), Float.valueOf(f), Float.valueOf(f), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "c04f55b83657063c552a2565b01352ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "c04f55b83657063c552a2565b01352ab");
            return;
        }
        bVar.a(f, f, f, f);
        bVar.b.a();
    }

    public void setBorderWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0df7f497650fbdcefcee4700abbf180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0df7f497650fbdcefcee4700abbf180");
            return;
        }
        b bVar = this.b;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "2179fa47886a57dc27d232add207ac35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "2179fa47886a57dc27d232add207ac35");
        } else if (bVar.e != i) {
            bVar.e = i;
            bVar.b.a();
        }
    }

    public a getBorderColors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb23ca493a7760b47f0124d6ce3e40e6", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb23ca493a7760b47f0124d6ce3e40e6") : this.b.d;
    }

    public a getSolidColors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74b44f190c5dbc5f1c7bb254a0a3f9db", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74b44f190c5dbc5f1c7bb254a0a3f9db") : this.b.c;
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        Object[] objArr = {drawable, drawable2, drawable3, drawable4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51154da11ba443b2861a24fa7dc2b6eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51154da11ba443b2861a24fa7dc2b6eb");
        } else {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3bebcdbc7d4481ca8af27184ba93188", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3bebcdbc7d4481ca8af27184ba93188");
        } else {
            super.setCompoundDrawablePadding(i);
        }
    }

    public void setIconLeft(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bda8b429ea65b0ba7694f5fe10571398", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bda8b429ea65b0ba7694f5fe10571398");
            return;
        }
        Drawable[] compoundDrawables = getCompoundDrawables();
        if (compoundDrawables == null || compoundDrawables.length != 4) {
            setCompoundDrawables(drawable, null, null, null);
        } else {
            setCompoundDrawables(drawable, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        Object[] objArr = {colorStateList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "368f236c7686ac5b06d2241c5c07045d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "368f236c7686ac5b06d2241c5c07045d");
        } else {
            super.setTextColor(colorStateList);
        }
    }

    public void setTextColor(c cVar) {
        ColorStateList colorStateList;
        boolean z = true;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25d45e189763b024b8cdd04df2fbf9a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25d45e189763b024b8cdd04df2fbf9a1");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.c;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "2f7f4451d6a8e3817e24e37b22ca7ef7", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "2f7f4451d6a8e3817e24e37b22ca7ef7")).booleanValue();
        } else if (!cVar.c() && !cVar.b() && !cVar.d()) {
            z = false;
        }
        if (z) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c.b;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "a8b860d0f45b67e89a9fbfb514e8b3d9", RobustBitConfig.DEFAULT_VALUE)) {
                colorStateList = (ColorStateList) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "a8b860d0f45b67e89a9fbfb514e8b3d9");
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (cVar.d()) {
                    arrayList.add(c.g);
                    arrayList2.add(Integer.valueOf(cVar.g()));
                }
                if (cVar.b()) {
                    arrayList.add(c.h);
                    arrayList2.add(Integer.valueOf(cVar.e()));
                }
                if (cVar.c()) {
                    arrayList.add(c.i);
                    arrayList2.add(Integer.valueOf(cVar.f()));
                }
                arrayList.add(c.j);
                arrayList2.add(Integer.valueOf(cVar.d));
                colorStateList = new ColorStateList((int[][]) arrayList.toArray(new int[0]), c.a(arrayList2));
            }
            setTextColor(colorStateList);
            return;
        }
        setTextColor(cVar.d);
    }

    public final void a(int i, Integer num, Integer num2, Integer num3) {
        Object[] objArr = {Integer.valueOf(i), null, null, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d632ebf6ff7d8343f2387b8c06fbe058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d632ebf6ff7d8343f2387b8c06fbe058");
            return;
        }
        c cVar = new c();
        cVar.a(i, null, null, null);
        setTextColor(cVar);
    }
}
