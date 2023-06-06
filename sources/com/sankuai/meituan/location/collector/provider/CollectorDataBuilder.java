package com.sankuai.meituan.location.collector.provider;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.provider.m;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class CollectorDataBuilder {
    public static transient int VERSION_PARSE_COLLECTOR = 5;
    private static boolean batteryStatusIsCharging = false;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static String collectver = "uid def27";
    public transient String TAG;
    public short accu;
    public short altitude;
    public int apilevel;
    public String appname;
    public String appuid;
    public short bearing;
    public List<e> bles;
    public String brand;
    public transient m.a cellInfos;
    public List<k> cgi;
    public int cgiage;
    public int cginettype;
    public int cgiroaming;
    public int cgitype;
    public transient d collectInertialInfo;
    public transient h collectorGpsInfo;
    public transient m collectorWifiRadioCenter;
    public String devicename;
    public long devicestartedtime;
    public int gpsModelValue;
    public int gpsage;
    public int gpslat;
    public int gpslon;
    public int gpsstatus;
    public long gpstime;
    public boolean hasgps;
    public byte hassensordata;
    public int hdop;
    public String imeimeid;
    public String imsi;
    public boolean isCharge;
    public boolean ismock;
    public boolean isrooted;
    public boolean isvpn;
    public String mmacbssid;
    public String mmacssid;
    public String model;
    public int nettype;
    public String os_language;
    public int pdop;
    public int satenum;
    public String screenparam;
    public short sensor_gpsaltitude;
    public long sensor_gpstime;
    public int sensor_gpsx;
    public int sensor_gpsy;
    public byte sensor_magnetic_accu;
    public int sensor_magnetic_x;
    public int sensor_magnetic_y;
    public int sensor_magnetic_z;
    public byte sensor_pos;
    public byte sensor_screen_on;
    public int sensor_step_count;
    public int speed;
    public long systime;
    public int usedinfixnum;
    public String uuid;
    public int vdop;
    public int ver;
    public List<l> wifi;
    public transient m.b wifiInfos;
    public byte wifiage;
    public int wifinum;

    public CollectorDataBuilder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13b1f983ad01d997d6cda3cc0dd1a427", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13b1f983ad01d997d6cda3cc0dd1a427");
            return;
        }
        this.collectorWifiRadioCenter = null;
        this.wifiInfos = null;
        this.cellInfos = null;
        this.collectorGpsInfo = null;
        this.collectInertialInfo = null;
        this.TAG = "CollectorDataBuilder ";
        this.ver = VERSION_PARSE_COLLECTOR;
        this.gpstime = 0L;
        this.systime = 0L;
        this.imeimeid = "";
        this.imsi = "";
        this.uuid = null;
        this.apilevel = 0;
        this.model = null;
        this.appname = null;
        this.appuid = "uid def27";
        this.cgi = null;
        this.mmacbssid = null;
        this.mmacssid = null;
        this.wifi = null;
        this.wifinum = 0;
        this.wifiage = (byte) 0;
        this.hasgps = false;
        this.ismock = false;
        this.gpsage = 0;
        this.gpslon = 0;
        this.gpslat = 0;
        this.altitude = (short) 0;
        this.accu = (short) 0;
        this.speed = 0;
        this.bearing = (short) 0;
        this.hdop = 0;
        this.pdop = 0;
        this.vdop = 0;
        this.gpsstatus = 0;
        this.satenum = 0;
        this.usedinfixnum = 0;
        this.cgiroaming = 0;
        this.cgiage = 0;
        this.cgitype = 0;
        this.cginettype = 0;
        this.isvpn = false;
        this.nettype = 0;
        this.brand = Build.BRAND;
        this.isrooted = false;
        this.devicestartedtime = SystemClock.elapsedRealtime();
        this.sensor_screen_on = (byte) -1;
    }

    public static void a(boolean z) {
        batteryStatusIsCharging = z;
    }

    public final byte[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7db0d8e39bc80cc2b24ec04f4f1a4550", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7db0d8e39bc80cc2b24ec04f4f1a4550");
        }
        String a = a();
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(new JSONObject(a));
        } catch (JSONException e) {
            LogUtils.a(e.getMessage());
            LogUtils.a(getClass(), e);
        }
        try {
            return new f().a(jSONArray, this);
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0282, code lost:
        if (r3.getType() == 1) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.location.collector.provider.CollectorDataBuilder.a():java.lang.String");
    }

    public final void a(m mVar) {
        m.b bVar;
        String str;
        m.a aVar;
        String str2;
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18023952c59da506150cc9d42771a6bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18023952c59da506150cc9d42771a6bb");
        } else if (mVar == null) {
            LogUtils.a(this.TAG + "setCollectorWifiRadioCenter collectorWifiRadioCenter null");
        } else {
            this.collectorWifiRadioCenter = mVar;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = m.a;
            if (PatchProxy.isSupport(objArr2, mVar, changeQuickRedirect3, false, "a2407167bf91d13c60d2e1f2bae913c4", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (m.b) PatchProxy.accessDispatch(objArr2, mVar, changeQuickRedirect3, false, "a2407167bf91d13c60d2e1f2bae913c4");
            } else {
                if (SystemClock.elapsedRealtime() - mVar.e > 30000) {
                    LogUtils.a("CollectorWifiRadioCenter getWifiInfos timeout,refresh it");
                    mVar.b(false);
                    LogUtils.a("CollectorWifiRadioCenter getWifiInfos refresh ok");
                }
                bVar = mVar.b;
            }
            m.b bVar2 = bVar;
            Object[] objArr3 = {bVar2};
            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "58fed97a09e669fca23e491e663f5622", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "58fed97a09e669fca23e491e663f5622");
            } else {
                if (bVar2 == null) {
                    str = this.TAG + "setWifiInfos wifiInfos null";
                } else {
                    this.wifiInfos = bVar2;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = (elapsedRealtime - bVar2.c) / 1000;
                    LogUtils.a(this.TAG + "current：" + elapsedRealtime + "wifiInfos.wifiage:" + bVar2.c + " tempAge: " + j);
                    if (j < 0) {
                        j = 127;
                    }
                    if (j == 127 && com.sankuai.meituan.location.collector.b.c() != null) {
                        long j2 = com.meituan.android.common.locate.reporter.f.b().getLong("wifiAge", 0L);
                        if (j2 != 0) {
                            j = (elapsedRealtime - j2) / 1000;
                        }
                        LogUtils.a(this.TAG + "wifiage get by locate " + ((int) this.wifiage));
                    }
                    if (j < 0 || j >= 127) {
                        this.wifiage = Byte.MAX_VALUE;
                    } else {
                        this.wifiage = (byte) j;
                    }
                    str = this.TAG + "wifiage " + ((int) this.wifiage) + " current " + elapsedRealtime + " wifiInfos.wifiage " + bVar2.c + " Byte.MAX_VALUE 127";
                }
                LogUtils.a(str);
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = m.a;
            if (PatchProxy.isSupport(objArr4, mVar, changeQuickRedirect5, false, "7c8f1fd3d3d7935d1ab81834368b8b16", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (m.a) PatchProxy.accessDispatch(objArr4, mVar, changeQuickRedirect5, false, "7c8f1fd3d3d7935d1ab81834368b8b16");
            } else {
                if (SystemClock.elapsedRealtime() - mVar.d >= 100000) {
                    LogUtils.a("CollectorWifiRadioCenter getCellInfos timeout,refresh it");
                    mVar.a(false);
                    LogUtils.a("CollectorWifiRadioCenter getCellInfos refresh ok");
                }
                aVar = mVar.c;
            }
            m.a aVar2 = aVar;
            Object[] objArr5 = {aVar2};
            ChangeQuickRedirect changeQuickRedirect6 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "a0d800eb29a1fbbc8691ebbf358ae7aa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "a0d800eb29a1fbbc8691ebbf358ae7aa");
                return;
            }
            if (aVar2 == null) {
                str2 = this.TAG + "setCellInfos cellInfos null";
            } else {
                this.cellInfos = aVar2;
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                long j3 = (elapsedRealtime2 - aVar2.c) / 1000;
                this.cgiage = j3 > 127 ? Byte.MAX_VALUE : (byte) j3;
                if (this.cgiage == 127 && com.sankuai.meituan.location.collector.b.c() != null) {
                    long j4 = (elapsedRealtime2 - com.meituan.android.common.locate.reporter.f.b().getLong("cgiAge", 0L)) / 1000;
                    this.cgiage = j4 <= 127 ? (byte) j4 : Byte.MAX_VALUE;
                    LogUtils.a(this.TAG + "cgiage get by locate " + this.cgiage);
                }
                str2 = this.TAG + "cgiage " + this.cgiage + " current " + elapsedRealtime2 + " cellInfos.cgiage " + aVar2.c + " Byte.MAX_VALUE 127";
            }
            LogUtils.a(str2);
        }
    }
}
