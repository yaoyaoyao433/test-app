package com.sankuai.waimai.business.page.home.list.future;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.graphics.Rect;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.pga.common.j;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.common.view.nested.NestedSmoothRecyclerView;
import com.sankuai.waimai.business.page.common.view.nested.NestedViewPager;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.basal.HomePageNestedScrollRecyclerView;
import com.sankuai.waimai.business.page.home.gray.HomeGrayManager;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.FeedBackDialog;
import com.sankuai.waimai.business.page.home.list.future.mach.DynamicImageTagProcessor;
import com.sankuai.waimai.business.page.home.list.future.mach.RateCrownTagProcessor;
import com.sankuai.waimai.business.page.home.list.future.modulelistheader.PersonalizedBean;
import com.sankuai.waimai.business.ugc.mach.live.MachLivePlayerNativeMethod;
import com.sankuai.waimai.business.ugc.mach.live.MachLivePlayerTagProcessor;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.irmo.mach.effect.WmEffectTagProcessor;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.component.scroller.ScrollerTagProcessor;
import com.sankuai.waimai.mach.component.swiper.SwiperTagProcessor;
import com.sankuai.waimai.mach.js.HttpJSNativeMethod;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.platform.capacity.ad.WMADStrategyNativeModule;
import com.sankuai.waimai.platform.mach.tag.DynamicTagProcessor;
import com.sankuai.waimai.platform.mach.webpimage.WebpImageTagProcessor;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.rocks.view.a;
import com.sankuai.waimai.rocks.view.block.d;
import com.sankuai.waimai.rocks.view.c;
import com.sankuai.waimai.rocks.view.mach.c;
import com.sankuai.waimai.rocks.view.mach.d;
import com.sankuai.waimai.rocks.view.recyclerview.a;
import com.sankuai.waimai.rocks.view.recyclerview.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a extends com.sankuai.waimai.business.page.common.arch.a<com.sankuai.waimai.business.page.home.list.future.model.a> implements h {
    public static ChangeQuickRedirect v;
    public com.sankuai.waimai.business.page.home.list.future.model.a A;
    protected com.sankuai.waimai.business.page.home.list.future.model.c B;
    protected List<b.a.C1086a> C;
    protected PersonalizedBean D;
    public NestedSmoothRecyclerView E;
    public com.sankuai.waimai.rocks.view.a F;
    protected com.sankuai.waimai.rocks.view.mach.d G;
    public com.sankuai.waimai.rocks.view.recyclerview.b H;
    public com.sankuai.waimai.business.page.home.list.future.filterBar.d I;
    public com.sankuai.waimai.business.page.common.list.ai.c J;
    public HomePageViewModel K;
    protected com.sankuai.waimai.business.page.home.list.future.user_prefer_collect.a L;
    public b M;
    public FeedBackDialog N;
    public com.sankuai.waimai.business.page.home.list.future.complex.f O;
    public com.sankuai.waimai.business.page.home.list.future.mach.b P;
    protected InterfaceC0782a Q;
    private NestedViewPager R;
    private boolean S;
    private Rect T;
    private com.sankuai.waimai.rocks.expose.a U;
    private com.sankuai.waimai.platform.widget.emptylayout.d V;
    private int W;
    private boolean X;
    private List<Integer> Y;
    private com.sankuai.waimai.business.page.home.list.future.modulelistheader.a Z;
    private int aa;
    private b.a ab;
    private c.a ac;
    private com.sankuai.waimai.business.page.home.interfacer.b ad;
    protected String w;
    public PageFragment x;
    protected String y;
    public boolean z;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.list.future.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0782a {
        void a();

        void a(int i, com.sankuai.waimai.mach.node.a aVar);

        void a(String str, String str2, int i, String str3, com.sankuai.waimai.mach.node.a aVar);

        void a(Map map);

        String b();
    }

    public void P() {
    }

    public abstract void Q();

    public abstract com.sankuai.waimai.mach.d R();

    public Map<String, Object> S() {
        return null;
    }

    public abstract void a(View view, int i);

    public abstract void a(com.sankuai.waimai.platform.widget.emptylayout.d dVar);

    public abstract void a(String str, String str2, int i, int i2, List<String> list, List<String> list2, String str3, com.sankuai.waimai.mach.node.a aVar);

    public static /* synthetic */ Object a(a aVar, Map map, String str, Class cls) {
        Object[] objArr = {map, str, cls};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "c9080b767945f02d07e48b81eed2184d", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "c9080b767945f02d07e48b81eed2184d");
        }
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if ((obj instanceof Number) || (obj instanceof String)) {
            return cls.cast(map.get(str));
        }
        return null;
    }

    public static /* synthetic */ void a(a aVar, int i) {
        com.sankuai.waimai.rocks.view.recyclerview.a aVar2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "58fecd6b14172da49b361b58525a226a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "58fecd6b14172da49b361b58525a226a");
        } else if (aVar.H == null || i == -1 || (aVar2 = aVar.H.h) == null) {
        } else {
            List<com.sankuai.waimai.rocks.view.viewmodel.e> list = aVar2.b;
            int itemCount = aVar2.getItemCount();
            if (list == null || i >= list.size() || i >= itemCount) {
                return;
            }
            list.remove(i);
            try {
                aVar2.notifyItemRemoved(i);
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void a(a aVar, RecyclerView recyclerView) {
        boolean z;
        int i;
        int i2;
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "72b512d89425c16493d7a1fe4e01256b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "72b512d89425c16493d7a1fe4e01256b");
        } else if (recyclerView != null) {
            boolean a = com.sankuai.waimai.irmo.utils.b.a().a(1003, "wm_homepage_future_poi_style_1");
            com.sankuai.waimai.foundation.utils.log.a.c("FutureBlock", "[handleSecondItemShowEffect] effectNeedDowngrade == " + a, new Object[0]);
            if (a) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                i = linearLayoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                com.sankuai.waimai.foundation.utils.log.a.c("FutureBlock", "firstVisiblePos:" + i, new Object[0]);
                i2 = findLastVisibleItemPosition;
                z = true;
            } else {
                z = false;
                i = 0;
                i2 = 0;
            }
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int[] findFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstVisibleItemPositions(null);
                int[] findLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
                com.sankuai.waimai.foundation.utils.log.a.c("FutureBlock", "firstVisiblePositions:" + Arrays.toString(findFirstVisibleItemPositions), new Object[0]);
                if (findFirstVisibleItemPositions.length > 0) {
                    i = findFirstVisibleItemPositions[findFirstVisibleItemPositions.length - 1];
                }
                if (findLastVisibleItemPositions.length > 0) {
                    i2 = findLastVisibleItemPositions[findLastVisibleItemPositions.length - 1];
                }
                z = true;
            }
            if (z) {
                com.sankuai.waimai.rocks.view.recyclerview.a aVar2 = (com.sankuai.waimai.rocks.view.recyclerview.a) recyclerView.getAdapter();
                if (aVar.W != i) {
                    List<com.sankuai.waimai.rocks.view.viewmodel.e> list = aVar2.b;
                    if (!aVar.Y.isEmpty()) {
                        ListIterator<Integer> listIterator = aVar.Y.listIterator();
                        while (listIterator.hasNext()) {
                            Integer next = listIterator.next();
                            if (next.intValue() >= i && next.intValue() <= i2) {
                                com.sankuai.waimai.foundation.utils.log.a.c("FutureBlock", "hide-position:" + next, new Object[0]);
                                aVar.a(list, next.intValue(), false);
                                listIterator.remove();
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder("show-position:");
                    int i3 = i + 1;
                    sb.append(i3);
                    com.sankuai.waimai.foundation.utils.log.a.c("FutureBlock", sb.toString(), new Object[0]);
                    aVar.a(list, i3, true);
                    int i4 = aVar.W + 1;
                    if (i4 >= i && i4 <= i2) {
                        com.sankuai.waimai.foundation.utils.log.a.c("FutureBlock", "hide-position:" + i4, new Object[0]);
                        aVar.a(list, i4, false);
                    } else {
                        aVar.Y.add(Integer.valueOf(i4));
                    }
                    aVar.W = i;
                }
            }
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "6ce437cdc6b7147bca6e78e02d1c61d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "6ce437cdc6b7147bca6e78e02d1c61d9");
        } else if (aVar.I != null) {
            com.sankuai.waimai.business.page.home.list.future.filterBar.d dVar = aVar.I;
            Object[] objArr2 = {(byte) 0};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.list.future.filterBar.d.v;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "400b2cb572fe246db2d7f7a59abc37bc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "400b2cb572fe246db2d7f7a59abc37bc");
            } else if (dVar.x != null) {
                dVar.x.b(false);
            }
        }
    }

    public a(PageFragment pageFragment, NestedViewPager nestedViewPager, com.sankuai.waimai.rocks.expose.a aVar, String str) {
        super(pageFragment);
        Object[] objArr = {pageFragment, nestedViewPager, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "143af213ca037f7976c948ab0e507563", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "143af213ca037f7976c948ab0e507563");
            return;
        }
        this.L = new com.sankuai.waimai.business.page.home.list.future.user_prefer_collect.a();
        this.W = -1;
        this.X = false;
        this.Y = new ArrayList();
        this.O = new com.sankuai.waimai.business.page.home.list.future.complex.f();
        this.aa = 0;
        this.ab = new b.a() { // from class: com.sankuai.waimai.business.page.home.list.future.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.view.recyclerview.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "850845c85ee1e79312f91b5f1ad4248f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "850845c85ee1e79312f91b5f1ad4248f");
                    return;
                }
                a.this.Q();
                a.this.H.c(1);
            }
        };
        this.ac = new c.a() { // from class: com.sankuai.waimai.business.page.home.list.future.a.12
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.view.c.a
            public final boolean a(com.sankuai.waimai.rocks.node.a aVar2, boolean z) {
                Object[] objArr2 = {aVar2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd0cdbee4931a95587400653c61760ff", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd0cdbee4931a95587400653c61760ff")).booleanValue();
                }
                if (aVar2 != null && TextUtils.equals(aVar2.c, "waimai_mach_usercenter_homepage_future_poi_fold_card")) {
                    if (z) {
                        a.this.L.a();
                    } else {
                        com.sankuai.waimai.business.page.home.list.future.user_prefer_collect.a aVar3 = a.this.L;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.list.future.user_prefer_collect.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar3, changeQuickRedirect3, false, "132d76a4233e6fec230bbb3e3c855f67", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar3, changeQuickRedirect3, false, "132d76a4233e6fec230bbb3e3c855f67");
                        } else {
                            aVar3.b--;
                        }
                    }
                    return false;
                }
                return true;
            }
        };
        this.Q = new InterfaceC0782a() { // from class: com.sankuai.waimai.business.page.home.list.future.a.14
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.list.future.a.InterfaceC0782a
            public final void a(int i, com.sankuai.waimai.mach.node.a aVar2) {
                com.sankuai.waimai.rocks.view.viewmodel.d G;
                Object[] objArr2 = {Integer.valueOf(i), aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1751c30d11afddb9e6d759c0acef0acd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1751c30d11afddb9e6d759c0acef0acd");
                } else if (a.this.H == null || a.this.H.G() == null || (G = a.this.H.G()) == null || com.sankuai.waimai.modular.utils.a.a(G.o)) {
                } else {
                    List<com.sankuai.waimai.rocks.view.viewmodel.e> list = G.o;
                    if (list.get(i) != null) {
                        ((com.sankuai.waimai.rocks.view.viewmodel.a) list.get(i)).p = new com.sankuai.waimai.mach.recycler.g(aVar2.f.getTemplateId(), aVar2);
                    }
                }
            }

            @Override // com.sankuai.waimai.business.page.home.list.future.a.InterfaceC0782a
            public final void a(Map map) {
                boolean z;
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2477f82f2f263f7307abfb8bda31f9d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2477f82f2f263f7307abfb8bda31f9d");
                    return;
                }
                if (map != null) {
                    com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a a2 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
                    long longValue = ((Long) a.a(a.this, map, "childId", Long.class)).longValue();
                    Object[] objArr3 = {new Long(longValue)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "8123c00127707edfdf7ed5130b58da17", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "8123c00127707edfdf7ed5130b58da17")).booleanValue();
                    } else {
                        z = a2.f.containsKey(Long.valueOf(longValue)) && a2.f.get(Long.valueOf(longValue)).booleanValue();
                    }
                    if (!z) {
                        a aVar2 = a.this;
                        FeedBackDialog feedBackDialog = new FeedBackDialog();
                        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.a.b = "c_m84bv26";
                        feedBackDialog.b = 1;
                        Object[] objArr4 = {map};
                        ChangeQuickRedirect changeQuickRedirect4 = FeedBackDialog.a;
                        if (PatchProxy.isSupport(objArr4, feedBackDialog, changeQuickRedirect4, false, "dac081c26d4bce432e7059489bb2cc1e", RobustBitConfig.DEFAULT_VALUE)) {
                            feedBackDialog = (FeedBackDialog) PatchProxy.accessDispatch(objArr4, feedBackDialog, changeQuickRedirect4, false, "dac081c26d4bce432e7059489bb2cc1e");
                        } else {
                            feedBackDialog.c = (Long) feedBackDialog.a(map, "childId", Long.class);
                            feedBackDialog.d = (String) feedBackDialog.a(map, "rank_list_id", String.class);
                            feedBackDialog.e = (String) feedBackDialog.a(map, "rank_trace_id", String.class);
                            feedBackDialog.f = (String) feedBackDialog.a(map, "data_id", String.class);
                        }
                        aVar2.N = feedBackDialog;
                        a.this.N.show(a.this.x.getChildFragmentManager(), "");
                        return;
                    }
                }
                ae.a((Activity) a.this.x.getActivity(), "您已提交问卷");
            }

            @Override // com.sankuai.waimai.business.page.home.list.future.a.InterfaceC0782a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "356de115553068679c6b9b4e1ead7b83", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "356de115553068679c6b9b4e1ead7b83");
                } else {
                    a.this.P();
                }
            }

            @Override // com.sankuai.waimai.business.page.home.list.future.a.InterfaceC0782a
            public final String b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "02a20e0de323585b0a82b5f94cc1cce1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "02a20e0de323585b0a82b5f94cc1cce1") : AppUtil.generatePageInfoKey(this);
            }

            @Override // com.sankuai.waimai.business.page.home.list.future.a.InterfaceC0782a
            public final void a(String str2, String str3, int i, String str4, com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {str2, str3, Integer.valueOf(i), str4, aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6a0a3e51fe21cb42c0802210ff7c54b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6a0a3e51fe21cb42c0802210ff7c54b");
                } else if (a.this.H == null || a.this.H.G() == null || a.this.J == null) {
                } else {
                    a.this.a(str2, str3, a.this.F.d.g.getChildViewHolder(aVar2.c().f.getContainer()).getAdapterPosition(), i, a.this.J.a(aVar2, false), a.this.J.a(aVar2, true), str4, aVar2);
                }
            }
        };
        this.ad = new com.sankuai.waimai.business.page.home.interfacer.b() { // from class: com.sankuai.waimai.business.page.home.list.future.a.10
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.interfacer.b
            public final void b(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97398bf71291db5597c10fae37f7b82c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97398bf71291db5597c10fae37f7b82c");
                } else {
                    a.this.H.b(i);
                }
            }
        };
        this.x = pageFragment;
        this.R = nestedViewPager;
        this.U = aVar;
        this.w = str;
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    /* renamed from: a */
    public void d(com.sankuai.waimai.business.page.home.list.future.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4d5361aafa401972bcfd7fb099ac01f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4d5361aafa401972bcfd7fb099ac01f");
            return;
        }
        this.A = aVar;
        if (this.A != null) {
            this.B = this.A.l;
        }
        this.z = aVar.k;
        this.y = getClass().getSimpleName() + hashCode();
        this.C = aVar.b();
        this.D = aVar.a();
        V();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = v;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "119bf925d89ec68ba24f501fbf446b57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "119bf925d89ec68ba24f501fbf446b57");
        } else if (!TextUtils.equals(com.sankuai.waimai.platform.settings.a.a().b(), "0") && this.D != null && this.D.isCardDataValid() && this.H != null) {
            if (this.Z == null) {
                this.Z = new com.sankuai.waimai.business.page.home.list.future.modulelistheader.a(this.M, this.x);
            }
            this.Z.c(this.D);
            RecyclerView.a adapter = this.H.g.getAdapter();
            if (adapter instanceof com.sankuai.waimai.rocks.view.recyclerview.a) {
                ((com.sankuai.waimai.rocks.view.recyclerview.a) adapter).f = this.Z;
            }
        }
        this.W = -1;
        this.X = false;
        this.Y.clear();
    }

    private void V() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48e7f86f38dd0d4c6ccee51ce5e662be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48e7f86f38dd0d4c6ccee51ce5e662be");
            return;
        }
        if (this.I != null) {
            this.I.d(this.C);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (this.I.P()) {
                layoutParams.setMargins(0, this.I.Q(), 0, 0);
                this.E.setLayoutParams(layoutParams);
                this.V.a().setLayoutParams(layoutParams);
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
                this.E.setLayoutParams(layoutParams);
                this.V.a().setLayoutParams(layoutParams);
            }
        }
        if (this.S) {
            this.R.setEventPointExcludeHeight(this.I != null ? this.I.Q() : 0);
        }
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5187093cc99ccc581bf3706805e51bff", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5187093cc99ccc581bf3706805e51bff");
        }
        View inflate = LayoutInflater.from(this.t).inflate(R.layout.wm_page_home_future_block_layout, viewGroup, false);
        this.E = (NestedSmoothRecyclerView) inflate.findViewById(R.id.future_list);
        this.E.setNestedScrollListener(new com.sankuai.waimai.business.page.common.view.nested.d() { // from class: com.sankuai.waimai.business.page.home.list.future.a.15
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.common.view.nested.d
            public final void a(View view, int i) {
                Object[] objArr2 = {view, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b4f6861841c44264505e0ea15605004", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b4f6861841c44264505e0ea15605004");
                    return;
                }
                com.sankuai.waimai.business.page.home.helper.c a2 = com.sankuai.waimai.business.page.home.helper.c.a();
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.helper.c.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "2e4ffa4ff94327dad2cc5db3bc33bca8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "2e4ffa4ff94327dad2cc5db3bc33bca8");
                } else {
                    if (a2.d) {
                        com.sankuai.waimai.foundation.utils.log.a.e("HomePageSmoothScrollHelper", "childScrollState:" + i, new Object[0]);
                    }
                    if (a2.c != i) {
                        a2.c = i;
                        a2.b();
                    }
                }
                a.this.H.a(view, i);
                a aVar = a.this;
                Object[] objArr4 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = a.v;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "3172a537d715e4a74a6799e1faab90aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "3172a537d715e4a74a6799e1faab90aa");
                } else if (i == 0) {
                    Metrics.getInstance().stopCustomFPS("homepage_complex_scroll");
                } else if (i == 1) {
                    Metrics.getInstance().startCustomFPS("homepage_complex_scroll");
                }
                com.sankuai.waimai.foundation.utils.log.a.c("FutureBlock", "onScrollStateChanged:newState-" + i, new Object[0]);
                if (i == 0) {
                    try {
                        a.a(a.this, (RecyclerView) view);
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.a("FutureBlock", e);
                    }
                }
            }

            @Override // com.sankuai.waimai.business.page.common.view.nested.d
            public final void b(View view, int i) {
                Object[] objArr2 = {view, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6216ad20ebb7ebc654a9c58ede89d3a6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6216ad20ebb7ebc654a9c58ede89d3a6");
                    return;
                }
                com.sankuai.waimai.business.page.home.list.a.a().g = i;
                a.this.a(view, i);
            }
        });
        this.I = new com.sankuai.waimai.business.page.home.list.future.filterBar.d(this.x, this.E, this.w);
        this.I.a((ViewGroup) inflate);
        if (this.I.w != this.C) {
            V();
        }
        this.V = new com.sankuai.waimai.platform.widget.emptylayout.d(inflate);
        inflate.findViewById(R.id.layout_info).setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.business.page.home.list.future.a.16
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eea99a25c10bdb42f72c44624d3d1ab8", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eea99a25c10bdb42f72c44624d3d1ab8")).booleanValue();
                }
                a.this.E.removeAllViews();
                a.this.E.dispatchTouchEvent(motionEvent);
                return false;
            }
        });
        a(this.V);
        return inflate;
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public void a(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b66b2e1c9b76ad105941af9c0a22fcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b66b2e1c9b76ad105941af9c0a22fcd");
            return;
        }
        this.K = (HomePageViewModel) q.a(this.x).a(HomePageViewModel.class);
        this.K.p.a(this.x, new l<Rect>() { // from class: com.sankuai.waimai.business.page.home.list.future.a.17
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Rect rect) {
                Rect rect2 = rect;
                Object[] objArr2 = {rect2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "278ee46d0d84d27f88fb7cd8753a9791", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "278ee46d0d84d27f88fb7cd8753a9791");
                } else if (rect2 != null) {
                    a.this.T = rect2;
                    if (a.this.H != null) {
                        a.this.H.a(rect2);
                    }
                }
            }
        });
        this.K.h.a(new l<Integer>() { // from class: com.sankuai.waimai.business.page.home.list.future.a.18
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65555e2f6557140f8664aa8b5c570675", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65555e2f6557140f8664aa8b5c570675");
                    return;
                }
                com.sankuai.waimai.business.page.home.list.future.mach.d.a().b();
                if (a.this.M == null || a.this.M.w == null) {
                    return;
                }
                a.this.M.w.a((com.meituan.android.cube.pga.common.b<Integer>) num2);
            }
        });
        this.K.e.a(new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.list.future.a.19
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e8baf36abb2b43165367e15684b31af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e8baf36abb2b43165367e15684b31af");
                    return;
                }
                com.sankuai.waimai.business.page.home.list.future.mach.d.a().b();
                if (a.this.M == null || a.this.M.A == null) {
                    return;
                }
                a.this.M.A.a((com.meituan.android.cube.pga.common.b<Boolean>) bool2);
            }
        });
        this.K.f.a(new l<d.a>() { // from class: com.sankuai.waimai.business.page.home.list.future.a.20
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable d.a aVar) {
                d.a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed4052379b30cddb0e1c99bfe4335fce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed4052379b30cddb0e1c99bfe4335fce");
                } else if (aVar2 != null) {
                    switch (aVar2) {
                        case ON_PAUSE:
                            com.sankuai.waimai.business.page.home.list.future.mach.d.a().b();
                            return;
                        case ON_RESUME:
                            if (a.this.M != null) {
                                a.this.M.k.a((j<Boolean>) Boolean.TRUE);
                                return;
                            }
                            return;
                        case ON_STOP:
                            if (a.this.M != null) {
                                a.this.M.l.a((j<Boolean>) Boolean.TRUE);
                                return;
                            }
                            return;
                        case ON_DESTROY:
                            if (a.this.M != null) {
                                a.this.M.m.a();
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            }
        });
        this.K.j.a(this.x, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.list.future.a.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f03bf519263be55a001e56a7124fb412", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f03bf519263be55a001e56a7124fb412");
                } else if (bool2 != null && bool2.booleanValue() && a.this.S) {
                    a.a(a.this, false);
                    if (a.this.E == null || a.this.E.getLayoutManager() == null) {
                        return;
                    }
                    a.this.E.post(new Runnable() { // from class: com.sankuai.waimai.business.page.home.list.future.a.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3f80a22a0b5391c4095aa58eb8d9d703", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3f80a22a0b5391c4095aa58eb8d9d703");
                                return;
                            }
                            a.this.E.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
                            a.this.E.scrollToPosition(0);
                        }
                    });
                }
            }
        });
        this.K.r.a(this.x, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.list.future.a.3
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Object[] objArr2 = {bool};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35e6d6b5de4f939a58c4ba0258e8facc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35e6d6b5de4f939a58c4ba0258e8facc");
                } else {
                    a.this.U();
                }
            }
        });
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77054279c03e4ef38a0a92b8ed27fbb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77054279c03e4ef38a0a92b8ed27fbb5");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = v;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e0b1f37ddea6ac429a0f65e6cb54aad6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e0b1f37ddea6ac429a0f65e6cb54aad6");
        } else {
            this.M = new b(this.t);
            this.M.t.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.business.page.home.list.future.a.7
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Integer num) {
                    Integer num2 = num;
                    Object[] objArr3 = {num2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1c142dfe9d3ac20078d536e1e6c63dac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1c142dfe9d3ac20078d536e1e6c63dac");
                    } else {
                        a.a(a.this, num2.intValue());
                    }
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = v;
        this.G = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "238c4479220bd021e13748dfb13e98ff", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.rocks.view.mach.d) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "238c4479220bd021e13748dfb13e98ff") : new com.sankuai.waimai.rocks.view.mach.d(new d.a() { // from class: com.sankuai.waimai.business.page.home.list.future.a.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.view.mach.d.a
            public final Mach.a a() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "01d28aa62349b6f961d6b98bc0d42ad8", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Mach.a) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "01d28aa62349b6f961d6b98bc0d42ad8");
                }
                a.this.P = new com.sankuai.waimai.business.page.home.list.future.mach.b(a.this.Q);
                Mach.a aVar = new Mach.a();
                aVar.b = a.this.t;
                aVar.f = new com.sankuai.waimai.business.page.home.list.future.mach.c() { // from class: com.sankuai.waimai.business.page.home.list.future.a.8.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.page.home.list.future.mach.c, com.sankuai.waimai.mach.g
                    public final void a() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1ea057f9aeefd6aa4b05e30a4703397e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1ea057f9aeefd6aa4b05e30a4703397e");
                        } else if (a.this.X) {
                            try {
                                a.a(a.this, (RecyclerView) a.this.E);
                            } catch (Exception e) {
                                com.sankuai.waimai.foundation.utils.log.a.a("FutureBlock", e);
                            }
                        }
                    }
                };
                aVar.e = new com.sankuai.waimai.business.page.home.list.mach.a("waimai_future_list_image", "fail", "future list image load error!", 10001, 10002, "waimai_pic_future_try", 10001, 10002, "waimai_pic_future_first");
                aVar.d = a.this.R();
                aVar.l = a.this.P;
                return aVar.a(new WebpImageTagProcessor()).a(new DynamicTagProcessor()).a(new ScrollerTagProcessor()).a(new RateCrownTagProcessor()).a(new SwiperTagProcessor()).a(new DynamicImageTagProcessor()).a(new WmEffectTagProcessor()).a(new MachLivePlayerTagProcessor()).a(new HttpJSNativeMethod() { // from class: com.sankuai.waimai.business.page.home.list.future.a.8.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.js.HttpJSNativeMethod
                    public final void httpRequest(String str2, Map<String, String> map, rx.j<ap> jVar) {
                        Object[] objArr5 = {str2, map, jVar};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ce17d2080c2882cf1845f1c818d21152", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ce17d2080c2882cf1845f1c818d21152");
                        } else {
                            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((HttpJSNativeMethod.JSRequest) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) HttpJSNativeMethod.JSRequest.class)).get(str2, map), jVar, a.this.y);
                        }
                    }
                }).a(new WMADStrategyNativeModule()).a(new com.sankuai.waimai.platform.mach.statistics.d(a.this.t)).a(new MachLivePlayerNativeMethod());
            }
        });
        a.C1132a c1132a = new a.C1132a("waimai");
        c1132a.k = str;
        c1132a.c = this.t;
        c1132a.q = this.M;
        c1132a.h = this.ab;
        c1132a.d = this.G;
        c1132a.f = this.E;
        c1132a.r = S();
        c1132a.g = this.U;
        c1132a.l = this.T;
        c1132a.t = new com.sankuai.waimai.platform.rocks.view.b();
        c1132a.m = true;
        c1132a.n = true;
        c1132a.o = true;
        c1132a.p = this.x;
        c1132a.j = true;
        c1132a.u = this.ac;
        c1132a.v = new d.a() { // from class: com.sankuai.waimai.business.page.home.list.future.a.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.view.block.d.a
            public final boolean a(View view, com.sankuai.waimai.rocks.view.viewmodel.a aVar) {
                com.sankuai.waimai.mach.node.a b;
                Object[] objArr4 = {view, aVar};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "69e672ad490c4ce129f417c56cf3a535", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "69e672ad490c4ce129f417c56cf3a535")).booleanValue();
                }
                if (aVar != null && aVar.p != 0 && aVar.p.b() != null) {
                    if (aVar.p instanceof com.sankuai.waimai.mach.recycler.c) {
                        final g gVar = new g();
                        com.sankuai.waimai.mach.recycler.c cVar = (com.sankuai.waimai.mach.recycler.c) aVar.p;
                        Object[] objArr5 = {cVar};
                        ChangeQuickRedirect changeQuickRedirect5 = g.a;
                        if (PatchProxy.isSupport(objArr5, gVar, changeQuickRedirect5, false, "dfde8df69ef79ec61a184b1da1bf4889", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, gVar, changeQuickRedirect5, false, "dfde8df69ef79ec61a184b1da1bf4889");
                        } else if (cVar != null && (b = cVar.b()) != null && b.h() != null && b.h().containsKey("native-visible-check")) {
                            final HashMap hashMap = new HashMap();
                            com.sankuai.waimai.mach.node.a.a(b.c(), new a.InterfaceC1019a() { // from class: com.sankuai.waimai.business.page.home.list.future.g.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                                public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                                    Object[] objArr6 = {aVar2};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "14315c7fc8bc1d9c1cdeec15b43e087f", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "14315c7fc8bc1d9c1cdeec15b43e087f");
                                    } else if (aVar2 == null) {
                                    } else {
                                        g.a(gVar, aVar2, hashMap);
                                    }
                                }
                            });
                            if (hashMap.size() > 0) {
                                cVar.l().synchronizeEnvironment(hashMap);
                            }
                        }
                    }
                    com.sankuai.waimai.mach.node.a b2 = aVar.p.b();
                    return b2.h() == null || b2.h().get(RemoteMessageConst.Notification.VISIBILITY) == null || b2.h().get(RemoteMessageConst.Notification.VISIBILITY) == Boolean.TRUE;
                }
                return true;
            }
        };
        c1132a.e = new c.b() { // from class: com.sankuai.waimai.business.page.home.list.future.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.view.mach.c.b
            public final void a(com.sankuai.waimai.mach.recycler.c cVar) {
                Mach l;
                Object[] objArr4 = {cVar};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "81361988e287c9e8b690330e64d3e90f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "81361988e287c9e8b690330e64d3e90f");
                } else if (cVar == null || (l = cVar.l()) == null) {
                } else {
                    l.registerJsEventCallback(new Mach.d() { // from class: com.sankuai.waimai.business.page.home.list.future.a.4.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.Mach.d
                        public final void a(@NonNull String str2, @Nullable Map<String, Object> map) {
                            Object[] objArr5 = {str2, map};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0805cecc6b46b18382f91fbbfaec81f7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0805cecc6b46b18382f91fbbfaec81f7");
                            } else if (TextUtils.equals(str2, "client-toast")) {
                                ae.a((Activity) a.this.x.getActivity(), "提交失败，请5s后重新尝试");
                            }
                        }
                    });
                }
            }
        };
        this.F = c1132a.a();
        if (com.sankuai.waimai.business.page.home.preload.task.f.c()) {
            com.sankuai.waimai.business.page.home.preload.machpreload.b.a(this.F, com.sankuai.waimai.business.page.home.preload.machpreload.a.a().b);
        }
        this.H = this.F.d;
        if (this.H.h != null) {
            this.H.h.e = new a.d() { // from class: com.sankuai.waimai.business.page.home.list.future.a.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.rocks.view.recyclerview.a.d
                public final void a(View view, int i) {
                    Object[] objArr4 = {view, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f785412d6e5f18bf0519f5c70ac7feef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f785412d6e5f18bf0519f5c70ac7feef");
                    } else {
                        HomeGrayManager.a().a(view, 3, 2, "", i);
                    }
                }
            };
        }
    }

    public final void T() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e72069e092ec0ea8326f5e4bb5f9c50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e72069e092ec0ea8326f5e4bb5f9c50");
        } else {
            com.sankuai.waimai.platform.utils.l.a(new Runnable() { // from class: com.sankuai.waimai.business.page.home.list.future.a.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e506045d162cd953e2a7f42e5a4f2d7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e506045d162cd953e2a7f42e5a4f2d7");
                    } else {
                        a.this.H.q();
                    }
                }
            }, 300, "HomePageFragment");
        }
    }

    public final void U() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74cdb340d01971d13d3020f9e1a846df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74cdb340d01971d13d3020f9e1a846df");
        } else if (this.E == null) {
        } else {
            ViewParent parent = this.E.getParent();
            while (true) {
                View view = (View) parent;
                if (view instanceof HomePageNestedScrollRecyclerView) {
                    final HomePageNestedScrollRecyclerView homePageNestedScrollRecyclerView = (HomePageNestedScrollRecyclerView) view;
                    if (homePageNestedScrollRecyclerView.getAdapter() != null) {
                        final int itemCount = homePageNestedScrollRecyclerView.getAdapter().getItemCount() - 1;
                        homePageNestedScrollRecyclerView.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.home.list.future.a.11
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34080e3f301d566dcbd1bafb08ef3a93", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34080e3f301d566dcbd1bafb08ef3a93");
                                } else {
                                    homePageNestedScrollRecyclerView.smoothScrollToPosition(itemCount);
                                }
                            }
                        }, 50L);
                        return;
                    }
                    return;
                } else if (view == null) {
                    return;
                } else {
                    parent = view.getParent();
                }
            }
        }
    }

    private void a(List<com.sankuai.waimai.rocks.view.viewmodel.e> list, int i, boolean z) {
        Object[] objArr = {list, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73095bdd1ca3454e8b7ea54149d5e4bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73095bdd1ca3454e8b7ea54149d5e4bf");
        } else if (i >= 0 && i < list.size()) {
            com.sankuai.waimai.rocks.view.viewmodel.e eVar = list.get(i);
            if (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.a) {
                T t = ((com.sankuai.waimai.rocks.view.viewmodel.a) eVar).p;
                if (!a(eVar.s)) {
                    com.sankuai.waimai.foundation.utils.log.a.c("FutureBlock", "isEffectItem = false", new Object[0]);
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.c("FutureBlock", "isEffectItem = true", new Object[0]);
                com.sankuai.waimai.mach.node.a b = t.b();
                if (b == null) {
                    return;
                }
                ArrayList<com.sankuai.waimai.irmo.mach.effect.a> arrayList = new ArrayList();
                a(b, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                for (com.sankuai.waimai.irmo.mach.effect.a aVar : arrayList) {
                    com.sankuai.waimai.irmo.mach.effect.b bVar = aVar.b;
                    if (bVar != null) {
                        if (z) {
                            bVar.a();
                        } else {
                            bVar.b();
                        }
                    }
                }
                Mach mach = b.f;
                Object[] objArr2 = {mach, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = v;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "830e020aea1726fe80b90571eb4af17b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "830e020aea1726fe80b90571eb4af17b");
                } else if (mach != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("showType", Integer.valueOf(z ? 1 : 0));
                    mach.sendJsEvent("homepage_future_effect_event", hashMap);
                }
                this.X = true;
                com.sankuai.waimai.foundation.utils.log.a.c("FutureBlock", "position:" + i + ",isShowEffect:" + z, new Object[0]);
            }
        }
    }

    private boolean a(com.sankuai.waimai.rocks.node.a aVar) {
        boolean z;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c17f16b4bb76047ef4ec7def38824be", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c17f16b4bb76047ef4ec7def38824be")).booleanValue();
        }
        if (aVar != null && !TextUtils.isEmpty(aVar.r)) {
            String str = aVar.r;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = v;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f32b2209edc3154868c38c75619db67", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f32b2209edc3154868c38c75619db67")).booleanValue();
            } else {
                z = !TextUtils.isEmpty(str) && str.contains("promotion_tag") && str.contains("extra") && str.contains("effect_type");
            }
            if (z) {
                try {
                    JSONObject optJSONObject = new JSONObject(aVar.r).optJSONObject("promotion_tag");
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("extra");
                        if (!TextUtils.isEmpty(optString)) {
                            return new JSONObject(optString).optInt("effect_type") == 1;
                        }
                    }
                } catch (Exception e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.sankuai.waimai.business.page.home.list.future.h
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75d19b7d83ffeb09902c6f10bb09b923", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75d19b7d83ffeb09902c6f10bb09b923");
            return;
        }
        this.S = z;
        if (z) {
            this.R.setEventPointExcludeHeight(this.I != null ? this.I.Q() : 0);
            com.sankuai.waimai.business.page.home.helper.c.a().a(20, this.ad);
            if (this.z) {
                this.E.requestLayout();
            }
            T();
            return;
        }
        com.sankuai.waimai.business.page.home.list.future.mach.d.a().b();
        com.sankuai.waimai.business.page.home.helper.c.a().a(this.ad);
    }

    private void a(com.sankuai.waimai.mach.node.a aVar, List<com.sankuai.waimai.irmo.mach.effect.a> list) {
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d49aac90121dfcb0cd4eb7c8f1476acf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d49aac90121dfcb0cd4eb7c8f1476acf");
        } else if (aVar != null) {
            if ("wm-effect".equals(aVar.j) && (aVar.h instanceof com.sankuai.waimai.irmo.mach.effect.a)) {
                list.add((com.sankuai.waimai.irmo.mach.effect.a) aVar.h);
                return;
            }
            List<com.sankuai.waimai.mach.node.a> b = aVar.b();
            if (b == null || b.size() <= 0) {
                return;
            }
            for (int i = 0; i < b.size(); i++) {
                a(b.get(i), list);
            }
        }
    }
}
