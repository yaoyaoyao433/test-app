package com.sankuai.waimai.store.goods.list.templet.drugselfbusiness.spu;

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
import com.sankuai.waimai.store.goods.list.delegate.e;
import com.sankuai.waimai.store.goods.list.templet.newmarket.b;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
import com.sankuai.waimai.store.util.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;
    private View m;
    private final float[] n;
    private final int o;
    private final int p;

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock
    public final int d() {
        return R.layout.wm_sc_shop_content_drug_self_bussiness_layout;
    }

    public a(@NonNull e eVar, a.InterfaceC1266a interfaceC1266a, boolean z) {
        super(eVar, interfaceC1266a, z);
        Object[] objArr = {eVar, interfaceC1266a, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "330ac9fe60353ed7544660effb2dca16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "330ac9fe60353ed7544660effb2dca16");
            return;
        }
        this.n = new float[8];
        this.o = h.a(eVar.k(), 12.0f);
        this.p = h.a(eVar.k(), 50.0f);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.c, com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.goods.list.templet.a, com.sankuai.waimai.store.goods.list.templet.newmarket.g
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b76d791c4652b7c57bb3d3ca54b13e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b76d791c4652b7c57bb3d3ca54b13e5");
        }
        View a2 = super.a(layoutInflater, viewGroup);
        this.m = a2.findViewById(R.id.root_layout);
        return a2;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.c, com.sankuai.waimai.store.goods.list.templet.newmarket.ShopContentRootBlock, com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView.a
    public final void c_(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6c4a89052bcda29f482970c018215b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6c4a89052bcda29f482970c018215b2");
            return;
        }
        super.c_(i);
        Drawable background = this.m.getBackground();
        if (background instanceof GradientDrawable) {
            int i2 = i - this.p;
            float f = this.o;
            float a2 = (1.0f - n.a((i2 * 1.0f) / f, 0.0f, 1.0f)) * f;
            if (g.a(a2, this.n[0])) {
                return;
            }
            float[] fArr = this.n;
            float[] fArr2 = this.n;
            float[] fArr3 = this.n;
            this.n[3] = a2;
            fArr3[2] = a2;
            fArr2[1] = a2;
            fArr[0] = a2;
            ((GradientDrawable) background).setCornerRadii(this.n);
        }
    }
}
