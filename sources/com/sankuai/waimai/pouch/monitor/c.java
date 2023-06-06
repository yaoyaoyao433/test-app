package com.sankuai.waimai.pouch.monitor;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static int b;
    public static String c;
    public static String d;
    public static Map<String, String> e;

    private static String a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0e982b7d64cfd6907bafb6be424648b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0e982b7d64cfd6907bafb6be424648b");
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        int size = list.size();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < size; i++) {
            stringBuffer.append(list.get(i));
            if (i != size - 1) {
                stringBuffer.append(CommonConstant.Symbol.COMMA);
            }
        }
        return stringBuffer.toString();
    }

    public static void a(@NonNull b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29cc574f2ffc0713cb027759c4d99855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29cc574f2ffc0713cb027759c4d99855");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_id", bVar.a);
            jSONObject.put("container_id", bVar.c);
            jSONObject.put("fail_reason", bVar.b);
            jSONObject.put("index", bVar.f);
            jSONObject.put("business_name", bVar.d);
            e.a(new d().a("waimai_ad_module").b("template_load_fail").d(jSONObject.toString()).a(true).b(), e);
            a(0, bVar.a, 1, bVar.c, bVar.f, bVar.d, bVar.b, bVar.g);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abad2cb4001ea793e813e18bc1ed068c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abad2cb4001ea793e813e18bc1ed068c");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_id", bVar.a);
            jSONObject.put("ad_type", bVar.e);
            jSONObject.put("container_id", bVar.c);
            jSONObject.put("index", bVar.f);
            jSONObject.put("business_name", bVar.d);
            e.c(new d().a("waimai_ad_module").b("template_render_success").d(jSONObject.toString()).a(true).b(false).b());
            a(1, bVar.a, 0, bVar.c, bVar.f, bVar.d, null, bVar.g);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void c(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7d1aa582829bfd18bb672fd0ac857a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7d1aa582829bfd18bb672fd0ac857a1");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            if (e != null && !e.isEmpty()) {
                hashMap.putAll(e);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_id", bVar.a);
            jSONObject.put("ad_type", bVar.e);
            jSONObject.put("index", bVar.f);
            jSONObject.put("business_name", bVar.d);
            if (!TextUtils.isEmpty(bVar.b)) {
                jSONObject.put("fail_reason", bVar.b);
            }
            jSONObject.put("container_id", bVar.c);
            hashMap.put("templateId", bVar.a);
            hashMap.put("container_id", bVar.c);
            e.a(new d().a("waimai_ad_module").b("template_render_fail").d(jSONObject.toString()).a(true).b(), hashMap);
            a(0, bVar.a, 2, bVar.c, bVar.f, bVar.d, bVar.b, bVar.g);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void d(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e101f3003e553bfc3621744d7316694a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e101f3003e553bfc3621744d7316694a");
            return;
        }
        if (e == null) {
            e = new HashMap();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad_type", bVar.e);
            jSONObject.put("fail_reason", bVar.b);
            jSONObject.put("business_name", bVar.d);
            e.a(new d().a("waimai_ad_module").b("data_parse_error").d(jSONObject.toString()).a(true).b(), e);
            a(0, bVar.a, 2, bVar.c, bVar.f, bVar.d, bVar.b, bVar.g);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void a(Map<String, String> map, String str, String str2, PouchDynamicAd pouchDynamicAd, String str3, boolean z) {
        Object[] objArr = {map, str, str2, pouchDynamicAd, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5ddac833b09740629c0613895ad5935", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5ddac833b09740629c0613895ad5935");
            return;
        }
        String str4 = pouchDynamicAd != null ? pouchDynamicAd.businessName : null;
        String str5 = pouchDynamicAd != null ? pouchDynamicAd.adTemplateId : null;
        String str6 = pouchDynamicAd != null ? pouchDynamicAd.adContainerId : null;
        map.put("module_id", "waimai_ad_module");
        map.put("plugin_id", str);
        map.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, z ? "0" : "1");
        map.put("reason", str3);
        map.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, d);
        map.put("platform", "android");
        map.put("business_name", str4);
        map.put("template_id", str5);
        map.put("container_id", str6);
        map.put("plugin_type", str2);
    }

    public static void a(String str, String str2, List<String> list, PouchDynamicAd pouchDynamicAd) {
        Object[] objArr = {str, str2, list, pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b6dde7831f54d9c6a6ca3dd376baf193", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b6dde7831f54d9c6a6ca3dd376baf193");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("pouch_plugin_result", 1);
            HashMap hashMap2 = new HashMap();
            a(hashMap2, str, str2, pouchDynamicAd, "success", true);
            a(hashMap, hashMap2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(String str, String str2, List<String> list, PouchDynamicAd pouchDynamicAd, String str3) {
        Object[] objArr = {str, str2, list, pouchDynamicAd, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8c73f31616be9df744c282c4e7691dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8c73f31616be9df744c282c4e7691dc");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("pouch_plugin_result", 0);
            HashMap hashMap2 = new HashMap();
            a(hashMap2, str, str2, pouchDynamicAd, str3, false);
            a(hashMap, hashMap2);
            JSONObject jSONObject = new JSONObject();
            Object[] objArr2 = {jSONObject, str, list, str2, pouchDynamicAd, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "49a290ddcdbf891ce61f5ad54aa83903", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "49a290ddcdbf891ce61f5ad54aa83903");
            } else {
                String str4 = pouchDynamicAd != null ? pouchDynamicAd.businessName : null;
                String str5 = pouchDynamicAd != null ? pouchDynamicAd.adTemplateId : null;
                String str6 = pouchDynamicAd != null ? pouchDynamicAd.adContainerId : null;
                jSONObject.put("plugin_id", str);
                jSONObject.put("template_id", str5);
                jSONObject.put("container_id", str6);
                jSONObject.put("business_name", str4);
                jSONObject.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, "1");
                jSONObject.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, d);
                jSONObject.put("platform", "android");
                jSONObject.put("plugin_type", str2);
                if (list != null) {
                    if (TextUtils.equals(str2, "interaction")) {
                        jSONObject.put("plugin_interaction_ids", a(list));
                    } else if (TextUtils.equals(str2, "expose")) {
                        jSONObject.put("plugin_expose_ids", a(list));
                    }
                }
            }
            jSONObject.put("fail_reason", str3);
            e.a(new d().a("waimai_ad_module").b("plugin_load_fail").d(jSONObject.toString()).a(true).b(), e);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "600449012f40ea1495df15f948a1b996", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "600449012f40ea1495df15f948a1b996");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            MetricsSpeedMeterTask customSpeedMeterTask = MetricsSpeedMeterTask.getCustomSpeedMeterTask(str);
            if (customSpeedMeterTask == null) {
                customSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask(str, true);
            }
            if (customSpeedMeterTask != null) {
                customSpeedMeterTask.recordStep(str2);
            }
        }
    }

    public static void a(String str) {
        MetricsSpeedMeterTask customSpeedMeterTask;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9c33bf67607315d85078df8e7ea3d85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9c33bf67607315d85078df8e7ea3d85");
        } else if (TextUtils.isEmpty(str) || (customSpeedMeterTask = MetricsSpeedMeterTask.getCustomSpeedMeterTask(str)) == null) {
        } else {
            customSpeedMeterTask.disable();
            MetricsSpeedMeterTask.removeCustomSpeedMeterTask(str);
        }
    }

    public static void a(String str, @NonNull PouchDynamicAd pouchDynamicAd, long j, boolean z) {
        Object[] objArr = {str, pouchDynamicAd, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5aef6efc2c647f1b653f0cff46ae1374", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5aef6efc2c647f1b653f0cff46ae1374");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, Long.valueOf(j));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("module_id", "waimai_ad_module");
        hashMap2.put("business_name", pouchDynamicAd.businessName);
        hashMap2.put("template_id", pouchDynamicAd.adTemplateId);
        hashMap2.put("container_id", pouchDynamicAd.adContainerId);
        hashMap2.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, d);
        hashMap2.put("platform", "android");
        hashMap2.put("render_mode", z ? "preRender" : "normal");
        hashMap2.put("device_level", com.sankuai.waimai.pouch.c.c());
        a(hashMap, hashMap2);
    }

    public static void a(Map<String, Number> map, Map<String, String> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e2fd20ffd0746032cea5a129aba358a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e2fd20ffd0746032cea5a129aba358a");
            return;
        }
        m mVar = new m(b, com.meituan.android.singleton.b.a, c);
        if (map.size() > 0) {
            for (Map.Entry<String, Number> entry : map.entrySet()) {
                mVar.a(entry.getKey(), Collections.singletonList(Float.valueOf(entry.getValue().floatValue())));
            }
        }
        if (map2.size() > 0) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                mVar.a(entry2.getKey(), entry2.getValue());
            }
        }
        mVar.a();
    }

    public static void a(String str, PouchDynamicAd pouchDynamicAd) {
        Object[] objArr = {str, pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ad7812d0161023611c72fdb7a2e35b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ad7812d0161023611c72fdb7a2e35b5");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("pouch_pre_render_fail", 0);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("fail_reason", String.valueOf(str));
            hashMap2.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, d);
            hashMap2.put("platform", "android");
            hashMap2.put("device_level", com.sankuai.waimai.pouch.c.c());
            if (pouchDynamicAd != null) {
                hashMap2.put(ShieldMonitorKey.TAG_BUSINESS, pouchDynamicAd.businessName);
                hashMap2.put("template_id", pouchDynamicAd.adTemplateId);
            }
            a(hashMap, hashMap2);
        } catch (Exception unused) {
        }
    }

    private static void a(int i, String str, int i2, String str2, int i3, String str3, String str4, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), str2, Integer.valueOf(i3), str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca47accbda28e536703685343ac00e7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca47accbda28e536703685343ac00e7d");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pouch_mach_result", Integer.valueOf(i));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("module_id", "waimai_ad_module");
        hashMap2.put("business_name", str3);
        hashMap2.put("template_id", str);
        hashMap2.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(i2));
        hashMap2.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, d);
        hashMap2.put("platform", "android");
        hashMap2.put("container_id", str2);
        hashMap2.put("index", String.valueOf(i3));
        hashMap2.put("device_level", com.sankuai.waimai.pouch.c.c());
        if (i == 0 && str4 != null) {
            hashMap2.put("fail_reason", str4);
        }
        hashMap2.put("render_mode", z ? "preRender" : "normal");
        a(hashMap, hashMap2);
    }

    public static void a(int i, String str, @Nullable String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae5ab7b0a79afeb434c94dbb39cb20b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae5ab7b0a79afeb434c94dbb39cb20b5");
        } else {
            a(i, str, str2, false);
        }
    }

    public static void a(int i, String str, @Nullable String str2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75affdc1c2004985cfaf6786a20035cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75affdc1c2004985cfaf6786a20035cc");
        } else {
            a(i, str, str2, z, (String) null);
        }
    }

    public static void a(int i, String str, @Nullable String str2, boolean z, String str3) {
        Object[] objArr = {Integer.valueOf(i), str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ae99a451a5125e1b8f23154780bdf8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ae99a451a5125e1b8f23154780bdf8f");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("wmad_new_super_expose_raptor_result", Integer.valueOf(i));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("pouch_business_monitor_result_type", String.valueOf(i));
            hashMap2.put("pouch_business_monitor_failed_key", str);
            hashMap2.put("pouch_business_monitor_channel", "wmad");
            hashMap2.put("pouch_business_monitor_biz", "super_expose");
            if (str2 == null) {
                str2 = "unknown";
            }
            hashMap2.put("platinum_template_id", str2);
            if (e != null && !e.isEmpty()) {
                hashMap2.putAll(e);
            }
            a(hashMap, hashMap2);
            if (!TextUtils.isEmpty(str3)) {
                str = str + ", extra info:" + str3;
            }
            if (z) {
                HashMap hashMap3 = new HashMap();
                if (e != null && !e.isEmpty()) {
                    hashMap3.putAll(e);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pouch_business_monitor_failed_key", str);
                e.a(new d().a("wmad_super_expose_sniffer_module").b("fail").c(str).d(jSONObject.toString()).a(true).b(), hashMap3);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(String str, String str2, @NonNull String str3, boolean z) {
        Object[] objArr = {str, str2, str3, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a5c139e8f4d08dce54c9310af16568e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a5c139e8f4d08dce54c9310af16568e");
        } else {
            e.a(new d().a(str).b(str2).d(str3).a(true).b(), e);
        }
    }
}
