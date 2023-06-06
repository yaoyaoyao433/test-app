package com.meituan.android.common.locate;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.android.common.locate.loader.BaseLocationStrategy;
import com.meituan.android.common.locate.loader.LoadConfigImpl;
import com.meituan.android.common.locate.loader.LocationAdopter;
import com.meituan.android.common.locate.loader.LocationLoader;
import com.meituan.android.common.locate.loader.MtLocationLoader;
import com.meituan.android.common.locate.loader.strategy.Accurate;
import com.meituan.android.common.locate.loader.strategy.Instant;
import com.meituan.android.common.locate.loader.strategy.NaviInstant;
import com.meituan.android.common.locate.loader.strategy.Newest;
import com.meituan.android.common.locate.loader.strategy.Normal;
import com.meituan.android.common.locate.loader.strategy.Refresh;
import com.meituan.android.common.locate.loader.strategy.Timer;
import com.meituan.android.common.locate.loader.strategy.UseCache;
import com.meituan.android.common.locate.reporter.e;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class LocationLoaderFactoryImpl implements LocationLoaderFactory {
    private static final String b = LocationLoaderFactoryImpl.class.getPackage().getName();
    public static ChangeQuickRedirect changeQuickRedirect;
    private final MasterLocator a;

    public LocationLoaderFactoryImpl(MasterLocator masterLocator) {
        Object[] objArr = {masterLocator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43fce6c0b7dfc75eca8aebef35216c2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43fce6c0b7dfc75eca8aebef35216c2c");
        } else {
            this.a = masterLocator;
        }
    }

    private Loader<MtLocation> a(Context context, MasterLocator masterLocator, BaseLocationStrategy baseLocationStrategy, LoadConfig loadConfig, Looper looper) {
        Object[] objArr = {context, masterLocator, baseLocationStrategy, loadConfig, looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7d1bf42ae013936602011c9ef37644f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7d1bf42ae013936602011c9ef37644f");
        }
        if (looper == null && Thread.currentThread() != Looper.getMainLooper().getThread()) {
            LogUtils.a("error:createLoader should be called in main thread");
        }
        baseLocationStrategy.setConfig(loadConfig);
        try {
            return new com.meituan.android.common.locate.loader.c(context, masterLocator, baseLocationStrategy, looper);
        } catch (Exception e) {
            LogUtils.a("init MtTencentLocationLoader exception: " + e.getMessage());
            return null;
        }
    }

    private BaseLocationStrategy a(LocationLoaderFactory.LoadStrategy loadStrategy) {
        Object[] objArr = {loadStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "423c217e18a40c0edaacf7fb15a3b733", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseLocationStrategy) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "423c217e18a40c0edaacf7fb15a3b733");
        }
        switch (loadStrategy) {
            case useCache:
                return new UseCache();
            case refresh:
                return new Refresh();
            case newest:
                return new Newest();
            case instant:
                return new Instant();
            case navi_instant:
                return new NaviInstant();
            case accurate:
                return new Accurate();
            case timer:
                return new Timer();
            default:
                return new Normal();
        }
    }

    private String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68ad3de72695db94b5e9b164ee66c58e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68ad3de72695db94b5e9b164ee66c58e");
        }
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace.length <= 2 || stackTrace[2] == null) {
                return null;
            }
            if (stackTrace[2].getClassName().startsWith(b)) {
                return a(stackTrace);
            }
            return stackTrace[2].getClassName() + CommonConstant.Symbol.DOT + stackTrace[2].getMethodName();
        } catch (Exception e) {
            com.meituan.android.common.locate.platform.logs.c.a("getDefaultBid exception:" + e.getMessage(), 3);
            return null;
        }
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        Object[] objArr = {stackTraceElementArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e487940cfbccf73895685f0096003251", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e487940cfbccf73895685f0096003251");
        }
        for (int i = 2; i < stackTraceElementArr.length; i++) {
            if (stackTraceElementArr[i] != null && !stackTraceElementArr[i].getClassName().startsWith(b)) {
                return stackTraceElementArr[i].getClassName() + CommonConstant.Symbol.DOT + stackTraceElementArr[i].getMethodName();
            }
        }
        return null;
    }

    private void a(LoadConfig loadConfig) {
        Object[] objArr = {loadConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1fe5913b4ee8420ab4cb00e966f55df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1fe5913b4ee8420ab4cb00e966f55df");
        } else if (loadConfig == null || !"TRUE".equals(loadConfig.get(LoadConfig.IS_IOT_MODEL))) {
            com.meituan.android.common.locate.cache.b.a(false);
        } else {
            com.meituan.android.common.locate.cache.b.a(true);
        }
    }

    private boolean a(Context context, LoadConfig loadConfig) {
        Object[] objArr = {context, loadConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2feb93bff425cea6ae3605b1cc8c8351", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2feb93bff425cea6ae3605b1cc8c8351")).booleanValue();
        }
        if (loadConfig != null && TextUtils.equals("TRUE", loadConfig.get(LoadConfig.IS_TURN_ON_TENCENT_LOCATION)) && e.a(context).p()) {
            return com.meituan.android.common.locate.loader.tencent.b.a(context).a();
        }
        return false;
    }

    private Loader<MtLocation> b(Context context, MasterLocator masterLocator, BaseLocationStrategy baseLocationStrategy, LoadConfig loadConfig, Looper looper) {
        Object[] objArr = {context, masterLocator, baseLocationStrategy, loadConfig, looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "049f38b5b02f9822d5b38d1598bf5ce7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "049f38b5b02f9822d5b38d1598bf5ce7");
        }
        if (looper == null && Thread.currentThread() != Looper.getMainLooper().getThread()) {
            LogUtils.a("error:createLoader should be called in main thread");
        }
        baseLocationStrategy.setConfig(loadConfig);
        try {
            return new com.meituan.android.common.locate.loader.b(context, masterLocator, baseLocationStrategy, looper);
        } catch (Exception e) {
            LogUtils.a("init MtTencentLocationLoader exception: " + e.getMessage());
            return null;
        }
    }

    private boolean b(Context context, LoadConfig loadConfig) {
        Object[] objArr = {context, loadConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e64686c3d42b98d9f4e020c5e2f82818", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e64686c3d42b98d9f4e020c5e2f82818")).booleanValue();
        }
        if (loadConfig == null) {
            return false;
        }
        try {
            if (loadConfig.get("business_id").equals("biz_bike")) {
                return e.a(context).u();
            }
            return false;
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
            return false;
        }
    }

    @Deprecated
    public LocationLoader createLoader(Context context, MasterLocator masterLocator, BaseLocationStrategy baseLocationStrategy, LoadConfig loadConfig) {
        Object[] objArr = {context, masterLocator, baseLocationStrategy, loadConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7af13af7bea7785c4940dd7e720c3e3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (LocationLoader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7af13af7bea7785c4940dd7e720c3e3e");
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            LogUtils.a("error:createLoader should be called in main thread");
        }
        baseLocationStrategy.setConfig(loadConfig);
        try {
            return new LocationLoader(context, masterLocator, baseLocationStrategy);
        } catch (Exception e) {
            LogUtils.a("init LocationLoader exception: " + e.getMessage());
            return null;
        }
    }

    @Deprecated
    public LocationLoader createLoader(Context context, MasterLocator masterLocator, BaseLocationStrategy baseLocationStrategy, LoadConfig loadConfig, Looper looper) {
        Object[] objArr = {context, masterLocator, baseLocationStrategy, loadConfig, looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06c5e202347ade797d27b894a8ae7233", RobustBitConfig.DEFAULT_VALUE)) {
            return (LocationLoader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06c5e202347ade797d27b894a8ae7233");
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            LogUtils.a("error:createLoader should be called in main thread");
        }
        a(loadConfig);
        baseLocationStrategy.setConfig(loadConfig);
        try {
            return new LocationLoader(context, masterLocator, baseLocationStrategy, looper);
        } catch (Exception e) {
            LogUtils.a("init LocationLoader exception: " + e.getMessage());
            return null;
        }
    }

    @Deprecated
    public LocationLoader createLoader(Context context, MasterLocator masterLocator, LocationAdopter locationAdopter) {
        Object[] objArr = {context, masterLocator, locationAdopter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "953edf7f6e30aeb1eba974fe7eed4054", RobustBitConfig.DEFAULT_VALUE)) {
            return (LocationLoader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "953edf7f6e30aeb1eba974fe7eed4054");
        }
        LogUtils.a("error:createLoader should be called in main thread");
        return new LocationLoader(context, masterLocator, locationAdopter);
    }

    @Override // com.meituan.android.common.locate.LocationLoaderFactory
    @Deprecated
    public Loader<Location> createLocationLoader(Context context, LocationLoaderFactory.LoadStrategy loadStrategy) {
        Object[] objArr = {context, loadStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "614f79fc304fbe71fc0d9b00699af515", RobustBitConfig.DEFAULT_VALUE)) {
            return (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "614f79fc304fbe71fc0d9b00699af515");
        }
        LoadConfigImpl loadConfigImpl = new LoadConfigImpl();
        loadConfigImpl.set("business_id", a());
        return createLoader(context, this.a, a(loadStrategy), loadConfigImpl);
    }

    @Override // com.meituan.android.common.locate.LocationLoaderFactory
    @Deprecated
    public Loader<Location> createLocationLoader(Context context, LocationLoaderFactory.LoadStrategy loadStrategy, LoadConfig loadConfig) {
        Object[] objArr = {context, loadStrategy, loadConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9eb2f23ff4375c7d324ffeb46f70024", RobustBitConfig.DEFAULT_VALUE)) {
            return (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9eb2f23ff4375c7d324ffeb46f70024");
        }
        a(loadConfig);
        try {
            if (loadConfig == null) {
                LoadConfigImpl loadConfigImpl = new LoadConfigImpl();
                loadConfigImpl.set("business_id", a());
                loadConfig = loadConfigImpl;
            } else if (TextUtils.isEmpty(loadConfig.get("business_id"))) {
                loadConfig.set("business_id", a());
            }
        } catch (Exception e) {
            com.meituan.android.common.locate.platform.logs.c.a("createlocationloader exception:" + e.getMessage(), 3);
        }
        return createLoader(context, this.a, a(loadStrategy), loadConfig);
    }

    @Override // com.meituan.android.common.locate.LocationLoaderFactory
    @Deprecated
    public Loader<Location> createLocationLoader(Context context, LocationLoaderFactory.LoadStrategy loadStrategy, LoadConfig loadConfig, Looper looper) {
        Object[] objArr = {context, loadStrategy, loadConfig, looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6072e2e6be9f3a46aa3147ab19c71301", RobustBitConfig.DEFAULT_VALUE)) {
            return (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6072e2e6be9f3a46aa3147ab19c71301");
        }
        if (loadConfig != null && TextUtils.isEmpty(loadConfig.get("business_id"))) {
            loadConfig.set("business_id", a());
        }
        return createLoader(context, this.a, a(loadStrategy), loadConfig, looper);
    }

    @Override // com.meituan.android.common.locate.LocationLoaderFactory
    @Deprecated
    public Loader<Location> createLocationLoader(Context context, LocationLoaderFactory.LoadStrategy loadStrategy, String str) {
        Object[] objArr = {context, loadStrategy, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bf55d7f78d1570af73c6412ca9ad343", RobustBitConfig.DEFAULT_VALUE)) {
            return (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bf55d7f78d1570af73c6412ca9ad343");
        }
        LoadConfigImpl loadConfigImpl = new LoadConfigImpl();
        loadConfigImpl.set("business_id", str);
        return createLocationLoader(context, loadStrategy, loadConfigImpl);
    }

    public MtLocationLoader createMtLoader(Context context, MasterLocator masterLocator, BaseLocationStrategy baseLocationStrategy, LoadConfig loadConfig) {
        Object[] objArr = {context, masterLocator, baseLocationStrategy, loadConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4c6fb0ae65d8e2f3d995d21559f18ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocationLoader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4c6fb0ae65d8e2f3d995d21559f18ec");
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            LogUtils.a("error:createMtLoader should be called in main thread");
        }
        a(loadConfig);
        baseLocationStrategy.setConfig(loadConfig);
        try {
            return new MtLocationLoader(context, masterLocator, baseLocationStrategy);
        } catch (Throwable th) {
            LogUtils.a("init LocationLoader exception: " + th.getMessage());
            return null;
        }
    }

    public MtLocationLoader createMtLoader(Context context, MasterLocator masterLocator, BaseLocationStrategy baseLocationStrategy, LoadConfig loadConfig, Looper looper) {
        Object[] objArr = {context, masterLocator, baseLocationStrategy, loadConfig, looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "951d81cf829051f06efd0eac8111bfd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocationLoader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "951d81cf829051f06efd0eac8111bfd3");
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            LogUtils.a("error:createMtLoader should be called in main thread");
        }
        a(loadConfig);
        baseLocationStrategy.setConfig(loadConfig);
        try {
            return new MtLocationLoader(context, masterLocator, baseLocationStrategy, looper);
        } catch (Throwable th) {
            LogUtils.a("init LocationLoader exception: " + th.getMessage());
            return null;
        }
    }

    @Override // com.meituan.android.common.locate.LocationLoaderFactory
    public Loader<MtLocation> createMtLocationLoader(Context context, LocationLoaderFactory.LoadStrategy loadStrategy) {
        Object[] objArr = {context, loadStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2e49e718c42a9e739cdf59788a11b2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2e49e718c42a9e739cdf59788a11b2a");
        }
        LoadConfigImpl loadConfigImpl = new LoadConfigImpl();
        loadConfigImpl.set("business_id", a());
        return createMtLoader(context, this.a, a(loadStrategy), loadConfigImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    @Override // com.meituan.android.common.locate.LocationLoaderFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.support.v4.content.Loader<com.meituan.android.common.locate.MtLocation> createMtLocationLoader(android.content.Context r17, com.meituan.android.common.locate.LocationLoaderFactory.LoadStrategy r18, com.meituan.android.common.locate.LoadConfig r19) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = 3
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r13 = 0
            r0[r13] = r9
            r1 = 1
            r0[r1] = r10
            r1 = 2
            r0[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r14 = com.meituan.android.common.locate.LocationLoaderFactoryImpl.changeQuickRedirect
            java.lang.String r15 = "593f5b314d4afd39c194511d4a73579d"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r16
            r3 = r14
            r5 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2d
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r8, r14, r13, r15)
            android.support.v4.content.Loader r0 = (android.support.v4.content.Loader) r0
            return r0
        L2d:
            r8.a(r11)     // Catch: java.lang.Exception -> L58
            if (r11 == 0) goto L48
            java.lang.String r0 = "business_id"
            java.lang.String r0 = r11.get(r0)     // Catch: java.lang.Exception -> L58
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L58
            if (r0 == 0) goto L6e
            java.lang.String r0 = "business_id"
            java.lang.String r1 = r16.a()     // Catch: java.lang.Exception -> L58
            r11.set(r0, r1)     // Catch: java.lang.Exception -> L58
            goto L6e
        L48:
            com.meituan.android.common.locate.loader.LoadConfigImpl r0 = new com.meituan.android.common.locate.loader.LoadConfigImpl     // Catch: java.lang.Exception -> L58
            r0.<init>()     // Catch: java.lang.Exception -> L58
            java.lang.String r1 = "business_id"
            java.lang.String r2 = r16.a()     // Catch: java.lang.Exception -> L58
            r0.set(r1, r2)     // Catch: java.lang.Exception -> L58
            r5 = r0
            goto L6f
        L58:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "createMtlocationloader exception:"
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.meituan.android.common.locate.platform.logs.c.a(r0, r12)
        L6e:
            r5 = r11
        L6f:
            boolean r0 = r8.b(r9, r5)
            if (r0 == 0) goto L85
            com.meituan.android.common.locate.MasterLocator r3 = r8.a
            com.meituan.android.common.locate.loader.BaseLocationStrategy r4 = r8.a(r10)
            r6 = 0
            r1 = r16
            r2 = r17
            android.support.v4.content.Loader r0 = r1.b(r2, r3, r4, r5, r6)
            return r0
        L85:
            boolean r0 = r8.a(r9, r5)
            if (r0 == 0) goto L9d
            com.meituan.android.common.locate.MasterLocator r3 = r8.a
            com.meituan.android.common.locate.loader.BaseLocationStrategy r4 = r8.a(r10)
            r6 = 0
            r1 = r16
            r2 = r17
            r5 = r19
            android.support.v4.content.Loader r0 = r1.a(r2, r3, r4, r5, r6)
            return r0
        L9d:
            com.meituan.android.common.locate.MasterLocator r0 = r8.a
            com.meituan.android.common.locate.loader.BaseLocationStrategy r1 = r8.a(r10)
            com.meituan.android.common.locate.loader.MtLocationLoader r0 = r8.createMtLoader(r9, r0, r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.LocationLoaderFactoryImpl.createMtLocationLoader(android.content.Context, com.meituan.android.common.locate.LocationLoaderFactory$LoadStrategy, com.meituan.android.common.locate.LoadConfig):android.support.v4.content.Loader");
    }

    @Override // com.meituan.android.common.locate.LocationLoaderFactory
    public Loader<MtLocation> createMtLocationLoader(Context context, LocationLoaderFactory.LoadStrategy loadStrategy, LoadConfig loadConfig, Looper looper) {
        Object[] objArr = {context, loadStrategy, loadConfig, looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0528cf41018a9f760db3640fe0b89915", RobustBitConfig.DEFAULT_VALUE)) {
            return (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0528cf41018a9f760db3640fe0b89915");
        }
        if (loadConfig != null && TextUtils.isEmpty(loadConfig.get("business_id"))) {
            loadConfig.set("business_id", a());
        }
        a(loadConfig);
        return b(context, loadConfig) ? b(context, this.a, a(loadStrategy), loadConfig, looper) : a(context, loadConfig) ? a(context, this.a, a(loadStrategy), loadConfig, looper) : createMtLoader(context, this.a, a(loadStrategy), loadConfig, looper);
    }

    @Override // com.meituan.android.common.locate.LocationLoaderFactory
    public Loader<MtLocation> createMtLocationLoader(Context context, LocationLoaderFactory.LoadStrategy loadStrategy, String str) {
        Object[] objArr = {context, loadStrategy, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5246de9206c154e92eb896483ff4a97e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5246de9206c154e92eb896483ff4a97e");
        }
        LoadConfigImpl loadConfigImpl = new LoadConfigImpl();
        loadConfigImpl.set("business_id", str);
        return createMtLocationLoader(context, loadStrategy, loadConfigImpl);
    }
}
