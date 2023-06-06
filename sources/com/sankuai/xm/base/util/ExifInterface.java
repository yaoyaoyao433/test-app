package com.sankuai.xm.base.util;

import android.content.res.AssetManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.view.InputDeviceCompat;
import android.util.Log;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.common.utils.shortcut.ShortcutUtils;
import com.tencent.smtt.sdk.TbsListener;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ExifInterface {
    private static final Pattern Y;
    private static final Pattern Z;
    public static ChangeQuickRedirect a;
    private static SimpleDateFormat s;
    private String M;
    private AssetManager.AssetInputStream N;
    private final HashMap<String, c>[] O;
    private ByteOrder P;
    private boolean Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    InputStream j;
    int k;
    byte[] l;
    int m;
    boolean n;
    private static final List<Integer> o = Arrays.asList(1, 6, 3, 8);
    private static final List<Integer> p = Arrays.asList(2, 7, 4, 5);
    public static final int[] b = {8, 8, 8};
    public static final int[] c = {4};
    public static final int[] d = {8};
    public static final byte[] e = {-1, -40, -1};
    private static final byte[] q = {79, 76, 89, 77, 80, 0};
    private static final byte[] r = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final String[] f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final int[] g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    private static final byte[] t = {65, 83, 67, 73, 73, 0, 0, 0};
    private static final d[] u = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256), new d("ImageLength", 257), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", (int) ShortcutUtils.SHORTCUT_TYPE_ENABLE, 2), new d("StripOffsets", 273), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278), new d("StripByteCounts", 279), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", (int) TbsListener.ErrorCode.THROWABLE_QBSDK_INIT, 2), new d("Artist", 315, 2), new d("WhitePoint", (int) TbsListener.ErrorCode.ERROR_QBSDK_INIT_ISSUPPORT, 5), new d("PrimaryChromaticities", (int) TbsListener.ErrorCode.ERROR_QBSDK_INIT_CANLOADX5, 5), new d("SubIFDPointer", (int) TbsListener.ErrorCode.ERROR_QBSDK_INIT_ERROR_RET_TYPE_NOT_BUNDLE, 4), new d("JPEGInterchangeFormat", (int) InputDeviceCompat.SOURCE_DPAD, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7)};
    private static final d[] v = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962), new d("PixelYDimension", 40963), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720)};
    private static final d[] w = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3)};
    private static final d[] x = {new d("InteroperabilityIndex", 1, 2)};
    private static final d[] y = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256), new d("ThumbnailImageLength", 257), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", (int) ShortcutUtils.SHORTCUT_TYPE_ENABLE, 2), new d("StripOffsets", 273), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278), new d("StripByteCounts", 279), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", (int) TbsListener.ErrorCode.THROWABLE_QBSDK_INIT, 2), new d("Artist", 315, 2), new d("WhitePoint", (int) TbsListener.ErrorCode.ERROR_QBSDK_INIT_ISSUPPORT, 5), new d("PrimaryChromaticities", (int) TbsListener.ErrorCode.ERROR_QBSDK_INIT_CANLOADX5, 5), new d("SubIFDPointer", (int) TbsListener.ErrorCode.ERROR_QBSDK_INIT_ERROR_RET_TYPE_NOT_BUNDLE, 4), new d("JPEGInterchangeFormat", (int) InputDeviceCompat.SOURCE_DPAD, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720)};
    private static final d z = new d("StripOffsets", 273, 3);
    private static final d[] A = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
    private static final d[] B = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
    private static final d[] C = {new d("AspectFrame", 4371, 3)};
    private static final d[] D = {new d("ColorSpace", 55, 3)};
    public static final d[][] h = {u, v, w, x, y, u, A, B, C, D};
    private static final d[] E = {new d("SubIFDPointer", (int) TbsListener.ErrorCode.ERROR_QBSDK_INIT_ERROR_RET_TYPE_NOT_BUNDLE, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
    private static final d F = new d("JPEGInterchangeFormat", (int) InputDeviceCompat.SOURCE_DPAD, 4);
    private static final d G = new d("JPEGInterchangeFormatLength", 514, 4);
    private static final HashMap<Integer, d>[] H = new HashMap[h.length];
    private static final HashMap<String, d>[] I = new HashMap[h.length];
    private static final HashSet<String> J = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
    private static final HashMap<Integer, Integer> K = new HashMap<>();
    private static final Charset L = Charset.forName("US-ASCII");
    public static final byte[] i = "Exif\u0000\u0000".getBytes(L);

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes6.dex */
    public @interface IfdType {
    }

    static {
        d[] dVarArr;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        s = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i2 = 0; i2 < h.length; i2++) {
            H[i2] = new HashMap<>();
            I[i2] = new HashMap<>();
            for (d dVar : h[i2]) {
                H[i2].put(Integer.valueOf(dVar.b), dVar);
                I[i2].put(dVar.c, dVar);
            }
        }
        K.put(Integer.valueOf(E[0].b), 5);
        K.put(Integer.valueOf(E[1].b), 1);
        K.put(Integer.valueOf(E[2].b), 2);
        K.put(Integer.valueOf(E[3].b), 3);
        K.put(Integer.valueOf(E[4].b), 7);
        K.put(Integer.valueOf(E[5].b), 8);
        Y = Pattern.compile(".*[1-9].*");
        Z = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class e {
        public static ChangeQuickRedirect a;
        public final long b;
        public final long c;

        private e(double d) {
            this((long) (10000.0d * d), 10000L);
            Object[] objArr = {Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d61c7d8ed4ed700955bda2623bf89961", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d61c7d8ed4ed700955bda2623bf89961");
            }
        }

        private e(long j, long j2) {
            Object[] objArr = {new Long(j), new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a360182f74cd8ac6486458d3617808df", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a360182f74cd8ac6486458d3617808df");
            } else if (j2 == 0) {
                this.b = 0L;
                this.c = 1L;
            } else {
                this.b = j;
                this.c = j2;
            }
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb8369d90f51b31ce7b10dd39f0e7302", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb8369d90f51b31ce7b10dd39f0e7302");
            }
            return this.b + "/" + this.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public final int b;
        public final int c;
        public final byte[] d;

        public c(int i, int i2, byte[] bArr) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), bArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "426c4c3dbc012af4ed68f8c23bfe20d7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "426c4c3dbc012af4ed68f8c23bfe20d7");
                return;
            }
            this.b = i;
            this.c = i2;
            this.d = bArr;
        }

        public static c a(int[] iArr, ByteOrder byteOrder) {
            Object[] objArr = {iArr, byteOrder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6401c7fe7fe83549e3f957924a5e8bb0", 6917529027641081856L)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6401c7fe7fe83549e3f957924a5e8bb0");
            }
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.g[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new c(3, iArr.length, wrap.array());
        }

        public static c a(int i, ByteOrder byteOrder) {
            Object[] objArr = {Integer.valueOf(i), byteOrder};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a2b8c548d4d80b91da472718fad32a5", 6917529027641081856L) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a2b8c548d4d80b91da472718fad32a5") : a(new int[]{i}, byteOrder);
        }

        public static c a(long[] jArr, ByteOrder byteOrder) {
            Object[] objArr = {jArr, byteOrder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15350f2e13ee8c23a0a136db1711a197", 6917529027641081856L)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15350f2e13ee8c23a0a136db1711a197");
            }
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.g[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new c(4, jArr.length, wrap.array());
        }

        public static c a(long j, ByteOrder byteOrder) {
            Object[] objArr = {new Long(j), byteOrder};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44515cdecdfcbc5a89df7b9120efdd8e", 6917529027641081856L) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44515cdecdfcbc5a89df7b9120efdd8e") : a(new long[]{j}, byteOrder);
        }

        public static c b(int[] iArr, ByteOrder byteOrder) {
            Object[] objArr = {iArr, byteOrder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f64902ed99105ce21ef1870f1788dcc6", 6917529027641081856L)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f64902ed99105ce21ef1870f1788dcc6");
            }
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.g[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putInt(i);
            }
            return new c(9, iArr.length, wrap.array());
        }

        public static c a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d2dd881446d0d7a732e45450da7347f", 6917529027641081856L)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d2dd881446d0d7a732e45450da7347f");
            }
            byte[] bytes = (str + (char) 0).getBytes(ExifInterface.L);
            return new c(2, bytes.length, bytes);
        }

        public static c a(e[] eVarArr, ByteOrder byteOrder) {
            Object[] objArr = {eVarArr, byteOrder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "575b750a459ae44ec3614169ca55119f", 6917529027641081856L)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "575b750a459ae44ec3614169ca55119f");
            }
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.g[5] * eVarArr.length]);
            wrap.order(byteOrder);
            for (e eVar : eVarArr) {
                wrap.putInt((int) eVar.b);
                wrap.putInt((int) eVar.c);
            }
            return new c(5, eVarArr.length, wrap.array());
        }

        public static c a(e eVar, ByteOrder byteOrder) {
            Object[] objArr = {eVar, byteOrder};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a837d43db8a82952d9d8634b58d3e23", 6917529027641081856L) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a837d43db8a82952d9d8634b58d3e23") : a(new e[]{eVar}, byteOrder);
        }

        public static c b(e[] eVarArr, ByteOrder byteOrder) {
            Object[] objArr = {eVarArr, byteOrder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ad4402b672f081300f1a01f37257f2f", 6917529027641081856L)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ad4402b672f081300f1a01f37257f2f");
            }
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.g[10] * eVarArr.length]);
            wrap.order(byteOrder);
            for (e eVar : eVarArr) {
                wrap.putInt((int) eVar.b);
                wrap.putInt((int) eVar.c);
            }
            return new c(10, eVarArr.length, wrap.array());
        }

        public static c a(double[] dArr, ByteOrder byteOrder) {
            Object[] objArr = {dArr, byteOrder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa7db32b60497becf94daa6e2a72570c", 6917529027641081856L)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa7db32b60497becf94daa6e2a72570c");
            }
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.g[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d : dArr) {
                wrap.putDouble(d);
            }
            return new c(12, dArr.length, wrap.array());
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16a0d3125bc0b246e08cb5651f97a510", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16a0d3125bc0b246e08cb5651f97a510");
            }
            return CommonConstant.Symbol.BRACKET_LEFT + ExifInterface.f[this.b] + ", data length:" + this.d.length + CommonConstant.Symbol.BRACKET_RIGHT;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:183:0x0204 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object a(java.nio.ByteOrder r13) {
            /*
                Method dump skipped, instructions count: 558
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.util.ExifInterface.c.a(java.nio.ByteOrder):java.lang.Object");
        }

        public final int b(ByteOrder byteOrder) {
            Object[] objArr = {byteOrder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ff134ed76e551b5ec738048b9a464e8", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ff134ed76e551b5ec738048b9a464e8")).intValue();
            }
            Object a2 = a(byteOrder);
            if (a2 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (a2 instanceof String) {
                return Integer.parseInt((String) a2);
            }
            if (a2 instanceof long[]) {
                long[] jArr = (long[]) a2;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (a2 instanceof int[]) {
                int[] iArr = (int[]) a2;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }

        public final String c(ByteOrder byteOrder) {
            int i = 0;
            Object[] objArr = {byteOrder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f625c9c2f1703d898cb8fff4c238b512", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f625c9c2f1703d898cb8fff4c238b512");
            }
            Object a2 = a(byteOrder);
            if (a2 == null) {
                return null;
            }
            if (a2 instanceof String) {
                return (String) a2;
            }
            StringBuilder sb = new StringBuilder();
            if (a2 instanceof long[]) {
                long[] jArr = (long[]) a2;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(CommonConstant.Symbol.COMMA);
                    }
                }
                return sb.toString();
            } else if (a2 instanceof int[]) {
                int[] iArr = (int[]) a2;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(CommonConstant.Symbol.COMMA);
                    }
                }
                return sb.toString();
            } else if (a2 instanceof double[]) {
                double[] dArr = (double[]) a2;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(CommonConstant.Symbol.COMMA);
                    }
                }
                return sb.toString();
            } else if (a2 instanceof e[]) {
                e[] eVarArr = (e[]) a2;
                while (i < eVarArr.length) {
                    sb.append(eVarArr[i].b);
                    sb.append('/');
                    sb.append(eVarArr[i].c);
                    i++;
                    if (i != eVarArr.length) {
                        sb.append(CommonConstant.Symbol.COMMA);
                    }
                }
                return sb.toString();
            } else {
                return null;
            }
        }

        public final int a() {
            return ExifInterface.g[this.b] * this.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class d {
        public static ChangeQuickRedirect a;
        public final int b;
        public final String c;
        public final int d;
        public final int e;

        private d(String str, int i, int i2) {
            Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad9510af3047da1eec1193567400593b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad9510af3047da1eec1193567400593b");
                return;
            }
            this.c = str;
            this.b = i;
            this.d = i2;
            this.e = -1;
        }

        private d(String str, int i, int i2, int i3) {
            Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d40dc651a5723be42674f29bbeeb3c88", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d40dc651a5723be42674f29bbeeb3c88");
                return;
            }
            this.c = str;
            this.b = i;
            this.d = i2;
            this.e = i3;
        }

        boolean a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee0dc3583c36da962a4a86ad1b1cea0b", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee0dc3583c36da962a4a86ad1b1cea0b")).booleanValue();
            }
            if (this.d == 7 || i == 7 || this.d == i || this.e == i) {
                return true;
            }
            if ((this.d == 4 || this.e == 4) && i == 3) {
                return true;
            }
            if ((this.d == 9 || this.e == 9) && i == 8) {
                return true;
            }
            return (this.d == 12 || this.e == 12) && i == 11;
        }
    }

    public ExifInterface(@NonNull String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b364719fba279c250f321cf3160d6db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b364719fba279c250f321cf3160d6db");
            return;
        }
        this.O = new HashMap[h.length];
        this.P = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new IllegalArgumentException("filename cannot be null");
        }
        if (str.startsWith(k.d)) {
            InputStream inputStream = null;
            this.j = null;
            this.N = null;
            this.M = str;
            try {
                InputStream q2 = k.q(str);
                try {
                    b(q2);
                    a((Closeable) q2);
                } catch (Throwable th) {
                    inputStream = q2;
                    th = th;
                    a((Closeable) inputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            a(k.q(str));
        }
    }

    public ExifInterface(@NonNull InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82350e43dea015a772f74d5450ac26e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82350e43dea015a772f74d5450ac26e3");
            return;
        }
        this.O = new HashMap[h.length];
        this.P = ByteOrder.BIG_ENDIAN;
        a(inputStream);
    }

    private void a(@NonNull InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e70089dc4c287a5fd150f9ecb8c7e92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e70089dc4c287a5fd150f9ecb8c7e92");
        } else if (inputStream == null) {
            throw new IllegalArgumentException("inputStream cannot be null");
        } else {
            this.M = null;
            this.j = inputStream;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.N = (AssetManager.AssetInputStream) inputStream;
            } else {
                this.N = null;
            }
            b(inputStream);
        }
    }

    @Nullable
    private c a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "038ec638a812aec43cfc4659bf1de418", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "038ec638a812aec43cfc4659bf1de418");
        }
        for (int i2 = 0; i2 < h.length; i2++) {
            c cVar = this.O[i2].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    @Nullable
    private String b(@NonNull String str) {
        double doubleValue;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2447f85781f21942e971bef61248f934", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2447f85781f21942e971bef61248f934");
        }
        c a2 = a(str);
        if (a2 != null) {
            if (!J.contains(str)) {
                return a2.c(this.P);
            }
            if (str.equals("GPSTimeStamp")) {
                if (a2.b != 5 && a2.b != 10) {
                    new StringBuilder("GPS Timestamp format is not rational. format=").append(a2.b);
                    return null;
                }
                e[] eVarArr = (e[]) a2.a(this.P);
                if (eVarArr == null || eVarArr.length != 3) {
                    new StringBuilder("Invalid GPS Timestamp array. array=").append(Arrays.toString(eVarArr));
                    return null;
                }
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) eVarArr[0].b) / ((float) eVarArr[0].c))), Integer.valueOf((int) (((float) eVarArr[1].b) / ((float) eVarArr[1].c))), Integer.valueOf((int) (((float) eVarArr[2].b) / ((float) eVarArr[2].c))));
            }
            try {
                ByteOrder byteOrder = this.P;
                Object[] objArr2 = {byteOrder};
                ChangeQuickRedirect changeQuickRedirect2 = c.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "9bf415e0657672e5e1fa82c1b9936928", 6917529027641081856L)) {
                    doubleValue = ((Double) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "9bf415e0657672e5e1fa82c1b9936928")).doubleValue();
                } else {
                    Object a3 = a2.a(byteOrder);
                    if (a3 == null) {
                        throw new NumberFormatException("NULL can't be converted to a double value");
                    }
                    if (a3 instanceof String) {
                        doubleValue = Double.parseDouble((String) a3);
                    } else if (a3 instanceof long[]) {
                        long[] jArr = (long[]) a3;
                        if (jArr.length == 1) {
                            doubleValue = jArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (a3 instanceof int[]) {
                        int[] iArr = (int[]) a3;
                        if (iArr.length == 1) {
                            doubleValue = iArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (a3 instanceof double[]) {
                        double[] dArr = (double[]) a3;
                        if (dArr.length == 1) {
                            doubleValue = dArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (a3 instanceof e[]) {
                        e[] eVarArr2 = (e[]) a3;
                        if (eVarArr2.length == 1) {
                            e eVar = eVarArr2[0];
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = e.a;
                            doubleValue = PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "9a24406ec56dbcbaf8a24694bb717e61", 6917529027641081856L) ? ((Double) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "9a24406ec56dbcbaf8a24694bb717e61")).doubleValue() : eVar.b / eVar.c;
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else {
                        throw new NumberFormatException("Couldn't find a double value");
                    }
                }
                return Double.toString(doubleValue);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public final int a(@NonNull String str, int i2) {
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "740a4444b53f7fc272303c468c526735", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "740a4444b53f7fc272303c468c526735")).intValue();
        }
        c a2 = a(str);
        if (a2 == null) {
            return 0;
        }
        try {
            return a2.b(this.P);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final void a(@NonNull String str, @Nullable String str2) {
        String str3;
        d dVar;
        int i2;
        c cVar;
        Matcher matcher;
        int i3 = 2;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "568aeb43b64e6deb3e7a1de97d104449", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "568aeb43b64e6deb3e7a1de97d104449");
            return;
        }
        if (str2 == null || !J.contains(str)) {
            str3 = str2;
        } else if (str.equals("GPSTimeStamp")) {
            if (!Z.matcher(str2).find()) {
                StringBuilder sb = new StringBuilder("Invalid value for ");
                sb.append(str);
                sb.append(" : ");
                sb.append(str2);
                return;
            }
            str3 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
        } else {
            try {
                str3 = new e(Double.parseDouble(str2)).toString();
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder("Invalid value for ");
                sb2.append(str);
                sb2.append(" : ");
                sb2.append(str2);
                return;
            }
        }
        int i4 = 0;
        while (i4 < h.length) {
            if ((i4 != 4 || this.Q) && (dVar = I[i4].get(str)) != null) {
                if (str3 == null) {
                    this.O[i4].remove(str);
                } else {
                    Pair<Integer, Integer> d2 = d(str3);
                    if (dVar.d == ((Integer) d2.first).intValue() || dVar.d == ((Integer) d2.second).intValue()) {
                        i2 = dVar.d;
                    } else if (dVar.e != -1 && (dVar.e == ((Integer) d2.first).intValue() || dVar.e == ((Integer) d2.second).intValue())) {
                        i2 = dVar.e;
                    } else if (dVar.d == 1 || dVar.d == 7 || dVar.d == i3) {
                        i2 = dVar.d;
                    } else {
                        StringBuilder sb3 = new StringBuilder("Given tag (");
                        sb3.append(str);
                        sb3.append(") value didn't match with one of expected formats: ");
                        sb3.append(f[dVar.d]);
                        sb3.append(dVar.e == -1 ? "" : ", " + f[dVar.e]);
                        sb3.append(" (guess: ");
                        sb3.append(f[((Integer) d2.first).intValue()]);
                        sb3.append(((Integer) d2.second).intValue() == -1 ? "" : ", " + f[((Integer) d2.second).intValue()]);
                        sb3.append(CommonConstant.Symbol.BRACKET_RIGHT);
                    }
                    switch (i2) {
                        case 1:
                            HashMap<String, c> hashMap = this.O[i4];
                            Object[] objArr2 = {str3};
                            ChangeQuickRedirect changeQuickRedirect2 = c.a;
                            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d5a58d39723adf91f023ecfb24e15c6d", 6917529027641081856L)) {
                                cVar = (c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d5a58d39723adf91f023ecfb24e15c6d");
                            } else if (str3.length() == 1 && str3.charAt(0) >= '0' && str3.charAt(0) <= '1') {
                                cVar = new c(1, 1, new byte[]{(byte) (str3.charAt(0) - '0')});
                            } else {
                                byte[] bytes = str3.getBytes(L);
                                cVar = new c(1, bytes.length, bytes);
                            }
                            hashMap.put(str, cVar);
                            continue;
                        case 2:
                        case 7:
                            this.O[i4].put(str, c.a(str3));
                            continue;
                        case 3:
                            String[] split = str3.split(CommonConstant.Symbol.COMMA);
                            int[] iArr = new int[split.length];
                            for (int i5 = 0; i5 < split.length; i5++) {
                                iArr[i5] = Integer.parseInt(split[i5]);
                            }
                            this.O[i4].put(str, c.a(iArr, this.P));
                            continue;
                        case 4:
                            String[] split2 = str3.split(CommonConstant.Symbol.COMMA);
                            long[] jArr = new long[split2.length];
                            for (int i6 = 0; i6 < split2.length; i6++) {
                                jArr[i6] = Long.parseLong(split2[i6]);
                            }
                            this.O[i4].put(str, c.a(jArr, this.P));
                            continue;
                        case 5:
                            String[] split3 = str3.split(CommonConstant.Symbol.COMMA);
                            e[] eVarArr = new e[split3.length];
                            for (int i7 = 0; i7 < split3.length; i7++) {
                                String[] split4 = split3[i7].split("/");
                                eVarArr[i7] = new e((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                            }
                            this.O[i4].put(str, c.a(eVarArr, this.P));
                            continue;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            new StringBuilder("Data format isn't one of expected formats: ").append(i2);
                            continue;
                        case 9:
                            String[] split5 = str3.split(CommonConstant.Symbol.COMMA);
                            int[] iArr2 = new int[split5.length];
                            for (int i8 = 0; i8 < split5.length; i8++) {
                                iArr2[i8] = Integer.parseInt(split5[i8]);
                            }
                            this.O[i4].put(str, c.b(iArr2, this.P));
                            continue;
                        case 10:
                            String[] split6 = str3.split(CommonConstant.Symbol.COMMA);
                            e[] eVarArr2 = new e[split6.length];
                            for (int i9 = 0; i9 < split6.length; i9++) {
                                String[] split7 = split6[i9].split("/");
                                eVarArr2[i9] = new e((long) Double.parseDouble(split7[0]), (long) Double.parseDouble(split7[1]));
                            }
                            this.O[i4].put(str, c.b(eVarArr2, this.P));
                            continue;
                        case 12:
                            String[] split8 = str3.split(CommonConstant.Symbol.COMMA);
                            double[] dArr = new double[split8.length];
                            for (int i10 = 0; i10 < split8.length; i10++) {
                                dArr[i10] = Double.parseDouble(split8[i10]);
                            }
                            this.O[i4].put(str, c.a(dArr, this.P));
                            continue;
                    }
                }
            }
            i4++;
            i3 = 2;
        }
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f727b657279069e4dc442ee4c9224ea2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f727b657279069e4dc442ee4c9224ea2");
            return;
        }
        for (int i2 = 0; i2 < h.length; i2++) {
            this.O[i2].remove(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0327, code lost:
        if (java.util.Arrays.equals(r1, com.sankuai.xm.base.util.ExifInterface.d) != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011c A[Catch: all -> 0x0346, IOException -> 0x0348, Merged into TryCatch #1 {all -> 0x0346, IOException -> 0x0348, blocks: (B:7:0x0021, B:9:0x0026, B:10:0x0032, B:12:0x0055, B:42:0x010c, B:43:0x0117, B:89:0x028b, B:91:0x02a1, B:123:0x0340, B:92:0x02a6, B:94:0x02b5, B:96:0x02c1, B:98:0x02c6, B:99:0x02cb, B:101:0x02e1, B:121:0x0337, B:102:0x02ec, B:104:0x02f6, B:107:0x030a, B:109:0x030f, B:111:0x0319, B:113:0x0321, B:116:0x032b, B:122:0x033b, B:45:0x011c, B:47:0x0136, B:48:0x013b, B:50:0x014c, B:51:0x0151, B:54:0x016d, B:55:0x0178, B:56:0x017d, B:58:0x0193, B:59:0x0198, B:61:0x01a9, B:63:0x01d1, B:67:0x01e4, B:70:0x0203, B:71:0x0215, B:73:0x0225, B:75:0x0231, B:78:0x0236, B:80:0x023d, B:82:0x0244, B:84:0x0252, B:85:0x0256, B:86:0x0275, B:64:0x01d7, B:66:0x01df, B:87:0x0284, B:88:0x0288, B:14:0x0062, B:17:0x0075, B:20:0x007e, B:22:0x0097, B:32:0x00c8, B:34:0x00de, B:35:0x00e9, B:23:0x00a2, B:128:0x0348), top: B:133:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0178 A[Catch: all -> 0x0346, IOException -> 0x0348, Merged into TryCatch #1 {all -> 0x0346, IOException -> 0x0348, blocks: (B:7:0x0021, B:9:0x0026, B:10:0x0032, B:12:0x0055, B:42:0x010c, B:43:0x0117, B:89:0x028b, B:91:0x02a1, B:123:0x0340, B:92:0x02a6, B:94:0x02b5, B:96:0x02c1, B:98:0x02c6, B:99:0x02cb, B:101:0x02e1, B:121:0x0337, B:102:0x02ec, B:104:0x02f6, B:107:0x030a, B:109:0x030f, B:111:0x0319, B:113:0x0321, B:116:0x032b, B:122:0x033b, B:45:0x011c, B:47:0x0136, B:48:0x013b, B:50:0x014c, B:51:0x0151, B:54:0x016d, B:55:0x0178, B:56:0x017d, B:58:0x0193, B:59:0x0198, B:61:0x01a9, B:63:0x01d1, B:67:0x01e4, B:70:0x0203, B:71:0x0215, B:73:0x0225, B:75:0x0231, B:78:0x0236, B:80:0x023d, B:82:0x0244, B:84:0x0252, B:85:0x0256, B:86:0x0275, B:64:0x01d7, B:66:0x01df, B:87:0x0284, B:88:0x0288, B:14:0x0062, B:17:0x0075, B:20:0x007e, B:22:0x0097, B:32:0x00c8, B:34:0x00de, B:35:0x00e9, B:23:0x00a2, B:128:0x0348), top: B:133:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017d A[Catch: all -> 0x0346, IOException -> 0x0348, Merged into TryCatch #1 {all -> 0x0346, IOException -> 0x0348, blocks: (B:7:0x0021, B:9:0x0026, B:10:0x0032, B:12:0x0055, B:42:0x010c, B:43:0x0117, B:89:0x028b, B:91:0x02a1, B:123:0x0340, B:92:0x02a6, B:94:0x02b5, B:96:0x02c1, B:98:0x02c6, B:99:0x02cb, B:101:0x02e1, B:121:0x0337, B:102:0x02ec, B:104:0x02f6, B:107:0x030a, B:109:0x030f, B:111:0x0319, B:113:0x0321, B:116:0x032b, B:122:0x033b, B:45:0x011c, B:47:0x0136, B:48:0x013b, B:50:0x014c, B:51:0x0151, B:54:0x016d, B:55:0x0178, B:56:0x017d, B:58:0x0193, B:59:0x0198, B:61:0x01a9, B:63:0x01d1, B:67:0x01e4, B:70:0x0203, B:71:0x0215, B:73:0x0225, B:75:0x0231, B:78:0x0236, B:80:0x023d, B:82:0x0244, B:84:0x0252, B:85:0x0256, B:86:0x0275, B:64:0x01d7, B:66:0x01df, B:87:0x0284, B:88:0x0288, B:14:0x0062, B:17:0x0075, B:20:0x007e, B:22:0x0097, B:32:0x00c8, B:34:0x00de, B:35:0x00e9, B:23:0x00a2, B:128:0x0348), top: B:133:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0284 A[Catch: all -> 0x0346, IOException -> 0x0348, Merged into TryCatch #1 {all -> 0x0346, IOException -> 0x0348, blocks: (B:7:0x0021, B:9:0x0026, B:10:0x0032, B:12:0x0055, B:42:0x010c, B:43:0x0117, B:89:0x028b, B:91:0x02a1, B:123:0x0340, B:92:0x02a6, B:94:0x02b5, B:96:0x02c1, B:98:0x02c6, B:99:0x02cb, B:101:0x02e1, B:121:0x0337, B:102:0x02ec, B:104:0x02f6, B:107:0x030a, B:109:0x030f, B:111:0x0319, B:113:0x0321, B:116:0x032b, B:122:0x033b, B:45:0x011c, B:47:0x0136, B:48:0x013b, B:50:0x014c, B:51:0x0151, B:54:0x016d, B:55:0x0178, B:56:0x017d, B:58:0x0193, B:59:0x0198, B:61:0x01a9, B:63:0x01d1, B:67:0x01e4, B:70:0x0203, B:71:0x0215, B:73:0x0225, B:75:0x0231, B:78:0x0236, B:80:0x023d, B:82:0x0244, B:84:0x0252, B:85:0x0256, B:86:0x0275, B:64:0x01d7, B:66:0x01df, B:87:0x0284, B:88:0x0288, B:14:0x0062, B:17:0x0075, B:20:0x007e, B:22:0x0097, B:32:0x00c8, B:34:0x00de, B:35:0x00e9, B:23:0x00a2, B:128:0x0348), top: B:133:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0288 A[Catch: all -> 0x0346, IOException -> 0x0348, Merged into TryCatch #1 {all -> 0x0346, IOException -> 0x0348, blocks: (B:7:0x0021, B:9:0x0026, B:10:0x0032, B:12:0x0055, B:42:0x010c, B:43:0x0117, B:89:0x028b, B:91:0x02a1, B:123:0x0340, B:92:0x02a6, B:94:0x02b5, B:96:0x02c1, B:98:0x02c6, B:99:0x02cb, B:101:0x02e1, B:121:0x0337, B:102:0x02ec, B:104:0x02f6, B:107:0x030a, B:109:0x030f, B:111:0x0319, B:113:0x0321, B:116:0x032b, B:122:0x033b, B:45:0x011c, B:47:0x0136, B:48:0x013b, B:50:0x014c, B:51:0x0151, B:54:0x016d, B:55:0x0178, B:56:0x017d, B:58:0x0193, B:59:0x0198, B:61:0x01a9, B:63:0x01d1, B:67:0x01e4, B:70:0x0203, B:71:0x0215, B:73:0x0225, B:75:0x0231, B:78:0x0236, B:80:0x023d, B:82:0x0244, B:84:0x0252, B:85:0x0256, B:86:0x0275, B:64:0x01d7, B:66:0x01df, B:87:0x0284, B:88:0x0288, B:14:0x0062, B:17:0x0075, B:20:0x007e, B:22:0x0097, B:32:0x00c8, B:34:0x00de, B:35:0x00e9, B:23:0x00a2, B:128:0x0348), top: B:133:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a1 A[Catch: all -> 0x0346, IOException -> 0x0348, Merged into TryCatch #1 {all -> 0x0346, IOException -> 0x0348, blocks: (B:7:0x0021, B:9:0x0026, B:10:0x0032, B:12:0x0055, B:42:0x010c, B:43:0x0117, B:89:0x028b, B:91:0x02a1, B:123:0x0340, B:92:0x02a6, B:94:0x02b5, B:96:0x02c1, B:98:0x02c6, B:99:0x02cb, B:101:0x02e1, B:121:0x0337, B:102:0x02ec, B:104:0x02f6, B:107:0x030a, B:109:0x030f, B:111:0x0319, B:113:0x0321, B:116:0x032b, B:122:0x033b, B:45:0x011c, B:47:0x0136, B:48:0x013b, B:50:0x014c, B:51:0x0151, B:54:0x016d, B:55:0x0178, B:56:0x017d, B:58:0x0193, B:59:0x0198, B:61:0x01a9, B:63:0x01d1, B:67:0x01e4, B:70:0x0203, B:71:0x0215, B:73:0x0225, B:75:0x0231, B:78:0x0236, B:80:0x023d, B:82:0x0244, B:84:0x0252, B:85:0x0256, B:86:0x0275, B:64:0x01d7, B:66:0x01df, B:87:0x0284, B:88:0x0288, B:14:0x0062, B:17:0x0075, B:20:0x007e, B:22:0x0097, B:32:0x00c8, B:34:0x00de, B:35:0x00e9, B:23:0x00a2, B:128:0x0348), top: B:133:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a6 A[Catch: all -> 0x0346, IOException -> 0x0348, Merged into TryCatch #1 {all -> 0x0346, IOException -> 0x0348, blocks: (B:7:0x0021, B:9:0x0026, B:10:0x0032, B:12:0x0055, B:42:0x010c, B:43:0x0117, B:89:0x028b, B:91:0x02a1, B:123:0x0340, B:92:0x02a6, B:94:0x02b5, B:96:0x02c1, B:98:0x02c6, B:99:0x02cb, B:101:0x02e1, B:121:0x0337, B:102:0x02ec, B:104:0x02f6, B:107:0x030a, B:109:0x030f, B:111:0x0319, B:113:0x0321, B:116:0x032b, B:122:0x033b, B:45:0x011c, B:47:0x0136, B:48:0x013b, B:50:0x014c, B:51:0x0151, B:54:0x016d, B:55:0x0178, B:56:0x017d, B:58:0x0193, B:59:0x0198, B:61:0x01a9, B:63:0x01d1, B:67:0x01e4, B:70:0x0203, B:71:0x0215, B:73:0x0225, B:75:0x0231, B:78:0x0236, B:80:0x023d, B:82:0x0244, B:84:0x0252, B:85:0x0256, B:86:0x0275, B:64:0x01d7, B:66:0x01df, B:87:0x0284, B:88:0x0288, B:14:0x0062, B:17:0x0075, B:20:0x007e, B:22:0x0097, B:32:0x00c8, B:34:0x00de, B:35:0x00e9, B:23:0x00a2, B:128:0x0348), top: B:133:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(@android.support.annotation.NonNull java.io.InputStream r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.util.ExifInterface.b(java.io.InputStream):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Nullable
    public final byte[] a() {
        AssetManager.AssetInputStream assetInputStream;
        InputStream inputStream;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9e5fe4cefeb210457a75234f3b44eaf", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9e5fe4cefeb210457a75234f3b44eaf");
        }
        if (!this.Q) {
            return null;
        }
        ?? r0 = this.l;
        try {
            if (r0 != 0) {
                return this.l;
            }
            try {
                assetInputStream = this.N;
                try {
                    if (assetInputStream != null) {
                        inputStream = this.N;
                        if (!inputStream.markSupported()) {
                            a((Closeable) inputStream);
                            return null;
                        }
                        inputStream.reset();
                    } else if (this.M != null) {
                        inputStream = new FileInputStream(this.M);
                    } else if (this.j != null) {
                        inputStream = this.j;
                        if (!inputStream.markSupported()) {
                            a((Closeable) inputStream);
                            return null;
                        }
                        inputStream.reset();
                    } else {
                        inputStream = null;
                    }
                    if (inputStream != null) {
                        if (inputStream.skip(this.R) == this.R) {
                            byte[] bArr = new byte[this.S];
                            if (inputStream.read(bArr) == this.S) {
                                this.l = bArr;
                                a((Closeable) inputStream);
                                return bArr;
                            }
                            throw new IOException("Corrupted image");
                        }
                        throw new IOException("Corrupted image");
                    }
                    throw new FileNotFoundException();
                } catch (IOException e2) {
                    e = e2;
                    Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                    a((Closeable) assetInputStream);
                    return null;
                }
            } catch (IOException e3) {
                e = e3;
                assetInputStream = null;
            } catch (Throwable th) {
                th = th;
                r0 = 0;
                a((Closeable) r0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean a(byte[] bArr) throws IOException {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "afb22245d6eb176530a9b590e109c19b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "afb22245d6eb176530a9b590e109c19b")).booleanValue();
        }
        for (int i2 = 0; i2 < e.length; i2++) {
            if (bArr[i2] != e[i2]) {
                return false;
            }
        }
        return true;
    }

    private boolean b(byte[] bArr) throws IOException {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4b33945df0a19ed1615f88aad8bd635", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4b33945df0a19ed1615f88aad8bd635")).booleanValue();
        }
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i2 = 0; i2 < bytes.length; i2++) {
            if (bArr[i2] != bytes[i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0185, code lost:
        r20.b = r19.P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0189, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.sankuai.xm.base.util.ExifInterface.a r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.util.ExifInterface.a(com.sankuai.xm.base.util.ExifInterface$a, int, int):void");
    }

    private void a(a aVar) throws IOException {
        c cVar;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2ac0e3c5c84c3b1664f24dd0289920f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2ac0e3c5c84c3b1664f24dd0289920f");
            return;
        }
        a(aVar, aVar.available());
        b(aVar, 0);
        d(aVar, 0);
        d(aVar, 5);
        d(aVar, 4);
        c((InputStream) aVar);
        if (this.k != 8 || (cVar = this.O[1].get("MakerNote")) == null) {
            return;
        }
        a aVar2 = new a(cVar.d);
        aVar2.b = this.P;
        aVar2.a(6L);
        b(aVar2, 9);
        c cVar2 = this.O[9].get("ColorSpace");
        if (cVar2 != null) {
            this.O[1].put("ColorSpace", cVar2);
        }
    }

    private void b(a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5a1d7229e2e7b6d7d5a75c2f1626a68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5a1d7229e2e7b6d7d5a75c2f1626a68");
            return;
        }
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        a(aVar, i2, 5);
        aVar.a(i3);
        aVar.b = ByteOrder.BIG_ENDIAN;
        int readInt = aVar.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == z.b) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                c a2 = c.a((int) readShort, this.P);
                c a3 = c.a((int) readShort2, this.P);
                this.O[0].put("ImageLength", a2);
                this.O[0].put("ImageWidth", a3);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d6d3d1ba82a4894619d94e6e77dc8fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d6d3d1ba82a4894619d94e6e77dc8fc");
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        b bVar = new b(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        bVar.a(-1);
        if (dataInputStream.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        bVar.a(-40);
        bVar.a(-1);
        bVar.a(-31);
        a(bVar, 6);
        byte[] bArr = new byte[4096];
        while (dataInputStream.readByte() == -1) {
            byte readByte = dataInputStream.readByte();
            if (readByte == -31) {
                int readUnsignedShort = dataInputStream.readUnsignedShort() - 2;
                if (readUnsignedShort < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (readUnsignedShort >= 6) {
                    if (dataInputStream.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, i)) {
                        int i2 = readUnsignedShort - 6;
                        if (dataInputStream.skipBytes(i2) != i2) {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                bVar.a(-1);
                bVar.a((int) readByte);
                bVar.c(readUnsignedShort + 2);
                if (readUnsignedShort >= 6) {
                    readUnsignedShort -= 6;
                    bVar.write(bArr2);
                }
                while (readUnsignedShort > 0) {
                    int read = dataInputStream.read(bArr, 0, Math.min(readUnsignedShort, 4096));
                    if (read >= 0) {
                        bVar.write(bArr, 0, read);
                        readUnsignedShort -= read;
                    }
                }
            } else {
                switch (readByte) {
                    case -39:
                    case -38:
                        bVar.a(-1);
                        bVar.a((int) readByte);
                        b(dataInputStream, bVar);
                        return;
                    default:
                        bVar.a(-1);
                        bVar.a((int) readByte);
                        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                        bVar.c(readUnsignedShort2);
                        int i3 = readUnsignedShort2 - 2;
                        if (i3 < 0) {
                            throw new IOException("Invalid length");
                        }
                        while (i3 > 0) {
                            int read2 = dataInputStream.read(bArr, 0, Math.min(i3, 4096));
                            if (read2 >= 0) {
                                bVar.write(bArr, 0, read2);
                                i3 -= read2;
                            }
                        }
                        break;
                        break;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a86f9f6602edf35b8f2550cdddd22284", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a86f9f6602edf35b8f2550cdddd22284");
            return;
        }
        String b2 = b("DateTimeOriginal");
        if (b2 != null && b("DateTime") == null) {
            this.O[0].put("DateTime", c.a(b2));
        }
        if (b("ImageWidth") == null) {
            this.O[0].put("ImageWidth", c.a(0L, this.P));
        }
        if (b("ImageLength") == null) {
            this.O[0].put("ImageLength", c.a(0L, this.P));
        }
        if (b("Orientation") == null) {
            this.O[0].put("Orientation", c.a(0L, this.P));
        }
        if (b("LightSource") == null) {
            this.O[1].put("LightSource", c.a(0L, this.P));
        }
    }

    private ByteOrder c(a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec3a8b78e341e5c7b064bd0afc4183ab", 6917529027641081856L)) {
            return (ByteOrder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec3a8b78e341e5c7b064bd0afc4183ab");
        }
        short readShort = aVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    private void a(a aVar, int i2) throws IOException {
        Object[] objArr = {aVar, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b48aeafad8a3d576b6fbbc4c27f7b7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b48aeafad8a3d576b6fbbc4c27f7b7e");
            return;
        }
        this.P = c(aVar);
        aVar.b = this.P;
        int readUnsignedShort = aVar.readUnsignedShort();
        if (this.k != 7 && this.k != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = aVar.readInt();
        if (readInt < 8 || readInt >= i2) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i3 = readInt - 8;
        if (i3 <= 0 || aVar.skipBytes(i3) == i3) {
            return;
        }
        throw new IOException("Couldn't jump to first Ifd: " + i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(com.sankuai.xm.base.util.ExifInterface.a r26, int r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.util.ExifInterface.b(com.sankuai.xm.base.util.ExifInterface$a, int):void");
    }

    private void c(a aVar, int i2) throws IOException {
        c cVar;
        Object[] objArr = {aVar, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e4e5d0a5c54d49502cd6539f399d82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e4e5d0a5c54d49502cd6539f399d82");
            return;
        }
        c cVar2 = this.O[i2].get("ImageLength");
        c cVar3 = this.O[i2].get("ImageWidth");
        if ((cVar2 == null || cVar3 == null) && (cVar = this.O[i2].get("JPEGInterchangeFormat")) != null) {
            a(aVar, cVar.b(this.P), i2);
        }
    }

    private void a(a aVar, HashMap hashMap) throws IOException {
        Object[] objArr = {aVar, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1541ca3d25bd462400646526a64b72b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1541ca3d25bd462400646526a64b72b");
            return;
        }
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int b2 = cVar.b(this.P);
        int min = Math.min(cVar2.b(this.P), aVar.available() - b2);
        if (this.k == 4 || this.k == 9 || this.k == 10) {
            b2 += this.T;
        } else if (this.k == 7) {
            b2 += this.U;
        }
        if (b2 <= 0 || min <= 0) {
            return;
        }
        this.Q = true;
        this.R = b2;
        this.S = min;
        if (this.M == null && this.N == null) {
            byte[] bArr = new byte[min];
            aVar.a(b2);
            aVar.readFully(bArr);
            this.l = bArr;
        }
    }

    private void b(a aVar, HashMap hashMap) throws IOException {
        Object[] objArr = {aVar, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ae04e1c2d9752e58d7726f534bae427", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ae04e1c2d9752e58d7726f534bae427");
            return;
        }
        c cVar = (c) hashMap.get("StripOffsets");
        c cVar2 = (c) hashMap.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] a2 = a(cVar.a(this.P));
        long[] a3 = a(cVar2.a(this.P));
        if (a2 == null || a3 == null) {
            return;
        }
        long j = 0;
        for (long j2 : a3) {
            j += j2;
        }
        byte[] bArr = new byte[(int) j];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < a2.length; i4++) {
            int i5 = (int) a3[i4];
            int i6 = ((int) a2[i4]) - i2;
            aVar.a(i6);
            int i7 = i2 + i6;
            byte[] bArr2 = new byte[i5];
            aVar.read(bArr2);
            i2 = i7 + i5;
            System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
            i3 += bArr2.length;
        }
        this.Q = true;
        this.l = bArr;
        this.S = bArr.length;
    }

    private boolean a(HashMap hashMap) throws IOException {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21875d253bc4eea8f1be49d2e0010df8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21875d253bc4eea8f1be49d2e0010df8")).booleanValue();
        }
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar != null && cVar2 != null) {
            int b2 = cVar.b(this.P);
            int b3 = cVar2.b(this.P);
            if (b2 <= 512 && b3 <= 512) {
                return true;
            }
        }
        return false;
    }

    private void c(InputStream inputStream) throws IOException {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4ab15ee331a4122ca9bfefbd308700e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4ab15ee331a4122ca9bfefbd308700e");
            return;
        }
        a(0, 5);
        a(0, 4);
        a(5, 4);
        c cVar = this.O[1].get("PixelXDimension");
        c cVar2 = this.O[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.O[0].put("ImageWidth", cVar);
            this.O[0].put("ImageLength", cVar2);
        }
        if (this.O[4].isEmpty() && a((HashMap) this.O[5])) {
            this.O[4] = this.O[5];
            this.O[5] = new HashMap<>();
        }
        a((HashMap) this.O[4]);
    }

    private void d(a aVar, int i2) throws IOException {
        c a2;
        c a3;
        Object[] objArr = {aVar, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac6a0791f2aad7483196f164266dc027", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac6a0791f2aad7483196f164266dc027");
            return;
        }
        c cVar = this.O[i2].get("DefaultCropSize");
        c cVar2 = this.O[i2].get("SensorTopBorder");
        c cVar3 = this.O[i2].get("SensorLeftBorder");
        c cVar4 = this.O[i2].get("SensorBottomBorder");
        c cVar5 = this.O[i2].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.b == 5) {
                e[] eVarArr = (e[]) cVar.a(this.P);
                if (eVarArr == null || eVarArr.length != 2) {
                    new StringBuilder("Invalid crop size values. cropSize=").append(Arrays.toString(eVarArr));
                    return;
                } else {
                    a2 = c.a(eVarArr[0], this.P);
                    a3 = c.a(eVarArr[1], this.P);
                }
            } else {
                int[] iArr = (int[]) cVar.a(this.P);
                if (iArr == null || iArr.length != 2) {
                    new StringBuilder("Invalid crop size values. cropSize=").append(Arrays.toString(iArr));
                    return;
                } else {
                    a2 = c.a(iArr[0], this.P);
                    a3 = c.a(iArr[1], this.P);
                }
            }
            this.O[i2].put("ImageWidth", a2);
            this.O[i2].put("ImageLength", a3);
        } else if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int b2 = cVar2.b(this.P);
            int b3 = cVar4.b(this.P);
            int b4 = cVar5.b(this.P);
            int b5 = cVar3.b(this.P);
            if (b3 <= b2 || b4 <= b5) {
                return;
            }
            c a4 = c.a(b3 - b2, this.P);
            c a5 = c.a(b4 - b5, this.P);
            this.O[i2].put("ImageLength", a4);
            this.O[i2].put("ImageWidth", a5);
        } else {
            c(aVar, i2);
        }
    }

    private int a(b bVar, int i2) throws IOException {
        Object[] objArr = {bVar, 6};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af1bd61ff4e4af63b089ece3341ebbfa", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af1bd61ff4e4af63b089ece3341ebbfa")).intValue();
        }
        int[] iArr = new int[h.length];
        int[] iArr2 = new int[h.length];
        for (d dVar : E) {
            c(dVar.c);
        }
        c(F.c);
        c(G.c);
        for (int i3 = 0; i3 < h.length; i3++) {
            for (Object obj : this.O[i3].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.O[i3].remove(entry.getKey());
                }
            }
        }
        if (!this.O[1].isEmpty()) {
            this.O[0].put(E[1].c, c.a(0L, this.P));
        }
        if (!this.O[2].isEmpty()) {
            this.O[0].put(E[2].c, c.a(0L, this.P));
        }
        if (!this.O[3].isEmpty()) {
            this.O[1].put(E[3].c, c.a(0L, this.P));
        }
        if (this.Q) {
            this.O[4].put(F.c, c.a(0L, this.P));
            this.O[4].put(G.c, c.a(this.S, this.P));
        }
        for (int i4 = 0; i4 < h.length; i4++) {
            int i5 = 0;
            for (Map.Entry<String, c> entry2 : this.O[i4].entrySet()) {
                int a2 = entry2.getValue().a();
                if (a2 > 4) {
                    i5 += a2;
                }
            }
            iArr2[i4] = iArr2[i4] + i5;
        }
        int i6 = 8;
        for (int i7 = 0; i7 < h.length; i7++) {
            if (!this.O[i7].isEmpty()) {
                iArr[i7] = i6;
                i6 += (this.O[i7].size() * 12) + 2 + 4 + iArr2[i7];
            }
        }
        if (this.Q) {
            this.O[4].put(F.c, c.a(i6, this.P));
            this.R = i6 + 6;
            i6 += this.S;
        }
        int i8 = i6 + 8;
        if (!this.O[1].isEmpty()) {
            this.O[0].put(E[1].c, c.a(iArr[1], this.P));
        }
        if (!this.O[2].isEmpty()) {
            this.O[0].put(E[2].c, c.a(iArr[2], this.P));
        }
        if (!this.O[3].isEmpty()) {
            this.O[1].put(E[3].c, c.a(iArr[3], this.P));
        }
        bVar.c(i8);
        bVar.write(i);
        bVar.a(this.P == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        bVar.b = this.P;
        bVar.c(42);
        bVar.a(8L);
        for (int i9 = 0; i9 < h.length; i9++) {
            if (!this.O[i9].isEmpty()) {
                bVar.c(this.O[i9].size());
                int size = iArr[i9] + 2 + (this.O[i9].size() * 12) + 4;
                for (Map.Entry<String, c> entry3 : this.O[i9].entrySet()) {
                    int i10 = I[i9].get(entry3.getKey()).b;
                    c value = entry3.getValue();
                    int a3 = value.a();
                    bVar.c(i10);
                    bVar.c(value.b);
                    bVar.b(value.c);
                    if (a3 > 4) {
                        bVar.a(size);
                        size += a3;
                    } else {
                        bVar.write(value.d);
                        if (a3 < 4) {
                            while (a3 < 4) {
                                bVar.a(0);
                                a3++;
                            }
                        }
                    }
                }
                if (i9 == 0 && !this.O[4].isEmpty()) {
                    bVar.a(iArr[4]);
                } else {
                    bVar.a(0L);
                }
                for (Map.Entry<String, c> entry4 : this.O[i9].entrySet()) {
                    c value2 = entry4.getValue();
                    if (value2.d.length > 4) {
                        bVar.write(value2.d, 0, value2.d.length);
                    }
                }
            }
        }
        if (this.Q) {
            bVar.write(a());
        }
        bVar.b = ByteOrder.BIG_ENDIAN;
        return i8;
    }

    private static Pair<Integer, Integer> d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43fa418c9b0f6f3233eb277dcce0f982", 6917529027641081856L)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43fa418c9b0f6f3233eb277dcce0f982");
        }
        if (str.contains(CommonConstant.Symbol.COMMA)) {
            String[] split = str.split(CommonConstant.Symbol.COMMA);
            Pair<Integer, Integer> d2 = d(split[0]);
            if (((Integer) d2.first).intValue() == 2) {
                return d2;
            }
            for (int i2 = 1; i2 < split.length; i2++) {
                Pair<Integer, Integer> d3 = d(split[i2]);
                int intValue = (((Integer) d3.first).equals(d2.first) || ((Integer) d3.second).equals(d2.first)) ? ((Integer) d2.first).intValue() : -1;
                int intValue2 = (((Integer) d2.second).intValue() == -1 || !(((Integer) d3.first).equals(d2.second) || ((Integer) d3.second).equals(d2.second))) ? -1 : ((Integer) d2.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    d2 = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    d2 = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return d2;
        } else if (str.contains("/")) {
            String[] split2 = str.split("/");
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair<>(2, -1);
        } else {
            try {
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(str));
                    if (valueOf.longValue() >= 0 && valueOf.longValue() <= 65535) {
                        return new Pair<>(3, 4);
                    }
                    if (valueOf.longValue() < 0) {
                        return new Pair<>(9, -1);
                    }
                    return new Pair<>(4, -1);
                } catch (NumberFormatException unused2) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused3) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends InputStream implements DataInput {
        public static ChangeQuickRedirect a;
        private static final ByteOrder d = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder e = ByteOrder.BIG_ENDIAN;
        ByteOrder b;
        int c;
        private DataInputStream f;
        private final int g;

        @Override // java.io.DataInput
        public final String readLine() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6add4ea73ea55c5bfb9f0151dc29898f", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6add4ea73ea55c5bfb9f0151dc29898f");
            }
            return null;
        }

        public a(InputStream inputStream) throws IOException {
            Object[] objArr = {inputStream};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c668fd9e9f8f9bcbf4ce8b8a6e31f9b0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c668fd9e9f8f9bcbf4ce8b8a6e31f9b0");
                return;
            }
            this.b = ByteOrder.BIG_ENDIAN;
            this.f = new DataInputStream(inputStream);
            this.g = this.f.available();
            this.c = 0;
            this.f.mark(this.g);
        }

        public a(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
            Object[] objArr = {bArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22a0b06a74112e2f42c428a05017cbf0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22a0b06a74112e2f42c428a05017cbf0");
            }
        }

        public final void a(long j) throws IOException {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12ac79ec9b2f8e515528ded9c333de04", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12ac79ec9b2f8e515528ded9c333de04");
                return;
            }
            if (this.c > j) {
                this.c = 0;
                this.f.reset();
                this.f.mark(this.g);
            } else {
                j -= this.c;
            }
            int i = (int) j;
            if (skipBytes(i) != i) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "184df795d7bf72cc7e0226a6a8fc4a5a", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "184df795d7bf72cc7e0226a6a8fc4a5a")).intValue() : this.f.available();
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dabef491d6b8584b40bab2da8835f3cd", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dabef491d6b8584b40bab2da8835f3cd")).intValue();
            }
            this.c++;
            return this.f.read();
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7650cd6b35cf8e03e70780da8a59a187", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7650cd6b35cf8e03e70780da8a59a187")).intValue();
            }
            int read = this.f.read(bArr, i, i2);
            this.c += read;
            return read;
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9070396e800e3e0923bfc6fee2c799bc", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9070396e800e3e0923bfc6fee2c799bc")).intValue();
            }
            this.c++;
            return this.f.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0079935c6715bca0e05243e1570d8ee4", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0079935c6715bca0e05243e1570d8ee4")).booleanValue();
            }
            this.c++;
            return this.f.readBoolean();
        }

        @Override // java.io.DataInput
        public final char readChar() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecf13fb3ec44fc109725cb34607eccac", 6917529027641081856L)) {
                return ((Character) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecf13fb3ec44fc109725cb34607eccac")).charValue();
            }
            this.c += 2;
            return this.f.readChar();
        }

        @Override // java.io.DataInput
        public final String readUTF() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb88f7923bf20fb1f83a69629b3f7465", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb88f7923bf20fb1f83a69629b3f7465");
            }
            this.c += 2;
            return this.f.readUTF();
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) throws IOException {
            Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7bf7e5db1743a2522157da4a436168c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7bf7e5db1743a2522157da4a436168c");
                return;
            }
            this.c += i2;
            if (this.c > this.g) {
                throw new EOFException();
            }
            if (this.f.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            Object[] objArr = {bArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b4526870a721537e4991fd39c757fa4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b4526870a721537e4991fd39c757fa4");
                return;
            }
            this.c += bArr.length;
            if (this.c > this.g) {
                throw new EOFException();
            }
            if (this.f.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df2da26bdd8cc680c5dc09a6f9659328", 6917529027641081856L)) {
                return ((Byte) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df2da26bdd8cc680c5dc09a6f9659328")).byteValue();
            }
            this.c++;
            if (this.c > this.g) {
                throw new EOFException();
            }
            int read = this.f.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "438abba39827a54bdb7802a18c451a62", 6917529027641081856L)) {
                return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "438abba39827a54bdb7802a18c451a62")).shortValue();
            }
            this.c += 2;
            if (this.c > this.g) {
                throw new EOFException();
            }
            int read = this.f.read();
            int read2 = this.f.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            if (this.b == d) {
                return (short) ((read2 << 8) + read);
            }
            if (this.b == e) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.b);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83afcf80a783bd922740ec6c51560327", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83afcf80a783bd922740ec6c51560327")).intValue();
            }
            this.c += 4;
            if (this.c > this.g) {
                throw new EOFException();
            }
            int read = this.f.read();
            int read2 = this.f.read();
            int read3 = this.f.read();
            int read4 = this.f.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            if (this.b == d) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (this.b == e) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.b);
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) throws IOException {
            int i2 = 0;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc02196a0838e8068f7a960122ea13a5", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc02196a0838e8068f7a960122ea13a5")).intValue();
            }
            int min = Math.min(i, this.g - this.c);
            while (i2 < min) {
                i2 += this.f.skipBytes(min - i2);
            }
            this.c += i2;
            return i2;
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "450e13b3411bee8044df788ee9bcca17", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "450e13b3411bee8044df788ee9bcca17")).intValue();
            }
            this.c += 2;
            if (this.c > this.g) {
                throw new EOFException();
            }
            int read = this.f.read();
            int read2 = this.f.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            if (this.b == d) {
                return (read2 << 8) + read;
            }
            if (this.b == e) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.b);
        }

        public final long a() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dedfecd9a15569b1571865aa1a0d1c4d", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dedfecd9a15569b1571865aa1a0d1c4d")).longValue() : readInt() & 4294967295L;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5b61d5239ffe8f0e61303ddc30e8f5a", 6917529027641081856L)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5b61d5239ffe8f0e61303ddc30e8f5a")).longValue();
            }
            this.c += 8;
            if (this.c > this.g) {
                throw new EOFException();
            }
            int read = this.f.read();
            int read2 = this.f.read();
            int read3 = this.f.read();
            int read4 = this.f.read();
            int read5 = this.f.read();
            int read6 = this.f.read();
            int read7 = this.f.read();
            int read8 = this.f.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            if (this.b == d) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (this.b == e) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.b);
        }

        @Override // java.io.DataInput
        public final float readFloat() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9b6b3f64fef9bfd91cb04d365ce5cf5", 6917529027641081856L) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9b6b3f64fef9bfd91cb04d365ce5cf5")).floatValue() : Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final double readDouble() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e399e50ac12806eaaf30bccdfa143a1", 6917529027641081856L) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e399e50ac12806eaaf30bccdfa143a1")).doubleValue() : Double.longBitsToDouble(readLong());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b extends FilterOutputStream {
        public static ChangeQuickRedirect a;
        ByteOrder b;
        private final OutputStream c;

        public b(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            Object[] objArr = {outputStream, byteOrder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6a37bc4c7ada8718dc0730f32164a0a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6a37bc4c7ada8718dc0730f32164a0a");
                return;
            }
            this.c = outputStream;
            this.b = byteOrder;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            Object[] objArr = {bArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e9f7091d967a7b4ad51dee343859f2f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e9f7091d967a7b4ad51dee343859f2f");
            } else {
                this.c.write(bArr);
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a9d0f49cd63584c9b38f2ec9d8360fb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a9d0f49cd63584c9b38f2ec9d8360fb");
            } else {
                this.c.write(bArr, i, i2);
            }
        }

        public final void a(int i) throws IOException {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9ef46c6f1122e259a046519b4297145", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9ef46c6f1122e259a046519b4297145");
            } else {
                this.c.write(i);
            }
        }

        public final void a(short s) throws IOException {
            Object[] objArr = {Short.valueOf(s)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0642ab7ebf90a57785bea4576544ff34", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0642ab7ebf90a57785bea4576544ff34");
            } else if (this.b == ByteOrder.LITTLE_ENDIAN) {
                this.c.write((s >>> 0) & 255);
                this.c.write((s >>> 8) & 255);
            } else if (this.b == ByteOrder.BIG_ENDIAN) {
                this.c.write((s >>> 8) & 255);
                this.c.write((s >>> 0) & 255);
            }
        }

        public final void b(int i) throws IOException {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3916ccbebb306c70596283327ba2b0ae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3916ccbebb306c70596283327ba2b0ae");
            } else if (this.b == ByteOrder.LITTLE_ENDIAN) {
                this.c.write((i >>> 0) & 255);
                this.c.write((i >>> 8) & 255);
                this.c.write((i >>> 16) & 255);
                this.c.write((i >>> 24) & 255);
            } else if (this.b == ByteOrder.BIG_ENDIAN) {
                this.c.write((i >>> 24) & 255);
                this.c.write((i >>> 16) & 255);
                this.c.write((i >>> 8) & 255);
                this.c.write((i >>> 0) & 255);
            }
        }

        public final void c(int i) throws IOException {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1342c4f50951a5d372cf2efd80345abc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1342c4f50951a5d372cf2efd80345abc");
            } else {
                a((short) i);
            }
        }

        public final void a(long j) throws IOException {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b30a612717f62a656200042930bfe449", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b30a612717f62a656200042930bfe449");
            } else {
                b((int) j);
            }
        }
    }

    private void a(int i2, int i3) throws IOException {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "165fc1a82f58265b51e6fea3b8340676", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "165fc1a82f58265b51e6fea3b8340676");
        } else if (this.O[i2].isEmpty() || this.O[i3].isEmpty()) {
        } else {
            c cVar = this.O[i2].get("ImageLength");
            c cVar2 = this.O[i2].get("ImageWidth");
            c cVar3 = this.O[i3].get("ImageLength");
            c cVar4 = this.O[i3].get("ImageWidth");
            if (cVar == null || cVar2 == null || cVar3 == null || cVar4 == null) {
                return;
            }
            int b2 = cVar.b(this.P);
            int b3 = cVar2.b(this.P);
            int b4 = cVar3.b(this.P);
            int b5 = cVar4.b(this.P);
            if (b2 >= b4 || b3 >= b5) {
                return;
            }
            HashMap<String, c> hashMap = this.O[i2];
            HashMap<String, c>[] hashMapArr = this.O;
            hashMapArr[i2] = hashMapArr[i3];
            this.O[i3] = hashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a06aa93947683984ebda03d71466c6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a06aa93947683984ebda03d71466c6f");
        } else {
            m.a(closeable);
        }
    }

    private static int b(InputStream inputStream, OutputStream outputStream) throws IOException {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f46f3b6dadc9b244015645a1fada8737", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f46f3b6dadc9b244015645a1fada8737")).intValue();
        }
        byte[] bArr = new byte[8192];
        int i2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i2;
            }
            i2 += read;
            outputStream.write(bArr, 0, read);
        }
    }

    private static long[] a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48a1de83d2ffdfc5c4040a5ef77bb35a", 6917529027641081856L)) {
            return (long[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48a1de83d2ffdfc5c4040a5ef77bb35a");
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = iArr[i2];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }
}
