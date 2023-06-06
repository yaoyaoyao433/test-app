package io.agora.rtc.internal;

import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public interface IMarshallable {
    void marshall(ByteBuffer byteBuffer);

    byte[] marshall();

    void unmarshall(ByteBuffer byteBuffer);

    void unmarshall(byte[] bArr);
}
