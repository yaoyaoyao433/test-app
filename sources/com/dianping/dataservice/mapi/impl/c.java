package com.dianping.dataservice.mapi.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static final int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};

    public static boolean a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0965e16928dafea2b81732a8a836395", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0965e16928dafea2b81732a8a836395")).booleanValue();
        }
        if (bArr == null) {
            return false;
        }
        int length = bArr.length;
        char c = 0;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length + 0; i3++) {
            int i4 = bArr[i3] & 255;
            switch (c) {
                case 0:
                    int i5 = b[i4];
                    switch (i5) {
                        case 0:
                            if (i4 > 127) {
                                return false;
                            }
                            i2 = i5;
                            i = i4;
                            continue;
                        case 1:
                            if (i4 < 194 || i4 > 223) {
                                return false;
                            }
                            i2 = i5;
                            i = i4;
                            c = 1;
                            break;
                        case 2:
                            if (i4 < 224 || i4 > 239) {
                                return false;
                            }
                            i2 = i5;
                            i = i4;
                            c = 1;
                            break;
                        case 3:
                            if (i4 < 240 || i4 > 244) {
                                return false;
                            }
                            i2 = i5;
                            i = i4;
                            c = 1;
                            break;
                        default:
                            return false;
                    }
                    break;
                case 1:
                    if (i == 240 && i4 < 144) {
                        return false;
                    }
                    if (i == 244 && i4 > 143) {
                        return false;
                    }
                    if (i == 224 && i4 < 160) {
                        return false;
                    }
                    if (i == 237 && i4 > 159) {
                        return false;
                    }
                    break;
                case 2:
                    break;
                default:
            }
            if (i4 < 128 || i4 > 191) {
                return false;
            }
            i2--;
            c = i2 == 0 ? (char) 0 : (char) 2;
        }
        return true;
    }
}
