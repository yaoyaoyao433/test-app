package com.sankuai.waimai.store.drug.goods.list.templet.drugselfbusiness.spu;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.n;
import com.sankuai.waimai.store.drug.goods.list.delegate.d;
import com.sankuai.waimai.store.drug.goods.list.interfaces.b;
import com.sankuai.waimai.store.util.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.drug.goods.list.templet.newmarket.a {
    public static ChangeQuickRedirect a;
    private View l;
    private final float[] m;
    private final int n;
    private final int o;

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock
    public final int c() {
        return R.layout.wm_drug_shop_content_drug_self_bussiness_layout;
    }

    public a(@NonNull d dVar, b.a aVar, boolean z) {
        super(dVar, aVar, z);
        Object[] objArr = {dVar, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e92284a30aca6cdcb44cef528786497f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e92284a30aca6cdcb44cef528786497f");
            return;
        }
        this.m = new float[8];
        this.n = h.a(dVar.k(), 12.0f);
        this.o = h.a(dVar.k(), 50.0f);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.b, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.drug.goods.list.templet.a
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec50da61e849feb6ece48072ed5c5eab", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec50da61e849feb6ece48072ed5c5eab");
        }
        View a2 = super.a(layoutInflater, viewGroup);
        this.l = a2.findViewById(R.id.root_layout);
        return a2;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.b, com.sankuai.waimai.store.drug.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20aed51bbe15ae4a1737b441730ca5e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20aed51bbe15ae4a1737b441730ca5e6");
            return;
        }
        super.c_(i);
        Drawable background = this.l.getBackground();
        if (background instanceof GradientDrawable) {
            int i2 = i - this.o;
            float f = this.n;
            float a2 = (1.0f - n.a((i2 * 1.0f) / f, 0.0f, 1.0f)) * f;
            if (g.a(a2, this.m[0])) {
                return;
            }
            float[] fArr = this.m;
            float[] fArr2 = this.m;
            float[] fArr3 = this.m;
            this.m[3] = a2;
            fArr3[2] = a2;
            fArr2[1] = a2;
            fArr[0] = a2;
            ((GradientDrawable) background).setCornerRadii(this.m);
        }
    }
}
