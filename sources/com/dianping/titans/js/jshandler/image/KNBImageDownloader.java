package com.dianping.titans.js.jshandler.image;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.dianping.titans.utils.ContentResolverProvider;
import com.dianping.titans.utils.LocalIdUtils;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.meituan.android.knb.util.AndroidAdapter;
import com.sankuai.titans.protocol.utils.CacheDirUtil;
import com.sankuai.waimai.launcher.util.aop.b;
import com.squareup.okhttp.f;
import com.squareup.okhttp.v;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class KNBImageDownloader {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final v mClient;
    private final Context mContext;
    private final String sceneToken;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface KNBImageDownloaderCallback {
        void onError(KNBJsErrorInfo kNBJsErrorInfo);

        void onSuccess(String str);
    }

    public KNBImageDownloader(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edd14d9990e291394ac4c81657b60c8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edd14d9990e291394ac4c81657b60c8c");
            return;
        }
        this.mContext = context.getApplicationContext();
        v vVar = new v();
        OkHttp2Wrapper.addInterceptorToClient(vVar);
        this.mClient = b.a(vVar);
        this.sceneToken = str;
    }

    public final void downloadImage(String str, final KNBImageDownloaderCallback kNBImageDownloaderCallback) {
        Object[] objArr = {str, kNBImageDownloaderCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22512e120a0549599c07aee18fd1c33c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22512e120a0549599c07aee18fd1c33c");
        } else if (TextUtils.isEmpty(str) || (!str.startsWith(AbsApiFactory.HTTP) && !str.startsWith(AbsApiFactory.HTTPS))) {
            kNBImageDownloaderCallback.onError(KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid);
        } else {
            this.mClient.a(new x.a().a(str).a()).a(new f() { // from class: com.dianping.titans.js.jshandler.image.KNBImageDownloader.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.squareup.okhttp.f
                public void onFailure(x xVar, IOException iOException) {
                    Object[] objArr2 = {xVar, iOException};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e65eca6b414f31f9b7f7c0e9f6664325", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e65eca6b414f31f9b7f7c0e9f6664325");
                    } else {
                        kNBImageDownloaderCallback.onError(new KNBJsErrorInfo(8, iOException.getMessage()));
                    }
                }

                @Override // com.squareup.okhttp.f
                public void onResponse(z zVar) {
                    Object[] objArr2 = {zVar};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d98f2d251919cf65f311115f621b01f7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d98f2d251919cf65f311115f621b01f7");
                    } else if (zVar == null) {
                        kNBImageDownloaderCallback.onError(new KNBJsErrorInfo(8, "response is null"));
                    } else if (!zVar.c()) {
                        kNBImageDownloaderCallback.onError(new KNBJsErrorInfo(8, zVar.d));
                    } else if (AndroidAdapter.androidCompatQ()) {
                        KNBImageDownloader.this.downloadQ(zVar, kNBImageDownloaderCallback);
                    } else {
                        KNBImageDownloader.this.downloadNotQ(zVar, kNBImageDownloaderCallback);
                    }
                }
            }, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadQ(z zVar, KNBImageDownloaderCallback kNBImageDownloaderCallback) {
        ParcelFileDescriptor parcelFileDescriptor;
        InputStream inputStream;
        Object[] objArr = {zVar, kNBImageDownloaderCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eca151f3aa9bd9eb4b464d5342a68f62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eca151f3aa9bd9eb4b464d5342a68f62");
            return;
        }
        byte[] bArr = new byte[2048];
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) + ".jpg";
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("title", str);
        contentValues.put("_display_name", str);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("mime_type", "image/jpeg");
        t contentResolver = ContentResolverProvider.getContentResolver(this.mContext, this.sceneToken);
        Uri a = contentResolver.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (a == null) {
            kNBImageDownloaderCallback.onError(new KNBJsErrorInfo(8, "uri is null"));
            return;
        }
        InputStream inputStream2 = null;
        try {
            parcelFileDescriptor = contentResolver.a(a, "w");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            parcelFileDescriptor = null;
        }
        if (parcelFileDescriptor == null) {
            kNBImageDownloaderCallback.onError(new KNBJsErrorInfo(8, "pfd is null"));
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
        try {
            try {
                inputStream = zVar.g.d();
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (Exception e2) {
                        e = e2;
                        inputStream2 = inputStream;
                        kNBImageDownloaderCallback.onError(new KNBJsErrorInfo(8, e.getMessage()));
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        try {
                            fileOutputStream.close();
                            return;
                        } catch (IOException e4) {
                            e4.printStackTrace();
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                        throw th;
                    }
                }
                fileOutputStream.flush();
                String build = new LocalIdUtils.Builder(a).appendToken(this.sceneToken).build();
                scanFile(build);
                kNBImageDownloaderCallback.onSuccess(build);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                }
                try {
                    fileOutputStream.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            } catch (Exception e9) {
                e = e9;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = inputStream2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadNotQ(z zVar, KNBImageDownloaderCallback kNBImageDownloaderCallback) {
        FileOutputStream fileOutputStream;
        Throwable th;
        InputStream inputStream;
        Object[] objArr = {zVar, kNBImageDownloaderCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68714a50787df523ae4b3a74806e18a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68714a50787df523ae4b3a74806e18a3");
            return;
        }
        byte[] bArr = new byte[2048];
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) + ".jpg";
        File file = new File(CacheDirUtil.getExternalStorageDir(), Environment.DIRECTORY_PICTURES);
        if (!file.exists() && !file.mkdirs()) {
            kNBImageDownloaderCallback.onError(new KNBJsErrorInfo(8, "file not exists"));
            return;
        }
        File file2 = new File(file, str);
        InputStream inputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fileOutputStream = null;
        }
        try {
            if (fileOutputStream == null) {
                kNBImageDownloaderCallback.onError(new KNBJsErrorInfo(8, "file not found"));
                return;
            }
            try {
                inputStream = zVar.g.d();
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (Exception e2) {
                        e = e2;
                        inputStream2 = inputStream;
                        kNBImageDownloaderCallback.onError(new KNBJsErrorInfo(8, e.getMessage()));
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        try {
                            fileOutputStream.close();
                            return;
                        } catch (IOException e4) {
                            e4.printStackTrace();
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                        throw th;
                    }
                }
                fileOutputStream.flush();
                ContentValues contentValues = new ContentValues(7);
                contentValues.put("title", str);
                contentValues.put("_display_name", str);
                contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("mime_type", "image/jpeg");
                contentValues.put("_data", file2.getAbsolutePath());
                t contentResolver = ContentResolverProvider.getContentResolver(this.mContext, this.sceneToken);
                Cursor a = contentResolver.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, "_data=?", new String[]{file2.getAbsolutePath()}, null);
                if (a == null) {
                    kNBImageDownloaderCallback.onError(new KNBJsErrorInfo(8, "cursor is null"));
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    try {
                        fileOutputStream.close();
                        return;
                    } catch (IOException e8) {
                        e8.printStackTrace();
                        return;
                    }
                }
                if (a.moveToFirst()) {
                    long j = a.getLong(a.getColumnIndex("_id"));
                    Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    StringBuilder sb = new StringBuilder();
                    sb.append(j);
                    contentResolver.a(Uri.withAppendedPath(uri, sb.toString()), contentValues, (String) null, (String[]) null);
                } else {
                    contentResolver.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                }
                a.close();
                String build = new LocalIdUtils.Builder(Uri.fromFile(file2)).appendToken(this.sceneToken).build();
                scanFile(build);
                kNBImageDownloaderCallback.onSuccess(build);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                try {
                    fileOutputStream.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    private void scanFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d776363af12f48620798256fffb1dbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d776363af12f48620798256fffb1dbe");
        } else if (this.mContext == null || TextUtils.isEmpty(str) || !LocalIdUtils.isValid(str)) {
        } else {
            com.sankuai.meituan.takeoutnew.util.aop.b.a(this.mContext, new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + LocalIdUtils.getFile(str, this.sceneToken).getAbsolutePath())));
        }
    }
}
