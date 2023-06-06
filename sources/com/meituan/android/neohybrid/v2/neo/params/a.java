package com.meituan.android.neohybrid.v2.neo.params;

import android.os.Build;
import com.google.gson.JsonObject;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.android.neohybrid.core.config.NSFConfig;
import com.meituan.android.neohybrid.util.f;
import com.meituan.android.neohybrid.v2.neo.bridge.handler.b;
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

    public static byte[] a(byte[] bArr, com.meituan.android.neohybrid.v2.core.a aVar) {
        Object[] objArr = {bArr, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb502bd58e17fb33ab76c64bd6c663d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb502bd58e17fb33ab76c64bd6c663d0");
        }
        byte[] bytes = ("<script>window._neo=" + a(aVar) + "</script>").getBytes();
        Object[] objArr2 = {bytes, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2ea82009bee1c190ff57ed164d8e0739", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2ea82009bee1c190ff57ed164d8e0739");
        }
        byte[] bArr2 = new byte[bytes.length + bArr.length];
        System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
        System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
        return bArr2;
    }

    public static String a(com.meituan.android.neohybrid.v2.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4eca743761f982ff111413dc68d482a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4eca743761f982ff111413dc68d482a6");
        }
        String jsonObject = c(aVar).toString();
        f.a("NeoParamsInjecter_getNeoParams: " + jsonObject);
        return jsonObject;
    }

    private static JsonObject c(com.meituan.android.neohybrid.v2.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2cba10f282b8a589f58dd3cf9259ce08", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2cba10f282b8a589f58dd3cf9259ce08");
        }
        JsonObject jsonObject = new JsonObject();
        Map<String, JsonObject> b2 = b(aVar);
        for (String str : b2.keySet()) {
            jsonObject.add(str, b2.get(str));
        }
        return jsonObject;
    }

    public static Map<String, JsonObject> b(com.meituan.android.neohybrid.v2.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5928a6029a8ea8dcdf2300b32893234", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5928a6029a8ea8dcdf2300b32893234");
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0436a0053a87b9c0ed1ef718e0a055ac", RobustBitConfig.DEFAULT_VALUE) ? (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0436a0053a87b9c0ed1ef718e0a055ac") : new JsonObject();
    }

    private static JsonObject d(com.meituan.android.neohybrid.v2.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6b5292120f4d064b885851c2d802ce6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6b5292120f4d064b885851c2d802ce6");
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("bridge", e(aVar));
        return jsonObject;
    }

    private static JsonObject e(com.meituan.android.neohybrid.v2.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63577cdd025de74b20d65534515fd6a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63577cdd025de74b20d65534515fd6a5");
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

    private static String[] f(com.meituan.android.neohybrid.v2.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1095f92ce99f9606a6d62370d1a6e65", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1095f92ce99f9606a6d62370d1a6e65");
        }
        Map<String, b> n = aVar.n();
        String[] strArr = new String[n.size()];
        Iterator<Map.Entry<String, b>> it = n.entrySet().iterator();
        for (int i = 0; i < n.size(); i++) {
            strArr[i] = it.next().getKey();
        }
        return strArr;
    }

    private static JsonObject g(com.meituan.android.neohybrid.v2.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e46a8cd22134bbb3dd45a100d857b5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e46a8cd22134bbb3dd45a100d857b5f");
        }
        JsonObject jsonObject = new JsonObject();
        com.meituan.android.paybase.config.b d = com.meituan.android.paybase.config.a.d();
        jsonObject.addProperty("os", "android");
        jsonObject.addProperty("app_name", d.k());
        jsonObject.addProperty(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, d.l());
        jsonObject.addProperty("device_id", d.h());
        jsonObject.addProperty("device_model", Build.MODEL);
        jsonObject.addProperty("os_version", d.e());
        jsonObject.addProperty("app_pay_sdk_version", d.q());
        jsonObject.addProperty("app_channel", d.c());
        jsonObject.addProperty("device_platform", d.d());
        jsonObject.addProperty("unique_id", aVar.l());
        return jsonObject;
    }
}
