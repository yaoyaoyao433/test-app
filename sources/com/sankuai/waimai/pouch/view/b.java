package com.sankuai.waimai.pouch.view;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static PouchAdView a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef173424c9b9c2432d15aa289abfd192", RobustBitConfig.DEFAULT_VALUE)) {
            return (PouchAdView) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef173424c9b9c2432d15aa289abfd192");
        }
        if (TextUtils.isEmpty(str)) {
            str = PouchDynamicAd.CONTAINER_ID_POUCH_COMMON;
        }
        List a2 = com.sankuai.meituan.serviceloader.b.a(PouchAdView.class, str);
        if (a2 == null || a2.isEmpty()) {
            return null;
        }
        return (PouchAdView) a2.get(0);
    }
}
