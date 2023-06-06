package com.sankuai.meituan.location.collector.locator;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.OnNmeaMessageListener;
import android.os.Build;
import android.os.Bundle;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.platform.logs.h;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.u;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.c;
import com.sankuai.meituan.location.collector.utils.i;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
/* loaded from: classes4.dex */
public class b extends com.sankuai.meituan.location.collector.locator.a implements GpsStatus.Listener, GpsStatus.NmeaListener {
    public static ChangeQuickRedirect b;
    public final u c;
    public c.a d;
    private long e;
    private a f;

    @TargetApi(24)
    /* loaded from: classes4.dex */
    public class a implements OnNmeaMessageListener {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7792cf57beca05f0eb978ee7c5307ccb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7792cf57beca05f0eb978ee7c5307ccb");
            }
        }

        @Override // android.location.OnNmeaMessageListener
        public final void onNmeaMessage(String str, long j) {
            Object[] objArr = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ee3ceaa35cce184db78335a56e261ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ee3ceaa35cce184db78335a56e261ce");
                return;
            }
            try {
                com.meituan.android.common.locate.api.a.a("onNmeaMessage_coll", 1);
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "onNmeaMessage_coll"));
                com.sankuai.meituan.location.collector.reporter.a.a().i++;
                if (j - b.this.e > ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
                    LogUtils.a("SystemLocator nNmeaMessage");
                    MtLocation mtLocation = new MtLocation("nmea");
                    Bundle bundle = new Bundle();
                    com.sankuai.meituan.location.collector.provider.b bVar = new com.sankuai.meituan.location.collector.provider.b();
                    bundle.putInt(Constants.SPEED_METER_STEP, 2);
                    bundle.putInt("type", 0);
                    bVar.i = str;
                    StringBuilder sb = new StringBuilder();
                    sb.append(j);
                    bVar.j = sb.toString();
                    bundle.putSerializable("gpsInfo", bVar);
                    mtLocation.setExtras(bundle);
                    b.this.a(mtLocation);
                }
                b.this.e = j;
            } catch (Throwable th) {
                LogUtils.a("SystemLocator onNmeaReceived exception:" + th.getMessage());
            }
        }
    }

    public b(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3a5c9eae7b93ce7b5c2bcbf996efd43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3a5c9eae7b93ce7b5c2bcbf996efd43");
            return;
        }
        this.c = Privacy.createLocationManager(com.sankuai.meituan.location.collector.b.c(), "pt-c140c5921e4d3392");
        this.d = aVar;
    }

    @Override // com.sankuai.meituan.location.collector.locator.d
    public final boolean d() {
        return this.c != null;
    }

    @Override // android.location.GpsStatus.Listener
    @SuppressLint({"MissingPermission"})
    @TargetApi(3)
    public void onGpsStatusChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d36c4ebfab4bfa0061c93a61df0b90a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d36c4ebfab4bfa0061c93a61df0b90a0");
            return;
        }
        com.meituan.android.common.locate.api.a.a("onGpsStatusChanged_coll", 1);
        com.meituan.android.common.locate.platform.logs.c.a("onGpsStatusChanged_coll", 3);
        com.sankuai.meituan.location.collector.reporter.a.a().j++;
        if (i == 4) {
            GpsStatus gpsStatus = null;
            try {
                gpsStatus = this.c.a((GpsStatus) null);
            } catch (Throwable th) {
                LogUtils.a("SystemLocator :" + th.getMessage());
            }
            if (gpsStatus == null) {
                return;
            }
            int maxSatellites = gpsStatus.getMaxSatellites();
            Iterator<GpsSatellite> it = gpsStatus.getSatellites().iterator();
            MtLocation mtLocation = new MtLocation("satellites");
            com.sankuai.meituan.location.collector.provider.b bVar = new com.sankuai.meituan.location.collector.provider.b();
            int i2 = 0;
            int i3 = 0;
            while (it.hasNext() && i2 <= maxSatellites) {
                try {
                    GpsSatellite next = it.next();
                    i3++;
                    if (next.usedInFix()) {
                        bVar.c.add(Float.valueOf(next.getSnr()));
                        i2++;
                    }
                } catch (Throwable unused) {
                }
            }
            bVar.a = i3;
            bVar.b = i2;
            Bundle bundle = new Bundle();
            try {
                bundle.putSerializable("gpsInfo", bVar);
                bundle.putInt(Constants.SPEED_METER_STEP, 3);
                bundle.putInt("type", 0);
                mtLocation.setExtras(bundle);
                a(mtLocation);
            } catch (Throwable th2) {
                LogUtils.a(getClass(), th2);
            }
        }
    }

    @Override // android.location.GpsStatus.NmeaListener
    public void onNmeaReceived(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81e898507abad5562332cb5a5665a814", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81e898507abad5562332cb5a5665a814");
            return;
        }
        try {
            com.meituan.android.common.locate.api.a.a("onNmeaReceived_coll", 1);
            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", "onNmeaReceived_coll"));
            com.sankuai.meituan.location.collector.reporter.a.a().i++;
            if (j - this.e > ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
                LogUtils.a("SystemLocator onNmeaReceived");
                MtLocation mtLocation = new MtLocation("nmea");
                Bundle bundle = new Bundle();
                com.sankuai.meituan.location.collector.provider.b bVar = new com.sankuai.meituan.location.collector.provider.b();
                bundle.putInt(Constants.SPEED_METER_STEP, 2);
                bundle.putInt("type", 0);
                bVar.i = str;
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                bVar.j = sb.toString();
                bundle.putSerializable("gpsInfo", bVar);
                mtLocation.setExtras(bundle);
                a(mtLocation);
            }
            this.e = j;
        } catch (Throwable th) {
            LogUtils.a("SystemLocator onNmeaReceived exception:" + th.getMessage());
        }
    }

    public void onLocationChanged(Location location) {
        Object[] objArr = {location};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eafab1bacec8a80ceb8c9f0b1ceaeb3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eafab1bacec8a80ceb8c9f0b1ceaeb3c");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (location == null) {
            return;
        }
        LogUtils.a("Collector SystemLocator onLocationChanged");
        MtLocation mtLocation = new MtLocation(location);
        try {
            Bundle bundle = new Bundle();
            com.sankuai.meituan.location.collector.provider.b bVar = new com.sankuai.meituan.location.collector.provider.b();
            bVar.k = mtLocation.getSpeed();
            StringBuilder sb = new StringBuilder();
            sb.append(mtLocation.getLongitude());
            bVar.e = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mtLocation.getLatitude());
            bVar.d = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(mtLocation.getAccuracy());
            bVar.f = sb3.toString();
            Object[] objArr2 = {mtLocation};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "614cf8d0f04303e9d4002311a0049e9e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "614cf8d0f04303e9d4002311a0049e9e");
            } else {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - mtLocation.getTime() > 31536000000L || mtLocation.getTime() - currentTimeMillis2 > 31536000000L) {
                    Date date = new Date(mtLocation.getTime());
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(date);
                    Date date2 = new Date(currentTimeMillis2);
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(date2);
                    calendar2.set(11, calendar.get(11));
                    calendar2.set(12, calendar.get(12));
                    calendar2.set(13, calendar.get(13));
                    mtLocation.setTime(calendar2.getTimeInMillis());
                }
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(mtLocation.getTime());
            bVar.h = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(mtLocation.getAltitude());
            bVar.g = sb5.toString();
            bundle.putLong("gpsGotTime", currentTimeMillis);
            bundle.putSerializable("gpsInfo", bVar);
            bundle.putString("locationType", "gps");
            bundle.putInt(Constants.SPEED_METER_STEP, 1);
            bundle.putInt("type", 0);
            mtLocation.setExtras(bundle);
            a(mtLocation);
            this.d.sendEmptyMessage(1);
            if ("gps".equals(mtLocation.getProvider())) {
                MtLocation mtLocation2 = new MtLocation(mtLocation);
                mtLocation2.setTime(currentTimeMillis);
                double[] a2 = LocationUtils.a(new double[]{mtLocation.getLatitude(), mtLocation.getLongitude()});
                mtLocation2.setLatitude(a2[0]);
                mtLocation2.setLongitude(a2[1]);
                h.a().a("collect_system", "", mtLocation2, 0L);
            }
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.sankuai.meituan.location.collector.locator.a
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r14)
            r9 = 0
            r8[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.location.collector.locator.b.b
            java.lang.String r11 = "05db92d58de851041074dea16a66ec13"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L26
            java.lang.Object r14 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r10, r9, r11)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            return r14
        L26:
            java.lang.String r1 = "Collector SystemLocator onStart"
            com.meituan.android.common.locate.util.LogUtils.a(r1)
            com.sankuai.meituan.location.collector.reporter.a r1 = com.sankuai.meituan.location.collector.reporter.a.a()
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.meituan.location.collector.reporter.a.a
            java.lang.String r12 = "28b5c5b2ce6a23888e4e7bfa0456ee6f"
            r5 = 0
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r10
            r3 = r1
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L46
            com.meituan.robust.PatchProxy.accessDispatch(r10, r1, r11, r9, r12)
            goto L4f
        L46:
            r1.b()
            long r2 = java.lang.System.currentTimeMillis()
            r1.b = r2
        L4f:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L95
            r2 = 24
            if (r1 >= r2) goto L70
            if (r14 == 0) goto L8b
            com.meituan.android.common.locate.reporter.k r1 = com.meituan.android.common.locate.reporter.k.a()     // Catch: java.lang.Throwable -> L95
            boolean r1 = r1.d     // Catch: java.lang.Throwable -> L95
            if (r1 == 0) goto L8b
            com.meituan.android.privacy.interfaces.u r1 = r13.c     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = "addNmeaListener"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L95
            r3[r9] = r13     // Catch: java.lang.Throwable -> L95
            com.sankuai.meituan.location.collector.utils.i.a(r1, r2, r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = "SystemLocator sdk version below 24,invoke addNmeaListener"
        L6c:
            com.meituan.android.common.locate.util.LogUtils.a(r1)     // Catch: java.lang.Throwable -> L95
            goto L8b
        L70:
            if (r14 == 0) goto L88
            com.meituan.android.common.locate.reporter.k r1 = com.meituan.android.common.locate.reporter.k.a()     // Catch: java.lang.Throwable -> L95
            boolean r1 = r1.d     // Catch: java.lang.Throwable -> L95
            if (r1 == 0) goto L88
            com.sankuai.meituan.location.collector.locator.b$a r1 = new com.sankuai.meituan.location.collector.locator.b$a     // Catch: java.lang.Throwable -> L95
            r1.<init>()     // Catch: java.lang.Throwable -> L95
            r13.f = r1     // Catch: java.lang.Throwable -> L95
            com.meituan.android.privacy.interfaces.u r1 = r13.c     // Catch: java.lang.Throwable -> L95
            com.sankuai.meituan.location.collector.locator.b$a r2 = r13.f     // Catch: java.lang.Throwable -> L95
            r1.a(r2)     // Catch: java.lang.Throwable -> L95
        L88:
            java.lang.String r1 = "SystemLocator sdk version up 24, addNmeaListener"
            goto L6c
        L8b:
            com.sankuai.meituan.location.collector.reporter.a r1 = com.sankuai.meituan.location.collector.reporter.a.a()     // Catch: java.lang.Throwable -> L95
            int r2 = r1.g     // Catch: java.lang.Throwable -> L95
            int r2 = r2 + r0
            r1.g = r2     // Catch: java.lang.Throwable -> L95
            goto L9d
        L95:
            r1 = move-exception
            java.lang.Class r2 = r13.getClass()
            com.meituan.android.common.locate.util.LogUtils.a(r2, r1)
        L9d:
            if (r14 == 0) goto Lbe
            com.meituan.android.common.locate.reporter.k r14 = com.meituan.android.common.locate.reporter.k.a()     // Catch: java.lang.Throwable -> Lb6
            boolean r14 = r14.e     // Catch: java.lang.Throwable -> Lb6
            if (r14 == 0) goto Lbe
            com.meituan.android.privacy.interfaces.u r14 = r13.c     // Catch: java.lang.Throwable -> Lb6
            r14.a(r13)     // Catch: java.lang.Throwable -> Lb6
            com.sankuai.meituan.location.collector.reporter.a r14 = com.sankuai.meituan.location.collector.reporter.a.a()     // Catch: java.lang.Throwable -> Lb6
            int r1 = r14.e     // Catch: java.lang.Throwable -> Lb6
            int r1 = r1 + r0
            r14.e = r1     // Catch: java.lang.Throwable -> Lb6
            goto Lbe
        Lb6:
            r14 = move-exception
            java.lang.Class r0 = r13.getClass()
            com.meituan.android.common.locate.util.LogUtils.a(r0, r14)
        Lbe:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.location.collector.locator.b.a(boolean):int");
    }

    @Override // com.sankuai.meituan.location.collector.locator.a
    @SuppressLint({"MissingPermission"})
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df3a8be13beae5ccc4c0ef5a606bc9da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df3a8be13beae5ccc4c0ef5a606bc9da");
            return;
        }
        com.meituan.android.common.locate.platform.logs.c.a("Collector SystemLocator::onStop ", 3);
        com.sankuai.meituan.location.collector.reporter.a a2 = com.sankuai.meituan.location.collector.reporter.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.location.collector.reporter.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "22bfbb70c53828e41142c9cd592ffc3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "22bfbb70c53828e41142c9cd592ffc3b");
        } else {
            a2.c = System.currentTimeMillis();
            a2.c();
            a2.b();
        }
        try {
            if (Build.VERSION.SDK_INT < 24) {
                i.a(this.c, "removeNmeaListener", this);
            } else if (this.f != null) {
                this.c.b(this.f);
            }
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
        }
        try {
            this.c.b(this);
        } catch (Throwable th2) {
            LogUtils.a(getClass(), th2);
        }
        LogUtils.a(getClass().getSimpleName() + "nmea work thread quit");
    }
}
