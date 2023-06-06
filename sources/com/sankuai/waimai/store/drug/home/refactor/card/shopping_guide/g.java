package com.sankuai.waimai.store.drug.home.refactor.card.shopping_guide;

import android.arch.lifecycle.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class g implements l {
    public static ChangeQuickRedirect a;
    private final PoiNativeCommonCard b;

    public g(PoiNativeCommonCard poiNativeCommonCard) {
        this.b = poiNativeCommonCard;
    }

    @Override // android.arch.lifecycle.l
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8ae8589e37eeeface5382fcf24165b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8ae8589e37eeeface5382fcf24165b7");
        } else {
            PoiNativeCommonCard.a(this.b, (Boolean) obj);
        }
    }
}
