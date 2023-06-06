package com.meituan.mmp.lib.api.live;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.live.live.mrn.MLivePlayerModule;
import com.dianping.titans.utils.LocalIdUtils;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.mmp.lib.page.view.NativeViewApi;
import com.meituan.mmp.lib.pip.e;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.mmp.main.annotation.NeedDependency;
import com.meituan.mmp.main.annotation.SupportApiNames;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.k;
import com.sankuai.meituan.mtlive.player.library.a;
import com.sankuai.meituan.mtlive.player.library.f;
import java.io.File;
import java.io.FileOutputStream;
import org.json.JSONObject;
/* compiled from: ProGuard */
@NeedDependency({k.class})
/* loaded from: classes3.dex */
public class LivePlayerApi extends NativeViewApi<c> {
    @SupportApiNames
    public static String[] API_NAMES = {"insertLivePlayer", "updateLivePlayer", "removeLivePlayer", "operateLivePlayer", "operateLivePlayer.exitFullScreen", "operateLivePlayer.mute", "operateLivePlayer.pause", "operateLivePlayer.play", "operateLivePlayer.requestFullScreen", "operateLivePlayer.resume", "operateLivePlayer.snapshot", "operateLivePlayer.stop", MLivePlayerModule.REACT_CLASS, "livePlayerContext"};
    public static ChangeQuickRedirect h;
    public boolean i;

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    @NonNull
    public final String f() {
        return "livePlayerId";
    }

    @Override // com.meituan.mmp.lib.page.view.NativeViewApi
    public final /* synthetic */ c b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2b5c935105ff7e4af385decc01e33e3", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2b5c935105ff7e4af385decc01e33e3") : new c(getContext(), this.d, d(jSONObject), jSONObject.optInt("mtLiveId", 55127));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static /* synthetic */ void a(LivePlayerApi livePlayerApi, String str, JSONObject jSONObject, final IApiCallback iApiCallback) {
        char c;
        boolean z;
        CoverViewWrapper c2;
        char c3;
        int a;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, livePlayerApi, changeQuickRedirect, false, "a0b284f2502a63f18deaee8d94da2303", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, livePlayerApi, changeQuickRedirect, false, "a0b284f2502a63f18deaee8d94da2303");
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode == -506641258) {
            if (str.equals("updateLivePlayer")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == -246503535) {
            if (str.equals("operateLivePlayer")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode != 994976390) {
            if (hashCode == 1812190865 && str.equals("removeLivePlayer")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("insertLivePlayer")) {
                c = 0;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                Object[] objArr2 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, livePlayerApi, changeQuickRedirect2, false, "c27a9cd2bfea74de762922df099f0abf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, livePlayerApi, changeQuickRedirect2, false, "c27a9cd2bfea74de762922df099f0abf");
                    return;
                }
                c d = livePlayerApi.d(jSONObject, iApiCallback);
                if (d != null) {
                    d.setToken(AbsApi.getToken(jSONObject));
                    d.a(a(jSONObject)).a(livePlayerApi.getAppId()).b(livePlayerApi.getPageManager().e().getPagePath());
                    Bundle a2 = c.a(jSONObject);
                    d.f = a2.getString("playUrl", d.f);
                    d.s = d.b(a2);
                    d.a(a2, true);
                    d.j = a2.getBoolean("autoplay", d.j);
                    if (d.j && d.f != null && !d.f.isEmpty()) {
                        livePlayerApi.a(d);
                    }
                    CoverViewWrapper c4 = livePlayerApi.c(jSONObject, iApiCallback);
                    if (c4 != null) {
                        c4.a(jSONObject.optJSONObject("style"));
                    }
                    iApiCallback.onSuccess(null);
                    return;
                }
                return;
            case 1:
                Object[] objArr3 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (PatchProxy.isSupport(objArr3, livePlayerApi, changeQuickRedirect3, false, "e9aff0fba79dbd4090af4dab2ceef326", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, livePlayerApi, changeQuickRedirect3, false, "e9aff0fba79dbd4090af4dab2ceef326");
                    return;
                }
                String d2 = livePlayerApi.d(jSONObject);
                CoverViewWrapper c5 = livePlayerApi.c(jSONObject, iApiCallback);
                if (c5 != null) {
                    a(jSONObject);
                    if (c5 != null) {
                        c5.a(jSONObject.optJSONObject("style"));
                    }
                    c cVar = (c) c5.b(c.class);
                    if (cVar == null) {
                        iApiCallback.onFail(a("view not found!", new Object[0]));
                        return;
                    } else if (cVar.B == null) {
                        iApiCallback.onFail(a("player has released!", new Object[0]));
                        return;
                    } else {
                        cVar.setToken(AbsApi.getToken(jSONObject));
                        livePlayerApi.a(jSONObject, d2);
                        Bundle a3 = c.a(jSONObject);
                        cVar.k = a3.getBoolean("needEvent", cVar.k);
                        cVar.l = a3.getBoolean("needNetStatus", cVar.l);
                        cVar.a(a3, false);
                        boolean a4 = cVar.B.a();
                        String string = a3.getString("playUrl", cVar.f);
                        if (string != null && !string.isEmpty() && cVar.f != null && !cVar.f.equalsIgnoreCase(string) && cVar.B.a()) {
                            cVar.B.c(true);
                        }
                        cVar.f = string;
                        int b = cVar.b(a3);
                        if (b != cVar.s && cVar.B.a()) {
                            cVar.B.c(true);
                        }
                        cVar.s = b;
                        cVar.j = a3.getBoolean("autoplay", cVar.j);
                        if ((cVar.j || a4) && cVar.f != null && !cVar.f.isEmpty() && !cVar.B.a()) {
                            livePlayerApi.a(cVar);
                        }
                        iApiCallback.onSuccess(null);
                        return;
                    }
                }
                return;
            case 2:
                livePlayerApi.a(jSONObject, iApiCallback);
                return;
            case 3:
                Object[] objArr4 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect4 = h;
                if (PatchProxy.isSupport(objArr4, livePlayerApi, changeQuickRedirect4, false, "999c092ef50d430091ad6001697867dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, livePlayerApi, changeQuickRedirect4, false, "999c092ef50d430091ad6001697867dc");
                    return;
                }
                String optString = jSONObject.optString("type", "");
                final String d3 = livePlayerApi.d(jSONObject);
                Object[] objArr5 = {optString, d3, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect5 = h;
                if (PatchProxy.isSupport(objArr5, livePlayerApi, changeQuickRedirect5, false, "698ea95b6917a392bd6f0472cd77f328", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr5, livePlayerApi, changeQuickRedirect5, false, "698ea95b6917a392bd6f0472cd77f328")).booleanValue();
                } else if (TextUtils.equals("exitPictureInPicture", optString)) {
                    if (e.b(d3)) {
                        iApiCallback.onSuccess(null);
                    } else {
                        iApiCallback.onFail(codeJson(-1, "player not in pictureInPicture mode "));
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (z || (c2 = livePlayerApi.c(jSONObject, iApiCallback)) == null) {
                    return;
                }
                c cVar2 = (c) c2.b(c.class);
                if (cVar2 == null) {
                    iApiCallback.onFail(a("view not found!", new Object[0]));
                    return;
                } else if (cVar2.B == null) {
                    iApiCallback.onFail(a("player has released!", new Object[0]));
                    return;
                } else {
                    cVar2.setToken(AbsApi.getToken(jSONObject));
                    switch (optString.hashCode()) {
                        case -934426579:
                            if (optString.equals("resume")) {
                                c3 = 6;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -802181223:
                            if (optString.equals("exitFullScreen")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3363353:
                            if (optString.equals("mute")) {
                                c3 = 7;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3443508:
                            if (optString.equals("play")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3540994:
                            if (optString.equals("stop")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 106440182:
                            if (optString.equals("pause")) {
                                c3 = 5;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 284874180:
                            if (optString.equals("snapshot")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 458133450:
                            if (optString.equals("requestFullScreen")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            final String optString2 = jSONObject.optString(LocalIdUtils.QUERY_QUALITY);
                            if (!cVar2.B.a()) {
                                iApiCallback.onFail(a("player not start", new Object[0]));
                                return;
                            }
                            b bVar = cVar2.B;
                            a.c cVar3 = new a.c() { // from class: com.meituan.mmp.lib.api.live.LivePlayerApi.2
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.meituan.mtlive.player.library.a.c
                                public final void a(Bitmap bitmap) {
                                    Bitmap bitmap2;
                                    Object[] objArr6 = {bitmap};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "717841f8dc273a4109b6e87f965ec05d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "717841f8dc273a4109b6e87f965ec05d");
                                        return;
                                    }
                                    try {
                                        int width = bitmap.getWidth();
                                        int height = bitmap.getHeight();
                                        if ("compressed".equals(optString2)) {
                                            Matrix matrix = new Matrix();
                                            matrix.setScale(0.5f, 0.5f);
                                            bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
                                            bitmap.recycle();
                                        } else {
                                            bitmap2 = bitmap;
                                        }
                                        String format = String.format("tmp_%s%d.%s", "capture_", Long.valueOf(System.currentTimeMillis()), CommonConstant.File.JPG);
                                        bitmap2.compress(Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(new File(LivePlayerApi.this.e(), format)));
                                        bitmap2.recycle();
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("tempImagePath", "wdfile://" + format);
                                        jSONObject2.put("width", width);
                                        jSONObject2.put("height", height);
                                        jSONObject2.put("livePlayerId", d3);
                                        iApiCallback.onSuccess(jSONObject2);
                                    } catch (Exception unused) {
                                        iApiCallback.onFail(NativeViewApi.a("snapshot error", new Object[0]));
                                    }
                                }
                            };
                            Object[] objArr6 = {cVar3};
                            ChangeQuickRedirect changeQuickRedirect6 = b.a;
                            if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "945b3dce1d768e95dfe8256a00ac141e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "945b3dce1d768e95dfe8256a00ac141e");
                                return;
                            } else {
                                bVar.d.a(cVar3);
                                return;
                            }
                        case 1:
                            iApiCallback.onFail(a(String.format("%s not support", optString), new Object[0]));
                            return;
                        case 2:
                            iApiCallback.onFail(a(String.format("%s not support", optString), new Object[0]));
                            return;
                        case 3:
                            a = livePlayerApi.a(cVar2);
                            break;
                        case 4:
                            a = cVar2.B.c(false);
                            break;
                        case 5:
                            cVar2.B.c();
                            a = 0;
                            break;
                        case 6:
                            b bVar2 = cVar2.B;
                            Object[] objArr7 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect7 = b.a;
                            if (!PatchProxy.isSupport(objArr7, bVar2, changeQuickRedirect7, false, "3ac91c69e3921504748957aa0782f1ba", RobustBitConfig.DEFAULT_VALUE)) {
                                if (!bVar2.e) {
                                    bVar2.d.d();
                                    a = 0;
                                    break;
                                } else {
                                    a = 1;
                                    break;
                                }
                            } else {
                                a = ((Integer) PatchProxy.accessDispatch(objArr7, bVar2, changeQuickRedirect7, false, "3ac91c69e3921504748957aa0782f1ba")).intValue();
                                break;
                            }
                        case 7:
                            if (!cVar2.g) {
                                cVar2.g = true;
                            } else {
                                cVar2.g = false;
                            }
                            cVar2.B.a(cVar2.g);
                            a = 0;
                            break;
                        default:
                            a = -1;
                            break;
                    }
                    if (a == 0) {
                        iApiCallback.onSuccess(null);
                        return;
                    } else {
                        iApiCallback.onFail(a("operator error %s", optString));
                        return;
                    }
                }
            default:
                return;
        }
    }

    public LivePlayerApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27e21e467b71f563f2d33fe2c4f6f3cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27e21e467b71f563f2d33fe2c4f6f3cd");
        } else {
            this.i = true;
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e06f9694bcd986ac5e7ea66de984df3c", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e06f9694bcd986ac5e7ea66de984df3c") : new String[]{"insertLivePlayer", "updateLivePlayer", "removeLivePlayer", "operateLivePlayer"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        return API_NAMES;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(final String str, final JSONObject jSONObject, final IApiCallback iApiCallback) {
        boolean z = true;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dec3912a25d96de0c49762eaf1c7ebaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dec3912a25d96de0c49762eaf1c7ebaa");
        } else if (!isInnerApp()) {
            iApiCallback.onFail(a("current app not support", new Object[0]));
        } else {
            final com.meituan.mmp.main.a<Void> aVar = new com.meituan.mmp.main.a<Void>() { // from class: com.meituan.mmp.lib.api.live.LivePlayerApi.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.main.a
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr2 = {null};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e40a1bc90e2a6260fc2c5362a3fafa7a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e40a1bc90e2a6260fc2c5362a3fafa7a");
                    } else {
                        LivePlayerApi.a(LivePlayerApi.this, str, jSONObject, iApiCallback);
                    }
                }

                @Override // com.meituan.mmp.main.a
                public final void a(String str2, Exception exc) {
                    Object[] objArr2 = {str2, exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ffc8da4028fc8f6f985c2ae99d37a9a9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ffc8da4028fc8f6f985c2ae99d37a9a9");
                    } else {
                        iApiCallback.onFail(NativeViewApi.a("Engine did not ready,try it later!", new Object[0]));
                    }
                }
            };
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fcb82204933f8811ea11916e67179910", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fcb82204933f8811ea11916e67179910");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "af4dd388761f6abc53d5e6afc28dc6b5", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "af4dd388761f6abc53d5e6afc28dc6b5")).booleanValue();
            } else if (!a.b) {
                z = f.a(55127);
                a.b = z;
            }
            if (z) {
                aVar.a(null);
            } else {
                f.a(55127, new k.a() { // from class: com.meituan.mmp.lib.api.live.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtlive.core.k.a
                    public final void onInitialSucceed() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1a7c0d15f56a1658cfc6b6a92ee71405", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1a7c0d15f56a1658cfc6b6a92ee71405");
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.b("LiveUtil", "checkEngine player succeed! ");
                        a.b = true;
                        if (aVar != null) {
                            aVar.a(null);
                        }
                    }

                    @Override // com.sankuai.meituan.mtlive.core.k.a
                    public final void onInitialFailed() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4e8a82589056d659b5ae009c634bcf07", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4e8a82589056d659b5ae009c634bcf07");
                            return;
                        }
                        com.meituan.mmp.lib.trace.b.b("LiveUtil", "checkPlayerEngine player failed!");
                        if (aVar != null) {
                            aVar.a(null, null);
                        }
                    }
                });
            }
        }
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3fb2057878723dfeded2ce9094036ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3fb2057878723dfeded2ce9094036ad");
            return;
        }
        super.onPause();
        this.i = true;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8caf383f038e101a12fab4ac0b3d0e7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8caf383f038e101a12fab4ac0b3d0e7b");
            return;
        }
        super.onResume();
        this.i = false;
    }

    private int a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e43a718a19f67a7e8782ef1c18359169", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e43a718a19f67a7e8782ef1c18359169")).intValue();
        }
        if (this.i) {
            return 1;
        }
        if (!cVar.r) {
            e.c();
        }
        cVar.a();
        return cVar.B.a(cVar.f, cVar.s);
    }
}
