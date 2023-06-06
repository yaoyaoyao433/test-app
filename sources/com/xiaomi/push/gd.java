package com.xiaomi.push;

import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
/* loaded from: classes6.dex */
public final class gd extends gf {
    public String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    boolean g;
    String h;
    String i;
    String j;
    String k;
    String l;
    boolean m;

    public gd() {
        this.a = null;
        this.b = null;
        this.g = false;
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = false;
    }

    public gd(Bundle bundle) {
        super(bundle);
        this.a = null;
        this.b = null;
        this.g = false;
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = false;
        this.a = bundle.getString("ext_msg_type");
        this.c = bundle.getString("ext_msg_lang");
        this.b = bundle.getString("ext_msg_thread");
        this.d = bundle.getString("ext_msg_sub");
        this.e = bundle.getString("ext_msg_body");
        this.f = bundle.getString("ext_body_encode");
        this.h = bundle.getString("ext_msg_appid");
        this.g = bundle.getBoolean("ext_msg_trans", false);
        this.m = bundle.getBoolean("ext_msg_encrypt", false);
        this.i = bundle.getString("ext_msg_seq");
        this.j = bundle.getString("ext_msg_mseq");
        this.k = bundle.getString("ext_msg_fseq");
        this.l = bundle.getString("ext_msg_status");
    }

    @Override // com.xiaomi.push.gf
    public final Bundle a() {
        Bundle a = super.a();
        if (!TextUtils.isEmpty(this.a)) {
            a.putString("ext_msg_type", this.a);
        }
        if (this.c != null) {
            a.putString("ext_msg_lang", this.c);
        }
        if (this.d != null) {
            a.putString("ext_msg_sub", this.d);
        }
        if (this.e != null) {
            a.putString("ext_msg_body", this.e);
        }
        if (!TextUtils.isEmpty(this.f)) {
            a.putString("ext_body_encode", this.f);
        }
        if (this.b != null) {
            a.putString("ext_msg_thread", this.b);
        }
        if (this.h != null) {
            a.putString("ext_msg_appid", this.h);
        }
        if (this.g) {
            a.putBoolean("ext_msg_trans", true);
        }
        if (!TextUtils.isEmpty(this.i)) {
            a.putString("ext_msg_seq", this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            a.putString("ext_msg_mseq", this.j);
        }
        if (!TextUtils.isEmpty(this.k)) {
            a.putString("ext_msg_fseq", this.k);
        }
        if (this.m) {
            a.putBoolean("ext_msg_encrypt", true);
        }
        if (!TextUtils.isEmpty(this.l)) {
            a.putString("ext_msg_status", this.l);
        }
        return a;
    }

    @Override // com.xiaomi.push.gf
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            gd gdVar = (gd) obj;
            if (!super.equals(gdVar)) {
                return false;
            }
            if (this.e == null ? gdVar.e != null : !this.e.equals(gdVar.e)) {
                return false;
            }
            if (this.c == null ? gdVar.c != null : !this.c.equals(gdVar.c)) {
                return false;
            }
            if (this.d == null ? gdVar.d != null : !this.d.equals(gdVar.d)) {
                return false;
            }
            if (this.b == null ? gdVar.b != null : !this.b.equals(gdVar.b)) {
                return false;
            }
            if (this.a == gdVar.a) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xiaomi.push.gf
    public final int hashCode() {
        return ((((((((this.a != null ? this.a.hashCode() : 0) * 31) + (this.e != null ? this.e.hashCode() : 0)) * 31) + (this.b != null ? this.b.hashCode() : 0)) * 31) + (this.c != null ? this.c.hashCode() : 0)) * 31) + (this.d != null ? this.d.hashCode() : 0);
    }

    @Override // com.xiaomi.push.gf
    public final String b() {
        gj gjVar;
        StringBuilder sb = new StringBuilder();
        sb.append("<message");
        if (this.p != null) {
            sb.append(" xmlns=\"");
            sb.append(this.p);
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        if (this.c != null) {
            sb.append(" xml:lang=\"");
            sb.append(this.c);
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
        if (!TextUtils.isEmpty(this.i)) {
            sb.append(" seq=\"");
            sb.append(this.i);
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        if (!TextUtils.isEmpty(this.j)) {
            sb.append(" mseq=\"");
            sb.append(this.j);
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        if (!TextUtils.isEmpty(this.k)) {
            sb.append(" fseq=\"");
            sb.append(this.k);
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        if (!TextUtils.isEmpty(this.l)) {
            sb.append(" status=\"");
            sb.append(this.l);
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
        if (this.g) {
            sb.append(" transient=\"true\"");
        }
        if (!TextUtils.isEmpty(this.h)) {
            sb.append(" appid=\"");
            sb.append(this.h);
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        if (!TextUtils.isEmpty(this.a)) {
            sb.append(" type=\"");
            sb.append(this.a);
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        if (this.m) {
            sb.append(" s=\"1\"");
        }
        sb.append(">");
        if (this.d != null) {
            sb.append("<subject>");
            sb.append(gq.a(this.d));
            sb.append("</subject>");
        }
        if (this.e != null) {
            sb.append("<body");
            if (!TextUtils.isEmpty(this.f)) {
                sb.append(" encode=\"");
                sb.append(this.f);
                sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
            }
            sb.append(">");
            sb.append(gq.a(this.e));
            sb.append("</body>");
        }
        if (this.b != null) {
            sb.append("<thread>");
            sb.append(this.b);
            sb.append("</thread>");
        }
        if ("error".equalsIgnoreCase(this.a) && (gjVar = this.v) != null) {
            sb.append(gjVar.b());
        }
        sb.append(e());
        sb.append("</message>");
        return sb.toString();
    }
}
