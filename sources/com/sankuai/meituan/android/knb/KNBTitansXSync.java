package com.sankuai.meituan.android.knb;

import android.webkit.JavascriptInterface;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.service.GsonProvider;
import com.dianping.titans.utils.TitansReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.TitansReport;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBTitansXSync {
    public static ChangeQuickRedirect changeQuickRedirect;
    private JsHost jsHost;

    public KNBTitansXSync(JsHost jsHost) {
        Object[] objArr = {jsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd2a14091848216972da2dafa345fa12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd2a14091848216972da2dafa345fa12");
        } else {
            this.jsHost = jsHost;
        }
    }

    @JavascriptInterface
    public String getTitansReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bb13c359cc0c02977ab09c6ed97542f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bb13c359cc0c02977ab09c6ed97542f");
        }
        TitansReport.Builder reportBuilder = TitansReporter.getReportBuilder(this.jsHost);
        return reportBuilder == null ? "" : GsonProvider.getGson().toJson(reportBuilder.create());
    }
}
