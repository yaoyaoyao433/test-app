package com.meituan.android.quickpass.uptsm.common.base64;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PushbackInputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends e {
    public static ChangeQuickRedirect a;
    private static final char[] d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Constants.OBJECT_TYPE, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static final byte[] e = new byte[256];
    public byte[] b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b5357af67b7a85e8a873b6c0c68548c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b5357af67b7a85e8a873b6c0c68548c");
        } else {
            this.b = new byte[4];
        }
    }

    static {
        for (int i = 0; i < 255; i++) {
            e[i] = -1;
        }
        for (int i2 = 0; i2 < d.length; i2++) {
            e[d[i2]] = (byte) i2;
        }
    }

    @Override // com.meituan.android.quickpass.uptsm.common.base64.e
    public final void a(PushbackInputStream pushbackInputStream, OutputStream outputStream, int i) throws IOException {
        byte b;
        byte b2;
        byte b3;
        byte b4;
        int i2 = i;
        Object[] objArr = {pushbackInputStream, outputStream, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99639e710075d4fd5d2ca92f5faf82b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99639e710075d4fd5d2ca92f5faf82b5");
        } else if (i2 < 2) {
            throw new c("BASE64Decoder: Not enough bytes for an atom.");
        } else {
            while (true) {
                int read = pushbackInputStream.read();
                byte b5 = -1;
                if (read == -1) {
                    throw new d();
                }
                if (read != 10 && read != 13) {
                    this.b[0] = (byte) read;
                    if (a(pushbackInputStream, this.b, 1, i2 - 1) == -1) {
                        throw new d();
                    }
                    if (i2 > 3 && this.b[3] == 61) {
                        i2 = 3;
                    }
                    if (i2 > 2 && this.b[2] == 61) {
                        i2 = 2;
                    }
                    switch (i2) {
                        case 2:
                            b = -1;
                            b2 = e[this.b[1] & 255];
                            b3 = b;
                            b4 = b5;
                            b5 = e[this.b[0] & 255];
                            break;
                        case 4:
                            b5 = e[this.b[3] & 255];
                        case 3:
                            byte b6 = b5;
                            b5 = e[this.b[2] & 255];
                            b = b6;
                            b2 = e[this.b[1] & 255];
                            b3 = b;
                            b4 = b5;
                            b5 = e[this.b[0] & 255];
                            break;
                        default:
                            b4 = -1;
                            b2 = -1;
                            b3 = -1;
                            break;
                    }
                    switch (i2) {
                        case 2:
                            outputStream.write((byte) (((b5 << 2) & 252) | ((b2 >>> 4) & 3)));
                            return;
                        case 3:
                            outputStream.write((byte) (((b5 << 2) & 252) | ((b2 >>> 4) & 3)));
                            outputStream.write((byte) (((b4 >>> 2) & 15) | ((b2 << 4) & 240)));
                            return;
                        case 4:
                            outputStream.write((byte) (((b5 << 2) & 252) | ((b2 >>> 4) & 3)));
                            outputStream.write((byte) (((b2 << 4) & 240) | ((b4 >>> 2) & 15)));
                            outputStream.write((byte) (((b4 << 6) & 192) | (b3 & 63)));
                            return;
                        default:
                            return;
                    }
                }
            }
        }
    }
}
