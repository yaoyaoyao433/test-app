package com.meituan.android.common.locate;

import android.content.Context;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.locate.altbeacon.beacon.e;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.locator.SystemLocator;
import com.meituan.android.common.locate.offline.IOfflineDataDownloader;
import com.meituan.android.common.locate.offline.IOfflineSeek;
import com.meituan.android.common.locate.offline.IOfflineUserDataDownloader;
import com.meituan.android.common.locate.provider.g;
import com.meituan.android.common.locate.provider.l;
import com.meituan.android.common.locate.provider.p;
import com.meituan.android.common.locate.provider.s;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.reporter.m;
import com.meituan.android.common.locate.util.FakeMainThread;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.raw.a;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.OkHttpClient;
import org.apache.http.client.HttpClient;
/* loaded from: classes2.dex */
public class MasterLocatorFactoryImpl implements MasterLocatorFactory {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static volatile MasterLocatorImpl masterLocator;
    private static AtomicLong sInitStartTime = new AtomicLong(0);

    private synchronized MasterLocator a(final Context context, OkHttpClient okHttpClient, a.InterfaceC0637a interfaceC0637a, Interceptor interceptor, String str, int i, int i2, IOfflineSeek iOfflineSeek, IOfflineDataDownloader iOfflineDataDownloader, IOfflineUserDataDownloader iOfflineUserDataDownloader) {
        Object[] objArr = {context, okHttpClient, interfaceC0637a, interceptor, str, Integer.valueOf(i), Integer.valueOf(i2), iOfflineSeek, iOfflineDataDownloader, iOfflineUserDataDownloader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81a394673b462dccc1e102e4a0864e59", RobustBitConfig.DEFAULT_VALUE)) {
            return (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81a394673b462dccc1e102e4a0864e59");
        }
        sInitStartTime.compareAndSet(0L, System.currentTimeMillis());
        if (context == null) {
            LogUtils.a("createMasterLocator failed because context is null");
            return null;
        }
        if (LogUtils.a() && !LocationUtils.a(context)) {
            LogUtils.setLogEnabled(false);
        }
        Context applicationContext = context.getApplicationContext();
        g.a(applicationContext);
        com.meituan.android.common.locate.provider.a.a(str);
        com.meituan.android.common.locate.provider.a.a(i);
        LocationUtils.a(false);
        OkHttpClient build = (okHttpClient == null || !f.b().getBoolean("traffic_statistics_switch", false)) ? okHttpClient : okHttpClient.newBuilder().addNetworkInterceptor(new com.meituan.android.common.locate.platform.logs.networktraffic.a()).build();
        m mVar = new m(applicationContext, build);
        if (masterLocator == null) {
            masterLocator = new MasterLocatorImpl(applicationContext, mVar);
            if (context != null) {
                com.meituan.android.common.locate.util.g.a().a(new Runnable() { // from class: com.meituan.android.common.locate.MasterLocatorFactoryImpl.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e48d617a2239295a27c77f2f86bbb0cf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e48d617a2239295a27c77f2f86bbb0cf");
                        } else {
                            com.meituan.android.common.locate.platform.babel.a.a(context);
                        }
                    }
                });
            }
            com.meituan.android.common.locate.platform.logs.b.a().a(applicationContext);
            a(applicationContext, build, masterLocator, str, i, interceptor, interfaceC0637a, i2, iOfflineSeek, iOfflineDataDownloader, mVar, iOfflineUserDataDownloader);
        }
        return masterLocator;
    }

    private void a(final Context context, final OkHttpClient okHttpClient, final MasterLocatorImpl masterLocatorImpl, final String str, final int i, final Interceptor interceptor, final a.InterfaceC0637a interfaceC0637a, final int i2, final IOfflineSeek iOfflineSeek, final IOfflineDataDownloader iOfflineDataDownloader, final m mVar, final IOfflineUserDataDownloader iOfflineUserDataDownloader) {
        Object[] objArr = {context, okHttpClient, masterLocatorImpl, str, Integer.valueOf(i), interceptor, interfaceC0637a, Integer.valueOf(i2), iOfflineSeek, iOfflineDataDownloader, mVar, iOfflineUserDataDownloader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be1b5441c43e2550829157eb857e9ef3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be1b5441c43e2550829157eb857e9ef3");
            return;
        }
        com.meituan.android.common.locate.platform.logs.c.a("MasterLocatorFactoryImpl::startmainLocateWorkFlow", 3);
        FakeMainThread.getInstance().post(new Runnable() { // from class: com.meituan.android.common.locate.MasterLocatorFactoryImpl.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bd0f00129ee4d8a1733527b26e5f3692", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bd0f00129ee4d8a1733527b26e5f3692");
                    return;
                }
                MasterLocatorFactoryImpl.b(context, str, interceptor, interfaceC0637a);
                e.a().a(com.meituan.android.common.locate.altbeacon.beacon.util.a.a);
                if (s.a(context).a()) {
                    com.meituan.android.common.locate.lifecycle.c.a().b();
                }
                if (!LocationUtils.k(context)) {
                    masterLocatorImpl.addLocator(GearsLocator.getInstance(context, okHttpClient, i, i2));
                }
                masterLocatorImpl.addLocator(SystemLocator.getInstance(context, "gps"));
                GearsLocator.getInstance(context, okHttpClient, i, i2).setLocationInfoReporter(mVar);
                com.meituan.android.common.locate.util.g.a().a(new Runnable() { // from class: com.meituan.android.common.locate.MasterLocatorFactoryImpl.2.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "71dc930a5c177a020d0053d010f2e336", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "71dc930a5c177a020d0053d010f2e336");
                            return;
                        }
                        try {
                            com.meituan.android.common.locate.platform.sniffer.c.a(context);
                        } catch (Throwable th) {
                            LogUtils.a("init sniffer error: " + th.getMessage());
                        }
                        try {
                            com.meituan.android.common.locate.controller.a.a(context);
                        } catch (Throwable th2) {
                            LogUtils.a(getClass(), th2);
                        }
                    }
                });
                if (LocationUtils.a(context)) {
                    Horn.debug(context, "locate", true);
                    Horn.debug(context, "alog", true);
                    Horn.debug(context, "track", true);
                    Horn.debug(context, "collecter", true);
                }
                com.meituan.android.common.locate.util.g.a().a(new Runnable() { // from class: com.meituan.android.common.locate.MasterLocatorFactoryImpl.2.2
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "9e058ffe1bba239076d42caeff12c7d8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "9e058ffe1bba239076d42caeff12c7d8");
                            return;
                        }
                        try {
                            f.a(context);
                        } catch (Throwable th) {
                            LogUtils.a("ConfigCenter init failed :" + th.getMessage());
                        }
                    }
                });
                if (iOfflineDataDownloader != null) {
                    p.a(iOfflineDataDownloader);
                    LogUtils.a("buildMasterLocator()初始化时iOfflineDataDownloader != null");
                }
                if (iOfflineSeek != null) {
                    p.a(iOfflineSeek);
                    LogUtils.a("buildMasterLocator()初始化时iOfflineSeek != null");
                }
                if (iOfflineUserDataDownloader != null) {
                    p.a(iOfflineUserDataDownloader);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, Interceptor interceptor, a.InterfaceC0637a interfaceC0637a) {
        Object[] objArr = {context, str, interceptor, interfaceC0637a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8d44618c8ab9e134d2b63c5ce2abf09d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8d44618c8ab9e134d2b63c5ce2abf09d");
            return;
        }
        l.a(context);
        com.meituan.android.common.locate.provider.b.a(str);
        if (interceptor != null) {
            com.meituan.android.common.locate.remote.b.a(interceptor);
        }
        if (interfaceC0637a != null) {
            com.meituan.android.common.locate.remote.a.a(interfaceC0637a);
        }
        if (interfaceC0637a != null) {
            com.meituan.android.common.locate.remote.c.a(interfaceC0637a);
        }
    }

    @Deprecated
    public static void startFirstLocator(Context context, String str, int i, a.InterfaceC0637a interfaceC0637a, OkHttpClient okHttpClient) {
        Object[] objArr = {context, str, Integer.valueOf(i), interfaceC0637a, okHttpClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75eaf4ce3b78fec96cbb031fa7e33f86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75eaf4ce3b78fec96cbb031fa7e33f86");
            return;
        }
        sInitStartTime.compareAndSet(0L, System.currentTimeMillis());
        if (context == null) {
            return;
        }
        if (LogUtils.a() && !LocationUtils.a(context)) {
            LogUtils.setLogEnabled(false);
        }
        Context applicationContext = context.getApplicationContext();
        g.a(applicationContext);
        com.meituan.android.common.locate.provider.a.a(str);
        m mVar = new m(applicationContext, okHttpClient);
        if (masterLocator == null) {
            masterLocator = new MasterLocatorImpl(applicationContext, mVar);
        }
        l.a(applicationContext);
        if (interfaceC0637a != null) {
            com.meituan.android.common.locate.remote.a.a(interfaceC0637a);
        }
        if (interfaceC0637a != null) {
            com.meituan.android.common.locate.remote.c.a(interfaceC0637a);
        }
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    public MasterLocator createMasterLocator(Context context, a.InterfaceC0637a interfaceC0637a, Interceptor interceptor, String str, int i, int i2) {
        Object[] objArr = {context, interfaceC0637a, interceptor, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "467631425002e3af6fae01d1d22c7a4f", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "467631425002e3af6fae01d1d22c7a4f") : a(context, null, interfaceC0637a, interceptor, str, i, i2, null, null, null);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    @Deprecated
    public MasterLocator createMasterLocator(Context context, a.InterfaceC0637a interfaceC0637a, Interceptor interceptor, String str, int i, int i2, IOfflineSeek iOfflineSeek, IOfflineDataDownloader iOfflineDataDownloader, IOfflineUserDataDownloader iOfflineUserDataDownloader) {
        Object[] objArr = {context, interfaceC0637a, interceptor, str, Integer.valueOf(i), Integer.valueOf(i2), iOfflineSeek, iOfflineDataDownloader, iOfflineUserDataDownloader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3c67f707468fef1015582b350f55965", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3c67f707468fef1015582b350f55965") : a(context, null, interfaceC0637a, interceptor, str, i, i2, iOfflineSeek, iOfflineDataDownloader, iOfflineUserDataDownloader);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    public MasterLocator createMasterLocator(Context context, a.InterfaceC0637a interfaceC0637a, String str) {
        Object[] objArr = {context, interfaceC0637a, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ead82b46fb11b2bb0aa09bb537885209", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ead82b46fb11b2bb0aa09bb537885209") : createMasterLocator(context, interfaceC0637a, str, 0);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    public MasterLocator createMasterLocator(Context context, a.InterfaceC0637a interfaceC0637a, String str, int i) {
        Object[] objArr = {context, interfaceC0637a, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97dc0ed2ba41e4b00b8803cb562f49cb", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97dc0ed2ba41e4b00b8803cb562f49cb") : createMasterLocator(context, interfaceC0637a, str, i, 0);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    public MasterLocator createMasterLocator(Context context, a.InterfaceC0637a interfaceC0637a, String str, int i, int i2) {
        Object[] objArr = {context, interfaceC0637a, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23ce2f08d71acce91e17e6a084585aaa", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23ce2f08d71acce91e17e6a084585aaa") : createMasterLocator(context, interfaceC0637a, (Interceptor) null, str, i, 0);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    public MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient) {
        Object[] objArr = {context, okHttpClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f553acd57a142eff7706612e9b88df78", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f553acd57a142eff7706612e9b88df78") : createMasterLocator(context, okHttpClient, (String) null);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    public MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient, a.InterfaceC0637a interfaceC0637a, Interceptor interceptor, String str, int i, int i2) {
        Object[] objArr = {context, okHttpClient, interfaceC0637a, interceptor, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a2e508a6c15a78322556f32b3b8aea0", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a2e508a6c15a78322556f32b3b8aea0") : createMasterLocator(context, okHttpClient, interfaceC0637a, interceptor, str, i, i2, null, null, null);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    @Deprecated
    public MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient, a.InterfaceC0637a interfaceC0637a, Interceptor interceptor, String str, int i, int i2, IOfflineSeek iOfflineSeek, IOfflineDataDownloader iOfflineDataDownloader, IOfflineUserDataDownloader iOfflineUserDataDownloader) {
        Object[] objArr = {context, okHttpClient, interfaceC0637a, interceptor, str, Integer.valueOf(i), Integer.valueOf(i2), iOfflineSeek, iOfflineDataDownloader, iOfflineUserDataDownloader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4590d090a90460767fdc6336d742e5ac", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4590d090a90460767fdc6336d742e5ac") : a(context, okHttpClient, interfaceC0637a, interceptor, str, i, i2, iOfflineSeek, iOfflineDataDownloader, iOfflineUserDataDownloader);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    public MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient, a.InterfaceC0637a interfaceC0637a, String str) {
        Object[] objArr = {context, okHttpClient, interfaceC0637a, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed73ce721e31296861a15355e7625654", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed73ce721e31296861a15355e7625654") : createMasterLocator(context, okHttpClient, interfaceC0637a, str, 0);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    public MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient, a.InterfaceC0637a interfaceC0637a, String str, int i) {
        Object[] objArr = {context, okHttpClient, interfaceC0637a, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fe78043a07fe88e31ae6c675d9fc73b", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fe78043a07fe88e31ae6c675d9fc73b") : createMasterLocator(context, okHttpClient, interfaceC0637a, str, i, 0);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    public MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient, a.InterfaceC0637a interfaceC0637a, String str, int i, int i2) {
        Object[] objArr = {context, okHttpClient, interfaceC0637a, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b57ad8dfc17fd13be522835d182c996", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b57ad8dfc17fd13be522835d182c996") : createMasterLocator(context, okHttpClient, interfaceC0637a, (Interceptor) null, str, i, i2);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    public MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient, String str) {
        Object[] objArr = {context, okHttpClient, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b11ee6503258af9543f51cc81414678", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b11ee6503258af9543f51cc81414678") : createMasterLocator(context, okHttpClient, (a.InterfaceC0637a) null, str);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    public MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient, String str, int i) {
        Object[] objArr = {context, okHttpClient, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e5f2fae17eed57ebb96ac4562f06d71", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e5f2fae17eed57ebb96ac4562f06d71") : createMasterLocator(context, okHttpClient, (a.InterfaceC0637a) null, (Interceptor) null, str, i, 0);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    @Deprecated
    public MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient, String str, int i, IOfflineSeek iOfflineSeek, IOfflineDataDownloader iOfflineDataDownloader, IOfflineUserDataDownloader iOfflineUserDataDownloader) {
        Object[] objArr = {context, okHttpClient, str, Integer.valueOf(i), iOfflineSeek, iOfflineDataDownloader, iOfflineUserDataDownloader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af08aec1f7c5db2590d42d4d3ae0a6fc", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af08aec1f7c5db2590d42d4d3ae0a6fc") : createMasterLocator(context, okHttpClient, null, null, str, i, 0, iOfflineSeek, iOfflineDataDownloader, iOfflineUserDataDownloader);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    @Deprecated
    public MasterLocator createMasterLocator(Context context, HttpClient httpClient) {
        Object[] objArr = {context, httpClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b681f4973bd200b5a6b111a89120fdfe", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b681f4973bd200b5a6b111a89120fdfe") : createMasterLocator(context, httpClient, (String) null);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    @Deprecated
    public MasterLocator createMasterLocator(Context context, HttpClient httpClient, a.InterfaceC0637a interfaceC0637a, Interceptor interceptor, String str, int i, int i2) {
        Object[] objArr = {context, httpClient, interfaceC0637a, interceptor, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "890c10cd19f38484741ef41d491787a4", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "890c10cd19f38484741ef41d491787a4") : a(context, null, interfaceC0637a, interceptor, str, i, i2, null, null, null);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    @Deprecated
    public MasterLocator createMasterLocator(Context context, HttpClient httpClient, a.InterfaceC0637a interfaceC0637a, String str) {
        Object[] objArr = {context, httpClient, interfaceC0637a, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebadf7d7869bf332bbcd2cfdc05d077a", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebadf7d7869bf332bbcd2cfdc05d077a") : createMasterLocator(context, httpClient, interfaceC0637a, str, 0);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    @Deprecated
    public MasterLocator createMasterLocator(Context context, HttpClient httpClient, a.InterfaceC0637a interfaceC0637a, String str, int i) {
        Object[] objArr = {context, httpClient, interfaceC0637a, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86c9c0c63020c2d1b819ae823b12da2d", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86c9c0c63020c2d1b819ae823b12da2d") : createMasterLocator(context, httpClient, interfaceC0637a, str, i, 0);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    @Deprecated
    public MasterLocator createMasterLocator(Context context, HttpClient httpClient, a.InterfaceC0637a interfaceC0637a, String str, int i, int i2) {
        Object[] objArr = {context, httpClient, interfaceC0637a, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69d82125257c235c06aa1fb598a9cd90", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69d82125257c235c06aa1fb598a9cd90") : createMasterLocator(context, httpClient, interfaceC0637a, (Interceptor) null, str, i, i2);
    }

    @Override // com.meituan.android.common.locate.MasterLocatorFactory
    @Deprecated
    public MasterLocator createMasterLocator(Context context, HttpClient httpClient, String str) {
        Object[] objArr = {context, httpClient, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9de7c5beb27d02f4f3f475800a66124c", RobustBitConfig.DEFAULT_VALUE) ? (MasterLocator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9de7c5beb27d02f4f3f475800a66124c") : createMasterLocator(context, httpClient, (a.InterfaceC0637a) null, str);
    }
}
