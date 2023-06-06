package com.bumptech.glide.load.model;

import android.text.TextUtils;
import java.net.URL;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class d {
    public final URL a;
    public final String b;
    public Object c;
    public String d;
    public URL e;
    private final e f;

    public d(URL url) {
        this(url, e.b);
    }

    public d(String str) {
        this(str, e.b);
    }

    public d(URL url, e eVar) {
        if (url == null) {
            throw new IllegalArgumentException("URL must not be null!");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Headers must not be null");
        }
        this.a = url;
        this.b = null;
        this.f = eVar;
    }

    public d(String str, e eVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("String url must not be empty or null: " + str);
        } else if (eVar == null) {
            throw new IllegalArgumentException("Headers must not be null");
        } else {
            this.b = str;
            this.a = null;
            this.f = eVar;
        }
    }

    public final Map<String, String> a() {
        return this.f.a();
    }

    public final String b() {
        return this.b != null ? this.b : this.a.toString();
    }

    public String toString() {
        return b() + '\n' + this.f.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return b().equals(dVar.b()) && this.f.equals(dVar.f);
        }
        return false;
    }

    public int hashCode() {
        return (b().hashCode() * 31) + this.f.hashCode();
    }
}
