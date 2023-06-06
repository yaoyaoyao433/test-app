package com.sankuai.waimai.mach.common;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.waimai.mach.common.DevSettings;
import com.sankuai.waimai.mach.l;
import com.sankuai.waimai.mach.m;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean b = false;

    public static void a(final Context context, h hVar) {
        File[] listFiles;
        com.sankuai.waimai.mach.manager_new.config.a aVar;
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        BufferedReader bufferedReader = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20de8c7effabbab82b85252a4964f2bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20de8c7effabbab82b85252a4964f2bb");
        } else if (!b) {
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "03a70662bfeaef3b80b22bbd89d40f6c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "03a70662bfeaef3b80b22bbd89d40f6c");
            } else {
                com.dianping.codelog.b.a(context, new com.dianping.codelog.a() { // from class: com.sankuai.waimai.mach.common.e.1
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.codelog.a
                    public final String a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0e4c6ee40895bf65c17cd438258b8b37", RobustBitConfig.DEFAULT_VALUE)) {
                            return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0e4c6ee40895bf65c17cd438258b8b37");
                        }
                        String packageName = context.getPackageName();
                        int i = 10;
                        if ("com.sankuai.meituan.takeoutnew".equals(packageName)) {
                            i = 11;
                        } else if ("com.dianping.v1".equals(packageName)) {
                            i = 1;
                        } else if ("com.sjst.xgfe.android.kmall".equals(packageName)) {
                            i = 110;
                        } else if ("com.sankuai.meituan.mtmall".equals(packageName)) {
                            i = 352;
                        } else if ("com.sankuai.meituan.meituanwaimaibusiness".equals(packageName)) {
                            i = 15;
                        }
                        return String.valueOf(i);
                    }

                    @Override // com.dianping.codelog.a
                    public final String b() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8a60978d5b721896d3c968eff2404ced", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8a60978d5b721896d3c968eff2404ced") : GetUUID.getInstance().getSyncUUID(context, null);
                    }

                    @Override // com.dianping.codelog.a
                    public final JSONObject c() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "43f25511bc23b2eb4b30f1605ee04753", RobustBitConfig.DEFAULT_VALUE)) {
                            return (JSONObject) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "43f25511bc23b2eb4b30f1605ee04753");
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            Map<String, Object> b2 = i.a().b();
                            if (b2 != null && b2.get("appVersion") != null) {
                                jSONObject.put("appVersion", b2.get("appVersion"));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        return jSONObject;
                    }
                });
            }
            b(context, hVar);
            com.sankuai.waimai.mach.model.data.a aVar2 = new com.sankuai.waimai.mach.model.data.a("mach_init_v2");
            i.a().a(context, hVar);
            aVar2.a("mach_init_v2_sdk_init");
            com.sankuai.waimai.mach.manager_new.b.a().a(context, hVar, aVar2);
            if (hVar.c != null) {
                hVar.c.a(aVar2);
            }
            Object[] objArr3 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "81b5db00ba5cabbfdd7ee459866f5273", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "81b5db00ba5cabbfdd7ee459866f5273");
            } else {
                DevSettings devSettings = i.a().f;
                if (devSettings.c || i.a().h()) {
                    File a2 = q.a(context, "wm_mach", "mach_lock", u.e);
                    if (a2.exists() && a2.isDirectory() && a2.listFiles() != null && a2.listFiles().length > 0) {
                        for (File file : a2.listFiles()) {
                            if (file.exists() && file.isDirectory()) {
                                String[] split = file.getName().split("@");
                                if (split.length == 3) {
                                    DevSettings.LockBundleInfo lockBundleInfo = new DevSettings.LockBundleInfo();
                                    lockBundleInfo.templateId = split[0];
                                    lockBundleInfo.version = split[1];
                                    lockBundleInfo.env = split[2];
                                    lockBundleInfo.bundleDir = file.getAbsolutePath();
                                    String str = lockBundleInfo.templateId;
                                    Object[] objArr4 = {str, lockBundleInfo};
                                    ChangeQuickRedirect changeQuickRedirect4 = DevSettings.a;
                                    if (PatchProxy.isSupport(objArr4, devSettings, changeQuickRedirect4, false, "5582f87d80c28862809d7172aa433c96", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, devSettings, changeQuickRedirect4, false, "5582f87d80c28862809d7172aa433c96");
                                    } else {
                                        devSettings.j.put(str, lockBundleInfo);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Object[] objArr5 = {context};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            try {
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "39539ffea356e726f14f69a5c82da8f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "39539ffea356e726f14f69a5c82da8f2");
                } else {
                    try {
                    } catch (Exception e) {
                        e = e;
                    }
                    if (Build.MANUFACTURER != null && Build.MANUFACTURER.toLowerCase().contains("xiaomi")) {
                        m.g(true);
                        String a3 = l.a(context, "waimai_platform", "miui_12_5_5", "");
                        if (!TextUtils.isEmpty(a3)) {
                            m.f(Long.parseLong(a3) >= 1622995200);
                            com.sankuai.waimai.mach.manager_new.common.b.a(bufferedReader);
                        } else {
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.miui.version.code_time").getInputStream()));
                            try {
                                String readLine = bufferedReader2.readLine();
                                l.b(context, "waimai_platform", "miui_12_5_5", readLine);
                                m.f(Long.parseLong(readLine) >= 1622995200);
                                com.sankuai.waimai.mach.manager_new.common.b.a(bufferedReader2);
                            } catch (Exception e2) {
                                e = e2;
                                bufferedReader = bufferedReader2;
                                com.sankuai.waimai.mach.log.b.b("Mach", "check miui version failed! " + e.getMessage());
                                com.sankuai.waimai.mach.manager_new.common.b.a(bufferedReader);
                                b = true;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                com.sankuai.waimai.mach.manager_new.common.b.a(bufferedReader);
                                throw th;
                            }
                        }
                    }
                    m.g(false);
                    com.sankuai.waimai.mach.manager_new.common.b.a(bufferedReader);
                }
                b = true;
            } catch (Throwable th2) {
                th = th2;
            }
        } else if (com.sankuai.waimai.mach.manager_new.b.a().b && (aVar = com.sankuai.waimai.mach.manager_new.b.a().c) != null) {
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.mach.manager_new.config.a.a;
            if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "ebf4c24bde7f9bd4353ea87414b975d3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "ebf4c24bde7f9bd4353ea87414b975d3")).booleanValue() : aVar.b.c) {
                return;
            }
            com.sankuai.waimai.mach.manager_new.config.a aVar3 = com.sankuai.waimai.mach.manager_new.b.a().c;
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.mach.manager_new.config.a.a;
            k kVar = PatchProxy.isSupport(objArr7, aVar3, changeQuickRedirect7, false, "e4e9709401a9bafb1aeffff0a8c460ff", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr7, aVar3, changeQuickRedirect7, false, "e4e9709401a9bafb1aeffff0a8c460ff") : aVar3.b.d;
            if (kVar != null && kVar.isUnsubscribed()) {
                kVar.unsubscribe();
            }
            b(context, hVar);
            i.a().a(context, hVar);
            com.sankuai.waimai.mach.manager_new.b.a().c.a();
        }
    }

    private static void b(Context context, h hVar) {
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9c2024a03658ec1814b835378a5fb24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9c2024a03658ec1814b835378a5fb24");
            return;
        }
        hVar.b.k = l.a(context, "waimai_platform", "MACH_TEXT_FACE", true);
        m.a(hVar.b.f);
        m.c(hVar.b.g);
        m.a(l.a(context, "waimai_platform", "MACH_YOGA_INPUT_STYLE", false));
        m.b(l.a(context, "waimai_platform", "MACH_PRE_RENDER_THREAD_COUNT_OPT", false));
        m.b(l.a(context, "waimai_platform", "MACH_PRE_RENDER_THREAD_POOL_COUNT", 0));
        m.e(l.a(context, "waimai_platform", "MACH_EXTRACT_DOWNLOAD_HOMEPAGE_TEMPLATE", false));
        m.c(l.a(context, "waimai_platform", "MACH_MOVE_BUNDLE_FAIL_TIME_LIMIT", 0));
        m.d(l.a(context, "waimai_platform", "MACH_MOVE_BUNDLE_FAIL_REBOOT_TIME_LIMIT", 0));
        m.a(l.a(context, "waimai_platform", "MACH_CODELOG_SAMPLING_RATE", 1));
        m.h(l.a(context, "waimai_takeout", "mach_text_measure", true));
        m.i(l.a(context, "waimai_takeout", "rich_text_measure", true));
        m.b(l.a(context, "waimai_takeout", "mach_text_measure_device_type", ""));
        m.j(l.a(context, "waimai_takeout", "mach_zip_download_template", false));
        m.c(l.a(context, "waimai_takeout", "free_data_memory", false));
        m.d(l.a(context, "waimai_takeout", "skip_js_process", false));
        if (hVar.b.b) {
            l.b(context, "waimai_platform", "MACH_THREAD_OPT", true);
        }
    }
}
