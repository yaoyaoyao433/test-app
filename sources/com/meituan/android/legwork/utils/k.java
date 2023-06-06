package com.meituan.android.legwork.utils;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import com.dianping.titans.utils.LocalIdUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k {
    public static ChangeQuickRedirect a = null;
    public static String b = "";

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static BitmapFactory.Options a(BitmapFactory.Options options, int i) {
        Object[] objArr = {options, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "416cf10c07777b1016a218b54cedc54f", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapFactory.Options) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "416cf10c07777b1016a218b54cedc54f");
        }
        if (options == null) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            return options2;
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        x.c("PhotoBridge.resizePhoto", "读取到的原始宽高(" + i2 + CommonConstant.Symbol.COMMA + i3 + CommonConstant.Symbol.BRACKET_RIGHT);
        options.inJustDecodeBounds = false;
        int max = Math.max(i2, i3);
        if (max > i) {
            options.inSampleSize = (int) Math.ceil(max / i);
        }
        return options;
    }

    @Nullable
    public static Bitmap a(Uri uri, int i, String str) {
        Object[] objArr = {uri, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5d5d0f6e355af0cbe894e68e2ae48b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5d5d0f6e355af0cbe894e68e2ae48b3");
        }
        if (d(uri) || i <= 0) {
            return null;
        }
        try {
            boolean z = a() && LocalIdUtils.isContentResource(uri.toString());
            BitmapFactory.Options a2 = a(null, i);
            if (z) {
                com.meituan.android.privacy.interfaces.t createContentResolver = Privacy.createContentResolver(com.meituan.android.legwork.a.a(), str);
                if (createContentResolver == null) {
                    x.c("PhotoBridge.resizeBitmap", "隐私合规 无法获取ContentResolver");
                    return null;
                }
                ParcelFileDescriptor a3 = createContentResolver.a(uri, com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o);
                if (a3 == null) {
                    x.c("PhotoBridge.resizePhoto", "获取到的fd是空的");
                    return null;
                }
                BitmapFactory.decodeFileDescriptor(a3.getFileDescriptor(), null, a2);
                return BitmapFactory.decodeFileDescriptor(a3.getFileDescriptor(), null, a(a2, i));
            }
            String e = e(uri);
            com.sankuai.waimai.launcher.util.image.a.a(e, a2);
            return com.sankuai.waimai.launcher.util.image.a.a(e, a(a2, i));
        } catch (FileNotFoundException e2) {
            x.c("PhotoBridge.resizePhoto", "找不到文件：" + e2.getLocalizedMessage());
            e2.printStackTrace();
            return null;
        } catch (OutOfMemoryError e3) {
            x.c("PhotoBridge.resizePhoto", "压缩读取图片失败 oom");
            x.a(e3);
            return null;
        }
    }

    public static boolean a(Bitmap bitmap, int i, File file) {
        BufferedOutputStream bufferedOutputStream;
        Object[] objArr = {bitmap, Integer.valueOf(i), file};
        ChangeQuickRedirect changeQuickRedirect = a;
        BufferedOutputStream bufferedOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c27a36047ecb9063072083b53ba96034", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c27a36047ecb9063072083b53ba96034")).booleanValue();
        }
        try {
            try {
                a(file);
                file.createNewFile();
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, bufferedOutputStream);
            try {
                bufferedOutputStream.close();
            } catch (Exception e2) {
                x.c("ImageUtil.bitmapToFile", "关闭文件的时候出错" + e2.getLocalizedMessage());
            }
            return true;
        } catch (Exception e3) {
            e = e3;
            bufferedOutputStream2 = bufferedOutputStream;
            x.c("ImageUtil.bitmapToFile", "写入文件的时候出错" + e.getLocalizedMessage());
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (Exception e4) {
                    x.c("ImageUtil.bitmapToFile", "关闭文件的时候出错" + e4.getLocalizedMessage());
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (Exception e5) {
                    x.c("ImageUtil.bitmapToFile", "关闭文件的时候出错" + e5.getLocalizedMessage());
                }
            }
            throw th;
        }
    }

    private static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e174075b4bc728fb2c90cc3bed6df44c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e174075b4bc728fb2c90cc3bed6df44c")).booleanValue();
        }
        String externalStorageState = Environment.getExternalStorageState();
        return externalStorageState != null && externalStorageState.equals("mounted");
    }

    private static boolean a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "647ced60cf0a6aa5e2d49e7b6ef3df10", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "647ced60cf0a6aa5e2d49e7b6ef3df10")).booleanValue();
        }
        if (file == null || file.isDirectory()) {
            return false;
        }
        if (file.getParentFile() != null && !file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        return !file.exists() || file.delete();
    }

    @RequiresApi(api = 8)
    private static File d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9da81d5d7cb68865e28d2d99c48467d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9da81d5d7cb68865e28d2d99c48467d0");
        }
        if (b()) {
            try {
                return new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), str);
            } catch (Exception e) {
                x.c("ImageUtil.getLegworkFileAbove30()", "检查文件是否存在异常, exception msg:", e);
                return null;
            }
        }
        return null;
    }

    public static File a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40b6f9247eef0bbecda6b90e677f4159", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40b6f9247eef0bbecda6b90e677f4159");
        }
        if (b()) {
            try {
                return com.meituan.android.cipstorage.q.b(com.meituan.android.legwork.a.a(), "banma", str);
            } catch (Exception e) {
                x.c("ImageUtil.getLegworkFile()", "检查文件是否存在异常, exception msg:", e);
                return null;
            }
        }
        return null;
    }

    private static String c() {
        File a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1331795ea808cc839c37d0ab182d38ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1331795ea808cc839c37d0ab182d38ad");
        }
        if (TextUtils.isEmpty(b) && (a2 = a("")) != null) {
            b = a2.getAbsolutePath();
        }
        return b;
    }

    private static String e(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "421254b29a5ce6366994facf1ea39577", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "421254b29a5ce6366994facf1ea39577");
        }
        if (d(uri) || TextUtils.isEmpty(uri.getPath())) {
            return "";
        }
        String path = uri.getPath();
        int indexOf = path.indexOf(c());
        return indexOf >= 0 ? path.substring(indexOf) : path;
    }

    public static boolean a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fddeb53cbe8675bf1a527ae933aa4ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fddeb53cbe8675bf1a527ae933aa4ab")).booleanValue();
        }
        File file = new File(e(uri));
        return file.exists() && file.length() > 0;
    }

    public static boolean b(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e1300c790bb186eed416a1c92aa288a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e1300c790bb186eed416a1c92aa288a")).booleanValue();
        }
        if (d(uri)) {
            x.c("ImageUtil.deletePhoto", "删除图片失败 uri为空");
            return false;
        } else if (!a(uri)) {
            x.c("ImageUtil.deletePhoto", "删除图片失败 文件不存在");
            return false;
        } else {
            String e = e(uri);
            if (TextUtils.isEmpty(e) || !e.endsWith(".jpg") || !e.startsWith(c())) {
                x.c("ImageUtil.deletePhoto", "删除图片失败，非私有路径下jpg格式图片");
                return false;
            }
            try {
                File file = new File(e);
                file.delete();
                x.c("ImageUtil.deletePhoto", "删除图片成功 " + file.getAbsolutePath());
                return true;
            } catch (Exception e2) {
                x.c("ImageUtil.deletePhoto", "删除图片失败 " + uri.toString() + StringUtil.SPACE + e2.getLocalizedMessage());
                return false;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        TAKE_PHOTO,
        CROP_PHOTO;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46fedbe93a416628ceb080683516a157", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46fedbe93a416628ceb080683516a157");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21064bd6f703306513574b273b16eb7c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21064bd6f703306513574b273b16eb7c") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f09ee149251d5357d4db7a20c5367c1a", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f09ee149251d5357d4db7a20c5367c1a") : (a[]) values().clone();
        }
    }

    public static Uri a(String str, a aVar, String str2) {
        Uri fromFile;
        String str3;
        Object[] objArr;
        StringBuilder sb;
        String uri;
        com.meituan.android.privacy.interfaces.t createContentResolver;
        Object[] objArr2 = {str, aVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        Uri uri2 = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "0c341ea25300e70d8306d9d8a6533cf6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "0c341ea25300e70d8306d9d8a6533cf6");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Context a2 = com.meituan.android.legwork.a.a();
        if (aVar == a.CROP_PHOTO && a()) {
            File d = d(str);
            if (d == null) {
                return null;
            }
            a(d);
            try {
                createContentResolver = Privacy.createContentResolver(com.meituan.android.legwork.a.a(), str2);
            } catch (Exception e) {
                e = e;
            }
            if (createContentResolver == null) {
                x.c("PhotoBridge.getOutputMediaContentUri", "隐私合规 无法获取ContentResolver");
                return null;
            }
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("_data", d.getAbsolutePath());
            fromFile = createContentResolver.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            try {
                Object[] objArr3 = new Object[1];
                StringBuilder sb2 = new StringBuilder("高版本裁剪Uri:");
                sb2.append(d(fromFile) ? StringUtil.NULL : fromFile.toString());
                objArr3[0] = sb2.toString();
                x.c("ImageUtil.getOutputMediaContentUri()", objArr3);
            } catch (Exception e2) {
                uri2 = fromFile;
                e = e2;
                str3 = "ImageUtil.getOutputMediaContentUri()";
                objArr = new Object[1];
                sb = new StringBuilder("高版本裁剪Uri失败:");
                uri = e.getLocalizedMessage();
                fromFile = uri2;
                sb.append(uri);
                objArr[0] = sb.toString();
                x.c(str3, objArr);
                return fromFile;
            }
            return fromFile;
        }
        File a3 = a(str);
        if (a3 == null) {
            return null;
        }
        a(a3);
        if (aVar == a.TAKE_PHOTO && Build.VERSION.SDK_INT >= 24) {
            fromFile = FileProvider.getUriForFile(a2, a2.getApplicationContext().getPackageName() + ".legwork.fileprovider", a3);
        } else {
            fromFile = Uri.fromFile(a3);
        }
        str3 = "ImageUtil.getOutputMediaContentUri()";
        objArr = new Object[1];
        sb = new StringBuilder("contentUri:");
        uri = d(fromFile) ? StringUtil.NULL : fromFile.toString();
        sb.append(uri);
        objArr[0] = sb.toString();
        x.c(str3, objArr);
        return fromFile;
    }

    public static Uri b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "269a6bebd69c8cddb306ad1a6067586d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "269a6bebd69c8cddb306ad1a6067586d");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (LocalIdUtils.isValid(str)) {
            return LocalIdUtils.getUri(str);
        }
        return Uri.parse(str);
    }

    public static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e15585ccbe89fe6d9facd51c0a15545d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e15585ccbe89fe6d9facd51c0a15545d");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File file = new File(str);
        return file.exists() ? e(file.getAbsolutePath()) : "";
    }

    public static String c(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "afdfafa8a50c474a41a8d52b720aab0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "afdfafa8a50c474a41a8d52b720aab0a");
        }
        if (d(uri)) {
            return "";
        }
        String uri2 = uri.toString();
        if (!LocalIdUtils.isContentResource(uri2)) {
            return c(uri.getPath());
        }
        return e(uri2);
    }

    private static String e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5962251d29caec73fbaf95767bf70ce6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5962251d29caec73fbaf95767bf70ce6");
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("knb-media").authority("client").appendQueryParameter("url", str);
        return builder.build().toString();
    }

    public static boolean d(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0314d310faa6c4e8e98c73e0291a2c3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0314d310faa6c4e8e98c73e0291a2c3")).booleanValue() : uri == null || Uri.EMPTY.equals(uri);
    }
}
