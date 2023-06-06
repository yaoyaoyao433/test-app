package com.meituan.android.yoda.xxtea;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.p;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Constants.OBJECT_TYPE, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static final byte[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, p.ZERO_TAG, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    public static String a(byte[] bArr) {
        int i = 0;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15529586aa7d0316c317565372cefbcf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15529586aa7d0316c317565372cefbcf");
        }
        StringBuilder sb = new StringBuilder();
        int length = bArr.length % 3;
        int length2 = bArr.length - length;
        while (i < length2) {
            int i2 = i + 1;
            int i3 = i2 + 1;
            i = i3 + 1;
            int i4 = ((bArr[i2] & 255) << 8) | ((bArr[i] & 255) << 16) | (bArr[i3] & 255);
            sb.append(b[i4 >> 18]);
            sb.append(b[(i4 >> 12) & 63]);
            sb.append(b[(i4 >> 6) & 63]);
            sb.append(b[i4 & 63]);
        }
        if (length == 1) {
            int i5 = bArr[i] & 255;
            sb.append(b[i5 >> 2]);
            sb.append(b[(i5 & 3) << 4]);
            sb.append("==");
        } else if (length == 2) {
            int i6 = (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
            sb.append(b[i6 >> 10]);
            sb.append(b[(i6 >> 4) & 63]);
            sb.append(b[(i6 & 15) << 2]);
            sb.append("=");
        }
        return sb.toString();
    }
}
