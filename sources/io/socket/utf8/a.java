package io.socket.utf8;

import com.tencent.smtt.sdk.TbsListener;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a {
    public static int[] a;
    public static int b;
    public static int c;

    public static String a(String str) throws b {
        String sb;
        int[] b2 = b(str);
        int length = b2.length;
        StringBuilder sb2 = new StringBuilder();
        int i = -1;
        while (true) {
            i++;
            if (i < length) {
                int i2 = b2[i];
                StringBuilder sb3 = new StringBuilder();
                if ((i2 & (-128)) == 0) {
                    sb3.append(Character.toChars(i2));
                    sb = sb3.toString();
                } else {
                    if ((i2 & (-2048)) == 0) {
                        sb3.append(Character.toChars(((i2 >> 6) & 31) | 192));
                    } else if (((-65536) & i2) == 0) {
                        a(i2);
                        sb3.append(Character.toChars(((i2 >> 12) & 15) | TbsListener.ErrorCode.EXCEED_INCR_UPDATE));
                        sb3.append(a(i2, 6));
                    } else if (((-2097152) & i2) == 0) {
                        sb3.append(Character.toChars(((i2 >> 18) & 7) | 240));
                        sb3.append(a(i2, 12));
                        sb3.append(a(i2, 6));
                    }
                    sb3.append(Character.toChars((i2 & 63) | 128));
                    sb = sb3.toString();
                }
                sb2.append(sb);
            } else {
                return sb2.toString();
            }
        }
    }

    public static int[] b(String str) {
        int length = str.length();
        int i = 0;
        int[] iArr = new int[str.codePointCount(0, length)];
        int i2 = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            iArr[i2] = codePointAt;
            i += Character.charCount(codePointAt);
            i2++;
        }
        return iArr;
    }

    private static char[] a(int i, int i2) {
        return Character.toChars(((i >> i2) & 63) | 128);
    }

    public static int a() throws b {
        if (c >= b) {
            throw new b("Invalid byte index");
        }
        int i = a[c] & 255;
        c++;
        if ((i & 192) == 128) {
            return i & 63;
        }
        throw new b("Invalid continuation byte");
    }

    public static String a(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
        return sb.toString();
    }

    public static void a(int i) throws b {
        if (i < 55296 || i > 57343) {
            return;
        }
        throw new b("Lone surrogate U+" + Integer.toHexString(i).toUpperCase() + " is not a scalar value");
    }

    public static int[] a(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }
}
