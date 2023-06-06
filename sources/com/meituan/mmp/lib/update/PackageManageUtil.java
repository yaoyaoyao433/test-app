package com.meituan.mmp.lib.update;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.mmp.lib.mp.GlobalEngineMonitor;
import com.meituan.mmp.lib.mp.ipc.IPCInvoke;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.r;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PackageManageUtil {
    public static ChangeQuickRedirect a = null;
    public static final String b = "foundationPackage";
    public static final String c = "appPackage";
    private static final b d = (b) IPCInvoke.a(c.class, com.meituan.mmp.lib.mp.a.MAIN);

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a(int i, String str, a aVar);

        void a(MMPAppProp mMPAppProp, boolean z);

        void a(MMPPackageInfo mMPPackageInfo);

        void b(MMPPackageInfo mMPPackageInfo);
    }

    public static /* synthetic */ double a(Context context, List list) {
        int i = 0;
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5dcbd10b6c9fde87868e2a5c443b192e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5dcbd10b6c9fde87868e2a5c443b192e")).doubleValue();
        }
        if (list == null) {
            return 0.0d;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageInfoBean packageInfoBean = (PackageInfoBean) it.next();
            if (new File(packageInfoBean.getSourceDir(context)).exists()) {
                i = (int) (i + packageInfoBean.packageSize);
            } else {
                it.remove();
            }
        }
        return i;
    }

    public static /* synthetic */ void a(double d2, double d3) {
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28abd326ea54a14b0bfc18c0de74e436", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28abd326ea54a14b0bfc18c0de74e436");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("totalFrameworkPackageSize", Double.valueOf(d2));
        hashMap.put("totalAppPackageSize", Double.valueOf(d3));
        MMPEnvHelper.getLogger().log("mmp.package.totalsize.information", null, hashMap);
    }

    public static /* synthetic */ void a(Context context, List list, String str, double d2, double d3, SharedPreferences sharedPreferences, MMPAppProp mMPAppProp) {
        Object[] objArr = {context, list, str, Double.valueOf(d2), Double.valueOf(d3), sharedPreferences, mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09dd1955df268e1dd3d9bff50f087bc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09dd1955df268e1dd3d9bff50f087bc7");
        } else if (list != null) {
            Iterator it = list.iterator();
            double d4 = d2;
            while (d4 > d3 && it.hasNext()) {
                PackageInfoBean packageInfoBean = (PackageInfoBean) it.next();
                if (!b(mMPAppProp).contains(packageInfoBean.packageMd5)) {
                    d4 -= packageInfoBean.packageSize;
                    it.remove();
                    if (s.a(packageInfoBean.getSourceDir(context))) {
                        b.a.a("PackageManage", "lru delete package, packageMd5: " + packageInfoBean.packageMd5 + " appId: " + packageInfoBean.appId + " packagePath" + packageInfoBean.getSourceDir(context));
                        packageInfoBean.getPackageType();
                        SystemClock.elapsedRealtime();
                    }
                } else if (it.hasNext()) {
                    it.next();
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str, new Gson().toJson(list));
            edit.apply();
        }
    }

    public static /* synthetic */ void a(String str, Context context, List list, String str2, SharedPreferences sharedPreferences) {
        Object[] objArr = {str, context, list, str2, sharedPreferences};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73737ee22d00d07f65550dc3a91cd7dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73737ee22d00d07f65550dc3a91cd7dc");
        } else if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PackageInfoBean packageInfoBean = (PackageInfoBean) it.next();
                it.remove();
                if (str != null && packageInfoBean.appId != null && packageInfoBean.appId.equals(str) && s.a(packageInfoBean.getSourceDir(context))) {
                    b.a.a("PackageManage", "Fatal Error: delete package, packageMd5: " + packageInfoBean.packageMd5 + " appId: " + packageInfoBean.appId + " packagePath" + packageInfoBean.getSourceDir(context));
                    packageInfoBean.getPackageType();
                    SystemClock.elapsedRealtime();
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str2, new Gson().toJson(list));
            edit.apply();
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class PackageInfoBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String appId;
        public long latestUsedTime;
        public String packageMd5;
        public double packageSize;
        public int packageType;

        public PackageInfoBean() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1c97035728f404d1b5c4d86b76eb5ea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1c97035728f404d1b5c4d86b76eb5ea");
                return;
            }
            this.packageMd5 = null;
            this.appId = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getSourceDir(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2f8d1e073340c3f26e82d5c7d26f0cb", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2f8d1e073340c3f26e82d5c7d26f0cb");
            }
            if (this.packageType == 1) {
                return p.b(context, this.packageMd5).getPath();
            }
            return p.a(context, this.appId, this.packageMd5).getPath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getPackageType() {
            return this.packageType == 1 ? PackageManageUtil.b : PackageManageUtil.c;
        }
    }

    public static boolean a(MMPAppProp mMPAppProp) {
        Object[] objArr = {mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d22d7d2c1a926dc8859894d40dfb3af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d22d7d2c1a926dc8859894d40dfb3af")).booleanValue();
        }
        try {
            List<PackageInfoBean> list = (List) new Gson().fromJson(MMPEnvHelper.getSharedPreferences("mmp_miniapp_package_used").getString(b, null), new TypeToken<LinkedList<PackageInfoBean>>() { // from class: com.meituan.mmp.lib.update.PackageManageUtil.1
            }.getType());
            if (list == null) {
                list = new LinkedList();
            }
            if (!list.isEmpty()) {
                for (PackageInfoBean packageInfoBean : list) {
                    if (TextUtils.equals(packageInfoBean.packageMd5, mMPAppProp.mmpSdk.f)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void a(final MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6309a4ffb1c523d733f28385017ee6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6309a4ffb1c523d733f28385017ee6b");
        } else if (mMPPackageInfo.f == null) {
        } else {
            if (!com.meituan.mmp.lib.mp.a.f()) {
                d.a(mMPPackageInfo);
            } else {
                com.meituan.mmp.lib.executor.a.b.submit(new Runnable() { // from class: com.meituan.mmp.lib.update.PackageManageUtil.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "393179fa380da37812492780ec077b1a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "393179fa380da37812492780ec077b1a");
                            return;
                        }
                        SharedPreferences sharedPreferences = MMPEnvHelper.getSharedPreferences("mmp_miniapp_package_used");
                        PackageInfoBean packageInfoBean = null;
                        String string = sharedPreferences.getString(MMPPackageInfo.this.d() ? PackageManageUtil.b : PackageManageUtil.c, null);
                        Gson gson = new Gson();
                        try {
                            List list = (List) gson.fromJson(string, new TypeToken<LinkedList<PackageInfoBean>>() { // from class: com.meituan.mmp.lib.update.PackageManageUtil.2.1
                            }.getType());
                            if (list == null) {
                                list = new LinkedList();
                            }
                            if (!list.isEmpty()) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    PackageInfoBean packageInfoBean2 = (PackageInfoBean) it.next();
                                    if (TextUtils.equals(packageInfoBean2.packageMd5, MMPPackageInfo.this.f)) {
                                        packageInfoBean2.latestUsedTime = SystemClock.elapsedRealtime();
                                        it.remove();
                                        packageInfoBean = packageInfoBean2;
                                        break;
                                    }
                                }
                            }
                            if (packageInfoBean == null) {
                                packageInfoBean = new PackageInfoBean();
                                packageInfoBean.packageMd5 = MMPPackageInfo.this.f;
                                packageInfoBean.appId = MMPPackageInfo.this.h;
                                packageInfoBean.packageSize = r.a(MMPPackageInfo.this.a(MMPEnvHelper.getContext()), 1);
                                packageInfoBean.latestUsedTime = SystemClock.elapsedRealtime();
                                packageInfoBean.packageType = MMPPackageInfo.this.r;
                            }
                            list.add(packageInfoBean);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putString(MMPPackageInfo.this.d() ? PackageManageUtil.b : PackageManageUtil.c, gson.toJson(list));
                            edit.apply();
                        } catch (Exception e) {
                            e.printStackTrace();
                            MMPEnvHelper.getSniffer().a("MMPPackageManage_error", "recordUsedPackage", e.getMessage(), com.meituan.mmp.lib.trace.b.b(e));
                        }
                    }
                });
            }
        }
    }

    public static void a(final MMPAppProp mMPAppProp, final boolean z) {
        Object[] objArr = {mMPAppProp, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e875d815d83e04d39880ab9e572245d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e875d815d83e04d39880ab9e572245d7");
        } else if (!com.meituan.mmp.lib.mp.a.f()) {
            d.a(mMPAppProp, z);
        } else {
            final Context context = MMPEnvHelper.getContext();
            com.meituan.mmp.lib.executor.a.b.submit(new Runnable() { // from class: com.meituan.mmp.lib.update.PackageManageUtil.3
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
                /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r18 = this;
                        r8 = r18
                        r0 = 0
                        java.lang.Object[] r9 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.mmp.lib.update.PackageManageUtil.AnonymousClass3.a
                        java.lang.String r11 = "0d04cd45bed284d75945e3176fe07811"
                        r4 = 0
                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r1 = r9
                        r2 = r18
                        r3 = r10
                        r5 = r11
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L1b
                        com.meituan.robust.PatchProxy.accessDispatch(r9, r8, r10, r0, r11)
                        return
                    L1b:
                        com.meituan.mmp.lib.update.MMPAppProp r0 = com.meituan.mmp.lib.update.MMPAppProp.this
                        r1 = 0
                        if (r0 == 0) goto L26
                        com.meituan.mmp.lib.update.MMPAppProp r0 = com.meituan.mmp.lib.update.MMPAppProp.this
                        java.lang.String r0 = r0.appid
                        r2 = r0
                        goto L27
                    L26:
                        r2 = r1
                    L27:
                        android.content.Context r0 = r2
                        java.lang.String r3 = "mmp_miniapp_package_used"
                        android.content.SharedPreferences r3 = com.meituan.mmp.main.MMPEnvHelper.getSharedPreferences(r0, r3)
                        java.lang.String r0 = "foundationPackage"
                        java.lang.String r0 = r3.getString(r0, r1)
                        java.lang.String r4 = "appPackage"
                        java.lang.String r4 = r3.getString(r4, r1)
                        com.google.gson.Gson r5 = new com.google.gson.Gson
                        r5.<init>()
                        boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch: com.google.gson.JsonSyntaxException -> L73
                        if (r6 != 0) goto L59
                        com.meituan.mmp.lib.update.PackageManageUtil$3$1 r6 = new com.meituan.mmp.lib.update.PackageManageUtil$3$1     // Catch: com.google.gson.JsonSyntaxException -> L73
                        r6.<init>()     // Catch: com.google.gson.JsonSyntaxException -> L73
                        java.lang.reflect.Type r6 = r6.getType()     // Catch: com.google.gson.JsonSyntaxException -> L73
                        java.lang.Object r0 = r5.fromJson(r0, r6)     // Catch: com.google.gson.JsonSyntaxException -> L73
                        java.util.List r0 = (java.util.List) r0     // Catch: com.google.gson.JsonSyntaxException -> L73
                        r6 = r0
                        goto L5a
                    L59:
                        r6 = r1
                    L5a:
                        boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: com.google.gson.JsonSyntaxException -> L71
                        if (r0 != 0) goto L98
                        com.meituan.mmp.lib.update.PackageManageUtil$3$2 r0 = new com.meituan.mmp.lib.update.PackageManageUtil$3$2     // Catch: com.google.gson.JsonSyntaxException -> L71
                        r0.<init>()     // Catch: com.google.gson.JsonSyntaxException -> L71
                        java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.JsonSyntaxException -> L71
                        java.lang.Object r0 = r5.fromJson(r4, r0)     // Catch: com.google.gson.JsonSyntaxException -> L71
                        java.util.List r0 = (java.util.List) r0     // Catch: com.google.gson.JsonSyntaxException -> L71
                        r1 = r0
                        goto L98
                    L71:
                        r0 = move-exception
                        goto L75
                    L73:
                        r0 = move-exception
                        r6 = r1
                    L75:
                        com.meituan.mmp.main.aa r4 = com.meituan.mmp.main.MMPEnvHelper.getSniffer()
                        java.lang.String r5 = "MMPPackageManage_error"
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        java.lang.String r9 = "lruDeletePackageOverLimit:"
                        r7.<init>(r9)
                        r7.append(r2)
                        java.lang.String r2 = r7.toString()
                        java.lang.String r7 = r0.getMessage()
                        java.lang.String r9 = com.meituan.mmp.lib.trace.b.b(r0)
                        r4.a(r5, r2, r7, r9)
                        r0.printStackTrace()
                    L98:
                        r10 = r6
                        android.content.Context r0 = r2
                        double r12 = com.meituan.mmp.lib.update.PackageManageUtil.a(r0, r10)
                        android.content.Context r0 = r2
                        double r4 = com.meituan.mmp.lib.update.PackageManageUtil.a(r0, r1)
                        com.meituan.mmp.lib.update.PackageManageUtil.a(r12, r4)
                        boolean r0 = r3
                        if (r0 == 0) goto Ld1
                        android.content.Context r9 = r2
                        java.lang.String r11 = "foundationPackage"
                        int r0 = com.meituan.mmp.lib.config.b.r()
                        double r14 = (double) r0
                        com.meituan.mmp.lib.update.MMPAppProp r0 = com.meituan.mmp.lib.update.MMPAppProp.this
                        r16 = r3
                        r17 = r0
                        com.meituan.mmp.lib.update.PackageManageUtil.a(r9, r10, r11, r12, r14, r16, r17)
                        android.content.Context r9 = r2
                        java.lang.String r11 = "appPackage"
                        int r0 = com.meituan.mmp.lib.config.b.s()
                        double r14 = (double) r0
                        com.meituan.mmp.lib.update.MMPAppProp r0 = com.meituan.mmp.lib.update.MMPAppProp.this
                        r10 = r1
                        r12 = r4
                        r17 = r0
                        com.meituan.mmp.lib.update.PackageManageUtil.a(r9, r10, r11, r12, r14, r16, r17)
                    Ld1:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.update.PackageManageUtil.AnonymousClass3.run():void");
                }
            });
        }
    }

    public static void a(int i, final String str, final a aVar) {
        Object[] objArr = {Integer.valueOf(i), str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f955edc3fa682837c42d2234d13f0b00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f955edc3fa682837c42d2234d13f0b00");
        } else if (!com.meituan.mmp.lib.mp.a.f()) {
            d.a(i, str, aVar);
        } else {
            for (GlobalEngineMonitor.AppEngineRecord appEngineRecord : GlobalEngineMonitor.a().a(str)) {
                if (appEngineRecord.b != i) {
                    com.meituan.mmp.lib.trace.b.c("multiple instance with " + str + " are running, cannot delete local packages now");
                    return;
                }
            }
            final Context context = MMPEnvHelper.getContext();
            com.meituan.mmp.lib.executor.a.b.submit(new Runnable() { // from class: com.meituan.mmp.lib.update.PackageManageUtil.4
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
                /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r12 = this;
                        r0 = 0
                        java.lang.Object[] r8 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.mmp.lib.update.PackageManageUtil.AnonymousClass4.a
                        java.lang.String r10 = "ac2b164aa6043e55e89adb8ad023a129"
                        r4 = 0
                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                        r1 = r8
                        r2 = r12
                        r3 = r9
                        r5 = r10
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                        if (r1 == 0) goto L18
                        com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r9, r0, r10)
                        return
                    L18:
                        android.content.Context r0 = r1
                        java.lang.String r1 = "mmp_miniapp_package_used"
                        android.content.SharedPreferences r0 = com.meituan.mmp.main.MMPEnvHelper.getSharedPreferences(r0, r1)
                        java.lang.String r1 = "foundationPackage"
                        r2 = 0
                        java.lang.String r1 = r0.getString(r1, r2)
                        java.lang.String r3 = "appPackage"
                        java.lang.String r3 = r0.getString(r3, r2)
                        com.google.gson.Gson r4 = new com.google.gson.Gson
                        r4.<init>()
                        boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch: com.google.gson.JsonSyntaxException -> L67
                        if (r5 != 0) goto L4a
                        com.meituan.mmp.lib.update.PackageManageUtil$4$1 r5 = new com.meituan.mmp.lib.update.PackageManageUtil$4$1     // Catch: com.google.gson.JsonSyntaxException -> L67
                        r5.<init>()     // Catch: com.google.gson.JsonSyntaxException -> L67
                        java.lang.reflect.Type r5 = r5.getType()     // Catch: com.google.gson.JsonSyntaxException -> L67
                        java.lang.Object r1 = r4.fromJson(r1, r5)     // Catch: com.google.gson.JsonSyntaxException -> L67
                        java.util.List r1 = (java.util.List) r1     // Catch: com.google.gson.JsonSyntaxException -> L67
                        goto L4b
                    L4a:
                        r1 = r2
                    L4b:
                        boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: com.google.gson.JsonSyntaxException -> L62
                        if (r5 != 0) goto L80
                        com.meituan.mmp.lib.update.PackageManageUtil$4$2 r5 = new com.meituan.mmp.lib.update.PackageManageUtil$4$2     // Catch: com.google.gson.JsonSyntaxException -> L62
                        r5.<init>()     // Catch: com.google.gson.JsonSyntaxException -> L62
                        java.lang.reflect.Type r5 = r5.getType()     // Catch: com.google.gson.JsonSyntaxException -> L62
                        java.lang.Object r3 = r4.fromJson(r3, r5)     // Catch: com.google.gson.JsonSyntaxException -> L62
                        java.util.List r3 = (java.util.List) r3     // Catch: com.google.gson.JsonSyntaxException -> L62
                        r2 = r3
                        goto L80
                    L62:
                        r3 = move-exception
                        r11 = r3
                        r3 = r1
                        r1 = r11
                        goto L69
                    L67:
                        r1 = move-exception
                        r3 = r2
                    L69:
                        com.meituan.mmp.main.aa r4 = com.meituan.mmp.main.MMPEnvHelper.getSniffer()
                        java.lang.String r5 = "MMPPackageManage_error"
                        java.lang.String r6 = "clearAllPackages"
                        java.lang.String r7 = r1.getMessage()
                        java.lang.String r8 = com.meituan.mmp.lib.trace.b.b(r1)
                        r4.a(r5, r6, r7, r8)
                        r1.printStackTrace()
                        r1 = r3
                    L80:
                        java.lang.String r3 = r2
                        android.content.Context r4 = r1
                        java.lang.String r5 = "foundationPackage"
                        com.meituan.mmp.lib.update.PackageManageUtil.a(r3, r4, r1, r5, r0)
                        java.lang.String r1 = r2
                        android.content.Context r3 = r1
                        java.lang.String r4 = "appPackage"
                        com.meituan.mmp.lib.update.PackageManageUtil.a(r1, r3, r2, r4, r0)
                        com.meituan.mmp.lib.update.PackageManageUtil$a r0 = r3
                        if (r0 == 0) goto L9c
                        com.meituan.mmp.lib.update.PackageManageUtil$a r0 = r3
                        r0.a()
                    L9c:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.update.PackageManageUtil.AnonymousClass4.run():void");
                }
            });
        }
    }

    private static PackageInfoBean c(MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb7005d49049848d03a3f8c18caee51f", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfoBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb7005d49049848d03a3f8c18caee51f");
        }
        if (mMPPackageInfo == null) {
            return null;
        }
        SharedPreferences sharedPreferences = MMPEnvHelper.getSharedPreferences("mmp_miniapp_package_used");
        String str = mMPPackageInfo.d() ? b : c;
        String string = sharedPreferences.getString(str, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            List<PackageInfoBean> list = (List) new Gson().fromJson(string, new TypeToken<LinkedList<PackageInfoBean>>() { // from class: com.meituan.mmp.lib.update.PackageManageUtil.5
            }.getType());
            if (list == null) {
                return null;
            }
            for (PackageInfoBean packageInfoBean : list) {
                if (TextUtils.equals(packageInfoBean.packageMd5, mMPPackageInfo.f)) {
                    return packageInfoBean;
                }
            }
            return null;
        } catch (Exception e) {
            aa sniffer = MMPEnvHelper.getSniffer();
            sniffer.a("MMPPackageManage_error", "getUsedPackageInfo:" + mMPPackageInfo.h, e.getMessage(), com.meituan.mmp.lib.trace.b.b(e));
            e.printStackTrace();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(str);
            edit.apply();
            return null;
        }
    }

    private static Set<String> b(MMPAppProp mMPAppProp) {
        Object[] objArr = {mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0182fdbcd4765e6c76725f5ccf128bb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0182fdbcd4765e6c76725f5ccf128bb0");
        }
        HashSet hashSet = new HashSet();
        if (mMPAppProp != null) {
            hashSet.add(mMPAppProp.mmpSdk.f);
            hashSet.add(mMPAppProp.mainPackage.f);
            Iterator<MMPPackageInfo> it = mMPAppProp.subPackages.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().f);
            }
        }
        for (Map.Entry<Integer, com.meituan.mmp.lib.engine.f> entry : com.meituan.mmp.lib.engine.j.d().entrySet()) {
            if (entry != null && entry.getValue() != null) {
                MMPAppProp mMPAppProp2 = entry.getValue().i.l;
                if (mMPAppProp2 == null) {
                    return hashSet;
                }
                hashSet.add(mMPAppProp2.mmpSdk.f);
                hashSet.add(mMPAppProp2.mainPackage.f);
                Iterator<MMPPackageInfo> it2 = mMPAppProp2.subPackages.iterator();
                while (it2.hasNext()) {
                    hashSet.add(it2.next().f);
                }
            }
        }
        return hashSet;
    }

    public static void b(MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "414c5983265472ff4a23061632df92fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "414c5983265472ff4a23061632df92fd");
        } else if (!com.meituan.mmp.lib.mp.a.f()) {
            d.b(mMPPackageInfo);
        } else {
            Object[] objArr2 = {mMPPackageInfo};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9010fe0f5ee7a852faf920106f34a60c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9010fe0f5ee7a852faf920106f34a60c");
            } else if (mMPPackageInfo.f != null) {
                SharedPreferences sharedPreferences = MMPEnvHelper.getSharedPreferences("mmp_miniapp_package_used");
                String string = sharedPreferences.getString(mMPPackageInfo.d() ? b : c, null);
                Gson gson = new Gson();
                List list = (List) gson.fromJson(string, new TypeToken<LinkedList<PackageInfoBean>>() { // from class: com.meituan.mmp.lib.update.PackageManageUtil.6
                }.getType());
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (TextUtils.equals(((PackageInfoBean) it.next()).packageMd5, mMPPackageInfo.f)) {
                            it.remove();
                            break;
                        }
                    }
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(mMPPackageInfo.d() ? b : c, gson.toJson(list));
                edit.apply();
            }
            if (c(mMPPackageInfo) != null) {
                SystemClock.elapsedRealtime();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class c implements b {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.mmp.lib.update.PackageManageUtil.b
        public final void a(int i, String str, a aVar) {
            Object[] objArr = {Integer.valueOf(i), str, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b35049e5db2e42b9ff6479e19b5bde19", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b35049e5db2e42b9ff6479e19b5bde19");
            } else {
                PackageManageUtil.a(i, str, aVar);
            }
        }

        @Override // com.meituan.mmp.lib.update.PackageManageUtil.b
        public final void a(MMPPackageInfo mMPPackageInfo) {
            Object[] objArr = {mMPPackageInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f0261fc70c140d0958b2e08013402ca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f0261fc70c140d0958b2e08013402ca");
            } else {
                PackageManageUtil.a(mMPPackageInfo);
            }
        }

        @Override // com.meituan.mmp.lib.update.PackageManageUtil.b
        public final void b(MMPPackageInfo mMPPackageInfo) {
            Object[] objArr = {mMPPackageInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85ef4223519f7251e83db2926f94e09f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85ef4223519f7251e83db2926f94e09f");
            } else {
                PackageManageUtil.b(mMPPackageInfo);
            }
        }

        @Override // com.meituan.mmp.lib.update.PackageManageUtil.b
        public final void a(MMPAppProp mMPAppProp, boolean z) {
            Object[] objArr = {mMPAppProp, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35326d0982bcc29be9a76ca39c6000c5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35326d0982bcc29be9a76ca39c6000c5");
            } else {
                PackageManageUtil.a(mMPAppProp, z);
            }
        }
    }
}
