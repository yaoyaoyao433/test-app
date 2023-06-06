package com.sankuai.waimai.launcher.provider.push;

import android.content.Context;
import android.os.Build;
import android.support.constraint.R;
import android.text.TextUtils;
import com.dianping.base.push.pushservice.h;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.cache.IOneIdCallback;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends h {
    public static ChangeQuickRedirect b;
    private Context c;

    @Override // com.dianping.base.push.pushservice.h
    public final String e() {
        return "dianping://home";
    }

    @Override // com.dianping.base.push.pushservice.h
    public final int f() {
        return R.drawable.wm_ic_launcher;
    }

    @Override // com.dianping.base.push.pushservice.h
    public final int h() {
        return R.drawable.wm_push_notification_white_icon;
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a28fe9bc204a7e74885712d32a3a5a12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a28fe9bc204a7e74885712d32a3a5a12");
        } else {
            this.c = context;
        }
    }

    @Override // com.dianping.base.push.pushservice.h
    public final boolean a() {
        return com.sankuai.meituan.takeoutnew.a.f;
    }

    @Override // com.dianping.base.push.pushservice.h
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f3b1f2ae265e46faa73869dae3f734b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f3b1f2ae265e46faa73869dae3f734b") : j();
    }

    @Override // com.dianping.base.push.pushservice.h
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6281e9b6213834a70754e4eac2f9b54", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6281e9b6213834a70754e4eac2f9b54") : AppUtil.getWifiMac(this.c);
    }

    @Override // com.dianping.base.push.pushservice.h
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b38bee009174d055b9f364d9dccd9ca", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b38bee009174d055b9f364d9dccd9ca") : this.c.getResources().getString(R.string.app_name);
    }

    @Override // com.dianping.base.push.pushservice.h
    public final int g() {
        return Build.VERSION.SDK_INT >= 21 ? R.drawable.wm_push_notification_white_icon : R.drawable.wm_ic_launcher;
    }

    @Override // com.dianping.base.push.pushservice.h
    public final int i() {
        if (Build.VERSION.SDK_INT >= 21) {
            return R.color.wm_restaurant_gray_7;
        }
        return 0;
    }

    private String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c56f3c835b023b631f3710c10892c881", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c56f3c835b023b631f3710c10892c881");
        }
        try {
            String oneIdFromLocal = OneIdHandler.getInstance(this.c).getOneIdFromLocal();
            if (TextUtils.isEmpty(oneIdFromLocal)) {
                OneIdHandler oneIdHandler = OneIdHandler.getInstance(this.c);
                oneIdHandler.init();
                oneIdHandler.getOneId(new IOneIdCallback() { // from class: com.sankuai.waimai.launcher.provider.push.a.1
                    @Override // com.meituan.android.common.unionid.oneid.cache.IOneIdCallback
                    public final void call(String str) {
                    }
                });
                return "-1";
            }
            return oneIdFromLocal;
        } catch (Exception unused) {
            return "-1";
        }
    }
}
