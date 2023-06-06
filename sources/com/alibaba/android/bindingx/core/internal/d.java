package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.alibaba.android.bindingx.core.a;
import com.alibaba.android.bindingx.core.internal.n;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.common.CommonConstant;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends com.alibaba.android.bindingx.core.internal.a implements n.a {
    private u A;
    private a B;
    private boolean m;
    private double n;
    private double o;
    private double p;
    private double q;
    private double r;
    private double s;
    private n t;
    private o u;
    private o v;
    private o w;
    private String x;
    private LinkedList<Double> y;
    private u z;

    @Override // com.alibaba.android.bindingx.core.c
    public final void b(@NonNull String str, @NonNull String str2) {
    }

    public d(Context context, com.alibaba.android.bindingx.core.e eVar, Object... objArr) {
        super(context, eVar, objArr);
        this.m = false;
        this.y = new LinkedList<>();
        this.z = new u(0.0d, 0.0d, 1.0d);
        this.A = new u(0.0d, 1.0d, 1.0d);
        this.B = new a(0.0d, 0.0d, 0.0d);
        if (context != null) {
            this.t = n.a(context);
        }
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final boolean a(@NonNull String str, @NonNull String str2) {
        if (this.t == null) {
            return false;
        }
        n nVar = this.t;
        if (nVar.b != null && !nVar.b.contains(this)) {
            nVar.b.add(this);
        }
        return this.t.a(1);
    }

    @Override // com.alibaba.android.bindingx.core.internal.a, com.alibaba.android.bindingx.core.c
    public final void a(@NonNull String str, @Nullable Map<String, Object> map, @Nullable j jVar, @NonNull List<Map<String, Object>> list, @Nullable a.InterfaceC0017a interfaceC0017a) {
        String str2;
        super.a(str, map, jVar, list, interfaceC0017a);
        if (map != null) {
            String str3 = (String) map.get("sceneType");
            str2 = TextUtils.isEmpty(str3) ? "2d" : str3.toLowerCase();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2) || (!"2d".equals(str2) && !"3d".equals(str2))) {
            str2 = "2d";
        }
        this.x = str2;
        com.alibaba.android.bindingx.core.d.a("[ExpressionOrientationHandler] sceneType is " + str2);
        if ("2d".equals(str2)) {
            this.u = new o(null, Double.valueOf(90.0d), null);
            this.v = new o(Double.valueOf(0.0d), null, Double.valueOf(90.0d));
        } else if ("3d".equals(str2)) {
            this.w = new o(null, null, null);
        }
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final boolean c(@NonNull String str, @NonNull String str2) {
        e();
        if (this.t == null) {
            return false;
        }
        a("end", this.q, this.r, this.s);
        return this.t.a(this);
    }

    @Override // com.alibaba.android.bindingx.core.internal.a, com.alibaba.android.bindingx.core.c
    public final void a() {
        super.a();
        if (this.t != null) {
            this.t.a(this);
            this.t.a();
        }
        if (this.a != null) {
            this.a.clear();
            this.a = null;
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.n.a
    public final void a(double d, double d2, double d3) {
        double d4;
        double d5;
        char c;
        double d6;
        boolean z;
        double d7;
        boolean z2;
        double round = Math.round(d);
        double round2 = Math.round(d2);
        double round3 = Math.round(d3);
        if (round == this.q && round2 == this.r && round3 == this.s) {
            return;
        }
        if (this.m) {
            d4 = round3;
        } else {
            this.m = true;
            a("start", round, round2, round3);
            this.n = round;
            this.o = round2;
            d4 = round3;
            this.p = d4;
        }
        if (!"2d".equals(this.x)) {
            d5 = round2;
            c = 1;
            if ("3d".equals(this.x)) {
                if (this.w != null) {
                    this.y.add(Double.valueOf(round));
                    if (this.y.size() > 5) {
                        this.y.removeFirst();
                    }
                    a(this.y, 360);
                    d6 = round;
                    p a2 = this.w.a(round, d5, d4, (this.y.get(this.y.size() - 1).doubleValue() - this.n) % 360.0d);
                    if (!Double.isNaN(a2.a) && !Double.isNaN(a2.b) && !Double.isNaN(a2.c) && !Double.isInfinite(a2.a) && !Double.isInfinite(a2.b) && !Double.isInfinite(a2.c)) {
                        this.B.a = a2.a;
                        this.B.b = a2.b;
                        this.B.c = a2.c;
                    }
                } else {
                    d6 = round;
                }
                z = true;
            } else {
                d6 = round;
            }
            z = false;
        } else {
            if (this.u == null || this.v == null) {
                d5 = round2;
                d7 = round;
                c = 1;
            } else {
                this.y.add(Double.valueOf(round));
                if (this.y.size() > 5) {
                    this.y.removeFirst();
                }
                a(this.y, 360);
                double doubleValue = (this.y.get(this.y.size() - 1).doubleValue() - this.n) % 360.0d;
                d5 = round2;
                d7 = round;
                c = 1;
                p a3 = this.u.a(round, d5, d4, doubleValue);
                p a4 = this.v.a(d7, d5, d4, doubleValue);
                this.z.a(0.0d, 0.0d, 1.0d);
                this.z.a(a3);
                this.A.a(0.0d, 1.0d, 1.0d);
                this.A.a(a4);
                double degrees = Math.toDegrees(Math.acos(this.z.a)) - 90.0d;
                double degrees2 = Math.toDegrees(Math.acos(this.A.b)) - 90.0d;
                if (Double.isNaN(degrees) || Double.isNaN(degrees2) || Double.isInfinite(degrees) || Double.isInfinite(degrees2)) {
                    z2 = false;
                    double d8 = d7;
                    z = z2;
                    d6 = d8;
                } else {
                    this.B.a = Math.round(degrees);
                    this.B.b = Math.round(degrees2);
                }
            }
            z2 = true;
            double d82 = d7;
            z = z2;
            d6 = d82;
        }
        if (z) {
            double d9 = this.B.a;
            double d10 = this.B.b;
            double d11 = this.B.c;
            this.q = d6;
            this.r = d5;
            this.s = d4;
            try {
                if (com.alibaba.android.bindingx.core.d.a) {
                    Locale locale = Locale.getDefault();
                    Object[] objArr = new Object[6];
                    objArr[0] = Double.valueOf(d6);
                    objArr[c] = Double.valueOf(d5);
                    objArr[2] = Double.valueOf(d4);
                    objArr[3] = Double.valueOf(d9);
                    objArr[4] = Double.valueOf(d10);
                    objArr[5] = Double.valueOf(d11);
                    com.alibaba.android.bindingx.core.d.a(String.format(locale, "[OrientationHandler] orientation changed. (alpha:%f,beta:%f,gamma:%f,x:%f,y:%f,z:%f)", objArr));
                }
                l.a(this.c, d6, d5, d4, this.n, this.o, this.p, d9, d10, d11);
                if (a(this.k, this.c)) {
                    return;
                }
                a(this.a, this.c, DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION);
            } catch (Exception e) {
                com.alibaba.android.bindingx.core.d.a("runtime error", e);
            }
        }
    }

    private static void a(List<Double> list, int i) {
        int size = list.size();
        if (size > 1) {
            for (int i2 = 1; i2 < size; i2++) {
                int i3 = i2 - 1;
                if (list.get(i3) != null && list.get(i2) != null) {
                    if (list.get(i2).doubleValue() - list.get(i3).doubleValue() < -180.0d) {
                        list.set(i2, Double.valueOf(list.get(i2).doubleValue() + ((Math.floor(list.get(i3).doubleValue() / 360.0d) + 1.0d) * 360.0d)));
                    }
                    if (list.get(i2).doubleValue() - list.get(i3).doubleValue() > 180.0d) {
                        list.set(i2, Double.valueOf(list.get(i2).doubleValue() - 360.0d));
                    }
                }
            }
        }
    }

    @Override // com.alibaba.android.bindingx.core.internal.a
    protected final void a(@NonNull Map<String, Object> map) {
        a("exit", ((Double) map.get("alpha")).doubleValue(), ((Double) map.get("beta")).doubleValue(), ((Double) map.get("gamma")).doubleValue());
    }

    private void a(String str, double d, double d2, double d3) {
        if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            hashMap.put("alpha", Double.valueOf(d));
            hashMap.put("beta", Double.valueOf(d2));
            hashMap.put("gamma", Double.valueOf(d3));
            hashMap.put("source", this.f);
            this.b.a(hashMap);
            com.alibaba.android.bindingx.core.d.a(">>>>>>>>>>>fire event:(" + str + CommonConstant.Symbol.COMMA + d + CommonConstant.Symbol.COMMA + d2 + CommonConstant.Symbol.COMMA + d3 + CommonConstant.Symbol.BRACKET_RIGHT);
        }
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final void b() {
        if (this.t != null) {
            this.t.a();
        }
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final void c() {
        if (this.t != null) {
            this.t.a(1);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        double a;
        double b;
        double c;

        a() {
        }

        a(double d, double d2, double d3) {
            this.a = 0.0d;
            this.b = 0.0d;
            this.c = 0.0d;
        }
    }
}
