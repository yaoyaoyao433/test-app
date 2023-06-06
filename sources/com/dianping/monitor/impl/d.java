package com.dianping.monitor.impl;

import android.text.TextUtils;
import com.dianping.monitor.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.URLEncoder;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public long b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j;
    public int k;
    public String l;
    public int m;
    public boolean n;
    public boolean o;
    public String p;
    public g q;
    public q r;
    public int s;
    public String t;
    public int u;
    public long v;
    public long w;
    public int x;
    public boolean y;
    public d.a z;

    public static String a(d dVar) {
        long j;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd867be41e54fce622baff5de329f8bc", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd867be41e54fce622baff5de329f8bc");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.b);
        sb.append('\t');
        sb.append(dVar.d);
        sb.append('\t');
        sb.append(dVar.k);
        sb.append('\t');
        sb.append(dVar.e);
        sb.append('\t');
        try {
            sb.append(URLEncoder.encode(dVar.c, "utf-8"));
        } catch (Exception e) {
            e.printStackTrace();
            sb.append(dVar.c);
        }
        sb.append('\t');
        sb.append(dVar.f);
        if (dVar.s >= 6) {
            sb.append('\t');
            sb.append(dVar.u);
        }
        sb.append('\t');
        sb.append("1");
        sb.append('\t');
        sb.append(dVar.g);
        sb.append('\t');
        sb.append(dVar.h);
        sb.append('\t');
        sb.append(dVar.i);
        sb.append('\t');
        sb.append(dVar.j == null ? "" : dVar.j);
        if (dVar.s >= 4) {
            sb.append('\t');
            sb.append(dVar.p == null ? "" : dVar.p);
        }
        if (dVar.s >= 4) {
            sb.append('\t');
            sb.append(dVar.l == null ? "" : dVar.l);
        }
        if (dVar.s >= 6) {
            sb.append('\t');
            sb.append(dVar.t == null ? "" : dVar.t);
        }
        if (dVar.s >= 7) {
            sb.append('\t');
            sb.append(dVar.x);
        }
        if (dVar.s >= 8) {
            d.a aVar = dVar.z;
            if (aVar != null) {
                sb.append('\t');
                sb.append(aVar.a);
                sb.append('\t');
                sb.append(aVar.b);
                sb.append('\t');
                sb.append(aVar.c);
                sb.append('\t');
                sb.append('\t');
            } else {
                sb.append("\t\t\t\t\t");
            }
        }
        if (dVar.s >= 9) {
            if (dVar.r != null && dVar.r.f != null) {
                String str = dVar.r.f.get("Raptor-Api-Time");
                if (!TextUtils.isEmpty(str)) {
                    try {
                        j = Math.round(Float.parseFloat(str) * 1000.0f);
                    } catch (Exception unused) {
                        j = 0;
                    }
                    sb.append('\t');
                    sb.append(j);
                } else {
                    sb.append('\t');
                }
            } else {
                sb.append('\t');
            }
        }
        if (dVar.s >= 10) {
            d.a aVar2 = dVar.z;
            if (aVar2 != null && aVar2.d > 0) {
                sb.append('\t');
                sb.append(aVar2.d);
            } else {
                sb.append("\t");
            }
        }
        return sb.toString();
    }
}
