package com.meituan.android.legwork;

import com.meituan.android.legwork.bean.monitor.FuncConfigResult;
import com.meituan.android.legwork.monitor.report.ReportService;
import com.meituan.android.legwork.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.provider.AccountEventProvider;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LegworkAccountEventProvider implements AccountEventProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.provider.AccountEventProvider
    public void logOff() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9f0e7713be01c5c0e3b382e0f10dd30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9f0e7713be01c5c0e3b382e0f10dd30");
            return;
        }
        com.meituan.android.legwork.common.util.a a = com.meituan.android.legwork.common.util.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.common.util.a.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "a712de94927cf8db4b102fa4518b23ac", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "a712de94927cf8db4b102fa4518b23ac")).booleanValue() : a.a(a.b, FuncConfigResult.LEGWORK_ACCOUNT_EVENT_CLEAR_DEGRADE)) {
            return;
        }
        ReportService.deleteAllData();
        z.b(a.a());
    }
}
