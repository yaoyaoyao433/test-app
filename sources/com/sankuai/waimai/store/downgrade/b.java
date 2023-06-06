package com.sankuai.waimai.store.downgrade;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.base.net.sg.d;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.NetPriceCalculatorResult;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull String str, long j, String str2, @NonNull String str3, @NonNull j<NetPriceCalculatorResult> jVar) {
        Object[] objArr = {str, new Long(j), str2, str3, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6bafbc1fff0818cbc1dfc79051f295ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6bafbc1fff0818cbc1dfc79051f295ab");
            return;
        }
        com.sankuai.waimai.store.shopcart.a aVar = new com.sankuai.waimai.store.shopcart.a(j, str2, jVar);
        Object[] objArr2 = {str, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f99ed1398bb38524876b83a42c183e26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f99ed1398bb38524876b83a42c183e26");
        } else {
            d.a(str).a(str3, aVar);
        }
    }

    public static void a(String str, long j, String str2, @NonNull String str3, @NonNull j<PoiShoppingCartAndPoi> jVar, int i) {
        Object[] objArr = {str, new Long(j), str2, str3, jVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "782c52c2ce85d0e68dcd247962640884", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "782c52c2ce85d0e68dcd247962640884");
        } else {
            b(str, j, str2, str3, new com.sankuai.waimai.store.shopcart.b(j, str2, jVar), i);
        }
    }

    private static void b(String str, long j, String str2, @NonNull String str3, @NonNull j<PoiShoppingCartAndPoi> jVar, int i) {
        d a2;
        Object[] objArr = {str, new Long(j), str2, str3, jVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65871cc23043f19203b401b3d5c68f27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65871cc23043f19203b401b3d5c68f27");
            return;
        }
        if (t.a(str)) {
            a2 = new d();
        } else {
            a2 = d.a(str);
        }
        a2.a(String.valueOf(j), str2, str3, jVar, i);
    }
}
