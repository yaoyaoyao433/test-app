package com.meituan.mmp.lib.api.live.push;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.page.view.NativeViewApi;
import com.meituan.mmp.lib.utils.q;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.lib.utils.x;
import com.meituan.mmp.main.Downloader;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.annotation.NeedDependency;
import com.meituan.mmp.main.annotation.SupportApiNames;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.k;
import com.sankuai.meituan.mtlive.pusher.library.h;
import com.sankuai.meituan.mtlive.pusher.library.i;
import java.io.File;
import java.io.FileOutputStream;
import org.json.JSONObject;
/* compiled from: ProGuard */
@NeedDependency({k.class})
/* loaded from: classes3.dex */
public final class LivePushApi extends NativeViewApi<c> {
    @SupportApiNames
    public static String[] API_NAMES = {"insertLivePusher", "updateLivePusher", "operateLivePusher", "removeLivePusher", "operateLivePusher.start", "operateLivePusher.stop", "operateLivePusher.pause", "operateLivePusher.resume", "operateLivePusher.switchCamera", "operateLivePusher.snapshot", "operateLivePusher.toggleTorch", "operateLivePusher.playBGM", "operateLivePusher.stopBGM", "operateLivePusher.pauseBGM", "operateLivePusher.resumeBGM", "operateLivePusher.setBGMVolume", "operateLivePusher.setMICVolume", "operateLivePusher.startPreview", "operateLivePusher.stopPreview", "operateLivePusher.sendMessage", "live-pusher", "livePusherContext"};
    public static ChangeQuickRedirect h;
    private com.meituan.mmp.lib.config.a i;

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final String f() {
        return "livePusherId";
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final /* synthetic */ c b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a00cc478ded86685e924ec036ab89cb5", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a00cc478ded86685e924ec036ab89cb5") : new c(getContext(), this.d, d(jSONObject), a(jSONObject), jSONObject.optInt("mtLiveId", 55127));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static /* synthetic */ void a(LivePushApi livePushApi, String str, JSONObject jSONObject, final IApiCallback iApiCallback) {
        char c;
        int i = 0;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, livePushApi, changeQuickRedirect, false, "fa36ccbbb26c8ef1cd4035e315427bc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, livePushApi, changeQuickRedirect, false, "fa36ccbbb26c8ef1cd4035e315427bc2");
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode == -497809668) {
            if (str.equals("updateLivePusher")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == -237671945) {
            if (str.equals("operateLivePusher")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 1003807980) {
            if (hashCode == 1821022455 && str.equals("removeLivePusher")) {
                c = 3;
            }
            c = 65535;
        } else {
            if (str.equals("insertLivePusher")) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                Object[] objArr2 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, livePushApi, changeQuickRedirect2, false, "c858e31d7a87fd7085bf54c110209b84", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, livePushApi, changeQuickRedirect2, false, "c858e31d7a87fd7085bf54c110209b84");
                    return;
                }
                livePushApi.g();
                c d = livePushApi.d(jSONObject, iApiCallback);
                if (d != null) {
                    d.setToken(AbsApi.getToken(jSONObject));
                    Bundle a = c.a(jSONObject);
                    a aVar = d.e;
                    aVar.o = d;
                    aVar.i.e(true);
                    aVar.k = a.getString("pushUrl", "");
                    aVar.a(a, true);
                    aVar.c = a.getBoolean("autopush", aVar.c);
                    if (aVar.c && aVar.k != null && !aVar.k.isEmpty() && !aVar.i.e()) {
                        aVar.a(aVar.d);
                        aVar.b(aVar.e);
                        i = aVar.i.a(aVar.k);
                    }
                    aVar.n = true;
                    String optString = jSONObject.optString(DynamicTitleParser.PARSER_KEY_BACKGROUND_IMAGE, null);
                    String optString2 = jSONObject.optString("backgroundMD5");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(s.a(livePushApi.getContext(), optString, livePushApi.i))) {
                        livePushApi.a(optString, DynamicTitleParser.PARSER_KEY_BACKGROUND_IMAGE, d, optString2);
                    }
                    String optString3 = jSONObject.optString("watermarkImage");
                    String optString4 = jSONObject.optString("watermarkMD5");
                    if (!TextUtils.isEmpty(optString3)) {
                        livePushApi.a(optString3, "watermarkImage", d, optString4);
                    }
                    if (i == 0) {
                        iApiCallback.onSuccess(null);
                        return;
                    } else {
                        iApiCallback.onFail(codeJson(i, i == 5 ? "licence error" : null));
                        return;
                    }
                }
                return;
            case 1:
                Object[] objArr3 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (!PatchProxy.isSupport(objArr3, livePushApi, changeQuickRedirect3, false, "ddd1ce1d5b4c581ad5cfc4bd56a8e2a8", RobustBitConfig.DEFAULT_VALUE)) {
                    CoverViewWrapper c2 = livePushApi.c(jSONObject, iApiCallback);
                    if (c2 != null) {
                        c cVar = (c) c2.b(c.class);
                        if (cVar == null) {
                            iApiCallback.onFail(a("view not found!", new Object[0]));
                            break;
                        } else {
                            cVar.setToken(AbsApi.getToken(jSONObject));
                            livePushApi.a(jSONObject, livePushApi.d(jSONObject));
                            cVar.a(c.a(jSONObject));
                            livePushApi.a(jSONObject.optString(DynamicTitleParser.PARSER_KEY_BACKGROUND_IMAGE), DynamicTitleParser.PARSER_KEY_BACKGROUND_IMAGE, cVar, jSONObject.optString("backgroundMD5"));
                            livePushApi.a(jSONObject.optString("watermarkImage"), "watermarkImage", cVar, jSONObject.optString("watermarkMD5"));
                            iApiCallback.onSuccess(null);
                            break;
                        }
                    }
                } else {
                    PatchProxy.accessDispatch(objArr3, livePushApi, changeQuickRedirect3, false, "ddd1ce1d5b4c581ad5cfc4bd56a8e2a8");
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                livePushApi.a(jSONObject, iApiCallback);
                return;
            default:
                return;
        }
        Object[] objArr4 = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect4 = h;
        if (PatchProxy.isSupport(objArr4, livePushApi, changeQuickRedirect4, false, "59d73deeba132894523f8eeae5ed4f51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, livePushApi, changeQuickRedirect4, false, "59d73deeba132894523f8eeae5ed4f51");
            return;
        }
        final String d2 = livePushApi.d(jSONObject);
        CoverViewWrapper c3 = livePushApi.c(jSONObject, iApiCallback);
        if (c3 != null) {
            c cVar2 = (c) c3.b(c.class);
            if (cVar2 == null) {
                iApiCallback.onFail();
                return;
            }
            cVar2.setToken(AbsApi.getToken(jSONObject));
            String optString5 = jSONObject.optString("type");
            if (optString5.equalsIgnoreCase("snapshot")) {
                cVar2.setSnapshotListener(new i.b() { // from class: com.meituan.mmp.lib.api.live.push.LivePushApi.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtlive.pusher.library.i.b
                    public final void a(Bitmap bitmap) {
                        Object[] objArr5 = {bitmap};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "971ac200ed0f9160dc40222d2095fef8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "971ac200ed0f9160dc40222d2095fef8");
                            return;
                        }
                        try {
                            if (bitmap == null) {
                                iApiCallback.onFail(NativeViewApi.a("bmp not found!", new Object[0]));
                                return;
                            }
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            String format = String.format("tmp_%s%d.%s", "capture_", Long.valueOf(System.currentTimeMillis()), ".jpg");
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(LivePushApi.this.getAppConfig().c(LivePushApi.this.getContext()), format));
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                            bitmap.recycle();
                            x.a(fileOutputStream);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("tempImagePath", "wdfile://" + format);
                            jSONObject2.put("width", width);
                            jSONObject2.put("height", height);
                            jSONObject2.put("livePusherId", d2);
                            iApiCallback.onSuccess(jSONObject2);
                        } catch (Exception unused) {
                            iApiCallback.onFail(NativeViewApi.a("snapshot error", new Object[0]));
                        }
                    }
                });
                cVar2.a(optString5, jSONObject);
            } else if (optString5.equalsIgnoreCase("requestFullScreen")) {
                iApiCallback.onFail(a("not support", new Object[0]));
            } else if (optString5.equalsIgnoreCase("exitFullScreen")) {
                iApiCallback.onFail(a("not support", new Object[0]));
            } else {
                int a2 = cVar2.a(optString5, jSONObject);
                if (a2 == 0) {
                    iApiCallback.onSuccess(null);
                } else {
                    iApiCallback.onFail(a("opt %s fail cause %d", optString5, Integer.valueOf(a2)));
                }
            }
        }
    }

    public LivePushApi() {
        g();
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96a771349a3bc5ddeb2ef7aba094eef6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96a771349a3bc5ddeb2ef7aba094eef6");
        } else {
            this.i = getAppConfig();
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6bd3e9345a207e106413571bf350ba4", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6bd3e9345a207e106413571bf350ba4") : new String[]{PermissionGuard.PERMISSION_MICROPHONE, PermissionGuard.PERMISSION_CAMERA};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e60b7e563bd5ffe1954bb4c5aab22887", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e60b7e563bd5ffe1954bb4c5aab22887") : new String[]{"insertLivePusher", "updateLivePusher", "operateLivePusher", "removeLivePusher"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        return API_NAMES;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public final void invoke(final String str, final JSONObject jSONObject, final IApiCallback iApiCallback) {
        boolean z = true;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72fec162b1cdceeb47eb80e00b2ad8ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72fec162b1cdceeb47eb80e00b2ad8ff");
        } else if (!isInnerApp()) {
            iApiCallback.onFail(a("current app not support", new Object[0]));
        } else {
            final com.meituan.mmp.main.a<Void> aVar = new com.meituan.mmp.main.a<Void>() { // from class: com.meituan.mmp.lib.api.live.push.LivePushApi.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.main.a
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr2 = {null};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "037d83a7aae4c324f2aae212b9c0b9ae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "037d83a7aae4c324f2aae212b9c0b9ae");
                    } else {
                        LivePushApi.a(LivePushApi.this, str, jSONObject, iApiCallback);
                    }
                }

                @Override // com.meituan.mmp.main.a
                public final void a(String str2, Exception exc) {
                    Object[] objArr2 = {str2, exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b7af317bbeac9b32d85d31728fc26c4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b7af317bbeac9b32d85d31728fc26c4");
                    } else {
                        iApiCallback.onFail(NativeViewApi.a("Engine did not ready,try it later!", new Object[0]));
                    }
                }
            };
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.api.live.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3ae8218510f0999cc188c5dfc061ba53", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3ae8218510f0999cc188c5dfc061ba53");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.api.live.a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "87ea4a7834c937ed33eeec9583f9e656", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "87ea4a7834c937ed33eeec9583f9e656")).booleanValue();
            } else if (!com.meituan.mmp.lib.api.live.a.c) {
                z = h.b(55127);
                com.meituan.mmp.lib.api.live.a.c = z;
            }
            if (z) {
                aVar.a(null);
            } else {
                h.a(55127, new k.a() { // from class: com.meituan.mmp.lib.api.live.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtlive.core.k.a
                    public final void onInitialSucceed() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "50b065b3d3b9006a4b082ff11d8189f0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "50b065b3d3b9006a4b082ff11d8189f0");
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.b("LiveUtil", "checkEngine pusher succeed! ");
                        a.c = true;
                        if (aVar != null) {
                            aVar.a(null);
                        }
                    }

                    @Override // com.sankuai.meituan.mtlive.core.k.a
                    public final void onInitialFailed() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "341b66dbed065161297eb62fdd73521c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "341b66dbed065161297eb62fdd73521c");
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.b("LiveUtil", "checkPlayerEngine pusher failed!");
                        if (aVar != null) {
                            aVar.a(null, null);
                        }
                    }
                });
            }
        }
    }

    private void a(String str, final String str2, final c cVar, final String str3) {
        Object[] objArr = {str, str2, cVar, str3};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec6b5efaf095ba3d07dccf807e2efc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec6b5efaf095ba3d07dccf807e2efc8");
            return;
        }
        g();
        if (TextUtils.isEmpty(str)) {
            String str4 = DynamicTitleParser.PARSER_KEY_BACKGROUND_IMAGE.equalsIgnoreCase(str2) ? cVar.e.f : cVar.e.g;
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || str3.equalsIgnoreCase(s.b(new File(str4)))) {
                return;
            }
            cVar.e.d("watermarkImage".equalsIgnoreCase(str2));
            return;
        }
        String a = s.a(getContext(), str, this.i);
        if (q.a(a, this.i.e(getContext()))) {
            if (URLUtil.isNetworkUrl(a)) {
                MMPEnvHelper.getDownloader().download(a, this.i.c(getContext()), new Downloader.Callback() { // from class: com.meituan.mmp.lib.api.live.push.LivePushApi.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.main.Downloader.Callback
                    public final void onFail(String str5) {
                    }

                    @Override // com.meituan.mmp.main.Downloader.Callback
                    public final void onProgress(long j, long j2) {
                    }

                    @Override // com.meituan.mmp.main.Downloader.Callback
                    public final void onTimeout() {
                    }

                    @Override // com.meituan.mmp.main.Downloader.Callback
                    public final void onSuccess(String str5, long j) {
                        Object[] objArr2 = {str5, new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bf55e7cf445c0376ca5f610081af41d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bf55e7cf445c0376ca5f610081af41d");
                            return;
                        }
                        Bundle bundle = new Bundle();
                        if (TextUtils.isEmpty(str3)) {
                            bundle.putString(str2, str5);
                            cVar.a(bundle);
                        } else if (str3.equalsIgnoreCase(s.b(new File(str5)))) {
                            bundle.putString(str2, str5);
                            cVar.a(bundle);
                        }
                    }
                });
                return;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str3)) {
                bundle.putString(str2, a);
                cVar.a(bundle);
            } else if (str3.equalsIgnoreCase(s.b(new File(a)))) {
                bundle.putString(str2, a);
                cVar.a(bundle);
            }
        }
    }
}
