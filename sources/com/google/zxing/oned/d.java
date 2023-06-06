package com.google.zxing.oned;

import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d extends m {
    @Override // com.google.zxing.oned.m, com.google.zxing.g
    public final com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i, int i2, Map<com.google.zxing.c, ?> map) throws com.google.zxing.h {
        if (aVar != com.google.zxing.a.CODE_128) {
            throw new IllegalArgumentException("Can only encode CODE_128, but got " + aVar);
        }
        return super.a(str, aVar, i, i2, map);
    }

    @Override // com.google.zxing.oned.m
    public final boolean[] a(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got " + length);
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < ' ' || charAt > '~') {
                switch (charAt) {
                    case TbsListener.ErrorCode.TPATCH_BACKUP_NOT_VALID /* 241 */:
                    case TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION /* 242 */:
                    case TbsListener.ErrorCode.DOWNLOAD_FAILED_FOR_PREINIT_CALLBACK /* 243 */:
                    case 244:
                        break;
                    default:
                        throw new IllegalArgumentException("Bad character in input: " + charAt);
                }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i3 < length) {
            int i7 = 100;
            int i8 = a(str, i3, i4 == 99 ? 2 : 4) ? 99 : 100;
            if (i8 == i4) {
                switch (str.charAt(i3)) {
                    case TbsListener.ErrorCode.TPATCH_BACKUP_NOT_VALID /* 241 */:
                        i7 = 102;
                        break;
                    case TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION /* 242 */:
                        i7 = 97;
                        break;
                    case TbsListener.ErrorCode.DOWNLOAD_FAILED_FOR_PREINIT_CALLBACK /* 243 */:
                        i7 = 96;
                        break;
                    case 244:
                        break;
                    default:
                        if (i4 != 100) {
                            i7 = Integer.parseInt(str.substring(i3, i3 + 2));
                            i3++;
                            break;
                        } else {
                            i7 = str.charAt(i3) - ' ';
                            break;
                        }
                }
                i3++;
            } else {
                i7 = i4 == 0 ? i8 == 100 ? 104 : 105 : i8;
                i4 = i8;
            }
            arrayList.add(c.a[i7]);
            i5 += i7 * i6;
            if (i3 != 0) {
                i6++;
            }
        }
        arrayList.add(c.a[i5 % 103]);
        arrayList.add(c.a[106]);
        int i9 = 0;
        for (int[] iArr : arrayList) {
            int i10 = i9;
            for (int i11 : iArr) {
                i10 += i11;
            }
            i9 = i10;
        }
        boolean[] zArr = new boolean[i9];
        for (int[] iArr2 : arrayList) {
            i += a(zArr, i, iArr2, true);
        }
        return zArr;
    }

    private static boolean a(CharSequence charSequence, int i, int i2) {
        int i3 = i2 + i;
        int length = charSequence.length();
        while (i < i3 && i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < '0' || charAt > '9') {
                if (charAt != 241) {
                    return false;
                }
                i3++;
            }
            i++;
        }
        return i3 <= length;
    }
}
