package com.sankuai.waimai.store.goods.detail.components.subroot.header;

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
import com.sankuai.waimai.store.goods.detail.components.subroot.base.SGDetailRoundCornerTileBlock;
import com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.SGDetailMediaPagerBlock;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.manager.poi.a;
import com.sankuai.waimai.store.repository.model.GoodsDetailResponse;
/* compiled from: ProGuard */
@Cube(children = {SGDetailMediaPagerBlock.class})
/* loaded from: classes5.dex */
public class SGDetailHeaderTileBlock extends SGDetailRoundCornerTileBlock {
    public static ChangeQuickRedirect h;
    public GoodsSpu i;
    public GoodsSku j;
    public SGDetailMediaPagerBlock k;
    private final a l;
    private GoodsDetailResponse m;

    public SGDetailHeaderTileBlock(@NonNull a aVar, @NonNull GoodsDetailResponse goodsDetailResponse) {
        Object[] objArr = {aVar, goodsDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3811a29537bfb7083c8051c788ae3690", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3811a29537bfb7083c8051c788ae3690");
            return;
        }
        this.l = aVar;
        this.m = goodsDetailResponse;
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "345d8db5a2119f305cf164e0d3860138", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "345d8db5a2119f305cf164e0d3860138") : layoutInflater.inflate(R.layout.wm_sc_goods_detail_tile_header, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.base.SGDetailRoundCornerTileBlock, com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5e2f138d4d59f5a3dddf1d05e600679", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5e2f138d4d59f5a3dddf1d05e600679");
            return;
        }
        super.a_(view);
        this.k = (SGDetailMediaPagerBlock) b(R.id.fl_food_header_container, (int) new SGDetailMediaPagerBlock(this.l));
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6de181755ff0685375ccda871eabe5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6de181755ff0685375ccda871eabe5f");
        } else {
            super.bE_();
        }
    }
}
