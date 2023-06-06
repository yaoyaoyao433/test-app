package com.meituan.android.common.locate.util;

import android.annotation.SuppressLint;
import android.os.ParcelUuid;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class n {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int c;
    @Nullable
    private final List<ParcelUuid> d;
    private final SparseArray<byte[]> e;
    private final Map<ParcelUuid, byte[]> f;
    private final int g;
    private final String h;
    private final byte[] i;
    private String j;
    private String k;
    private static final ParcelUuid b = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
    public static final char[] a = "0123456789ABCDEF".toCharArray();

    public n(List<ParcelUuid> list, SparseArray<byte[]> sparseArray, Map<ParcelUuid, byte[]> map, int i, int i2, String str, byte[] bArr, String str2, String str3) {
        Object[] objArr = {list, sparseArray, map, Integer.valueOf(i), Integer.valueOf(i2), str, bArr, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4d84cd0e09c13c5224f8d4ae57607be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4d84cd0e09c13c5224f8d4ae57607be");
            return;
        }
        this.d = list;
        this.e = sparseArray;
        this.f = map;
        this.h = str;
        this.c = i;
        this.g = i2;
        this.i = bArr;
        this.j = str2;
        this.k = str3;
    }

    public static int a(byte b2, byte b3) {
        Object[] objArr = {Byte.valueOf(b2), Byte.valueOf(b3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "468d1033d5c512193265f8515531b532", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "468d1033d5c512193265f8515531b532")).intValue() : (b2 << 8) + (b3 & 255);
    }

    private static int a(byte[] bArr, int i, int i2, int i3, List<ParcelUuid> list) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "79c5edca7d3bc4c0d0457dd47cf918ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "79c5edca7d3bc4c0d0457dd47cf918ec")).intValue();
        }
        while (i2 > 0) {
            list.add(e(b(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meituan.android.common.locate.util.n a(byte[] r16) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.util.n.a(byte[]):com.meituan.android.common.locate.util.n");
    }

    public static <T> String a(Map<T, byte[]> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "03f626136ba7c67144331d9edf5856a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "03f626136ba7c67144331d9edf5856a9");
        }
        if (map == null) {
            return StringUtil.NULL;
        }
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Iterator<Map.Entry<T, byte[]>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            T key = it.next().getKey();
            sb.append(key);
            sb.append("=");
            sb.append(Arrays.toString(map.get(key)));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static final String a(byte[] bArr, int i, int i2) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb1688787c10784d441a9de4cee840de", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb1688787c10784d441a9de4cee840de");
        }
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        for (int i3 = 0; i3 < i2; i3++) {
            String hexString = Integer.toHexString(bArr[i3 + i] & 255);
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(hexString.toUpperCase());
        }
        return stringBuffer.toString();
    }

    private static byte[] a(byte[] bArr, int i, int i2, boolean z) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "be53a4288dc8d0aeced0fcd5289f5b9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "be53a4288dc8d0aeced0fcd5289f5b9e");
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        if (z) {
            f(bArr2);
        }
        return bArr2;
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        Object[] objArr = {bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0e208913d406f2a81b38fa46fe200b1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0e208913d406f2a81b38fa46fe200b1e");
        }
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            bArr3[i3] = bArr[i2];
            i2++;
            i3++;
        }
        int length2 = bArr2.length;
        while (i < length2) {
            bArr3[i3] = bArr2[i];
            i++;
            i3++;
        }
        return bArr3;
    }

    public static String b(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1872047d1fd5c8397b835a8b0e6d1618", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1872047d1fd5c8397b835a8b0e6d1618");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString.toUpperCase());
            sb.append(StringUtil.SPACE);
        }
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return sb.toString();
    }

    private static byte[] b(byte[] bArr, int i, int i2) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b4f6878f525a12643fd19ce784100152", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b4f6878f525a12643fd19ce784100152") : a(bArr, i, i2, false);
    }

    public static String c(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b7201753e3672a620f0f55541ba614e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b7201753e3672a620f0f55541ba614e");
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString.toUpperCase());
            sb.append(StringUtil.SPACE);
        }
        return sb.toString();
    }

    public static String d(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "609172c7c2cf359462d6b9f2ae68b696", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "609172c7c2cf359462d6b9f2ae68b696");
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = a[i2 >>> 4];
            cArr[i3 + 1] = a[i2 & 15];
        }
        return new String(cArr);
    }

    public static ParcelUuid e(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f2423564fe788ecaaec45740f0acb894", RobustBitConfig.DEFAULT_VALUE)) {
            return (ParcelUuid) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f2423564fe788ecaaec45740f0acb894");
        }
        if (bArr != null) {
            int length = bArr.length;
            if (length != 2 && length != 4 && length != 16) {
                throw new IllegalArgumentException("uuidBytes length invalid - " + length);
            } else if (length != 16) {
                return new ParcelUuid(new UUID(b.getUuid().getMostSignificantBits() + ((length == 2 ? (bArr[0] & 255) + ((bArr[1] & 255) << 8) : (((bArr[0] & 255) + ((bArr[1] & 255) << 8)) + ((bArr[2] & 255) << 16)) + ((bArr[3] & 255) << 24)) << 32), b.getUuid().getLeastSignificantBits()));
            } else {
                ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                return new ParcelUuid(new UUID(order.getLong(8), order.getLong(0)));
            }
        }
        throw new IllegalArgumentException("uuidBytes cannot be null");
    }

    private static void f(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c77eded71b67fdce4d65a8d0e216daef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c77eded71b67fdce4d65a8d0e216daef");
        } else if (bArr != null && bArr.length != 0) {
            for (int i = 0; i < bArr.length / 2; i++) {
                byte b2 = bArr[i];
                bArr[i] = bArr[(bArr.length - 1) - i];
                bArr[(bArr.length - 1) - i] = b2;
            }
        }
    }

    public int a(SparseArray<byte[]> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8a2841bcfed48c1478b3bef44f8f307", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8a2841bcfed48c1478b3bef44f8f307")).intValue();
        }
        if (sparseArray == null || sparseArray.size() == 0) {
            return -1;
        }
        try {
            return sparseArray.keyAt(0);
        } catch (Throwable th) {
            LogUtils.a(th);
            return -1;
        }
    }

    public String a() {
        return this.j;
    }

    public List<ParcelUuid> b() {
        return this.d;
    }

    public Map<ParcelUuid, byte[]> c() {
        return this.f;
    }

    @Nullable
    public String d() {
        return this.h;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fe1041f61b0a6267ecfd8fc0f1910b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fe1041f61b0a6267ecfd8fc0f1910b5");
        }
        return "ScanRecord [mAdvertiseFlags=" + this.c + ", mServiceUuids=" + this.d + ", mManufacturerSpecificData=" + a(this.e) + ", mServiceData=" + a(this.f) + ", mTxPowerLevel=" + this.g + ", mDeviceName=" + this.h + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
    }
}
