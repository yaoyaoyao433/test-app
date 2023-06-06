package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.waimai.business.page.home.list.future.mach.DynamicImageTagProcessor;
import com.sankuai.waimai.business.page.home.list.future.mach.RateCrownTagProcessor;
import com.sankuai.waimai.irmo.mach.effect.WmEffectTagProcessor;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.component.scroller.ScrollerTagProcessor;
import com.sankuai.waimai.mach.component.swiper.SwiperTagProcessor;
import com.sankuai.waimai.mach.js.HttpJSNativeMethod;
import com.sankuai.waimai.platform.capacity.ad.WMADStrategyNativeModule;
import com.sankuai.waimai.platform.mach.statistics.d;
import com.sankuai.waimai.platform.mach.tag.DynamicTagProcessor;
import com.sankuai.waimai.platform.mach.webpimage.WebpImageTagProcessor;
import java.util.Map;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.platform.mach.a {
    public static ChangeQuickRedirect a;
    private Activity b;

    public a(Activity activity, String str) {
        super(activity, str);
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39f0cd554a374ecafe99e0d905370697", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39f0cd554a374ecafe99e0d905370697");
        } else {
            this.b = activity;
        }
    }

    @Override // com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
    public final void a(Mach.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb8db2f93f577f3fd457cf81167b9c5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb8db2f93f577f3fd457cf81167b9c5b");
            return;
        }
        super.a(aVar);
        aVar.a(new WebpImageTagProcessor()).a(new DynamicTagProcessor()).a(new ScrollerTagProcessor()).a(new RateCrownTagProcessor()).a(new SwiperTagProcessor()).a(new DynamicImageTagProcessor()).a(new WmEffectTagProcessor()).a(new HttpJSNativeMethod() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi.a.1
            @Override // com.sankuai.waimai.mach.js.HttpJSNativeMethod
            public final void httpRequest(String str, Map<String, String> map, j<ap> jVar) {
            }
        }).a(new WMADStrategyNativeModule()).a(new d(this.b));
    }
}
