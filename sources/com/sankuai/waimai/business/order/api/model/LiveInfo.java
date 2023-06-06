package com.sankuai.waimai.business.order.api.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class LiveInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4466313639749714233L;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("live_id")
    public String liveId;
    @SerializedName("title")
    public String title;

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a489331a06d7012968140b7a645f383", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a489331a06d7012968140b7a645f383")).booleanValue() : (TextUtils.isEmpty(this.icon) && TextUtils.isEmpty(this.title)) ? false : true;
    }

    public static String getJudasLiveId(LiveInfo liveInfo) {
        Object[] objArr = {liveInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1e21fe09fcee1684534c049a617f31a2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1e21fe09fcee1684534c049a617f31a2") : (liveInfo == null || TextUtils.isEmpty(liveInfo.liveId)) ? "-999" : liveInfo.liveId;
    }

    public static LiveInfo parseLiveInfoJson(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "42a85a980b8dcc3ab06dd36858f69d2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (LiveInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "42a85a980b8dcc3ab06dd36858f69d2d");
        }
        if (str != null) {
            try {
                return (LiveInfo) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(str, (Class<Object>) LiveInfo.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
