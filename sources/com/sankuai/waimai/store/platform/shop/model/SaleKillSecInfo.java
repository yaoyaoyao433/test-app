package com.sankuai.waimai.store.platform.shop.model;

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
public class SaleKillSecInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7775228349502091607L;
    @SerializedName("kill_sec_head_logo")
    public String killSecHeadLogo;
    @SerializedName("kill_sec_remaining_time")
    public long killSecRemainingTime;
    @SerializedName("kill_sec_saled_count")
    public long killSecSaledCount;
    @SerializedName("kill_sec_title_logo")
    public String killSecTitleLogo;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d050264607964bcac7fae1bcd38ecc81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d050264607964bcac7fae1bcd38ecc81");
        } else if (jSONObject == null) {
        } else {
            try {
                this.killSecRemainingTime = jSONObject.optLong("kill_sec_remaining_time");
                this.killSecSaledCount = jSONObject.optLong("kill_sec_saled_count");
                this.killSecHeadLogo = jSONObject.optString("kill_sec_head_logo");
                this.killSecTitleLogo = jSONObject.optString("kill_sec_title_logo");
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }
}
