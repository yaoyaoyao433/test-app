package com.meituan.msi.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.metrics.traffic.trace.TraceSQLHelper;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.util.m;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.mapsdk.internal.jw;
import com.tencent.rtmp.TXLiveConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;
    public static final Handler b = new Handler(Looper.getMainLooper());

    public static /* synthetic */ void a(String str, Activity activity, final MsiContext msiContext) {
        boolean a2;
        Object[] objArr = {str, activity, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f0be3f4b19091ca686f1d4b5138574f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f0be3f4b19091ca686f1d4b5138574f");
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            if (!com.meituan.msi.util.file.d.a()) {
                a(msiContext, "Class:ImageModule Api:saveImageToPhotosAlbum failed");
                return;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                a2 = a(activity, fileInputStream, str, msiContext);
            } else {
                Object[] objArr2 = {activity, fileInputStream};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "99b786cd17d9e3550932ba5b89e92f33", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "99b786cd17d9e3550932ba5b89e92f33")).booleanValue();
                } else {
                    File file = new File(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath()), String.format("%s_%s%s", AbsApiFactory.PASSPORT_ONLINE_URL, Long.toHexString(new Date().getTime()), ".png"));
                    if (file.exists()) {
                        file.delete();
                    }
                    com.meituan.msi.util.file.d.a(file);
                    a2 = com.meituan.msi.util.file.d.a(fileInputStream, file.getAbsolutePath());
                    activity.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + file)));
                }
            }
            if (!a2) {
                a(msiContext, (String) null);
                return;
            }
            Object[] objArr3 = {msiContext};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "5ca239852bb043920c2675a93d090ffd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "5ca239852bb043920c2675a93d090ffd");
            } else if (msiContext == null) {
            } else {
                b.post(new Runnable() { // from class: com.meituan.msi.util.i.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e7a2a94608d366215c3e28ed3b2955a6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e7a2a94608d366215c3e28ed3b2955a6");
                        } else {
                            MsiContext.this.onSuccess("");
                        }
                    }
                });
            }
        } catch (FileNotFoundException e) {
            a(msiContext, e.toString());
        }
    }

    public static String a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a9be0b8fde0f303f8bcd22aa6dda512", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a9be0b8fde0f303f8bcd22aa6dda512");
        }
        try {
            switch (Integer.valueOf(new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 1)).intValue()) {
                case 1:
                    return TraceSQLHelper.KEY_UP;
                case 2:
                    return "up-mirrored";
                case 3:
                    return TraceSQLHelper.KEY_DOWN;
                case 4:
                    return "down-mirrored";
                case 5:
                    return "left-mirrored";
                case 6:
                    return "right";
                case 7:
                    return "right-mirrored";
                case 8:
                    return "left";
                default:
                    return TraceSQLHelper.KEY_UP;
            }
        } catch (IOException unused) {
            return TraceSQLHelper.KEY_UP;
        }
    }

    public static com.meituan.msi.api.image.a a(String str) {
        int i;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47b9a681945c005b75c2b69d90ed6725", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msi.api.image.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47b9a681945c005b75c2b69d90ed6725");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        try {
            Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(str, options);
            if ("image/jpeg".equals(options.outMimeType)) {
                Object[] objArr2 = {a2, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cf5df35500e74c74b28470e4b2b93511", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cf5df35500e74c74b28470e4b2b93511");
                } else {
                    int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
                    if (attributeInt == 3) {
                        i = TXLiveConstants.RENDER_ROTATION_180;
                    } else if (attributeInt == 6) {
                        i = 90;
                    } else if (attributeInt != 8) {
                        switch (attributeInt) {
                            case 0:
                            case 1:
                                a2.recycle();
                                break;
                            default:
                                i = 0;
                                break;
                        }
                    } else {
                        i = 270;
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i);
                    Bitmap createBitmap = Bitmap.createBitmap(a2, 0, 0, a2.getWidth(), a2.getHeight(), matrix, true);
                    FileOutputStream fileOutputStream = new FileOutputStream(str, false);
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
                    h.a(fileOutputStream);
                    try {
                        createBitmap.recycle();
                        a2.recycle();
                    } catch (Exception unused) {
                    }
                }
            } else if (a2 != null) {
                a2.recycle();
            }
            return new com.meituan.msi.api.image.a(a2.getHeight(), a2.getWidth(), str);
        } catch (Exception unused2) {
            return null;
        }
    }

    private static int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        Object[] objArr = {options, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2952a4b5ea443ac312a7a1ef36f3506", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2952a4b5ea443ac312a7a1ef36f3506")).intValue();
        }
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        if (i4 > i2 || i5 > i) {
            int i6 = i4 / 2;
            int i7 = i5 / 2;
            i3 = 2;
            while (i6 / i3 >= i2 && i7 / i3 >= i) {
                i3 *= 2;
            }
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.Map] */
    public static com.meituan.msi.api.image.a a(File file, Context context, String str) {
        int i;
        Bitmap createBitmap;
        Bitmap createBitmap2;
        Object[] objArr = {file, context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f5dce0c9913836596e0a1ebbed5e5da", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msi.api.image.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f5dce0c9913836596e0a1ebbed5e5da");
        }
        int i2 = f.a(context).widthPixels;
        int i3 = f.a(context).heightPixels;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.sankuai.waimai.launcher.util.image.a.a(file.getAbsolutePath(), options);
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        com.meituan.msi.api.image.a aVar = new com.meituan.msi.api.image.a(i4, i5, file.getAbsolutePath());
        if ("image/gif".equals(options.outMimeType)) {
            return aVar;
        }
        boolean z = i4 >= i5;
        int max = Math.max(i4, i5);
        int min = Math.min(i4, i5);
        float f = max / min;
        int i6 = jw.h;
        if (min < 640) {
            return aVar;
        }
        if (f <= 1.0f) {
            i = (max * jw.h) / min;
        } else if (f > 2.0f) {
            return aVar;
        } else {
            i = (max * TXEAudioDef.TXE_OPUS_SAMPLE_NUM) / min;
            i6 = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        }
        int i7 = z ? i : i6;
        if (z) {
            i = i6;
        }
        options.inSampleSize = a(options, i, i7);
        options.inJustDecodeBounds = false;
        options.inDither = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inTempStorage = new byte[32768];
        try {
            Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(file.getAbsolutePath(), options);
            try {
                if ("image/jpeg".equals(options.outMimeType)) {
                    createBitmap = Bitmap.createBitmap(i, i7, Bitmap.Config.RGB_565);
                } else if (!"image/png".equals(options.outMimeType)) {
                    return aVar;
                } else {
                    createBitmap = Bitmap.createBitmap(i, i7, Bitmap.Config.ARGB_8888);
                }
                float f2 = i;
                float f3 = f2 / options.outWidth;
                float f4 = i7;
                float f5 = f4 / options.outHeight;
                float f6 = f2 / 2.0f;
                float f7 = f4 / 2.0f;
                Matrix matrix = new Matrix();
                matrix.setScale(f3, f5, f6, f7);
                Canvas canvas = new Canvas(createBitmap);
                canvas.setMatrix(matrix);
                canvas.drawBitmap(a2, f6 - (a2.getWidth() / 2), f7 - (a2.getHeight() / 2), new Paint(2));
                HashMap hashMap = new HashMap();
                try {
                    hashMap = a(com.meituan.msi.a.f(), file.getAbsolutePath(), str);
                } catch (Exception unused) {
                    com.meituan.msi.log.a.a("fail to get exif");
                }
                try {
                    try {
                        try {
                            int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0);
                            Matrix matrix2 = new Matrix();
                            if (attributeInt == 6) {
                                matrix2.postRotate(90.0f);
                            } else if (attributeInt == 3) {
                                matrix2.postRotate(180.0f);
                            } else if (attributeInt == 8) {
                                matrix2.postRotate(270.0f);
                            }
                            createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix2, true);
                        } catch (Exception unused2) {
                        }
                    } catch (IOException e) {
                        e = e;
                    } catch (OutOfMemoryError unused3) {
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    aVar.b = createBitmap2.getHeight();
                    aVar.c = createBitmap2.getWidth();
                    try {
                        a2.recycle();
                    } catch (Throwable unused4) {
                    }
                } catch (IOException e2) {
                    e = e2;
                    createBitmap = createBitmap2;
                    e.printStackTrace();
                    try {
                        a2.recycle();
                    } catch (Throwable unused5) {
                    }
                    if (createBitmap != null) {
                        file.delete();
                        FileOutputStream fileOutputStream = new FileOutputStream(file.getAbsolutePath(), false);
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream);
                        fileOutputStream.flush();
                        h.a(fileOutputStream);
                        createBitmap.recycle();
                        a(file, hashMap);
                    }
                    return aVar;
                } catch (OutOfMemoryError unused6) {
                    createBitmap = createBitmap2;
                    System.gc();
                    try {
                        a2.recycle();
                    } catch (Throwable unused7) {
                    }
                    if (createBitmap != null) {
                        file.delete();
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file.getAbsolutePath(), false);
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream2);
                        fileOutputStream2.flush();
                        h.a(fileOutputStream2);
                        createBitmap.recycle();
                        a(file, hashMap);
                    }
                    return aVar;
                } catch (Throwable th2) {
                    th = th2;
                    createBitmap = createBitmap2;
                    try {
                        a2.recycle();
                    } catch (Throwable unused8) {
                    }
                    if (createBitmap != null) {
                        try {
                            file.delete();
                            FileOutputStream fileOutputStream3 = new FileOutputStream(file.getAbsolutePath(), false);
                            createBitmap.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream3);
                            fileOutputStream3.flush();
                            h.a(fileOutputStream3);
                            createBitmap.recycle();
                            a(file, hashMap);
                        } catch (Exception unused9) {
                        }
                    }
                    throw th;
                }
                if (createBitmap2 != null) {
                    file.delete();
                    FileOutputStream fileOutputStream4 = new FileOutputStream(file.getAbsolutePath(), false);
                    createBitmap2.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream4);
                    fileOutputStream4.flush();
                    h.a(fileOutputStream4);
                    createBitmap2.recycle();
                    a(file, hashMap);
                }
                return aVar;
            } catch (Throwable th3) {
                th3.printStackTrace();
                return aVar;
            }
        } catch (Throwable th4) {
            th4.printStackTrace();
            return aVar;
        }
    }

    private static Map a(Context context, String str, String str2) throws Exception {
        ExifInterface exifInterface;
        String obj;
        String attribute;
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        InputStream inputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f82c713f65dea0583d0968971ca87c46", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f82c713f65dea0583d0968971ca87c46");
        }
        HashMap hashMap = new HashMap();
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                InputStream b2 = b(context, str, str2);
                try {
                    inputStream = b2;
                    exifInterface = new ExifInterface(b2);
                } catch (Throwable th) {
                    th = th;
                    inputStream = b2;
                    IOUtils.close(inputStream);
                    throw th;
                }
            } else {
                exifInterface = new ExifInterface(str);
            }
            Field[] fields = ExifInterface.class.getFields();
            for (int i = 0; i < fields.length; i++) {
                String name = fields[i].getName();
                if (!TextUtils.isEmpty(name) && name.startsWith("TAG") && (attribute = exifInterface.getAttribute((obj = fields[i].get(ExifInterface.class).toString()))) != null) {
                    hashMap.put(obj, attribute);
                }
            }
            IOUtils.close(inputStream);
            return hashMap;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void a(File file, Map<String, String> map) {
        Object[] objArr = {file, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "edbae77354feff3187013e0bb1ad2142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "edbae77354feff3187013e0bb1ad2142");
        } else if (file == null || map == null || map.size() == 0) {
            com.meituan.msi.log.a.a("imageFile or exifMap is null ");
        } else {
            try {
                ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    exifInterface.setAttribute(entry.getKey(), entry.getValue());
                }
                exifInterface.saveAttributes();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static InputStream b(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c64ba47d0e133d597ba6976f854b98cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c64ba47d0e133d597ba6976f854b98cf");
        }
        if (URLUtil.isContentUrl(str)) {
            Uri parse = Uri.parse(str);
            try {
                com.meituan.android.privacy.interfaces.t createContentResolver = Privacy.createContentResolver(context.getApplicationContext(), str2);
                if (createContentResolver == null) {
                    return null;
                }
                return createContentResolver.b(parse);
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

    public static void a(final Activity activity, final String str, final MsiContext msiContext) {
        Object[] objArr = {activity, str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a24d7c77eea94ee2f7aaa833ce98d5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a24d7c77eea94ee2f7aaa833ce98d5c");
        } else {
            m.a.a(new Runnable() { // from class: com.meituan.msi.util.i.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f01372a5f38e66c84b2a15e92095ec08", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f01372a5f38e66c84b2a15e92095ec08");
                    } else {
                        i.a(str, activity, msiContext);
                    }
                }
            });
        }
    }

    @RequiresApi(api = 29)
    private static boolean a(Activity activity, InputStream inputStream, String str, MsiContext msiContext) {
        Object[] objArr = {activity, inputStream, str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileInputStream fileInputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2292527195a5ecf353f0365b980e43b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2292527195a5ecf353f0365b980e43b0")).booleanValue();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.sankuai.waimai.launcher.util.image.a.a(inputStream, (Rect) null, options);
        String str2 = options.outMimeType;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (fileInputStream == null) {
            a(msiContext, "Class:ImageModule Api:saveImageToPhotosAlbum getInputStream failed");
            return false;
        }
        return com.meituan.msi.util.file.d.a(activity, fileInputStream, str2, new File(str).getName(), true, ae.a(msiContext.getArgs()));
    }

    private static void a(final MsiContext msiContext, final String str) {
        Object[] objArr = {msiContext, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75de7da7b6508affe2242ae14417b7b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75de7da7b6508affe2242ae14417b7b3");
        } else if (msiContext == null) {
        } else {
            b.post(new Runnable() { // from class: com.meituan.msi.util.i.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a82274b05e637829d942fcf11e52e82", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a82274b05e637829d942fcf11e52e82");
                    } else {
                        MsiContext.this.onError(str);
                    }
                }
            });
        }
    }
}
