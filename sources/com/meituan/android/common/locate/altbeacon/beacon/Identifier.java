package com.meituan.android.common.locate.altbeacon.beacon;

import android.annotation.TargetApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.util.Arrays;
import java.util.UUID;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public class Identifier implements Serializable, Comparable<Identifier> {
    private static final int MAX_INTEGER = 65535;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final byte[] mValue;
    private static final Pattern HEX_PATTERN = Pattern.compile("^0x[0-9A-Fa-f]*$");
    private static final Pattern HEX_PATTERN_NO_PREFIX = Pattern.compile("^[0-9A-Fa-f]*$");
    private static final Pattern DECIMAL_PATTERN = Pattern.compile("^0|[1-9][0-9]*$");
    private static final Pattern UUID_PATTERN = Pattern.compile("^[0-9A-Fa-f]{8}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{4}-?[0-9A-Fa-f]{12}$");
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @Deprecated
    public Identifier(Identifier identifier) {
        Object[] objArr = {identifier};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc6bc3e18265e755c81b457ebede3f8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc6bc3e18265e755c81b457ebede3f8a");
        } else if (identifier == null) {
            throw new NullPointerException("Identifiers cannot be constructed from null pointers but \"identifier\" is null.");
        } else {
            this.mValue = identifier.mValue;
        }
    }

    public Identifier(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81e309ad1fb88fc5b7b4b530f1a7102b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81e309ad1fb88fc5b7b4b530f1a7102b");
        } else if (bArr == null) {
            throw new NullPointerException("Identifiers cannot be constructed from null pointers but \"value\" is null.");
        } else {
            this.mValue = bArr;
        }
    }

    @TargetApi(9)
    public static Identifier fromBytes(byte[] bArr, int i, int i2, boolean z) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a94d7c156e1d65294593a25a2cd73a7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Identifier) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a94d7c156e1d65294593a25a2cd73a7a");
        }
        if (bArr != null) {
            if (i < 0 || i > bArr.length) {
                throw new ArrayIndexOutOfBoundsException("start < 0 || start > bytes.length");
            }
            if (i2 <= bArr.length) {
                if (i <= i2) {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
                    if (z) {
                        reverseArray(copyOfRange);
                    }
                    return new Identifier(copyOfRange);
                }
                throw new IllegalArgumentException("start > end");
            }
            throw new ArrayIndexOutOfBoundsException("end > bytes.length");
        }
        throw new NullPointerException("Identifiers cannot be constructed from null pointers but \"bytes\" is null.");
    }

    public static Identifier fromInt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dccecb8b4080531881ee85604eae37ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Identifier) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dccecb8b4080531881ee85604eae37ff");
        }
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("Identifiers can only be constructed from integers between 0 and 65535 (inclusive).");
        }
        return new Identifier(new byte[]{(byte) (i >> 8), (byte) i});
    }

    public static Identifier fromLong(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "19ff97233aeb2d4aec77fe9db84c883c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Identifier) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "19ff97233aeb2d4aec77fe9db84c883c");
        }
        if (i >= 0) {
            byte[] bArr = new byte[i];
            for (int i2 = i - 1; i2 >= 0; i2--) {
                bArr[i2] = (byte) (255 & j);
                j >>= 8;
            }
            return new Identifier(bArr);
        }
        throw new IllegalArgumentException("Identifier length must be > 0.");
    }

    public static Identifier fromUuid(UUID uuid) {
        Object[] objArr = {uuid};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c9fcd692617ee9318077254fe5f85464", RobustBitConfig.DEFAULT_VALUE)) {
            return (Identifier) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c9fcd692617ee9318077254fe5f85464");
        }
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        return new Identifier(allocate.array());
    }

    public static Identifier parse(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ccfd7315a7618c51ac4436d5a66ed647", RobustBitConfig.DEFAULT_VALUE) ? (Identifier) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ccfd7315a7618c51ac4436d5a66ed647") : parse(str, -1);
    }

    public static Identifier parse(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ce363fbb593df997e134b0c45403beeb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Identifier) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ce363fbb593df997e134b0c45403beeb");
        }
        if (str != null) {
            if (HEX_PATTERN.matcher(str).matches()) {
                return parseHex(str.substring(2), i);
            }
            if (UUID_PATTERN.matcher(str).matches()) {
                return parseHex(str.replace(CommonConstant.Symbol.MINUS, ""), i);
            }
            if (!DECIMAL_PATTERN.matcher(str).matches()) {
                if (HEX_PATTERN_NO_PREFIX.matcher(str).matches()) {
                    return parseHex(str, i);
                }
                throw new IllegalArgumentException("Unable to parse Identifier.");
            }
            try {
                int intValue = Integer.valueOf(str).intValue();
                return (i <= 0 || i == 2) ? fromInt(intValue) : fromLong(intValue, i);
            } catch (Throwable th) {
                throw new IllegalArgumentException("Unable to parse Identifier in decimal format.", th);
            }
        }
        throw new NullPointerException("Identifiers cannot be constructed from null pointers but \"stringValue\" is null.");
    }

    private static Identifier parseHex(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c7e23193c9bb092b99caa00871f8d2cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Identifier) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c7e23193c9bb092b99caa00871f8d2cc");
        }
        String str2 = (str.length() % 2 == 0 ? "" : "0") + str.toUpperCase();
        if (i > 0 && i < str2.length() / 2) {
            str2 = str2.substring(str2.length() - (i * 2));
        }
        if (i > 0 && i > str2.length() / 2) {
            int length = (i * 2) - str2.length();
            StringBuilder sb = new StringBuilder();
            while (sb.length() < length) {
                sb.append("0");
            }
            str2 = sb.toString() + str2;
        }
        byte[] bArr = new byte[str2.length() / 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (Integer.parseInt(str2.substring(i3, i3 + 2), 16) & 255);
        }
        return new Identifier(bArr);
    }

    private static void reverseArray(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6313e40191d454fc863130196e340f81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6313e40191d454fc863130196e340f81");
            return;
        }
        for (int i = 0; i < bArr.length / 2; i++) {
            int length = (bArr.length - i) - 1;
            byte b = bArr[i];
            bArr[i] = bArr[length];
            bArr[length] = b;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Identifier identifier) {
        Object[] objArr = {identifier};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32537fe04cde090e0fe37ae9e554c3cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32537fe04cde090e0fe37ae9e554c3cd")).intValue();
        }
        if (this.mValue.length != identifier.mValue.length) {
            return this.mValue.length < identifier.mValue.length ? -1 : 1;
        }
        for (int i = 0; i < this.mValue.length; i++) {
            if (this.mValue[i] != identifier.mValue[i]) {
                return this.mValue[i] < identifier.mValue[i] ? -1 : 1;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "205f6d65e51104ca0860caaa58a43368", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "205f6d65e51104ca0860caaa58a43368")).booleanValue();
        }
        if (obj instanceof Identifier) {
            return Arrays.equals(this.mValue, ((Identifier) obj).mValue);
        }
        return false;
    }

    public int getByteCount() {
        return this.mValue.length;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9a967e66e413d62ea351ba0e2bbd816", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9a967e66e413d62ea351ba0e2bbd816")).intValue() : Arrays.hashCode(this.mValue);
    }

    public byte[] toByteArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (byte[]) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f6fba633921602ab5ab12b6da981b45", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f6fba633921602ab5ab12b6da981b45") : this.mValue.clone());
    }

    @TargetApi(9)
    public byte[] toByteArrayOfSpecifiedEndianness(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10dd0c42946248fa20bf89a464d500e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10dd0c42946248fa20bf89a464d500e1");
        }
        byte[] copyOf = Arrays.copyOf(this.mValue, this.mValue.length);
        if (!z) {
            reverseArray(copyOf);
        }
        return copyOf;
    }

    public String toHexString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ec5d76f01ae3237e820f38d625a7730", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ec5d76f01ae3237e820f38d625a7730");
        }
        int length = this.mValue.length;
        int i = 2;
        char[] cArr = new char[(length * 2) + 2];
        cArr[0] = '0';
        cArr[1] = 'x';
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr[i] = HEX_DIGITS[(this.mValue[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = HEX_DIGITS[this.mValue[i2] & 15];
        }
        return new String(cArr);
    }

    public int toInt() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb592e58d90263adbd15bc961f7c4bed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb592e58d90263adbd15bc961f7c4bed")).intValue();
        }
        if (this.mValue.length <= 2) {
            int i = 0;
            for (int i2 = 0; i2 < this.mValue.length; i2++) {
                i |= (this.mValue[i2] & 255) << (((this.mValue.length - i2) - 1) * 8);
            }
            return i;
        }
        throw new UnsupportedOperationException("Only supported for Identifiers with max byte length of 2");
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c808f4cc716682bf529a023ed6457876", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c808f4cc716682bf529a023ed6457876") : this.mValue.length == 2 ? Integer.toString(toInt()) : this.mValue.length == 16 ? toUuid().toString() : toHexString();
    }

    public UUID toUuid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d7aa2d1c0137bb22eb3405e3279771b", RobustBitConfig.DEFAULT_VALUE)) {
            return (UUID) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d7aa2d1c0137bb22eb3405e3279771b");
        }
        if (this.mValue.length == 16) {
            LongBuffer asLongBuffer = ByteBuffer.wrap(this.mValue).asLongBuffer();
            return new UUID(asLongBuffer.get(), asLongBuffer.get());
        }
        throw new UnsupportedOperationException("Only Identifiers backed by a byte array with length of exactly 16 can be UUIDs.");
    }

    @Deprecated
    public String toUuidString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1183ec58beaa2818666f4be73418f0a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1183ec58beaa2818666f4be73418f0a") : toUuid().toString();
    }
}
