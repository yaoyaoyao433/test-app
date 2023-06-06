package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.core.components.protocol.jce.sso.Header;
import com.tencent.mapsdk.core.components.protocol.jce.sso.Package;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class cq {
    private static Package a(byte[] bArr) throws Exception {
        Package r0 = new Package();
        m mVar = new m(bArr);
        mVar.a("utf-8");
        r0.readFrom(mVar);
        m mVar2 = new m(r0.head);
        Header header = new Header();
        header.readFrom(mVar2);
        if (header.stResult.iErrCode == 0) {
            return r0;
        }
        throw new Exception(header.stResult.strErrDesc);
    }

    private static Package a(p pVar, int i, String str) {
        pVar.display(new StringBuilder(), 0);
        Package r0 = new Package();
        r0.shVer = (short) 0;
        r0.eCmd = i;
        r0.strSubCmd = str;
        r0.iSeqNo = 0;
        r0.cEncodeType = (byte) 0;
        r0.sAppId = "0";
        r0.uin = "0";
        Header header = new Header();
        header.lCurrTime = System.currentTimeMillis();
        r0.head = header.toByteArray();
        r0.busiBuff = pVar.toByteArray("UTF-8");
        return r0;
    }
}
