package com.sankuai.waimai.store.drug.home.new_home.generator;

import android.arch.lifecycle.f;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.assembler.component.i;
import com.sankuai.waimai.store.drug.home.new_home.NewDrugHomeFeedFlowCard;
import com.sankuai.waimai.store.drug.home.refactor.generator.c;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends c<List<BaseCard>> {
    public static ChangeQuickRedirect a;
    private BaseCard e;

    public a(@NonNull f fVar, @NonNull FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd43bbb982528c68fefe43b293b532bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd43bbb982528c68fefe43b293b532bd");
        }
    }

    public final List<BaseCard> a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e52738893d0fef4aa50a417d5309182f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e52738893d0fef4aa50a417d5309182f");
        }
        ArrayList arrayList = new ArrayList();
        if (this.e == null) {
            com.sankuai.waimai.store.assembler.component.c cVar = new com.sankuai.waimai.store.assembler.component.c(this.c, this.d);
            cVar.b = com.sankuai.waimai.store.assembler.component.f.MultiList;
            cVar.c = new i() { // from class: com.sankuai.waimai.store.drug.home.new_home.generator.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.assembler.component.i
                public final BaseCard a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fd33facedd312999b4ed08734545363", RobustBitConfig.DEFAULT_VALUE) ? (BaseCard) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fd33facedd312999b4ed08734545363") : new NewDrugHomeFeedFlowCard(a.this.c, a.this.d);
                }
            };
            this.e = cVar.a();
        }
        arrayList.add(this.e);
        return arrayList;
    }
}
