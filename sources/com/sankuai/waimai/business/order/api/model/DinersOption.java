package com.sankuai.waimai.business.order.api.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.MsgAddition;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class DinersOption implements Serializable {
    public static final int NOT_SELECTED = 0;
    public static final int SELECTED = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(MsgAddition.TABLE)
    public String addition;
    @SerializedName("count")
    public int count;
    @SerializedName("default_select")
    public int defaultSelect;
    @SerializedName("description")
    public String description;
    @SerializedName("green_life_tip")
    public String greenLifeTip;

    public static DinersOption fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7b429dc9bfbb4efb9aa9c8d842ba5465", RobustBitConfig.DEFAULT_VALUE)) {
            return (DinersOption) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7b429dc9bfbb4efb9aa9c8d842ba5465");
        }
        if (jSONObject == null) {
            return null;
        }
        DinersOption dinersOption = new DinersOption();
        dinersOption.count = jSONObject.optInt("count", 0);
        dinersOption.description = jSONObject.optString("description");
        dinersOption.greenLifeTip = jSONObject.optString("green_life_tip");
        dinersOption.addition = jSONObject.optString(MsgAddition.TABLE);
        dinersOption.defaultSelect = jSONObject.optInt("default_select");
        return dinersOption;
    }

    public static List<DinersOption> fromJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "987df71e7ae2e8a2d246dd335514fb2b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "987df71e7ae2e8a2d246dd335514fb2b");
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            DinersOption fromJson = fromJson(jSONArray.optJSONObject(i));
            if (fromJson != null) {
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80bdadd35411284437ea76194f0494ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80bdadd35411284437ea76194f0494ed")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DinersOption)) {
            return false;
        }
        DinersOption dinersOption = (DinersOption) obj;
        return this.count == dinersOption.count && TextUtils.equals(this.description, dinersOption.description);
    }
}
