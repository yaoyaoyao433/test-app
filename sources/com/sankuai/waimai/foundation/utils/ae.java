package com.sankuai.waimai.foundation.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ae {
    public static ChangeQuickRedirect a;
    private static WeakReference<Window> b;

    @Deprecated
    public static void a(Context context, String str) {
        Activity b2;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50b7098e20b943faae8b0d809160680c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50b7098e20b943faae8b0d809160680c");
            return;
        }
        if (context instanceof Activity) {
            b2 = (Activity) context;
        } else {
            b2 = com.sankuai.waimai.foundation.utils.activity.a.a().b();
        }
        if (b2 != null) {
            a(b2, str);
        }
    }

    @Deprecated
    public static void a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1aa02db9ea78c29584208f15ef930dab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1aa02db9ea78c29584208f15ef930dab");
        } else if (context != null) {
            a(context, context.getResources().getString(i));
        }
    }

    public static void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3714259bb9d2faf5ce06f24e67f2007", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3714259bb9d2faf5ce06f24e67f2007");
        } else {
            y.b(activity, str);
        }
    }

    public static void a(Activity activity, int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd6eb82281c037a63e8f1bd3ee785eb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd6eb82281c037a63e8f1bd3ee785eb9");
            return;
        }
        Object[] objArr2 = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = y.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8dbde4d6f1dad9dbc0d5fbaf9e2be0d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8dbde4d6f1dad9dbc0d5fbaf9e2be0d1");
            return;
        }
        Object[] objArr3 = {activity, Integer.valueOf(i), (byte) 1, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect3 = y.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "00e71993399c46bde5944823f27bfcf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "00e71993399c46bde5944823f27bfcf9");
        } else if (activity != null) {
            y.a((Context) activity, activity.getResources().getString(i), true, true);
        }
    }

    public static void a(View view, String str) {
        View findViewById;
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0cfc5d727413de422dc06fa32f211e5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0cfc5d727413de422dc06fa32f211e5c");
            return;
        }
        Object[] objArr2 = {view, str};
        ChangeQuickRedirect changeQuickRedirect2 = y.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5e157086037f56bcac98dade4581ca42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5e157086037f56bcac98dade4581ca42");
        } else if (view == null || (findViewById = view.getRootView().findViewById(16908290)) == null || !(findViewById instanceof ViewGroup)) {
        } else {
            Object[] objArr3 = {findViewById, str};
            ChangeQuickRedirect changeQuickRedirect3 = y.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a6a8c69168811d9791213da5a581cb91", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a6a8c69168811d9791213da5a581cb91");
            } else {
                y.a(findViewById, str, -1, 17).a();
            }
        }
    }

    public static void b(Context context, String str) {
        Activity b2;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0ed9ce48a9ac2705b0ebf30ecda82d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0ed9ce48a9ac2705b0ebf30ecda82d6");
            return;
        }
        if (context instanceof Activity) {
            b2 = (Activity) context;
        } else {
            b2 = com.sankuai.waimai.foundation.utils.activity.a.a().b();
        }
        if (b2 != null) {
            if (b != null) {
                Window window = b.get();
                if (window != null && b2.getWindow() != window && window.getDecorView() != null) {
                    try {
                        a(window.getDecorView(), str);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                a(b2, str);
                return;
            }
            a(b2, str);
        }
    }

    public static void a(Window window) {
        Object[] objArr = {window};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fbb8110d360ba15e43abc14120fdd1be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fbb8110d360ba15e43abc14120fdd1be");
        } else {
            b = new WeakReference<>(window);
        }
    }

    public static void a() {
        b = null;
    }
}
