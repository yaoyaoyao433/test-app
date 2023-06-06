package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.bumptech.glide.a;
import com.bumptech.glide.b;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.l;
import com.bumptech.glide.request.animation.e;
import com.bumptech.glide.request.c;
import com.bumptech.glide.request.f;
import com.bumptech.glide.request.target.g;
import com.bumptech.glide.request.target.i;
import com.bumptech.glide.request.target.j;
import com.bumptech.glide.request.target.m;
import com.meituan.robust.common.CommonConstant;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Progress;
import com.squareup.picasso.Request;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RequestCreator {
    private static final AtomicInteger y = new AtomicInteger();
    private boolean A;
    private String B;
    private volatile Progress.ProgressListener C;
    private List<Transformation> D;
    private RequestCreator E;
    private Float F;
    private PlaceHolderSizeCallback G;
    public final Picasso a;
    public final Request.Builder b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public Drawable i;
    public Drawable j;
    public DiskCacheStrategy k;
    public boolean l;
    public String m;
    public Object n;
    public boolean o;
    public Context p;
    public volatile ThrowableCallback q;
    public boolean r;
    public RequestListener s;
    public boolean t;
    public boolean u;
    public BitmapStreamDecoder v;
    public BitmapStreamDecoder w;
    public InternalRequestListener x;
    private int z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RequestCreator(Picasso picasso, Object obj, Context context) {
        this(picasso, obj, context, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RequestCreator(Picasso picasso, Object obj, Context context, boolean z) {
        this.e = true;
        this.l = false;
        this.G = new PlaceHolderSizeCallback(this, null);
        this.a = picasso;
        this.b = new Request.Builder(obj);
        this.p = context;
        this.o = z;
        if (obj != null && !TextUtils.isEmpty(PicassoUtil.c(obj))) {
            this.B = new String(PicassoUtil.c(obj));
        }
        this.x = new InternalRequestListener(Picasso.e(), ActivityLifecycleManager.a(), Picasso.d());
        this.b.m = true;
    }

    public final RequestCreator a() {
        this.e = false;
        return this;
    }

    public final RequestCreator a(int i) {
        this.f = i;
        return this;
    }

    public final RequestCreator a(Drawable drawable) {
        this.i = drawable;
        return this;
    }

    public final RequestCreator b() {
        return a(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE);
    }

    private RequestCreator a(MemoryPolicy memoryPolicy, MemoryPolicy... memoryPolicyArr) {
        if (memoryPolicy != null) {
            this.h = memoryPolicy.c | this.h;
        }
        for (int i = 0; i <= 0; i++) {
            MemoryPolicy memoryPolicy2 = memoryPolicyArr[0];
            if (memoryPolicy2 != null) {
                this.h = memoryPolicy2.c | this.h;
            }
        }
        return this;
    }

    public final RequestCreator b(int i) {
        this.g = i;
        return this;
    }

    public final RequestCreator a(DiskCacheStrategy diskCacheStrategy) {
        this.k = diskCacheStrategy;
        return this;
    }

    public final RequestCreator a(Picasso.Priority priority) {
        this.b.h = priority;
        return this;
    }

    public final RequestCreator a(DecodeFormat decodeFormat) {
        this.b.i = decodeFormat;
        return this;
    }

    public final RequestCreator a(Transformation transformation) {
        this.b.a(transformation);
        return this;
    }

    public final RequestCreator a(List<? extends Transformation> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Transformation transformation = list.get(i);
            if (transformation == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            }
            if (this.D == null) {
                this.D = new ArrayList(2);
            }
            this.D.add(transformation);
        }
        return this;
    }

    public void c() {
        if (this.C == null || TextUtils.isEmpty(this.B)) {
            return;
        }
        Progress.a(this.B, this.C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Throwable th) {
        if (this.q == null || TextUtils.isEmpty(this.B)) {
            return;
        }
        this.q.a(new String(this.B), th);
    }

    public final RequestCreator d() {
        this.d = true;
        return this;
    }

    public final RequestCreator a(int i, int i2) {
        this.b.a(i, i2);
        return this;
    }

    public final RequestCreator b(int i, int i2) {
        this.b.a(i, i2);
        return this;
    }

    public final RequestCreator e() {
        this.b.c();
        return this;
    }

    public final RequestCreator f() {
        this.t = true;
        return this;
    }

    public final RequestCreator a(boolean z) {
        this.b.j = z;
        return this;
    }

    public final RequestCreator g() {
        this.b.d();
        return this;
    }

    public final RequestCreator a(Bitmap.Config config) {
        this.b.g = config;
        return this;
    }

    public final RequestCreator h() {
        this.b.l = true;
        return this;
    }

    public final RequestCreator i() {
        this.b.m = true;
        return this;
    }

    public final RequestCreator a(Animation animation) {
        this.b.o = animation;
        return this;
    }

    public final RequestCreator a(RequestListener requestListener) {
        this.s = requestListener;
        return this;
    }

    public final Bitmap j() throws IOException {
        d a;
        Bitmap bitmap = null;
        if (this.b.a == null) {
            return null;
        }
        System.nanoTime();
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            if (this.d) {
                throw new IllegalStateException("Fit cannot be used with get.");
            }
            if (!this.b.a() || (a = PicassoUtil.a(this.a, this.p, this.b.a, this.o)) == null) {
                return null;
            }
            b b = a.b();
            a(b);
            try {
                try {
                    int i = this.b.b > 0 ? this.b.b : Integer.MIN_VALUE;
                    int i2 = this.b.c > 0 ? this.b.c : Integer.MIN_VALUE;
                    c();
                    Bitmap bitmap2 = (Bitmap) b.a(this.m).c(i, i2).get();
                    try {
                        o();
                        return bitmap2;
                    } catch (InterruptedException e) {
                        bitmap = bitmap2;
                        e = e;
                        e.printStackTrace();
                        a(e);
                        return bitmap;
                    } catch (Exception e2) {
                        bitmap = bitmap2;
                        e = e2;
                        e.printStackTrace();
                        a(e);
                        return bitmap;
                    }
                } finally {
                    q();
                }
            } catch (InterruptedException e3) {
                e = e3;
            } catch (Exception e4) {
                e = e4;
            }
        } else {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.squareup.picasso.RequestCreator$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass1 extends i<PicassoDrawable> {
        final /* synthetic */ Callback a;
        final /* synthetic */ RequestCreator b;

        @Override // com.bumptech.glide.request.target.l
        public final /* bridge */ /* synthetic */ void a(Object obj, e eVar) {
            PicassoDrawable picassoDrawable = (PicassoDrawable) obj;
            if (this.a != null) {
                this.a.a();
            }
            this.b.o();
            RequestCreator.a(this.b, 0);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Drawable drawable) {
            super.a(RequestCreator.a(this.b, drawable));
            RequestCreator.a(this.b, this);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Exception exc, Drawable drawable) {
            super.a(exc, drawable);
            if (this.a != null) {
                this.a.b();
            }
            this.b.o();
            this.b.a(exc);
            RequestCreator.a(this.b, 1);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void b(Drawable drawable) {
            super.b(drawable);
            this.b.o();
            RequestCreator.a(this.b, 2);
        }
    }

    public final Future<File> c(int i, int i2) {
        d a;
        if (this.b.a == null || (a = PicassoUtil.a(this.a, this.p, this.b.a, this.o)) == null) {
            return null;
        }
        return a.b(i, i2);
    }

    public final void k() {
        e(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    private void e(int i, int i2) {
        if (this.b.a == null) {
            return;
        }
        if (this.d) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        d a = PicassoUtil.a(this.a, this.p, this.b.a, this.o);
        if (a == null) {
            return;
        }
        a.a((f) this.x);
        if (this.b.f != null && this.b.f.size() > 0) {
            int size = this.b.f.size();
            com.bumptech.glide.load.resource.bitmap.d[] dVarArr = new com.bumptech.glide.load.resource.bitmap.d[size];
            for (int i3 = 0; i3 < size; i3++) {
                dVarArr[i3] = new TransformationWrapper(this.p.getApplicationContext(), this.b.f.get(i3));
            }
            a.a(dVarArr);
        }
        if (this.b.a()) {
            a(a);
            c();
            a.a(m()).b(n()).d(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.squareup.picasso.RequestCreator$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass2 extends com.bumptech.glide.request.target.b<com.bumptech.glide.load.resource.gif.b> {
        final /* synthetic */ RequestCreator a;

        @Override // com.bumptech.glide.request.target.l
        public final /* bridge */ /* synthetic */ void a(Object obj, e eVar) {
            com.bumptech.glide.load.resource.gif.b bVar = (com.bumptech.glide.load.resource.gif.b) obj;
            Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.NETWORK;
            this.a.o();
            RequestCreator.a(this.a, 0);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Exception exc, Drawable drawable) {
            super.a(exc, drawable);
            this.a.o();
            this.a.a(exc);
            RequestCreator.a(this.a, 1);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Drawable drawable) {
            super.a(RequestCreator.a(this.a, drawable));
            RequestCreator.a(this.a, this);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void b(Drawable drawable) {
            super.b(drawable);
            this.a.o();
            RequestCreator.a(this.a, 2);
        }

        @Override // com.bumptech.glide.request.target.l
        public final void a(final j jVar) {
            PicassoGifDrawableTarget.a(new SizeReadyCallback() { // from class: com.squareup.picasso.RequestCreator.2.1
                @Override // com.squareup.picasso.SizeReadyCallback
                public final void a(int i, int i2) {
                    jVar.a(i, i2);
                }
            });
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(c cVar) {
            super.a(cVar);
            new RequestProxy(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v26, types: [com.bumptech.glide.b] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.bumptech.glide.h] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.squareup.picasso.RequestCreator] */
    public final void a(final PicassoDrawableTarget picassoDrawableTarget) {
        d dVar;
        if (this.b.a == null) {
            return;
        }
        if (this.d) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        d a = PicassoUtil.a(this.a, this.p, this.b.a, this.o);
        if (a == null) {
            return;
        }
        if (this.t) {
            dVar = a.b();
        } else {
            dVar = this.u ? a.c() : null;
        }
        if (dVar != null) {
            a = dVar;
        }
        a.b((f) this.x);
        if (!this.b.a()) {
            Picasso.a(picassoDrawableTarget);
            if (this.e) {
                a.d(m());
                return;
            }
            return;
        }
        a.b(!MemoryPolicy.a(this.h));
        if (!MemoryPolicy.b(this.h)) {
            a.a(com.bumptech.glide.load.engine.b.NONE);
        }
        if (this.e) {
            a.d(m());
        }
        a(a);
        if (!this.b.a()) {
            Picasso.a(picassoDrawableTarget);
            picassoDrawableTarget.onLoadStarted(this.e ? m() : null);
            return;
        }
        picassoDrawableTarget.onLoadStarted(this.e ? m() : null);
        c();
        if (picassoDrawableTarget.target != null) {
            a.c(n()).b(this.m).a((com.bumptech.glide.e) picassoDrawableTarget.target);
        } else {
            picassoDrawableTarget.setTarget(a.c(n()).b(this.m).a((com.bumptech.glide.e) new com.bumptech.glide.request.target.b<PicassoDrawable>() { // from class: com.squareup.picasso.RequestCreator.3
                @Override // com.bumptech.glide.request.target.l
                public final /* synthetic */ void a(Object obj, e eVar) {
                    picassoDrawableTarget.onResourceReady((PicassoDrawable) obj, Picasso.LoadedFrom.NETWORK);
                    RequestCreator.this.o();
                    RequestCreator.a(RequestCreator.this, 0);
                }

                @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
                public final void a(Exception exc, Drawable drawable) {
                    super.a(exc, drawable);
                    picassoDrawableTarget.onLoadFailed(exc, drawable);
                    RequestCreator.this.o();
                    RequestCreator.this.a(exc);
                    RequestCreator.a(RequestCreator.this, 1);
                }

                @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
                public final void a(Drawable drawable) {
                    Drawable a2 = RequestCreator.a(RequestCreator.this, drawable);
                    super.a(a2);
                    picassoDrawableTarget.onLoadStarted(a2);
                    RequestCreator.a(RequestCreator.this, this);
                }

                @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
                public final void b(Drawable drawable) {
                    super.b(drawable);
                    picassoDrawableTarget.onLoadCleared(drawable);
                    RequestCreator.this.o();
                    RequestCreator.a(RequestCreator.this, 2);
                }

                @Override // com.bumptech.glide.request.target.l
                public final void a(final j jVar) {
                    picassoDrawableTarget.getSize(new SizeReadyCallback() { // from class: com.squareup.picasso.RequestCreator.3.1
                        @Override // com.squareup.picasso.SizeReadyCallback
                        public final void a(int i, int i2) {
                            jVar.a(i, i2);
                        }
                    });
                }

                @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
                public final void a(c cVar) {
                    super.a(cVar);
                    picassoDrawableTarget.setRequest(new RequestProxy(cVar));
                }
            }));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.squareup.picasso.RequestCreator$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass4 extends i<Bitmap> {
        final /* synthetic */ BaseTarget a;
        final /* synthetic */ RequestCreator b;

        @Override // com.bumptech.glide.request.target.l
        public final /* synthetic */ void a(Object obj, e eVar) {
            this.a.onBitmapLoaded((Bitmap) obj, Picasso.LoadedFrom.NETWORK);
            this.b.o();
            RequestCreator.a(this.b, 0);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Exception exc, Drawable drawable) {
            super.a(exc, drawable);
            this.a.onBitmapFailed(exc, drawable);
            this.b.o();
            this.b.a(exc);
            RequestCreator.a(this.b, 1);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Drawable drawable) {
            Drawable a = RequestCreator.a(this.b, drawable);
            super.a(a);
            this.a.onPrepareLoad(a);
            RequestCreator.a(this.b, this);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void b(Drawable drawable) {
            super.b(drawable);
            this.b.o();
            RequestCreator.a(this.b, 2);
        }
    }

    public final void a(Target target) {
        a(target, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final void a(final Target target, int i, int i2) {
        d<Uri> a;
        if (this.b.a == null) {
            return;
        }
        if (target == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (this.d) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        if (this.r) {
            Uri b = PicassoUtil.b(this.b.a);
            if (b == null) {
                throw new IllegalArgumentException("url must not be Uri object.");
            }
            a = this.a.d(this.p).a(b);
        } else {
            a = PicassoUtil.a(this.a, this.p, this.b.a, this.o);
        }
        if (a == null) {
            return;
        }
        b<Uri> b2 = a.b();
        b2.a((f<? super Uri, TranscodeType>) this.x);
        if (!this.b.a()) {
            target.onPrepareLoad(this.e ? m() : null);
            return;
        }
        b2.a(!MemoryPolicy.a(this.h));
        target.onPrepareLoad(this.e ? m() : null);
        a(b2);
        c();
        b(b2);
        b2.a(l()).a(m()).b(n()).a(this.m).a((a<Uri, Bitmap>) new i<Bitmap>(i, i2) { // from class: com.squareup.picasso.RequestCreator.5
            @Override // com.bumptech.glide.request.target.l
            public final /* synthetic */ void a(Object obj, e eVar) {
                target.onBitmapLoaded((Bitmap) obj, Picasso.LoadedFrom.NETWORK);
                RequestCreator.this.o();
                RequestCreator.a(RequestCreator.this, 0);
            }

            @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
            public final void a(Exception exc, Drawable drawable) {
                super.a(exc, drawable);
                target.onBitmapFailed(drawable);
                RequestCreator.this.o();
                RequestCreator.this.a(exc);
                RequestCreator.a(RequestCreator.this, 1);
            }

            @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
            public final void a(Drawable drawable) {
                Drawable a2 = RequestCreator.a(RequestCreator.this, drawable);
                super.a(a2);
                target.onPrepareLoad(a2);
                RequestCreator.a(RequestCreator.this, this);
            }

            @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
            public final void b(Drawable drawable) {
                super.b(drawable);
                RequestCreator.this.o();
                RequestCreator.a(RequestCreator.this, 2);
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.squareup.picasso.RequestCreator$7  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass7 extends m<View, Bitmap> {
        final /* synthetic */ Target b;
        final /* synthetic */ Integer c;
        final /* synthetic */ RequestCreator d;

        @Override // com.bumptech.glide.request.target.l
        public final /* synthetic */ void a(Object obj, e eVar) {
            this.b.onBitmapLoaded((Bitmap) obj, Picasso.LoadedFrom.NETWORK);
            this.d.o();
            RequestCreator.a(this.d, 0);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Exception exc, Drawable drawable) {
            super.a(exc, drawable);
            this.b.onBitmapFailed(drawable);
            this.d.a(exc);
            this.d.o();
            RequestCreator.a(this.d, 1);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void b(Drawable drawable) {
            super.b(drawable);
            this.d.o();
            RequestCreator.a(this.d, 2);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Drawable drawable) {
            Drawable a = RequestCreator.a(this.d, drawable);
            super.a(a);
            this.b.onPrepareLoad(a);
            RequestCreator.a(this.d, this);
        }

        @Override // com.bumptech.glide.request.target.m, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(c cVar) {
            if (this.c == null) {
                this.a.setTag(cVar);
            } else {
                this.a.setTag(this.c.intValue(), cVar);
            }
        }

        @Override // com.bumptech.glide.request.target.m, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final c a() {
            Object tag;
            if (this.c == null) {
                tag = this.a.getTag();
            } else {
                tag = this.a.getTag(this.c.intValue());
            }
            if (tag != null) {
                if (tag instanceof c) {
                    return (c) tag;
                }
                throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
            }
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.squareup.picasso.RequestCreator$8  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass8 extends g {
        final /* synthetic */ RequestCreator a;

        @Override // com.bumptech.glide.request.target.g, com.bumptech.glide.request.target.l
        public final /* bridge */ /* synthetic */ void a(Object obj, e eVar) {
            a((Bitmap) obj, (e<? super Bitmap>) eVar);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Drawable drawable) {
            super.a(RequestCreator.a(this.a, drawable));
            RequestCreator.a(this.a, this);
        }

        @Override // com.bumptech.glide.request.target.g
        public final void a(Bitmap bitmap, e<? super Bitmap> eVar) {
            super.a(bitmap, eVar);
            this.a.o();
            RequestCreator.a(this.a, 0);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void b(Drawable drawable) {
            super.b(drawable);
            this.a.o();
            RequestCreator.a(this.a, 2);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Exception exc, Drawable drawable) {
            super.a(exc, drawable);
            this.a.a(exc);
            this.a.o();
            RequestCreator.a(this.a, 1);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.squareup.picasso.RequestCreator$9  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass9 extends com.bumptech.glide.request.target.a {
        final /* synthetic */ RequestCreator a;

        @Override // com.bumptech.glide.request.target.a, com.bumptech.glide.request.target.l
        public final /* bridge */ /* synthetic */ void a(Object obj, e eVar) {
            a((Bitmap) obj, (e<? super Bitmap>) eVar);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Drawable drawable) {
            super.a(RequestCreator.a(this.a, drawable));
            RequestCreator.a(this.a, this);
        }

        @Override // com.bumptech.glide.request.target.a
        public final void a(Bitmap bitmap, e<? super Bitmap> eVar) {
            super.a(bitmap, eVar);
            this.a.o();
            RequestCreator.a(this.a, 0);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void b(Drawable drawable) {
            super.b(drawable);
            this.a.o();
            RequestCreator.a(this.a, 2);
        }

        @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Exception exc, Drawable drawable) {
            super.a(exc, drawable);
            this.a.a(exc);
            this.a.o();
            RequestCreator.a(this.a, 1);
        }
    }

    public final void a(ImageView imageView, int i) {
        a(imageView, null, i, null);
    }

    public final void a(ImageView imageView) {
        a(imageView, null, -1, null);
    }

    public final void a(ImageView imageView, Callback callback) {
        a(imageView, callback, -1, null);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.squareup.picasso.RequestCreator$10  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass10 extends com.bumptech.glide.request.target.c {
        final /* synthetic */ ImageView b;
        final /* synthetic */ RequestCreator c;

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.l
        public final /* synthetic */ void a(Object obj, e eVar) {
            super.a((AnonymousClass10) ((Bitmap) obj), (e<? super AnonymousClass10>) eVar);
            RequestCreator.b(this.c);
            this.c.o();
            RequestCreator.a(this.c, 0);
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Drawable drawable) {
            super.a(RequestCreator.a(this.c, drawable, this.b));
            RequestCreator.a(this.c, this);
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Exception exc, Drawable drawable) {
            super.a(exc, drawable);
            RequestCreator.b(this.c);
            this.c.a(exc);
            this.c.o();
            RequestCreator.a(this.c, 1);
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void b(Drawable drawable) {
            super.b(drawable);
            RequestCreator.b(this.c);
            this.c.o();
            RequestCreator.a(this.c, 2);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.squareup.picasso.RequestCreator$11  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass11 extends com.bumptech.glide.request.target.d {
        final /* synthetic */ ImageView b;
        final /* synthetic */ RequestCreator c;

        @Override // com.bumptech.glide.request.target.d, com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.l
        public final /* bridge */ /* synthetic */ void a(Object obj, e eVar) {
            a((PicassoDrawable) obj, (e<? super PicassoDrawable>) eVar);
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Drawable drawable) {
            super.a(RequestCreator.a(this.c, drawable, this.b));
            RequestCreator.a(this.c, this);
        }

        @Override // com.bumptech.glide.request.target.d
        public final void a(PicassoDrawable picassoDrawable, e<? super PicassoDrawable> eVar) {
            super.a(picassoDrawable, eVar);
            RequestCreator.b(this.c);
            this.c.o();
            RequestCreator.a(this.c, 0);
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Exception exc, Drawable drawable) {
            super.a(exc, drawable);
            RequestCreator.b(this.c);
            this.c.a(exc);
            this.c.o();
            RequestCreator.a(this.c, 1);
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void b(Drawable drawable) {
            super.b(drawable);
            RequestCreator.b(this.c);
            this.c.o();
            RequestCreator.a(this.c, 2);
        }
    }

    public final void a(final ImageView imageView, final Callback callback, int i, final PicassoDrawableTarget picassoDrawableTarget) {
        d<Uri> a;
        com.bumptech.glide.e eVar = null;
        final com.bumptech.glide.load.c a2 = (imageView == null || this.B == null) ? null : com.squareup.picasso.progressive.d.a(new String(this.B), this.b.b, this.b.c, System.currentTimeMillis(), imageView.hashCode(), this.f, this.c, false, 0, false);
        if (this.r) {
            a = this.a.d(this.p).a(PicassoUtil.b(this.b.a));
        } else {
            a = PicassoUtil.a(this.a, this.p, this.b.a, this.o);
        }
        if (a == null) {
            return;
        }
        if (this.t) {
            eVar = a.b();
        } else if (this.u) {
            eVar = a.c();
        }
        d<Uri> dVar = eVar == null ? a : eVar;
        dVar.b(this.x);
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (this.e) {
            dVar.d(m());
        }
        a(dVar);
        b(dVar);
        if (picassoDrawableTarget != null && picassoDrawableTarget.target != null) {
            dVar.b(this.m).a((com.bumptech.glide.e) picassoDrawableTarget.target);
        } else if (dVar instanceof b) {
            final com.bumptech.glide.load.c cVar = a2;
            com.bumptech.glide.request.target.c cVar2 = new com.bumptech.glide.request.target.c(imageView) { // from class: com.squareup.picasso.RequestCreator.12
                @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.l
                public final /* synthetic */ void a(Object obj, e eVar2) {
                    super.a((AnonymousClass12) ((Bitmap) obj), (e<? super AnonymousClass12>) eVar2);
                    if (callback != null) {
                        callback.a();
                    }
                    RequestCreator.b(RequestCreator.this);
                    RequestCreator.this.o();
                    RequestCreator.a(RequestCreator.this, 0);
                }

                @Override // com.bumptech.glide.request.target.m, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
                public final void a(c cVar3) {
                    super.a(cVar3);
                    if (cVar != null) {
                        com.squareup.picasso.progressive.d.a(RequestCreator.this.B, cVar, imageView);
                    }
                    RequestCreator.this.c();
                }

                @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
                public final void a(Drawable drawable) {
                    super.a(RequestCreator.a(RequestCreator.this, drawable, imageView));
                    RequestCreator.a(RequestCreator.this, this);
                }

                @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
                public final void a(Exception exc, Drawable drawable) {
                    super.a(exc, drawable);
                    if (callback != null) {
                        callback.b();
                    }
                    RequestCreator.b(RequestCreator.this);
                    RequestCreator.this.a(exc);
                    RequestCreator.this.o();
                    RequestCreator.a(RequestCreator.this, 1);
                }

                @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
                public final void b(Drawable drawable) {
                    super.b(drawable);
                    RequestCreator.b(RequestCreator.this);
                    RequestCreator.this.o();
                    RequestCreator.a(RequestCreator.this, 2);
                }
            };
            if (picassoDrawableTarget != null) {
                picassoDrawableTarget.setTarget(cVar2);
            }
            dVar.b(this.m).a((com.bumptech.glide.e) cVar2);
        } else {
            DrawableImageViewTarget drawableImageViewTarget = new DrawableImageViewTarget(imageView, i) { // from class: com.squareup.picasso.RequestCreator.13
                @Override // com.squareup.picasso.DrawableImageViewTarget, com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.l
                public final /* bridge */ /* synthetic */ void a(Object obj, e eVar2) {
                    a((PicassoDrawable) obj, (e<? super PicassoDrawable>) eVar2);
                }

                @Override // com.bumptech.glide.request.target.m, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
                public final void a(c cVar3) {
                    super.a(cVar3);
                    if (a2 != null) {
                        com.squareup.picasso.progressive.d.a(RequestCreator.this.B, a2, imageView);
                    }
                    RequestCreator.this.c();
                }

                @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
                public final void a(Drawable drawable) {
                    Drawable a3 = RequestCreator.a(RequestCreator.this, drawable, imageView);
                    super.a(a3);
                    if (picassoDrawableTarget != null) {
                        picassoDrawableTarget.onLoadStarted(a3);
                    }
                    RequestCreator.a(RequestCreator.this, this);
                }

                @Override // com.squareup.picasso.DrawableImageViewTarget
                public final void a(PicassoDrawable picassoDrawable, e<? super PicassoDrawable> eVar2) {
                    if (picassoDrawableTarget == null || !picassoDrawableTarget.isUserControl) {
                        super.a(picassoDrawable, eVar2);
                    }
                    if (callback != null) {
                        callback.a();
                    }
                    RequestCreator.b(RequestCreator.this);
                    RequestCreator.this.o();
                    if (picassoDrawableTarget != null) {
                        picassoDrawableTarget.animation = eVar2;
                        picassoDrawableTarget.onResourceReady(picassoDrawable, Picasso.LoadedFrom.NETWORK);
                    }
                    RequestCreator.a(RequestCreator.this, 0);
                }

                @Override // com.squareup.picasso.DrawableImageViewTarget, com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
                public final void a(Exception exc, Drawable drawable) {
                    if (picassoDrawableTarget == null || !picassoDrawableTarget.isUserControl) {
                        super.a(exc, drawable);
                    }
                    if (callback != null) {
                        callback.b();
                    }
                    RequestCreator.b(RequestCreator.this);
                    RequestCreator.this.a(exc);
                    RequestCreator.this.o();
                    if (picassoDrawableTarget != null) {
                        picassoDrawableTarget.onLoadFailed(exc, drawable);
                    }
                    RequestCreator.a(RequestCreator.this, 1);
                }

                @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
                public final void b(Drawable drawable) {
                    super.b(drawable);
                    RequestCreator.b(RequestCreator.this);
                    RequestCreator.this.o();
                    if (picassoDrawableTarget != null) {
                        picassoDrawableTarget.onLoadCleared(drawable);
                    }
                    RequestCreator.a(RequestCreator.this, 2);
                }
            };
            if (picassoDrawableTarget != null) {
                picassoDrawableTarget.setTarget(drawableImageViewTarget);
            }
            dVar.b(this.m).a((com.bumptech.glide.e) drawableImageViewTarget);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.squareup.picasso.RequestCreator$14  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass14 extends com.bumptech.glide.request.target.c {
        final /* synthetic */ com.bumptech.glide.load.c b;
        final /* synthetic */ ImageView c;
        final /* synthetic */ RequestCreator d;

        @Override // com.bumptech.glide.request.target.c, com.bumptech.glide.request.target.e
        public final /* bridge */ /* synthetic */ void a(Bitmap bitmap) {
            super.a(bitmap);
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.l
        public final /* synthetic */ void a(Object obj, e eVar) {
            super.a((AnonymousClass14) ((Bitmap) obj), (e<? super AnonymousClass14>) eVar);
            RequestCreator.b(this.d);
            this.d.o();
            RequestCreator.a(this.d, 0);
        }

        @Override // com.bumptech.glide.request.target.m, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(c cVar) {
            super.a(cVar);
            if (this.b != null) {
                com.squareup.picasso.progressive.d.a(this.d.B, this.b, this.c);
            }
            this.d.c();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bumptech.glide.request.target.c
        public final void a(Bitmap bitmap) {
            super.a(bitmap);
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.animation.e.a
        public final void c(Drawable drawable) {
            super.c(drawable);
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Drawable drawable) {
            super.a(RequestCreator.a(this.d, drawable, this.c));
            RequestCreator.a(this.d, this);
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void a(Exception exc, Drawable drawable) {
            super.a(exc, drawable);
            RequestCreator.b(this.d);
            this.d.a(exc);
            this.d.o();
            RequestCreator.a(this.d, 1);
        }

        @Override // com.bumptech.glide.request.target.e, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.l
        public final void b(Drawable drawable) {
            super.b(drawable);
            RequestCreator.b(this.d);
            this.d.o();
            RequestCreator.a(this.d, 2);
        }
    }

    public final PicassoTarget d(int i, int i2) {
        d<Uri> a;
        h<Uri> hVar = null;
        if (this.b.a == null) {
            return null;
        }
        if (this.r) {
            Uri b = PicassoUtil.b(this.b.a);
            if (b == null) {
                throw new IllegalArgumentException("url must not be Uri object.");
            }
            a = this.a.d(this.p).a(b);
        } else {
            a = PicassoUtil.a(this.a, this.p, this.b.a, this.o);
        }
        if (a == null) {
            return null;
        }
        if (this.t) {
            hVar = a.b();
        } else if (this.u) {
            hVar = a.c();
        }
        if (hVar != null) {
            a = hVar;
        }
        a.b(this.x);
        a.b(!MemoryPolicy.a(this.h));
        if (!MemoryPolicy.b(this.h)) {
            a.a(com.bumptech.glide.load.engine.b.NONE);
        }
        if (this.e) {
            a.d(m());
        }
        a(a);
        c();
        return new PicassoTarget(a.b(this.m).c(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    private com.bumptech.glide.e p() {
        d<Uri> a;
        h<Uri> hVar = null;
        if (this.b.a == null) {
            return null;
        }
        if (this.r) {
            Uri b = PicassoUtil.b(this.b.a);
            if (b == null) {
                throw new IllegalArgumentException("url must not be Uri object.");
            }
            a = this.a.d(this.p).a(b);
        } else {
            a = PicassoUtil.a(this.a, this.p, this.b.a, this.o);
        }
        if (a == null) {
            return null;
        }
        if (this.t) {
            hVar = a.b();
        } else if (this.u) {
            hVar = a.c();
        }
        if (hVar != null) {
            a = hVar;
        }
        a.b(!MemoryPolicy.a(this.h));
        if (!MemoryPolicy.b(this.h)) {
            a.a(com.bumptech.glide.load.engine.b.NONE);
        }
        if (this.e) {
            a.d(m());
        }
        a(a);
        c();
        return a;
    }

    private void b(com.bumptech.glide.e eVar) {
        if (eVar instanceof b) {
            if (this.b.p) {
                ((b) eVar).b();
            }
            if (this.b.q) {
                ((b) eVar).a();
            }
        }
    }

    public void a(com.bumptech.glide.e eVar) {
        if (this.b == null) {
            return;
        }
        if (this.b.m) {
            eVar.e();
        }
        c(eVar);
        if (NetworkPolicy.a(this.z) && this.b.a != null) {
            Picasso.a(PicassoUtil.a(this.b.a));
        }
        if (this.g != 0) {
            eVar.a(this.g);
        } else if (this.j != null) {
            eVar.c(this.j);
        }
        if (this.k != null) {
            com.bumptech.glide.load.engine.b bVar = com.bumptech.glide.load.engine.b.NONE;
            if (DiskCacheStrategy.ALL == this.k) {
                bVar = com.bumptech.glide.load.engine.b.ALL;
            } else if (DiskCacheStrategy.NONE == this.k) {
                bVar = com.bumptech.glide.load.engine.b.NONE;
            } else if (DiskCacheStrategy.RESULT == this.k) {
                bVar = com.bumptech.glide.load.engine.b.RESULT;
            } else if (DiskCacheStrategy.SOURCE == this.k) {
                bVar = com.bumptech.glide.load.engine.b.SOURCE;
            }
            eVar.a(bVar);
        }
        eVar.g = this.l;
        if (com.bumptech.glide.util.h.a(this.b.b, this.b.c)) {
            eVar.a(this.b.b, this.b.c);
        }
        if (this.b.b()) {
            int i = l.c;
            if (this.b.h == Picasso.Priority.priority) {
                i = l.e;
            } else if (this.b.h == Picasso.Priority.HIGH) {
                i = l.b;
            } else if (this.b.h == Picasso.Priority.IMMEDIATE) {
                i = l.a;
            } else if (this.b.h == Picasso.Priority.LOW) {
                i = l.d;
            } else if (this.b.h == Picasso.Priority.NORMAL) {
                i = l.c;
            }
            eVar.b(i);
        }
        if (this.b.l) {
            if (eVar instanceof d) {
                ((d) eVar).a();
            } else if (eVar instanceof b) {
                ((b) eVar).c();
            } else if (eVar instanceof h) {
                ((h) eVar).a();
            }
        }
        if (this.b.r != null && this.b.r.floatValue() >= 0.0f && this.b.r.floatValue() <= 1.0f) {
            eVar.a(this.b.r.floatValue());
        }
        if (this.b.n) {
            eVar.f();
        }
        if (this.E != null) {
            eVar.a(this.E.p());
        }
        if (this.F != null && this.F.floatValue() >= 0.0f && this.F.floatValue() <= 1.0f) {
            eVar.b(this.F.floatValue());
        }
        eVar.b(this.b.j);
        if (this.b.o != null) {
            eVar.a(this.b.o);
        }
        if (com.bumptech.glide.util.h.a(this.b.b, this.b.c)) {
            eVar.a(this.b.b, this.b.c);
        }
        if (this.s != null) {
            this.x.a = this.s;
        }
        if (this.v != null) {
            eVar.b(new PicassoImageVideoBitmapDecoder(this.v));
        }
        if (this.w != null) {
            eVar.a((com.bumptech.glide.load.e) new PicassoFileToStreamDecoder(this.w));
        }
    }

    public com.bumptech.glide.load.a l() {
        if (this.b.i != null) {
            com.bumptech.glide.load.a aVar = com.bumptech.glide.load.a.PREFER_RGB_565;
            if (this.b.i == DecodeFormat.ALWAYS_ARGB_8888) {
                return com.bumptech.glide.load.a.ALWAYS_ARGB_8888;
            }
            if (this.b.i == DecodeFormat.PREFER_ARGB_8888) {
                return com.bumptech.glide.load.a.PREFER_ARGB_8888;
            }
            return this.b.i == DecodeFormat.PREFER_RGB_565 ? com.bumptech.glide.load.a.PREFER_RGB_565 : aVar;
        }
        return com.bumptech.glide.load.a.d;
    }

    private void c(com.bumptech.glide.e eVar) {
        ArrayList arrayList = new ArrayList();
        if (this.b.k || this.b.e) {
            arrayList.add(new com.bumptech.glide.load.resource.bitmap.i(this.p.getApplicationContext()));
        }
        if (this.b.d) {
            arrayList.add(new com.bumptech.glide.load.resource.bitmap.e(this.p.getApplicationContext()));
        }
        if (this.b.f != null && this.b.f.size() > 0) {
            int size = this.b.f.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new TransformationWrapper(this.p.getApplicationContext(), this.b.f.get(i)));
            }
        }
        if (arrayList.size() == 0) {
            return;
        }
        com.bumptech.glide.load.resource.bitmap.d[] dVarArr = (com.bumptech.glide.load.resource.bitmap.d[]) arrayList.toArray(new com.bumptech.glide.load.resource.bitmap.d[arrayList.size()]);
        if (eVar instanceof d) {
            ((d) eVar).a(dVarArr);
        } else if (eVar instanceof b) {
            ((b) eVar).a(dVarArr);
        } else if (eVar instanceof h) {
            ((h) eVar).a(dVarArr);
        } else {
            eVar.a((com.bumptech.glide.load.g[]) dVarArr);
        }
    }

    private void q() {
        if (this.b == null || this.b.a == null || TextUtils.isEmpty(PicassoUtil.a(this.b.a))) {
            return;
        }
        Picasso.b(PicassoUtil.a(this.b.a));
    }

    public Drawable m() {
        if (this.f != 0) {
            return this.a.a().getApplicationContext().getResources().getDrawable(this.f);
        }
        return this.i;
    }

    private Size a(Transformation transformation, View view, Bitmap bitmap) {
        Size size = null;
        if (this.b != null && this.b.b > 0 && this.b.c > 0) {
            size = new Size(this.b.b, this.b.c);
        } else if (view != null) {
            m<View, Object> mVar = new m<View, Object>(view) { // from class: com.squareup.picasso.RequestCreator.15
                @Override // com.bumptech.glide.request.target.l
                public final void a(Object obj, e<? super Object> eVar) {
                }
            };
            PlaceHolderSizeCallback placeHolderSizeCallback = new PlaceHolderSizeCallback(this, null);
            mVar.a(placeHolderSizeCallback);
            size = placeHolderSizeCallback.a;
        }
        return (size != null || bitmap == null) ? size : new Size(bitmap.getWidth(), bitmap.getHeight());
    }

    public Drawable n() {
        if (this.g != 0) {
            return this.a.a().getApplicationContext().getResources().getDrawable(this.g);
        }
        return this.j;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class ResizeTransformation extends com.bumptech.glide.load.resource.bitmap.d {
        private int a;
        private int b;

        @Override // com.bumptech.glide.load.resource.bitmap.d
        public final Bitmap a(com.bumptech.glide.load.engine.bitmap_recycle.c cVar, Bitmap bitmap, int i, int i2) {
            float f;
            float f2;
            float f3;
            float f4;
            if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                return bitmap;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if ((this.a == 0 && this.b == 0) || (this.a == width && this.b == height)) {
                return bitmap;
            }
            if (this.a != 0) {
                f = this.a;
                f2 = width;
            } else {
                f = this.b;
                f2 = height;
            }
            float f5 = f / f2;
            if (this.b != 0) {
                f3 = this.b;
                f4 = height;
            } else {
                f3 = this.a;
                f4 = width;
            }
            float f6 = f3 / f4;
            Rect rect = new Rect(0, 0, width, height);
            Rect rect2 = new Rect(0, 0, (int) (width * f5), (int) (height * f6));
            Bitmap a = cVar.a(rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
            if (a == null) {
                a = Bitmap.createBitmap(rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
            }
            Canvas canvas = new Canvas(a);
            Paint paint = new Paint();
            paint.setDither(true);
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            return a;
        }

        @Override // com.bumptech.glide.load.g
        public final String a() {
            return "ResizeTransformation[" + this.a + CommonConstant.Symbol.COMMA + this.b + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class Size {
        private final int a;
        private final int b;

        public Size(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class PlaceHolderSizeCallback implements j {
        Size a;

        private PlaceHolderSizeCallback() {
        }

        /* synthetic */ PlaceHolderSizeCallback(RequestCreator requestCreator, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.bumptech.glide.request.target.j
        public final void a(int i, int i2) {
            this.a = new Size(i, i2);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class TransformationWrapper extends com.bumptech.glide.load.resource.bitmap.d {
        private Transformation a;

        public TransformationWrapper(Context context, Transformation transformation) {
            super(context);
            this.a = transformation;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d
        public final Bitmap a(com.bumptech.glide.load.engine.bitmap_recycle.c cVar, Bitmap bitmap, int i, int i2) {
            if (this.a instanceof BitmapTransformation) {
                ((BitmapTransformation) this.a).a(i, i2);
            }
            return this.a.a(bitmap);
        }

        @Override // com.bumptech.glide.load.g
        public final String a() {
            return this.a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (!TextUtils.isEmpty(this.B)) {
            Progress.a(this.B);
        }
        q();
    }

    static /* synthetic */ Drawable a(RequestCreator requestCreator, Drawable drawable) {
        Bitmap bitmap;
        if (!(drawable instanceof BitmapDrawable) || requestCreator.D == null || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null) {
            return drawable;
        }
        Size size = null;
        for (Transformation transformation : requestCreator.D) {
            if (transformation instanceof BitmapTransformation) {
                if (size == null) {
                    size = requestCreator.a(transformation, (View) null, bitmap);
                }
                ((BitmapTransformation) transformation).a(size.a, size.b);
            }
            bitmap = transformation.a(bitmap);
        }
        return new BitmapDrawable(bitmap);
    }

    static /* synthetic */ void a(RequestCreator requestCreator, com.bumptech.glide.request.target.l lVar) {
        Picasso.e.a(lVar);
        Picasso.a(requestCreator.m, PicassoUtil.a(requestCreator.b.a));
    }

    static /* synthetic */ void a(RequestCreator requestCreator, int i) {
        if (requestCreator.A) {
            return;
        }
        requestCreator.A = true;
        Picasso.a(requestCreator.m, PicassoUtil.a(requestCreator.b.a), i);
    }

    static /* synthetic */ Drawable a(RequestCreator requestCreator, Drawable drawable, ImageView imageView) {
        Bitmap bitmap;
        Size a;
        if (!(drawable instanceof BitmapDrawable) || requestCreator.D == null || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null) {
            return drawable;
        }
        for (Transformation transformation : requestCreator.D) {
            if ((transformation instanceof BitmapTransformation) && (a = requestCreator.a(transformation, imageView, bitmap)) != null) {
                ((BitmapTransformation) transformation).a(a.a, a.b);
            }
            bitmap = transformation.a(bitmap);
        }
        return new BitmapDrawable(bitmap);
    }

    static /* synthetic */ void b(RequestCreator requestCreator) {
        TextUtils.isEmpty(requestCreator.B);
    }
}
