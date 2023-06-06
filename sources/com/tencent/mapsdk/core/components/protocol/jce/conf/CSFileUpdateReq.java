package com.tencent.mapsdk.core.components.protocol.jce.conf;

import com.qq.taf.jce.a;
import com.tencent.mapsdk.internal.m;
import com.tencent.mapsdk.internal.n;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class CSFileUpdateReq extends a {
    static ArrayList<FileUpdateReq> a = new ArrayList<>();
    public String sAppId;
    public String sCity;
    public String sEngineVersion;
    public String sId;
    public String sSDKVersion;
    public ArrayList<FileUpdateReq> vItems;

    @Override // com.tencent.mapsdk.internal.p
    public final String className() {
        return "MapConfProtocol.CSFileUpdateReq";
    }

    public CSFileUpdateReq() {
        this.vItems = null;
        this.sAppId = "";
        this.sSDKVersion = "";
        this.sCity = "";
        this.sEngineVersion = "";
        this.sId = "";
    }

    public CSFileUpdateReq(ArrayList<FileUpdateReq> arrayList, String str, String str2, String str3, String str4, String str5) {
        this.vItems = null;
        this.sAppId = "";
        this.sSDKVersion = "";
        this.sCity = "";
        this.sEngineVersion = "";
        this.sId = "";
        this.vItems = arrayList;
        this.sAppId = str;
        this.sSDKVersion = str2;
        this.sCity = str3;
        this.sEngineVersion = str4;
        this.sId = str5;
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(n nVar) {
        nVar.a((Collection) this.vItems, 0);
        if (this.sAppId != null) {
            nVar.a(this.sAppId, 1);
        }
        if (this.sSDKVersion != null) {
            nVar.a(this.sSDKVersion, 2);
        }
        if (this.sCity != null) {
            nVar.a(this.sCity, 3);
        }
        if (this.sEngineVersion != null) {
            nVar.a(this.sEngineVersion, 4);
        }
        if (this.sId != null) {
            nVar.a(this.sId, 5);
        }
    }

    static {
        a.add(new FileUpdateReq());
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(m mVar) {
        this.vItems = (ArrayList) mVar.a((m) a, 0, true);
        this.sAppId = mVar.b(1, false);
        this.sSDKVersion = mVar.b(2, false);
        this.sCity = mVar.b(3, false);
        this.sEngineVersion = mVar.b(4, false);
        this.sId = mVar.b(5, false);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("CSFileUpdateReq{");
        stringBuffer.append("vItems=");
        stringBuffer.append(this.vItems);
        stringBuffer.append(", sAppId='");
        stringBuffer.append(this.sAppId);
        stringBuffer.append('\'');
        stringBuffer.append(", sSDKVersion='");
        stringBuffer.append(this.sSDKVersion);
        stringBuffer.append('\'');
        stringBuffer.append(", sCity='");
        stringBuffer.append(this.sCity);
        stringBuffer.append('\'');
        stringBuffer.append(", sEngineVersion='");
        stringBuffer.append(this.sEngineVersion);
        stringBuffer.append('\'');
        stringBuffer.append(", sId='");
        stringBuffer.append(this.sId);
        stringBuffer.append('\'');
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
