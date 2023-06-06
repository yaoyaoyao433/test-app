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
public class SaleOutRemind implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("msg")
    public String msg;
    @SerializedName("show")
    public boolean show;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c432a45d98175a869a0354b2c644cd16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c432a45d98175a869a0354b2c644cd16");
        } else if (jSONObject == null) {
        } else {
            try {
                this.show = jSONObject.optBoolean("show");
                this.msg = jSONObject.optString("msg");
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }
}
