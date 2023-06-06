package com.bumptech.glide.load.engine;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i implements com.bumptech.glide.load.engine.executor.b, Runnable {
    private final int a;
    private final a b;
    private final com.bumptech.glide.load.engine.a<?, ?, ?> c;
    private final boolean d;
    private int e = b.a;
    private volatile boolean f;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    interface a extends com.bumptech.glide.request.g {
        void a(i iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class b {
        public static final int a = 1;
        public static final int b = 2;
        private static final /* synthetic */ int[] c = {a, b};
    }

    public i(a aVar, com.bumptech.glide.load.engine.a<?, ?, ?> aVar2, int i, boolean z) {
        this.b = aVar;
        this.c = aVar2;
        this.a = i;
        this.d = z;
    }

    public final void cancel() {
        this.f = true;
        this.c.cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable, java.lang.Exception] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
            boolean r0 = r4.f
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 2
            r1 = 0
            boolean r2 = r4.b()     // Catch: java.lang.Exception -> L1e java.lang.OutOfMemoryError -> L30
            if (r2 == 0) goto L12
            com.bumptech.glide.load.engine.l r2 = r4.c()     // Catch: java.lang.Exception -> L1e java.lang.OutOfMemoryError -> L30
            goto L1c
        L12:
            com.bumptech.glide.load.engine.a<?, ?, ?> r2 = r4.c     // Catch: java.lang.Exception -> L1e java.lang.OutOfMemoryError -> L30
            com.bumptech.glide.load.engine.l r3 = r2.a()     // Catch: java.lang.Exception -> L1e java.lang.OutOfMemoryError -> L30
            com.bumptech.glide.load.engine.l r2 = r2.a(r3)     // Catch: java.lang.Exception -> L1e java.lang.OutOfMemoryError -> L30
        L1c:
            r0 = r1
            goto L46
        L1e:
            r2 = move-exception
            java.lang.String r3 = "EngineRunnable"
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L2e
            java.lang.String r0 = "EngineRunnable"
            java.lang.String r3 = "Exception decoding"
            android.util.Log.v(r0, r3, r2)
        L2e:
            r0 = r2
            goto L45
        L30:
            r2 = move-exception
            java.lang.String r3 = "EngineRunnable"
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L40
            java.lang.String r0 = "EngineRunnable"
            java.lang.String r3 = "Out Of Memory Error decoding"
            android.util.Log.v(r0, r3, r2)
        L40:
            com.bumptech.glide.load.engine.j r0 = new com.bumptech.glide.load.engine.j
            r0.<init>(r2)
        L45:
            r2 = r1
        L46:
            boolean r3 = r4.f
            if (r3 == 0) goto L50
            if (r2 == 0) goto L4f
            r2.d()
        L4f:
            return
        L50:
            if (r2 != 0) goto L72
            boolean r2 = r4.d
            if (r2 == 0) goto L5c
            com.bumptech.glide.load.engine.i$a r0 = r4.b
            r0.a(r1)
            return
        L5c:
            boolean r1 = r4.b()
            if (r1 == 0) goto L6c
            int r0 = com.bumptech.glide.load.engine.i.b.b
            r4.e = r0
            com.bumptech.glide.load.engine.i$a r0 = r4.b
            r0.a(r4)
            goto L77
        L6c:
            com.bumptech.glide.load.engine.i$a r1 = r4.b
            r1.a(r0)
            return
        L72:
            com.bumptech.glide.load.engine.i$a r0 = r4.b
            r0.a(r2)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.i.run():void");
    }

    private boolean b() {
        return this.e == b.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.bumptech.glide.load.engine.l<?> c() throws java.lang.Exception {
        /*
            r9 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            com.bumptech.glide.load.engine.a<?, ?, ?> r3 = r9.c     // Catch: java.lang.Exception -> L57
            com.bumptech.glide.load.engine.b r4 = r3.c     // Catch: java.lang.Exception -> L57
            boolean r4 = r4.f     // Catch: java.lang.Exception -> L57
            if (r4 != 0) goto Lc
            goto L6b
        Lc:
            long r4 = com.bumptech.glide.util.d.a()     // Catch: java.lang.Exception -> L57
            com.bumptech.glide.load.engine.f r6 = r3.a     // Catch: java.lang.Exception -> L57
            com.bumptech.glide.load.engine.l r6 = r3.a(r6, r0)     // Catch: java.lang.Exception -> L57
            if (r6 != 0) goto L1a
            r6 = r2
            goto L34
        L1a:
            java.lang.Object r7 = r6.a()     // Catch: java.lang.Exception -> L57
            boolean r8 = r7 instanceof com.bumptech.glide.load.resource.gif.b     // Catch: java.lang.Exception -> L57
            if (r8 != 0) goto L2c
            boolean r8 = r7 instanceof com.bumptech.glide.load.resource.gifbitmap.a     // Catch: java.lang.Exception -> L57
            if (r8 == 0) goto L34
            com.bumptech.glide.load.resource.gifbitmap.a r7 = (com.bumptech.glide.load.resource.gifbitmap.a) r7     // Catch: java.lang.Exception -> L57
            com.bumptech.glide.load.engine.l<com.bumptech.glide.load.resource.gif.b> r7 = r7.a     // Catch: java.lang.Exception -> L57
            if (r7 == 0) goto L34
        L2c:
            com.bumptech.glide.load.g<T> r7 = r3.b     // Catch: java.lang.Exception -> L57
            if (r7 == 0) goto L34
            com.bumptech.glide.load.engine.l r6 = r3.b(r6)     // Catch: java.lang.Exception -> L57
        L34:
            java.lang.String r7 = "DecodeJob"
            boolean r7 = android.util.Log.isLoggable(r7, r1)     // Catch: java.lang.Exception -> L57
            if (r7 == 0) goto L41
            java.lang.String r7 = "Decoded transformed from cache"
            r3.a(r7, r4)     // Catch: java.lang.Exception -> L57
        L41:
            long r4 = com.bumptech.glide.util.d.a()     // Catch: java.lang.Exception -> L57
            com.bumptech.glide.load.engine.l r6 = r3.c(r6)     // Catch: java.lang.Exception -> L57
            java.lang.String r7 = "DecodeJob"
            boolean r7 = android.util.Log.isLoggable(r7, r1)     // Catch: java.lang.Exception -> L57
            if (r7 == 0) goto L6c
            java.lang.String r7 = "Transcoded transformed from cache"
            r3.a(r7, r4)     // Catch: java.lang.Exception -> L57
            goto L6c
        L57:
            r3 = move-exception
            java.lang.String r4 = "EngineRunnable"
            r5 = 3
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            if (r4 == 0) goto L6b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Exception decoding result from cache: "
            r4.<init>(r5)
            r4.append(r3)
        L6b:
            r6 = r2
        L6c:
            if (r6 != 0) goto L98
            com.bumptech.glide.load.engine.a<?, ?, ?> r3 = r9.c
            com.bumptech.glide.load.engine.b r4 = r3.c
            boolean r4 = r4.e
            if (r4 != 0) goto L78
        L76:
            r6 = r2
            goto L98
        L78:
            long r4 = com.bumptech.glide.util.d.a()
            com.bumptech.glide.load.engine.f r2 = r3.a
            com.bumptech.glide.load.c r2 = r2.a()
            com.bumptech.glide.load.engine.l r0 = r3.a(r2, r0)
            java.lang.String r2 = "DecodeJob"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L93
            java.lang.String r1 = "Decoded source from cache"
            r3.a(r1, r4)
        L93:
            com.bumptech.glide.load.engine.l r2 = r3.a(r0)
            goto L76
        L98:
            if (r6 == 0) goto La3
            com.squareup.picasso.MonitorData r0 = r6.e()
            if (r0 == 0) goto La3
            r1 = 1
            r0.m = r1
        La3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.i.c():com.bumptech.glide.load.engine.l");
    }

    @Override // com.bumptech.glide.load.engine.executor.b
    public final int a() {
        return this.a - 1;
    }
}
