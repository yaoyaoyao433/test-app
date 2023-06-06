package com.dianping.titansmodel;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e implements a {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;

    @Override // com.dianping.titansmodel.a
    public final JSONObject writeToJSON() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49f8ed2f0aea0c4a3a8630cac47366e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49f8ed2f0aea0c4a3a8630cac47366e3");
        }
        JSONObject jSONObject = new JSONObject();
        Object[] objArr2 = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c88be4422979857fbbdd8a3224de1828", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c88be4422979857fbbdd8a3224de1828");
        } else {
            try {
                jSONObject.put("base64", this.h);
                jSONObject.put(Constants.PRIVACY.KEY_LATITUDE, this.g);
                jSONObject.put(Constants.PRIVACY.KEY_LONGITUDE, this.f);
                jSONObject.put(DeviceInfo.LOCAL_ID, this.e);
                jSONObject.put(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION, this.d);
                jSONObject.put("width", this.c);
                jSONObject.put("height", this.b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }
}
