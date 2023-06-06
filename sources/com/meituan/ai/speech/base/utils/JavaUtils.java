package com.meituan.ai.speech.base.utils;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class JavaUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Keep
    public static byte[] toByteArray(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4c23845f678d2f92fdba6f151befd3c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4c23845f678d2f92fdba6f151befd3c2");
        }
        byte[] bArr = new byte[2];
        for (int i = 0; i < 2; i++) {
            bArr[i] = (byte) (s & 255);
            s = (short) (s >> 8);
        }
        return bArr;
    }

    @Keep
    public static byte[] toByteArray(short[] sArr) {
        Object[] objArr = {sArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f28646c025469990bc66b3c506ba85a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f28646c025469990bc66b3c506ba85a4");
        }
        byte[] bArr = new byte[sArr.length * 2];
        for (int i = 0; i < sArr.length; i++) {
            byte[] byteArray = toByteArray(sArr[i]);
            int i2 = i * 2;
            bArr[i2] = byteArray[0];
            bArr[i2 + 1] = byteArray[1];
        }
        return bArr;
    }

    @Keep
    public static short[] toShortArray(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a94636e9875a0cbd048e86dd003cc02f", RobustBitConfig.DEFAULT_VALUE)) {
            return (short[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a94636e9875a0cbd048e86dd003cc02f");
        }
        if (bArr == null) {
            return null;
        }
        short[] sArr = new short[bArr.length / 2];
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
        return sArr;
    }
}
