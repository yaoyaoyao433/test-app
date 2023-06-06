package com.sankuai.waimai.store.poi.list.refactor.generator;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.assembler.component.i;
import com.sankuai.waimai.store.poi.list.refactor.card.float_card.PoiFloatCard;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends c<List<BaseCard>> {
    public static ChangeQuickRedirect a;
    private BaseCard e;

    public e(@NonNull android.arch.lifecycle.f fVar, @NonNull FragmentActivity fragmentActivity) {
        super(fVar, fragmentActivity);
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a94ecb2c3c10256d59660d93613123d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a94ecb2c3c10256d59660d93613123d9");
        }
    }

    public final List<BaseCard> a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc2381ed1b860a89ec299709727c9643", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc2381ed1b860a89ec299709727c9643");
        }
        ArrayList arrayList = new ArrayList();
        if (this.e == null) {
            com.sankuai.waimai.store.assembler.component.c cVar = new com.sankuai.waimai.store.assembler.component.c(this.c, this.d);
            cVar.b = com.sankuai.waimai.store.assembler.component.f.Float;
            cVar.c = new i() { // from class: com.sankuai.waimai.store.poi.list.refactor.generator.e.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.assembler.component.i
                public final BaseCard a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2790f5d9cf2592883b01ecd0e57c592", RobustBitConfig.DEFAULT_VALUE) ? (BaseCard) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2790f5d9cf2592883b01ecd0e57c592") : new PoiFloatCard(e.this.c, e.this.d);
                }
            };
            this.e = cVar.a();
        }
        arrayList.add(this.e);
        return arrayList;
    }
}
