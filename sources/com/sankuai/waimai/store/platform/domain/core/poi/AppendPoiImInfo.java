package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.im.DrugImEntranceEntity;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class AppendPoiImInfo implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("poi_im_entrance_status")
    public int b;
    @SerializedName("remind_msg")
    public String c;
    @SerializedName("poi_dx_id")
    public long d;
    @SerializedName("b_app_id")
    public int e;
    @SerializedName("style")
    public int f;
    @SerializedName("poi_im_extension")
    public PoiIMExtension g;
    @SerializedName("drug_im_entrance")
    public DrugImEntranceEntity h;
    @SerializedName("selfsell")
    public boolean i;
    @SerializedName("title")
    public String j;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiIMExtension implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("contact_merchant_tip")
        public String shopCartIMPopTip;
    }

    public static AppendPoiImInfo a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f3b333c55f14fb86e686ae2128b00fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppendPoiImInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f3b333c55f14fb86e686ae2128b00fe");
        }
        if (jSONObject == null) {
            return null;
        }
        AppendPoiImInfo appendPoiImInfo = new AppendPoiImInfo();
        appendPoiImInfo.b = jSONObject.optInt("poi_im_entrance_status");
        appendPoiImInfo.c = jSONObject.optString("remind_msg");
        appendPoiImInfo.d = jSONObject.optLong("poi_dx_id");
        appendPoiImInfo.e = jSONObject.optInt("b_app_id");
        appendPoiImInfo.f = jSONObject.optInt("style");
        appendPoiImInfo.g = (PoiIMExtension) i.a(jSONObject.optString("poi_im_extension"), new TypeToken<PoiIMExtension>() { // from class: com.sankuai.waimai.store.platform.domain.core.poi.AppendPoiImInfo.1
        }.getType());
        appendPoiImInfo.h = (DrugImEntranceEntity) i.a(jSONObject.optString("drug_im_entrance"), new TypeToken<DrugImEntranceEntity>() { // from class: com.sankuai.waimai.store.platform.domain.core.poi.AppendPoiImInfo.2
        }.getType());
        appendPoiImInfo.i = jSONObject.optBoolean("selfsell");
        appendPoiImInfo.j = jSONObject.optString("title");
        return appendPoiImInfo;
    }
}
