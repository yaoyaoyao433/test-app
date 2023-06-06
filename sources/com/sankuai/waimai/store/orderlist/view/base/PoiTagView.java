package com.sankuai.waimai.store.orderlist.view.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiTagView extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    private GradientDrawable b;
    private int c;

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    public PoiTagView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f31a7c2da371656092ad7b34d72fbc8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f31a7c2da371656092ad7b34d72fbc8e");
        } else {
            a();
        }
    }

    public PoiTagView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e143cc4174ff6c1008bce6ffb97986d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e143cc4174ff6c1008bce6ffb97986d1");
        } else {
            a();
        }
    }

    public PoiTagView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10940b0f44a584be3ae26da4ce3fa7cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10940b0f44a584be3ae26da4ce3fa7cb");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffad0d979c2c81e00ee9cde2816fbda6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffad0d979c2c81e00ee9cde2816fbda6");
            return;
        }
        this.c = h.a(getContext(), 0.5f);
        this.b = new GradientDrawable();
        this.b.setShape(0);
        super.setBackground(this.b);
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0c1b3a7e4de8a19cce637647516b366", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0c1b3a7e4de8a19cce637647516b366");
            return;
        }
        GradientDrawable gradientDrawable = this.b;
        gradientDrawable.setStroke(this.c, i);
        gradientDrawable.setCornerRadius(h.a(getContext(), 2.0f));
        gradientDrawable.setColor(i2);
        super.setBackground(gradientDrawable);
    }
}
