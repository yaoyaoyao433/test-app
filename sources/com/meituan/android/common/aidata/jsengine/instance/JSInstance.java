package com.meituan.android.common.aidata.jsengine.instance;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.AiDownloadEnv;
import com.meituan.android.common.aidata.jsengine.common.JSValueWrapper;
import com.meituan.android.common.aidata.jsengine.utils.IJSCallback;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSInstance {
    private static final int SCRIPT_LOAD_STATUS_LOADING = 2;
    private static final int SCRIPT_LOAD_STATUS_LOAD_FAILED = 4;
    private static final int SCRIPT_LOAD_STATUS_LOAD_NOT_START = 1;
    private static final int SCRIPT_LOAD_STATUS_LOAD_SUCCESS = 3;
    private static final String TAG = "JSInstance";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Long id = 1L;
    private JSInstanceManager mCurJSInstanceManager;
    private String mInstanceId;
    @NonNull
    private final List<IJSCallback> mJSCallbacks;
    private String mJSSrcScript;
    private JSONObject mLoadJSParams;
    private boolean mNeedReloadScript;
    private JSInstanceManager mNextJSInstanceManager;
    private int mScriptLoadStatus;

    public JSInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c58e896d6072b2a84f1063862a719ad7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c58e896d6072b2a84f1063862a719ad7");
            return;
        }
        this.mInstanceId = generateInstanceId();
        this.mNeedReloadScript = false;
        this.mScriptLoadStatus = 1;
        this.mJSCallbacks = new ArrayList();
        InstanceContainer.getInstance().addInstance(this.mInstanceId, this);
        this.mCurJSInstanceManager = InstanceContainer.getInstance().getHeadJSInstanceManager();
        StringBuilder sb = new StringBuilder();
        sb.append(this.mInstanceId);
        sb.append(" current js framework id is ");
        sb.append(getJSFrameworkId(this.mCurJSInstanceManager));
        sb.append(" when construct");
    }

    public synchronized void markNeedReloadScriptAndTryReloadScript() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9675074844498c0570a9e093853e77c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9675074844498c0570a9e093853e77c4");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.mInstanceId);
        sb.append(" markNeedReloadScriptAndTryReloadScript");
        this.mNeedReloadScript = true;
        this.mNextJSInstanceManager = InstanceContainer.getInstance().getHeadJSInstanceManager();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mInstanceId);
        sb2.append(" current js framework id is ");
        sb2.append(getJSFrameworkId(this.mCurJSInstanceManager));
        sb2.append(" when markNeedReloadScriptAndTryReloadScript");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.mInstanceId);
        sb3.append(" next js framework id is ");
        sb3.append(getJSFrameworkId(this.mNextJSInstanceManager));
        sb3.append(" when markNeedReloadScriptAndTryReloadScript");
        if (this.mScriptLoadStatus != 2) {
            this.mScriptLoadStatus = 1;
            this.mNeedReloadScript = false;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.mInstanceId);
            sb4.append(" reloadScript at markNeedReloadScriptAndTryReloadScript");
            this.mCurJSInstanceManager = this.mNextJSInstanceManager;
            reloadScript();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void reloadScript() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0946277c8ffd515e937f78ae8060aa4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0946277c8ffd515e937f78ae8060aa4f");
        } else {
            loadScript(this.mJSSrcScript, this.mLoadJSParams, null);
        }
    }

    public void loadScript(String str, JSONObject jSONObject, @Nullable IJSCallback iJSCallback) {
        Object[] objArr = {str, jSONObject, iJSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de709a9bee8fa114f826c14bf55800a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de709a9bee8fa114f826c14bf55800a9");
        } else if (TextUtils.isEmpty(str)) {
            synchronized (this) {
                this.mScriptLoadStatus = 4;
            }
            if (iJSCallback != null) {
                iJSCallback.onFailed(AiDownloadEnv.AI_JS_FRAMEWORK_PRESET_VERSION, new BlueException("jscript is empty", BaseRaptorUploader.ERROR_INVALID_SOURCE_CODE));
            }
        } else {
            synchronized (this) {
                this.mJSSrcScript = str;
                this.mLoadJSParams = jSONObject;
                if (iJSCallback != null && !this.mJSCallbacks.contains(iJSCallback)) {
                    this.mJSCallbacks.add(iJSCallback);
                }
                StringBuilder sb = new StringBuilder("load script at instance: ");
                sb.append(this.mInstanceId);
                sb.append(" at thread: ");
                sb.append(Thread.currentThread().getName());
                sb.append(", callback list size: ");
                sb.append(this.mJSCallbacks.size());
                if (this.mScriptLoadStatus == 2) {
                    StringBuilder sb2 = new StringBuilder("script is loading at instance: ");
                    sb2.append(this.mInstanceId);
                    sb2.append(" at thread: ");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", wait load finish to callback");
                    return;
                }
                if (this.mScriptLoadStatus != 3) {
                    StringBuilder sb3 = new StringBuilder("start load script at instance: ");
                    sb3.append(this.mInstanceId);
                    sb3.append(" at thread: ");
                    sb3.append(Thread.currentThread().getName());
                    this.mScriptLoadStatus = 2;
                    if (this.mCurJSInstanceManager == null) {
                        this.mScriptLoadStatus = 4;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(this.mInstanceId);
                        sb4.append(" framework has not been loaded, load script failed.");
                        for (IJSCallback iJSCallback2 : this.mJSCallbacks) {
                            iJSCallback2.onFailed(AiDownloadEnv.AI_JS_FRAMEWORK_PRESET_VERSION, new BlueException("framework has not been loaded", BaseRaptorUploader.ERROR_UNLOAD_FRAMEWORK));
                            this.mJSCallbacks.clear();
                        }
                        return;
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(this.mInstanceId);
                    sb5.append(" current js framework id is ");
                    sb5.append(getJSFrameworkId(this.mCurJSInstanceManager));
                    sb5.append(" when load script");
                    this.mCurJSInstanceManager.createInstance(getInstanceId(), str, jSONObject, new IJSCallback() { // from class: com.meituan.android.common.aidata.jsengine.instance.JSInstance.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.meituan.android.common.aidata.jsengine.utils.IJSCallback
                        public void onSuccess(String str2, String str3, JSValueWrapper jSValueWrapper) {
                            Object[] objArr2 = {str2, str3, jSValueWrapper};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6689bcc4565ef1d3e3935b8032cda0c8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6689bcc4565ef1d3e3935b8032cda0c8");
                                return;
                            }
                            synchronized (JSInstance.this) {
                                JSInstance.this.mScriptLoadStatus = 3;
                                if (!JSInstance.this.mNeedReloadScript) {
                                    for (IJSCallback iJSCallback3 : JSInstance.this.mJSCallbacks) {
                                        iJSCallback3.onSuccess(str2, str3, jSValueWrapper);
                                    }
                                    JSInstance.this.mJSCallbacks.clear();
                                }
                                checkReloadScript();
                            }
                        }

                        @Override // com.meituan.android.common.aidata.jsengine.utils.IJSCallback
                        public void onFailed(String str2, BlueException blueException) {
                            Object[] objArr2 = {str2, blueException};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aa328254f25753fcda673795af6f5370", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aa328254f25753fcda673795af6f5370");
                                return;
                            }
                            synchronized (JSInstance.this) {
                                JSInstance.this.mScriptLoadStatus = 4;
                                if (!JSInstance.this.mNeedReloadScript) {
                                    for (IJSCallback iJSCallback3 : JSInstance.this.mJSCallbacks) {
                                        iJSCallback3.onFailed(str2, blueException);
                                    }
                                    JSInstance.this.mJSCallbacks.clear();
                                }
                                checkReloadScript();
                            }
                        }

                        private void checkReloadScript() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "55f29a8e8900e130bec1d0061aea949c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "55f29a8e8900e130bec1d0061aea949c");
                            } else if (JSInstance.this.mNeedReloadScript) {
                                JSInstance.this.mNeedReloadScript = false;
                                JSInstance.this.mScriptLoadStatus = 1;
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(JSInstance.this.mInstanceId);
                                sb6.append(" current js framework id is ");
                                sb6.append(JSInstance.getJSFrameworkId(JSInstance.this.mCurJSInstanceManager));
                                sb6.append(" before start reload script");
                                JSInstance.this.mCurJSInstanceManager = JSInstance.this.mNextJSInstanceManager;
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(JSInstance.this.mInstanceId);
                                sb7.append(" current js framework id is ");
                                sb7.append(JSInstance.getJSFrameworkId(JSInstance.this.mCurJSInstanceManager));
                                sb7.append(" when start reload script");
                                JSInstance.this.reloadScript();
                            }
                        }
                    });
                } else {
                    String jSFrameworkId = getJSFrameworkId(this.mCurJSInstanceManager);
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(this.mInstanceId);
                    sb6.append(" already load script success at framework ");
                    sb6.append(jSFrameworkId);
                    if (!this.mJSCallbacks.isEmpty()) {
                        String str2 = this.mInstanceId;
                        for (IJSCallback iJSCallback3 : this.mJSCallbacks) {
                            iJSCallback3.onSuccess(jSFrameworkId, str2, new JSValueWrapper(""));
                        }
                        this.mJSCallbacks.clear();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static String getJSFrameworkId(@Nullable JSInstanceManager jSInstanceManager) {
        String jSFrameworkId;
        Object[] objArr = {jSInstanceManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9bb2bcc8bf9b2d4bf5f1f9c439113330", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9bb2bcc8bf9b2d4bf5f1f9c439113330") : (jSInstanceManager == null || (jSFrameworkId = jSInstanceManager.getJSFrameworkId()) == null) ? "" : jSFrameworkId;
    }

    public synchronized void executeWithArguments(JSONArray jSONArray, IJSCallback iJSCallback) {
        Object[] objArr = {jSONArray, iJSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a2ab93f7db2b32ea2e18c5d8912b235", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a2ab93f7db2b32ea2e18c5d8912b235");
        } else {
            executeWithArguments(jSONArray, null, iJSCallback);
        }
    }

    public synchronized void executeWithArguments(JSONArray jSONArray, JSONObject jSONObject, IJSCallback iJSCallback) {
        boolean z = false;
        Object[] objArr = {jSONArray, jSONObject, iJSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63a277fc567a9aee250fd4af2e2059ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63a277fc567a9aee250fd4af2e2059ba");
            return;
        }
        if (this.mScriptLoadStatus == 3 && this.mCurJSInstanceManager != null) {
            this.mCurJSInstanceManager.executeJSInstance(getInstanceId(), jSONArray, jSONObject, iJSCallback);
            z = true;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.mInstanceId);
            sb.append(" bundle script has not loaded");
            if (iJSCallback != null) {
                iJSCallback.onFailed(AiDownloadEnv.AI_JS_FRAMEWORK_PRESET_VERSION, new BlueException("bundle script has not loaded", BaseRaptorUploader.ERROR_LOAD_FAILED));
            }
        }
    }

    public synchronized void destroyInstance(IJSCallback iJSCallback) {
        Object[] objArr = {iJSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "490157773d8743e171cf157ba8041d0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "490157773d8743e171cf157ba8041d0d");
            return;
        }
        String str = this.mInstanceId;
        StringBuilder sb = new StringBuilder("destroy jsinstance ");
        sb.append(str);
        sb.append(" on all framework.");
        InstanceContainer.getInstance().removeInstance(str);
        for (JSInstanceManager jSInstanceManager : InstanceContainer.getInstance().getJSInstanceManagerMap().values()) {
            if (jSInstanceManager != null) {
                jSInstanceManager.destroyInstance(str, iJSCallback);
            }
        }
        this.mScriptLoadStatus = 1;
    }

    public String getInstanceId() {
        String str;
        synchronized (this) {
            str = this.mInstanceId;
        }
        return str;
    }

    private static String generateInstanceId() {
        String format;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "11450533c847ff06d84c5de270a259d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "11450533c847ff06d84c5de270a259d0");
        }
        synchronized (JSInstance.class) {
            Long l = id;
            id = Long.valueOf(id.longValue() + 1);
            format = String.format("js_instance_%s", l);
        }
        return format;
    }
}
