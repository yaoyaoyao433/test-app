package com.tencent.mapsdk.core.components.protocol.jce.conf;

import com.qq.taf.jce.a;
import com.tencent.mapsdk.internal.m;
import com.tencent.mapsdk.internal.n;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class FileUpdateReq extends a {
    public int iVersion;
    public String sMd5;
    public String sName;

    @Override // com.tencent.mapsdk.internal.p
    public final String className() {
        return "MapConfProtocol.FileUpdateReq";
    }

    public FileUpdateReq() {
        this.sName = "";
        this.iVersion = 0;
        this.sMd5 = "";
    }

    public FileUpdateReq(String str, int i, String str2) {
        this.sName = "";
        this.iVersion = 0;
        this.sMd5 = "";
        this.sName = str;
        this.iVersion = i;
        this.sMd5 = str2;
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(n nVar) {
        nVar.a(this.sName, 0);
        nVar.a(this.iVersion, 1);
        if (this.sMd5 != null) {
            nVar.a(this.sMd5, 2);
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(m mVar) {
        this.sName = mVar.b(0, true);
        this.iVersion = mVar.a(this.iVersion, 1, true);
        this.sMd5 = mVar.b(2, false);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("FileUpdateReq{");
        stringBuffer.append("sName='");
        stringBuffer.append(this.sName);
        stringBuffer.append('\'');
        stringBuffer.append(", iVersion=");
        stringBuffer.append(this.iVersion);
        stringBuffer.append(", sMd5='");
        stringBuffer.append(this.sMd5);
        stringBuffer.append('\'');
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
