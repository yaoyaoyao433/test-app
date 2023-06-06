package com.google.zxing.datamatrix.encoder;

import io.agora.rtc.Constants;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d extends k {
    @Override // com.google.zxing.datamatrix.encoder.k
    public final int a() {
        return 10;
    }

    @Override // com.google.zxing.datamatrix.encoder.k
    public final int a(int i) {
        return i <= 8 ? Constants.ERR_PUBLISH_STREAM_FORMAT_NOT_SUPPORTED : Constants.ERR_PUBLISH_STREAM_NOT_FOUND;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        super(false, 1558, 620, 22, 22, 36, -1, 62);
    }
}
