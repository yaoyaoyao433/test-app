package com.sankuai.waimai.store.v2.detail.component.header;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.j;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.manager.poi.a;
import com.sankuai.waimai.store.v2.detail.component.discount.SGDetailB2CDiscountInfoBlock;
import com.sankuai.waimai.store.v2.detail.component.pricebar.SGDetailB2CPriceBarBlock;
/* compiled from: ProGuard */
@Cube(children = {SGDetailB2CPriceBarBlock.class, SGDetailB2CDiscountInfoBlock.class})
/* loaded from: classes5.dex */
public class SGDetailB2CHeaderBlock extends j {
    public static ChangeQuickRedirect g;
    public SGDetailB2CDiscountInfoBlock h;
    public String i;
    private SGDetailB2CPriceBarBlock j;
    private a k;

    public SGDetailB2CHeaderBlock(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6cd8dfc95543d863b46de1e20bdeeef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6cd8dfc95543d863b46de1e20bdeeef");
        } else {
            this.k = aVar;
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdf28b893927c7fb2dafbb54d02970c3", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdf28b893927c7fb2dafbb54d02970c3") : layoutInflater.inflate(R.layout.wm_sc_goods_detail_summary_price_bar_b2c, viewGroup, false);
    }

    @Override // com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f396fe10c74945f73f1bd1e0ff85ca4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f396fe10c74945f73f1bd1e0ff85ca4");
            return;
        }
        super.a_(view);
        this.j = (SGDetailB2CPriceBarBlock) b(R.id.ll_b2c_detail_price_info, (int) new SGDetailB2CPriceBarBlock(this.k, false));
        this.h = (SGDetailB2CDiscountInfoBlock) b(R.id.ll_b2c_price_discount, (int) new SGDetailB2CDiscountInfoBlock(this.k));
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ffcfb5689c210de41e2b8b2e4982be9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ffcfb5689c210de41e2b8b2e4982be9");
        } else {
            super.bE_();
        }
    }

    public final void a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34807aacc3e82f40e577a7bb4bea48d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34807aacc3e82f40e577a7bb4bea48d2");
        } else if (goodsSpu == null) {
            j();
        } else {
            k();
            if (com.sankuai.waimai.store.v2.detail.component.discount.a.a(goodsSpu.promotion)) {
                a(this.j);
                if (this.h != null) {
                    this.h.a(goodsSpu, this.i);
                    return;
                }
                return;
            }
            a(this.h);
            if (this.j != null) {
                this.j.k();
                this.j.a(goodsSpu);
            }
        }
    }

    private void a(j... jVarArr) {
        Object[] objArr = {jVarArr};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dface2500843e6b6a19d5c5c3a2186fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dface2500843e6b6a19d5c5c3a2186fb");
            return;
        }
        for (int i = 0; i <= 0; i++) {
            j jVar = jVarArr[0];
            if (jVar != null) {
                jVar.j();
            }
        }
    }
}
