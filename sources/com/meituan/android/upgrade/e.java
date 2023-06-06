package com.meituan.android.upgrade;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.NotificationCompat;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.cipstorage.q;
import com.meituan.android.downloadmanager.model.DownloadInfo;
import com.meituan.android.upgrade.c;
import com.meituan.android.upgrade.ui.UpgradeBaseDialog;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.android.uptodate.model.VersionInfoBean;
import com.meituan.android.uptodate.util.g;
import com.meituan.android.uptodate.util.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.tencent.mapsdk.internal.y;
import java.io.File;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e extends UpgradeBaseDialog.a {
    public static ChangeQuickRedirect a;
    private static volatile e j;
    public Context b;
    public com.meituan.android.upgrade.b c;
    public volatile VersionInfo d;
    public long e;
    public boolean f;
    volatile String g;
    CopyOnWriteArrayList<com.meituan.android.upgrade.c> h;
    public ScheduledExecutorService i;
    private NotificationManager k;
    private int l;
    private q m;
    private com.meituan.android.downloadmanager.callback.b n;
    private CopyOnWriteArrayList<Object> o;
    private b p;
    private Handler q;
    private c r;

    public static /* synthetic */ void a(e eVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "6d8ed507a8b21b4814f4dbb5ee5eceaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "6d8ed507a8b21b4814f4dbb5ee5eceaf");
        } else if (eVar.d != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("result", Integer.valueOf(i));
            hashMap.put("force", Integer.valueOf(eVar.d.forceupdate));
            long b2 = eVar.d().b(g.a(eVar.d, "download_start_time_"), 0L);
            if (b2 > 0) {
                long currentTimeMillis = System.currentTimeMillis() - b2;
                eVar.d().b(g.a(eVar.d, "download_start_time_"));
                if (currentTimeMillis > 0) {
                    com.meituan.android.upgrade.report.a.a().a("DDUpdateDownload", Long.valueOf(currentTimeMillis), hashMap);
                }
            }
        }
    }

    public static /* synthetic */ void d(e eVar) {
        long j2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "f6152602ad2ca2adcc2f475e75d51224", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "f6152602ad2ca2adcc2f475e75d51224");
            return;
        }
        try {
            File file = new File(com.meituan.android.uptodate.util.d.c(eVar.b));
            if (file.exists()) {
                long b2 = eVar.d().b("install_version_code", -1L);
                if (b2 > 0) {
                    if (eVar.e <= 0) {
                        j2 = g.a(eVar.b);
                    } else {
                        j2 = eVar.e;
                    }
                    if (j2 >= b2) {
                        file.delete();
                    }
                }
            }
            eVar.d().b("install_version_code");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void e(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "8b6d622ece18e85e558db28edc64ac25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "8b6d622ece18e85e558db28edc64ac25");
        } else if (eVar.r == null) {
            eVar.q.post(new Runnable() { // from class: com.meituan.android.upgrade.e.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6eba93799322f9d0e0813037ded35d0f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6eba93799322f9d0e0813037ded35d0f");
                        return;
                    }
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                    intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                    e.this.r = new c();
                    e.this.b.registerReceiver(e.this.r, intentFilter);
                }
            });
        }
    }

    public static /* synthetic */ void l(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "8913f93a94d88f742e4459bf4b6d0f59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "8913f93a94d88f742e4459bf4b6d0f59");
            return;
        }
        com.meituan.android.downloadmanager.b.a(eVar.b).a(eVar.g, com.meituan.android.uptodate.util.d.a(eVar.b), eVar.c.e(), eVar.c.k(), eVar.n);
    }

    public static /* synthetic */ void m(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "0a7199174a2cb475a3ddb836f5b570c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "0a7199174a2cb475a3ddb836f5b570c6");
        } else {
            com.meituan.android.downloadmanager.b.a(eVar.b).cancel(eVar.g, eVar.n);
        }
    }

    public static /* synthetic */ void n(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "9751a5440c1d2fbe0fa14079c87a8142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "9751a5440c1d2fbe0fa14079c87a8142");
        } else if (eVar.p != null) {
            eVar.b.unregisterReceiver(eVar.p);
            eVar.p = null;
        }
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "168165870feb6e675d58c232d54943f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "168165870feb6e675d58c232d54943f3");
            return;
        }
        this.l = e.class.hashCode();
        this.f = false;
        this.h = new CopyOnWriteArrayList<>();
        this.o = new CopyOnWriteArrayList<>();
        this.i = com.sankuai.android.jarvis.c.b("update-pool", 2);
        this.q = new Handler(Looper.getMainLooper());
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7dea5a27436224ab05ecd7458cba63aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7dea5a27436224ab05ecd7458cba63aa");
        }
        if (j == null) {
            synchronized (e.class) {
                if (j == null) {
                    j = new e();
                }
            }
        }
        return j;
    }

    boolean a(List<VersionInfo.PeakPeriod> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aca907b6ad083c0033d4ce2e99a335b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aca907b6ad083c0033d4ce2e99a335b")).booleanValue();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        Calendar calendar3 = Calendar.getInstance();
        for (VersionInfo.PeakPeriod peakPeriod : list) {
            try {
                Date parse = simpleDateFormat.parse(peakPeriod.startTime);
                Date parse2 = simpleDateFormat.parse(peakPeriod.endTime);
                Date parse3 = simpleDateFormat.parse(simpleDateFormat.format(new Date()));
                if (parse3 != parse && parse3 != parse2) {
                    calendar.setTime(parse3);
                    calendar2.setTime(parse);
                    calendar3.setTime(parse2);
                    if (calendar.after(calendar2) && calendar.before(calendar3)) {
                        return true;
                    }
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    boolean a(VersionInfo versionInfo) {
        Object[] objArr = {versionInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dc3f219e300c103fad60bcde8220a7b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dc3f219e300c103fad60bcde8220a7b")).booleanValue() : versionInfo != null && !TextUtils.isEmpty(versionInfo.appHttpsUrl) && this.e < ((long) versionInfo.currentVersion) && versionInfo.isUpdated;
    }

    public final void a(final boolean z, final boolean z2, final com.meituan.android.upgrade.a aVar) {
        Call<VersionInfoBean> a2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "872c48879c041629c6f5c1be9476ff6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "872c48879c041629c6f5c1be9476ff6d");
            return;
        }
        com.meituan.android.uptodate.retrofit.b a3 = com.meituan.android.uptodate.retrofit.b.a(this.b);
        com.meituan.android.upgrade.b bVar = this.c;
        Object[] objArr2 = {bVar, Integer.valueOf(z ? 1 : 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.uptodate.retrofit.b.a;
        if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "b4ad4f5b7d007a83ac94434c31f70305", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (Call) PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "b4ad4f5b7d007a83ac94434c31f70305");
        } else {
            a2 = a3.a(bVar.a(), a().e, bVar.h(), "", bVar.d(), bVar.e(), bVar.i(), null, "", z ? 1 : 0);
        }
        a2.a(new com.sankuai.meituan.retrofit2.f<VersionInfoBean>() { // from class: com.meituan.android.upgrade.e.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Code restructure failed: missing block: B:67:0x0197, code lost:
                if (r13 < (((r1.notifyInterval * 24) * com.meituan.android.legwork.bean.monitor.DaBaiBean.DABAI_DATA_EXPIRE_TIME) * 1000)) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01bc, code lost:
                if (r13 < (((r1.notifyFree * 24) * com.meituan.android.legwork.bean.monitor.DaBaiBean.DABAI_DATA_EXPIRE_TIME) * 1000)) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:90:0x01f8, code lost:
                if (r0.a(r1.peakPeriodList) != false) goto L42;
             */
            @Override // com.sankuai.meituan.retrofit2.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onResponse(com.sankuai.meituan.retrofit2.Call<com.meituan.android.uptodate.model.VersionInfoBean> r21, com.sankuai.meituan.retrofit2.Response<com.meituan.android.uptodate.model.VersionInfoBean> r22) {
                /*
                    Method dump skipped, instructions count: 593
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.upgrade.e.AnonymousClass1.onResponse(com.sankuai.meituan.retrofit2.Call, com.sankuai.meituan.retrofit2.Response):void");
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<VersionInfoBean> call, Throwable th) {
                Object[] objArr3 = {call, th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5609008408b00c8e0d0aa2604447e4e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5609008408b00c8e0d0aa2604447e4e2");
                    return;
                }
                th.printStackTrace();
                if (aVar != null) {
                    aVar.a(new d(th));
                }
            }
        });
    }

    private static Intent d(VersionInfo versionInfo) {
        Object[] objArr = {versionInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22013e572738de51df56a08dc2387f20", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22013e572738de51df56a08dc2387f20");
        }
        if (TextUtils.isEmpty(versionInfo.marketUri) || TextUtils.isEmpty(versionInfo.marketPackage)) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(versionInfo.marketUri));
        intent.addFlags(y.a);
        intent.setPackage(versionInfo.marketPackage);
        return intent;
    }

    public final boolean a(Context context, VersionInfo versionInfo) {
        Intent d;
        Object[] objArr = {context, versionInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "834f165fa2bd7dec43d1de624ac1b5f1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "834f165fa2bd7dec43d1de624ac1b5f1")).booleanValue() : (context == null || versionInfo == null || (d = d(versionInfo)) == null || d.resolveActivity(context.getPackageManager()) == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(Context context, VersionInfo versionInfo) {
        boolean z = 0;
        z = 0;
        Object[] objArr = {context, versionInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9da00533a3b2d25e0cca25242e6664f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9da00533a3b2d25e0cca25242e6664f2")).booleanValue();
        }
        if (context == null || versionInfo == null) {
            com.meituan.android.upgrade.report.a.a().a(1);
            return false;
        }
        Intent d = d(versionInfo);
        if (d != null) {
            if (d.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(d);
                z = 1;
            } else {
                g.a("您的手机没有安装应用市场");
            }
        }
        com.meituan.android.upgrade.report.a.a().a(!z);
        return z;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8307f7ab667b36ae938e0c0e9ef79da6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8307f7ab667b36ae938e0c0e9ef79da6");
            return;
        }
        final String c2 = com.meituan.android.uptodate.util.d.c(this.b);
        if (TextUtils.isEmpty(c2) || !new File(c2).exists()) {
            g.a(this.b.getString(R.string.update_no_install_file));
            com.meituan.android.upgrade.report.a.a().a(1);
            return;
        }
        this.i.execute(new Runnable() { // from class: com.meituan.android.upgrade.e.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e70dd959a138fe02125b492fdce39f25", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e70dd959a138fe02125b492fdce39f25");
                    return;
                }
                final File file = new File(c2);
                if (!TextUtils.equals(com.meituan.android.uptodate.util.c.a(e.this.b, file), e.a().c.b())) {
                    g.a(e.this.b.getString(R.string.update_toast_signature_not_match));
                    com.meituan.android.upgrade.report.a.a().a(1);
                    return;
                }
                e.this.q.post(new Runnable() { // from class: com.meituan.android.upgrade.e.2.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fc5b742bbd4013632215c51af3b94c9a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fc5b742bbd4013632215c51af3b94c9a");
                            return;
                        }
                        try {
                            Intent intent = new Intent();
                            intent.addFlags(y.a);
                            intent.setAction("android.intent.action.VIEW");
                            if (Build.VERSION.SDK_INT >= 24) {
                                intent.addFlags(1);
                                Context context = e.this.b;
                                intent.setDataAndType(FileProvider.getUriForFile(context, e.this.b.getPackageName() + "android.upgrade.fileprovider", file), "application/vnd.android.package-archive");
                            } else {
                                intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
                            }
                            e.this.d().a("install_version_code", e.this.d.currentVersion);
                            e.this.b.startActivity(intent);
                            com.meituan.android.upgrade.report.a.a().a(0);
                        } catch (Exception e) {
                            e.printStackTrace();
                            com.meituan.android.upgrade.report.a.a().a(1);
                        }
                    }
                });
            }
        });
    }

    public final void a(VersionInfo versionInfo, boolean z, com.meituan.android.upgrade.c cVar) {
        Object[] objArr = {versionInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7ade72647a2926859395bcdaa13aa5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7ade72647a2926859395bcdaa13aa5b");
        } else if (versionInfo == null || TextUtils.isEmpty(versionInfo.appHttpsUrl)) {
        } else {
            this.d = versionInfo;
            if (!TextUtils.isEmpty(this.g) && !TextUtils.equals(versionInfo.appHttpsUrl, this.g)) {
                c();
            }
            this.g = versionInfo.appHttpsUrl;
            this.n = new a(versionInfo, z);
            a(cVar);
            if (g.a(this.b, versionInfo.currentVersion)) {
                h();
                e();
                if (!z) {
                    a(versionInfo, com.meituan.android.upgrade.ui.a.DOWNLOAD_SUCCESS, "已下载完成点击安装 ", 100);
                }
                String c2 = com.meituan.android.uptodate.util.d.c(this.b);
                long length = new File(c2).length();
                Iterator<com.meituan.android.upgrade.c> it = this.h.iterator();
                while (it.hasNext()) {
                    it.next().a(c2, length);
                }
                this.h.clear();
                if (versionInfo.forceupdate == 1 || !z) {
                    b();
                    return;
                }
                return;
            }
            com.meituan.android.downloadmanager.b.a(this.b).a(this.g, com.meituan.android.uptodate.util.d.a(this.b), this.c.e(), this.c.k(), this.n);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07ca4360301691457293e73e51e84da8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07ca4360301691457293e73e51e84da8");
        } else if (this.d == null || !TextUtils.equals(this.d.appHttpsUrl, this.g)) {
        } else {
            com.meituan.android.downloadmanager.b.a(this.b).cancel(this.g, this.n);
            g();
            e();
            this.h.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.g = null;
        this.n = null;
    }

    public final q d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4bc6e75dc9f343fb624faf2824f4e16", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4bc6e75dc9f343fb624faf2824f4e16");
        }
        if (this.m == null) {
            this.m = q.a(this.b, "ddUpdate", 0);
        }
        return this.m;
    }

    public final void a(com.meituan.android.upgrade.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a14a8df7d8f55c8186743c22d96dd38c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a14a8df7d8f55c8186743c22d96dd38c");
        } else if (cVar == null || this.h.contains(cVar)) {
        } else {
            this.h.add(cVar);
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6a73412f43191f356083fbb238a6c3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6a73412f43191f356083fbb238a6c3a");
        } else if (this.p == null) {
            this.p = new b();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(b.b);
            intentFilter.addAction(b.c);
            this.b.registerReceiver(this.p, intentFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(VersionInfo versionInfo, com.meituan.android.upgrade.ui.a aVar, String str, int i) {
        Object[] objArr = {versionInfo, aVar, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6655dc1a180a8e193e389943fb567735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6655dc1a180a8e193e389943fb567735");
        } else if (versionInfo == null || versionInfo.forceupdate == 1) {
        } else {
            if (aVar != com.meituan.android.upgrade.ui.a.DOWNLOADING) {
                g();
            }
            if (this.k == null) {
                this.k = (NotificationManager) this.b.getSystemService(RemoteMessageConst.NOTIFICATION);
                if (Build.VERSION.SDK_INT >= 26) {
                    NotificationChannel notificationChannel = new NotificationChannel("download", "下载管理", 2);
                    notificationChannel.enableVibration(false);
                    this.k.createNotificationChannel(notificationChannel);
                }
            }
            NotificationCompat.Builder builder = new NotificationCompat.Builder(this.b, "download");
            builder.setContentTitle(str).setProgress(100, i, false);
            if (aVar == com.meituan.android.upgrade.ui.a.DOWNLOADING) {
                builder.setAutoCancel(false);
            } else {
                builder.setAutoCancel(true);
            }
            f f = this.c.f();
            if (f != null) {
                if (f.l > 0) {
                    builder.setSmallIcon(f.l);
                } else {
                    int i2 = this.b.getApplicationInfo().icon;
                    if (i2 > 0) {
                        builder.setSmallIcon(i2);
                    }
                }
                if (f.m > 0) {
                    builder.setLargeIcon(com.sankuai.waimai.launcher.util.image.a.a(this.b.getResources(), f.m));
                } else {
                    int i3 = this.b.getApplicationInfo().icon;
                    if (i3 > 0) {
                        builder.setLargeIcon(com.sankuai.waimai.launcher.util.image.a.a(this.b.getResources(), i3));
                    }
                }
                if (f.n > 0) {
                    builder.setColor(this.b.getResources().getColor(f.n));
                }
            }
            Intent intent = new Intent();
            intent.setAction(b.b);
            intent.putExtra("extra_dialog_type", aVar);
            intent.putExtra("extra_progress_percent", i);
            intent.putExtra("extra_version_info", versionInfo);
            intent.setPackage(this.b.getPackageName());
            builder.setContentIntent(PendingIntent.getBroadcast(this.b, aVar.ordinal(), intent, 134217728));
            Intent intent2 = new Intent();
            intent2.setAction(b.c);
            intent2.setPackage(this.b.getPackageName());
            builder.setDeleteIntent(PendingIntent.getBroadcast(this.b, aVar.ordinal(), intent2, 134217728));
            f();
            this.k.notify(this.l, builder.build());
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd34a0994fc6e3711b5f70505364ba9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd34a0994fc6e3711b5f70505364ba9a");
        } else if (this.k != null) {
            this.k.cancel(this.l);
        }
    }

    @Override // com.meituan.android.upgrade.ui.UpgradeBaseDialog.a
    public final void a(UpgradeBaseDialog upgradeBaseDialog) {
        Object[] objArr = {upgradeBaseDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9f81e382a595df19cec2a8f4767b879", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9f81e382a595df19cec2a8f4767b879");
            return;
        }
        if (!this.d.isManual) {
            d().a(c(upgradeBaseDialog.b()), System.currentTimeMillis());
        }
        Iterator<Object> it = this.o.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.meituan.android.upgrade.ui.UpgradeBaseDialog.a
    public final void b(UpgradeBaseDialog upgradeBaseDialog) {
        Object[] objArr = {upgradeBaseDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60eb06d0dbb9e3ea1fa4ec496453be68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60eb06d0dbb9e3ea1fa4ec496453be68");
            return;
        }
        Iterator<Object> it = this.o.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.meituan.android.upgrade.ui.UpgradeBaseDialog.a
    public final void c(UpgradeBaseDialog upgradeBaseDialog) {
        Object[] objArr = {upgradeBaseDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cd31b39cde196baf0bd4c5e0ac4b1bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cd31b39cde196baf0bd4c5e0ac4b1bd");
            return;
        }
        Iterator<Object> it = this.o.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.meituan.android.upgrade.ui.UpgradeBaseDialog.a
    public final void d(UpgradeBaseDialog upgradeBaseDialog) {
        Object[] objArr = {upgradeBaseDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd822035fe13a2ab047a8ba7da97f687", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd822035fe13a2ab047a8ba7da97f687");
            return;
        }
        VersionInfo b2 = upgradeBaseDialog.b();
        if (!b2.isManual) {
            d().a(b(b2), d().b(b(b2), 0) + 1);
        }
        Iterator<Object> it = this.o.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    String b(VersionInfo versionInfo) {
        Object[] objArr = {versionInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "834fb2b48b1762c278b79c269fe6a573", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "834fb2b48b1762c278b79c269fe6a573");
        }
        return "cancel_times_" + versionInfo.publishType + CommonConstant.Symbol.UNDERLINE + versionInfo.publishId + CommonConstant.Symbol.UNDERLINE + this.e;
    }

    String c(VersionInfo versionInfo) {
        Object[] objArr = {versionInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1493db3b5a057fccf5f42cf25b9d3643", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1493db3b5a057fccf5f42cf25b9d3643");
        }
        return "publish_last_show_time" + versionInfo.publishType + CommonConstant.Symbol.UNDERLINE + versionInfo.publishId + CommonConstant.Symbol.UNDERLINE + this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements com.meituan.android.downloadmanager.callback.b {
        public static ChangeQuickRedirect a;
        VersionInfo b;
        boolean c;
        int d;

        public a(VersionInfo versionInfo, boolean z) {
            Object[] objArr = {e.this, versionInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a49b566426124d666b2a5fdd2732d58c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a49b566426124d666b2a5fdd2732d58c");
                return;
            }
            this.d = 0;
            this.b = versionInfo;
            this.c = z;
        }

        @Override // com.meituan.android.downloadmanager.callback.b
        public final void a(@NonNull DownloadInfo downloadInfo) {
            Object[] objArr = {downloadInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f042e296c4ea547f70525571fa81197", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f042e296c4ea547f70525571fa81197");
                return;
            }
            this.d = 0;
            if (this.b != null && this.b.netLimit == 1) {
                e.e(e.this);
            }
            Iterator it = e.this.h.iterator();
            while (it.hasNext()) {
                ((com.meituan.android.upgrade.c) it.next()).a(downloadInfo.b);
            }
            e.this.d().a(g.a(this.b, "download_start_time_"), System.currentTimeMillis());
        }

        @Override // com.meituan.android.downloadmanager.callback.b
        public final void b(@NonNull DownloadInfo downloadInfo) {
            Object[] objArr = {downloadInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e75fbad7b503607a568cd582f8d57da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e75fbad7b503607a568cd582f8d57da");
                return;
            }
            long j = downloadInfo.c < 0 ? 0L : downloadInfo.c;
            long j2 = downloadInfo.b < 0 ? 0L : downloadInfo.b;
            if (j > j2) {
                j = j2;
            }
            if (j2 > 0) {
                this.d = (int) ((j * 100) / j2);
            }
            if (!this.c) {
                e eVar = e.this;
                VersionInfo versionInfo = this.b;
                com.meituan.android.upgrade.ui.a aVar = com.meituan.android.upgrade.ui.a.DOWNLOADING;
                eVar.a(versionInfo, aVar, "正在下载 " + this.d + "%", this.d);
            }
            Iterator it = e.this.h.iterator();
            while (it.hasNext()) {
                ((com.meituan.android.upgrade.c) it.next()).a(downloadInfo.c, downloadInfo.b);
            }
        }

        @Override // com.meituan.android.downloadmanager.callback.b
        public final void c(@NonNull final DownloadInfo downloadInfo) {
            Object[] objArr = {downloadInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "343bda466fda83d478a55a36305206b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "343bda466fda83d478a55a36305206b3");
            } else if (TextUtils.isEmpty(downloadInfo.d) || !new File(downloadInfo.d).exists()) {
                a(new IllegalStateException("apk downloaded destPath file not exists!"));
                e.a(e.this, 1);
            } else {
                this.d = 100;
                e.a(e.this, 0);
                e.this.i.execute(new Runnable() { // from class: com.meituan.android.upgrade.e.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        final File file;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51daa194a13fd2cdd40874e8d930b752", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51daa194a13fd2cdd40874e8d930b752");
                            return;
                        }
                        a aVar = a.this;
                        String str = downloadInfo.d;
                        Object[] objArr3 = {str};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "0e60b94170a19990b20297bf0c5b9cfa", RobustBitConfig.DEFAULT_VALUE)) {
                            file = (File) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "0e60b94170a19990b20297bf0c5b9cfa");
                        } else {
                            String c = com.meituan.android.uptodate.util.d.c(e.this.b);
                            File file2 = new File(c);
                            if (!TextUtils.equals(str, c)) {
                                File file3 = new File(str);
                                file2.delete();
                                file3.renameTo(file2);
                            }
                            file = file2;
                        }
                        e.this.h();
                        e.this.e();
                        e.this.q.post(new Runnable() { // from class: com.meituan.android.upgrade.e.a.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "36103367799b5011ca231555b8c160b7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "36103367799b5011ca231555b8c160b7");
                                    return;
                                }
                                if (!a.this.c) {
                                    e.this.a(a.this.b, com.meituan.android.upgrade.ui.a.DOWNLOAD_SUCCESS, "已下载完成点击安装 ", a.this.d);
                                }
                                Iterator it = e.this.h.iterator();
                                while (it.hasNext()) {
                                    ((com.meituan.android.upgrade.c) it.next()).a(file.getAbsolutePath(), downloadInfo.b);
                                }
                                e.this.h.clear();
                                if (a.this.b.forceupdate != 1) {
                                    if (a.this.c) {
                                        return;
                                    }
                                    com.meituan.android.upgrade.b unused = e.this.c;
                                }
                                e.this.b();
                            }
                        });
                    }
                });
            }
        }

        @Override // com.meituan.android.downloadmanager.callback.b
        public final void a(Exception exc) {
            int i;
            String string;
            Object[] objArr = {exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74c966246065176a442dde1d45428f90", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74c966246065176a442dde1d45428f90");
                return;
            }
            if (exc instanceof UnknownHostException) {
                i = c.a.c;
                string = e.this.b.getString(R.string.update_download_error_net);
            } else if (exc.getMessage().contains("No space")) {
                i = c.a.f;
                string = e.this.b.getString(R.string.update_download_error_no_space);
            } else {
                i = c.a.d;
                string = e.this.b.getString(R.string.update_download_error_server);
            }
            if (!this.c) {
                e.this.a(this.b, com.meituan.android.upgrade.ui.a.DOWNLOAD_FAIL, string, this.d);
            }
            e.this.h();
            e.this.e();
            Iterator it = e.this.h.iterator();
            while (it.hasNext()) {
                ((com.meituan.android.upgrade.c) it.next()).a(new c.a(string, exc, i));
            }
            e.this.h.clear();
            e.a(e.this, 1);
        }

        @Override // com.meituan.android.downloadmanager.callback.b
        public final void b(Exception exc) {
            Object[] objArr = {exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d1766e994b17d0dd3cee1e86abc1017", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d1766e994b17d0dd3cee1e86abc1017");
                return;
            }
            String string = e.this.b.getString(R.string.update_download_error_server);
            if (!this.c) {
                e.this.a(this.b, com.meituan.android.upgrade.ui.a.DOWNLOAD_FAIL, string, this.d);
            }
            e.this.h();
            e.this.e();
            Iterator it = e.this.h.iterator();
            while (it.hasNext()) {
                ((com.meituan.android.upgrade.c) it.next()).a(new c.a(string, exc, c.a.e));
            }
            e.this.h.clear();
            e.a(e.this, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c57c158e42a5e76b0518033124ff99db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c57c158e42a5e76b0518033124ff99db");
        } else if (this.r != null) {
            this.q.post(new Runnable() { // from class: com.meituan.android.upgrade.e.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "900553dded514420b129c0eaab7e0ed8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "900553dded514420b129c0eaab7e0ed8");
                        return;
                    }
                    try {
                        if (e.this.r != null) {
                            e.this.b.unregisterReceiver(e.this.r);
                            e.this.r = null;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class c extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        private boolean c;

        private c() {
            Object[] objArr = {e.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "537f819a181271ca09c0eba240a5bba2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "537f819a181271ca09c0eba240a5bba2");
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            NetworkInfo networkInfo;
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b233ee9a8fa6b1e64895b72fe28d32d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b233ee9a8fa6b1e64895b72fe28d32d0");
            } else if (intent.getAction() != "android.net.wifi.STATE_CHANGE" || (networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo")) == null) {
            } else {
                if (!networkInfo.isConnected()) {
                    if (e.this.d == null || e.this.d.netLimit != 1) {
                        return;
                    }
                    e.m(e.this);
                    this.c = true;
                } else if (this.c && e.this.d != null && e.this.d.netLimit == 1) {
                    e.l(e.this);
                    this.c = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends BroadcastReceiver {
        public static ChangeQuickRedirect a = null;
        public static String b = "com.meituan.android.upgrade.UpgradeManager.UpdateReceiver.update";
        public static String c = "com.meituan.android.upgrade.UpgradeManager.UpdateReceiver.delete";

        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65bf9f81e000baf18c80d5cbd78881fe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65bf9f81e000baf18c80d5cbd78881fe");
            } else if (intent == null) {
            } else {
                com.meituan.android.upgrade.ui.a aVar = (com.meituan.android.upgrade.ui.a) com.sankuai.waimai.platform.utils.f.c(intent, "extra_dialog_type");
                if (h.a().b() == null) {
                    if (aVar == com.meituan.android.upgrade.ui.a.DOWNLOAD_SUCCESS) {
                        e.a().c();
                        e.a().b();
                        return;
                    }
                    return;
                }
                String action = intent.getAction();
                VersionInfo versionInfo = (VersionInfo) com.sankuai.waimai.platform.utils.f.c(intent, "extra_version_info");
                int a2 = com.sankuai.waimai.platform.utils.f.a(intent, "extra_progress_percent", 0);
                if (c.equals(action)) {
                    e.n(e.a());
                } else if (b.equals(action)) {
                    Context context2 = e.a().b;
                    context2.startActivity(UpgradeDialogActivity.a(context2, versionInfo, aVar, a2));
                    com.meituan.android.uptodate.util.e.a("UpgradeNotificationReceiver.onReceive(）");
                }
            }
        }
    }
}
