package com.meituan.android.customerservice.channel.voip;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.customerservice.callkefuuisdk.callkf.CallKFActivity;
import com.meituan.android.customerservice.channel.upload.UploadFilesDialog;
import com.meituan.android.customerservice.channel.upload.bean.UploadFileInfo;
import com.meituan.android.customerservice.channel.upload.bean.VideoData;
import com.meituan.android.customerservice.channel.voip.utils.LoadingDialog;
import com.meituan.android.customerservice.kit.utils.e;
import com.meituan.android.customerservice.kit.utils.i;
import com.meituan.android.loader.DynLoader;
import com.meituan.android.loader.c;
import com.meituan.android.pike.bean.PikeUtil;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.titans.widget.MediaWidget;
import com.sankuai.titans.widget.PickerBuilder;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.mapsdk.internal.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DownloadVoIPActivity extends Activity {
    public static ChangeQuickRedirect a;
    private static Executor b;
    private LoadingDialog c;
    private e.a d;

    public static /* synthetic */ String e(DownloadVoIPActivity downloadVoIPActivity) {
        return "imeituan://www.meituan.com/voip/callkf";
    }

    public DownloadVoIPActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3714a384d790dae1dd8c3cd2e517c325", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3714a384d790dae1dd8c3cd2e517c325");
        } else {
            this.d = new e.a() { // from class: com.meituan.android.customerservice.channel.voip.DownloadVoIPActivity.7
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.customerservice.kit.utils.e.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c100f442dd35af3e4c2fe78930bbcec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c100f442dd35af3e4c2fe78930bbcec");
                    } else {
                        DownloadVoIPActivity.this.finish();
                    }
                }

                @Override // com.meituan.android.customerservice.kit.utils.e.a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f27547155cede2380ecc19ef6777c9b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f27547155cede2380ecc19ef6777c9b1");
                    } else {
                        DownloadVoIPActivity.this.finish();
                    }
                }
            };
        }
    }

    public static /* synthetic */ void a(DownloadVoIPActivity downloadVoIPActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, downloadVoIPActivity, changeQuickRedirect, false, "bd0951fe442b6a2582197dc52e03d329", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, downloadVoIPActivity, changeQuickRedirect, false, "bd0951fe442b6a2582197dc52e03d329");
        } else if (DynLoader.available("agora-rtc-sdk", 1)) {
            if (DynLoader.load("agora-rtc-sdk")) {
                downloadVoIPActivity.a();
                com.meituan.android.customerservice.utils.c.a(downloadVoIPActivity.getClass(), "Load voip so success");
                return;
            }
            com.meituan.android.customerservice.utils.c.b(downloadVoIPActivity.getClass(), "loadDynSo===fail");
            downloadVoIPActivity.runOnUiThread(new Runnable() { // from class: com.meituan.android.customerservice.channel.voip.DownloadVoIPActivity.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3137580ab25f1f0be9eaf6bb296459f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3137580ab25f1f0be9eaf6bb296459f");
                        return;
                    }
                    i.a aVar = new i.a();
                    aVar.d = R.string.cs_voip_error_tip;
                    aVar.f = true;
                    aVar.b(DownloadVoIPActivity.this);
                    DownloadVoIPActivity.this.finish();
                }
            });
        } else {
            downloadVoIPActivity.runOnUiThread(new Runnable() { // from class: com.meituan.android.customerservice.channel.voip.DownloadVoIPActivity.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2479e060632fd209a3d16a5dfc8889b8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2479e060632fd209a3d16a5dfc8889b8");
                        return;
                    }
                    if (DownloadVoIPActivity.this.c == null) {
                        DownloadVoIPActivity.this.c = new LoadingDialog(DownloadVoIPActivity.this);
                        DownloadVoIPActivity.this.c.setCancelable(false);
                    }
                    DownloadVoIPActivity.this.c.show();
                }
            });
            ArrayList arrayList = new ArrayList();
            arrayList.add("agora-rtc-sdk");
            DynLoader.toggleDownload(new com.meituan.android.loader.a() { // from class: com.meituan.android.customerservice.channel.voip.DownloadVoIPActivity.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.loader.a
                public final void onDynDownloadSuccess() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "521c49a5de976ee96c0ac299456ed8be", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "521c49a5de976ee96c0ac299456ed8be");
                        return;
                    }
                    com.meituan.android.customerservice.utils.c.a(getClass(), "Human Load voip so success");
                    if (DynLoader.load("agora-rtc-sdk")) {
                        DownloadVoIPActivity.this.a();
                        return;
                    }
                    i.a aVar = new i.a();
                    aVar.d = R.string.cs_voip_error_tip;
                    aVar.f = true;
                    aVar.b(DownloadVoIPActivity.this);
                    DownloadVoIPActivity.this.finish();
                }

                @Override // com.meituan.android.loader.a
                public final void onDynDownloadFailure() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12d3fff4ac66219e447af6f2fc310f83", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12d3fff4ac66219e447af6f2fc310f83");
                        return;
                    }
                    com.meituan.android.customerservice.utils.c.b(getClass(), "Human Load voip so fail");
                    i.a aVar = new i.a();
                    aVar.d = R.string.cs_voip_error_tip;
                    aVar.f = true;
                    aVar.b(DownloadVoIPActivity.this);
                    DownloadVoIPActivity.this.finish();
                }
            }, new c.a().a(arrayList).b, true);
        }
    }

    @Override // android.app.Activity
    @SuppressLint({"WrongThread"})
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "136bdfd12ca47ac62681cf6c46c420ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "136bdfd12ca47ac62681cf6c46c420ae");
            return;
        }
        super.onCreate(bundle);
        if (!NetWorkUtils.isNetworkConnected(getApplicationContext())) {
            i.a aVar = new i.a();
            aVar.d = R.string.cs_voip_net_disable;
            aVar.f = true;
            aVar.b(this);
            finish();
        } else if (!com.meituan.android.customerservice.channel.voip.utils.b.c()) {
            com.meituan.android.customerservice.utils.c.a(getClass(), "user not login");
            finish();
        } else if (Privacy.createPermissionGuard().a(this, PermissionGuard.PERMISSION_MICROPHONE, "pt-07e05fed3b674cf2") <= 0) {
            Privacy.createPermissionGuard().a((Activity) this, PermissionGuard.PERMISSION_MICROPHONE, "pt-07e05fed3b674cf2", new com.meituan.android.privacy.interfaces.d() { // from class: com.meituan.android.customerservice.channel.voip.DownloadVoIPActivity.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str, int i) {
                    Object[] objArr2 = {str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc6cc0409ccf7642d008360a0c226205", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc6cc0409ccf7642d008360a0c226205");
                    } else if (i <= 0) {
                        e.a(DownloadVoIPActivity.this, DownloadVoIPActivity.this.d);
                    } else {
                        DownloadVoIPActivity.a(DownloadVoIPActivity.this);
                    }
                }
            });
            com.meituan.android.customerservice.utils.c.a(getClass(), "no record audio permission");
        } else {
            ExecutorService a2 = com.sankuai.android.jarvis.c.a("csChannel");
            b = a2;
            com.sankuai.waimai.launcher.util.aop.b.a(a2, new Runnable() { // from class: com.meituan.android.customerservice.channel.voip.DownloadVoIPActivity.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df73335c914acdba3b13aa1ac3af0153", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df73335c914acdba3b13aa1ac3af0153");
                    } else {
                        DownloadVoIPActivity.a(DownloadVoIPActivity.this);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac228a043e1a5d2b71f4893dd7c9334c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac228a043e1a5d2b71f4893dd7c9334c");
        } else {
            runOnUiThread(new Runnable() { // from class: com.meituan.android.customerservice.channel.voip.DownloadVoIPActivity.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cdec282f5426a9dc50b7407507eb3c84", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cdec282f5426a9dc50b7407507eb3c84");
                    } else if (DownloadVoIPActivity.this.isFinishing()) {
                    } else {
                        Class<?> cls = getClass();
                        com.meituan.android.customerservice.utils.c.a(cls, "getVoipUrl():" + DownloadVoIPActivity.e(DownloadVoIPActivity.this));
                        Uri parse = Uri.parse(DownloadVoIPActivity.e(DownloadVoIPActivity.this));
                        if (parse == null) {
                            com.meituan.android.customerservice.utils.c.b(getClass(), "Uri.parse data null");
                            DownloadVoIPActivity.this.finish();
                            return;
                        }
                        boolean a2 = f.a(DownloadVoIPActivity.this.getIntent(), "isNative", true);
                        c.a().f = a2;
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setPackage(DownloadVoIPActivity.this.getPackageName());
                        intent.setData(parse);
                        intent.putExtra("call_associated_data", DownloadVoIPActivity.this.c());
                        intent.putExtra("call_init_data", DownloadVoIPActivity.this.b());
                        intent.addFlags(y.a);
                        if (DownloadVoIPActivity.this.getPackageManager().resolveActivity(intent, 65536) != null) {
                            try {
                                DownloadVoIPActivity.this.startActivity(intent);
                                final c a3 = c.a();
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                                if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "81b8b174a2567e53e6e7b4129c4c6cee", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "81b8b174a2567e53e6e7b4129c4c6cee");
                                } else {
                                    com.meituan.android.customerservice.callkefuuisdk.callkf.a.m = new com.meituan.android.customerservice.callkefuuisdk.c() { // from class: com.meituan.android.customerservice.channel.voip.c.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.meituan.android.customerservice.callkefuuisdk.c
                                        public final void a(String str, String str2) {
                                            String h;
                                            Object[] objArr4 = {str, str2};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9e61a5319f44d77011cb27ecc1e0314e", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9e61a5319f44d77011cb27ecc1e0314e");
                                            } else if (TextUtils.equals(str, "PAGE")) {
                                                d a4 = d.a();
                                                Object[] objArr5 = {str};
                                                ChangeQuickRedirect changeQuickRedirect5 = d.a;
                                                if (PatchProxy.isSupport(objArr5, a4, changeQuickRedirect5, false, "b2d8f475517e47ce95cff193b8fc8e4d", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr5, a4, changeQuickRedirect5, false, "b2d8f475517e47ce95cff193b8fc8e4d");
                                                    return;
                                                }
                                                HashMap hashMap = new HashMap();
                                                hashMap.putAll(a4.b());
                                                hashMap.put("logType", str);
                                                hashMap.put("visitTime", Long.valueOf(System.currentTimeMillis()));
                                                Object[] objArr6 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.customerservice.channel.voip.utils.b.a;
                                                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "7f7926a8aa807ff8f1d59c5ea2e6227e", RobustBitConfig.DEFAULT_VALUE)) {
                                                    h = (String) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "7f7926a8aa807ff8f1d59c5ea2e6227e");
                                                } else {
                                                    h = com.meituan.android.customerservice.channel.voip.utils.b.b != null ? com.meituan.android.customerservice.channel.voip.utils.b.b.h() : "";
                                                }
                                                hashMap.put("cityName", h);
                                                hashMap.put("isLogin", Boolean.valueOf(com.meituan.android.customerservice.channel.voip.utils.b.c()));
                                                com.meituan.android.customerservice.retrofit.a.a(hashMap);
                                            } else if (TextUtils.equals(str, "OPERATION")) {
                                                d.a().a(str, str2);
                                            }
                                        }
                                    };
                                }
                                final c a4 = c.a();
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = c.a;
                                if (PatchProxy.isSupport(objArr4, a4, changeQuickRedirect4, false, "5e580b16b1662d63979ceb7c73b066cc", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, a4, changeQuickRedirect4, false, "5e580b16b1662d63979ceb7c73b066cc");
                                } else {
                                    CallKFActivity.a(new com.meituan.android.customerservice.callkefuuisdk.d() { // from class: com.meituan.android.customerservice.channel.voip.c.2
                                        public static ChangeQuickRedirect a;

                                        @Override // com.meituan.android.customerservice.callkefuuisdk.d
                                        public final void a(Activity activity) {
                                            Object[] objArr5 = {activity};
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "43478489fbb53dd6add35cf688bc385a", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "43478489fbb53dd6add35cf688bc385a");
                                                return;
                                            }
                                            com.meituan.android.customerservice.utils.c.a(getClass(), "onUploadProofsBtnClick");
                                            c cVar = a4;
                                            Object[] objArr6 = {activity};
                                            ChangeQuickRedirect changeQuickRedirect6 = c.a;
                                            if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "4afa23cd21edd132e8e2b7152bad8ddc", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "4afa23cd21edd132e8e2b7152bad8ddc");
                                            } else if (activity != null && !activity.isFinishing() && (cVar.c == null || !cVar.c.isShowing())) {
                                                if (com.meituan.android.customerservice.cscallsdk.d.j().h() != null) {
                                                    cVar.e = com.meituan.android.customerservice.cscallsdk.d.j().h().e();
                                                } else {
                                                    cVar.e = "";
                                                }
                                                cVar.c = new UploadFilesDialog(activity);
                                                cVar.c.h = new AnonymousClass3(activity);
                                                if (cVar.c != null) {
                                                    cVar.c.show();
                                                }
                                            }
                                            d.a().a("OPERATION", "上传凭证");
                                        }

                                        @Override // com.meituan.android.customerservice.callkefuuisdk.d
                                        public final void a(Activity activity, int i, int i2, Intent intent2) {
                                            Object[] objArr5 = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent2};
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6275a6f96b04518fe82193f4c8b8ed1c", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6275a6f96b04518fe82193f4c8b8ed1c");
                                                return;
                                            }
                                            switch (i) {
                                                case 1:
                                                    if (i2 != -1 || intent2 == null) {
                                                        if (a4.c == null || a4.c.isShowing()) {
                                                            return;
                                                        }
                                                        a4.c.show();
                                                        return;
                                                    } else if (intent2 == null) {
                                                        if (a4.c == null || a4.c.isShowing()) {
                                                            return;
                                                        }
                                                        a4.c.show();
                                                        return;
                                                    } else {
                                                        Bundle onActivityResult = MediaWidget.onActivityResult(activity, i, i2, intent2, "pt-76641b6e2e3e4ebb");
                                                        if (onActivityResult == null) {
                                                            a4.c.show();
                                                            return;
                                                        }
                                                        ArrayList<String> stringArrayList = onActivityResult.getStringArrayList(PickerBuilder.KEY_SELECTED_PHOTOS);
                                                        if (stringArrayList == null) {
                                                            if (a4.c == null || a4.c.isShowing()) {
                                                                return;
                                                            }
                                                            a4.c.show();
                                                            return;
                                                        }
                                                        ArrayList<UploadFileInfo> arrayList = new ArrayList<>();
                                                        Iterator<String> it = stringArrayList.iterator();
                                                        while (it.hasNext()) {
                                                            String next = it.next();
                                                            if (next != null) {
                                                                UploadFileInfo uploadFileInfo = new UploadFileInfo();
                                                                uploadFileInfo.setLocalPath(next);
                                                                uploadFileInfo.setToken("pt-76641b6e2e3e4ebb");
                                                                uploadFileInfo.setFileName(com.meituan.android.customerservice.channel.utils.a.a(next));
                                                                uploadFileInfo.setFileType(0);
                                                                arrayList.add(uploadFileInfo);
                                                            }
                                                        }
                                                        a4.a(arrayList, 0);
                                                        return;
                                                    }
                                                case 2:
                                                    if (i2 != -1 || intent2 == null) {
                                                        if (a4.c == null || a4.c.isShowing()) {
                                                            return;
                                                        }
                                                        a4.c.show();
                                                        return;
                                                    } else if (intent2 == null) {
                                                        if (a4.c == null || a4.c.isShowing()) {
                                                            return;
                                                        }
                                                        a4.c.show();
                                                        return;
                                                    } else {
                                                        VideoData videoData = new VideoData();
                                                        Bundle onActivityResult2 = MediaWidget.onActivityResult(activity, i, i2, intent2, "pt-76641b6e2e3e4ebb");
                                                        if (onActivityResult2 == null) {
                                                            a4.c.show();
                                                            return;
                                                        }
                                                        ArrayList<String> stringArrayList2 = onActivityResult2.getStringArrayList(PickerBuilder.KEY_SELECTED_PHOTOS);
                                                        if (stringArrayList2 == null || stringArrayList2.isEmpty()) {
                                                            if (a4.c == null || a4.c.isShowing()) {
                                                                return;
                                                            }
                                                            a4.c.show();
                                                            return;
                                                        }
                                                        videoData.videoPath = stringArrayList2.get(0);
                                                        videoData.thumbUrl = ThumbnailUtils.createVideoThumbnail(stringArrayList2.get(0), 1);
                                                        UploadFileInfo uploadFileInfo2 = new UploadFileInfo();
                                                        uploadFileInfo2.setVideoData(videoData);
                                                        uploadFileInfo2.setFileName(com.meituan.android.customerservice.channel.utils.a.a(videoData.videoPath));
                                                        uploadFileInfo2.setFileType(1);
                                                        ArrayList<UploadFileInfo> arrayList2 = new ArrayList<>();
                                                        arrayList2.add(uploadFileInfo2);
                                                        a4.a(arrayList2, 1);
                                                        return;
                                                    }
                                                default:
                                                    return;
                                            }
                                        }

                                        @Override // com.meituan.android.customerservice.callkefuuisdk.d
                                        public final void a() {
                                            Object[] objArr5 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ea846bb99d96896e267a7c7a11d70ff1", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ea846bb99d96896e267a7c7a11d70ff1");
                                                return;
                                            }
                                            if (a4.h != null) {
                                                a4.h.unsubscribe();
                                                a4.h = null;
                                            }
                                            if (a4.c != null) {
                                                UploadFilesDialog uploadFilesDialog = a4.c;
                                                Object[] objArr6 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect6 = UploadFilesDialog.a;
                                                if (PatchProxy.isSupport(objArr6, uploadFilesDialog, changeQuickRedirect6, false, "7851038d763143ee803304dfa70baa9e", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, uploadFilesDialog, changeQuickRedirect6, false, "7851038d763143ee803304dfa70baa9e");
                                                } else {
                                                    if (uploadFilesDialog.g != null) {
                                                        uploadFilesDialog.g.dismiss();
                                                    }
                                                    if (uploadFilesDialog.f != null) {
                                                        uploadFilesDialog.f.dismiss();
                                                    }
                                                    if (uploadFilesDialog.e != null) {
                                                        uploadFilesDialog.e.dismiss();
                                                    }
                                                    uploadFilesDialog.dismiss();
                                                }
                                                c.a(a4, (UploadFilesDialog) null);
                                            }
                                        }

                                        @Override // com.meituan.android.customerservice.callkefuuisdk.d
                                        public final void b() {
                                            Object[] objArr5 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "75250539cda813ed08a74120dc2adecb", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "75250539cda813ed08a74120dc2adecb");
                                            } else if (a4.c == null || !a4.c.isShowing()) {
                                            } else {
                                                final UploadFilesDialog uploadFilesDialog = a4.c;
                                                Object[] objArr6 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect6 = UploadFilesDialog.a;
                                                if (PatchProxy.isSupport(objArr6, uploadFilesDialog, changeQuickRedirect6, false, "42e9356dc183b56a791edbf4939ed68c", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, uploadFilesDialog, changeQuickRedirect6, false, "42e9356dc183b56a791edbf4939ed68c");
                                                } else if (uploadFilesDialog.i == null || uploadFilesDialog.d == null || uploadFilesDialog.d.isFinishing()) {
                                                } else {
                                                    com.meituan.android.customerservice.utils.f.a().post(new Runnable() { // from class: com.meituan.android.customerservice.channel.upload.UploadFilesDialog.4
                                                        public static ChangeQuickRedirect a;

                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            Object[] objArr7 = new Object[0];
                                                            ChangeQuickRedirect changeQuickRedirect7 = a;
                                                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "d1f1cf8b60b8b342ad8f1f8f85dcb8fe", RobustBitConfig.DEFAULT_VALUE)) {
                                                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "d1f1cf8b60b8b342ad8f1f8f85dcb8fe");
                                                            } else {
                                                                uploadFilesDialog.i.requestLayout();
                                                            }
                                                        }
                                                    });
                                                }
                                            }
                                        }
                                    });
                                }
                            } catch (ActivityNotFoundException e) {
                                Class<?> cls2 = getClass();
                                com.meituan.android.customerservice.utils.c.b(cls2, "activity not found ,exc " + e.toString());
                            }
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("uid", Long.valueOf(com.meituan.android.customerservice.channel.voip.utils.b.a()));
                        hashMap.put("net", Integer.valueOf(PikeUtil.getNetworkState(DownloadVoIPActivity.this)));
                        hashMap.put(RemoteMessageConst.Notification.CHANNEL_ID, DownloadVoIPActivity.this.b().get("call_channel"));
                        Statistics.getChannel("cs").writeModelView(AppUtil.generatePageInfoKey(DownloadVoIPActivity.this), "b_cs_6dlh5aqb_mv", hashMap, a2 ? "c_cs_27gugzln" : "c_cs_hx2f3zzl");
                        DownloadVoIPActivity.this.finish();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> b() {
        HashMap<String, String> hashMap;
        String b2;
        String c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5878a36a503c92d352bff3b1ec70090", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5878a36a503c92d352bff3b1ec70090");
        }
        try {
            hashMap = (HashMap) f.c(getIntent(), "call_init_data");
        } catch (Exception e) {
            Class<?> cls = getClass();
            com.meituan.android.customerservice.utils.c.b(cls, "getCallInitDataParams:" + e.toString());
            hashMap = null;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.customerservice.channel.voip.utils.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9ef1ca00dc070ac6248fb1761ff218e1", RobustBitConfig.DEFAULT_VALUE)) {
            b2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9ef1ca00dc070ac6248fb1761ff218e1");
        } else {
            b2 = com.meituan.android.customerservice.channel.voip.utils.b.b != null ? com.meituan.android.customerservice.channel.voip.utils.b.b.b() : "";
        }
        hashMap.put("call_init_token", b2);
        hashMap.put("call_init_appid", String.valueOf(com.meituan.android.customerservice.channel.voip.utils.b.e()));
        hashMap.put("call_init_devicetype", "2");
        hashMap.put("call_init_uid", String.valueOf(com.meituan.android.customerservice.channel.voip.utils.b.a()));
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.customerservice.channel.voip.utils.b.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f5d21849791e4d693d1f2694cd0a44fd", RobustBitConfig.DEFAULT_VALUE)) {
            c = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f5d21849791e4d693d1f2694cd0a44fd");
        } else {
            c = com.meituan.android.customerservice.channel.voip.utils.b.b != null ? com.meituan.android.customerservice.channel.voip.utils.b.b.c() : "";
        }
        hashMap.put("call_init_user_name", c);
        String str = d.a().d ? "env_test" : "env_prod";
        hashMap.put("call_init_env", str);
        Class<?> cls2 = getClass();
        com.meituan.android.customerservice.utils.c.a(cls2, "voip env: " + str);
        if (TextUtils.isEmpty(hashMap.get("call_is_show_upload_btn")) && TextUtils.equals(hashMap.get("call_type"), "3")) {
            hashMap.put("call_is_show_upload_btn", "true");
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d507405a70c9faba47656af7afc6a62", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d507405a70c9faba47656af7afc6a62");
        }
        HashMap<String, String> hashMap = null;
        try {
            hashMap = (HashMap) f.c(getIntent(), "call_associated_data");
        } catch (Exception e) {
            Class<?> cls = getClass();
            com.meituan.android.customerservice.utils.c.b(cls, "getCallAssociatedDataParams:" + e.toString());
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (TextUtils.isEmpty(hashMap.get("tenantId")) && TextUtils.equals(b().get("call_type"), "3")) {
            hashMap.put("tenantId", "8fe8e0d8-d02c-11e8-94b3-002296936f17");
        }
        if (TextUtils.isEmpty(hashMap.get("visitId")) && TextUtils.equals(b().get("call_type"), "3")) {
            hashMap.put("sysName", "android");
            hashMap.put("sysVer", Build.VERSION.RELEASE);
            hashMap.put("appVer", com.meituan.android.customerservice.channel.voip.utils.b.d());
        }
        return hashMap;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26995ff5eb0abe8e01d937cbb131b748", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26995ff5eb0abe8e01d937cbb131b748");
            return;
        }
        if (this.c != null && this.c.isShowing()) {
            this.c.dismiss();
        }
        this.c = null;
        super.onDestroy();
    }
}
