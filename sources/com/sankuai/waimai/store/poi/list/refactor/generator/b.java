package com.sankuai.waimai.store.poi.list.refactor.generator;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.assembler.component.i;
import com.sankuai.waimai.store.poi.list.refactor.card.background.PoiBackgroundCard2;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends c<BaseCard> {
    public static ChangeQuickRedirect a;
    private BaseCard e;

    public b(@NonNull android.arch.lifecycle.f fVar, @NonNull FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd1e25cd0d9b4738da591150e816592c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd1e25cd0d9b4738da591150e816592c");
        }
    }

    public final BaseCard a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff3245a45da09a8f0e72bc515d4f73ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseCard) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff3245a45da09a8f0e72bc515d4f73ff");
        }
        if (this.e == null) {
            com.sankuai.waimai.store.assembler.component.c cVar = new com.sankuai.waimai.store.assembler.component.c(this.c, this.d);
            cVar.b = com.sankuai.waimai.store.assembler.component.f.Background;
            cVar.c = new i() { // from class: com.sankuai.waimai.store.poi.list.refactor.generator.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.assembler.component.i
                public final BaseCard a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75c190167a46d97b7613d0befd60c191", RobustBitConfig.DEFAULT_VALUE) ? (BaseCard) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75c190167a46d97b7613d0befd60c191") : new PoiBackgroundCard2(b.this.c, b.this.d);
                }
            };
            this.e = cVar.a();
        }
        return this.e;
    }
}
