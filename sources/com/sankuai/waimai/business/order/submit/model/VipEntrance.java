package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class VipEntrance implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("entrance_visible")
    public int entryVisible;
    @SerializedName("title")
    public String title;
    @SerializedName("click_url")
    public String url;
    public boolean visible;

    public boolean isVisible() {
        return this.entryVisible == 1;
    }

    public static VipEntrance fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a00152297328084ad6bd453e77c7733a", RobustBitConfig.DEFAULT_VALUE)) {
            return (VipEntrance) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a00152297328084ad6bd453e77c7733a");
        }
        if (jSONObject == null) {
            return null;
        }
        VipEntrance vipEntrance = new VipEntrance();
        vipEntrance.visible = jSONObject.optInt("entrance_visible") == 1;
        vipEntrance.title = jSONObject.optString("title");
        vipEntrance.url = jSONObject.optString("click_url");
        return vipEntrance;
    }
}
