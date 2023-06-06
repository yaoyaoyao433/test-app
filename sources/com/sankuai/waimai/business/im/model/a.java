package com.sankuai.waimai.business.im.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    @SerializedName("poi_longitude")
    public long b;
    @SerializedName("poi_latitude")
    public long c;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String d;
    @SerializedName("poi_address")
    public String e;
    @SerializedName("user_longitude")
    public long f;
    @SerializedName("user_latitude")
    public long g;
    @SerializedName("distance")
    public String h;
    @SerializedName("title")
    public String i;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String j;

    public a(long j, long j2, String str, String str2, long j3, long j4, String str3, String str4, String str5) {
        Object[] objArr = {new Long(j), new Long(j2), str, str2, new Long(j3), new Long(j4), str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a9c50b21262da14535af389d812ed82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a9c50b21262da14535af389d812ed82");
            return;
        }
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = str2;
        this.f = j3;
        this.g = j4;
        this.h = str3;
        this.i = str4;
        this.j = str5;
    }

    public static a a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd48c6596d91173f2f6bd157525fc823", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd48c6596d91173f2f6bd157525fc823");
        }
        if (jSONObject == null) {
            return null;
        }
        return (a) new Gson().fromJson(jSONObject.toString(), (Class<Object>) a.class);
    }

    public final byte[] a(int i, long j) {
        Object[] objArr = {301, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ff20e38d3393447616abbaaf27e9679", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ff20e38d3393447616abbaaf27e9679");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject(new Gson().toJson(this));
            jSONObject2.put("trigger_msgId", j);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("type", 301);
            return jSONObject.toString().getBytes("utf-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
