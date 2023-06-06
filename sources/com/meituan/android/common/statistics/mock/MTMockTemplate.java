package com.meituan.android.common.statistics.mock;

import android.net.Uri;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MTMockTemplate implements MockTemplate<JSONObject> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.statistics.mock.MockTemplate
    public JSONObject getData(JSONObject jSONObject) {
        JSONObject jSONObject2;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7802f6000224a55e10486d143a2b966e", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7802f6000224a55e10486d143a2b966e");
        }
        if (jSONObject != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("ga", jSONObject);
                JSONArray optJSONArray = jSONObject.optJSONArray("evs");
                if (optJSONArray == null || optJSONArray.length() == 0 || (jSONObject2 = optJSONArray.getJSONObject(0)) == null) {
                    return null;
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("nm", jSONObject2.opt("nm"));
                jSONObject4.put("val_cid", jSONObject2.opt("val_cid"));
                jSONObject4.put("val_ref", jSONObject2.opt("val_ref"));
                jSONObject4.put("val_bid", jSONObject2.opt("val_bid"));
                jSONObject4.put("val_val", jSONObject2.opt("val_val"));
                jSONObject4.put("val_act", jSONObject2.opt("val_act"));
                jSONObject4.put("val_lab", jSONObject2.opt("val_lab"));
                jSONObject4.put("element_id", jSONObject2.opt("element_id"));
                jSONObject4.put("index", jSONObject2.opt("index"));
                jSONObject4.put("event_type", jSONObject2.opt("event_type"));
                jSONObject4.put("seq", jSONObject2.opt("seq"));
                jSONObject3.put("essential", jSONObject4);
                return jSONObject3;
            } catch (JSONException e) {
                LogUtil.log("statistics", "DPMockTemplate - getData: " + e.getMessage());
            }
        }
        return null;
    }

    @Override // com.meituan.android.common.statistics.mock.MockTemplate
    public String getPath(Uri uri) {
        String str;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d0345db08527b9724ae388f45b46008", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d0345db08527b9724ae388f45b46008");
        }
        String substring = uri.getPath().substring(0, uri.getPath().lastIndexOf("/"));
        try {
            str = uri.getQueryParameter("reportUrl");
        } catch (Exception e) {
            e.printStackTrace();
            str = null;
        }
        if (str == null) {
            return substring;
        }
        return substring + "/" + str;
    }
}
