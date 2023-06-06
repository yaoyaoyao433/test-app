package com.sankuai.shangou.stone.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.rtmp.TXLiveConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static String b = "wm_sc_stone";

    @WorkerThread
    public static byte[] a(@NonNull Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43f5d6ff5242baa1b12df23c0c380373", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43f5d6ff5242baa1b12df23c0c380373");
        }
        if (bitmap == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
            byteArrayOutputStream = null;
        }
        try {
            boolean compress = bitmap.compress(Bitmap.CompressFormat.PNG, 85, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
            if (compress) {
                return byteArray;
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e2) {
                    com.sankuai.shangou.stone.util.log.a.a(e2);
                }
            }
            throw th;
        }
    }

    public static Bitmap a(@NonNull View view, int i) {
        Object[] objArr = {view, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "307544b3f5439438f49f16a8519eb86b", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "307544b3f5439438f49f16a8519eb86b") : a(view, 0, false);
    }

    public static Bitmap a(@NonNull View view, int i, boolean z) {
        Object[] objArr = {view, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "220c91d9f07e2d4c99c3cde2d2d69d8b", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "220c91d9f07e2d4c99c3cde2d2d69d8b") : a(view, i, (Drawable) null, z);
    }

    public static Bitmap a(View view, int i, Drawable drawable, boolean z) {
        Bitmap createBitmap;
        Object[] objArr = {view, Integer.valueOf(i), drawable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10d205229743677236fe435684d4d7a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10d205229743677236fe435684d4d7a8");
        }
        if (view == null) {
            return null;
        }
        int b2 = b(view);
        if (!z) {
            createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), b2 - i, Bitmap.Config.RGB_565);
        } else {
            createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), b2 - i, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(createBitmap);
        if (drawable != null) {
            drawable.setBounds(a(view));
            drawable.draw(canvas);
        }
        view.draw(canvas);
        return createBitmap;
    }

    private static Rect a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "431aa99865072ff5fe0422256607c9f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "431aa99865072ff5fe0422256607c9f3");
        }
        if (view == null) {
            return new Rect();
        }
        View c = c(view);
        return new Rect(c.getLeft(), c.getTop(), c.getRight(), c.getBottom());
    }

    private static int b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87147758775e7e9ca58ff3ee5b8079a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87147758775e7e9ca58ff3ee5b8079a9")).intValue();
        }
        if (view == null) {
            return 0;
        }
        return c(view).getMeasuredHeight();
    }

    @NonNull
    private static View c(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f96c6c285a1e8db388679a970a55a90d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f96c6c285a1e8db388679a970a55a90d");
        }
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            if (scrollView.getChildCount() > 0) {
                return scrollView.getChildAt(0);
            }
        }
        return view;
    }

    @WorkerThread
    public static Bitmap a(Bitmap bitmap, int i, int i2, boolean z) {
        float f;
        Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5130d16d6bf3dbad8dd89af5674c5c23", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5130d16d6bf3dbad8dd89af5674c5c23");
        }
        if (bitmap != null) {
            if (i == 0 && i2 == 0) {
                return bitmap;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (i2 > 0 && i == 0) {
                f = i2 / height;
            } else if (i <= 0 || i2 != 0) {
                f = i / width;
                float f2 = i2 / height;
                if (f2 > f) {
                    f = f2;
                }
            } else {
                f = i / width;
            }
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        }
        throw new IllegalStateException("bitmap cannot be null");
    }

    public static Bitmap a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dca453fa9abe563db75f712ed6ffee12", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dca453fa9abe563db75f712ed6ffee12");
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = !drawable.getBounds().isEmpty() ? drawable.getBounds().width() : drawable.getIntrinsicWidth();
        int height = !drawable.getBounds().isEmpty() ? drawable.getBounds().height() : drawable.getIntrinsicHeight();
        if (width <= 0) {
            width = 1;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height > 0 ? height : 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        float width;
        float f;
        Bitmap.Config config;
        Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86443f71a1bcb5ee1b8359a1fd3946fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86443f71a1bcb5ee1b8359a1fd3946fb");
        }
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            f = (i - (bitmap.getWidth() * width)) * 0.5f;
        } else {
            width = i / bitmap.getWidth();
            f2 = (i2 - (bitmap.getHeight() * width)) * 0.5f;
            f = 0.0f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f + 0.5f), (int) (f2 + 0.5f));
        Object[] objArr2 = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b898a1a3d4300f0686389775d028601a", RobustBitConfig.DEFAULT_VALUE)) {
            config = (Bitmap.Config) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b898a1a3d4300f0686389775d028601a");
        } else {
            config = bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        if (Build.VERSION.SDK_INT >= 12 && createBitmap != null) {
            createBitmap.setHasAlpha(bitmap.hasAlpha());
        }
        if (createBitmap == null) {
            return null;
        }
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(6));
        return createBitmap;
    }

    public static Bitmap a(String str, int i, int i2) {
        int max;
        int i3 = 1;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a71954ccb439954ee79bc8e0906973e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a71954ccb439954ee79bc8e0906973e");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a2 = a(str);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.sankuai.waimai.launcher.util.image.a.a(a2, options);
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), options, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1edfa7ce967fc704d41e5debb6b93d94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1edfa7ce967fc704d41e5debb6b93d94");
        } else {
            int i4 = options.outWidth;
            int i5 = options.outHeight;
            Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i5), options, (byte) 1};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "21e885f4cc975ab2689143435e13f08c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "21e885f4cc975ab2689143435e13f08c");
            } else {
                if (i5 > i2 || i4 > i) {
                    if (i2 == 0) {
                        max = (int) Math.floor(i4 / i);
                    } else if (i == 0) {
                        max = (int) Math.floor(i5 / i2);
                    } else {
                        max = Math.max((int) Math.floor(i5 / i2), (int) Math.floor(i4 / i));
                    }
                    i3 = max;
                }
                if (i3 >= 3) {
                    i3 = 3;
                }
                options.inSampleSize = i3;
                options.inJustDecodeBounds = false;
            }
        }
        return com.sankuai.waimai.launcher.util.image.a.a(a2, options);
    }

    @NonNull
    private static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "653ff5e77b452c9ab9b5ddda4f7c9b16", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "653ff5e77b452c9ab9b5ddda4f7c9b16") : (str.startsWith("file://") || str.startsWith("FILE://")) ? str.substring(7) : str;
    }

    public static Bitmap a(Bitmap bitmap, float f) throws OutOfMemoryError {
        Object[] objArr = {bitmap, Float.valueOf(180.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a6c3f8cdfc8ba86ecd318b09969c5b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a6c3f8cdfc8ba86ecd318b09969c5b3");
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(180.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static byte[] b(String str, int i, int i2) throws IOException {
        String c;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fbeea8304db816d9cc39d906957c84ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fbeea8304db816d9cc39d906957c84ce");
        }
        if (TextUtils.isEmpty(str) || (c = c(str, i, i2)) == null) {
            return null;
        }
        byte[] b2 = b(c);
        File file = new File(c);
        if (file.exists()) {
            file.delete();
        }
        return b2;
    }

    private static String c(String str, int i, int i2) throws IOException {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ada033263c5d3b39627042587e263f62", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ada033263c5d3b39627042587e263f62");
        }
        Map<String, String> c = c(a(str));
        Bitmap a2 = a(str, i, i2);
        if (a2 != null) {
            int d = d(str);
            if (d != 0) {
                Matrix matrix = new Matrix();
                int width = a2.getWidth();
                int height = a2.getHeight();
                matrix.setRotate(d);
                a2 = Bitmap.createBitmap(a2, 0, 0, width, height, matrix, true);
            }
            Context a3 = e.a();
            String str2 = b;
            File a4 = com.meituan.android.cipstorage.q.a(a3, str2, "/compress_" + new File(a(str)).getName(), com.meituan.android.cipstorage.u.b);
            if (a4 == null || a4.getParentFile() == null) {
                return null;
            }
            a4.getParentFile().mkdirs();
            if (a4.exists()) {
                a4.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(a4);
            try {
                a2.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                if (a4.exists()) {
                    a(a4.getAbsolutePath(), c);
                }
                return a4.getAbsolutePath();
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.io.FileInputStream] */
    private static byte[] b(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1522ebaa4b64fa5eb8e7b553c8f122de", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1522ebaa4b64fa5eb8e7b553c8f122de");
            }
            try {
                str = new FileInputStream(new File(str));
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream(1024);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = str.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            str.close();
                        } catch (Exception unused) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused2) {
                            return byteArray;
                        }
                    } catch (Exception e) {
                        e = e;
                        com.sankuai.shangou.stone.util.log.a.a(e);
                        if (str != 0) {
                            try {
                                str.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused4) {
                            }
                        }
                        return null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    byteArrayOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    if (str != 0) {
                        try {
                            str.close();
                        } catch (Exception unused5) {
                        }
                    }
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception unused6) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                str = 0;
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                str = 0;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = 1;
        }
    }

    private static Map<String, String> c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02f604e0461de0ec246eb5201467b2c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02f604e0461de0ec246eb5201467b2c7");
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
                long lastModified = file.lastModified();
                Object[] objArr2 = {new Long(lastModified), "yyyy:MM:dd HH:mm:ss.sss"};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                jSONObject.put("orgFileModifiedDate", PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "74da469142e69dec366a64266c331ee7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "74da469142e69dec366a64266c331ee7") : new SimpleDateFormat("yyyy:MM:dd HH:mm:ss.sss").format(new Date(lastModified)));
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
            com.sankuai.shangou.stone.util.log.a.a(e);
            return null;
        }
    }

    private static void a(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fca97273f95f7b81bca446f85190887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fca97273f95f7b81bca446f85190887");
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
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }

    private static int d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1579774da317b7ee23a4f3dd30aa2faa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1579774da317b7ee23a4f3dd30aa2faa")).intValue();
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
            com.sankuai.shangou.stone.util.log.a.a(e);
            return 0;
        }
    }
}
