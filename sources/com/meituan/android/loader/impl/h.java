package com.meituan.android.loader.impl;

import android.content.Context;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.mmp.lib.update.PackageManageUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class h {
    public static ChangeQuickRedirect a;
    private static volatile h c;
    private static volatile g d;
    public Map<String, Object> b;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a31dfa04e6feda6c1f90831b8d7f7632", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a31dfa04e6feda6c1f90831b8d7f7632");
            return;
        }
        com.meituan.android.loader.impl.a.b();
        Context context = com.meituan.android.loader.impl.a.e;
        this.b = b();
    }

    public static void a(g gVar) {
        if (d == null) {
            d = gVar;
        }
    }

    public static h a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57c9f72e25c53e0f395c8aad54752f29", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57c9f72e25c53e0f395c8aad54752f29");
        }
        if (c == null) {
            synchronized (h.class) {
                if (c == null) {
                    c = new h();
                }
            }
        }
        return c;
    }

    private Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81429902cf5e7d32b7a207feaa4374bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81429902cf5e7d32b7a207feaa4374bf");
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(PackageManageUtil.c, com.meituan.android.loader.impl.a.e != null ? com.meituan.android.loader.impl.a.e.getPackageName() : "");
            hashMap.put("appVersionName", com.meituan.android.loader.impl.a.e != null ? d.d(com.meituan.android.loader.impl.a.e) : "");
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public final void a(Throwable th, String str) {
        Object[] objArr = {th, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dec15b9bc93a3465c800898da0407c08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dec15b9bc93a3465c800898da0407c08");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("key", "exception_normal");
        hashMap.put(Constants.SQLConstants.KEY_WHERE, str);
        hashMap.putAll(this.b);
        o.a(th, hashMap);
    }

    public final void a(DynFile dynFile, String str, String str2) {
        Object[] objArr = {dynFile, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0be878b86cab5cfb14db653c4979517", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0be878b86cab5cfb14db653c4979517");
            return;
        }
        a a2 = new a().a(dynFile, str);
        a2.d = str2;
        a(a2);
    }

    public final void a(DynFile dynFile, String str) {
        Object[] objArr = {dynFile, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1daa5d71850fb406f2722bfe4697dc38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1daa5d71850fb406f2722bfe4697dc38");
        } else {
            a(new a().a(dynFile, str));
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf6b72859237f0338c1151eef477d501", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf6b72859237f0338c1151eef477d501");
        } else {
            com.meituan.android.loader.impl.a.b().a(aVar.b, aVar.a());
        }
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffb2639c2a2bb7807620981288f4ed2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffb2639c2a2bb7807620981288f4ed2d");
            return;
        }
        HashMap hashMap = new HashMap(this.b);
        hashMap.put("patchId", str);
        hashMap.put("type", str2);
        hashMap.put("source", str3);
        com.meituan.android.loader.impl.a.b().a("DynLoaderPreVerify", 1L, hashMap);
    }

    public final void a(String str, String str2, String str3, String str4, boolean z) {
        Object[] objArr = {str, str2, str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0945b8239d67bbdd01c08f0c6ab206a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0945b8239d67bbdd01c08f0c6ab206a5");
            return;
        }
        HashMap hashMap = new HashMap(this.b);
        hashMap.put("patchId", str);
        hashMap.put("type", str2);
        hashMap.put("source", str3);
        hashMap.put("failReason", str4);
        hashMap.put("replaceApp", Boolean.valueOf(z));
        com.meituan.android.loader.impl.a.b().a("DynLoaderPreVerify", 0L, hashMap);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a {
        public static ChangeQuickRedirect a;
        String b;
        String c;
        public String d;
        public String e;
        public String f;
        public String g;
        private String i;
        private int j;

        public a() {
        }

        public final a a(DynFile dynFile, String str) {
            Object[] objArr = {dynFile, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66eaf090d5a430524e9c1f1f49bef12c", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66eaf090d5a430524e9c1f1f49bef12c");
            }
            if (dynFile != null) {
                this.c = dynFile.getBundleName();
                this.i = dynFile.getCurOriginMd5();
                this.b = str;
                this.j = dynFile.getSource();
            } else {
                this.c = "";
                this.i = "";
                this.b = str;
            }
            return this;
        }

        public final Map<String, Object> a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68eee43e4a059f36baac22deb130006d", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68eee43e4a059f36baac22deb130006d");
            }
            HashMap hashMap = new HashMap(h.this.b);
            hashMap.put("patchId", this.c);
            hashMap.put("patchMd5", this.i);
            hashMap.put("extra", this.e);
            hashMap.put("errMsg", this.d);
            hashMap.put("source", Integer.valueOf(this.j));
            hashMap.put("downloadMode", this.f);
            if (this.g != null) {
                hashMap.put("sourceReason", this.g);
            }
            return hashMap;
        }
    }
}
