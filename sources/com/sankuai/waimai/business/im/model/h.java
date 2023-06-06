package com.sankuai.waimai.business.im.model;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.model.RiderImInfo;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public RiderImInfo.b b;

    public h(RiderImInfo.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f0b784f39b2e35a8e1a21905a501bf0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f0b784f39b2e35a8e1a21905a501bf0");
        } else {
            this.b = bVar;
        }
    }

    public final byte[] a(int i) {
        Object[] objArr = {200};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2a3872aab35df6dc3fcaff663e776a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2a3872aab35df6dc3fcaff663e776a9");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("data", new Gson().toJson(this.b));
            jSONObject.put("type", 200);
            return jSONObject.toString().getBytes("utf-8");
        } catch (Exception unused) {
            return null;
        }
    }
}
