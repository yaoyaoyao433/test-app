package com.facebook.react.modules.camera;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
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
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.android.jarvis.c;
import com.sankuai.xm.im.message.bean.Message;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: ProGuard */
@ReactModule(name = CameraRollManager.NAME)
/* loaded from: classes.dex */
public class CameraRollManager extends ReactContextBaseJavaModule {
    private static final String ASSET_TYPE_ALL = "All";
    private static final String ASSET_TYPE_PHOTOS = "Photos";
    private static final String ASSET_TYPE_VIDEOS = "Videos";
    private static final String ERROR_UNABLE_TO_FILTER = "E_UNABLE_TO_FILTER";
    private static final String ERROR_UNABLE_TO_LOAD = "E_UNABLE_TO_LOAD";
    private static final String ERROR_UNABLE_TO_LOAD_PERMISSION = "E_UNABLE_TO_LOAD_PERMISSION";
    private static final String ERROR_UNABLE_TO_SAVE = "E_UNABLE_TO_SAVE";
    public static final String NAME = "CameraRollManager";
    private static final String[] PROJECTION = {"_id", "mime_type", "bucket_display_name", "datetaken", "width", "height", Constants.PRIVACY.KEY_LONGITUDE, Constants.PRIVACY.KEY_LATITUDE, "_data"};
    private static final String SELECTION_BUCKET = "bucket_display_name = ?";
    private static final String SELECTION_DATE_TAKEN = "datetaken < ?";
    private static final String SELECTION_MEDIA_SIZE = "_size < ?";

    @ReactMethod
    public void deletePhotosForPrivacy(ReadableArray readableArray, String str, Promise promise) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public CameraRollManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void saveToCameraRoll(String str, String str2, Promise promise) {
        com.sankuai.waimai.launcher.util.aop.b.a(new b(getReactApplicationContext(), Uri.parse(str), promise), c.a(), new Void[0]);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b extends GuardedAsyncTask<Void, Void> {
        private final Context a;
        private final Uri b;
        private final Promise c;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[Catch: all -> 0x013d, IOException -> 0x013f, TRY_LEAVE, TryCatch #11 {IOException -> 0x013f, all -> 0x013d, blocks: (B:10:0x0042, B:12:0x0051, B:21:0x0070, B:23:0x0086, B:25:0x009f, B:27:0x00a5, B:28:0x00c5), top: B:113:0x0042 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[Catch: all -> 0x013d, IOException -> 0x013f, TRY_ENTER, TryCatch #11 {IOException -> 0x013f, all -> 0x013d, blocks: (B:10:0x0042, B:12:0x0051, B:21:0x0070, B:23:0x0086, B:25:0x009f, B:27:0x00a5, B:28:0x00c5), top: B:113:0x0042 }] */
        /* JADX WARN: Type inference failed for: r1v13, types: [java.nio.channels.ReadableByteChannel] */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* synthetic */ void doInBackgroundGuarded(java.lang.Void[] r11) {
            /*
                Method dump skipped, instructions count: 412
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.camera.CameraRollManager.b.doInBackgroundGuarded(java.lang.Object[]):void");
        }

        public b(ReactContext reactContext, Uri uri, Promise promise) {
            super(reactContext);
            this.a = reactContext;
            this.b = uri;
            this.c = promise;
        }
    }

    @ReactMethod
    public void getPhotos(ReadableMap readableMap, Promise promise) {
        f.a().a(getReactApplicationContext(), "CameraRollManager.getPhotos");
        getPhotosForPrivacy(readableMap, "", promise);
    }

    @ReactMethod
    public void getPhotosForPrivacy(ReadableMap readableMap, String str, Promise promise) {
        int i = readableMap.getInt("first");
        String string = readableMap.hasKey("after") ? readableMap.getString("after") : null;
        String string2 = readableMap.hasKey(Message.GROUP_NAME) ? readableMap.getString(Message.GROUP_NAME) : null;
        String string3 = readableMap.hasKey("assetType") ? readableMap.getString("assetType") : ASSET_TYPE_PHOTOS;
        Integer valueOf = readableMap.hasKey("maxSize") ? Integer.valueOf(readableMap.getInt("maxSize")) : null;
        ReadableArray array = readableMap.hasKey("mimeTypes") ? readableMap.getArray("mimeTypes") : null;
        if (readableMap.hasKey("groupTypes")) {
            throw new JSApplicationIllegalArgumentException("groupTypes is not supported on Android");
        }
        com.sankuai.waimai.launcher.util.aop.b.a(new a(getReactApplicationContext(), i, string, string2, array, string3, valueOf, str, promise), c.a(), new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends GuardedAsyncTask<Void, Void> {
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
        @Nullable
        private final Integer h;
        private String i;

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public final /* synthetic */ void doInBackgroundGuarded(Void[] voidArr) {
            StringBuilder sb = new StringBuilder("1");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.c)) {
                sb.append(" AND datetaken < ?");
                arrayList.add(this.c);
            }
            if (!TextUtils.isEmpty(this.d)) {
                sb.append(" AND bucket_display_name = ?");
                arrayList.add(this.d);
            }
            if (this.h != null) {
                sb.append(" AND _size < ?");
                arrayList.add(this.h.toString());
            }
            String str = this.g;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1905167199) {
                if (hashCode != -1732810888) {
                    if (hashCode == 65921 && str.equals(CameraRollManager.ASSET_TYPE_ALL)) {
                        c = 2;
                    }
                } else if (str.equals(CameraRollManager.ASSET_TYPE_VIDEOS)) {
                    c = 1;
                }
            } else if (str.equals(CameraRollManager.ASSET_TYPE_PHOTOS)) {
                c = 0;
            }
            switch (c) {
                case 0:
                    sb.append(" AND media_type = 1");
                    break;
                case 1:
                    sb.append(" AND media_type = 3");
                    break;
                case 2:
                    sb.append(" AND media_type IN (3,1)");
                    break;
                default:
                    Promise promise = this.f;
                    promise.reject(CameraRollManager.ERROR_UNABLE_TO_FILTER, "Invalid filter option: '" + this.g + "'. Expected one of 'Photos', 'Videos' or 'All'.");
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
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            t createContentResolver = Privacy.createContentResolver(this.a, this.i);
            try {
                Uri contentUri = MediaStore.Files.getContentUri("external");
                String[] strArr = CameraRollManager.PROJECTION;
                String sb2 = sb.toString();
                String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                Cursor a = createContentResolver.a(contentUri, strArr, sb2, strArr2, "datetaken DESC, date_modified DESC LIMIT " + (this.b + 1));
                if (a != null) {
                    CameraRollManager.putEdges(createContentResolver, a, writableNativeMap, this.b);
                    CameraRollManager.putPageInfo(a, writableNativeMap, this.b);
                    a.close();
                    this.f.resolve(writableNativeMap);
                } else {
                    this.f.reject(CameraRollManager.ERROR_UNABLE_TO_LOAD, "Could not get media");
                }
            } catch (SecurityException e) {
                this.f.reject(CameraRollManager.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get media: need READ_EXTERNAL_STORAGE permission", e);
            }
        }

        private a(ReactContext reactContext, int i, @Nullable String str, @Nullable String str2, @Nullable ReadableArray readableArray, String str3, @Nullable Integer num, String str4, Promise promise) {
            super(reactContext);
            this.a = reactContext;
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = readableArray;
            this.f = promise;
            this.g = str3;
            this.h = num;
            this.i = str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putPageInfo(Cursor cursor, WritableMap writableMap, int i) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("has_next_page", i < cursor.getCount());
        if (i < cursor.getCount()) {
            cursor.moveToPosition(i - 1);
            writableNativeMap.putString("end_cursor", cursor.getString(cursor.getColumnIndex("datetaken")));
        }
        writableMap.putMap("page_info", (WritableMap) writableNativeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putEdges(t tVar, Cursor cursor, WritableMap writableMap, int i) {
        WritableNativeArray writableNativeArray;
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("_id");
        int columnIndex2 = cursor.getColumnIndex("mime_type");
        int columnIndex3 = cursor.getColumnIndex("bucket_display_name");
        int columnIndex4 = cursor.getColumnIndex("datetaken");
        int columnIndex5 = cursor.getColumnIndex("width");
        int columnIndex6 = cursor.getColumnIndex("height");
        int columnIndex7 = cursor.getColumnIndex(Constants.PRIVACY.KEY_LONGITUDE);
        int columnIndex8 = cursor.getColumnIndex(Constants.PRIVACY.KEY_LATITUDE);
        int columnIndex9 = cursor.getColumnIndex("_data");
        int i2 = i;
        int i3 = 0;
        while (i3 < i2 && !cursor.isAfterLast()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            WritableNativeArray writableNativeArray3 = writableNativeArray2;
            int i4 = columnIndex;
            int i5 = i3;
            int i6 = columnIndex5;
            int i7 = columnIndex;
            int i8 = columnIndex8;
            int i9 = columnIndex5;
            int i10 = columnIndex7;
            if (putImageInfo(tVar, cursor, writableNativeMap2, i4, i6, columnIndex6, columnIndex9, columnIndex2)) {
                putBasicNodeInfo(cursor, writableNativeMap2, columnIndex2, columnIndex3, columnIndex4);
                putLocationInfo(cursor, writableNativeMap2, i10, i8);
                writableNativeMap.putMap("node", (WritableMap) writableNativeMap2);
                writableNativeArray = writableNativeArray3;
                writableNativeArray.pushMap((WritableMap) writableNativeMap);
            } else {
                writableNativeArray = writableNativeArray3;
                i5--;
            }
            cursor.moveToNext();
            i3 = i5 + 1;
            i2 = i;
            writableNativeArray2 = writableNativeArray;
            columnIndex8 = i8;
            columnIndex7 = i10;
            columnIndex = i7;
            columnIndex5 = i9;
        }
        writableMap.putArray("edges", (WritableArray) writableNativeArray2);
    }

    private static void putBasicNodeInfo(Cursor cursor, WritableMap writableMap, int i, int i2, int i3) {
        writableMap.putString("type", cursor.getString(i));
        writableMap.putString("group_name", cursor.getString(i2));
        writableMap.putDouble(DeviceInfo.TM, cursor.getLong(i3) / 1000.0d);
    }

    private static boolean putImageInfo(t tVar, Cursor cursor, WritableMap writableMap, int i, int i2, int i3, int i4, int i5) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Uri parse = Uri.parse("file://" + cursor.getString(i4));
        writableNativeMap.putString(com.meituan.metrics.common.Constants.TRAFFIC_URI, parse.toString());
        float f = (float) cursor.getInt(i2);
        float f2 = cursor.getInt(i3);
        String string = cursor.getString(i5);
        if (string != null && string.startsWith("video")) {
            try {
                AssetFileDescriptor b2 = tVar.b(parse, r.o);
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(b2.getFileDescriptor());
                if (f <= 0.0f || f2 <= 0.0f) {
                    try {
                        f = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        f2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    } catch (NumberFormatException e) {
                        com.facebook.common.logging.a.d("ReactNative", "Number format exception occurred while trying to fetch video metadata for " + parse.toString(), e);
                        mediaMetadataRetriever.release();
                        b2.close();
                        return false;
                    }
                }
                writableNativeMap.putInt("playableDuration", Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / 1000);
                mediaMetadataRetriever.release();
                b2.close();
            } catch (Exception e2) {
                com.facebook.common.logging.a.d("ReactNative", "Could not get video metadata for " + parse.toString(), e2);
                return false;
            }
        }
        if (f <= 0.0f || f2 <= 0.0f) {
            try {
                AssetFileDescriptor b3 = tVar.b(parse, r.o);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(b3.getFileDescriptor(), null, options);
                float f3 = options.outWidth;
                float f4 = options.outHeight;
                b3.close();
                f2 = f4;
                f = f3;
            } catch (IOException e3) {
                com.facebook.common.logging.a.d("ReactNative", "Could not get width/height for " + parse.toString(), e3);
                return false;
            }
        }
        writableNativeMap.putDouble("width", f);
        writableNativeMap.putDouble("height", f2);
        writableMap.putMap("image", (WritableMap) writableNativeMap);
        return true;
    }

    private static void putLocationInfo(Cursor cursor, WritableMap writableMap, int i, int i2) {
        double d = cursor.getDouble(i);
        double d2 = cursor.getDouble(i2);
        if (d > 0.0d || d2 > 0.0d) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble(Constants.PRIVACY.KEY_LONGITUDE, d);
            writableNativeMap.putDouble(Constants.PRIVACY.KEY_LATITUDE, d2);
            writableMap.putMap("location", (WritableMap) writableNativeMap);
        }
    }

    @ReactMethod
    public void deletePhotos(ReadableArray readableArray, Promise promise) {
        f.a().a(getReactApplicationContext(), "CameraRollManager.deletePhotos");
        deletePhotosForPrivacy(readableArray, "", promise);
    }
}
