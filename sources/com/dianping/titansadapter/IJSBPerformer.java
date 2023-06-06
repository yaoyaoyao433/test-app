package com.dianping.titansadapter;

import android.content.Intent;
import com.dianping.titans.js.IJSHandlerDelegate;
import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titansmodel.apimodel.a;
import com.dianping.titansmodel.apimodel.e;
import com.dianping.titansmodel.apimodel.f;
import com.dianping.titansmodel.c;
import com.dianping.titansmodel.d;
import com.dianping.titansmodel.g;
import com.dianping.titansmodel.h;
import com.dianping.titansmodel.i;
import com.dianping.titansmodel.j;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface IJSBPerformer {
    public static final int METHOD_BIND = 7;
    public static final int METHOD_CHOOSE_IMAGE = 9;
    public static final int METHOD_DOWNLOAD_IMAGE = 10;
    public static final int METHOD_GET_CITY_INFO = 13;
    public static final int METHOD_GET_FINGERPRINT = 15;
    public static final int METHOD_GET_LOCATION = 11;
    public static final int METHOD_GET_USER_INFO = 14;
    public static final int METHOD_LOGIN = 8;
    public static final int METHOD_LOGOUT = 16;
    public static final int METHOD_PAY = 17;
    public static final int METHOD_PLAY_VOICE = 18;
    public static final int METHOD_PREVIEW_IMAGE = 19;
    public static final int METHOD_SHARE = 20;
    public static final int METHOD_SHARE_IMAGE = 21;
    public static final int METHOD_STOP_LOCATING = 12;
    public static final int METHOD_UPLOAD_PHOTO = 22;
    public static final int PERFORMER_ID_CHOOSE_MEDIA = 1;
    public static final int PERFORMER_ID_EDIT_MEDIA = 4;
    public static final int PERFORMER_ID_GET_MEDIA_FRAME = 23;
    public static final int PERFORMER_ID_PLAY_MEDIA = 3;
    public static final int PERFORMER_ID_SHARE_MINI_PROGRAM = 6;
    public static final int PERFORMER_ID_UPLOAD_MEDIA = 2;

    void bind(a aVar, IJSHandlerDelegate<Object> iJSHandlerDelegate);

    void getCityInfo(IJSHandlerDelegate<c> iJSHandlerDelegate);

    void getFingerprint(com.dianping.titansmodel.apimodel.c cVar, IJSHandlerDelegate<d> iJSHandlerDelegate);

    void getLocation(JSONObject jSONObject, IJSHandlerDelegate<JsBridgeResult> iJSHandlerDelegate);

    void getUserInfo(IJSHandlerDelegate<j> iJSHandlerDelegate);

    boolean isCommonSupported(int i);

    boolean isPerformerApiSupported(int i);

    void login(IJSHandlerDelegate<g> iJSHandlerDelegate);

    void logout(IJSHandlerDelegate<g> iJSHandlerDelegate);

    void onActivityResult(String str, int i, int i2, Intent intent, IJSHandlerDelegate<? extends g> iJSHandlerDelegate);

    void onPerform(int i, JSONObject jSONObject, IJSHandlerDelegate<JsBridgeResult> iJSHandlerDelegate);

    void pay(e eVar, IJSHandlerDelegate<Object> iJSHandlerDelegate);

    void share(f fVar, IJSHandlerDelegate<h> iJSHandlerDelegate);

    void shareImage(JSONObject jSONObject, IJSHandlerDelegate<h> iJSHandlerDelegate);

    void stopLocating();

    void uploadPhoto(com.dianping.titansmodel.apimodel.g gVar, IJSHandlerDelegate<i> iJSHandlerDelegate);
}
