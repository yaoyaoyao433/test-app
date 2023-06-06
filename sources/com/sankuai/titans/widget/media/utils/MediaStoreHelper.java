package com.sankuai.titans.widget.media.utils;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.webkit.URLUtil;
import com.dianping.titans.service.FileUtil;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.util.ContentResolverProvider;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MediaStoreHelper {
    public static final int INDEX_ALL_PHOTOS = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final List<String> mCurrentPhotosPath = new ArrayList();

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface SaveImageCallback {
        Context getContext();

        void onFaild(String str, String str2);

        void onSuccess(String str, Uri uri);
    }

    public static synchronized void setPhotoPaths(List<String> list) {
        synchronized (MediaStoreHelper.class) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a83b9d240b8bd4921ae1b6440e6b825a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a83b9d240b8bd4921ae1b6440e6b825a");
                return;
            }
            mCurrentPhotosPath.clear();
            mCurrentPhotosPath.addAll(list);
        }
    }

    public static synchronized List<String> getPhotoPaths() {
        List<String> list;
        synchronized (MediaStoreHelper.class) {
            list = mCurrentPhotosPath;
        }
        return list;
    }

    public static synchronized void clearPhotoPaths() {
        synchronized (MediaStoreHelper.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9b6379a77fdc2ec6be60007539268876", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9b6379a77fdc2ec6be60007539268876");
            } else {
                mCurrentPhotosPath.clear();
            }
        }
    }

    public static void saveNetworkImage(String str, HashMap<String, String> hashMap, String str2, SaveImageCallback saveImageCallback) {
        Object[] objArr = {str, hashMap, str2, saveImageCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "35621b945672de7297b9a7fdaa90f484", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "35621b945672de7297b9a7fdaa90f484");
        } else {
            saveNetworkImage(new SaveImageTask(str, saveImageCallback, hashMap, str2));
        }
    }

    public static void saveNetworkImage(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a9d4f6cc746e4b988bba03a4d04e42f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a9d4f6cc746e4b988bba03a4d04e42f1");
        } else {
            ThreadUtil.getInstance().executeOnIOThread(runnable);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class SaveImageTask implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public SaveImageCallback callback;
        private HashMap<String, String> headers;
        private final String sceneToken;
        private final String url;

        public SaveImageTask(String str, SaveImageCallback saveImageCallback, HashMap<String, String> hashMap, String str2) {
            Object[] objArr = {str, saveImageCallback, hashMap, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e108ea21a7cf71765dcd3db5a2c33f3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e108ea21a7cf71765dcd3db5a2c33f3");
                return;
            }
            this.url = str;
            this.callback = saveImageCallback;
            this.headers = hashMap;
            this.sceneToken = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07178150e7e7135704b52275a9644bb2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07178150e7e7135704b52275a9644bb2");
                return;
            }
            try {
                if (!URLUtil.isHttpsUrl(this.url) && !URLUtil.isHttpUrl(this.url)) {
                    this.callback.onFaild(this.url, "no http/https");
                    return;
                }
                File createFile = ImageCaptureManager.createFile(Environment.DIRECTORY_PICTURES);
                HttpURLConnection httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(this.url).openConnection());
                httpURLConnection.setDoInput(true);
                for (Map.Entry<String, String> entry : this.headers.entrySet()) {
                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpURLConnection.connect();
                InputStream inputStream = httpURLConnection.getInputStream();
                MediaStoreHelper.saveBitmapToPublicDirectory(this.callback.getContext(), createFile, createFile.getName(), "image/*", inputStream, this.sceneToken);
                if (inputStream != null) {
                    inputStream.close();
                }
                this.callback.onSuccess(this.url, Uri.fromFile(createFile));
            } catch (Exception unused) {
                this.callback.onFaild(this.url, "error");
            } catch (OutOfMemoryError unused2) {
                this.callback.onFaild(this.url, "oom");
            }
        }
    }

    private static int getSDKVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1da7ace41b6ab23f970e0a3103041e2d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1da7ace41b6ab23f970e0a3103041e2d")).intValue();
        }
        if (Build.VERSION.CODENAME.charAt(0) == 'Q') {
            return 29;
        }
        return Build.VERSION.SDK_INT;
    }

    public static Uri createMediaUri(Context context, boolean z, File file, String str) {
        Uri uri;
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), file, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "afb9b68a0d7789999e850a6b9965202d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "afb9b68a0d7789999e850a6b9965202d");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", file.getAbsolutePath());
        contentValues.put("_display_name", file.getName());
        String externalStorageState = Environment.getExternalStorageState();
        if (z) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        t contentResolver = ContentResolverProvider.getContentResolver(context, str);
        if (externalStorageState.equals("mounted")) {
            return contentResolver.a(uri, contentValues);
        }
        return contentResolver.a(uri, contentValues);
    }

    private static void write(InputStream inputStream, OutputStream outputStream) throws IOException {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "520f9e950e281bb076e62105eeeec1fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "520f9e950e281bb076e62105eeeec1fb");
        } else if (inputStream == null || outputStream == null) {
        } else {
            byte[] bArr = new byte[FileUtil.DEFAULT_STREAM_BUFFER_SIZE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x011a, code lost:
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0126, code lost:
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0128, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012f, code lost:
        return android.net.Uri.fromFile(r19);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri saveBitmapToPublicDirectory(android.content.Context r18, java.io.File r19, java.lang.String r20, java.lang.String r21, java.io.InputStream r22, java.lang.String r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.widget.media.utils.MediaStoreHelper.saveBitmapToPublicDirectory(android.content.Context, java.io.File, java.lang.String, java.lang.String, java.io.InputStream, java.lang.String):android.net.Uri");
    }
}
