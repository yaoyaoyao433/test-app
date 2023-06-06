package com.sankuai.waimai.platform.domain.core.multiperson.inner;

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
public class CartShareInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content")
    private String content;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    private String iconUrl;
    @SerializedName("share_url")
    private String shareUrl;
    @SerializedName("title")
    private String title;
    @SerializedName("weixin_url")
    private String weixinUrl;

    public static CartShareInfo fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7ad501817639b0c68e2793a4371af4ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (CartShareInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7ad501817639b0c68e2793a4371af4ab");
        }
        if (jSONObject == null) {
            return null;
        }
        CartShareInfo cartShareInfo = new CartShareInfo();
        cartShareInfo.setTitle(jSONObject.optString("title"));
        cartShareInfo.setContent(jSONObject.optString("content"));
        cartShareInfo.setIconUrl(jSONObject.optString(RemoteMessageConst.Notification.ICON));
        cartShareInfo.setShareUrl(jSONObject.optString("share_url"));
        cartShareInfo.setWeixinUrl(jSONObject.optString("weixin_url"));
        return cartShareInfo;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public String getWeixinUrl() {
        return this.weixinUrl;
    }

    public void setWeixinUrl(String str) {
        this.weixinUrl = str;
    }
}
