package com.tencent.connect.share;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.open.TDialog;
import com.tencent.open.b.e;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.i;
import com.tencent.open.utils.k;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class QzoneShare extends BaseApi {
    public static final String SHARE_TO_QQ_APP_NAME = "appName";
    public static final String SHARE_TO_QQ_AUDIO_URL = "audio_url";
    public static final String SHARE_TO_QQ_EXT_INT = "cflag";
    public static final String SHARE_TO_QQ_EXT_STR = "share_qq_ext_str";
    public static final String SHARE_TO_QQ_IMAGE_LOCAL_URL = "imageLocalUrl";
    public static final String SHARE_TO_QQ_IMAGE_URL = "imageUrl";
    public static final String SHARE_TO_QQ_SITE = "site";
    public static final String SHARE_TO_QQ_SUMMARY = "summary";
    public static final String SHARE_TO_QQ_TARGET_URL = "targetUrl";
    public static final String SHARE_TO_QQ_TITLE = "title";
    public static final String SHARE_TO_QZONE_EXTMAP = "extMap";
    public static final String SHARE_TO_QZONE_KEY_TYPE = "req_type";
    public static final int SHARE_TO_QZONE_TYPE_IMAGE = 5;
    public static final int SHARE_TO_QZONE_TYPE_IMAGE_TEXT = 1;
    public static final int SHARE_TO_QZONE_TYPE_MINI_PROGRAM = 7;
    public static final int SHARE_TO_QZONE_TYPE_NO_TYPE = 0;
    private boolean a;
    private boolean d;
    private boolean e;
    private boolean f;
    public String mViaShareQzoneType;

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
    }

    public QzoneShare(Context context, QQToken qQToken) {
        super(qQToken);
        this.mViaShareQzoneType = "";
        this.a = true;
        this.d = false;
        this.e = false;
        this.f = false;
    }

    public void shareToQzone(Activity activity, Bundle bundle, IUiListener iUiListener) {
        String str;
        SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() -- start");
        if (bundle == null) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_NULL_ERROR, null));
            SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() params is null");
            e.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), "4", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_NULL_ERROR);
            return;
        }
        String string = bundle.getString("title");
        String string2 = bundle.getString("summary");
        String string3 = bundle.getString("targetUrl");
        String string4 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_APPID);
        String string5 = bundle.getString(QQShare.SHARE_TO_QQ_MINI_PROGRAM_PATH);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageUrl");
        String a = k.a(activity);
        if (a == null) {
            a = bundle.getString("appName");
        } else if (a.length() > 20) {
            a = a.substring(0, 20) + "...";
        }
        int i = bundle.getInt("req_type");
        SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() get SHARE_TO_QZONE_KEY_TYPE: " + i);
        if (i == 1) {
            this.mViaShareQzoneType = "1";
        } else if (i == 5) {
            this.mViaShareQzoneType = "2";
        } else {
            this.mViaShareQzoneType = "1";
        }
        if (i == 1) {
            SLog.e("openSDK_LOG.QzoneShare", "-->shareToQzone, SHARE_TO_QZONE_TYPE_IMAGE_TEXT needTitle = true");
            this.a = true;
            this.d = false;
            this.e = true;
            this.f = false;
        } else if (i == 5) {
            iUiListener.onError(new UiError(-5, Constants.MSG_SHARE_TYPE_ERROR, null));
            SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() error--end请选择支持的分享类型");
            e.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), "4", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() 请选择支持的分享类型");
            return;
        } else if (i == 7) {
            if (TextUtils.isEmpty(string4) || TextUtils.isEmpty(string5)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_ERROR, "appid or path empty."));
            }
            this.e = false;
            this.f = false;
            this.a = false;
        } else {
            if (k.e(string) && k.e(string2)) {
                if (stringArrayList != null && stringArrayList.size() != 0) {
                    this.a = false;
                    this.d = false;
                    SLog.e("openSDK_LOG.QzoneShare", "-->shareToQzone, default needTitle = true, shareType = " + i);
                    this.e = true;
                    this.f = false;
                } else {
                    string = "来自" + a + "的分享";
                }
            }
            this.a = true;
            this.d = false;
            SLog.e("openSDK_LOG.QzoneShare", "-->shareToQzone, default needTitle = true, shareType = " + i);
            this.e = true;
            this.f = false;
        }
        if (!k.a() && k.g(activity, "4.5.0")) {
            iUiListener.onError(new UiError(-6, Constants.MSG_SHARE_NOSD_ERROR, null));
            SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() sdcard is null--end");
            e.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), "4", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_SHARE_NOSD_ERROR);
            return;
        }
        if (this.a) {
            if (TextUtils.isEmpty(string3)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_NULL_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl null error--end");
                e.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), "4", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_NULL_ERROR);
                return;
            } else if (!k.h(string3)) {
                iUiListener.onError(new UiError(-5, Constants.MSG_PARAM_TARGETURL_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl error--end");
                e.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), "4", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, Constants.MSG_PARAM_TARGETURL_ERROR);
                return;
            }
        }
        if (this.d) {
            bundle.putString("title", "");
            bundle.putString("summary", "");
        } else if (this.e && k.e(string)) {
            iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_TITLE_NULL_ERROR, null));
            SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() title is null--end");
            e.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), "4", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() title is null");
            return;
        } else {
            if (k.e(string) || string.length() <= 200) {
                str = null;
            } else {
                str = null;
                bundle.putString("title", k.a(string, 200, (String) null, (String) null));
            }
            if (!k.e(string2) && string2.length() > 600) {
                bundle.putString("summary", k.a(string2, 600, str, str));
            }
        }
        if (!TextUtils.isEmpty(a)) {
            bundle.putString("appName", a);
        }
        if (stringArrayList == null || (stringArrayList != null && stringArrayList.size() == 0)) {
            if (this.f) {
                iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() imageUrl is null -- end");
                e.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), "4", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() imageUrl is null");
                return;
            }
        } else {
            int i2 = 0;
            while (i2 < stringArrayList.size()) {
                String str2 = stringArrayList.get(i2);
                if (!k.h(str2) && !k.i(str2)) {
                    stringArrayList.remove(i2);
                    i2--;
                }
                i2++;
            }
            if (stringArrayList.size() == 0) {
                iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone() MSG_PARAM_IMAGE_URL_FORMAT_ERROR--end");
                e.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), "4", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() 非法的图片地址!");
                return;
            }
            bundle.putStringArrayList("imageUrl", stringArrayList);
        }
        if (!k.g(activity, "4.6.0")) {
            SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() qqver greater than 4.6.0");
            b(activity, bundle, iUiListener);
        } else if (i.c(activity, "4.2.0") >= 0 && i.c(activity, "4.6.0") < 0) {
            SLog.w("openSDK_LOG.QzoneShare", "shareToQzone() qqver between 4.2.0 and 4.6.0, will use qqshare");
            QQShare qQShare = new QQShare(activity, this.c);
            if (stringArrayList != null && stringArrayList.size() > 0) {
                String str3 = stringArrayList.get(0);
                if (i == 5 && !k.i(str3)) {
                    iUiListener.onError(new UiError(-6, Constants.MSG_PARAM_IMAGE_URL_MUST_BE_LOCAL, null));
                    SLog.e("openSDK_LOG.QzoneShare", "shareToQzone()手Q版本过低，纯图分享不支持网路图片");
                    e.a().a(1, "SHARE_CHECK_SDK", "1000", this.c.getAppId(), "4", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone()手Q版本过低，纯图分享不支持网路图片");
                    return;
                }
                bundle.putString("imageLocalUrl", str3);
            }
            if (!k.g(activity, "4.5.0")) {
                bundle.putInt("cflag", 1);
            }
            qQShare.shareToQQ(activity, bundle, iUiListener);
        } else {
            SLog.w("openSDK_LOG.QzoneShare", "shareToQzone() qqver below 4.2.0, will show download dialog");
            new TDialog(activity, "", a(""), null, this.c).show();
        }
        SLog.i("openSDK_LOG.QzoneShare", "shareToQzone() --end");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(android.app.Activity r26, android.os.Bundle r27, com.tencent.tauth.IUiListener r28) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.connect.share.QzoneShare.b(android.app.Activity, android.os.Bundle, com.tencent.tauth.IUiListener):void");
    }
}
