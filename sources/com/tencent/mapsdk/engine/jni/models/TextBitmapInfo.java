package com.tencent.mapsdk.engine.jni.models;

import android.support.annotation.Keep;
import com.tencent.mapsdk.internal.mc;
import java.util.Arrays;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class TextBitmapInfo {
    public boolean bold;
    public float density;
    public int height;
    byte[] mData = new byte[4];
    public int pitch;
    public int width;

    public void fill(byte[] bArr) {
        Arrays.fill(this.mData, (byte) 0);
        System.arraycopy(bArr, 0, this.mData, 0, 4);
        this.density = Float.intBitsToFloat(mc.a(this.mData));
        System.arraycopy(bArr, 4, this.mData, 0, 4);
        this.width = mc.a(this.mData);
        System.arraycopy(bArr, 8, this.mData, 0, 4);
        this.height = mc.a(this.mData);
        System.arraycopy(bArr, 12, this.mData, 0, 4);
        this.pitch = mc.a(this.mData);
        System.arraycopy(bArr, 16, this.mData, 0, 1);
        this.bold = this.mData[0] > 0;
    }
}
