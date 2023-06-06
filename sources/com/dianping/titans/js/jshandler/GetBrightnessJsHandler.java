package com.dianping.titans.js.jshandler;

import android.app.Activity;
import android.content.res.Resources;
import android.provider.Settings;
import android.view.WindowManager;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetBrightnessJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0700d8e75fbf50679c57d2f7793aa6cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0700d8e75fbf50679c57d2f7793aa6cf");
            return;
        }
        float brightness = getBrightness(jsBean().argsJson.optBoolean("forceSystem", false));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", brightness);
        } catch (Exception unused) {
        }
        jsCallback(jSONObject);
    }

    private float getBrightness(boolean z) {
        WindowManager.LayoutParams attributes;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3199c7099defd4043c6c5ea8fc2785db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3199c7099defd4043c6c5ea8fc2785db")).floatValue();
        }
        Activity activity = jsHost().getActivity();
        if (activity == null || (attributes = activity.getWindow().getAttributes()) == null) {
            return -1.0f;
        }
        float f = attributes.screenBrightness;
        if (f == -1.0f && z) {
            try {
                return Settings.System.getInt(activity.getContentResolver(), "screen_brightness") / getBrightnessMax();
            } catch (Settings.SettingNotFoundException unused) {
                return -1.0f;
            }
        }
        return f;
    }

    private float getBrightnessMax() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf62c4a466e6e8f746f84d32678b2b22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf62c4a466e6e8f746f84d32678b2b22")).floatValue();
        }
        try {
            Resources system = Resources.getSystem();
            int identifier = system.getIdentifier("config_screenBrightnessSettingMaximum", DataConstants.TYPE.INTEGER, "android");
            if (identifier == 0) {
                return 255.0f;
            }
            int integer = system.getInteger(identifier);
            if (integer == 0) {
                return 255.0f;
            }
            return integer;
        } catch (Exception unused) {
            return 255.0f;
        }
    }
}
