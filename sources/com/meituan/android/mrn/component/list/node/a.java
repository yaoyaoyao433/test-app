package com.meituan.android.mrn.component.list.node;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.gson.Gson;
import com.meituan.android.mrn.component.list.item.MListExpressionManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a implements Serializable, Cloneable {
    public static ChangeQuickRedirect a;
    protected static Pattern b = Pattern.compile("\"\\$\\$.*?\\$\\$\"");
    public static Gson c = new Gson();
    public int d;
    public String e;
    public int f;
    public int g;
    public a h;
    public ArrayList<a> i;
    public ReadableMap j;
    public int k;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3a6196fcef09ce9a71f1905d4002636", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3a6196fcef09ce9a71f1905d4002636");
            return;
        }
        this.d = -1;
        this.e = "";
        this.f = -1;
        this.g = -1;
        this.h = null;
        this.i = new ArrayList<>();
        this.j = null;
        this.k = -1;
    }

    public static <T extends a> T a(ReadableMap readableMap, HashMap<String, Object> hashMap, Class<T> cls) {
        T t;
        ArrayList<a> arrayList;
        Object[] objArr = {readableMap, hashMap, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0bde7ebb54e575b29fc821c7094079d", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0bde7ebb54e575b29fc821c7094079d");
        }
        if (readableMap == null) {
            return null;
        }
        try {
            t = cls.newInstance();
            try {
                t.d = com.meituan.android.mrn.component.list.common.a.a(readableMap, "reactTag", -1);
                if (t.d == -1) {
                    t.d = com.meituan.android.mrn.component.list.common.b.a();
                }
                t.f = com.meituan.android.mrn.component.list.common.a.a(readableMap, "rootTag", -1);
                t.g = com.meituan.android.mrn.component.list.common.a.a(readableMap, "parentTag", -1);
                t.k = com.meituan.android.mrn.component.list.common.a.a(readableMap, "tagId", -1);
                t.e = com.meituan.android.mrn.component.list.common.a.a(readableMap, "className", "");
                ReadableMap a2 = com.meituan.android.mrn.component.list.common.a.a(readableMap, "props", (ReadableMap) null);
                if (a2 != null && hashMap != null && a2.toString().contains("$$")) {
                    t.j = a(a2, hashMap);
                } else {
                    t.j = a2;
                }
                ReadableArray array = (MListExpressionManager.COMPONENT_NAME.equals(t.e) && t.j.hasKey("lfor")) ? t.j.getArray("lfor") : null;
                ReadableArray a3 = com.meituan.android.mrn.component.list.common.a.a(readableMap, "children", (ReadableArray) null);
                Object[] objArr2 = {a3, hashMap, t};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5291f4bfc12cb146ae2e0158ff33efd2", RobustBitConfig.DEFAULT_VALUE)) {
                    arrayList = (ArrayList) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5291f4bfc12cb146ae2e0158ff33efd2");
                } else {
                    arrayList = new ArrayList<>();
                    if (a3 != null) {
                        for (int i = 0; i < a3.size(); i++) {
                            a a4 = a(a3.getMap(i), hashMap, a.class);
                            if (a4 != null) {
                                if (MListExpressionManager.COMPONENT_NAME.equals(a4.e)) {
                                    if (a(a4, "lif") || ((a4.j.hasKey("lnotif") && !a(a4, "lnotif")) || a4.j.hasKey("lfor"))) {
                                        t.i.remove(a4);
                                        for (int i2 = 0; i2 < a4.i.size(); i2++) {
                                            a aVar = a4.i.get(i2);
                                            t.i.add(aVar);
                                            aVar.g = t.d;
                                            aVar.h = t;
                                            arrayList.add(aVar);
                                        }
                                    }
                                } else {
                                    a4.h = t;
                                    a4.g = t.d;
                                    arrayList.add(a4);
                                }
                            }
                        }
                    }
                }
                if (array != null) {
                    ArrayList<a> arrayList2 = new ArrayList<>();
                    for (int i3 = 0; i3 < array.size(); i3++) {
                        String string = array.getString(i3);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            a clone = arrayList.get(i4).clone();
                            a(clone, i3, string);
                            arrayList2.add(clone);
                        }
                    }
                    arrayList = arrayList2;
                }
                t.i = arrayList;
            } catch (Throwable th) {
                th = th;
                com.facebook.common.logging.a.b("Raphael", "[DomNode@fromDSL]  : " + readableMap + StringUtil.CRLF_STRING + hashMap, th);
                return t;
            }
        } catch (Throwable th2) {
            th = th2;
            t = null;
        }
        return t;
    }

    private static void a(a aVar, int i, String str) {
        Object[] objArr = {aVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74d86331bb5a8047413e8d75103a36ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74d86331bb5a8047413e8d75103a36ad");
            return;
        }
        aVar.d = com.meituan.android.mrn.component.list.common.b.a();
        if (b.matcher(aVar.j.toString()).find()) {
            HashMap<String, Object> hashMap = aVar.j.toHashMap();
            aVar.j = Arguments.makeNativeMap((HashMap) c.fromJson(c.toJson(hashMap).replaceAll("\\$\\$i\\$\\$", String.valueOf(i)).replaceAll("\\$\\$tagStr\\$\\$", str), (Class<Object>) hashMap.getClass()));
        }
        Iterator<a> it = aVar.i.iterator();
        while (it.hasNext()) {
            a next = it.next();
            next.g = aVar.d;
            next.h = aVar;
            a(next, i, str);
        }
    }

    private static ReadableMap a(ReadableMap readableMap, HashMap<String, Object> hashMap) {
        Object[] objArr = {readableMap, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6bfbdc466fb48dc34efd0473605db9a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReadableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6bfbdc466fb48dc34efd0473605db9a5");
        }
        HashMap<String, Object> hashMap2 = readableMap.toHashMap();
        String json = c.toJson(hashMap2);
        Matcher matcher = b.matcher(json);
        while (matcher.find()) {
            String group = matcher.group();
            try {
                Object a2 = a(group.replaceAll("\\$\\$", "").replaceAll(CommonConstant.Symbol.DOUBLE_QUOTES, "").split("\\."), 0, hashMap);
                if (a2 != null) {
                    json = json.replace(group, String.valueOf(a2));
                }
            } catch (Throwable th) {
                com.facebook.common.logging.a.d("[DomNode@handleDSL]", null, th);
            }
        }
        HashMap hashMap3 = (HashMap) c.fromJson(json, (Class<Object>) hashMap2.getClass());
        if (hashMap3.containsKey("text") && !(hashMap3.get("text") instanceof String)) {
            Object obj = hashMap3.get("text");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                int i = (int) doubleValue;
                if (doubleValue == i) {
                    obj = Integer.valueOf(i);
                }
            }
            hashMap3.put("text", String.valueOf(obj));
        }
        return Arguments.makeNativeMap(hashMap3);
    }

    private static Object a(String[] strArr, int i, HashMap<String, Object> hashMap) {
        while (true) {
            Object[] objArr = {strArr, Integer.valueOf(i), hashMap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efb73c88e51aadc923e66430c49baf9e", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efb73c88e51aadc923e66430c49baf9e");
            }
            String[] split = strArr[i].split("\\[|\\]");
            Object obj = hashMap.get(split[0]);
            if (split.length > 1 && (obj instanceof List)) {
                obj = ((List) obj).get(Integer.parseInt(split[1]));
            }
            i++;
            if (i < strArr.length) {
                hashMap = (HashMap) obj;
            } else if (obj instanceof String) {
                return CommonConstant.Symbol.DOUBLE_QUOTES + obj + CommonConstant.Symbol.DOUBLE_QUOTES;
            } else {
                return obj;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public a clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5971557059c000bfcc737ba1dc4d716", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5971557059c000bfcc737ba1dc4d716");
        }
        a aVar = new a();
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.j = this.j;
        ArrayList<a> arrayList = new ArrayList<>();
        Iterator<a> it = this.i.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().clone());
        }
        aVar.i = arrayList;
        return aVar;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f526a7ab09189cf51ee747062996f73", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f526a7ab09189cf51ee747062996f73");
        }
        return "{\"mReactTag\":" + this.d + ", \"mModuleName\":\"" + this.e + "\", \"mRootTag\":" + this.f + ", \"mEventId\":" + this.k + ", \"mParentTag\":" + this.g + ", \"mProps\":" + this.j.toString().replace("NativeMap: {", "").replaceAll("\\}\\s*\\}", CommonConstant.Symbol.BIG_BRACKET_RIGHT) + ", \"mChildren\":" + this.i + '}';
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3377564ea23451de1654424bfe4a9f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3377564ea23451de1654424bfe4a9f0")).booleanValue();
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.d == aVar.d && this.e.equals(aVar.e) && this.j.equals(aVar.j);
        }
        return false;
    }

    private static boolean a(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1255ace2d5cd81f6db76d7d5f1c9636a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1255ace2d5cd81f6db76d7d5f1c9636a")).booleanValue();
        }
        if (aVar == null || aVar.j == null || !aVar.j.hasKey(str)) {
            return false;
        }
        return MListExpressionManager.converseDynamicToBoolean(aVar.j.getDynamic(str));
    }
}
