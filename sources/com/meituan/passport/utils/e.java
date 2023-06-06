package com.meituan.passport.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static e c;
    String b;

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81d258717558fabd29996b96e06d78d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81d258717558fabd29996b96e06d78d7");
        }
        if (c == null) {
            c = new e();
        }
        return c;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec0ab3cd9238a25f0dc77cc050c852d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec0ab3cd9238a25f0dc77cc050c852d2");
        }
        if (TextUtils.isEmpty(this.b)) {
            this.b = a(com.meituan.android.singleton.b.a());
        } else if (this.b.startsWith("http") || this.b.startsWith("https")) {
            this.b = Uri.encode(this.b);
        }
        return this.b;
    }

    public final String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c7272277b2c06fadb163fb622975249", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c7272277b2c06fadb163fb622975249");
        }
        if (context == null) {
            return "";
        }
        UserCenter userCenter = UserCenter.getInstance(context);
        String token = userCenter != null ? userCenter.getToken() : "";
        HashMap hashMap = new HashMap();
        hashMap.put("accessToken", token);
        hashMap.put("referId", "0");
        hashMap.put("sysName", "android");
        hashMap.put("sysVer", Build.VERSION.RELEASE);
        hashMap.put("appVer", com.meituan.passport.service.e.a().c);
        hashMap.put("locCity", Integer.valueOf(com.meituan.passport.plugins.q.a().g().a()));
        hashMap.put("appName", PassportConfig.f());
        StringBuilder sb = new StringBuilder();
        sb.append(Utils.a(context, (int) R.string.passport_help_url, PassportConfig.g()));
        sb.append(CommonConstant.Symbol.QUESTION_MARK);
        for (String str : hashMap.keySet()) {
            sb.append(str);
            sb.append("=");
            sb.append(hashMap.get(str));
            sb.append("&");
        }
        sb.deleteCharAt(sb.length() - 1);
        return Uri.encode(sb.toString());
    }
}
