package com.meituan.mmp.lib.update;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.mmp.lib.api.storage.RenderingCacheModule;
import com.meituan.mmp.lib.t;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o {
    public static ChangeQuickRedirect a = null;
    private static final String b = "current";
    private static final String c = "latest";

    public static /* synthetic */ void a(Context context, MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {context, mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55e4569988aa6c2c92405ee75adb2fec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55e4569988aa6c2c92405ee75adb2fec");
        } else if (mMPPackageInfo.e(context)) {
            PackageManageUtil.b(mMPPackageInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SharedPreferences a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a16202a16aa626aebadb80693823fa2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedPreferences) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a16202a16aa626aebadb80693823fa2e");
        }
        return MMPEnvHelper.getSharedPreferences(context, "mmp_app_property_" + str);
    }

    public static synchronized MMPAppProp b(final Context context, final String str) {
        synchronized (o.class) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21f9cb6c8f5069101ec6ee86d514df2c", RobustBitConfig.DEFAULT_VALUE)) {
                return (MMPAppProp) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21f9cb6c8f5069101ec6ee86d514df2c");
            }
            ab.a("getLatestAppProp");
            final MMPAppProp a2 = a(context, str, true, true);
            if (a2 != null) {
                final String string = a(context, str).getString(b, null);
                Object[] objArr2 = {context, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6cdcdbcaf06cdd602ff6a4ed230a3d48", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6cdcdbcaf06cdd602ff6a4ed230a3d48");
                } else {
                    SharedPreferences a3 = a(context, str);
                    a3.edit().putString("current", a3.getString(c, null)).remove(c).apply();
                }
                com.meituan.mmp.lib.executor.a.b.submit(new Runnable() { // from class: com.meituan.mmp.lib.update.o.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5f50fde9b9171421fbad4ec0e471419f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5f50fde9b9171421fbad4ec0e471419f");
                            return;
                        }
                        MMPAppProp mMPAppProp = (MMPAppProp) com.meituan.mmp.lib.utils.j.b.fromJson(string, (Class<Object>) MMPAppProp.class);
                        if (string == null || t.b(str)) {
                            return;
                        }
                        o.a(context, a2, mMPAppProp);
                    }
                });
            } else {
                a2 = a(context, str, true, false);
            }
            ab.a();
            return a2;
        }
    }

    public static MMPAppProp a(Context context, String str, boolean z, boolean z2) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dbb0781883338c2e415a6eea687ff06d", RobustBitConfig.DEFAULT_VALUE)) {
            return (MMPAppProp) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dbb0781883338c2e415a6eea687ff06d");
        }
        String string = a(context, str).getString(z2 ? c : b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            MMPAppProp mMPAppProp = (MMPAppProp) com.meituan.mmp.lib.utils.j.b.fromJson(string, (Class<Object>) MMPAppProp.class);
            com.meituan.mmp.lib.trace.b.b("MiniAppPropertyUtil", "@getAppProp isNewVersion: " + z2 + StringUtil.SPACE + string);
            if (mMPAppProp != null && mMPAppProp.mainPackage != null && mMPAppProp.mmpSdk != null) {
                if (!z) {
                    return mMPAppProp;
                }
                if (mMPAppProp.mainPackage.c(context) && mMPAppProp.mmpSdk.c(context)) {
                    return mMPAppProp;
                }
            }
            return null;
        } catch (Exception unused) {
            a(context, str).edit().remove(z2 ? c : b).apply();
            return null;
        }
    }

    public static void a(final Context context, final MMPAppProp mMPAppProp, final MMPAppProp mMPAppProp2) {
        Object[] objArr = {context, mMPAppProp, mMPAppProp2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f561ef0af85f161baac4544515bfa299", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f561ef0af85f161baac4544515bfa299");
        } else if (mMPAppProp2 == null || mMPAppProp == null || mMPAppProp2.isEmpty() || mMPAppProp.isEmpty() || a(mMPAppProp, mMPAppProp2)) {
        } else {
            String str = mMPAppProp2.appid;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = RenderingCacheModule.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cca8c1be36f369ff3dc008654d150d13", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cca8c1be36f369ff3dc008654d150d13");
            } else {
                com.meituan.mmp.lib.trace.b.b("RenderingCacheModule", "clear rendering cache for appId " + str);
                RenderingCacheModule.a.a(str).edit().clear().apply();
            }
            com.meituan.mmp.lib.executor.a.b.submit(new Runnable() { // from class: com.meituan.mmp.lib.update.o.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z = false;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7510cec49ee1f6177b2e69c1873ec8b8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7510cec49ee1f6177b2e69c1873ec8b8");
                        return;
                    }
                    com.meituan.mmp.lib.trace.b.c("clearOldPackage: " + MMPAppProp.this + " -> " + mMPAppProp);
                    StringBuilder sb = new StringBuilder("clearOldPackage ");
                    sb.append(MMPAppProp.this.appid);
                    ab.a(sb.toString());
                    try {
                        MMPPackageInfo mMPPackageInfo = MMPAppProp.this.mainPackage;
                        MMPPackageInfo mMPPackageInfo2 = mMPAppProp.mainPackage;
                        Object[] objArr4 = {mMPPackageInfo, mMPPackageInfo2};
                        ChangeQuickRedirect changeQuickRedirect4 = o.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "49a2b36d6184defcaec934464a43401d", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "49a2b36d6184defcaec934464a43401d")).booleanValue();
                        } else if (TextUtils.equals(mMPPackageInfo.f, mMPPackageInfo2.f)) {
                            z = true;
                        }
                        if (!z) {
                            o.a(context, MMPAppProp.this.mainPackage);
                        }
                        if (com.meituan.mmp.lib.utils.h.a((List) MMPAppProp.this.subPackages)) {
                            return;
                        }
                        Iterator<MMPPackageInfo> it = MMPAppProp.this.subPackages.iterator();
                        while (it.hasNext()) {
                            MMPPackageInfo next = it.next();
                            if (next != null) {
                                if (com.meituan.mmp.lib.utils.h.a((List) mMPAppProp.subPackages)) {
                                    o.a(context, next);
                                } else {
                                    Iterator<MMPPackageInfo> it2 = mMPAppProp.subPackages.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        MMPPackageInfo next2 = it2.next();
                                        if (next2 != null && TextUtils.equals(next2.g, next.g)) {
                                            if (!TextUtils.equals(next2.f, next.f)) {
                                                o.a(context, next);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        ab.a();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context, MMPAppProp mMPAppProp, boolean z) {
        Object[] objArr = {context, mMPAppProp, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "370b2ecb7917bf14c57de0da907c945b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "370b2ecb7917bf14c57de0da907c945b")).booleanValue();
        }
        if (mMPAppProp != null && !TextUtils.isEmpty(mMPAppProp.appid)) {
            mMPAppProp.checkTime = System.currentTimeMillis();
            String json = com.meituan.mmp.lib.utils.j.b.toJson(mMPAppProp);
            com.meituan.mmp.lib.trace.b.b("MiniAppPropertyUtil", "@storeProp  isNewVersion: " + z + StringUtil.SPACE + json);
            a(context, mMPAppProp.appid).edit().putString(z ? c : b, json).apply();
        }
        return true;
    }

    public static boolean a(MMPAppProp mMPAppProp, MMPAppProp mMPAppProp2) {
        Object[] objArr = {mMPAppProp, mMPAppProp2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2fca5206ffef9b8e621562ad694ef822", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2fca5206ffef9b8e621562ad694ef822")).booleanValue() : (mMPAppProp == null || mMPAppProp2 == null || mMPAppProp.isEmpty() || mMPAppProp2.isEmpty() || (!TextUtils.equals(mMPAppProp.getBuildId(), mMPAppProp2.getBuildId()) && !TextUtils.equals(mMPAppProp.getPublishId(), mMPAppProp2.getPublishId())) || !TextUtils.equals(mMPAppProp.mainPackage.f, mMPAppProp2.mainPackage.f) || !TextUtils.equals(mMPAppProp.mmpSdk.f, mMPAppProp2.mmpSdk.f)) ? false : true;
    }

    public static boolean a(Context context, MMPAppProp mMPAppProp, boolean z, boolean z2, boolean z3) {
        Object[] objArr = {context, mMPAppProp, (byte) 0, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "352b4cdbda3a74d8c355416f1c8e5b72", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "352b4cdbda3a74d8c355416f1c8e5b72")).booleanValue();
        }
        MMPAppProp a2 = z3 ? a(context, mMPAppProp.appid, false, z2) : null;
        a(context, mMPAppProp, z2);
        if (z3 && a2 != null) {
            a(context, mMPAppProp, a2);
        }
        return true;
    }
}
