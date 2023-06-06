package com.sankuai.meituan.takeoutnew.app.init;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.constraint.R;
import com.meituan.android.screenshot.manager.a;
import com.meituan.android.screenshot.manager.b;
import com.meituan.android.screenshot.model.ScreenShotItemModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.AppApplication;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.core.pageinfo.b;
import com.sankuai.waimai.platform.widget.emptylayout.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ScreenShotInit extends AbsInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "ScreenShotInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "231aa9641708aaf9c57951c52c274d58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "231aa9641708aaf9c57951c52c274d58");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = g.a;
        b.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "9925e667a1a67085081eaa07af78c845", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.foundation.core.pageinfo.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "9925e667a1a67085081eaa07af78c845") : new g());
        Context context = com.meituan.android.singleton.b.a;
        a.C0366a c0366a = new a.C0366a();
        c0366a.c = new com.meituan.android.screenshot.listener.b() { // from class: com.sankuai.meituan.takeoutnew.app.init.ScreenShotInit.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.screenshot.listener.b
            public final void a(String str) {
                com.sankuai.meituan.takeoutnew.provider.screenshot.a aVar;
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "34b9969c5a4e41d43853e442daaef5a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "34b9969c5a4e41d43853e442daaef5a4");
                    return;
                }
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.meituan.takeoutnew.provider.screenshot.a.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "f991ddbd6453060734998e22520a7167", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (com.sankuai.meituan.takeoutnew.provider.screenshot.a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "f991ddbd6453060734998e22520a7167");
                } else {
                    if (com.sankuai.meituan.takeoutnew.provider.screenshot.a.f == null) {
                        com.sankuai.meituan.takeoutnew.provider.screenshot.a.f = new com.sankuai.meituan.takeoutnew.provider.screenshot.a();
                    }
                    aVar = com.sankuai.meituan.takeoutnew.provider.screenshot.a.f;
                }
                Object[] objArr5 = {str};
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.meituan.takeoutnew.provider.screenshot.a.a;
                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect6, false, "f93d87e9d283d804f811052a8896e8e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect6, false, "f93d87e9d283d804f811052a8896e8e3");
                    return;
                }
                aVar.e = str;
                Object[] objArr6 = {str};
                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.meituan.takeoutnew.provider.screenshot.a.a;
                if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect7, false, "8c69d902e567dca046e9707a83fd84d7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect7, false, "8c69d902e567dca046e9707a83fd84d7");
                    return;
                }
                com.sankuai.waimai.foundation.core.service.screenshot.a a2 = com.sankuai.waimai.foundation.core.service.screenshot.a.a();
                Object[] objArr7 = {str};
                ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.foundation.core.service.screenshot.a.a;
                if (PatchProxy.isSupport(objArr7, a2, changeQuickRedirect8, false, "3082511931e40a5f74187213619a6e30", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, a2, changeQuickRedirect8, false, "3082511931e40a5f74187213619a6e30");
                } else if (a2.b != null) {
                    for (com.sankuai.waimai.foundation.core.service.screenshot.observer.a aVar2 : a2.b) {
                        aVar2.a(str);
                    }
                }
            }
        };
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a.C0366a.a;
        com.meituan.android.screenshot.manager.a aVar = PatchProxy.isSupport(objArr3, c0366a, changeQuickRedirect4, false, "7465e0af6650e47cf366910d806b4b8c", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.screenshot.manager.a) PatchProxy.accessDispatch(objArr3, c0366a, changeQuickRedirect4, false, "7465e0af6650e47cf366910d806b4b8c") : new com.meituan.android.screenshot.manager.a(c0366a);
        aVar.d.add(new ScreenShotItemModel(context.getResources().getDrawable(R.drawable.takeout_screenshot_feedback), context.getResources().getString(R.string.wm_screen_feedback_title), "imeituan://www.meituan.com/screenshot"));
        aVar.d.add(new ScreenShotItemModel(context.getResources().getDrawable(R.drawable.takeout_screenshot_share), context.getResources().getString(R.string.wm_screen_share_title), new com.meituan.android.screenshot.listener.a() { // from class: com.sankuai.meituan.takeoutnew.app.init.ScreenShotInit.2
        }));
        aVar.d.add(new ScreenShotItemModel(context.getResources().getDrawable(R.drawable.takeout_screenshot_multiperson), context.getResources().getString(R.string.wm_screen_multi_title), "com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity", new com.meituan.android.screenshot.listener.a() { // from class: com.sankuai.meituan.takeoutnew.app.init.ScreenShotInit.3
        }));
        com.meituan.android.screenshot.manager.b a = com.meituan.android.screenshot.manager.b.a();
        AppApplication appApplication = (AppApplication) context;
        Object[] objArr4 = {appApplication, aVar};
        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.screenshot.manager.b.a;
        if (PatchProxy.isSupport(objArr4, a, changeQuickRedirect5, false, "253edd7d1cda104bbf4e4c1def052cab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, a, changeQuickRedirect5, false, "253edd7d1cda104bbf4e4c1def052cab");
            return;
        }
        a.g = aVar;
        a.e = appApplication;
        a.c = new b.a(appApplication, new Handler(Looper.getMainLooper()));
        a.a(appApplication);
    }
}
