package com.sankuai.waimai.store.drug.home.refactor.generator;

import android.arch.lifecycle.f;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.assembler.component.i;
import com.sankuai.waimai.store.drug.home.refactor.card.actionbar.PoiActionBarCard;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends c<BaseCard> {
    public static ChangeQuickRedirect a;
    private BaseCard e;

    public a(@NonNull f fVar, @NonNull FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f4453ee5255e0245655797bfaf18895", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f4453ee5255e0245655797bfaf18895");
        }
    }

    public final BaseCard a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e57f7515fb84240ffc0271b286fa23", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseCard) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e57f7515fb84240ffc0271b286fa23");
        }
        if (this.e == null) {
            com.sankuai.waimai.store.assembler.component.c cVar = new com.sankuai.waimai.store.assembler.component.c(this.c, this.d);
            cVar.b = com.sankuai.waimai.store.assembler.component.f.FloatTitle;
            com.sankuai.waimai.store.assembler.component.c a2 = cVar.a("poi-action-bar-card");
            a2.c = new i() { // from class: com.sankuai.waimai.store.drug.home.refactor.generator.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.assembler.component.i
                public final BaseCard a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a3c5b0413cb5935aec35e4993f85c69", RobustBitConfig.DEFAULT_VALUE) ? (BaseCard) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a3c5b0413cb5935aec35e4993f85c69") : new PoiActionBarCard(a.this.c, a.this.d);
                }
            };
            this.e = a2.a();
        }
        return this.e;
    }
}
