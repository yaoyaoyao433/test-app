package com.meituan.network;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class SharkCommonProfile {
    public static ChangeQuickRedirect changeQuickRedirect;
    public SharkParam sharkProfile;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class SharkParam {
        public static ChangeQuickRedirect changeQuickRedirect;
        public double bandwidthDelayProduct;
        public double httpRtt;
        public double receivedBytedCount;
        public double requestCompressInterval;
        public double requestEncryptInterval;
        public double requestInterval;
        public double responseDecompressInterval;
        public double responseDecryptInterval;
        public double responseInterval;
        public double rtt;
        public double sendBytesCount;
        public double sharkServerForwardInterval;
        public double tcpRtt;
        public double throughput;
    }
}
