package com.meituan.android.common.locate.altbeacon.beacon;

import android.annotation.TargetApi;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public class BeaconParser implements Serializable {
    public static final String ALTBEACON_LAYOUT = "m:2-3=beac,i:4-19,i:20-21,i:22-23,p:24-24,d:25-25";
    public static final String EDDYSTONE_TLM_LAYOUT = "x,s:0-1=feaa,m:2-2=20,d:3-3,d:4-5,d:6-7,d:8-11,d:12-15";
    public static final String EDDYSTONE_UID_LAYOUT = "s:0-1=feaa,m:2-2=00,p:3-3:-41,i:4-13,i:14-19";
    public static final String EDDYSTONE_URL_LAYOUT = "s:0-1=feaa,m:2-2=10,p:3-3:-41,i:4-21v";
    private static final String LITTLE_ENDIAN_SUFFIX = "l";
    private static final String TAG = "BeaconParser";
    public static final String URI_BEACON_LAYOUT = "s:0-1=fed8,m:2-2=00,p:3-3:-41,i:4-21v";
    private static final String VARIABLE_LENGTH_SUFFIX = "v";
    public static ChangeQuickRedirect changeQuickRedirect;
    protected List<BeaconParser> extraParsers;
    protected Boolean mAllowPduOverflow;
    protected String mBeaconLayout;
    protected Integer mDBmCorrection;
    protected final List<Integer> mDataEndOffsets;
    protected final List<Boolean> mDataLittleEndianFlags;
    protected final List<Integer> mDataStartOffsets;
    protected Boolean mExtraFrame;
    protected int[] mHardwareAssistManufacturers;
    protected String mIdentifier;
    protected final List<Integer> mIdentifierEndOffsets;
    protected final List<Boolean> mIdentifierLittleEndianFlags;
    protected final List<Integer> mIdentifierStartOffsets;
    protected final List<Boolean> mIdentifierVariableLengthFlags;
    protected Integer mLayoutSize;
    private Long mMatchingBeaconTypeCode;
    protected Integer mMatchingBeaconTypeCodeEndOffset;
    protected Integer mMatchingBeaconTypeCodeStartOffset;
    protected Integer mPowerEndOffset;
    protected Integer mPowerStartOffset;
    protected Long mServiceUuid;
    protected byte[] mServiceUuid128Bit;
    protected Integer mServiceUuidEndOffset;
    protected Integer mServiceUuidStartOffset;
    private static final Pattern I_PATTERN = Pattern.compile("i\\:(\\d+)\\-(\\d+)([blv]*)?");
    private static final Pattern M_PATTERN = Pattern.compile("m\\:(\\d+)-(\\d+)\\=([0-9A-Fa-f]+)");
    private static final Pattern S_PATTERN = Pattern.compile("s\\:(\\d+)-(\\d+)\\=([0-9A-Fa-f\\-]+)");
    private static final Pattern D_PATTERN = Pattern.compile("d\\:(\\d+)\\-(\\d+)([bl]*)?");
    private static final Pattern P_PATTERN = Pattern.compile("p\\:(\\d+)?\\-(\\d+)?\\:?([\\-\\d]+)?");
    private static final Pattern X_PATTERN = Pattern.compile(Constants.GestureMoveEvent.KEY_X);
    private static final char[] HEX_ARRAY = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* loaded from: classes2.dex */
    public static class BeaconLayoutException extends RuntimeException {
        public static ChangeQuickRedirect changeQuickRedirect;

        public BeaconLayoutException(String str) {
            super(str);
        }
    }

    public BeaconParser() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cec9fbfa384a03d6aa4ad3758b8a6b5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cec9fbfa384a03d6aa4ad3758b8a6b5e");
            return;
        }
        this.mIdentifierStartOffsets = new ArrayList();
        this.mIdentifierEndOffsets = new ArrayList();
        this.mIdentifierLittleEndianFlags = new ArrayList();
        this.mDataStartOffsets = new ArrayList();
        this.mDataEndOffsets = new ArrayList();
        this.mDataLittleEndianFlags = new ArrayList();
        this.mIdentifierVariableLengthFlags = new ArrayList();
        this.mServiceUuid128Bit = new byte[0];
        this.mAllowPduOverflow = Boolean.TRUE;
        this.mHardwareAssistManufacturers = new int[]{76};
        this.extraParsers = new ArrayList();
    }

    public BeaconParser(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80872f0b2a64eb7f076edefe210e8d01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80872f0b2a64eb7f076edefe210e8d01");
            return;
        }
        this.mIdentifierStartOffsets = new ArrayList();
        this.mIdentifierEndOffsets = new ArrayList();
        this.mIdentifierLittleEndianFlags = new ArrayList();
        this.mDataStartOffsets = new ArrayList();
        this.mDataEndOffsets = new ArrayList();
        this.mDataLittleEndianFlags = new ArrayList();
        this.mIdentifierVariableLengthFlags = new ArrayList();
        this.mServiceUuid128Bit = new byte[0];
        this.mAllowPduOverflow = Boolean.TRUE;
        this.mHardwareAssistManufacturers = new int[]{76};
        this.extraParsers = new ArrayList();
        this.mIdentifier = str;
    }

    private String byteArrayToFormattedString(byte[] bArr, int i, int i2, boolean z) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba9dbab055b09c9a682201b87d3049b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba9dbab055b09c9a682201b87d3049b2");
        }
        int i3 = i2 - i;
        int i4 = i3 + 1;
        byte[] bArr2 = new byte[i4];
        if (z) {
            for (int i5 = 0; i5 <= i3; i5++) {
                bArr2[i5] = bArr[((i + bArr2.length) - 1) - i5];
            }
        } else {
            for (int i6 = 0; i6 <= i3; i6++) {
                bArr2[i6] = bArr[i + i6];
            }
        }
        if (i4 < 5) {
            long j = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                j += (bArr2[(i4 - i7) - 1] & 255) * ((long) Math.pow(256.0d, i7 * 1.0d));
            }
            return Long.toString(j);
        }
        String bytesToHex = bytesToHex(bArr2);
        if (i4 != 16) {
            return "0x" + bytesToHex;
        }
        return bytesToHex.substring(0, 8) + CommonConstant.Symbol.MINUS + bytesToHex.substring(8, 12) + CommonConstant.Symbol.MINUS + bytesToHex.substring(12, 16) + CommonConstant.Symbol.MINUS + bytesToHex.substring(16, 20) + CommonConstant.Symbol.MINUS + bytesToHex.substring(20, 32);
    }

    private String byteArrayToString(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cce76c3ddf205d64c87a612bb72afb32", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cce76c3ddf205d64c87a612bb72afb32");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i])));
            sb.append(StringUtil.SPACE);
        }
        return sb.toString().trim();
    }

    private boolean byteArraysMatch(byte[] bArr, int i, byte[] bArr2) {
        Object[] objArr = {bArr, Integer.valueOf(i), bArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf95b8ce77617626f79aee6a7f7cae15", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf95b8ce77617626f79aee6a7f7cae15")).booleanValue();
        }
        int length = bArr2.length;
        if (bArr.length - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static String bytesToHex(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d2c5e35f99dabe6e30bf826fafea6814", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d2c5e35f99dabe6e30bf826fafea6814");
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = HEX_ARRAY[i2 >>> 4];
            cArr[i3 + 1] = HEX_ARRAY[i2 & 15];
        }
        return new String(cArr);
    }

    private int calculateLayoutSize() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afb349a5d2504e709429726f078506af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afb349a5d2504e709429726f078506af")).intValue();
        }
        if (this.mIdentifierEndOffsets != null) {
            for (Integer num : this.mIdentifierEndOffsets) {
                int intValue = num.intValue();
                if (intValue > i) {
                    i = intValue;
                }
            }
        }
        if (this.mDataEndOffsets != null) {
            for (Integer num2 : this.mDataEndOffsets) {
                int intValue2 = num2.intValue();
                if (intValue2 > i) {
                    i = intValue2;
                }
            }
        }
        if (this.mPowerEndOffset != null && this.mPowerEndOffset.intValue() > i) {
            i = this.mPowerEndOffset.intValue();
        }
        if (this.mServiceUuidEndOffset != null && this.mServiceUuidEndOffset.intValue() > i) {
            i = this.mServiceUuidEndOffset.intValue();
        }
        return i + 1;
    }

    @TargetApi(9)
    private byte[] ensureMaxSize(byte[] bArr, int i) {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "120c1ddea58bc88539d35af4b0107a09", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "120c1ddea58bc88539d35af4b0107a09") : bArr.length >= i ? bArr : Arrays.copyOf(bArr, i);
    }

    public static byte[] longToByteArray(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86f510ec95c28e1f37784275346670b2", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86f510ec95c28e1f37784275346670b2") : longToByteArray(j, i, true);
    }

    public static byte[] longToByteArray(long j, int i, boolean z) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "18b61b04feb672e6c062af144ce7c1d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "18b61b04feb672e6c062af144ce7c1d7");
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = ((i - (z ? i2 : (i - i2) - 1)) - 1) * 8;
            bArr[i2] = (byte) ((j & (255 << i3)) >> i3);
        }
        return bArr;
    }

    public boolean addExtraDataParser(BeaconParser beaconParser) {
        Object[] objArr = {beaconParser};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "293347df582b45cfb3dc7f2067c2ad61", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "293347df582b45cfb3dc7f2067c2ad61")).booleanValue() : beaconParser != null && beaconParser.mExtraFrame.booleanValue() && this.extraParsers.add(beaconParser);
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7780349b1a98289a948f278cd0b29b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7780349b1a98289a948f278cd0b29b5")).booleanValue();
        }
        try {
            BeaconParser beaconParser = (BeaconParser) obj;
            if (beaconParser.mBeaconLayout != null && beaconParser.mBeaconLayout.equals(this.mBeaconLayout) && beaconParser.mIdentifier != null) {
                if (beaconParser.mIdentifier.equals(this.mIdentifier)) {
                    return true;
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    @TargetApi(9)
    public byte[] getBeaconAdvertisementData(a aVar) {
        String str;
        StringBuilder sb;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a9e5e05d558c0ffef343e0bcc88d2f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a9e5e05d558c0ffef343e0bcc88d2f5");
        }
        if (aVar.f().size() != getIdentifierCount()) {
            throw new IllegalArgumentException("Beacon has " + aVar.f().size() + " identifiers but format requires " + getIdentifierCount());
        }
        int i = -1;
        if (this.mMatchingBeaconTypeCodeEndOffset != null && this.mMatchingBeaconTypeCodeEndOffset.intValue() >= 0) {
            i = this.mMatchingBeaconTypeCodeEndOffset.intValue();
        }
        if (this.mPowerEndOffset != null && this.mPowerEndOffset.intValue() > i) {
            i = this.mPowerEndOffset.intValue();
        }
        int i2 = i;
        for (int i3 = 0; i3 < this.mIdentifierEndOffsets.size(); i3++) {
            if (this.mIdentifierEndOffsets.get(i3) != null && this.mIdentifierEndOffsets.get(i3).intValue() > i2) {
                i2 = this.mIdentifierEndOffsets.get(i3).intValue();
            }
        }
        for (int i4 = 0; i4 < this.mDataEndOffsets.size(); i4++) {
            if (this.mDataEndOffsets.get(i4) != null && this.mDataEndOffsets.get(i4).intValue() > i2) {
                i2 = this.mDataEndOffsets.get(i4).intValue();
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.mIdentifierStartOffsets.size(); i6++) {
            if (this.mIdentifierVariableLengthFlags.get(i6).booleanValue()) {
                i5 = (i5 + aVar.a(i6).getByteCount()) - ((this.mIdentifierEndOffsets.get(i6).intValue() - this.mIdentifierStartOffsets.get(i6).intValue()) + 1);
            }
        }
        byte[] bArr = new byte[((i2 + i5) + 1) - 2];
        if (this.mMatchingBeaconTypeCodeEndOffset != null) {
            getMatchingBeaconTypeCode().longValue();
            for (int intValue = this.mMatchingBeaconTypeCodeStartOffset.intValue(); intValue <= this.mMatchingBeaconTypeCodeEndOffset.intValue(); intValue++) {
                bArr[intValue - 2] = (byte) ((getMatchingBeaconTypeCode().longValue() >> ((this.mMatchingBeaconTypeCodeEndOffset.intValue() - intValue) * 8)) & 255);
            }
        }
        for (int i7 = 0; i7 < this.mIdentifierStartOffsets.size(); i7++) {
            byte[] byteArrayOfSpecifiedEndianness = aVar.a(i7).toByteArrayOfSpecifiedEndianness(!this.mIdentifierLittleEndianFlags.get(i7).booleanValue());
            if (byteArrayOfSpecifiedEndianness.length < getIdentifierByteCount(i7)) {
                if (!this.mIdentifierVariableLengthFlags.get(i7).booleanValue()) {
                    if (this.mIdentifierLittleEndianFlags.get(i7).booleanValue()) {
                        byteArrayOfSpecifiedEndianness = Arrays.copyOf(byteArrayOfSpecifiedEndianness, getIdentifierByteCount(i7));
                    } else {
                        byte[] bArr2 = new byte[getIdentifierByteCount(i7)];
                        System.arraycopy(byteArrayOfSpecifiedEndianness, 0, bArr2, getIdentifierByteCount(i7) - byteArrayOfSpecifiedEndianness.length, byteArrayOfSpecifiedEndianness.length);
                        byteArrayOfSpecifiedEndianness = bArr2;
                    }
                }
                str = TAG;
                sb = new StringBuilder("Expanded identifier because it is too short.  It is now: ");
            } else if (byteArrayOfSpecifiedEndianness.length > getIdentifierByteCount(i7)) {
                byteArrayOfSpecifiedEndianness = this.mIdentifierLittleEndianFlags.get(i7).booleanValue() ? Arrays.copyOfRange(byteArrayOfSpecifiedEndianness, getIdentifierByteCount(i7) - byteArrayOfSpecifiedEndianness.length, getIdentifierByteCount(i7)) : Arrays.copyOf(byteArrayOfSpecifiedEndianness, getIdentifierByteCount(i7));
                str = TAG;
                sb = new StringBuilder("Truncated identifier because it is too long.  It is now: ");
            } else {
                str = TAG;
                sb = new StringBuilder("Identifier size is just right: ");
            }
            sb.append(byteArrayToString(byteArrayOfSpecifiedEndianness));
            com.meituan.android.common.locate.altbeacon.beacon.util.c.a(str, sb.toString(), new Object[0]);
            for (int intValue2 = this.mIdentifierStartOffsets.get(i7).intValue(); intValue2 <= (this.mIdentifierStartOffsets.get(i7).intValue() + byteArrayOfSpecifiedEndianness.length) - 1; intValue2++) {
                bArr[intValue2 - 2] = byteArrayOfSpecifiedEndianness[intValue2 - this.mIdentifierStartOffsets.get(i7).intValue()];
            }
        }
        if (this.mPowerStartOffset != null && this.mPowerEndOffset != null && this.mPowerStartOffset.intValue() >= 2) {
            for (int intValue3 = this.mPowerStartOffset.intValue(); intValue3 <= this.mPowerEndOffset.intValue(); intValue3++) {
                bArr[intValue3 - 2] = (byte) ((aVar.g() >> ((intValue3 - this.mPowerStartOffset.intValue()) * 8)) & 255);
            }
        }
        for (int i8 = 0; i8 < this.mDataStartOffsets.size(); i8++) {
            long longValue = aVar.e().get(i8).longValue();
            int intValue4 = this.mDataEndOffsets.get(i8).intValue() - this.mDataStartOffsets.get(i8).intValue();
            for (int i9 = 0; i9 <= intValue4; i9++) {
                bArr[(this.mDataStartOffsets.get(i8).intValue() - 2) + (!this.mDataLittleEndianFlags.get(i8).booleanValue() ? intValue4 - i9 : i9)] = (byte) ((longValue >> (i9 * 8)) & 255);
            }
        }
        return bArr;
    }

    public int getDataFieldCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fcd8982a73d0cbf5f0539ca7ba6d82a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fcd8982a73d0cbf5f0539ca7ba6d82a")).intValue() : this.mDataStartOffsets.size();
    }

    public List<BeaconParser> getExtraDataParsers() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "557a333738c39d7257648130ceee7932", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "557a333738c39d7257648130ceee7932") : new ArrayList(this.extraParsers);
    }

    public int[] getHardwareAssistManufacturers() {
        return this.mHardwareAssistManufacturers;
    }

    public String getIdentifier() {
        return this.mIdentifier;
    }

    public int getIdentifierByteCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12da6101967b52a446f36df839c234f3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12da6101967b52a446f36df839c234f3")).intValue() : (this.mIdentifierEndOffsets.get(i).intValue() - this.mIdentifierStartOffsets.get(i).intValue()) + 1;
    }

    public int getIdentifierCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7098952156fc62e941e15377261a009d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7098952156fc62e941e15377261a009d")).intValue() : this.mIdentifierStartOffsets.size();
    }

    public String getLayout() {
        return this.mBeaconLayout;
    }

    public int getMServiceUuidStartOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65946c3fcdc5c17f48fffc279f6c852b", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65946c3fcdc5c17f48fffc279f6c852b") : this.mServiceUuidStartOffset).intValue();
    }

    public Long getMatchingBeaconTypeCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e4597e730eedf9058bb9dc5fae5994a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e4597e730eedf9058bb9dc5fae5994a");
        }
        if (this.mMatchingBeaconTypeCode == null) {
            return -1L;
        }
        return this.mMatchingBeaconTypeCode;
    }

    public int getMatchingBeaconTypeCodeEndOffset() {
        Integer num;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f68e250af8237a46564a266e619947a5", RobustBitConfig.DEFAULT_VALUE)) {
            num = (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f68e250af8237a46564a266e619947a5");
        } else if (this.mMatchingBeaconTypeCodeEndOffset == null) {
            return -1;
        } else {
            num = this.mMatchingBeaconTypeCodeEndOffset;
        }
        return num.intValue();
    }

    public int getMatchingBeaconTypeCodeStartOffset() {
        Integer num;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd879d154dbdea6ebe6e0c1442e4ab24", RobustBitConfig.DEFAULT_VALUE)) {
            num = (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd879d154dbdea6ebe6e0c1442e4ab24");
        } else if (this.mMatchingBeaconTypeCodeStartOffset == null) {
            return -1;
        } else {
            num = this.mMatchingBeaconTypeCodeStartOffset;
        }
        return num.intValue();
    }

    public int getPowerCorrection() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a46f9e62ad828bc4d710b567e9b61c3c", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a46f9e62ad828bc4d710b567e9b61c3c") : this.mDBmCorrection).intValue();
    }

    public Long getServiceUuid() {
        return this.mServiceUuid;
    }

    public byte[] getServiceUuid128Bit() {
        return this.mServiceUuid128Bit;
    }

    public int getServiceUuidEndOffset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28dba005270ac54d39a29451824d8a1f", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28dba005270ac54d39a29451824d8a1f") : this.mServiceUuidEndOffset).intValue();
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cca9c78c7beaf99a8d2cc373634495e3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cca9c78c7beaf99a8d2cc373634495e3")).intValue() : Arrays.hashCode(new Object[]{this.mMatchingBeaconTypeCode, this.mIdentifierStartOffsets, this.mIdentifierEndOffsets, this.mIdentifierLittleEndianFlags, this.mDataStartOffsets, this.mDataEndOffsets, this.mDataLittleEndianFlags, this.mIdentifierVariableLengthFlags, this.mMatchingBeaconTypeCodeStartOffset, this.mMatchingBeaconTypeCodeEndOffset, this.mServiceUuidStartOffset, this.mServiceUuidEndOffset, this.mServiceUuid, this.mServiceUuid128Bit, this.mExtraFrame, this.mPowerStartOffset, this.mPowerEndOffset, this.mDBmCorrection, this.mLayoutSize, this.mAllowPduOverflow, this.mIdentifier, this.mHardwareAssistManufacturers, this.extraParsers});
    }

    public void setAllowPduOverflow(Boolean bool) {
        this.mAllowPduOverflow = bool;
    }

    public BeaconParser setBeaconLayout(String str) {
        int i;
        String str2;
        int i2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "758e4261d4d19b82ca2aa9e61b8087e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (BeaconParser) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "758e4261d4d19b82ca2aa9e61b8087e4");
        }
        this.mBeaconLayout = str;
        new StringBuilder("Parsing beacon layout: ").append(str);
        String[] split = str.split(CommonConstant.Symbol.COMMA);
        this.mExtraFrame = Boolean.FALSE;
        for (String str3 : split) {
            Matcher matcher = I_PATTERN.matcher(str3);
            boolean z = false;
            while (true) {
                i = 3;
                if (!matcher.find()) {
                    break;
                }
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    this.mIdentifierLittleEndianFlags.add(Boolean.valueOf(matcher.group(3).contains("l")));
                    this.mIdentifierVariableLengthFlags.add(Boolean.valueOf(matcher.group(3).contains("v")));
                    this.mIdentifierStartOffsets.add(Integer.valueOf(parseInt));
                    this.mIdentifierEndOffsets.add(Integer.valueOf(parseInt2));
                    z = true;
                } catch (NumberFormatException unused) {
                    throw new BeaconLayoutException("Cannot parse integer byte offset in term: " + str3);
                }
            }
            Matcher matcher2 = D_PATTERN.matcher(str3);
            while (matcher2.find()) {
                try {
                    int parseInt3 = Integer.parseInt(matcher2.group(1));
                    int parseInt4 = Integer.parseInt(matcher2.group(2));
                    this.mDataLittleEndianFlags.add(Boolean.valueOf(matcher2.group(3).contains("l")));
                    this.mDataStartOffsets.add(Integer.valueOf(parseInt3));
                    this.mDataEndOffsets.add(Integer.valueOf(parseInt4));
                    z = true;
                } catch (NumberFormatException unused2) {
                    throw new BeaconLayoutException("Cannot parse integer byte offset in term: " + str3);
                }
            }
            Matcher matcher3 = P_PATTERN.matcher(str3);
            while (matcher3.find()) {
                try {
                    if (matcher3.group(1) != null && matcher3.group(2) != null) {
                        int parseInt5 = Integer.parseInt(matcher3.group(1));
                        int parseInt6 = Integer.parseInt(matcher3.group(2));
                        this.mPowerStartOffset = Integer.valueOf(parseInt5);
                        this.mPowerEndOffset = Integer.valueOf(parseInt6);
                    }
                    if (matcher3.group(3) != null) {
                        str2 = matcher3.group(3);
                        try {
                            i2 = Integer.parseInt(str2);
                        } catch (NumberFormatException unused3) {
                            throw new BeaconLayoutException("Cannot parse integer power byte offset (" + str2 + ") in term: " + str3);
                        }
                    } else {
                        str2 = "none";
                        i2 = 0;
                    }
                    this.mDBmCorrection = Integer.valueOf(i2);
                    z = true;
                } catch (NumberFormatException unused4) {
                    str2 = "none";
                }
            }
            Matcher matcher4 = M_PATTERN.matcher(str3);
            while (matcher4.find()) {
                try {
                    int parseInt7 = Integer.parseInt(matcher4.group(1));
                    int parseInt8 = Integer.parseInt(matcher4.group(2));
                    this.mMatchingBeaconTypeCodeStartOffset = Integer.valueOf(parseInt7);
                    this.mMatchingBeaconTypeCodeEndOffset = Integer.valueOf(parseInt8);
                    String group = matcher4.group(3);
                    try {
                        this.mMatchingBeaconTypeCode = Long.decode("0x" + group);
                        z = true;
                    } catch (NumberFormatException unused5) {
                        throw new BeaconLayoutException("Cannot parse beacon type code: " + group + " in term: " + str3);
                    }
                } catch (NumberFormatException unused6) {
                    throw new BeaconLayoutException("Cannot parse integer byte offset in term: " + str3);
                }
            }
            Matcher matcher5 = S_PATTERN.matcher(str3);
            while (matcher5.find()) {
                try {
                    int parseInt9 = Integer.parseInt(matcher5.group(1));
                    int parseInt10 = Integer.parseInt(matcher5.group(2));
                    this.mServiceUuidStartOffset = Integer.valueOf(parseInt9);
                    this.mServiceUuidEndOffset = Integer.valueOf(parseInt10);
                    String group2 = matcher5.group(i);
                    if ((this.mServiceUuidEndOffset.intValue() - this.mServiceUuidStartOffset.intValue()) + 1 == 2) {
                        try {
                            this.mServiceUuid = Long.decode("0x" + group2);
                        } catch (NumberFormatException unused7) {
                            throw new BeaconLayoutException("Cannot parse serviceUuid: " + group2 + " in term: " + str3);
                        }
                    } else if ((this.mServiceUuidEndOffset.intValue() - this.mServiceUuidStartOffset.intValue()) + 1 != 16) {
                        throw new BeaconLayoutException("Cannot parse serviceUuid -- it must be 2 bytes or 16 bytes long: " + group2 + " in term: " + str3);
                    } else {
                        String replace = group2.replace(CommonConstant.Symbol.MINUS, "");
                        if (replace.length() != 32) {
                            throw new BeaconLayoutException("128-bit ServiceUuid must be 16 bytes long: " + group2 + " in term: " + str3);
                        }
                        this.mServiceUuid128Bit = new byte[16];
                        for (int i3 = 0; i3 < 16; i3++) {
                            int i4 = i3 * 2;
                            String substring = replace.substring(i4, i4 + 2);
                            try {
                                this.mServiceUuid128Bit[15 - i3] = (byte) Integer.parseInt(substring, 16);
                            } catch (NumberFormatException unused8) {
                                throw new BeaconLayoutException("Cannot parse serviceUuid byte " + substring + " in term: " + str3);
                            }
                        }
                        continue;
                    }
                    z = true;
                    i = 3;
                } catch (NumberFormatException unused9) {
                    throw new BeaconLayoutException("Cannot parse integer byte offset in term: " + str3);
                }
            }
            Matcher matcher6 = X_PATTERN.matcher(str3);
            while (matcher6.find()) {
                this.mExtraFrame = Boolean.TRUE;
                z = true;
            }
            if (!z) {
                com.meituan.android.common.locate.altbeacon.beacon.util.c.a(TAG, "cannot parse term %s", str3);
                throw new BeaconLayoutException("Cannot parse beacon layout term: " + str3);
            }
        }
        this.mLayoutSize = Integer.valueOf(calculateLayoutSize());
        return this;
    }

    public void setHardwareAssistManufacturerCodes(int[] iArr) {
        this.mHardwareAssistManufacturers = iArr;
    }

    public BeaconParser setMatchingBeaconTypeCode(Long l) {
        this.mMatchingBeaconTypeCode = l;
        return this;
    }
}
