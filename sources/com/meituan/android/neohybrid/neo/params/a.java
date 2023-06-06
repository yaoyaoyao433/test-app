package com.meituan.android.neohybrid.neo.params;

import android.os.Build;
import com.google.gson.JsonObject;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.android.neohybrid.core.config.NSFConfig;
import com.meituan.android.neohybrid.neo.bridge.handler.NeoBridgeCustomizeInterface;
import com.meituan.android.neohybrid.util.f;
import com.meituan.android.paybase.config.b;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"tunnel", "storage", SocialConstants.TYPE_REQUEST, NSFConfig.NEO_NSF, "notify", "customize", "kit", "ssr"};

    public static byte[] a(byte[] bArr, com.meituan.android.neohybrid.core.a aVar) {
        Object[] objArr = {bArr, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2984a8c1c4def3fb35b9eccb9675855b", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2984a8c1c4def3fb35b9eccb9675855b");
        }
        byte[] bytes = ("<script>window._neo=" + a(aVar) + "</script>").getBytes();
        Object[] objArr2 = {bytes, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "dc82ec820fd18ed3196b71fdfdd557c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "dc82ec820fd18ed3196b71fdfdd557c1");
        }
        byte[] bArr2 = new byte[bytes.length + bArr.length];
        System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
        System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
        return bArr2;
    }

    public static String a(com.meituan.android.neohybrid.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8df2a76fa018a9bd9ad1e3fc9e96eabd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8df2a76fa018a9bd9ad1e3fc9e96eabd");
        }
        String jsonObject = c(aVar).toString();
        f.a("NeoParamsInjecter_getNeoParams: " + jsonObject);
        return jsonObject;
    }

    private static JsonObject c(com.meituan.android.neohybrid.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cf74aab0f347ef7e556af567746bf3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cf74aab0f347ef7e556af567746bf3e");
        }
        JsonObject jsonObject = new JsonObject();
        Map<String, JsonObject> b2 = b(aVar);
        for (String str : b2.keySet()) {
            jsonObject.add(str, b2.get(str));
        }
        return jsonObject;
    }

    public static Map<String, JsonObject> b(com.meituan.android.neohybrid.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5630d39414a6f3b38d67e6471be8396c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5630d39414a6f3b38d67e6471be8396c");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KernelConfig.CONTAINER_TYPE_NEO, d(aVar));
        hashMap.put("env", g(aVar));
        hashMap.put("biz", a());
        return hashMap;
    }

    private static JsonObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fc31977fc9faf9fe156f7b04b9c06a7", RobustBitConfig.DEFAULT_VALUE) ? (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fc31977fc9faf9fe156f7b04b9c06a7") : new JsonObject();
    }

    private static JsonObject d(com.meituan.android.neohybrid.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "945c73d0baa823b5f31f38c5363d16c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "945c73d0baa823b5f31f38c5363d16c1");
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("bridge", e(aVar));
        return jsonObject;
    }

    private static JsonObject e(com.meituan.android.neohybrid.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6922dfca9fc7188a0a9998f9e10a40c", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6922dfca9fc7188a0a9998f9e10a40c");
        }
        HashMap hashMap = new HashMap(b.length);
        hashMap.put(b[0], new String[]{"all_params"});
        hashMap.put(b[1], new String[]{"set", "get"});
        hashMap.put(b[2], new String[]{TrafficRecord.Detail.TUNNEL_SHARK});
        hashMap.put(b[3], (aVar.f() == null || !aVar.f().nsfConfig().isNsfSaved()) ? new String[]{"hybrid_fetch"} : new String[]{"hybrid_fetch", "hybrid_refresh"});
        hashMap.put(b[4], new String[]{"notify_prerender_finished", "notify_render_finished"});
        hashMap.put(b[5], f(aVar));
        hashMap.put(b[6], new String[]{"encrypt", "decrypt"});
        hashMap.put(b[7], new String[]{PackageLoadReporter.Source.PREFETCH});
        JsonObject jsonObject = new JsonObject();
        for (String str : hashMap.keySet()) {
            String[] strArr = (String[]) hashMap.get(str);
            JsonObject jsonObject2 = new JsonObject();
            if (strArr != null) {
                for (String str2 : strArr) {
                    jsonObject2.addProperty(str2, (Number) 1);
                }
                jsonObject.add(str, jsonObject2);
            }
        }
        return jsonObject;
    }

    private static String[] f(com.meituan.android.neohybrid.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1ee4fd9ef55e036654517fca0bce807", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1ee4fd9ef55e036654517fca0bce807");
        }
        Map<String, NeoBridgeCustomizeInterface> p = aVar.p();
        String[] strArr = new String[p.size()];
        Iterator<Map.Entry<String, NeoBridgeCustomizeInterface>> it = p.entrySet().iterator();
        for (int i = 0; i < p.size(); i++) {
            strArr[i] = it.next().getKey();
        }
        return strArr;
    }

    private static JsonObject g(com.meituan.android.neohybrid.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4048a18bd76945936022a81aded1027e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4048a18bd76945936022a81aded1027e");
        }
        JsonObject jsonObject = new JsonObject();
        b d = com.meituan.android.paybase.config.a.d();
        jsonObject.addProperty("os", "android");
        jsonObject.addProperty("app_name", d.k());
        jsonObject.addProperty(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, d.l());
        jsonObject.addProperty("device_id", d.h());
        jsonObject.addProperty("device_model", Build.MODEL);
        jsonObject.addProperty("os_version", d.e());
        jsonObject.addProperty("app_pay_sdk_version", d.q());
        jsonObject.addProperty("app_channel", d.c());
        jsonObject.addProperty("device_platform", d.d());
        jsonObject.addProperty("unique_id", aVar.o());
        return jsonObject;
    }
}
