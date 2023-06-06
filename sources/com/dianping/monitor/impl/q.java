package com.dianping.monitor.impl;

import com.meituan.android.common.badge.data.Data;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class q {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public HashMap<String, String> e;
    public HashMap<String, String> f;
    public String g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;

    public static String a(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1266b9810c935e9f118c147f10648bed", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1266b9810c935e9f118c147f10648bed");
        }
        StringBuilder sb = new StringBuilder();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("a", qVar.b);
            jSONObject.put("b", qVar.c);
            jSONObject.put(com.huawei.hms.opendevice.c.a, qVar.g);
            jSONObject.put("d", qVar.d);
            if (qVar.e != null) {
                jSONObject.put("e", a(qVar.e));
            }
            jSONObject.put("f", qVar.h);
            jSONObject.put(com.meituan.android.neohybrid.neo.bridge.presenter.g.n, qVar.j);
            jSONObject.put("h", qVar.i);
            jSONObject.put("i", qVar.k);
            if (qVar.f != null) {
                jSONObject.put("j", a(qVar.f));
            }
            jSONObject.put(Data.TB_DATA_COL_KEY, qVar.m);
            jSONObject.put("l", qVar.l);
            jSONObject.put("m", qVar.n);
            jSONObject.put("n", qVar.o);
            jSONObject.put("o", qVar.p);
            jSONObject.put("p", qVar.q);
            jSONObject.put("q", qVar.r);
            jSONObject.put(com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o, qVar.s);
            sb.append(jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    private static JSONObject a(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a48ec10fff180b3e88cdab2651a3987d", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a48ec10fff180b3e88cdab2651a3987d");
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    try {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return jSONObject;
    }
}
