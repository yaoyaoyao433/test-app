package com.sankuai.meituan.kernel.net.zstd;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b j;
    public volatile a b;
    public volatile Context c;
    com.sankuai.meituan.kernel.net.zstd.a d;
    public d e;
    public e f;
    public volatile boolean g;
    public long h;
    private volatile int i;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        @SerializedName("enable")
        public boolean a;
        @SerializedName("dicts")
        public List<C0597a> b;
        @SerializedName("daysRecover")
        public int c;

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.meituan.kernel.net.zstd.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0597a {
            @SerializedName("url")
            public String a;
            @SerializedName("bundle_name")
            public String b;
            @SerializedName("dic_id")
            public long c;
            @SerializedName("use_zstd")
            public boolean d;
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d070a8d6b25022684e2b6ead105ece83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d070a8d6b25022684e2b6ead105ece83");
            return;
        }
        this.d = new com.sankuai.meituan.kernel.net.zstd.a();
        this.e = new d();
        this.f = new e();
        this.i = -10;
        this.h = 0L;
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af8a3f745c1ad46ef10026c0143eb3ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af8a3f745c1ad46ef10026c0143eb3ea");
        }
        if (j == null) {
            synchronized (b.class) {
                if (j == null) {
                    j = new b();
                }
            }
        }
        return j;
    }

    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22080fa24e58e28ba06add500166eb0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22080fa24e58e28ba06add500166eb0c");
            return;
        }
        this.i = (i * 10000) + (i2 * 100) + i3;
        f.a("setHomepageZstdMode=", Integer.valueOf(this.i));
    }

    public final a.C0597a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6f395e386e21fb8539d39d6ffd39bca", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.C0597a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6f395e386e21fb8539d39d6ffd39bca");
        }
        if (this.b == null || this.b.b == null) {
            return null;
        }
        for (a.C0597a c0597a : this.b.b) {
            if (c0597a.a != null && c0597a.a.equals(str)) {
                f.a("getConfigItem match url:", str);
                return c0597a;
            }
        }
        return null;
    }

    public final byte[] a(Object obj, byte[] bArr) throws Throwable {
        Object[] objArr = {obj, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddac6caf74f002167489959ecbe4135a", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddac6caf74f002167489959ecbe4135a") : this.e.a(obj, bArr);
    }

    public final Object a(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da7d30a3be3b3f581dacf5fe2196daf7", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da7d30a3be3b3f581dacf5fe2196daf7") : this.d.a(j2);
    }

    public final void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a77c33b6e70d1e6dd40fe672973a502c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a77c33b6e70d1e6dd40fe672973a502c");
        } else {
            this.f.a(z, str);
        }
    }
}
