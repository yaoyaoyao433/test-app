package com.meituan.android.common.dfingerprint.network;
/* loaded from: classes2.dex */
public interface IResponseParser {
    boolean onError(int i, String str);

    boolean onResponse(int i, byte[] bArr, long j, int i2);
}
