package com.sankuai.ehcore.horn;

import android.content.Context;
import android.net.Uri;
import android.support.v4.util.ArraySet;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.statistics.Constants;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.network.EHNetService;
import com.sankuai.eh.component.service.utils.thread.a;
import com.sankuai.ehcore.horn.b;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;
    private static boolean c = false;
    private static boolean d = false;
    private static HornCallback e = i.a();
    private static HornCallback f = j.a();

    public static /* synthetic */ void b(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62dcf39dcd407d3076554e3dfed58447", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62dcf39dcd407d3076554e3dfed58447");
        } else if (!z || d) {
        } else {
            com.sankuai.eh.component.service.tools.d.a("骨架屏数据拉取完成", str);
            com.sankuai.eh.component.service.utils.thread.b a2 = com.sankuai.eh.component.service.utils.thread.b.a();
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            a2.b(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "26f629a9593ee0752f20df5571362ffc", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "26f629a9593ee0752f20df5571362ffc") : new h(str));
        }
    }

    public static /* synthetic */ void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f576bb21bde94ff23fa9d2692981681a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f576bb21bde94ff23fa9d2692981681a");
            return;
        }
        final b bVar = b.b;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "ecb980e56c49d307e0a02ef93f8a2c3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "ecb980e56c49d307e0a02ef93f8a2c3a");
            return;
        }
        try {
            bVar.e = com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.a(str));
            com.sankuai.eh.component.service.tools.d.a("CACHE_SERVICE", "缓存清理与更新中....");
            a.a((String[]) bVar.a(true).toArray(new String[0]), "eh/eh_skeleton/");
            for (String str2 : bVar.a(false)) {
                final String[] a2 = bVar.a(str2, bVar.e.get(str2));
                if (!TextUtils.isEmpty(a2[1])) {
                    if (a.b(a2)) {
                        EHNetService a3 = com.sankuai.eh.component.service.network.a.a(false);
                        a3.callSkeletons(a2[1] + ".json", com.sankuai.eh.component.service.network.a.b()).a(new b.a() { // from class: com.sankuai.ehcore.horn.b.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.ehcore.horn.b.a, com.sankuai.meituan.retrofit2.f
                            public final void onResponse(Call<ap> call, Response<ap> response) {
                                Object[] objArr3 = {call, response};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f84101b32887536e9397fe6c5a9b7e1a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f84101b32887536e9397fe6c5a9b7e1a");
                                    return;
                                }
                                super.onResponse(call, response);
                                if (this.e) {
                                    String string = response.e().string();
                                    bVar.g.put(a2[0], com.sankuai.eh.component.service.utils.b.a(string));
                                    b.a(bVar, com.sankuai.ehcore.horn.a.a(a2), string);
                                }
                            }
                        });
                    } else {
                        com.sankuai.eh.component.service.tools.d.a("CACHE_SERVICE", a2[0] + CommonConstant.Symbol.UNDERLINE + a2[1] + ".json 已存在");
                    }
                }
            }
        } catch (Exception e2) {
            com.sankuai.eh.component.service.tools.d.a(e2);
            com.dianping.codelog.b.b(b.class, "android cache exception", e2.getMessage());
        }
    }

    public static /* synthetic */ void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7f389af991058e1cb3c3b57dffbf410", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7f389af991058e1cb3c3b57dffbf410");
        } else if (!z || c) {
        } else {
            com.sankuai.eh.component.service.tools.d.a("config配置数据拉取完成", str);
            com.sankuai.eh.component.service.utils.thread.b a2 = com.sankuai.eh.component.service.utils.thread.b.a();
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = g.a;
            a2.b(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0de5c4475f5148c8221b320cffc55c82", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0de5c4475f5148c8221b320cffc55c82") : new g(str));
        }
    }

    public static /* synthetic */ void e(String str) {
        Set arraySet;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0408c32fe2edf3d026667f9765b0e8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0408c32fe2edf3d026667f9765b0e8d");
            return;
        }
        b bVar = b.b;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c2b7460a0bffbbedac2fe12ade47e8c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c2b7460a0bffbbedac2fe12ade47e8c4");
            return;
        }
        try {
            bVar.f = com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.utils.b.a(str));
            com.sankuai.eh.component.service.tools.d.a("CACHE_SERVICE", "缓存清理与更新中....");
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "a14e956e2d1758985f0f686515aaa9af", RobustBitConfig.DEFAULT_VALUE)) {
                arraySet = (Set) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "a14e956e2d1758985f0f686515aaa9af");
            } else {
                arraySet = new ArraySet();
                Iterator<JsonElement> it = com.sankuai.eh.component.service.utils.b.b(bVar.a(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST, bVar.f)).iterator();
                while (it.hasNext()) {
                    arraySet.add(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(it.next(), "tag"), "eh666888"));
                }
            }
            a.a((String[]) arraySet.toArray(new String[0]), "eh/eh_config/");
            Iterator<JsonElement> it2 = com.sankuai.eh.component.service.utils.b.b(bVar.a(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST, bVar.f)).iterator();
            while (it2.hasNext()) {
                String b2 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(it2.next(), "tag"), "");
                if (!a.a(b2, "eh/eh_config/")) {
                    com.sankuai.eh.component.service.tools.d.a("CACHE_SERVICE", b2 + "已存在");
                } else {
                    EHNetService a2 = com.sankuai.eh.component.service.network.a.a(false);
                    a2.callEHConfig(b2 + ".json", com.sankuai.eh.component.service.network.a.b()).a(new b.AnonymousClass2(b2));
                }
            }
            if (com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(bVar.a("global"), "lifecycleEnabled"), true).booleanValue()) {
                com.sankuai.eh.component.service.tools.b.a().b();
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = b.a;
            if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "77abde039e8250d789cbe92f608bb42a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "77abde039e8250d789cbe92f608bb42a");
                return;
            }
            String b3 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(bVar.a(PackageLoadReporter.Source.PREFETCH), "path"), "");
            String b4 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(bVar.a("rum"), "path"), "");
            String b5 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(bVar.a("autoshowV2_1"), "path"), "");
            a.a(new String[]{com.sankuai.eh.component.service.utils.c.a(b3), com.sankuai.eh.component.service.utils.c.a(b4), com.sankuai.eh.component.service.utils.c.a(b5)}, "eh/eh_js/");
            bVar.b(b4);
            bVar.b(b5);
        } catch (Exception e2) {
            com.sankuai.eh.component.service.tools.d.a(e2);
            com.dianping.codelog.b.b(b.class, "android cache exception", e2.getMessage());
        }
    }

    public static /* synthetic */ void k() {
        String str;
        char c2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0313dbae0d265d0e3e4dcb0cdb52af7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0313dbae0d265d0e3e4dcb0cdb52af7d");
            return;
        }
        b bVar = b.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "fc3137c3f7b7ea4ccfaa2a769af55f87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "fc3137c3f7b7ea4ccfaa2a769af55f87");
            return;
        }
        try {
            String[] c3 = a.c("eh/eh_config/");
            for (int i = 0; c3 != null && i < c3.length; i++) {
                ConcurrentHashMap<String, JsonElement> concurrentHashMap = bVar.h;
                String str2 = c3[i];
                concurrentHashMap.put(str2, com.sankuai.eh.component.service.utils.b.a(a.b("eh/eh_config/" + c3[i])));
            }
            String[] c4 = a.c("eh/eh_skeleton/");
            int i2 = 0;
            while (c4 != null && i2 < c4.length) {
                ConcurrentHashMap<String, JsonElement> concurrentHashMap2 = bVar.g;
                String str3 = c4[i2];
                Object[] objArr3 = new Object[1];
                objArr3[c2] = str3;
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "50f449f27dfd7c4c2ad76f6e483e8fd8", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "50f449f27dfd7c4c2ad76f6e483e8fd8");
                } else {
                    String[] split = str3.split(CommonConstant.Symbol.UNDERLINE);
                    str = (split == null || split.length != 4) ? "" : split[2];
                }
                concurrentHashMap2.put(str, com.sankuai.eh.component.service.utils.b.a(a.b("eh/eh_skeleton/" + c4[i2])));
                i2++;
                c2 = 0;
            }
            String[] c5 = a.c("eh/eh_js/");
            for (int i3 = 0; c5 != null && i3 < c5.length; i3++) {
                ConcurrentHashMap<String, String> concurrentHashMap3 = bVar.i;
                String str4 = c5[i3];
                concurrentHashMap3.put(str4, a.b("eh/eh_js/" + c5[i3]));
            }
            com.sankuai.eh.component.service.tools.d.a("CACHE_SERVICE", "初始化缓存，文件个数为 " + bVar.g.size());
            bVar.d = a.a().b("cacheWrite", (String) null);
            bVar.c = com.sankuai.eh.component.service.utils.d.b();
        } catch (Exception e2) {
            com.sankuai.eh.component.service.tools.d.a(e2);
            com.dianping.codelog.b.b(b.class, "android cache exception", e2.getMessage());
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c682e814033925cbd81d35dc053aa757", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c682e814033925cbd81d35dc053aa757");
            return;
        }
        c = true;
        if ("a".equals(str2)) {
            return;
        }
        b.b.f.clear();
        b.b.h.clear();
        b.b.h.put("debug", com.sankuai.eh.component.service.utils.b.a(str));
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f033715ed3b7647a415c32a7fe1579ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f033715ed3b7647a415c32a7fe1579ae");
            return;
        }
        d = true;
        if ("a".equals(str2)) {
            b.b.g.put("debug", com.sankuai.eh.component.service.utils.b.a(str));
            return;
        }
        b.b.g.clear();
        b.b.g.put("debug", com.sankuai.eh.component.service.utils.b.a(str));
    }

    private static void a(String str, HornCallback hornCallback) {
        Object[] objArr = {str, hornCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61bcf7680c7e8f64205561f1ff14dd50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61bcf7680c7e8f64205561f1ff14dd50");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ehVersion", "8.1.0");
        hashMap.put("ehAppName", com.sankuai.eh.component.service.utils.f.c());
        hashMap.put("ehAppVersion", com.sankuai.eh.component.service.utils.f.d());
        Horn.register(str, hornCallback, hashMap);
    }

    public static boolean a(int i) {
        Object[] objArr = {1003};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4db1d6fc044be41e40f1c7965502f0cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4db1d6fc044be41e40f1c7965502f0cc")).booleanValue();
        }
        JsonElement a2 = b.b.a("autoDegrade");
        if (com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(a2, "enabled"), false).booleanValue()) {
            return com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(a2, "skeletonEnabled"), false).booleanValue();
        }
        return false;
    }

    public static JsonElement a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25b8123f5a9a10e4d6c8c79c52cc849e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25b8123f5a9a10e4d6c8c79c52cc849e");
        }
        if (TextUtils.isEmpty(com.sankuai.eh.component.service.utils.c.b(str)) || TextUtils.isEmpty(str)) {
            return null;
        }
        for (Map.Entry<String, JsonElement> entry : b.b.g.entrySet()) {
            JsonElement a2 = com.sankuai.ehcore.tools.a.a(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(entry.getValue(), "skeletons")), "pattern", str);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "447e5a06710d5c7bf3e02817ce855d60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "447e5a06710d5c7bf3e02817ce855d60");
            return;
        }
        final b bVar = b.b;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "22b724dca1405cdc369b788d89da74bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "22b724dca1405cdc369b788d89da74bc");
        } else if (TextUtils.isEmpty(str) || bVar.e == null) {
        } else {
            Iterator<JsonElement> it = com.sankuai.eh.component.service.utils.b.b(bVar.e.get("children")).iterator();
            while (it.hasNext()) {
                JsonElement next = it.next();
                String b2 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(next, com.tencent.connect.common.Constants.PARAM_SCOPE), "");
                if (str.contains(b2)) {
                    final String[] a2 = bVar.a(com.sankuai.eh.component.service.utils.c.a(b2), next);
                    if (!a.b(a2)) {
                        com.sankuai.eh.component.service.tools.d.a("CACHE_SERVICE", a2[0] + CommonConstant.Symbol.UNDERLINE + a2[1] + ".json 已存在");
                    } else {
                        EHNetService a3 = com.sankuai.eh.component.service.network.a.a(false);
                        a3.callSkeletons(a2[1] + ".json", com.sankuai.eh.component.service.network.a.b()).a(new b.a() { // from class: com.sankuai.ehcore.horn.b.3
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.ehcore.horn.b.a, com.sankuai.meituan.retrofit2.f
                            public final void onResponse(Call<ap> call, Response<ap> response) {
                                Object[] objArr3 = {call, response};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d0a437e0d003236e66b75c1021657e62", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d0a437e0d003236e66b75c1021657e62");
                                    return;
                                }
                                super.onResponse(call, response);
                                if (this.e) {
                                    String string = response.e().string();
                                    bVar.g.put(a2[0], com.sankuai.eh.component.service.utils.b.a(string));
                                    b.a(bVar, com.sankuai.ehcore.horn.a.a(a2), string);
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "349b69692a6eee15595cfc9140bb318a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "349b69692a6eee15595cfc9140bb318a") : b.b.c;
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4173b85c501bb20cdff345ea89f6ae1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4173b85c501bb20cdff345ea89f6ae1") : b.b.d;
    }

    public static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81ba594db820d26ec3600df234d8a76a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81ba594db820d26ec3600df234d8a76a") : b.b.i.get(str);
    }

    public static JsonElement c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67f620dbcdbd040cf850cf5ee3c4a1fa", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67f620dbcdbd040cf850cf5ee3c4a1fa") : b.b.a("global");
    }

    public static JsonElement d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4d0f7a5c87595ee28b7063e07043812", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4d0f7a5c87595ee28b7063e07043812") : b.b.a(PackageLoadReporter.Source.PREFETCH);
    }

    public static JsonElement e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b1adafea908d6e3e30e50c89079ca85", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b1adafea908d6e3e30e50c89079ca85") : b.b.a("rum");
    }

    public static JsonElement f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ad8c501d2e9512943dd50260b21b92a", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ad8c501d2e9512943dd50260b21b92a") : b.b.a("autoshowV2_1");
    }

    public static JsonArray g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c83ed996bc5eeafc755cce069b2e65f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c83ed996bc5eeafc755cce069b2e65f9");
        }
        JsonArray jsonArray = new JsonArray();
        for (JsonElement jsonElement : b.b.h.values()) {
            jsonArray.addAll(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST)));
        }
        return jsonArray;
    }

    public static boolean d(String str) {
        boolean z;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5801c940560e708cccd654f4109ddfaf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5801c940560e708cccd654f4109ddfaf")).booleanValue();
        }
        if (com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(c(), "downgrade"), false).booleanValue()) {
            com.sankuai.eh.component.service.tools.d.b("全局降级生效");
            return true;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        JsonArray b2 = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f94aec867740d42301073d1519aeec92", RobustBitConfig.DEFAULT_VALUE) ? (JsonArray) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f94aec867740d42301073d1519aeec92") : com.sankuai.eh.component.service.utils.b.b(b.b.a("blackList"));
        for (int i = 0; b2 != null && i < b2.size(); i++) {
            String b3 = com.sankuai.eh.component.service.utils.b.b(b2.get(i), "");
            if (!TextUtils.isEmpty(b3) && !TextUtils.isEmpty(str)) {
                Object[] objArr3 = {b3, str};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.eh.component.service.utils.e.a;
                if (!PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1772cbb9fd24383331a9825cb1fb5f18", RobustBitConfig.DEFAULT_VALUE)) {
                    if (!TextUtils.isEmpty(b3) && !TextUtils.isEmpty(str) && com.sankuai.eh.component.service.utils.e.c(com.sankuai.eh.component.service.utils.e.a(b3), com.sankuai.eh.component.service.utils.e.a(str))) {
                        String a2 = com.sankuai.eh.component.service.utils.e.a(Uri.parse(b3), SearchIntents.EXTRA_QUERY);
                        String a3 = com.sankuai.eh.component.service.utils.e.a(Uri.parse(str), SearchIntents.EXTRA_QUERY);
                        if (!TextUtils.isEmpty(a2)) {
                            if (!TextUtils.isEmpty(a3)) {
                                String[] split = a2.split("&");
                                String[] split2 = a3.split("&");
                                for (String str2 : split) {
                                    if (com.sankuai.eh.component.service.utils.e.a(split2, str2) != -1) {
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                    z = false;
                    break;
                } else {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1772cbb9fd24383331a9825cb1fb5f18")).booleanValue();
                }
                if (z) {
                    com.sankuai.eh.component.service.tools.d.b("黑名单匹配生效");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2addd2e58f1e083ea7e032b6f6da870", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2addd2e58f1e083ea7e032b6f6da870")).booleanValue() : com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(c(), "skeleton"), false).booleanValue();
    }

    public static boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4f1af85cef98bb7af2b8ab16e485112", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4f1af85cef98bb7af2b8ab16e485112")).booleanValue() : com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(c(), "activeSkeleton"), false).booleanValue();
    }

    public static boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0cce047af24b9ba5708021aff885d51", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0cce047af24b9ba5708021aff885d51")).booleanValue() : com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(c(), "whiteMonitor"), false).booleanValue();
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62adf901b669044bb63c705ee76b577f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62adf901b669044bb63c705ee76b577f");
            return;
        }
        a.b = context;
        com.sankuai.eh.component.service.utils.thread.b.a().d(f.b());
        if (!b) {
            com.sankuai.eh.component.service.tools.d.b("正在注册 Horn");
            b = true;
            a("eh_skeleton_manifest", e);
            a("eh_config_manifest", f);
        }
        b.b.g.put("debug", com.sankuai.eh.component.service.utils.b.a("{\"skeletons\":[{\"pattern\":\"https://gongyi.meituan.com/m\",\"content\":{\"type\":1,\"conf\":{\"bg\":\"ffffff\",\"c\":\"0000000a\"},\"data\":\"4SoQovNwlB4S,gU4kCoqNo2HgF,oVwnKgtGgsEgF,oxHwnKgtGgsEgF,oVg4SwkEwWwC,gUwiU4lEoxCgF,4cwnPw7FwWA,o7HwnPw7FwWA,omF4jU4lEoxCgF,o3J4jUgnEoxCgF,of41QwiFgUwC,g6Hw0QwiFgUwC,gegoQ4lEgFwC,g6H4mQo+DgFwC,4uM47SgtB4SwC,oVogXgpDoVwC,wnFg/WgpDoVwC,w4J49WgpDoVwC,oVw6XwtCwMwC,wnFo5XwtCwMwC,45Jw6XwtCwMwC\"},\"autoshow\":false,\"notitlebar\":false,\"forceTime\":5000,\"hideDuration\":500}]}"));
    }
}
