package com.meituan.android.neohybrid.v2.neo.offline;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import com.dianping.titans.offline.OfflineCenter;
import com.dianping.titans.offline.entity.OfflineRuleItem;
import com.meituan.android.neohybrid.core.horn.bean.NeoHornConfig;
import com.meituan.android.neohybrid.core.horn.options.NeoOfflineOptions;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static Map<String, Map<String, f>> b;

    public static /* synthetic */ void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbb4089f567d5221e387393e28605674", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbb4089f567d5221e387393e28605674");
            return;
        }
        try {
            if (b == null || b.size() <= 0) {
                return;
            }
            b.clear();
            b = null;
        } catch (Exception e) {
            com.meituan.android.neohybrid.neo.report.b.a(e, "NeoOffline_clearOfflineResourceCache", (Map<String, Object>) null);
        }
    }

    public static void a(com.meituan.android.neohybrid.protocol.kernel.c cVar, com.meituan.android.neohybrid.v2.core.a aVar) {
        Object[] objArr = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b2beaa7551caf5dc4f80ecd3357548c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b2beaa7551caf5dc4f80ecd3357548c");
            return;
        }
        NeoOfflineOptions b2 = b();
        if (b2 == null || !b2.isEnableOffline() || Build.VERSION.SDK_INT <= 26 || cVar == null || cVar.c() == null || aVar != null) {
            return;
        }
        com.meituan.android.neohybrid.v2.neo.adapter.a e = aVar.e();
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        e.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c186111cd5d49898255be06a8ecd6894", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c186111cd5d49898255be06a8ecd6894") : new c(aVar));
    }

    public static /* synthetic */ f a(com.meituan.android.neohybrid.v2.core.a aVar, com.meituan.android.neohybrid.protocol.kernel.c cVar, WebResourceRequest webResourceRequest) {
        f fVar;
        f fVar2;
        boolean z;
        OfflineCenter offlineCenter;
        OfflineRuleItem presetResource;
        InputStream resourceStream;
        Object[] objArr = {aVar, cVar, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d36a64651c7313ec9718f83f7b2dd8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d36a64651c7313ec9718f83f7b2dd8f");
        }
        try {
            String uri = webResourceRequest.getUrl().toString();
            if (!TextUtils.isEmpty(uri)) {
                String a2 = e.a(Uri.parse(uri));
                Object[] objArr2 = {a2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b5a58c1eb1653e39ed800d68bb7124b9", RobustBitConfig.DEFAULT_VALUE)) {
                    fVar = (f) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b5a58c1eb1653e39ed800d68bb7124b9");
                } else {
                    if (!TextUtils.isEmpty(a2) && b != null && b.size() > 0) {
                        for (Map<String, f> map : b.values()) {
                            if (map != null && map.size() > 0 && map.containsKey(a2) && (fVar2 = map.get(a2)) != null) {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = f.a;
                                if (PatchProxy.isSupport(objArr3, fVar2, changeQuickRedirect3, false, "2784c404ef223b778c419e54efc35393", RobustBitConfig.DEFAULT_VALUE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, fVar2, changeQuickRedirect3, false, "2784c404ef223b778c419e54efc35393")).booleanValue();
                                } else {
                                    if (fVar2.g != null && fVar2.g.length > 0 && fVar2.c != null && fVar2.c.size() > 0) {
                                        z = false;
                                    }
                                    z = true;
                                }
                                if (!z) {
                                    fVar = fVar2;
                                    break;
                                }
                            }
                        }
                    }
                    fVar = null;
                }
                if (fVar != null) {
                    com.meituan.android.neohybrid.util.f.a("Neo离线化 url=" + uri);
                }
                if (fVar == null && aVar.f().isNeoPresetBundle()) {
                    Object[] objArr4 = {uri};
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.neohybrid.v2.neo.preset.a.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "58f47136e891f66aaeafe2d83680c058", RobustBitConfig.DEFAULT_VALUE)) {
                        fVar = (f) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "58f47136e891f66aaeafe2d83680c058");
                    } else {
                        if (!TextUtils.isEmpty(uri) && (offlineCenter = OfflineCenter.getInstance()) != null) {
                            String a3 = e.a(Uri.parse(uri));
                            if (!TextUtils.isEmpty(a3) && (presetResource = offlineCenter.getPresetResource(a3)) != null && (resourceStream = presetResource.getResourceStream()) != null) {
                                byte[] a4 = e.a(resourceStream);
                                Map<String, String> headers = presetResource.getHeaders();
                                String mime = presetResource.getMime();
                                if (a4 != null && a4.length > 0 && headers != null && !headers.isEmpty()) {
                                    com.meituan.android.neohybrid.util.f.a("NeoPreset_getPresetResource: 从预置包中获取成功，url=" + a3);
                                    com.meituan.android.neohybrid.neo.report.b.a("b_pay_hybrid_cashier_preset_bundle_start_sc", com.meituan.android.neohybrid.neo.report.a.c("preset_url", uri).b);
                                    fVar = new f(mime, headers, a4);
                                }
                            }
                        }
                        fVar = null;
                    }
                    if (fVar != null) {
                        com.meituan.android.neohybrid.util.f.a("Neo预置包 url=" + uri);
                    }
                }
                if (fVar != null) {
                    return fVar;
                }
            }
        } catch (Exception e) {
            com.meituan.android.neohybrid.neo.report.b.a(e, "NeoOffline_shouldInterceptRequest", (Map<String, Object>) null);
        }
        return null;
    }

    public static boolean a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f7ee625f677307a4d3ee9d0478df5b8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f7ee625f677307a4d3ee9d0478df5b8")).booleanValue() : a("", str);
    }

    private static boolean a(@NonNull String str, @Nullable String str2) {
        String a2;
        Map<String, f> map;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8a0fa09e3b13766f41b8f218cae41d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8a0fa09e3b13766f41b8f218cae41d6")).booleanValue();
        }
        if (str2 != null) {
            try {
                if (str2.length() != 0 && (a2 = e.a(Uri.parse(str2))) != null && a2.length() != 0) {
                    NeoOfflineOptions b2 = b();
                    if (!TextUtils.isEmpty(str) && b2 != null && b2.isEnableOffline() && b2.getOfflineScopes().contains(str) && Build.VERSION.SDK_INT > 26) {
                        if (b == null) {
                            b = new HashMap();
                        }
                        if (!b.containsKey(str)) {
                            b(str);
                            if (str.equals("https://npay.meituan.com/web-cashier")) {
                                b("global_offline_neo");
                            }
                        }
                        return b.containsKey(str) && (map = b.get(str)) != null && map.size() > 0 && map.containsKey(a2) && map.get(a2) != null;
                    }
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4fef286e1cc509882b5207c8fc10a4a9", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4fef286e1cc509882b5207c8fc10a4a9")).booleanValue();
                    }
                    String a3 = e.a(Uri.parse(str2));
                    if (b != null && !b.isEmpty()) {
                        for (Map<String, f> map2 : b.values()) {
                            if (map2 != null && map2.size() > 0 && map2.containsKey(a3) && map2.get(a3) != null) {
                                return true;
                            }
                        }
                    }
                    Object[] objArr3 = {str2};
                    ChangeQuickRedirect changeQuickRedirect3 = e.a;
                    return PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "76dc15c418737bc8d49d4e387b68d287", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "76dc15c418737bc8d49d4e387b68d287")).booleanValue() : str2.contains(".html") && e.b(str2).first == d.EXIST;
                }
                return false;
            } catch (Exception e) {
                com.meituan.android.neohybrid.neo.report.b.a(e, "NeoOffline_isOfflineResourceExist", (Map<String, Object>) null);
                return false;
            }
        }
        return false;
    }

    private static void b(String str) throws Exception {
        List<String> offlineUrlFromScope;
        OfflineRuleItem a2;
        InputStream resourcePath;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "242e9b5e25bff605665e47883b5edc3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "242e9b5e25bff605665e47883b5edc3f");
            return;
        }
        OfflineCenter offlineCenter = OfflineCenter.getInstance();
        if (offlineCenter == null) {
            return;
        }
        if (b == null) {
            b = new HashMap();
        }
        if (b.containsKey(str) || (offlineUrlFromScope = offlineCenter.getOfflineUrlFromScope(str)) == null || offlineUrlFromScope.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < offlineUrlFromScope.size(); i++) {
            String str2 = offlineUrlFromScope.get(i);
            if (str2 != null && str2.length() != 0 && (a2 = e.a(str2)) != null && (resourcePath = a2.getResourcePath()) != null) {
                byte[] a3 = e.a(resourcePath);
                Map<String, String> headers = a2.getHeaders();
                String mime = a2.getMime();
                if (a3 != null && a3.length > 0 && headers != null && !headers.isEmpty()) {
                    hashMap.put(str2, new f(mime, headers, a3));
                }
            }
        }
        b.put(str, hashMap);
        com.meituan.android.neohybrid.init.a.d().registerComponentCallbacks(new ComponentCallbacks() { // from class: com.meituan.android.neohybrid.v2.neo.offline.b.1
            public static ChangeQuickRedirect a;

            @Override // android.content.ComponentCallbacks
            public final void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public final void onLowMemory() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "305d92c96c89d15a548de0639b7c5568", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "305d92c96c89d15a548de0639b7c5568");
                } else {
                    b.a();
                }
            }
        });
    }

    @Nullable
    private static NeoOfflineOptions b() {
        NeoHornConfig neoHornConfig;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64860c8d88f9e1ef89eace0ae119d8ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (NeoOfflineOptions) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64860c8d88f9e1ef89eace0ae119d8ae");
        }
        com.meituan.android.neohybrid.core.horn.a a2 = com.meituan.android.neohybrid.core.horn.a.a();
        if (a2 == null || (neoHornConfig = (NeoHornConfig) a2.a(NeoHornConfig.class)) == null) {
            return null;
        }
        return neoHornConfig.getNeoOfflineOptions();
    }
}
