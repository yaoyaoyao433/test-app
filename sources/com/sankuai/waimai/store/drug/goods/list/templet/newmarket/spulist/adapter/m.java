package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.cell.view.InnerCellView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class m extends com.sankuai.waimai.store.newwidgets.list.g<e, d> implements com.sankuai.waimai.store.cell.core.b {
    public static ChangeQuickRedirect b;
    private InnerCellView a;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public void a(e eVar, int i) {
        int a;
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92274c3c306ef22cdd6197f8ca10f4e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92274c3c306ef22cdd6197f8ca10f4e7");
        } else if (eVar == null || eVar.d == null) {
        } else {
            Poi poi = ((d) this.o).n() == null ? null : ((d) this.o).n().b;
            this.a.a(((d) this.o).d(eVar.d), ((d) this.o).e(eVar.d));
            if (eVar.b != null && ((d) this.o).n() != null && !TextUtils.isEmpty(((d) this.o).n().u())) {
                eVar.d.mPriceOptAB = ((d) this.o).n().j;
                a(4, com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d.FONT_STYLE_32);
            } else if (eVar.d.handPriceInfo != null && eVar.d.handPriceInfo.isShowNewStyle()) {
                eVar.d.mPriceOptAB = null;
                a(0, com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d.FONT_STYLE_32);
            }
            InnerCellView innerCellView = this.a;
            GoodsSpu goodsSpu = eVar.d;
            GoodsPoiCategory goodsPoiCategory = eVar.b;
            GoodsPoiCategory goodsPoiCategory2 = eVar.b;
            GoodsSpu goodsSpu2 = eVar.d;
            Object[] objArr2 = {goodsPoiCategory2, goodsSpu2};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            int i2 = -1;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "382a86270c495fb5b1b234dbcdd951fc", RobustBitConfig.DEFAULT_VALUE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "382a86270c495fb5b1b234dbcdd951fc")).intValue();
            } else if (goodsPoiCategory2 != null && goodsPoiCategory2.activityTag != null && goodsPoiCategory2.activityTag.contains("hotsale_food") && (a = ((d) this.o).a(goodsPoiCategory2, goodsSpu2)) >= 0) {
                i2 = 1 + a;
            }
            innerCellView.a(goodsSpu, goodsPoiCategory, i, i2);
            ((d) this.o).a(eVar, this.a, com.sankuai.waimai.store.util.k.a(poi, eVar.d));
            ((d) this.o).a(eVar.d.id);
        }
    }

    private void a(int i, com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d dVar) {
        Object[] objArr = {Integer.valueOf(i), dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abf69ca39274931df9d115583a2b57b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abf69ca39274931df9d115583a2b57b3");
            return;
        }
        com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b a = com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.b.a();
        a.b = i;
        a.d = dVar;
        this.a.setHandPriceConfig(a);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public void a(@NonNull View view) {
        this.a = (InnerCellView) view;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe6acd45452d7ab2265ef87461a31af6", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe6acd45452d7ab2265ef87461a31af6");
        }
        InnerCellView b2 = b(viewGroup);
        b2.setPoiHelper(((d) this.o).n());
        b2.setActionCallback(this);
        return b2;
    }

    public InnerCellView b(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ad5e467790d2aa2d950906066a2afd3", RobustBitConfig.DEFAULT_VALUE) ? (InnerCellView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ad5e467790d2aa2d950906066a2afd3") : new InnerCellView(viewGroup.getContext());
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, com.sankuai.waimai.store.util.h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1952db55f9891ac480d9a81d4f7a5bb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1952db55f9891ac480d9a81d4f7a5bb5");
        } else {
            ((d) this.o).a(goodsSpu, this.a.getGoodImageRatio(), i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b7213be853b1c9a2cce2b59784bc899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b7213be853b1c9a2cce2b59784bc899");
        } else {
            ((d) this.o).a(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, View view, com.sankuai.waimai.store.util.h hVar, int i) {
        Object[] objArr = {goodsSpu, view, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf055566bfe6327ed052c67bca0a00f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf055566bfe6327ed052c67bca0a00f8");
            return;
        }
        ((d) this.o).a(goodsSpu, view, i);
        ((d) this.o).c(true);
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, com.sankuai.waimai.store.util.h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46f073c143d62f8eeb07b8d2331c57ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46f073c143d62f8eeb07b8d2331c57ee");
        } else {
            ((d) this.o).d(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edad1f1b0dc3e6d57e3ac2a14c84d70e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edad1f1b0dc3e6d57e3ac2a14c84d70e");
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.poi.a n = ((d) this.o).n();
        Context context = this.a.getContext();
        if (goodsSpu == null || n == null || !(context instanceof SCBaseActivity)) {
            return;
        }
        ((d) this.o).b(goodsSpu);
        com.sankuai.waimai.store.goods.subscribe.a.a().a((SCBaseActivity) context, n.f(), n.h(), goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), null);
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab5b5876126430b8fcd7182b85e58411", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab5b5876126430b8fcd7182b85e58411");
        } else {
            ((d) this.o).b(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void c(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "278d05961beec4ebfc4ed707be9fb5c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "278d05961beec4ebfc4ed707be9fb5c7");
        } else {
            ((d) this.o).c(goodsSpu, i);
        }
    }
}
