package com.sankuai.waimai.platform.domain.core.goods;

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
/* loaded from: classes5.dex */
public final class f implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("package_attr")
    public List<String> b;
    @SerializedName("package_icon")
    public String c;
    @SerializedName("package_title")
    private String d;
    @SerializedName("show_sequence")
    private int e;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc9b1541f1d691103b705f11e6b723b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc9b1541f1d691103b705f11e6b723b8");
        } else {
            this.b = new ArrayList();
        }
    }

    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f572676d4de4c828923fee8a070fad1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f572676d4de4c828923fee8a070fad1c");
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("package_attr");
        for (int i = 0; optJSONArray != null && i < optJSONArray.length(); i++) {
            this.b.add(optJSONArray.optString(i));
        }
        this.c = jSONObject.optString("package_icon");
        this.e = jSONObject.optInt("show_sequence");
    }

    public final String a() {
        return this.c;
    }
}
