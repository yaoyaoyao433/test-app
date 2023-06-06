package com.meituan.android.hybridcashier;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.util.l;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static Uri a(Uri uri, Map<String, String> map) {
        Object[] objArr = {uri, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4afab52f754b4e46233c3a7f8172067f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4afab52f754b4e46233c3a7f8172067f");
        }
        if (uri == null) {
            return null;
        }
        Uri.Builder buildUpon = Uri.parse(uri.toString()).buildUpon();
        buildUpon.scheme("meituanpayment").authority("hybrid_cashier").path(PackageLoadReporter.Source.LAUNCH).build();
        buildUpon.appendQueryParameter(NeoConfig.NEO_SCENE, "hybrid_cashier");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (TextUtils.isEmpty(entry.getKey())) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        HashMap hashMap = new HashMap();
        l.a(uri, hashMap);
        hashMap.put(HybridSignPayJSHandler.ARG_TRADE_NO, String.valueOf(hashMap.get("trade_number")));
        com.meituan.android.hybridcashier.report.a.a("b_pay_hybrid_cashier_sla_start_sc", com.meituan.android.neohybrid.neo.report.a.a(hashMap).b);
        return uri;
    }
}
