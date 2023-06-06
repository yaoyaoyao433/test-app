package com.sankuai.waimai.business.knb.init;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.KNBDialogWebViewActivity;
import com.sankuai.waimai.business.knb.crawler.CrawlerDescriptionWithoutUrlDialog;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.platform.domain.manager.crawler.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "CrawlerInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b33189dde0dd77ab0961e6b7111f2c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b33189dde0dd77ab0961e6b7111f2c0");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.crawler.a.a().b = new a.b() { // from class: com.sankuai.waimai.business.knb.init.a.1
            @Override // com.sankuai.waimai.platform.domain.manager.crawler.a.b
            public final String a() {
                return "waimai";
            }

            @Override // com.sankuai.waimai.platform.domain.manager.crawler.a.b
            public final String b() {
                return "waimai.passCrawlerVerification";
            }
        };
        com.sankuai.waimai.platform.domain.manager.crawler.a.a().c = new a.c() { // from class: com.sankuai.waimai.business.knb.init.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.domain.manager.crawler.a.c
            public final void a(Context context, String str) {
                Object[] objArr2 = {context, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7acf34c0d1c57db6b9d090508cf7ad9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7acf34c0d1c57db6b9d090508cf7ad9");
                } else if (context == null || TextUtils.isEmpty(str)) {
                } else {
                    if (com.sankuai.waimai.platform.net.main.a.a()) {
                        KNBDialogWebViewActivity.a(context, str);
                    } else {
                        com.sankuai.waimai.platform.domain.manager.crawler.a.a().c();
                    }
                }
            }

            @Override // com.sankuai.waimai.platform.domain.manager.crawler.a.c
            public final void a(Context context, String str, String str2) {
                Object[] objArr2 = {context, str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37b8940e3f6b792ab0a640c7585fdfbd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37b8940e3f6b792ab0a640c7585fdfbd");
                } else if (context == null) {
                } else {
                    if (com.sankuai.waimai.platform.net.main.a.a()) {
                        Activity c = com.sankuai.waimai.foundation.utils.activity.a.a().c();
                        Object[] objArr3 = {c, str, str2};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.knb.util.b.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "83b19c545290331c2d9e9f72d651623e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "83b19c545290331c2d9e9f72d651623e");
                            return;
                        } else if (c != null) {
                            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                                Looper.prepare();
                                CrawlerDescriptionWithoutUrlDialog crawlerDescriptionWithoutUrlDialog = new CrawlerDescriptionWithoutUrlDialog(c);
                                crawlerDescriptionWithoutUrlDialog.setOwnerActivity(c);
                                crawlerDescriptionWithoutUrlDialog.a(str);
                                crawlerDescriptionWithoutUrlDialog.b(str2);
                                crawlerDescriptionWithoutUrlDialog.show();
                                Looper.loop();
                                return;
                            }
                            CrawlerDescriptionWithoutUrlDialog crawlerDescriptionWithoutUrlDialog2 = new CrawlerDescriptionWithoutUrlDialog(c);
                            crawlerDescriptionWithoutUrlDialog2.setOwnerActivity(c);
                            crawlerDescriptionWithoutUrlDialog2.a(str);
                            crawlerDescriptionWithoutUrlDialog2.b(str2);
                            crawlerDescriptionWithoutUrlDialog2.show();
                            return;
                        } else {
                            return;
                        }
                    }
                    com.sankuai.waimai.platform.domain.manager.crawler.a.a().c();
                }
            }
        };
    }
}
