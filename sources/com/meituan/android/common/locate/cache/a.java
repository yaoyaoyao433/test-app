package com.meituan.android.common.locate.cache;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.support.annotation.NonNull;
import android.telephony.CellLocation;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.model.MTCellInfo;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.provider.e;
import com.meituan.android.common.locate.provider.t;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.locate.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class a implements f.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Object a;
    private Context b;
    private SharedPreferences c;
    private e d;
    private d e;
    private long f;
    private volatile boolean g;
    private ConcurrentHashMap<String, ArrayList<GearsLocator.a>> h;

    public a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4adc06a10b18297354475f76aba1072e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4adc06a10b18297354475f76aba1072e");
            return;
        }
        this.a = new Object();
        this.b = context;
        this.c = f.b();
        this.f = this.c.getLong("cache_overdue_time", 35L) * 60 * 1000;
        this.d = e.a(context);
        f.a(this);
    }

    private MtLocation a(ArrayList<GearsLocator.a> arrayList, GearsLocator.b bVar) {
        Object[] objArr = {arrayList, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "705d52017cefffa6112823146f613c23", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "705d52017cefffa6112823146f613c23");
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                GearsLocator.a aVar = arrayList.get(size);
                if (aVar != null) {
                    List<GearsLocator.a.C0214a> c = aVar.c();
                    List<ScanResult> c2 = bVar.c();
                    LogUtils.a("GearsCache prepare to compare[sort]", c2);
                    boolean a = t.a(this.b).a(c, c2);
                    LogUtils.a("Gears flag =  " + a);
                    if (a) {
                        LogUtils.a("Gears wifi similar " + aVar.b());
                        MtLocation a2 = aVar.a();
                        if (c != null && !a(a2)) {
                            return aVar.a();
                        }
                        LogUtils.a("getValidWifiCacheLocation cacheOverdue : " + this.f);
                        arrayList.remove(size);
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    private String a(boolean z, List<MTCellInfo> list, String[] strArr) {
        StringBuilder sb;
        String str;
        String str2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), list, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3085c246f3ca5c5562167c464e1b7cfc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3085c246f3ca5c5562167c464e1b7cfc");
        }
        StringBuilder sb2 = new StringBuilder();
        String str3 = "";
        Boolean valueOf = Boolean.valueOf(com.meituan.android.common.locate.reporter.c.a(this.b).h());
        if (!this.d.a(list)) {
            if (z) {
                sb2.append("WIFI");
                return sb2.toString();
            }
            return sb2.toString();
        }
        CellLocation cellLocation = null;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    MTCellInfo mTCellInfo = list.get(0);
                    if (MTCellInfo.TYPE_GSM.equals(mTCellInfo.radio_type)) {
                        GsmCellLocation gsmCellLocation = new GsmCellLocation();
                        gsmCellLocation.setLacAndCid((int) mTCellInfo.lac, (int) mTCellInfo.cid);
                        sb = new StringBuilder();
                        sb.append(mTCellInfo.lac);
                        sb.append("#");
                        sb.append(mTCellInfo.cid);
                        sb.append("#");
                        cellLocation = gsmCellLocation;
                    } else if (MTCellInfo.TYPE_CDMA.equals(mTCellInfo.radio_type)) {
                        CdmaCellLocation cdmaCellLocation = new CdmaCellLocation();
                        cdmaCellLocation.setCellLocationData((int) mTCellInfo.bid, 0, 0, (int) mTCellInfo.sid, (int) mTCellInfo.nid);
                        sb = new StringBuilder();
                        sb.append(mTCellInfo.bid);
                        sb.append("#");
                        sb.append(mTCellInfo.nid);
                        sb.append("#");
                        cellLocation = cdmaCellLocation;
                    } else if (MTCellInfo.TYPE_WCDMA.equals(mTCellInfo.radio_type) && Build.VERSION.SDK_INT >= 18 && valueOf.booleanValue()) {
                        sb = new StringBuilder();
                        sb.append(mTCellInfo.lac);
                        sb.append("#");
                        sb.append(mTCellInfo.cid);
                        sb.append("#");
                    } else if (MTCellInfo.TYPE_LTE.equals(mTCellInfo.radio_type) && valueOf.booleanValue()) {
                        sb = new StringBuilder();
                        sb.append(mTCellInfo.tac);
                        sb.append("#");
                        sb.append(mTCellInfo.ci);
                        sb.append("#");
                    } else if (MTCellInfo.TYPE_5G_NR.equals(mTCellInfo.radio_type) && Build.VERSION.SDK_INT >= 29 && valueOf.booleanValue()) {
                        sb = new StringBuilder();
                        sb.append(mTCellInfo.tac);
                        sb.append("#");
                        sb.append(mTCellInfo.nci);
                        sb.append("#");
                    } else if (MTCellInfo.TYPE_TDSCDMA.equals(mTCellInfo.radio_type) && valueOf.booleanValue()) {
                        sb = new StringBuilder();
                        sb.append(mTCellInfo.lac);
                        sb.append("#");
                        sb.append(mTCellInfo.cid);
                        sb.append("#");
                    }
                    str3 = sb.toString();
                    cellLocation = cellLocation;
                }
            } catch (Exception e) {
                LogUtils.a("get cellLocation exception: " + e.getMessage());
                sb2.append(z ? "MIX" : "CGI");
                return sb2.toString();
            }
        }
        if (cellLocation == null) {
            LogUtils.a("cellLocation is null");
        }
        try {
            str = strArr[0];
            str2 = strArr[1];
        } catch (Exception unused) {
            str = "0";
            str2 = "0";
        }
        sb2.append(str);
        sb2.append("#");
        sb2.append(str2);
        sb2.append("#");
        if (!valueOf.booleanValue()) {
            if (cellLocation instanceof GsmCellLocation) {
                GsmCellLocation gsmCellLocation2 = (GsmCellLocation) cellLocation;
                sb2.append(gsmCellLocation2.getLac());
                sb2.append("#");
                sb2.append(gsmCellLocation2.getCid());
                sb2.append("#");
            }
            if (cellLocation instanceof CdmaCellLocation) {
                CdmaCellLocation cdmaCellLocation2 = (CdmaCellLocation) cellLocation;
                sb2.append(cdmaCellLocation2.getSystemId());
                sb2.append("#");
                sb2.append(cdmaCellLocation2.getNetworkId());
                sb2.append("#");
                sb2.append(cdmaCellLocation2.getBaseStationId());
                sb2.append("#");
            }
        } else if (!TextUtils.isEmpty(str3)) {
            sb2.append(str2);
            sb2.append("#");
            sb2.append(str3);
        }
        sb2.append(z ? "MIX" : "CGI");
        return sb2.toString();
    }

    private boolean a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54168a221c1d3e67d1c72f33a6a73411", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54168a221c1d3e67d1c72f33a6a73411")).booleanValue();
        }
        if (this.f == 0 || mtLocation == null || mtLocation.getExtras() == null) {
            return false;
        }
        long j = mtLocation.getExtras().getLong(GearsLocator.TIME_GOT_LOCATION);
        boolean z = System.currentTimeMillis() - j > this.f;
        LogUtils.a("isOverCache:" + (System.currentTimeMillis() - j) + CommonConstant.Symbol.COMMA + this.f + ",origin time:" + j + ",time:" + mtLocation.getTime());
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.meituan.android.common.locate.MtLocation b(com.meituan.android.common.locate.locator.GearsLocator.b r13) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.cache.a.b(com.meituan.android.common.locate.locator.GearsLocator$b):com.meituan.android.common.locate.MtLocation");
    }

    private boolean b(GearsLocator.b bVar, final GearsLocator.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f429bc9f812b865ad240fa9359a8037", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f429bc9f812b865ad240fa9359a8037")).booleanValue();
        }
        if (aVar == null || aVar.a() == null) {
            LogUtils.a("GearsCache cache info is null return");
            return false;
        }
        LogUtils.a("GearsCache start store cache location");
        List<GearsLocator.a.C0214a> c = aVar.c();
        final String a = a((c == null || c.isEmpty()) ? false : true, aVar.d(), bVar.b());
        if (TextUtils.isEmpty(a)) {
            LogUtils.a("GearsCache cache key is empty return");
            return false;
        }
        ArrayList<GearsLocator.a> arrayList = this.h.get(a);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.h.put(a, arrayList);
        }
        if (arrayList.size() > 50) {
            arrayList.clear();
            this.e.a(a);
        }
        if (!a.endsWith("CGI")) {
            List<GearsLocator.a.C0214a> c2 = aVar.c();
            if (c2 != null && c2.size() < com.meituan.android.common.locate.reporter.b.a(this.b).a()) {
                LogUtils.a("GearsCache has less wifi,do not add,return");
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("post_cache_store", "less_wifi", "", ""));
                return false;
            } else if (c2 != null && c2.size() > 5 && aVar.a().getAccuracy() > com.meituan.android.common.locate.reporter.b.a(this.b).b()) {
                LogUtils.a("GearsCache has wifi,but accuracy > 300,do not add,return");
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("post_cache_store", "accuracy_300", "", ""));
                return false;
            }
        } else if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        arrayList.add(aVar);
        LogUtils.a("GearsCache addInfo");
        if (this.e != null) {
            g.a().a(new Runnable() { // from class: com.meituan.android.common.locate.cache.a.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "43d70adf7f419fd6f22f69b30f59571e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "43d70adf7f419fd6f22f69b30f59571e");
                        return;
                    }
                    LogUtils.a("addInfo");
                    a.this.e.a(aVar, a);
                }
            });
        }
        return true;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d529000b2016f05023aa2565b5f4212", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d529000b2016f05023aa2565b5f4212");
        } else if (this.h.size() >= 50) {
            this.h.clear();
            this.e.b();
        }
    }

    public MtLocation a(GearsLocator.b bVar) {
        MtLocation b;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5e44592202265374d0ee7b11ce49815", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5e44592202265374d0ee7b11ce49815");
        }
        synchronized (this.a) {
            b = b(bVar);
        }
        return b;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "799f1776f3599902231b67653d1857f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "799f1776f3599902231b67653d1857f3");
            return;
        }
        this.h = new ConcurrentHashMap<>();
        try {
            this.e = new d(this.b);
            g.a().a(new Runnable() { // from class: com.meituan.android.common.locate.cache.a.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "df0b4b622075d95a64bdb77402e3b511", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "df0b4b622075d95a64bdb77402e3b511");
                        return;
                    }
                    try {
                        try {
                            synchronized (a.this.a) {
                                if (a.this.e != null) {
                                    a.this.e.a();
                                    a.this.e.a(a.this.h);
                                    LogUtils.a("Gears load locations from database success");
                                }
                            }
                        } catch (Exception e) {
                            LogUtils.a(e);
                        }
                    } finally {
                        a.this.g = true;
                    }
                }
            });
        } catch (Exception e) {
            LogUtils.a(e);
        }
    }

    public boolean a(GearsLocator.b bVar, GearsLocator.a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce4266390f810499b4c3be898b095ef2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce4266390f810499b4c3be898b095ef2")).booleanValue();
        }
        synchronized (this.a) {
            if (this.h != null && this.g) {
                d();
                return b(bVar, aVar);
            }
            LogUtils.a("GearsCache db init exception return");
            return false;
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f9981603c706dd5223f81479ee2783b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f9981603c706dd5223f81479ee2783b");
        } else if (this.e != null) {
            synchronized (this.a) {
                this.e.d();
                LogUtils.a("Gears close database success");
            }
        }
    }

    public boolean c() {
        return this.g;
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onCollectConfigChange() {
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onLocateConfigChange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "024860e83e9a612612e2ab857d27a0c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "024860e83e9a612612e2ab857d27a0c5");
        } else {
            this.f = this.c.getLong("cache_overdue_time", 35L) * 60 * 1000;
        }
    }

    @Override // com.meituan.android.common.locate.reporter.f.a
    public void onTrackConfigChange() {
    }
}
