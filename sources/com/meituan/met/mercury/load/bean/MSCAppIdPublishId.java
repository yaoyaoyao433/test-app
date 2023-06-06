package com.meituan.met.mercury.load.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class MSCAppIdPublishId {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String appId;
    private String publishId;

    public MSCAppIdPublishId(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b550f5f4dbc6b7e5609fa75f0ff78191", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b550f5f4dbc6b7e5609fa75f0ff78191");
            return;
        }
        this.appId = str;
        this.publishId = str2;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setPublishId(String str) {
        this.publishId = str;
    }

    public String getPublishId() {
        return this.publishId;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d98a2bfb53972b13230acbee5ee57024", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d98a2bfb53972b13230acbee5ee57024");
        }
        return "MSCAppIdPublishId{appId='" + this.appId + "', publishId='" + this.publishId + "'}";
    }
}
