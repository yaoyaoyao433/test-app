package com.sankuai.waimai.platform.capacity.log;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class g {
    public static ChangeQuickRedirect a;
    private final d b;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c8b302ff535b712275811f95c61dfbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c8b302ff535b712275811f95c61dfbe");
        } else {
            this.b = d.a();
        }
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c460d1303f21a5fbf98e75f1bd71ea83", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c460d1303f21a5fbf98e75f1bd71ea83")).booleanValue();
        }
        try {
            d dVar = this.b;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "667c512ddc0ff8c749a2c51dd674b1fb", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "667c512ddc0ff8c749a2c51dd674b1fb")).booleanValue();
            }
            if (!dVar.e.isEmpty() && !TextUtils.isEmpty(str) && str.startsWith(dVar.d)) {
                String a2 = dVar.a(str);
                if (TextUtils.isEmpty(a2)) {
                    return false;
                }
                return dVar.e.contains(a2);
            }
            return false;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
            return false;
        }
    }

    public final void a(String str, String str2, int i, String str3) {
        String str4;
        Object[] objArr = {str, str2, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcf3bd4b94f1fd1414cbfd1f0b7d6c8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcf3bd4b94f1fd1414cbfd1f0b7d6c8b");
            return;
        }
        try {
            f a2 = f.a();
            String a3 = this.b.a(str);
            Object[] objArr2 = {a3, str, str2, Integer.valueOf(i), str3};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "40cdfa561b25ff9941a56367c065a083", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "40cdfa561b25ff9941a56367c065a083");
            } else if (!TextUtils.isEmpty(a3)) {
                a2.b.put(a3, new e(a3, str, str2, i, str3));
            }
            Object[] objArr3 = {str, str2, Integer.valueOf(i), str3};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4f9568a266dc8e19ca7baa29912c4910", RobustBitConfig.DEFAULT_VALUE)) {
                str4 = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4f9568a266dc8e19ca7baa29912c4910");
            } else {
                str4 = "request:[url:" + str + ",\nbody:" + str2 + "],\nresponse[code:" + i + ",\nbody:" + str3 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
            }
            i.b(new h().a("api_request").d(str4).b());
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a("LoganInterceptor", th);
        }
    }
}
