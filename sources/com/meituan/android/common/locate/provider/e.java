package com.meituan.android.common.locate.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.NonNull;
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
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.model.MTCellInfo;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class e {
    public static boolean a = false;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static String[] e = null;
    private static boolean j = true;
    private static e k;
    private MtTelephonyManager b;
    private volatile List<MTCellInfo> c;
    private volatile List<MTCellInfo> d;
    private Context f;
    private h g;
    private long h;
    private long i;
    private final AtomicLong l;
    private long m;
    private long n;

    public e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68aaaff2143092ca5258f93edad32e12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68aaaff2143092ca5258f93edad32e12");
            return;
        }
        this.d = new ArrayList();
        this.l = new AtomicLong(System.currentTimeMillis());
        this.m = 0L;
        this.n = 0L;
        try {
            this.b = Privacy.createTelephonyManager(context, "pt-c140c5921e4d3392");
        } catch (Exception e2) {
            LogUtils.a("CellInfoProvider init exception: " + e2.getMessage());
        }
        this.f = context;
        this.c = new ArrayList();
        this.g = h.a(context);
        if (LocationUtils.j(context)) {
            i();
        }
        a = true;
    }

    @SuppressLint({"NewApi", "PrimitiveParseDetector"})
    private MTCellInfo a(CellInfo cellInfo) {
        StringBuilder sb;
        Object[] objArr = {cellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "184146edf498f9878ff1279914415150", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTCellInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "184146edf498f9878ff1279914415150");
        }
        MTCellInfo mTCellInfo = new MTCellInfo();
        mTCellInfo.isRegistered = cellInfo.isRegistered();
        mTCellInfo.nanoTimeStamp = cellInfo.getTimeStamp();
        mTCellInfo.timeStamp = cellInfo.getTimeStamp();
        if (cellInfo instanceof CellInfoGsm) {
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            mTCellInfo.mcc = cellIdentity.getMcc();
            mTCellInfo.mnc = cellIdentity.getMnc();
            mTCellInfo.lac = cellIdentity.getLac();
            mTCellInfo.cid = cellIdentity.getCid();
            mTCellInfo.rss = cellInfoGsm.getCellSignalStrength().getDbm();
            mTCellInfo.radio_type = MTCellInfo.TYPE_GSM;
            sb = new StringBuilder("CellInfoProvider gsm_");
        } else if (cellInfo instanceof CellInfoCdma) {
            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
            mTCellInfo.cdmalat = cellIdentity2.getLatitude();
            mTCellInfo.cdmalon = cellIdentity2.getLongitude();
            mTCellInfo.sid = cellIdentity2.getSystemId();
            mTCellInfo.nid = cellIdentity2.getNetworkId();
            mTCellInfo.bid = cellIdentity2.getBasestationId();
            mTCellInfo.rss = cellInfoCdma.getCellSignalStrength().getDbm();
            String[] c = c();
            mTCellInfo.mcc = Integer.parseInt(c[0]);
            mTCellInfo.mnc = Integer.parseInt(c[1]);
            mTCellInfo.radio_type = MTCellInfo.TYPE_CDMA;
            sb = new StringBuilder("CellInfoProvider cdma_");
        } else if (cellInfo instanceof CellInfoLte) {
            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
            CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
            mTCellInfo.mcc = cellIdentity3.getMcc();
            mTCellInfo.mnc = cellIdentity3.getMnc();
            mTCellInfo.tac = cellIdentity3.getTac();
            mTCellInfo.ci = cellIdentity3.getCi();
            mTCellInfo.pci = cellIdentity3.getPci();
            mTCellInfo.rss = cellInfoLte.getCellSignalStrength().getDbm();
            mTCellInfo.radio_type = MTCellInfo.TYPE_LTE;
            sb = new StringBuilder("CellInfoProvider lte_");
        } else if ((cellInfo instanceof CellInfoWcdma) && Build.VERSION.SDK_INT >= 18) {
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            CellIdentityWcdma cellIdentity4 = cellInfoWcdma.getCellIdentity();
            mTCellInfo.mcc = cellIdentity4.getMcc();
            mTCellInfo.mnc = cellIdentity4.getMnc();
            mTCellInfo.lac = cellIdentity4.getLac();
            mTCellInfo.cid = cellIdentity4.getCid();
            mTCellInfo.radio_type = MTCellInfo.TYPE_WCDMA;
            mTCellInfo.rss = cellInfoWcdma.getCellSignalStrength().getDbm();
            sb = new StringBuilder("CellInfoProvider wcdma_");
        } else if ((cellInfo instanceof CellInfoNr) && Build.VERSION.SDK_INT >= 29) {
            CellInfoNr cellInfoNr = (CellInfoNr) cellInfo;
            CellIdentityNr cellIdentityNr = (CellIdentityNr) cellInfoNr.getCellIdentity();
            try {
                if (TextUtils.isEmpty(cellIdentityNr.getMccString())) {
                    mTCellInfo.mcc = Integer.MAX_VALUE;
                } else {
                    mTCellInfo.mcc = Integer.parseInt(cellIdentityNr.getMccString());
                }
                if (TextUtils.isEmpty(cellIdentityNr.getMncString())) {
                    mTCellInfo.mnc = Integer.MAX_VALUE;
                } else {
                    mTCellInfo.mnc = Integer.parseInt(cellIdentityNr.getMncString());
                }
            } catch (Exception e2) {
                LogUtils.a("CellInfoProvider parse exception:" + e2.getMessage());
            }
            mTCellInfo.pci = cellIdentityNr.getPci();
            mTCellInfo.tac = cellIdentityNr.getTac();
            if (mTCellInfo.tac == Integer.MAX_VALUE && "HUAWEI".equals(Build.MANUFACTURER)) {
                try {
                    int b = com.meituan.android.common.locate.util.l.b(cellIdentityNr, "getHwTac", new Object[0]);
                    com.meituan.android.common.locate.platform.logs.c.a("system tac=" + mTCellInfo.tac + ",reflect tac=" + b, 3);
                    mTCellInfo.tac = b;
                } catch (Exception unused) {
                    com.meituan.android.common.locate.platform.logs.c.a("getHwTac exception", 3);
                }
            }
            mTCellInfo.nci = cellIdentityNr.getNci();
            mTCellInfo.rss = ((CellSignalStrengthNr) cellInfoNr.getCellSignalStrength()).getSsRsrp();
            mTCellInfo.radio_type = MTCellInfo.TYPE_5G_NR;
            mTCellInfo.nrarfcn = cellIdentityNr.getNrarfcn();
            sb = new StringBuilder("CellInfoProvider 5gNr_");
        } else if (cellInfo instanceof CellInfoTdscdma) {
            CellInfoTdscdma cellInfoTdscdma = (CellInfoTdscdma) cellInfo;
            CellIdentityTdscdma cellIdentity5 = cellInfoTdscdma.getCellIdentity();
            mTCellInfo.lac = cellIdentity5.getLac();
            mTCellInfo.cid = cellIdentity5.getCid();
            try {
                if (TextUtils.isEmpty(cellIdentity5.getMccString())) {
                    mTCellInfo.mcc = Integer.MAX_VALUE;
                } else {
                    mTCellInfo.mcc = Integer.parseInt(cellIdentity5.getMccString());
                }
                if (TextUtils.isEmpty(cellIdentity5.getMncString())) {
                    mTCellInfo.mnc = Integer.MAX_VALUE;
                } else {
                    mTCellInfo.mnc = Integer.parseInt(cellIdentity5.getMncString());
                }
            } catch (Exception e3) {
                LogUtils.a("CellInfoProvider parse exception:" + e3.getMessage());
            }
            mTCellInfo.rss = cellInfoTdscdma.getCellSignalStrength().getDbm();
            mTCellInfo.radio_type = MTCellInfo.TYPE_TDSCDMA;
            sb = new StringBuilder("CellInfoProvider Tdscdma_");
        } else {
            sb = new StringBuilder("CellInfoProvider cell info unknown: ");
        }
        sb.append(mTCellInfo.toString());
        LogUtils.a(sb.toString());
        return mTCellInfo;
    }

    public static e a() {
        return k;
    }

    public static e a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0e6926bf07f9ec2b37e05886429d6aef", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0e6926bf07f9ec2b37e05886429d6aef");
        }
        if (k == null) {
            synchronized (e.class) {
                if (k == null) {
                    k = new e(context);
                }
            }
        }
        return k;
    }

    private static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e26fe48ebb731cf610d36b17dd67e4c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e26fe48ebb731cf610d36b17dd67e4c9");
        }
        switch (i) {
            case 1:
                return "GPRS";
            case 2:
                return "EDGE";
            case 3:
                return "UMTS";
            case 4:
                return MTCellInfo.TYPE_CDMA;
            case 5:
                return "CDMA - EvDo rev. 0";
            case 6:
                return "CDMA - EvDo rev. A";
            case 7:
                return "CDMA - 1xRTT";
            case 8:
                return "HSDPA";
            case 9:
                return "HSUPA";
            case 10:
                return "HSPA";
            case 11:
                return "iDEN";
            case 12:
                return "CDMA - EvDo rev. B";
            case 13:
                return MTCellInfo.TYPE_LTE;
            case 14:
                return "CDMA - eHRPD";
            case 15:
                return "HSPA+";
            case 16:
                return MTCellInfo.TYPE_GSM;
            case 17:
                return "TD_SCDMA";
            case 18:
                return "IWLAN";
            case 19:
            default:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
            case 20:
                return MTCellInfo.TYPE_5G_NR;
        }
    }

    private synchronized void a(List<MTCellInfo> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e55453f1f042987a6ba721afa9915a75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e55453f1f042987a6ba721afa9915a75");
            return;
        }
        if (!z) {
            LogUtils.a("CellInfoProvider cell list is not empty,save file and cache");
            this.c.clear();
            this.c.addAll(list);
        } else if (this.c.isEmpty()) {
            this.c.addAll(list);
        }
    }

    private void b(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d417b408b916e44960492e98140a0f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d417b408b916e44960492e98140a0f9");
            return;
        }
        com.meituan.android.common.locate.reporter.f.b().edit().putLong("cgiAge", j2).apply();
        LogUtils.a("CellInfoProvider set cgiAge: " + j2);
    }

    private boolean b(MTCellInfo mTCellInfo) {
        Object[] objArr = {mTCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dbcca79e793849b8265e38e4965f0b6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dbcca79e793849b8265e38e4965f0b6")).booleanValue();
        }
        if (mTCellInfo == null) {
            return false;
        }
        return SystemClock.elapsedRealtime() - (mTCellInfo.nanoTimeStamp / 1000000) <= com.meituan.android.common.locate.reporter.c.a(this.f).c() || !com.meituan.android.common.locate.reporter.c.a(this.f).d();
    }

    private boolean b(List<MTCellInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "433df30f2f27b2929c4534ab9fcea2a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "433df30f2f27b2929c4534ab9fcea2a0")).booleanValue();
        }
        boolean a2 = LocationUtils.a(this.b);
        long e2 = a2 ? com.meituan.android.common.locate.reporter.c.a(this.f).e() : com.meituan.android.common.locate.reporter.c.a(this.f).f();
        com.meituan.android.common.locate.platform.logs.c.a("getcells hassim:" + a2 + ",isIntercept:" + e2, 3);
        if (SystemClock.elapsedRealtime() - this.n < e2) {
            boolean z = this.c == null || this.c.isEmpty();
            com.meituan.android.common.locate.platform.logs.c.a("getcells too much mCellInfos is empty:" + z, 3);
            if (!z || !a2) {
                list.addAll(this.c);
                return true;
            }
        }
        return false;
    }

    private void c(List<MTCellInfo> list) {
        MTCellInfo mTCellInfo;
        boolean z;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25280cfba5b4f4673d2f396323a5fa76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25280cfba5b4f4673d2f396323a5fa76");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j) {
            j = !j;
            this.h = elapsedRealtime;
        }
        LogUtils.a("CellInfoProvider  lastRadioCheckTime: " + this.h + " / mRadioCheckTime: " + elapsedRealtime);
        StringBuilder sb = new StringBuilder("CellInfoProvider  radioScanResults before compare : ");
        sb.append(list);
        LogUtils.a(sb.toString());
        for (MTCellInfo mTCellInfo2 : list) {
            Iterator<MTCellInfo> it = this.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    mTCellInfo = null;
                    z = false;
                    break;
                }
                mTCellInfo = it.next();
                if (MTCellInfo.compareCellEqual(mTCellInfo2, mTCellInfo)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                LogUtils.a("CellInfoProvider  scanResult equal ");
                if (mTCellInfo2.rss == mTCellInfo.rss) {
                    int i = (int) (elapsedRealtime - this.h);
                    LogUtils.a("CellInfoProvider  scanResult.cgiage : " + mTCellInfo.cgiage + " pastTime: " + i);
                    mTCellInfo2.cgiage = mTCellInfo.cgiage + i;
                }
            }
            mTCellInfo2.cgiage = 0;
        }
        LogUtils.a("CellInfoProvider  radioScanResults after compare : " + list);
        this.h = elapsedRealtime;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean c(MTCellInfo mTCellInfo) {
        char c;
        Object[] objArr = {mTCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdef7a8858502a067e9a943e89aae4ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdef7a8858502a067e9a943e89aae4ae")).booleanValue();
        }
        boolean h = com.meituan.android.common.locate.reporter.c.a(this.f).h();
        LogUtils.a("CellInfoProvider cell_legal_filter " + h);
        if (h) {
            String str = mTCellInfo.radio_type;
            switch (str.hashCode()) {
                case 70881:
                    if (str.equals(MTCellInfo.TYPE_GSM)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 75709:
                    if (str.equals(MTCellInfo.TYPE_LTE)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 2063797:
                    if (str.equals(MTCellInfo.TYPE_CDMA)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 51107519:
                    if (str.equals(MTCellInfo.TYPE_5G_NR)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 82410124:
                    if (str.equals(MTCellInfo.TYPE_WCDMA)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1954916075:
                    if (str.equals(MTCellInfo.TYPE_TDSCDMA)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                    return (mTCellInfo.mcc < 0 || mTCellInfo.mnc < 0 || mTCellInfo.lac < 0 || mTCellInfo.lac == 2147483647L || mTCellInfo.cid == 268435455 || mTCellInfo.cid == 2147483647L || mTCellInfo.cid == 50594049 || mTCellInfo.cid == 65535 || mTCellInfo.cid <= 0) ? false : true;
                case 3:
                    return mTCellInfo.mcc >= 0 && mTCellInfo.mnc >= 0 && mTCellInfo.nid >= 0 && mTCellInfo.nid < 65535 && mTCellInfo.bid >= 0 && mTCellInfo.bid < 65535;
                case 4:
                    return (mTCellInfo.mcc < 0 || mTCellInfo.mnc < 0 || mTCellInfo.tac < 0 || mTCellInfo.tac == Integer.MAX_VALUE || mTCellInfo.ci == 268435455 || mTCellInfo.ci == Integer.MAX_VALUE || mTCellInfo.ci == 50594049 || mTCellInfo.ci == 65535 || mTCellInfo.ci <= 0) ? false : true;
                case 5:
                    if (mTCellInfo.mcc < 0 || mTCellInfo.mnc < 0 || mTCellInfo.tac < 0 || mTCellInfo.tac == Integer.MAX_VALUE || mTCellInfo.nci == 268435455 || mTCellInfo.nci == 2147483647L || mTCellInfo.nci == 50594049 || mTCellInfo.nci == 65535 || mTCellInfo.nci <= 0) {
                        return false;
                    }
                    break;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a9  */
    @android.annotation.SuppressLint({"PrimitiveParseDetector"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.meituan.android.common.locate.model.MTCellInfo> g() {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.provider.e.g():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    @android.annotation.SuppressLint({"NewApi", "MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.meituan.android.common.locate.model.MTCellInfo> h() {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.provider.e.h():java.util.List");
    }

    @SuppressLint({"NewApi", "MissingPermission"})
    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed347e8946281207eea3122df848c5db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed347e8946281207eea3122df848c5db");
            return;
        }
        LogUtils.a("CellInfoProvider requestUpdate start");
        if (this.b == null || SystemClock.elapsedRealtime() - this.m < com.meituan.android.common.locate.reporter.c.a(this.f).a()) {
            LogUtils.a("CellInfoProvider requestUpdate is too much,return");
            StringBuilder sb = new StringBuilder(" cell info provider return because telemanger == null or time elapse not long ");
            sb.append(this.b == null);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = this.f.getApplicationInfo().targetSdkVersion;
        com.meituan.android.common.locate.platform.logs.c.a(" cell info provider requestUpdate sdkint=" + i + " targetv=" + i2, 3);
        if (i < 29 || i2 < 29) {
            return;
        }
        try {
            com.meituan.android.common.locate.api.a.a("requestCellInfoUpdate_sdk", 1);
            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_perm_count", " requestCellInfoUpdate_sdk"));
            this.b.requestCellInfoUpdate(com.meituan.android.common.locate.util.f.a().b(), new TelephonyManager.CellInfoCallback() { // from class: com.meituan.android.common.locate.provider.e.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.telephony.TelephonyManager.CellInfoCallback
                public void onCellInfo(@NonNull List<CellInfo> list) {
                    String str;
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "236bb1377d7bef1c29c97eb54abbf242", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "236bb1377d7bef1c29c97eb54abbf242");
                        return;
                    }
                    if (list == null) {
                        str = " CellInfoPorvider::requestUpdate::onCellInfo cellinfo = null ";
                    } else {
                        str = " CellInfoPorvider::requestUpdate::onCellInfo cellinfo = " + list.toString();
                    }
                    com.meituan.android.common.locate.platform.logs.c.a(str, 3);
                }
            });
            com.meituan.android.common.locate.platform.sniffer.report.d.a().e++;
            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_trigger_entrance", " CellInfoProvider_requestUpdate"));
            LogUtils.a("CellInfoProvider requestUpdate");
            this.m = SystemClock.elapsedRealtime();
        } catch (SecurityException e2) {
            com.meituan.android.common.locate.platform.logs.c.a(" CellInfoPorvider::requestUpdate::onCellInfo SecurityException = " + e2.getMessage(), 3);
            LogUtils.a("CellInfoProvider requestUpdate SecurityException:" + e2.getMessage());
        } catch (Exception e3) {
            com.meituan.android.common.locate.platform.logs.c.a(" CellInfoPorvider::requestUpdate::onCellInfos exepction = " + e3.getMessage(), 3);
            LogUtils.a("CellInfoProvider requestUpdate exception:" + e3.getMessage());
        }
    }

    public void a(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29d39274418c43deb3fbc07d6deb4a09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29d39274418c43deb3fbc07d6deb4a09");
        } else {
            this.l.set(j2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r1.equals(com.meituan.android.common.locate.model.MTCellInfo.TYPE_TDSCDMA) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(org.json.JSONObject r14, com.meituan.android.common.locate.model.MTCellInfo r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.provider.e.a(org.json.JSONObject, com.meituan.android.common.locate.model.MTCellInfo):void");
    }

    public boolean a(CellLocation cellLocation) {
        String str;
        String str2;
        Object[] objArr = {cellLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b01cf5aef9dcef214784ba5c3144e2f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b01cf5aef9dcef214784ba5c3144e2f8")).booleanValue();
        }
        if (cellLocation == null) {
            return false;
        }
        int a2 = LocationUtils.a(cellLocation, this.f);
        LogUtils.a("iCellLocT:" + a2);
        switch (a2) {
            case 1:
                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                LogUtils.a("gsmCellLoc.lac:" + gsmCellLocation.getLac());
                LogUtils.a("gsmCellLoc.cid:" + gsmCellLocation.getCid());
                r0 = (gsmCellLocation.getLac() == -1 || gsmCellLocation.getLac() == 0 || gsmCellLocation.getLac() > 65535 || gsmCellLocation.getCid() == -1 || gsmCellLocation.getCid() == 0 || gsmCellLocation.getCid() == 65535 || gsmCellLocation.getCid() >= 268435455) ? false : true;
                int cid = gsmCellLocation.getCid();
                if (cid == 8 || cid == 10 || cid == 33) {
                    str = "cgi|fake";
                    break;
                } else {
                    return r0;
                }
                break;
            case 2:
                CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                try {
                    LogUtils.a("CellInfoProvider oCdma.getSystemId(): " + cdmaCellLocation.getSystemId() + " oCdma.getNetworkId() " + cdmaCellLocation.getNetworkId() + " oCdma.getBaseStationId() " + cdmaCellLocation.getBaseStationId());
                    if (cdmaCellLocation.getSystemId() <= 0) {
                        str2 = "cdma sysid<0";
                    } else if (cdmaCellLocation.getNetworkId() < 0) {
                        str2 = "cdma netid<0";
                    } else if (cdmaCellLocation.getBaseStationId() >= 0) {
                        return true;
                    } else {
                        str2 = "cdma baseStationId<0";
                    }
                    LogUtils.a(str2);
                    r0 = false;
                    return false;
                } catch (Exception e2) {
                    str = e2.getMessage();
                    break;
                }
            default:
                str = "CellInfoProvider cgiUseful into default: " + a2;
                break;
        }
        LogUtils.a(str);
        return r0;
    }

    public boolean a(NeighboringCellInfo neighboringCellInfo) {
        Object[] objArr = {neighboringCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16a6b2dd27d91edaa1912794cc24415d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16a6b2dd27d91edaa1912794cc24415d")).booleanValue() : (neighboringCellInfo == null || neighboringCellInfo.getLac() == -1 || neighboringCellInfo.getLac() == 0 || neighboringCellInfo.getLac() > 65535 || neighboringCellInfo.getCid() == -1 || neighboringCellInfo.getCid() == 0 || neighboringCellInfo.getCid() == 65535 || neighboringCellInfo.getCid() >= 268435455) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean a(MTCellInfo mTCellInfo) {
        com.meituan.android.common.locate.platform.logs.d a2;
        String str;
        boolean z = false;
        Object[] objArr = {mTCellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a20d085a437037c479d93aa830d314bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a20d085a437037c479d93aa830d314bb")).booleanValue();
        }
        if (mTCellInfo == null || TextUtils.isEmpty(mTCellInfo.radio_type)) {
            com.meituan.android.common.locate.platform.logs.d.a().a("no_radio");
            return false;
        } else if (mTCellInfo.mcc == 0 && mTCellInfo.mnc == 0) {
            LogUtils.a("CellInfoProvider cell info mcc and mnc all zero");
            com.meituan.android.common.locate.platform.logs.d.a().a("mcc_error");
            return false;
        } else {
            String str2 = mTCellInfo.radio_type;
            char c = 65535;
            switch (str2.hashCode()) {
                case 70881:
                    if (str2.equals(MTCellInfo.TYPE_GSM)) {
                        c = 0;
                        break;
                    }
                    break;
                case 75709:
                    if (str2.equals(MTCellInfo.TYPE_LTE)) {
                        c = 4;
                        break;
                    }
                    break;
                case 2063797:
                    if (str2.equals(MTCellInfo.TYPE_CDMA)) {
                        c = 5;
                        break;
                    }
                    break;
                case 51107519:
                    if (str2.equals(MTCellInfo.TYPE_5G_NR)) {
                        c = 3;
                        break;
                    }
                    break;
                case 82410124:
                    if (str2.equals(MTCellInfo.TYPE_WCDMA)) {
                        c = 1;
                        break;
                    }
                    break;
                case 1954916075:
                    if (str2.equals(MTCellInfo.TYPE_TDSCDMA)) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                    if ((mTCellInfo.lac == 0 && mTCellInfo.cid == 0) || mTCellInfo.lac > 65535 || mTCellInfo.cid == -1 || mTCellInfo.cid >= 268435455 || mTCellInfo.cid == 65535) {
                        a2 = com.meituan.android.common.locate.platform.logs.d.a();
                        str = "2_3g_error";
                        a2.a(str);
                        break;
                    }
                    z = true;
                    break;
                case 3:
                    if ((mTCellInfo.nci <= 0 && mTCellInfo.tac == 0 && mTCellInfo.pci == 0) || ((mTCellInfo.nci == Long.MAX_VALUE && mTCellInfo.tac == Integer.MAX_VALUE) || mTCellInfo.pci >= 1007)) {
                        a2 = com.meituan.android.common.locate.platform.logs.d.a();
                        str = "nr_error";
                        a2.a(str);
                        break;
                    }
                    z = true;
                    break;
                case 4:
                    if ((mTCellInfo.tac == 0 && mTCellInfo.ci == 0 && mTCellInfo.pci == 0) || ((mTCellInfo.tac == Integer.MAX_VALUE && mTCellInfo.ci >= 268435455) || mTCellInfo.pci >= 503)) {
                        a2 = com.meituan.android.common.locate.platform.logs.d.a();
                        str = "lte_error";
                        a2.a(str);
                        break;
                    }
                    z = true;
                    break;
                case 5:
                    if ((mTCellInfo.sid == 0 && mTCellInfo.nid == 0 && mTCellInfo.bid == 0) || ((mTCellInfo.sid == 2147483647L && mTCellInfo.nid == 2147483647L && mTCellInfo.bid == 2147483647L) || mTCellInfo.sid < 0 || mTCellInfo.bid < 0 || mTCellInfo.nid < 0)) {
                        a2 = com.meituan.android.common.locate.platform.logs.d.a();
                        str = "cdma_error";
                        a2.a(str);
                        break;
                    }
                    z = true;
                    break;
                default:
                    z = true;
                    break;
            }
            LogUtils.a("CellInfoProvider " + str2 + " useful : " + z);
            return z;
        }
    }

    public boolean a(List<MTCellInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68110ecc8024ccc743e04c2da9fdcd16", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68110ecc8024ccc743e04c2da9fdcd16")).booleanValue();
        }
        if (list == null || list.size() == 0) {
            return false;
        }
        CellLocation cellLocation = null;
        if (list != null) {
            try {
                if (list.size() != 0) {
                    MTCellInfo mTCellInfo = list.get(0);
                    if (mTCellInfo == null) {
                        return false;
                    }
                    if (com.meituan.android.common.locate.reporter.c.a(this.f).h()) {
                        return c(mTCellInfo);
                    }
                    if (MTCellInfo.TYPE_GSM.equals(mTCellInfo.radio_type)) {
                        cellLocation = new GsmCellLocation();
                        ((GsmCellLocation) cellLocation).setLacAndCid((int) mTCellInfo.lac, (int) mTCellInfo.cid);
                    } else if (MTCellInfo.TYPE_CDMA.equals(mTCellInfo.radio_type)) {
                        cellLocation = new CdmaCellLocation();
                        ((CdmaCellLocation) cellLocation).setCellLocationData((int) mTCellInfo.bid, 0, 0, (int) mTCellInfo.sid, (int) mTCellInfo.nid);
                    }
                }
            } catch (Exception e2) {
                LogUtils.a("get cellLocation exception: " + e2.getMessage());
                return false;
            }
        }
        if (cellLocation == null) {
            LogUtils.a("cellLocation is null");
            return false;
        }
        return a(cellLocation);
    }

    public boolean a(JSONObject jSONObject, GearsLocator.b bVar) {
        String str;
        MTCellInfo next;
        Object[] objArr = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79e33f689ff76891ebe8c653f9262e29", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79e33f689ff76891ebe8c653f9262e29")).booleanValue();
        }
        List<MTCellInfo> a2 = bVar.a();
        if (a2 != null && !a2.isEmpty()) {
            Iterator<MTCellInfo> it = a2.iterator();
            while (it.hasNext()) {
                if (!c(it.next())) {
                    it.remove();
                    LogUtils.a("CellInfoProvider cellinfo filter" + next.toString());
                }
                LogUtils.a("CellInfoProvider cellinfo is legal");
            }
        }
        int g = com.meituan.android.common.locate.reporter.c.a(this.f).g();
        if (a2 == null || a2.size() <= g) {
            if (a2 != null) {
                str = " CellInfoPorvider::addCellInfoForLocate::mUploadmaxlength：" + g + "cell size:" + a2.size();
            }
            return a(jSONObject, a2);
        }
        a2 = a2.subList(0, g);
        str = " CellInfoPorvider::addCellInfoForLocate::after subList cell size:" + a2.size();
        LogUtils.a(str);
        return a(jSONObject, a2);
    }

    public boolean a(JSONObject jSONObject, List<MTCellInfo> list) {
        Object[] objArr = {jSONObject, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0877cb91ee5dba6016b4387b91f3ab9d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0877cb91ee5dba6016b4387b91f3ab9d")).booleanValue();
        }
        if (list.size() <= 0) {
            LogUtils.a("error:no radio info has been scanned");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (MTCellInfo mTCellInfo : list) {
                if (a(mTCellInfo)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("mcc", mTCellInfo.mcc);
                    jSONObject2.put("mnc", mTCellInfo.mnc);
                    jSONObject2.put("age", mTCellInfo.cgiage / 1000);
                    jSONObject2.put("signal", mTCellInfo.rss);
                    a(jSONObject2, mTCellInfo);
                    jSONArray.put(jSONObject2);
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put("cell_towers", jSONArray);
            }
        } catch (Exception e2) {
            LogUtils.a("add cellInfo error: " + e2.getMessage());
        }
        return jSONObject.has("cell_towers");
    }

    public long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "055218bf9abd673f2c1c7d1453576da3", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "055218bf9abd673f2c1c7d1453576da3")).longValue() : this.l.get();
    }

    public void b(JSONObject jSONObject, List<MTCellInfo> list) {
        String str;
        String str2;
        String str3;
        Object[] objArr = {jSONObject, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a69c560a243951393353840899255d2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a69c560a243951393353840899255d2e");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        if (list.size() <= 0) {
            str = "error:no radio info has been scanned";
        } else {
            try {
                MTCellInfo mTCellInfo = list.get(0);
                jSONObject.put("home_mobile_country_code", mTCellInfo.mcc);
                jSONObject.put("home_mobile_network_code", mTCellInfo.mnc);
                if (mTCellInfo.mcc == 460) {
                    str2 = "address_language";
                    str3 = "zh_CN";
                } else {
                    str2 = "address_language";
                    str3 = "en_US";
                }
                jSONObject.put(str2, str3);
                jSONObject.put("radio_type", a(this.b.getNetworkType()));
                for (MTCellInfo mTCellInfo2 : list) {
                    if (a(mTCellInfo2)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("radio_type", mTCellInfo2.radio_type);
                        jSONObject2.put("mobile_country_code", mTCellInfo2.mcc);
                        jSONObject2.put("mobile_network_code", mTCellInfo2.mnc);
                        jSONObject2.put("location_area_code", mTCellInfo2.lac);
                        jSONObject2.put("cell_id", mTCellInfo2.cid);
                        jSONObject2.put("system_id", mTCellInfo2.sid);
                        jSONObject2.put("network_id", mTCellInfo2.nid);
                        jSONObject2.put("base_station_id", mTCellInfo2.bid);
                        jSONObject2.put("cdma_lat", mTCellInfo2.cdmalat);
                        jSONObject2.put("cdma_lon", mTCellInfo2.cdmalon);
                        jSONObject2.put("signal_strength", mTCellInfo2.rss);
                        jSONObject2.put("cgiage", mTCellInfo2.cgiage);
                        jSONArray.put(jSONObject2);
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("cell_towers", jSONArray);
                    return;
                }
                return;
            } catch (Exception e2) {
                str = "add cellInfo error: " + e2.getMessage();
            }
        }
        LogUtils.a(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:6|(1:8)|9|(1:11)(3:46|(1:48)(2:50|(1:52)(7:53|(3:14|(2:19|15)|21)|23|24|(1:26)|27|(2:33|(1:41)(2:39|40))(2:31|32)))|49)|12|(0)|23|24|(0)|27|(1:29)|33|(2:35|42)(1:43)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
        r1 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String[] c() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.locate.provider.e.changeQuickRedirect
            java.lang.String r10 = "6a2d942b63cd8e8168304c62619c871f"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L1b:
            r1 = 0
            com.meituan.android.privacy.interfaces.MtTelephonyManager r2 = r11.b
            if (r2 == 0) goto L26
            com.meituan.android.privacy.interfaces.MtTelephonyManager r1 = r11.b
            java.lang.String r1 = r1.getNetworkOperator()
        L26:
            java.lang.String r2 = "0"
            java.lang.String r3 = "0"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            r4 = 1
            if (r3 == 0) goto L3c
            java.lang.String r3 = "Network Operator String is null or empty"
        L37:
            com.meituan.android.common.locate.util.LogUtils.a(r3)
            r3 = 0
            goto L61
        L3c:
            boolean r3 = android.text.TextUtils.isDigitsOnly(r1)
            if (r3 != 0) goto L51
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Network Operator is illegal,str: "
            r3.<init>(r5)
        L49:
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            goto L37
        L51:
            int r3 = r1.length()
            r5 = 4
            if (r3 > r5) goto L60
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Length of network operator is less than 4,str: "
            r3.<init>(r5)
            goto L49
        L60:
            r3 = 1
        L61:
            if (r3 == 0) goto L88
            r3 = 3
            java.lang.String r5 = r1.substring(r0, r3)
            r2[r0] = r5
            java.lang.String r5 = r1.substring(r3)
            char[] r5 = r5.toCharArray()
            r6 = 0
        L73:
            int r7 = r5.length
            if (r6 >= r7) goto L81
            char r7 = r5[r6]
            boolean r7 = java.lang.Character.isDigit(r7)
            if (r7 == 0) goto L81
            int r6 = r6 + 1
            goto L73
        L81:
            int r6 = r6 + r3
            java.lang.String r1 = r1.substring(r3, r6)
            r2[r4] = r1
        L88:
            r1 = r2[r0]     // Catch: java.lang.Exception -> L8f
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L8f
            goto L90
        L8f:
            r1 = 0
        L90:
            if (r1 != 0) goto L96
            java.lang.String r1 = "0"
            r2[r0] = r1
        L96:
            r1 = r2[r0]
            java.lang.String r3 = "0"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lad
            r1 = r2[r4]
            java.lang.String r3 = "0"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lad
            com.meituan.android.common.locate.provider.e.e = r2
            goto Lcc
        Lad:
            r0 = r2[r0]
            java.lang.String r1 = "0"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lcc
            r0 = r2[r4]
            java.lang.String r1 = "0"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lcc
            java.lang.String[] r0 = com.meituan.android.common.locate.provider.e.e
            if (r0 == 0) goto Lcc
            java.lang.String[] r2 = com.meituan.android.common.locate.provider.e.e
            java.lang.String r0 = "Failed to obtain mcc and mnc,the cache value would be used"
            com.meituan.android.common.locate.util.LogUtils.a(r0)
        Lcc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.provider.e.c():java.lang.String[]");
    }

    public List<MTCellInfo> d() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fef04c66487736b8ec990be2ab9c526b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fef04c66487736b8ec990be2ab9c526b");
        }
        ArrayList arrayList = new ArrayList();
        if (this.c == null || this.c.isEmpty() || SystemClock.elapsedRealtime() - this.i >= com.meituan.android.common.locate.reporter.c.a(this.f).b()) {
            str = "CellInfoProvider cache cell is illegality ";
        } else {
            arrayList.addAll(this.c);
            str = "CellInfoProvider cache cell is ok ";
        }
        LogUtils.a(str);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9 A[Catch: all -> 0x00d8, TryCatch #1 {, blocks: (B:4:0x0002, B:6:0x0015, B:9:0x001d, B:11:0x002d, B:14:0x0034, B:40:0x00b3, B:42:0x00b9, B:43:0x00c8, B:39:0x00ac), top: B:50:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8 A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0002, B:6:0x0015, B:9:0x001d, B:11:0x002d, B:14:0x0034, B:40:0x00b3, B:42:0x00b9, B:43:0x00c8, B:39:0x00ac), top: B:50:0x0002 }] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.List<com.meituan.android.common.locate.model.MTCellInfo> e() {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Ld8
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.common.locate.provider.e.changeQuickRedirect     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r10 = "d195d6256288424f84cfa275e708a5fc"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Ld8
            if (r1 == 0) goto L1d
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r9, r0, r10)     // Catch: java.lang.Throwable -> Ld8
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> Ld8
            monitor-exit(r12)
            return r0
        L1d:
            java.lang.String r1 = "getCellInfos start"
            com.meituan.android.common.locate.util.LogUtils.a(r1)     // Catch: java.lang.Throwable -> Ld8
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld8
            r1.<init>()     // Catch: java.lang.Throwable -> Ld8
            boolean r2 = r12.b(r1)     // Catch: java.lang.Throwable -> Ld8
            if (r2 == 0) goto L34
            java.lang.String r0 = "getCellInfos isIntercept"
            com.meituan.android.common.locate.util.LogUtils.a(r0)     // Catch: java.lang.Throwable -> Ld8
            monitor-exit(r12)
            return r1
        L34:
            java.lang.String r2 = "real getcells"
            r3 = 3
            com.meituan.android.common.locate.platform.logs.c.a(r2, r3)     // Catch: java.lang.Throwable -> Ld8
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Ld8
            r12.n = r4     // Catch: java.lang.Throwable -> Ld8
            android.content.Context r2 = r12.f     // Catch: java.lang.Throwable -> Lab
            boolean r2 = com.meituan.android.common.locate.util.LocationUtils.j(r2)     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto La0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lab
            r3 = 18
            if (r2 < r3) goto L7c
            java.util.List r2 = r12.h()     // Catch: java.lang.Throwable -> Lab
            boolean r1 = r2.isEmpty()     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L9e
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L77
            r12.a(r3)     // Catch: java.lang.Throwable -> L77
            java.util.List r1 = r12.g()     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto Lb3
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> Lab
            if (r2 != 0) goto Lb3
            java.util.List<com.meituan.android.common.locate.model.MTCellInfo> r2 = r12.d     // Catch: java.lang.Throwable -> Lab
            r2.clear()     // Catch: java.lang.Throwable -> Lab
            java.util.List<com.meituan.android.common.locate.model.MTCellInfo> r2 = r12.d     // Catch: java.lang.Throwable -> Lab
            r2.addAll(r1)     // Catch: java.lang.Throwable -> Lab
            goto Lb3
        L77:
            r1 = move-exception
            r11 = r2
            r2 = r1
            r1 = r11
            goto Lac
        L7c:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lab
            r12.a(r2)     // Catch: java.lang.Throwable -> Lab
            java.util.List r2 = r12.g()     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto L99
            boolean r1 = r2.isEmpty()     // Catch: java.lang.Throwable -> L77
            if (r1 != 0) goto L99
            java.util.List<com.meituan.android.common.locate.model.MTCellInfo> r1 = r12.d     // Catch: java.lang.Throwable -> L77
            r1.clear()     // Catch: java.lang.Throwable -> L77
            java.util.List<com.meituan.android.common.locate.model.MTCellInfo> r1 = r12.d     // Catch: java.lang.Throwable -> L77
            r1.addAll(r2)     // Catch: java.lang.Throwable -> L77
        L99:
            java.lang.String r1 = "CellInfoProvider old cells:"
            com.meituan.android.common.locate.util.LogUtils.b(r1, r2)     // Catch: java.lang.Throwable -> L77
        L9e:
            r1 = r2
            goto Lb3
        La0:
            java.lang.String r2 = "CellInfoProvider can't get cellList, missing permissions"
            com.meituan.android.common.locate.util.LogUtils.a(r2)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r2 = "can't get cellList, missing permissions"
            com.meituan.android.common.locate.platform.logs.c.a(r2, r3)     // Catch: java.lang.Throwable -> Lab
            goto Lb3
        Lab:
            r2 = move-exception
        Lac:
            java.lang.Class r3 = r12.getClass()     // Catch: java.lang.Throwable -> Ld8
            com.meituan.android.common.locate.util.LogUtils.a(r3, r2)     // Catch: java.lang.Throwable -> Ld8
        Lb3:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> Ld8
            if (r2 != 0) goto Lc8
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Ld8
            r12.i = r2     // Catch: java.lang.Throwable -> Ld8
            long r2 = r12.i     // Catch: java.lang.Throwable -> Ld8
            r12.b(r2)     // Catch: java.lang.Throwable -> Ld8
            r12.a(r1, r0)     // Catch: java.lang.Throwable -> Ld8
            goto Ld6
        Lc8:
            java.lang.String r0 = "CellInfoProvider  cell list is null or empty, use cache cell"
            com.meituan.android.common.locate.util.LogUtils.a(r0)     // Catch: java.lang.Throwable -> Ld8
            java.util.List r1 = r12.d()     // Catch: java.lang.Throwable -> Ld8
            java.lang.String r0 = "CellInfoProvider cache cells:"
            com.meituan.android.common.locate.util.LogUtils.b(r0, r1)     // Catch: java.lang.Throwable -> Ld8
        Ld6:
            monitor-exit(r12)
            return r1
        Ld8:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.provider.e.e():java.util.List");
    }

    public List<MTCellInfo> f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a17c42312f79642ffd593a00f9f835ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a17c42312f79642ffd593a00f9f835ed");
        }
        List<MTCellInfo> d = d();
        if (d.isEmpty()) {
            boolean a2 = LocationUtils.a(this.b);
            LogUtils.a("use cache,but cache is null,hassim:" + a2);
            return a2 ? e() : d;
        }
        return d;
    }
}
