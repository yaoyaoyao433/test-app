package com.meituan.android.legwork.common.hostInfo;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.meituan.android.common.dfingerprint.DFPInfoProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a implements c {
    public static ChangeQuickRedirect a;
    public String b;
    public DFPInfoProvider c;
    private String d;

    public String a(Context context, String str) {
        return null;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e801513e581be190225653bc09e4b74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e801513e581be190225653bc09e4b74");
        } else {
            this.c = new d();
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5556b6e321caf51cf20f7ef3f985c3a9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5556b6e321caf51cf20f7ef3f985c3a9") : TextUtils.isEmpty(this.b) ? "nochannel" : this.b;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb4f3c5c3612f908385c70324db5c694", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb4f3c5c3612f908385c70324db5c694") : com.dianping.mainboard.a.b().h;
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7598042df5e3f245b44d1a95171a8047", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7598042df5e3f245b44d1a95171a8047");
        }
        if (TextUtils.isEmpty(this.d)) {
            a(com.meituan.android.legwork.a.a());
        }
        return this.d;
    }

    private void a(Context context) {
        PackageInfo packageInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2806f08b3a17632a0d2ec61bf1411a56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2806f08b3a17632a0d2ec61bf1411a56");
        } else if (context == null) {
        } else {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.d = packageInfo.versionName;
            } else {
                this.d = "a_app_version";
            }
        }
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd3e8a08ea84e1dd1514fc990c9ff803", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd3e8a08ea84e1dd1514fc990c9ff803") : f();
    }
}
