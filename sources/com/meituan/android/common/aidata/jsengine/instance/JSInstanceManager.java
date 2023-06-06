package com.meituan.android.common.aidata.jsengine.instance;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.jsengine.common.JSValueWrapper;
import com.meituan.android.common.aidata.jsengine.jsexecutor.BridgeContext;
import com.meituan.android.common.aidata.jsengine.jsexecutor.BridgeContextManager;
import com.meituan.android.common.aidata.jsengine.jsexecutor.DebugBridgeContextHolder;
import com.meituan.android.common.aidata.jsengine.utils.IJSCallback;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSInstanceManager {
    private static final String TAG = "JSInstanceManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    @NonNull
    private final BridgeContextManager mBridgeContextManager;
    private final Map<String, BridgeContext> mIdToBridgeContext;
    private final Config mJSFrameworkConfig;
    private final String mJSFrameworkId;
    private final String mJSScript;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class Config {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean isSupportBatch = false;
    }

    public JSInstanceManager(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "885f0d8062a82554066960bd1f4cf066", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "885f0d8062a82554066960bd1f4cf066");
            return;
        }
        this.mJSFrameworkId = str;
        this.mJSScript = str2;
        this.mJSFrameworkConfig = parseConfig(str3);
        this.mIdToBridgeContext = new HashMap();
        this.mBridgeContextManager = new BridgeContextManager(str, str2);
    }

    private Config parseConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08386c19b8047d08edfc983c81ea62a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Config) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08386c19b8047d08edfc983c81ea62a5");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Config config = new Config();
        try {
            config.isSupportBatch = new JSONObject(str).optBoolean("isSupportBatch", false);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return config;
    }

    public String getJSFrameworkId() {
        return this.mJSFrameworkId;
    }

    public String getJSScript() {
        return this.mJSScript;
    }

    public boolean isSupportBatch() {
        return this.mJSFrameworkConfig != null && this.mJSFrameworkConfig.isSupportBatch;
    }

    public void createInstance(final String str, String str2, JSONObject jSONObject, final IJSCallback iJSCallback) {
        BridgeContext bridgeContext;
        Object[] objArr = {str, str2, jSONObject, iJSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a584e1dd44d26230557e132828f6444", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a584e1dd44d26230557e132828f6444");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (iJSCallback != null) {
                iJSCallback.onFailed(this.mJSFrameworkId, new BlueException("instanceid or source is empty", BaseRaptorUploader.ERROR_INVALID_SOURCE_CODE));
            }
        } else {
            if (AIDataDelegate.getInstance().isDebugEnable() && AIDataDelegate.getInstance().isRemoteJSEngineEnable()) {
                bridgeContext = DebugBridgeContextHolder.getInstance().getDebugBridgeContext();
            } else {
                synchronized (this) {
                    BridgeContext bridgeContext2 = this.mIdToBridgeContext.get(str);
                    if (bridgeContext2 != null) {
                        if (iJSCallback != null) {
                            iJSCallback.onSuccess(bridgeContext2.getJSFrameworkId(), str, new JSValueWrapper(""));
                        }
                        return;
                    }
                    bridgeContext = this.mBridgeContextManager.getBridgeContext();
                    this.mIdToBridgeContext.put(str, bridgeContext);
                }
            }
            if (bridgeContext != null) {
                bridgeContext.createInstance(str, str2, jSONObject, new IJSCallback() { // from class: com.meituan.android.common.aidata.jsengine.instance.JSInstanceManager.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.aidata.jsengine.utils.IJSCallback
                    public void onSuccess(String str3, String str4, JSValueWrapper jSValueWrapper) {
                        Object[] objArr2 = {str3, str4, jSValueWrapper};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5bb7f6c797319abe10aa19d8837a1a11", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5bb7f6c797319abe10aa19d8837a1a11");
                        } else if (iJSCallback != null) {
                            iJSCallback.onSuccess(str3, str4, jSValueWrapper);
                        }
                    }

                    @Override // com.meituan.android.common.aidata.jsengine.utils.IJSCallback
                    public void onFailed(String str3, BlueException blueException) {
                        Object[] objArr2 = {str3, blueException};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "50976a0703c943a43065c8364304a042", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "50976a0703c943a43065c8364304a042");
                            return;
                        }
                        if (iJSCallback != null) {
                            iJSCallback.onFailed(str3, blueException);
                        }
                        synchronized (JSInstanceManager.this) {
                            JSInstanceManager.this.mIdToBridgeContext.remove(str);
                        }
                    }
                });
            } else if (iJSCallback != null) {
                iJSCallback.onFailed(this.mJSFrameworkId, new BlueException("js bridge context create fail", BaseRaptorUploader.ERROR_LOAD_FAILED));
            }
        }
    }

    public void executeJSInstance(String str, JSONArray jSONArray, JSONObject jSONObject, IJSCallback iJSCallback) {
        BridgeContext bridgeContext;
        Object[] objArr = {str, jSONArray, jSONObject, iJSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aac801d9aa2ec39611b6faee76c3288d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aac801d9aa2ec39611b6faee76c3288d");
            return;
        }
        if (AIDataDelegate.getInstance().isDebugEnable() && AIDataDelegate.getInstance().isRemoteJSEngineEnable()) {
            bridgeContext = DebugBridgeContextHolder.getInstance().getDebugBridgeContext();
        } else {
            synchronized (this) {
                bridgeContext = this.mIdToBridgeContext.get(str);
            }
        }
        if (bridgeContext != null) {
            bridgeContext.executeJSInstance(str, jSONArray, jSONObject, iJSCallback);
        } else if (iJSCallback != null) {
            iJSCallback.onFailed(this.mJSFrameworkId, new BlueException("JSbrige context has been destroy", BaseRaptorUploader.ERROR_LOAD_INSTANCE_DESTROY));
        }
    }

    public void destroyInstance(String str, IJSCallback iJSCallback) {
        BridgeContext bridgeContext;
        Object[] objArr = {str, iJSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce4daafa264e0b88797da93e89e5b658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce4daafa264e0b88797da93e89e5b658");
            return;
        }
        if (AIDataDelegate.getInstance().isDebugEnable() && AIDataDelegate.getInstance().isRemoteJSEngineEnable()) {
            bridgeContext = DebugBridgeContextHolder.getInstance().getDebugBridgeContext();
        } else {
            synchronized (this) {
                bridgeContext = this.mIdToBridgeContext.get(str);
            }
        }
        if (bridgeContext != null) {
            bridgeContext.destroyInstance(str, iJSCallback);
        } else if (iJSCallback != null) {
            iJSCallback.onFailed(this.mJSFrameworkId, new BlueException("JSbrige context has been destroy", BaseRaptorUploader.ERROR_LOAD_INSTANCE_DESTROY));
        }
    }
}
