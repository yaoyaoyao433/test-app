package com.meituan.android.mrn.update;

import android.support.annotation.NonNull;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface d {
    void a(@NonNull a aVar);

    void a(@NonNull b bVar);

    void a(@NonNull c cVar);

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        public final String a;
        public final String b;
        public final f c;

        public b(String str, String str2, f fVar) {
            this.a = str;
            this.b = str2;
            this.c = fVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class c {
        public final ResponseBundle a;
        public final String b;
        public final String c;
        public final String d;
        public final File e;
        public final f f;
        public final long g;
        public final int h;
        public final int i;
        public final boolean j;
        public final boolean k;
        public final boolean l;

        public c(ResponseBundle responseBundle, String str, String str2, String str3, File file, f fVar, boolean z, boolean z2, long j, int i, int i2, boolean z3) {
            this.a = responseBundle;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = file;
            this.f = fVar;
            this.j = z;
            this.k = z2;
            this.g = j;
            this.h = i;
            this.i = i2;
            this.l = z3;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public final String a;
        public final String b;
        public final com.meituan.android.mrn.update.c c;
        public final f d;
        public final boolean e;
        public final boolean f;
        public final boolean g = true;

        public a(String str, String str2, com.meituan.android.mrn.update.c cVar, f fVar, boolean z, boolean z2, boolean z3) {
            this.a = str;
            this.b = str2;
            this.c = cVar;
            this.d = fVar;
            this.e = z;
            this.f = z2;
        }
    }
}
