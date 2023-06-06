package com.sankuai.waimai.platform.utils;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ae;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class m {
    public static ChangeQuickRedirect a = null;
    private static final int b = 2131689692;

    @Deprecated
    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ae86fe7ff756722a4adcfcee4614254", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ae86fe7ff756722a4adcfcee4614254");
        } else {
            ae.a(context, str);
        }
    }

    @Deprecated
    public static void a(Context context, String str, Throwable th) {
        Object[] objArr = {context, str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77a42c4287bd44f227ca6cd6f3fe183f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77a42c4287bd44f227ca6cd6f3fe183f");
        } else {
            b(com.sankuai.waimai.foundation.utils.activity.a.a().b(), str, th);
        }
    }

    @Deprecated
    public static void a(Context context, int i, Throwable th) {
        Object[] objArr = {context, Integer.valueOf(i), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63d9d2d64b5f37644f84ad157ff5a5c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63d9d2d64b5f37644f84ad157ff5a5c2");
        } else {
            b(com.sankuai.waimai.foundation.utils.activity.a.a().b(), com.meituan.android.singleton.b.a.getString(i), th);
        }
    }

    public static void a(Activity activity, String str, Throwable th) {
        Object[] objArr = {activity, str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "763ef6721c862f88743b0d1f8dc1aa78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "763ef6721c862f88743b0d1f8dc1aa78");
        } else if (activity != null) {
            b(activity, str, th);
        }
    }

    public static void a(Activity activity, int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1939b9c3a340003434187907b7bbc255", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1939b9c3a340003434187907b7bbc255");
        } else {
            ae.a(activity, i);
        }
    }

    public static void a(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f7ba3a8ec04f1ff6d05fd68bdbb1db2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f7ba3a8ec04f1ff6d05fd68bdbb1db2");
        } else {
            ae.a(view, str);
        }
    }

    public static void b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f264109d37ead8531212715f9061276a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f264109d37ead8531212715f9061276a");
        } else {
            ae.b(context, str);
        }
    }

    @UiThread
    private static void b(Activity activity, String str, Throwable th) {
        Object[] objArr = {activity, str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfc48003713b182f9af43a1db06fee43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfc48003713b182f9af43a1db06fee43");
        } else if (activity != null) {
            a(activity, str, a(activity, th));
        }
    }

    @UiThread
    private static void a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64c8bfe290a2ed203d2a3c1f9dc29af4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64c8bfe290a2ed203d2a3c1f9dc29af4");
        } else if (activity == null || TextUtils.isEmpty(str)) {
        } else {
            if (!TextUtils.isEmpty(str2)) {
                com.sankuai.meituan.android.ui.widget.a a2 = com.sankuai.meituan.android.ui.widget.a.a(activity, str, 0);
                a(a2, activity, str2);
                a2.a();
                return;
            }
            ae.a(activity, str);
        }
    }

    @UiThread
    private static void a(com.sankuai.meituan.android.ui.widget.a aVar, Context context, String str) {
        Object[] objArr = {aVar, context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91990136e3bdde1cc9127a30e4f694ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91990136e3bdde1cc9127a30e4f694ba");
        } else if (aVar == null || context == null) {
        } else {
            TextView textView = new TextView(context);
            textView.setText(str);
            textView.setId(b);
            textView.setTextColor(com.meituan.android.singleton.b.a.getResources().getColor(R.color.wm_common_toast_sub_text_color));
            textView.setTextSize(2, 7.0f);
            aVar.b(textView);
            int dimension = (int) com.meituan.android.singleton.b.a.getResources().getDimension(R.dimen.wm_snackbar_design_icon_padding_vertical);
            int dimension2 = (int) com.meituan.android.singleton.b.a.getResources().getDimension(R.dimen.wm_snackbar_design_message_icon_padding);
            View findViewById = aVar.c().findViewById(R.id.snackbar_text);
            if (findViewById != null) {
                findViewById.setPadding(findViewById.getPaddingLeft(), dimension, findViewById.getPaddingRight(), dimension2);
            }
            View findViewById2 = aVar.c().findViewById(b);
            if (findViewById2 != null) {
                ((LinearLayout.LayoutParams) findViewById2.getLayoutParams()).bottomMargin = dimension;
            }
        }
    }

    @UiThread
    private static String a(Activity activity, @NonNull Throwable th) {
        Object[] objArr = {activity, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45192fac2f6345790029f2223ceb7a48", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45192fac2f6345790029f2223ceb7a48");
        }
        String a2 = com.sankuai.waimai.monitor.a.a(activity, th).a();
        com.sankuai.waimai.platform.widget.emptylayout.j.a().a(com.sankuai.waimai.platform.bizdiagnosis.a.e(activity), a2, th);
        return a2;
    }
}
