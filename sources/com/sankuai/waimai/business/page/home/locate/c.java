package com.sankuai.waimai.business.page.home.locate;

import android.os.Build;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.e;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static int b;
    private static int c;

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15dfa813b521bbc203b4d9a15026cbfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15dfa813b521bbc203b4d9a15026cbfe");
            return;
        }
        b = z ? 5000 : MapConstant.LayerPropertyFlag_HeatmapRadius;
        String b2 = com.sankuai.waimai.business.page.common.abtest.a.b();
        char c2 = 65535;
        switch (b2.hashCode()) {
            case 65:
                if (b2.equals("A")) {
                    c2 = 0;
                    break;
                }
                break;
            case 66:
                if (b2.equals(ErrorCode.ERROR_TYPE_B)) {
                    c2 = 1;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                c = 2;
                return;
            case 1:
                c = 1;
                return;
            default:
                c = 0;
                return;
        }
    }

    public static void a(int i) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f00e2147f3052e8edc0ffd281bd6f2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f00e2147f3052e8edc0ffd281bd6f2f");
        } else if (i != 0) {
            if (i >= 6) {
                i += c * 10;
            }
            e.c().a(b + i, 100, "wm_home_address_alert");
        } else {
            WMLocation i2 = g.a().i();
            if (Build.VERSION.SDK_INT >= 23 && (i2 == null || !i2.hasLocatedPermission)) {
                z = false;
            }
            e.c().a(b != 5000 ? z ? 6030 : MapConstant.LayerPropertyFlag_HeatmapRadius : 5000, 100, "wm_home_address_alert");
        }
    }
}
