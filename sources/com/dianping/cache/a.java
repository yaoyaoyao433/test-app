package com.dianping.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.LruCache;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private static File i;
    private static File j;
    public ThreadPoolExecutor c;
    public Handler d;
    public ArrayList<String> e;
    private int f;
    private LruCache<String, Object> g;
    private LruCache<String, Object> h;
    private final HashMap<String, Object> k;
    private int l;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.cache.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0058a {
        public static final a a = new a();
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbba511643b81c990fb6a119f1975dc1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbba511643b81c990fb6a119f1975dc1");
            return;
        }
        this.f = 50;
        this.g = new LruCache<>(25);
        this.h = new LruCache<>(this.f - 25);
        this.k = new HashMap<>();
        this.c = new ThreadPoolExecutor(5, 10, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.d = new Handler(Looper.getMainLooper()) { // from class: com.dianping.cache.a.1
        };
        this.l = 0;
        this.e = new ArrayList<>();
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99bd39097ef47d1027bec8b592d87603", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99bd39097ef47d1027bec8b592d87603");
        } else if (b) {
        } else {
            File file = new File(context.getCacheDir(), "cache");
            i = file;
            if (!file.exists()) {
                i.mkdir();
            }
            File file2 = new File(context.getFilesDir(), "permanent");
            j = file2;
            if (!file2.exists()) {
                j.mkdir();
            }
            b = true;
        }
    }

    public static a a() {
        return C0058a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28a9374092f398f7ec15630f024f54f0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28a9374092f398f7ec15630f024f54f0") : String.valueOf(str.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7ec72b850ea463d2e88aa47abda0c4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7ec72b850ea463d2e88aa47abda0c4b");
        }
        if (str2 == null) {
            return CommonConstant.Symbol.UNDERLINE + str;
        }
        return str2 + CommonConstant.Symbol.UNDERLINE + str;
    }

    public static File a(String str, String str2, long j2) {
        File a2;
        Object[] objArr = {str, str2, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d66c11242263fb1081f96e35a7b636f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d66c11242263fb1081f96e35a7b636f4");
        }
        if (str != null && (a2 = a(str2, j2)) != null) {
            File file = new File(a2, c(str));
            if (file.exists()) {
                if (a(file.lastModified(), j2)) {
                    return file;
                }
                file.delete();
                return null;
            }
        }
        return null;
    }

    public static File b(String str, String str2, long j2) {
        Object[] objArr = {str, str2, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbf261f8c4bd89d3901d9dda5f1ad906", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbf261f8c4bd89d3901d9dda5f1ad906");
        }
        File a2 = a(str2, j2);
        if (a2 == null) {
            return null;
        }
        return new File(a2, c(str));
    }

    private static File a(String str, long j2) {
        File file;
        Object[] objArr = {str, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d77cc8066d77965802c8d6a2712cf911", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d77cc8066d77965802c8d6a2712cf911");
        }
        if (j2 >= 31539600000L) {
            file = j;
        } else if (j2 < DDLoadConstants.TIME_HOURS_MILLIS) {
            return null;
        } else {
            file = i;
        }
        if (str != null) {
            File file2 = new File(file, str);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            file = file2;
        }
        if (file.exists() && file.isDirectory()) {
            return file;
        }
        return null;
    }

    private static boolean a(long j2, long j3) {
        Object[] objArr = {new Long(j2), new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4892737f1fac379c453e1edacb1176e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4892737f1fac379c453e1edacb1176e6")).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (j3 >= 31539600000L) {
            return true;
        }
        if (j3 != 86400000) {
            return j2 + j3 > currentTimeMillis;
        }
        long e = e();
        return e - 86400000 <= j2 && j2 < e;
    }

    public final boolean a(final String str, String str2, final Parcelable parcelable, long j2, boolean z) {
        Object[] objArr = {str, null, parcelable, 31539600000L, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc4a79aaa6b2f1d7a4468564d5b1bcb5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc4a79aaa6b2f1d7a4468564d5b1bcb5")).booleanValue();
        }
        if (!b || parcelable == null) {
            return false;
        }
        this.c.submit(new Runnable() { // from class: com.dianping.cache.a.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "079ba90effe043628a6595c936723adf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "079ba90effe043628a6595c936723adf");
                    return;
                }
                File b2 = a.b(str, r3, r4);
                if (b2 != null) {
                    synchronized (a.this.a(str)) {
                        b.a(b2, parcelable, r3, str);
                        a.this.b();
                    }
                }
            }
        });
        return true;
    }

    public final <T> T a(String str, String str2, long j2, boolean z, Parcelable.Creator<T> creator) {
        T t = null;
        Object[] objArr = {str, null, 31539600000L, (byte) 0, creator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b190d516f6ffb8c09df00482d0d6a142", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b190d516f6ffb8c09df00482d0d6a142");
        }
        if (b) {
            synchronized (a(str)) {
                File a2 = a(str, null, 31539600000L);
                if (a2 != null) {
                    t = (T) b.a(a2, creator);
                }
                b();
            }
            return t;
        }
        return null;
    }

    public final boolean a(final String str, String str2) {
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f57975a6537e4b79706752bb12ce832a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f57975a6537e4b79706752bb12ce832a")).booleanValue();
        }
        if (b) {
            String c = c(str, null);
            Object[] objArr2 = {c};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4dc08ad60396fac1bf28eea51293491e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4dc08ad60396fac1bf28eea51293491e");
            } else if (c != null) {
                if ((c.hashCode() & 1) == 0) {
                    this.g.remove(c);
                } else {
                    this.h.remove(c);
                }
            }
            this.c.submit(new Runnable() { // from class: com.dianping.cache.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "67350211d57acfbd8c03800978c1b18a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "67350211d57acfbd8c03800978c1b18a");
                        return;
                    }
                    synchronized (a.this.a(a.c(str, r3))) {
                        File[] fileArr = {a.i, a.j};
                        for (int i2 = 0; i2 < 2; i2++) {
                            File file = new File(r3 == null ? fileArr[i2] : new File(fileArr[i2], r3), a.c(str));
                            if (file.exists() && file.isFile()) {
                                file.delete();
                            }
                        }
                        a.this.b();
                    }
                }
            });
            return true;
        }
        return false;
    }

    private static long e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "934bb603505e4fed989f47144607b2cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "934bb603505e4fed989f47144607b2cc")).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 24);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final Object a(String str) {
        Object obj;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81fb3b6decfba98a91f1b6972670e205", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81fb3b6decfba98a91f1b6972670e205");
        }
        synchronized (this.k) {
            this.l++;
            obj = this.k.get(str);
            if (obj == null) {
                obj = new Object();
                this.k.put(str, obj);
            }
        }
        return obj;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be2b5b141150bdb71f4163439f659273", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be2b5b141150bdb71f4163439f659273");
            return;
        }
        synchronized (this.k) {
            this.l--;
            if (this.l == 0) {
                this.k.clear();
            }
        }
    }
}
