package com.sankuai.waimai.store.drug.home.refactor.card.float_card;

import android.arch.lifecycle.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements l {
    public static ChangeQuickRedirect a;
    private final PoiFloatCard b;

    public d(PoiFloatCard poiFloatCard) {
        this.b = poiFloatCard;
    }

    @Override // android.arch.lifecycle.l
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0035586679cb68c062fecb5269c3c36f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0035586679cb68c062fecb5269c3c36f");
        } else {
            PoiFloatCard.a(this.b, (b) obj);
        }
    }
}
