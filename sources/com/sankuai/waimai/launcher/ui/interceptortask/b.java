package com.sankuai.waimai.launcher.ui.interceptortask;

import android.content.Context;
import android.os.Bundle;
import com.meituan.passport.UserCenter;
import com.meituan.passport.api.ILogoutCallback;
import com.meituan.passport.pojo.LogoutInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.waimai.business.page.home.preload.PreloadDataModel;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.domain.manager.user.BaseUserManager;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a {
    public static ChangeQuickRedirect e;
    final Bundle f;
    final Runnable g;
    final Runnable h;

    public b(Context context, aj ajVar, BaseResponse baseResponse) {
        super(context, ajVar, baseResponse);
        Object[] objArr = {context, ajVar, baseResponse};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ca25cf8b1f668c2ec66c67fbe6073b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ca25cf8b1f668c2ec66c67fbe6073b6");
            return;
        }
        this.f = new Bundle();
        this.g = new Runnable() { // from class: com.sankuai.waimai.launcher.ui.interceptortask.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "270c7bdc70ac9c2e25c672b472b2baad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "270c7bdc70ac9c2e25c672b472b2baad");
                    return;
                }
                if (b.this.b() <= 0 || aa.a(b.this.c())) {
                    b.this.a("donothing");
                } else {
                    b.this.a("retray");
                }
                com.sankuai.waimai.platform.capacity.network.interceptor.a.a().a(3, b.this.f);
            }
        };
        this.h = new Runnable() { // from class: com.sankuai.waimai.launcher.ui.interceptortask.b.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a5d85506ddb9909af09c7675811bb9a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a5d85506ddb9909af09c7675811bb9a");
                    return;
                }
                b.this.a("donothing");
                com.sankuai.waimai.platform.capacity.network.interceptor.a.a().a(3, b.this.f);
            }
        };
    }

    @Override // com.sankuai.waimai.launcher.ui.interceptortask.a
    public final void a() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c3002d0a06e53eeec494aa7b6c28332", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c3002d0a06e53eeec494aa7b6c28332");
        } else if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
            UserCenter.getInstance(com.meituan.android.singleton.b.a).negativeLogout(new LogoutInfo("com.sankuai.waimai:launcher", new LogoutInfo.NativeUrlData(c(), b()), (HashMap<String, String>) null), new ILogoutCallback() { // from class: com.sankuai.waimai.launcher.ui.interceptortask.b.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.api.ILogoutCallback
                public final void onSuccess() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6271cfea6a01e9001c542c7f7a97001a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6271cfea6a01e9001c542c7f7a97001a");
                    } else {
                        ad.c(new Runnable() { // from class: com.sankuai.waimai.launcher.ui.interceptortask.b.3.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "484511249925fe3ddb5b86139972a4f4", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "484511249925fe3ddb5b86139972a4f4");
                                } else {
                                    BaseUserManager.a(b.this.b, b.this.g, b.this.h, b.this.h);
                                }
                            }
                        });
                    }
                }

                @Override // com.meituan.passport.api.ILogoutCallback
                public final void onFailed() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18f77966a232dbabfc47667534909ce9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18f77966a232dbabfc47667534909ce9");
                        return;
                    }
                    b.this.a("donothing");
                    com.sankuai.waimai.platform.capacity.network.interceptor.a.a().a(3, b.this.f);
                }
            });
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de062f56938aeb005959034149d434c7", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de062f56938aeb005959034149d434c7")).booleanValue();
            } else if (!PreloadDataModel.get().getMainActivityLoaded() && !aa.a(c()) && c().contains("poi/homepage")) {
                z = true;
            }
            if (z) {
                a("donothing");
                com.sankuai.waimai.platform.capacity.network.interceptor.a.a().a(3, this.f);
                return;
            }
            ad.c(new Runnable() { // from class: com.sankuai.waimai.launcher.ui.interceptortask.b.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e0cb26e6d527c9a4df4b5e236de51c75", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e0cb26e6d527c9a4df4b5e236de51c75");
                    } else {
                        BaseUserManager.a(b.this.b, b.this.g, b.this.h, b.this.h);
                    }
                }
            });
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2944e7b33be1d60f79a57ae23d1d9d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2944e7b33be1d60f79a57ae23d1d9d6");
        } else {
            this.f.putString("load_key", str);
        }
    }
}
