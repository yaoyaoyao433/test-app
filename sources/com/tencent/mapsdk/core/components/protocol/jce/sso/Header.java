package com.tencent.mapsdk.core.components.protocol.jce.sso;

import com.qq.taf.jce.a;
import com.tencent.mapsdk.internal.k;
import com.tencent.mapsdk.internal.m;
import com.tencent.mapsdk.internal.n;
import com.tencent.mapsdk.internal.p;
import com.tencent.mapsdk.internal.q;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class Header extends a implements Cloneable {
    static CmdResult a;
    static final /* synthetic */ boolean b = !Header.class.desiredAssertionStatus();
    public long lCurrTime;
    public CmdResult stResult;
    public String strChannel;
    public String strFr;
    public String strImei;
    public String strImsi;
    public String strLC;
    public String strMachineModel;
    public String strMobver;
    public String strNettp;
    public String strOfflineVersion;
    public String strOsVersion;
    public String strPf;
    public String strSessionId;
    public String strSoftVersion;
    public String strToken;
    public String strUserNetType;
    public long uAccIp;

    @Override // com.tencent.mapsdk.internal.p
    public final String className() {
        return "sosomap.Header";
    }

    public Header() {
        this.lCurrTime = 0L;
        this.stResult = null;
        this.uAccIp = 0L;
        this.strSessionId = "";
        this.strLC = "";
        this.strToken = "";
        this.strFr = "";
        this.strPf = "";
        this.strImei = "";
        this.strMobver = "";
        this.strNettp = "";
        this.strImsi = "";
        this.strOsVersion = "";
        this.strSoftVersion = "";
        this.strOfflineVersion = "";
        this.strChannel = "";
        this.strMachineModel = "";
        this.strUserNetType = "";
    }

    public Header(long j, CmdResult cmdResult, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.lCurrTime = 0L;
        this.stResult = null;
        this.uAccIp = 0L;
        this.strSessionId = "";
        this.strLC = "";
        this.strToken = "";
        this.strFr = "";
        this.strPf = "";
        this.strImei = "";
        this.strMobver = "";
        this.strNettp = "";
        this.strImsi = "";
        this.strOsVersion = "";
        this.strSoftVersion = "";
        this.strOfflineVersion = "";
        this.strChannel = "";
        this.strMachineModel = "";
        this.strUserNetType = "";
        this.lCurrTime = j;
        this.stResult = cmdResult;
        this.uAccIp = j2;
        this.strSessionId = str;
        this.strLC = str2;
        this.strToken = str3;
        this.strFr = str4;
        this.strPf = str5;
        this.strImei = str6;
        this.strMobver = str7;
        this.strNettp = str8;
        this.strImsi = str9;
        this.strOsVersion = str10;
        this.strSoftVersion = str11;
        this.strOfflineVersion = str12;
        this.strChannel = str13;
        this.strMachineModel = str14;
        this.strUserNetType = str15;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Header header = (Header) obj;
        return q.a(this.lCurrTime, header.lCurrTime) && q.a(this.stResult, header.stResult) && q.a(this.uAccIp, header.uAccIp) && q.a((Object) this.strSessionId, (Object) header.strSessionId) && q.a((Object) this.strLC, (Object) header.strLC) && q.a((Object) this.strToken, (Object) header.strToken) && q.a((Object) this.strFr, (Object) header.strFr) && q.a((Object) this.strPf, (Object) header.strPf) && q.a((Object) this.strImei, (Object) header.strImei) && q.a((Object) this.strMobver, (Object) header.strMobver) && q.a((Object) this.strNettp, (Object) header.strNettp) && q.a((Object) this.strImsi, (Object) header.strImsi) && q.a((Object) this.strOsVersion, (Object) header.strOsVersion) && q.a((Object) this.strSoftVersion, (Object) header.strSoftVersion) && q.a((Object) this.strOfflineVersion, (Object) header.strOfflineVersion) && q.a((Object) this.strChannel, (Object) header.strChannel) && q.a((Object) this.strMachineModel, (Object) header.strMachineModel) && q.a((Object) this.strUserNetType, (Object) header.strUserNetType);
    }

    public final int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (b) {
                return null;
            }
            throw new AssertionError();
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(n nVar) {
        nVar.a(this.lCurrTime, 0);
        if (this.stResult != null) {
            nVar.a((p) this.stResult, 1);
        }
        nVar.a(this.uAccIp, 2);
        if (this.strSessionId != null) {
            nVar.a(this.strSessionId, 3);
        }
        if (this.strLC != null) {
            nVar.a(this.strLC, 4);
        }
        if (this.strToken != null) {
            nVar.a(this.strToken, 5);
        }
        if (this.strFr != null) {
            nVar.a(this.strFr, 6);
        }
        if (this.strPf != null) {
            nVar.a(this.strPf, 7);
        }
        if (this.strImei != null) {
            nVar.a(this.strImei, 8);
        }
        if (this.strMobver != null) {
            nVar.a(this.strMobver, 9);
        }
        if (this.strNettp != null) {
            nVar.a(this.strNettp, 10);
        }
        if (this.strImsi != null) {
            nVar.a(this.strImsi, 11);
        }
        if (this.strOsVersion != null) {
            nVar.a(this.strOsVersion, 12);
        }
        if (this.strSoftVersion != null) {
            nVar.a(this.strSoftVersion, 13);
        }
        if (this.strOfflineVersion != null) {
            nVar.a(this.strOfflineVersion, 14);
        }
        if (this.strChannel != null) {
            nVar.a(this.strChannel, 15);
        }
        if (this.strMachineModel != null) {
            nVar.a(this.strMachineModel, 16);
        }
        if (this.strUserNetType != null) {
            nVar.a(this.strUserNetType, 17);
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(m mVar) {
        this.lCurrTime = mVar.a(this.lCurrTime, 0, true);
        if (a == null) {
            a = new CmdResult();
        }
        this.stResult = (CmdResult) mVar.a((p) a, 1, false);
        this.uAccIp = mVar.a(this.uAccIp, 2, false);
        this.strSessionId = mVar.b(3, false);
        this.strLC = mVar.b(4, false);
        this.strToken = mVar.b(5, false);
        this.strFr = mVar.b(6, false);
        this.strPf = mVar.b(7, false);
        this.strImei = mVar.b(8, false);
        this.strMobver = mVar.b(9, false);
        this.strNettp = mVar.b(10, false);
        this.strImsi = mVar.b(11, false);
        this.strOsVersion = mVar.b(12, false);
        this.strSoftVersion = mVar.b(13, false);
        this.strOfflineVersion = mVar.b(14, false);
        this.strChannel = mVar.b(15, false);
        this.strMachineModel = mVar.b(16, false);
        this.strUserNetType = mVar.b(17, false);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void display(StringBuilder sb, int i) {
        k kVar = new k(sb, i);
        kVar.a(this.lCurrTime, "lCurrTime");
        kVar.a((p) this.stResult, "stResult");
        kVar.a(this.uAccIp, "uAccIp");
        kVar.a(this.strSessionId, "strSessionId");
        kVar.a(this.strLC, "strLC");
        kVar.a(this.strToken, "strToken");
        kVar.a(this.strFr, "strFr");
        kVar.a(this.strPf, "strPf");
        kVar.a(this.strImei, "strImei");
        kVar.a(this.strMobver, "strMobver");
        kVar.a(this.strNettp, "strNettp");
        kVar.a(this.strImsi, "strImsi");
        kVar.a(this.strOsVersion, "strOsVersion");
        kVar.a(this.strSoftVersion, "strSoftVersion");
        kVar.a(this.strOfflineVersion, "strOfflineVersion");
        kVar.a(this.strChannel, "strChannel");
        kVar.a(this.strMachineModel, "strMachineModel");
        kVar.a(this.strUserNetType, "strUserNetType");
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void displaySimple(StringBuilder sb, int i) {
        k kVar = new k(sb, i);
        kVar.a(this.lCurrTime, true);
        kVar.a((p) this.stResult, true);
        kVar.a(this.uAccIp, true);
        kVar.a(this.strSessionId, true);
        kVar.a(this.strLC, true);
        kVar.a(this.strToken, true);
        kVar.a(this.strFr, true);
        kVar.a(this.strPf, true);
        kVar.a(this.strImei, true);
        kVar.a(this.strMobver, true);
        kVar.a(this.strNettp, true);
        kVar.a(this.strImsi, true);
        kVar.a(this.strOsVersion, true);
        kVar.a(this.strSoftVersion, true);
        kVar.a(this.strOfflineVersion, true);
        kVar.a(this.strChannel, true);
        kVar.a(this.strMachineModel, true);
        kVar.a(this.strUserNetType, false);
    }
}
