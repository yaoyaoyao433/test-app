package com.meituan.msi.api.video;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiApiPermission;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.video.compress.c;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.provider.b;
import com.meituan.msi.util.ad;
import com.meituan.msi.util.ae;
import com.meituan.msi.util.cipStorage.a;
import com.meituan.msi.util.file.d;
import com.meituan.msi.util.m;
import com.meituan.mtwebkit.MTURLUtil;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.widget.IMediaWidgetCallback;
import com.sankuai.titans.widget.MediaWidget;
import com.sankuai.titans.widget.PickerBuilder;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VideoApi implements IMsiApi {
    public static ChangeQuickRedirect a;
    private static final Handler b = new Handler(Looper.getMainLooper());
    private String c;
    private String d;
    private final String e;

    public VideoApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4dfd0205fee544c2c51ef0043b3becb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4dfd0205fee544c2c51ef0043b3becb");
            return;
        }
        this.e = a.c(com.meituan.msi.a.f(), "Movies").getAbsolutePath() + File.separator + AbsApiFactory.PASSPORT_ONLINE_URL;
    }

    public static /* synthetic */ String a(String str, MsiContext msiContext) {
        Object[] objArr = {str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57f5578257c2698406e074fc34711573", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57f5578257c2698406e074fc34711573");
        }
        if (msiContext.getFileProvider() instanceof b) {
            return "msifile://" + str;
        }
        return msiContext.getFileProvider().b(str);
    }

    public static /* synthetic */ void a(VideoApi videoApi, final MsiContext msiContext) {
        boolean a2;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, videoApi, changeQuickRedirect, false, "ae827c73c65447240698ccaa293778ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, videoApi, changeQuickRedirect, false, "ae827c73c65447240698ccaa293778ae");
            return;
        }
        String a3 = msiContext.getFileProvider().a(videoApi.c);
        if (TextUtils.isEmpty(a3)) {
            msiContext.onError(500, "filePath error");
        } else if (!com.meituan.msi.util.file.b.a(a3, msiContext.getFileProvider().a())) {
            msiContext.onError(500, "filePath scope error");
        } else {
            if (d.a()) {
                String format = String.format("%s_%s%s", AbsApiFactory.PASSPORT_ONLINE_URL, Long.toHexString(new Date().getTime()), ".mp4");
                if (!new File(videoApi.e).exists()) {
                    a.c(com.meituan.msi.a.f(), "Movies").mkdirs();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        a2 = d.a(com.meituan.msi.a.f(), new FileInputStream(a3), "video/mp4", new File(a3).getName(), false, videoApi.d);
                    } catch (FileNotFoundException unused) {
                        msiContext.onError(500, "saveVideoToPhotosAlbum occur Exception");
                        return;
                    }
                } else {
                    File file = new File(new File(videoApi.e), format);
                    if (file.exists()) {
                        file.delete();
                    }
                    d.a(file);
                    try {
                        a2 = d.a(a3, file.getAbsolutePath(), videoApi.d);
                    } catch (Throwable unused2) {
                        msiContext.onError(500, "saveVideoToPhotosAlbum occur Exception");
                        return;
                    }
                }
                if (a2) {
                    final File file2 = new File(new File(videoApi.e), format);
                    if (Build.VERSION.SDK_INT < 29) {
                        com.sankuai.meituan.takeoutnew.util.aop.b.a(com.meituan.msi.a.f(), new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + file2)));
                    }
                    b.post(new Runnable() { // from class: com.meituan.msi.api.video.VideoApi.4
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87195c901382d75221b7aa1091ffb83d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87195c901382d75221b7aa1091ffb83d");
                                return;
                            }
                            msiContext.onSuccess(null);
                            final String format2 = String.format("视频已保存到%s", file2.getAbsolutePath());
                            Object[] objArr3 = {format2, -1};
                            ChangeQuickRedirect changeQuickRedirect3 = ad.a;
                            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ba3b6fda0edeab470627d2f3f227f54b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ba3b6fda0edeab470627d2f3f227f54b");
                                return;
                            }
                            Object[] objArr4 = {-1, 2, format2};
                            ChangeQuickRedirect changeQuickRedirect4 = ad.a;
                            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "7e949b898acccf28e60cc57b0d55fd39", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "7e949b898acccf28e60cc57b0d55fd39");
                            } else {
                                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.msi.util.ad.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f63170344606eb51fd044d1e4e8ca323", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f63170344606eb51fd044d1e4e8ca323");
                                            return;
                                        }
                                        Activity a4 = a.a();
                                        if (a4 == null) {
                                            return;
                                        }
                                        int i = r1;
                                        if (i == 0) {
                                            i = Integer.MAX_VALUE;
                                        }
                                        com.sankuai.meituan.android.ui.widget.a a5 = com.sankuai.meituan.android.ui.widget.a.a(a4, format2, i).e(81).a(r3);
                                        a5.a(0, 0, 0, f.a(20));
                                        a5.a();
                                    }
                                });
                            }
                        }
                    });
                    return;
                }
            }
            b.post(new Runnable() { // from class: com.meituan.msi.api.video.VideoApi.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2dbe116e356a556d6149865c9e353de0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2dbe116e356a556d6149865c9e353de0");
                    } else {
                        msiContext.onError(500, "saveVideoToPhotosAlbum occur Exception");
                    }
                }
            });
        }
    }

    public static /* synthetic */ void a(VideoApi videoApi, final String str, final MsiContext msiContext, boolean z) {
        String str2;
        Object[] objArr = {str, msiContext, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, videoApi, changeQuickRedirect, false, "a214bfb0d879cd550c4f02567a19e815", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, videoApi, changeQuickRedirect, false, "a214bfb0d879cd550c4f02567a19e815");
            return;
        }
        final ChooseVideoResponse chooseVideoResponse = new ChooseVideoResponse();
        Context f = com.meituan.msi.a.f();
        Uri parse = Uri.parse(str);
        if (str.startsWith("content://")) {
            try {
                t createContentResolver = Privacy.createContentResolver(f, ae.a(msiContext.getArgs()));
                InputStream b2 = createContentResolver.b(parse);
                String a2 = createContentResolver.a(parse);
                if (b2 == null) {
                    msiContext.onError(400, "视频文件不存在 " + str);
                    return;
                }
                if (a2 != null) {
                    a2 = CommonConstant.Symbol.DOT + a2.replace("video/", "");
                }
                str2 = d.a(b2) + a2;
            } catch (FileNotFoundException unused) {
                msiContext.onError(400, "视频文件不存在 " + str);
                return;
            }
        } else {
            str2 = d.c(new File(str)) + d.b(str);
        }
        final String str3 = str2;
        final File file = new File(msiContext.getFileProvider().b(), str3);
        if (z && Build.VERSION.SDK_INT >= 18) {
            if (msiContext.getActivity() == null) {
                msiContext.onError("activity is not existed");
                return;
            }
            final ProgressDialog progressDialog = new ProgressDialog(msiContext.getActivity());
            progressDialog.setTitle("压缩中");
            progressDialog.setCancelable(false);
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.setIndeterminate(true);
            String absolutePath = file.getAbsolutePath();
            c.a aVar = new c.a() { // from class: com.meituan.msi.api.video.VideoApi.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.video.compress.c.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95432efec6145bc912e05fbd92cb5cae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95432efec6145bc912e05fbd92cb5cae");
                    } else {
                        VideoApi.b.post(new Runnable() { // from class: com.meituan.msi.api.video.VideoApi.3.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9753e3052396b2d7f115a1704e00ec02", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9753e3052396b2d7f115a1704e00ec02");
                                } else {
                                    progressDialog.show();
                                }
                            }
                        });
                    }
                }

                @Override // com.meituan.msi.api.video.compress.c.a
                public final void a(final boolean z2) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dbc0e804edfb4ef0408dda7bc3cba5b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dbc0e804edfb4ef0408dda7bc3cba5b5");
                    } else {
                        VideoApi.b.post(new Runnable() { // from class: com.meituan.msi.api.video.VideoApi.3.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bbe92323f4d05453ef5b34f42df2d022", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bbe92323f4d05453ef5b34f42df2d022");
                                    return;
                                }
                                progressDialog.cancel();
                                if (z2 ? true : d.a(str, file.getAbsolutePath())) {
                                    chooseVideoResponse.tempFilePath = VideoApi.a(str3, msiContext);
                                } else {
                                    ChooseVideoResponse chooseVideoResponse2 = chooseVideoResponse;
                                    chooseVideoResponse2.tempFilePath = MTURLUtil.FILE_BASE + file.getName();
                                }
                                chooseVideoResponse.size = (long) com.meituan.msi.util.file.c.a(file.getAbsolutePath(), 2);
                                VideoApi.this.a(com.meituan.msi.a.f(), Uri.fromFile(file), chooseVideoResponse);
                                msiContext.onSuccess(chooseVideoResponse);
                            }
                        });
                    }
                }
            };
            Object[] objArr2 = {parse, absolutePath, 0, 0, 2160000, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "171904053471ec3fed28a4f17d236c2c", RobustBitConfig.DEFAULT_VALUE)) {
                com.meituan.msi.api.video.compress.b bVar = (com.meituan.msi.api.video.compress.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "171904053471ec3fed28a4f17d236c2c");
                return;
            } else {
                com.sankuai.waimai.launcher.util.aop.b.a(new com.meituan.msi.api.video.compress.b(aVar), parse, absolutePath, 0, 0, 2160000);
                return;
            }
        }
        if (d.a(str, file.getAbsolutePath(), ae.a(msiContext.getArgs()))) {
            chooseVideoResponse.tempFilePath = "msifile://tmp/" + str3;
            chooseVideoResponse.size = (long) com.meituan.msi.util.file.c.a(file.getAbsolutePath(), 2);
            videoApi.a(com.meituan.msi.a.f(), Uri.fromFile(file), chooseVideoResponse);
        } else {
            chooseVideoResponse.tempFilePath = MTURLUtil.FILE_BASE + str3;
            chooseVideoResponse.size = (long) com.meituan.msi.util.file.c.a(str, 2);
            videoApi.a(com.meituan.msi.a.f(), parse, chooseVideoResponse);
        }
        msiContext.onSuccess(chooseVideoResponse);
    }

    @MsiApiMethod(name = "saveVideoToPhotosAlbum", request = SaveVideoToPhotosAlbumParam.class)
    @MsiApiPermission(apiPermissions = {PermissionGuard.PERMISSION_STORAGE_WRITE})
    public void saveVideoToPhotosAlbum(SaveVideoToPhotosAlbumParam saveVideoToPhotosAlbumParam, final MsiContext msiContext) {
        Object[] objArr = {saveVideoToPhotosAlbumParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "562b3d6043945e9f2f7fe434d4b0c8a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "562b3d6043945e9f2f7fe434d4b0c8a1");
            return;
        }
        this.c = saveVideoToPhotosAlbumParam.filePath;
        this.d = "";
        if (saveVideoToPhotosAlbumParam._mt != null) {
            this.d = saveVideoToPhotosAlbumParam._mt.sceneToken;
        }
        if (TextUtils.isEmpty(this.c)) {
            msiContext.onError(400, "filePath cant empty!");
        } else if (!com.meituan.msi.privacy.permission.a.a(msiContext.getActivity(), PermissionGuard.PERMISSION_STORAGE_WRITE, saveVideoToPhotosAlbumParam._mt.sceneToken)) {
            msiContext.onError(401, "permission deny");
        } else {
            int[] iArr = {0};
            Object[] objArr2 = {100, new String[]{PermissionGuard.PERMISSION_STORAGE_WRITE}, iArr, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a052b78a49b608c42ad9c667a1a4579", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a052b78a49b608c42ad9c667a1a4579");
            } else if (iArr[0] == 0) {
                m.b(new Runnable() { // from class: com.meituan.msi.api.video.VideoApi.6
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f9d69c31b01d26138ad7ee10765909ac", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f9d69c31b01d26138ad7ee10765909ac");
                        } else {
                            VideoApi.a(VideoApi.this, msiContext);
                        }
                    }
                });
            } else {
                msiContext.onError(401, "permission deny");
            }
        }
    }

    @MsiApiMethod(name = "chooseVideo", request = ChooseVideoParam.class, response = ChooseVideoResponse.class)
    @MsiApiPermission(apiPermissions = {PermissionGuard.PERMISSION_STORAGE_READ})
    public void chooseVideo(final ChooseVideoParam chooseVideoParam, final MsiContext msiContext) {
        Object[] objArr = {chooseVideoParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4497a96645a0362881703d9488181209", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4497a96645a0362881703d9488181209");
            return;
        }
        if (chooseVideoParam.sourceType == null || chooseVideoParam.sourceType.length == 0) {
            chooseVideoParam.sourceType = new String[2];
            chooseVideoParam.sourceType[0] = "album";
            chooseVideoParam.sourceType[1] = WmChooseMediaModule.TYPE_CAMERA;
        }
        final PickerBuilder pickerBuilder = new PickerBuilder();
        pickerBuilder.mediaType("video").source(chooseVideoParam.sourceType).maxDuration(chooseVideoParam.maxDuration).mediaSize("original");
        if (chooseVideoParam._mt != null && !TextUtils.isEmpty(chooseVideoParam._mt.sceneToken)) {
            pickerBuilder.accessToken(chooseVideoParam._mt.sceneToken);
        }
        pickerBuilder.requestCode(97);
        pickerBuilder.finishCallback(new IMediaWidgetCallback() { // from class: com.meituan.msi.api.video.VideoApi.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.titans.widget.IMediaWidgetCallback
            public final void onResult(ArrayList<String> arrayList, int i) {
                Object[] objArr2 = {arrayList, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24b7fdb64eb876754291203b5e0346bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24b7fdb64eb876754291203b5e0346bc");
                } else if (arrayList != null && arrayList.size() > 0) {
                    VideoApi.a(VideoApi.this, arrayList.get(0), msiContext, chooseVideoParam.compressed);
                } else {
                    msiContext.onError(101, "cancel chooseVideo");
                }
            }
        });
        final Activity activity = msiContext.getActivity();
        if (activity == null || activity.isFinishing() || (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed())) {
            msiContext.onError("chooseVideo api call failed, activity not exist when openMediaPicker");
        } else {
            b.post(new Runnable() { // from class: com.meituan.msi.api.video.VideoApi.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fdf6c844dc421697a652f05cdc9d34f2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fdf6c844dc421697a652f05cdc9d34f2");
                    } else {
                        MediaWidget.getInstance().openMediaPicker(activity, pickerBuilder);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, Uri uri, ChooseVideoResponse chooseVideoResponse) {
        Object[] objArr = {context, uri, chooseVideoResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "980797f88810e67949a309de5f1a47f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "980797f88810e67949a309de5f1a47f7");
        } else if (chooseVideoResponse == null) {
        } else {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(context, uri);
                chooseVideoResponse.duration = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / 1000;
                chooseVideoResponse.width = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                chooseVideoResponse.height = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            } catch (Exception e) {
                com.meituan.msi.log.a.a("getVideoInfo error " + e.getMessage());
            } finally {
                mediaMetadataRetriever.release();
            }
        }
    }
}
