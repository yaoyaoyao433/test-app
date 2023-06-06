package com.meituan.metrics.laggy.respond.config;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RespondLaggyConfigManager {
    private static final String HORN_KEY = "metrics_respondLaggy";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile RespondLaggyConfigManager sInstance;
    private volatile RespondLaggyRemoteConfig respondLaggyRemoteConfig;

    public static RespondLaggyConfigManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fb192e4416a1a689b1e4eaf7c248596f", RobustBitConfig.DEFAULT_VALUE)) {
            return (RespondLaggyConfigManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fb192e4416a1a689b1e4eaf7c248596f");
        }
        if (sInstance == null) {
            synchronized (RespondLaggyConfigManager.class) {
                if (sInstance == null) {
                    sInstance = new RespondLaggyConfigManager();
                }
            }
        }
        return sInstance;
    }

    @NonNull
    public RespondLaggyRemoteConfig getRespondLaggyRemoteConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81e0ca0ca1e1bedd7a55b7ff473f2bb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (RespondLaggyRemoteConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81e0ca0ca1e1bedd7a55b7ff473f2bb6");
        }
        if (this.respondLaggyRemoteConfig == null) {
            synchronized (RespondLaggyConfigManager.class) {
                String accessCache = Horn.accessCache(HORN_KEY);
                if (!TextUtils.isEmpty(accessCache)) {
                    try {
                        JSONObject optJSONObject = new JSONObject(accessCache).optJSONObject("respondLaggy");
                        if (optJSONObject != null) {
                            this.respondLaggyRemoteConfig = (RespondLaggyRemoteConfig) new Gson().fromJson(optJSONObject.toString(), (Class<Object>) RespondLaggyRemoteConfig.class);
                        }
                    } catch (Exception unused) {
                        this.respondLaggyRemoteConfig = null;
                    }
                }
                if (this.respondLaggyRemoteConfig == null || TextUtils.isEmpty(accessCache)) {
                    this.respondLaggyRemoteConfig = RespondLaggyRemoteConfig.defaultConfig();
                }
                HashMap hashMap = new HashMap();
                hashMap.put("babelToken", Babel.getBabelConfig() != null ? Babel.getBabelConfig().getToken() : "-1");
                Horn.register(HORN_KEY, new HornCallback() { // from class: com.meituan.metrics.laggy.respond.config.RespondLaggyConfigManager.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.horn.HornCallback
                    public void onChanged(boolean z, String str) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "67b8fbd9c996588ca6be8977c302b991", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "67b8fbd9c996588ca6be8977c302b991");
                            return;
                        }
                        ILogger metricsLogger = Logger.getMetricsLogger();
                        metricsLogger.d(" 卡顿 horn 结果 " + str);
                    }
                }, hashMap);
            }
        }
        return this.respondLaggyRemoteConfig;
    }
}
