package com.sankuai.meituan.mtlive.ugc.library.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTAudioFrame {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ByteBuffer mByteBuffer;
    private int mLength;

    public ByteBuffer getByteBuffer() {
        return this.mByteBuffer;
    }

    public void setByteBuffer(ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
    }

    public int getLength() {
        return this.mLength;
    }

    public void setLength(int i) {
        this.mLength = i;
    }
}
