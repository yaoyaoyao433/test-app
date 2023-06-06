package com.dianping.titans.offline.entity;

import android.webkit.WebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class OfflineResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String errorMsg;
    public OfflineRuleItem offlineRuleItem;
    private long startTime;
    public WebResourceResponse webResourceResponse;

    public OfflineResponse(OfflineRuleItem offlineRuleItem, WebResourceResponse webResourceResponse) {
        Object[] objArr = {offlineRuleItem, webResourceResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5ce1b8af7fb12a110776b5d2102806e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5ce1b8af7fb12a110776b5d2102806e");
            return;
        }
        this.offlineRuleItem = offlineRuleItem;
        this.webResourceResponse = webResourceResponse;
    }

    public OfflineResponse(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d8fb957356765fa1fd969cb434d17ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d8fb957356765fa1fd969cb434d17ba");
        } else {
            this.errorMsg = str;
        }
    }

    public long getStartTime() {
        return this.startTime;
    }

    public OfflineResponse setStartTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d07feafe494f694b9fd22f0072c1151e", RobustBitConfig.DEFAULT_VALUE)) {
            return (OfflineResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d07feafe494f694b9fd22f0072c1151e");
        }
        this.startTime = j;
        return this;
    }
}
