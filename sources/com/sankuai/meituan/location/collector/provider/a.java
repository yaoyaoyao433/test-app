package com.sankuai.meituan.location.collector.provider;

import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public MtTelephonyManager b;
    public Context c;
    public int d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e0a7a580ec1143616c3506bf3d6503b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e0a7a580ec1143616c3506bf3d6503b");
            return;
        }
        this.b = null;
        this.c = null;
        this.d = -1;
        this.c = com.sankuai.meituan.location.collector.b.c();
        this.b = Privacy.createTelephonyManager(this.c, "pt-c140c5921e4d3392");
    }

    private CellLocation a(List<?> list) {
        GsmCellLocation gsmCellLocation;
        String str;
        CellInfoTdscdma cellInfoTdscdma;
        int lac;
        int cid;
        CellInfoNr cellInfoNr;
        GsmCellLocation gsmCellLocation2;
        Object[] objArr;
        CellInfoLte cellInfoLte;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "944d96742938dc3523ee66ba23dd81c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (CellLocation) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "944d96742938dc3523ee66ba23dd81c4");
        }
        if (list == null || list.isEmpty() || Build.VERSION.SDK_INT < 18) {
            return null;
        }
        boolean z = com.meituan.android.common.locate.reporter.f.b().getBoolean("collect_nr_info", false);
        CdmaCellLocation cdmaCellLocation = null;
        GsmCellLocation gsmCellLocation3 = null;
        char c = 0;
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj != null) {
                if (obj instanceof CellInfoCdma) {
                    CellIdentityCdma cellIdentity = ((CellInfoCdma) obj).getCellIdentity();
                    int systemId = cellIdentity.getSystemId();
                    int networkId = cellIdentity.getNetworkId();
                    int basestationId = cellIdentity.getBasestationId();
                    int longitude = cellIdentity.getLongitude();
                    int latitude = cellIdentity.getLatitude();
                    CdmaCellLocation cdmaCellLocation2 = new CdmaCellLocation();
                    cdmaCellLocation2.setCellLocationData(basestationId, latitude, longitude, systemId, networkId);
                    com.sankuai.meituan.location.collector.utils.l.a("cdma@", Integer.valueOf(systemId), "&", Integer.valueOf(networkId), "&", Integer.valueOf(basestationId));
                    cdmaCellLocation = cdmaCellLocation2;
                    c = 4;
                } else {
                    if (obj instanceof CellInfoLte) {
                        CellIdentityLte cellIdentity2 = ((CellInfoLte) obj).getCellIdentity();
                        int tac = cellIdentity2.getTac();
                        int ci = cellIdentity2.getCi();
                        gsmCellLocation = new GsmCellLocation();
                        gsmCellLocation.setLacAndCid(tac, ci);
                        LogUtils.a("CollectorRadioProvider " + cellInfoLte.toString());
                        com.sankuai.meituan.location.collector.utils.l.a("lte@", Integer.valueOf(tac), "&", Integer.valueOf(ci));
                    } else {
                        if (obj instanceof CellInfoGsm) {
                            CellIdentityGsm cellIdentity3 = ((CellInfoGsm) obj).getCellIdentity();
                            int lac2 = cellIdentity3.getLac();
                            int cid2 = cellIdentity3.getCid();
                            gsmCellLocation2 = new GsmCellLocation();
                            gsmCellLocation2.setLacAndCid(lac2, cid2);
                            objArr = new Object[]{"gsm@", Integer.valueOf(lac2), "&", Integer.valueOf(cid2)};
                        } else if (obj instanceof CellInfoWcdma) {
                            CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) obj).getCellIdentity();
                            int lac3 = cellIdentity4.getLac();
                            int cid3 = cellIdentity4.getCid();
                            gsmCellLocation2 = new GsmCellLocation();
                            gsmCellLocation2.setLacAndCid(lac3, cid3);
                            objArr = new Object[]{"wcdma@", Integer.valueOf(lac3), "&", Integer.valueOf(cid3)};
                        } else if (Build.VERSION.SDK_INT < 29 || !(obj instanceof CellInfoNr)) {
                            if (Build.VERSION.SDK_INT >= 29 && (obj instanceof CellInfoTdscdma) && z) {
                                try {
                                    CellIdentityTdscdma cellIdentity5 = ((CellInfoTdscdma) obj).getCellIdentity();
                                    lac = cellIdentity5.getLac();
                                    cid = cellIdentity5.getCid();
                                    gsmCellLocation = new GsmCellLocation();
                                } catch (Exception unused) {
                                    gsmCellLocation = gsmCellLocation3;
                                }
                                try {
                                    gsmCellLocation.setLacAndCid(lac, cid);
                                    com.sankuai.meituan.location.collector.utils.l.a("tdscdma@", Integer.valueOf(lac), "&", Integer.valueOf(cid));
                                    LogUtils.a("CollectorRadioProvider " + cellInfoTdscdma.toString());
                                } catch (Exception unused2) {
                                    str = "CollectorRadioRrovider error CellInfoTdscdma information";
                                    LogUtils.a(str);
                                    gsmCellLocation3 = gsmCellLocation;
                                }
                            }
                        } else if (z) {
                            try {
                                CellIdentityNr cellIdentityNr = (CellIdentityNr) ((CellInfoNr) obj).getCellIdentity();
                                int tac2 = cellIdentityNr.getTac();
                                int pci = cellIdentityNr.getPci();
                                gsmCellLocation = new GsmCellLocation();
                                try {
                                    gsmCellLocation.setLacAndCid(tac2, pci);
                                    com.sankuai.meituan.location.collector.utils.l.a("nr@", Integer.valueOf(tac2), "&", Integer.valueOf(pci));
                                    LogUtils.a("CollectorRadioProvider " + cellInfoNr.toString());
                                } catch (Exception unused3) {
                                    str = "CollectorRadioRrovider error assign information";
                                    LogUtils.a(str);
                                    gsmCellLocation3 = gsmCellLocation;
                                }
                            } catch (Exception unused4) {
                                gsmCellLocation = gsmCellLocation3;
                            }
                        }
                        com.sankuai.meituan.location.collector.utils.l.a(objArr);
                        gsmCellLocation3 = gsmCellLocation2;
                    }
                    gsmCellLocation3 = gsmCellLocation;
                }
            }
        }
        return c == 4 ? cdmaCellLocation : gsmCellLocation3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (r13.getBaseStationId() < 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(android.telephony.CellLocation r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.location.collector.provider.a.a(android.telephony.CellLocation):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:9|10|(6:15|16|17|(1:19)(5:22|23|(2:25|26)|28|(1:30)(6:31|32|33|(3:35|(1:37)|38)|40|(1:42)(5:43|44|(2:48|49)|51|(1:53)(1:54))))|20|21)|64|65|66|67|16|17|(0)(0)|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.telephony.CellLocation a() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.location.collector.provider.a.a():android.telephony.CellLocation");
    }

    public final boolean a(NeighboringCellInfo neighboringCellInfo) {
        Object[] objArr = {neighboringCellInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b5834e14c44c26c351f66e001fa81c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b5834e14c44c26c351f66e001fa81c8")).booleanValue();
        }
        boolean z = com.meituan.android.common.locate.reporter.f.b().getBoolean("collect_cell_filter", false);
        LogUtils.a("CollectorRadioProvider cell new filter " + z);
        if (neighboringCellInfo == null || neighboringCellInfo.getLac() == -1 || neighboringCellInfo.getLac() == 0 || neighboringCellInfo.getLac() > 65535 || neighboringCellInfo.getCid() == -1 || neighboringCellInfo.getCid() == 0 || neighboringCellInfo.getCid() == 65535 || neighboringCellInfo.getCid() >= 268435455) {
            return false;
        }
        return (z && (neighboringCellInfo.getLac() == Integer.MAX_VALUE || neighboringCellInfo.getCid() == Integer.MAX_VALUE || neighboringCellInfo.getCid() == 50594049 || neighboringCellInfo.getCid() <= 0)) ? false : true;
    }
}
