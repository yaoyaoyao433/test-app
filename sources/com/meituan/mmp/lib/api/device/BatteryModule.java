package com.meituan.mmp.lib.api.device;

import android.content.Intent;
import android.content.IntentFilter;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.annotation.SupportApiNames;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BatteryModule extends ServiceApi {
    @SupportApiNames
    public static final String[] API_NAMES = {"getBatteryInfo", "getBatteryInfoSync"};
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        return API_NAMES;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5dbe455ae003ffb7e6c9ad964e8d7e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5dbe455ae003ffb7e6c9ad964e8d7e4");
        } else if ("getBatteryInfo".contentEquals(str)) {
            a(jSONObject, iApiCallback);
        } else if ("getBatteryInfoSync".contentEquals(str)) {
            a(jSONObject, iApiCallback);
        }
    }

    private void a(JSONObject jSONObject, IApiCallback iApiCallback) {
        boolean z = true;
        Object[] objArr = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf4698b14beaadcb91389b6b4ab236b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf4698b14beaadcb91389b6b4ab236b2");
            return;
        }
        Intent registerReceiver = getContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            iApiCallback.onFail(codeJson(-1, "batteryStatus is null"));
            return;
        }
        int a2 = f.a(registerReceiver, "status", -1);
        if (a2 != 2 && a2 != 5) {
            z = false;
        }
        f.a(registerReceiver, "plugged", -1);
        int a3 = (int) ((f.a(registerReceiver, "level", -1) / f.a(registerReceiver, "scale", -1)) * 100.0f);
        if (a3 > 100) {
            iApiCallback.onFail(null);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("level", a3);
            jSONObject2.put("isCharging", z);
        } catch (JSONException unused) {
        }
        iApiCallback.onSuccess(jSONObject2);
    }
}
