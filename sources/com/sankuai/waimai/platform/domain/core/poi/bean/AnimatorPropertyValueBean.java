package com.sankuai.waimai.platform.domain.core.poi.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class AnimatorPropertyValueBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("Prop")
    public float[] prop;
    @SerializedName("time")
    public long[] time;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f7dac283a6fcae84632f038dbba2581", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f7dac283a6fcae84632f038dbba2581");
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("time");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.time = new long[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.time[i] = optJSONArray.optLong(i);
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("Prop");
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                return;
            }
            this.prop = new float[optJSONArray2.length()];
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                this.prop[i2] = (float) optJSONArray2.optLong(i2);
            }
        } catch (Exception e) {
            a.a(e);
        }
    }
}
