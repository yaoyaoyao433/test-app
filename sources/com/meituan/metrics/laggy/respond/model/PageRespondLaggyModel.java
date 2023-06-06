package com.meituan.metrics.laggy.respond.model;

import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.KiteFly;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PageRespondLaggyModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    private SingleRespondLaggyModel mrnLaggyModel;
    private final SingleRespondLaggyModel nativeLaggyModel;

    public PageRespondLaggyModel(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53d904238cd7a422dffecb9f3169b420", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53d904238cd7a422dffecb9f3169b420");
        } else {
            this.nativeLaggyModel = new SingleRespondLaggyModel(str);
        }
    }

    public void initJSRespondLaggyModel(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea4a66b4d1e8f39e1b735c7a9cff3b2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea4a66b4d1e8f39e1b735c7a9cff3b2a");
        } else if (this.mrnLaggyModel == null) {
            this.mrnLaggyModel = new SingleRespondLaggyModel(str, str2, str3, str4);
        }
    }

    public void putNativeLaggyTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "374d7c10bc1061556207cc713c929990", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "374d7c10bc1061556207cc713c929990");
        } else {
            this.nativeLaggyModel.addLaggyTime(j);
        }
    }

    public void putMRNLaggyTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15b4e0942cb49e2aa2b94b424ea1a953", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15b4e0942cb49e2aa2b94b424ea1a953");
        } else if (this.mrnLaggyModel != null) {
            this.mrnLaggyModel.addLaggyTime(j);
        }
    }

    public void addOnesNativeRespond() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58201219203a43ce6e9da77d68450cfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58201219203a43ce6e9da77d68450cfb");
        } else {
            this.nativeLaggyModel.addOnesRespond();
        }
    }

    public void addOnesMRNRespond() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d6f52855f0a72339c4bbca9c9a21457", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d6f52855f0a72339c4bbca9c9a21457");
        } else if (this.mrnLaggyModel != null) {
            this.mrnLaggyModel.addOnesRespond();
        }
    }

    public void report(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b5df13db0cffebb607ae36ffe4f7470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b5df13db0cffebb607ae36ffe4f7470");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("isANR", Boolean.valueOf(z));
            this.nativeLaggyModel.addReportData(hashMap);
            int laggyCount = this.nativeLaggyModel.getLaggyCount();
            if (this.mrnLaggyModel != null) {
                this.mrnLaggyModel.addReportData(hashMap);
                laggyCount += this.mrnLaggyModel.getLaggyCount();
            }
            Babel.log(new Log.Builder("").tag("metricx.response.laggy.report.v1").optional(hashMap).generalChannelStatus(true).value(laggyCount).build());
            if (KiteFly.isDebug) {
                ILogger metricsLogger = Logger.getMetricsLogger();
                metricsLogger.d("卡顿上报 " + new JSONObject(hashMap).toString());
            }
        } catch (Exception unused) {
        }
    }
}
