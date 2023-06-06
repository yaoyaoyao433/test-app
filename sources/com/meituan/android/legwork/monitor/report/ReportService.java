package com.meituan.android.legwork.monitor.report;

import android.content.Context;
import android.support.annotation.Keep;
import com.meituan.android.legwork.bean.monitor.DaBaiBean;
import com.meituan.android.legwork.monitor.BaseMonitorManager;
import com.meituan.android.legwork.monitor.MonitorCallbackManager;
import com.meituan.android.legwork.monitor.d;
import com.meituan.android.legwork.monitor.report.channel.dao.DaBaiDao;
import com.meituan.android.legwork.monitor.report.channel.model.ReportChannel;
import com.meituan.android.legwork.monitor.report.channel.model.ReportChannelDaBai;
import com.meituan.android.legwork.monitor.utils.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ReportService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static a reportHelper = new a();

    public static void startReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "55491690975cb7b0dc7d89ff0d65a6ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "55491690975cb7b0dc7d89ff0d65a6ae");
            return;
        }
        reportHelper.a();
        reportHelper.b();
    }

    public static void stopReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1364ff64d8f288e12042bf633293a624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1364ff64d8f288e12042bf633293a624");
        } else {
            reportHelper.c();
        }
    }

    public static void report2DaBai(DaBaiBean daBaiBean) {
        Object[] objArr = {daBaiBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f4efa0b18c58eea7ad81c705a36c2d4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f4efa0b18c58eea7ad81c705a36c2d4c");
        } else if (d.a() && daBaiBean != null) {
            if (daBaiBean.expireTime <= 0) {
                daBaiBean.expireTime = MonitorCallbackManager.getInstance().currentTimeSec() + DaBaiBean.DABAI_DATA_EXPIRE_TIME;
            }
            reportHelper.a(daBaiBean);
        }
    }

    public static void report2DaBai(String str, int i, Map<String, Object> map) {
        Object[] objArr = {str, Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a169f8269b20e8e198ec26a3e0f011e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a169f8269b20e8e198ec26a3e0f011e6");
            return;
        }
        DaBaiBean daBaiBean = new DaBaiBean();
        daBaiBean.key = str;
        daBaiBean.time = i;
        daBaiBean.addCommonTags();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                daBaiBean.addTag(entry.getKey(), entry.getValue());
            }
        }
        report2DaBai(daBaiBean);
    }

    public static void deleteAllData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c96156432b9647d6d2d185399700a00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c96156432b9647d6d2d185399700a00");
            return;
        }
        a aVar = reportHelper;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect3, false, "53b41c59fdb795e70d8e21c0af960fdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect3, false, "53b41c59fdb795e70d8e21c0af960fdd");
        } else {
            rx.d.a(com.meituan.android.legwork.monitor.report.a.a()).b(rx.schedulers.a.e()).f();
        }
    }

    @Deprecated
    public static void report2DaBai(Context context, DaBaiBean daBaiBean) {
        Object[] objArr = {context, daBaiBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "61d7ce0e4a64cbb3f25b7584ace79c2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "61d7ce0e4a64cbb3f25b7584ace79c2c");
        } else {
            report2DaBai(daBaiBean);
        }
    }

    @Deprecated
    public static void report2DaBai(Context context, String str, int i, Map<String, Object> map) {
        Object[] objArr = {context, str, Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "260f6629f6d35c7b510fe67b1b01d13e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "260f6629f6d35c7b510fe67b1b01d13e");
        } else {
            report2DaBai(str, i, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        volatile ScheduledExecutorService b;
        b c;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47dd4a82527af44fd548f2b2eac77baf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47dd4a82527af44fd548f2b2eac77baf");
            } else {
                this.b = c.c("legwork-ReportHelper");
            }
        }

        public final synchronized void a(final DaBaiBean daBaiBean) {
            Object[] objArr = {daBaiBean};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c58bc0dd1eaeea34aac3ba481396621", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c58bc0dd1eaeea34aac3ba481396621");
            } else if (this.b == null) {
            } else {
                this.b.execute(new Runnable() { // from class: com.meituan.android.legwork.monitor.report.ReportService.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec1fd34c2f3033ac8434db0d85928f93", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec1fd34c2f3033ac8434db0d85928f93");
                        } else if (daBaiBean == null) {
                        } else {
                            a.this.d();
                            a.this.c.a();
                            DaBaiDao.getInstance().insert(daBaiBean);
                            a.this.c.b();
                        }
                    }
                });
            }
        }

        public final synchronized void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cf7884ed78eaa6b577ea24a00131feb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cf7884ed78eaa6b577ea24a00131feb");
                return;
            }
            if (this.b == null) {
                this.b = c.c("legwork-ReportHelper");
            }
            this.b.execute(new Runnable() { // from class: com.meituan.android.legwork.monitor.report.ReportService.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7208c615e94346e1a6d65173b4aacbeb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7208c615e94346e1a6d65173b4aacbeb");
                    } else if (d.a()) {
                        ReportChannelDaBai.getInstance().reportCachedData(new ReportChannel.a() { // from class: com.meituan.android.legwork.monitor.report.ReportService.a.2.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.legwork.monitor.report.channel.model.ReportChannel.a
                            public final void a(List<Long> list) {
                                Object[] objArr3 = {list};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4968c541a7676d387fb075963a97987d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4968c541a7676d387fb075963a97987d");
                                } else {
                                    a.this.a(list);
                                }
                            }
                        }, 0);
                        a.this.b.schedule(new Runnable() { // from class: com.meituan.android.legwork.monitor.report.ReportService.a.2.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7077fe8901119b0d4280409e6aaf45bf", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7077fe8901119b0d4280409e6aaf45bf");
                                } else {
                                    a.this.a();
                                }
                            }
                        }, d.c() * 2, TimeUnit.MILLISECONDS);
                    }
                }
            });
        }

        public final synchronized void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fc5f0223d77d6999907e8f64be9dc15", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fc5f0223d77d6999907e8f64be9dc15");
                return;
            }
            if (this.b == null) {
                this.b = c.c("legwork-ReportHelper");
            }
            this.b.execute(new Runnable() { // from class: com.meituan.android.legwork.monitor.report.ReportService.a.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0cda76ac829675bef9f50422677fca8b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0cda76ac829675bef9f50422677fca8b");
                    } else if (d.a()) {
                        ReportChannelDaBai.getInstance().reportCachedData(new ReportChannel.a() { // from class: com.meituan.android.legwork.monitor.report.ReportService.a.3.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.legwork.monitor.report.channel.model.ReportChannel.a
                            public final void a(List<Long> list) {
                                Object[] objArr3 = {list};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "394a548aca46b978e209a0e933c3620f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "394a548aca46b978e209a0e933c3620f");
                                } else {
                                    a.this.a(list);
                                }
                            }
                        }, 1);
                        a.this.b.schedule(new Runnable() { // from class: com.meituan.android.legwork.monitor.report.ReportService.a.3.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1b7a543eb9e99531e96a26136645b4bc", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1b7a543eb9e99531e96a26136645b4bc");
                                } else {
                                    a.this.b();
                                }
                            }
                        }, d.c(), TimeUnit.MILLISECONDS);
                    }
                }
            });
        }

        public final synchronized void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcd1edabf4497fd820a5e9d96e935866", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcd1edabf4497fd820a5e9d96e935866");
                return;
            }
            if (d.a() && this.b != null) {
                this.b.execute(new Runnable() { // from class: com.meituan.android.legwork.monitor.report.ReportService.a.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20e589f45bf591c35433c740cb079638", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20e589f45bf591c35433c740cb079638");
                            return;
                        }
                        synchronized (a.this) {
                            a.this.b.shutdown();
                            a.this.b = null;
                        }
                    }
                });
            }
        }

        public final void a(List<Long> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c339b28501050c4fcdc72672d87c9604", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c339b28501050c4fcdc72672d87c9604");
            } else if (list == null || list.isEmpty()) {
            } else {
                d();
                this.c.a();
                DaBaiDao.getInstance().deleteByIds(list);
                this.c.b();
            }
        }

        void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66db440a404c8445ee65ebb9c99b2570", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66db440a404c8445ee65ebb9c99b2570");
            } else if (this.c == null) {
                this.c = new b(BaseMonitorManager.getApplication(), "monitor_database");
            }
        }
    }
}
