package com.meituan.mmp.lib.api.device;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ScreenModule extends ActivityApi {
    public static ChangeQuickRedirect h;
    private int i;

    public ScreenModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dc1d359e5a4b64d9a21082962af819f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dc1d359e5a4b64d9a21082962af819f");
        } else {
            this.i = -1;
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75484db6100c32fa91c9fbebda965443", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75484db6100c32fa91c9fbebda965443") : new String[]{"setScreenBrightness", "getScreenBrightness", "setKeepScreenOn"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        char c;
        int i;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47d1218205d2acd2dd603cd244f29245", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47d1218205d2acd2dd603cd244f29245");
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode == -1350947233) {
            if (str.equals("setScreenBrightness")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -1225644142) {
            if (hashCode == 192780627 && str.equals("getScreenBrightness")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("setKeepScreenOn")) {
                c = 2;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                Object[] objArr2 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d0bf8c33c5a89e7e5f3d9a8e877a4b0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d0bf8c33c5a89e7e5f3d9a8e877a4b0");
                    return;
                } else if (jSONObject == null || !(getContext() instanceof Activity)) {
                    return;
                } else {
                    int optDouble = (int) (jSONObject.optDouble("value") * 255.0d);
                    if (Build.VERSION.SDK_INT >= 23) {
                        if (!Settings.System.canWrite(getContext())) {
                            this.i = optDouble;
                            Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
                            intent.setData(Uri.parse("package:" + getContext().getPackageName()));
                            startActivityForResult(intent, iApiCallback);
                            return;
                        }
                        a(optDouble, iApiCallback);
                        return;
                    }
                    a(optDouble, iApiCallback);
                    return;
                }
            case 1:
                Object[] objArr3 = {iApiCallback};
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1cd0ea06b7f60083378d8c88ff0c729a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1cd0ea06b7f60083378d8c88ff0c729a");
                    return;
                }
                try {
                    i = Settings.System.getInt(getContext().getContentResolver(), "screen_brightness");
                } catch (Settings.SettingNotFoundException unused) {
                    i = -1;
                }
                if (i < 0) {
                    iApiCallback.onFail();
                    return;
                }
                float f = i / 255.0f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("value", ((int) (f * 100.0f)) / 100.0d);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                iApiCallback.onSuccess(jSONObject2);
                return;
            case 2:
                Object[] objArr4 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect4 = h;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "88c76d3f61fd79e0f48b4980c5a1cb7d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "88c76d3f61fd79e0f48b4980c5a1cb7d");
                    return;
                } else if (jSONObject == null || !(getContext() instanceof Activity)) {
                    return;
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    if (jSONObject.optBoolean("keepScreenOn")) {
                        ((Activity) getContext()).getWindow().addFlags(128);
                        try {
                            jSONObject3.put("errMsg", "enable success");
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        ((Activity) getContext()).getWindow().clearFlags(128);
                        try {
                            jSONObject3.put("errMsg", "close success");
                        } catch (JSONException e3) {
                            e3.printStackTrace();
                        }
                    }
                    iApiCallback.onSuccess(jSONObject3);
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onActivityResult(int i, Intent intent, IApiCallback iApiCallback) {
        Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cd0ba059ffbcfe8538b86ebfd81d6d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cd0ba059ffbcfe8538b86ebfd81d6d2");
            return;
        }
        Object[] objArr2 = {iApiCallback};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9dbeafb8f8d492aacb696f50656f124a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9dbeafb8f8d492aacb696f50656f124a");
        } else if (this.i < 0 || Build.VERSION.SDK_INT < 23 || !Settings.System.canWrite(getContext())) {
        } else {
            a(this.i, iApiCallback);
            this.i = -1;
        }
    }

    private void a(int i, IApiCallback iApiCallback) {
        Object[] objArr = {Integer.valueOf(i), iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "553d7c886d2f8f7f839bd584ed3a9137", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "553d7c886d2f8f7f839bd584ed3a9137");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (i < 0 || i > 255) {
            iApiCallback.onFail(jSONObject);
            return;
        }
        if ("HUAWEI".equals(Build.BRAND)) {
            int i2 = -1;
            try {
                i2 = Settings.System.getInt(getContext().getContentResolver(), "screen_brightness_mode");
            } catch (Settings.SettingNotFoundException unused) {
            }
            if (1 == i2) {
                Settings.System.putInt(getContext().getContentResolver(), "screen_brightness_mode", 0);
            }
        }
        Settings.System.putInt(getContext().getContentResolver(), "screen_brightness", i);
        iApiCallback.onSuccess(jSONObject);
    }
}
