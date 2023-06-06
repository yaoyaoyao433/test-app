package com.meituan.android.yoda.util;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.android.facedetection.algo.FaceLivenessDet;
import com.meituan.android.yoda.bean.AESKeys;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.UUID;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class FaceDetUtils {
    private static final String ENCODED_FACE_TEMP_FILE = "encoded_img";
    private static final String TAG = "FaceDetUtils";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int convertByteToInt(byte b) {
        Object[] objArr = {Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2c105ebd254a1f39aa6666fe34c9751d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2c105ebd254a1f39aa6666fe34c9751d")).intValue() : (((b >> 4) & 15) * 16) + (b & 15);
    }

    public static int[] convertByteToColor(byte[] bArr) {
        int i;
        int i2 = 0;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eadcd28d012ce2a42f170569d74366da", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eadcd28d012ce2a42f170569d74366da");
        }
        long currentTimeMillis = System.currentTimeMillis();
        int length = bArr.length;
        if (length == 0) {
            return null;
        }
        int i3 = length % 3 != 0 ? 1 : 0;
        int[] iArr = new int[(length / 3) + i3];
        int length2 = iArr.length;
        if (i3 == 0) {
            while (i2 < length2) {
                int i4 = i2 * 3;
                int i5 = i4 + 1;
                int i6 = i4 + 2;
                iArr[i2] = (((((bArr[i4] >> 4) & 15) * 16) + (bArr[i4] & 15)) << 16) | (((((bArr[i5] >> 4) & 15) * 16) + (bArr[i5] & 15)) << 8) | ((((bArr[i6] >> 4) & 15) * 16) + (bArr[i6] & 15)) | (-16777216);
                i2++;
            }
        } else {
            while (true) {
                i = length2 - 1;
                if (i2 >= i) {
                    break;
                }
                int i7 = i2 * 3;
                int i8 = i7 + 1;
                int i9 = i7 + 2;
                iArr[i2] = (((((bArr[i7] >> 4) & 15) * 16) + (bArr[i7] & 15)) << 16) | (((((bArr[i8] >> 4) & 15) * 16) + (bArr[i8] & 15)) << 8) | ((((bArr[i9] >> 4) & 15) * 16) + (bArr[i9] & 15)) | (-16777216);
                i2++;
            }
            iArr[i] = -16777216;
        }
        new StringBuilder("the cost of convertbyteToColors = ").append(System.currentTimeMillis() - currentTimeMillis);
        return iArr;
    }

    public static Bitmap rgb2Bitmap(byte[] bArr, int i, int i2) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eae6177a7dac213ce8ccbc832e85ecaa", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eae6177a7dac213ce8ccbc832e85ecaa");
        }
        int[] convertByteToColor = convertByteToColor(bArr);
        if (convertByteToColor == null) {
            return null;
        }
        return Bitmap.createBitmap(convertByteToColor, 0, i, i, i2, Bitmap.Config.ARGB_8888);
    }

    public static Bitmap[] rgb2Bitmaps(byte[] bArr, int i, int i2) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "51478126f58bede9cc764a580db7a7af", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "51478126f58bede9cc764a580db7a7af");
        }
        int[] convertByteToColor = convertByteToColor(bArr);
        if (convertByteToColor == null) {
            return null;
        }
        return new Bitmap[]{Bitmap.createBitmap(convertByteToColor, 0, i, i, i2, Bitmap.Config.ARGB_8888), Bitmap.createBitmap(convertByteToColor, i2 * i, i, i, i2, Bitmap.Config.ARGB_8888), Bitmap.createBitmap(convertByteToColor, i2 * 2 * i, i, i, i2, Bitmap.Config.ARGB_8888)};
    }

    public Bitmap rotateImage(Bitmap bitmap, float f) {
        Object[] objArr = {bitmap, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42537f96c474452822d4e89855686180", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42537f96c474452822d4e89855686180");
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static byte[] rotateYUV420Degree180(byte[] bArr, int i, int i2) {
        int i3 = 0;
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3efae47dba03f7433eb062975b53e9ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3efae47dba03f7433eb062975b53e9ce");
        }
        if (bArr == null) {
            return null;
        }
        int i4 = i * i2;
        int i5 = (i4 * 3) / 2;
        byte[] bArr2 = new byte[i5];
        for (int i6 = i4 - 1; i6 >= 0; i6--) {
            bArr2[i3] = bArr[i6];
            i3++;
        }
        for (int i7 = i5 - 1; i7 >= i4; i7 -= 2) {
            int i8 = i3 + 1;
            bArr2[i3] = bArr[i7 - 1];
            i3 = i8 + 1;
            bArr2[i8] = bArr[i7];
        }
        return bArr2;
    }

    public static byte[] scaleRGBData(byte[] bArr, int i, int i2, int i3, float f) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1b8002a3d3ca152ff67d73d19fd49781", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1b8002a3d3ca152ff67d73d19fd49781");
        }
        int i4 = (int) ((i2 * f) + 0.5f);
        int i5 = (int) ((i3 * f) + 0.5f);
        int i6 = i * i2;
        int i7 = i * i4;
        byte[] bArr2 = new byte[i4 * i5 * i];
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = 0;
            while (i9 < i4) {
                int i10 = (int) ((i8 / f) + 0.5d);
                int i11 = i4;
                int i12 = (int) ((i9 / f) + 0.5d);
                if (i10 >= 0 && i10 < i3 && i12 >= 0 && i12 < i2) {
                    for (int i13 = 0; i13 < 3; i13++) {
                        bArr2[(i8 * i7) + (i9 * 3) + i13] = bArr[(i10 * i6) + (i12 * 3) + i13];
                    }
                }
                i9++;
                i4 = i11;
            }
        }
        return bArr2;
    }

    public static Bitmap[] generateEntryptBitmaps(byte[] bArr, int i, int i2, float f, FaceLivenessDet faceLivenessDet) {
        byte[] bArr2 = bArr;
        Object[] objArr = {bArr2, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), faceLivenessDet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6bc82ffa63d3c471c01c9e44b2324146", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6bc82ffa63d3c471c01c9e44b2324146");
        }
        Bitmap[] bitmapArr = new Bitmap[3];
        int i3 = i * i2;
        int i4 = i3 * 3;
        byte[] bArr3 = new byte[i4];
        int i5 = (int) ((i * f) + 0.5f);
        int i6 = (int) ((i2 * f) + 0.5f);
        byte[] bArr4 = new byte[i6 * i5 * 3];
        int i7 = 0;
        for (int i8 = 3; i7 < i8; i8 = 3) {
            System.arraycopy(bArr2, i3 * i7 * 3, bArr3, 0, i4);
            faceLivenessDet.wrapFaceEncrypt(scaleRGBData(bArr3, i8, i, i2, f), bArr4, new int[]{i6, i5});
            bitmapArr[i7] = rgb2Bitmap(bArr4, i5, i6);
            i7++;
            bArr2 = bArr;
        }
        return bitmapArr;
    }

    public static Bitmap[] generateEntryptBitmaps2(byte[] bArr, int i, int i2, FaceLivenessDet faceLivenessDet) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), faceLivenessDet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "72164bd734429e5234683f08a5b2c8a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "72164bd734429e5234683f08a5b2c8a3");
        }
        Bitmap[] bitmapArr = new Bitmap[3];
        int i3 = i * i2;
        int i4 = i3 * 3;
        byte[] bArr2 = new byte[i4];
        byte[] bArr3 = new byte[i4];
        for (int i5 = 0; i5 < 3; i5++) {
            System.arraycopy(bArr, i3 * i5 * 3, bArr2, 0, i4);
            faceLivenessDet.wrapFaceEncrypt(bArr2, bArr3, new int[]{i2, i});
            bitmapArr[i5] = rgb2Bitmap(bArr3, i, i2);
        }
        return bitmapArr;
    }

    public static void decryptOutputData(int i, byte[] bArr, int i2, int i3, FaceLivenessDet faceLivenessDet) {
        Object[] objArr = {Integer.valueOf(i), bArr, Integer.valueOf(i2), Integer.valueOf(i3), faceLivenessDet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a5ce86e4e6953c4859c165398fe62f00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a5ce86e4e6953c4859c165398fe62f00");
            return;
        }
        int[] iArr = {i3, i2};
        int i4 = i2 * i3 * 3;
        byte[] bArr2 = new byte[i4];
        byte[] bArr3 = new byte[i4];
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i4 * i5;
            System.arraycopy(bArr, i6, bArr2, 0, i4);
            faceLivenessDet.wrapFaceDecrypt(bArr2, bArr3, iArr);
            System.arraycopy(bArr3, 0, bArr, i6, i4);
        }
    }

    public static boolean post(String str, Map<String, String> map, Map<String, String> map2, String str2, byte[] bArr, AESKeys aESKeys) throws IOException {
        byte[] bArr2;
        Object[] objArr = {str, map, map2, str2, bArr, aESKeys};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b0a2e4fbbbc0f5e26b110bedd9e476f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b0a2e4fbbbc0f5e26b110bedd9e476f")).booleanValue();
        }
        String uuid = UUID.randomUUID().toString();
        HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("connection", "keep-alive");
        httpURLConnection.setRequestProperty("Charsert", "UTF-8");
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + uuid);
        if (map != null) {
            for (String str3 : map.keySet()) {
                httpURLConnection.setRequestProperty(str3, map.get(str3));
            }
        }
        StringBuilder sb = new StringBuilder();
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                sb.append("--");
                sb.append(uuid);
                sb.append(StringUtil.CRLF_STRING);
                sb.append("Content-Disposition: form-data; name=\"" + entry.getKey() + CommonConstant.Symbol.DOUBLE_QUOTES + StringUtil.CRLF_STRING);
                StringBuilder sb2 = new StringBuilder("Content-Type: text/plain; charset=");
                sb2.append("UTF-8");
                sb2.append(StringUtil.CRLF_STRING);
                sb.append(sb2.toString());
                sb.append("Content-Transfer-Encoding: 8bit" + StringUtil.CRLF_STRING);
                sb.append(StringUtil.CRLF_STRING);
                sb.append(entry.getValue());
                sb.append(StringUtil.CRLF_STRING);
            }
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        if (!TextUtils.isEmpty(sb.toString())) {
            dataOutputStream.write(sb.toString().getBytes());
        }
        if (bArr != null && bArr.length > 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("--");
            sb3.append(uuid);
            sb3.append(StringUtil.CRLF_STRING);
            sb3.append("Content-Disposition: form-data; name=\"file\"; filename=\"content\"" + StringUtil.CRLF_STRING);
            sb3.append("Content-Type: application/octet-stream; charset=UTF-8" + StringUtil.CRLF_STRING);
            sb3.append(StringUtil.CRLF_STRING);
            dataOutputStream.write(sb3.toString().getBytes());
            try {
                bArr2 = new com.meituan.android.yoda.xxtea.a().a(bArr, aESKeys.getEdk(), aESKeys.getDk());
            } catch (Throwable th) {
                th.printStackTrace();
                bArr2 = null;
            }
            dataOutputStream.write(bArr2);
            dataOutputStream.write(StringUtil.CRLF_STRING.getBytes());
        }
        dataOutputStream.write(("--" + uuid + "--" + StringUtil.CRLF_STRING).getBytes());
        dataOutputStream.flush();
        new StringBuilder("conn.getContentLength():").append(httpURLConnection.getContentLength());
        int responseCode = httpURLConnection.getResponseCode();
        InputStream inputStream = httpURLConnection.getInputStream();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return true;
                }
                stringBuffer.append(readLine);
            }
        } else {
            dataOutputStream.close();
            httpURLConnection.disconnect();
            return false;
        }
    }

    public static boolean post(String str, Map<String, String> map, Map<String, String> map2, String str2, File file) throws IOException {
        Object[] objArr = {str, map, map2, str2, file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c238d2ddd5d710d13572c852e9de8155", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c238d2ddd5d710d13572c852e9de8155")).booleanValue();
        }
        String uuid = UUID.randomUUID().toString();
        HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("connection", "keep-alive");
        httpURLConnection.setRequestProperty("Charsert", "UTF-8");
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + uuid);
        if (map != null) {
            for (String str3 : map.keySet()) {
                httpURLConnection.setRequestProperty(str3, map.get(str3));
            }
        }
        StringBuilder sb = new StringBuilder();
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                sb.append("--");
                sb.append(uuid);
                sb.append(StringUtil.CRLF_STRING);
                sb.append("Content-Disposition: form-data; name=\"" + entry.getKey() + CommonConstant.Symbol.DOUBLE_QUOTES + StringUtil.CRLF_STRING);
                StringBuilder sb2 = new StringBuilder("Content-Type: text/plain; charset=");
                sb2.append("UTF-8");
                sb2.append(StringUtil.CRLF_STRING);
                sb.append(sb2.toString());
                sb.append("Content-Transfer-Encoding: 8bit" + StringUtil.CRLF_STRING);
                sb.append(StringUtil.CRLF_STRING);
                sb.append(entry.getValue());
                sb.append(StringUtil.CRLF_STRING);
            }
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        if (!TextUtils.isEmpty(sb.toString())) {
            dataOutputStream.write(sb.toString().getBytes());
        }
        if (file != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("--");
            sb3.append(uuid);
            sb3.append(StringUtil.CRLF_STRING);
            sb3.append("Content-Disposition: form-data; name=\"file\"; filename=\"" + str2 + CommonConstant.Symbol.DOUBLE_QUOTES + StringUtil.CRLF_STRING);
            StringBuilder sb4 = new StringBuilder("Content-Type: application/octet-stream; charset=");
            sb4.append("UTF-8");
            sb4.append(StringUtil.CRLF_STRING);
            sb3.append(sb4.toString());
            sb3.append(StringUtil.CRLF_STRING);
            dataOutputStream.write(sb3.toString().getBytes());
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                dataOutputStream.write(bArr, 0, read);
            }
            fileInputStream.close();
            dataOutputStream.write(StringUtil.CRLF_STRING.getBytes());
        }
        dataOutputStream.write(("--" + uuid + "--" + StringUtil.CRLF_STRING).getBytes());
        dataOutputStream.flush();
        new StringBuilder("conn.getContentLength():").append(httpURLConnection.getContentLength());
        int responseCode = httpURLConnection.getResponseCode();
        InputStream inputStream = httpURLConnection.getInputStream();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return true;
                }
                stringBuffer.append(readLine);
            }
        } else {
            dataOutputStream.close();
            httpURLConnection.disconnect();
            return false;
        }
    }
}
