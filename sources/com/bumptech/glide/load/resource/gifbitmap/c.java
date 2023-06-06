package com.bumptech.glide.load.resource.gifbitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.l;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.o;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.e<com.bumptech.glide.load.model.g, com.bumptech.glide.load.resource.gifbitmap.a> {
    private static final b a = new b();
    private static final a b = new a();
    private final com.bumptech.glide.load.e<com.bumptech.glide.load.model.g, Bitmap> c;
    private final com.bumptech.glide.load.e<InputStream, com.bumptech.glide.load.resource.gif.b> d;
    private final com.bumptech.glide.load.engine.bitmap_recycle.c e;
    private final b f;
    private final a g;
    private String h;

    public c(com.bumptech.glide.load.e<com.bumptech.glide.load.model.g, Bitmap> eVar, com.bumptech.glide.load.e<InputStream, com.bumptech.glide.load.resource.gif.b> eVar2, com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        this(eVar, eVar2, cVar, a, b);
    }

    private c(com.bumptech.glide.load.e<com.bumptech.glide.load.model.g, Bitmap> eVar, com.bumptech.glide.load.e<InputStream, com.bumptech.glide.load.resource.gif.b> eVar2, com.bumptech.glide.load.engine.bitmap_recycle.c cVar, b bVar, a aVar) {
        this.c = eVar;
        this.d = eVar2;
        this.e = cVar;
        this.f = bVar;
        this.g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[Catch: all -> 0x0087, TryCatch #0 {all -> 0x0087, blocks: (B:3:0x0008, B:5:0x000d, B:7:0x0023, B:18:0x0059, B:20:0x005f, B:21:0x006b, B:11:0x002a, B:13:0x0032, B:15:0x0041, B:16:0x0047, B:22:0x0077), top: B:31:0x0008 }] */
    @Override // com.bumptech.glide.load.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bumptech.glide.load.engine.l<com.bumptech.glide.load.resource.gifbitmap.a> a(com.bumptech.glide.load.model.g r9, int r10, int r11) throws java.io.IOException {
        /*
            r8 = this;
            com.bumptech.glide.util.a r0 = com.bumptech.glide.util.a.a()
            byte[] r1 = r0.b()
            java.io.InputStream r2 = r9.a     // Catch: java.lang.Throwable -> L87
            r3 = 0
            if (r2 == 0) goto L77
            java.io.InputStream r2 = r9.a     // Catch: java.lang.Throwable -> L87
            java.io.InputStream r2 = com.bumptech.glide.load.resource.gifbitmap.c.a.a(r2, r1)     // Catch: java.lang.Throwable -> L87
            r4 = 2048(0x800, float:2.87E-42)
            r2.mark(r4)     // Catch: java.lang.Throwable -> L87
            com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.resource.gifbitmap.c.b.a(r2)     // Catch: java.lang.Throwable -> L87
            r2.reset()     // Catch: java.lang.Throwable -> L87
            com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType.GIF     // Catch: java.lang.Throwable -> L87
            if (r4 == r5) goto L2a
            com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType.ANIMATED_WEBP     // Catch: java.lang.Throwable -> L87
            if (r4 != r5) goto L28
            goto L2a
        L28:
            r5 = r3
            goto L57
        L2a:
            com.bumptech.glide.load.e<java.io.InputStream, com.bumptech.glide.load.resource.gif.b> r4 = r8.d     // Catch: java.lang.Throwable -> L87
            com.bumptech.glide.load.engine.l r4 = r4.a(r2, r10, r11)     // Catch: java.lang.Throwable -> L87
            if (r4 == 0) goto L28
            java.lang.Object r5 = r4.a()     // Catch: java.lang.Throwable -> L87
            com.bumptech.glide.load.resource.gif.b r5 = (com.bumptech.glide.load.resource.gif.b) r5     // Catch: java.lang.Throwable -> L87
            com.bumptech.glide.gifdecoder.a r6 = r5.b     // Catch: java.lang.Throwable -> L87
            int r6 = r6.c()     // Catch: java.lang.Throwable -> L87
            r7 = 1
            if (r6 <= r7) goto L47
            com.bumptech.glide.load.resource.gifbitmap.a r5 = new com.bumptech.glide.load.resource.gifbitmap.a     // Catch: java.lang.Throwable -> L87
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L87
            goto L57
        L47:
            com.bumptech.glide.load.resource.bitmap.c r4 = new com.bumptech.glide.load.resource.bitmap.c     // Catch: java.lang.Throwable -> L87
            com.bumptech.glide.load.resource.gif.b$a r5 = r5.a     // Catch: java.lang.Throwable -> L87
            android.graphics.Bitmap r5 = r5.i     // Catch: java.lang.Throwable -> L87
            com.bumptech.glide.load.engine.bitmap_recycle.c r6 = r8.e     // Catch: java.lang.Throwable -> L87
            r4.<init>(r5, r3, r6)     // Catch: java.lang.Throwable -> L87
            com.bumptech.glide.load.resource.gifbitmap.a r5 = new com.bumptech.glide.load.resource.gifbitmap.a     // Catch: java.lang.Throwable -> L87
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L87
        L57:
            if (r5 != 0) goto L7b
            java.io.InputStream r4 = r9.a     // Catch: java.lang.Throwable -> L87
            boolean r4 = r4 instanceof com.bumptech.glide.load.resource.bitmap.l     // Catch: java.lang.Throwable -> L87
            if (r4 == 0) goto L6b
            com.bumptech.glide.load.resource.bitmap.l r4 = new com.bumptech.glide.load.resource.bitmap.l     // Catch: java.lang.Throwable -> L87
            java.io.InputStream r5 = r9.a     // Catch: java.lang.Throwable -> L87
            com.bumptech.glide.load.resource.bitmap.l r5 = (com.bumptech.glide.load.resource.bitmap.l) r5     // Catch: java.lang.Throwable -> L87
            int r5 = r5.a     // Catch: java.lang.Throwable -> L87
            r4.<init>(r2, r5)     // Catch: java.lang.Throwable -> L87
            r2 = r4
        L6b:
            com.bumptech.glide.load.model.g r4 = new com.bumptech.glide.load.model.g     // Catch: java.lang.Throwable -> L87
            android.os.ParcelFileDescriptor r9 = r9.b     // Catch: java.lang.Throwable -> L87
            r4.<init>(r2, r9)     // Catch: java.lang.Throwable -> L87
            com.bumptech.glide.load.resource.gifbitmap.a r5 = r8.b(r4, r10, r11)     // Catch: java.lang.Throwable -> L87
            goto L7b
        L77:
            com.bumptech.glide.load.resource.gifbitmap.a r5 = r8.b(r9, r10, r11)     // Catch: java.lang.Throwable -> L87
        L7b:
            r0.a(r1)
            if (r5 == 0) goto L86
            com.bumptech.glide.load.resource.gifbitmap.b r9 = new com.bumptech.glide.load.resource.gifbitmap.b
            r9.<init>(r5)
            return r9
        L86:
            return r3
        L87:
            r9 = move-exception
            r0.a(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.gifbitmap.c.a(com.bumptech.glide.load.model.g, int, int):com.bumptech.glide.load.engine.l");
    }

    private com.bumptech.glide.load.resource.gifbitmap.a b(com.bumptech.glide.load.model.g gVar, int i, int i2) throws IOException {
        l<Bitmap> a2 = this.c.a(gVar, i, i2);
        if (a2 != null) {
            return new com.bumptech.glide.load.resource.gifbitmap.a(a2, null);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.e
    public final String a() {
        if (this.h == null) {
            this.h = this.d.a() + this.c.a();
        }
        return this.h;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static InputStream a(InputStream inputStream, byte[] bArr) {
            return new o(inputStream, bArr);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        public static ImageHeaderParser.ImageType a(InputStream inputStream) throws IOException {
            return new ImageHeaderParser(inputStream).a();
        }
    }
}
