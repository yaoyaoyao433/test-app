package com.meituan.msc.mmpviews.msiviews;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msi.api.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final Set<String> b = new CopyOnWriteArraySet();
    private static final ConcurrentHashMap c = new ConcurrentHashMap();

    public static Set<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40f698f8554560aa1a3423b1e0ea7fd1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40f698f8554560aa1a3423b1e0ea7fd1");
        }
        synchronized (b) {
            if (b.isEmpty()) {
                b();
            }
        }
        return b;
    }

    private static Map b() {
        String replaceFirst;
        String str;
        char c2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d33f7fc9d98218ebd159bcfbe5c0c7d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d33f7fc9d98218ebd159bcfbe5c0c7d7");
        }
        HashMap hashMap = new HashMap();
        JSONObject a2 = f.a();
        try {
            Iterator<String> keys = a2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object[] objArr2 = new Object[1];
                objArr2[c2] = next;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ad3c04199735e5b0c08d78235e356974", RobustBitConfig.DEFAULT_VALUE)) {
                    replaceFirst = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ad3c04199735e5b0c08d78235e356974");
                } else if (TextUtils.isEmpty(next)) {
                    g.a("[MSCMSIAdapter@componentNameToMSC]", "组件名字不能为空!");
                    replaceFirst = null;
                } else {
                    replaceFirst = next.startsWith("MSI") ? next.replaceFirst("MSI", "MSC") : next;
                }
                b.add(replaceFirst);
                JSONObject jSONObject = a2.getJSONObject(next);
                HashMap hashMap2 = new HashMap();
                JSONObject optJSONObject = jSONObject.optJSONObject("NativeProps");
                if (optJSONObject != null) {
                    Iterator<String> keys2 = optJSONObject.keys();
                    HashMap hashMap3 = new HashMap();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        String optString = optJSONObject.optString(next2);
                        Object[] objArr3 = {next2, optString};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f0b449b61e89e13112df67cd899ece36", RobustBitConfig.DEFAULT_VALUE)) {
                            str = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f0b449b61e89e13112df67cd899ece36");
                        } else if (optString.equals(Boolean.TYPE.getSimpleName())) {
                            str = Constants.BOOLEAN;
                        } else if (optString.equals(Integer.TYPE.getSimpleName())) {
                            str = next2.endsWith("Color") ? "Color" : "number";
                        } else if (optString.equals(Float.TYPE.getSimpleName())) {
                            str = "number";
                        } else if (optString.equals(Double.TYPE.getSimpleName())) {
                            str = "number";
                        } else if (optString.equals(String.class.getSimpleName())) {
                            str = "String";
                        } else if (optString.equals(Boolean.class.getSimpleName())) {
                            str = Constants.BOOLEAN;
                        } else if (optString.equals(Integer.class.getSimpleName())) {
                            str = next2.endsWith("Color") ? "Color" : "number";
                        } else if (optString.equals(List.class.getSimpleName())) {
                            str = "Array";
                        } else {
                            if (!optString.equals(Map.class.getSimpleName()) && !optString.equals(HashMap.class.getSimpleName())) {
                                if (optString.equals(JSONObject.class.getSimpleName())) {
                                    str = "Map";
                                } else {
                                    g.b("[MSCMSIAdapter@getMSIPropType]", null, "Unrecognized type:", next2, ", classType: ", optString);
                                    str = "String";
                                }
                            }
                            str = "Map";
                        }
                        hashMap3.put(next2, str);
                    }
                    hashMap2.put("NativeProps", hashMap3);
                    c.put(replaceFirst, hashMap3);
                }
                hashMap.put(next, hashMap2);
                c2 = 0;
            }
        } catch (Throwable th) {
            g.a("[MSCMSIAdapter@createMSIComponentConstants]", th);
        }
        g.d("[MSCMSIAdapter@createMSIComponentConstants]", "msiComponents: ", b);
        return hashMap;
    }

    public static Map a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94068105494e3a2cdc597a40e33efb52", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94068105494e3a2cdc597a40e33efb52");
        }
        synchronized (c) {
            if (c.isEmpty()) {
                b();
            }
        }
        return (Map) c.get(str);
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95ffa67dcaf5cf85bd89f6e516005dc0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95ffa67dcaf5cf85bd89f6e516005dc0");
        }
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith("MSC") ? str.replaceFirst("MSC", "MSI") : str;
        }
        g.a("[MSCMSIAdapter@componentNameToMSC]", "组件名字不能为空!");
        return null;
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bfd70248046429e4d1dffe6027986384", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bfd70248046429e4d1dffe6027986384")).intValue();
        }
        if (!(context instanceof ReactContext)) {
            g.a("[MSCMSIAdapter@getPageId]", "view context is not ReactContext: " + context);
            return -1;
        }
        return ((ReactContext) context).getRuntimeDelegate().getPageId();
    }
}
