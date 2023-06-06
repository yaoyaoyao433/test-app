package com.sankuai.waimai.store.poi.list.refactor.generator;

import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.assembler.component.i;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiNearByTitleCard;
import com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.PoiPageContainerCard4;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends c<List<BaseCard>> {
    public static ChangeQuickRedirect a;
    private BaseCard e;
    private BaseCard f;
    private com.sankuai.waimai.store.param.a g;

    public d(@NonNull android.arch.lifecycle.f fVar, @NonNull FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fd81ae552fbd7f62d80d294b69996b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fd81ae552fbd7f62d80d294b69996b1");
        } else {
            this.g = ((PoiPageViewModel) q.a(fragmentActivity).a(PoiPageViewModel.class)).d.a();
        }
    }

    public final List<BaseCard> a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa48e1d47adfa06bc74758c718782876", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa48e1d47adfa06bc74758c718782876");
        }
        ArrayList arrayList = new ArrayList();
        if (poiVerticalityDataResponse.subNaviInfo == null || com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.b.a(this.g, poiVerticalityDataResponse.subNaviInfo.categoryInfos)) {
            if (this.e == null) {
                com.sankuai.waimai.store.assembler.component.c cVar = new com.sankuai.waimai.store.assembler.component.c(this.c, this.d);
                cVar.b = com.sankuai.waimai.store.assembler.component.f.Normal;
                cVar.c = new i() { // from class: com.sankuai.waimai.store.poi.list.refactor.generator.d.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.assembler.component.i
                    public final BaseCard a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09983b19e250a45814f3cc5e2dd56517", RobustBitConfig.DEFAULT_VALUE) ? (BaseCard) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09983b19e250a45814f3cc5e2dd56517") : new PoiNearByTitleCard(d.this.c, d.this.d);
                    }
                };
                this.e = cVar.a();
            }
            arrayList.add(this.e);
        }
        if (this.f == null) {
            com.sankuai.waimai.store.assembler.component.c cVar2 = new com.sankuai.waimai.store.assembler.component.c(this.c, this.d);
            cVar2.b = com.sankuai.waimai.store.assembler.component.f.MultiList;
            cVar2.c = new i() { // from class: com.sankuai.waimai.store.poi.list.refactor.generator.d.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.assembler.component.i
                public final BaseCard a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "350d10dd753dcd5b86eea78ac015fd62", RobustBitConfig.DEFAULT_VALUE) ? (BaseCard) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "350d10dd753dcd5b86eea78ac015fd62") : new PoiPageContainerCard4(d.this.c, d.this.d);
                }
            };
            this.f = cVar2.a();
        }
        arrayList.add(this.f);
        return arrayList;
    }
}
