package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class WorryFreeInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("shortTip")
    public String shortTip;
    @SerializedName("tip")
    public String tip;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd2fbcfd7e79b4c01b7bfd0041d17d80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd2fbcfd7e79b4c01b7bfd0041d17d80");
            return;
        }
        this.icon = jSONObject.optString(RemoteMessageConst.Notification.ICON);
        this.tip = jSONObject.optString("tip");
        this.shortTip = jSONObject.optString("short_tip");
    }
}
