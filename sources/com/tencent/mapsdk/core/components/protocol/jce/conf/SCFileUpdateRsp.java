package com.tencent.mapsdk.core.components.protocol.jce.conf;

import com.qq.taf.jce.a;
import com.tencent.mapsdk.internal.m;
import com.tencent.mapsdk.internal.n;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class SCFileUpdateRsp extends a {
    static ArrayList<FileUpdateRsp> a = new ArrayList<>();
    public int iRet;
    public ArrayList<FileUpdateRsp> vItems;

    @Override // com.tencent.mapsdk.internal.p
    public final String className() {
        return "MapConfProtocol.SCFileUpdateRsp";
    }

    public SCFileUpdateRsp() {
        this.iRet = 0;
        this.vItems = null;
    }

    public SCFileUpdateRsp(int i, ArrayList<FileUpdateRsp> arrayList) {
        this.iRet = 0;
        this.vItems = null;
        this.iRet = i;
        this.vItems = arrayList;
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(n nVar) {
        nVar.a(this.iRet, 0);
        if (this.vItems != null) {
            nVar.a((Collection) this.vItems, 1);
        }
    }

    static {
        a.add(new FileUpdateRsp());
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(m mVar) {
        this.iRet = mVar.a(this.iRet, 0, true);
        this.vItems = (ArrayList) mVar.a((m) a, 1, false);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("SCFileUpdateRsp{");
        stringBuffer.append("iRet=");
        stringBuffer.append(this.iRet);
        stringBuffer.append(", vItems=");
        stringBuffer.append(this.vItems);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
