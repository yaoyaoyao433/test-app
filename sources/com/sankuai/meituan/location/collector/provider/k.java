package com.sankuai.meituan.location.collector.provider;

import android.telephony.CellLocation;
import android.telephony.NeighboringCellInfo;
import android.telephony.SignalStrength;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes4.dex */
public final class k {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public long n;
    public int o;
    public int p;
    public int q;
    public long r;
    public long s;

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa7d21942e29eb818aa6a11a5a0a1da4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa7d21942e29eb818aa6a11a5a0a1da4");
            return;
        }
        this.l = -10;
        this.m = 0;
        this.n = 0L;
        this.o = 0;
        this.p = 0;
        this.r = 0L;
        this.s = 0L;
    }

    public k(CellLocation cellLocation) {
        Object[] objArr = {cellLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f576ea8c0cb6c9d1f322530499f7004a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f576ea8c0cb6c9d1f322530499f7004a");
            return;
        }
        this.l = -10;
        this.m = 0;
        this.n = 0L;
        this.o = 0;
        this.p = 0;
        this.r = 0L;
        this.s = 0L;
        if (cellLocation == null) {
            return;
        }
        a();
        if (cellLocation instanceof GsmCellLocation) {
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            this.d = gsmCellLocation.getLac();
            this.e = gsmCellLocation.getCid();
            this.l = 1;
        }
        if (cellLocation instanceof CdmaCellLocation) {
            CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
            this.f = cdmaCellLocation.getSystemId();
            this.g = cdmaCellLocation.getNetworkId();
            this.h = cdmaCellLocation.getBaseStationId();
            this.j = cdmaCellLocation.getBaseStationLatitude();
            this.i = cdmaCellLocation.getBaseStationLongitude();
            this.l = 2;
        }
    }

    public k(NeighboringCellInfo neighboringCellInfo) {
        Object[] objArr = {neighboringCellInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd4704ea288e94fec134ef1fdb3ad3fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd4704ea288e94fec134ef1fdb3ad3fa");
            return;
        }
        this.l = -10;
        this.m = 0;
        this.n = 0L;
        this.o = 0;
        this.p = 0;
        this.r = 0L;
        this.s = 0L;
        if (neighboringCellInfo == null) {
            return;
        }
        a();
        this.d = neighboringCellInfo.getLac();
        this.e = neighboringCellInfo.getCid();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1db8ab2afda937bc022618a59a1a5f53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1db8ab2afda937bc022618a59a1a5f53");
            return;
        }
        String[] a2 = com.sankuai.meituan.location.collector.utils.l.a(Privacy.createTelephonyManager(com.sankuai.meituan.location.collector.b.c(), "pt-c140c5921e4d3392"));
        if (a2 == null || a2.length <= 1) {
            return;
        }
        this.b = a2[0];
        this.c = a2[1];
    }

    public static boolean a(k kVar, k kVar2) {
        Object[] objArr = {kVar, kVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "086b5fa2633adfe286e93d81c71acf0f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "086b5fa2633adfe286e93d81c71acf0f")).booleanValue();
        }
        if (kVar == null && kVar2 == null) {
            return true;
        }
        if ((kVar != null || kVar2 == null) && ((kVar == null || kVar2 != null) && kVar.l == kVar2.l)) {
            int i = kVar.l;
            LogUtils.a("cell A lac: " + kVar.d + " cell B lac: " + kVar2.d);
            LogUtils.a("cell A cid: " + kVar.e + " cell B cid: " + kVar2.e);
            LogUtils.a("cell A bid: " + kVar.h + " cell B bid: " + kVar2.h);
            LogUtils.a("cell A nid: " + kVar.g + " cell B nid: " + kVar2.g);
            LogUtils.a("cell A sid: " + kVar.f + " cell B sid: " + kVar2.f);
            switch (i) {
                case 1:
                    if (kVar.d == kVar2.d && kVar.e == kVar2.e) {
                        return true;
                    }
                    break;
                case 2:
                    if (kVar.h == kVar2.h && kVar.g == kVar2.g && kVar.f == kVar2.f) {
                        return true;
                    }
                    break;
                case 3:
                    if (kVar.d == kVar2.d && kVar.m == kVar2.m) {
                        return true;
                    }
                    break;
                case 4:
                    if (kVar.o == kVar2.o && kVar.n == kVar2.n) {
                        return true;
                    }
                    break;
                default:
                    return true;
            }
            return false;
        }
        return false;
    }

    public final void a(SignalStrength signalStrength) {
        StringBuilder sb;
        Object[] objArr = {signalStrength};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6602c820ca6e4a76b6e68252c1f2dfbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6602c820ca6e4a76b6e68252c1f2dfbd");
        } else if (signalStrength == null) {
        } else {
            LogUtils.a("CollectorRadio: cgisig--SignalStrength " + signalStrength.toString());
            if (this.l == 1) {
                this.k = signalStrength.getGsmSignalStrength();
                sb = new StringBuilder("CollectorRadio: cgisig--Const.iGsmT ");
            } else {
                this.k = signalStrength.getCdmaDbm();
                sb = new StringBuilder("CollectorRadio: cgisig-- ");
            }
            sb.append(this.k);
            LogUtils.a(sb.toString());
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c93133047369aedee406504bc327326", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c93133047369aedee406504bc327326");
        }
        return "CollectorRadio{mcc='" + this.b + "', mnc='" + this.c + "', lac=" + this.d + ", cid=" + this.e + ", sid=" + this.f + ", nid=" + this.g + ", bid=" + this.h + ", cdmalon=" + this.i + ", cdmalat=" + this.j + ", cgisig=" + this.k + ", cgiType=" + this.l + ", ci=" + this.m + ", nci=" + this.n + ", pci=" + this.o + ", tac=" + this.p + ", nrarfcn=" + this.q + ", nanoTimeStamp=" + this.r + ", timeStamp=" + this.s + '}';
    }
}
