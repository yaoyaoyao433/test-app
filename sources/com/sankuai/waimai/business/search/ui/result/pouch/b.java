package com.sankuai.waimai.business.search.ui.result.pouch;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static Set b = new HashSet();

    public static void a(PouchDynamicAd pouchDynamicAd) {
        Object[] objArr = {pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c030ab0a65eff6d283a724709ace3df9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c030ab0a65eff6d283a724709ace3df9");
        } else if (pouchDynamicAd == null || pouchDynamicAd.getPouchAds() == null) {
        } else {
            pouchDynamicAd.getPouchAds().a();
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4fc627a31c88d373cfb29b10d041342", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4fc627a31c88d373cfb29b10d041342");
        } else {
            b.clear();
        }
    }
}
