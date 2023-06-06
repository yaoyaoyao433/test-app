package com.sankuai.waimai.business.im.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    @SerializedName("title")
    public String b;
    @SerializedName("description_list")
    public List<String> c;

    public b(String str, List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd0c4a4e2f8d968ac04b9e775405de58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd0c4a4e2f8d968ac04b9e775405de58");
            return;
        }
        this.b = str;
        this.c = list;
    }

    public final byte[] a(int i, long j) {
        Object[] objArr = {302, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28a48536a988190f6f4640c57a0632d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28a48536a988190f6f4640c57a0632d6");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject(new Gson().toJson(this));
            jSONObject2.put("trigger_msgId", j);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("type", 302);
            return jSONObject.toString().getBytes("utf-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
