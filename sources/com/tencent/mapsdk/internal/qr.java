package com.tencent.mapsdk.internal;

import com.meituan.robust.resource.APKStructure;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.jce.rtt.RttResponse;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qr extends le {
    private static final int a = 3;
    private static qr b;

    public static synchronized qr c() {
        qr qrVar;
        synchronized (qr.class) {
            if (b == null) {
                b = new qr();
            }
            qrVar = b;
        }
        return qrVar;
    }

    @Override // com.tencent.mapsdk.internal.le
    public final byte[] a(byte[] bArr) {
        RttResponse b2;
        if (bArr != null) {
            try {
                if (bArr.length == 0 || (b2 = b(bArr)) == null) {
                    return null;
                }
                return b2.result;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    private static RttResponse b(byte[] bArr) {
        for (int i = 0; i < 3; i++) {
            try {
                NetResponse rttData = ((cy) ((dm) ck.a(dm.class)).h()).rttData(bArr);
                if (rttData != null && rttData.data != null) {
                    f fVar = new f();
                    fVar.a("UTF-8");
                    fVar.a(rttData.data);
                    return (RttResponse) fVar.b(APKStructure.Res_Type, true, (ClassLoader) null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static byte[] a(RttResponse rttResponse) {
        if (rttResponse == null) {
            return null;
        }
        return rttResponse.result;
    }
}
