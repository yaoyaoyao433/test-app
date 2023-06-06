package com.dianping.titansmodel;

import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f implements a {
    public static ChangeQuickRedirect a;
    public String b;
    public double c;
    public double d;
    public String e;

    @Override // com.dianping.titansmodel.a
    public final JSONObject writeToJSON() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451c5d9674a977a58ba554ff732fc1a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451c5d9674a977a58ba554ff732fc1a2");
        }
        JSONObject jSONObject = new JSONObject();
        Object[] objArr2 = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5df32741db61bc2bdea5dbd23855022", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5df32741db61bc2bdea5dbd23855022");
        } else {
            try {
                jSONObject.put("picKey", this.e);
                jSONObject.put("height", this.d);
                jSONObject.put("width", this.c);
                jSONObject.put(DeviceInfo.LOCAL_ID, this.b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }
}
