package com.facebook.react.uimanager;

import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class aw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> a(List<ViewManager> list, @Nullable Map<String, Object> map, @Nullable Map<String, Object> map2) {
        Map<String, Object> c = av.c();
        Map<? extends String, ? extends Object> a = av.a();
        Map<? extends String, ? extends Object> b = av.b();
        if (map != null) {
            map.putAll(a);
        }
        if (map2 != null) {
            map2.putAll(b);
        }
        for (ViewManager viewManager : list) {
            String name = viewManager.getName();
            com.facebook.systrace.b.a(0L, "UIManagerModuleConstantsHelper.createConstants");
            Boolean bool = Boolean.FALSE;
            try {
                Map<String, Object> a2 = a(viewManager, null, null, map, map2);
                if (!a2.isEmpty()) {
                    c.put(name, a2);
                }
            } finally {
                com.facebook.systrace.b.a(0L);
            }
        }
        c.put("genericBubblingEventTypes", a);
        c.put("genericDirectEventTypes", b);
        return c;
    }

    private static void a(@Nullable Map map, @Nullable Map map2) {
        if (map == null || map2 == null || map2.isEmpty()) {
            return;
        }
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Object> a(ViewManager viewManager, @Nullable Map map, @Nullable Map map2, @Nullable Map map3, @Nullable Map map4) {
        HashMap hashMap = new HashMap();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            a(map3, exportedCustomBubblingEventTypeConstants);
            a(exportedCustomBubblingEventTypeConstants, null);
            hashMap.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants != null) {
            a(map4, exportedCustomDirectEventTypeConstants);
            a(exportedCustomDirectEventTypeConstants, null);
            hashMap.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            hashMap.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            hashMap.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            hashMap.put("NativeProps", nativeProps);
        }
        return hashMap;
    }
}
