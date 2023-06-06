package com.sankuai.waimai.business.page.home.widget.twolevel.strategy;

import android.arch.lifecycle.q;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.HomePageFragment;
import com.sankuai.waimai.business.page.home.model.HomeSecondFloorResponse;
import com.sankuai.waimai.business.page.home.widget.twolevel.SecondFloorViewModel;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static Executor c = com.sankuai.android.jarvis.c.b();
    public WeakReference<HomePageFragment> b;
    public com.sankuai.waimai.business.page.home.widget.twolevel.report.a d;
    public boolean e;
    private c f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(boolean z);
    }

    public static /* synthetic */ void a(b bVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "c5125830322bcb66d93bae6d7ab6dcf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "c5125830322bcb66d93bae6d7ab6dcf7");
        } else if (bVar.d != null) {
            com.sankuai.waimai.business.page.home.widget.twolevel.report.a aVar = bVar.d;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.widget.twolevel.report.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "48366c9079a55f332f4092c75feb6f5c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "48366c9079a55f332f4092c75feb6f5c");
                return;
            }
            JudasManualManager.a a2 = JudasManualManager.b("b_waimai_or55o31i_mv").a("c_m84bv26");
            a2.b = aVar.c;
            a2.a("failure_code", i).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b r18, com.sankuai.waimai.business.page.home.model.HomeSecondFloorResponse r19, final com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b.a r20) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b.a(com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b, com.sankuai.waimai.business.page.home.model.HomeSecondFloorResponse, com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b$a):void");
    }

    public static /* synthetic */ void a(b bVar, final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "5b22a219d78943309c58d0712b53a3cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "5b22a219d78943309c58d0712b53a3cd");
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1b703dc9dae3c2623f0766bc99937b9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1b703dc9dae3c2623f0766bc99937b9");
                    } else if (b.this.b != null && b.this.b.get() != null) {
                        if (!f.a(((HomePageFragment) b.this.b.get()).getActivity())) {
                            if (((HomePageFragment) b.this.b.get()).isDetached() || !((HomePageFragment) b.this.b.get()).isAdded()) {
                                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "no show, fragment detach.", new Object[0]);
                                b.a(b.this, 12);
                                aVar.a(false);
                                return;
                            } else if (((HomePageFragment) b.this.b.get()).H) {
                                HomePageFragment homePageFragment = (HomePageFragment) b.this.b.get();
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = HomePageFragment.d;
                                if (PatchProxy.isSupport(objArr3, homePageFragment, changeQuickRedirect3, false, "776cdef4689ebfbcc0623dc31f1ffc0c", RobustBitConfig.DEFAULT_VALUE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, homePageFragment, changeQuickRedirect3, false, "776cdef4689ebfbcc0623dc31f1ffc0c")).booleanValue();
                                } else {
                                    z = !homePageFragment.e.canScrollVertically(-1);
                                }
                                if (!z) {
                                    com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "no show, fragment not at the top.", new Object[0]);
                                    b.a(b.this, 13);
                                    aVar.a(false);
                                    return;
                                }
                                HomeSecondFloorResponse homeSecondFloorResponse = ((SecondFloorViewModel) q.a((Fragment) b.this.b.get()).a(SecondFloorViewModel.class)).b;
                                if (homeSecondFloorResponse == null || !homeSecondFloorResponse.isGuideEnable()) {
                                    com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "no show, guide picture no cache.", new Object[0]);
                                    b.a(b.this, 11);
                                    aVar.a(false);
                                    return;
                                }
                                aVar.a(true);
                                return;
                            } else {
                                com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "no show, fragment invisible.", new Object[0]);
                                b.a(b.this, 12);
                                aVar.a(false);
                                return;
                            }
                        }
                        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "no show, activity is dead.", new Object[0]);
                        b.a(b.this, 12);
                        aVar.a(false);
                    } else {
                        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "no show, fragment is null.", new Object[0]);
                        b.a(b.this, 12);
                        aVar.a(false);
                    }
                }
            });
        }
    }

    public b(HomePageFragment homePageFragment) {
        Object[] objArr = {homePageFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db76b13db6540c5a520f196b02cf56b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db76b13db6540c5a520f196b02cf56b1");
            return;
        }
        this.e = false;
        this.b = new WeakReference<>(homePageFragment);
        this.f = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(HomeSecondFloorResponse homeSecondFloorResponse) {
        HomeSecondFloorResponse.Frequency frequency;
        Object[] objArr = {homeSecondFloorResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b56074a450c56fd5ce740c3b63385d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b56074a450c56fd5ce740c3b63385d2");
        }
        if (homeSecondFloorResponse == null || homeSecondFloorResponse.homeSecondFloorData == null || (frequency = homeSecondFloorResponse.homeSecondFloorData.frequency) == null) {
            return null;
        }
        if (frequency.activity) {
            if (homeSecondFloorResponse.homeSecondFloorData.resource == null || homeSecondFloorResponse.homeSecondFloorData.resource.view == null || TextUtils.isEmpty(homeSecondFloorResponse.homeSecondFloorData.resource.view.activityId)) {
                return null;
            }
            return String.valueOf(homeSecondFloorResponse.homeSecondFloorData.resource.moduleId) + '_' + homeSecondFloorResponse.homeSecondFloorData.resource.view.activityId;
        }
        return "default_id";
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b2d011a6b3c9ebd07cff427d47adcb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b2d011a6b3c9ebd07cff427d47adcb1");
        } else if (c != null) {
            com.sankuai.waimai.launcher.util.aop.b.a(c, new Runnable() { // from class: com.sankuai.waimai.business.page.home.widget.twolevel.strategy.b.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Map<String, ?> b;
                    SecondFloorGuideStrategy secondFloorGuideStrategy;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "064e81ad3acb1d13315a134c1bd4abbb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "064e81ad3acb1d13315a134c1bd4abbb");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorGuideHelper", "check cache", new Object[0]);
                    if (b.this.b == null || b.this.b.get() == null || ((HomePageFragment) b.this.b.get()).isDetached() || !((HomePageFragment) b.this.b.get()).isAdded()) {
                        return;
                    }
                    String a2 = b.this.a(((SecondFloorViewModel) q.a((Fragment) b.this.b.get()).a(SecondFloorViewModel.class)).b);
                    c cVar = b.this.f;
                    Object[] objArr3 = {a2};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "cc255adbdb944ef4785c02c7e4057d1e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "cc255adbdb944ef4785c02c7e4057d1e");
                    } else if (cVar.b != null && (b = cVar.b.b()) != null && !b.isEmpty()) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        for (String str : b.keySet()) {
                            if (!TextUtils.isEmpty(str) && (secondFloorGuideStrategy = (SecondFloorGuideStrategy) cVar.b.a(str, cVar.c)) != null && !str.equals(a2)) {
                                if (currentTimeMillis - (secondFloorGuideStrategy.getShownList().size() == 0 ? 0L : secondFloorGuideStrategy.getShownList().get(secondFloorGuideStrategy.getShownList().size() - 1).longValue()) > secondFloorGuideStrategy.getHours() * 3600) {
                                    cVar.b.b(str);
                                }
                            }
                        }
                    }
                }
            });
        }
    }
}
