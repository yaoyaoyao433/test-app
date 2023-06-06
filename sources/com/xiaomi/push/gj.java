package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
public final class gj {
    private int a;
    private String b;
    private String c;
    private String d;
    private String e;
    private List<gb> f;

    /* loaded from: classes6.dex */
    public static class a {
        public static final a a = new a("internal-server-error");
        public static final a b = new a("forbidden");
        public static final a c = new a("bad-request");
        public static final a d = new a("conflict");
        public static final a e = new a("feature-not-implemented");
        public static final a f = new a("gone");
        public static final a g = new a("item-not-found");
        public static final a h = new a("jid-malformed");
        public static final a i = new a("not-acceptable");
        public static final a j = new a("not-allowed");
        public static final a k = new a("not-authorized");
        public static final a l = new a("payment-required");
        public static final a m = new a("recipient-unavailable");
        public static final a n = new a(NetLogConstants.Details.REDIRECT);
        public static final a o = new a("registration-required");
        public static final a p = new a("remote-server-error");
        public static final a q = new a("remote-server-not-found");
        public static final a r = new a("remote-server-timeout");
        public static final a s = new a("resource-constraint");
        public static final a t = new a("service-unavailable");
        public static final a u = new a("subscription-required");
        public static final a v = new a("undefined-condition");
        public static final a w = new a("unexpected-request");
        public static final a x = new a("request-timeout");
        private String y;

        private a(String str) {
            this.y = str;
        }

        public final String toString() {
            return this.y;
        }
    }

    public gj(int i, String str, String str2, String str3, String str4, List<gb> list) {
        this.f = null;
        this.a = i;
        this.b = str;
        this.d = str2;
        this.c = str3;
        this.e = str4;
        this.f = list;
    }

    public gj(Bundle bundle) {
        this.f = null;
        this.a = bundle.getInt("ext_err_code");
        if (bundle.containsKey("ext_err_type")) {
            this.b = bundle.getString("ext_err_type");
        }
        this.c = bundle.getString("ext_err_cond");
        this.d = bundle.getString("ext_err_reason");
        this.e = bundle.getString("ext_err_msg");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                this.f.add(gb.a((Bundle) parcelable));
            }
        }
    }

    private synchronized List<gb> c() {
        if (this.f == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(this.f);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        if (this.b != null) {
            bundle.putString("ext_err_type", this.b);
        }
        bundle.putInt("ext_err_code", this.a);
        if (this.d != null) {
            bundle.putString("ext_err_reason", this.d);
        }
        if (this.c != null) {
            bundle.putString("ext_err_cond", this.c);
        }
        if (this.e != null) {
            bundle.putString("ext_err_msg", this.e);
        }
        if (this.f != null) {
            Bundle[] bundleArr = new Bundle[this.f.size()];
            int i = 0;
            for (gb gbVar : this.f) {
                bundleArr[i] = gbVar.c();
                i++;
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("<error code=\"");
        sb.append(this.a);
        sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        if (this.b != null) {
            sb.append(" type=\"");
            sb.append(this.b);
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        if (this.d != null) {
            sb.append(" reason=\"");
            sb.append(this.d);
            sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
        }
        sb.append(">");
        if (this.c != null) {
            sb.append("<");
            sb.append(this.c);
            sb.append(" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\"/>");
        }
        if (this.e != null) {
            sb.append("<text xml:lang=\"en\" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\">");
            sb.append(this.e);
            sb.append("</text>");
        }
        for (gb gbVar : c()) {
            sb.append(gbVar.b());
        }
        sb.append("</error>");
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.c != null) {
            sb.append(this.c);
        }
        sb.append(CommonConstant.Symbol.BRACKET_LEFT);
        sb.append(this.a);
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        if (this.e != null) {
            sb.append(StringUtil.SPACE);
            sb.append(this.e);
        }
        return sb.toString();
    }

    public gj(a aVar) {
        this.f = null;
        this.c = aVar.y;
        this.e = null;
    }
}
