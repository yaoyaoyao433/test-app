package com.dianping.gcmrnmodule.components.textview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.dianping.richtext.e;
import com.dianping.richtext.f;
import com.dianping.richtext.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    protected static Typeface G;
    public static HashMap<Integer, Integer> H = new HashMap<>();
    public static HashMap<Integer, Integer> I = new HashMap<>();
    public static HashMap<Integer, C0061a> J = new HashMap<>();
    public static HashMap<Integer, Integer> K = new HashMap<>();
    public static HashMap<Integer, Typeface> L = new HashMap<>();
    public static ChangeQuickRedirect a;
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public String b;
    public SpannableStringBuilder c;
    public float d;
    public String e;
    public int f;
    public int g;
    public String h;
    public Typeface i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public float o;
    public boolean p;
    public boolean q;
    public String r;
    public float s;
    public float t;
    public float u;
    public boolean v;
    public boolean w;
    public float x;
    public float y;
    public C0061a z;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cddf3f8f22a743dd09b0326dfeb6869e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cddf3f8f22a743dd09b0326dfeb6869e");
            return;
        }
        this.b = "";
        this.d = 14.0f;
        this.e = "";
        this.h = "";
        this.l = 4;
        this.r = "";
    }

    static {
        H.put(0, 3);
        H.put(1, 1);
        H.put(2, 5);
        I.put(0, 16);
        I.put(1, 48);
        I.put(2, 80);
        J.put(0, new C0061a(1));
        J.put(1, new C0061a(1));
        J.put(3, new C0061a(TextUtils.TruncateAt.START));
        J.put(4, new C0061a(TextUtils.TruncateAt.END));
        J.put(5, new C0061a(TextUtils.TruncateAt.MIDDLE));
        K.put(0, 0);
        K.put(1, 1);
        K.put(2, 2);
        K.put(3, 3);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.gcmrnmodule.components.textview.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0061a {
        public final TextUtils.TruncateAt a;
        public final int b;

        public C0061a(TextUtils.TruncateAt truncateAt) {
            this.a = truncateAt;
            this.b = -1;
        }

        public C0061a(int i) {
            this.b = 1;
            this.a = null;
        }
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6c5984f9df4aef03c764dbd15f7e219", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6c5984f9df4aef03c764dbd15f7e219");
            return;
        }
        this.f = c.a(this.e) ? Color.parseColor(this.e) : -16777216;
        this.k = I.containsKey(Integer.valueOf(this.k)) ? I.get(Integer.valueOf(this.k)).intValue() : 16;
        this.j = H.containsKey(Integer.valueOf(this.j)) ? H.get(Integer.valueOf(this.j)).intValue() : 3;
        this.z = J.containsKey(Integer.valueOf(this.l)) ? J.get(Integer.valueOf(this.l)) : new C0061a(TextUtils.TruncateAt.END);
        this.o = c.a(context, this.o);
        this.g = Color.parseColor(c.a(this.r) ? this.r : "#55000000");
        this.s = c.a(context, this.s);
        this.t = c.a(context, this.t);
        this.u = c.a(context, this.u);
        if (this.u == 0.0f && (this.s != 0.0f || this.t != 0.0f)) {
            this.u = 1.0f;
        }
        this.m = this.m > 0 ? this.m : Integer.MAX_VALUE;
        j jVar = new j();
        jVar.b = this.b;
        jVar.c = this.h;
        jVar.d = this.d;
        jVar.e = this.n;
        jVar.f = this.x;
        jVar.g = this.m;
        jVar.h = this.i;
        jVar.i = this.o;
        jVar.j = this.z.a;
        jVar.m = this.v;
        e a2 = f.a(context, jVar);
        this.o = a2.a == null ? this.o : a2.a.floatValue();
        this.B = a2.b == null ? this.B : a2.b.intValue();
        this.C = a2.c == null ? this.C : a2.c.intValue();
        this.D = a2.d == null ? this.D : a2.d.intValue();
        this.E = a2.e == null ? this.E : a2.e.intValue();
        this.F = a2.f == null ? this.F : a2.f.intValue();
        this.d = a2.g == null ? this.d : a2.g.floatValue();
        this.n = a2.h == null ? this.n : a2.h.intValue();
        this.j = (a2.i == null ? this.j : a2.i.intValue()) | this.k;
        this.c = a2.l;
        this.A = a2.m;
        if (G == null) {
            TextView textView = new TextView(context);
            textView.getPaint().setTypeface(Typeface.DEFAULT);
            G = textView.getTypeface();
            for (Map.Entry<Integer, Integer> entry : K.entrySet()) {
                L.put(entry.getKey(), Typeface.create(G, entry.getValue().intValue()));
            }
        }
        Typeface typeface = L.get(Integer.valueOf(this.n));
        if (typeface == null) {
            typeface = G;
        }
        this.i = typeface;
    }
}
