package com.facebook.react.modules.network;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l {
    private final CharsetDecoder a;
    private byte[] b = null;

    public l(Charset charset) {
        this.a = charset.newDecoder();
    }

    public final String a(byte[] bArr, int i) {
        if (this.b != null) {
            byte[] bArr2 = new byte[this.b.length + i];
            System.arraycopy(this.b, 0, bArr2, 0, this.b.length);
            System.arraycopy(bArr, 0, bArr2, this.b.length, i);
            i += this.b.length;
            bArr = bArr2;
        }
        boolean z = true;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        CharBuffer charBuffer = null;
        boolean z2 = false;
        int i2 = 0;
        while (!z2 && i2 < 4) {
            try {
                charBuffer = this.a.decode(wrap);
                z2 = true;
            } catch (CharacterCodingException unused) {
                i2++;
                wrap = ByteBuffer.wrap(bArr, 0, i - i2);
            }
        }
        if ((!z2 || i2 <= 0) ? false : false) {
            this.b = new byte[i2];
            System.arraycopy(bArr, i - i2, this.b, 0, i2);
        } else {
            this.b = null;
        }
        if (!z2) {
            com.facebook.common.logging.a.c("ReactNative", "failed to decode string from byte array");
            return "";
        }
        return new String(charBuffer.array(), 0, charBuffer.length());
    }
}
