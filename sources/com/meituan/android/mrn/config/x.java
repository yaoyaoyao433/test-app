package com.meituan.android.mrn.config;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class x implements com.meituan.android.mrn.horn.e {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    @Override // com.meituan.android.mrn.horn.e
    public final String a(ReactApplicationContext reactApplicationContext) {
        return "android-com.meituan.android.mrn:netinfo";
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e20ebf49572d54de090684b06bddabc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e20ebf49572d54de090684b06bddabc");
        } else if (b) {
        } else {
            synchronized (x.class) {
                if (b) {
                    return;
                }
                x xVar = new x();
                xVar.b();
                com.meituan.android.mrn.horn.f.a(xVar);
                l.a();
                m.a();
                b = true;
            }
        }
    }

    @Override // com.meituan.android.mrn.horn.e
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f038aad96e4bb013ed3b23d420bf763b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f038aad96e4bb013ed3b23d420bf763b")).booleanValue() : n.a().b();
    }

    @Override // com.meituan.android.mrn.horn.e
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1587a18885a7760691d438157e1c5d79", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1587a18885a7760691d438157e1c5d79")).booleanValue() : !com.meituan.android.mrn.debug.a.c();
    }

    @Override // com.meituan.android.mrn.horn.e
    public final boolean a(String str, ReactApplicationContext reactApplicationContext) {
        String str2;
        com.meituan.android.mrn.utils.config.b a2;
        Object[] objArr = {str, reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "437686b0bb60adb4ef4b65b588e5d70a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "437686b0bb60adb4ef4b65b588e5d70a")).booleanValue();
        }
        Object[] objArr2 = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c586dd1938de9827fab806444fb7852a", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c586dd1938de9827fab806444fb7852a");
        } else {
            com.meituan.android.mrn.engine.k a3 = com.meituan.android.mrn.utils.r.a(reactApplicationContext);
            str2 = a3 == null ? null : a3.k;
        }
        if (str2 == null) {
            com.facebook.common.logging.a.d("[MRNReactNativeHornConfigDelegate@isBundleInWhiteList]", "currentMRNInstance null: " + str);
            return false;
        }
        l a4 = l.a();
        Object[] objArr3 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect3 = l.a;
        if (PatchProxy.isSupport(objArr3, a4, changeQuickRedirect3, false, "8cd1def68cae81604773ae50ff886e94", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr3, a4, changeQuickRedirect3, false, "8cd1def68cae81604773ae50ff886e94")).booleanValue();
        }
        List list = (List) t.b.a("controlList");
        if (list == null || list.isEmpty()) {
            com.facebook.common.logging.a.d("[MRNBridgeControlConfig@isBridgeAndBundleInWhiteList]", "bridge map is empty, not control: " + list);
            return true;
        } else if (!list.contains(str)) {
            com.facebook.common.logging.a.d("[MRNBridgeControlConfig@isBridgeAndBundleInWhiteList]", "bridge not in control list, not control: " + str);
            return true;
        } else {
            final m a5 = m.a();
            Object[] objArr4 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect4 = m.a;
            if (PatchProxy.isSupport(objArr4, a5, changeQuickRedirect4, false, "e3db6d6d8f890ebe2f0f646ff4d60c0d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr4, a5, changeQuickRedirect4, false, "e3db6d6d8f890ebe2f0f646ff4d60c0d")).booleanValue();
            }
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = m.a;
            if (PatchProxy.isSupport(objArr5, a5, changeQuickRedirect5, false, "31ea844556df294a88f97d32a62797ee", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (com.meituan.android.mrn.utils.config.b) PatchProxy.accessDispatch(objArr5, a5, changeQuickRedirect5, false, "31ea844556df294a88f97d32a62797ee");
            } else {
                a2 = com.meituan.android.mrn.utils.config.a.a();
                String e = c.a().e();
                if (com.meituan.android.mrn.config.horn.a.a.equals(e)) {
                    a2.c = com.meituan.android.mrn.config.horn.a.f;
                } else if (com.meituan.android.mrn.config.horn.a.b.equals(e)) {
                    a2.c = com.meituan.android.mrn.config.horn.a.e;
                }
            }
            t tVar = t.b;
            Object[] objArr6 = {"mrn_bridge_control_config_map_android", a2};
            ChangeQuickRedirect changeQuickRedirect6 = t.a;
            JsonObject a6 = PatchProxy.isSupport(objArr6, tVar, changeQuickRedirect6, false, "c49b7b6167c267e8ddfa4ec8c2586514", RobustBitConfig.DEFAULT_VALUE) ? (JsonObject) PatchProxy.accessDispatch(objArr6, tVar, changeQuickRedirect6, false, "c49b7b6167c267e8ddfa4ec8c2586514") : t.c.a(t.a("mrn_bridge_control_config_map_android", a2));
            if (a6 == null) {
                com.facebook.common.logging.a.d("[MRNBridgeMapConfig@isBundleInWhiteList]", "false, Horn data null");
                return false;
            } else if (!a6.has(str)) {
                com.facebook.common.logging.a.d("[MRNBridgeMapConfig@isBundleInWhiteList]", "false, Horn data not null, but bridge is not exist: " + str);
                return false;
            } else {
                JsonElement jsonElement = a6.get(str);
                if (!jsonElement.isJsonArray() || jsonElement.getAsJsonArray().size() == 0) {
                    com.facebook.common.logging.a.d("[MRNBridgeMapConfig@isBundleInWhiteList]", "false, bridge exist in Horn,but bundle list is empty: " + str);
                    return false;
                }
                ArrayList arrayList = (ArrayList) new Gson().fromJson((JsonArray) jsonElement, new TypeToken<ArrayList<String>>() { // from class: com.meituan.android.mrn.config.m.4
                }.getType());
                if (arrayList == null) {
                    com.facebook.common.logging.a.d("[MRNBridgeMapConfig@isBundleInWhiteList]", "false, bundleList transfer failed: " + arrayList);
                    return false;
                }
                return arrayList.contains(str2);
            }
        }
    }

    @Override // com.meituan.android.mrn.horn.e
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd1762cd020aafc83f7e3a74c477ce2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd1762cd020aafc83f7e3a74c477ce2e")).booleanValue();
        }
        l a2 = l.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = l.a;
        return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "e9c939fe807bf92eb0e37179d756e812", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "e9c939fe807bf92eb0e37179d756e812")).booleanValue() : ((Boolean) t.b.a("controlEnabled")).booleanValue();
    }

    @Override // com.meituan.android.mrn.horn.e
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7564e91e6ef8ca1e68869c49a7202fdf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7564e91e6ef8ca1e68869c49a7202fdf")).booleanValue() : com.meituan.android.mrn.utils.q.c();
    }

    @Override // com.meituan.android.mrn.horn.e
    public final void a(String str, ReactApplicationContext reactApplicationContext, boolean z, int i) {
        Object[] objArr = {str, reactApplicationContext, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d121b6e4d8f2fccb100f1b74dddd8c6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d121b6e4d8f2fccb100f1b74dddd8c6a");
        } else {
            com.meituan.android.mrn.monitor.g.a().a(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(i)).a("methodName", str).b("MRNBridgeControl", z ? 1.0f : 0.0f);
        }
    }

    @Override // com.meituan.android.mrn.horn.e
    public final void a(ReactApplicationContext reactApplicationContext, String str) {
        Object[] objArr = {reactApplicationContext, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15f044ebc16050585f6ccf4c29b225e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15f044ebc16050585f6ccf4c29b225e9");
            return;
        }
        com.meituan.android.mrn.engine.k a2 = com.meituan.android.mrn.utils.r.a(reactApplicationContext);
        if (a2 == null || a2.b == null || a2.b.getDevSupportManager() == null) {
            com.facebook.common.logging.a.d("[MRNReactNativeHornConfigDelegate@showRedScreenIfDebug]", "mrnInstance null: " + str);
            return;
        }
        Exception exc = new Exception("[仅测试包展示]" + str + "涉及隐私API,请升级适配");
        ReactInstanceManager reactInstanceManager = a2.b;
        if (reactInstanceManager.getCurrentActivity() == null) {
            reactInstanceManager.setCurrentActivity(com.meituan.android.mrn.router.c.a().b());
        }
        reactInstanceManager.getDevSupportManager();
        StringBuilder sb = new StringBuilder("此类异常修复请参考文档：https://km.sankuai.com/page/277968556\n\n");
        sb.append(exc.getMessage() == null ? "Exception in native call from JS" : exc.getMessage());
        Throwable cause = exc.getCause();
        Exception exc2 = exc;
        while (cause != null) {
            sb.append("\n\n");
            sb.append(cause.getMessage());
            cause = cause.getCause();
            exc2 = exc2.getCause();
        }
    }
}
