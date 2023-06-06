package com.sankuai.waimai.business.order.api.submit.constants;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6357c65b3b7a45a8ce2fcf0edcc2454a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6357c65b3b7a45a8ce2fcf0edcc2454a")).booleanValue() : "from_restaurant".equals(str) || "from_sc_restaurant".equals(str) || "from_drug_restaurant".equals(str);
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1704a8f99d4f36ed620fe761e0bef556", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1704a8f99d4f36ed620fe761e0bef556")).booleanValue() : "from_sc_restaurant".equals(str) || "from_drug_restaurant".equals(str);
    }

    public static boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f6bdbdad299fa47765247d887942675", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f6bdbdad299fa47765247d887942675")).booleanValue() : "from_mrn_cross_order".equals(str);
    }

    public static boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f8b823f88104d4f3f8a39ba7794b42f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f8b823f88104d4f3f8a39ba7794b42f")).booleanValue() : "from_h5_order".equals(str);
    }

    public static boolean e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd6390dc099dc54e4adaebd9e4431587", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd6390dc099dc54e4adaebd9e4431587")).booleanValue() : "from_multi_order".equals(str);
    }
}
