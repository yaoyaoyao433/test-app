package com.sankuai.waimai.platform.domain.core.multiperson.inner;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class UserInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("avatar")
    private String avatarUrl;
    @SerializedName("identity_id")
    private String identityId;
    @SerializedName("name")
    private String name;
    @SerializedName("source_icon_url")
    private String sourceIconUrl;
    @SerializedName("source_type")
    private int sourceType;
    @SerializedName("status_description")
    private String statusDesc;

    public static UserInfo fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9442431e34e9505c37556aacf40210c", RobustBitConfig.DEFAULT_VALUE)) {
            return (UserInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9442431e34e9505c37556aacf40210c");
        }
        if (jSONObject == null) {
            return null;
        }
        UserInfo userInfo = new UserInfo();
        userInfo.setIdentityId(jSONObject.optString("identity_id"));
        userInfo.setName(jSONObject.optString("name"));
        userInfo.setAvatarUrl(jSONObject.optString("avatar"));
        userInfo.setSourceType(jSONObject.optInt("source_type"));
        userInfo.setSourceIconUrl(jSONObject.optString("source_icon_url"));
        userInfo.setStatusDesc(jSONObject.optString("status_description"));
        return userInfo;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getName() {
        return this.name;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public int getSourceType() {
        return this.sourceType;
    }

    public String getSourceIconUrl() {
        return this.sourceIconUrl;
    }

    public String getStatusDesc() {
        return this.statusDesc;
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setSourceType(int i) {
        this.sourceType = i;
    }

    public void setSourceIconUrl(String str) {
        this.sourceIconUrl = str;
    }

    public void setStatusDesc(String str) {
        this.statusDesc = str;
    }
}
