package com.meituan.android.common.locate.util;

import android.support.v4.view.MotionEventCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String a(byte[] bArr, int i) {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "42f6d43f55c3a824821e88f811b32223", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "42f6d43f55c3a824821e88f811b32223");
        }
        if (b(bArr, i) || a(bArr, i)) {
            return "UTF-8";
        }
        switch ((d(bArr, i) << 1) | (c(bArr, i) << 2) | 0) {
            case 0:
                return "UNICODE";
            case 1:
                return "BIG5";
            case 2:
                return CommonConstant.Encoding.GBK;
            case 3:
                return "BIG5";
            case 4:
                return CommonConstant.Encoding.GBK;
            case 5:
                return "BIG5";
            case 6:
                return CommonConstant.Encoding.GBK;
            case 7:
                return CommonConstant.Encoding.GBK;
            default:
                return "UNICODE";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(byte[] r18, long r19) {
        /*
            r1 = r19
            r3 = 2
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r12 = 0
            r11[r12] = r18
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r1)
            r13 = 1
            r11[r13] = r4
            com.meituan.robust.ChangeQuickRedirect r14 = com.meituan.android.common.locate.util.b.changeQuickRedirect
            java.lang.String r15 = "87df73311fa9ccb2b7bf482d0e92e623"
            r5 = 0
            r7 = 1
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            r4 = r11
            r6 = r14
            r8 = r15
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L2d
            r0 = 0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r0, r14, r13, r15)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L2d:
            r4 = -1
            r5 = 0
            r8 = r5
            r4 = 0
            r7 = 1
            r10 = -1
        L34:
            long r14 = (long) r4
            int r11 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r11 >= 0) goto L9b
            r7 = r18[r4]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r11 = r18[r4]
            r13 = 128(0x80, float:1.794E-43)
            r11 = r11 & r13
            byte r11 = (byte) r11
            if (r11 == 0) goto L96
            r16 = 1
            int r11 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r11 != 0) goto L83
            if (r7 < r13) goto L81
            r8 = 252(0xfc, float:3.53E-43)
            if (r7 < r8) goto L58
            r8 = 253(0xfd, float:3.55E-43)
            if (r7 > r8) goto L58
            r7 = 6
            goto L73
        L58:
            r8 = 248(0xf8, float:3.48E-43)
            if (r7 < r8) goto L5f
            r7 = 5
            goto L73
        L5f:
            r8 = 240(0xf0, float:3.36E-43)
            if (r7 < r8) goto L66
            r7 = 4
            goto L73
        L66:
            r8 = 224(0xe0, float:3.14E-43)
            if (r7 < r8) goto L6d
            r7 = 3
            goto L73
        L6d:
            r8 = 192(0xc0, float:2.69E-43)
            if (r7 < r8) goto L80
            r7 = 2
        L73:
            int r9 = (int) r7
            long r14 = r14 + r7
            int r10 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r10 <= 0) goto L7a
            return r12
        L7a:
            r10 = 0
            long r7 = r7 - r16
            r10 = r9
            r8 = r7
            goto L81
        L80:
            return r12
        L81:
            r7 = 0
            goto L97
        L83:
            if (r7 < r13) goto L95
            r11 = 191(0xbf, float:2.68E-43)
            if (r7 > r11) goto L95
            long r8 = r8 - r16
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 != 0) goto L81
            if (r10 <= r3) goto L93
            r7 = 1
            return r7
        L93:
            if (r10 != r3) goto L81
        L95:
            return r12
        L96:
            r7 = 1
        L97:
            int r4 = r4 + 1
            r13 = 1
            goto L34
        L9b:
            if (r7 != 0) goto L9f
            r0 = 1
            return r0
        L9f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.util.b.a(byte[], long):boolean");
    }

    private static boolean b(byte[] bArr, int i) {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "baca744605f45b6c01e965aec09a330b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "baca744605f45b6c01e965aec09a330b")).booleanValue();
        }
        for (int i2 = 0; i2 < i; i2++) {
            if ((bArr[i2] & 128) > 0) {
                return false;
            }
        }
        return true;
    }

    private static int c(byte[] bArr, int i) {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3558fd8bf7d3965b3ba593db6936aa95", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3558fd8bf7d3965b3ba593db6936aa95")).intValue();
        }
        int[] iArr = new int[2];
        int i2 = 0;
        while (i2 < i) {
            int i3 = bArr[i2] & 255;
            iArr[0] = i3;
            if ((i3 & 128) == 0) {
                i2--;
            } else {
                iArr[1] = bArr[i2 + 1] & 255;
                int i4 = ((iArr[0] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (iArr[1] & 255);
                if (i4 > 65278 || i4 < 41377) {
                    return 0;
                }
            }
            i2 += 2;
        }
        return 1;
    }

    private static int d(byte[] bArr, int i) {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa23d43823fa83312010b5149ae6db65", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa23d43823fa83312010b5149ae6db65")).intValue();
        }
        int[] iArr = new int[2];
        int i2 = 0;
        while (i2 < i) {
            int i3 = bArr[i2] & 255;
            iArr[0] = i3;
            if (i3 < 128) {
                i2--;
            } else {
                int i4 = i2 + 1;
                iArr[1] = bArr[i4] & 255;
                int i5 = ((iArr[0] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (iArr[1] & 255);
                if (i5 > 65278 || i5 < 33088) {
                    return 0;
                }
                if ((i5 <= 45054 && i5 >= 43681) || ((i5 <= 65278 && i5 >= 63649) || (i5 <= 42912 && i5 >= 41280))) {
                    bArr[i2] = 32;
                    bArr[i4] = 32;
                }
            }
            i2 += 2;
        }
        return 1;
    }
}
