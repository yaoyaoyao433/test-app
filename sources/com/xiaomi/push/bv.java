package com.xiaomi.push;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class bv {
    String a;
    final ArrayList<bu> b = new ArrayList<>();

    public bv() {
    }

    public bv(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.a = str;
    }

    public final synchronized bv a(JSONObject jSONObject) {
        this.a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.b.add(new bu(this.a).a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    public final synchronized JSONObject b() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("host", this.a);
        JSONArray jSONArray = new JSONArray();
        Iterator<bu> it = this.b.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().d());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("\n");
        Iterator<bu> it = this.b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }

    public final synchronized void a(bu buVar) {
        int i = 0;
        while (true) {
            if (i >= this.b.size()) {
                break;
            } else if (TextUtils.equals(this.b.get(i).a, buVar.a)) {
                this.b.set(i, buVar);
                break;
            } else {
                i++;
            }
        }
        if (i >= this.b.size()) {
            this.b.add(buVar);
        }
    }

    public final synchronized bu a() {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            bu buVar = this.b.get(size);
            if (TextUtils.equals(buVar.a, by.b())) {
                by.a().e = buVar.c();
                return buVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x001c, B:8:0x001e, B:10:0x002b, B:12:0x0035, B:18:0x0045), top: B:25:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(boolean r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.ArrayList<com.xiaomi.push.bu> r10 = r9.b     // Catch: java.lang.Throwable -> L4f
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L4f
            r0 = 1
            int r10 = r10 - r0
        L9:
            if (r10 < 0) goto L4d
            java.util.ArrayList<com.xiaomi.push.bu> r1 = r9.b     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r1 = r1.get(r10)     // Catch: java.lang.Throwable -> L4f
            com.xiaomi.push.bu r1 = (com.xiaomi.push.bu) r1     // Catch: java.lang.Throwable -> L4f
            long r2 = r1.l     // Catch: java.lang.Throwable -> L4f
            r4 = 864000000(0x337f9800, double:4.26872718E-315)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L1e
            long r4 = r1.l     // Catch: java.lang.Throwable -> L4f
        L1e:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4f
            long r6 = r1.b     // Catch: java.lang.Throwable -> L4f
            r8 = 0
            long r6 = r2 - r6
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L42
            long r4 = r1.b     // Catch: java.lang.Throwable -> L4f
            r6 = 0
            long r2 = r2 - r4
            long r4 = r1.l     // Catch: java.lang.Throwable -> L4f
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L40
            java.lang.String r1 = r1.a     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "WIFI-"
            boolean r1 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L40
            goto L42
        L40:
            r1 = 0
            goto L43
        L42:
            r1 = 1
        L43:
            if (r1 == 0) goto L4a
            java.util.ArrayList<com.xiaomi.push.bu> r1 = r9.b     // Catch: java.lang.Throwable -> L4f
            r1.remove(r10)     // Catch: java.lang.Throwable -> L4f
        L4a:
            int r10 = r10 + (-1)
            goto L9
        L4d:
            monitor-exit(r9)
            return
        L4f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.bv.a(boolean):void");
    }
}
