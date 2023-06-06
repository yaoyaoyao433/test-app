package com.sankuai.waimai.business.page.homepage.controller;

import android.app.Activity;
import android.arch.lifecycle.k;
import android.arch.lifecycle.q;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.LongSparseArray;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewStub;
import android.widget.AbsListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.head.market.HomeSideBarViewModel;
import com.sankuai.waimai.business.page.homepage.api.WmHomePageCommonApi;
import com.sankuai.waimai.business.page.homepage.controller.c;
import com.sankuai.waimai.business.page.homepage.view.b;
import com.sankuai.waimai.business.page.homepage.view.e;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.location.model.MtBackCityInfo;
import com.sankuai.waimai.foundation.location.v2.h;
import com.sankuai.waimai.imbase.d;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.network.errorhanding.f;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.location.CityInfo;
import com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BaseBottomStatusMainController implements ViewPager.OnPageChangeListener, AbsListView.OnScrollListener, d, FilterBarViewController.a {
    public static ChangeQuickRedirect a;
    protected Activity b;
    protected com.sankuai.waimai.business.page.homepage.view.b c;
    protected Handler d;
    protected int e;
    protected Runnable f;
    public c.a g;
    private boolean h;
    private com.sankuai.waimai.business.page.homepage.view.c i;
    private e j;
    private View k;
    private View l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public static /* synthetic */ int a(BaseBottomStatusMainController baseBottomStatusMainController) {
        int i = baseBottomStatusMainController.m;
        baseBottomStatusMainController.m = i + 1;
        return i;
    }

    public static /* synthetic */ e a(BaseBottomStatusMainController baseBottomStatusMainController, e eVar) {
        baseBottomStatusMainController.j = null;
        return null;
    }

    public static /* synthetic */ boolean a(BaseBottomStatusMainController baseBottomStatusMainController, com.sankuai.waimai.business.page.homepage.response.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, baseBottomStatusMainController, changeQuickRedirect, false, "2747c75266b91ce02d2923f4d632e804", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, baseBottomStatusMainController, changeQuickRedirect, false, "2747c75266b91ce02d2923f4d632e804")).booleanValue();
        }
        if (baseBottomStatusMainController.b == null || baseBottomStatusMainController.b.isFinishing()) {
            return false;
        }
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, baseBottomStatusMainController, changeQuickRedirect2, false, "7fda7539e1440b7c05a5de3de2434ef0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, baseBottomStatusMainController, changeQuickRedirect2, false, "7fda7539e1440b7c05a5de3de2434ef0")).booleanValue();
        }
        if (aVar != null) {
            if ((aVar.a == 1) && com.sankuai.waimai.platform.model.c.a().b() == 0) {
                if (baseBottomStatusMainController.i == null) {
                    if (baseBottomStatusMainController.k instanceof ViewStub) {
                        baseBottomStatusMainController.k = ((ViewStub) baseBottomStatusMainController.k).inflate();
                    }
                    baseBottomStatusMainController.i = new com.sankuai.waimai.business.page.homepage.view.c(baseBottomStatusMainController.b, baseBottomStatusMainController.b, baseBottomStatusMainController.k);
                }
                if (baseBottomStatusMainController.j != null) {
                    baseBottomStatusMainController.j.e();
                    baseBottomStatusMainController.j = null;
                }
                baseBottomStatusMainController.c = baseBottomStatusMainController.i;
                baseBottomStatusMainController.i.a(aVar);
                if (!baseBottomStatusMainController.h && !baseBottomStatusMainController.e(2) && (!baseBottomStatusMainController.e(1) || !baseBottomStatusMainController.p)) {
                    baseBottomStatusMainController.i.b();
                } else {
                    baseBottomStatusMainController.i.d();
                }
                baseBottomStatusMainController.a(true, false);
                c.a().g = true;
                return true;
            }
        }
        c.a().g = false;
        if (baseBottomStatusMainController.i != null) {
            baseBottomStatusMainController.i.e();
            baseBottomStatusMainController.a(false, false);
            c.a().f = false;
        }
        if (!(baseBottomStatusMainController.c instanceof e)) {
            baseBottomStatusMainController.c = null;
        }
        return false;
    }

    public static /* synthetic */ boolean a(BaseBottomStatusMainController baseBottomStatusMainController, boolean z) {
        baseBottomStatusMainController.o = false;
        return false;
    }

    public static /* synthetic */ void c(BaseBottomStatusMainController baseBottomStatusMainController) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, baseBottomStatusMainController, changeQuickRedirect, false, "c2cf19792ed16399de90bbfb9b473110", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, baseBottomStatusMainController, changeQuickRedirect, false, "c2cf19792ed16399de90bbfb9b473110");
            return;
        }
        Pair<Long, Long> d = baseBottomStatusMainController.d();
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmHomePageCommonApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmHomePageCommonApi.class)).getWeatherStatus(((Long) d.first).longValue(), ((Long) d.second).longValue()), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.page.homepage.response.b>>() { // from class: com.sankuai.waimai.business.page.homepage.controller.BaseBottomStatusMainController.3
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26c6fa6707e0f8da3d22bf2f8ac716be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26c6fa6707e0f8da3d22bf2f8ac716be");
                    return;
                }
                if (baseResponse != null && baseResponse.data != 0) {
                    c.a().b = (com.sankuai.waimai.business.page.homepage.response.b) baseResponse.data;
                }
                BaseBottomStatusMainController.this.f();
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aaa674971e9ff1d068c8600fe2691d6f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aaa674971e9ff1d068c8600fe2691d6f");
                } else {
                    BaseBottomStatusMainController.this.f();
                }
            }
        }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
    }

    public BaseBottomStatusMainController(Activity activity, Handler handler, ViewStub viewStub, ViewStub viewStub2) {
        Object[] objArr = {activity, handler, viewStub, viewStub2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dbfafbe1d455e2f2c6d27e83f015682", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dbfafbe1d455e2f2c6d27e83f015682");
            return;
        }
        this.h = false;
        this.e = 60000;
        this.m = 0;
        this.n = 0;
        this.f = new Runnable() { // from class: com.sankuai.waimai.business.page.homepage.controller.BaseBottomStatusMainController.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c35b56b839eef8a1da8504e2a03b2b1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c35b56b839eef8a1da8504e2a03b2b1");
                    return;
                }
                BaseBottomStatusMainController.this.b();
                if (BaseBottomStatusMainController.a(BaseBottomStatusMainController.this) < 240) {
                    BaseBottomStatusMainController.this.d.postDelayed(BaseBottomStatusMainController.this.f, BaseBottomStatusMainController.this.e);
                }
            }
        };
        this.p = false;
        this.b = activity;
        this.d = handler;
        this.k = viewStub;
        this.l = viewStub2;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e34a6091e9119ab69f3b52671b2fa544", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e34a6091e9119ab69f3b52671b2fa544");
        } else if (this.k == null || this.l == null) {
        } else {
            this.m = 0;
            this.d.postDelayed(this.f, this.e);
            if ((this.c instanceof e) && this.j != null) {
                c a2 = c.a();
                if (a2.c != null) {
                    a(this.n, a2.b != null);
                } else {
                    this.j.e();
                    a(false, false);
                }
            }
            b();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "757d729bed0d91922c6547ec5bb71b69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "757d729bed0d91922c6547ec5bb71b69");
        } else if (this.o) {
        } else {
            if (!com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                if (this.i != null && this.i.f()) {
                    this.i.d();
                }
                e();
                if (this.b instanceof FragmentActivity) {
                    ((HomeSideBarViewModel) q.a((FragmentActivity) this.b).a(HomeSideBarViewModel.class)).c.b((k<Boolean>) Boolean.FALSE);
                    return;
                }
                return;
            }
            CityInfo a2 = com.sankuai.waimai.platform.utils.a.a();
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmHomePageCommonApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmHomePageCommonApi.class)).fetchOrderStatus(a2.selectSecondCityId, a2.selectThirdCityId, a2.actualSecondCityId, a2.actualThirdCityId), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.page.homepage.response.a>>() { // from class: com.sankuai.waimai.business.page.homepage.controller.BaseBottomStatusMainController.2
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7efae17e8a9eb3f1367e429f681d3e0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7efae17e8a9eb3f1367e429f681d3e0");
                        return;
                    }
                    BaseBottomStatusMainController.a(BaseBottomStatusMainController.this, false);
                    if (baseResponse != null) {
                        try {
                            new com.sankuai.waimai.platform.capacity.network.errorhanding.d().a(baseResponse.code, baseResponse.msg);
                        } catch (com.sankuai.waimai.platform.capacity.network.errorhanding.e e) {
                            f.a((Exception) e, BaseBottomStatusMainController.this.b);
                        }
                    }
                    if (baseResponse != null && baseResponse.isSuccess() && baseResponse.data != 0 && BaseBottomStatusMainController.a(BaseBottomStatusMainController.this, (com.sankuai.waimai.business.page.homepage.response.a) baseResponse.data)) {
                        BaseBottomStatusMainController.c(BaseBottomStatusMainController.this);
                        if (BaseBottomStatusMainController.this.b instanceof FragmentActivity) {
                            ((HomeSideBarViewModel) q.a((FragmentActivity) BaseBottomStatusMainController.this.b).a(HomeSideBarViewModel.class)).c.b((k<Boolean>) Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                    c.a().f = false;
                    BaseBottomStatusMainController.this.e();
                    if (BaseBottomStatusMainController.this.b instanceof FragmentActivity) {
                        ((HomeSideBarViewModel) q.a((FragmentActivity) BaseBottomStatusMainController.this.b).a(HomeSideBarViewModel.class)).c.b((k<Boolean>) Boolean.FALSE);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "844e128eb4f32634efe5758a632f0ebf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "844e128eb4f32634efe5758a632f0ebf");
                        return;
                    }
                    BaseBottomStatusMainController.a(BaseBottomStatusMainController.this, false);
                    c.a().f = false;
                    BaseBottomStatusMainController.this.e();
                    c.a().g = false;
                    if (BaseBottomStatusMainController.this.b instanceof FragmentActivity) {
                        ((HomeSideBarViewModel) q.a((FragmentActivity) BaseBottomStatusMainController.this.b).a(HomeSideBarViewModel.class)).c.b((k<Boolean>) Boolean.FALSE);
                    }
                }
            }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
            this.o = true;
        }
    }

    private Pair<Long, Long> d() {
        long j;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c1bfd8d55877497e7647da729d429a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c1bfd8d55877497e7647da729d429a4");
        }
        List<MtBackCityInfo> u = h.u();
        long j2 = 0;
        if (u != null) {
            if (!u.isEmpty()) {
                j = 0;
                for (MtBackCityInfo mtBackCityInfo : u) {
                    try {
                        if (mtBackCityInfo.level == 2) {
                            j2 = Long.parseLong(mtBackCityInfo.id);
                        } else if (mtBackCityInfo.level == 3) {
                            j = Long.parseLong(mtBackCityInfo.id);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                return new Pair<>(Long.valueOf(j2), Long.valueOf(j));
            }
        }
        j = 0;
        return new Pair<>(Long.valueOf(j2), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a0196bfb9cda3b41268847f815f64ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a0196bfb9cda3b41268847f815f64ca");
            return;
        }
        c a2 = c.a();
        if (!a2.c() || e(2)) {
            return;
        }
        if (e(1) && this.p) {
            return;
        }
        com.sankuai.waimai.business.page.homepage.response.b bVar = a2.b;
        if (bVar != null) {
            a(bVar, true);
        } else if (!a2.d) {
            this.g = new c.a() { // from class: com.sankuai.waimai.business.page.homepage.controller.BaseBottomStatusMainController.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.page.homepage.controller.c.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27988be936b3b031ba2877cb1a9eb9d2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27988be936b3b031ba2877cb1a9eb9d2");
                    } else if (BaseBottomStatusMainController.this.c instanceof com.sankuai.waimai.business.page.homepage.view.c) {
                    } else {
                        BaseBottomStatusMainController.this.e();
                    }
                }
            };
            a2.e = this.g;
        } else {
            a2.f = true;
            CityInfo a3 = com.sankuai.waimai.platform.utils.a.a();
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmHomePageCommonApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmHomePageCommonApi.class)).getWeatherStatus(a3.selectSecondCityId, a3.selectThirdCityId), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.page.homepage.response.b>>() { // from class: com.sankuai.waimai.business.page.homepage.controller.BaseBottomStatusMainController.5
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da856787fbaa3b47cb8760e4ad8e0cd2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da856787fbaa3b47cb8760e4ad8e0cd2");
                    } else if (baseResponse == null || baseResponse.data == 0 || baseResponse.code != 0) {
                        if ((BaseBottomStatusMainController.this.c instanceof com.sankuai.waimai.business.page.homepage.view.c) || BaseBottomStatusMainController.this.j == null) {
                            return;
                        }
                        BaseBottomStatusMainController.this.j.e();
                        BaseBottomStatusMainController.a(BaseBottomStatusMainController.this, (e) null);
                        BaseBottomStatusMainController.this.c = null;
                        BaseBottomStatusMainController.this.a(false, false);
                    } else {
                        BaseBottomStatusMainController.this.a((com.sankuai.waimai.business.page.homepage.response.b) baseResponse.data, false);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "103aa3e7e541eca6947f6bcb4b6feaa6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "103aa3e7e541eca6947f6bcb4b6feaa6");
                    } else if ((BaseBottomStatusMainController.this.c instanceof com.sankuai.waimai.business.page.homepage.view.c) || BaseBottomStatusMainController.this.j == null) {
                    } else {
                        BaseBottomStatusMainController.this.j.e();
                        BaseBottomStatusMainController.a(BaseBottomStatusMainController.this, (e) null);
                        BaseBottomStatusMainController.this.c = null;
                        BaseBottomStatusMainController.this.a(false, false);
                    }
                }
            }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
        }
    }

    public final void a(com.sankuai.waimai.business.page.homepage.response.b bVar, boolean z) {
        ABStrategy f;
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd0758234afc8ace87e3095551b61c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd0758234afc8ace87e3095551b61c0");
        } else if (bVar == null || !e.b(bVar)) {
            if (this.j != null) {
                this.j.e();
                a(false, false);
            }
            this.c = null;
        } else {
            c.a().b = bVar;
            if (this.j == null) {
                if (this.l instanceof ViewStub) {
                    this.l = ((ViewStub) this.l).inflate();
                }
                this.j = new e(this.b, this.l);
            }
            if (this.i != null) {
                this.i.e();
                this.i = null;
            }
            if (com.sankuai.waimai.foundation.core.a.d() && (f = com.sankuai.waimai.business.page.common.abtest.a.f()) != null && TextUtils.equals(f.expName, ErrorCode.ERROR_TYPE_B)) {
                a(false, false);
                return;
            }
            this.j.a(bVar);
            this.c = this.j;
            if (!this.h && !e(2) && (!e(1) || !this.p)) {
                b(!z ? 1 : 0);
            }
            a(false, true);
        }
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3409132c6e8524d6f7e392a12d9fa4eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3409132c6e8524d6f7e392a12d9fa4eb");
        } else if (this.j == null) {
        } else {
            this.j.n = z;
            b.a aVar = c.a().c;
            if (aVar == null) {
                this.j.a(true, c(this.n), d(this.n));
                return;
            }
            this.j.a(false, c(this.n), d(this.n));
            if (aVar == b.a.OPEN) {
                this.j.a(false, false);
            } else {
                this.j.a(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc539ba4fed864ba19da2319daaf95d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc539ba4fed864ba19da2319daaf95d3");
            return;
        }
        Message obtainMessage = this.d.obtainMessage();
        obtainMessage.what = 2;
        obtainMessage.arg1 = z ? 1 : 0;
        obtainMessage.arg2 = z2 ? 1 : 0;
        this.d.sendMessage(obtainMessage);
        if (!com.sankuai.waimai.foundation.core.a.d() || z) {
            return;
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58559958b6b545d97e5718e93542b55b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58559958b6b545d97e5718e93542b55b");
            return;
        }
        Message obtainMessage = this.d.obtainMessage();
        obtainMessage.what = 3;
        this.d.sendMessage(obtainMessage);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b35d092f02be146fdeb6fe9abe60f57f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b35d092f02be146fdeb6fe9abe60f57f");
        } else if (this.d != null) {
            this.d.removeCallbacks(this.f);
        }
    }

    private String c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "464ea676eac75588ba6d786fa4b5dd65", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "464ea676eac75588ba6d786fa4b5dd65") : i == 0 ? com.sankuai.waimai.foundation.core.a.d() ? "b_waimai_k78emg9k_mv" : "b_dtxfpl83" : "b_kkkybbtv";
    }

    private String d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b11bf317551f5d228906dcf93449fa8f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b11bf317551f5d228906dcf93449fa8f") : i == 0 ? com.sankuai.waimai.foundation.core.a.d() ? "b_waimai_k78emg9k_mc" : "b_ekcy6m0n" : "b_7cxggr94";
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3c7620edccffc583830eac857febd83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3c7620edccffc583830eac857febd83");
            return;
        }
        this.n = i;
        if (this.c == null) {
            return;
        }
        a(i, true);
        if (com.sankuai.waimai.foundation.core.a.d() && this.n == 0 && c.a().b != null) {
            f();
        }
    }

    private void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aed4ee4a1ec95aca019160ba932023f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aed4ee4a1ec95aca019160ba932023f5");
        } else if (this.c instanceof com.sankuai.waimai.business.page.homepage.view.c) {
            if ((this.h && i == 0) || e(2) || (e(1) && this.p)) {
                this.i.d();
            } else {
                this.i.c();
            }
        } else if (this.c instanceof e) {
            if ((this.h && i == 0) || e(2) || (e(1) && this.p)) {
                this.j.d();
            } else {
                b(z);
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        Object[] objArr = {absListView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f27d06baf5beb293e44c3a03d77e42dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f27d06baf5beb293e44c3a03d77e42dd");
        } else if (i == 1 && this.c != null && this.c == this.j) {
            this.c.a(true);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6798dd9694468c00c8501ec3eb59463c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6798dd9694468c00c8501ec3eb59463c");
            return;
        }
        this.h = true;
        if (this.c != null) {
            this.c.d();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController.a
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fef08bfe254af7e016e61f81850f3c53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fef08bfe254af7e016e61f81850f3c53");
            return;
        }
        this.h = false;
        if (this.c == null || e(2)) {
            return;
        }
        if (e(1) && this.p) {
            return;
        }
        if (this.c instanceof e) {
            b(false);
        } else if (this.c instanceof com.sankuai.waimai.business.page.homepage.view.c) {
            this.i.b();
        }
    }

    private boolean e(int i) {
        return this.n == i;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a043f57cde65dc703ab280a60cf5f0cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a043f57cde65dc703ab280a60cf5f0cb");
            return;
        }
        this.p = z;
        if (z && this.c != null && this.c.f()) {
            a(this.n, c.a().b != null);
        }
    }

    @Override // com.sankuai.waimai.imbase.d
    public void updateUnReadCount(@NonNull LongSparseArray<Integer> longSparseArray) {
        Object[] objArr = {longSparseArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c474a764e3fc146e1a273726905e94b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c474a764e3fc146e1a273726905e94b6");
        } else if (this.c == null || !(this.c instanceof com.sankuai.waimai.business.page.homepage.view.c)) {
        } else {
            ((com.sankuai.waimai.business.page.homepage.view.c) this.c).a(longSparseArray);
        }
    }
}
