package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.gifdecoder.a;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.bumptech.glide.load.resource.gifbitmap.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j implements com.bumptech.glide.load.e<InputStream, com.bumptech.glide.load.resource.gif.b> {
    private static final b a = new b();
    private static final a b = new a();
    private final Context c;
    private final b d;
    private final com.bumptech.glide.load.engine.bitmap_recycle.c e;
    private final a f;
    private final com.bumptech.glide.load.resource.gif.a g;
    private final c.a h;
    private com.bumptech.glide.load.resource.webp.a i;

    @Override // com.bumptech.glide.load.e
    public final String a() {
        return "";
    }

    public j(Context context, com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        this(context, cVar, a, b);
    }

    private j(Context context, com.bumptech.glide.load.engine.bitmap_recycle.c cVar, b bVar, a aVar) {
        this.c = context.getApplicationContext();
        this.e = cVar;
        this.f = aVar;
        this.g = new com.bumptech.glide.load.resource.gif.a(cVar);
        this.d = bVar;
        this.i = new com.bumptech.glide.load.resource.webp.a(context, cVar);
        this.h = new c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bumptech.glide.load.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bumptech.glide.load.resource.gif.d a(java.io.InputStream r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.gif.j.a(java.io.InputStream, int, int):com.bumptech.glide.load.resource.gif.d");
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.flush();
        } catch (IOException e) {
            Log.w("GifResourceDecoder", "Error reading data from stream", e);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        private final Queue<com.bumptech.glide.gifdecoder.a> a = com.bumptech.glide.util.h.a(0);

        a() {
        }

        public final synchronized com.bumptech.glide.gifdecoder.a a(a.InterfaceC0036a interfaceC0036a) {
            com.bumptech.glide.gifdecoder.a poll;
            poll = this.a.poll();
            if (poll == null) {
                poll = new com.bumptech.glide.gifdecoder.a(interfaceC0036a);
            }
            return poll;
        }

        public final synchronized void a(com.bumptech.glide.gifdecoder.a aVar) {
            if (ImageHeaderParser.ImageType.ANIMATED_WEBP != aVar.h) {
                aVar.e = null;
                aVar.d = null;
                aVar.b = null;
                aVar.c = null;
                if (aVar.g != null) {
                    aVar.f.a(aVar.g);
                }
                aVar.g = null;
                aVar.a = null;
            } else {
                aVar.i.a.i();
            }
            this.a.offer(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        private final Queue<com.bumptech.glide.gifdecoder.d> a = com.bumptech.glide.util.h.a(0);

        b() {
        }

        public final synchronized com.bumptech.glide.gifdecoder.d a(byte[] bArr) {
            com.bumptech.glide.gifdecoder.d poll;
            poll = this.a.poll();
            if (poll == null) {
                poll = new com.bumptech.glide.gifdecoder.d();
            }
            poll.b = null;
            Arrays.fill(poll.a, (byte) 0);
            poll.c = new com.bumptech.glide.gifdecoder.c();
            poll.d = 0;
            if (bArr != null) {
                poll.b = ByteBuffer.wrap(bArr);
                poll.b.rewind();
                poll.b.order(ByteOrder.LITTLE_ENDIAN);
            } else {
                poll.b = null;
                poll.c.b = 2;
            }
            return poll;
        }

        public final synchronized void a(com.bumptech.glide.gifdecoder.d dVar) {
            dVar.b = null;
            dVar.c = null;
            this.a.offer(dVar);
        }
    }
}
