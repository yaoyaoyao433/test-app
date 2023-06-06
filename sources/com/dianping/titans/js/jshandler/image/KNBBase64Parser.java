package com.dianping.titans.js.jshandler.image;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.titans.utils.LocalIdUtils;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBRuntime;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.meituan.android.knb.util.AndroidAdapter;
import com.sankuai.meituan.takeoutnew.util.aop.b;
import com.sankuai.waimai.launcher.util.image.a;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class KNBBase64Parser {
    public static final String BASE64_REG = "^data:(image/png|image/jpeg|image/webp);base64,.+$";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface KNBBase64ParserCallback {
        void onError(KNBJsErrorInfo kNBJsErrorInfo);

        void onSuccess(String str);
    }

    public static void parse(final Context context, final String str, final String str2, final KNBBase64ParserCallback kNBBase64ParserCallback) {
        Object[] objArr = {context, str, str2, kNBBase64ParserCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ab46ac3b8d8605405f21664dbe920eb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ab46ac3b8d8605405f21664dbe920eb1");
        } else if (KNBRuntime.getRuntime().executeOnThreadPool(new Runnable() { // from class: com.dianping.titans.js.jshandler.image.KNBBase64Parser.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "44f94774981bdbd0ad0433617448c56f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "44f94774981bdbd0ad0433617448c56f");
                } else if (!Pattern.compile(KNBBase64Parser.BASE64_REG).matcher(str).matches()) {
                    KNBBase64Parser.failCallback(new KNBJsErrorInfo(521, "not a base64 URL"), kNBBase64ParserCallback);
                } else {
                    int indexOf = str.indexOf("base64,") + 7;
                    int i = indexOf - 8;
                    String substring = str.substring(indexOf);
                    String substring2 = str.substring(str.indexOf("image/") + 6, i);
                    if (TextUtils.equals(substring2, CommonConstant.File.JPEG)) {
                        substring2 = CommonConstant.File.JPG;
                    }
                    try {
                        byte[] decode = Base64.decode(substring, 0);
                        if (decode == null) {
                            KNBBase64Parser.failCallback(new KNBJsErrorInfo(8, "base64 is null"), kNBBase64ParserCallback);
                            return;
                        }
                        try {
                            KNBBase64Parser.onTitansBitmapParseSuccess(context, a.a(decode, 0, decode.length), substring2, str2, kNBBase64ParserCallback);
                        } catch (Exception unused) {
                            KNBBase64Parser.failCallback(new KNBJsErrorInfo(8, "bitmap decode fail"), kNBBase64ParserCallback);
                        }
                    } catch (Exception unused2) {
                        KNBBase64Parser.failCallback(new KNBJsErrorInfo(8, "base64 decode fail"), kNBBase64ParserCallback);
                    }
                }
            }
        })) {
        } else {
            failCallback(new KNBJsErrorInfo(8, "ThreadPool execute fail!"), kNBBase64ParserCallback);
        }
    }

    private static void successCallback(final String str, final KNBBase64ParserCallback kNBBase64ParserCallback) {
        Object[] objArr = {str, kNBBase64ParserCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "da4aae954e70669ba8ed80f345c34468", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "da4aae954e70669ba8ed80f345c34468");
        } else {
            KNBRuntime.getRuntime().executeOnUIThread(new Runnable() { // from class: com.dianping.titans.js.jshandler.image.KNBBase64Parser.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5361df16378cf5b97ad67b23f1d031ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5361df16378cf5b97ad67b23f1d031ba");
                    } else {
                        KNBBase64ParserCallback.this.onSuccess(str);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void failCallback(final KNBJsErrorInfo kNBJsErrorInfo, final KNBBase64ParserCallback kNBBase64ParserCallback) {
        Object[] objArr = {kNBJsErrorInfo, kNBBase64ParserCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d15ae475d69c24320ef6862567c2f4ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d15ae475d69c24320ef6862567c2f4ec");
        } else {
            KNBRuntime.getRuntime().executeOnUIThread(new Runnable() { // from class: com.dianping.titans.js.jshandler.image.KNBBase64Parser.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "acf028b6cf7965902654f9ec0b18d060", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "acf028b6cf7965902654f9ec0b18d060");
                    } else {
                        KNBBase64ParserCallback.this.onError(kNBJsErrorInfo);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onTitansBitmapParseSuccess(Context context, Bitmap bitmap, String str, String str2, KNBBase64ParserCallback kNBBase64ParserCallback) {
        Object[] objArr = {context, bitmap, str, str2, kNBBase64ParserCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Uri uri = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f582f71773536b1a510b3b8954cbf16b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f582f71773536b1a510b3b8954cbf16b");
        } else if (bitmap == null) {
            failCallback(new KNBJsErrorInfo(8, "bitmap is null"), kNBBase64ParserCallback);
        } else {
            String str3 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) + CommonConstant.Symbol.DOT + str;
            try {
                if (TextUtils.equals(str, "png")) {
                    uri = AndroidAdapter.saveBitmapToPublicDirectory(context, AbsApiFactory.PASSPORT_ONLINE_URL, str3, 100, Bitmap.CompressFormat.PNG, "image/png", bitmap, str2);
                } else if (TextUtils.equals(str, CommonConstant.File.JPG)) {
                    uri = AndroidAdapter.saveBitmapToPublicDirectory(context, AbsApiFactory.PASSPORT_ONLINE_URL, str3, 90, Bitmap.CompressFormat.JPEG, "image/jpeg", bitmap, str2);
                } else if (TextUtils.equals(str, "webp")) {
                    uri = AndroidAdapter.saveBitmapToPublicDirectory(context, AbsApiFactory.PASSPORT_ONLINE_URL, str3, 100, Bitmap.CompressFormat.WEBP, "image/jpeg", bitmap, str2);
                } else {
                    failCallback(new KNBJsErrorInfo(521, "image type unsupport"), kNBBase64ParserCallback);
                }
                String build = new LocalIdUtils.Builder(uri).appendToken(str2).build();
                if (!TextUtils.isEmpty(build) && LocalIdUtils.isValid(build)) {
                    b.a(context, new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                    successCallback(build, kNBBase64ParserCallback);
                    return;
                }
                failCallback(new KNBJsErrorInfo(8, "localId is null or invalid"), kNBBase64ParserCallback);
            } catch (IOException unused) {
                failCallback(new KNBJsErrorInfo(8, "directory invalid"), kNBBase64ParserCallback);
            }
        }
    }
}
