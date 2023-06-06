package com.meituan.android.paycommon.lib.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.constraint.R;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.meituan.android.paybase.utils.ak;
import com.meituan.android.paycommon.lib.config.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class u {
    public static ChangeQuickRedirect a;

    public static int a(e.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e404695bdb39ed611fa3ee049708040", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e404695bdb39ed611fa3ee049708040")).intValue();
        }
        if (com.meituan.android.paycommon.lib.config.a.a() == null || com.meituan.android.paycommon.lib.config.a.a().b() == null) {
            return -1;
        }
        Map<e.a, Integer> b = com.meituan.android.paycommon.lib.config.a.a().b();
        if (b.containsKey(aVar)) {
            return b.get(aVar).intValue();
        }
        return -1;
    }

    public static boolean a(Context context, TextView textView) {
        Object[] objArr = {context, textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15ffc9f56b38e7b9d0d0f8ef681454d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15ffc9f56b38e7b9d0d0f8ef681454d2")).booleanValue();
        }
        int a2 = a(e.a.CASHIER__SUBBTN_BG);
        int a3 = a(e.a.CASHIER__SUBBTN_TEXT_COLOR);
        if (context == null || (a2 < 0 && a3 < 0)) {
            return false;
        }
        if (a2 >= 0) {
            textView.setBackgroundResource(a2);
        }
        if (a3 >= 0) {
            textView.setTextColor(context.getResources().getColor(a3));
        }
        return true;
    }

    public static void a(CheckBox checkBox) {
        Object[] objArr = {checkBox};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d56dbbdcdccf8cc329002c0877d1920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d56dbbdcdccf8cc329002c0877d1920");
            return;
        }
        int a2 = a(e.a.CASHIER__TOGGLE_BUTTON_BG);
        if (a2 >= 0) {
            checkBox.setBackgroundResource(a2);
        } else {
            checkBox.setBackgroundResource(R.drawable.mtpaysdk__toggle_checkbox);
        }
    }

    public static Activity a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e271a14e3a27476231ca2d1bf1e903a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e271a14e3a27476231ca2d1bf1e903a");
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static String b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "089e92e42809a4a15f883d21b44f1b10", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "089e92e42809a4a15f883d21b44f1b10") : ak.a(a(view));
    }
}
