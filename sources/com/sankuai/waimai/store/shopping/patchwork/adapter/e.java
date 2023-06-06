package com.sankuai.waimai.store.shopping.patchwork.adapter;

import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.cell.core.CellUiConfig;
import com.sankuai.waimai.store.cell.view.SpuBaseCellView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.util.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.widgets.recycler.e implements com.sankuai.waimai.store.cell.core.b {
    public static ChangeQuickRedirect a;
    @NonNull
    final SpuBaseCellView b;
    @NonNull
    private final d c;

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, h hVar, int i) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, int i) {
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void c(GoodsSpu goodsSpu, int i) {
    }

    public e(@NonNull SpuBaseCellView spuBaseCellView, @NonNull d dVar, GoodDetailResponse goodDetailResponse) {
        super(spuBaseCellView);
        Object[] objArr = {spuBaseCellView, dVar, goodDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "622c6680fc309fabfea081cecad89998", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "622c6680fc309fabfea081cecad89998");
            return;
        }
        this.c = dVar;
        this.b = spuBaseCellView;
        SpuBaseCellView spuBaseCellView2 = this.b;
        CellUiConfig a2 = CellUiConfig.a();
        a2.d = 2;
        spuBaseCellView2.setCellConfig(a2);
        this.b.setPoiHelper(this.c.f());
        this.b.setGoodDetailResponse(goodDetailResponse);
        this.b.setActionCallback(this);
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bd9c146a9c307970b1e88e561aa5954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bd9c146a9c307970b1e88e561aa5954");
        } else {
            this.c.c(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, View view, h hVar, int i) {
        Object[] objArr = {goodsSpu, view, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b55f0f335814a50df3191b4cc007fb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b55f0f335814a50df3191b4cc007fb8");
        } else {
            this.c.a(goodsSpu, view, i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "078c4caf580274c351eb1c91efbf0807", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "078c4caf580274c351eb1c91efbf0807");
        } else {
            this.c.b(goodsSpu, i);
        }
    }
}
