package com.sankuai.waimai.irmo.canvas.util;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.bridge.jscallbak.CanvasArray;
import com.sankuai.waimai.irmo.canvas.bridge.jscallbak.CanvasMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static CanvasMap a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b6f02aace0a0cd891490c3ee3c03e71", RobustBitConfig.DEFAULT_VALUE)) {
            return (CanvasMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b6f02aace0a0cd891490c3ee3c03e71");
        }
        if (map == null) {
            return null;
        }
        CanvasMap canvasMap = new CanvasMap();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof Map) {
                canvasMap.put(str, a((Map) obj));
            } else if (obj instanceof List) {
                canvasMap.put(str, a((List) obj));
            } else {
                canvasMap.put(str, obj);
            }
        }
        return canvasMap;
    }

    private static CanvasArray a(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e377023feb70451e51d8fbe17fd6524", RobustBitConfig.DEFAULT_VALUE)) {
            return (CanvasArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e377023feb70451e51d8fbe17fd6524");
        }
        if (list == null) {
            return null;
        }
        CanvasArray canvasArray = new CanvasArray();
        for (Object obj : list) {
            if (obj instanceof Map) {
                canvasArray.pushMap(a((Map) obj));
            } else if (obj instanceof List) {
                canvasArray.pushArray(a((List) obj));
            } else if (obj instanceof Bundle) {
                canvasArray.pushMap(a((Bundle) obj));
            } else {
                canvasArray.pushObject(obj);
            }
        }
        return canvasArray;
    }

    private static CanvasMap a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d0d6570aecc67ad0fb7a84ae1c063af", RobustBitConfig.DEFAULT_VALUE)) {
            return (CanvasMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d0d6570aecc67ad0fb7a84ae1c063af");
        }
        if (bundle == null) {
            return null;
        }
        CanvasMap canvasMap = new CanvasMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                canvasMap.put(str, a((Bundle) obj));
            } else if (obj instanceof List) {
                canvasMap.put(str, a((List) obj));
            } else {
                canvasMap.put(str, obj);
            }
        }
        return canvasMap;
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        Object[] objArr = {stackTraceElementArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72a15e6825788d2895ecfcdb644316be", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72a15e6825788d2895ecfcdb644316be");
        }
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
