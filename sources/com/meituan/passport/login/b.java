package com.meituan.passport.login;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public FragmentActivity b;

    public b(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e32499ed1bc67725320f5b4f67cb6243", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e32499ed1bc67725320f5b4f67cb6243");
        } else {
            this.b = fragmentActivity;
        }
    }

    private Intent c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4485b9cd2c6429f61dd7e86caaf7e4c3", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4485b9cd2c6429f61dd7e86caaf7e4c3") : this.b.getIntent();
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81f593b76049a7c602b65ca84b1bf56a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81f593b76049a7c602b65ca84b1bf56a");
            return;
        }
        try {
            if (c().hasExtra("needrisk")) {
                PassportConfig.e(true);
            } else {
                PassportConfig.e(false);
            }
            Uri data = c().getData();
            if (data == null || data.getPath() == null) {
                return;
            }
            if (!TextUtils.isEmpty(data.getQueryParameter("needrisk"))) {
                PassportConfig.e(true);
            } else {
                PassportConfig.e(false);
            }
        } catch (Throwable th) {
            m.a(th);
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "865ecec542c420d335649b4228a3222d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "865ecec542c420d335649b4228a3222d");
            return;
        }
        try {
            if (c().hasExtra("partner")) {
                PassportConfig.a(com.sankuai.waimai.platform.utils.f.a(c(), "partner", -1));
            } else {
                PassportConfig.a(-1);
            }
            Uri data = c().getData();
            if (data == null || data.getPath() == null) {
                return;
            }
            if (!TextUtils.isEmpty(data.getQueryParameter("partner"))) {
                PassportConfig.a(Integer.getInteger(data.getQueryParameter("partner"), -1).intValue());
            } else {
                PassportConfig.a(-1);
            }
        } catch (Throwable th) {
            m.a(th);
        }
    }
}
