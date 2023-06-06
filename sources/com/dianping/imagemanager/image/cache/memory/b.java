package com.dianping.imagemanager.image.cache.memory;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.LruCache;
import com.dianping.imagemanager.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    public static boolean b = true;
    private LruCache<String, c> c;
    private LruCache<String, c> d;
    private boolean e;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static final b a = new b();
    }

    public static b a() {
        return a.a;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8514c4c876fe7deacf96c1d2e1a21e0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8514c4c876fe7deacf96c1d2e1a21e0e");
        } else {
            this.e = false;
        }
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc4102201936bb0eaee7088e49598178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc4102201936bb0eaee7088e49598178");
        } else if (this.e) {
        } else {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
                a((b ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) << 16);
            } catch (Throwable unused) {
                a(10485760);
            }
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5289148eb340b5ed99a358e3d57107a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5289148eb340b5ed99a358e3d57107a");
            return;
        }
        this.c = new LruCache<String, c>(i) { // from class: com.dianping.imagemanager.image.cache.memory.b.1
            public static ChangeQuickRedirect a;

            @Override // android.util.LruCache
            public final /* synthetic */ int sizeOf(String str, c cVar) {
                c cVar2 = cVar;
                Object[] objArr2 = {str, cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "504540a719031cc0bfa3ee487dd191cd", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "504540a719031cc0bfa3ee487dd191cd")).intValue();
                }
                if (cVar2 == null || cVar2.a == null) {
                    return 0;
                }
                Bitmap bitmap = cVar2.a;
                if (bitmap.isRecycled() && Build.VERSION.SDK_INT >= 26) {
                    return bitmap.getRowBytes() * bitmap.getHeight();
                }
                return bitmap.getByteCount();
            }
        };
        this.d = new LruCache<>(50);
        this.e = true;
    }

    private LruCache<String, c> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb993a8d68abacdbd1b302d573e71b1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (LruCache) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb993a8d68abacdbd1b302d573e71b1e");
        }
        if (!this.e || this.c == null || this.d == null) {
            a(10485760);
        }
        return this.c;
    }

    private LruCache<String, c> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5fcc84d34a2e4eaff4a7bb8ccc64966", RobustBitConfig.DEFAULT_VALUE)) {
            return (LruCache) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5fcc84d34a2e4eaff4a7bb8ccc64966");
        }
        if (!this.e || this.c == null || this.d == null) {
            a(10485760);
        }
        return this.d;
    }

    public final boolean a(String str, com.dianping.imagemanager.image.cache.a aVar, Bitmap bitmap, boolean z) {
        Object[] objArr = {str, aVar, bitmap, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a981a014f8e601b5513af3164607d92d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a981a014f8e601b5513af3164607d92d")).booleanValue() : a(str, aVar, bitmap, true, -1, -1);
    }

    public final boolean a(String str, com.dianping.imagemanager.image.cache.a aVar, Bitmap bitmap, boolean z, int i, int i2) {
        Object[] objArr = {str, aVar, bitmap, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d84ae373f49f1137082983234b3eea3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d84ae373f49f1137082983234b3eea3")).booleanValue();
        }
        if (!com.dianping.imagemanager.base.a.a().h || str == null || bitmap == null) {
            return false;
        }
        c cVar = new c();
        cVar.a = bitmap;
        cVar.b = z;
        cVar.c = i;
        cVar.d = i2;
        if (com.dianping.imagemanager.image.cache.a.ICON == aVar) {
            c().put(str, cVar);
        } else {
            b().put(str, cVar);
        }
        return true;
    }

    public final Bitmap a(String str, com.dianping.imagemanager.image.cache.a aVar, boolean z, boolean z2) {
        Object[] objArr = {str, aVar, (byte) 0, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc68b8c0a4e3117fa28a6bef42099b28", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc68b8c0a4e3117fa28a6bef42099b28") : a(str, aVar, false, true, false, 0, 0);
    }

    public final Bitmap a(String str, com.dianping.imagemanager.image.cache.a aVar, boolean z, boolean z2, boolean z3, int i, int i2) {
        com.dianping.imagemanager.image.cache.a aVar2;
        LruCache<String, c> b2;
        LruCache<String, c> c;
        Object[] objArr = {str, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0a051c798c8d005d824039a4250078d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0a051c798c8d005d824039a4250078d");
        }
        if (com.dianping.imagemanager.base.a.a().h && str != null) {
            if (com.dianping.imagemanager.image.cache.a.ICON == aVar) {
                aVar2 = com.dianping.imagemanager.image.cache.a.ICON;
                b2 = c();
                c = b();
            } else {
                aVar2 = com.dianping.imagemanager.image.cache.a.DEFAULT;
                b2 = b();
                c = c();
            }
            com.dianping.imagemanager.image.cache.a aVar3 = aVar2;
            LruCache<String, c> lruCache = c;
            LruCache<String, c> lruCache2 = b2;
            long currentTimeMillis = System.currentTimeMillis();
            Bitmap a2 = a(str, lruCache2, z, z2, z3, i, i2);
            if (a2 == null) {
                a2 = a(str, lruCache, z, z2, z3, i, i2);
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            n.a("memCacheHit." + aVar3.toString().toLowerCase(), a2 != null ? 200 : -1, 0, 0, (int) currentTimeMillis2, 5, 10000);
            return a2;
        }
        return null;
    }

    private Bitmap a(String str, LruCache<String, c> lruCache, boolean z, boolean z2, boolean z3, int i, int i2) {
        int height;
        boolean z4 = false;
        Object[] objArr = {str, lruCache, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "980851ca3c2831f22b7838901c773897", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "980851ca3c2831f22b7838901c773897");
        }
        c cVar = lruCache.get(str);
        if (cVar == null || cVar.a == null) {
            return null;
        }
        Bitmap bitmap = cVar.a;
        if (bitmap.isRecycled()) {
            lruCache.remove(str);
            return null;
        } else if (z && bitmap.getConfig() == Bitmap.Config.RGB_565) {
            return null;
        } else {
            if (z2 || !cVar.b) {
                if (bitmap != null) {
                    if ((bitmap.getWidth() >= com.dianping.imagemanager.base.a.a().i || bitmap.getHeight() >= com.dianping.imagemanager.base.a.a().i) ? true : true) {
                        return bitmap;
                    }
                    if (i == 0 && i2 == 0 && bitmap.getWidth() != cVar.c && z3) {
                        lruCache.remove(str);
                        return null;
                    }
                    if (i != 0 && bitmap.getWidth() != cVar.c && i > bitmap.getWidth() && cVar.c != -1) {
                        height = (i * 5) / bitmap.getWidth();
                    } else {
                        height = (i2 == 0 || bitmap.getHeight() == cVar.d || i2 <= bitmap.getHeight() || cVar.d == -1) ? -1 : (i2 * 5) / bitmap.getHeight();
                    }
                    if (height != -1) {
                        n.a("picMemCache.reload.size", (z3 ? 200 : 100) + height, 0, 0, 0, 5, 10000);
                        if (height >= 8 || (height > 5 && z3)) {
                            lruCache.remove(str);
                            return null;
                        }
                        return bitmap;
                    }
                    return bitmap;
                }
                return bitmap;
            }
            return null;
        }
    }
}
