package com.sankuai.titans.base;

import android.webkit.JavascriptInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.report.TitansReportInfo;
import com.sankuai.titans.protocol.utils.JsonUtils;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KNBTitansXSync {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final TitansReportInfo.Builder builder;

    public KNBTitansXSync() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "597a3161293e47bf37151d37507f9c6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "597a3161293e47bf37151d37507f9c6e");
            return;
        }
        this.builder = new TitansReportInfo.Builder();
        this.builder.setTitansVersion("20.14.1");
    }

    @JavascriptInterface
    public String getTitansReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99d87e58904d4703bf6697e8c291cf64", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99d87e58904d4703bf6697e8c291cf64") : JsonUtils.getExcludeGson().toJson(this.builder.create());
    }
}
