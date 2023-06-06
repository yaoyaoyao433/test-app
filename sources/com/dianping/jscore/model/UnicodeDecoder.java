package com.dianping.jscore.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class UnicodeDecoder extends CharsetDecoder {
    protected static final int BIG = 1;
    protected static final char BYTE_ORDER_MARK = 65279;
    protected static final int LITTLE = 2;
    protected static final int NONE = 0;
    protected static final char REVERSED_MARK = 65534;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int currentByteOrder;
    private int defaultByteOrder;
    private final int expectedByteOrder;

    public UnicodeDecoder(Charset charset, int i) {
        super(charset, 0.5f, 1.0f);
        Object[] objArr = {charset, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1d50d6a291553b83bc0a2b9edb2655d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1d50d6a291553b83bc0a2b9edb2655d");
            return;
        }
        this.defaultByteOrder = 1;
        this.currentByteOrder = i;
        this.expectedByteOrder = i;
    }

    public UnicodeDecoder(Charset charset, int i, int i2) {
        this(charset, i);
        Object[] objArr = {charset, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c763e95e3bf8c269a3708ff086ca28a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c763e95e3bf8c269a3708ff086ca28a");
        } else {
            this.defaultByteOrder = i2;
        }
    }

    private char decode(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1612b78d93657bc6d5f58c500f58e30a", RobustBitConfig.DEFAULT_VALUE) ? ((Character) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1612b78d93657bc6d5f58c500f58e30a")).charValue() : this.currentByteOrder == 1 ? (char) ((i << 8) | i2) : (char) (i | (i2 << 8));
    }

    @Override // java.nio.charset.CharsetDecoder
    public CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        Object[] objArr = {byteBuffer, charBuffer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff3dd1920ade35044ddae6048bd4eb15", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoderResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff3dd1920ade35044ddae6048bd4eb15");
        }
        int position = byteBuffer.position();
        while (byteBuffer.remaining() > 1) {
            try {
                int i = byteBuffer.get() & 255;
                int i2 = byteBuffer.get() & 255;
                if (this.currentByteOrder == 0) {
                    char c = (char) ((i << 8) | i2);
                    if (c == 65279) {
                        this.currentByteOrder = 1;
                        position += 2;
                    } else if (c == 65534) {
                        this.currentByteOrder = 2;
                        position += 2;
                    } else {
                        this.currentByteOrder = this.defaultByteOrder;
                    }
                }
                char decode = decode(i, i2);
                if (decode == 65534) {
                    return CoderResult.malformedForLength(2);
                }
                if (Character.isSurrogate(decode)) {
                    if (!Character.isHighSurrogate(decode)) {
                        return CoderResult.malformedForLength(2);
                    }
                    if (byteBuffer.remaining() < 2) {
                        return CoderResult.UNDERFLOW;
                    }
                    char decode2 = decode(byteBuffer.get() & 255, byteBuffer.get() & 255);
                    if (!Character.isLowSurrogate(decode2)) {
                        return CoderResult.malformedForLength(4);
                    }
                    if (charBuffer.remaining() < 2) {
                        return CoderResult.OVERFLOW;
                    }
                    position += 4;
                    charBuffer.put(decode);
                    charBuffer.put(decode2);
                } else if (!charBuffer.hasRemaining()) {
                    return CoderResult.OVERFLOW;
                } else {
                    position += 2;
                    charBuffer.put(decode);
                }
            } finally {
                byteBuffer.position(position);
            }
        }
        return CoderResult.UNDERFLOW;
    }

    @Override // java.nio.charset.CharsetDecoder
    public void implReset() {
        this.currentByteOrder = this.expectedByteOrder;
    }
}
