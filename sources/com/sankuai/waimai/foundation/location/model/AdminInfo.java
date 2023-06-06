package com.sankuai.waimai.foundation.location.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AdminInfo implements Comparable<AdminInfo> {
    public static final int CITY_LEVEL = 5;
    public static final int DISTRICT_LEVEL = 6;
    public static final int PROVINCE_LEVEL = 4;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("admin_code")
    public String adminCode;
    @SerializedName("admin_level")
    public int adminLevel;
    @SerializedName("level_desc")
    public String levelDesc;
    @SerializedName("name")
    public String name;

    @Override // java.lang.Comparable
    public int compareTo(AdminInfo adminInfo) {
        return this.adminLevel - adminInfo.adminLevel;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3663b4246c3fe5e2c7a4e8350377a9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3663b4246c3fe5e2c7a4e8350377a9a");
        } else if (jSONObject != null) {
            this.adminLevel = jSONObject.optInt("admin_level");
            this.name = jSONObject.optString("name");
            this.adminCode = jSONObject.optString("admin_code");
        }
    }
}
