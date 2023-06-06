package com.meituan.passport.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.AttrRes;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.RestrictTo;
import android.support.annotation.StringRes;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class Utils {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface DialogType {
        public static final int CONFIRM = 2;
        public static final int NORMAL = 1;
    }

    @ColorInt
    private static int c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2ac0b90f48a72f76ba5e8a11c167635", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2ac0b90f48a72f76ba5e8a11c167635")).intValue() : d(context, R.attr.passportPrivacyTextColor);
    }

    @ColorInt
    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a290e9a15e9a3400994bcd5c7acdd13d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a290e9a15e9a3400994bcd5c7acdd13d")).intValue() : d(context, R.attr.passportToolbarColor);
    }

    @ColorInt
    public static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50dcc0d86e64676fa65fa89f913705d7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50dcc0d86e64676fa65fa89f913705d7")).intValue() : d(context, R.attr.passportCommonTextColor);
    }

    @ColorInt
    public static int a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8866b29418cf2c97f8f3fc24d5142d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8866b29418cf2c97f8f3fc24d5142d8")).intValue();
        }
        if (context == null || context.getResources() == null) {
            return -14540254;
        }
        if (ab.a() == 1) {
            switch (i) {
                case 1:
                    return a(context, (int) R.attr.passportElderDialogRecommendedTextColor, context.getResources().getColor(R.color.passport_meituan_button_text_color));
                case 2:
                    return context.getResources().getColor(R.color.passport_meituan_elder_confirm_dialog_recommended_text_color);
                default:
                    return a(context, (int) R.attr.passportElderDialogRecommendedTextColor, context.getResources().getColor(R.color.passport_meituan_button_text_color));
            }
        }
        switch (i) {
            case 1:
                return a(context, (int) R.attr.passportDialogRecommendedTextColor, context.getResources().getColor(R.color.passport_meituan_button_text_color));
            case 2:
                return context.getResources().getColor(R.color.passport_meituan_confirm_dialog_recommended_text_color);
            default:
                return a(context, (int) R.attr.passportDialogRecommendedTextColor, context.getResources().getColor(R.color.passport_meituan_button_text_color));
        }
    }

    @ColorInt
    public static int b(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a91ac0239cafb0c85efcbfcdb28d38c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a91ac0239cafb0c85efcbfcdb28d38c")).intValue();
        }
        if (context == null || context.getResources() == null) {
            return -14540254;
        }
        if (ab.a() == 1) {
            switch (i) {
                case 1:
                    return a(context, (int) R.attr.passportElderDialogNotRecommendedTextColor, context.getResources().getColor(R.color.passport_meituan_button_text_color));
                case 2:
                    return context.getResources().getColor(R.color.passport_meituan_elder_confirm_dialog_not_recommended_text_color);
                default:
                    return a(context, (int) R.attr.passportElderDialogNotRecommendedTextColor, context.getResources().getColor(R.color.passport_meituan_button_text_color));
            }
        }
        switch (i) {
            case 1:
                return a(context, (int) R.attr.passportDialogNotRecommendedTextColor, context.getResources().getColor(R.color.passport_meituan_button_text_color));
            case 2:
                return context.getResources().getColor(R.color.passport_meituan_confirm_dialog_not_recommended_text_color);
            default:
                return a(context, (int) R.attr.passportDialogNotRecommendedTextColor, context.getResources().getColor(R.color.passport_meituan_button_text_color));
        }
    }

    public static void a(EditText editText, String str, int i) {
        Object[] objArr = {editText, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b60340d3282a003ebf968fbc28aa4a5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b60340d3282a003ebf968fbc28aa4a5b");
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan(i, true), 0, spannableString.length(), 33);
        editText.setHint(new SpannedString(spannableString));
    }

    @ColorInt
    public static int c(Context context, @ColorRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7def83cc3d3a6c854a93118281e4e7af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7def83cc3d3a6c854a93118281e4e7af")).intValue();
        }
        if (context == null) {
            return 0;
        }
        try {
            return ContextCompat.getColor(context, i);
        } catch (Exception unused) {
            return 0;
        }
    }

    @ColorInt
    public static int d(Context context, @AttrRes int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26db669c515e925b0cba6873dd1df757", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26db669c515e925b0cba6873dd1df757")).intValue() : a(context, i, context.getResources().getColor(R.color.passport_meituan_color));
    }

    @ColorInt
    private static int a(Context context, int i, @ColorInt int i2) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4321dfe21d1b34a92a9de763dd19bcb4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4321dfe21d1b34a92a9de763dd19bcb4")).intValue();
        }
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
            int color = obtainStyledAttributes.getColor(0, i2);
            try {
                obtainStyledAttributes.recycle();
                return color;
            } catch (Exception unused) {
                return color;
            }
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        Object[] objArr = {bitmap, Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efb66aa4bae1c6d0e7db5175b5d0e30c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efb66aa4bae1c6d0e7db5175b5d0e30c");
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        if (createBitmap == null) {
            return null;
        }
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth() - 0, bitmap.getHeight() - 0);
        float f = i;
        canvas.drawRoundRect(rectF, f, f, paint);
        return createBitmap;
    }

    public static void a(Context context, EditText editText) {
        Object[] objArr = {context, editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b1565244210bcfec732fd7104135073", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b1565244210bcfec732fd7104135073");
        } else if (editText == null || context == null) {
        } else {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            try {
                if (inputMethodManager.showSoftInput(editText, 2)) {
                    return;
                }
                new Handler().post(ak.a(inputMethodManager, editText));
            } catch (Exception unused) {
            }
        }
    }

    public static void b(Context context, EditText editText) {
        Object[] objArr = {context, editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f4c1e9702a240e07d7d47f4415481ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f4c1e9702a240e07d7d47f4415481ee");
        } else if (context == null) {
        } else {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (editText == null || inputMethodManager == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 1);
        }
    }

    public static void a(Fragment fragment) {
        InputMethodManager inputMethodManager;
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d800818efcc6afeaa3362ae7ffc0d209", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d800818efcc6afeaa3362ae7ffc0d209");
        } else if (fragment == null || fragment.getContext() == null || (inputMethodManager = (InputMethodManager) fragment.getContext().getSystemService("input_method")) == null || fragment.getView() == null) {
        } else {
            inputMethodManager.hideSoftInputFromWindow(fragment.getView().getWindowToken(), 0);
        }
    }

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad038905d78d5ffc445f26360713ae8e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad038905d78d5ffc445f26360713ae8e")).intValue();
        }
        if (context == null || context.getResources() == null) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static CharSequence a(Context context, @StringRes int i, Object... objArr) {
        Object[] objArr2 = {context, Integer.valueOf(i), objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "88fe7add856f14e9519bf0493b2da682", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "88fe7add856f14e9519bf0493b2da682");
        }
        if (context == null) {
            context = com.meituan.android.singleton.b.a();
        }
        if (context == null) {
            return null;
        }
        String replace = context.getString(i, objArr).replace("#big", "</big>").replace("big#", "<big>").replace("font#", "<font ").replace("#font", "</font>").replace("#end", ">").replace("bold#", "<b>").replace("#bold", "</b>");
        if (Build.VERSION.SDK_INT < 24) {
            return Html.fromHtml(replace);
        }
        return Html.fromHtml(replace, 0);
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14493fc9a47fd03f3211853f5f4a273d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14493fc9a47fd03f3211853f5f4a273d")).booleanValue() : a(com.meituan.android.singleton.b.a(), "com.tencent.mobileqq") || a(com.meituan.android.singleton.b.a(), Constants.PACKAGE_QQ_SPEED);
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "925e58335cb5e62902e079d08168e3f4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "925e58335cb5e62902e079d08168e3f4")).booleanValue() : a(com.meituan.android.singleton.b.a(), "com.tencent.mm");
    }

    public static boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "259b10262c1c920364384c88f3d81e2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "259b10262c1c920364384c88f3d81e2e")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || context == null) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(Class cls, Throwable th) {
        String name;
        String message;
        Object[] objArr = {cls, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b70caeb817ca620ffef677838abcfb31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b70caeb817ca620ffef677838abcfb31");
        } else if (th == null) {
        } else {
            if (th.getCause() != null) {
                name = th.getCause().getClass().getName();
                message = th.getCause().getMessage();
            } else {
                name = th.getClass().getName();
                message = th.getMessage();
            }
            n.a(cls != null ? cls.getSimpleName() : "exceptionClass is null", "className: " + name, "errorMessage: " + message);
        }
    }

    public static boolean c() {
        AccessibilityManager accessibilityManager;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11fb0ccd1d2aaf333e18ea2063ec545d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11fb0ccd1d2aaf333e18ea2063ec545d")).booleanValue();
        }
        Context a2 = com.meituan.android.singleton.b.a();
        return (a2 == null || (accessibilityManager = (AccessibilityManager) a2.getSystemService("accessibility")) == null || accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty() || !accessibilityManager.isTouchExplorationEnabled()) ? false : true;
    }

    public static SpannableString a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5470fa8b9975cbb7254d8127b3c61bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableString) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5470fa8b9975cbb7254d8127b3c61bf");
        }
        if (context == null) {
            return null;
        }
        SpannableString a2 = a(context, str, a(context, str, new SpannableString(str), R.string.passport_accessibility_meituan_user_agreement, R.string.passport_accessibility_meituan_user_agreement_url), R.string.passport_accessibility_privacy_policy, R.string.passport_accessibility_privacy_policy_url);
        if (TextUtils.equals(str2, "0")) {
            return a(context, str, a2, R.string.passport_accessibility_china_telecom_tianyi_account_service_terms, R.string.passport_accessibility_china_telecom_tianyi_account_service_terms_url);
        }
        if (TextUtils.equals(str2, "1")) {
            return a(context, str, a2, R.string.passport_accessibility_china_mobile_certification_service_terms, R.string.passport_accessibility_china_mobile_certification_service_terms_url);
        }
        return TextUtils.equals(str2, "2") ? a(context, str, a2, R.string.passport_accessibility_china_unicom_unified_certification_service_terms, R.string.passport_accessibility_china_unicom_unified_certification_service_terms_url) : a2;
    }

    private static SpannableString a(final Context context, String str, SpannableString spannableString, int i, final int i2) {
        Object[] objArr = {context, str, spannableString, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07be1adfb96f557eee15586e326bc686", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableString) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07be1adfb96f557eee15586e326bc686");
        }
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(spannableString)) {
            return null;
        }
        String string = context.getString(i);
        int max = Math.max(str.indexOf(string), 0);
        int length = string.length() + max;
        spannableString.setSpan(new ClickableSpan() { // from class: com.meituan.passport.utils.Utils.2
            public static ChangeQuickRedirect a;

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4092aa1f1a3c3c9adf82efd48e5a2f3b", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4092aa1f1a3c3c9adf82efd48e5a2f3b");
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(context.getString(i2)));
                intent.setPackage(context.getPackageName());
                intent.putExtra("com.android.browser.application_id", context.getPackageName());
                try {
                    context.startActivity(intent);
                } catch (Exception e) {
                    m.a(e);
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                Object[] objArr2 = {textPaint};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbfec4963e2ee92b22f008f99a666dcd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbfec4963e2ee92b22f008f99a666dcd");
                    return;
                }
                textPaint.setColor(textPaint.linkColor);
                textPaint.setUnderlineText(false);
            }
        }, max, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(c(context)), max, length, 33);
        return spannableString;
    }

    public static String e(Context context, @StringRes int i) {
        Resources resources;
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16e83b2f4737bff86adab84ddcd62bc8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16e83b2f4737bff86adab84ddcd62bc8");
        }
        if (context instanceof Activity) {
            return context.getString(i);
        }
        Context a2 = com.meituan.android.singleton.b.a();
        return (a2 == null || (resources = a2.getResources()) == null) ? "" : resources.getString(i);
    }

    public static void a(Context context, String str, Map<String, String> map) {
        Object[] objArr = {context, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        Uri uri = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "039e3c361ab64f7dd204ac924f1f776e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "039e3c361ab64f7dd204ac924f1f776e");
        } else if (context != null && !TextUtils.isEmpty(str)) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            String uri2 = buildUpon.build().toString();
            if (uri2.startsWith("imeituan://")) {
                uri = Uri.parse(uri2);
            } else {
                try {
                    uri = Uri.parse(com.meituan.passport.plugins.q.a().i().a()).buildUpon().appendQueryParameter("url", Uri.decode(uri2)).build();
                } catch (Exception unused) {
                }
            }
            Intent intent = new Intent();
            intent.setData(uri);
            intent.setPackage(context.getPackageName());
            try {
                context.startActivity(intent);
            } catch (Exception unused2) {
            }
        }
    }
}
