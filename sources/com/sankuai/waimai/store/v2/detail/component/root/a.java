package com.sankuai.waimai.store.v2.detail.component.root;

import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.detail.components.root.b;
import com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.d;
import com.sankuai.waimai.store.j;
import com.sankuai.waimai.store.platform.domain.core.activities.StoreActivityInfo;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.shop.model.LiveInfo;
import com.sankuai.waimai.store.repository.model.DetailSortStyle;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.repository.model.ProductFreeInfo;
import com.sankuai.waimai.store.repository.model.h;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.z;
import com.sankuai.waimai.store.v2.detail.component.SGDetailRoundCornerBlock;
import com.sankuai.waimai.store.v2.detail.component.header.SGDetailHeaderBlock;
import com.sankuai.waimai.store.v2.detail.component.mach.SGSyncRenderMachBlock;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.widgets.recycler.a<C1336a> {
    public static ChangeQuickRedirect a;
    List<com.sankuai.waimai.store.goods.detail.components.root.b> b;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    private j d;
    private GoodDetailResponse e;

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final /* synthetic */ void a(C1336a c1336a, int i) {
        char c;
        char c2;
        C1336a c1336a2 = c1336a;
        Object[] objArr = {c1336a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b7af5da6f0a52ca2b2b1e05084b82c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b7af5da6f0a52ca2b2b1e05084b82c8");
            return;
        }
        j jVar = c1336a2.a;
        Object[] objArr2 = {jVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9e6aa5a9526dfe8c1d6e55b6ee7916c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9e6aa5a9526dfe8c1d6e55b6ee7916c");
            return;
        }
        com.sankuai.waimai.store.goods.detail.components.root.b bVar = (com.sankuai.waimai.store.goods.detail.components.root.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (bVar == null || this.e == null) {
            return;
        }
        if ((jVar instanceof SGDetailHeaderBlock) && (bVar instanceof b.C1174b)) {
            b.C1174b c1174b = (b.C1174b) bVar;
            SGDetailHeaderBlock sGDetailHeaderBlock = (SGDetailHeaderBlock) jVar;
            GoodsSpu goodsSpu = c1174b.c;
            GoodsSku goodsSku = c1174b.d;
            String a2 = c1174b.a();
            d dVar = c1174b.g;
            float f = c1174b.h;
            int i2 = c1174b.i;
            GoodDetailResponse goodDetailResponse = c1174b.j;
            Object[] objArr3 = {goodsSpu, goodsSku, a2, dVar, Float.valueOf(f), Integer.valueOf(i2), goodDetailResponse};
            ChangeQuickRedirect changeQuickRedirect3 = SGDetailHeaderBlock.g;
            if (PatchProxy.isSupport(objArr3, sGDetailHeaderBlock, changeQuickRedirect3, false, "9bfe1f80454167364b5edc1d7b60738b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, sGDetailHeaderBlock, changeQuickRedirect3, false, "9bfe1f80454167364b5edc1d7b60738b");
            } else {
                String stids = goodDetailResponse.getStids();
                Object[] objArr4 = {stids, goodDetailResponse.getTraceInfo()};
                ChangeQuickRedirect changeQuickRedirect4 = SGDetailHeaderBlock.g;
                if (PatchProxy.isSupport(objArr4, sGDetailHeaderBlock, changeQuickRedirect4, false, "9b05e4fba6c4946f5b09517c33c632cc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, sGDetailHeaderBlock, changeQuickRedirect4, false, "9b05e4fba6c4946f5b09517c33c632cc");
                } else {
                    if (sGDetailHeaderBlock.l != null) {
                        sGDetailHeaderBlock.l.h = stids;
                    }
                    if (sGDetailHeaderBlock.o != null) {
                        sGDetailHeaderBlock.o.i = stids;
                    }
                }
                String str = goodDetailResponse.specification;
                ProductFreeInfo productFreeInfo = goodDetailResponse.teamLikeActInfo;
                List<HandPriceInfo> list = goodDetailResponse.handPriceCalcList;
                Object[] objArr5 = {goodsSpu, str, goodsSku, a2, dVar, productFreeInfo, Float.valueOf(f), list, Integer.valueOf(goodDetailResponse.getRecipeMenuTypeForJudas()), goodDetailResponse};
                ChangeQuickRedirect changeQuickRedirect5 = SGDetailHeaderBlock.g;
                if (PatchProxy.isSupport(objArr5, sGDetailHeaderBlock, changeQuickRedirect5, false, "5b959be31c2a87ff6130f2ae66c25186", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, sGDetailHeaderBlock, changeQuickRedirect5, false, "5b959be31c2a87ff6130f2ae66c25186");
                } else {
                    sGDetailHeaderBlock.i = goodsSpu;
                    sGDetailHeaderBlock.j = goodsSku;
                    sGDetailHeaderBlock.k = list;
                    sGDetailHeaderBlock.a(goodsSpu, goodsSku, list);
                    sGDetailHeaderBlock.l.a(goodsSpu, a2, dVar, productFreeInfo, f, goodDetailResponse.poiExtendAttr);
                }
                GoodDetailResponse.SpuPraiseInfo spuPraiseInfo = goodDetailResponse.mSpuPraiseInfo;
                Object[] objArr6 = {spuPraiseInfo, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect6 = SGDetailHeaderBlock.g;
                if (PatchProxy.isSupport(objArr6, sGDetailHeaderBlock, changeQuickRedirect6, false, "44b1f88d234da46c03de251ffcbb7205", RobustBitConfig.DEFAULT_VALUE)) {
                    c = 0;
                    PatchProxy.accessDispatch(objArr6, sGDetailHeaderBlock, changeQuickRedirect6, false, "44b1f88d234da46c03de251ffcbb7205");
                } else {
                    c = 0;
                    sGDetailHeaderBlock.l.a(spuPraiseInfo, i2);
                }
                DetailSortStyle detailSortStyle = goodDetailResponse.sortInfos;
                h hVar = goodDetailResponse.mProductCouponInfo;
                GoodDetailResponse.ActivityCouponInfo activityCouponInfo = goodDetailResponse.activityCouponInfo;
                GoodDetailResponse.QualityProductDes qualityProductDes = goodDetailResponse.mQualityProductDes;
                List<StoreActivityInfo> list2 = goodDetailResponse.activityInfos;
                Object[] objArr7 = new Object[6];
                objArr7[c] = detailSortStyle;
                objArr7[1] = goodsSpu;
                objArr7[2] = hVar;
                objArr7[3] = activityCouponInfo;
                objArr7[4] = qualityProductDes;
                objArr7[5] = list2;
                ChangeQuickRedirect changeQuickRedirect7 = SGDetailHeaderBlock.g;
                if (PatchProxy.isSupport(objArr7, sGDetailHeaderBlock, changeQuickRedirect7, false, "64b5ff9902900b6f9cb4834705a851c6", RobustBitConfig.DEFAULT_VALUE)) {
                    c2 = 0;
                    PatchProxy.accessDispatch(objArr7, sGDetailHeaderBlock, changeQuickRedirect7, false, "64b5ff9902900b6f9cb4834705a851c6");
                } else {
                    c2 = 0;
                }
                LiveInfo liveInfo = goodDetailResponse.getLiveInfo();
                Object[] objArr8 = new Object[1];
                objArr8[c2] = liveInfo;
                ChangeQuickRedirect changeQuickRedirect8 = SGDetailHeaderBlock.g;
                if (PatchProxy.isSupport(objArr8, sGDetailHeaderBlock, changeQuickRedirect8, false, "3392fb3ecafbfcb6a8c04b033f327eb6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, sGDetailHeaderBlock, changeQuickRedirect8, false, "3392fb3ecafbfcb6a8c04b033f327eb6");
                } else if (sGDetailHeaderBlock.l != null) {
                    sGDetailHeaderBlock.l.a(liveInfo);
                }
            }
        } else if ((jVar instanceof SGSyncRenderMachBlock) && (bVar instanceof b.a)) {
            ((SGSyncRenderMachBlock) jVar).a(((b.a) bVar).g);
        }
        if (jVar instanceof SGDetailRoundCornerBlock) {
            SGDetailRoundCornerBlock sGDetailRoundCornerBlock = (SGDetailRoundCornerBlock) jVar;
            boolean z = bVar.e;
            boolean z2 = bVar.f;
            Object[] objArr9 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect9 = SGDetailRoundCornerBlock.g;
            if (PatchProxy.isSupport(objArr9, sGDetailRoundCornerBlock, changeQuickRedirect9, false, "a89b76e86dd1ab54c73a83e3c16f0c14", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, sGDetailRoundCornerBlock, changeQuickRedirect9, false, "a89b76e86dd1ab54c73a83e3c16f0c14");
                return;
            }
            Object[] objArr10 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect10 = SGDetailRoundCornerBlock.g;
            if (PatchProxy.isSupport(objArr10, sGDetailRoundCornerBlock, changeQuickRedirect10, false, "bf0566d098c3692a757f3dfc335eff7b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, sGDetailRoundCornerBlock, changeQuickRedirect10, false, "bf0566d098c3692a757f3dfc335eff7b");
            } else {
                View i3 = sGDetailRoundCornerBlock.i();
                if (i3 != null) {
                    float a3 = com.sankuai.shangou.stone.util.h.a(sGDetailRoundCornerBlock.m(), 12.0f);
                    e.a c3 = new e.a().c(com.sankuai.waimai.store.util.b.b(sGDetailRoundCornerBlock.m(), R.color.white));
                    if (z2 && z) {
                        c3.a(a3);
                    } else if (z2) {
                        c3.a(0.0f, 0.0f, a3, a3);
                    } else if (z) {
                        c3.a(a3, a3, 0.0f, 0.0f);
                    } else {
                        c3.a(0.0f);
                    }
                    i3.setBackground(c3.a());
                }
            }
            Object[] objArr11 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect11 = SGDetailRoundCornerBlock.g;
            if (PatchProxy.isSupport(objArr11, sGDetailRoundCornerBlock, changeQuickRedirect11, false, "0365f23bd6db95aeb634c99db9f4881f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr11, sGDetailRoundCornerBlock, changeQuickRedirect11, false, "0365f23bd6db95aeb634c99db9f4881f");
                return;
            }
            Object[] objArr12 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect12 = SGDetailRoundCornerBlock.g;
            if (PatchProxy.isSupport(objArr12, sGDetailRoundCornerBlock, changeQuickRedirect12, false, "fdc991bfa55e8d0fd8708179b1fde1af", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr12, sGDetailRoundCornerBlock, changeQuickRedirect12, false, "fdc991bfa55e8d0fd8708179b1fde1af");
            } else if (sGDetailRoundCornerBlock.l.booleanValue()) {
                View i4 = sGDetailRoundCornerBlock.i();
                if (i4 != null) {
                    i4.setPadding(sGDetailRoundCornerBlock.h, sGDetailRoundCornerBlock.i, sGDetailRoundCornerBlock.j, sGDetailRoundCornerBlock.k);
                }
                sGDetailRoundCornerBlock.l = Boolean.FALSE;
            }
            View i5 = sGDetailRoundCornerBlock.i();
            if (i5 != null) {
                if (z || z2) {
                    sGDetailRoundCornerBlock.l = Boolean.TRUE;
                    i5.setPadding(sGDetailRoundCornerBlock.h, z ? sGDetailRoundCornerBlock.r() : sGDetailRoundCornerBlock.i, sGDetailRoundCornerBlock.j, z2 ? sGDetailRoundCornerBlock.s() : sGDetailRoundCornerBlock.k);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31fe638c25013d43758ead9ff69e4e9b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31fe638c25013d43758ead9ff69e4e9b")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb28f3484fd13316e38d87b8e45f3abb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb28f3484fd13316e38d87b8e45f3abb")).intValue();
        }
        com.sankuai.waimai.store.goods.detail.components.root.b bVar = (com.sankuai.waimai.store.goods.detail.components.root.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (bVar != null) {
            return bVar.b;
        }
        return 0;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final com.sankuai.waimai.store.widgets.recycler.e a(ViewGroup viewGroup, int i) {
        j sGDetailHeaderBlock;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6741886e7c6eea28d2f542b5a8cb2deb", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.widgets.recycler.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6741886e7c6eea28d2f542b5a8cb2deb");
        }
        View view = null;
        if (i == 1) {
            sGDetailHeaderBlock = new SGDetailHeaderBlock(this.c, this.e, this.e.hideHandPrice);
        } else if (i == 22) {
            sGDetailHeaderBlock = new SGSyncRenderMachBlock(this.c);
        } else {
            view = z.a(viewGroup.getContext(), R.layout.wm_sc_view_goods_detail_space, viewGroup, false);
            sGDetailHeaderBlock = null;
        }
        if (sGDetailHeaderBlock != null) {
            j.a(viewGroup, this.d, sGDetailHeaderBlock);
            view = sGDetailHeaderBlock.i();
        }
        return new C1336a(view, sGDetailHeaderBlock);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.v2.detail.component.root.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C1336a extends com.sankuai.waimai.store.widgets.recycler.e {
        public j a;

        public C1336a(View view, j jVar) {
            super(view);
            this.a = jVar;
        }
    }
}
