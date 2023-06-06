package com.dianping.nvnetwork.tnold.zip.hpack;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k {
    public static ChangeQuickRedirect a;
    final byte[] b;
    private final int[] c;

    public k(int[] iArr, byte[] bArr) {
        Object[] objArr = {iArr, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14c16caaaa1dfccdcfa509ed0332bad9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14c16caaaa1dfccdcfa509ed0332bad9");
            return;
        }
        this.c = iArr;
        this.b = bArr;
    }

    public final void a(OutputStream outputStream, byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = 0;
        Object[] objArr = {outputStream, bArr, 0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01594d7d210342f2e70b36b62a2060d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01594d7d210342f2e70b36b62a2060d6");
        } else if (outputStream == null) {
            throw new NullPointerException("out");
        } else {
            if (bArr == null) {
                throw new NullPointerException("data");
            }
            if (i2 < 0 || (i3 = i2 + 0) < 0 || bArr.length < 0 || i3 > bArr.length) {
                throw new IndexOutOfBoundsException();
            }
            if (i2 == 0) {
                return;
            }
            long j = 0;
            byte b = 0;
            while (i4 < i2) {
                int i5 = 255 & bArr[i4 + 0];
                int i6 = this.c[i5];
                byte b2 = this.b[i5];
                j = (j << b2) | i6;
                int i7 = b + b2;
                while (i7 >= 8) {
                    i7 = (i7 == 1 ? 1 : 0) - 8;
                    outputStream.write((int) (j >> i7));
                }
                i4++;
                b = i7;
            }
            if (b > 0) {
                outputStream.write((int) ((255 >>> b) | (j << (8 - b))));
            }
        }
    }
}
