package com.sankuai.meituan.android.knb.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.WindowManager;
import android.webkit.URLUtil;
import com.dianping.networklog.c;
import com.dianping.titans.utils.ContentResolverProvider;
import com.meituan.android.cipstorage.q;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import com.sankuai.waimai.launcher.util.image.a;
import com.tencent.rtmp.TXLiveConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ImageUtils {
    public static final String TITANS_CHANNEL = "mtplatform_titans";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int getExifOrientation(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c278643eef7ab98520d1e5b419972a41", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c278643eef7ab98520d1e5b419972a41")).intValue();
        }
        try {
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
            e.printStackTrace();
            return 0;
        }
    }

    public static Pair<Boolean, Bitmap> checkAndParseBase64(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c8da579561ff3fa46b4b0da611b45255", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c8da579561ff3fa46b4b0da611b45255");
        }
        if (TextUtils.isEmpty(str)) {
            return Pair.create(Boolean.FALSE, null);
        }
        Matcher matcher = Pattern.compile("^data:image/\\S+;base64,").matcher(str);
        if (!matcher.find()) {
            return Pair.create(Boolean.FALSE, null);
        }
        try {
            byte[] decode = Base64.decode(str.substring(matcher.end()), 0);
            return Pair.create(Boolean.TRUE, a.a(decode, 0, decode.length));
        } catch (Throwable unused) {
            return Pair.create(Boolean.TRUE, null);
        }
    }

    public static int[] getBitmapSize(Context context, String str, String str2) {
        InputStream inputStream;
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "507e86ce91312e2c1ef3623f5cf0fa6d", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "507e86ce91312e2c1ef3623f5cf0fa6d");
        }
        try {
            inputStream = getUriInputStream(context, str, str2);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                a.a(inputStream, (Rect) null, options);
                return new int[]{options.outWidth, options.outHeight};
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    return null;
                } finally {
                    IOUtils.close(inputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    private static File getCompressFile(Context context, String str, int i, int i2, String str2) {
        File file;
        String name;
        String str3;
        int indexOf;
        Object[] objArr = {context, str, Integer.valueOf(i), Integer.valueOf(i2), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c5dfa2a16f3210efd77457ffe0690819", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c5dfa2a16f3210efd77457ffe0690819");
        }
        if (URLUtil.isContentUrl(str)) {
            String a = ContentResolverProvider.getContentResolver(context, str2).a(Uri.parse(str));
            String str4 = ".jpeg";
            if (!TextUtils.isEmpty(a) && (indexOf = a.indexOf("/")) > 0) {
                str4 = CommonConstant.Symbol.DOT + a.substring(indexOf + 1);
            }
            if (TextUtils.equals(str4, ".x-ms-bmp")) {
                str4 = ".bmp";
            }
            str3 = str.substring(str.lastIndexOf("/") + 1) + "_compress_" + i + CommonConstant.Symbol.UNDERLINE + i2 + str4;
        } else {
            int lastIndexOf = new File(str).getName().lastIndexOf(46);
            str3 = file.getName().substring(0, file.getName().lastIndexOf(CommonConstant.Symbol.DOT)) + "_compress_" + i + CommonConstant.Symbol.UNDERLINE + i2 + name.substring(lastIndexOf);
        }
        return q.b(context, "mtplatform_titans", str3);
    }

    public static String compressAndSaveImage(Context context, String str, int i, int i2) throws Exception {
        Object[] objArr = {context, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3259035dee0b12e69d59ad15743939ad", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3259035dee0b12e69d59ad15743939ad") : compressAndSaveImage(context, str, i, i2, "");
    }

    public static String compressAndSaveImage(Context context, String str, int i, int i2, String str2) throws Exception {
        int i3;
        int i4;
        int i5;
        int i6;
        Bitmap bitmap;
        int i7 = i;
        Object[] objArr = {context, str, Integer.valueOf(i), Integer.valueOf(i2), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9f7bf331ae4f6e1a99e64723e10433fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9f7bf331ae4f6e1a99e64723e10433fe");
        }
        File compressFile = getCompressFile(context, str, i, i2, str2);
        if (compressFile != null && compressFile.exists()) {
            return compressFile.getAbsolutePath();
        }
        if (!compressFile.getParentFile().exists()) {
            compressFile.getParentFile().mkdirs();
        }
        InputStream uriInputStream = getUriInputStream(context, str, str2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        a.a(uriInputStream, (Rect) null, options);
        IOUtils.close(uriInputStream);
        int i8 = options.outWidth;
        int i9 = options.outHeight;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            i4 = windowManager.getDefaultDisplay().getWidth();
            i3 = windowManager.getDefaultDisplay().getHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (i7 <= 0 || i7 > 100) {
            i5 = 0;
            i6 = 0;
        } else {
            i5 = (i8 * i7) / 100;
            i6 = (i9 * i7) / 100;
        }
        if (i4 > 0 && i3 > 0 && i5 != 0 && i6 != 0) {
            while (true) {
                if (i5 <= i4 && i6 <= i3) {
                    break;
                }
                i7 -= 5;
                if (i7 <= 0) {
                    break;
                }
                i5 = (i8 * i7) / 100;
                i6 = (i9 * i7) / 100;
            }
        }
        InputStream uriInputStream2 = getUriInputStream(context, str, str2);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = computeSize(i8, i9);
        Bitmap a = a.a(uriInputStream2, (Rect) null, options2);
        IOUtils.close(uriInputStream2);
        if (a == null) {
            throw new Exception("bitmap is null");
        }
        if (i5 <= 0 || i6 <= 0 || (a.getWidth() == i5 && a.getHeight() == i6)) {
            bitmap = a;
        } else {
            bitmap = Bitmap.createScaledBitmap(a, i5, i6, true);
            a.recycle();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(compressFile);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        String lowerCase = compressFile.getName().toLowerCase();
        if (lowerCase.endsWith("webp")) {
            compressFormat = Bitmap.CompressFormat.WEBP;
        } else if (lowerCase.endsWith("png")) {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        bitmap.compress(compressFormat, i2 > 0 ? i2 : 100, fileOutputStream);
        IOUtils.close(fileOutputStream);
        bitmap.recycle();
        try {
            saveExif(context, str, compressFile.getAbsolutePath(), str2);
        } catch (Throwable th) {
            c.a("save exif info error: " + Log.getStackTraceString(th), 3, new String[]{"saveExif"});
        }
        return compressFile.getAbsolutePath();
    }

    private static int computeSize(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cce9612c2bdf122ba82de4a808fce7d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cce9612c2bdf122ba82de4a808fce7d1")).intValue();
        }
        if (i % 2 == 1) {
            i++;
        }
        if (i2 % 2 == 1) {
            i2++;
        }
        int max = Math.max(i, i2);
        float min = Math.min(i, i2) / max;
        if (min > 1.0f || min <= 0.5625d) {
            double d = min;
            if (d <= 0.5625d && d > 0.5d) {
                int i3 = max / 1280;
                if (i3 == 0) {
                    return 1;
                }
                return i3;
            }
            return (int) Math.ceil(max / (1280.0d / d));
        } else if (max < 1664) {
            return 1;
        } else {
            if (max < 4990) {
                return 2;
            }
            if (max <= 4990 || max >= 10240) {
                int i4 = max / 1280;
                if (i4 == 0) {
                    return 1;
                }
                return i4;
            }
            return 4;
        }
    }

    public static void saveExif(Context context, String str, String str2, String str3) throws Exception {
        ExifInterface exifInterface;
        String obj;
        String attribute;
        Object[] objArr = {context, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        InputStream inputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a455ae5f412723456d07374352a69895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a455ae5f412723456d07374352a69895");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                InputStream uriInputStream = getUriInputStream(context, str, str3);
                try {
                    inputStream = uriInputStream;
                    exifInterface = new ExifInterface(uriInputStream);
                } catch (Throwable th) {
                    th = th;
                    inputStream = uriInputStream;
                    IOUtils.close(inputStream);
                    throw th;
                }
            } else {
                exifInterface = new ExifInterface(str);
            }
            ExifInterface exifInterface2 = new ExifInterface(str2);
            Field[] fields = ExifInterface.class.getFields();
            for (int i = 0; i < fields.length; i++) {
                String name = fields[i].getName();
                if (!TextUtils.isEmpty(name) && name.startsWith("TAG") && (attribute = exifInterface.getAttribute((obj = fields[i].get(ExifInterface.class).toString()))) != null) {
                    exifInterface2.setAttribute(obj, attribute);
                }
            }
            exifInterface2.saveAttributes();
            IOUtils.close(inputStream);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static InputStream getUriInputStream(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8cc76d960d779f26917db6a536bb9d95", RobustBitConfig.DEFAULT_VALUE) ? (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8cc76d960d779f26917db6a536bb9d95") : getUriInputStream(context, str, "");
    }

    public static InputStream getUriInputStream(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b826548e8a6c9446de2ee8f1d69e4a10", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b826548e8a6c9446de2ee8f1d69e4a10");
        }
        if (URLUtil.isContentUrl(str)) {
            try {
                return ContentResolverProvider.getContentResolver(context, str2).b(Uri.parse(str));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else if (URLUtil.isNetworkUrl(str)) {
            try {
                return HttpURLWrapper.wrapOpenStream(new URL(str));
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } else {
            try {
                return new FileInputStream(new File(str));
            } catch (FileNotFoundException e3) {
                e3.printStackTrace();
            }
        }
        return null;
    }
}
