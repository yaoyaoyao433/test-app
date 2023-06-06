package com.meituan.android.common.aidata.jsengine.modules;

import android.text.TextUtils;
import com.meituan.android.common.aidata.async.AsyncHashMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NativeModuleManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile NativeModuleManager sJSBridgeInterface;
    private final Map<String, Map<String, IJSNativeMethod>> invokeNativeMethodMap;

    public NativeModuleManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a700930afc8843bb056caa27ddbb54b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a700930afc8843bb056caa27ddbb54b");
        } else {
            this.invokeNativeMethodMap = new AsyncHashMap();
        }
    }

    public static NativeModuleManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f10bd0bf6fccbfdd6ce56235c423dbcf", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeModuleManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f10bd0bf6fccbfdd6ce56235c423dbcf");
        }
        if (sJSBridgeInterface == null) {
            synchronized (NativeModuleManager.class) {
                if (sJSBridgeInterface == null) {
                    sJSBridgeInterface = new NativeModuleManager();
                }
            }
        }
        return sJSBridgeInterface;
    }

    public Map<String, IJSNativeMethod> getNativeModule(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "307c43061cdcc0914021c330dae4a039", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "307c43061cdcc0914021c330dae4a039") : this.invokeNativeMethodMap.get(str);
    }

    public void registerNativeModule(List<INativeModuleProvider> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b56add862b614e700b6fcf0c9f4deed2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b56add862b614e700b6fcf0c9f4deed2");
        } else if (list != null && list.size() > 0) {
            for (INativeModuleProvider iNativeModuleProvider : list) {
                parseSingleConfigProvider(iNativeModuleProvider);
            }
        }
    }

    private void parseSingleConfigProvider(INativeModuleProvider iNativeModuleProvider) {
        List<IJSNativeModule> modulePackageList;
        Object[] objArr = {iNativeModuleProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4973493bae2cb091eb9cf97bef6e5bb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4973493bae2cb091eb9cf97bef6e5bb2");
        } else if (iNativeModuleProvider != null && (modulePackageList = iNativeModuleProvider.getModulePackageList()) != null && modulePackageList.size() > 0) {
            for (IJSNativeModule iJSNativeModule : iNativeModuleProvider.getModulePackageList()) {
                if (iJSNativeModule != null) {
                    String name = iJSNativeModule.name();
                    if (!TextUtils.isEmpty(name)) {
                        if (this.invokeNativeMethodMap.containsKey(name)) {
                            this.invokeNativeMethodMap.get(name).putAll(iJSNativeModule.getAllMethods());
                        } else {
                            this.invokeNativeMethodMap.put(name, iJSNativeModule.getAllMethods());
                        }
                    }
                }
            }
        }
    }

    public JSONObject getModuleConfigJSON() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1898dbfb15689993e0605fd40e445d5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1898dbfb15689993e0605fd40e445d5a");
        }
        if (this.invokeNativeMethodMap != null && this.invokeNativeMethodMap.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            for (String str : this.invokeNativeMethodMap.keySet()) {
                Map<String, IJSNativeMethod> map = this.invokeNativeMethodMap.get(str);
                if (map != null && map.size() > 0) {
                    try {
                        JSONArray jSONArray = new JSONArray();
                        for (String str2 : map.keySet()) {
                            IJSNativeMethod iJSNativeMethod = map.get(str2);
                            if (iJSNativeMethod != null && iJSNativeMethod.getMethodName() != null) {
                                jSONArray.put(iJSNativeMethod.getMethodName());
                            }
                        }
                        jSONObject.put(str, jSONArray);
                    } catch (Exception unused) {
                    }
                }
            }
            return jSONObject;
        }
        return new JSONObject();
    }
}
