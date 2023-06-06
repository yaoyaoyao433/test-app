package com.bumptech.glide.load.data;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i implements com.bumptech.glide.load.data.c<InputStream> {
    private static final e a = new e();
    private final Context b;
    private final Uri c;
    private final com.bumptech.glide.load.data.c<InputStream> d;
    private final int e;
    private final int f;
    private final e g;
    private InputStream h;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface c {
        Cursor a(Context context, Uri uri);
    }

    @Override // com.bumptech.glide.load.data.c
    public final void cancel() {
    }

    public i(Context context, Uri uri, com.bumptech.glide.load.data.c<InputStream> cVar, int i, int i2) {
        this(context, uri, cVar, i, i2, a);
    }

    private i(Context context, Uri uri, com.bumptech.glide.load.data.c<InputStream> cVar, int i, int i2, e eVar) {
        this.b = context;
        this.c = uri;
        this.d = cVar;
        this.e = i;
        this.f = i2;
        this.g = eVar;
    }

    private InputStream a(d dVar) {
        InputStream inputStream;
        try {
            inputStream = dVar.b(this.b, this.c);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            inputStream = null;
        }
        int a2 = inputStream != null ? d.a(this.b, this.c) : -1;
        return a2 != -1 ? new com.bumptech.glide.load.data.d(inputStream, a2) : inputStream;
    }

    @Override // com.bumptech.glide.load.data.c
    public final void a() {
        if (this.h != null) {
            try {
                this.h.close();
            } catch (IOException unused) {
            }
        }
        this.d.a();
    }

    @Override // com.bumptech.glide.load.data.c
    public final String b() {
        return this.c.toString();
    }

    private static boolean a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class d {
        private static final a a = new a();
        private final a b;
        private c c;

        public d(c cVar) {
            this(a, cVar);
        }

        private d(a aVar, c cVar) {
            this.b = aVar;
            this.c = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int a(android.content.Context r5, android.net.Uri r6) {
            /*
                r0 = 0
                android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
                java.io.InputStream r5 = r5.openInputStream(r6)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
                com.bumptech.glide.load.resource.bitmap.ImageHeaderParser r0 = new com.bumptech.glide.load.resource.bitmap.ImageHeaderParser     // Catch: java.io.IOException -> L18 java.lang.Throwable -> L44
                r0.<init>(r5)     // Catch: java.io.IOException -> L18 java.lang.Throwable -> L44
                int r0 = r0.b()     // Catch: java.io.IOException -> L18 java.lang.Throwable -> L44
                if (r5 == 0) goto L43
                r5.close()     // Catch: java.io.IOException -> L43
                goto L43
            L18:
                r0 = move-exception
                goto L21
            L1a:
                r6 = move-exception
                r5 = r0
                goto L45
            L1d:
                r5 = move-exception
                r4 = r0
                r0 = r5
                r5 = r4
            L21:
                java.lang.String r1 = "MediaStoreThumbFetcher"
                r2 = 3
                boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L44
                if (r1 == 0) goto L3d
                java.lang.String r1 = "MediaStoreThumbFetcher"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
                java.lang.String r3 = "Failed to open uri: "
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L44
                r2.append(r6)     // Catch: java.lang.Throwable -> L44
                java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L44
                android.util.Log.d(r1, r6, r0)     // Catch: java.lang.Throwable -> L44
            L3d:
                if (r5 == 0) goto L42
                r5.close()     // Catch: java.io.IOException -> L42
            L42:
                r0 = -1
            L43:
                return r0
            L44:
                r6 = move-exception
            L45:
                if (r5 == 0) goto L4a
                r5.close()     // Catch: java.io.IOException -> L4a
            L4a:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.i.d.a(android.content.Context, android.net.Uri):int");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.io.InputStream b(android.content.Context r8, android.net.Uri r9) throws java.io.FileNotFoundException {
            /*
                r7 = this;
                com.bumptech.glide.load.data.i$c r0 = r7.c
                android.database.Cursor r9 = r0.a(r8, r9)
                r0 = 0
                if (r9 == 0) goto L3b
                boolean r1 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L34
                if (r1 == 0) goto L3b
                r1 = 0
                java.lang.String r1 = r9.getString(r1)     // Catch: java.lang.Throwable -> L34
                boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L34
                if (r2 != 0) goto L3b
                java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L34
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L34
                boolean r1 = r2.exists()     // Catch: java.lang.Throwable -> L34
                if (r1 == 0) goto L3b
                long r3 = r2.length()     // Catch: java.lang.Throwable -> L34
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 <= 0) goto L3b
                android.net.Uri r1 = android.net.Uri.fromFile(r2)     // Catch: java.lang.Throwable -> L34
                goto L3c
            L34:
                r8 = move-exception
                if (r9 == 0) goto L3a
                r9.close()
            L3a:
                throw r8
            L3b:
                r1 = r0
            L3c:
                if (r9 == 0) goto L41
                r9.close()
            L41:
                if (r1 == 0) goto L4b
                android.content.ContentResolver r8 = r8.getContentResolver()
                java.io.InputStream r0 = r8.openInputStream(r1)
            L4b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.i.d.b(android.content.Context, android.net.Uri):java.io.InputStream");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class b implements c {
        private static final String[] a = {"_data"};

        b() {
        }

        @Override // com.bumptech.glide.load.data.i.c
        public final Cursor a(Context context, Uri uri) {
            return context.getContentResolver().query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class f implements c {
        private static final String[] a = {"_data"};

        f() {
        }

        @Override // com.bumptech.glide.load.data.i.c
        public final Cursor a(Context context, Uri uri) {
            return context.getContentResolver().query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class e {
        e() {
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final /* synthetic */ InputStream a(int i) throws Exception {
        d dVar;
        Uri uri = this.c;
        int i2 = this.e;
        int i3 = this.f;
        if (!a(uri) || i2 > 512 || i3 > 384) {
            dVar = null;
        } else {
            if (a(uri) && uri.getPathSegments().contains("video")) {
                dVar = new d(new f());
            } else {
                dVar = new d(new b());
            }
        }
        if (dVar != null) {
            this.h = a(dVar);
        }
        if (this.h == null) {
            this.h = this.d.a(i);
        }
        return this.h;
    }
}
