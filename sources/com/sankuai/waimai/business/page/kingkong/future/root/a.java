package com.sankuai.waimai.business.page.kingkong.future.root;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.pga.common.e;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.home.list.future.mach.RateCrownTagProcessor;
import com.sankuai.waimai.business.page.home.preload.PreloadDataModel;
import com.sankuai.waimai.business.page.kingkong.KingKongActivity;
import com.sankuai.waimai.business.page.kingkong.future.ai.b;
import com.sankuai.waimai.business.page.kingkong.future.bean.ResponseMsgBean;
import com.sankuai.waimai.business.page.kingkong.future.network.preload.FkkPreloadResponse;
import com.sankuai.waimai.business.page.kingkong.future.network.preload.KingKongNetworkPreLoader;
import com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.NestedPullToRefreshView;
import com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a;
import com.sankuai.waimai.business.page.kingkong.view.actionbar.ActionBarBlock;
import com.sankuai.waimai.business.page.kingkong.view.searchbox.floatsearchbox.FloatSearchBoxBlock;
import com.sankuai.waimai.business.page.kingkong.viewmodel.KingKongViewModel;
import com.sankuai.waimai.foundation.location.utils.c;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.callback.DeviceLocateCallback;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.irmo.mach.effect.WmEffectTagProcessor;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.component.scroller.ScrollerTagProcessor;
import com.sankuai.waimai.mach.component.swiper.SwiperTagProcessor;
import com.sankuai.waimai.mach.js.HttpJSNativeMethod;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.mach.dialog.k;
import com.sankuai.waimai.platform.mach.tag.DynamicTagProcessor;
import com.sankuai.waimai.platform.mach.webpimage.WebpImageTagProcessor;
import com.sankuai.waimai.platform.preload.f;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.platform.utils.m;
import com.sankuai.waimai.platform.utils.sharedpreference.PlatformSPKeys;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import com.sankuai.waimai.pouch.viewmodel.PouchViewModel;
import com.sankuai.waimai.rocks.expose.f;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.page.block.a;
import com.sankuai.waimai.rocks.page.block.b;
import com.sankuai.waimai.rocks.page.block.f;
import com.sankuai.waimai.rocks.page.tablist.tab.RocksPagerAdapter;
import com.sankuai.waimai.rocks.page.view.NestedRecyclerView;
import com.sankuai.waimai.rocks.view.c;
import com.sankuai.waimai.rocks.view.mach.c;
import com.sankuai.waimai.rocks.view.mach.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends f<com.meituan.android.cube.pga.view.a, com.meituan.android.cube.pga.viewmodel.a, com.sankuai.waimai.business.page.kingkong.a> {
    public static ChangeQuickRedirect r;
    public static Map<String, Object> v = new HashMap();
    private b A;
    private com.sankuai.waimai.rocks.page.block.b B;
    private Fragment C;
    private NestedRecyclerView D;
    private FloatSearchBoxBlock E;
    private View F;
    private NestedPullToRefreshView G;
    private d H;
    private KingKongViewModel I;
    private com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a J;
    private boolean K;
    private int L;
    private com.sankuai.waimai.business.page.home.layer.b M;
    private boolean N;
    private l<WMLocation> O;
    private l<WmAddress> P;
    private int Q;
    private int R;
    private PagerAdapter S;
    private boolean T;
    private k U;
    private DynamicDialog V;
    private ArrayList<e> W;
    private ResponseMsgBean X;
    private ResponseMsgBean Y;
    private boolean Z;
    private ImageView aa;
    private int ab;
    KingkongInfo s;
    public com.sankuai.waimai.business.page.kingkong.utils.b t;
    public PouchViewModel u;
    b.a w;
    boolean x;
    public int y;

    public static /* synthetic */ Object a(a aVar, Map map, String str, Class cls) {
        Object[] objArr = {map, str, cls};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "6bfb1f4ad5e309000e8cf7b3c6376fbd", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "6bfb1f4ad5e309000e8cf7b3c6376fbd");
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

    public static /* synthetic */ boolean c(a aVar, boolean z) {
        aVar.Z = true;
        return true;
    }

    public static /* synthetic */ int e(a aVar) {
        int i = aVar.L + 1;
        aVar.L = i;
        return i;
    }

    public static /* synthetic */ int f(a aVar) {
        int i = aVar.L - 1;
        aVar.L = i;
        return i;
    }

    public static /* synthetic */ ArrayList g(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "c5507d7b487ed3bddf5eb12f83847cc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "c5507d7b487ed3bddf5eb12f83847cc7");
        }
        if (aVar.W == null) {
            aVar.W = new ArrayList<>();
        }
        return aVar.W;
    }

    public static /* synthetic */ void j(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "4410ccf97870e140180e9cc3092c0c54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "4410ccf97870e140180e9cc3092c0c54");
        } else {
            com.sankuai.waimai.business.page.common.util.d.a(aVar.F().b(), new com.meituan.android.privacy.interfaces.d() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str, int i) {
                    Object[] objArr2 = {str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2babbb5ed8874c42e5d4983d60041345", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2babbb5ed8874c42e5d4983d60041345");
                    } else if (i > 0) {
                        if (a.n(a.this)) {
                            return;
                        }
                        com.sankuai.waimai.platform.capacity.log.c.a().a(1300, "waimai_location_open_gps_service", SystemClock.elapsedRealtime());
                        g.a().a((DeviceLocateCallback) null, (com.sankuai.waimai.foundation.location.v2.callback.a) null, true, com.sankuai.waimai.platform.domain.manager.location.v2.b.POI_FRAGMENT.toString(), new com.sankuai.waimai.foundation.location.v2.k(a.this.C, "dj-b5e9814e9fb3a8f6"));
                        com.sankuai.waimai.platform.utils.sharedpreference.a.a().a((com.sankuai.waimai.foundation.utils.e) PlatformSPKeys.KEY_SELECT_LOCATION_ADDRESS, "");
                        a.this.t.a(a.this.C);
                    } else {
                        com.sankuai.waimai.platform.capacity.permission.b.a((Context) a.this.F().b(), false);
                    }
                }
            });
        }
    }

    public static /* synthetic */ boolean n(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "b648242dc00c58328f193fca2a26d9e9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "b648242dc00c58328f193fca2a26d9e9")).booleanValue();
        }
        if (com.sankuai.waimai.foundation.location.utils.c.a(aVar.F().a()).equals(c.a.OPEN)) {
            return false;
        }
        aVar.F().r.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1203);
        return true;
    }

    public static /* synthetic */ void t(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "4722310d8f3822fabf76ff025b63eafc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "4722310d8f3822fabf76ff025b63eafc");
        } else if (aVar.N) {
            aVar.G.a();
            aVar.N = false;
        }
    }

    public static /* synthetic */ void u(a aVar) {
        final View findViewByPosition;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "fcc9c6368dfbbfc1635a681339cf7b5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "fcc9c6368dfbbfc1635a681339cf7b5f");
        } else if (aVar.D == null || aVar.D.getAdapter() == null || aVar.D.getAdapter().getItemCount() <= 0) {
        } else {
            final int itemCount = aVar.D.getAdapter().getItemCount() - 1;
            RecyclerView.LayoutManager layoutManager = aVar.D.getLayoutManager();
            if (layoutManager == null || (findViewByPosition = layoutManager.findViewByPosition(itemCount)) == null) {
                return;
            }
            new Handler().post(new Runnable() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.25
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6163a0883459d6da37a931deb0706f9f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6163a0883459d6da37a931deb0706f9f");
                    } else if (findViewByPosition.getTop() > 0 && a.this.J != null) {
                        com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a aVar2 = a.this.J;
                        int i = itemCount;
                        Object[] objArr3 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "2060199a89acdfcfb9a6ea1229744737", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "2060199a89acdfcfb9a6ea1229744737");
                        } else if (aVar2.b == null || aVar2.b.getLayoutManager() == null || aVar2.b.getLayoutManager().findViewByPosition(i) == null) {
                        } else {
                            aVar2.b.scrollToPosition(i);
                            aVar2.a();
                        }
                    }
                }
            });
        }
    }

    public a(com.sankuai.waimai.business.page.kingkong.a aVar, Fragment fragment) {
        super(aVar);
        Object[] objArr = {aVar, fragment};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b5d61e4436bcd2ec370840ea8726002", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b5d61e4436bcd2ec370840ea8726002");
            return;
        }
        this.K = false;
        this.L = 0;
        this.Q = -1;
        this.R = -1;
        this.w = new b.a() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.11
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.kingkong.future.ai.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6495292d983bb22a05ed5617d9d4d38f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6495292d983bb22a05ed5617d9d4d38f");
                } else {
                    a.this.F().S.a((com.meituan.android.cube.pga.common.b<Integer>) 6);
                }
            }
        };
        this.x = true;
        this.Z = false;
        this.y = 0;
        this.C = fragment;
        com.sankuai.waimai.business.page.kingkong.view.poilist.categorytabblock.b.b = false;
        com.sankuai.waimai.business.page.kingkong.future.mach.c.b.clear();
    }

    public final void M() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecc3a1ce1f4a235251a9f865edcceb73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecc3a1ce1f4a235251a9f865edcceb73");
        } else if (this.M == null || this.s == null || this.s.r != 1) {
        } else {
            WMLocation i = g.a().i();
            com.sankuai.waimai.business.page.home.layer.b bVar = this.M;
            if (i != null && !i.hasLocatedPermission) {
                z = true;
            }
            bVar.a(z);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.kingkong.future.root.a$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements c.b {
        public static ChangeQuickRedirect a;

        public AnonymousClass1() {
        }

        @Override // com.sankuai.waimai.rocks.view.mach.c.b
        public final void a(com.sankuai.waimai.mach.recycler.c cVar) {
            Mach l;
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9c669e993d561af2fd1993ad944154a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9c669e993d561af2fd1993ad944154a");
            } else if (cVar == null || (l = cVar.l()) == null) {
            } else {
                l.registerJsEventCallback(new C08031(cVar, l));
            }
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.business.page.kingkong.future.root.a$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C08031 implements Mach.d {
            public static ChangeQuickRedirect a;
            public final /* synthetic */ com.sankuai.waimai.mach.recycler.c b;
            public final /* synthetic */ Mach c;

            public C08031(com.sankuai.waimai.mach.recycler.c cVar, Mach mach) {
                this.b = cVar;
                this.c = mach;
            }

            @Override // com.sankuai.waimai.mach.Mach.d
            public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
                boolean z = false;
                Object[] objArr = {str, map};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4231122b9eba3495d3dd4043c3401905", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4231122b9eba3495d3dd4043c3401905");
                } else if (TextUtils.equals(str, "std_trigger_expose_event")) {
                    this.b.e();
                } else if (TextUtils.equals(str, "kingkong_recommend_number_event")) {
                    if (map != null) {
                        Number number = (Number) a.a(a.this, map, "count", Number.class);
                        if (a.this.T && (number == null || number.intValue() < 5)) {
                            m.a(a.this.F().b(), (String) a.a(a.this, map, "toast", String.class));
                        }
                        a aVar = a.this;
                        if (number != null && number.intValue() >= 5) {
                            z = true;
                        }
                        aVar.T = z;
                    }
                } else if (TextUtils.equals(str, "openDynamicDialog")) {
                    if (a.this.U == null) {
                        a.this.U = new k();
                    }
                    if (a.this.U.a()) {
                        DynamicDialog.a aVar2 = new DynamicDialog.a(a.this.l());
                        aVar2.i = (AlertInfo) com.sankuai.waimai.foundation.utils.k.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(map), (Class<Object>) AlertInfo.class);
                        aVar2.n = new C08041();
                        a.this.V = aVar2.a();
                        a.this.U.c = a.this.V;
                        a.this.U.a(a.this.l());
                    }
                } else if (TextUtils.equals(str, "kingkongScrollToCritical")) {
                    a.this.F().x.a((com.meituan.android.cube.pga.common.b<Void>) null);
                    a.this.F().y.a((com.meituan.android.cube.pga.common.b<Integer>) 1);
                }
            }

            /* compiled from: ProGuard */
            /* renamed from: com.sankuai.waimai.business.page.kingkong.future.root.a$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes4.dex */
            public class C08041 implements DynamicDialog.h {
                public static ChangeQuickRedirect a;
                final WeakReference<Mach> b;
                final String c;

                public C08041() {
                    this.b = new WeakReference<>(C08031.this.c);
                    this.c = C08031.this.c.getTemplateId();
                }

                @Override // com.sankuai.waimai.platform.mach.dialog.DynamicDialog.h
                public final com.sankuai.waimai.platform.mach.dialog.e a(Activity activity, AlertInfo.Module module) {
                    Object[] objArr = {activity, module};
                    ChangeQuickRedirect changeQuickRedirect = a;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc7535b398768ba10d8e15327f40f60e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.platform.mach.dialog.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc7535b398768ba10d8e15327f40f60e") : new com.sankuai.waimai.platform.mach.dialog.e(activity, "") { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.1.1.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.mach.dialog.e, com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
                        public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
                            int i;
                            List<com.sankuai.waimai.rocks.view.viewmodel.e> list;
                            T t;
                            com.sankuai.waimai.mach.node.a b;
                            Mach mach;
                            Object[] objArr2 = {str, map};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dff92eaad572c8710db2e96844454433", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dff92eaad572c8710db2e96844454433");
                                return;
                            }
                            super.a(str, map);
                            if (TextUtils.equals(str, "forwardEvent") && map != null && (map.get("eventName") instanceof String)) {
                                Mach mach2 = C08041.this.b != null ? C08041.this.b.get() : null;
                                if (mach2 == null || !TextUtils.equals(mach2.getTemplateId(), C08041.this.c)) {
                                    NestedRecyclerView nestedRecyclerView = a.this.D;
                                    int i2 = -1;
                                    if (nestedRecyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) nestedRecyclerView.getLayoutManager();
                                        i2 = linearLayoutManager.findFirstVisibleItemPosition();
                                        i = linearLayoutManager.findLastVisibleItemPosition();
                                    } else {
                                        i = -1;
                                    }
                                    if (nestedRecyclerView != null && (nestedRecyclerView.getAdapter() instanceof com.sankuai.waimai.rocks.view.recyclerview.a) && (list = ((com.sankuai.waimai.rocks.view.recyclerview.a) nestedRecyclerView.getAdapter()).b) != null && list.size() > 0 && i2 >= 0 && i >= 0) {
                                        while (true) {
                                            if (i2 > i) {
                                                break;
                                            }
                                            com.sankuai.waimai.rocks.view.viewmodel.e eVar = list.get(i2);
                                            if ((eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.a) && (t = ((com.sankuai.waimai.rocks.view.viewmodel.a) eVar).p) != 0 && (b = t.b()) != null && (mach = b.f) != null && TextUtils.equals(mach.getTemplateId(), C08041.this.c)) {
                                                mach2 = mach;
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                }
                                if (mach2 != null) {
                                    mach2.sendJsEvent((String) map.get("eventName"), map);
                                }
                            } else if (TextUtils.equals(str, "kingkongScrollToCritical")) {
                                a.this.F().x.a((com.meituan.android.cube.pga.common.b<Void>) null);
                                a.this.F().y.a((com.meituan.android.cube.pga.common.b<Integer>) 1);
                            } else if (!TextUtils.equals(str, "toast") || map == null || !(map.get("msg") instanceof String) || a.this.V == null || a.this.V.getDialog() == null) {
                            } else {
                                ae.a(a.this.V.getDialog().getWindow());
                                ae.b(a.this.l(), (String) map.get("msg"));
                            }
                        }
                    };
                }
            }
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f2bc7dbceaf042f346d95e9cb4f5633", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f2bc7dbceaf042f346d95e9cb4f5633") : new c(m());
    }

    /* JADX WARN: Type inference failed for: r1v62, types: [android.support.v4.app.FragmentActivity, android.arch.lifecycle.f] */
    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        int i;
        int i2;
        com.sankuai.waimai.rocks.page.block.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e41d9b2abb6858a00348efcba5d917aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e41d9b2abb6858a00348efcba5d917aa");
            return;
        }
        super.s();
        this.A = new b();
        this.t = new com.sankuai.waimai.business.page.kingkong.utils.b((FKKFragment) F().r);
        F().af.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.26
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ea5cc6c482cc0f483968b535594df36", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ea5cc6c482cc0f483968b535594df36") : a.g(a.this);
            }
        };
        new com.sankuai.waimai.business.page.common.second.b(F());
        this.s = F().w.a().b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71a1054215275b5b54b624e6632f8ba6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71a1054215275b5b54b624e6632f8ba6");
        } else {
            final View inflate = LayoutInflater.from(F().a()).inflate(R.layout.wm_page_future_kingkong_float_layout, (ViewGroup) null);
            final com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.b bVar = new com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.b(F(), l(), F().r.getChildFragmentManager(), inflate.findViewById(R.id.layout_float_filter_bar));
            final com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a aVar2 = new com.sankuai.waimai.business.page.kingkong.future.tabfeed.filter_category.a(F(), l(), inflate.findViewById(R.id.category_recycler_view_layout));
            F().ac.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.7
                @Override // com.meituan.android.cube.pga.action.d
                public final Object a() {
                    return inflate;
                }
            };
            F().ad.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.8
                @Override // com.meituan.android.cube.pga.action.d
                public final Object a() {
                    return bVar;
                }
            };
            F().ae.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.9
                @Override // com.meituan.android.cube.pga.action.d
                public final Object a() {
                    return aVar2;
                }
            };
        }
        this.K = com.sankuai.waimai.business.page.kingkong.b.a(this.s) == com.sankuai.waimai.business.page.kingkong.b.FOOD;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = r;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "35a72518bbda02b94a82c226c2a49568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "35a72518bbda02b94a82c226c2a49568");
        } else {
            this.H = new d(u(), R.id.layout_refresh_global, R.layout.skeleton_kingkong_layout);
            this.H.a("c_i5kxn8l");
            this.H.c(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.13
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8785f2a75772f205cb8a838b52a6b7fb", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8785f2a75772f205cb8a838b52a6b7fb");
                        return;
                    }
                    a.this.H.c(R.string.wm_page_poiList_progressbar_loading);
                    a.this.Y = null;
                    a.this.X = null;
                    a.this.a(true);
                }
            });
            F().T.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.14
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.d
                public final Object a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "aa5eb0a5e8771650019f7e8f7c256021", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "aa5eb0a5e8771650019f7e8f7c256021") : a.this.H;
                }
            };
            this.H.c(R.string.wm_page_poiList_progressbar_loading);
            F().ab.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.15
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Integer num) {
                    Integer num2 = num;
                    Object[] objArr4 = {num2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "52c55623c97cd42d05f38c1a9264dafa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "52c55623c97cd42d05f38c1a9264dafa");
                    } else if (num2 != null) {
                        if (num2.intValue() == 4 || num2.intValue() == 5) {
                            a.this.R();
                        }
                    }
                }
            });
            F().Q.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.16
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Boolean bool) {
                    Object[] objArr4 = {bool};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6ece1e716d3f48ff31974603089b8b17", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6ece1e716d3f48ff31974603089b8b17");
                        return;
                    }
                    a.this.O();
                    if (a.this.A != null) {
                        a.this.A.a(true);
                    }
                    a.this.b(100);
                    a.this.b(500);
                    a.this.b(1000);
                }
            });
            F().Y.a(new com.meituan.android.cube.pga.action.b<ResponseMsgBean>() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.17
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(ResponseMsgBean responseMsgBean) {
                    String string;
                    ResponseMsgBean responseMsgBean2 = responseMsgBean;
                    Object[] objArr4 = {responseMsgBean2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "53070138fc7d72cf321b065cedc69bea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "53070138fc7d72cf321b065cedc69bea");
                        return;
                    }
                    a.this.b(300);
                    if (responseMsgBean2 != null) {
                        if (responseMsgBean2.responseSource == 0) {
                            a.this.X = responseMsgBean2;
                        } else if (responseMsgBean2.responseSource == -1) {
                            a.this.Y = responseMsgBean2;
                        }
                        if (a.this.X != null) {
                            if (a.this.X.responseType == -1) {
                                BaseResponse<RocksServerModel> baseResponse = a.this.X.response;
                                Object[] objArr5 = {baseResponse, Integer.valueOf((int) R.string.wm_page_net_error_info)};
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.kingkong.log.c.a;
                                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "3ad7a5cf66fbfc811eb07f459d9485e9", RobustBitConfig.DEFAULT_VALUE)) {
                                    string = (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "3ad7a5cf66fbfc811eb07f459d9485e9");
                                } else {
                                    string = (baseResponse == null || TextUtils.isEmpty(baseResponse.msg)) ? com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_page_net_error_info) : baseResponse.msg;
                                }
                                a.this.H.a(string, a.this.X.response != null ? a.this.X.response.code : -1, "10324");
                            } else if (a.this.Y != null) {
                                if (a.this.H.j()) {
                                    a.this.H.h();
                                    a.this.F().Z.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
                                }
                                a.this.b(200);
                            }
                        }
                    }
                }
            });
        }
        this.F = u().findViewById(R.id.layout_global_view);
        this.aa = (ImageView) u().findViewById(R.id.recycler_view_gradient_bg);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = r;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ac42616f1e484e412b5b22c0a85e0cd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ac42616f1e484e412b5b22c0a85e0cd9");
        } else {
            this.ab = com.sankuai.waimai.foundation.utils.g.a(l(), 48.0f);
            if (l() == null || !com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) l())) {
                i = 0;
            } else {
                i = com.sankuai.waimai.foundation.utils.g.e(com.meituan.android.singleton.b.a);
                this.ab += i;
            }
            c(0);
            if (i != 0) {
                ViewGroup.LayoutParams layoutParams = this.F.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin += i;
                    this.F.setLayoutParams(layoutParams);
                }
            }
        }
        FragmentActivity b = F().b();
        FrameLayout frameLayout = (FrameLayout) u().findViewById(R.id.kingkong_nested_scroll_recycler_view);
        int e = (b == null || !com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) b)) ? 0 : com.sankuai.waimai.foundation.utils.g.e(com.meituan.android.singleton.b.a);
        if (com.sankuai.waimai.platform.privacy.a.a().b()) {
            e += com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 16.0f);
        }
        if (com.sankuai.waimai.platform.privacy.a.a().b() && com.sankuai.waimai.foundation.core.a.d()) {
            i2 = com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 127.0f);
            a((com.meituan.android.cube.pga.block.a) new com.sankuai.waimai.business.page.kingkong.view.privacy.b(F(), (ViewStub) a(R.id.wm_privacy_botttom_dialog)));
        } else {
            i2 = 0;
        }
        frameLayout.setPadding(0, e, 0, i2);
        if (!com.sankuai.waimai.platform.privacy.a.a().b()) {
            ActionBarBlock actionBarBlock = new ActionBarBlock(F(), (ViewStub) a(R.id.wm_kingkong_action_bar));
            com.sankuai.waimai.business.page.kingkong.view.actionbar.a r2 = actionBarBlock.r();
            ImageView imageView = (ImageView) a(R.id.atmosphere_bg);
            Object[] objArr5 = {imageView};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.kingkong.view.actionbar.a.d;
            if (PatchProxy.isSupport(objArr5, r2, changeQuickRedirect5, false, "9756eeed278e66e673bdbcf4813ed7b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, r2, changeQuickRedirect5, false, "9756eeed278e66e673bdbcf4813ed7b0");
            } else {
                r2.e.d = imageView;
            }
            a((com.meituan.android.cube.pga.block.a) actionBarBlock);
            this.E = new FloatSearchBoxBlock(F(), (ViewStub) a(R.id.wm_kingkong_float_search_box_viewstub));
            a((com.meituan.android.cube.pga.block.a) this.E);
        } else {
            a((com.meituan.android.cube.pga.block.a) new com.sankuai.waimai.business.page.kingkong.view.privacy.a(F(), (ViewStub) a(R.id.wm_kingkong_action_bar)));
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = r;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "35887a1de130e1c548b8d1dad1bc84be", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (com.sankuai.waimai.rocks.page.block.a) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "35887a1de130e1c548b8d1dad1bc84be");
        } else {
            DisplayMetrics displayMetrics = m().getResources().getDisplayMetrics();
            Rect rect = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
            a.C1129a c1129a = new a.C1129a("future_king_kong");
            c1129a.l = F();
            c1129a.j = true;
            c1129a.n = new com.sankuai.waimai.business.page.kingkong.future.network.f(F());
            c1129a.i = true;
            c1129a.m = v;
            c1129a.k = true;
            c1129a.h = rect;
            c1129a.e = this.A;
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = r;
            c1129a.c = PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "4d5ead8148107ca7ffeaa15a3aa86bb8", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.rocks.view.mach.d) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "4d5ead8148107ca7ffeaa15a3aa86bb8") : new com.sankuai.waimai.rocks.view.mach.d(new d.a() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.23
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.rocks.view.mach.d.a
                public final Mach.a a() {
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "dca37b05da3f4ac290c08d33c123d503", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Mach.a) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "dca37b05da3f4ac290c08d33c123d503");
                    }
                    Mach.a aVar3 = new Mach.a();
                    aVar3.b = a.this.F().a();
                    aVar3.f = new com.sankuai.waimai.business.page.home.list.future.mach.c();
                    aVar3.e = new com.sankuai.waimai.business.page.home.list.mach.a("waimai_future_kingkong_list_image", "fail", "future kingkong list image load error!", 10001, 10002, "waimai_pic_future_kingkong_try", 10001, 10002, "waimai_pic_future_kingkong_first");
                    aVar3.d = new com.sankuai.waimai.business.page.kingkong.future.mach.c("c_i5kxn8l", AppUtil.generatePageInfoKey(this));
                    aVar3.l = new com.sankuai.waimai.business.page.kingkong.future.mach.b(a.this.F(), null);
                    return aVar3.a(new WebpImageTagProcessor()).a(new DynamicTagProcessor()).a(new ScrollerTagProcessor()).a(new RateCrownTagProcessor()).a(new WmEffectTagProcessor()).a(new SwiperTagProcessor()).a(new com.sankuai.waimai.platform.mach.statistics.d(a.this.m())).a(new HttpJSNativeMethod() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.23.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.js.HttpJSNativeMethod
                        public final void httpRequest(String str, Map<String, String> map, j<ap> jVar) {
                            Object[] objArr9 = {str, map, jVar};
                            ChangeQuickRedirect changeQuickRedirect9 = a;
                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "cb89d617af19f9fda9837ccc7a3ba780", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "cb89d617af19f9fda9837ccc7a3ba780");
                            } else {
                                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((HttpJSNativeMethod.JSRequest) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) HttpJSNativeMethod.JSRequest.class)).get(str, map), jVar, a.this.F() != null ? a.this.F().R.a().b : "");
                            }
                        }
                    });
                }
            });
            c1129a.p = new c.a() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.12
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.rocks.view.c.a
                public final boolean a(com.sankuai.waimai.rocks.node.a aVar3, boolean z) {
                    Object[] objArr8 = {aVar3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "8e54c3b62de55e65755eea9a06583329", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "8e54c3b62de55e65755eea9a06583329")).booleanValue();
                    }
                    if (aVar3 != null && TextUtils.equals(aVar3.c, "waimai_native_kingkong_cross_search_key")) {
                        if (z) {
                            a.this.F().aa.a((com.meituan.android.cube.pga.common.j<Integer>) Integer.valueOf(a.e(a.this)));
                        } else {
                            a.this.F().aa.a((com.meituan.android.cube.pga.common.j<Integer>) Integer.valueOf(a.f(a.this)));
                        }
                        return false;
                    }
                    return true;
                }
            };
            c1129a.d = new AnonymousClass1();
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = a.C1129a.a;
            aVar = PatchProxy.isSupport(objArr8, c1129a, changeQuickRedirect8, false, "2d4991f8cefcf19ef955315f13b6e33b", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.rocks.page.block.a) PatchProxy.accessDispatch(objArr8, c1129a, changeQuickRedirect8, false, "2d4991f8cefcf19ef955315f13b6e33b") : new com.sankuai.waimai.rocks.page.block.a(c1129a);
        }
        this.B = aVar.b;
        a(this.B, R.id.kingkong_nested_scroll_recycler_view);
        this.D = this.B.s;
        this.I = (KingKongViewModel) q.a(l()).a(KingKongViewModel.class);
        this.I.f.a((KingKongActivity) l(), new l<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.27
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr9 = {bool2};
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "fff22227f4a71ee969833e18b2ea8adf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "fff22227f4a71ee969833e18b2ea8adf");
                } else if (bool2 == null || !bool2.booleanValue()) {
                    a.this.D.setForbidCustomScroll(false);
                } else {
                    a.this.D.setForbidCustomScroll(true);
                }
            }
        });
        this.I.c.a(new l<d.a>() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.28
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable d.a aVar3) {
                d.a aVar4 = aVar3;
                Object[] objArr9 = {aVar4};
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "39a64864de8ff78a6051c9eed133eecf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "39a64864de8ff78a6051c9eed133eecf");
                } else if (aVar4 == d.a.ON_RESUME) {
                    a.this.F().k.a((com.meituan.android.cube.pga.common.j<Boolean>) Boolean.TRUE);
                } else if (aVar4 == d.a.ON_STOP) {
                    a.this.F().l.a((com.meituan.android.cube.pga.common.j<Boolean>) Boolean.TRUE);
                } else if (aVar4 == d.a.ON_DESTROY) {
                    a.this.F().m.a();
                    a.this.I.c.b(this);
                }
            }
        });
        F().al.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.29
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Void r12) {
                Object[] objArr9 = {r12};
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "8a7f91e586010fd3ea34f8b6e8910196", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "8a7f91e586010fd3ea34f8b6e8910196");
                    return;
                }
                a.this.H.c(R.string.wm_page_poiList_progressbar_loading);
                a.this.Y = null;
                a.this.X = null;
                a.this.a(true);
            }
        });
        Object[] objArr9 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect9 = r;
        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "701137341e16f559a064bc1bbc88c550", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "701137341e16f559a064bc1bbc88c550");
        } else if (this.D != null) {
            F().x.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.21
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr10 = {r11};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "4d5137810d1c90bb520263333ee55071", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "4d5137810d1c90bb520263333ee55071");
                    } else {
                        a.u(a.this);
                    }
                }
            });
            this.D.a(new NestedRecyclerView.b() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.22
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.rocks.page.view.NestedRecyclerView.b
                public final void a(RecyclerView recyclerView, int i3) {
                    Object[] objArr10 = {recyclerView, Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "b0266e12edc7fd586e92e689b164f552", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "b0266e12edc7fd586e92e689b164f552");
                        return;
                    }
                    a.this.F().bJ.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(i3));
                    if (a.this.B != null && a.this.B.t != null && a.this.B.t.d != null) {
                        a.this.B.t.d.b(i3);
                    }
                    if (a.this.y == 0 && i3 != 0) {
                        Metrics.getInstance().startCustomScrollFPS(a.this.l());
                    } else if (a.this.y != 0 && i3 == 0) {
                        Metrics.getInstance().stopCustomScrollFPS(a.this.l());
                    }
                    a.this.y = i3;
                }
            });
            this.J = new com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a(this.D);
            this.J.e = new a.InterfaceC0810a() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.24
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.page.kingkong.future.tabfeed.view.a.InterfaceC0810a
                public final void a(int i3) {
                    Object[] objArr10 = {Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "ee52de9a22aa7e0f89dce56216dc3880", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "ee52de9a22aa7e0f89dce56216dc3880");
                        return;
                    }
                    a.this.c(i3);
                    int i4 = Integer.MAX_VALUE;
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) a.this.D.getLayoutManager();
                    int itemCount = a.this.D.getAdapter().getItemCount();
                    if (linearLayoutManager != null) {
                        int i5 = itemCount - 1;
                        r9 = linearLayoutManager.findFirstVisibleItemPosition() == i5;
                        View findViewByPosition = linearLayoutManager.findViewByPosition(i5);
                        if (findViewByPosition != null) {
                            i4 = findViewByPosition.getTop();
                        }
                    }
                    if (a.this.Z && (!a.this.D.canScrollVertically(1) || r9 || i4 <= 0)) {
                        a.this.F().O.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
                    } else {
                        a.this.F().O.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.FALSE);
                    }
                    a.c(a.this, true);
                    if (i3 > 0) {
                        com.sankuai.waimai.business.page.kingkong.view.poilist.categorytabblock.b.b = true;
                    }
                    a.this.F().V.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(i4));
                    if (a.this.E != null) {
                        a.this.E.b(i3);
                    }
                    if (a.this.M != null && i3 > 10) {
                        a.this.M.a();
                    }
                    if (a.this.u != null) {
                        a.this.u.c().a((android.arch.lifecycle.k<Void>) null);
                    }
                }
            };
        }
        this.G = (NestedPullToRefreshView) i().findViewById(R.id.kingkong_refreshview);
        this.G.setContentView(new NestedPullToRefreshView.d(this.B.s));
        this.G.a(new C0806a());
        if (com.sankuai.waimai.platform.privacy.a.a().b()) {
            this.G.setHeaderPullRefreshEnable(false);
        }
        if (!com.sankuai.waimai.platform.privacy.a.a().b()) {
            a((com.meituan.android.cube.pga.block.a) new com.sankuai.waimai.business.page.kingkong.future.operator.a(F(), (ViewStub) u().findViewById(R.id.layout_bottom_right)));
            this.M = new com.sankuai.waimai.business.page.home.layer.b(F().r, u(), new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.30
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr10 = {view};
                    ChangeQuickRedirect changeQuickRedirect10 = a;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "156909856fc4a65a415f0f2bb3c440ee", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "156909856fc4a65a415f0f2bb3c440ee");
                        return;
                    }
                    a.j(a.this);
                    a.this.M.a(false);
                }
            });
            M();
        }
        Object[] objArr10 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect10 = r;
        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "52e21712ea4d8d10c1877f276659f73e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "52e21712ea4d8d10c1877f276659f73e");
        } else if (this.s != null && this.s.r == 1) {
            this.O = new l<WMLocation>() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.3
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable WMLocation wMLocation) {
                    WMLocation wMLocation2 = wMLocation;
                    Object[] objArr11 = {wMLocation2};
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "f1140f7eeca75e88f144cdd4b560ac34", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "f1140f7eeca75e88f144cdd4b560ac34");
                    } else if (com.sankuai.waimai.business.page.common.util.d.a(wMLocation2)) {
                        a.this.t.b(wMLocation2);
                    }
                }
            };
            PreloadDataModel.get().getLocation().a(this.O);
            this.P = new l<WmAddress>() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.4
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable WmAddress wmAddress) {
                    WmAddress wmAddress2 = wmAddress;
                    Object[] objArr11 = {wmAddress2};
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "053d3b33bea32254b289eed352e806f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "053d3b33bea32254b289eed352e806f1");
                        return;
                    }
                    a.this.t.a();
                    a.this.t.a(wmAddress2);
                }
            };
            PreloadDataModel.get().getAddress().a(this.P);
            this.I.h.a((android.arch.lifecycle.f) l(), new l<Boolean>() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.5
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Boolean bool) {
                    Object[] objArr11 = {bool};
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "e527661a26d2788fa848843ae38c6cac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "e527661a26d2788fa848843ae38c6cac");
                    } else {
                        a.this.t.a();
                    }
                }
            });
        }
        com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().a("future_kingkong_oncreate", new boolean[0]);
        a(false);
        F().ak.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.31
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Void r12) {
                Object[] objArr11 = {r12};
                ChangeQuickRedirect changeQuickRedirect11 = a;
                if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "db90cb300eb2824b558f187abcfce205", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "db90cb300eb2824b558f187abcfce205");
                    return;
                }
                a.this.Y = null;
                a.this.X = null;
                a.this.a(true);
            }
        });
        com.sankuai.waimai.platform.preload.e.a().a(F().b(), new com.sankuai.waimai.platform.preload.c<FkkPreloadResponse>() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.preload.c
            public final void a(com.sankuai.waimai.platform.preload.f<FkkPreloadResponse> fVar) {
                Object[] objArr11 = {fVar};
                ChangeQuickRedirect changeQuickRedirect11 = a;
                if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "33c39854bea646b1a5b90fab98afe653", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "33c39854bea646b1a5b90fab98afe653");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b(KingKongNetworkPreLoader.KING_KONG_PRELOAD, "FkkFragmnet KingKongResponsePreloadCallback data: " + fVar.c + "   state: " + fVar.b + "   isFinish: " + fVar.d, new Object[0]);
                if (fVar.b == f.a.LOADING) {
                    return;
                }
                if (fVar == null || fVar.c == null) {
                    a.this.F().am.a((com.meituan.android.cube.pga.common.b<com.sankuai.waimai.platform.preload.f<FkkPreloadResponse>>) fVar);
                    a.this.F().an.a((com.meituan.android.cube.pga.common.b<com.sankuai.waimai.platform.preload.f<FkkPreloadResponse>>) fVar);
                    return;
                }
                if (fVar.c.a != a.this.Q) {
                    a.this.Q = fVar.c.a;
                    a.this.F().am.a((com.meituan.android.cube.pga.common.b<com.sankuai.waimai.platform.preload.f<FkkPreloadResponse>>) fVar);
                }
                if (fVar.c.b != a.this.R) {
                    a.this.R = fVar.c.b;
                    a.this.F().an.a((com.meituan.android.cube.pga.common.b<com.sankuai.waimai.platform.preload.f<FkkPreloadResponse>>) fVar);
                }
            }
        });
        this.u = (PouchViewModel) q.a(l()).a(PouchViewModel.class);
        if (this.u != null) {
            com.meituan.android.cube.pga.common.d<Integer> a = F().L.a();
            this.u.g = (a == null ? 0 : a.c()) + (com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) l()) ? com.sankuai.waimai.foundation.utils.g.e(m()) : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N() {
        com.sankuai.waimai.rocks.view.viewmodel.d G;
        com.sankuai.waimai.mach.recycler.b c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e640cbd971ec431011485475ab041848", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e640cbd971ec431011485475ab041848");
            return;
        }
        this.S = F().bE.a().b;
        if (this.S instanceof RocksPagerAdapter) {
            SparseArray<com.sankuai.waimai.rocks.page.tablist.rocklist.c> sparseArray = ((RocksPagerAdapter) this.S).b;
            for (int i = 0; sparseArray != null && i < sparseArray.size(); i++) {
                com.sankuai.waimai.rocks.page.tablist.rocklist.c cVar = sparseArray.get(sparseArray.keyAt(0));
                com.sankuai.waimai.rocks.view.a M = cVar.M();
                if (M != null && M.c != null && (c = M.c.c()) != null) {
                    c.a();
                }
                if (cVar != null && M != null && (G = M.d.G()) != null) {
                    List<com.sankuai.waimai.rocks.view.viewmodel.e> list = G.o;
                    if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
                        for (com.sankuai.waimai.rocks.view.viewmodel.e eVar : list) {
                            if (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.a) {
                                ((com.sankuai.waimai.rocks.view.viewmodel.a) eVar).n();
                            }
                        }
                        list.clear();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f3ce08dd61a7d46320eca7216a0e978", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f3ce08dd61a7d46320eca7216a0e978");
            return;
        }
        WmAddress k = g.a().k();
        if (this.s != null && this.s.r == 1 && (k == null || !k.hasAddress())) {
            this.t.a();
            this.t.a(F().r);
            return;
        }
        if (this.s != null && this.s.r == 1) {
            this.t.a(k);
        }
        com.sankuai.waimai.business.page.kingkong.future.mach.d.a().b();
        if (z || TextUtils.isEmpty(com.sankuai.waimai.business.page.kingkong.future.network.c.g)) {
            com.sankuai.waimai.business.page.kingkong.future.network.c.g = ListIDHelper.a.a.a();
        }
        if (z || TextUtils.isEmpty(com.sankuai.waimai.business.page.kingkong.future.network.a.g)) {
            com.sankuai.waimai.business.page.kingkong.future.network.a.g = ListIDHelper.a.a.a();
        }
        v.put("rank_list_id", com.sankuai.waimai.business.page.kingkong.future.network.c.g);
        this.B.a(0, new b.c() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.10
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.page.block.b.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "657d8aaae60bbf309f88a6429570992c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "657d8aaae60bbf309f88a6429570992c");
                } else {
                    a.this.F().Y.a((com.meituan.android.cube.pga.common.b<ResponseMsgBean>) new ResponseMsgBean(null, 0, 0));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c198f8f6fd2b0552463576ee0d160e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c198f8f6fd2b0552463576ee0d160e1");
            return;
        }
        if (F() != null) {
            F().ai.a((com.meituan.android.cube.pga.common.b<Void>) null);
        }
        if (this.A != null) {
            this.A.d();
            this.A.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2e0d35c456754ec13eb95210af0b559", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2e0d35c456754ec13eb95210af0b559");
        } else if (com.sankuai.waimai.foundation.utils.d.a(this.W)) {
        } else {
            Iterator<e> it = this.W.iterator();
            while (it.hasNext()) {
                e next = it.next();
                if (next != null) {
                    next.unsubscribe();
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.kingkong.future.root.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0806a extends com.sankuai.waimai.platform.widget.pullrefresh.c {
        public static ChangeQuickRedirect a;

        public C0806a() {
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.c
        public final void a(com.sankuai.waimai.platform.widget.pullrefresh.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e71b3cab771fb2b2d5dfc3d6e79ec5d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e71b3cab771fb2b2d5dfc3d6e79ec5d");
            } else {
                a.this.Q();
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.c, com.sankuai.waimai.platform.widget.pullrefresh.a
        public final void a(@NonNull com.sankuai.waimai.platform.widget.pullrefresh.b bVar, int i, int i2, int i3) {
            Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e40daed22ec93120cc044a8953760478", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e40daed22ec93120cc044a8953760478");
            } else {
                super.a(bVar, i, i2, i3);
            }
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.c, com.sankuai.waimai.platform.widget.pullrefresh.a
        public final void a(@NonNull com.sankuai.waimai.platform.widget.pullrefresh.b bVar, int i, int i2) {
            Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a70b81630f7961b5064e1048464a177", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a70b81630f7961b5064e1048464a177");
            } else {
                super.a(bVar, i, i2);
            }
        }
    }

    public final void Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eab5205fbbd966366ef4c83a6235eaca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eab5205fbbd966366ef4c83a6235eaca");
            return;
        }
        N();
        this.N = true;
        O();
        if (this.A != null) {
            this.A.a(true);
        }
        com.sankuai.waimai.business.page.kingkong.future.mach.d.a().b();
        this.Y = null;
        this.X = null;
        P();
        com.sankuai.waimai.business.page.kingkong.future.mach.c.b.clear();
        com.sankuai.waimai.business.page.kingkong.future.network.c.g = ListIDHelper.a.a.a();
        com.sankuai.waimai.business.page.kingkong.future.network.a.g = ListIDHelper.a.a.a();
        v.put("rank_list_id", com.sankuai.waimai.business.page.kingkong.future.network.c.g);
        this.B.a(1, new b.c() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.18
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.page.block.b.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00efeba33c337060550d16ea0bbe9e8a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00efeba33c337060550d16ea0bbe9e8a");
                    return;
                }
                a.this.F().Y.a((com.meituan.android.cube.pga.common.b<ResponseMsgBean>) new ResponseMsgBean(null, 0, 0));
                a.t(a.this);
            }
        });
    }

    public final void R() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1340147e75b1f5512b6e83c81bb6728a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1340147e75b1f5512b6e83c81bb6728a");
        } else {
            i().postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.19
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05d07fecc1a3be588913973021fddf87", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05d07fecc1a3be588913973021fddf87");
                    } else {
                        a.this.A.aq_();
                    }
                }
            }, 300L);
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd67199ad0f145ef491dcb19ff03f2aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd67199ad0f145ef491dcb19ff03f2aa");
        } else {
            i().postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.kingkong.future.root.a.20
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9dee7fe4198a2e948003cb46559781cf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9dee7fe4198a2e948003cb46559781cf");
                    } else if (a.this.A != null) {
                        b bVar = a.this.A;
                        f.a aVar = new f.a(f.b.EXPOSE);
                        aVar.c = true;
                        bVar.a(aVar.a());
                    }
                }
            }, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fa553d6667d2ffaf9ee46132c80ac24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fa553d6667d2ffaf9ee46132c80ac24");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.aa.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.ab - i;
            this.aa.setLayoutParams(layoutParams);
        }
    }
}
