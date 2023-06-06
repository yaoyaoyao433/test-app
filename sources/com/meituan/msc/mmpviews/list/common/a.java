package com.meituan.msc.mmpviews.list.common;

import android.text.TextUtils;
import com.meituan.msc.jse.bridge.MSCReadableArray;
import com.meituan.msc.jse.bridge.MSCReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1c6b9661d0b6577b56177ac28095164", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1c6b9661d0b6577b56177ac28095164")).booleanValue();
        }
        return ("true".equals(str) || "false".equals(str)) ? Boolean.parseBoolean(str) : true ^ TextUtils.isEmpty(str);
    }

    public static Object a(com.meituan.msc.mmpviews.list.expression.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2f667b0d0cc15161c3237983f66b171", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2f667b0d0cc15161c3237983f66b171");
        }
        if (bVar != null) {
            switch (bVar.b) {
                case 1:
                    return Boolean.valueOf(bVar.c);
                case 2:
                case 3:
                    return bVar.d;
                case 4:
                    return bVar.e;
                default:
                    return null;
            }
        }
        return null;
    }

    public static JSONObject a(JSONObject jSONObject, int i) {
        Object[] objArr = {jSONObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee380ef901c205f9c029d5416854a346", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee380ef901c205f9c029d5416854a346");
        }
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if ((obj instanceof String) && obj.equals("index")) {
                    obj = Integer.valueOf(i);
                }
                if (next != null && next.startsWith("data-")) {
                    if (obj instanceof MSCReadableMap) {
                        obj = ((MSCReadableMap) obj).getRealData();
                    } else if (obj instanceof MSCReadableArray) {
                        obj = ((MSCReadableArray) obj).getRealData();
                    }
                    jSONObject2.put(next.replaceFirst("data-", ""), obj);
                    jSONObject2.put(b(next.replaceFirst("data-", "").toLowerCase()), obj);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject2;
    }

    private static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee095656aa155824aa6f7b2f1bab6e8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee095656aa155824aa6f7b2f1bab6e8f");
        }
        String[] split = str.split(CommonConstant.Symbol.MINUS);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                sb.append(split[i]);
            } else {
                sb.append(split[i].substring(0, 1).toUpperCase());
                sb.append(split[i].substring(1));
            }
        }
        return sb.toString();
    }

    public static JSONObject a(JSONObject jSONObject, com.meituan.msc.mmpviews.list.msclist.a aVar, String str) {
        Object[] objArr = {jSONObject, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c32868955083732885e3493b524002d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c32868955083732885e3493b524002d");
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            String valueOf = String.valueOf(opt);
            if (!valueOf.startsWith("$$")) {
                try {
                    jSONObject2.put(next, opt);
                } catch (JSONException e) {
                    throw new com.meituan.msc.common.b(e);
                }
            } else if (aVar.e) {
                try {
                    jSONObject2.put(next, aVar.f.a(valueOf, str, (LinkedList) aVar.c, (JSONObject) aVar.b));
                } catch (JSONException e2) {
                    throw new com.meituan.msc.common.b(e2);
                }
            } else {
                continue;
            }
        }
        return jSONObject2;
    }

    public static boolean a(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56e7b312f1411aa0469e781cf2617c48", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56e7b312f1411aa0469e781cf2617c48")).booleanValue();
        }
        int i = iArr[0];
        int i2 = iArr[0];
        int i3 = i;
        for (int i4 = 1; i4 < iArr.length; i4++) {
            if (iArr[i4] < i3 && iArr[i4] != 0) {
                i3 = iArr[i4];
            }
            if (iArr[i4] > i2 && iArr[i4] != 0) {
                i2 = iArr[i4];
            }
        }
        return i2 - i3 <= iArr.length - 1;
    }
}
