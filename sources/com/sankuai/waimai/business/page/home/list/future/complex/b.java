package com.sankuai.waimai.business.page.home.list.future.complex;

import android.content.Context;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a = null;
    private static final String c = "b";
    private static final b d = new b();
    MetricsSpeedMeterTask b;

    public static b a() {
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f54cba4873cfd0331ad869249d8d955", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f54cba4873cfd0331ad869249d8d955");
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79c864daa28e8c29d3b68f84c620441b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79c864daa28e8c29d3b68f84c620441b");
        } else if (this.b != null) {
            this.b.disable();
            this.b = null;
        }
    }
}
