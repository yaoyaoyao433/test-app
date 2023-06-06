package com.dianping.imagemanager.image.cache.disklrucache;

import android.content.Context;
import android.util.Log;
import com.dianping.imagemanager.image.cache.disklrucache.b;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c implements com.dianping.imagemanager.image.cache.b {
    public static ChangeQuickRedirect a;
    public final a b;
    private File c;
    private final int d;
    private final String e;
    private Context f;
    private b g;

    public c(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b37cbe0a1deb431a260ffc0604bcb0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b37cbe0a1deb431a260ffc0604bcb0b");
            return;
        }
        this.b = new a();
        this.f = context;
        this.e = str;
        this.d = i;
    }

    public b a() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e3350867a3ee1a8962c6d9b9dde87f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e3350867a3ee1a8962c6d9b9dde87f4");
        }
        if (this.g == null) {
            this.c = new File(q.a(this.f, "dpimageview", (String) null, u.b), this.e);
            this.g = b.a(this.c, 1, 1, this.d);
        }
        return this.g;
    }

    public final File a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d25cbb0be8333fdfcf32a11de25f08d", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d25cbb0be8333fdfcf32a11de25f08d");
        }
        try {
            b.c a2 = a().a(str);
            r0 = a2 != null ? a2.b[0] : null;
            if (r0 != null) {
                r0.setLastModified((System.currentTimeMillis() / 1000) * 1000);
            }
        } catch (IOException e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            }
        }
        return r0;
    }
}
