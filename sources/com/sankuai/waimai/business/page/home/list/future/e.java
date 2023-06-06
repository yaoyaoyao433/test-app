package com.sankuai.waimai.business.page.home.list.future;

import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.msi.bean.ApiException;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.actionbar.HomeActionBarViewModel;
import com.sankuai.waimai.business.page.home.list.future.f;
import com.sankuai.waimai.business.page.home.utils.m;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.monitor.DovePageMonitor;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.sankuai.waimai.business.page.common.arch.a {
    public static ChangeQuickRedirect v;
    private HomePageViewModel A;
    private HomeActionBarViewModel B;
    private FutureViewModel C;
    private int D;
    private f E;
    private com.sankuai.waimai.rocks.expose.a F;
    private com.sankuai.waimai.business.page.home.c G;
    public FuturePagerAdapter w;
    private HomeFutureViewPager x;
    private PageFragment y;
    private com.sankuai.waimai.business.page.home.list.future.tab.a z;

    public static /* synthetic */ void a(e eVar, boolean z) {
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final void a(Rect rect) {
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void b(Rect rect) {
    }

    public static /* synthetic */ void a(e eVar, int i) {
        int max;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "778348cc758a5f61a7af8edb823e7067", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "778348cc758a5f61a7af8edb823e7067");
            return;
        }
        int e = com.sankuai.waimai.platform.capacity.immersed.a.a(eVar.y.F) ? com.sankuai.waimai.foundation.utils.g.e(eVar.y.F) : 0;
        HomeActionBarViewModel homeActionBarViewModel = eVar.B;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = HomeActionBarViewModel.a;
        if (PatchProxy.isSupport(objArr2, homeActionBarViewModel, changeQuickRedirect2, false, "f22556bd1697d0feadec342a4c980b28", RobustBitConfig.DEFAULT_VALUE)) {
            max = ((Integer) PatchProxy.accessDispatch(objArr2, homeActionBarViewModel, changeQuickRedirect2, false, "f22556bd1697d0feadec342a4c980b28")).intValue();
        } else if (com.sankuai.waimai.business.page.home.helper.b.a().c || homeActionBarViewModel.l) {
            max = Math.max(homeActionBarViewModel.b(), com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 47.0f));
        } else {
            max = Math.max(homeActionBarViewModel.b(), homeActionBarViewModel.c());
        }
        eVar.D = (max + e) - 1;
        int i2 = i - (eVar.D + 0);
        Object[] objArr3 = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect3 = v;
        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "44326ad62770ed9547ef31333e1a6551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "44326ad62770ed9547ef31333e1a6551");
            return;
        }
        ViewGroup.LayoutParams layoutParams = eVar.x.getLayoutParams();
        layoutParams.height = i2;
        eVar.x.setLayoutParams(layoutParams);
        View view = eVar.E.c;
        if (view == null || view.getLayoutParams() == null) {
            return;
        }
        view.getLayoutParams().height = i2;
        view.setLayoutParams(view.getLayoutParams());
    }

    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r0v59 */
    public static /* synthetic */ void a(e eVar, int i, BaseResponse baseResponse) {
        boolean z;
        ?? r0;
        RocksServerModel rocksServerModel;
        Object[] objArr = {Integer.valueOf(i), baseResponse};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "8fb84378cb1b5e2162e73157faab79a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "8fb84378cb1b5e2162e73157faab79a8");
            return;
        }
        RocksServerModel rocksServerModel2 = (RocksServerModel) baseResponse.data;
        Object[] objArr2 = {rocksServerModel2};
        ChangeQuickRedirect changeQuickRedirect2 = v;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "42d6efa7945942e7077f5c8654124ea9", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "42d6efa7945942e7077f5c8654124ea9")).booleanValue();
        } else {
            z = (rocksServerModel2 == null || rocksServerModel2.moduleList == null || rocksServerModel2.moduleList.size() <= 0 || rocksServerModel2.moduleList.get(0) == null || rocksServerModel2.moduleList.get(0).moduleList == null || rocksServerModel2.moduleList.get(0).moduleList.size() <= 0) ? false : true;
        }
        if (z) {
            rocksServerModel2 = rocksServerModel2.moduleList.get(0);
        }
        if (i != 3 && (rocksServerModel2 == null || com.sankuai.waimai.modular.utils.a.a(rocksServerModel2.moduleList))) {
            eVar.E.a(baseResponse);
            eVar.b(UserCenter.TYPE_LOGOUT_NEGATIVE);
            return;
        }
        if (eVar.a(rocksServerModel2.jsonData) && !com.sankuai.waimai.business.page.home.homecache.b.a().b()) {
            com.sankuai.waimai.business.page.home.list.future.complex.d.a().c();
            com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a a = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
            List<RocksServerModel> list = rocksServerModel2.moduleList;
            Object[] objArr3 = {list};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a;
            if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect3, false, "82bc491c15bc7e7856dff4ca4de5f417", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect3, false, "82bc491c15bc7e7856dff4ca4de5f417");
            } else if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
                a.d = new ArrayList(list);
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a;
                if (PatchProxy.isSupport(objArr4, a, changeQuickRedirect4, false, "c6b99fbe9f1bc64783f07fbc95c93242", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a, changeQuickRedirect4, false, "c6b99fbe9f1bc64783f07fbc95c93242");
                } else {
                    a.b = false;
                    a.c.clear();
                    a.e.clear();
                    a.g.clear();
                    a.h.clear();
                }
            }
            com.sankuai.waimai.business.page.home.list.future.complex.d a2 = com.sankuai.waimai.business.page.home.list.future.complex.d.a();
            Object[] objArr5 = {rocksServerModel2, 3};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.home.list.future.complex.d.a;
            if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "dd6716e8743705a8ebe771918144aa1b", RobustBitConfig.DEFAULT_VALUE)) {
                rocksServerModel = (RocksServerModel) PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "dd6716e8743705a8ebe771918144aa1b");
            } else {
                com.sankuai.waimai.foundation.utils.log.a.b("FeedTabsDataManager", "getListDataByCount : 3", new Object[0]);
                if (rocksServerModel2 == null || com.sankuai.waimai.modular.utils.a.a(rocksServerModel2.moduleList)) {
                    a2.b = true;
                    rocksServerModel = null;
                } else {
                    a2.i = rocksServerModel2.renderMode;
                    a2.j = rocksServerModel2.viewType;
                    a2.k = rocksServerModel2.layoutType;
                    a2.l = rocksServerModel2.layoutInfo;
                    a2.b = false;
                    a2.f = rocksServerModel2;
                    a2.d = rocksServerModel2.moduleList;
                    a2.a(rocksServerModel2.moduleList);
                    int size = a2.d.size();
                    int a3 = a2.a(3);
                    if (a3 >= size) {
                        a2.b = true;
                        a3 = size;
                    }
                    a2.f.moduleList = new ArrayList(a2.d.subList(0, a3));
                    a2.c = a3;
                    rocksServerModel = a2.f;
                }
            }
            if (rocksServerModel != null && !com.sankuai.waimai.modular.utils.a.a(rocksServerModel.moduleList)) {
                rocksServerModel2 = rocksServerModel;
            }
        }
        ArrayList arrayList = new ArrayList();
        Object[] objArr6 = {rocksServerModel2, arrayList};
        ChangeQuickRedirect changeQuickRedirect6 = v;
        if (PatchProxy.isSupport(objArr6, eVar, changeQuickRedirect6, false, "aba4b1f2dd8279884fedd346091bc2e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, eVar, changeQuickRedirect6, false, "aba4b1f2dd8279884fedd346091bc2e5");
        } else if (rocksServerModel2 != null) {
            arrayList.add(com.sankuai.waimai.business.page.home.list.future.model.a.a(rocksServerModel2));
        }
        FuturePagerAdapter futurePagerAdapter = eVar.w;
        Object[] objArr7 = {arrayList};
        ChangeQuickRedirect changeQuickRedirect7 = FuturePagerAdapter.a;
        if (PatchProxy.isSupport(objArr7, futurePagerAdapter, changeQuickRedirect7, false, "d1ae5b05a4287e76286d1dfc46e7cbc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, futurePagerAdapter, changeQuickRedirect7, false, "d1ae5b05a4287e76286d1dfc46e7cbc3");
        } else {
            if (futurePagerAdapter.b == null) {
                futurePagerAdapter.b = new SparseArray<>();
            }
            if (!futurePagerAdapter.a(arrayList, futurePagerAdapter.c)) {
                futurePagerAdapter.b.clear();
            }
            futurePagerAdapter.c.clear();
            if (!com.sankuai.waimai.modular.utils.a.a(arrayList)) {
                futurePagerAdapter.c.addAll(arrayList);
            }
            HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(futurePagerAdapter.d).a(HomePageViewModel.class);
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = FuturePagerAdapter.a;
            if (PatchProxy.isSupport(objArr8, futurePagerAdapter, changeQuickRedirect8, false, "5eb7cc0fb77b8734fe46985b375897cb", RobustBitConfig.DEFAULT_VALUE)) {
                r0 = ((Boolean) PatchProxy.accessDispatch(objArr8, futurePagerAdapter, changeQuickRedirect8, false, "5eb7cc0fb77b8734fe46985b375897cb")).booleanValue();
            } else {
                r0 = futurePagerAdapter.c.size() == 0 ? 1 : 0;
            }
            Object[] objArr9 = {Byte.valueOf((byte) r0)};
            ChangeQuickRedirect changeQuickRedirect9 = HomePageViewModel.a;
            if (PatchProxy.isSupport(objArr9, homePageViewModel, changeQuickRedirect9, false, "ec13c259c58fb5459915cdeb82055c6b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, homePageViewModel, changeQuickRedirect9, false, "ec13c259c58fb5459915cdeb82055c6b");
            } else {
                homePageViewModel.M = Boolean.valueOf((boolean) r0);
            }
        }
        eVar.w.notifyDataSetChanged();
        m.a().a("vp_notifyDataSetChanged+");
        final FutureViewModel futureViewModel = (FutureViewModel) q.a(eVar.y).a(FutureViewModel.class);
        futureViewModel.b.a(eVar.y, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.list.future.e.5
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr10 = {bool2};
                ChangeQuickRedirect changeQuickRedirect10 = a;
                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "50f23373f6996f6bbd67204634ba1fef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "50f23373f6996f6bbd67204634ba1fef");
                } else if (bool2 == null || !bool2.booleanValue()) {
                } else {
                    e.this.E.a();
                    futureViewModel.b.b(this);
                    futureViewModel.a(false);
                    e.this.b(200);
                }
            }
        });
    }

    public static /* synthetic */ void a(e eVar, int i, Throwable th, BaseResponse baseResponse) {
        Object[] objArr = {Integer.valueOf(i), th, baseResponse};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "ef6e4149183fe50c23c3c5555d69cd85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "ef6e4149183fe50c23c3c5555d69cd85");
        } else if (i == 3) {
            eVar.E.a();
        } else {
            f fVar = eVar.E;
            Object[] objArr2 = {th, baseResponse};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "d23550747148ac86d75cbc689f428aaf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "d23550747148ac86d75cbc689f428aaf");
            } else if (fVar.i != f.a.NET_ERROR) {
                fVar.b();
                fVar.f.setVisibility(0);
                fVar.e.setVisibility(0);
                fVar.g.setVisibility(0);
                if (baseResponse != null && !TextUtils.isEmpty(baseResponse.msg)) {
                    fVar.f.setText(baseResponse.msg);
                } else {
                    fVar.f.setText(fVar.m);
                }
                fVar.e.setImageResource(fVar.l);
                if (th != null) {
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.monitor.a.a;
                    ErrorCode errorCode = (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "c38eae800bad2ce89867441832834dda", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.monitor.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "c38eae800bad2ce89867441832834dda") : new com.sankuai.waimai.monitor.a((Context) null, th)).b;
                    String buildErrorCodeStr = errorCode.buildErrorCodeStr();
                    fVar.h.setVisibility(0);
                    fVar.h.setText(buildErrorCodeStr);
                    String randomPageId = errorCode.getRandomPageId();
                    com.sankuai.waimai.platform.widget.emptylayout.c.a(fVar.d(), buildErrorCodeStr, randomPageId, new com.sankuai.waimai.platform.widget.emptylayout.b(th, true));
                    i.d(new com.sankuai.waimai.business.page.home.log.a().a("home_page_future_tabs_api_error").b(buildErrorCodeStr).c("api原因导致页面显示失败异常").d(f.a(buildErrorCodeStr, baseResponse, com.sankuai.waimai.platform.capacity.log.f.a().a("/home/feeds/tabs"), randomPageId)).b(true).b());
                }
                fVar.a(fVar.d, fVar.o);
                fVar.g.setOnClickListener(fVar.p);
                fVar.c.setVisibility(0);
                fVar.a(f.a.NET_ERROR);
            }
            eVar.b(IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM);
        }
    }

    public static /* synthetic */ void b(e eVar, int i, BaseResponse baseResponse) {
        Object[] objArr = {Integer.valueOf(i), baseResponse};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "eb4cf9b973d0138965a15f9cd6bac031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "eb4cf9b973d0138965a15f9cd6bac031");
        } else if (i == 3) {
            eVar.E.a();
        } else {
            eVar.E.a(baseResponse);
            eVar.b(IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM);
        }
    }

    public e(PageFragment pageFragment) {
        super(pageFragment);
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "064da88c15df6340d7d0cf49a8659021", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "064da88c15df6340d7d0cf49a8659021");
        } else {
            this.y = pageFragment;
        }
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void a(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff69aa57c19e9f2798f132418b6d9ea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff69aa57c19e9f2798f132418b6d9ea8");
            return;
        }
        super.a(pageFragment);
        this.A = (HomePageViewModel) q.a(this.y).a(HomePageViewModel.class);
        this.B = (HomeActionBarViewModel) q.a(this.y).a(HomeActionBarViewModel.class);
        this.A.g.a(this.y, new l<Integer>() { // from class: com.sankuai.waimai.business.page.home.list.future.e.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d13b7dbf56b2b029d0cf9df0d8a5b2f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d13b7dbf56b2b029d0cf9df0d8a5b2f6");
                } else if (num2 != null) {
                    e.a(e.this, num2.intValue());
                }
            }
        });
        this.F = this.A.H;
        this.G = this.A.K;
        this.A.d.a(new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.list.future.e.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f0488b2b5b154daa10e0ce36ed29efe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f0488b2b5b154daa10e0ce36ed29efe");
                } else if (bool2 != null) {
                    e.a(e.this, bool2.booleanValue());
                }
            }
        });
        this.A.c.a(this.y, new l<com.sankuai.waimai.business.page.home.model.d>() { // from class: com.sankuai.waimai.business.page.home.list.future.e.3
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable com.sankuai.waimai.business.page.home.model.d dVar) {
                com.sankuai.waimai.business.page.home.model.d dVar2 = dVar;
                Object[] objArr2 = {dVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72b0df255976e247945c0e0236fdb3c0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72b0df255976e247945c0e0236fdb3c0");
                } else if (dVar2 != null) {
                    int i = dVar2.b;
                    int i2 = dVar2.c;
                    switch (i) {
                        case 0:
                            if (i2 != 3) {
                                e.this.E.c();
                                return;
                            }
                            return;
                        case 1:
                            e.a(e.this, i2, dVar2.d);
                            return;
                        case 2:
                            e.a(e.this, i2, dVar2.e, dVar2.d);
                            return;
                        case 3:
                            if (dVar2.d == null || dVar2.d.code == 0) {
                                e.b(e.this, i2, dVar2.d);
                                return;
                            } else {
                                e.a(e.this, i2, new ApiException(dVar2.d.code, dVar2.d.msg), dVar2.d);
                                return;
                            }
                        default:
                            return;
                    }
                }
            }
        });
        this.C = (FutureViewModel) q.a(this.y).a(FutureViewModel.class);
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3574608b62774ccc080969eebff8b93", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3574608b62774ccc080969eebff8b93");
        }
        this.u = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_page_home_future_layout, viewGroup, false);
        this.x = (HomeFutureViewPager) this.u.findViewById(R.id.home_view_Pager);
        HomeFutureViewPager homeFutureViewPager = this.x;
        PageFragment pageFragment = this.y;
        Object[] objArr2 = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect2 = HomeFutureViewPager.b;
        if (PatchProxy.isSupport(objArr2, homeFutureViewPager, changeQuickRedirect2, false, "5592299a17e601bb10349e19d6650ad6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, homeFutureViewPager, changeQuickRedirect2, false, "5592299a17e601bb10349e19d6650ad6");
        } else {
            homeFutureViewPager.c = (FutureViewModel) q.a(pageFragment).a(FutureViewModel.class);
        }
        View view = this.u;
        Object[] objArr3 = {view};
        ChangeQuickRedirect changeQuickRedirect3 = v;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "da286a2d813ff52f7d010134c8d06842", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "da286a2d813ff52f7d010134c8d06842");
        } else {
            this.E = new f(view, R.id.layout_info, R.layout.wm_page_home_complex_skeleton);
            this.E.q = "c_m84bv26";
            f fVar = this.E;
            fVar.j = R.string.wm_page_home_future_data_null;
            fVar.k = R.drawable.wm_common_default_empty_icon;
            fVar.o = 55;
            f fVar2 = this.E;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.e.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr4 = {view2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f519fdf5a65851c2c922c44bc9ae40bf", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f519fdf5a65851c2c922c44bc9ae40bf");
                    } else {
                        e.this.G.a(12);
                    }
                }
            };
            Object[] objArr4 = {Integer.valueOf((int) R.string.wm_page_home_future_net_error), Integer.valueOf((int) R.drawable.wm_common_default_net_error_icon), 55, onClickListener};
            ChangeQuickRedirect changeQuickRedirect4 = f.a;
            if (PatchProxy.isSupport(objArr4, fVar2, changeQuickRedirect4, false, "33848c09d1084a0f72133dadf5731b46", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, fVar2, changeQuickRedirect4, false, "33848c09d1084a0f72133dadf5731b46");
            } else {
                fVar2.m = R.string.wm_page_home_future_net_error;
                fVar2.l = R.drawable.wm_common_default_net_error_icon;
                fVar2.o = 55;
                fVar2.p = onClickListener;
            }
            this.E.n = 135;
        }
        this.E.c();
        this.w = new FuturePagerAdapter(this.y, this.x);
        this.x.setAdapter(this.w);
        a(this.y);
        this.w.e = this.F;
        this.z = new com.sankuai.waimai.business.page.home.list.future.tab.a(this.y, this.x);
        this.z.a((ViewGroup) this.u);
        return this.u;
    }

    private boolean a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23defd42f7b101d4667696c15a962fba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23defd42f7b101d4667696c15a962fba")).booleanValue();
        }
        if (map != null) {
            try {
                if (map.containsKey("page")) {
                    Object obj = map.get("page");
                    if ((obj instanceof Map) && ((Map) obj).containsKey("has_next_page")) {
                        return ((Boolean) ((Map) obj).get("has_next_page")).booleanValue();
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ebec1cc25bdc740a1161e13c88d8c4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ebec1cc25bdc740a1161e13c88d8c4e");
        } else if (this.y == null || this.y.getActivity() == null) {
        } else {
            DovePageMonitor.a(this.y.getActivity(), i);
        }
    }
}
