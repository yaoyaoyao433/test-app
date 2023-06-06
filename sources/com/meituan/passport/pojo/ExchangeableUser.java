package com.meituan.passport.pojo;

import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.passport.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ExchangeableUser {
    private static final int LEN_NO_MOSAIC = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    public String avatarUrl;
    public String phoneNum;
    public String ticket;
    public long userId;
    public String userName;

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7303abaf2d364ca2f9abbb86bc9ba6e3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7303abaf2d364ca2f9abbb86bc9ba6e3")).booleanValue() : (obj instanceof ExchangeableUser) && ((ExchangeableUser) obj).userId == this.userId;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "096ba83d2bc3a5022dadb25735e012dd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "096ba83d2bc3a5022dadb25735e012dd")).intValue() : (int) (this.userId ^ (this.userId >>> 32));
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9451c0e82a86730593ac333dfb66d075", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9451c0e82a86730593ac333dfb66d075");
        }
        JSONObject json = getJSON();
        return json != null ? json.toString() : "";
    }

    public JSONObject getJSON() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be61600443e1d4cbaf1fc2e88dd4702d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be61600443e1d4cbaf1fc2e88dd4702d");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("phoneNum", this.phoneNum);
            jSONObject.put(DeviceInfo.USER_ID, this.userId);
            jSONObject.put("userName", getMosaicUserName());
            jSONObject.put("avatarUrl", this.avatarUrl);
            jSONObject.put("ticket", this.ticket);
        } catch (Exception e) {
            f.a(e);
        }
        return jSONObject;
    }

    private String getMosaicUserName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "382c2ea9687abe90653142dd7ce8fda6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "382c2ea9687abe90653142dd7ce8fda6");
        }
        if (TextUtils.isEmpty(this.userName) || this.userName.length() <= 3) {
            return this.userName;
        }
        int length = this.userName.length();
        return "*" + this.userName.substring(length - 3, length);
    }
}
