package com.xiaomi.push;

import android.os.Bundle;
import com.meituan.robust.common.CommonConstant;
/* loaded from: classes6.dex */
public final class gh extends gf {
    String a;
    a b;
    private b c;
    private int d;

    /* loaded from: classes6.dex */
    public enum a {
        chat,
        available,
        away,
        xa,
        dnd
    }

    /* loaded from: classes6.dex */
    public enum b {
        available,
        unavailable,
        subscribe,
        subscribed,
        unsubscribe,
        unsubscribed,
        error,
        probe
    }

    public gh(Bundle bundle) {
        super(bundle);
        this.c = b.available;
        this.a = null;
        this.d = Integer.MIN_VALUE;
        this.b = null;
        if (bundle.containsKey("ext_pres_type")) {
            this.c = b.valueOf(bundle.getString("ext_pres_type"));
        }
        if (bundle.containsKey("ext_pres_status")) {
            this.a = bundle.getString("ext_pres_status");
        }
        if (bundle.containsKey("ext_pres_prio")) {
            this.d = bundle.getInt("ext_pres_prio");
        }
        if (bundle.containsKey("ext_pres_mode")) {
            this.b = a.valueOf(bundle.getString("ext_pres_mode"));
        }
    }

    @Override // com.xiaomi.push.gf
    public final Bundle a() {
        Bundle a2 = super.a();
        if (this.c != null) {
            a2.putString("ext_pres_type", this.c.toString());
        }
        if (this.a != null) {
            a2.putString("ext_pres_status", this.a);
        }
        if (this.d != Integer.MIN_VALUE) {
            a2.putInt("ext_pres_prio", this.d);
        }
        if (this.b != null && this.b != a.available) {
            a2.putString("ext_pres_mode", this.b.toString());
        }
        return a2;
    }

    public final void a(int i) {
        if (i >= -128 && i <= 128) {
            this.d = i;
            return;
        }
        throw new IllegalArgumentException("Priority value " + i + " is not valid. Valid range is -128 through 128.");
    }

    public gh(b bVar) {
        this.c = b.available;
        this.a = null;
        this.d = Integer.MIN_VALUE;
        this.b = null;
        if (bVar == null) {
            throw new NullPointerException("Type cannot be null");
        }
        this.c = bVar;
    }

    @Override // com.xiaomi.push.gf
    public final String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("<presence");
        if (this.p != null) {
            sb.append(" xmlns=\"");
            sb.append(this.p);
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        if (d() != null) {
            sb.append(" id=\"");
            sb.append(d());
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        if (this.r != null) {
            sb.append(" to=\"");
            sb.append(gq.a(this.r));
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        if (this.s != null) {
            sb.append(" from=\"");
            sb.append(gq.a(this.s));
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        if (this.t != null) {
            sb.append(" chid=\"");
            sb.append(gq.a(this.t));
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        if (this.c != null) {
            sb.append(" type=\"");
            sb.append(this.c);
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        sb.append(">");
        if (this.a != null) {
            sb.append("<status>");
            sb.append(gq.a(this.a));
            sb.append("</status>");
        }
        if (this.d != Integer.MIN_VALUE) {
            sb.append("<priority>");
            sb.append(this.d);
            sb.append("</priority>");
        }
        if (this.b != null && this.b != a.available) {
            sb.append("<show>");
            sb.append(this.b);
            sb.append("</show>");
        }
        sb.append(e());
        gj gjVar = this.v;
        if (gjVar != null) {
            sb.append(gjVar.b());
        }
        sb.append("</presence>");
        return sb.toString();
    }
}
