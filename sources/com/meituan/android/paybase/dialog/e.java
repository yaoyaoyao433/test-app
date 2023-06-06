package com.meituan.android.paybase.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.constraint.R;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.meituan.android.paybase.activity.BaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ad;
import com.meituan.android.paybase.utils.aj;
import com.meituan.android.paybase.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static void a(Context context, Object obj, String str, a aVar, boolean z) {
        Object[] objArr = {context, obj, str, aVar, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fc22ae09ea963999f2452680107b9fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fc22ae09ea963999f2452680107b9fd");
        } else if (context == null || obj == null) {
        } else {
            if (context instanceof BaseActivity) {
                BaseActivity baseActivity = (BaseActivity) context;
                if (baseActivity.isFinishing() || baseActivity.m()) {
                    return;
                }
            }
            String valueOf = String.valueOf(obj);
            if (TextUtils.isEmpty(valueOf)) {
                return;
            }
            if (obj instanceof Integer) {
                valueOf = context.getString(Integer.parseInt(valueOf));
            }
            Toast toast = new Toast(context);
            View a2 = a(context, aVar);
            TextView textView = (TextView) a2.findViewById(R.id.toast_text);
            if (textView != null) {
                textView.setText(a(valueOf, str, context.getResources().getColor(R.color.paybase__black3)));
            }
            toast.setView(a2);
            toast.setDuration(0);
            toast.setGravity(17, 0, 0);
            toast.show();
            HashMap hashMap = new HashMap();
            hashMap.put("message", valueOf);
            hashMap.put("sub_message", str);
            com.meituan.android.paybase.common.analyse.a.a("b_O08CI", context.getClass().getSimpleName(), "POP", hashMap);
        }
    }

    public static void a(Dialog dialog, String str, String str2, a aVar, boolean z) {
        Object[] objArr = {dialog, str, str2, aVar, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3db96cc052717c6be7d141acd714e485", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3db96cc052717c6be7d141acd714e485");
        } else if (dialog == null || str == null) {
        } else {
            Window window = dialog.getWindow();
            if (window != null && window.getDecorView() != null) {
                w a2 = w.a(dialog, str, -1);
                if (a2 == null) {
                    return;
                }
                a2.b = str2;
                a2.c = aVar;
                a2.a();
            }
            com.meituan.android.paybase.common.analyse.a.a("b_O08CI", new a.c().a("message", str).a("sub_message", str2).a("dialog", dialog.getClass().getSimpleName()).b);
        }
    }

    private static void a(Activity activity, Object obj, String str, a aVar, boolean z) {
        ad b;
        Object[] objArr = {activity, obj, str, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2510c93b472f9cfe401a9f6be5c9205a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2510c93b472f9cfe401a9f6be5c9205a");
        } else if (activity == null || obj == null) {
        } else {
            if ((activity instanceof BaseActivity) && (activity.isFinishing() || ((BaseActivity) activity).m())) {
                return;
            }
            String valueOf = String.valueOf(obj);
            if (obj instanceof Integer) {
                valueOf = activity.getString(Integer.parseInt(valueOf));
            }
            if (TextUtils.isEmpty(valueOf)) {
                return;
            }
            ad.a aVar2 = new ad.a();
            aVar2.c = valueOf;
            aVar2.f = z;
            aVar2.d = str;
            aVar2.e = aVar;
            Object[] objArr2 = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = ad.a.a;
            if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "101b61ebc59a37f3d250ded8e8e8f7bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "101b61ebc59a37f3d250ded8e8e8f7bd");
            } else {
                b = ad.b(activity);
                ad.b(b, activity, aVar2);
            }
            com.meituan.android.paybase.common.analyse.a.a("b_O08CI", new a.c().a("message", valueOf).a("sub_message", str).a(PushConstants.INTENT_ACTIVITY_NAME, activity.getClass().getSimpleName()).b);
        }
    }

    private static View a(Context context, a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92de9a72da4f8dffe221904c49c4633f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92de9a72da4f8dffe221904c49c4633f");
        }
        if (a.TOAST_TYPE_COMMON == aVar) {
            return View.inflate(context, R.layout.paybase__toast_with_text, null);
        }
        View a2 = a(context);
        ImageView imageView = (ImageView) a2.findViewById(R.id.toast_icon);
        if (a.TOAST_TYPE_SUCCESS == aVar) {
            imageView.setImageResource(R.drawable.paybase__toast_icon_success);
            return a2;
        } else if (a.TOAST_TYPE_EXCEPTION == aVar) {
            imageView.setImageResource(R.drawable.paybase__toast_icon_failed);
            return a2;
        } else {
            return a2;
        }
    }

    private static View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efd0029b313960accaedca5aae33986f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efd0029b313960accaedca5aae33986f");
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundResource(R.drawable.paybase__bg_toast);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.paybase__toast_with_icon_padding);
        linearLayout.setPadding(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.toast_icon);
        linearLayout.addView(imageView);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.paybase__toast_with_icon_image_size);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.paybase__toast_with_icon_image_margin_horizontal);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.paybase__toast_with_icon_image_margin_bottom);
        layoutParams.leftMargin = dimensionPixelOffset2;
        layoutParams.rightMargin = dimensionPixelOffset2;
        layoutParams.bottomMargin = dimensionPixelOffset3;
        imageView.setImageResource(R.drawable.paybase__toast_icon_success);
        TextView textView = new TextView(context);
        textView.setId(R.id.toast_text);
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        int dimensionPixelOffset4 = context.getResources().getDimensionPixelOffset(R.dimen.paybase__toast_with_icon_text_margin_horizontal);
        layoutParams2.setMargins(dimensionPixelOffset4, 0, dimensionPixelOffset4, 0);
        textView.setLayoutParams(layoutParams2);
        textView.setTextColor(context.getResources().getColor(R.color.paybase__white));
        textView.setTextSize(0, aj.a(context, 16.0f));
        return linearLayout;
    }

    public static void a(Activity activity, Object obj) {
        Object[] objArr = {activity, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56e022aa1ae822e1e34d28b8b03985c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56e022aa1ae822e1e34d28b8b03985c5");
        } else {
            a(activity, obj, (String) null, a.TOAST_TYPE_COMMON, false);
        }
    }

    public static void a(Activity activity, Object obj, String str) {
        Object[] objArr = {activity, obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "969f5341581244aba59b9ca660276bf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "969f5341581244aba59b9ca660276bf9");
        } else {
            a(activity, obj, str, a.TOAST_TYPE_COMMON, false);
        }
    }

    public static void a(Activity activity, Object obj, boolean z) {
        Object[] objArr = {activity, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a90e0c5d8c9b68302f5935544412f94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a90e0c5d8c9b68302f5935544412f94");
        } else {
            a(activity, obj, (String) null, a.TOAST_TYPE_COMMON, z);
        }
    }

    public static void a(Activity activity, Object obj, a aVar) {
        Object[] objArr = {activity, obj, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b68f25fc361a13112d8c5b3b80020f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b68f25fc361a13112d8c5b3b80020f1");
        } else {
            a(activity, obj, (String) null, aVar, false);
        }
    }

    public static void a(Context context, Object obj) {
        Object[] objArr = {context, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64af867a95247b4c8b37c2d41795ae2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64af867a95247b4c8b37c2d41795ae2e");
        } else {
            a(context, obj, (String) null, a.TOAST_TYPE_COMMON, false);
        }
    }

    public static SpannableStringBuilder a(String str, String str2, int i) {
        int i2;
        int i3 = 0;
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b38fa6d13d042ad05ef0706b9320f42", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableStringBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b38fa6d13d042ad05ef0706b9320f42");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (TextUtils.isEmpty(str)) {
            i2 = 0;
        } else {
            i2 = str.length();
            spannableStringBuilder.append((CharSequence) str);
        }
        if (!TextUtils.isEmpty(str2)) {
            i3 = str2.length();
            spannableStringBuilder.append((CharSequence) str2);
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), i2, i3 + i2, 33);
        return spannableStringBuilder;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        TOAST_TYPE_COMMON,
        TOAST_TYPE_SUCCESS,
        TOAST_TYPE_EXCEPTION;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6257a022755e2e53d16f0bc827c2de31", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6257a022755e2e53d16f0bc827c2de31");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4dc0fff50e70a6e4401f0e2575b2b265", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4dc0fff50e70a6e4401f0e2575b2b265") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96c1991c4e306626da3850faaa434246", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96c1991c4e306626da3850faaa434246") : (a[]) values().clone();
        }
    }
}
