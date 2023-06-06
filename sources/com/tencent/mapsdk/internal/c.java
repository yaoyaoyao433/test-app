package com.tencent.mapsdk.internal;

import com.meituan.robust.Constants;
import com.meituan.robust.common.CommonConstant;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c {
    protected HashMap<String, HashMap<String, byte[]>> a = new HashMap<>();
    protected HashMap<String, Object> b = new HashMap<>();
    private HashMap<String, Object> e = new HashMap<>();
    protected String c = CommonConstant.Encoding.GBK;
    m d = new m();

    public String a() {
        return this.c;
    }

    public void a(String str) {
        this.c = str;
    }

    public void b() {
        this.e.clear();
    }

    public Set<String> c() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    public boolean d() {
        return this.a.isEmpty();
    }

    public int e() {
        return this.a.size();
    }

    public boolean b(String str) {
        return this.a.containsKey(str);
    }

    public <T> void a(String str, T t) {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (t instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        n nVar = new n();
        nVar.a(this.c);
        nVar.a(t, 0);
        byte[] a = q.a(nVar.a);
        HashMap<String, byte[]> hashMap = new HashMap<>(1);
        ArrayList<String> arrayList = new ArrayList<>(1);
        a(arrayList, t);
        hashMap.put(a.a(arrayList), a);
        this.e.remove(str);
        this.a.put(str, hashMap);
    }

    public <T> T a(String str, boolean z, ClassLoader classLoader) throws b {
        String str2 = null;
        if (this.a.containsKey(str)) {
            if (this.e.containsKey(str)) {
                return (T) this.e.get(str);
            }
            byte[] bArr = new byte[0];
            Iterator<Map.Entry<String, byte[]>> it = this.a.get(str).entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<String, byte[]> next = it.next();
                str2 = next.getKey();
                bArr = next.getValue();
            }
            try {
                Object d = d(str2, z, classLoader);
                this.d.a(bArr);
                this.d.a(this.c);
                T t = (T) this.d.a((p) d);
                b(str, t);
                return t;
            } catch (Exception e) {
                e.printStackTrace();
                throw new b(e);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T b(String str, boolean z, ClassLoader classLoader) throws b {
        String str2 = null;
        if (this.a.containsKey(str)) {
            if (this.e.containsKey(str)) {
                return (T) this.e.get(str);
            }
            byte[] bArr = new byte[0];
            Iterator<Map.Entry<String, byte[]>> it = this.a.get(str).entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<String, byte[]> next = it.next();
                str2 = next.getKey();
                bArr = next.getValue();
            }
            try {
                Object d = d(str2, z, classLoader);
                this.d.a(bArr);
                this.d.a(this.c);
                T t = (T) this.d.a((m) d, 0, true);
                b(str, t);
                return t;
            } catch (Exception e) {
                e.printStackTrace();
                throw new b(e);
            }
        }
        return null;
    }

    private Object d(String str, boolean z, ClassLoader classLoader) {
        String a = o.a(str);
        if (a != null && !"".equals(a)) {
            str = a;
        }
        if (this.b.containsKey(str)) {
            return this.b.get(str);
        }
        Object a2 = a.a(str, z, classLoader);
        this.b.put(str, a2);
        return a2;
    }

    private void b(String str, Object obj) {
        this.e.put(str, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T a(String str, Object obj, boolean z, ClassLoader classLoader) {
        if (this.a.containsKey(str)) {
            if (this.e.containsKey(str)) {
                return (T) this.e.get(str);
            }
            String str2 = "";
            byte[] bArr = new byte[0];
            Iterator<Map.Entry<String, byte[]>> it = this.a.get(str).entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<String, byte[]> next = it.next();
                str2 = next.getKey();
                bArr = next.getValue();
            }
            try {
                Object d = d(str2, z, classLoader);
                this.d.a(bArr);
                this.d.a(this.c);
                T t = (T) this.d.a((m) d, 0, true);
                b(str, t);
                return t;
            } catch (Exception e) {
                e.printStackTrace();
                b(str, obj);
                return obj;
            }
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T c(String str, boolean z, ClassLoader classLoader) throws b {
        if (this.a.containsKey(str)) {
            String str2 = "";
            byte[] bArr = new byte[0];
            Iterator<Map.Entry<String, byte[]>> it = this.a.remove(str).entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<String, byte[]> next = it.next();
                str2 = next.getKey();
                bArr = next.getValue();
            }
            try {
                Object a = a.a(str2, z, classLoader);
                this.d.a(bArr);
                this.d.a(this.c);
                return (T) this.d.a((m) a, 0, true);
            } catch (Exception e) {
                e.printStackTrace();
                throw new b(e);
            }
        }
        return null;
    }

    private void a(ArrayList<String> arrayList, Object obj) {
        while (true) {
            if (obj.getClass().isArray()) {
                if (!obj.getClass().getComponentType().toString().equals(Constants.BYTE)) {
                    throw new IllegalArgumentException("only byte[] is supported");
                }
                if (Array.getLength(obj) > 0) {
                    arrayList.add("java.util.List");
                    obj = Array.get(obj, 0);
                } else {
                    arrayList.add("Array");
                    arrayList.add(CommonConstant.Symbol.QUESTION_MARK);
                    return;
                }
            } else if (obj instanceof Array) {
                throw new IllegalArgumentException("can not support Array, please use List");
            } else {
                if (obj instanceof List) {
                    arrayList.add("java.util.List");
                    List list = (List) obj;
                    if (list.size() > 0) {
                        obj = list.get(0);
                    } else {
                        arrayList.add(CommonConstant.Symbol.QUESTION_MARK);
                        return;
                    }
                } else if (obj instanceof Map) {
                    arrayList.add("java.util.Map");
                    Map map = (Map) obj;
                    if (map.size() > 0) {
                        Object obj2 = map.get(map.keySet().iterator().next());
                        arrayList.add(a((c) obj));
                        obj = obj2;
                    } else {
                        arrayList.add(CommonConstant.Symbol.QUESTION_MARK);
                        arrayList.add(CommonConstant.Symbol.QUESTION_MARK);
                        return;
                    }
                } else {
                    arrayList.add(a((c) obj));
                    return;
                }
            }
        }
    }

    public <T> String a(T t) {
        String className = t instanceof p ? ((p) t).className() : "";
        return "".equals(className) ? t.getClass().getName() : className;
    }

    public byte[] f() {
        n nVar = new n(0);
        nVar.a(this.c);
        nVar.a((Map) this.a, 0);
        return q.a(nVar.a);
    }

    public void a(byte[] bArr) {
        this.d.a(bArr);
        this.d.a(this.c);
        HashMap hashMap = new HashMap(1);
        HashMap hashMap2 = new HashMap(1);
        hashMap2.put("", new byte[0]);
        hashMap.put("", hashMap2);
        this.a = this.d.a((Map) hashMap, 0, false);
    }
}
