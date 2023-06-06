package com.xiaomi.push;

import android.os.Bundle;
import com.meituan.android.pike.bean.proto.ProtoConstant;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public class gc extends gf {
    private a a;
    private final Map<String, String> b;

    /* loaded from: classes6.dex */
    public static class a {
        public static final a a = new a("get");
        public static final a b = new a("set");
        public static final a c = new a("result");
        public static final a d = new a("error");
        public static final a e = new a(ProtoConstant.COMMAND);
        private String f;

        private a(String str) {
            this.f = str;
        }

        public static a a(String str) {
            if (str == null) {
                return null;
            }
            String lowerCase = str.toLowerCase();
            if (a.toString().equals(lowerCase)) {
                return a;
            }
            if (b.toString().equals(lowerCase)) {
                return b;
            }
            if (d.toString().equals(lowerCase)) {
                return d;
            }
            if (c.toString().equals(lowerCase)) {
                return c;
            }
            if (e.toString().equals(lowerCase)) {
                return e;
            }
            return null;
        }

        public final String toString() {
            return this.f;
        }
    }

    public gc() {
        this.a = a.a;
        this.b = new HashMap();
    }

    public gc(Bundle bundle) {
        super(bundle);
        this.a = a.a;
        this.b = new HashMap();
        if (bundle.containsKey("ext_iq_type")) {
            this.a = a.a(bundle.getString("ext_iq_type"));
        }
    }

    @Override // com.xiaomi.push.gf
    public final Bundle a() {
        Bundle a2 = super.a();
        if (this.a != null) {
            a2.putString("ext_iq_type", this.a.toString());
        }
        return a2;
    }

    public final void a(a aVar) {
        if (aVar == null) {
            this.a = a.a;
        } else {
            this.a = aVar;
        }
    }

    public final synchronized void a(Map<String, String> map) {
        this.b.putAll(map);
    }

    @Override // com.xiaomi.push.gf
    public final String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("<iq ");
        if (d() != null) {
            sb.append("id=\"" + d() + "\" ");
        }
        if (this.r != null) {
            sb.append("to=\"");
            sb.append(gq.a(this.r));
            sb.append("\" ");
        }
        if (this.s != null) {
            sb.append("from=\"");
            sb.append(gq.a(this.s));
            sb.append("\" ");
        }
        if (this.t != null) {
            sb.append("chid=\"");
            sb.append(gq.a(this.t));
            sb.append("\" ");
        }
        for (Map.Entry<String, String> entry : this.b.entrySet()) {
            sb.append(gq.a(entry.getKey()));
            sb.append("=\"");
            sb.append(gq.a(entry.getValue()));
            sb.append("\" ");
        }
        if (this.a == null) {
            sb.append("type=\"get\">");
        } else {
            sb.append("type=\"");
            sb.append(this.a);
            sb.append("\">");
        }
        sb.append(e());
        gj gjVar = this.v;
        if (gjVar != null) {
            sb.append(gjVar.b());
        }
        sb.append("</iq>");
        return sb.toString();
    }
}
