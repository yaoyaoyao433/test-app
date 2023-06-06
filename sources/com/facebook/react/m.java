package com.facebook.react;

import android.net.Uri;
import android.support.v4.util.LruCache;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m {
    private static m a;
    private static final a b = new a(-1.0f, -1.0f, null);
    private final LruCache<Uri, a> c = new LruCache<>(200);

    public static m a() {
        if (a == null) {
            a = new m();
        }
        return a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a {
        float a;
        float b;
        Uri c;

        public a(float f, float f2, Uri uri) {
            this.a = f;
            this.b = f2;
            this.c = uri;
        }
    }

    public final void a(Uri uri) {
        if (uri == null) {
            return;
        }
        this.c.put(uri, b);
    }

    public final void a(Uri uri, float f, float f2, Uri uri2) {
        if (uri == null || uri2 == null) {
            return;
        }
        a aVar = this.c.get(uri);
        if (aVar == null || aVar.b < f2 || aVar.a < f) {
            this.c.put(uri, new a(f, f2, uri2));
        }
    }

    public final Uri a(Uri uri, float f, float f2) {
        a aVar;
        if (uri == null || (aVar = this.c.get(uri)) == null) {
            return null;
        }
        if (aVar == b) {
            com.facebook.common.logging.a.a("TransformedImage", String.format("[MRN图片缩略] 命中原始图片链接, 缓存中的链接: %s", uri));
            return uri;
        } else if (aVar.a < f || aVar.b < f2) {
            return null;
        } else {
            com.facebook.common.logging.a.a("TransformedImage", String.format("[MRN图片缩略] 命中由大变小的缓存, 缓存中的链接: %s", aVar.c));
            return aVar.c;
        }
    }
}
