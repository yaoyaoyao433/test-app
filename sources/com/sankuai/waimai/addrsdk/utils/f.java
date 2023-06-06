package com.sankuai.waimai.addrsdk.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private SharedPreferences b;

    public f(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c1a94ee3d8c7c1bff6bf0ec3af94f96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c1a94ee3d8c7c1bff6bf0ec3af94f96");
        } else {
            this.b = context.getSharedPreferences(str, 0);
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3149c89db1a600a2cb6d6d77ca707e75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3149c89db1a600a2cb6d6d77ca707e75");
            return;
        }
        SharedPreferences.Editor edit = this.b.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dbee33dab56f069cbefa5fe4a82935a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dbee33dab56f069cbefa5fe4a82935a") : this.b.getString(str, "");
    }
}
