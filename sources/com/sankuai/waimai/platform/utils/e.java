package com.sankuai.waimai.platform.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.rtmp.TXLiveConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;

    private static Bitmap b(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7000970e5149d224b7bdb0ef88aa8989", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7000970e5149d224b7bdb0ef88aa8989");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a2 = a(str);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.sankuai.waimai.launcher.util.image.a.a(a2, options);
        a(i, i2, options, true);
        return com.sankuai.waimai.launcher.util.image.a.a(a2, options);
    }

    private static void a(int i, int i2, BitmapFactory.Options options, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), options, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "052c2b86031d0c9a404ccaea03381287", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "052c2b86031d0c9a404ccaea03381287");
        } else {
            a(i, i2, options.outWidth, options.outHeight, options, true);
        }
    }

    private static void a(int i, int i2, int i3, int i4, BitmapFactory.Options options, boolean z) {
        int max;
        int i5 = 1;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), options, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ce4fe167c2d2de224cca0e2d02723e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ce4fe167c2d2de224cca0e2d02723e3");
            return;
        }
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                max = (int) Math.floor(i3 / i);
            } else if (i == 0) {
                max = (int) Math.floor(i4 / i2);
            } else {
                int floor = (int) Math.floor(i4 / i2);
                int floor2 = (int) Math.floor(i3 / i);
                max = z ? Math.max(floor, floor2) : Math.min(floor, floor2);
            }
            i5 = max;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }

    @NonNull
    private static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cadaa944c864b24975bf63cbacd0f3d9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cadaa944c864b24975bf63cbacd0f3d9") : (str.startsWith("file://") || str.startsWith("FILE://")) ? str.substring(7) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf A[Catch: Throwable -> 0x00fc, TryCatch #0 {Throwable -> 0x00fc, blocks: (B:8:0x003f, B:10:0x005d, B:23:0x008d, B:27:0x00a0, B:29:0x00a7, B:31:0x00cf, B:33:0x00f4, B:32:0x00d6, B:28:0x00a4, B:11:0x0068), top: B:38:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6 A[Catch: Throwable -> 0x00fc, TryCatch #0 {Throwable -> 0x00fc, blocks: (B:8:0x003f, B:10:0x005d, B:23:0x008d, B:27:0x00a0, B:29:0x00a7, B:31:0x00cf, B:33:0x00f4, B:32:0x00d6, B:28:0x00a4, B:11:0x0068), top: B:38:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.net.Uri r26, android.graphics.Bitmap.CompressFormat r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.utils.e.a(android.net.Uri, android.graphics.Bitmap$CompressFormat, int, int):boolean");
    }

    private static boolean a(Uri uri, Bitmap.CompressFormat compressFormat, Bitmap bitmap) {
        FileOutputStream fileOutputStream;
        Object[] objArr = {uri, compressFormat, bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileOutputStream fileOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5da381f7e1ed422e9827d558c84187d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5da381f7e1ed422e9827d558c84187d")).booleanValue();
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(uri.getPath());
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(compressFormat, 90, fileOutputStream);
            bitmap.recycle();
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                com.sankuai.waimai.foundation.utils.log.a.a(e2);
            }
            return true;
        } catch (Exception e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e4);
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e5);
                }
            }
            throw th;
        }
    }

    private static String c(String str, int i, int i2) throws IOException {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8aeadd99d5100b904ef935099f98272", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8aeadd99d5100b904ef935099f98272");
        }
        Object[] objArr2 = {str, Integer.valueOf(i), Integer.valueOf(i2), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b607ffd5d75c9c6c0527ed8e77231f20", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b607ffd5d75c9c6c0527ed8e77231f20") : a(str, i, i2, 75, true);
    }

    public static String a(String str, int i, int i2, int i3, boolean z) throws IOException {
        int c;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07197e623670d20046ea57d559daf8cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07197e623670d20046ea57d559daf8cb");
        }
        Map<String, String> b = b(a(str));
        Bitmap b2 = b(str, i, i2);
        if (b2 != null) {
            if (z && (c = c(str)) != 0) {
                Matrix matrix = new Matrix();
                int width = b2.getWidth();
                int height = b2.getHeight();
                matrix.setRotate(c);
                b2 = Bitmap.createBitmap(b2, 0, 0, width, height, matrix, true);
            }
            Context context = com.meituan.android.singleton.b.a;
            File a2 = com.meituan.android.cipstorage.q.a(context, "wm_platform", "/compress_" + new File(a(str)).getName(), u.b);
            a2.getParentFile().mkdirs();
            if (a2.exists()) {
                a2.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(a2);
            b2.compress(Bitmap.CompressFormat.JPEG, i3, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            if (a2.exists()) {
                a(a2.getAbsolutePath(), b);
            }
            return a2.getAbsolutePath();
        }
        return null;
    }

    public static byte[] a(String str, int i, int i2) throws IOException {
        String c;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02ba8814eb7fd794949d81742f169711", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02ba8814eb7fd794949d81742f169711");
        }
        if (TextUtils.isEmpty(str) || (c = c(str, i, i2)) == null) {
            return null;
        }
        byte[] c2 = com.sankuai.waimai.foundation.utils.j.c(c);
        File file = new File(c);
        if (file.exists()) {
            file.delete();
        }
        return c2;
    }

    private static Map<String, String> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4faf3f48b7b63abdc9e63bdb50c1b75b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4faf3f48b7b63abdc9e63bdb50c1b75b");
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            File file = new File(str);
            if (file.exists()) {
                String str2 = Build.VERSION.SDK_INT >= 24 ? "UserComment" : "UserComment";
                HashMap hashMap = new HashMap();
                ExifInterface exifInterface = new ExifInterface(str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("orgWidth", exifInterface.getAttribute("ImageWidth"));
                jSONObject.put("orgHeight", exifInterface.getAttribute("ImageLength"));
                jSONObject.put("orgFileModifiedDate", com.sankuai.waimai.platform.utils.time.b.a(file.lastModified(), "yyyy:MM:dd HH:mm:ss.sss"));
                jSONObject.put("path", str);
                jSONObject.put("systemtime", exifInterface.getAttribute("DateTime"));
                jSONObject.put("orgUserComment", exifInterface.getAttribute(str2));
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
                jSONObject.put("FileType", fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase()) : "");
                jSONObject.put("FileTypeExtension", fileExtensionFromUrl);
                Field[] fields = ExifInterface.class.getFields();
                for (int i = 0; i < fields.length; i++) {
                    String name = fields[i].getName();
                    if (!TextUtils.isEmpty(name) && name.startsWith("TAG")) {
                        String obj = fields[i].get(ExifInterface.class).toString();
                        String attribute = exifInterface.getAttribute(obj);
                        if (!TextUtils.isEmpty(attribute)) {
                            hashMap.put(obj, attribute);
                        }
                    }
                }
                hashMap.put(str2, jSONObject.toString());
                return hashMap;
            }
            return null;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return null;
        }
    }

    private static void a(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9bcb3826f780a5ffe8d7b9fa421e90dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9bcb3826f780a5ffe8d7b9fa421e90dc");
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                ExifInterface exifInterface = new ExifInterface(str);
                if (map != null) {
                    for (String str2 : map.keySet()) {
                        String str3 = map.get(str2);
                        if (!TextUtils.isEmpty(str3)) {
                            exifInterface.setAttribute(str2, str3);
                        }
                    }
                    exifInterface.saveAttributes();
                }
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    public static final int a(BitmapFactory.Options options, int i, int i2) {
        Object[] objArr = {options, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f666da126080aa8ab6587625e5b867c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f666da126080aa8ab6587625e5b867c")).intValue();
        }
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i == 0 || i2 == 0) {
            return 1;
        }
        if (i3 > i2 || i4 > i) {
            int round = Math.round(i3 / i2);
            int round2 = Math.round(i4 / i);
            return round < round2 ? round : round2;
        }
        return 1;
    }

    public static final Bitmap a(InputStream inputStream, int i, int i2, Bitmap.Config config) {
        Bitmap a2;
        Object[] objArr = {inputStream, Integer.valueOf(i), Integer.valueOf(i2), config};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec29ff8707547750ac278d773e167d6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec29ff8707547750ac278d773e167d6b");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ReadableByteChannel newChannel = Channels.newChannel(inputStream);
            ByteBuffer allocate = ByteBuffer.allocate(1024);
            while (newChannel.read(allocate) != -1) {
                allocate.flip();
                while (allocate.hasRemaining()) {
                    byteArrayOutputStream.write(allocate.get());
                }
                allocate.clear();
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Object[] objArr2 = {byteArray, Integer.valueOf(i), Integer.valueOf(i2), config};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3ad6187b7d9e68198d0a3c944549861e", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (Bitmap) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3ad6187b7d9e68198d0a3c944549861e");
            } else {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                options.inPreferredConfig = config;
                com.sankuai.waimai.launcher.util.image.a.a(byteArray, 0, byteArray.length, options);
                options.inSampleSize = a(options, i, i2);
                options.inJustDecodeBounds = false;
                a2 = com.sankuai.waimai.launcher.util.image.a.a(byteArray, 0, byteArray.length, options);
            }
            inputStream.close();
            newChannel.close();
            byteArrayOutputStream.close();
            return a2;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return null;
        }
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        Bitmap bitmap2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fe7811f6025cbe9854c53963890b700", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fe7811f6025cbe9854c53963890b700");
        }
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i3 = height * i;
            int i4 = width * i2;
            if (i3 > i4) {
                bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, width, (int) ((i2 / i) * width));
            } else if (i3 < i4) {
                int i5 = (int) ((i / i2) * height);
                bitmap2 = Bitmap.createBitmap(bitmap, (int) ((width - i5) / 2.0f), 0, i5, height);
            }
            if (bitmap2 != null) {
                bitmap.recycle();
                return bitmap2;
            }
            return bitmap;
        }
        return bitmap;
    }

    public static String a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1488047fcc573947eaf197c62d12a085", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1488047fcc573947eaf197c62d12a085");
        }
        if (inputStream != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                com.sankuai.waimai.launcher.util.image.a.a(inputStream, (Rect) null, options).recycle();
                String str = options.outMimeType;
                try {
                    inputStream.close();
                    return str;
                } catch (IOException unused) {
                    return str;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }

    private static int c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "480e81080d32e611791ea52a4a4e4c18", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "480e81080d32e611791ea52a4a4e4c18")).intValue();
        }
        try {
            if (str.startsWith("file://") || str.startsWith("FILE://")) {
                str = Uri.parse(str).getPath();
            }
            String attribute = new ExifInterface(str).getAttribute("Orientation");
            if (TextUtils.isEmpty(attribute)) {
                return 0;
            }
            int parseInt = Integer.parseInt(attribute);
            if (parseInt != 1) {
                if (parseInt != 3) {
                    if (parseInt != 6) {
                        return parseInt != 8 ? 0 : 270;
                    }
                    return 90;
                }
                return TXLiveConstants.RENDER_ROTATION_180;
            }
            return 0;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return 0;
        }
    }
}
