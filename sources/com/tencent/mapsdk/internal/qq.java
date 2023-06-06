package com.tencent.mapsdk.internal;

import android.content.Context;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qq {
    public static final int a = 1000;
    public static final int b = 11;
    private static final String f = "[{\"id\":0,\"index\":0,\"order\":1},{\"id\":-1,\"index\":1,\"order\":-1},{\"id\":-1,\"index\":2,\"order\":-1},{\"id\":-1,\"index\":3,\"order\":-1},{\"id\":-1,\"index\":4,\"order\":-1},{\"id\":-1,\"index\":5,\"order\":-1},{\"id\":-1,\"index\":6,\"order\":-1},{\"id\":-1,\"index\":7,\"order\":-1},{\"id\":16,\"index\":8,\"order\":-1},{\"id\":9,\"index\":9,\"order\":-1},{\"id\":10,\"index\":10,\"order\":-1},{\"id\":5,\"index\":11,\"order\":-1},{\"id\":4,\"index\":12,\"order\":-1},{\"id\":6,\"index\":13,\"order\":-1},{\"id\":7,\"index\":14,\"order\":-1},{\"id\":8,\"index\":15,\"order\":-1}]";
    public volatile List<qp> c;
    public me d;
    public int e = -1;

    public qq(Context context, String str) {
        if (str == null) {
            this.d = mh.a(context);
        } else {
            this.d = mg.a(context, str);
        }
        this.c = new CopyOnWriteArrayList();
        String a2 = this.d.a(ej.A);
        try {
            this.c.addAll(a(new JSONArray(a2 == null ? f : a2)));
        } catch (Exception unused) {
        }
    }

    private void b() {
        this.c = new CopyOnWriteArrayList();
        String a2 = this.d.a(ej.A);
        if (a2 == null) {
            a2 = f;
        }
        try {
            this.c.addAll(a(new JSONArray(a2)));
        } catch (Exception unused) {
        }
    }

    private void b(JSONArray jSONArray) {
        List<qp> a2;
        String a3 = this.d.a(ej.A);
        if (jSONArray == null || (a2 = a(jSONArray)) == null) {
            return;
        }
        this.c.clear();
        this.c.addAll(a2);
        if (jSONArray.toString().equals(a3)) {
            return;
        }
        this.d.a();
        this.d.a(ej.A, jSONArray.toString());
    }

    public static List<qp> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new qp(jSONObject.getInt("index"), jSONObject.getInt("id"), jSONObject.getInt("order")));
            } catch (Exception unused) {
                return null;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final String a() {
        if (this.c == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(128);
        for (qp qpVar : this.c) {
            if (qpVar.b != -1) {
                if (sb.length() == 0) {
                    sb.append(qpVar.b);
                } else {
                    sb.append(CommonConstant.Symbol.COMMA);
                    sb.append(qpVar.b);
                }
            } else if (sb.length() == 0) {
                sb.append(0);
            } else {
                sb.append(CommonConstant.Symbol.COMMA);
            }
        }
        return sb.toString();
    }

    public final qp a(int i) {
        int i2;
        if (this.c == null || this.c.size() == 0 || i < 0 || i - 1000 >= this.c.size()) {
            return null;
        }
        this.e = i;
        if (i >= 1000) {
            return this.c.get(i2);
        }
        if (i > 8 && i < 989) {
            int i3 = i + 11;
            if (i3 >= this.c.size()) {
                return null;
            }
            return this.c.get(i3);
        }
        for (qp qpVar : this.c) {
            if (qpVar.c == i) {
                return qpVar;
            }
        }
        return this.c.get(0);
    }

    public final int b(int i) {
        if (this.c == null || this.c.size() == 0 || i < 0) {
            return i;
        }
        if ((i < 8 || i > 19) && this.e < 1000) {
            if (i <= 19 || i >= 1000) {
                for (qp qpVar : this.c) {
                    if (i == qpVar.a) {
                        if (i == 0 && qpVar.b == 0 && this.e <= 0) {
                            return 1000;
                        }
                        return qpVar.c;
                    }
                }
                return i;
            }
            return i - 11;
        }
        return i + 1000;
    }

    private void a(mn mnVar) {
        qp a2;
        if (mnVar == null || (a2 = a(this.e)) == null) {
            return;
        }
        mnVar.i.b(a2.a);
    }
}
