package com.meituan.msi.api.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.webkit.URLUtil;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiApiPermission;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.g;
import com.meituan.msi.api.selectedDialog.SelectedDialog;
import com.meituan.msi.api.video.ChooseMediaResponse;
import com.meituan.msi.api.video.PreviewMediaParam;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.provider.d;
import com.meituan.msi.util.ae;
import com.meituan.msi.util.b;
import com.meituan.msi.util.c;
import com.meituan.msi.util.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.connect.share.QzonePublish;
import com.unionpay.tsmservice.data.Constant;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MediaAPI implements IMsiApi, g {
    public static ChangeQuickRedirect a;
    private static final Handler c = new Handler(Looper.getMainLooper());
    private final d b;
    private String d;
    private boolean e;

    @Override // com.meituan.msi.api.g
    public final void a(int i, Intent intent, MsiContext msiContext) {
    }

    public MediaAPI() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39c797c663352bd390a52abcd8e4fc5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39c797c663352bd390a52abcd8e4fc5b");
            return;
        }
        this.b = com.meituan.msi.a.a();
        this.e = false;
    }

    public static /* synthetic */ void a(MediaAPI mediaAPI, Intent intent, final MsiContext msiContext) {
        Object[] objArr = {intent, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mediaAPI, changeQuickRedirect, false, "73ce64e2c5db5894774a6a512726ac2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mediaAPI, changeQuickRedirect, false, "73ce64e2c5db5894774a6a512726ac2e");
            return;
        }
        final ChooseMediaResponse chooseMediaResponse = new ChooseMediaResponse();
        chooseMediaResponse.tempFiles = new ArrayList<>();
        String a2 = mediaAPI.a(f.a(intent, QzonePublish.PUBLISH_TO_QZONE_VIDEO_PATH), msiContext);
        if (TextUtils.isEmpty(a2)) {
            c.post(new Runnable() { // from class: com.meituan.msi.api.video.MediaAPI.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f78ba51e8a8d39dc0defac8322f6262", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f78ba51e8a8d39dc0defac8322f6262");
                    } else {
                        msiContext.onError(500, "convert localPath failed!");
                    }
                }
            });
            return;
        }
        ChooseMediaResponse.TempFile tempFile = new ChooseMediaResponse.TempFile();
        tempFile.tempFilePath = a2;
        tempFile.duration = f.a(intent, "duration", 0);
        tempFile.height = f.a(intent, "height", 0);
        tempFile.width = f.a(intent, "width", 0);
        tempFile.size = f.a(intent, QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE, 0L);
        tempFile.thumbTempFilePath = mediaAPI.a(f.a(intent, "videoCoverPath"), msiContext);
        tempFile.fileType = "video";
        chooseMediaResponse.tempFiles.add(tempFile);
        chooseMediaResponse.type = "video";
        c.post(new Runnable() { // from class: com.meituan.msi.api.video.MediaAPI.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9332db14d263d385780636901ef1c871", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9332db14d263d385780636901ef1c871");
                } else {
                    msiContext.onSuccess(chooseMediaResponse);
                }
            }
        });
    }

    @MsiApiMethod(name = "chooseMedia", request = ChooseMediaParam.class, response = ChooseMediaResponse.class)
    @MsiApiPermission(apiPermissions = {PermissionGuard.PERMISSION_STORAGE_READ})
    public void chooseMedia(ChooseMediaParam chooseMediaParam, final MsiContext msiContext) {
        Uri a2;
        Object[] objArr = {chooseMediaParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "639c58b55a1191fa670edc5817365efc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "639c58b55a1191fa670edc5817365efc");
            return;
        }
        String a3 = a();
        this.d = chooseMediaParam._mt == null ? "" : chooseMediaParam._mt.sceneToken;
        int max = Math.max(chooseMediaParam.maxDuration, 3);
        if (chooseMediaParam.sourceType == null || chooseMediaParam.sourceType.length != 1) {
            String str = this.d;
            Object[] objArr2 = {a3, Integer.valueOf(max), str, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6c87317a37ba4d308531644d96c82aa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6c87317a37ba4d308531644d96c82aa");
                return;
            }
            final ArrayList arrayList = new ArrayList();
            final Uri a4 = a(a3, b(a3), max, str);
            final Uri a5 = a(a3, a(a3), max, str);
            com.meituan.msi.api.selectedDialog.a aVar = new com.meituan.msi.api.selectedDialog.a(new View.OnClickListener() { // from class: com.meituan.msi.api.video.MediaAPI.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "444ee11eb5d9c1b95c50bb8ac4ac4d22", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "444ee11eb5d9c1b95c50bb8ac4ac4d22");
                    } else {
                        MediaAPI.this.a(a4, msiContext);
                    }
                }
            }, msiContext.getActivity().getResources().getString(R.string.SELECTED_DIALOG_TYPE_LOCAL_VIDEO));
            com.meituan.msi.api.selectedDialog.a aVar2 = new com.meituan.msi.api.selectedDialog.a(new View.OnClickListener() { // from class: com.meituan.msi.api.video.MediaAPI.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "abae55bd027b41a12503b0103a8f6f2b", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "abae55bd027b41a12503b0103a8f6f2b");
                    } else {
                        MediaAPI.this.a(a5, msiContext);
                    }
                }
            }, msiContext.getActivity().getResources().getString(R.string.SELECTED_DIALOG_TYPE_RECORDING));
            arrayList.add(aVar);
            arrayList.add(aVar2);
            m.a(new Runnable() { // from class: com.meituan.msi.api.video.MediaAPI.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3bf453d917d8c111d8759ffcedb46263", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3bf453d917d8c111d8759ffcedb46263");
                    } else {
                        new SelectedDialog(msiContext.getActivity(), arrayList).show();
                    }
                }
            });
            return;
        }
        if ("album".equals(chooseMediaParam.sourceType[0])) {
            a2 = a(a3, b(a3), max, this.d);
        } else {
            a2 = a(a3, a(a3), max, this.d);
        }
        a(a2, msiContext);
    }

    private Uri a(String str, String str2, int i, String str3) {
        Object[] objArr = {str, str2, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1247cf5bf5cfa6de4f85134d709cd86", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1247cf5bf5cfa6de4f85134d709cd86");
        }
        int i2 = i * 1000;
        return Uri.parse(str).buildUpon().appendEncodedPath(str2).appendQueryParameter("min_record_duration", Integer.toString(0)).appendQueryParameter("max_record_duration", Integer.toString(i2)).appendQueryParameter("minSelectDuration", Integer.toString(0)).appendQueryParameter("maxSelectDuration", Integer.toString(i2)).appendQueryParameter("permissionToken", str3).build();
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a646c045ffd5daa9b5a8e6732b728b3a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a646c045ffd5daa9b5a8e6732b728b3a") : TextUtils.equals(str, "waimai") ? "wmvideopreivew" : "takeout/wmvideopreivew";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        private MsiContext c;

        public a(MsiContext msiContext) {
            Object[] objArr = {MediaAPI.this, msiContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cdd0ce8947407e11dcf78ab1a285311", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cdd0ce8947407e11dcf78ab1a285311");
            } else {
                this.c = msiContext;
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, final Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afa9095594efb5a7b33ccdc6995be4bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afa9095594efb5a7b33ccdc6995be4bd");
                return;
            }
            c.a(com.meituan.msi.a.f(), this);
            switch (f.a(intent, Constant.KEY_RESULT_CODE, 0)) {
                case -1:
                    this.c.onError(500, "illegal scene token");
                    return;
                case 0:
                    this.c.onError(500, "user cancel");
                    return;
                default:
                    m.b(new Runnable() { // from class: com.meituan.msi.api.video.MediaAPI.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a79ea863b368aca586f28b18ab8279bc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a79ea863b368aca586f28b18ab8279bc");
                            } else {
                                MediaAPI.a(MediaAPI.this, intent, a.this.c);
                            }
                        }
                    });
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Uri uri, MsiContext msiContext) {
        Object[] objArr = {uri, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "905b543dad67c1f9ddc3f8a1dd7982a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "905b543dad67c1f9ddc3f8a1dd7982a1");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.sankuai.meituan.takeoutnew.ugc.VIDEO_GENERATE_RESULT");
        com.meituan.msi.a.f().registerReceiver(new a(msiContext), intentFilter);
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (b.a(com.meituan.msi.a.f().getPackageManager(), intent)) {
            this.e = true;
            msiContext.startActivityForResult(intent, 97);
            return;
        }
        msiContext.onError(500, "API not found, host need to import takeout-library dependencies");
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae2ff95af5b943efd2df3e6ba5e1f4d9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae2ff95af5b943efd2df3e6ba5e1f4d9") : TextUtils.equals(str, "waimai") ? "wmvideoselect" : "takeout/wmvideoselect";
    }

    @MsiApiMethod(name = "previewMedia", request = PreviewMediaParam.class)
    public void previewMedia(PreviewMediaParam previewMediaParam, MsiContext msiContext) {
        Object[] objArr = {previewMediaParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08494432072f7df60cb8d838e86bf236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08494432072f7df60cb8d838e86bf236");
            return;
        }
        PreviewMediaParam.SourceItem[] sourceItemArr = previewMediaParam.sources;
        if (sourceItemArr == null || sourceItemArr.length == 0) {
            msiContext.onError(400, "sources is null!");
            return;
        }
        int max = Math.max(previewMediaParam.current, 0);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < sourceItemArr.length; i++) {
            PreviewMediaParam.SourceItem sourceItem = sourceItemArr[i];
            if (sourceItem != null) {
                String str = sourceItem.type;
                String str2 = sourceItem.url;
                String str3 = sourceItem.poster;
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!URLUtil.isNetworkUrl(str2)) {
                        str2 = msiContext.getFileProvider().a(str2);
                    }
                    jSONObject.put("url", str2);
                    jSONObject.put("type", TextUtils.equals(str, "video") ? 1 : 0);
                    jSONObject.put("video_cover_url", str3);
                    jSONArray.put(i, jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        String a2 = a();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(a2).buildUpon().appendEncodedPath(TextUtils.equals(a2, "waimai") ? "UGCReview/video" : "takeout/UGCReview/video").appendQueryParameter("from", "5").appendQueryParameter("index", String.valueOf(max)).appendQueryParameter("media_data", jSONArray.toString()).appendQueryParameter("theme", "0").build());
        if (b.a(com.meituan.msi.a.f().getPackageManager(), intent)) {
            msiContext.startActivityForResult(intent, -1);
            msiContext.onSuccess(null);
            return;
        }
        msiContext.onError(500, "API not found, host need to import takeout-library dependencies");
    }

    private String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8f330e61b9a4d5a90af14cd523a2748", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8f330e61b9a4d5a90af14cd523a2748");
        }
        String b = b();
        return TextUtils.equals("waimai", b) ? "meituanwaimai://waimai.meituan.com" : (TextUtils.equals("Nova", b) || TextUtils.equals("dianping_lite", b)) ? "dianping://waimai.dianping.com" : "imeituan://www.meituan.com";
    }

    private String a(String str, MsiContext msiContext) {
        String b;
        boolean a2;
        Object[] objArr = {str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c32f0e0360db7e108326a6767deacd6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c32f0e0360db7e108326a6767deacd6e");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        InputStream inputStream = null;
        String hexString = Long.toHexString(new Date().getTime());
        if (str.startsWith("content://")) {
            Uri parse = Uri.parse(str);
            try {
                inputStream = Privacy.createContentResolver(com.meituan.msi.a.f(), this.d).b(parse);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            b = Privacy.createContentResolver(com.meituan.msi.a.f(), this.d).a(parse);
            if (inputStream == null) {
                return "";
            }
        } else {
            b = com.meituan.msi.util.file.d.b(str);
        }
        String str2 = "tmp_" + hexString + b;
        File file = new File(msiContext.getFileProvider().b(), str2);
        if (inputStream != null) {
            a2 = com.meituan.msi.util.file.d.a(inputStream, file.getAbsolutePath());
        } else {
            a2 = com.meituan.msi.util.file.d.a(str, file.getAbsolutePath(), ae.a(msiContext.getArgs()));
        }
        return a2 ? msiContext.getFileProvider().b(str2) : "";
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39fe8434aa8df86825ff4d7863d5881a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39fe8434aa8df86825ff4d7863d5881a") : this.b != null ? this.b.c() : "";
    }
}
