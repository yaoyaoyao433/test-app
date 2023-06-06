package com.meituan.mmp.lib.api.video;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.api.video.compress.c;
import com.meituan.mmp.lib.utils.aq;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.lib.utils.k;
import com.meituan.mmp.lib.utils.q;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mtwebkit.MTURLUtil;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.widget.IWidgetFinishListener;
import com.sankuai.titans.widget.MediaWidget;
import com.sankuai.titans.widget.PickerBuilder;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import com.tencent.smtt.sdk.TbsReaderView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VideoPickerModule extends ActivityApi {
    public static ChangeQuickRedirect h;
    boolean i;
    private String j;
    private String k;
    private String l;

    public VideoPickerModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c337d20f0f55054674ffb6e2bf375ad4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c337d20f0f55054674ffb6e2bf375ad4");
            return;
        }
        this.i = false;
        this.k = com.meituan.mmp.lib.utils.f.c(getContext(), "Movies").getAbsolutePath() + File.separator + AbsApiFactory.PASSPORT_ONLINE_URL;
    }

    public static /* synthetic */ void a(VideoPickerModule videoPickerModule, final IApiCallback iApiCallback) {
        boolean z = false;
        Object[] objArr = {iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, videoPickerModule, changeQuickRedirect, false, "1b2f2b2550c44a21b7df26a0293b21b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, videoPickerModule, changeQuickRedirect, false, "1b2f2b2550c44a21b7df26a0293b21b5");
            return;
        }
        String a = s.a(videoPickerModule.getContext(), videoPickerModule.j, videoPickerModule.getAppConfig());
        if (a == null) {
            iApiCallback.onFail(codeJson(-1, "Class:VideoPickerModule Api:saveVideoToPhotosAlbum failed"));
        } else if (!q.a(a, videoPickerModule.getAppConfig().e(videoPickerModule.getContext()))) {
            q.a(iApiCallback);
        } else {
            if (s.a()) {
                String format = String.format("%s_%s%s", AbsApiFactory.PASSPORT_ONLINE_URL, Long.toHexString(new Date().getTime()), ".mp4");
                if (!new File(videoPickerModule.k).exists()) {
                    com.meituan.mmp.lib.utils.f.c(videoPickerModule.getContext(), "Movies").mkdirs();
                }
                if (k.a()) {
                    try {
                        z = s.a(videoPickerModule.getContext(), new FileInputStream(a), "video/mp4", new File(a).getName(), false, videoPickerModule.l);
                    } catch (FileNotFoundException e) {
                        iApiCallback.onFail(codeJson(-1, "Class:VideoPickerModule Api:saveVideoToPhotosAlbum occur Exception :" + e));
                        return;
                    }
                } else {
                    File file = new File(new File(videoPickerModule.k), format);
                    if (file.exists()) {
                        file.delete();
                    }
                    s.c(file);
                    try {
                        z = s.a(a, file.getAbsolutePath());
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                if (z) {
                    final File file2 = new File(new File(videoPickerModule.k), format);
                    if (!k.a()) {
                        com.sankuai.meituan.takeoutnew.util.aop.b.a(videoPickerModule.getContext(), new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + file2)));
                    }
                    c.post(new Runnable() { // from class: com.meituan.mmp.lib.api.video.VideoPickerModule.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2911bfc90fcb295824f2ec849b4eb31d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2911bfc90fcb295824f2ec849b4eb31d");
                                return;
                            }
                            iApiCallback.onSuccess(null);
                            bb.a(String.format("视频已保存到%s", file2.getAbsolutePath()), new Object[0]);
                        }
                    });
                    return;
                }
            }
            c.post(new Runnable() { // from class: com.meituan.mmp.lib.api.video.VideoPickerModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35347155acad5243e2e77690390e7911", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35347155acad5243e2e77690390e7911");
                    } else {
                        iApiCallback.onFail(AbsApi.codeJson(-1, "Class:VideoPickerModule Api:saveVideoToPhotosAlbum failed"));
                    }
                }
            });
        }
    }

    public static /* synthetic */ void a(VideoPickerModule videoPickerModule, String str, final IApiCallback iApiCallback) {
        Object[] objArr = {str, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, videoPickerModule, changeQuickRedirect, false, "5658aabe3f37af9455af091077387020", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, videoPickerModule, changeQuickRedirect, false, "5658aabe3f37af9455af091077387020");
            return;
        }
        final JSONObject jSONObject = new JSONObject();
        videoPickerModule.a(videoPickerModule.getContext(), Uri.parse(str), jSONObject);
        try {
            if (!TextUtils.isEmpty(str)) {
                String str2 = "tmp_" + s.b(new File(str)) + s.c(str);
                File file = new File(videoPickerModule.e(), str2);
                if (s.a(str, file.getAbsolutePath())) {
                    jSONObject.put("tempFilePath", "wdfile://" + str2);
                    jSONObject.put("path", "wdfile://" + str2);
                    jSONObject.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, s.d(file.getAbsolutePath()));
                } else {
                    jSONObject.put("tempFilePath", MTURLUtil.FILE_BASE + str);
                    jSONObject.put("path", MTURLUtil.FILE_BASE + str);
                    jSONObject.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, s.d(str));
                }
            }
            c.post(new Runnable() { // from class: com.meituan.mmp.lib.api.video.VideoPickerModule.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec25db9f34321388221f23c9b45bc745", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec25db9f34321388221f23c9b45bc745");
                    } else {
                        iApiCallback.onSuccess(jSONObject);
                    }
                }
            });
        } catch (Exception unused) {
            com.meituan.mmp.lib.trace.b.d("InnerApi", "chooseImage assemble result exception!");
            c.post(new Runnable() { // from class: com.meituan.mmp.lib.api.video.VideoPickerModule.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "200a6b2bd1ce6d18d5766e30b0dbd2cd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "200a6b2bd1ce6d18d5766e30b0dbd2cd");
                    } else {
                        iApiCallback.onFail();
                    }
                }
            });
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1adf721f3eff85f4ddeb83968cbc405a", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1adf721f3eff85f4ddeb83968cbc405a") : new String[]{"chooseVideo", "saveVideoToPhotosAlbum"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, final JSONObject jSONObject, final IApiCallback iApiCallback) {
        boolean a;
        String[] strArr;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08bdb0523ff76117251a812f4eaba858", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08bdb0523ff76117251a812f4eaba858");
            return;
        }
        this.l = getToken(jSONObject);
        if (!"chooseVideo".equals(str)) {
            if ("saveVideoToPhotosAlbum".equals(str)) {
                Object[] objArr2 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "367e9f4e0d87182d0727b875419998c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "367e9f4e0d87182d0727b875419998c6");
                    return;
                }
                this.j = jSONObject.optString(TbsReaderView.KEY_FILE_PATH);
                if (TextUtils.isEmpty(this.j)) {
                    iApiCallback.onFail();
                    return;
                } else if (!com.meituan.msi.privacy.permission.a.a(this.g, PermissionGuard.PERMISSION_STORAGE_WRITE, AbsApi.getToken(jSONObject))) {
                    iApiCallback.onFail();
                    return;
                } else {
                    int[] iArr = {0};
                    Object[] objArr3 = {100, new String[]{PermissionGuard.PERMISSION_STORAGE_WRITE}, iArr, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect3 = h;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2f343fe07838d58d73f632b156913302", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2f343fe07838d58d73f632b156913302");
                        return;
                    } else if (iArr[0] == 0) {
                        com.meituan.mmp.lib.executor.a.a(new Runnable() { // from class: com.meituan.mmp.lib.api.video.VideoPickerModule.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f0977b3d6544e22cbff9c610668eedd2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f0977b3d6544e22cbff9c610668eedd2");
                                } else {
                                    VideoPickerModule.a(VideoPickerModule.this, iApiCallback);
                                }
                            }
                        });
                        return;
                    } else {
                        iApiCallback.onFail();
                        return;
                    }
                }
            }
            return;
        }
        Object[] objArr4 = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect4 = h;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7e57b9fb81a9072ec956248851e1efad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7e57b9fb81a9072ec956248851e1efad");
            return;
        }
        String token = AbsApi.getToken(jSONObject);
        Activity activity = getActivity();
        Object[] objArr5 = {activity, token};
        ChangeQuickRedirect changeQuickRedirect5 = aq.a;
        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "1ebecd1c6b07dbf93210bc5f758e71ea", RobustBitConfig.DEFAULT_VALUE)) {
            a = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "1ebecd1c6b07dbf93210bc5f758e71ea")).booleanValue();
        } else {
            a = Build.VERSION.SDK_INT < 16 ? true : com.meituan.msi.privacy.permission.a.a(activity, PermissionGuard.PERMISSION_STORAGE_READ, token);
        }
        if (!a) {
            iApiCallback.onFail(null);
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("sourceType");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            strArr = new String[]{"album", WmChooseMediaModule.TYPE_CAMERA};
        } else {
            strArr = new String[optJSONArray.length()];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = optJSONArray.optString(i);
            }
        }
        this.i = jSONObject.optBoolean("compressed", true);
        int optInt = jSONObject.optInt("maxDuration", 60);
        PickerBuilder pickerBuilder = new PickerBuilder();
        pickerBuilder.mediaType("video").source(strArr).maxDuration(optInt).mediaSize("original");
        pickerBuilder.requestCode(97);
        pickerBuilder.accessToken(token);
        pickerBuilder.finishListener(new IWidgetFinishListener() { // from class: com.meituan.mmp.lib.api.video.VideoPickerModule.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.titans.widget.IWidgetFinishListener
            public final void onResult(ArrayList<String> arrayList, String str2) {
                String str3;
                Object[] objArr6 = {arrayList, str2};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "df2428b0e003a7c6e5e8205b6141d09f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "df2428b0e003a7c6e5e8205b6141d09f");
                } else if (arrayList != null && arrayList.size() == 1) {
                    final VideoPickerModule videoPickerModule = VideoPickerModule.this;
                    final String str4 = arrayList.get(0);
                    JSONObject jSONObject2 = jSONObject;
                    final IApiCallback iApiCallback2 = iApiCallback;
                    Object[] objArr7 = {str4, jSONObject2, iApiCallback2};
                    ChangeQuickRedirect changeQuickRedirect7 = VideoPickerModule.h;
                    if (PatchProxy.isSupport(objArr7, videoPickerModule, changeQuickRedirect7, false, "2b00d0af289d4acd0813b4d0ec98b194", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, videoPickerModule, changeQuickRedirect7, false, "2b00d0af289d4acd0813b4d0ec98b194");
                        return;
                    }
                    Uri parse = Uri.parse(str4);
                    if (str4.startsWith("content://")) {
                        try {
                            InputStream b = Privacy.createContentResolver(videoPickerModule.getContext(), VideoPickerModule.getToken(jSONObject2)).b(parse);
                            String a2 = Privacy.createContentResolver(videoPickerModule.getContext(), VideoPickerModule.getToken(jSONObject2)).a(parse);
                            if (b == null) {
                                iApiCallback2.onFail();
                                return;
                            }
                            if (a2 != null) {
                                a2 = CommonConstant.Symbol.DOT + a2.replace("video/", "");
                            }
                            str3 = "tmp_" + s.a(b) + a2;
                        } catch (FileNotFoundException unused) {
                            iApiCallback2.onFail();
                            return;
                        }
                    } else {
                        str3 = "tmp_" + s.b(new File(str4)) + s.c(str4);
                    }
                    final File file = new File(videoPickerModule.e(), str3);
                    if (videoPickerModule.i && Build.VERSION.SDK_INT >= 18) {
                        final ProgressDialog progressDialog = new ProgressDialog(videoPickerModule.getContext());
                        progressDialog.setTitle("压缩中");
                        progressDialog.setCancelable(false);
                        progressDialog.setCanceledOnTouchOutside(false);
                        progressDialog.setIndeterminate(true);
                        String absolutePath = file.getAbsolutePath();
                        c.a aVar = new c.a() { // from class: com.meituan.mmp.lib.api.video.VideoPickerModule.4
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.mmp.lib.api.video.compress.c.a
                            public final void a() {
                                Object[] objArr8 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "69cbbeae0b598c9567afe6aba759dd3a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "69cbbeae0b598c9567afe6aba759dd3a");
                                } else {
                                    VideoPickerModule.c.post(new Runnable() { // from class: com.meituan.mmp.lib.api.video.VideoPickerModule.4.1
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr9 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect9 = a;
                                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "3e5756b8089c35bd4f10bdfdeda236fd", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "3e5756b8089c35bd4f10bdfdeda236fd");
                                            } else {
                                                progressDialog.show();
                                            }
                                        }
                                    });
                                }
                            }

                            @Override // com.meituan.mmp.lib.api.video.compress.c.a
                            public final void a(final boolean z) {
                                Object[] objArr8 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "735b88ac09350d5ccc7e0dcb67ac4499", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "735b88ac09350d5ccc7e0dcb67ac4499");
                                } else {
                                    VideoPickerModule.c.post(new Runnable() { // from class: com.meituan.mmp.lib.api.video.VideoPickerModule.4.2
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr9 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect9 = a;
                                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "aa748f77a3af38c1fede75a0943a695d", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "aa748f77a3af38c1fede75a0943a695d");
                                                return;
                                            }
                                            progressDialog.cancel();
                                            JSONObject jSONObject3 = new JSONObject();
                                            try {
                                                boolean a3 = z ? true : s.a(str4, file.getAbsolutePath());
                                                VideoPickerModule.this.a(VideoPickerModule.this.getContext(), Uri.parse(file.getAbsolutePath()), jSONObject3);
                                                if (a3) {
                                                    jSONObject3.put("tempFilePath", "wdfile://" + file.getName());
                                                } else {
                                                    jSONObject3.put("tempFilePath", MTURLUtil.FILE_BASE + file.getName());
                                                }
                                                jSONObject3.put("path", "wdfile://" + file.getName());
                                                jSONObject3.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, s.d(file.getAbsolutePath()));
                                            } catch (JSONException unused2) {
                                            }
                                            iApiCallback2.onSuccess(jSONObject3);
                                        }
                                    });
                                }
                            }
                        };
                        Object[] objArr8 = {parse, absolutePath, 0, 0, 2160000, aVar};
                        ChangeQuickRedirect changeQuickRedirect8 = com.meituan.mmp.lib.api.video.compress.c.a;
                        if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "69ce007e1df01487246f6a6b4b857e03", RobustBitConfig.DEFAULT_VALUE)) {
                            com.meituan.mmp.lib.api.video.compress.b bVar = (com.meituan.mmp.lib.api.video.compress.b) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "69ce007e1df01487246f6a6b4b857e03");
                            return;
                        } else {
                            com.sankuai.waimai.launcher.util.aop.b.a(new com.meituan.mmp.lib.api.video.compress.b(aVar), parse, absolutePath, 0, 0, 2160000);
                            return;
                        }
                    }
                    Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.meituan.mmp.lib.api.video.VideoPickerModule.5
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr9 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect9 = a;
                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "9bcf304f852bb10d0c3b9d6d245e5334", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "9bcf304f852bb10d0c3b9d6d245e5334");
                            } else {
                                VideoPickerModule.a(VideoPickerModule.this, str4, iApiCallback2);
                            }
                        }
                    });
                } else {
                    iApiCallback.onCancel();
                }
            }
        });
        Activity activity2 = getActivity();
        if (activity2 == null || activity2.isDestroyed()) {
            iApiCallback.onFail(codeJson(-1, "chooseVideo api call failed, activity not exist when openMediaPicker"));
        } else {
            MediaWidget.getInstance().openMediaPicker(activity2, pickerBuilder);
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "354212fe7b0fff203655c5de09ecac94", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "354212fe7b0fff203655c5de09ecac94");
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1689721692) {
            if (hashCode == 756805781 && str.equals("saveVideoToPhotosAlbum")) {
                c = 1;
            }
        } else if (str.equals("chooseVideo")) {
            c = 0;
        }
        switch (c) {
            case 0:
                return new String[]{PermissionGuard.PERMISSION_STORAGE_READ};
            case 1:
                return new String[]{PermissionGuard.PERMISSION_STORAGE_WRITE};
            default:
                return super.a(str, jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, Uri uri, JSONObject jSONObject) {
        Object[] objArr = {context, uri, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "091215e0a55050e883d937b8bcc43500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "091215e0a55050e883d937b8bcc43500");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(context, uri);
            jSONObject.put("duration", mediaMetadataRetriever.extractMetadata(9));
            jSONObject.put("width", mediaMetadataRetriever.extractMetadata(18));
            jSONObject.put("height", mediaMetadataRetriever.extractMetadata(19));
        } catch (Exception unused) {
        } finally {
            mediaMetadataRetriever.release();
        }
    }
}
