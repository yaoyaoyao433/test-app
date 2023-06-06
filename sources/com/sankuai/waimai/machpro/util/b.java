package com.sankuai.waimai.machpro.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.sankuai.waimai.machpro.adapter.e;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.f;
import com.sankuai.waimai.machpro.instance.MPContext;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final LruCache<String, Integer> b = new LruCache<>(128);
    private static final LruCache<String, Float> c = new LruCache<>(128);
    private static final LruCache<String, Float> d = new LruCache<>(128);
    private static Map<String, Typeface> e = new HashMap();
    private static Map<String, Typeface> f = new HashMap();
    private static final Handler g = new Handler(Looper.getMainLooper());

    public static float a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f7982c91e77003420ebe0986b4155f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f7982c91e77003420ebe0986b4155f0")).floatValue();
        }
        if (TextUtils.isEmpty(str) || !str.endsWith("%")) {
            return 0.0f;
        }
        return b((Object) str.substring(0, str.length() - 1));
    }

    public static float a(Object obj) {
        String a2;
        Float f2;
        float parseFloat;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a790121712b4e65587ae5d8b02e3cb3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a790121712b4e65587ae5d8b02e3cb3")).floatValue();
        }
        float f3 = 0.0f;
        try {
            a2 = a(obj, "");
            f2 = d.get(a2);
        } catch (Exception unused) {
        }
        if (f2 != null) {
            return f2.floatValue();
        }
        if (!TextUtils.isEmpty(a2)) {
            if (a2.endsWith("dp")) {
                parseFloat = Float.parseFloat(a2.substring(0, a2.length() - 2)) * a();
            } else if (a2.endsWith("px")) {
                if (!a2.endsWith("rpx")) {
                    parseFloat = Float.parseFloat(a2.substring(0, a2.length() - 2));
                } else {
                    parseFloat = (Float.parseFloat(a2.substring(0, a2.length() - 3)) / 750.0f) * com.sankuai.waimai.machpro.a.c.widthPixels;
                }
            } else {
                parseFloat = Float.parseFloat(a2) * a();
            }
            f3 = parseFloat;
            d.put(a2, Float.valueOf(f3));
        }
        return f3;
    }

    public static float a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "279bf8deec0e21ad89fa63b477511184", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "279bf8deec0e21ad89fa63b477511184")).floatValue();
        }
        Context context = f.a().h;
        if (context != null) {
            return context.getResources().getDisplayMetrics().density;
        }
        return 0.0f;
    }

    public static String a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a21f2fb4c1eb644a5a4a0339ce46deea", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a21f2fb4c1eb644a5a4a0339ce46deea") : obj == null ? str : obj.toString();
    }

    public static int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19ce3b93aec21a193e4691501c564e9c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19ce3b93aec21a193e4691501c564e9c")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return Integer.MAX_VALUE;
        }
        try {
            Integer num = b.get(str);
            if (num != null) {
                return num.intValue();
            }
            if (!str.equals("transparent") && str.length() == 9) {
                str = "#" + str.substring(7, 9) + str.substring(1, 7);
            }
            int parseColor = Color.parseColor(str);
            try {
                b.put(str, Integer.valueOf(parseColor));
            } catch (Exception unused) {
            }
            return parseColor;
        } catch (Exception unused2) {
            return Integer.MAX_VALUE;
        }
    }

    public static int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c81e59fe1705809a94167f1fd878e4cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c81e59fe1705809a94167f1fd878e4cb")).intValue();
        }
        int b2 = b(str);
        return b2 != Integer.MAX_VALUE ? b2 : i;
    }

    public static float b(Object obj) {
        Float f2;
        float parseFloat;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "849531250968d594758680541b773652", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "849531250968d594758680541b773652")).floatValue();
        }
        float f3 = 0.0f;
        try {
            f2 = c.get(a(obj, ""));
        } catch (Exception unused) {
        }
        if (f2 != null) {
            return f2.floatValue();
        }
        if (obj instanceof Float) {
            parseFloat = ((Float) obj).floatValue();
        } else if (obj instanceof Double) {
            parseFloat = ((Double) obj).floatValue();
        } else {
            parseFloat = Float.parseFloat(obj.toString());
        }
        f3 = parseFloat;
        c.put(a(obj, ""), Float.valueOf(f3));
        return f3;
    }

    public static int c(Object obj) {
        Integer num;
        int parseInt;
        int i = 0;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f0fb4891c1e33b8a6ee34d4ae50a4d5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f0fb4891c1e33b8a6ee34d4ae50a4d5")).intValue();
        }
        try {
            num = b.get(a(obj, ""));
        } catch (Exception unused) {
        }
        if (num != null) {
            return num.intValue();
        }
        if (obj instanceof Integer) {
            parseInt = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            parseInt = ((Long) obj).intValue();
        } else {
            parseInt = Integer.parseInt(obj.toString());
        }
        i = parseInt;
        b.put(a(obj, ""), Integer.valueOf(i));
        return i;
    }

    public static boolean d(Object obj) {
        boolean parseBoolean;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfd7f1b72a7ca82a064c46dbe158ab66", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfd7f1b72a7ca82a064c46dbe158ab66")).booleanValue();
        }
        try {
            if (obj instanceof Boolean) {
                parseBoolean = ((Boolean) obj).booleanValue();
            } else {
                parseBoolean = Boolean.parseBoolean(obj.toString());
            }
            return parseBoolean;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Handler b() {
        return g;
    }

    public static ArrayList<String> c(String str) {
        String[] split;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "223f03ac64cddd718eb70bd7e0c74af1", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "223f03ac64cddd718eb70bd7e0c74af1");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (String str2 : str.split(StringUtil.SPACE)) {
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static void a(View view, Canvas canvas, boolean z) {
        Object[] objArr = {view, canvas, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c522503cba941489974cf3419b39f9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c522503cba941489974cf3419b39f9e");
        } else if (canvas == null) {
        } else {
            Drawable background = view.getBackground();
            if (background instanceof com.sankuai.waimai.machpro.view.decoration.b) {
                com.sankuai.waimai.machpro.view.decoration.b bVar = (com.sankuai.waimai.machpro.view.decoration.b) background;
                if (bVar.d() && !z && Build.VERSION.SDK_INT >= 21) {
                    view.setClipToOutline(true);
                } else {
                    canvas.clipPath(bVar.c);
                }
            }
        }
    }

    public static float a(Context context, float f2) {
        Object[] objArr = {context, Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b6baff96c59413bbb97f6fa5cac6a8b", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b6baff96c59413bbb97f6fa5cac6a8b")).floatValue() : f2 / context.getResources().getDisplayMetrics().density;
    }

    public static float b(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15e7f5f924d961829ef63945ec550470", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15e7f5f924d961829ef63945ec550470")).floatValue() : f2 * a();
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3766f75753c29a62170bdadbeb0f4211", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3766f75753c29a62170bdadbeb0f4211")).intValue() : context.getResources().getDisplayMetrics().heightPixels;
    }

    public static Map<String, com.sankuai.waimai.machpro.module.c> a(Class cls) {
        Method[] methods;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "570f6b37f91d4902fb29b432ae93d7a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "570f6b37f91d4902fb29b432ae93d7a4");
        }
        HashMap hashMap = new HashMap();
        if (cls == null) {
            return hashMap;
        }
        try {
            for (Method method : cls.getMethods()) {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                int length = declaredAnnotations.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Annotation annotation = declaredAnnotations[i];
                        if (annotation instanceof JSMethod) {
                            JSMethod jSMethod = (JSMethod) annotation;
                            String name = TextUtils.isEmpty(jSMethod.methodName()) ? method.getName() : jSMethod.methodName();
                            hashMap.put(name, new com.sankuai.waimai.machpro.module.c(method, name, method.getParameterTypes().length));
                        } else {
                            i++;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a.a("JSMethod解析失败-->" + th.getMessage());
        }
        return hashMap;
    }

    public static MachMap a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be4c42c0944552fd0680a505d8e9b70b", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be4c42c0944552fd0680a505d8e9b70b");
        }
        if (map == null) {
            return null;
        }
        MachMap machMap = new MachMap();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof Map) {
                machMap.put(str, a((Map<String, Object>) obj));
            } else if (obj instanceof List) {
                machMap.put(str, a((List) obj));
            } else {
                machMap.put(str, obj);
            }
        }
        return machMap;
    }

    public static MachArray a(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "205580bd48c34289a151a791daf17007", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "205580bd48c34289a151a791daf17007");
        }
        if (list == null) {
            return null;
        }
        MachArray machArray = new MachArray();
        for (Object obj : list) {
            if (obj instanceof Map) {
                machArray.add(a((Map<String, Object>) obj));
            } else if (obj instanceof List) {
                machArray.add(a((List) obj));
            } else if (obj instanceof Bundle) {
                machArray.add(a((Bundle) obj));
            } else {
                machArray.add(obj);
            }
        }
        return machArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object[], java.io.Serializable] */
    public static Bundle a(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a71d7031038b5894162db9b47470a27", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a71d7031038b5894162db9b47470a27");
        }
        if (machMap == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : machMap.getJavaMap().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof MachArray) {
                bundle.putSerializable(key, ((MachArray) value).toArray());
            } else if (value instanceof MachMap) {
                bundle.putBundle(key, a((MachMap) value));
            } else if (value instanceof Double) {
                bundle.putDouble(key, ((Double) value).doubleValue());
            } else if (value instanceof Integer) {
                bundle.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof String) {
                bundle.putString(key, (String) value);
            } else if (value instanceof Boolean) {
                bundle.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Float) {
                bundle.putFloat(key, ((Float) value).floatValue());
            } else if (value instanceof Long) {
                bundle.putLong(key, ((Long) value).longValue());
            }
        }
        return bundle;
    }

    public static MachMap a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57f1d32c3242a47284ab50a6ac252182", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57f1d32c3242a47284ab50a6ac252182");
        }
        if (bundle == null) {
            return null;
        }
        MachMap machMap = new MachMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                machMap.put(str, a((Bundle) obj));
            } else if (obj instanceof List) {
                machMap.put(str, a((List) obj));
            } else {
                machMap.put(str, obj);
            }
        }
        return machMap;
    }

    public static HashMap<String, Object> b(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04299767e2431f9d6b13f3a778a7dd52", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04299767e2431f9d6b13f3a778a7dd52");
        }
        if (machMap == null) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : machMap.getJavaMap().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof MachMap) {
                hashMap.put(key, b((MachMap) value));
            } else if (value instanceof MachArray) {
                hashMap.put(key, a((MachArray) value));
            } else {
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    private static List<Object> a(MachArray machArray) {
        Object[] objArr = {machArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae454799a22aa6de836eaa66e40be9db", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae454799a22aa6de836eaa66e40be9db");
        }
        if (machArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < machArray.size(); i++) {
            Object obj = machArray.get(i);
            if (obj instanceof MachMap) {
                arrayList.add(b((MachMap) obj));
            } else if (obj instanceof MachArray) {
                arrayList.add(a((MachArray) obj));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static JSONObject c(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff03032e93302d6ebd76b93be022a5d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff03032e93302d6ebd76b93be022a5d8");
        }
        JSONObject jSONObject = new JSONObject();
        if (machMap == null || machMap.getJavaMap() == null || machMap.getJavaMap().size() == 0) {
            return jSONObject;
        }
        try {
            for (Map.Entry<String, Object> entry : machMap.getJavaMap().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof MachMap) {
                    jSONObject.put(key, c((MachMap) value));
                } else if (value instanceof MachArray) {
                    jSONObject.put(key, b((MachArray) value));
                } else if (value == null) {
                    jSONObject.put(key, StringUtil.NULL);
                } else {
                    jSONObject.put(key, value);
                }
            }
        } catch (Exception e2) {
            a.a("machMap2Json异常-->" + e2.getMessage());
        }
        return jSONObject;
    }

    private static JSONArray b(MachArray machArray) throws Exception {
        Object[] objArr = {machArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38dc6576e9731a1204c1720fd4024fe0", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38dc6576e9731a1204c1720fd4024fe0");
        }
        JSONArray jSONArray = new JSONArray();
        if (machArray == null || machArray.size() == 0) {
            return jSONArray;
        }
        for (int i = 0; i < machArray.size(); i++) {
            Object obj = machArray.get(i);
            if (obj instanceof MachMap) {
                jSONArray.put(c((MachMap) obj));
            } else if (obj instanceof MachArray) {
                jSONArray.put(b((MachArray) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public static MachMap a(JSONObject jSONObject) throws Exception {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09372440d8b4b4348d46216967b72e1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09372440d8b4b4348d46216967b72e1a");
        }
        MachMap machMap = new MachMap();
        if (jSONObject == null) {
            return machMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONObject) {
                machMap.put(next, a((JSONObject) opt));
            } else if (opt instanceof JSONArray) {
                machMap.put(next, a((JSONArray) opt));
            } else if (opt == JSONObject.NULL) {
                machMap.put(next, null);
            } else {
                machMap.put(next, opt);
            }
        }
        return machMap;
    }

    public static MachArray a(JSONArray jSONArray) throws Exception {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2f1bb5183e38fbb6820a31ac7b68e5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2f1bb5183e38fbb6820a31ac7b68e5a");
        }
        MachArray machArray = new MachArray();
        int length = jSONArray.length();
        if (length == 0) {
            return machArray;
        }
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof JSONObject) {
                machArray.add(a((JSONObject) opt));
            } else if (opt instanceof JSONArray) {
                machArray.add(a((JSONArray) opt));
            } else if (opt == JSONObject.NULL) {
                machArray.add(null);
            } else {
                machArray.add(opt);
            }
        }
        return machArray;
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        Object[] objArr = {stackTraceElementArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d9a05e4a35f59338dcb8a497056cd84", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d9a05e4a35f59338dcb8a497056cd84");
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

    public static int d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6123314bae8034466eaca706b39d63ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6123314bae8034466eaca706b39d63ca")).intValue();
        }
        if (TextUtils.isEmpty(str) || "solid".equals(str)) {
            return 1;
        }
        if ("dotted".equals(str)) {
            return 2;
        }
        return "dashed".equals(str) ? 3 : 1;
    }

    public static boolean a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a09601ebc2e60a820e4415e5abd8d721", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a09601ebc2e60a820e4415e5abd8d721")).booleanValue() : a(viewGroup, new int[1], i);
    }

    private static boolean a(ViewGroup viewGroup, int[] iArr, int i) {
        Object[] objArr = {viewGroup, iArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d18d52d802d8a6a2c6e3b3326481da47", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d18d52d802d8a6a2c6e3b3326481da47")).booleanValue();
        }
        if (viewGroup == null) {
            return false;
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (((childAt instanceof com.sankuai.waimai.machpro.component.view.c) || (childAt instanceof TextView) || (childAt instanceof ImageView)) && childAt.getWidth() > 0 && childAt.getHeight() > 0) {
                iArr[0] = iArr[0] + 1;
                if (iArr[0] >= 30) {
                    return true;
                }
            }
            if ((childAt instanceof TextView) || (childAt instanceof ImageView)) {
                int[] iArr2 = new int[2];
                childAt.getLocationOnScreen(iArr2);
                if (iArr2[1] + childAt.getHeight() > i) {
                    return true;
                }
            }
            if (childAt instanceof ViewGroup ? a((ViewGroup) childAt, iArr, i) : false) {
                return true;
            }
        }
        return false;
    }

    public static byte[] a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7a21c3ebd5e9bc6e063d71a55167dc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7a21c3ebd5e9bc6e063d71a55167dc5");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    com.sankuai.waimai.mach.manager_new.common.b.a(byteArrayOutputStream);
                    return byteArray;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static Typeface b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f2490a4cc09c1bd7296b75e5a71d8e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f2490a4cc09c1bd7296b75e5a71d8e1");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String trim = str.trim();
        String str2 = "mach_pro_" + trim + i;
        Typeface typeface = f.get(str2);
        if (typeface != null) {
            return typeface;
        }
        Typeface typeface2 = e.get(trim);
        if (typeface2 == null) {
            e eVar = f.a().d;
            if (eVar != null) {
                typeface2 = eVar.a(trim);
            }
            if (typeface2 != null) {
                e.put(trim, typeface2);
            }
        }
        Typeface create = Typeface.create(typeface2, i);
        f.put(str2, create);
        return create;
    }

    public static String a(com.sankuai.waimai.mach.manager.cache.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd743909494d1365766cff9d2188e69b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd743909494d1365766cff9d2188e69b");
        }
        return cVar.d + "@" + cVar.e;
    }

    public static int a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "832da441cc4a9140fc361499643bc1aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "832da441cc4a9140fc361499643bc1aa")).intValue();
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (TextUtils.isEmpty(str2)) {
            return 1;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        if (split.length == 3 && split2.length == 3) {
            for (int i = 0; i < 3; i++) {
                int c2 = c((Object) split[i]);
                int c3 = c((Object) split2[i]);
                if (c2 > c3) {
                    return 1;
                }
                if (c2 < c3) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static boolean b(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "899e5843457f4fd3740a924b0e550df7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "899e5843457f4fd3740a924b0e550df7")).booleanValue() : list == null || list.size() <= 0;
    }

    public static String e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc3daa95eada771c88f3805f65a8bda3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc3daa95eada771c88f3805f65a8bda3") : TextUtils.isEmpty(str) ? "" : "normal".equals(str) ? "normal" : (DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equals(str) || "medium".equals(str)) ? DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD : (str.equals("100") || str.equals(BasicPushStatus.SUCCESS_CODE) || str.equals("300") || str.equals("400")) ? "normal" : (str.equals("500") || str.equals("600") || str.equals("700") || str.equals("800") || str.equals("900")) ? DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD : "";
    }

    public static String a(MPContext mPContext) {
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1522c62a65ff436b8331584614f3d25e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1522c62a65ff436b8331584614f3d25e");
        }
        com.sankuai.waimai.mach.manager.cache.c bundle = mPContext.getBundle();
        if (bundle == null) {
            return "";
        }
        return bundle.g + File.separator + APKStructure.Assets_Type + File.separator;
    }

    public static String a(Throwable th, com.sankuai.waimai.mach.manager.cache.c cVar, Map<String, com.sankuai.waimai.mach.manager.cache.c> map) {
        Object[] objArr = {th, cVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "312fdd092f9845187c7ce6a24704911e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "312fdd092f9845187c7ce6a24704911e");
        }
        if (th != null) {
            try {
                if (th.getMessage() == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder(th.getMessage());
                sb.append("\n\n");
                if (cVar != null) {
                    sb.append(cVar.d);
                    sb.append(StringUtil.SPACE);
                    sb.append(cVar.e);
                }
                sb.append("\n");
                if (map != null) {
                    for (com.sankuai.waimai.mach.manager.cache.c cVar2 : map.values()) {
                        if (cVar2 != null) {
                            sb.append(cVar2.d);
                            sb.append(StringUtil.SPACE);
                            sb.append(cVar2.e);
                            sb.append("\n");
                        }
                    }
                }
                return sb.toString();
            } catch (Exception e2) {
                a.a("formatJSError异常：" + e2.getMessage());
                return "";
            }
        }
        return "";
    }

    public static boolean c(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea42ff411f1d654785d3d5897fcc01a0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea42ff411f1d654785d3d5897fcc01a0")).booleanValue() : list == null || list.size() == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.sankuai.waimai.machpro.component.view.b r12, com.sankuai.waimai.machpro.component.MPComponent r13) {
        /*
        L0:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r9 = 1
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.machpro.util.b.a
            java.lang.String r11 = "5e9aa203a130c19af3dd87dbdea4786a"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L26
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r9, r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L26:
            if (r12 == 0) goto L55
            if (r13 != 0) goto L2b
            goto L55
        L2b:
            if (r12 != r13) goto L2e
            return r9
        L2e:
            java.util.List r12 = r12.getChildComponent()
            boolean r0 = c(r12)
            if (r0 == 0) goto L39
            return r8
        L39:
            java.util.Iterator r12 = r12.iterator()
        L3d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r12.next()
            com.sankuai.waimai.machpro.component.MPComponent r0 = (com.sankuai.waimai.machpro.component.MPComponent) r0
            if (r0 != r13) goto L4c
            return r9
        L4c:
            boolean r1 = r0 instanceof com.sankuai.waimai.machpro.component.view.b
            if (r1 == 0) goto L3d
            r12 = r0
            com.sankuai.waimai.machpro.component.view.b r12 = (com.sankuai.waimai.machpro.component.view.b) r12
            goto L0
        L54:
            return r8
        L55:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.util.b.a(com.sankuai.waimai.machpro.component.view.b, com.sankuai.waimai.machpro.component.MPComponent):boolean");
    }

    public static String f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "616767d3ef9afa178b2c085b6be1a576", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "616767d3ef9afa178b2c085b6be1a576");
        }
        if (TextUtils.isEmpty(str)) {
            return StringUtil.NULL;
        }
        String[] split = str.split(CommonConstant.Symbol.UNDERLINE);
        return split.length >= 3 ? split[2] : "unknown";
    }

    public static void a(final View view, final String[] strArr) {
        Object[] objArr = {view, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb14168e28f7053f984afcce6f848c22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb14168e28f7053f984afcce6f848c22");
        } else if (view == null) {
        } else {
            view.post(new Runnable() { // from class: com.sankuai.waimai.machpro.util.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de1b989e16726ad9f2169ecded03179b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de1b989e16726ad9f2169ecded03179b");
                        return;
                    }
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (strArr == null || strArr.length < 2) {
                        view.setPivotX(measuredWidth * 0.5f);
                        view.setPivotY(measuredHeight * 0.5f);
                        return;
                    }
                    String trim = strArr[0].trim();
                    String trim2 = strArr[1].trim();
                    if ("left".equals(trim)) {
                        view.setPivotX(0.0f);
                    } else if ("right".equals(trim)) {
                        view.setPivotX(measuredWidth);
                    } else if ("center".equals(trim)) {
                        view.setPivotX(measuredWidth * 0.5f);
                    } else {
                        view.setPivotX(measuredWidth * com.sankuai.waimai.machpro.animator.c.c(trim));
                    }
                    if ("top".equals(trim2)) {
                        view.setPivotY(0.0f);
                    } else if ("bottom".equals(trim2)) {
                        view.setPivotY(measuredHeight);
                    } else if ("center".equals(trim2)) {
                        view.setPivotY(measuredHeight * 0.5f);
                    } else {
                        view.setPivotY(measuredHeight * com.sankuai.waimai.machpro.animator.c.c(trim2));
                    }
                }
            });
        }
    }

    public static void a(final View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9bb47d03548ae6b95a06fb759cdcb1bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9bb47d03548ae6b95a06fb759cdcb1bd");
        } else {
            view.post(new Runnable() { // from class: com.sankuai.waimai.machpro.util.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0798cf60983bf2d0ecdec6e59d8be962", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0798cf60983bf2d0ecdec6e59d8be962");
                        return;
                    }
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    view.setPivotX(measuredWidth * 0.5f);
                    view.setPivotY(measuredHeight * 0.5f);
                }
            });
        }
    }

    public static float a(float f2) {
        Object[] objArr = {Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8a31480564c91979d86ac260e27ab9d", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8a31480564c91979d86ac260e27ab9d")).floatValue() : f2 / com.sankuai.waimai.machpro.a.b.density;
    }
}
