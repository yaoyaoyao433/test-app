package com.sankuai.mesh.core;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.js.JsHost;
import com.google.gson.JsonObject;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mesh.bean.MeshBaseUrl;
import com.sankuai.mesh.core.c;
import com.sankuai.mesh.internalservice.MeshService;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static Handler b = new Handler(Looper.getMainLooper());
    private static HashMap<String, c.a> c = new HashMap<>();

    public static boolean a() {
        return false;
    }

    private static void b(Activity activity, MeshBaseUrl meshBaseUrl, c.a aVar) {
        Object[] objArr = {activity, meshBaseUrl, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "838a59a66850d289391fd7fdaeeadda1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "838a59a66850d289391fd7fdaeeadda1");
        } else {
            a(activity, meshBaseUrl, aVar, null);
        }
    }

    public static void a(final Activity activity, MeshBaseUrl meshBaseUrl, final c.a aVar, final a aVar2) {
        final MeshBaseUrl meshBaseUrl2;
        MeshBaseUrl meshBaseUrl3;
        MeshBaseUrl meshBaseUrl4 = meshBaseUrl;
        Object[] objArr = {activity, meshBaseUrl4, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c1d811d0bd77577abf50183f0056df2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c1d811d0bd77577abf50183f0056df2");
            return;
        }
        try {
            com.sankuai.mesh.util.f.a(com.sankuai.mesh.util.e.b(meshBaseUrl).a("message", "解析scheme完成").a("apiStatus", "doing").b);
            if (meshBaseUrl.isRequest()) {
                MeshBaseUrl a2 = com.sankuai.mesh.util.e.a(meshBaseUrl);
                if (a2 == null) {
                    a2 = meshBaseUrl4;
                }
                if ("android".equals(meshBaseUrl.getSourceType())) {
                    ArrayList<MeshBaseUrl> a3 = DowngradeSchemeManager.a(meshBaseUrl);
                    if (!com.sankuai.mesh.util.a.a(a3)) {
                        com.sankuai.mesh.util.f.a(com.sankuai.mesh.util.e.b(meshBaseUrl).a("message", "配置降级生效").a("apiStatus", "doing").b);
                        meshBaseUrl2 = a3.get(0);
                        try {
                            meshBaseUrl3 = com.sankuai.mesh.util.e.a(meshBaseUrl2);
                            if (meshBaseUrl3 == null) {
                                meshBaseUrl3 = meshBaseUrl2;
                            }
                            c(activity, meshBaseUrl3, new c.a() { // from class: com.sankuai.mesh.core.e.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.mesh.core.c.a
                                public final void a(MeshBaseUrl meshBaseUrl5) {
                                    Object[] objArr2 = {meshBaseUrl5};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22b0e736fa368a5620635ece02aceb90", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22b0e736fa368a5620635ece02aceb90");
                                    } else if (meshBaseUrl5.isRequestSuccess()) {
                                        com.sankuai.mesh.util.f.a(com.sankuai.mesh.util.e.b(meshBaseUrl5).a("message", "api执行成功").a("apiStatus", "doing").b);
                                        c.a.this.a(meshBaseUrl5);
                                    } else {
                                        MeshBaseUrl a4 = com.sankuai.mesh.util.e.a(meshBaseUrl2);
                                        if (a4 != null) {
                                            com.sankuai.mesh.util.f.a(com.sankuai.mesh.util.e.b(meshBaseUrl5).a("message", "api执行失败，尝试新的adapter").a("error", meshBaseUrl5.getError()).a("apiStatus", "doing").b);
                                            e.c(activity, a4, this, aVar2);
                                            return;
                                        }
                                        com.sankuai.mesh.util.f.a(com.sankuai.mesh.util.e.b(meshBaseUrl5).a("message", "api执行失败").a("error", meshBaseUrl5.getError()).a("apiStatus", "fail").b);
                                        c.a.this.a(meshBaseUrl5);
                                    }
                                }
                            }, aVar2);
                            return;
                        } catch (Exception e) {
                            e = e;
                            meshBaseUrl4 = meshBaseUrl2;
                            JsonObject jsonObject = new JsonObject();
                            jsonObject.addProperty("code", (Number) 500);
                            jsonObject.addProperty("message", "error:" + e.getMessage());
                            if (aVar != null) {
                                aVar.a(com.sankuai.mesh.util.e.a(meshBaseUrl4, false, jsonObject));
                            }
                            a(e, "MeshSdk_use", meshBaseUrl4);
                            return;
                        }
                    }
                }
                MeshBaseUrl meshBaseUrl5 = a2;
                meshBaseUrl2 = meshBaseUrl4;
                meshBaseUrl3 = meshBaseUrl5;
                c(activity, meshBaseUrl3, new c.a() { // from class: com.sankuai.mesh.core.e.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.mesh.core.c.a
                    public final void a(MeshBaseUrl meshBaseUrl52) {
                        Object[] objArr2 = {meshBaseUrl52};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22b0e736fa368a5620635ece02aceb90", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22b0e736fa368a5620635ece02aceb90");
                        } else if (meshBaseUrl52.isRequestSuccess()) {
                            com.sankuai.mesh.util.f.a(com.sankuai.mesh.util.e.b(meshBaseUrl52).a("message", "api执行成功").a("apiStatus", "doing").b);
                            c.a.this.a(meshBaseUrl52);
                        } else {
                            MeshBaseUrl a4 = com.sankuai.mesh.util.e.a(meshBaseUrl2);
                            if (a4 != null) {
                                com.sankuai.mesh.util.f.a(com.sankuai.mesh.util.e.b(meshBaseUrl52).a("message", "api执行失败，尝试新的adapter").a("error", meshBaseUrl52.getError()).a("apiStatus", "doing").b);
                                e.c(activity, a4, this, aVar2);
                                return;
                            }
                            com.sankuai.mesh.util.f.a(com.sankuai.mesh.util.e.b(meshBaseUrl52).a("message", "api执行失败").a("error", meshBaseUrl52.getError()).a("apiStatus", "fail").b);
                            c.a.this.a(meshBaseUrl52);
                        }
                    }
                }, aVar2);
                return;
            }
            String uniqueId = meshBaseUrl.getUniqueId();
            if (c.get(uniqueId) != null) {
                c.get(uniqueId).a(meshBaseUrl4);
                c.remove(uniqueId);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static void a(Activity activity, MeshBaseUrl meshBaseUrl, c.a aVar) {
        Object[] objArr = {activity, meshBaseUrl, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "781347e18ad672d7e44b213c8161fa61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "781347e18ad672d7e44b213c8161fa61");
        } else if (meshBaseUrl == null) {
            if (aVar != null) {
                aVar.a(com.sankuai.mesh.util.e.b("scheme解析出错"));
            }
        } else if (!meshBaseUrl.isRequest() && !TextUtils.isEmpty(meshBaseUrl.getUniqueId())) {
            b(activity, meshBaseUrl, aVar);
        } else {
            meshBaseUrl.setUniqueId(com.sankuai.mesh.util.e.a());
            meshBaseUrl.setSourceType("android");
            b(activity, meshBaseUrl, aVar);
        }
    }

    private static void b(final String str, c.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b2396865b5fe28f27e31c3734040d40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b2396865b5fe28f27e31c3734040d40");
            return;
        }
        c.put(str, aVar);
        b.postDelayed(new Runnable() { // from class: com.sankuai.mesh.core.e.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e0d7683799d53301faa7573bd3ec934", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e0d7683799d53301faa7573bd3ec934");
                } else {
                    e.c.remove(str);
                }
            }
        }, MetricsAnrManager.ANR_THRESHOLD);
    }

    public static void a(String str, c.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3a62e447006aeda9e7581e7bad391f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3a62e447006aeda9e7581e7bad391f3");
        } else {
            c.put(str, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Activity activity, MeshBaseUrl meshBaseUrl, c.a aVar, a aVar2) {
        Object[] objArr = {activity, meshBaseUrl, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "809ccf69fa93a898d053d186912029b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "809ccf69fa93a898d053d186912029b4");
        } else if (meshBaseUrl.hasApiType() && meshBaseUrl.getApiAdaptIds().get(0).targetType.equals("h5")) {
            com.sankuai.mesh.util.f.a(com.sankuai.mesh.util.e.b(meshBaseUrl).a("message", "native call js").b);
            d(activity, meshBaseUrl, aVar);
        } else if (!f.a(meshBaseUrl.getService()) || !f.a(meshBaseUrl.getService(), meshBaseUrl.getApi())) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("code", (Number) 404);
            jsonObject.addProperty("message", "服务不存在");
            aVar.a(com.sankuai.mesh.util.e.a(meshBaseUrl, false, jsonObject));
        } else {
            d(activity, meshBaseUrl, aVar, aVar2);
        }
    }

    private static void c(Activity activity, MeshBaseUrl meshBaseUrl, c.a aVar) {
        Object[] objArr = {activity, meshBaseUrl, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60f617f0969173f44d0827abbac62223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60f617f0969173f44d0827abbac62223");
        } else {
            d(activity, meshBaseUrl, aVar, null);
        }
    }

    private static void d(Activity activity, MeshBaseUrl meshBaseUrl, c.a aVar, a aVar2) {
        Object[] objArr = {activity, meshBaseUrl, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01f24cffc4305467b59d055235c55188", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01f24cffc4305467b59d055235c55188");
            return;
        }
        Class<? extends c> b2 = f.b(meshBaseUrl.getService());
        try {
            c newInstance = b2.newInstance();
            newInstance.setContext(activity);
            newInstance.setIMeshApiCallBack(aVar);
            newInstance.setMeshBaseUrl(meshBaseUrl);
            b2.getDeclaredMethod(f.c(meshBaseUrl.getApi()), new Class[0]).invoke(newInstance, new Object[0]);
            if (aVar2 != null) {
                aVar2.a(newInstance, meshBaseUrl);
            }
        } catch (Exception e) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("code", (Number) 500);
            jsonObject.addProperty("message", "服务调用异常");
            aVar.a(com.sankuai.mesh.util.e.a(meshBaseUrl, false, jsonObject));
            a(e, "MeshSdk_runMethod", meshBaseUrl);
        }
    }

    private static void d(Activity activity, MeshBaseUrl meshBaseUrl, c.a aVar) {
        Object[] objArr = {activity, meshBaseUrl, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1031700428859de1f3122048e1891da2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1031700428859de1f3122048e1891da2");
            return;
        }
        if (TextUtils.isEmpty(meshBaseUrl.getUniqueId())) {
            meshBaseUrl.setUniqueId(com.sankuai.mesh.util.e.a());
        }
        b(meshBaseUrl.getUniqueId(), aVar);
        JsHost a2 = b.a(activity);
        if (a2 != null) {
            String b2 = b.b(activity);
            a2.loadJs("javascript:window & window." + b2 + "& window." + b2 + "('" + meshBaseUrl.toString() + "')");
            return;
        }
        c(activity, meshBaseUrl, aVar);
    }

    public static void a(Context context, IMeshProvider iMeshProvider) {
        Object[] objArr = {context, iMeshProvider};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1add412b5ba3cb7f3050086c610155f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1add412b5ba3cb7f3050086c610155f6");
            return;
        }
        JsHandlerFactory.registerJsHandler("mesh.gatherChannel", "Z3intR5ApZEU9l7s5HXy02EyYAg+pzpZBDhmwEuvO/8v2FXLRRzw/+erdosUh5h/Dv2xsIrxCysbh6ljA+9olQ==", MeshContactHandler.class);
        f.a("mesh", MeshService.class);
        d.a().b = iMeshProvider;
        DowngradeSchemeManager.a(context);
    }

    private static void a(@NonNull Throwable th, @NonNull String str, MeshBaseUrl meshBaseUrl) {
        Object[] objArr = {th, str, meshBaseUrl};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85139b977209511ba520a68e5ff7eb63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85139b977209511ba520a68e5ff7eb63");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("meshBaseUrl", meshBaseUrl.toString());
        com.sankuai.mesh.util.d.a(th, str, hashMap);
    }
}
