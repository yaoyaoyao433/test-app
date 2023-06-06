package com.sankuai.waimai.store.drug.newwidgets.labelview;

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
import com.sankuai.waimai.store.drug.newwidgets.labelview.b;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b350e45b18e8aa5de75dabc35b77d27f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b350e45b18e8aa5de75dabc35b77d27f");
        } else {
            this.b = new b(new b.a() { // from class: com.sankuai.waimai.store.drug.newwidgets.labelview.LabelView.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.drug.newwidgets.labelview.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2bfae638572d6523cf79ccd459755b76", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2bfae638572d6523cf79ccd459755b76");
                        return;
                    }
                    LabelView labelView = LabelView.this;
                    b bVar = LabelView.this.b;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    labelView.setBackgroundDrawable(PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "95a7df2aba12d098b45217602f3d02aa", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "95a7df2aba12d098b45217602f3d02aa") : bVar.j.a());
                }
            });
        }
    }

    public LabelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd9890d74220c0f28ec33e1a5f1fce57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd9890d74220c0f28ec33e1a5f1fce57");
            return;
        }
        this.b = new b(new b.a() { // from class: com.sankuai.waimai.store.drug.newwidgets.labelview.LabelView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.drug.newwidgets.labelview.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2bfae638572d6523cf79ccd459755b76", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2bfae638572d6523cf79ccd459755b76");
                    return;
                }
                LabelView labelView = LabelView.this;
                b bVar = LabelView.this.b;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                labelView.setBackgroundDrawable(PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "95a7df2aba12d098b45217602f3d02aa", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "95a7df2aba12d098b45217602f3d02aa") : bVar.j.a());
            }
        });
        a(context, attributeSet);
    }

    public LabelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd34aece1be5204c11d61b9310ce2f13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd34aece1be5204c11d61b9310ce2f13");
            return;
        }
        this.b = new b(new b.a() { // from class: com.sankuai.waimai.store.drug.newwidgets.labelview.LabelView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.drug.newwidgets.labelview.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2bfae638572d6523cf79ccd459755b76", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2bfae638572d6523cf79ccd459755b76");
                    return;
                }
                LabelView labelView = LabelView.this;
                b bVar = LabelView.this.b;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                labelView.setBackgroundDrawable(PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "95a7df2aba12d098b45217602f3d02aa", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "95a7df2aba12d098b45217602f3d02aa") : bVar.j.a());
            }
        });
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "604ad9105f23638463cc8687615e9845", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "604ad9105f23638463cc8687615e9845");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac06aa00e1d58ac3c3f4a0aabc65502f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac06aa00e1d58ac3c3f4a0aabc65502f");
            return;
        }
        b bVar = this.b;
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "7163582e84dce2b3416257aa3b3153b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "7163582e84dce2b3416257aa3b3153b5");
            return;
        }
        Object[] objArr3 = {Float.valueOf(f), Float.valueOf(f), Float.valueOf(f), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "d24eca51afd29cf8b333cff03cbe474c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "d24eca51afd29cf8b333cff03cbe474c");
            return;
        }
        bVar.a(f, f, f, f);
        bVar.b.a();
    }

    public void setBorderWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a47d4b7cb6af7e8a9de795bc926d122", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a47d4b7cb6af7e8a9de795bc926d122");
            return;
        }
        b bVar = this.b;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "2497f73bd48ab7af615680856ea053b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "2497f73bd48ab7af615680856ea053b3");
        } else if (bVar.e != i) {
            bVar.e = i;
            bVar.b.a();
        }
    }

    public a getBorderColors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "718516302df3a18439671658b8ecf3fd", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "718516302df3a18439671658b8ecf3fd") : this.b.d;
    }

    public a getSolidColors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e49de2d30b8e889f4f67a61abcaa820b", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e49de2d30b8e889f4f67a61abcaa820b") : this.b.c;
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        Object[] objArr = {drawable, drawable2, drawable3, drawable4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fddfd940d981f30d9c9e4116991ea1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fddfd940d981f30d9c9e4116991ea1f");
        } else {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61ca6ac5ceb123cd1bb14a99f9297a0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61ca6ac5ceb123cd1bb14a99f9297a0d");
        } else {
            super.setCompoundDrawablePadding(i);
        }
    }

    public void setIconLeft(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11dcce535f570b7a8ae6ffaeeb36f1c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11dcce535f570b7a8ae6ffaeeb36f1c7");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcdbde1f0ae140d0c112b64d17d28dee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcdbde1f0ae140d0c112b64d17d28dee");
        } else {
            super.setTextColor(colorStateList);
        }
    }

    public void setTextColor(c cVar) {
        ColorStateList colorStateList;
        boolean z = true;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c514b7dd4c0d89d9b88e5101357699a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c514b7dd4c0d89d9b88e5101357699a");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.c;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "5eb698225b00904b2420c3d544b2288d", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "5eb698225b00904b2420c3d544b2288d")).booleanValue();
        } else if (!cVar.c() && !cVar.b() && !cVar.d()) {
            z = false;
        }
        if (z) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c.b;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "6b64fd43669f667319d77f6b83e0ce6a", RobustBitConfig.DEFAULT_VALUE)) {
                colorStateList = (ColorStateList) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "6b64fd43669f667319d77f6b83e0ce6a");
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
}
