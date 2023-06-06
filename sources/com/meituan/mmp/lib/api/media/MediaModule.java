package com.meituan.mmp.lib.api.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.URLUtil;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.api.d;
import com.meituan.mmp.lib.api.selectedDialog.SelectedDialog;
import com.meituan.mmp.lib.utils.b;
import com.meituan.mmp.lib.utils.e;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
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
public class MediaModule extends ActivityApi {
    public static ChangeQuickRedirect h;
    private String i;

    public static /* synthetic */ void a(MediaModule mediaModule, Intent intent, final IApiCallback iApiCallback) {
        Object[] objArr = {intent, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, mediaModule, changeQuickRedirect, false, "5f3b44e329dbc71c227a734d4aa62c59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mediaModule, changeQuickRedirect, false, "5f3b44e329dbc71c227a734d4aa62c59");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            String d = mediaModule.d(f.a(intent, QzonePublish.PUBLISH_TO_QZONE_VIDEO_PATH));
            if (TextUtils.isEmpty(d)) {
                c.post(new Runnable() { // from class: com.meituan.mmp.lib.api.media.MediaModule.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3ef0794e6729bb435e5ce809e129b00", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3ef0794e6729bb435e5ce809e129b00");
                        } else {
                            iApiCallback.onFail(AbsApi.codeJson(-1, "convert localPath failed!"));
                        }
                    }
                });
                return;
            }
            jSONObject.put("tempFilePath", d);
            jSONObject.put("thumbTempFilePath", mediaModule.d(f.a(intent, "videoCoverPath")));
            jSONObject.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, f.a(intent, QzonePublish.PUBLISH_TO_QZONE_VIDEO_SIZE, 0L));
            jSONObject.put("duration", f.a(intent, "duration", 0));
            jSONObject.put("height", f.a(intent, "height", 0));
            jSONObject.put("width", f.a(intent, "width", 0));
            jSONArray.put(jSONObject);
            final JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tempFiles", jSONArray);
            jSONObject2.put("type", "video");
            c.post(new Runnable() { // from class: com.meituan.mmp.lib.api.media.MediaModule.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6fe7a5979fd2aa5952574e5cb3e88327", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6fe7a5979fd2aa5952574e5cb3e88327");
                    } else {
                        iApiCallback.onSuccess(jSONObject2);
                    }
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3147d7555acdb9bd2d430209dda75b0", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3147d7555acdb9bd2d430209dda75b0") : new String[]{"chooseMedia", "previewMedia"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, final IApiCallback iApiCallback) throws d {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b83393815e8622515a3d6b623f30a68f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b83393815e8622515a3d6b623f30a68f");
            return;
        }
        this.i = getToken(jSONObject);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1698152435) {
            if (hashCode == -1379747588 && str.equals("previewMedia")) {
                c = 1;
            }
        } else if (str.equals("chooseMedia")) {
            c = 0;
        }
        switch (c) {
            case 0:
                Object[] objArr2 = {str, jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29553f1d793950da73cbdd48c4e9b196", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29553f1d793950da73cbdd48c4e9b196");
                    return;
                }
                jSONObject.optInt("count");
                jSONObject.optString(WmChooseMediaModule.TYPE_CAMERA);
                jSONObject.optBoolean("enableEditor");
                int optInt = jSONObject.optInt("maxDuration", 10);
                int i = optInt < 3 ? 3 : optInt;
                int optInt2 = jSONObject.optInt("minDuration", 0);
                int i2 = (optInt2 > i || optInt2 < 0) ? 0 : optInt2;
                jSONObject.optJSONArray("mediaType");
                JSONArray optJSONArray = jSONObject.optJSONArray("sourceType");
                final String f = f();
                final String token = getToken(jSONObject);
                if (optJSONArray != null && optJSONArray.length() != 0 && optJSONArray.length() <= 1) {
                    if (TextUtils.equals(optJSONArray.opt(0).toString(), "album")) {
                        a(f, e(f), i2, i, token, iApiCallback);
                        return;
                    } else {
                        a(f, f(f), i2, i, token, iApiCallback);
                        return;
                    }
                }
                Object[] objArr3 = {f, Integer.valueOf(i2), Integer.valueOf(i), token, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0b67366f4b747bb6734b6a0fdbb6b436", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0b67366f4b747bb6734b6a0fdbb6b436");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                final int i3 = i2;
                final int i4 = i;
                com.meituan.mmp.lib.api.selectedDialog.a aVar = new com.meituan.mmp.lib.api.selectedDialog.a(new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.media.MediaModule.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b4dcf6eee2413b260f46ca623f487789", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b4dcf6eee2413b260f46ca623f487789");
                        } else {
                            MediaModule.this.a(f, MediaModule.this.e(f), i3, i4, token, iApiCallback);
                        }
                    }
                }, "从手机相册选择");
                com.meituan.mmp.lib.api.selectedDialog.a aVar2 = new com.meituan.mmp.lib.api.selectedDialog.a(new View.OnClickListener() { // from class: com.meituan.mmp.lib.api.media.MediaModule.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ea7a83966bd57072cadd25d8f040f545", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ea7a83966bd57072cadd25d8f040f545");
                        } else {
                            MediaModule.this.a(f, MediaModule.this.f(f), i3, i4, token, iApiCallback);
                        }
                    }
                }, "拍摄");
                arrayList.add(aVar);
                arrayList.add(aVar2);
                new SelectedDialog(getActivity(), arrayList).show();
                return;
            case 1:
                a(str, jSONObject, iApiCallback);
                return;
            default:
                return;
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d72a55e9ac5e420398a66818e84195a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d72a55e9ac5e420398a66818e84195a3");
        }
        char c = 65535;
        if (str.hashCode() == -1698152435 && str.equals("chooseMedia")) {
            c = 0;
        }
        if (c == 0) {
            return new String[]{PermissionGuard.PERMISSION_STORAGE};
        }
        return super.a(str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        private IApiCallback c;

        public a(IApiCallback iApiCallback) {
            Object[] objArr = {MediaModule.this, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0c6ddab73d1e56e1b61197a27aa2b4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0c6ddab73d1e56e1b61197a27aa2b4");
            } else {
                this.c = iApiCallback;
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, final Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91229e52d0fc5691b91e2a17ca4dfece", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91229e52d0fc5691b91e2a17ca4dfece");
                return;
            }
            e.a(MediaModule.this.getContext(), this);
            switch (f.a(intent, Constant.KEY_RESULT_CODE, 0)) {
                case -1:
                    this.c.onFail(AbsApi.codeJson(-1, "illegal scene token"));
                    return;
                case 0:
                    this.c.onCancel();
                    return;
                default:
                    com.meituan.mmp.lib.executor.a.a(new Runnable() { // from class: com.meituan.mmp.lib.api.media.MediaModule.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ae88aa482fceed95c89c06a317af8b1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ae88aa482fceed95c89c06a317af8b1");
                            } else {
                                MediaModule.a(MediaModule.this, intent, a.this.c);
                            }
                        }
                    });
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i, int i2, String str3, IApiCallback iApiCallback) {
        Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), str3, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cf647d09814e9d335fa97ef5475449c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cf647d09814e9d335fa97ef5475449c");
            return;
        }
        int i3 = i * 1000;
        int i4 = i2 * 1000;
        Uri build = Uri.parse(str).buildUpon().appendEncodedPath(str2).appendQueryParameter("min_record_duration", Integer.toString(i3)).appendQueryParameter("max_record_duration", Integer.toString(i4)).appendQueryParameter("minSelectDuration", Integer.toString(i3)).appendQueryParameter("maxSelectDuration", Integer.toString(i4)).appendQueryParameter("permissionToken", str3).build();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.sankuai.meituan.takeoutnew.ugc.VIDEO_GENERATE_RESULT");
        getContext().registerReceiver(new a(iApiCallback), intentFilter);
        Intent intent = new Intent("android.intent.action.VIEW", build);
        if (b.a(MMPEnvHelper.getContext().getPackageManager(), intent)) {
            startActivityForResult(intent, iApiCallback);
        } else {
            iApiCallback.onFail(codeJson(-1, "API not found, host need to import takeout-library dependencies"));
        }
    }

    private String d(String str) {
        String c;
        boolean a2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62927faf2f93d8e2501dcf36fbf1c50a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62927faf2f93d8e2501dcf36fbf1c50a");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        InputStream inputStream = null;
        String hexString = Long.toHexString(new Date().getTime());
        if (str.startsWith("content://")) {
            Uri parse = Uri.parse(str);
            try {
                inputStream = Privacy.createContentResolver(getContext(), this.i).b(parse);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            c = Privacy.createContentResolver(getContext(), this.i).a(parse);
            if (inputStream == null) {
                return "";
            }
        } else {
            c = s.c(str);
        }
        String str2 = "tmp_" + hexString + c;
        File file = new File(e(), str2);
        if (inputStream != null) {
            a2 = s.a(inputStream, file.getAbsolutePath());
        } else {
            a2 = s.a(str, file.getAbsolutePath());
        }
        if (a2) {
            return "wdfile://" + str2;
        }
        return "";
    }

    private void a(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7d9820ce2ed724fd6927e04f91b42bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7d9820ce2ed724fd6927e04f91b42bb");
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("sources");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            iApiCallback.onFail(codeJson(-1, "sources is null!"));
            return;
        }
        int optInt = jSONObject.optInt("current", 0);
        if (optInt < 0) {
            optInt = 0;
        }
        jSONObject.optBoolean("showmenu", true);
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("type", "image");
                String optString2 = optJSONObject.optString("url");
                String optString3 = optJSONObject.optString("poster");
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (!URLUtil.isNetworkUrl(optString2)) {
                        optString2 = s.a(getContext(), optString2, getAppConfig());
                    }
                    jSONObject2.put("url", optString2);
                    jSONObject2.put("type", TextUtils.equals(optString, "video") ? 1 : 0);
                    jSONObject2.put("video_cover_url", optString3);
                    optJSONArray.put(i, jSONObject2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        String f = f();
        Uri build = Uri.parse(f).buildUpon().appendEncodedPath(TextUtils.equals(f, "waimai") ? "UGCReview/video" : "takeout/UGCReview/video").appendQueryParameter("from", "5").appendQueryParameter("index", String.valueOf(optInt)).appendQueryParameter("media_data", optJSONArray.toString()).appendQueryParameter("theme", "0").build();
        iApiCallback.onSuccess(null);
        Intent intent = new Intent("android.intent.action.VIEW", build);
        if (b.a(MMPEnvHelper.getContext().getPackageManager(), intent)) {
            startActivityForResult(intent, iApiCallback);
        } else {
            iApiCallback.onFail(codeJson(-1, "API not found, host need to import takeout-library dependencies"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84b9566c28b2df0d0184428202cac521", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84b9566c28b2df0d0184428202cac521") : TextUtils.equals(str, "waimai") ? "wmvideoselect" : "takeout/wmvideoselect";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0f38ebc8396e46824cca5d131e21468", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0f38ebc8396e46824cca5d131e21468") : TextUtils.equals(str, "waimai") ? "wmvideopreivew" : "takeout/wmvideopreivew";
    }

    private String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b254773b008f0c4b135a595d284ffb98", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b254773b008f0c4b135a595d284ffb98");
        }
        String appCode = MMPEnvHelper.getEnvInfo().getAppCode();
        return TextUtils.equals("waimai", appCode) ? "meituanwaimai://waimai.meituan.com" : (TextUtils.equals("Nova", appCode) || TextUtils.equals("dianping_lite", appCode)) ? "dianping://waimai.dianping.com" : "imeituan://www.meituan.com";
    }
}
