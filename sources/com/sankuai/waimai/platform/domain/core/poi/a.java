package com.sankuai.waimai.platform.domain.core.poi;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements Serializable {
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

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fa0dc9371fea4e7a0dda15ddeb75ebc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fa0dc9371fea4e7a0dda15ddeb75ebc");
        } else {
            this.b = 2;
        }
    }

    public static a a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8a430636a20fa100a1472acfc0440a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8a430636a20fa100a1472acfc0440a3");
        }
        if (jSONObject == null) {
            return null;
        }
        a aVar = new a();
        aVar.b = jSONObject.optInt("poi_im_entrance_status", 2);
        aVar.c = jSONObject.optString("remind_msg");
        aVar.d = jSONObject.optLong("poi_dx_id");
        aVar.e = jSONObject.optInt("b_app_id");
        aVar.f = jSONObject.optInt("style", 0);
        if (!com.sankuai.waimai.imbase.manager.b.a().c() && aVar.b != 1) {
            com.sankuai.waimai.imbase.manager.b.a().a("platform-inconsistent_poi_im_info_entrance");
        }
        if (!com.sankuai.waimai.imbase.manager.b.a().b()) {
            aVar.b = 1;
        }
        return aVar;
    }
}
