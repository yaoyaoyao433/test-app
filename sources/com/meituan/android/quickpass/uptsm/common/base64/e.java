package com.meituan.android.quickpass.uptsm.common.base64;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class e {
    public static ChangeQuickRedirect c;

    public void a(PushbackInputStream pushbackInputStream, OutputStream outputStream, int i) throws IOException {
        Object[] objArr = {pushbackInputStream, outputStream, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a271cd17a7b2d0f85c52ba8fb507f56d", RobustBitConfig.DEFAULT_VALUE)) {
            throw new d();
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a271cd17a7b2d0f85c52ba8fb507f56d");
    }

    public final int a(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        Object[] objArr = {inputStream, bArr, 1, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e27569767c4c683968cf55fb5115c89", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e27569767c4c683968cf55fb5115c89")).intValue();
        }
        while (i3 < i2) {
            int read = inputStream.read();
            if (read == -1) {
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            i3++;
            bArr[i3] = (byte) read;
        }
        return i2;
    }

    public final void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i;
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "833b0456bfdfa18cd9f49cdb961fed12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "833b0456bfdfa18cd9f49cdb961fed12");
            return;
        }
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream);
        while (true) {
            try {
                Object[] objArr2 = {pushbackInputStream, outputStream};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                int intValue = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "461519509de38f5164695f75d0d3daad", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "461519509de38f5164695f75d0d3daad")).intValue() : 72;
                int i2 = 0;
                while (true) {
                    i = i2 + 4;
                    if (i >= intValue) {
                        break;
                    }
                    a(pushbackInputStream, outputStream, 4);
                    i2 = i;
                }
                if (i == intValue) {
                    a(pushbackInputStream, outputStream, 4);
                } else {
                    a(pushbackInputStream, outputStream, intValue - i2);
                }
            } catch (d unused) {
                return;
            }
        }
    }
}
