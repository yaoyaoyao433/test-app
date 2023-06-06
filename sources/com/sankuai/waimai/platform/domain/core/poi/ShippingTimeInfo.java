package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.Expose;
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
    @Expose
    public String descContent;
    @SerializedName("reservation_status")
    @Expose
    public int reservationStatus;
    @SerializedName("status_content")
    @Expose
    public String statusContent;

    public boolean isReserving() {
        return this.reservationStatus == 0;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a98b076167c0e2e1f76c0bc74a957aa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a98b076167c0e2e1f76c0bc74a957aa8");
        } else if (jSONObject == null) {
        } else {
            this.reservationStatus = jSONObject.optInt("reservation_status");
            this.statusContent = jSONObject.optString("status_content");
            this.descContent = jSONObject.optString("desc_content");
        }
    }
}
