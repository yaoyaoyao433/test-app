package com.meituan.android.base.share;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b05de24dd9978b9fd7f64900ef16c678", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b05de24dd9978b9fd7f64900ef16c678");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
        if (com.meituan.android.base.a.h == null || com.meituan.android.base.a.h.length() <= 0) {
            for (int i = 0; i < 64; i++) {
                sb.append("0");
            }
        } else {
            sb.append(com.meituan.android.base.a.h);
        }
        sb.append(b());
        return sb.toString();
    }

    private static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52ca1e75596339de164bd79521743c6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52ca1e75596339de164bd79521743c6f");
        }
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public static String a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "440143a7f6ae93755ea38080fe67a3f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "440143a7f6ae93755ea38080fe67a3f5");
        }
        try {
            String queryParameter = uri.getQueryParameter("lch");
            try {
                if (TextUtils.isEmpty(queryParameter)) {
                    String decode = Uri.decode(uri.getQueryParameter("url"));
                    if (!TextUtils.isEmpty(decode)) {
                        return Uri.parse(decode).buildUpon().build().getQueryParameter("lch");
                    }
                }
            } catch (Exception unused) {
            }
            return queryParameter;
        } catch (Exception unused2) {
            return "";
        }
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7ced33b3718d0779bc3a45a3474df8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7ced33b3718d0779bc3a45a3474df8d");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("appshare_");
        if (split.length > 1) {
            try {
                return split[split.length - 1].split("___")[0];
            } catch (NumberFormatException unused) {
            }
        }
        return "";
    }

    public static int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b1b3d704b4eb446a1647ac378b88ccf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b1b3d704b4eb446a1647ac378b88ccf")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        String[] split = str.split("A");
        if (split.length > 1) {
            try {
                return Integer.parseInt(split[split.length - 1]);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }
}
