package com.sankuai.waimai.store.drug.home.refactor.card.float_card;

import android.arch.lifecycle.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.home.refactor.card.float_card.order.OrderMessageEntity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class e implements l {
    public static ChangeQuickRedirect a;
    private final PoiFloatCard b;

    public e(PoiFloatCard poiFloatCard) {
        this.b = poiFloatCard;
    }

    @Override // android.arch.lifecycle.l
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bac7b333eb6108cf793675266ca6983", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bac7b333eb6108cf793675266ca6983");
        } else {
            PoiFloatCard.a(this.b, (OrderMessageEntity) obj);
        }
    }
}
