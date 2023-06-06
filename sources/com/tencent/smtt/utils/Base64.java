package com.tencent.smtt.utils;

import java.io.UnsupportedEncodingException;
/* loaded from: classes6.dex */
public class Base64 {
    static final /* synthetic */ boolean a = !Base64.class.desiredAssertionStatus();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static abstract class a {
        public byte[] a;
        public int b;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class b extends a {
        private static final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int e;
        private int f;
        private final int[] g;

        public b(int i, byte[] bArr) {
            this.a = bArr;
            this.g = (i & 8) == 0 ? c : d;
            this.e = 0;
            this.f = 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00e3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(byte[] r12, int r13, int r14, boolean r15) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.Base64.b.a(byte[], int, int, boolean):boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class c extends a {
        static final /* synthetic */ boolean g = !Base64.class.desiredAssertionStatus();
        private static final byte[] h = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        int c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        private final byte[] j;
        private int k;
        private final byte[] l;

        public c(int i2, byte[] bArr) {
            this.a = bArr;
            this.d = (i2 & 1) == 0;
            this.e = (i2 & 2) == 0;
            this.f = (i2 & 4) != 0;
            this.l = (i2 & 8) == 0 ? h : i;
            this.j = new byte[2];
            this.c = 0;
            this.k = this.e ? 19 : -1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public boolean a(byte[] bArr, int i2, int i3, boolean z) {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            byte b;
            byte b2;
            int i10;
            int i11;
            byte b3;
            int i12;
            int i13;
            int i14;
            byte[] bArr2 = this.l;
            byte[] bArr3 = this.a;
            int i15 = this.k;
            int i16 = i3 + i2;
            int i17 = 0;
            switch (this.c) {
                case 0:
                default:
                    i4 = i2;
                    i5 = -1;
                    break;
                case 1:
                    if (i2 + 2 <= i16) {
                        int i18 = i2 + 1;
                        i4 = i18 + 1;
                        i5 = ((bArr[i2] & 255) << 8) | ((this.j[0] & 255) << 16) | (bArr[i18] & 255);
                        this.c = 0;
                        break;
                    }
                    i4 = i2;
                    i5 = -1;
                    break;
                case 2:
                    i4 = i2 + 1;
                    if (i4 <= i16) {
                        i5 = (bArr[i2] & 255) | ((this.j[0] & 255) << 16) | ((this.j[1] & 255) << 8);
                        this.c = 0;
                        break;
                    }
                    i4 = i2;
                    i5 = -1;
                    break;
            }
            if (i5 != -1) {
                bArr3[0] = bArr2[(i5 >> 18) & 63];
                bArr3[1] = bArr2[(i5 >> 12) & 63];
                bArr3[2] = bArr2[(i5 >> 6) & 63];
                bArr3[3] = bArr2[i5 & 63];
                int i19 = i15 - 1;
                if (i19 == 0) {
                    if (this.f) {
                        i14 = 5;
                        bArr3[4] = 13;
                    } else {
                        i14 = 4;
                    }
                    i7 = i14 + 1;
                    bArr3[i14] = 10;
                    i6 = 19;
                } else {
                    i6 = i19;
                    i7 = 4;
                }
            } else {
                i6 = i15;
                i7 = 0;
            }
            while (true) {
                int i20 = i4 + 3;
                if (i20 > i16) {
                    if (z) {
                        if (i4 - this.c == i16 - 1) {
                            if (this.c > 0) {
                                b3 = this.j[0];
                                i17 = 1;
                            } else {
                                b3 = bArr[i4];
                                i4++;
                            }
                            int i21 = (b3 & 255) << 4;
                            this.c -= i17;
                            int i22 = i7 + 1;
                            bArr3[i7] = bArr2[(i21 >> 6) & 63];
                            i7 = i22 + 1;
                            bArr3[i22] = bArr2[i21 & 63];
                            if (this.d) {
                                int i23 = i7 + 1;
                                bArr3[i7] = 61;
                                i7 = i23 + 1;
                                bArr3[i23] = 61;
                            }
                            if (this.e) {
                                if (this.f) {
                                    i12 = i7 + 1;
                                    bArr3[i7] = 13;
                                } else {
                                    i12 = i7;
                                }
                                i7 = i12 + 1;
                                bArr3[i12] = 10;
                            }
                        } else if (i4 - this.c == i16 - 2) {
                            if (this.c > 1) {
                                i17 = 1;
                                i9 = i4;
                                b = this.j[0];
                            } else {
                                i9 = i4 + 1;
                                b = bArr[i4];
                            }
                            int i24 = (b & 255) << 10;
                            if (this.c > 0) {
                                i10 = i17 + 1;
                                b2 = this.j[i17];
                            } else {
                                b2 = bArr[i9];
                                i9++;
                                i10 = i17;
                            }
                            int i25 = ((b2 & 255) << 2) | i24;
                            this.c -= i10;
                            int i26 = i7 + 1;
                            bArr3[i7] = bArr2[(i25 >> 12) & 63];
                            int i27 = i26 + 1;
                            bArr3[i26] = bArr2[(i25 >> 6) & 63];
                            int i28 = i27 + 1;
                            bArr3[i27] = bArr2[i25 & 63];
                            if (this.d) {
                                i11 = i28 + 1;
                                bArr3[i28] = 61;
                            } else {
                                i11 = i28;
                            }
                            if (this.e) {
                                if (this.f) {
                                    bArr3[i11] = 13;
                                    i11++;
                                }
                                bArr3[i11] = 10;
                                i11++;
                            }
                            i7 = i11;
                            i4 = i9;
                        } else if (this.e && i7 > 0 && i6 != 19) {
                            if (this.f) {
                                i8 = i7 + 1;
                                bArr3[i7] = 13;
                            } else {
                                i8 = i7;
                            }
                            bArr3[i8] = 10;
                            i7 = i8 + 1;
                        }
                        if (!g && this.c != 0) {
                            throw new AssertionError();
                        }
                        if (!g && i4 != i16) {
                            throw new AssertionError();
                        }
                    } else if (i4 == i16 - 1) {
                        byte[] bArr4 = this.j;
                        int i29 = this.c;
                        this.c = i29 + 1;
                        bArr4[i29] = bArr[i4];
                    } else if (i4 == i16 - 2) {
                        byte[] bArr5 = this.j;
                        int i30 = this.c;
                        this.c = i30 + 1;
                        bArr5[i30] = bArr[i4];
                        byte[] bArr6 = this.j;
                        int i31 = this.c;
                        this.c = i31 + 1;
                        bArr6[i31] = bArr[i4 + 1];
                    }
                    this.b = i7;
                    this.k = i6;
                    return true;
                }
                int i32 = (bArr[i4 + 2] & 255) | ((bArr[i4] & 255) << 16) | ((bArr[i4 + 1] & 255) << 8);
                bArr3[i7] = bArr2[(i32 >> 18) & 63];
                bArr3[i7 + 1] = bArr2[(i32 >> 12) & 63];
                bArr3[i7 + 2] = bArr2[(i32 >> 6) & 63];
                bArr3[i7 + 3] = bArr2[i32 & 63];
                i7 += 4;
                i6--;
                if (i6 == 0) {
                    if (this.f) {
                        i13 = i7 + 1;
                        bArr3[i7] = 13;
                    } else {
                        i13 = i7;
                    }
                    i7 = i13 + 1;
                    bArr3[i13] = 10;
                    i4 = i20;
                    i6 = 19;
                } else {
                    i4 = i20;
                }
            }
        }
    }

    private Base64() {
    }

    public static byte[] a(String str, int i) {
        return a(str.getBytes(), i);
    }

    public static byte[] a(byte[] bArr, int i) {
        return a(bArr, 0, bArr.length, i);
    }

    public static byte[] a(byte[] bArr, int i, int i2, int i3) {
        b bVar = new b(i3, new byte[(i2 * 3) / 4]);
        if (bVar.a(bArr, i, i2, true)) {
            if (bVar.b == bVar.a.length) {
                return bVar.a;
            }
            byte[] bArr2 = new byte[bVar.b];
            System.arraycopy(bVar.a, 0, bArr2, 0, bVar.b);
            return bArr2;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static byte[] b(byte[] bArr, int i) {
        return b(bArr, 0, bArr.length, i);
    }

    public static byte[] b(byte[] bArr, int i, int i2, int i3) {
        c cVar = new c(i3, null);
        int i4 = (i2 / 3) * 4;
        if (!cVar.d) {
            switch (i2 % 3) {
                case 1:
                    i4 += 2;
                    break;
                case 2:
                    i4 += 3;
                    break;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (cVar.e && i2 > 0) {
            i4 += (((i2 - 1) / 57) + 1) * (cVar.f ? 2 : 1);
        }
        cVar.a = new byte[i4];
        cVar.a(bArr, i, i2, true);
        if (a || cVar.b == i4) {
            return cVar.a;
        }
        throw new AssertionError();
    }

    public static String encodeToString(byte[] bArr, int i) {
        try {
            return new String(b(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
