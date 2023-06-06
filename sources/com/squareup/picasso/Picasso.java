package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.support.constraint.R;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Pair;
import com.bumptech.glide.i;
import com.bumptech.glide.k;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.model.d;
import com.bumptech.glide.load.model.j;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.manager.j;
import com.bumptech.glide.request.f;
import com.dianping.picasso.PicassoUtils;
import com.squareup.picasso.load.data.c;
import com.squareup.picasso.model.b;
import com.squareup.picasso.model.c;
import com.squareup.picasso.model.e;
import com.tencent.mapsdk.internal.jw;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes6.dex */
public final class Picasso extends k {
    private static b A;
    private static boolean B;
    static volatile e d;
    static RequestMonitor e;
    static volatile Picasso f;
    static volatile a g;
    private static int j;
    private static f u;
    private static volatile c v;
    private static MtPicassoRequestListener w;
    private static volatile PicassoRequestListener x;
    private static b z;
    public Object h;
    public ExtraHandler i;
    private static final String[] k = {PicassoUtils.DEF_TYPE, "drawable-ldpi", "drawable-mdpi", "drawable-hdpi", "drawable-xhdpi", "drawable-xxhdpi", "drawable-xxxhdpi", "drawable-nodpi"};
    private static Map<String, String> l = new ArrayMap();
    private static Map<String, Pair> m = new ArrayMap();
    private static Set<String> n = new HashSet();
    private static boolean o = false;
    private static boolean p = false;
    private static volatile boolean q = false;
    private static volatile boolean r = false;
    private static final Object s = new Object();
    private static List<String> t = new LinkedList();
    private static ArrayList<RequestMonitor> y = new ArrayList<>();

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface ExtraHandler {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface Listener {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface PicassoRequestListener {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum Priority {
        IMMEDIATE,
        HIGH,
        NORMAL,
        LOW,
        priority
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface RequestMonitor<T, R> {
        void a(Exception exc, T t, Object obj, boolean z);

        void a(Object obj);

        void a(R r, T t, Object obj, boolean z, boolean z2);
    }

    static {
        b.a aVar = new b.a();
        aVar.a.a = 209715200;
        z = aVar.a;
        e = new RequestMonitor() { // from class: com.squareup.picasso.Picasso.1
            @Override // com.squareup.picasso.Picasso.RequestMonitor
            public final void a(Object obj) {
                Object[] a = a();
                if (a != null) {
                    for (Object obj2 : a) {
                        ((RequestMonitor) obj2).a(obj);
                    }
                }
            }

            @Override // com.squareup.picasso.Picasso.RequestMonitor
            public final void a(Exception exc, Object obj, Object obj2, boolean z2) {
                Object[] a = a();
                if (a != null) {
                    for (Object obj3 : a) {
                        ((RequestMonitor) obj3).a(exc, obj, obj2, z2);
                    }
                }
            }

            @Override // com.squareup.picasso.Picasso.RequestMonitor
            public final void a(Object obj, Object obj2, Object obj3, boolean z2, boolean z3) {
                Object[] a = a();
                if (a != null) {
                    for (Object obj4 : a) {
                        ((RequestMonitor) obj4).a(obj, obj2, obj3, z2, z3);
                    }
                }
            }

            private static Object[] a() {
                Object[] array;
                synchronized (Picasso.y) {
                    array = Picasso.y.size() > 0 ? Picasso.y.toArray() : null;
                }
                return array;
            }
        };
        f = null;
        g = null;
    }

    public static void a(c cVar) {
        v = cVar;
    }

    public static void a(boolean z2) {
        B = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, String str2) {
        if (x != null && TextUtils.isEmpty(str)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, String str2, int i) {
        if (x != null && TextUtils.isEmpty(str)) {
        }
    }

    public static f d() {
        return u;
    }

    public static void a(MtPicassoRequestListener mtPicassoRequestListener) {
        w = mtPicassoRequestListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MtPicassoRequestListener e() {
        return w;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (t) {
            if (t == null) {
                t = new LinkedList();
            }
            t.add(str);
        }
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (t) {
            if (t != null && t.size() > 0) {
                t.remove(str);
            }
        }
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (t) {
            if (t != null && t.size() > 0 && !TextUtils.isEmpty(str)) {
                for (int i = 0; i < t.size(); i++) {
                    if (TextUtils.equals(t.get(i), str)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    Picasso(Context context) {
        super(context);
    }

    public static void a(BaseTarget baseTarget) {
        k.a(baseTarget.target);
    }

    public static void a(PicassoDrawableTarget picassoDrawableTarget) {
        k.a(picassoDrawableTarget.target);
    }

    public static synchronized void c(Context context) {
        synchronized (Picasso.class) {
            a(context, v);
        }
    }

    private static synchronized void a(Context context, c cVar) {
        synchronized (Picasso.class) {
            a(context, cVar, z);
        }
    }

    private static synchronized void a(Context context, final c cVar, b bVar) {
        synchronized (Picasso.class) {
            if (q) {
                return;
            }
            b(context);
            if (cVar != null) {
                a.a(d.class, InputStream.class, new m<d, InputStream>() { // from class: com.squareup.picasso.Picasso.2
                    @Override // com.bumptech.glide.load.model.m
                    public final l<d, InputStream> a(Context context2, com.bumptech.glide.load.model.c cVar2) {
                        return new l<d, InputStream>() { // from class: com.squareup.picasso.Picasso.2.1
                            @Override // com.bumptech.glide.load.model.l
                            public final /* synthetic */ com.bumptech.glide.load.data.c<InputStream> a(d dVar, int i, int i2) {
                                com.squareup.picasso.model.d dVar2;
                                d dVar3 = dVar;
                                URL url = dVar3.a;
                                String str = dVar3.b;
                                Map<String, String> a = dVar3.a();
                                Object obj = dVar3.c;
                                c.a aVar = new c.a();
                                if (a != null) {
                                    for (Map.Entry<String, String> entry : a.entrySet()) {
                                        aVar.a(entry.getKey(), entry.getValue());
                                    }
                                }
                                if (url != null) {
                                    dVar2 = new com.squareup.picasso.model.d(url, aVar.a());
                                } else {
                                    dVar2 = str != null ? new com.squareup.picasso.model.d(str, aVar.a()) : null;
                                }
                                if (dVar2 == null) {
                                    dVar2 = null;
                                } else {
                                    dVar2.c = obj;
                                }
                                final com.squareup.picasso.load.data.a<InputStream> a2 = com.squareup.picasso.load.data.c.this.a(dVar2, i, i2);
                                return new com.bumptech.glide.load.data.c<InputStream>() { // from class: com.squareup.picasso.Picasso.2.1.1
                                    @Override // com.bumptech.glide.load.data.c
                                    public final void a() {
                                        a2.a();
                                    }

                                    @Override // com.bumptech.glide.load.data.c
                                    public final String b() {
                                        return a2.b();
                                    }

                                    @Override // com.bumptech.glide.load.data.c
                                    public void cancel() {
                                        a2.cancel();
                                    }

                                    @Override // com.bumptech.glide.load.data.c
                                    public final /* synthetic */ InputStream a(int i3) throws Exception {
                                        return (InputStream) a2.c();
                                    }
                                };
                            }
                        };
                    }
                });
            }
            k.c = new InputStreamWrapperImpl();
            j.a().a(context.getApplicationContext());
            A = bVar;
            q = true;
        }
    }

    public static <T, Y> void a(Context context, Class<T> cls, Class<Y> cls2, final com.squareup.picasso.load.data.b<T, Y> bVar) {
        b(context);
        a.a(cls, cls2, new m<T, Y>() { // from class: com.squareup.picasso.Picasso.3
            @Override // com.bumptech.glide.load.model.m
            public final l<T, Y> a(Context context2, com.bumptech.glide.load.model.c cVar) {
                return new l<T, Y>() { // from class: com.squareup.picasso.Picasso.3.1
                    @Override // com.bumptech.glide.load.model.l
                    public final com.bumptech.glide.load.data.c<Y> a(T t2, int i, int i2) {
                        final com.squareup.picasso.load.data.a<Y> a = com.squareup.picasso.load.data.b.this.a(t2, i, i2);
                        return new com.bumptech.glide.load.data.c<Y>() { // from class: com.squareup.picasso.Picasso.3.1.1
                            @Override // com.bumptech.glide.load.data.c
                            public final Y a(int i3) throws Exception {
                                return (Y) a.c();
                            }

                            @Override // com.bumptech.glide.load.data.c
                            public final void a() {
                                a.a();
                            }

                            @Override // com.bumptech.glide.load.data.c
                            public final String b() {
                                return a.b();
                            }

                            @Override // com.bumptech.glide.load.data.c
                            public void cancel() {
                                a.cancel();
                            }
                        };
                    }
                };
            }
        });
    }

    public final RequestCreator a(Uri uri) {
        return new RequestCreator(this, uri, this.b, B);
    }

    private static com.bumptech.glide.load.model.e a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        j.a aVar = new j.a();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            aVar.a(entry.getKey(), entry.getValue());
        }
        return aVar.a();
    }

    public final RequestCreator a(Object obj) {
        return new RequestCreator(this, obj, this.b, B);
    }

    public final RequestCreator a(byte[] bArr) {
        return new RequestCreator(this, bArr, this.b);
    }

    public final RequestCreator d(String str) {
        return new RequestCreator(this, str, this.b, B);
    }

    public final RequestCreator a(File file) {
        return new RequestCreator(this, file, this.b);
    }

    public final RequestCreator a(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Resource ID must not be zero.");
        }
        return new RequestCreator(this, Integer.valueOf(i), this.b);
    }

    public final RequestCreator b(Uri uri) {
        RequestCreator requestCreator = new RequestCreator(this, uri, this.b);
        requestCreator.r = true;
        return requestCreator;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.squareup.picasso.Picasso$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass4 implements BitmapStreamDecoder {
        final /* synthetic */ Pair a;
        final /* synthetic */ Picasso b;

        @Override // com.squareup.picasso.BitmapStreamDecoder
        public final Bitmap a(InputStream inputStream, int i, int i2) {
            int a = Picasso.a(this.b, (String) this.a.first);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = a > 0;
            options.inDensity = a;
            options.inTargetDensity = Picasso.j;
            return com.sankuai.waimai.launcher.util.image.a.a(inputStream, (Rect) null, options);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.squareup.picasso.Picasso$5  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass5 implements BitmapStreamDecoder {
        final /* synthetic */ Pair a;
        final /* synthetic */ Picasso b;

        @Override // com.squareup.picasso.BitmapStreamDecoder
        public final Bitmap a(InputStream inputStream, int i, int i2) {
            int a = Picasso.a(this.b, (String) this.a.first);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = a > 0;
            options.inDensity = a;
            options.inTargetDensity = Picasso.j;
            return com.sankuai.waimai.launcher.util.image.a.a(inputStream, (Rect) null, options);
        }
    }

    @Override // com.bumptech.glide.k
    public final void c() {
        super.c();
    }

    @Override // com.bumptech.glide.k
    public final void a(Context context, int i) {
        super.a(context, i);
    }

    public static Picasso g(Context context) {
        if (!q) {
            c(context);
        }
        com.bumptech.glide.request.target.m.a((int) R.id.mtpicasso_view_target);
        if (f == null) {
            synchronized (Picasso.class) {
                if (f == null) {
                    f = new Picasso(new Builder(context).a);
                }
            }
        }
        if (g == null) {
            synchronized (Picasso.class) {
                if (g == null) {
                    final Context applicationContext = context.getApplicationContext();
                    g = new LazyDiskCache() { // from class: com.squareup.picasso.Picasso.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.squareup.picasso.Picasso.LazyDiskCache
                        protected final a a() {
                            if (Picasso.A != null) {
                                return new com.squareup.picasso.progressive.f(applicationContext, Picasso.A.a).a();
                            }
                            return new com.squareup.picasso.progressive.f(applicationContext).a();
                        }
                    };
                }
            }
        }
        return f;
    }

    public static a f() {
        return g;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class Builder {
        final Context a;

        public Builder(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.a = context.getApplicationContext();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(SupportMenu.CATEGORY_MASK);
        
        final int d;

        LoadedFrom(int i) {
            this.d = i;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static abstract class LazyDiskCache implements a {
        private volatile a a;

        protected abstract a a();

        private LazyDiskCache() {
        }

        private a b() {
            if (this.a == null) {
                synchronized (this) {
                    if (this.a == null) {
                        this.a = a();
                    }
                }
            }
            return this.a;
        }

        @Override // com.bumptech.glide.load.engine.cache.a
        public final File a(com.bumptech.glide.load.c cVar) {
            a b = b();
            if (b == null) {
                return null;
            }
            return b.a(cVar);
        }

        @Override // com.bumptech.glide.load.engine.cache.a
        public final void a(com.bumptech.glide.load.c cVar, a.b bVar) {
            a b = b();
            if (b != null) {
                b.a(cVar, bVar);
            }
        }

        @Override // com.bumptech.glide.load.engine.cache.a
        public final void b(com.bumptech.glide.load.c cVar) {
            a b = b();
            if (b != null) {
                b.b(cVar);
            }
        }
    }

    public static void a(PicassoTarget picassoTarget) {
        k.a(picassoTarget.b);
    }

    public final com.bumptech.glide.m d(Context context) {
        return i.b(context);
    }

    public final RequestCreator a(com.squareup.picasso.model.d dVar) {
        d dVar2;
        if (dVar.a != null) {
            if (dVar.b() == null) {
                dVar2 = new d(dVar.a);
            } else {
                dVar2 = new d(dVar.a, a(dVar.b()));
            }
        } else if (TextUtils.isEmpty(dVar.b)) {
            dVar2 = null;
        } else if (dVar.b() == null) {
            dVar2 = new d(dVar.b);
        } else {
            dVar2 = new d(dVar.b, a(dVar.b()));
        }
        return new RequestCreator(this, dVar2, this.b);
    }

    public static void e(Context context) {
        i.b(context).b();
    }

    public static void f(Context context) {
        i.b(context).a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static /* synthetic */ int a(Picasso picasso, String str) {
        char c;
        switch (str.hashCode()) {
            case -2091114556:
                if (str.equals("drawable-hdpi")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -2090995392:
                if (str.equals("drawable-ldpi")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2090965601:
                if (str.equals("drawable-mdpi")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -826507106:
                if (str.equals(PicassoUtils.DEF_TYPE)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -385157506:
                if (str.equals("drawable-xhdpi")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -292878530:
                if (str.equals("drawable-xxxhdpi")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 959903492:
                if (str.equals("drawable-xxhdpi")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 120;
            case 1:
            case 2:
                return 160;
            case 3:
                return 240;
            case 4:
                return jw.e;
            case 5:
                return jw.g;
            case 6:
                return jw.h;
            default:
                return 0;
        }
    }
}
