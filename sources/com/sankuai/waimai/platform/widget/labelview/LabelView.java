package com.sankuai.waimai.platform.widget.labelview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.labelview.b;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes5.dex */
public class LabelView extends TextView {
    public static ChangeQuickRedirect a;
    private final b b;

    public LabelView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ee0ee38583650d1d71bb19211fe194c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ee0ee38583650d1d71bb19211fe194c");
        } else {
            this.b = new b(new b.a() { // from class: com.sankuai.waimai.platform.widget.labelview.LabelView.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.labelview.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4a434a2b2d74253547309a0e8eafea1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4a434a2b2d74253547309a0e8eafea1");
                    } else {
                        LabelView.this.setBackgroundDrawable(LabelView.this.b.a());
                    }
                }
            });
        }
    }

    public LabelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd84f27ab1875b249a925dd9db71163", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd84f27ab1875b249a925dd9db71163");
            return;
        }
        this.b = new b(new b.a() { // from class: com.sankuai.waimai.platform.widget.labelview.LabelView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.labelview.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4a434a2b2d74253547309a0e8eafea1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4a434a2b2d74253547309a0e8eafea1");
                } else {
                    LabelView.this.setBackgroundDrawable(LabelView.this.b.a());
                }
            }
        });
        a(context, attributeSet);
    }

    public LabelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "147bbe3a096c27772c0fb74674eb984f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "147bbe3a096c27772c0fb74674eb984f");
            return;
        }
        this.b = new b(new b.a() { // from class: com.sankuai.waimai.platform.widget.labelview.LabelView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.labelview.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4a434a2b2d74253547309a0e8eafea1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4a434a2b2d74253547309a0e8eafea1");
                } else {
                    LabelView.this.setBackgroundDrawable(LabelView.this.b.a());
                }
            }
        });
        a(context, attributeSet);
    }

    @TargetApi(21)
    public LabelView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "680878fd439ff64c2d0163d3a67c5e14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "680878fd439ff64c2d0163d3a67c5e14");
            return;
        }
        this.b = new b(new b.a() { // from class: com.sankuai.waimai.platform.widget.labelview.LabelView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.labelview.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4a434a2b2d74253547309a0e8eafea1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4a434a2b2d74253547309a0e8eafea1");
                } else {
                    LabelView.this.setBackgroundDrawable(LabelView.this.b.a());
                }
            }
        });
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16f2b5b2a5aab1d7dff77a261c76cc11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16f2b5b2a5aab1d7dff77a261c76cc11");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26ccfb7dd88aacde1953287625ccc64b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26ccfb7dd88aacde1953287625ccc64b");
        } else {
            this.b.a(f);
        }
    }

    public void setBorderWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7637394c89b8418e3eeb9eaa9ab74760", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7637394c89b8418e3eeb9eaa9ab74760");
        } else {
            this.b.a(i);
        }
    }

    public a getBorderColors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78765e9abcc40b7caf74b9ca6240d547", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78765e9abcc40b7caf74b9ca6240d547") : this.b.c;
    }

    public a getSolidColors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34b6d1ec2bed7d19640743611dcf5c34", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34b6d1ec2bed7d19640743611dcf5c34") : this.b.b;
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        Object[] objArr = {drawable, drawable2, drawable3, drawable4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "388b90275a1730a175890de6af1f21e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "388b90275a1730a175890de6af1f21e5");
        } else {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcc1625c0287c4bced679a609810d203", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcc1625c0287c4bced679a609810d203");
        } else {
            super.setCompoundDrawablePadding(i);
        }
    }

    public void setIconLeft(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a3811e36fd4601da79e5a0131aff3bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a3811e36fd4601da79e5a0131aff3bf");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99ce91fa2bf9daf602f87f432c330c6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99ce91fa2bf9daf602f87f432c330c6c");
        } else {
            super.setTextColor(colorStateList);
        }
    }

    public void setTextColor(c cVar) {
        ColorStateList colorStateList;
        boolean z = true;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18c5f25f8b900a7a346365705e39920a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18c5f25f8b900a7a346365705e39920a");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.c;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "bc56ecb5ee502fdcf405e1a94bbeea6a", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "bc56ecb5ee502fdcf405e1a94bbeea6a")).booleanValue();
        } else if (!cVar.c() && !cVar.b() && !cVar.d()) {
            z = false;
        }
        if (z) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c.b;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "761317259dfc7a398100a215466b9353", RobustBitConfig.DEFAULT_VALUE)) {
                colorStateList = (ColorStateList) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "761317259dfc7a398100a215466b9353");
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
