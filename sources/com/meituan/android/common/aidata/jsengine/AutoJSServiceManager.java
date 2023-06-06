package com.meituan.android.common.aidata.jsengine;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.AIDispatcher;
import com.meituan.android.common.aidata.ai.bundle.download.update.BundleInfo;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.async.AsyncManager;
import com.meituan.android.common.aidata.async.tasks.DependencyTask;
import com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener;
import com.meituan.android.common.aidata.jsengine.common.JSValueWrapper;
import com.meituan.android.common.aidata.jsengine.utils.JSCallback;
import com.meituan.android.common.aidata.jsengine.utils.JSExecuteUtil;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.resources.config.ResourceConfigManager;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AutoJSServiceManager {
    public static final String JS_PARAM_KEY_CUSTOM_PARAM = "customParam";
    public static final String JS_PARAM_KEY_PLATFORM = "platform";
    public static final String TAG = "AutoJS";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map<String, AiBundle> jsAiBundleMap;
    private final Map<String, IAutoJSRunInterceptor> jsInterceptorMap;
    private final Map<String, Set<AbsJSExecuteObserver>> mDebugObserverMap;
    private final byte[] mLock;
    private final Map<String, Set<AbsJSExecuteObserver>> observerMap;

    public AutoJSServiceManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67fc8976d3e58f1a6d3eaac055244c41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67fc8976d3e58f1a6d3eaac055244c41");
            return;
        }
        this.observerMap = new HashMap();
        this.mDebugObserverMap = new HashMap();
        this.jsAiBundleMap = new HashMap();
        this.jsInterceptorMap = new HashMap();
        this.mLock = new byte[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerClass {
        private static final AutoJSServiceManager STUB = new AutoJSServiceManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static AutoJSServiceManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1e9384c393561426e66b7aff3aabcb39", RobustBitConfig.DEFAULT_VALUE) ? (AutoJSServiceManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1e9384c393561426e66b7aff3aabcb39") : InnerClass.STUB;
    }

    public AbsJSExecuteObserver registerJSExecuteObserver(String str, AbsJSExecuteObserver absJSExecuteObserver) {
        Object[] objArr = {str, absJSExecuteObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e772e4333277a1c2405a9081331b4d0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbsJSExecuteObserver) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e772e4333277a1c2405a9081331b4d0f");
        }
        if (TextUtils.isEmpty(str) || absJSExecuteObserver == null) {
            return absJSExecuteObserver;
        }
        absJSExecuteObserver.setBundleName(str);
        if (absJSExecuteObserver.isDebug()) {
            registerJSExecuteObserver(str, absJSExecuteObserver, this.mDebugObserverMap);
        } else {
            registerJSExecuteObserver(str, absJSExecuteObserver, this.observerMap);
        }
        new StringBuilder("registerJSExecuteObserver,uniqueId:").append(str);
        return absJSExecuteObserver;
    }

    public void registerJSExecuteObserver(String str, AbsJSExecuteObserver absJSExecuteObserver, @NonNull Map<String, Set<AbsJSExecuteObserver>> map) {
        Object[] objArr = {str, absJSExecuteObserver, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "419e38e35dcfe7a21c67290239deb883", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "419e38e35dcfe7a21c67290239deb883");
            return;
        }
        Set<AbsJSExecuteObserver> set = map.get(str);
        if (set == null) {
            synchronized (this.mLock) {
                set = map.get(str);
                if (set == null) {
                    set = new HashSet<>();
                    map.put(str, set);
                }
            }
        }
        set.add(absJSExecuteObserver);
    }

    public void unregisterJSExecuteObserver(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bf9cb9f5bcbafbd41b002271bc63a98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bf9cb9f5bcbafbd41b002271bc63a98");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            synchronized (this.mLock) {
                this.observerMap.remove(str);
                this.mDebugObserverMap.remove(str);
            }
            new StringBuilder("unRegisterJSExecuteObserver All,uniqueId:").append(str);
        }
    }

    public void unregisterJSExecuteObserver(AbsJSExecuteObserver absJSExecuteObserver) {
        Object[] objArr = {absJSExecuteObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6625e7e94be2a6da3dfa9f3b7e537ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6625e7e94be2a6da3dfa9f3b7e537ac");
        } else if (absJSExecuteObserver == null || this.observerMap.isEmpty()) {
        } else {
            String bundleName = absJSExecuteObserver.getBundleName();
            synchronized (this.mLock) {
                Set<AbsJSExecuteObserver> set = this.observerMap.get(bundleName);
                if (set != null) {
                    set.remove(absJSExecuteObserver);
                }
            }
        }
    }

    public void registerJSExecuteInfo(AiBundle aiBundle, String str) {
        Object[] objArr = {aiBundle, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30c736227b1d9aac4b438787dfe8c233", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30c736227b1d9aac4b438787dfe8c233");
        } else if (aiBundle == null || TextUtils.isEmpty(str)) {
        } else {
            synchronized (this.jsAiBundleMap) {
                this.jsAiBundleMap.put(str, aiBundle);
            }
            new StringBuilder("registerJSExecuteInfo , uniqueId:").append(str);
        }
    }

    public void executeJS(int i, String str, JSONArray jSONArray, JSCallback jSCallback) {
        Object[] objArr = {Integer.valueOf(i), str, jSONArray, jSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a8b0e5ee576ef581375fc7bb3f1cf7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a8b0e5ee576ef581375fc7bb3f1cf7e");
        } else {
            JSExecuteUtil.execute(i, str, this.jsAiBundleMap.get(str), jSONArray, jSCallback);
        }
    }

    public void executeJS(String str, JSONArray jSONArray, JSCallback jSCallback) {
        Object[] objArr = {str, jSONArray, jSCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2220be3a0743dde3a252457c2ee41dab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2220be3a0743dde3a252457c2ee41dab");
        } else {
            JSExecuteUtil.execute(5, str, this.jsAiBundleMap.get(str), jSONArray, jSCallback);
        }
    }

    public void executeJS(final String str, JSONArray jSONArray) {
        Object[] objArr = {str, jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48c5b205c2691235235af48b22e5544b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48c5b205c2691235235af48b22e5544b");
        } else {
            JSExecuteUtil.execute(5, str, this.jsAiBundleMap.get(str), jSONArray, new JSCallback() { // from class: com.meituan.android.common.aidata.jsengine.AutoJSServiceManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.jsengine.utils.JSCallback
                public void onSuccess(String str2, JSValueWrapper jSValueWrapper, int i, long j) {
                    Object[] objArr2 = {str2, jSValueWrapper, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2cca83c4df0375c1cefd54267288fdf6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2cca83c4df0375c1cefd54267288fdf6");
                    } else if (jSValueWrapper == null) {
                        onFailed(str2, new BlueException("JSValueWrapper is null"), i, j);
                    } else {
                        AutoJSServiceManager.this.callbackObserver(str, jSValueWrapper.getObjectData(), null, true);
                        new StringBuilder("executeJS success:").append(str);
                    }
                }

                @Override // com.meituan.android.common.aidata.jsengine.utils.JSCallback
                public void onFailed(String str2, BlueException blueException, int i, long j) {
                    Object[] objArr2 = {str2, blueException, Integer.valueOf(i), new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "633d860bbd3f006e2dbe58e688328152", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "633d860bbd3f006e2dbe58e688328152");
                        return;
                    }
                    AutoJSServiceManager.this.callbackObserver(str, null, blueException, false);
                    new StringBuilder("executeJS fail:").append(blueException);
                }
            });
        }
    }

    public void callbackObserver(String str, Object obj, Exception exc, boolean z) {
        Object[] objArr = {str, obj, exc, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b50a08155d4a7a36f81251918f57cd96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b50a08155d4a7a36f81251918f57cd96");
            return;
        }
        synchronized (this.mLock) {
            Set<AbsJSExecuteObserver> set = this.observerMap.get(str);
            if (this.mDebugObserverMap.size() > 0) {
                set = this.mDebugObserverMap.get(str);
            }
            if (set != null && !set.isEmpty()) {
                for (AbsJSExecuteObserver absJSExecuteObserver : new ArrayList(set)) {
                    if (absJSExecuteObserver != null) {
                        if (z) {
                            absJSExecuteObserver.onSuccess(obj);
                        } else {
                            absJSExecuteObserver.onFail(exc);
                        }
                    }
                }
            }
        }
    }

    public void setJSRunInterceptor(String str, IAutoJSRunInterceptor iAutoJSRunInterceptor) {
        Object[] objArr = {str, iAutoJSRunInterceptor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef07b4391d9f6ac094ec0dc0b247fe57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef07b4391d9f6ac094ec0dc0b247fe57");
        } else if (TextUtils.isEmpty(str) || iAutoJSRunInterceptor == null) {
        } else {
            synchronized (this.jsInterceptorMap) {
                this.jsInterceptorMap.put(str, iAutoJSRunInterceptor);
            }
            new StringBuilder("setJSRunInterceptor,uniqueId:").append(str);
        }
    }

    public void removeJSRunInterceptor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "895fbf9ae4e2ba172eaa35e7a035be1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "895fbf9ae4e2ba172eaa35e7a035be1b");
            return;
        }
        synchronized (this.jsInterceptorMap) {
            this.jsInterceptorMap.remove(str);
        }
        new StringBuilder("removeJSRunInterceptor,uniqueId : ").append(str);
    }

    public IAutoJSRunInterceptor getJSRunInterceptor(String str) {
        IAutoJSRunInterceptor iAutoJSRunInterceptor;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50303105b4a0a5afaab4ce5269143bfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (IAutoJSRunInterceptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50303105b4a0a5afaab4ce5269143bfb");
        }
        synchronized (this.jsInterceptorMap) {
            iAutoJSRunInterceptor = this.jsInterceptorMap.get(str);
        }
        return iAutoJSRunInterceptor;
    }

    public void executeJSBundle(final String str, final Object obj, final AbsJSExecuteObserver absJSExecuteObserver) {
        Object[] objArr = {str, obj, absJSExecuteObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a594503fdc78c4fee138aa44b698b45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a594503fdc78c4fee138aa44b698b45");
            return;
        }
        StringBuilder sb = new StringBuilder("executeJSBundle : ");
        sb.append(str);
        sb.append(" customParam : ");
        sb.append(obj);
        final BundleInfo autoJSBundleInfo = ResourceConfigManager.getInstance().getAutoJSBundleInfo(str);
        DependencyTask<BundleInfo, AiBundle> addOnTaskFinishListener = AIDispatcher.getInstance().generateBundleTask(autoJSBundleInfo).addOnTaskFinishListener(new OnTaskFinishListener<BundleInfo, AiBundle>() { // from class: com.meituan.android.common.aidata.jsengine.AutoJSServiceManager.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
            public /* bridge */ /* synthetic */ void onTaskFinish(Map<BundleInfo, AiBundle> map, AiBundle aiBundle, long j, List list) {
                onTaskFinish2(map, aiBundle, j, (List<Exception>) list);
            }

            /* renamed from: onTaskFinish  reason: avoid collision after fix types in other method */
            public void onTaskFinish2(Map<BundleInfo, AiBundle> map, AiBundle aiBundle, long j, List<Exception> list) {
                AiBundle aiBundle2;
                Object[] objArr2 = {map, aiBundle, new Long(j), list};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9847105b59dfcf441d166daab8556d33", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9847105b59dfcf441d166daab8556d33");
                } else if (aiBundle == null || aiBundle.isAutoJSBundleInValid() || TextUtils.isEmpty(str) || (aiBundle2 = (AiBundle) AutoJSServiceManager.this.jsAiBundleMap.get(str)) == null) {
                    StringBuilder sb2 = new StringBuilder("executeJSBundle : aiBundle is not valid , ");
                    sb2.append(str);
                    sb2.append(" customParam : ");
                    sb2.append(obj);
                    AIDispatcher.getInstance().removeBundle(autoJSBundleInfo);
                } else {
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject = new JSONObject();
                    if (obj != null) {
                        try {
                            jSONObject.put("customParam", obj);
                        } catch (Exception unused) {
                        }
                    }
                    jSONArray.put(jSONObject);
                    StringBuilder sb3 = new StringBuilder("executeJSBundle start : ");
                    sb3.append(str);
                    sb3.append(" customParam : ");
                    sb3.append(obj);
                    JSExecuteUtil.execute(5, str, aiBundle2, jSONArray, new JSCallback() { // from class: com.meituan.android.common.aidata.jsengine.AutoJSServiceManager.2.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.meituan.android.common.aidata.jsengine.utils.JSCallback
                        public void onSuccess(String str2, JSValueWrapper jSValueWrapper, int i, long j2) {
                            Object[] objArr3 = {str2, jSValueWrapper, Integer.valueOf(i), new Long(j2)};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c0f08bdfec23459cd41072712fa7593e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c0f08bdfec23459cd41072712fa7593e");
                            } else if (jSValueWrapper == null) {
                                onFailed(str2, new BlueException("JSValueWrapper is null"), i, j2);
                            } else {
                                if (absJSExecuteObserver != null) {
                                    absJSExecuteObserver.onSuccess(jSValueWrapper.getObjectData());
                                }
                                if (!TextUtils.equals("prod", AppUtil.getEnv())) {
                                    AutoJSServiceManager.this.callbackObserver(str, jSValueWrapper.getObjectData(), null, true);
                                }
                                StringBuilder sb4 = new StringBuilder("executeJSBundle success inner : ");
                                sb4.append(str);
                                sb4.append(" : ");
                                sb4.append(jSValueWrapper.getObjectData());
                            }
                        }

                        @Override // com.meituan.android.common.aidata.jsengine.utils.JSCallback
                        public void onFailed(String str2, BlueException blueException, int i, long j2) {
                            Object[] objArr3 = {str2, blueException, Integer.valueOf(i), new Long(j2)};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f5f2d1d590336f10446f2b67aba251de", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f5f2d1d590336f10446f2b67aba251de");
                                return;
                            }
                            if (absJSExecuteObserver != null) {
                                absJSExecuteObserver.onFail(blueException);
                            }
                            if (!TextUtils.equals("prod", AppUtil.getEnv())) {
                                AutoJSServiceManager.this.callbackObserver(str, "", blueException, false);
                            }
                            new StringBuilder("executeJSBundle fail inner : ").append(blueException);
                        }
                    });
                }
            }
        });
        AsyncManager.executeSingle(addOnTaskFinishListener, addOnTaskFinishListener.isOriginalTask() ? 1 : 2);
    }
}
