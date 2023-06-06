package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    private static volatile boolean i = false;
    private static Set<f> j = Collections.newSetFromMap(new WeakHashMap());
    final b a;
    final com.bumptech.glide.gifdecoder.a b;
    final Handler c;
    boolean d;
    boolean e;
    com.bumptech.glide.e<com.bumptech.glide.gifdecoder.a, com.bumptech.glide.gifdecoder.a, Bitmap, Bitmap> f;
    a g;
    boolean h;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        void c(int i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(android.content.Context r18, com.bumptech.glide.load.resource.gif.f.b r19, com.bumptech.glide.gifdecoder.a r20, int r21, int r22) {
        /*
            r17 = this;
            r0 = r18
            r1 = r20
            com.bumptech.glide.load.engine.bitmap_recycle.c r2 = com.bumptech.glide.k.a(r18)
            com.bumptech.glide.load.resource.gif.h r3 = new com.bumptech.glide.load.resource.gif.h
            r3.<init>(r2)
            com.bumptech.glide.load.resource.gif.g r2 = new com.bumptech.glide.load.resource.gif.g
            r2.<init>()
            com.bumptech.glide.load.b r4 = com.bumptech.glide.load.resource.a.b()
            com.bumptech.glide.load.resource.gif.i r5 = new com.bumptech.glide.load.resource.gif.i
            r5.<init>(r0)
            com.bumptech.glide.m r0 = r5.c(r0)
            java.lang.Class<com.bumptech.glide.gifdecoder.a> r5 = com.bumptech.glide.gifdecoder.a.class
            com.bumptech.glide.m$a r6 = new com.bumptech.glide.m$a
            r6.<init>(r2, r5)
            com.bumptech.glide.m$a$a r0 = new com.bumptech.glide.m$a$a
            r0.<init>(r1)
            java.lang.Class<android.graphics.Bitmap> r13 = android.graphics.Bitmap.class
            com.bumptech.glide.m$a r2 = com.bumptech.glide.m.a.this
            com.bumptech.glide.m r2 = com.bumptech.glide.m.this
            com.bumptech.glide.m$b r2 = r2.e
            com.bumptech.glide.f r2 = new com.bumptech.glide.f
            com.bumptech.glide.m$a r5 = com.bumptech.glide.m.a.this
            com.bumptech.glide.m r5 = com.bumptech.glide.m.this
            android.content.Context r8 = r5.a
            com.bumptech.glide.m$a r5 = com.bumptech.glide.m.a.this
            com.bumptech.glide.m r5 = com.bumptech.glide.m.this
            com.bumptech.glide.i r9 = r5.d
            java.lang.Class<A> r10 = r0.b
            com.bumptech.glide.m$a r5 = com.bumptech.glide.m.a.this
            com.bumptech.glide.load.model.l<A, T> r11 = r5.a
            com.bumptech.glide.m$a r5 = com.bumptech.glide.m.a.this
            java.lang.Class<T> r12 = r5.b
            com.bumptech.glide.m$a r5 = com.bumptech.glide.m.a.this
            com.bumptech.glide.m r5 = com.bumptech.glide.m.this
            com.bumptech.glide.manager.l r14 = r5.c
            com.bumptech.glide.m$a r5 = com.bumptech.glide.m.a.this
            com.bumptech.glide.m r5 = com.bumptech.glide.m.this
            com.bumptech.glide.manager.g r15 = r5.b
            com.bumptech.glide.m$a r5 = com.bumptech.glide.m.a.this
            com.bumptech.glide.m r5 = com.bumptech.glide.m.this
            com.bumptech.glide.m$b r5 = r5.e
            r7 = r2
            r16 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.bumptech.glide.f r2 = (com.bumptech.glide.f) r2
            boolean r5 = r0.c
            if (r5 == 0) goto L6e
            A r0 = r0.a
            r2.a(r0)
        L6e:
            com.bumptech.glide.e r0 = r2.a(r4)
            com.bumptech.glide.e r0 = r0.b(r3)
            r2 = 1
            com.bumptech.glide.e r0 = r0.b(r2)
            com.bumptech.glide.load.engine.b r2 = com.bumptech.glide.load.engine.b.NONE
            com.bumptech.glide.e r0 = r0.a(r2)
            r2 = r21
            r3 = r22
            com.bumptech.glide.e r0 = r0.a(r2, r3)
            r2 = 0
            r3 = r17
            r4 = r19
            r3.<init>(r4, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.gif.f.<init>(android.content.Context, com.bumptech.glide.load.resource.gif.f$b, com.bumptech.glide.gifdecoder.a, int, int):void");
    }

    private f(b bVar, com.bumptech.glide.gifdecoder.a aVar, Handler handler, com.bumptech.glide.e<com.bumptech.glide.gifdecoder.a, com.bumptech.glide.gifdecoder.a, Bitmap, Bitmap> eVar) {
        this.d = false;
        this.e = false;
        Handler handler2 = new Handler(Looper.getMainLooper(), new c());
        this.a = bVar;
        this.b = aVar;
        this.c = handler2;
        this.f = eVar;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.h = false;
        c();
    }

    void c() {
        if (i) {
            j.add(this);
        } else if (!this.d || this.e) {
        } else {
            this.e = true;
            long uptimeMillis = SystemClock.uptimeMillis() + this.b.b();
            this.b.a();
            this.f.a(new d()).a((com.bumptech.glide.e<com.bumptech.glide.gifdecoder.a, com.bumptech.glide.gifdecoder.a, Bitmap, Bitmap>) new a(this.c, this.b.d(), uptimeMillis));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class c implements Handler.Callback {
        private c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                a aVar = (a) message.obj;
                f fVar = f.this;
                if (fVar.h) {
                    fVar.c.obtainMessage(2, aVar).sendToTarget();
                } else {
                    a aVar2 = fVar.g;
                    fVar.g = aVar;
                    fVar.a.c(aVar.a);
                    if (aVar2 != null && ImageHeaderParser.ImageType.ANIMATED_WEBP != fVar.b.h) {
                        fVar.c.obtainMessage(2, aVar2).sendToTarget();
                    }
                    fVar.e = false;
                    fVar.c();
                }
                return true;
            }
            if (message.what == 2) {
                com.bumptech.glide.k.a((a) message.obj);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends com.bumptech.glide.request.target.i<Bitmap> {
        final int a;
        Bitmap b;
        private final Handler c;
        private final long d;

        @Override // com.bumptech.glide.request.target.l
        public final /* synthetic */ void a(Object obj, com.bumptech.glide.request.animation.e eVar) {
            this.b = (Bitmap) obj;
            this.c.sendMessageAtTime(this.c.obtainMessage(1, this), this.d);
        }

        public a(Handler handler, int i, long j) {
            this.c = handler;
            this.a = i;
            this.d = j;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class d implements com.bumptech.glide.load.c {
        private final UUID a;

        public d() {
            this(UUID.randomUUID());
        }

        private d(UUID uuid) {
            this.a = uuid;
        }

        @Override // com.bumptech.glide.load.c
        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return ((d) obj).a.equals(this.a);
            }
            return false;
        }

        @Override // com.bumptech.glide.load.c
        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.bumptech.glide.load.c
        public final void a(MessageDigest messageDigest) throws UnsupportedEncodingException {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    public final void b() {
        this.d = false;
        if (this.g != null) {
            com.bumptech.glide.k.a(this.g);
            this.g = null;
        }
        this.h = true;
    }
}
