package com.reactnativecommunity.cameraroll;

import android.content.ContentUris;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.mrn.horn.f;
import com.meituan.android.mrn.util.a;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.im.message.bean.Message;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = CameraRollModule.NAME)
/* loaded from: classes3.dex */
public class CameraRollModule extends ReactContextBaseJavaModule {
    private static final String ASSET_TYPE_ALL = "All";
    private static final String ASSET_TYPE_PHOTOS = "Photos";
    private static final String ASSET_TYPE_VIDEOS = "Videos";
    private static final String ERROR_UNABLE_TO_DELETE = "E_UNABLE_TO_DELETE";
    private static final String ERROR_UNABLE_TO_FILTER = "E_UNABLE_TO_FILTER";
    private static final String ERROR_UNABLE_TO_LOAD = "E_UNABLE_TO_LOAD";
    private static final String ERROR_UNABLE_TO_LOAD_PERMISSION = "E_UNABLE_TO_LOAD_PERMISSION";
    private static final String ERROR_UNABLE_TO_SAVE = "E_UNABLE_TO_SAVE";
    private static final String INCLUDE_FILENAME = "filename";
    private static final String INCLUDE_FILE_SIZE = "fileSize";
    private static final String INCLUDE_IMAGE_SIZE = "imageSize";
    private static final String INCLUDE_LOCATION = "location";
    private static final String INCLUDE_PLAYABLE_DURATION = "playableDuration";
    public static final String NAME = "RNCCameraRoll";
    private static final String[] PROJECTION = {"_id", "mime_type", "bucket_display_name", "datetaken", "width", "height", "_size", "_data"};
    private static final String SELECTION_BUCKET = "bucket_display_name = ?";
    private static final String SELECTION_DATE_TAKEN = "datetaken < ?";
    public static final String VERSION_NAME = "4.0.1";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public CameraRollModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void saveToCameraRoll(final String str, final ReadableMap readableMap, final Promise promise) {
        com.meituan.android.mrn.util.a.a(this, getReactApplicationContext(), "saveToCameraRoll", new a.InterfaceC0293a() { // from class: com.reactnativecommunity.cameraroll.CameraRollModule.1
            @Override // com.meituan.android.mrn.util.a.InterfaceC0293a
            public final void a() {
                com.sankuai.waimai.launcher.util.aop.b.a(new c(CameraRollModule.this.getReactApplicationContext(), Uri.parse(str), readableMap, promise), com.sankuai.android.jarvis.c.a(), new Void[0]);
            }

            @Override // com.meituan.android.mrn.util.a.InterfaceC0293a
            public final void a(String str2) {
                promise.reject(CameraRollModule.ERROR_UNABLE_TO_LOAD_PERMISSION, str2);
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c extends GuardedAsyncTask<Void, Void> {
        private final Context a;
        private final Uri b;
        private final Promise c;
        private final ReadableMap d;

        /* JADX WARN: Removed duplicated region for block: B:41:0x011c A[Catch: all -> 0x0174, IOException -> 0x0179, LOOP:1: B:39:0x0116->B:41:0x011c, LOOP_END, TryCatch #12 {IOException -> 0x0179, all -> 0x0174, blocks: (B:38:0x0112, B:39:0x0116, B:41:0x011c, B:42:0x0126, B:43:0x0129, B:45:0x012f, B:46:0x0133), top: B:115:0x0112 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x012f A[Catch: all -> 0x0174, IOException -> 0x0179, LOOP:2: B:43:0x0129->B:45:0x012f, LOOP_END, TryCatch #12 {IOException -> 0x0179, all -> 0x0174, blocks: (B:38:0x0112, B:39:0x0116, B:41:0x011c, B:42:0x0126, B:43:0x0129, B:45:0x012f, B:46:0x0133), top: B:115:0x0112 }] */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* synthetic */ void doInBackgroundGuarded(java.lang.Void[] r12) {
            /*
                Method dump skipped, instructions count: 479
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.cameraroll.CameraRollModule.c.doInBackgroundGuarded(java.lang.Object[]):void");
        }

        public c(ReactContext reactContext, Uri uri, ReadableMap readableMap, Promise promise) {
            super(reactContext);
            this.a = reactContext;
            this.b = uri;
            this.c = promise;
            this.d = readableMap;
        }
    }

    @ReactMethod
    public void getPhotos(ReadableMap readableMap, Promise promise) {
        f.a().a(getReactApplicationContext(), "RNCCameraRoll.getPhotos");
        getPhotosForPrivacy(readableMap, "", promise);
    }

    @ReactMethod
    public void getPhotosForPrivacy(final ReadableMap readableMap, final String str, final Promise promise) {
        com.meituan.android.mrn.util.a.a(this, getReactApplicationContext(), "getPhotos", new a.InterfaceC0293a() { // from class: com.reactnativecommunity.cameraroll.CameraRollModule.2
            @Override // com.meituan.android.mrn.util.a.InterfaceC0293a
            public final void a() {
                com.sankuai.waimai.launcher.util.aop.b.a(new b(CameraRollModule.this.getReactApplicationContext(), readableMap.getInt("first"), readableMap.hasKey("after") ? readableMap.getString("after") : null, readableMap.hasKey(Message.GROUP_NAME) ? readableMap.getString(Message.GROUP_NAME) : null, readableMap.hasKey("mimeTypes") ? readableMap.getArray("mimeTypes") : null, readableMap.hasKey("assetType") ? readableMap.getString("assetType") : CameraRollModule.ASSET_TYPE_PHOTOS, readableMap.hasKey("fromTime") ? (long) readableMap.getDouble("fromTime") : 0L, readableMap.hasKey("toTime") ? (long) readableMap.getDouble("toTime") : 0L, readableMap.hasKey("include") ? readableMap.getArray("include") : null, str, promise), com.sankuai.android.jarvis.c.a(), new Void[0]);
            }

            @Override // com.meituan.android.mrn.util.a.InterfaceC0293a
            public final void a(String str2) {
                promise.reject(CameraRollModule.ERROR_UNABLE_TO_LOAD_PERMISSION, str2);
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class b extends GuardedAsyncTask<Void, Void> {
        private final Context a;
        private final int b;
        @Nullable
        private final String c;
        @Nullable
        private final String d;
        @Nullable
        private final ReadableArray e;
        private final Promise f;
        private final String g;
        private final long h;
        private final long i;
        private final Set<String> j;
        private String k;

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public final /* synthetic */ void doInBackgroundGuarded(Void[] voidArr) {
            StringBuilder sb = new StringBuilder("1");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.d)) {
                sb.append(" AND bucket_display_name = ?");
                arrayList.add(this.d);
            }
            if (this.g.equals(CameraRollModule.ASSET_TYPE_PHOTOS)) {
                sb.append(" AND media_type = 1");
            } else if (this.g.equals(CameraRollModule.ASSET_TYPE_VIDEOS)) {
                sb.append(" AND media_type = 3");
            } else if (this.g.equals(CameraRollModule.ASSET_TYPE_ALL)) {
                sb.append(" AND media_type IN (3,1)");
            } else {
                this.f.reject(CameraRollModule.ERROR_UNABLE_TO_FILTER, "Invalid filter option: '" + this.g + "'. Expected one of 'Photos', 'Videos' or 'All'.");
                return;
            }
            if (this.e != null && this.e.size() > 0) {
                sb.append(" AND mime_type IN (");
                for (int i = 0; i < this.e.size(); i++) {
                    sb.append("?,");
                    arrayList.add(this.e.getString(i));
                }
                sb.replace(sb.length() - 1, sb.length(), CommonConstant.Symbol.BRACKET_RIGHT);
            }
            if (this.h > 0) {
                sb.append(" AND datetaken > ?");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.h);
                arrayList.add(sb2.toString());
            }
            if (this.i > 0) {
                sb.append(" AND datetaken <= ?");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.i);
                arrayList.add(sb3.toString());
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            t createContentResolver = Privacy.createContentResolver(this.a, this.k);
            try {
                String str = "limit=" + (this.b + 1);
                if (!TextUtils.isEmpty(this.c)) {
                    str = "limit=" + this.c + CommonConstant.Symbol.COMMA + (this.b + 1);
                }
                Cursor a = createContentResolver.a(MediaStore.Files.getContentUri("external").buildUpon().encodedQuery(str).build(), CameraRollModule.PROJECTION, sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), "date_added DESC, date_modified DESC");
                if (a != null) {
                    CameraRollModule.putEdges(createContentResolver, a, writableNativeMap, this.b, this.j);
                    CameraRollModule.putPageInfo(a, writableNativeMap, this.b, TextUtils.isEmpty(this.c) ? 0 : Integer.parseInt(this.c));
                    a.close();
                    this.f.resolve(writableNativeMap);
                    return;
                }
                this.f.reject(CameraRollModule.ERROR_UNABLE_TO_LOAD, "Could not get media");
            } catch (SecurityException e) {
                this.f.reject(CameraRollModule.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get media: need READ_EXTERNAL_STORAGE permission", e);
            }
        }

        private b(ReactContext reactContext, int i, @Nullable String str, @Nullable String str2, @Nullable ReadableArray readableArray, String str3, long j, long j2, @Nullable ReadableArray readableArray2, String str4, Promise promise) {
            super(reactContext);
            this.a = reactContext;
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = readableArray;
            this.f = promise;
            this.g = str3;
            this.h = j;
            this.i = j2;
            HashSet hashSet = new HashSet();
            if (readableArray2 != null) {
                for (int i2 = 0; i2 < readableArray2.size(); i2++) {
                    String string = readableArray2.getString(i2);
                    if (string != null) {
                        hashSet.add(string);
                    }
                }
            }
            this.j = hashSet;
            this.k = str4;
        }
    }

    @ReactMethod
    public void getAlbums(ReadableMap readableMap, Promise promise) {
        f.a().a(getReactApplicationContext(), "RNCCameraRoll.getAlbums");
        getAlbumsForPrivacy(readableMap, "", promise);
    }

    @ReactMethod
    public void getAlbumsForPrivacy(final ReadableMap readableMap, final String str, final Promise promise) {
        com.meituan.android.mrn.util.a.a(this, getReactApplicationContext(), "getAlbums", new a.InterfaceC0293a() { // from class: com.reactnativecommunity.cameraroll.CameraRollModule.3
            @Override // com.meituan.android.mrn.util.a.InterfaceC0293a
            public final void a() {
                CameraRollModule.this.getAlbumsWithControl(readableMap, str, promise);
            }

            @Override // com.meituan.android.mrn.util.a.InterfaceC0293a
            public final void a(String str2) {
                promise.reject(CameraRollModule.ERROR_UNABLE_TO_LOAD_PERMISSION, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getAlbumsWithControl(ReadableMap readableMap, String str, Promise promise) {
        String string = readableMap.hasKey("assetType") ? readableMap.getString("assetType") : ASSET_TYPE_ALL;
        StringBuilder sb = new StringBuilder("1");
        ArrayList arrayList = new ArrayList();
        if (string.equals(ASSET_TYPE_PHOTOS)) {
            sb.append(" AND media_type = 1");
        } else if (string.equals(ASSET_TYPE_VIDEOS)) {
            sb.append(" AND media_type = 3");
        } else if (!string.equals(ASSET_TYPE_ALL)) {
            promise.reject(ERROR_UNABLE_TO_FILTER, "Invalid filter option: '" + string + "'. Expected one of 'Photos', 'Videos' or 'All'.");
            return;
        } else {
            sb.append(" AND media_type IN (3,1)");
        }
        try {
            Cursor a2 = Privacy.createContentResolver(getReactApplicationContext(), str).a(MediaStore.Files.getContentUri("external"), new String[]{"bucket_display_name"}, sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]), null);
            if (a2 == null) {
                promise.reject(ERROR_UNABLE_TO_LOAD, "Could not get media");
                return;
            }
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            if (a2.moveToFirst()) {
                HashMap hashMap = new HashMap();
                do {
                    String string2 = a2.getString(a2.getColumnIndex("bucket_display_name"));
                    if (string2 != null) {
                        Integer num = (Integer) hashMap.get(string2);
                        if (num == null) {
                            hashMap.put(string2, 1);
                        } else {
                            hashMap.put(string2, Integer.valueOf(num.intValue() + 1));
                        }
                    }
                } while (a2.moveToNext());
                for (Map.Entry entry : hashMap.entrySet()) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("title", (String) entry.getKey());
                    writableNativeMap.putInt("count", ((Integer) entry.getValue()).intValue());
                    writableNativeArray.pushMap((WritableMap) writableNativeMap);
                }
            }
            a2.close();
            promise.resolve(writableNativeArray);
        } catch (Exception e) {
            promise.reject(ERROR_UNABLE_TO_LOAD, "Could not get media", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putPageInfo(Cursor cursor, WritableMap writableMap, int i, int i2) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("has_next_page", i < cursor.getCount());
        if (i < cursor.getCount()) {
            writableNativeMap.putString("end_cursor", Integer.toString(i2 + i));
        }
        writableMap.putMap("page_info", (WritableMap) writableNativeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putEdges(t tVar, Cursor cursor, WritableMap writableMap, int i, Set<String> set) {
        int i2;
        WritableNativeArray writableNativeArray;
        boolean z;
        int i3;
        Cursor cursor2;
        int i4;
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("mime_type");
        int columnIndex2 = cursor.getColumnIndex("bucket_display_name");
        int columnIndex3 = cursor.getColumnIndex("datetaken");
        int columnIndex4 = cursor.getColumnIndex("width");
        int columnIndex5 = cursor.getColumnIndex("height");
        int columnIndex6 = cursor.getColumnIndex("_size");
        int columnIndex7 = cursor.getColumnIndex("_data");
        boolean contains = set.contains("location");
        boolean contains2 = set.contains("filename");
        boolean contains3 = set.contains(INCLUDE_FILE_SIZE);
        boolean contains4 = set.contains(INCLUDE_IMAGE_SIZE);
        boolean contains5 = set.contains(INCLUDE_PLAYABLE_DURATION);
        int i5 = i;
        int i6 = 0;
        while (i6 < i5 && !cursor.isAfterLast()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            WritableNativeArray writableNativeArray3 = writableNativeArray2;
            int i7 = i6;
            boolean z2 = contains;
            int i8 = columnIndex7;
            int i9 = columnIndex3;
            if (putImageInfo(tVar, cursor, writableNativeMap2, columnIndex4, columnIndex5, columnIndex6, columnIndex7, columnIndex, contains2, contains3, contains4, contains5)) {
                i2 = i9;
                cursor2 = cursor;
                putBasicNodeInfo(cursor2, writableNativeMap2, columnIndex, columnIndex2, i2);
                z = z2;
                i3 = i8;
                putLocationInfo(cursor2, writableNativeMap2, i3, z);
                writableNativeMap.putMap("node", (WritableMap) writableNativeMap2);
                writableNativeArray = writableNativeArray3;
                writableNativeArray.pushMap((WritableMap) writableNativeMap);
                i4 = i7;
            } else {
                i2 = i9;
                writableNativeArray = writableNativeArray3;
                z = z2;
                i3 = i8;
                cursor2 = cursor;
                i4 = i7 - 1;
            }
            cursor.moveToNext();
            i6 = i4 + 1;
            i5 = i;
            columnIndex3 = i2;
            columnIndex7 = i3;
            contains = z;
            writableNativeArray2 = writableNativeArray;
        }
        writableMap.putArray("edges", (WritableArray) writableNativeArray2);
    }

    private static void putBasicNodeInfo(Cursor cursor, WritableMap writableMap, int i, int i2, int i3) {
        writableMap.putString("type", cursor.getString(i));
        writableMap.putString("group_name", cursor.getString(i2));
        writableMap.putDouble(DeviceInfo.TM, cursor.getLong(i3) / 1000.0d);
    }

    private static boolean putImageInfo(t tVar, Cursor cursor, WritableMap writableMap, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Uri parse = Uri.parse("file://" + cursor.getString(i4));
        writableNativeMap.putString(Constants.TRAFFIC_URI, parse.toString());
        String string = cursor.getString(i5);
        boolean z5 = string != null && string.startsWith("video");
        boolean putImageSize = putImageSize(tVar, cursor, writableNativeMap, i, i2, parse, z5, z3);
        boolean putPlayableDuration = putPlayableDuration(tVar, writableNativeMap, parse, z5, z4);
        if (z) {
            writableNativeMap.putString("filename", new File(cursor.getString(i4)).getName());
        } else {
            writableNativeMap.putNull("filename");
        }
        if (z2) {
            writableNativeMap.putDouble(INCLUDE_FILE_SIZE, cursor.getLong(i3));
        } else {
            writableNativeMap.putNull(INCLUDE_FILE_SIZE);
        }
        writableMap.putMap("image", (WritableMap) writableNativeMap);
        return putImageSize && putPlayableDuration;
    }

    private static boolean putPlayableDuration(t tVar, WritableMap writableMap, Uri uri, boolean z, boolean z2) {
        AssetFileDescriptor assetFileDescriptor;
        writableMap.putNull(INCLUDE_PLAYABLE_DURATION);
        boolean z3 = true;
        if (z2 && z) {
            Integer num = null;
            try {
                assetFileDescriptor = tVar.b(uri, r.o);
            } catch (FileNotFoundException e) {
                com.facebook.common.logging.a.d("ReactNative", "Could not open asset file " + uri.toString(), e);
                assetFileDescriptor = null;
                z3 = false;
            }
            if (assetFileDescriptor != null) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor());
                try {
                    num = Integer.valueOf(Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / 1000);
                } catch (NumberFormatException e2) {
                    com.facebook.common.logging.a.d("ReactNative", "Number format exception occurred while trying to fetch video metadata for " + uri.toString(), e2);
                    z3 = false;
                }
                mediaMetadataRetriever.release();
            }
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            if (num != null) {
                writableMap.putInt(INCLUDE_PLAYABLE_DURATION, num.intValue());
            }
            return z3;
        }
        return true;
    }

    private static boolean putImageSize(t tVar, Cursor cursor, WritableMap writableMap, int i, int i2, Uri uri, boolean z, boolean z2) {
        AssetFileDescriptor assetFileDescriptor;
        boolean z3;
        int i3;
        NumberFormatException e;
        writableMap.putNull("width");
        writableMap.putNull("height");
        boolean z4 = true;
        if (z2) {
            int i4 = cursor.getInt(i);
            int i5 = cursor.getInt(i2);
            if (i4 <= 0 || i5 <= 0) {
                boolean z5 = false;
                try {
                    assetFileDescriptor = tVar.b(uri, r.o);
                    z3 = true;
                } catch (FileNotFoundException e2) {
                    com.facebook.common.logging.a.d("ReactNative", "Could not open asset file " + uri.toString(), e2);
                    assetFileDescriptor = null;
                    z3 = false;
                }
                if (assetFileDescriptor != null) {
                    if (z) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor());
                        try {
                            i3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                            try {
                                i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                z5 = z3;
                            } catch (NumberFormatException e3) {
                                e = e3;
                                com.facebook.common.logging.a.d("ReactNative", "Number format exception occurred while trying to fetch video metadata for " + uri.toString(), e);
                                mediaMetadataRetriever.release();
                                z4 = z5;
                                i4 = i3;
                                assetFileDescriptor.close();
                            }
                        } catch (NumberFormatException e4) {
                            i3 = i4;
                            e = e4;
                        }
                        mediaMetadataRetriever.release();
                        z4 = z5;
                        i4 = i3;
                    } else {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFileDescriptor(assetFileDescriptor.getFileDescriptor(), null, options);
                        i4 = options.outWidth;
                        i5 = options.outHeight;
                        z4 = z3;
                    }
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                } else {
                    z4 = z3;
                }
            }
            writableMap.putInt("width", i4);
            writableMap.putInt("height", i5);
            return z4;
        }
        return true;
    }

    private static void putLocationInfo(Cursor cursor, WritableMap writableMap, int i, boolean z) {
        writableMap.putNull("location");
        if (z) {
            try {
                ExifInterface exifInterface = new ExifInterface(cursor.getString(i));
                float[] fArr = new float[2];
                if (exifInterface.getLatLong(fArr)) {
                    double d = fArr[0];
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble(Constants.PRIVACY.KEY_LONGITUDE, fArr[1]);
                    writableNativeMap.putDouble(Constants.PRIVACY.KEY_LATITUDE, d);
                    writableMap.putMap("location", (WritableMap) writableNativeMap);
                }
            } catch (IOException e) {
                com.facebook.common.logging.a.d("ReactNative", "Could not read the metadata", e);
            }
        }
    }

    @ReactMethod
    public void deletePhotos(ReadableArray readableArray, Promise promise) {
        f.a().a(getReactApplicationContext(), "RNCCameraRoll.deletePhotos");
        deletePhotosForPrivacy(readableArray, "", promise);
    }

    @ReactMethod
    public void deletePhotosForPrivacy(final ReadableArray readableArray, final String str, final Promise promise) {
        if (readableArray.size() == 0) {
            promise.reject(ERROR_UNABLE_TO_DELETE, "Need at least one URI to delete");
        } else {
            com.meituan.android.mrn.util.a.a(this, getReactApplicationContext(), "deletePhotos", new a.InterfaceC0293a() { // from class: com.reactnativecommunity.cameraroll.CameraRollModule.4
                @Override // com.meituan.android.mrn.util.a.InterfaceC0293a
                public final void a() {
                    com.sankuai.waimai.launcher.util.aop.b.a(new a(CameraRollModule.this.getReactApplicationContext(), readableArray, str, promise), com.sankuai.android.jarvis.c.a(), new Void[0]);
                }

                @Override // com.meituan.android.mrn.util.a.InterfaceC0293a
                public final void a(String str2) {
                    promise.reject(CameraRollModule.ERROR_UNABLE_TO_LOAD_PERMISSION, str2);
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a extends GuardedAsyncTask<Void, Void> {
        private final Context a;
        private final ReadableArray b;
        private final String c;
        private final Promise d;

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public final /* synthetic */ void doInBackgroundGuarded(Void[] voidArr) {
            t createContentResolver = Privacy.createContentResolver(this.a, this.c);
            String[] strArr = {"_id"};
            String str = CommonConstant.Symbol.QUESTION_MARK;
            for (int i = 1; i < this.b.size(); i++) {
                str = str + ", ?";
            }
            String str2 = "_data IN (" + str + CommonConstant.Symbol.BRACKET_RIGHT;
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            String[] strArr2 = new String[this.b.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < this.b.size(); i3++) {
                strArr2[i3] = Uri.parse(this.b.getString(i3)).getPath();
            }
            Cursor a = createContentResolver.a(uri, strArr, str2, strArr2, null);
            if (a == null) {
                this.d.reject(CameraRollModule.ERROR_UNABLE_TO_DELETE, "Could not delete all media, Maybe you should check storage permission of this token:" + this.c);
                return;
            }
            while (a.moveToNext()) {
                if (createContentResolver.a(ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, a.getLong(a.getColumnIndexOrThrow("_id"))), (String) null, (String[]) null) == 1) {
                    i2++;
                }
            }
            a.close();
            if (i2 == this.b.size()) {
                this.d.resolve(Boolean.TRUE);
                return;
            }
            this.d.reject(CameraRollModule.ERROR_UNABLE_TO_DELETE, "Could not delete all media, only deleted " + i2 + " photos.");
        }

        public a(ReactContext reactContext, ReadableArray readableArray, String str, Promise promise) {
            super(reactContext);
            this.a = reactContext;
            this.b = readableArray;
            this.c = str;
            this.d = promise;
        }
    }
}
