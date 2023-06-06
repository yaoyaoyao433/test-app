package com.facebook.react.modules.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.d;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.mrn.horn.f;
import com.meituan.android.mrn.util.a;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.sankuai.android.jarvis.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
@ReactModule(name = ImageEditingManager.NAME)
/* loaded from: classes.dex */
public class ImageEditingManager extends ReactContextBaseJavaModule {
    private static final int COMPRESS_QUALITY = 90;
    public static final String NAME = "ImageEditingManager";
    private static final String TEMP_FILE_PREFIX = "ReactNative_cropped_image_";
    private static final List<String> LOCAL_URI_PREFIXES = Arrays.asList("file://", "content://");
    @SuppressLint({"InlinedApi"})
    private static final String[] EXIF_ATTRIBUTES = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public ImageEditingManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        com.sankuai.waimai.launcher.util.aop.b.a(new a(getReactApplicationContext()), c.a(), new Void[0]);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        com.sankuai.waimai.launcher.util.aop.b.a(new a(getReactApplicationContext()), c.a(), new Void[0]);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a extends GuardedAsyncTask<Void, Void> {
        private final Context a;

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public final /* synthetic */ void doInBackgroundGuarded(Void[] voidArr) {
            a(d.a(this.a));
            File b = d.b(this.a);
            if (b != null) {
                a(b);
            }
        }

        private a(ReactContext reactContext) {
            super(reactContext);
            this.a = reactContext;
        }

        private void a(File file) {
            File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.facebook.react.modules.camera.ImageEditingManager.a.1
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return str.startsWith(ImageEditingManager.TEMP_FILE_PREFIX);
                }
            });
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
        }
    }

    @ReactMethod
    public void cropImage(String str, ReadableMap readableMap, Callback callback, Callback callback2) {
        f.a().a(getReactApplicationContext(), "ImageEditor.cropImage");
        cropImageForPrivacy(str, readableMap, "", callback, callback2);
    }

    @ReactMethod
    public void cropImageForPrivacy(final String str, final ReadableMap readableMap, final String str2, final Callback callback, final Callback callback2) {
        com.meituan.android.mrn.util.a.a(this, getReactApplicationContext(), "cropImage", new a.InterfaceC0293a() { // from class: com.facebook.react.modules.camera.ImageEditingManager.1
            @Override // com.meituan.android.mrn.util.a.InterfaceC0293a
            public final void a() {
                ImageEditingManager.this.cropImageWithControl(str, readableMap, str2, callback, callback2);
            }

            @Override // com.meituan.android.mrn.util.a.InterfaceC0293a
            public final void a(String str3) {
                callback2.invoke(str3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cropImageWithControl(String str, ReadableMap readableMap, String str2, Callback callback, Callback callback2) {
        ReadableMap map = readableMap.hasKey("offset") ? readableMap.getMap("offset") : null;
        ReadableMap map2 = readableMap.hasKey(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE) ? readableMap.getMap(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE) : null;
        boolean z = readableMap.hasKey("allowExternalStorage") ? readableMap.getBoolean("allowExternalStorage") : true;
        if (map == null || map2 == null || !map.hasKey(Constants.GestureMoveEvent.KEY_X) || !map.hasKey(Constants.GestureMoveEvent.KEY_Y) || !map2.hasKey("width") || !map2.hasKey("height")) {
            throw new JSApplicationIllegalArgumentException("Please specify offset and size");
        }
        if (str == null || str.isEmpty()) {
            throw new JSApplicationIllegalArgumentException("Please specify a URI");
        }
        b bVar = new b(getReactApplicationContext(), str, (int) map.getDouble(Constants.GestureMoveEvent.KEY_X), (int) map.getDouble(Constants.GestureMoveEvent.KEY_Y), (int) map2.getDouble("width"), (int) map2.getDouble("height"), z, str2, callback, callback2);
        if (readableMap.hasKey("displaySize")) {
            ReadableMap map3 = readableMap.getMap("displaySize");
            int i = (int) map3.getDouble("width");
            int i2 = (int) map3.getDouble("height");
            if (i <= 0 || i2 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format("Invalid target size: [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
            }
            bVar.h = i;
            bVar.i = i2;
        }
        com.sankuai.waimai.launcher.util.aop.b.a(bVar, c.a(), new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b extends GuardedAsyncTask<Void, Void> {
        final Context a;
        final String b;
        final int c;
        final int d;
        final int e;
        final int f;
        final boolean g;
        int h;
        int i;
        String j;
        final Callback k;
        final Callback l;

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public final /* synthetic */ void doInBackgroundGuarded(Void[] voidArr) {
            Bitmap a;
            File writeBitmapToExternalCache;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (this.h > 0 && this.i > 0) {
                    a = a(this.h, this.i, options, this.j);
                } else {
                    a = a(options, this.j);
                }
                String str = options.outMimeType;
                if (str != null && !str.isEmpty()) {
                    try {
                        writeBitmapToExternalCache = ImageEditingManager.writeBitmapToInternalCache(this.a, a, str);
                    } catch (Exception unused) {
                        if (this.g) {
                            writeBitmapToExternalCache = ImageEditingManager.writeBitmapToExternalCache(this.a, a, str);
                        } else {
                            throw new SecurityException("We couldn't create file in internal cache and external cache is disabled. Did you forget to pass allowExternalStorage=true?");
                        }
                    }
                    if (str.equals("image/jpeg")) {
                        ImageEditingManager.copyExif(this.a, Uri.parse(this.b), writeBitmapToExternalCache, this.j);
                    }
                    this.k.invoke(Uri.fromFile(writeBitmapToExternalCache).toString());
                    return;
                }
                throw new IOException("Could not determine MIME type");
            } catch (Exception e) {
                this.l.invoke(e.getMessage());
            }
        }

        private b(ReactContext reactContext, String str, int i, int i2, int i3, int i4, boolean z, String str2, Callback callback, Callback callback2) {
            super(reactContext);
            this.h = 0;
            this.i = 0;
            if (i < 0 || i2 < 0 || i3 <= 0 || i4 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format("Invalid crop rectangle: [%d, %d, %d, %d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            this.a = reactContext;
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
            this.g = z;
            this.j = str2;
            this.k = callback;
            this.l = callback2;
        }

        private InputStream a(String str) throws IOException {
            InputStream inputStream;
            if (ImageEditingManager.isLocalUri(this.b)) {
                inputStream = Privacy.createContentResolver(this.a, str).b(Uri.parse(this.b));
            } else {
                inputStream = HttpURLWrapper.wrapURLConnection(new URL(this.b).openConnection()).getInputStream();
            }
            if (inputStream != null) {
                return inputStream;
            }
            throw new IOException("Cannot open bitmap: " + this.b);
        }

        private Bitmap a(BitmapFactory.Options options, String str) throws IOException {
            InputStream a = a(str);
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(a, false);
            try {
                return newInstance.decodeRegion(new Rect(this.c, this.d, this.c + this.e, this.d + this.f), options);
            } finally {
                if (a != null) {
                    a.close();
                }
                newInstance.recycle();
            }
        }

        private Bitmap a(int i, int i2, BitmapFactory.Options options, String str) throws IOException {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            com.facebook.infer.annotation.a.a(options);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            InputStream a = a(str);
            try {
                com.sankuai.waimai.launcher.util.image.a.a(a, (Rect) null, options2);
                if (a != null) {
                    a.close();
                }
                float f6 = i;
                float f7 = i2;
                float f8 = f6 / f7;
                if (this.e / this.f > f8) {
                    f = this.f * f8;
                    f5 = this.f;
                    f2 = this.c + ((this.e - f) / 2.0f);
                    f3 = this.d;
                    f4 = f7 / this.f;
                } else {
                    f = this.e;
                    float f9 = this.e / f8;
                    f2 = this.c;
                    f3 = this.d + ((this.f - f9) / 2.0f);
                    f4 = f6 / this.e;
                    f5 = f9;
                }
                options.inSampleSize = ImageEditingManager.getDecodeSampleSize(this.e, this.f, i, i2);
                options2.inJustDecodeBounds = false;
                try {
                    Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(a(str), (Rect) null, options);
                    if (a2 == null) {
                        throw new IOException("Cannot decode bitmap: " + this.b);
                    }
                    float f10 = f4 * options.inSampleSize;
                    Matrix matrix = new Matrix();
                    matrix.setScale(f10, f10);
                    return Bitmap.createBitmap(a2, (int) Math.floor(f2 / options.inSampleSize), (int) Math.floor(f3 / options.inSampleSize), (int) Math.floor(f / options.inSampleSize), (int) Math.floor(f5 / options.inSampleSize), matrix, true);
                } finally {
                }
            } finally {
                if (a != null) {
                    a.close();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void copyExif(Context context, Uri uri, File file, String str) throws IOException {
        String[] strArr;
        File fileFromUri = getFileFromUri(context, uri, str);
        if (fileFromUri == null) {
            com.facebook.common.logging.a.c("ReactNative", "Couldn't get real path for uri: " + uri);
            return;
        }
        ExifInterface exifInterface = new ExifInterface(fileFromUri.getAbsolutePath());
        ExifInterface exifInterface2 = new ExifInterface(file.getAbsolutePath());
        for (String str2 : EXIF_ATTRIBUTES) {
            String attribute = exifInterface.getAttribute(str2);
            if (attribute != null) {
                exifInterface2.setAttribute(str2, attribute);
            }
        }
        exifInterface2.saveAttributes();
    }

    @Nullable
    private static File getFileFromUri(Context context, Uri uri, String str) {
        Cursor a2;
        if (uri.getScheme().equals("file")) {
            return new File(uri.getPath());
        }
        if (!uri.getScheme().equals("content") || (a2 = Privacy.createContentResolver(context, str).a(uri, new String[]{"_data"}, null, null, null)) == null) {
            return null;
        }
        try {
            if (a2.moveToFirst()) {
                String string = a2.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    return new File(string);
                }
            }
            return null;
        } finally {
            a2.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isLocalUri(String str) {
        for (String str2 : LOCAL_URI_PREFIXES) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static String getFileExtensionForType(@Nullable String str) {
        return "image/png".equals(str) ? ".png" : "image/webp".equals(str) ? ".webp" : ".jpg";
    }

    private static Bitmap.CompressFormat getCompressFormatForType(String str) {
        if ("image/png".equals(str)) {
            return Bitmap.CompressFormat.PNG;
        }
        if ("image/webp".equals(str)) {
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File writeBitmapToInternalCache(Context context, Bitmap bitmap, String str) throws IOException {
        File createTempFile = createTempFile(d.a(context), str);
        writeCompressedBitmapToFile(bitmap, str, createTempFile);
        return createTempFile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File writeBitmapToExternalCache(Context context, Bitmap bitmap, String str) throws IOException {
        File createTempFile = createTempFile(d.b(context), str);
        writeCompressedBitmapToFile(bitmap, str, createTempFile);
        return createTempFile;
    }

    private static void writeCompressedBitmapToFile(Bitmap bitmap, String str, File file) throws IOException {
        bitmap.compress(getCompressFormatForType(str), 90, new FileOutputStream(file));
    }

    private static File createTempFile(@Nullable File file, @Nullable String str) throws IOException {
        if (file == null) {
            throw new IOException("No cache directory available");
        }
        return File.createTempFile(TEMP_FILE_PREFIX, getFileExtensionForType(str), file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getDecodeSampleSize(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i3 || i > i4) {
            int i6 = i2 / 2;
            int i7 = i / 2;
            while (i7 / i5 >= i3 && i6 / i5 >= i4) {
                i5 *= 2;
            }
        }
        return i5;
    }
}
