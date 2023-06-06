package com.meituan.android.legwork.monitor.report;

import com.meituan.android.legwork.monitor.report.ReportService;
import com.meituan.android.legwork.monitor.report.channel.dao.DaBaiDao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements d.a {
    public static ChangeQuickRedirect a;
    private static final a b = new a();

    public static d.a a() {
        return b;
    }

    @Override // rx.functions.b
    public final void call(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0007d3eff7875b7af076a19ff80d4b28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0007d3eff7875b7af076a19ff80d4b28");
            return;
        }
        Object[] objArr2 = {(j) obj};
        ChangeQuickRedirect changeQuickRedirect2 = ReportService.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "945b3ffc45374d5dbd0206f9c5a7fdc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "945b3ffc45374d5dbd0206f9c5a7fdc8");
        } else {
            DaBaiDao.getInstance().deleteAll();
        }
    }
}
