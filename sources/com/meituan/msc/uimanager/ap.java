package com.meituan.msc.uimanager;

import android.support.annotation.Nullable;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ap {
    public static ChangeQuickRedirect a;

    public static Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc9edf234dda2d9e7d4b338949148d18", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc9edf234dda2d9e7d4b338949148d18") : com.meituan.msc.jse.common.a.a("bubblingEventTypes", ao.a(), "directEventTypes", ao.b());
    }

    public static Map<String, Object> a(List<as> list, @Nullable Map<String, Object> map, @Nullable Map<String, Object> map2) {
        Map concurrentHashMap;
        Object[] objArr = {list, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c36a7a4763286e5c8f9937fdf59f3ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c36a7a4763286e5c8f9937fdf59f3ed");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = ao.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "48ba3e15b86f46955dbe280723c03304", RobustBitConfig.DEFAULT_VALUE)) {
            concurrentHashMap = (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "48ba3e15b86f46955dbe280723c03304");
        } else {
            concurrentHashMap = new ConcurrentHashMap();
            concurrentHashMap.put("UIView", com.meituan.msc.jse.common.a.a("ContentMode", com.meituan.msc.jse.common.a.a("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
            concurrentHashMap.put("StyleConstants", com.meituan.msc.jse.common.a.a("PointerEventsValues", com.meituan.msc.jse.common.a.a("none", Integer.valueOf(t.NONE.ordinal()), "boxNone", Integer.valueOf(t.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(t.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(t.AUTO.ordinal()))));
            concurrentHashMap.put("PopupMenu", com.meituan.msc.jse.common.a.a("dismissed", "dismissed", "itemSelected", "itemSelected"));
            concurrentHashMap.put("AccessibilityEventTypes", com.meituan.msc.jse.common.a.a("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        }
        Map<? extends String, ? extends Object> a2 = ao.a();
        Map<? extends String, ? extends Object> b = ao.b();
        if (map != null) {
            map.putAll(a2);
        }
        if (map2 != null) {
            map2.putAll(b);
        }
        for (as asVar : list) {
            String a3 = asVar.a();
            com.meituan.msc.systrace.b.a(0L, "UIManagerModuleConstantsHelper.createConstants");
            Boolean bool = Boolean.FALSE;
            try {
                Map<String, Object> a4 = a(asVar, null, null, map, map2);
                if (!a4.isEmpty()) {
                    concurrentHashMap.put(a3, a4);
                }
            } finally {
                com.meituan.msc.systrace.b.a(0L);
            }
        }
        concurrentHashMap.put("genericBubblingEventTypes", a2);
        concurrentHashMap.put("genericDirectEventTypes", b);
        return concurrentHashMap;
    }

    public static Map<String, Object> a(as asVar, @Nullable Map map, @Nullable Map map2, @Nullable Map map3, @Nullable Map map4) {
        Object[] objArr = {asVar, null, null, map3, map4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ee34d16a7fce50c3fcf97250a677776", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ee34d16a7fce50c3fcf97250a677776");
        }
        HashMap a2 = com.meituan.msc.jse.common.a.a();
        Map<String, Object> b = asVar.b();
        if (b != null) {
            a(map4, b);
            a(b, null);
            a2.put("directEventTypes", b);
        }
        Map<String, Integer> e = asVar.e();
        if (e != null) {
            a2.put("Commands", e);
        }
        Map<String, String> f = asVar.f();
        if (!f.isEmpty()) {
            a2.put("NativeProps", f);
        }
        return a2;
    }

    private static void a(@Nullable Map map, @Nullable Map map2) {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2be7c2f229846356f3098e6f9994a72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2be7c2f229846356f3098e6f9994a72");
        } else if (map != null && map2 != null && !map2.isEmpty()) {
            for (Object obj : map2.keySet()) {
                Object obj2 = map2.get(obj);
                Object obj3 = map.get(obj);
                if (obj3 != null && (obj2 instanceof Map) && (obj3 instanceof Map)) {
                    a((Map) obj3, (Map) obj2);
                } else {
                    map.put(obj, obj2);
                }
            }
        }
    }
}
