package com.sankuai.eh.component.service.database;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.neohybrid.core.config.UIConfig;
import com.meituan.dio.easy.DioFile;
import com.meituan.met.mercury.load.core.DDLoadStrategy;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.met.mercury.load.core.g;
import com.meituan.met.mercury.load.core.k;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.database.b;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.eh.component.service.utils.thread.a;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.tencent.connect.common.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    public static String c = "";
    private static boolean d = false;
    private static WeakHashMap<Context, JsonElement> e = new WeakHashMap<>();
    private static WeakHashMap<String, Object> f = new WeakHashMap<>();
    private static final HornCallback g = new HornCallback() { // from class: com.sankuai.eh.component.service.database.d.1
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.common.horn.HornCallback
        public final void onChanged(boolean z, String str) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2482b45b6e75214112a0c5bd86090fc7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2482b45b6e75214112a0c5bd86090fc7");
            } else if (TextUtils.isEmpty(str) || !z || d.b || !com.sankuai.eh.component.service.utils.b.e(d.d(str))) {
                d.b("financial_container_config", d.h);
            } else {
                com.sankuai.eh.component.service.tools.d.b(str);
                if (!com.sankuai.eh.component.service.utils.f.b(d.e(str))) {
                    d.b("financial_container_config", d.h);
                    return;
                }
                final String f2 = d.f(str);
                if (TextUtils.isEmpty(f2)) {
                    com.sankuai.eh.component.service.tools.d.b("ddd resourceName is empty!!!");
                    return;
                }
                com.sankuai.eh.component.service.tools.d.b("use DDDLoadConfig");
                d.a(f2, new k() { // from class: com.sankuai.eh.component.service.database.d.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.met.mercury.load.core.k
                    public final void onSuccess(@Nullable DDResource dDResource) {
                        Object[] objArr2 = {dDResource};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c8a4b2c8e4cc76bb1c1290ff7f4e589b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c8a4b2c8e4cc76bb1c1290ff7f4e589b");
                            return;
                        }
                        d.c = dDResource.getLocalPath();
                        com.sankuai.eh.component.service.tools.d.b("load " + f2 + " onSuccess localpath" + d.c);
                        String a2 = d.a(d.c, "manifest.json");
                        if (TextUtils.isEmpty(a2)) {
                            d.b("financial_container_config", d.h);
                        } else {
                            d.c(a2, "ddd");
                        }
                    }

                    @Override // com.meituan.met.mercury.load.core.k
                    public final void onFail(Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a46814f1569d69e18c012fda24fa8fd6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a46814f1569d69e18c012fda24fa8fd6");
                            return;
                        }
                        com.sankuai.eh.component.service.tools.d.b("load " + f2 + " onFail");
                        d.b("financial_container_config", d.h);
                    }
                });
            }
        }
    };
    private static final HornCallback h = new HornCallback() { // from class: com.sankuai.eh.component.service.database.d.2
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.common.horn.HornCallback
        public final void onChanged(boolean z, String str) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "661d08b996dccf4db1032c18146148ed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "661d08b996dccf4db1032c18146148ed");
            } else if (!z || d.b) {
            } else {
                com.sankuai.eh.component.service.tools.d.b(str);
                d.c(str, "horn");
            }
        }
    };

    public static boolean d() {
        return false;
    }

    public static /* synthetic */ void a(String str, k kVar) {
        Object[] objArr = {str, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fff815267bef595410470a5456b8d69c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fff815267bef595410470a5456b8d69c");
            return;
        }
        com.meituan.met.mercury.load.core.d a2 = g.a("ehc");
        if (com.sankuai.eh.component.service.utils.f.b()) {
            a2.a(true);
        }
        a2.a(str, DDLoadStrategy.LOCAL_FIRST, kVar);
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4b0318de2050633318b92867c9e0fc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4b0318de2050633318b92867c9e0fc0");
        } else {
            b("ehc", g);
        }
    }

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b6107986e206422564bac48427965332", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b6107986e206422564bac48427965332");
        }
        try {
            DioFile[] m = new DioFile(str).m();
            StringBuilder sb = new StringBuilder();
            for (DioFile dioFile : m) {
                if (dioFile.e().equals(str2)) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dioFile.b()));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    bufferedReader.close();
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df96ba87938ea6e6be945163c39a5b3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df96ba87938ea6e6be945163c39a5b3e");
        } else if (d) {
        } else {
            d = true;
            com.sankuai.eh.component.service.utils.thread.b a2 = com.sankuai.eh.component.service.utils.thread.b.a();
            a.InterfaceC0552a b2 = e.b();
            Object[] objArr2 = {b2};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.component.service.utils.thread.b.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "1e1e151c354550d6c1a78df2d9e824b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "1e1e151c354550d6c1a78df2d9e824b9");
            } else {
                a2.a(a2.b, b2);
            }
            if (com.sankuai.eh.component.service.utils.f.b()) {
                Horn.debug(context, "financial_container_config", true);
            }
            b("ehc", g);
        }
    }

    public static /* synthetic */ void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e04956456e1453f60731ae8588395cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e04956456e1453f60731ae8588395cc");
        } else {
            b.b.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, HornCallback hornCallback) {
        Object[] objArr = {str, hornCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27124504f99ab294c9151292a9792d48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27124504f99ab294c9151292a9792d48");
            return;
        }
        com.sankuai.eh.component.service.tools.d.b("use Horn Config");
        HashMap hashMap = new HashMap();
        hashMap.put("ehcVersion", "3.12.0");
        hashMap.put("ehcAppName", com.sankuai.eh.component.service.a.c().h());
        hashMap.put("ehcAppVersion", com.sankuai.eh.component.service.a.c().i());
        hashMap.put(DeviceInfo.USER_ID, com.sankuai.eh.component.service.a.c().d());
        if (com.sankuai.eh.component.service.tools.c.a()) {
            hashMap.put("ehcEnv", "test");
        }
        Horn.register(str, hornCallback, hashMap);
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfed5b384d137fe0f042485137d94c51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfed5b384d137fe0f042485137d94c51");
            return;
        }
        b = true;
        b bVar = b.b;
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "75134990f578eeb3aa9e5ca130fa62b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "75134990f578eeb3aa9e5ca130fa62b4");
            return;
        }
        bVar.c = com.sankuai.eh.component.service.utils.b.a(str);
        JsonArray b2 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(bVar.c, "dependencies"));
        if ("w".equals(str2)) {
            bVar.d.clear();
        }
        Iterator<JsonElement> it = b2.iterator();
        while (it.hasNext()) {
            JsonElement next = it.next();
            String a2 = com.sankuai.eh.component.service.utils.b.a(next, "name");
            String a3 = com.sankuai.eh.component.service.utils.c.a(a2 + ".manifest.com");
            String a4 = com.sankuai.eh.component.service.utils.c.a(a2 + ".resource.com");
            b.C0546b c0546b = bVar.e.get(a2);
            if (c0546b == null) {
                c0546b = new b.C0546b(a2);
                c0546b.f = new String[]{a3};
                c0546b.g = new String[]{a4};
            } else {
                ArrayList arrayList = new ArrayList(Arrays.asList(c0546b.f == null ? new String[0] : c0546b.f));
                if (!arrayList.contains(a3)) {
                    arrayList.add(a3);
                }
                c0546b.f = (String[]) arrayList.toArray(new String[0]);
                ArrayList arrayList2 = new ArrayList(Arrays.asList(c0546b.g == null ? new String[0] : c0546b.g));
                if (!arrayList2.contains(a4)) {
                    arrayList2.add(a4);
                }
                c0546b.g = (String[]) arrayList2.toArray(new String[0]);
            }
            c0546b.c = com.sankuai.eh.component.service.utils.b.a(next, "version");
            c0546b.e = com.sankuai.eh.component.service.utils.b.c(next, "config");
            c0546b.d = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(next, "enabled"), true).booleanValue();
            bVar.e.put(c0546b.b, c0546b);
            bVar.d.put(a3, com.sankuai.eh.component.service.utils.b.c(next, "mData"));
            bVar.d.put(a4, com.sankuai.eh.component.service.utils.b.c(next, "rData"));
        }
    }

    public static void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b70974ba006fde3608ba88ec8fdb756a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b70974ba006fde3608ba88ec8fdb756a");
            return;
        }
        com.sankuai.eh.component.service.utils.thread.b a2 = com.sankuai.eh.component.service.utils.thread.b.a();
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        a2.b(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1a39f9a7f9113fb4a3b49067b4b64c43", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1a39f9a7f9113fb4a3b49067b4b64c43") : new f(str, str2));
    }

    public static /* synthetic */ void e(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f454fbe2b59ecfc6033d6112425a83cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f454fbe2b59ecfc6033d6112425a83cb");
            return;
        }
        b bVar = b.b;
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "dd3ca0d707854ccf77aff0526ef4d3db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "dd3ca0d707854ccf77aff0526ef4d3db");
            return;
        }
        bVar.c = com.sankuai.eh.component.service.utils.b.a(str);
        bVar.g = str2;
        if (TextUtils.equals("ddd", str2)) {
            a.a().a("dddVersion", l());
            a.a().a("dataVersion", "");
        } else {
            a.a().a("dataVersion", k());
            a.a().a("dddVersion", "");
        }
        JsonArray b2 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.a(str), "dependencies"));
        Object[] objArr3 = {b2};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "52156a8dc0cef7d1e00c91dc589af948", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "52156a8dc0cef7d1e00c91dc589af948");
        } else if (b2 != null) {
            Object[] objArr4 = {b2};
            ChangeQuickRedirect changeQuickRedirect4 = b.a;
            if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "7219138c9401b6126c6002756e0cb87d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "7219138c9401b6126c6002756e0cb87d");
            } else {
                HashSet hashSet = new HashSet();
                Iterator<JsonElement> it = b2.iterator();
                while (it.hasNext()) {
                    String a2 = com.sankuai.eh.component.service.utils.b.a(it.next(), "name");
                    if (!TextUtils.isEmpty(a2)) {
                        hashSet.add(a2);
                    }
                }
                a.a(hashSet, "manifest/");
            }
            Iterator<JsonElement> it2 = b2.iterator();
            while (it2.hasNext()) {
                JsonElement next = it2.next();
                String a3 = com.sankuai.eh.component.service.utils.b.a(next, "name");
                b.C0546b c0546b = bVar.e.get(a3);
                if (c0546b == null) {
                    c0546b = new b.C0546b(a3);
                    c0546b.c = com.sankuai.eh.component.service.utils.b.a(next, "version");
                    c0546b.e = com.sankuai.eh.component.service.utils.b.c(next, "config");
                    c0546b.d = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(next, "enabled"), true).booleanValue();
                    bVar.e.put(a3, c0546b);
                }
                bVar.a(next, c0546b, "manifests");
                bVar.a(next, c0546b, "resources");
            }
        }
        bVar.f = str2;
    }

    public static void a(Context context, JsonElement jsonElement) {
        Object[] objArr = {context, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4b099f94bbca276df399f31a8f55d15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4b099f94bbca276df399f31a8f55d15");
        } else if (context != null) {
            e.put(context, jsonElement);
        }
    }

    public static JsonElement b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "151ca7f7085968351a56f1611039fa91", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "151ca7f7085968351a56f1611039fa91");
        }
        if (context != null) {
            return e.get(context);
        }
        return null;
    }

    public static JsonElement c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b97d33eb1eaa1463cbe430d50e201703", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b97d33eb1eaa1463cbe430d50e201703");
        }
        if (context != null) {
            return e.remove(context);
        }
        return null;
    }

    public static void d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95042557feec6ebcb372de0f0a59de2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95042557feec6ebcb372de0f0a59de2d");
        } else if (b.b.e.containsKey("router") || !p()) {
        } else {
            b bVar = b.b;
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a52066d3b4e736256f776b05c94ab85e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a52066d3b4e736256f776b05c94ab85e");
                return;
            }
            MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("ehc_load_router");
            String[] b2 = a.b("manifest/router/manifests/");
            if (b2 != null && b2.length != 0) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "506b6554a1227564e6a55d03cc856762", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "506b6554a1227564e6a55d03cc856762");
                } else {
                    b.C0546b a2 = bVar.a("router", "manifest/");
                    if (a2 != null) {
                        bVar.e.put("router", a2);
                    }
                    bVar.f = "cache_router";
                }
                createCustomSpeedMeterTask.recordStep("step_cache");
                new d.c().a("ehc_load_manifest").a("type", "router_cache").b();
            } else if (a.a().b("isPresetEnabled", true)) {
                Object[] objArr4 = {context};
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "a366e4d03d111ee58a624e264e8472b6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "a366e4d03d111ee58a624e264e8472b6");
                } else {
                    b.C0546b a3 = bVar.a("router", "ehc_manifest_preset/", context.getAssets());
                    if (a3 != null) {
                        bVar.e.put("router", a3);
                    }
                    bVar.f = "preset_router";
                }
                createCustomSpeedMeterTask.recordStep("step_preset");
                new d.c().a("ehc_load_manifest").a("type", "router_preset").b();
            }
            h.a(createCustomSpeedMeterTask);
        }
    }

    public static void e(Context context) {
        String[] list;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a431a998682a05405ca401c4422cf6c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a431a998682a05405ca401c4422cf6c0");
        } else if (b.b.e.size() <= 1 && p()) {
            b bVar = b.b;
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c68abf16dfafd6f53de793faed7c8b9a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c68abf16dfafd6f53de793faed7c8b9a");
                return;
            }
            MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("ehc_load_all");
            String[] b2 = a.b("manifest/skeleton/manifests/");
            if (b2 != null && b2.length > 0) {
                bVar.c();
                createCustomSpeedMeterTask.recordStep("step_cache");
                bVar.f = "sync_local";
                new d.c().a("ehc_load_manifest").a("type", "all_cache").b();
            } else if (a.a().b("isPresetEnabled", true)) {
                Object[] objArr3 = {context};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "4c4c1f6fe6656942cf71db8181276dd1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "4c4c1f6fe6656942cf71db8181276dd1");
                } else {
                    try {
                        for (String str : context.getAssets().list("ehc_manifest_preset/")) {
                            b.C0546b a2 = bVar.a(str, "ehc_manifest_preset/", context.getAssets());
                            if (a2 != null) {
                                bVar.e.put(str, a2);
                            }
                        }
                    } catch (IOException e2) {
                        com.sankuai.eh.component.service.tools.d.a(e2);
                    }
                }
                createCustomSpeedMeterTask.recordStep("step_preset");
                bVar.f = "sync_preset";
                new d.c().a("ehc_load_manifest").a("type", "all_preset").b();
            }
            h.a(createCustomSpeedMeterTask);
        }
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ff02b40449478b67072071d9d21e0de", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ff02b40449478b67072071d9d21e0de") : b.b.f;
    }

    public static JsonElement c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95477f875eebf746b41c4d74e800df7d", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95477f875eebf746b41c4d74e800df7d") : b.a();
    }

    private static boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4d0880b23ca71942c012b53584f7258", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4d0880b23ca71942c012b53584f7258")).booleanValue() : com.sankuai.eh.component.service.utils.b.d(b.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r8v26, types: [com.google.gson.JsonElement] */
    public static JsonElement a(String str) {
        b.C0546b c0546b;
        JsonElement jsonElement;
        boolean z;
        Iterator<JsonElement> it;
        b.C0546b c0546b2;
        Matcher matcher;
        b.C0546b c0546b3;
        String[] strArr;
        JsonObject jsonObject;
        ?? r1 = 1;
        char c2 = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        JsonElement jsonElement2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c65396a52468b0d76179fe2d22fa92a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c65396a52468b0d76179fe2d22fa92a8");
        }
        try {
            MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("ehc_match_path");
            b.C0546b a2 = b.b.a("router");
            if (!TextUtils.isEmpty(str) && a2 != null && a2.d) {
                String[] a3 = a2.a();
                int length = a3.length;
                int i = 0;
                while (i < length) {
                    JsonElement jsonElement3 = b.b.d.get(a3[i]);
                    if (!b.b.b(a2.c, com.sankuai.eh.component.service.utils.b.a(jsonElement3, "version"))) {
                        return null;
                    }
                    JsonArray b2 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement3, "data"));
                    Object[] objArr2 = new Object[2];
                    objArr2[c2] = str;
                    objArr2[r1] = b2;
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.component.service.utils.e.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3acf3d79bd543f70337b8a8897452b2a", RobustBitConfig.DEFAULT_VALUE)) {
                        c0546b = a2;
                        strArr = a3;
                        jsonObject = (JsonElement) PatchProxy.accessDispatch(objArr2, jsonElement2, changeQuickRedirect2, r1, "3acf3d79bd543f70337b8a8897452b2a");
                    } else {
                        Object[] objArr3 = new Object[2];
                        objArr3[0] = str;
                        objArr3[r1] = b2;
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.eh.component.service.utils.e.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "22b3aa6c24c21f2e1901da350a6ab1af", RobustBitConfig.DEFAULT_VALUE)) {
                            jsonElement = (JsonElement) PatchProxy.accessDispatch(objArr3, jsonElement2, changeQuickRedirect3, true, "22b3aa6c24c21f2e1901da350a6ab1af");
                            c0546b = a2;
                        } else {
                            Iterator<JsonElement> it2 = b2.iterator();
                            JsonElement jsonElement4 = jsonElement2;
                            int i2 = 0;
                            while (it2.hasNext()) {
                                JsonElement next = it2.next();
                                String b3 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(next, Constants.PARAM_SCOPE), "");
                                if (str.contains(b3) && b3.length() > i2) {
                                    i2 = b3.length();
                                    jsonElement4 = next;
                                }
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.eh.component.service.utils.f.a;
                                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "27b7bb3d230463a229120ff6269ddea6", RobustBitConfig.DEFAULT_VALUE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "27b7bb3d230463a229120ff6269ddea6")).booleanValue();
                                } else {
                                    if (!com.sankuai.eh.component.service.utils.f.a() && !"meituaninternaltest".equals(com.sankuai.eh.component.service.a.c().j().get("channel"))) {
                                        z = false;
                                    }
                                    z = true;
                                }
                                if (z) {
                                    String authority = Uri.parse(AbsApiFactory.HTTPS + b3).getAuthority();
                                    JsonElement c3 = c(authority);
                                    if (c3 != null) {
                                        Iterator<JsonElement> it3 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(c3, "equals")).iterator();
                                        while (it3.hasNext()) {
                                            String b4 = com.sankuai.eh.component.service.utils.b.b(it3.next(), "");
                                            String replace = b3.replace(authority, b4);
                                            Iterator<JsonElement> it4 = it2;
                                            if (b4.equals(Uri.parse(str).getAuthority()) && str.contains(replace) && b3.length() > i2) {
                                                i2 = b3.length();
                                                jsonElement4 = next.deepCopy();
                                                c0546b3 = a2;
                                                jsonElement4.getAsJsonObject().add(Constants.PARAM_SCOPE, new JsonPrimitive(replace));
                                            } else {
                                                c0546b3 = a2;
                                            }
                                            it2 = it4;
                                            a2 = c0546b3;
                                        }
                                        it = it2;
                                        c0546b2 = a2;
                                        String b5 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(c3, "regex"), null);
                                        if (!TextUtils.isEmpty(b5) && !TextUtils.isEmpty(Uri.parse(str).getAuthority())) {
                                            if (Pattern.compile(b5).matcher(Uri.parse(str).getAuthority()).find()) {
                                                String str2 = matcher.group(0) + b3.replace(authority, "");
                                                if (str.contains(str2) && b3.length() > i2) {
                                                    int length2 = b3.length();
                                                    JsonElement deepCopy = next.deepCopy();
                                                    deepCopy.getAsJsonObject().add(Constants.PARAM_SCOPE, new JsonPrimitive(str2));
                                                    i2 = length2;
                                                    jsonElement4 = deepCopy;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    it = it2;
                                    c0546b2 = a2;
                                }
                                it2 = it;
                                a2 = c0546b2;
                            }
                            c0546b = a2;
                            jsonElement = jsonElement4;
                        }
                        String str3 = com.sankuai.eh.component.service.utils.e.a(com.sankuai.eh.component.service.utils.e.g(str), NetLogConstants.Details.SCHEME) + "://" + com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, Constants.PARAM_SCOPE), "");
                        JsonArray b6 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "routes"));
                        Object[] objArr5 = {str3, b6, "path", str};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.eh.component.service.utils.e.a;
                        strArr = a3;
                        JsonElement a4 = PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "900a6a043daa8c0ef54d8ce3f1fe1b15", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "900a6a043daa8c0ef54d8ce3f1fe1b15") : com.sankuai.eh.component.service.utils.e.a(str3, b6, "path", str);
                        if (a4 == null) {
                            jsonObject = null;
                        } else {
                            jsonObject = new b.a().a("ab", com.sankuai.eh.component.service.utils.b.c(jsonElement, "ab")).a(Constants.PARAM_SCOPE, com.sankuai.eh.component.service.utils.b.c(jsonElement, Constants.PARAM_SCOPE)).a("key", com.sankuai.eh.component.service.utils.b.c(jsonElement, "key")).a("pattern", new JsonPrimitive(str3 + com.sankuai.eh.component.service.utils.b.a(a4, "path"))).a("data", a4).b;
                        }
                    }
                    if (jsonObject != null) {
                        h.a(createCustomSpeedMeterTask.recordStep("total"));
                        return jsonObject;
                    }
                    i++;
                    a2 = c0546b;
                    a3 = strArr;
                    r1 = 1;
                    jsonElement2 = null;
                    c2 = 0;
                }
                return null;
            }
            return null;
        } catch (Exception e2) {
            com.sankuai.eh.component.service.tools.d.a(e2);
            return null;
        }
    }

    public static JsonElement a(String str, JsonElement jsonElement) {
        Object[] objArr = {str, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "850836d5c281d2b51ac778caf8b5745d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "850836d5c281d2b51ac778caf8b5745d");
        }
        b.C0546b a2 = b.b.a(str);
        if (a2 == null || !a2.d) {
            return null;
        }
        return a2.e;
    }

    public static JsonElement b(String str, JsonElement jsonElement) {
        JsonElement jsonElement2;
        Object[] objArr = {str, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4a844c80b702a07a0e450239c029753", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4a844c80b702a07a0e450239c029753");
        }
        MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("ehc_match_plugin");
        b.C0546b a2 = b.b.a(str);
        if (a2 == null || !a2.d) {
            return null;
        }
        Iterator<JsonElement> it = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "use")).iterator();
        while (true) {
            if (!it.hasNext()) {
                jsonElement2 = null;
                break;
            }
            jsonElement2 = it.next();
            if (com.sankuai.eh.component.service.utils.b.a(jsonElement2, "name").equals(str)) {
                break;
            }
        }
        if (jsonElement2 == null) {
            return null;
        }
        String b2 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement2, "id"), "-1");
        for (String str2 : a2.a()) {
            JsonElement a3 = com.sankuai.eh.component.service.utils.b.a(b.b.d.get(str2), "data", b2);
            if (!b.b.b(a2.c, com.sankuai.eh.component.service.utils.b.a(a3, "version"))) {
                break;
            } else if (a3 != null) {
                h.a(createCustomSpeedMeterTask.recordStep("total"));
                return a3;
            }
        }
        return null;
    }

    public static JsonElement c(String str, JsonElement jsonElement) {
        Object[] objArr = {str, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b66493720c8edd9db463b674366dc6db", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b66493720c8edd9db463b674366dc6db");
        }
        if (jsonElement == null) {
            return null;
        }
        for (String str2 : b.b.a(str).b()) {
            JsonElement a2 = com.sankuai.eh.component.service.utils.b.a(b.b.d.get(str2), "data", com.sankuai.eh.component.service.utils.b.b(jsonElement, "-1"));
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public static boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f144e6a75567f43318452e85ff5472cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f144e6a75567f43318452e85ff5472cc")).booleanValue();
        }
        JsonElement c2 = com.sankuai.eh.component.service.utils.b.c(b.b(), "webPageRouter");
        return com.sankuai.eh.component.service.utils.b.e(c2) && com.sankuai.eh.component.service.utils.f.b(c2);
    }

    public static boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "736bac4a81bdaf4d5b1a7bd8135a8e2c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "736bac4a81bdaf4d5b1a7bd8135a8e2c")).booleanValue() : com.sankuai.eh.component.service.utils.f.b(com.sankuai.eh.component.service.utils.b.c(b.b(), "fupTab"));
    }

    public static void d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb04ff6a03391be7067a4e1d6e787cc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb04ff6a03391be7067a4e1d6e787cc4");
        } else {
            a.a().a(str, str2);
        }
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3ffac8cbe5875e9c9d9e9bb437cd833", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3ffac8cbe5875e9c9d9e9bb437cd833") : a.a().b(str, "");
    }

    public static JsonElement c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe3edfb8aa7fd9b14ce72da95562eb0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe3edfb8aa7fd9b14ce72da95562eb0e");
        }
        JsonArray jsonArray = new JsonArray();
        jsonArray.addAll(com.sankuai.eh.component.service.tools.c.b());
        b bVar = b.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        jsonArray.addAll(PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "ba0b1e8e60558a711fa0ce085c34a453", RobustBitConfig.DEFAULT_VALUE) ? (JsonArray) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "ba0b1e8e60558a711fa0ce085c34a453") : com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.a(bVar.c, "hostMap", Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST)));
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonElement next = it.next();
            if (com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(next, "target"), "").equals(str)) {
                return com.sankuai.eh.component.service.utils.b.c(next, "source");
            }
        }
        return null;
    }

    public static JsonElement d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd01abc3381291f4a5cd37fa505763cf", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd01abc3381291f4a5cd37fa505763cf") : com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.a(str), "ddd");
    }

    public static JsonElement e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e08a612e9812422caf4aa86a8d45ad7", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e08a612e9812422caf4aa86a8d45ad7");
        }
        JsonArray b2 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(d(str), Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST));
        if (b2 == null || b2.size() <= 0) {
            return null;
        }
        return b2.get(0);
    }

    public static String f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1ce7d3bfc3aba5b15beb0e6af794a94", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1ce7d3bfc3aba5b15beb0e6af794a94") : com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(e(str), "name"), "");
    }

    public static JsonElement g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d49c60f518bee89a397ca66d2262cb4f", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d49c60f518bee89a397ca66d2262cb4f") : com.sankuai.eh.component.service.utils.b.c(b.b(), "raptor");
    }

    public static JsonElement h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2bcadc9e710211b395dd6c8129f1efce", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2bcadc9e710211b395dd6c8129f1efce") : com.sankuai.eh.component.service.utils.b.c(b.b(), UIConfig.MODAL);
    }

    public static JsonElement i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5279ea0d4b9876c35ea310f444b9148", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5279ea0d4b9876c35ea310f444b9148") : com.sankuai.eh.component.service.utils.b.c(b.b(), "routeFlow");
    }

    public static boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e6c6c194e44ce68c0c974a119a0d6dd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e6c6c194e44ce68c0c974a119a0d6dd")).booleanValue() : com.sankuai.eh.component.service.utils.b.d(com.sankuai.eh.component.service.utils.b.c(b.b(), "presetConfig"));
    }

    public static String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4ef1a1f9b83762fa68e3096381a3322", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4ef1a1f9b83762fa68e3096381a3322");
        }
        b bVar = b.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "f4c98a7d8552b1d38bf373e15bafabb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "f4c98a7d8552b1d38bf373e15bafabb3");
        }
        if (bVar.c == null) {
            return a.a().b("dataVersion", "");
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        JsonElement a2 = PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "2cbca97a6c3ff41016e48c90370f48e0", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "2cbca97a6c3ff41016e48c90370f48e0") : com.sankuai.eh.component.service.utils.b.a(bVar.c, "matched");
        String b2 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(a2, "release_id"), "");
        String b3 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(a2, "tag"), "");
        if (TextUtils.isEmpty(b2) || TextUtils.isEmpty(b3)) {
            return "";
        }
        return b2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + b3;
    }

    public static String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f06dbcdfa5e43035b23db4bbd4fa5985", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f06dbcdfa5e43035b23db4bbd4fa5985");
        }
        if (TextUtils.isEmpty(c)) {
            return a.a().b("dddVersion", "");
        }
        String[] split = c.split(File.separator);
        if (split != null && split.length > 3) {
            return split[split.length - 3] + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + split[split.length - 2];
        }
        return a.a().b("dddVersion", "");
    }

    public static String m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c5c2cd0aefe08fa7e29a69d4ade0787", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c5c2cd0aefe08fa7e29a69d4ade0787");
        }
        String l = l();
        return TextUtils.isEmpty(l) ? "" : l.replace(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, "/");
    }
}
