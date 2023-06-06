package com.sankuai.waimai.store.drug.home.refactor.generator;

import android.arch.lifecycle.f;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.assembler.component.i;
import com.sankuai.waimai.store.drug.home.refactor.card.background.PoiBackgroundCard;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends c<BaseCard> {
    public static ChangeQuickRedirect a;
    private BaseCard e;

    public b(@NonNull f fVar, @NonNull FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79a24f95bc4cfdfebae9ce65d60a9be9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79a24f95bc4cfdfebae9ce65d60a9be9");
        }
    }

    public final BaseCard a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "403ec05c9da150a890e3daf6b5b2b472", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseCard) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "403ec05c9da150a890e3daf6b5b2b472");
        }
        if (this.e == null) {
            com.sankuai.waimai.store.assembler.component.c cVar = new com.sankuai.waimai.store.assembler.component.c(this.c, this.d);
            cVar.b = com.sankuai.waimai.store.assembler.component.f.Background;
            cVar.c = new i() { // from class: com.sankuai.waimai.store.drug.home.refactor.generator.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.assembler.component.i
                public final BaseCard a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27bd710ee99b4eb16c198ec9a4005b98", RobustBitConfig.DEFAULT_VALUE) ? (BaseCard) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27bd710ee99b4eb16c198ec9a4005b98") : new PoiBackgroundCard(b.this.c, b.this.d);
                }
            };
            this.e = cVar.a();
        }
        return this.e;
    }
}
