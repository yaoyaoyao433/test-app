package com.dianping.shield.config;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.shield.bridge.ShieldLogger;
import com.dianping.shield.env.ShieldEnvironment;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class HornFallbackSwitch {
    private static final boolean DEFAULT_SWITCH_ON = true;
    private static final String KEY_CONFIG = "fallback_switch_config_android";
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap<String, Object> propertyValuesMap;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class SubHolder {
        private static final HornFallbackSwitch INSTANCE = new HornFallbackSwitch();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public HornFallbackSwitch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82ac212b7c807314ff2e45cf0068262d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82ac212b7c807314ff2e45cf0068262d");
        } else {
            this.propertyValuesMap = new HashMap<>();
        }
    }

    public static HornFallbackSwitch getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a5664f80091ddd8c86c7cda907ddb1c9", RobustBitConfig.DEFAULT_VALUE) ? (HornFallbackSwitch) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a5664f80091ddd8c86c7cda907ddb1c9") : SubHolder.INSTANCE;
    }

    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2c19c874d56be4142bb8035d61ca738", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2c19c874d56be4142bb8035d61ca738");
            return;
        }
        if (ShieldEnvironment.INSTANCE.isDebug()) {
            Horn.debug(context, KEY_CONFIG, true);
        }
        Horn.register(KEY_CONFIG, new HornCallback() { // from class: com.dianping.shield.config.HornFallbackSwitch.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "904e54ab44ee00e4f5a64f65880300f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "904e54ab44ee00e4f5a64f65880300f3");
                } else if (z && !TextUtils.isEmpty(str)) {
                    try {
                        HashMap hashMap = (HashMap) new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>() { // from class: com.dianping.shield.config.HornFallbackSwitch.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;
                        }.getType());
                        if (hashMap == null) {
                            return;
                        }
                        HornFallbackSwitch.this.propertyValuesMap = hashMap;
                    } catch (Exception e) {
                        ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
                        shieldLogger.codeLogError(HornFallbackSwitch.class, "init: " + e.getMessage());
                    }
                }
            }
        });
    }

    public boolean isSwitchOn(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "797cc6d45eaa05f28fed958c7c6c1a10", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "797cc6d45eaa05f28fed958c7c6c1a10")).booleanValue();
        }
        if (this.propertyValuesMap == null) {
            return true;
        }
        try {
            Object obj = this.propertyValuesMap.get(str);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            return true;
        } catch (Exception e) {
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.codeLogError(HornFallbackSwitch.class, "isSwitchOn: key: " + str + ", error: " + e.getMessage());
            return true;
        }
    }
}
