package com.sankuai.waimai.router.generated;

import com.meituan.android.legwork.common.ui.b;
import com.meituan.android.legwork.common.ui.c;
import com.meituan.android.legwork.common.ui.d;
import com.meituan.android.legwork.common.ui.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.IUriAnnotationInit;
import com.sankuai.waimai.router.common.h;
import com.sankuai.waimai.router.core.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UriRouter_RouterUri_38b8dfefa30a590423348ad69c334338 implements IUriAnnotationInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.sankuai.waimai.router.components.b
    public void init(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4937ead6f268573b8759d27599068e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4937ead6f268573b8759d27599068e3");
            return;
        }
        hVar.a("", "", "/legwork/web/coupon", new com.meituan.android.legwork.common.ui.a(), false, new i[0]);
        hVar.a("", "", "/invoice/orderList", new com.meituan.android.legwork.common.ui.a(), false, new i[0]);
        hVar.a("", "", "/legwork/homepage", new b(), false, new i[0]);
        hVar.a("", "", "/legwork/detail", new b(), false, new i[0]);
        hVar.a("", "", "/legwork/order/list", new b(), false, new i[0]);
        hVar.a("", "", "/legwork/orderpage", new b(), false, new i[0]);
        hVar.a("", "", "/paotui/order/submit", new b(), false, new i[0]);
        hVar.a("", "", "/legwork/send/preview", new b(), false, new i[0]);
        hVar.a("", "", "/legwork/mrn/degrade", new b(), false, new i[0]);
        hVar.a("", "", "/legwork/mrn", new b(), false, new i[0]);
        hVar.a("", "", "/chat/1013", new d(), false, new i[0]);
        hVar.a("", "", "/legwork/pay", new e(), false, new i[0]);
        hVar.a("", "", "/legwork/poiConfirm", new c(), false, new i[0]);
    }
}
