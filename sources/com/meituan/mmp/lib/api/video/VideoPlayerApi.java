package com.meituan.mmp.lib.api.video;

import android.support.annotation.NonNull;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.page.view.NativeViewApi;
import com.meituan.mmp.lib.utils.q;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsReaderView;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VideoPlayerApi extends NativeViewApi<d> {
    public static ChangeQuickRedirect h;

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    @NonNull
    public final String f() {
        return "videoPlayerId";
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final /* synthetic */ d b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb618334e6126cca631fd9a3406c6a43", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb618334e6126cca631fd9a3406c6a43");
        }
        d dVar = new d(getContext());
        dVar.setController(new f(getContext(), d(jSONObject), a(jSONObject), this.d));
        return dVar;
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f152284cf24d614b729e4dc719903c61", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f152284cf24d614b729e4dc719903c61") : new String[]{"insertVideoPlayer", "updateVideoPlayer", "operateVideoPlayer", "removeVideoPlayer"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d87406c7f2a53e15f817e602cac46d48", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d87406c7f2a53e15f817e602cac46d48") : new String[]{"insertVideoPlayer", "updateVideoPlayer", "operateVideoPlayer", "removeVideoPlayer", "operateVideoPlayer.play", "operateVideoPlayer.pause", "operateVideoPlayer.stop", "operateVideoPlayer.requestFullScreen", "operateVideoPlayer.exitFullScreen", "operateVideoPlayer.seek", "video", "videoContext"};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        char c;
        char c2;
        boolean z = false;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8888a9583bc50c169f38730cea29ee1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8888a9583bc50c169f38730cea29ee1");
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode == -1321203688) {
            if (str.equals("removeVideoPlayer")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode == -885048637) {
            if (str.equals("insertVideoPlayer")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -716220648) {
            if (hashCode == -190555469 && str.equals("updateVideoPlayer")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("operateVideoPlayer")) {
                c = 2;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                Object[] objArr2 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0becdf9b18681f3d07a89f87d3869ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0becdf9b18681f3d07a89f87d3869ff");
                    return;
                }
                d d = d(jSONObject, iApiCallback);
                if (d != null) {
                    final int a = a(jSONObject);
                    d.e = new com.meituan.mmp.lib.page.coverview.a() { // from class: com.meituan.mmp.lib.api.video.VideoPlayerApi.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.mmp.lib.page.coverview.a
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5261891bc07277706d5617857be949e5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5261891bc07277706d5617857be949e5");
                                return;
                            }
                            com.meituan.mmp.lib.page.e pageByPageId = VideoPlayerApi.this.getPageByPageId(a);
                            if (pageByPageId != null) {
                                pageByPageId.b(256);
                            }
                        }

                        @Override // com.meituan.mmp.lib.page.coverview.a
                        public final void b() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ae4b97ff1abc8bbf2dd21e3df55b42c5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ae4b97ff1abc8bbf2dd21e3df55b42c5");
                                return;
                            }
                            com.meituan.mmp.lib.page.e pageByPageId = VideoPlayerApi.this.getPageByPageId(a);
                            if (pageByPageId != null) {
                                pageByPageId.j();
                            }
                        }
                    };
                    a(jSONObject, d);
                    iApiCallback.onSuccess(null);
                    return;
                }
                return;
            case 1:
                Object[] objArr3 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "576fafcd46628ec2b8379bbe62af32d7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "576fafcd46628ec2b8379bbe62af32d7");
                    return;
                }
                String d2 = d(jSONObject);
                a(jSONObject);
                CoverViewWrapper c3 = c(jSONObject, iApiCallback);
                if (c3 != null) {
                    if (c3.b(d.class) == null) {
                        iApiCallback.onFail(a("view not found!", new Object[0]));
                        return;
                    }
                    a(jSONObject, d2);
                    d dVar = (d) c3.b(d.class);
                    if (jSONObject.has(TbsReaderView.KEY_FILE_PATH)) {
                        String a2 = s.a(getContext(), jSONObject.optString(TbsReaderView.KEY_FILE_PATH), getAppConfig());
                        if (!q.a(a2, getAppConfig().e(getContext()))) {
                            q.a(iApiCallback);
                            return;
                        } else if (a2.startsWith(AbsApiFactory.HTTP) || a2.startsWith(AbsApiFactory.HTTPS) || a2.startsWith("file://") || new File(a2).exists()) {
                            dVar.a(a2, jSONObject.optBoolean("autoplay", false));
                        } else {
                            iApiCallback.onFail();
                            return;
                        }
                    }
                    a(jSONObject, dVar);
                    iApiCallback.onSuccess(null);
                    return;
                }
                return;
            case 2:
                Object[] objArr4 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect4 = h;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f6f1f766da7ea2fd496c8ebc817d42a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f6f1f766da7ea2fd496c8ebc817d42a8");
                    return;
                }
                CoverViewWrapper c4 = c(jSONObject, iApiCallback);
                if (c4 != null) {
                    d dVar2 = (d) c4.b(d.class);
                    if (dVar2 == null) {
                        iApiCallback.onFail(a("view not found!", new Object[0]));
                        return;
                    }
                    String optString = jSONObject.optString("type", "");
                    switch (optString.hashCode()) {
                        case -802181223:
                            if (optString.equals("exitFullScreen")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1222225:
                            if (optString.equals("sendDanmu")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3443508:
                            if (optString.equals("play")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3526264:
                            if (optString.equals("seek")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3540994:
                            if (optString.equals("stop")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 106440182:
                            if (optString.equals("pause")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 458133450:
                            if (optString.equals("requestFullScreen")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            if (dVar2.l()) {
                                dVar2.a(false);
                            } else if (dVar2.e() || dVar2.k() || dVar2.i()) {
                                dVar2.a();
                            } else if (!dVar2.j()) {
                                dVar2.a(false);
                            }
                            dVar2.setPlayCalled(true);
                            break;
                        case 1:
                            dVar2.setPlayCalled(false);
                            if (!dVar2.d()) {
                                iApiCallback.onFail();
                                return;
                            }
                            break;
                        case 2:
                            dVar2.setPlayCalled(false);
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = d.a;
                            if (PatchProxy.isSupport(objArr5, dVar2, changeQuickRedirect5, false, "de711b7c9ac222c976dd00fec1da91fc", RobustBitConfig.DEFAULT_VALUE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(objArr5, dVar2, changeQuickRedirect5, false, "de711b7c9ac222c976dd00fec1da91fc")).booleanValue();
                            } else if (dVar2.c != null) {
                                dVar2.c.c();
                                dVar2.b = 8;
                                dVar2.d.a(dVar2.b);
                                dVar2.c.a(0L);
                                z = true;
                            }
                            if (!z) {
                                iApiCallback.onFail();
                                return;
                            }
                            break;
                        case 3:
                            JSONArray optJSONArray = jSONObject.optJSONArray("data");
                            if (optJSONArray != null && optJSONArray.length() > 0) {
                                dVar2.getController().setFullScreenDirection(optJSONArray.optInt(0, 0));
                            }
                            dVar2.r();
                            break;
                        case 4:
                            dVar2.b(true);
                            break;
                        case 5:
                            break;
                        case 6:
                            if (dVar2.l()) {
                                iApiCallback.onFail();
                                return;
                            }
                            JSONArray optJSONArray2 = jSONObject.optJSONArray("data");
                            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                                dVar2.a((long) (optJSONArray2.optDouble(0, 0.0d) * 1000.0d));
                                break;
                            }
                            break;
                        default:
                            iApiCallback.onFail();
                            return;
                    }
                    if (dVar2.m()) {
                        iApiCallback.onFail();
                        return;
                    } else {
                        iApiCallback.onSuccess(null);
                        return;
                    }
                }
                return;
            case 3:
                a(jSONObject, iApiCallback);
                return;
            default:
                return;
        }
    }

    private void a(JSONObject jSONObject, d dVar) {
        Object[] objArr = {jSONObject, dVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76f680ad40b1dd0cb87e88852c6fb4ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76f680ad40b1dd0cb87e88852c6fb4ab");
            return;
        }
        if (jSONObject.has("showBasicControls")) {
            dVar.getController().c(jSONObject.optBoolean("showBasicControls"));
        }
        if (jSONObject.has("showCenterPlayBtn")) {
            dVar.getController().b(jSONObject.optBoolean("showCenterPlayBtn"));
        }
        if (jSONObject.has("showControlProgress")) {
            dVar.getController().e = jSONObject.optBoolean("showControlProgress");
        }
        if (jSONObject.has("showProgress")) {
            dVar.getController().a(Boolean.valueOf(jSONObject.optBoolean("showProgress")));
        }
        if (jSONObject.has("showPlayBtn")) {
            dVar.getController().d(jSONObject.optBoolean("showPlayBtn", false));
        }
        if (jSONObject.has("showFullScreenBtn")) {
            dVar.getController().e(jSONObject.optBoolean("showFullScreenBtn", true));
        }
        if (jSONObject.has("direction")) {
            dVar.getController().setFullScreenDirection(jSONObject.optInt("direction"));
        }
        if (jSONObject.has("muted")) {
            dVar.setMute(jSONObject.optBoolean("muted", false));
        }
        if (jSONObject.has("loop")) {
            dVar.setLoop(jSONObject.optBoolean("loop", false));
        }
    }
}
