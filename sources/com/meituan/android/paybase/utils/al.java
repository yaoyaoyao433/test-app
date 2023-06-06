package com.meituan.android.paybase.utils;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.android.paybase.webview.WebViewActivity;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class al {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "058c61aef62eac3ba363b0bf8e666de8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "058c61aef62eac3ba363b0bf8e666de8");
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            if (str.startsWith(AbsApiFactory.HTTP) || str.startsWith(AbsApiFactory.HTTPS)) {
                WebViewActivity.a(context, str);
            } else {
                j.a(context, str, z);
            }
        }
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da2767056ff19fcd1eb00d83857d69a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da2767056ff19fcd1eb00d83857d69a2");
        } else {
            a(context, str, true);
        }
    }

    public static void a(Activity activity, String str, int i) {
        Object[] objArr = {activity, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c73f40a62fdbf91a93375a8863a72cc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c73f40a62fdbf91a93375a8863a72cc5");
        } else if (activity == null || TextUtils.isEmpty(str)) {
        } else {
            if (str.startsWith(AbsApiFactory.HTTP) || str.startsWith(AbsApiFactory.HTTPS)) {
                WebViewActivity.a(activity, str, i);
            } else {
                j.a(activity, str, i);
            }
        }
    }

    public static void a(Fragment fragment, String str, int i) {
        Object[] objArr = {fragment, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b17360e7815b4611db42e32bccba062", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b17360e7815b4611db42e32bccba062");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (str.startsWith(AbsApiFactory.HTTP) || str.startsWith(AbsApiFactory.HTTPS)) {
                WebViewActivity.a(fragment, str, i);
            } else {
                j.a(fragment, str, i);
            }
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "850769cd66724c5ac218493b738bcc77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "850769cd66724c5ac218493b738bcc77");
        } else {
            WebViewActivity.j();
        }
    }
}
