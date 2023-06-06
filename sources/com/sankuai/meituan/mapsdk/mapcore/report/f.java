package com.sankuai.meituan.mapsdk.mapcore.report;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.report.d;
import com.sankuai.meituan.mapsdk.maps.MapsInitializer;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static final Map<Integer, List<String>> b = new HashMap();

    public static void a(Context context, Class<?> cls, String str, int i, Platform platform, int i2, String str2, Map<String, Object> map) {
        Object[] objArr = {context, cls, str, Integer.valueOf(i), platform, Integer.valueOf((int) MapConstant.LayerPropertyFlag_HeatmapRadius), str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2553441266812564651f68532a05769a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2553441266812564651f68532a05769a");
            return;
        }
        try {
            long longValue = ((Long) map.get("map_style_finish_load")).longValue();
            long longValue2 = ((Long) map.get("map_will_load")).longValue();
            long longValue3 = ((Long) map.get("map_finish_load")).longValue();
            int intValue = ((Integer) map.get("style_cached")).intValue();
            long longValue4 = ((Long) map.get("map_first_render_count")).longValue();
            HashMap hashMap = new HashMap();
            hashMap.put("techType", a(platform));
            hashMap.put("mapVender", String.valueOf(i));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("MTMapFSLoadTime", Float.valueOf((float) longValue));
            a(hashMap, hashMap2);
            a(context, i, str2, cls, str, 6000L, String.format(Locale.getDefault(), "map_finish_load=%d&map_style_finish_load=%d&map_will_load=%d&style_url=%s&style_cached=%d&map_first_render_count=%d", Long.valueOf(longValue3), Long.valueOf(longValue), Long.valueOf(longValue2), (String) map.get("style_url"), Integer.valueOf(intValue), Long.valueOf(longValue4)), (String) null, 0.0f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(Map<String, String> map, Map<String, Float> map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4eba50be3f83fa0161cd1900717666e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4eba50be3f83fa0161cd1900717666e");
            return;
        }
        try {
            c cVar = new c();
            cVar.c = new e(map, map2);
            h.a().a(cVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(Context context, int i, int i2, Platform platform, String str, String str2, int i3, MapViewOptions mapViewOptions) {
        String str3;
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), platform, str, str2, Integer.valueOf(i3), mapViewOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "467a7d012e58e2901b9a32fcd49f7f22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "467a7d012e58e2901b9a32fcd49f7f22");
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            Object[] objArr2 = {platform};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9f5ad2396f96e43809f983da157352b1", RobustBitConfig.DEFAULT_VALUE)) {
                switch (platform) {
                    case MRN:
                        str3 = "mrn";
                        break;
                    case FLUTTER:
                        str3 = "flutter";
                        break;
                    case MMP:
                        str3 = ContainerInfo.ENV_MMP;
                        break;
                    default:
                        str3 = "native";
                        break;
                }
            } else {
                str3 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9f5ad2396f96e43809f983da157352b1");
            }
            hashMap.put("mapsdk_platform", str3);
            hashMap.put("mapsdk_provider", Integer.valueOf(i));
            hashMap.put("mapsdk_input_provider", Integer.valueOf(i2));
            hashMap.put("mapsdk_product_key", str);
            hashMap.put("mapsdk_app_key", str2);
            if (context != null) {
                String name = b(context) != null ? b(context).getClass().getName() : "";
                hashMap.put("page_message", context.getClass().getName() + "/" + name);
                hashMap.put("page_detail_message", a(context));
            }
            if (i3 != -1) {
                hashMap.put("mapsdk_clear_cache_state", Integer.valueOf(i3));
            }
            if (mapViewOptions != null) {
                hashMap.put("mapsdk_overseas", Integer.valueOf(mapViewOptions.isOverseasMapEnabled() ? 1 : 0));
                hashMap.put("mapsdk_source", Integer.valueOf(mapViewOptions.getBasemapSourceType().getValue()));
            }
            c cVar = new c();
            cVar.b = new d(d.a.Type_MV, "ditu", "c_ditu_qxbuybhp", "b_ditu_5uv4hroq_mv", hashMap);
            h.a().a(com.sankuai.meituan.mapfoundation.datacollector.a.a(context), cVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(Context context, int i, Platform platform, Class<?> cls, String str, String str2) {
        Object[] objArr = {context, Integer.valueOf(i), platform, cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50018687260182b5c33ee8c0143a47dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50018687260182b5c33ee8c0143a47dd");
            return;
        }
        String name = context == null ? "" : context.getClass().getName();
        HashMap hashMap = new HashMap();
        hashMap.put("techType", a(platform));
        hashMap.put("mapVender", String.valueOf(i));
        hashMap.put("mapVer", "4.1207.11");
        hashMap.put("pageName", name);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("MTMapAndroidNoneFacadeKey", Float.valueOf(0.0f));
        a(hashMap, hashMap2);
        a(context, i, (String) null, cls, str, 4000L, str2, (String) null, 1.0f);
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7194b828e4fa4a3e2b18d9b286b54aad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7194b828e4fa4a3e2b18d9b286b54aad");
            return;
        }
        int max = Math.max(MapsInitializer.getCatAppId(), 0);
        HashMap hashMap = new HashMap();
        hashMap.put("mapKey", str);
        hashMap.put("status", "3002");
        hashMap.put("appID", String.valueOf(max));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("MTMapAndroidMapsExceptionStatus", Float.valueOf(1.0f));
        a(hashMap, hashMap2);
    }

    public static String a(Platform platform) {
        Object[] objArr = {platform};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6e9093f26a16d3150af64cc48b68ff6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6e9093f26a16d3150af64cc48b68ff6") : platform == Platform.NATIVE ? "1" : platform == Platform.MRN ? "2" : platform == Platform.MMP ? "3" : platform == Platform.FLUTTER ? "4" : "1";
    }

    public static void a(Context context, int i, String str, Class<?> cls, String str2, int i2, String str3, String str4, float f) {
        Object[] objArr = {context, Integer.valueOf(i), str, cls, str2, Integer.valueOf(i2), str3, str4, Float.valueOf(1.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c60cdb62787be30a514f236178062e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c60cdb62787be30a514f236178062e8");
        } else if (context == null || TextUtils.isEmpty(str) || cls == null || str2 == null) {
        } else {
            if (!b.containsKey(Integer.valueOf(i2))) {
                b.put(Integer.valueOf(i2), new ArrayList());
            }
            List<String> list = b.get(Integer.valueOf(i2));
            if (list.contains(str)) {
                return;
            }
            list.add(str);
            a(context, i, str, cls, str2, i2, str3, str4, 1.0f);
        }
    }

    public static void a(Context context, int i, String str, Class<?> cls, String str2, int i2, String str3) {
        Object[] objArr = {context, Integer.valueOf(i), str, cls, str2, Integer.valueOf(i2), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc6528d31ef970cc38d29fe25f6e5eb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc6528d31ef970cc38d29fe25f6e5eb7");
        } else {
            a(context, i, str, cls, str2, i2, str3, (String) null, 0.0f);
        }
    }

    public static void a(Context context, int i, String str, Class<?> cls, String str2, long j, String str3, String str4, float f) {
        String str5;
        Object[] objArr = {context, Integer.valueOf(i), str, cls, str2, new Long(j), str3, str4, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1efa490e34a5acaa758adbdb233e4037", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1efa490e34a5acaa758adbdb233e4037");
        } else if (cls == null || str2 == null) {
        } else {
            if (context == null) {
                str5 = com.sankuai.meituan.mapfoundation.datacollector.a.a(com.sankuai.meituan.mapfoundation.datacollector.a.a(com.sankuai.meituan.mapsdk.mapcore.a.a()));
            } else {
                str5 = context.getClass().getName() + "/" + com.sankuai.meituan.mapfoundation.datacollector.a.a(com.sankuai.meituan.mapfoundation.datacollector.a.a(context));
            }
            com.sankuai.meituan.mapfoundation.datacollector.a.a(cls, "mapVer=4.1207.11&mapCode=" + j, "{vendor=" + i + "&pageName=" + str5 + "&mapKey=" + str + "&method=" + str2 + "}{" + str3 + CommonConstant.Symbol.BIG_BRACKET_RIGHT);
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            int max = Math.max(MapsInitializer.getCatAppId(), 0);
            HashMap hashMap = new HashMap();
            hashMap.put("mapKey", str);
            hashMap.put("status", String.valueOf(j));
            hashMap.put("appID", String.valueOf(max));
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str4, Float.valueOf(f));
            a(hashMap, hashMap2);
        }
    }

    private static Activity b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4ac576a111b9a36f1024611932bd4f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4ac576a111b9a36f1024611932bd4f6");
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "303c6413f51a877f2a4654a12f0da5e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "303c6413f51a877f2a4654a12f0da5e4");
        }
        Activity b2 = b(context);
        if (b2 == null || b2.getIntent().getData() == null) {
            return "";
        }
        String uri = b2.getIntent().getData().toString();
        Uri parse = Uri.parse(Uri.decode(uri));
        return uri.contains("mrn_entry") ? String.format("mrn://%s/%s", parse.getQueryParameter("mrn_entry"), parse.getQueryParameter("mrn_component")) : uri.contains("targetPath") ? String.format("mmp://mmp?mmpId=%s&targetPath=%s", parse.getQueryParameter("appId"), Uri.parse(String.format("imeituan://www.meituan.com/mmp?targetPath=%s", parse.getQueryParameter("targetPath").replace(CommonConstant.Symbol.QUESTION_MARK, "&"))).getQueryParameter("targetPath")) : "";
    }
}
