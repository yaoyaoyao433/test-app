package com.sankuai.waimai.drug.patch.viewHolder;

import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.patch.contract.c;
import com.sankuai.waimai.store.cell.core.CellUiConfig;
import com.sankuai.waimai.store.cell.view.SpuBaseCellView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.util.h;
import com.sankuai.waimai.store.widgets.recycler.e;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends e implements com.sankuai.waimai.store.cell.core.b {
    public static ChangeQuickRedirect a;
    @NonNull
    private final SpuBaseCellView b;
    @NonNull
    private final c c;
    private String d;

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

    public b(@NonNull SpuBaseCellView spuBaseCellView, @NonNull c cVar, GoodDetailResponse goodDetailResponse) {
        super(spuBaseCellView);
        Object[] objArr = {spuBaseCellView, cVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69cb2499977816f8324548588cc3aded", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69cb2499977816f8324548588cc3aded");
            return;
        }
        this.c = cVar;
        this.b = spuBaseCellView;
        SpuBaseCellView spuBaseCellView2 = this.b;
        CellUiConfig a2 = CellUiConfig.a();
        a2.d = 2;
        spuBaseCellView2.setCellConfig(a2);
        this.b.setPoiHelper(this.c.j());
        this.b.setGoodDetailResponse(null);
        this.b.setActionCallback(this);
    }

    public final void a(GoodsSpu goodsSpu, String str, int i) {
        Object[] objArr = {goodsSpu, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dd257f3169d6323d6f1ec9c01db2504", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dd257f3169d6323d6f1ec9c01db2504");
            return;
        }
        if (goodsSpu != null) {
            this.b.a(goodsSpu, i);
        }
        this.d = str;
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, int i) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce856b0e90f6ad8607caf44b642f4a02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce856b0e90f6ad8607caf44b642f4a02");
        } else {
            this.c.b(goodsSpu, i);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void a(GoodsSpu goodsSpu, View view, h hVar, int i) {
        Object[] objArr = {goodsSpu, view, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ab1515e415287e1e8e7ed64ddbad453", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ab1515e415287e1e8e7ed64ddbad453");
        } else {
            this.c.a(goodsSpu, view, i, this.d);
        }
    }

    @Override // com.sankuai.waimai.store.cell.core.b
    public final void b(GoodsSpu goodsSpu, h hVar, int i) {
        Object[] objArr = {goodsSpu, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f25c3f9f1aac753fa6c4f2f7b0f00610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f25c3f9f1aac753fa6c4f2f7b0f00610");
        } else {
            this.c.a(goodsSpu, i);
        }
    }
}
