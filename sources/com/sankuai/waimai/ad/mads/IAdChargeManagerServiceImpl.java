package com.sankuai.waimai.ad.mads;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.monitor.b;
import com.sankuai.waimai.report.IAdChargeManagerService;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IAdChargeManagerServiceImpl implements IAdChargeManagerService {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.report.IAdChargeManagerService
    public final void a(String str, String str2, int i, String str3, String str4) {
        Object[] objArr = {str, str2, Integer.valueOf(i), str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b9f32d7128712c72a3e109c4d5705f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b9f32d7128712c72a3e109c4d5705f3");
        } else {
            b.a(str, str2, i, str3, str4);
        }
    }

    @Override // com.sankuai.waimai.report.IAdChargeManagerService
    public final void a(Map<String, Object> map, String str, String str2) {
        Object[] objArr = {map, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99e7387a6aaefd700ec85a3d750d024f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99e7387a6aaefd700ec85a3d750d024f");
        } else {
            b.a(map, str, str2);
        }
    }

    @Override // com.sankuai.waimai.report.IAdChargeManagerService
    public final String a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63af6d140005ff683b2bb6d87f391a1f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63af6d140005ff683b2bb6d87f391a1f") : b.a(str, str2, str3);
    }
}
