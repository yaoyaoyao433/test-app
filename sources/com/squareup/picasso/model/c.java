package com.squareup.picasso.model;

import com.bumptech.glide.load.model.j;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c implements com.squareup.picasso.model.a {
    private j b;

    private c(j jVar) {
        this.b = jVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        private j.a a = new j.a();

        public final a a(String str, String str2) {
            this.a.a(str, str2);
            return this;
        }

        public final c a() {
            return new c(this.a.a());
        }
    }

    @Override // com.squareup.picasso.model.a
    public final Map<String, String> a() {
        return this.b.a();
    }

    public final String toString() {
        return this.b.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.b.equals(((c) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
