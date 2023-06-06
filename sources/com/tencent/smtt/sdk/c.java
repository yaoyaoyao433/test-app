package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes6.dex */
public class c {
    private static c e = null;
    private static boolean g = false;
    private String a = "EmergenceMsgPublisher";
    private String b = "tbs_emergence";
    private String c = "emergence_executed_ids";
    private String d = "emergence_ids";
    private final Map<Integer, a> f = new ConcurrentHashMap();

    /* loaded from: classes6.dex */
    public interface a {
        void a(String str);
    }

    /* loaded from: classes6.dex */
    public static class b {
        public int a = -1;
        public int b = -1;
        public String c = "";
        public long d = -1;

        public String toString() {
            return "{seqId=" + this.a + ", code=" + this.b + ", extra='" + this.c + "', expired=" + this.d + '}';
        }
    }

    private c() {
    }

    public static c a() {
        if (e == null) {
            e = new c();
        }
        return e;
    }

    private synchronized void a(Context context, b bVar, a aVar) {
        String[] split;
        if (aVar != null) {
            a("Executed command: " + bVar.b + ", extra: " + bVar.c);
            aVar.a(bVar.c);
            SharedPreferences sharedPreferences = context.getSharedPreferences(this.b, 4);
            String string = sharedPreferences.getString(this.c, "");
            HashSet<Integer> hashSet = new HashSet();
            if (!TextUtils.isEmpty(string) && (split = string.split(CommonConstant.Symbol.COMMA)) != null && split.length > 0) {
                for (String str : split) {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str)));
                }
            }
            hashSet.add(Integer.valueOf(bVar.a));
            StringBuilder sb = new StringBuilder();
            for (Integer num : hashSet) {
                sb.append(num);
                sb.append(CommonConstant.Symbol.COMMA);
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(this.c, sb.toString());
            edit.commit();
        }
    }

    private void a(String str) {
    }

    public synchronized Map<Integer, b> a(Context context) {
        int parseInt;
        String[] split;
        HashMap hashMap = new HashMap();
        SharedPreferences sharedPreferences = context.getSharedPreferences(this.b, 0);
        if (context == null) {
            a("Unexpected null context!");
            return hashMap;
        }
        String string = sharedPreferences.getString(this.d, "");
        if (TextUtils.isEmpty(string)) {
            a("Empty local emergence ids!");
            return hashMap;
        }
        a("Local emergence ids: " + string);
        String[] split2 = string.split(";");
        if (split2 != null) {
            for (String str : split2) {
                if (!TextUtils.isEmpty(str) && (split = str.split(CommonConstant.Symbol.COMMA)) != null && split.length == 4) {
                    b bVar = new b();
                    try {
                        bVar.a = Integer.parseInt(split[0]);
                        bVar.b = Integer.parseInt(split[1]);
                        bVar.c = String.valueOf(split[2]);
                        bVar.d = Long.parseLong(split[3]);
                    } catch (Throwable unused) {
                    }
                    if (System.currentTimeMillis() < bVar.d) {
                        hashMap.put(Integer.valueOf(bVar.a), bVar);
                    }
                }
            }
        }
        String string2 = sharedPreferences.getString(this.c, "");
        a("Executed ids: " + string2);
        String[] split3 = string2.split(CommonConstant.Symbol.COMMA);
        if (split3 != null) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : split3) {
                if (!TextUtils.isEmpty(str2) && (parseInt = Integer.parseInt(str2)) > 0) {
                    arrayList.add(Integer.valueOf(parseInt));
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                hashMap.remove(arrayList.get(i));
            }
        }
        return hashMap;
    }

    public synchronized void a(Context context, Integer num, a aVar) {
        Map<Integer, b> a2 = a(context);
        for (Integer num2 : a2.keySet()) {
            b bVar = a2.get(num2);
            if (bVar == null) {
                a("Unexpected null command!");
            } else if (bVar.b == num.intValue()) {
                a(context, bVar, aVar);
                return;
            }
        }
        if (!g) {
            this.f.put(num, aVar);
            a("Emergence config did not arrived yet, code[" + num + "] has been suspended");
        }
    }

    public synchronized void b(Context context) {
        Map<Integer, b> a2 = a(context);
        a("On notify emergence, validate commands: " + a2);
        g = true;
        for (Integer num : this.f.keySet()) {
            for (Integer num2 : a2.keySet()) {
                if (a2.get(num2).b == num.intValue()) {
                    a(context, a2.get(num2), this.f.get(num));
                }
            }
        }
        if (!this.f.isEmpty()) {
            a("Emergency code[" + this.f.keySet() + "] did not happen, clear suspended queries");
            this.f.clear();
        }
    }
}
