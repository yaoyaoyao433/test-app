package com.tencent.mm.opensdk.diffdev;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface OAuthListener {
    void onAuthFinish(OAuthErrCode oAuthErrCode, String str);

    void onAuthGotQrcode(String str, byte[] bArr);

    void onQrcodeScanned();
}
