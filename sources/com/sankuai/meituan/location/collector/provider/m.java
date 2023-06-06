package com.sankuai.meituan.location.collector.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthNr;
import android.telephony.NeighboringCellInfo;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.meituan.android.common.locate.provider.t;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.MtWifiManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.provider.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes4.dex */
public final class m implements n.a {
    public static ChangeQuickRedirect a;
    b b;
    a c;
    long d;
    long e;
    private Context f;
    private MtWifiManager g;
    private com.sankuai.meituan.location.collector.provider.a h;
    private long i;
    private com.meituan.android.common.locate.provider.h j;
    private t k;
    private MtTelephonyManager l;
    private com.meituan.android.common.locate.provider.e m;
    private SignalStrength n;

    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public long c;
        public int d;
        public int e;
        public k f;
        public List<k> g;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89e18bbc25d86b5e80906a62ea658120", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89e18bbc25d86b5e80906a62ea658120");
            } else {
                this.g = new ArrayList();
            }
        }

        public final List<k> a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9a4e9a784fba6a8aa76d255ff25ee9d", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9a4e9a784fba6a8aa76d255ff25ee9d");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f);
            try {
                if (this.g != null && this.g.size() > 0) {
                    for (k kVar : this.g) {
                        arrayList.add(kVar);
                    }
                }
            } catch (Exception e) {
                LogUtils.a(getClass(), e);
            }
            return arrayList;
        }
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public l b;
        public long c;
        public List<l> d;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81bbec87b6dd135bc730833a0f313793", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81bbec87b6dd135bc730833a0f313793");
            } else {
                this.d = null;
            }
        }
    }

    public m(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c627e320ecbf89c968401925482ae5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c627e320ecbf89c968401925482ae5e");
            return;
        }
        this.i = 0L;
        this.d = 0L;
        this.e = 0L;
        this.n = null;
        this.j = com.meituan.android.common.locate.provider.h.a(context);
        this.c = new a();
        this.b = new b();
        this.f = context;
        this.g = Privacy.createWifiManager(context, "pt-c140c5921e4d3392");
        this.h = new com.sankuai.meituan.location.collector.provider.a();
        this.m = com.meituan.android.common.locate.provider.e.a();
        this.k = t.a(context);
        this.l = Privacy.createTelephonyManager(context, "pt-c140c5921e4d3392");
        a(true);
        b(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    @android.annotation.SuppressLint({"PrimitiveParseDetector"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.sankuai.meituan.location.collector.provider.m.a e() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.meituan.location.collector.provider.m.a
            java.lang.String r10 = "da5527e77f9ace0ea9e24997621ea7c3"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            com.sankuai.meituan.location.collector.provider.m$a r0 = (com.sankuai.meituan.location.collector.provider.m.a) r0
            return r0
        L1b:
            com.sankuai.meituan.location.collector.provider.m$a r1 = new com.sankuai.meituan.location.collector.provider.m$a
            r1.<init>()
            r2 = 0
            com.meituan.android.privacy.interfaces.MtTelephonyManager r3 = r11.l     // Catch: java.lang.Exception -> L28 java.lang.SecurityException -> L35
            android.telephony.CellLocation r3 = r3.getCellLocation()     // Catch: java.lang.Exception -> L28 java.lang.SecurityException -> L35
            goto L4c
        L28:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "CollectorWifiRadioCenter cellLocation exception: "
            r4.<init>(r5)
            java.lang.String r3 = r3.getMessage()
            goto L41
        L35:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "CollectorWifiRadioCenter cellLocation SecurityException: "
            r4.<init>(r5)
            java.lang.String r3 = r3.getMessage()
        L41:
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.meituan.android.common.locate.util.LogUtils.a(r3)
            r3 = r2
        L4c:
            com.meituan.android.common.locate.provider.e r4 = r11.m
            boolean r4 = r4.a(r3)
            if (r4 == 0) goto L96
            com.sankuai.meituan.location.collector.provider.k r4 = new com.sankuai.meituan.location.collector.provider.k
            r4.<init>(r3)
            r1.f = r4
            com.meituan.android.common.locate.provider.h r3 = r11.j     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L6b
            com.meituan.android.common.locate.provider.h r3 = r11.j     // Catch: java.lang.Throwable -> L67
            java.util.List r0 = r3.a(r0)     // Catch: java.lang.Throwable -> L67
            r2 = r0
            goto L6b
        L67:
            r0 = move-exception
            com.meituan.android.common.locate.util.LogUtils.a(r0)
        L6b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L95
            java.util.Iterator r2 = r2.iterator()
        L76:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L93
            java.lang.Object r3 = r2.next()
            android.telephony.NeighboringCellInfo r3 = (android.telephony.NeighboringCellInfo) r3
            com.sankuai.meituan.location.collector.provider.a r4 = r11.h
            boolean r4 = r4.a(r3)
            if (r4 == 0) goto L76
            com.sankuai.meituan.location.collector.provider.k r4 = new com.sankuai.meituan.location.collector.provider.k
            r4.<init>(r3)
            r0.add(r4)
            goto L76
        L93:
            r1.g = r0
        L95:
            return r1
        L96:
            java.lang.String r0 = "cellid gson cellLocation null or invalid"
            com.meituan.android.common.locate.util.LogUtils.a(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.location.collector.provider.m.e():com.sankuai.meituan.location.collector.provider.m$a");
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e42edea0f8809b715fefeb1f8a5be5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e42edea0f8809b715fefeb1f8a5be5f");
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.l.requestCellInfoUpdate(com.meituan.android.common.locate.util.f.a().b(), new TelephonyManager.CellInfoCallback() { // from class: com.sankuai.meituan.location.collector.provider.m.1
                public static ChangeQuickRedirect a;

                @Override // android.telephony.TelephonyManager.CellInfoCallback
                public final void onCellInfo(@NonNull List<CellInfo> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "508337ef8ce257e25ed8e2522d00efae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "508337ef8ce257e25ed8e2522d00efae");
                        return;
                    }
                    a aVar = new a();
                    for (CellInfo cellInfo : list) {
                        k a2 = m.this.a(cellInfo);
                        if (cellInfo.isRegistered()) {
                            aVar.f = a2;
                        } else {
                            aVar.g.add(a2);
                        }
                    }
                    m.this.a(aVar);
                }
            });
        }
        a aVar = new a();
        if (Build.VERSION.SDK_INT >= 18) {
            for (CellInfo cellInfo : this.l.getAllCellInfo()) {
                k a2 = a(cellInfo);
                if (cellInfo.isRegistered()) {
                    aVar.f = a2;
                } else {
                    aVar.g.add(a2);
                }
            }
        }
        if (aVar.f == null) {
            aVar = e();
        }
        a(aVar);
    }

    @RequiresApi(api = 17)
    k a(CellInfo cellInfo) {
        StringBuilder sb;
        Object[] objArr = {cellInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e94de98f44f611b9eff635bea54d0d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e94de98f44f611b9eff635bea54d0d2");
        }
        k kVar = new k();
        kVar.r = cellInfo.getTimeStamp();
        kVar.s = cellInfo.getTimeStamp();
        if (cellInfo instanceof CellInfoGsm) {
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            kVar.b = String.valueOf(cellIdentity.getMcc() == Integer.MAX_VALUE ? "0" : Integer.valueOf(cellIdentity.getMcc()));
            kVar.c = String.valueOf(cellIdentity.getMnc() == Integer.MAX_VALUE ? "0" : Integer.valueOf(cellIdentity.getMnc()));
            kVar.d = cellIdentity.getLac();
            kVar.e = cellIdentity.getCid();
            kVar.k = cellInfoGsm.getCellSignalStrength().getDbm();
            kVar.l = 1;
            sb = new StringBuilder("CollectorWifiRadioCenter gsm_");
        } else if (cellInfo instanceof CellInfoCdma) {
            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
            kVar.j = cellIdentity2.getLatitude();
            kVar.i = cellIdentity2.getLongitude();
            kVar.f = cellIdentity2.getSystemId();
            kVar.g = cellIdentity2.getNetworkId();
            kVar.h = cellIdentity2.getBasestationId();
            kVar.k = cellInfoCdma.getCellSignalStrength().getDbm();
            String[] c = this.m.c();
            kVar.b = c[0];
            kVar.c = c[1];
            kVar.l = 2;
            sb = new StringBuilder("CollectorWifiRadioCenter cdma_");
        } else if (cellInfo instanceof CellInfoLte) {
            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
            CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
            kVar.b = String.valueOf(cellIdentity3.getMcc() == Integer.MAX_VALUE ? "0" : Integer.valueOf(cellIdentity3.getMcc()));
            kVar.c = String.valueOf(cellIdentity3.getMnc() == Integer.MAX_VALUE ? "0" : Integer.valueOf(cellIdentity3.getMnc()));
            kVar.p = cellIdentity3.getTac();
            kVar.m = cellIdentity3.getCi();
            kVar.o = cellIdentity3.getPci();
            kVar.k = cellInfoLte.getCellSignalStrength().getDbm();
            kVar.l = 3;
            sb = new StringBuilder("CollectorWifiRadioCenter lte_");
        } else if ((cellInfo instanceof CellInfoWcdma) && Build.VERSION.SDK_INT >= 18) {
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            CellIdentityWcdma cellIdentity4 = cellInfoWcdma.getCellIdentity();
            kVar.b = String.valueOf(cellIdentity4.getMcc() == Integer.MAX_VALUE ? "0" : Integer.valueOf(cellIdentity4.getMcc()));
            kVar.c = String.valueOf(cellIdentity4.getMnc() == Integer.MAX_VALUE ? "0" : Integer.valueOf(cellIdentity4.getMnc()));
            kVar.d = cellIdentity4.getLac();
            kVar.e = cellIdentity4.getCid();
            kVar.l = 1;
            kVar.k = cellInfoWcdma.getCellSignalStrength().getDbm();
            sb = new StringBuilder("CollectorWifiRadioCenter wcdma_");
        } else if (Build.VERSION.SDK_INT >= 29 && (cellInfo instanceof CellInfoNr)) {
            CellInfoNr cellInfoNr = (CellInfoNr) cellInfo;
            CellIdentityNr cellIdentityNr = (CellIdentityNr) cellInfoNr.getCellIdentity();
            try {
                kVar.b = TextUtils.isEmpty(cellIdentityNr.getMccString()) ? "0" : cellIdentityNr.getMccString();
                kVar.c = TextUtils.isEmpty(cellIdentityNr.getMncString()) ? "0" : cellIdentityNr.getMncString();
            } catch (Exception e) {
                LogUtils.a("CollectorWifiRadioCenter parse exception:" + e.getMessage());
            }
            kVar.o = cellIdentityNr.getPci();
            kVar.p = cellIdentityNr.getTac();
            if (kVar.p == Integer.MAX_VALUE && "HUAWEI".equals(Build.MANUFACTURER)) {
                try {
                    int b2 = com.meituan.android.common.locate.util.l.b(cellIdentityNr, "getHwTac", new Object[0]);
                    com.meituan.android.common.locate.platform.logs.c.a("system tac=" + kVar.p + ",reflect tac=" + b2, 3);
                    kVar.p = b2;
                } catch (Exception unused) {
                    com.meituan.android.common.locate.platform.logs.c.a("getHwTac exception", 3);
                }
            }
            kVar.n = cellIdentityNr.getNci();
            kVar.k = ((CellSignalStrengthNr) cellInfoNr.getCellSignalStrength()).getSsRsrp();
            kVar.l = 4;
            kVar.q = cellIdentityNr.getNrarfcn();
            sb = new StringBuilder("CollectorWifiRadioCenter 5gNr_");
        } else if (Build.VERSION.SDK_INT < 29 || !(cellInfo instanceof CellInfoTdscdma)) {
            sb = new StringBuilder("CollectorWifiRadioCenter cell info unknown: ");
        } else {
            CellInfoTdscdma cellInfoTdscdma = (CellInfoTdscdma) cellInfo;
            CellIdentityTdscdma cellIdentity5 = cellInfoTdscdma.getCellIdentity();
            kVar.d = cellIdentity5.getLac();
            kVar.e = cellIdentity5.getCid();
            try {
                kVar.b = TextUtils.isEmpty(cellIdentity5.getMccString()) ? "0" : cellIdentity5.getMccString();
                kVar.c = TextUtils.isEmpty(cellIdentity5.getMncString()) ? "0" : cellIdentity5.getMncString();
            } catch (Exception e2) {
                LogUtils.a("CollectorWifiRadioCenter parse exception:" + e2.getMessage());
            }
            kVar.k = cellInfoTdscdma.getCellSignalStrength().getDbm();
            kVar.l = 1;
            sb = new StringBuilder("CollectorWifiRadioCenter Tdscdma_");
        }
        sb.append(kVar.toString());
        LogUtils.a(sb.toString());
        return kVar;
    }

    @Override // com.sankuai.meituan.location.collector.provider.n.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0686a4e2d4aef60f916ee0397063a78a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0686a4e2d4aef60f916ee0397063a78a");
        } else {
            a(false);
        }
    }

    @Override // com.sankuai.meituan.location.collector.provider.n.a
    public final void a(SignalStrength signalStrength) {
        Object[] objArr = {signalStrength};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1792b5cfce0bb8625d1b451ef5f9dff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1792b5cfce0bb8625d1b451ef5f9dff");
        } else if (this.c == null) {
            LogUtils.a("CollectorWifiRadioCenter onSignalStrengthsChanged cellInfos null");
        } else {
            this.n = signalStrength;
            if (this.c.f != null) {
                this.c.f.a(signalStrength);
            }
        }
    }

    void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9378f13fc751c2cc6c512543b889f206", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9378f13fc751c2cc6c512543b889f206");
            return;
        }
        aVar.b = this.l.isNetworkRoaming() ? 1 : 0;
        aVar.e = this.l.getNetworkType();
        if (aVar.e > 127 || aVar.d < 0) {
            aVar.e = 127;
        }
        if (aVar.f != null) {
            aVar.d = aVar.f.l;
            aVar.f.a(this.n);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.i;
        if (!k.a(aVar.f, this.c.f) || elapsedRealtime > 15000) {
            aVar.c = SystemClock.elapsedRealtime();
            LogUtils.a("CollectorWifiRadioCenter cell not Equal " + aVar.c);
            this.i = SystemClock.elapsedRealtime();
        } else {
            LogUtils.a("CollectorWifiRadioCenter cell Equal");
            aVar.c = this.c.c;
        }
        this.c = aVar;
    }

    @Override // com.sankuai.meituan.location.collector.provider.n.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f717c74b4249821f84217e46584fadd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f717c74b4249821f84217e46584fadd");
        } else {
            b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db A[LOOP:1: B:35:0x00d5->B:37:0x00db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(boolean r13) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.location.collector.provider.m.b(boolean):void");
    }

    @Override // com.sankuai.meituan.location.collector.provider.n.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d502ab3fa802c233c9a2f28de31917a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d502ab3fa802c233c9a2f28de31917a");
        } else {
            g();
        }
    }

    @Override // com.sankuai.meituan.location.collector.provider.n.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0be81310e96e9ead554ed3d2837e4700", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0be81310e96e9ead554ed3d2837e4700");
            return;
        }
        LogUtils.a("CollectorWifiRadioCenter onWifiScanStopped");
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    public void a(boolean z) {
        String str;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7018f0d38fd5ff11934510d7819b881a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7018f0d38fd5ff11934510d7819b881a");
            return;
        }
        this.d = SystemClock.elapsedRealtime();
        boolean z2 = com.meituan.android.common.locate.reporter.f.b().getBoolean("collect_nr_info", true);
        if (LocationUtils.j(this.f) && z2) {
            try {
                f();
                return;
            } catch (Exception e) {
                LogUtils.a(e.getMessage());
                return;
            }
        }
        a aVar = new a();
        aVar.b = this.l.isNetworkRoaming() ? 1 : 0;
        aVar.e = this.l.getNetworkType();
        if (aVar.e > 127 || aVar.d < 0) {
            aVar.e = 127;
        }
        CellLocation a2 = this.h.a();
        aVar.f = new k(a2);
        com.sankuai.meituan.location.collector.provider.a aVar2 = this.h;
        Context context = this.f;
        Object[] objArr2 = {a2, context};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.location.collector.provider.a.a;
        aVar.d = PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "894e49975b5eaabd90bbb16ba7eb81bb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "894e49975b5eaabd90bbb16ba7eb81bb")).intValue() : (com.sankuai.meituan.location.collector.utils.l.b(context) || a2 == null) ? 9 : a2 instanceof GsmCellLocation ? 1 : 2;
        if (aVar.d == 1) {
            List<NeighboringCellInfo> list = null;
            try {
                if (this.j != null) {
                    list = this.j.a(0);
                }
            } catch (Throwable th) {
                LogUtils.a(th);
            }
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (NeighboringCellInfo neighboringCellInfo : list) {
                    if (this.h.a(neighboringCellInfo)) {
                        arrayList.add(new k(neighboringCellInfo));
                    }
                }
                aVar.g = arrayList;
            }
        }
        aVar.f.a(this.n);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.i;
        if (!k.a(aVar.f, this.c.f) || elapsedRealtime > 15000) {
            if (z) {
                aVar.c = -1L;
                str = "CollectorWifiRadioCenter cellEqual -1";
            } else {
                aVar.c = SystemClock.elapsedRealtime();
                str = "CollectorWifiRadioCenter cell not Equal " + aVar.c;
            }
            LogUtils.a(str);
            this.i = SystemClock.elapsedRealtime();
        } else {
            LogUtils.a("CollectorWifiRadioCenter cell Equal");
            aVar.c = this.c.c;
        }
        this.c = aVar;
        try {
            LogUtils.a("CollectorWifiRadioCenter refreshCells result:" + this.c.c + " ," + this.c.d + StringUtil.SPACE + this.c.f.toString());
            if (this.c.g == null) {
                LogUtils.a("CollectorWifiRadioCenter radios is null");
                return;
            }
            LogUtils.a("CollectorWifiRadioCenter radios " + this.c.g.size());
            Iterator<k> it = this.c.g.iterator();
            while (it.hasNext()) {
                LogUtils.a("CollectorWifiRadioCenter " + it.next().toString());
            }
        } catch (Exception e2) {
            LogUtils.a(getClass(), e2);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3be15681d6fdb1afba14a8acc9aff8c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3be15681d6fdb1afba14a8acc9aff8c3");
        } else if (this.b != null) {
            b bVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "da379b9166a04f2437a091135a717c8a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "da379b9166a04f2437a091135a717c8a");
            } else if (bVar.d != null) {
                bVar.d.clear();
            }
            this.b.b = null;
            this.b.c = -1L;
            LogUtils.a("CollectorWifiRadioCenter clearWifiList");
        }
    }
}
