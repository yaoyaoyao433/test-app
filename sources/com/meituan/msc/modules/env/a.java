package com.meituan.msc.modules.env;

import android.os.Build;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "Environment")
/* loaded from: classes3.dex */
public class a extends k {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.modules.manager.k
    public final JSONObject N_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65e5995928f162bc42dc83e360f532a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65e5995928f162bc42dc83e360f532a6");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appID", MSCEnvHelper.getEnvInfo().getAppID());
            jSONObject.put("version", MSCEnvHelper.getEnvInfo().getAppVersionCode());
            jSONObject.put("buildNumber", MSCEnvHelper.getEnvInfo().getBuildNumber());
            jSONObject.put("package", MSCEnvHelper.getContext().getPackageName());
            jSONObject.put("device", Build.MODEL);
            jSONObject.put("systemVersion", Build.VERSION.RELEASE);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
