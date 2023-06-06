package com.sankuai.waimai.store.orderlist.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.o;
import com.sankuai.shangou.stone.util.q;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import com.sankuai.waimai.business.order.api.model.Order;
import com.sankuai.waimai.business.order.api.model.OrderListResponse;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.newwidgets.pullrefresh.SCNestedPullRefreshView;
import com.sankuai.waimai.store.order.detail.blockview.f;
import com.sankuai.waimai.store.order.detail.model.OrderDetailRecommendResponse;
import com.sankuai.waimai.store.orderlist.OrderListFragment;
import com.sankuai.waimai.store.orderlist.model.OrderDeleteResponse;
import com.sankuai.waimai.store.repository.model.f;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.widgets.layoutmanager.FixedStaggeredGridLayoutManager;
import com.sankuai.waimai.store.widgets.recycler.l;
import com.tencent.connect.common.Constants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class OrderListView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.orderlist.adapter.b A;
    private String B;
    private Handler C;
    private LinearLayoutManager D;
    private StaggeredGridLayoutManager E;
    private boolean F;
    private boolean G;
    private final int H;
    private final int I;
    private String J;
    private com.sankuai.waimai.store.orderlist.presenter.b K;
    private com.sankuai.waimai.store.param.a L;
    private String M;
    private String N;
    private RecyclerView.k O;
    Context b;
    SCNestedPullRefreshView c;
    LinearLayout d;
    boolean e;
    boolean f;
    com.sankuai.waimai.store.poilist.mach.d g;
    private String h;
    private String i;
    private boolean j;
    private boolean k;
    private boolean l;
    private RecyclerView m;
    private View n;
    private LinearLayout o;
    private LinearLayout p;
    private TextView q;
    private TextView r;
    private View s;
    private NestedScrollView t;
    private com.sankuai.waimai.platform.widget.emptylayout.d u;
    private com.sankuai.waimai.store.orderlist.adapter.a v;
    private OrderListFragment w;
    private Activity x;
    private String y;
    private int z;

    public static /* synthetic */ void a(OrderListView orderListView, int i, String str, OrderDeleteResponse orderDeleteResponse) {
        boolean z;
        boolean z2 = true;
        Object[] objArr = {Integer.valueOf(i), str, orderDeleteResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderListView, changeQuickRedirect, false, "3517423dc60c155acddf9f194534c65e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderListView, changeQuickRedirect, false, "3517423dc60c155acddf9f194534c65e");
            return;
        }
        if (i == 1) {
            am.a(orderListView.b, !TextUtils.isEmpty(str) ? str : orderListView.getResources().getString(R.string.wm_sc_order_list_delete_order_failed));
        }
        if (orderListView.v != null && ((i == 0 || i == 2) && orderDeleteResponse != null)) {
            com.sankuai.waimai.store.orderlist.adapter.a aVar = orderListView.v;
            long j = orderDeleteResponse.orderId;
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.orderlist.adapter.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f868f3646e48e785301e50cb11b608c4", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f868f3646e48e785301e50cb11b608c4")).booleanValue();
            } else {
                if (!com.sankuai.shangou.stone.util.a.b(aVar.b)) {
                    int a2 = aVar.a(j);
                    Object[] objArr3 = {Integer.valueOf(a2)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.orderlist.adapter.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "ab3679613650ba7c04c0feab77fc31be", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "ab3679613650ba7c04c0feab77fc31be")).booleanValue();
                    } else {
                        z = !com.sankuai.shangou.stone.util.a.b(aVar.b) && a2 < aVar.b.size() && a2 >= 0;
                    }
                    if (z && aVar.b.get(a2) != null) {
                        aVar.b.remove(a2);
                        aVar.m();
                    }
                }
                z2 = false;
            }
            if (z2) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, orderListView, changeQuickRedirect4, false, "354723b29f8d88c0f5349e71a0ca7d65", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, orderListView, changeQuickRedirect4, false, "354723b29f8d88c0f5349e71a0ca7d65");
                } else {
                    orderListView.m.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.orderlist.view.OrderListView.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ead3ef0ecf49b8c7c649bb632674ce87", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ead3ef0ecf49b8c7c649bb632674ce87");
                            } else if (OrderListView.this.m.canScrollVertically(1)) {
                            } else {
                                com.sankuai.shangou.stone.util.log.a.a("scroll_tag", "Recycle 删除订单后加载更多", new Object[0]);
                                OrderListView.b(OrderListView.this);
                            }
                        }
                    }, 150L);
                }
            }
        }
        OrderListFragment orderListFragment = orderListView.w;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = OrderListFragment.a;
        if (PatchProxy.isSupport(objArr5, orderListFragment, changeQuickRedirect5, false, "58e07723672409bda3e298e50a3611dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, orderListFragment, changeQuickRedirect5, false, "58e07723672409bda3e298e50a3611dc");
        } else if (orderListFragment.g != null) {
            if (orderListFragment.g.equals(orderListFragment.d)) {
                if (orderListFragment.e != null && orderListFragment.e.d()) {
                    orderListFragment.e.e();
                }
                if (orderListFragment.f != null && orderListFragment.f.d()) {
                    orderListFragment.f.e();
                }
            } else if (orderListFragment.g.equals(orderListFragment.e)) {
                if (orderListFragment.d != null && orderListFragment.d.d()) {
                    orderListFragment.d.e();
                }
                if (orderListFragment.f != null && orderListFragment.f.d()) {
                    orderListFragment.f.e();
                }
            } else if (orderListFragment.g.equals(orderListFragment.f)) {
                if (orderListFragment.d != null && orderListFragment.d.d()) {
                    orderListFragment.d.e();
                }
                if (orderListFragment.e != null && orderListFragment.e.d()) {
                    orderListFragment.e.e();
                }
            }
        }
        orderListView.l();
    }

    public static /* synthetic */ void a(OrderListView orderListView, com.sankuai.waimai.store.orderlist.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderListView, changeQuickRedirect, false, "cdacf2709414f58fee838abfdd11dfa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderListView, changeQuickRedirect, false, "cdacf2709414f58fee838abfdd11dfa9");
        } else if (bVar != null) {
            com.sankuai.waimai.store.base.net.wm.a.a(orderListView.w.q()).a(Long.toString(bVar.b), bVar.c, new j<OrderDeleteResponse>() { // from class: com.sankuai.waimai.store.orderlist.view.OrderListView.13
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3058751de758976d1cfaf51fe1c1b2fc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3058751de758976d1cfaf51fe1c1b2fc");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(OrderDeleteResponse orderDeleteResponse) {
                    OrderDeleteResponse orderDeleteResponse2 = orderDeleteResponse;
                    Object[] objArr2 = {orderDeleteResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c09fbda0407db915d4283cd6aeeebc8d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c09fbda0407db915d4283cd6aeeebc8d");
                    } else {
                        OrderListView.a(OrderListView.this, 0, null, orderDeleteResponse2);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar2) {
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5507be1dbf876d0971686f983f4765c8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5507be1dbf876d0971686f983f4765c8");
                    } else if (bVar2.b() || bVar2.a()) {
                        OrderListView.this.a(OrderListView.this.getResources().getString(R.string.wm_sc_order_list_delete_order_failed));
                    } else {
                        OrderListView.a(OrderListView.this, bVar2.c, bVar2.getMessage(), bVar2.e == null ? null : (OrderDeleteResponse) bVar2.e);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void a(OrderListView orderListView, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderListView, changeQuickRedirect, false, "b1806ee05593b0934eb3a3328d9cce42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderListView, changeQuickRedirect, false, "b1806ee05593b0934eb3a3328d9cce42");
            return;
        }
        int min = Math.min(10, com.sankuai.shangou.stone.util.a.a(list));
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                f fVar = (f) list.get(i);
                if (fVar != null && fVar.i != null && fVar.i.cardType == 2 && fVar.i.moduleDesc != null && "mach".equals(fVar.i.moduleDesc.nativeId) && !t.a(fVar.i.moduleDesc.templateId)) {
                    fVar.j = orderListView.g.a(fVar.i, orderListView.v.a() + i);
                }
            }
        }
    }

    public static /* synthetic */ void b(OrderListView orderListView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderListView, changeQuickRedirect, false, "7fa7e455a54b9791dcba82e5ae35450c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderListView, changeQuickRedirect, false, "7fa7e455a54b9791dcba82e5ae35450c");
        } else if ((orderListView.j || (!orderListView.i() && orderListView.K.c)) && orderListView.k) {
            if (o.c(orderListView.b)) {
                orderListView.k = false;
                orderListView.k();
                return;
            }
            orderListView.n();
            orderListView.c.setFooterPullRefreshEnable(true);
        }
    }

    public static /* synthetic */ void c(OrderListView orderListView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderListView, changeQuickRedirect, false, "9b325eac0e55e9c91a8ccd8f8b671875", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderListView, changeQuickRedirect, false, "9b325eac0e55e9c91a8ccd8f8b671875");
        } else if (!orderListView.d()) {
            orderListView.t.setVisibility(0);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, orderListView, changeQuickRedirect2, false, "a898a03e7ecf37bf326d5dad039459e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, orderListView, changeQuickRedirect2, false, "a898a03e7ecf37bf326d5dad039459e2");
                return;
            }
            orderListView.u.d();
            orderListView.c.setFooterPullRefreshEnable(false);
        } else if (!orderListView.j && !orderListView.f) {
            orderListView.w.d(true);
        } else if (!orderListView.j || orderListView.f) {
        } else {
            orderListView.c();
        }
    }

    public static /* synthetic */ void d(OrderListView orderListView, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderListView, changeQuickRedirect, false, "bfd49c47b1a2024a788e0ca5ba07ef05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderListView, changeQuickRedirect, false, "bfd49c47b1a2024a788e0ca5ba07ef05");
            return;
        }
        orderListView.o.setVisibility(8);
        orderListView.d.setVisibility(8);
        orderListView.s.setVisibility(8);
        orderListView.p.setVisibility(0);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        orderListView.q.setText(str);
    }

    public static /* synthetic */ boolean d(OrderListView orderListView, boolean z) {
        orderListView.k = true;
        return true;
    }

    public OrderListView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ea44a935f412b1060dba52733604683", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ea44a935f412b1060dba52733604683");
        }
    }

    public OrderListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91a2c80c22b7cde3f5abe0785950424c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91a2c80c22b7cde3f5abe0785950424c");
        }
    }

    public OrderListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4523e67d3a9ad6efba88b10f8722c2ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4523e67d3a9ad6efba88b10f8722c2ee");
            return;
        }
        this.h = "0";
        this.i = this.h;
        this.j = true;
        this.l = true;
        this.y = "";
        this.z = 0;
        this.C = new a(this);
        this.e = false;
        this.f = false;
        this.F = false;
        this.G = false;
        this.J = "";
        this.K = new com.sankuai.waimai.store.orderlist.presenter.b();
        this.M = null;
        this.O = new RecyclerView.k() { // from class: com.sankuai.waimai.store.orderlist.view.OrderListView.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e56742ca2d72b3790d0e89f7f8a42397", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e56742ca2d72b3790d0e89f7f8a42397");
                    return;
                }
                super.onScrolled(recyclerView, i2, i3);
                if (q.c(recyclerView) && !OrderListView.this.F && com.sankuai.waimai.store.manager.user.a.a().b()) {
                    OrderListView.b(OrderListView.this);
                }
            }
        };
        this.b = context;
        this.H = h.a(getContext(), 12.0f);
        this.I = h.a(getContext(), 4.0f);
        int a2 = ((h.a(context) - (this.H * 2)) - (this.I * 2)) / 2;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef3a4a84cd1de15c27976250030bdf6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef3a4a84cd1de15c27976250030bdf6a");
        } else {
            this.L = new com.sankuai.waimai.store.param.a();
            this.L.G = "c_waimai_m5pcse9e";
            this.L.c = -999L;
            this.L.f = "-999";
            this.L.T = "-999";
            this.L.g = -999L;
            this.L.l.put("-999", "-999");
        }
        this.g = new com.sankuai.waimai.store.poilist.mach.d((BaseActivity) context, this.L, a2);
        this.g.d = "sm_mach_order_list_poi_recycle_mach_%s";
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ee2fcc3e8054ac8e2c8f8ab24b720df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ee2fcc3e8054ac8e2c8f8ab24b720df");
            return;
        }
        super.onDetachedFromWindow();
        if (this.g != null) {
            this.g.a();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d511f72fcccc2b4cdaf9ef154edc1ea6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d511f72fcccc2b4cdaf9ef154edc1ea6");
            return;
        }
        super.onFinishInflate();
        LayoutInflater.from(this.b).inflate(R.layout.wm_sc_order_list_view_order_list, (ViewGroup) this, true);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6606344097329109af9a76445c7af7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6606344097329109af9a76445c7af7b");
        } else {
            com.sankuai.shangou.stone.util.log.a.a("order-list", "[fragment]init", new Object[0]);
            this.m = (RecyclerView) findViewById(R.id.list_orderList_orderList);
            this.m.addItemDecoration(new b());
            this.c = (SCNestedPullRefreshView) findViewById(R.id.pullList_orderList_orderList);
            this.t = (NestedScrollView) findViewById(R.id.scroll_view);
            this.t.setVisibility(8);
            findViewById(R.id.layout_info).setBackgroundColor(0);
            this.u = new com.sankuai.waimai.platform.widget.emptylayout.d(this);
            this.n = LayoutInflater.from(this.b).inflate(R.layout.wm_sc_order_list_footer, (ViewGroup) this, false);
            View view = this.n;
            Object[] objArr3 = {view};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d143124b8bbfccbe101548b08369c86a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d143124b8bbfccbe101548b08369c86a");
            } else {
                this.d = (LinearLayout) view.findViewById(R.id.ll_orderlist_footer_before);
                this.o = (LinearLayout) view.findViewById(R.id.ll_orderlist_footer_more);
                this.r = (TextView) view.findViewById(R.id.txt_footer_info);
                this.q = (TextView) view.findViewById(R.id.tv_order_list_footer_tips);
                this.s = view.findViewById(R.id.pull_to_load_progress);
                this.s.setVisibility(8);
                this.p = (LinearLayout) view.findViewById(R.id.ll_orderlist_footer_no_more_order);
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "af3e76a2535cf463be1cf6704ae7abfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "af3e76a2535cf463be1cf6704ae7abfe");
            return;
        }
        this.u.c(new View.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.view.OrderListView.7
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr5 = {view2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8eeb83491c1275f591368f8e57ba675a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8eeb83491c1275f591368f8e57ba675a");
                    return;
                }
                OrderListView.this.l = true;
                OrderListView.this.a();
            }
        });
        this.c.setFooterPullRefreshEnable(false);
        this.c.setHeaderPullRefreshEnable(true);
        this.m.addOnScrollListener(this.O);
        this.c.a(new com.sankuai.waimai.store.newwidgets.pullrefresh.c() { // from class: com.sankuai.waimai.store.orderlist.view.OrderListView.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.c
            public final void a(com.sankuai.waimai.store.newwidgets.pullrefresh.b bVar) {
                Object[] objArr5 = {bVar};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "12004f8658623234e1c5a6b39f592b7f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "12004f8658623234e1c5a6b39f592b7f");
                    return;
                }
                com.sankuai.shangou.stone.util.log.a.a("pulltorefresh_tag", "onHeaderRefresh", new Object[0]);
                OrderListView orderListView = OrderListView.this;
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = OrderListView.a;
                if (PatchProxy.isSupport(objArr6, orderListView, changeQuickRedirect6, false, "472795a4e2ffa9652907a4f3bbe4acdb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, orderListView, changeQuickRedirect6, false, "472795a4e2ffa9652907a4f3bbe4acdb");
                    return;
                }
                orderListView.f = true;
                orderListView.b();
            }
        });
        this.c.b(new com.sankuai.waimai.store.newwidgets.pullrefresh.c() { // from class: com.sankuai.waimai.store.orderlist.view.OrderListView.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.c
            public final void a(com.sankuai.waimai.store.newwidgets.pullrefresh.b bVar) {
                Object[] objArr5 = {bVar};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e0791eba559e851ace4be7b10a373327", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e0791eba559e851ace4be7b10a373327");
                    return;
                }
                com.sankuai.shangou.stone.util.log.a.a("pulltorefresh_tag", "onFooterRefresh", new Object[0]);
                OrderListView orderListView = OrderListView.this;
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = OrderListView.a;
                if (PatchProxy.isSupport(objArr6, orderListView, changeQuickRedirect6, false, "7d70d03195f7dcbf7a47c6ebc900cabd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, orderListView, changeQuickRedirect6, false, "7d70d03195f7dcbf7a47c6ebc900cabd");
                    return;
                }
                com.sankuai.shangou.stone.util.log.a.a("pullloadmoreorders", "onFooterRefresh", new Object[0]);
                orderListView.e = true;
                if (!o.c(orderListView.b)) {
                    orderListView.a(orderListView.b.getString(R.string.wm_sc_order_base_net_error_toast));
                    orderListView.c.setFooterPullRefreshEnable(true);
                    return;
                }
                if (orderListView.d.getVisibility() == 0) {
                    orderListView.c();
                }
                orderListView.a();
            }
        });
    }

    public final void a(OrderListFragment orderListFragment, Activity activity, com.sankuai.waimai.store.orderlist.listener.b bVar, int i, String str, String str2) {
        Object[] objArr = {orderListFragment, activity, bVar, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "191931c1eeeb5610cbebe6c0b6396cff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "191931c1eeeb5610cbebe6c0b6396cff");
            return;
        }
        this.N = str2;
        this.w = orderListFragment;
        this.x = activity;
        this.z = i;
        this.J = str;
        this.B = AppUtil.generatePageInfoKey(orderListFragment);
        this.v = new com.sankuai.waimai.store.orderlist.adapter.a(activity, orderListFragment, this.g, this.L, this.B, bVar, this.C, str, i);
        this.v.d(this.n);
        this.D = new LinearLayoutManager(this.x);
        this.E = new FixedStaggeredGridLayoutManager(2, 1);
        this.A = new com.sankuai.waimai.store.orderlist.adapter.b(orderListFragment);
        f();
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "814b89af144b3369e75cef7f02c129b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "814b89af144b3369e75cef7f02c129b3");
            return;
        }
        this.m.setLayoutManager(this.E);
        this.m.setAdapter(new l(this.v) { // from class: com.sankuai.waimai.store.orderlist.view.OrderListView.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.widgets.recycler.l, android.support.v7.widget.RecyclerView.a
            public final void onViewAttachedToWindow(@NonNull RecyclerView.s sVar) {
                Object[] objArr2 = {sVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37e930cdff9af687d454b90509efb052", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37e930cdff9af687d454b90509efb052");
                } else if (sVar == null || sVar.itemView == null) {
                } else {
                    ViewGroup.LayoutParams layoutParams = sVar.itemView.getLayoutParams();
                    if (layoutParams instanceof StaggeredGridLayoutManager.b) {
                        StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams;
                        int itemViewType = sVar.getItemViewType();
                        if (itemViewType == 1002 || itemViewType == 1003) {
                            bVar.b = false;
                        } else {
                            bVar.b = true;
                        }
                    }
                }
            }
        });
    }

    private void a(boolean z, int i, int i2) {
        Object[] objArr = {(byte) 0, Integer.valueOf((int) R.drawable.waimai_c_no_comment), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cfe154c5fcd07616520ff5e1ecbe3e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cfe154c5fcd07616520ff5e1ecbe3e3");
            return;
        }
        this.u.b(R.drawable.waimai_c_no_comment, i2).f();
        setPullEnabledState(false);
        g();
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "519858ed8fd837a6b5d1e7ec12c4bd23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "519858ed8fd837a6b5d1e7ec12c4bd23");
            return;
        }
        com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("c_waimai_m5pcse9e", "b_waimai_fzc8v7me_mv", this.u.a());
        bVar.e = "b_waimai_fzc8v7me_mv" + this.z;
        bVar.a("page_type", Integer.valueOf(this.z));
        if (this.b instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.b, bVar);
        } else {
            com.sankuai.shangou.stone.util.log.a.d("OrderListView", "mContext is not IExposeHost", new Object[0]);
        }
    }

    public final void a(boolean z, int i, int i2, int i3, int i4, View.OnClickListener onClickListener) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43d4b234472da641c74a8aab7dceb23a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43d4b234472da641c74a8aab7dceb23a");
            return;
        }
        this.u.a(i, i2, i3, i4, onClickListener).f();
        setPullEnabledState(z);
        g();
    }

    private void setPullEnabledState(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d010d7e1e215041ec3888788dac105f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d010d7e1e215041ec3888788dac105f");
        } else if (this.j && !z) {
            if (this.v.e()) {
                return;
            }
            this.c.setFooterPullRefreshEnable(true);
        } else {
            this.c.setFooterPullRefreshEnable(false);
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9f185053887eb5851d6a89b42b55b77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9f185053887eb5851d6a89b42b55b77");
        } else {
            this.c.setFooterPullRefreshEnable(false);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39c8bec6397d974422fd165b4d19bf7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39c8bec6397d974422fd165b4d19bf7a");
        } else if (com.sankuai.waimai.store.manager.user.a.a().b()) {
            k();
        } else {
            am.a(this.b, (int) R.string.wm_sc_order_list_need_login_message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e38462ee8192670887d229b8f62dcd3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e38462ee8192670887d229b8f62dcd3")).booleanValue();
        }
        System.err.println("robust.modify 修改闪购订单列表中-闪购订单不显示的问题");
        return "1".equals(this.N);
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b172e5920810dc2e26900bdc60cb2fba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b172e5920810dc2e26900bdc60cb2fba");
            return;
        }
        if (this.M == null && i()) {
            this.M = Constants.VIA_REPORT_TYPE_DATALINE;
        }
        com.sankuai.waimai.store.base.net.wm.a.a(this.w.q()).a(this.y, this.h, this.z, "14060", this.M, new j<OrderListResponse>() { // from class: com.sankuai.waimai.store.orderlist.view.OrderListView.10
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.j
            public final void b() {
            }

            /* JADX WARN: Removed duplicated region for block: B:61:0x01aa  */
            /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
            @Override // com.sankuai.waimai.store.base.net.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ void a(com.sankuai.waimai.business.order.api.model.OrderListResponse r15) {
                /*
                    Method dump skipped, instructions count: 472
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.orderlist.view.OrderListView.AnonymousClass10.a(java.lang.Object):void");
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9401c7c0e25614f25303f611c325da3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9401c7c0e25614f25303f611c325da3");
                    return;
                }
                OrderListView.this.F = true;
                OrderListView.c(OrderListView.this);
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79aee3ec56cc04b57e4953cbd61e8a00", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79aee3ec56cc04b57e4953cbd61e8a00");
                    return;
                }
                if (TextUtils.isEmpty(bVar.getMessage())) {
                    OrderListView.this.a(OrderListView.this.b.getString(R.string.takeout_loading_fail_try_afterwhile));
                } else {
                    OrderListView.this.a(bVar.getMessage());
                }
                OrderListView.this.F = false;
            }
        });
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28136a9f9edfbb68344237a43ba78e17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28136a9f9edfbb68344237a43ba78e17");
        } else if (this.F) {
        } else {
            if (this.j) {
                j();
            } else if (this.K.c) {
                o();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "394e448b173073977318c18314a1f09e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "394e448b173073977318c18314a1f09e");
            return;
        }
        this.w.d(false);
        if (this.f) {
            this.c.a();
            this.f = false;
        }
        if (this.e) {
            this.c.a();
            this.e = false;
        }
        if (d()) {
            if (this.z == 0 && this.G) {
                f();
                this.G = false;
            }
            this.t.setVisibility(8);
            this.u.h();
            h();
        } else if (this.z == 2) {
            a(false, R.drawable.waimai_c_no_comment, R.string.wm_sc_order_list_refreshEmpty_noRefund_Orders_message);
            this.t.setVisibility(0);
        } else if (this.z == 1) {
            a(false, R.drawable.waimai_c_no_comment, R.string.wm_sc_order_list_refreshEmpty_noUnComment_Orders_message);
            this.t.setVisibility(0);
        } else {
            if (m()) {
                a(false, R.drawable.wm_sc_common_default_empty_icon, R.string.wm_sc_order_list_refreshEmpty_noOrders_message, R.string.wm_sc_order_list_refreshEmpty_noOrders_message_sub_title, 0, (View.OnClickListener) null);
                this.A.c = "";
            } else {
                a(false, R.drawable.wm_sc_common_default_empty_icon, R.string.wm_sc_order_list_refreshEmpty_noOrders_message, R.string.wm_sc_order_list_refreshEmpty_noOrders_message_sub_title, R.string.wm_sc_order_list_refreshEmpty_to_poiList, new View.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.view.OrderListView.11
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09c366116f795fef60b133962ff8d76d", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09c366116f795fef60b133962ff8d76d");
                        } else {
                            OrderListView.this.w.a(2);
                        }
                    }
                });
                this.A.d = com.sankuai.waimai.store.util.b.a(getContext(), (int) R.string.wm_sc_order_list_refreshEmpty_to_poiList);
            }
            this.t.setVisibility(8);
            this.A.c = i() ? getResources().getString(R.string.wm_sc_no_more) : getResources().getString(R.string.wm_sc_order_list_bottom_txt);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0f57b6ccdfc10df36f28eb5569e3997", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0f57b6ccdfc10df36f28eb5569e3997");
            } else {
                this.m.setLayoutManager(this.D);
                this.m.setAdapter(this.A);
            }
            this.G = true;
        }
        this.w.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e27e6b470a0d7037a18f37805eb04a7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e27e6b470a0d7037a18f37805eb04a7")).booleanValue() : this.w.getArguments() != null && DefaultHeaderService.KEY_DRUG.equals(this.w.getArguments().get("from"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "971471033c536e6da7178cd644dc8fc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "971471033c536e6da7178cd644dc8fc6");
            return;
        }
        this.w.d(false);
        this.w.a();
        n();
        if (this.f) {
            this.c.a();
            this.f = false;
        }
        if (this.e) {
            this.c.a();
            this.e = false;
        }
        if (d()) {
            this.u.h();
            h();
            am.a(this.b, str);
        } else {
            a(true, R.drawable.wm_sc_common_default_empty_icon, R.string.wm_sc_order_list_refresh_failed_message, 0, R.string.wm_sc_common_reload, new View.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.view.OrderListView.12
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f37e52809fcc85e7938675e7623ff08", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f37e52809fcc85e7938675e7623ff08");
                        return;
                    }
                    OrderListView.this.l = true;
                    OrderListView.this.a();
                }
            });
        }
        this.k = true;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d653c66a042de218b48d8215a76dc14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d653c66a042de218b48d8215a76dc14");
            return;
        }
        this.k = true;
        this.j = true;
        this.y = "";
        this.h = "0";
        this.i = this.h;
        this.l = true;
        this.K.a();
        a();
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a89492232f0c39acdf00e308df0f3ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a89492232f0c39acdf00e308df0f3ed");
            return;
        }
        this.o.setVisibility(0);
        this.d.setVisibility(8);
        this.s.setVisibility(8);
        this.r.setText(R.string.wm_sc_order_list_fail_to_load);
        this.p.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f42de7ff88c14ee6ce78868dca11b3ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f42de7ff88c14ee6ce78868dca11b3ba");
            return;
        }
        this.o.setVisibility(0);
        this.d.setVisibility(8);
        this.s.setVisibility(0);
        this.r.setText(R.string.wm_sc_common_loading);
        this.p.setVisibility(8);
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d81aa6b4ffff6847a1d951bb779c96e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d81aa6b4ffff6847a1d951bb779c96e")).booleanValue() : (this.v == null || this.v.e()) ? false : true;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07ac61e1270cebe804b70621c6957db4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07ac61e1270cebe804b70621c6957db4");
        } else {
            this.v.c();
        }
    }

    public List<com.sankuai.waimai.store.orderlist.model.c> getOrders() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "142bd28774c250134f1cbc0ce66b5c2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "142bd28774c250134f1cbc0ce66b5c2d");
        }
        if (this.v == null) {
            return null;
        }
        return this.v.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends Handler {
        public static ChangeQuickRedirect a;
        private WeakReference<OrderListView> b;

        public a(OrderListView orderListView) {
            Object[] objArr = {orderListView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "159fcbe2646c4c6aa170c01ea7442cb6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "159fcbe2646c4c6aa170c01ea7442cb6");
            } else {
                this.b = new WeakReference<>(orderListView);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12d93b88b94753958b23010b6fcb991c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12d93b88b94753958b23010b6fcb991c");
                return;
            }
            super.handleMessage(message);
            OrderListView orderListView = this.b.get();
            if (orderListView != null) {
                switch (message.what) {
                    case 1000000:
                        orderListView.b();
                        return;
                    case 1000001:
                        OrderListView.a(orderListView, (com.sankuai.waimai.store.orderlist.model.b) message.obj);
                        return;
                    case 1000002:
                        orderListView.w.d(true);
                        return;
                    case 1000003:
                        orderListView.w.d(false);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b extends RecyclerView.f {
        public static ChangeQuickRedirect a;
        private final int c;

        public b() {
            Object[] objArr = {OrderListView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bf55d7e94c6d94cd3d1ee7f2614e16e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bf55d7e94c6d94cd3d1ee7f2614e16e");
            } else {
                this.c = h.a(OrderListView.this.getContext(), 10.0f);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.f
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Object[] objArr = {rect, view, recyclerView, state};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f262c9c02a882feab3123892ff6adf3b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f262c9c02a882feab3123892ff6adf3b");
            } else if (view.getLayoutParams() instanceof StaggeredGridLayoutManager.b) {
                StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) view.getLayoutParams();
                if (bVar.b) {
                    rect.left = OrderListView.this.H;
                    rect.right = OrderListView.this.H;
                    rect.bottom = this.c;
                    if (recyclerView.getChildAdapterPosition(view) == 0) {
                        rect.top = this.c;
                        return;
                    } else {
                        rect.top = 0;
                        return;
                    }
                }
                if (bVar.b() % 2 == 0) {
                    rect.left = OrderListView.this.H;
                    rect.right = OrderListView.this.I;
                } else {
                    rect.left = OrderListView.this.I;
                    rect.right = OrderListView.this.H;
                }
                rect.top = 0;
                rect.bottom = this.c;
            }
        }
    }

    public final void a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "493c2f9c4f63a0e0b3d1fec00676bd4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "493c2f9c4f63a0e0b3d1fec00676bd4e");
        } else if (i != 0 && this.v != null) {
            List<com.sankuai.waimai.store.orderlist.model.c> list = this.v.b;
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                return;
            }
            for (com.sankuai.waimai.store.orderlist.model.c cVar : list) {
                if (cVar != null && cVar.c != null) {
                    Order order = cVar.c;
                    if (j == order.getPoiId() && !com.sankuai.shangou.stone.util.a.b(order.buttonTypeList)) {
                        for (ButtonItem buttonItem : order.buttonTypeList) {
                            if (buttonItem != null) {
                                if (buttonItem.code == 2054 || buttonItem.code == 2055) {
                                    buttonItem.code = i == 1 ? 2054 : 2055;
                                }
                            }
                        }
                    }
                }
            }
            this.v.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38d88f0d7a98cc9a6a7721210abc46ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38d88f0d7a98cc9a6a7721210abc46ae");
        } else if (i()) {
            p();
        } else {
            this.K.a(this.J, "order_list_page", new com.sankuai.waimai.store.orderlist.presenter.a<OrderDetailRecommendResponse>() { // from class: com.sankuai.waimai.store.orderlist.view.OrderListView.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.orderlist.presenter.a
                public final /* synthetic */ void a(OrderDetailRecommendResponse orderDetailRecommendResponse, final boolean z) {
                    final OrderDetailRecommendResponse orderDetailRecommendResponse2 = orderDetailRecommendResponse;
                    Object[] objArr2 = {orderDetailRecommendResponse2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "042847d447e8ad7a143437d4ba7688d9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "042847d447e8ad7a143437d4ba7688d9");
                        return;
                    }
                    final boolean z2 = OrderListView.this.K.c;
                    final OrderListView orderListView = OrderListView.this;
                    final f.a aVar = new f.a() { // from class: com.sankuai.waimai.store.orderlist.view.OrderListView.5.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.order.detail.blockview.f.a
                        public final void a() {
                            boolean z3 = false;
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0c209938dafa354f5834f043bef21e25", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0c209938dafa354f5834f043bef21e25");
                                return;
                            }
                            OrderListView.this.l();
                            if (z2) {
                                OrderListView.this.c();
                                return;
                            }
                            com.sankuai.waimai.store.orderlist.adapter.a aVar2 = OrderListView.this.v;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.orderlist.adapter.a.a;
                            if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "b11af0507338fcf156fadf8971cd90d0", RobustBitConfig.DEFAULT_VALUE)) {
                                z3 = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "b11af0507338fcf156fadf8971cd90d0")).booleanValue();
                            } else if (!com.sankuai.shangou.stone.util.a.b(aVar2.b)) {
                                Iterator<com.sankuai.waimai.store.orderlist.model.c> it = aVar2.b.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    com.sankuai.waimai.store.orderlist.model.c next = it.next();
                                    if (next != null && next.d != null) {
                                        z3 = true;
                                        break;
                                    }
                                }
                            }
                            if (z3) {
                                OrderListView.d(OrderListView.this, com.sankuai.waimai.store.util.b.a(OrderListView.this.getContext(), (int) R.string.wm_sc_no_more));
                            }
                        }
                    };
                    Object[] objArr3 = {orderDetailRecommendResponse2, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = OrderListView.a;
                    if (PatchProxy.isSupport(objArr3, orderListView, changeQuickRedirect3, false, "8aea220f07585b65afafb3b65a70ac9a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, orderListView, changeQuickRedirect3, false, "8aea220f07585b65afafb3b65a70ac9a");
                    } else if (orderDetailRecommendResponse2 != null) {
                        final List<com.sankuai.waimai.store.repository.model.f> a2 = com.sankuai.waimai.store.repository.model.f.a(orderDetailRecommendResponse2.poiCardInfos);
                        orderListView.g.a(new Runnable() { // from class: com.sankuai.waimai.store.orderlist.view.OrderListView.3
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8cacd3032c2aaa5e38b74f9a22b81b40", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8cacd3032c2aaa5e38b74f9a22b81b40");
                                } else {
                                    OrderListView.a(OrderListView.this, a2);
                                }
                            }
                        }, new Runnable() { // from class: com.sankuai.waimai.store.orderlist.view.OrderListView.4
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d9bdb1e966a84979d7b75b2305b029c0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d9bdb1e966a84979d7b75b2305b029c0");
                                    return;
                                }
                                com.sankuai.waimai.store.orderlist.adapter.a aVar2 = OrderListView.this.v;
                                List list = a2;
                                boolean z3 = z;
                                String str = orderDetailRecommendResponse2.titleText;
                                String str2 = orderDetailRecommendResponse2.titleIcon;
                                com.sankuai.waimai.store.orderlist.listener.a aVar3 = new com.sankuai.waimai.store.orderlist.listener.a() { // from class: com.sankuai.waimai.store.orderlist.view.OrderListView.4.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.orderlist.listener.a
                                    public final com.sankuai.waimai.store.orderlist.model.c a() {
                                        String a3;
                                        String a4;
                                        Object[] objArr5 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0ac989f039fc7019257c8b116bdd312c", RobustBitConfig.DEFAULT_VALUE)) {
                                            return (com.sankuai.waimai.store.orderlist.model.c) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0ac989f039fc7019257c8b116bdd312c");
                                        }
                                        int i = OrderListView.this.z;
                                        int i2 = R.drawable.waimai_c_no_comment;
                                        String str3 = null;
                                        if (i == 2) {
                                            a3 = com.sankuai.waimai.store.util.b.a(OrderListView.this.b, (int) R.string.wm_sc_order_list_refreshEmpty_noRefund_Orders_message);
                                        } else if (OrderListView.this.z == 1) {
                                            a3 = com.sankuai.waimai.store.util.b.a(OrderListView.this.b, (int) R.string.wm_sc_order_list_refreshEmpty_noUnComment_Orders_message);
                                        } else {
                                            i2 = R.drawable.wm_sc_common_default_empty_icon;
                                            a3 = com.sankuai.waimai.store.util.b.a(OrderListView.this.b, (int) R.string.wm_sc_order_list_refreshEmpty_noOrders_message);
                                            if (!OrderListView.this.m()) {
                                                str3 = com.sankuai.waimai.store.util.b.a(OrderListView.this.b, (int) R.string.wm_sc_order_list_refreshEmpty_noOrders_message_sub_title);
                                                a4 = com.sankuai.waimai.store.util.b.a(OrderListView.this.getContext(), (int) R.string.wm_sc_order_list_refreshEmpty_to_poiList);
                                                return com.sankuai.waimai.store.orderlist.model.c.a(OrderListView.this.z, i2, a3, str3, a4);
                                            }
                                        }
                                        a4 = null;
                                        return com.sankuai.waimai.store.orderlist.model.c.a(OrderListView.this.z, i2, a3, str3, a4);
                                    }
                                };
                                Object[] objArr5 = {list, Byte.valueOf(z3 ? (byte) 1 : (byte) 0), str, str2, aVar3};
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.orderlist.adapter.a.a;
                                if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "06882f19bcd4c9d79103b26a355e0119", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "06882f19bcd4c9d79103b26a355e0119");
                                } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
                                    if (z3) {
                                        if (aVar3.a() != null && !aVar2.b()) {
                                            aVar2.b.add(aVar3.a());
                                        }
                                        aVar2.b.add(com.sankuai.waimai.store.orderlist.model.c.a(str, str2));
                                    }
                                    aVar2.b.addAll(com.sankuai.waimai.store.orderlist.model.c.b(list));
                                    aVar2.m();
                                }
                                if (aVar != null) {
                                    aVar.a();
                                }
                            }
                        });
                    }
                }

                @Override // com.sankuai.waimai.store.orderlist.presenter.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d109329e665655e7f9322239cf59f47a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d109329e665655e7f9322239cf59f47a");
                    } else {
                        OrderListView.this.F = true;
                    }
                }

                @Override // com.sankuai.waimai.store.orderlist.presenter.a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5aff760c34231658de92bc71315e242d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5aff760c34231658de92bc71315e242d");
                        return;
                    }
                    boolean z = OrderListView.this.K.c;
                    OrderListView.this.L.k = OrderListView.this.K.d;
                    if (z) {
                        OrderListView.this.c();
                    }
                    OrderListView.this.F = false;
                    OrderListView.d(OrderListView.this, true);
                    OrderListView.this.l();
                }

                @Override // com.sankuai.waimai.store.orderlist.presenter.a
                public final void c() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de01d97fbd3b9434e08cc019405401d3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de01d97fbd3b9434e08cc019405401d3");
                    } else {
                        OrderListView.this.p();
                    }
                }

                @Override // com.sankuai.waimai.store.orderlist.presenter.a
                public final void d() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c665a5ce580be6ec74b96f8fbcfcb52", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c665a5ce580be6ec74b96f8fbcfcb52");
                    } else {
                        OrderListView.this.l();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60a7a30199f7639fefdff32a22464e9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60a7a30199f7639fefdff32a22464e9f");
            return;
        }
        this.F = false;
        this.k = true;
        l();
    }
}
