package com.sankuai.waimai.store.platform.domain.core.poi;

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
public class ShippingTimeInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("desc_content")
    public String descContent;
    @SerializedName("reservation_status")
    public int reservationStatus;
    @SerializedName("status_content")
    public String statusContent;

    public boolean isReserving() {
        return this.reservationStatus == 0;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bb0a818145c1b665d124d848b3da9b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bb0a818145c1b665d124d848b3da9b3");
        } else if (jSONObject == null) {
        } else {
            this.reservationStatus = jSONObject.optInt("reservation_status");
            this.statusContent = jSONObject.optString("status_content");
            this.descContent = jSONObject.optString("desc_content");
        }
    }
}
