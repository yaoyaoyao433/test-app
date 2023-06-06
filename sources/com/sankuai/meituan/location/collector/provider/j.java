package com.sankuai.meituan.location.collector.provider;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* loaded from: classes4.dex */
public final class j extends c {
    public static ChangeQuickRedirect c;
    private i d;
    private m e;
    private CollectorDataBuilder f;

    public j(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dcafd19ac1ae93280b9b22984d1bffc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dcafd19ac1ae93280b9b22984d1bffc");
            return;
        }
        this.d = null;
        this.e = null;
        this.f = null;
        this.e = mVar;
        this.d = new i();
    }

    @Override // com.sankuai.meituan.location.collector.provider.c
    public final void a(MtLocation mtLocation, int i) {
        Object[] objArr = {mtLocation, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1252cd7b085336e935e1e98e07817416", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1252cd7b085336e935e1e98e07817416");
        } else if (i != 0) {
            try {
                LogUtils.a("CollectorMsgHandler startLocate unknown type " + i);
            } catch (Throwable th) {
                LogUtils.a(getClass(), th);
            }
        }
    }

    @Override // com.sankuai.meituan.location.collector.provider.c
    public final void e(MtLocation mtLocation, int i) {
        Object[] objArr = {mtLocation, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54ef33a593ddc5596307d91aadd79f89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54ef33a593ddc5596307d91aadd79f89");
            return;
        }
        LogUtils.a("CollectorMsgHandler inertialInfo");
        LogUtils.a(mtLocation.getLatitude() + CommonConstant.Symbol.COMMA + mtLocation.getLongitude() + CommonConstant.Symbol.COMMA + mtLocation.getAltitude() + CommonConstant.Symbol.COMMA);
        Bundle extras = mtLocation.getExtras();
        float[] floatArray = extras.getFloatArray("magVector");
        LogUtils.a("time" + extras.getLong("time") + ",step" + extras.getInt("step_count") + ",magVec" + floatArray[0] + CommonConstant.Symbol.COMMA + floatArray[1] + CommonConstant.Symbol.COMMA + floatArray[2] + ",magAcc" + extras.getInt("magAccuracy") + ",  " + extras.getBoolean("isScreenOn") + ",phonepose" + extras.getInt("phonePose"));
        a(new d(extras.getLong("time"), mtLocation.getLongitude(), mtLocation.getLatitude(), mtLocation.getAltitude(), extras.getInt("step_count"), extras.getFloatArray("magVector"), extras.getInt("magAccuracy"), extras.getBoolean("isScreenOn"), extras.getInt("phonePose")));
    }

    @Override // com.sankuai.meituan.location.collector.provider.c
    public final void b(MtLocation mtLocation, int i) {
        String str;
        Object[] objArr = {mtLocation, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a61a726dba52bd8fff5bb4e699b385ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a61a726dba52bd8fff5bb4e699b385ab");
            return;
        }
        try {
            if (i != 0) {
                LogUtils.a("CollectorMsgHandler startLocate unknown type " + i);
                return;
            }
            LogUtils.a("CollectorMsgHandler gps get location");
            i iVar = this.d;
            Object[] objArr2 = {mtLocation};
            ChangeQuickRedirect changeQuickRedirect2 = i.a;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "42da1141bf1937ceffa0fe4705ba77ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "42da1141bf1937ceffa0fe4705ba77ff");
            } else {
                if (mtLocation == null) {
                    str = "CollectorGpsReportInfoCache recordLocationInfo location null";
                } else {
                    iVar.d = mtLocation;
                    if (iVar.c == null) {
                        str = "CollectorGpsReportInfoCache recordLocationInfo collectorGpsInfo null";
                    } else {
                        iVar.c.e = mtLocation.getAccuracy();
                        iVar.c.d = mtLocation.getAltitude();
                        iVar.c.g = mtLocation.getBearing();
                        iVar.c.f = mtLocation.getSpeed();
                        iVar.c.a = mtLocation.getTime();
                        iVar.c.c = mtLocation.getLatitude();
                        iVar.c.b = mtLocation.getLongitude();
                        iVar.c.n = com.sankuai.meituan.location.collector.utils.l.a(com.sankuai.meituan.location.collector.b.c(), mtLocation);
                        iVar.c.o = SystemClock.elapsedRealtime();
                        iVar.c.p = mtLocation.getExtras().getLong("gpsGotTime", 0L);
                    }
                }
                LogUtils.a(str);
            }
            this.f = new CollectorDataBuilder();
            a(this.d, this.f);
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    @Override // com.sankuai.meituan.location.collector.provider.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.meituan.android.common.locate.MtLocation r14, int r15) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.location.collector.provider.j.c(com.meituan.android.common.locate.MtLocation, int):void");
    }

    @Override // com.sankuai.meituan.location.collector.provider.c
    public final void d(MtLocation mtLocation, int i) {
        String str;
        Object[] objArr = {mtLocation, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0f816d19d5c178a89cbb347bd26efb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0f816d19d5c178a89cbb347bd26efb9");
            return;
        }
        b bVar = (b) mtLocation.getExtras().getSerializable("gpsInfo");
        LogUtils.a("CollectorMsgHandler gps getGpsSatellites " + bVar.b + " gpsInfo.view " + bVar.a);
        if (bVar.b <= 0) {
            return;
        }
        if (this.d == null) {
            this.d = new i();
        }
        i iVar = this.d;
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "3531d445f58ba29d08a18b1e63ab4092", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "3531d445f58ba29d08a18b1e63ab4092");
            return;
        }
        if (bVar == null) {
            str = "CollectorGpsReportInfoCache dealGpsSatellites gpsSatellites null";
        } else if (iVar.c == null) {
            str = "CollectorGpsReportInfoCache dealGpsSatellites collectorGpsInfo null";
        } else {
            if (bVar.a > 0) {
                iVar.c.l = bVar.a;
            }
            if (bVar.b > 0) {
                iVar.c.m = bVar.b;
            }
            str = "CollectorGpsReportInfoCache collectorGpsInfo.satenum " + iVar.c.l + " collectorGpsInfo.usedinfixnum " + iVar.c.m + " gpsSatellites.view " + bVar.a + " gpsSatellites.available " + bVar.b;
        }
        LogUtils.a(str);
    }

    private synchronized void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8d6a1e363db3d22590563503cff93e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8d6a1e363db3d22590563503cff93e9");
            return;
        }
        LogUtils.a("CollectorMsgHandler recordInertial");
        CollectorDataBuilder collectorDataBuilder = new CollectorDataBuilder();
        collectorDataBuilder.a(this.e);
        collectorDataBuilder.collectInertialInfo = dVar;
        collectorDataBuilder.hassensordata = (byte) 1;
        com.sankuai.meituan.location.collector.utils.d.a(collectorDataBuilder.b());
    }

    private synchronized void a(i iVar, CollectorDataBuilder collectorDataBuilder) {
        double a;
        boolean z;
        boolean z2;
        int i;
        String str;
        boolean z3;
        String str2;
        int i2;
        int i3;
        boolean z4;
        Object[] objArr = {iVar, collectorDataBuilder};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "673a9ea8397d3915cf272c144a4f64f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "673a9ea8397d3915cf272c144a4f64f5");
        } else if (iVar == null) {
            LogUtils.a("CollectorMsgHandler recordGps infoCache is null");
        } else if (collectorDataBuilder == null) {
            LogUtils.a("CollectorMsgHandler recordGps builder is null");
        } else {
            LogUtils.a("CollectorMsgHandler recordGpsing");
            h hVar = iVar.c;
            Object[] objArr2 = {hVar};
            ChangeQuickRedirect changeQuickRedirect2 = CollectorDataBuilder.changeQuickRedirect;
            if (PatchProxy.isSupport(objArr2, collectorDataBuilder, changeQuickRedirect2, false, "cde15c50b1f426b3d186c318eff13af2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, collectorDataBuilder, changeQuickRedirect2, false, "cde15c50b1f426b3d186c318eff13af2");
            } else if (hVar == null) {
                LogUtils.a(collectorDataBuilder.TAG + "setWifiInfos collectorGpsInfo null");
            } else {
                collectorDataBuilder.collectorGpsInfo = hVar;
                collectorDataBuilder.hasgps = true;
                collectorDataBuilder.ismock = hVar.n;
                collectorDataBuilder.gpsage = 0;
            }
            collectorDataBuilder.a(this.e);
            g gVar = new g(collectorDataBuilder, iVar.d);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = g.a;
            if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "c73da733bc78d5f52320920f8c17d557", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "c73da733bc78d5f52320920f8c17d557")).booleanValue();
            } else if (gVar.a()) {
                LogUtils.a(g.d + "filterLocation true");
                z2 = true;
            } else {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = g.a;
                if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "739544cf74f32f62a2cf7a2531cdd3ba", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "739544cf74f32f62a2cf7a2531cdd3ba")).booleanValue();
                } else {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = g.a;
                    if (PatchProxy.isSupport(objArr5, gVar, changeQuickRedirect5, false, "b238c7fa41debbfc7d52afbd6e8f4a81", RobustBitConfig.DEFAULT_VALUE)) {
                        a = ((Double) PatchProxy.accessDispatch(objArr5, gVar, changeQuickRedirect5, false, "b238c7fa41debbfc7d52afbd6e8f4a81")).doubleValue();
                    } else if (gVar.c == null) {
                        LogUtils.a(g.d + "getWifiScore currentCollectorDataBuilder null");
                        a = 0.0d;
                    } else if (gVar.b == null) {
                        LogUtils.a(g.d + "getWifiScore lastCollectorDataBuilder null");
                        a = 10.0d;
                    } else {
                        a = gVar.a(gVar.c.wifi, gVar.b.wifi);
                        LogUtils.a(g.d + "getWifiScore " + a);
                    }
                    z = a < 6.0d;
                }
                if (!z) {
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = g.a;
                    if (PatchProxy.isSupport(objArr6, gVar, changeQuickRedirect6, false, "0c04d97af01fed237a85bf2fcad33136", RobustBitConfig.DEFAULT_VALUE)) {
                        z3 = ((Boolean) PatchProxy.accessDispatch(objArr6, gVar, changeQuickRedirect6, false, "0c04d97af01fed237a85bf2fcad33136")).booleanValue();
                    } else {
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = g.a;
                        if (PatchProxy.isSupport(objArr7, gVar, changeQuickRedirect7, false, "965ae3a44974142c487f173604952def", RobustBitConfig.DEFAULT_VALUE)) {
                            i = ((Integer) PatchProxy.accessDispatch(objArr7, gVar, changeQuickRedirect7, false, "965ae3a44974142c487f173604952def")).intValue();
                        } else {
                            if (gVar.c != null && gVar.b != null) {
                                List<k> list = gVar.c.cgi;
                                List<k> list2 = gVar.b.cgi;
                                if (list != null && list2 != null) {
                                    k kVar = list.get(0);
                                    k kVar2 = list2.get(0);
                                    if (kVar != null && kVar2 != null) {
                                        if (kVar.d == kVar2.d && kVar.e == kVar2.e) {
                                            str = g.d + "getCellScore t.lac " + kVar.d + " t1.lac " + kVar2.d + " t.cid " + kVar.e + " t1.cid " + kVar2.e;
                                            LogUtils.a(str);
                                            i = 10;
                                        }
                                        i = 0;
                                    }
                                    str = g.d + "getCellScore t null, t1 null";
                                    LogUtils.a(str);
                                    i = 10;
                                }
                                str = g.d + "getCellScore l null, l1 null";
                                LogUtils.a(str);
                                i = 10;
                            }
                            LogUtils.a(g.d + "getCellScore currentCollectorDataBuilder null, lastCollectorDataBuilder null");
                            i = 0;
                        }
                        z3 = i < 6;
                    }
                    if (!z3) {
                        Object[] objArr8 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect8 = g.a;
                        if (PatchProxy.isSupport(objArr8, gVar, changeQuickRedirect8, false, "9c2db24e4c98ca4ed21c5ce74bb209ef", RobustBitConfig.DEFAULT_VALUE)) {
                            z4 = ((Boolean) PatchProxy.accessDispatch(objArr8, gVar, changeQuickRedirect8, false, "9c2db24e4c98ca4ed21c5ce74bb209ef")).booleanValue();
                        } else {
                            Object[] objArr9 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect9 = g.a;
                            if (PatchProxy.isSupport(objArr9, gVar, changeQuickRedirect9, false, "62cdb46c48adf2291487ad1e70228684", RobustBitConfig.DEFAULT_VALUE)) {
                                i2 = ((Integer) PatchProxy.accessDispatch(objArr9, gVar, changeQuickRedirect9, false, "62cdb46c48adf2291487ad1e70228684")).intValue();
                                i3 = 6;
                            } else {
                                if (gVar.c != null && gVar.b != null) {
                                    double d = gVar.c.gpslat / 1200000.0d;
                                    double d2 = gVar.c.gpslon / 1200000.0d;
                                    double d3 = gVar.b.gpslat / 1200000.0d;
                                    double d4 = gVar.b.gpslon / 1200000.0d;
                                    if (d > 0.0d && d2 > 0.0d && d3 > 0.0d && d4 > 0.0d) {
                                        float a2 = com.sankuai.meituan.location.collector.utils.l.a(new double[]{d, d2, d3, d4});
                                        LogUtils.a(g.d + "getGPSScore r " + a2);
                                        short s = (short) (gVar.c.accu - gVar.b.accu);
                                        if (a2 < gVar.e && s > -10) {
                                            i2 = 10;
                                            if (s < 10) {
                                                LogUtils.a(g.d + "getGPSScore: distance = " + a2 + " accu_gap: " + ((int) s));
                                                i3 = 6;
                                            }
                                        }
                                        i2 = 0;
                                        i3 = 6;
                                    }
                                    str2 = g.d + "getGPSScore ca <= 0 || co <= 0 || la <= 0 || lo <= 0";
                                    LogUtils.a(str2);
                                    i2 = 0;
                                    i3 = 6;
                                }
                                str2 = g.d + "getGPSScore currentCollectorDataBuilder null, lastCollectorDataBuilder null";
                                LogUtils.a(str2);
                                i2 = 0;
                                i3 = 6;
                            }
                            z4 = i2 < i3;
                        }
                        if (z4) {
                            z2 = false;
                            LogUtils.a(g.d + "isFilter " + z2);
                        } else {
                            z2 = true;
                            LogUtils.a(g.d + "isFilter " + z2);
                        }
                    }
                }
                z2 = false;
                LogUtils.a(g.d + "isFilter " + z2);
            }
            if (z2) {
                LogUtils.a("CollectorMsgHandler collectorFilter.isFilter,not record");
                return;
            }
            LogUtils.a("CollectorMsgHandler Collecter location: ", iVar.d, (Context) null);
            com.sankuai.meituan.location.collector.utils.d.a(collectorDataBuilder.b());
        }
    }
}
