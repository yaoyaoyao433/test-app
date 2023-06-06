package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

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
public class t extends com.sankuai.waimai.store.newwidgets.list.g<k, j> implements com.sankuai.waimai.store.cell.core.b {
    public static ChangeQuickRedirect b;
    private InnerCellView a;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public void a(k kVar, int i) {
        int a;
        Object[] objArr = {kVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcb1ea8502f5be668b830b0cef48b541", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcb1ea8502f5be668b830b0cef48b541");
        } else if (kVar == null || kVar.d == null) {
        } else {
            Poi poi = ((j) this.o).p() == null ? null : ((j) this.o).p().b;
            this.a.a(((j) this.o).b(kVar.d), ((j) this.o).c(kVar.d));
            if (kVar.b != null && ((j) this.o).p() != null && !TextUtils.isEmpty(((j) this.o).p().u())) {
                kVar.d.mPriceOptAB = ((j) this.o).p().j;
                a(4, com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d.FONT_STYLE_32);
            } else if (kVar.d.handPriceInfo != null && kVar.d.handPriceInfo.isShowNewStyle()) {
                a(0, com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d.FONT_STYLE_32);
            }
            InnerCellView innerCellView = this.a;
            GoodsSpu goodsSpu = kVar.d;
            GoodsPoiCategory goodsPoiCategory = kVar.b;
            GoodsPoiCategory goodsPoiCategory2 = kVar.b;
            GoodsSpu goodsSpu2 = kVar.d;
            Object[] objArr2 = {goodsPoiCategory2, goodsSpu2};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            int i2 = -1;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c1866da47a500a4b0be3dbfb57ba2ed", RobustBitConfig.DEFAULT_VALUE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c1866da47a500a4b0be3dbfb57ba2ed")).intValue();
            } else if (goodsPoiCategory2 != null && goodsPoiCategory2.activityTag != null && goodsPoiCategory2.activityTag.contains("hotsale_food") && (a = ((j) this.o).a(goodsPoiCategory2, goodsSpu2)) >= 0) {
                i2 = 1 + a;
            }
            innerCellView.a(goodsSpu, goodsPoiCategory, i, i2);
            ((j) this.o).a(kVar, this.a, com.sankuai.waimai.store.util.k.a(poi, kVar.d));
            ((j) this.o).a(kVar.d.id);
        }
    }

    private void a(int i, com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.d dVar) {
        Object[] objArr = {Integer.valueOf(i), dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca3ce9b04dbd2f0902050c872ed1e3fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca3ce9b04dbd2f0902050c872ed1e3fb");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1582c84035cef31c432f845cd97d915", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1582c84035cef31c432f845cd97d915");
        }
        InnerCellView b2 = b(viewGroup);
        b2.setPoiHelper(((j) this.o).p());
        b2.setActionCallback(this);
        return b2;
    }

    public InnerCellView b(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a588de8a2203ce5fd1af133c55592ee7", RobustBitConfig.DEFAULT_VALUE) ? (InnerCellView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a588de8a2203ce5fd1af133c55592ee7") : new InnerCellView(viewGroup.getContext());
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, com.sankuai.waimai.store.util.h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62b985435c676f06d6306a3975044d86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62b985435c676f06d6306a3975044d86");
        } else {
            ((j) this.o).a(goodsSpu, this.a.getGoodImageRatio(), i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0db2c6b76e2181aa6ec297c894afe73e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0db2c6b76e2181aa6ec297c894afe73e");
        } else {
            ((j) this.o).a(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, View view, com.sankuai.waimai.store.util.h hVar, int i) {
        Object[] objArr = {goodsSpu, view, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f210bc33a780004b17a71d6c760d59d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f210bc33a780004b17a71d6c760d59d1");
            return;
        }
        ((j) this.o).a(goodsSpu, view, i);
        ((j) this.o).c(true);
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, com.sankuai.waimai.store.util.h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5e90bcac72bbc414a424c8e28637eab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5e90bcac72bbc414a424c8e28637eab");
        } else {
            ((j) this.o).d(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87f112442ebc2baa2ece62ebf4402335", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87f112442ebc2baa2ece62ebf4402335");
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.poi.a p = ((j) this.o).p();
        Context context = this.a.getContext();
        if (goodsSpu == null || p == null || !(context instanceof SCBaseActivity)) {
            return;
        }
        ((j) this.o).a(goodsSpu);
        com.sankuai.waimai.store.goods.subscribe.a.a().a((SCBaseActivity) context, p.f(), p.h(), goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), null);
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57a71592a103c626fe8cb8dead128cac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57a71592a103c626fe8cb8dead128cac");
        } else {
            ((j) this.o).b(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void c(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed4c07c8fdea8fc6ca7f7ad8a5df0aa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed4c07c8fdea8fc6ca7f7ad8a5df0aa3");
        } else {
            ((j) this.o).c(goodsSpu, i);
        }
    }
}
