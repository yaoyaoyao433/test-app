package com.meituan.android.common.locate.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class Geohash implements Serializable, Comparable<Geohash> {
    private static final int BASE32_BITS = 5;
    private static final long FIRST_BIT_FLAGGED = Long.MIN_VALUE;
    private static final int MAX_BIT_PRECISION = 64;
    private static final int MAX_CHARACTER_PRECISION = 12;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3743461830692281955L;
    private long bits;
    private final Rectangle bounding;
    private final Coordinate center;
    private byte significantBits;
    private static final int[] BITS = {16, 8, 4, 2, 1};
    private static final char[] BASE32 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final Map<Character, Integer> decodeMap = new HashMap();

    static {
        int length = BASE32.length;
        for (int i = 0; i < length; i++) {
            decodeMap.put(Character.valueOf(BASE32[i]), Integer.valueOf(i));
        }
    }

    public Geohash(Coordinate coordinate, int i) {
        Object[] objArr = {coordinate, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67adde99195d8ef4c65b1153d03a0575", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67adde99195d8ef4c65b1153d03a0575");
            return;
        }
        this.bits = 0L;
        this.significantBits = (byte) 0;
        int min = Math.min(i, 64);
        double[] dArr = {-90.0d, 90.0d};
        double[] dArr2 = {-180.0d, 180.0d};
        boolean z = true;
        while (this.significantBits < min) {
            if (z) {
                divideRangeEncode(coordinate.getLongitude(), dArr2);
            } else {
                divideRangeEncode(coordinate.getLatitude(), dArr);
            }
            z = !z;
        }
        this.center = new Coordinate((dArr[0] + dArr[1]) / 2.0d, (dArr2[0] + dArr2[1]) / 2.0d);
        this.bounding = new Rectangle(dArr[0], dArr2[0], dArr[1], dArr2[1]);
        this.bits <<= 64 - min;
    }

    public Geohash(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f86456aca90ff4442811ca3b5c00b95a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f86456aca90ff4442811ca3b5c00b95a");
            return;
        }
        this.bits = 0L;
        this.significantBits = (byte) 0;
        double[] dArr = {-90.0d, 90.0d};
        double[] dArr2 = {-180.0d, 180.0d};
        int i = 0;
        boolean z = true;
        while (i < str.length()) {
            int intValue = decodeMap.get(Character.valueOf(str.charAt(i))).intValue();
            boolean z2 = z;
            for (int i2 = 0; i2 < 5; i2++) {
                int i3 = BITS[i2];
                if (z2) {
                    divideRangeDecode(dArr2, (i3 & intValue) != 0);
                } else {
                    divideRangeDecode(dArr, (i3 & intValue) != 0);
                }
                z2 = !z2;
            }
            i++;
            z = z2;
        }
        this.center = new Coordinate((dArr[0] + dArr[1]) / 2.0d, (dArr2[0] + dArr2[1]) / 2.0d);
        this.bounding = new Rectangle(dArr[0], dArr2[0], dArr[1], dArr2[1]);
        this.bits <<= 64 - this.significantBits;
    }

    public Geohash(long[] jArr, long[] jArr2) {
        Object[] objArr = {jArr, jArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4f5df513fb6c38cca8c2c6fd4e204d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4f5df513fb6c38cca8c2c6fd4e204d1");
            return;
        }
        this.bits = 0L;
        this.significantBits = (byte) 0;
        jArr[0] = jArr[0] << ((int) (64 - jArr[1]));
        jArr2[0] = jArr2[0] << ((int) (64 - jArr2[1]));
        double[] dArr = {-90.0d, 90.0d};
        double[] dArr2 = {-180.0d, 180.0d};
        boolean z = false;
        for (int i = 0; i < jArr[1] + jArr2[1]; i++) {
            if (z) {
                divideRangeDecode(dArr, (jArr[0] & FIRST_BIT_FLAGGED) == FIRST_BIT_FLAGGED);
                jArr[0] = jArr[0] << 1;
            } else {
                divideRangeDecode(dArr2, (jArr2[0] & FIRST_BIT_FLAGGED) == FIRST_BIT_FLAGGED);
                jArr2[0] = jArr2[0] << 1;
            }
            z = !z;
        }
        this.center = new Coordinate((dArr[0] + dArr[1]) / 2.0d, (dArr2[0] + dArr2[1]) / 2.0d);
        this.bounding = new Rectangle(dArr[0], dArr2[0], dArr[1], dArr2[1]);
        this.bits <<= 64 - this.significantBits;
    }

    private final void addOffBitToEnd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d65db94227544ab517dd82daaeb7ed5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d65db94227544ab517dd82daaeb7ed5e");
            return;
        }
        this.significantBits = (byte) (this.significantBits + 1);
        this.bits <<= 1;
    }

    private final void addOnBitToEnd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "038caf97d1e112570614a4cf7b41a1db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "038caf97d1e112570614a4cf7b41a1db");
            return;
        }
        this.significantBits = (byte) (this.significantBits + 1);
        this.bits <<= 1;
        this.bits |= 1;
    }

    private void divideRangeDecode(double[] dArr, boolean z) {
        Object[] objArr = {dArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b21f41ed8497f8266b3ff18b53ca2d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b21f41ed8497f8266b3ff18b53ca2d9");
            return;
        }
        double d = (dArr[0] + dArr[1]) / 2.0d;
        if (z) {
            addOnBitToEnd();
            dArr[0] = d;
            return;
        }
        addOffBitToEnd();
        dArr[1] = d;
    }

    private void divideRangeEncode(double d, double[] dArr) {
        Object[] objArr = {Double.valueOf(d), dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "becc41a04cafe8d953868beab992dd4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "becc41a04cafe8d953868beab992dd4b");
            return;
        }
        double d2 = (dArr[0] + dArr[1]) / 2.0d;
        if (d >= d2) {
            addOnBitToEnd();
            dArr[0] = d2;
            return;
        }
        addOffBitToEnd();
        dArr[1] = d2;
    }

    private long extractEverySecondBit(long j, int i) {
        long j2 = j;
        Object[] objArr = {new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01ac38601998681ae55cecce6f4dc893", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01ac38601998681ae55cecce6f4dc893")).longValue();
        }
        long j3 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            if ((j2 & FIRST_BIT_FLAGGED) == FIRST_BIT_FLAGGED) {
                j3 |= 1;
            }
            j3 <<= 1;
            j2 <<= 2;
        }
        return j3 >>> 1;
    }

    public static Geohash from(double d, double d2, int i) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a0e35636fded876a9debd0fc7d0645f6", RobustBitConfig.DEFAULT_VALUE) ? (Geohash) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a0e35636fded876a9debd0fc7d0645f6") : from(new Coordinate(d, d2), i);
    }

    public static Geohash from(Coordinate coordinate, int i) {
        Object[] objArr = {coordinate, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f1599e711994e2aa9d31f20836ac340d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Geohash) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f1599e711994e2aa9d31f20836ac340d");
        }
        if (i <= 12) {
            int i2 = i * 5;
            if (i2 > 60) {
                i2 = 60;
            }
            return new Geohash(coordinate, i2);
        }
        throw new IllegalArgumentException("A geohash can only be 12 character long.");
    }

    public static Geohash from(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e7d16e1fe552cf7d3f3d6dac5b73211e", RobustBitConfig.DEFAULT_VALUE) ? (Geohash) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e7d16e1fe552cf7d3f3d6dac5b73211e") : new Geohash(str);
    }

    private int[] getNumberOfLatLonBits() {
        return this.significantBits % 2 == 0 ? new int[]{this.significantBits / 2, this.significantBits / 2} : new int[]{this.significantBits / 2, (this.significantBits / 2) + 1};
    }

    private long[] getRightAlignedLatitudeBits() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "207485e237dfbfe1e2ea68f2919c8c97", RobustBitConfig.DEFAULT_VALUE) ? (long[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "207485e237dfbfe1e2ea68f2919c8c97") : new long[]{extractEverySecondBit(this.bits << 1, getNumberOfLatLonBits()[0]), getNumberOfLatLonBits()[0]};
    }

    private long[] getRightAlignedLongitudeBits() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4c316f4a424c60a07245f51c5adb9d5", RobustBitConfig.DEFAULT_VALUE) ? (long[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4c316f4a424c60a07245f51c5adb9d5") : new long[]{extractEverySecondBit(this.bits, getNumberOfLatLonBits()[1]), getNumberOfLatLonBits()[1]};
    }

    private long maskLastNBits(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3b67b583544b1688d85b8b8f0cbf2a5", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3b67b583544b1688d85b8b8f0cbf2a5")).longValue() : j & ((-1) >>> ((int) (64 - j2)));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Geohash geohash) {
        Object[] objArr = {geohash};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfdcbe6b67263c0cab7b3ae85f6dcecb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfdcbe6b67263c0cab7b3ae85f6dcecb")).intValue();
        }
        int compareTo = Long.valueOf(this.bits ^ FIRST_BIT_FLAGGED).compareTo(Long.valueOf(geohash.bits ^ FIRST_BIT_FLAGGED));
        return compareTo != 0 ? compareTo : Integer.valueOf(this.significantBits).compareTo(Integer.valueOf(geohash.significantBits));
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27a9a088fe986bab71c33408e88f3a58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27a9a088fe986bab71c33408e88f3a58")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Geohash geohash = (Geohash) obj;
            return this.bits == geohash.bits && this.significantBits == geohash.significantBits;
        }
        return false;
    }

    public final Geohash[] getAdjacent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33b93bb61fe00ac5537607f51bc70a61", RobustBitConfig.DEFAULT_VALUE)) {
            return (Geohash[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33b93bb61fe00ac5537607f51bc70a61");
        }
        Geohash northernGeoHash = getNorthernGeoHash();
        Geohash southernGeoHash = getSouthernGeoHash();
        Geohash easternGeoHash = getEasternGeoHash();
        Geohash westernGeoHash = getWesternGeoHash();
        return new Geohash[]{northernGeoHash, northernGeoHash.getEasternGeoHash(), easternGeoHash, easternGeoHash.getSouthernGeoHash(), southernGeoHash, southernGeoHash.getWesternGeoHash(), westernGeoHash, westernGeoHash.getNorthernGeoHash()};
    }

    public final Rectangle getBounding() {
        return this.bounding;
    }

    public final Coordinate getCenter() {
        return this.center;
    }

    public final Geohash getEasternGeoHash() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65737f2549ecc1849c1cdaaa4d00120e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Geohash) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65737f2549ecc1849c1cdaaa4d00120e");
        }
        long[] rightAlignedLatitudeBits = getRightAlignedLatitudeBits();
        long[] rightAlignedLongitudeBits = getRightAlignedLongitudeBits();
        rightAlignedLongitudeBits[0] = rightAlignedLongitudeBits[0] + 1;
        rightAlignedLongitudeBits[0] = maskLastNBits(rightAlignedLongitudeBits[0], rightAlignedLongitudeBits[1]);
        return new Geohash(rightAlignedLatitudeBits, rightAlignedLongitudeBits);
    }

    public final Geohash getNorthernGeoHash() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d67e5952fa05f716458ea10e2f40bf61", RobustBitConfig.DEFAULT_VALUE)) {
            return (Geohash) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d67e5952fa05f716458ea10e2f40bf61");
        }
        long[] rightAlignedLatitudeBits = getRightAlignedLatitudeBits();
        long[] rightAlignedLongitudeBits = getRightAlignedLongitudeBits();
        rightAlignedLatitudeBits[0] = rightAlignedLatitudeBits[0] + 1;
        rightAlignedLatitudeBits[0] = maskLastNBits(rightAlignedLatitudeBits[0], rightAlignedLatitudeBits[1]);
        return new Geohash(rightAlignedLatitudeBits, rightAlignedLongitudeBits);
    }

    public final Geohash getSouthernGeoHash() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff83e485c0508081e357f2bb95dfd70c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Geohash) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff83e485c0508081e357f2bb95dfd70c");
        }
        long[] rightAlignedLatitudeBits = getRightAlignedLatitudeBits();
        long[] rightAlignedLongitudeBits = getRightAlignedLongitudeBits();
        rightAlignedLatitudeBits[0] = rightAlignedLatitudeBits[0] - 1;
        rightAlignedLatitudeBits[0] = maskLastNBits(rightAlignedLatitudeBits[0], rightAlignedLatitudeBits[1]);
        return new Geohash(rightAlignedLatitudeBits, rightAlignedLongitudeBits);
    }

    public final Geohash getWesternGeoHash() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "add3d4af66b83163742eb58dac68f8e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Geohash) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "add3d4af66b83163742eb58dac68f8e7");
        }
        long[] rightAlignedLatitudeBits = getRightAlignedLatitudeBits();
        long[] rightAlignedLongitudeBits = getRightAlignedLongitudeBits();
        rightAlignedLongitudeBits[0] = rightAlignedLongitudeBits[0] - 1;
        rightAlignedLongitudeBits[0] = maskLastNBits(rightAlignedLongitudeBits[0], rightAlignedLongitudeBits[1]);
        return new Geohash(rightAlignedLatitudeBits, rightAlignedLongitudeBits);
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0de1b7dfc0116ca9efbbcf046ab24d42", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0de1b7dfc0116ca9efbbcf046ab24d42")).intValue() : ((((int) (this.bits ^ (this.bits >>> 32))) + 31) * 31) + this.significantBits;
    }

    public final String toBase32String() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78d667c9da3e08a0f5753b9a77585799", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78d667c9da3e08a0f5753b9a77585799");
        }
        if (this.significantBits % 5 == 0) {
            StringBuilder sb = new StringBuilder();
            long j = this.bits;
            int ceil = (int) Math.ceil(this.significantBits / 5.0d);
            for (int i = 0; i < ceil; i++) {
                sb.append(BASE32[(int) (((-576460752303423488L) & j) >>> 59)]);
                j <<= 5;
            }
            return sb.toString();
        }
        throw new IllegalStateException("Cannot convert a geohash to base32 if the precision is not a multiple of 5.");
    }

    public final String toBinaryString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6be8a24479fd77c8fa248a600abf913", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6be8a24479fd77c8fa248a600abf913");
        }
        StringBuilder sb = new StringBuilder();
        long j = this.bits;
        for (int i = 0; i < this.significantBits; i++) {
            sb.append((j & FIRST_BIT_FLAGGED) == FIRST_BIT_FLAGGED ? '1' : '0');
            j <<= 1;
        }
        return sb.toString();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccb8e5881547bd0aad33b45575f232ca", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccb8e5881547bd0aad33b45575f232ca") : this.significantBits % 5 == 0 ? String.format("%s -> %s -> %s", Long.toBinaryString(this.bits), this.bounding, toBase32String()) : String.format("%s -> %s, bits: %d", Long.toBinaryString(this.bits), this.bounding, Byte.valueOf(this.significantBits));
    }
}
