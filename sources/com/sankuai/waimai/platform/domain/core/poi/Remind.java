package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Remind implements Serializable {
    public static final int REMIND_TYPE_DIALOG = 1;
    public static final int REMIND_TYPE_DIALOG_BACK = 5;
    public static final int REMIND_TYPE_LAYER = 2;
    public static final int REMIND_TYPE_LAYER_AUTO_DISAPPEAR = 3;
    public static final int REMIND_TYPE_TOAST = 4;
    public static final int SHOW_TYPE_EACH_SHOW = 2;
    public static final int SHOW_TYPE_FIRST_SHOW = 1;
    public static final int SHOW_TYPE_NOT_SHOW = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("behavior_type")
    public int behaviorType;
    @SerializedName("remind_content")
    public String content;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("statistics_code")
    public int statisticsCode;
    @SerializedName("support_type")
    public int supportType;

    public static Remind fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9e3dc4dd99decf4c4914f2a85063c031", RobustBitConfig.DEFAULT_VALUE)) {
            return (Remind) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9e3dc4dd99decf4c4914f2a85063c031");
        }
        if (jSONObject == null) {
            return null;
        }
        Remind remind = new Remind();
        remind.supportType = jSONObject.optInt("support_type");
        remind.behaviorType = jSONObject.optInt("behavior_type");
        remind.content = jSONObject.optString("remind_content");
        remind.statisticsCode = jSONObject.optInt("statistics_code");
        remind.icon = jSONObject.optString(RemoteMessageConst.Notification.ICON);
        return remind;
    }

    public static List<Remind> fromJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca6c9b411ff74378a1bca760f21276e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca6c9b411ff74378a1bca760f21276e9");
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Remind fromJson = fromJson(jSONArray.optJSONObject(i));
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }
}
