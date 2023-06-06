package com.sankuai.waimai.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiFoodTag implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("background_color")
    @Expose
    public String backgroundColor;
    @SerializedName("best_info")
    @Expose
    public String bestInfo;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("description_title")
    @Expose
    public String descriptionTitle;
    @SerializedName("font_size")
    @Expose
    public String fontSize;
    @SerializedName("text")
    @Expose
    public String text;
    @SerializedName("text_color")
    @Expose
    public String textColor;
    @SerializedName("trace_info")
    @Expose
    public String traceInfo;
    @SerializedName("type")
    @Expose
    public int type;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6e77bf30604a8e4434162f074765e1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6e77bf30604a8e4434162f074765e1c");
        } else if (jSONObject == null) {
        } else {
            this.text = jSONObject.optString("text");
            this.textColor = jSONObject.optString("text_color");
            this.fontSize = jSONObject.optString("font_size");
            this.backgroundColor = jSONObject.optString("background_color");
            this.descriptionTitle = jSONObject.optString("description_title");
            this.description = jSONObject.optString("description");
            this.type = jSONObject.optInt("type");
            this.bestInfo = jSONObject.optString("best_info");
            this.traceInfo = jSONObject.optString("trace_info");
        }
    }

    public static List<PoiFoodTag> fromJsonArray(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4c4c3d4fdc0032e6d413481b44385a28", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4c4c3d4fdc0032e6d413481b44385a28");
        }
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            PoiFoodTag poiFoodTag = new PoiFoodTag();
            poiFoodTag.parseJson(jSONArray.optJSONObject(i));
            arrayList.add(poiFoodTag);
        }
        return arrayList;
    }
}
