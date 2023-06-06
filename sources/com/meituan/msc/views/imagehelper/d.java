package com.meituan.msc.views.imagehelper;

import android.net.Uri;
import android.support.v4.util.LruCache;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static d b;
    private static final a c = new a(-1.0f, -1.0f, null);
    private final LruCache<Uri, a> d;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67d6685bdb0928f725f8ec8d3d7933c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67d6685bdb0928f725f8ec8d3d7933c2");
        } else {
            this.d = new LruCache<>(200);
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54f76866a27432cc417eec3de9ae1081", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54f76866a27432cc417eec3de9ae1081");
        }
        if (b == null) {
            b = new d();
        }
        return b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public float a;
        public float b;
        public Uri c;

        public a(float f, float f2, Uri uri) {
            this.a = f;
            this.b = f2;
            this.c = uri;
        }
    }

    public final void a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e5dffe5e49e9a41c5b64a4208828c74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e5dffe5e49e9a41c5b64a4208828c74");
        } else if (uri == null) {
        } else {
            this.d.put(uri, c);
        }
    }

    public final void a(Uri uri, float f, float f2, Uri uri2) {
        Object[] objArr = {uri, Float.valueOf(f), Float.valueOf(f2), uri2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d352c37ec3bfd59455484277f6188ff0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d352c37ec3bfd59455484277f6188ff0");
        } else if (uri == null || uri2 == null) {
        } else {
            a aVar = this.d.get(uri);
            if (aVar == null || aVar.b < f2 || aVar.a < f) {
                this.d.put(uri, new a(f, f2, uri2));
            }
        }
    }

    public final Uri a(Uri uri, float f, float f2) {
        a aVar;
        Object[] objArr = {uri, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5427e21a3fd64e27989d481428145122", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5427e21a3fd64e27989d481428145122");
        }
        if (uri == null || (aVar = this.d.get(uri)) == null) {
            return null;
        }
        if (aVar == c) {
            g.b("TransformedImage", String.format("[MRN图片缩略] 命中原始图片链接, 缓存中的链接: %s", uri));
            return uri;
        } else if (aVar.a < f || aVar.b < f2) {
            return null;
        } else {
            g.b("TransformedImage", String.format("[MRN图片缩略] 命中由大变小的缓存, 缓存中的链接: %s", aVar.c));
            return aVar.c;
        }
    }
}
