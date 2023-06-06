package com.sankuai.waimai.store.v2.detail.component.pricebar;

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
import com.sankuai.waimai.store.repository.model.DetailSortStyle;
import com.sankuai.waimai.store.repository.model.GoodDetailPoiInformation;
/* compiled from: ProGuard */
@Cube(events = {com.sankuai.waimai.store.shopping.cart.Event.a.class, c.class, d.class, f.class})
/* loaded from: classes5.dex */
public class SGDetailPriceBarBlock extends a implements com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect g;

    @Override // com.sankuai.waimai.store.v2.detail.component.pricebar.b.InterfaceC1335b
    public final void a(@NonNull g gVar) {
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "289bc329d8841c3e5f80b057b2cd7eb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "289bc329d8841c3e5f80b057b2cd7eb1");
        }
    }

    public SGDetailPriceBarBlock(@NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, boolean z, @NonNull DetailSortStyle detailSortStyle, GoodDetailPoiInformation goodDetailPoiInformation) {
        Object[] objArr = {aVar, (byte) 0, detailSortStyle, goodDetailPoiInformation};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d48373c508704d4fed1cccb128beaa2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d48373c508704d4fed1cccb128beaa2d");
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da7bbe605717d37fc4292bd32b63dbbd", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da7bbe605717d37fc4292bd32b63dbbd") : layoutInflater.inflate(R.layout.wm_sc_goods_detail_price, viewGroup, false);
    }

    @Override // com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c89efd67ebf05e24f073511bd06a63f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c89efd67ebf05e24f073511bd06a63f");
        } else {
            super.a_(view);
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a493bdc0a7484ebf208ace512d315b76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a493bdc0a7484ebf208ace512d315b76");
            return;
        }
        super.bE_();
        com.sankuai.waimai.store.order.a.e().b(this);
    }
}
