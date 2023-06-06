package com.meituan.android.quickpass.uptsm.common.base64;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class f {
    public static ChangeQuickRedirect b;
    protected PrintStream c;

    public abstract void a(OutputStream outputStream, byte[] bArr, int i, int i2) throws IOException;

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        Object[] objArr = {inputStream, bArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7788e206073e0de56f997212aa228ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7788e206073e0de56f997212aa228ef")).intValue();
        }
        for (int i = 0; i < bArr.length; i++) {
            int read = inputStream.read();
            if (read == -1) {
                return i;
            }
            bArr[i] = (byte) read;
        }
        return bArr.length;
    }

    private void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i = 1;
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc08eb2024549b7939164782d7e9e3cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc08eb2024549b7939164782d7e9e3cc");
            return;
        }
        byte[] bArr = new byte[57];
        Object[] objArr2 = {outputStream};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "badf0b5db625a6a185a02ae942951301", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "badf0b5db625a6a185a02ae942951301");
        } else {
            this.c = new PrintStream(outputStream);
        }
        while (true) {
            int a = a(inputStream, bArr);
            if (a == 0) {
                return;
            }
            int i2 = 0;
            while (i2 < a) {
                int i3 = i2 + 3;
                if (i3 <= a) {
                    a(outputStream, bArr, i2, 3);
                } else {
                    a(outputStream, bArr, i2, a - i2);
                }
                i2 = i3;
            }
            Object[] objArr3 = new Object[i];
            objArr3[0] = outputStream;
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "11b78e27cbd935be4a27c7b326f86550", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "11b78e27cbd935be4a27c7b326f86550");
            } else {
                this.c.println();
            }
            if (a < 57) {
                return;
            }
            i = 1;
        }
    }

    public final String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0e6307a5609bccb2ca29eb3a93ce2c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0e6307a5609bccb2ca29eb3a93ce2c1");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(new ByteArrayInputStream(bArr), byteArrayOutputStream);
            return byteArrayOutputStream.toString();
        } catch (Exception unused) {
            throw new Error("CharacterEncoder.encodeBuffer internal error");
        }
    }
}
