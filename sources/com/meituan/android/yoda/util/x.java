package com.meituan.android.yoda.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.google.gson.GsonBuilder;
import com.meituan.android.common.aidata.error.ErrorCode;
import com.meituan.android.common.mtguard.MTGConfigs;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class x {
    public static ChangeQuickRedirect a;
    private static volatile Context b;
    private static final Pattern c = Pattern.compile("\\d+");

    public static String i() {
        return "1.18.0.177";
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61dc694be2eb4436303337ddd8652a08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61dc694be2eb4436303337ddd8652a08");
        } else {
            b = context.getApplicationContext();
        }
    }

    @UiThread
    public static void a(@NonNull Activity activity, @StringRes int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "273f6687703df191dc21f6c286458144", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "273f6687703df191dc21f6c286458144");
        } else if (y.a(activity)) {
        } else {
            View findViewById = activity.findViewById(16908290);
            Object[] objArr2 = {findViewById, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3411ffca086a44be0c027202d645ad17", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3411ffca086a44be0c027202d645ad17");
            } else {
                a(findViewById, a(i));
            }
        }
    }

    @UiThread
    public static void a(@NonNull Activity activity, @NonNull String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5141293190434e23402182a36ccf3437", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5141293190434e23402182a36ccf3437");
        } else if (y.a(activity)) {
        } else {
            a(activity.findViewById(16908290), str);
        }
    }

    @UiThread
    private static void a(@NonNull View view, @NonNull String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "967c53b108af344f388242a82caa77df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "967c53b108af344f388242a82caa77df");
        } else if (TextUtils.isEmpty(str) || view == null || view.getContext() == null) {
        } else {
            if ((view.getContext() instanceof Activity) && y.a((Activity) view.getContext())) {
                return;
            }
            try {
                new com.sankuai.meituan.android.ui.widget.a(view, str, 1500).b(Color.parseColor("#333333")).c(-1).a(12.0f).a();
            } catch (Throwable unused) {
            }
        }
    }

    public static Error a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b85aa9024509590acc0991b4ce42ccf5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Error) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b85aa9024509590acc0991b4ce42ccf5");
        }
        Error error = new Error();
        error.code = ErrorCode.JSExecute.AI_BUNDLE_IS_NULL_OPERATOR;
        error.message = a((int) R.string.yoda_data_parse_error);
        return error;
    }

    public static Error a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "296aa8837615ee11457fe1dd44a9078b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Error) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "296aa8837615ee11457fe1dd44a9078b");
        }
        Error error = new Error();
        error.code = ErrorCode.JSExecute.AI_BUNDLE_IS_NULL_OPERATOR;
        error.message = a((int) R.string.yoda_network_error);
        return error;
    }

    public static Error b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "947d3610a68e02b9f9169d2e4a6b1692", RobustBitConfig.DEFAULT_VALUE)) {
            return (Error) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "947d3610a68e02b9f9169d2e4a6b1692");
        }
        Error error = new Error();
        error.code = ErrorCode.JSExecute.AI_BUNDLE_IS_NULL_OPERATOR;
        error.message = a((int) R.string.yoda_context_error);
        return error;
    }

    public static Error c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1be0c60e564c8e89c50e8109c5b586c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Error) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1be0c60e564c8e89c50e8109c5b586c");
        }
        Error error = new Error();
        error.code = ErrorCode.JSExecute.AI_BUNDLE_IS_NULL_OPERATOR;
        error.message = a((int) R.string.yoda_get_bitmap_failed);
        return error;
    }

    public static Error d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e19a361952c63ffc542bad7cf0aa8b97", RobustBitConfig.DEFAULT_VALUE)) {
            return (Error) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e19a361952c63ffc542bad7cf0aa8b97");
        }
        Error error = new Error();
        error.code = ErrorCode.JSExecute.AI_BUNDLE_IS_NULL_OPERATOR;
        error.message = a((int) R.string.yoda_h5_bridge_error);
        return error;
    }

    public static Error e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e48bdbbf81b8317c295134fad6721df9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Error) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e48bdbbf81b8317c295134fad6721df9");
        }
        Error error = new Error();
        error.code = ErrorCode.JSExecute.AI_BUNDLE_IS_NULL_OPERATOR;
        error.message = a((int) R.string.yoda_face_detection_result_param_error);
        return error;
    }

    public static Error f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb10156faf11c0ceb8c1e5dc1c9fe1c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Error) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb10156faf11c0ceb8c1e5dc1c9fe1c6");
        }
        Error error = new Error();
        error.code = 130005;
        error.message = a((int) R.string.yoda_business_time_out_error);
        return error;
    }

    public static Error g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a4604bafb0f8e9767bd92fbd51f3168", RobustBitConfig.DEFAULT_VALUE)) {
            return (Error) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a4604bafb0f8e9767bd92fbd51f3168");
        }
        Error error = new Error();
        error.code = 130006;
        error.message = a((int) R.string.yoda_face_image_upload_error);
        return error;
    }

    public static Error h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9f4f3bc7c87c3ffb0698b512af043e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Error) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9f4f3bc7c87c3ffb0698b512af043e5");
        }
        Error error = new Error();
        error.code = 130007;
        error.message = a((int) R.string.yoda_verify_token_time_out_error);
        return error;
    }

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fe68fe56f45ea25f3242061f4828adb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fe68fe56f45ea25f3242061f4828adb")).intValue();
        }
        if (str == null) {
            return -1;
        }
        return (int) e(str.trim());
    }

    public static int a(String str, int i) {
        Object[] objArr = {str, -2147483647};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e54a852ca2f75fa6a5544644f0bb281", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e54a852ca2f75fa6a5544644f0bb281")).intValue();
        }
        if (str == null) {
            return -2147483647;
        }
        return (int) a(str.trim(), -2.147483647E9d);
    }

    private static double e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0dd5510e07c77844416d82794fc897ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0dd5510e07c77844416d82794fc897ab")).doubleValue();
        }
        try {
            return Double.parseDouble(str);
        } catch (Throwable unused) {
            return -2.147483647E9d;
        }
    }

    private static double a(String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "908c949bb2b5bb717c5805e2727daff1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "908c949bb2b5bb717c5805e2727daff1")).doubleValue();
        }
        try {
            return Double.parseDouble(str);
        } catch (Throwable unused) {
            return d;
        }
    }

    public static float a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ded63d0ef87744d5a56eee94875d69be", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ded63d0ef87744d5a56eee94875d69be")).floatValue();
        }
        if (b == null) {
            return 0.0f;
        }
        return TypedValue.applyDimension(1, f, b.getResources().getDisplayMetrics());
    }

    public static int b(float f) {
        Object[] objArr = {Float.valueOf(64.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "414686e728881c272d1b1076116e74ba", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "414686e728881c272d1b1076116e74ba")).intValue() : (int) Math.ceil(a(64.0f));
    }

    public static String a(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b202d4738099765b8bb5ce84f3180e24", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b202d4738099765b8bb5ce84f3180e24") : new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create().toJson(list);
    }

    public static String a(@StringRes int i) {
        String str;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a871513ba5552737584734425b2d5ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a871513ba5552737584734425b2d5ee");
        }
        try {
            str = b.getResources().getString(i);
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str;
    }

    public static int b(@ColorRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bfff08624e64ceff56618fff345865e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bfff08624e64ceff56618fff345865e6")).intValue();
        }
        try {
            return ContextCompat.getColor(b, i);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static Drawable c(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e84561535b8b34f292425022dd8f04c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e84561535b8b34f292425022dd8f04c3");
        }
        try {
            return ContextCompat.getDrawable(b, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String b(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b5dd29ce5b2812968484e9a3f014d16", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b5dd29ce5b2812968484e9a3f014d16");
        }
        if (str == null) {
            return "";
        }
        try {
            str2 = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            str2 = "";
        }
        return str2 == null ? "" : str2;
    }

    public static String c(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "193d4257500de56e49a7a0d16a44f83c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "193d4257500de56e49a7a0d16a44f83c");
        }
        if (str == null) {
            return "";
        }
        try {
            str2 = URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            str2 = "";
        }
        return str2 == null ? "" : str2;
    }

    public static List<String> a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c40ae9df869efecaa9505108c85bb470", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c40ae9df869efecaa9505108c85bb470");
        }
        ArrayList arrayList = new ArrayList();
        if (y.a(activity)) {
            return arrayList;
        }
        try {
            for (ActivityManager.RunningTaskInfo runningTaskInfo : Privacy.createActivityManager(activity.getApplication(), "jcyf-379eb4d25a873259").a(Integer.MAX_VALUE)) {
                if (runningTaskInfo != null) {
                    arrayList.add(runningTaskInfo.baseActivity.getClassName());
                }
            }
        } catch (Throwable unused) {
        }
        String name = activity.getClass().getName();
        if (arrayList.size() == 0 || !name.equals(arrayList.get(0))) {
            arrayList.add(0, name);
        }
        return arrayList;
    }

    public static String a(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "860db7719971d1f95e2cfa932f5cb48b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "860db7719971d1f95e2cfa932f5cb48b");
        }
        if (iArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            sb.append(String.valueOf(i));
            sb.append(", ");
        }
        return sb.toString();
    }

    public static String a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a96672937304387700827e61925ca243", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a96672937304387700827e61925ca243");
        }
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(String.valueOf((int) b2));
            sb.append(", ");
        }
        return sb.toString();
    }

    public static String a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f55b98fa126258c00fb18e8649bb6d5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f55b98fa126258c00fb18e8649bb6d5a");
        }
        com.meituan.android.yoda.monitor.log.a.a("Utils", "handleGetSignature, data = " + jSONObject.toString(), true);
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                return "";
            }
            String optString = optJSONObject.optString("method");
            String optString2 = optJSONObject.optString("url");
            String optString3 = optJSONObject.optString("body", "");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER);
            if (optJSONObject2 != null) {
                Map<String, String> requestSignatureForWebViewV4 = MTGuard.requestSignatureForWebViewV4(optString, optString2, optJSONObject2.optString("userAgent"), optJSONObject2.optString("contentEncoding"), optJSONObject2.optString("contentType"), optString3 != null ? optString3.getBytes() : null);
                return requestSignatureForWebViewV4 != null ? requestSignatureForWebViewV4.get(MTGConfigs.c) : "";
            }
            return "";
        } catch (Exception e) {
            com.meituan.android.yoda.monitor.log.a.a("Utils", "handleGetSignature Exception, data = " + e.getMessage(), true);
            return "";
        }
    }

    public static String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "442f27c4b7628e3125a4a04f9b7d7da2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "442f27c4b7628e3125a4a04f9b7d7da2");
        }
        try {
            return com.meituan.android.yoda.plugins.d.a().g.a();
        } catch (Exception e) {
            com.meituan.android.yoda.monitor.log.a.a("Utils", "handleGetFingerprint Exception, data = " + e.getMessage(), true);
            return "";
        }
    }

    public static String d(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bc26a9a1095fe88b562e4de3cea2d55", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bc26a9a1095fe88b562e4de3cea2d55");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(parse.getQuery())) {
            if (com.meituan.android.yoda.config.ui.d.a().r()) {
                sb.append("&yodaCommonThemeColor");
                sb.append("=");
                sb.append(c(com.meituan.android.yoda.config.ui.d.a().p()));
            }
            if (com.meituan.android.yoda.config.ui.d.a().s()) {
                sb.append("&yodaButtonTextColor");
                sb.append("=");
                sb.append(c(com.meituan.android.yoda.config.ui.d.a().q()));
            }
        } else {
            if (com.meituan.android.yoda.config.ui.d.a().r()) {
                sb.append("?yodaCommonThemeColor");
                sb.append("=");
                sb.append(c(com.meituan.android.yoda.config.ui.d.a().p()));
            } else {
                z = false;
            }
            if (com.meituan.android.yoda.config.ui.d.a().s()) {
                if (z) {
                    sb.append("&yodaButtonTextColor");
                    sb.append("=");
                    sb.append(c(com.meituan.android.yoda.config.ui.d.a().q()));
                } else {
                    sb.append("?yodaButtonTextColor");
                    sb.append("=");
                    sb.append(c(com.meituan.android.yoda.config.ui.d.a().q()));
                }
            }
        }
        return sb.toString();
    }

    public static int b(String str, int i) {
        int parseColor;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ffbd888680e607372e7012c4f157489", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ffbd888680e607372e7012c4f157489")).intValue();
        }
        if (!TextUtils.isEmpty(str) && str.startsWith("#") && str.length() == 7) {
            try {
                switch (i) {
                    case 2:
                        parseColor = Color.parseColor(str);
                        break;
                    case 3:
                        parseColor = Color.parseColor("#99" + str.toUpperCase().substring(1));
                        break;
                    default:
                        parseColor = Color.parseColor("#DF" + str.toUpperCase().substring(1));
                        break;
                }
                return parseColor;
            } catch (Exception unused) {
                return -1;
            }
        }
        return -1;
    }

    public static boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21b760bb100bc34041a10d07a2ad48d2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21b760bb100bc34041a10d07a2ad48d2")).booleanValue() : Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
