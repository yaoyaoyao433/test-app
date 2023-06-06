package com.meituan.android.quickpass.uptsm.common.base64;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends f {
    public static ChangeQuickRedirect a;
    private static final char[] d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Constants.OBJECT_TYPE, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    @Override // com.meituan.android.quickpass.uptsm.common.base64.f
    public final void a(OutputStream outputStream, byte[] bArr, int i, int i2) throws IOException {
        Object[] objArr = {outputStream, bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10d93681dd91fad3192ad3df082f4daf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10d93681dd91fad3192ad3df082f4daf");
        } else if (i2 == 1) {
            byte b = bArr[i];
            outputStream.write(d[(b >>> 2) & 63]);
            outputStream.write(d[((b << 4) & 48) + 0]);
            outputStream.write(61);
            outputStream.write(61);
        } else if (i2 == 2) {
            byte b2 = bArr[i];
            byte b3 = bArr[i + 1];
            outputStream.write(d[(b2 >>> 2) & 63]);
            outputStream.write(d[((b2 << 4) & 48) + ((b3 >>> 4) & 15)]);
            outputStream.write(d[((b3 << 2) & 60) + 0]);
            outputStream.write(61);
        } else {
            byte b4 = bArr[i];
            byte b5 = bArr[i + 1];
            byte b6 = bArr[i + 2];
            outputStream.write(d[(b4 >>> 2) & 63]);
            outputStream.write(d[((b4 << 4) & 48) + ((b5 >>> 4) & 15)]);
            outputStream.write(d[((b5 << 2) & 60) + ((b6 >>> 6) & 3)]);
            outputStream.write(d[b6 & 63]);
        }
    }
}
