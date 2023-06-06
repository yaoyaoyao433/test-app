package com.squareup.picasso.model;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public URL a;
    public String b;
    public Object c;
    private a d;
    private String e;

    public d(String str) {
        this(str, a.a);
    }

    public d(URL url, a aVar) {
        if (url == null) {
            throw new IllegalArgumentException("URL must not be null!");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Headers must not be null");
        }
        this.a = url;
        this.d = aVar;
    }

    public d(String str, a aVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("String url must not be empty or null: " + str);
        } else if (aVar == null) {
            throw new IllegalArgumentException("Headers must not be null");
        } else {
            this.b = str;
            this.d = aVar;
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.e)) {
            String str = this.b;
            if (TextUtils.isEmpty(str)) {
                str = this.a.toString();
            }
            this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
        }
        return this.e;
    }

    public final Map<String, String> b() {
        return this.d.a();
    }

    public final String c() {
        return this.b != null ? this.b : this.a.toString();
    }

    public final String toString() {
        return c() + '\n' + this.d.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return c().equals(dVar.c()) && this.d.equals(dVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return (c().hashCode() * 31) + this.d.hashCode();
    }
}
