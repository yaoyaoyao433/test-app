package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f<A> implements l<A, g> {
    private final l<A, InputStream> a;
    private final l<A, ParcelFileDescriptor> b;

    public f(l<A, InputStream> lVar, l<A, ParcelFileDescriptor> lVar2) {
        if (lVar == null && lVar2 == null) {
            throw new NullPointerException("At least one of streamLoader and fileDescriptorLoader must be non null");
        }
        this.a = lVar;
        this.b = lVar2;
    }

    public final void a(Object obj) {
        if (this.a == null || !(this.a instanceof com.bumptech.glide.load.model.stream.h)) {
            return;
        }
        ((com.bumptech.glide.load.model.stream.h) this.a).a = obj;
    }

    @Override // com.bumptech.glide.load.model.l
    public final com.bumptech.glide.load.data.c<g> a(A a2, int i, int i2) {
        com.bumptech.glide.load.data.c<InputStream> a3 = this.a != null ? this.a.a(a2, i, i2) : null;
        com.bumptech.glide.load.data.c<ParcelFileDescriptor> a4 = this.b != null ? this.b.a(a2, i, i2) : null;
        if (a3 == null && a4 == null) {
            return null;
        }
        return new a(a3, a4);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements com.bumptech.glide.load.data.c<g> {
        private final com.bumptech.glide.load.data.c<InputStream> a;
        private final com.bumptech.glide.load.data.c<ParcelFileDescriptor> b;

        public a(com.bumptech.glide.load.data.c<InputStream> cVar, com.bumptech.glide.load.data.c<ParcelFileDescriptor> cVar2) {
            this.a = cVar;
            this.b = cVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:31:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.bumptech.glide.load.data.c
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.bumptech.glide.load.model.g a(int r6) throws java.lang.Exception {
            /*
                r5 = this;
                com.bumptech.glide.load.data.c<java.io.InputStream> r0 = r5.a
                r1 = 2
                r2 = 0
                if (r0 == 0) goto L25
                com.bumptech.glide.load.data.c<java.io.InputStream> r0 = r5.a     // Catch: java.lang.Exception -> Lf
                java.lang.Object r0 = r0.a(r6)     // Catch: java.lang.Exception -> Lf
                java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.lang.Exception -> Lf
                goto L26
            Lf:
                r0 = move-exception
                java.lang.String r3 = "IVML"
                boolean r3 = android.util.Log.isLoggable(r3, r1)
                if (r3 == 0) goto L1f
                java.lang.String r3 = "IVML"
                java.lang.String r4 = "Exception fetching input stream, trying ParcelFileDescriptor"
                android.util.Log.v(r3, r4, r0)
            L1f:
                com.bumptech.glide.load.data.c<android.os.ParcelFileDescriptor> r3 = r5.b
                if (r3 == 0) goto L24
                goto L25
            L24:
                throw r0
            L25:
                r0 = r2
            L26:
                com.bumptech.glide.load.data.c<android.os.ParcelFileDescriptor> r3 = r5.b
                if (r3 == 0) goto L47
                com.bumptech.glide.load.data.c<android.os.ParcelFileDescriptor> r3 = r5.b     // Catch: java.lang.Exception -> L33
                java.lang.Object r6 = r3.a(r6)     // Catch: java.lang.Exception -> L33
                android.os.ParcelFileDescriptor r6 = (android.os.ParcelFileDescriptor) r6     // Catch: java.lang.Exception -> L33
                goto L48
            L33:
                r6 = move-exception
                java.lang.String r3 = "IVML"
                boolean r1 = android.util.Log.isLoggable(r3, r1)
                if (r1 == 0) goto L43
                java.lang.String r1 = "IVML"
                java.lang.String r3 = "Exception fetching ParcelFileDescriptor"
                android.util.Log.v(r1, r3, r6)
            L43:
                if (r0 == 0) goto L46
                goto L47
            L46:
                throw r6
            L47:
                r6 = r2
            L48:
                com.bumptech.glide.load.model.g r1 = new com.bumptech.glide.load.model.g
                r1.<init>(r0, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.model.f.a.a(int):com.bumptech.glide.load.model.g");
        }

        @Override // com.bumptech.glide.load.data.c
        public final void a() {
            if (this.a != null) {
                this.a.a();
            }
            if (this.b != null) {
                this.b.a();
            }
        }

        @Override // com.bumptech.glide.load.data.c
        public final String b() {
            if (this.a != null) {
                return this.a.b();
            }
            return this.b.b();
        }

        @Override // com.bumptech.glide.load.data.c
        public final void cancel() {
            if (this.a != null) {
                this.a.cancel();
            }
            if (this.b != null) {
                this.b.cancel();
            }
        }
    }
}
