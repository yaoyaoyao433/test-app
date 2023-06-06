package com.sankuai.waimai.store.orderlist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.order.api.model.Order;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.location.v2.listener.c;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.SCBaseFragment;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.orderlist.adapter.TabPageViewPagerAdapter;
import com.sankuai.waimai.store.orderlist.listener.b;
import com.sankuai.waimai.store.orderlist.view.OrderListView;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.poi.list.newp.block.UnreadMessageBlock;
import com.sankuai.waimai.store.poi.subscribe.e;
import com.sankuai.waimai.store.view.standard.FlashTab;
import com.sankuai.waimai.store.view.standard.FlashTabLayout;
import com.sankuai.waimai.store.viewblocks.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class OrderListFragment extends SCBaseFragment implements com.sankuai.waimai.business.order.api.submit.a, c, com.sankuai.waimai.store.i.user.a, b, e {
    public static ChangeQuickRedirect a = null;
    public static boolean c = false;
    public OrderListView d;
    public OrderListView e;
    public OrderListView f;
    public OrderListView g;
    private String h;
    private FlashTab i;
    private ViewPager j;
    private TabPageViewPagerAdapter k;
    private d l;
    private String m;
    private long n;
    private boolean o;
    private String p;
    private f q;
    private UnreadMessageBlock r;

    @Override // com.sankuai.waimai.store.base.SCBaseFragment
    public final String b() {
        return "c_waimai_m5pcse9e";
    }

    public OrderListFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd48a3b2283156c9e880613229bc3e36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd48a3b2283156c9e880613229bc3e36");
            return;
        }
        this.h = "OrderListFragment";
        this.o = false;
    }

    public static /* synthetic */ void a(OrderListFragment orderListFragment, GetMenuResponse getMenuResponse) {
        Object[] objArr = {getMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderListFragment, changeQuickRedirect, false, "21af2eec5517236147a8e17857940de5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, orderListFragment, changeQuickRedirect, false, "21af2eec5517236147a8e17857940de5");
        } else if (getMenuResponse == null || orderListFragment.r == null || !com.sankuai.shangou.stone.util.a.a((Collection<?>) getMenuResponse.outMenuList)) {
        } else {
            Iterator<GetMenuResponse.MenuInfo> it = getMenuResponse.outMenuList.iterator();
            while (it.hasNext()) {
                final GetMenuResponse.MenuInfo next = it.next();
                if (next != null && next.b == 4) {
                    final UnreadMessageBlock unreadMessageBlock = orderListFragment.r;
                    Object[] objArr2 = {next};
                    ChangeQuickRedirect changeQuickRedirect2 = UnreadMessageBlock.a;
                    if (PatchProxy.isSupport(objArr2, unreadMessageBlock, changeQuickRedirect2, false, "b265236bbad65535bc48835552ca6821", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, unreadMessageBlock, changeQuickRedirect2, false, "b265236bbad65535bc48835552ca6821");
                        return;
                    } else if (next != null) {
                        unreadMessageBlock.setVisible(true);
                        com.sankuai.waimai.store.im.number.d.a().b();
                        unreadMessageBlock.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.newp.block.UnreadMessageBlock.2
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr3 = {view};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "df3958b1a8231cc56d3f35be020adc9f", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "df3958b1a8231cc56d3f35be020adc9f");
                                    return;
                                }
                                com.sankuai.waimai.store.router.d.a(view.getContext(), next.f);
                                com.sankuai.waimai.store.manager.judas.b.a(view.getContext(), "b_waimai_sg_94yxtsql_mc").a("cat_id", Long.valueOf(unreadMessageBlock.f)).a();
                            }
                        });
                        return;
                    } else {
                        unreadMessageBlock.setVisible(false);
                        return;
                    }
                }
            }
        }
    }

    public static /* synthetic */ int b(OrderListFragment orderListFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, orderListFragment, changeQuickRedirect, false, "73d18282ae13116a2074094d473d70e9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, orderListFragment, changeQuickRedirect, false, "73d18282ae13116a2074094d473d70e9")).intValue();
        }
        if (orderListFragment.j != null) {
            return orderListFragment.j.getCurrentItem();
        }
        return 0;
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c839077177daeefb07b49cbc3dc60b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c839077177daeefb07b49cbc3dc60b4");
        } else if (com.sankuai.waimai.store.manager.user.a.a().b()) {
            this.d.e();
            this.e.e();
            this.f.e();
            this.g.b();
        } else {
            g();
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea1c861fd644f486b18c34a5a2d157e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea1c861fd644f486b18c34a5a2d157e9");
        } else {
            a(true, R.drawable.wm_sc_takeout_ic_no_login, R.string.wm_sc_order_list_need_login_message, R.string.wm_sc_comon_to_login_ok, new View.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.OrderListFragment.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2ed8f5b1736c369744583f88ec4bc1e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2ed8f5b1736c369744583f88ec4bc1e");
                    } else if (OrderListFragment.this.F == null || com.sankuai.waimai.store.util.b.a(OrderListFragment.this.F)) {
                    } else {
                        com.sankuai.waimai.store.manager.judas.b.a("c_waimai_m5pcse9e", "b_waimai_aehm8ppv_mc").a();
                        com.sankuai.waimai.store.manager.user.a.a((Context) OrderListFragment.this.F);
                    }
                }
            });
        }
    }

    private void a(boolean z, int i, int i2, int i3, View.OnClickListener onClickListener) {
        Object[] objArr = {(byte) 1, Integer.valueOf((int) R.drawable.wm_sc_takeout_ic_no_login), Integer.valueOf((int) R.string.wm_sc_order_list_need_login_message), Integer.valueOf((int) R.string.wm_sc_comon_to_login_ok), onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b015631233da47ca105b9714b461af68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b015631233da47ca105b9714b461af68");
            return;
        }
        this.l.a(R.drawable.wm_sc_takeout_ic_no_login, R.string.wm_sc_order_list_need_login_message, 0, R.string.wm_sc_comon_to_login_ok, onClickListener).f();
        if (this.d != null) {
            this.d.a(true, R.drawable.wm_sc_takeout_ic_no_login, R.string.wm_sc_order_list_need_login_message, 0, R.string.wm_sc_comon_to_login_ok, onClickListener);
        }
        if (this.e != null) {
            this.e.a(true, R.drawable.wm_sc_takeout_ic_no_login, R.string.wm_sc_order_list_need_login_message, 0, R.string.wm_sc_comon_to_login_ok, onClickListener);
        }
        if (this.f != null) {
            this.f.a(true, R.drawable.wm_sc_takeout_ic_no_login, R.string.wm_sc_order_list_need_login_message, 0, R.string.wm_sc_comon_to_login_ok, onClickListener);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "619bc15a263c00cc61abcba045bf71bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "619bc15a263c00cc61abcba045bf71bf");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.business.order.api.submit.c.a().unregisterOrderStatusObserver(this);
        com.sankuai.waimai.store.manager.user.a.a().a((com.sankuai.waimai.store.i.user.a) this);
        g.a().b(this, "OrderListFragment");
        com.sankuai.waimai.store.poi.subscribe.a.a().b(this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aa872f0771e75d4a01f761bdc831576", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aa872f0771e75d4a01f761bdc831576");
            return;
        }
        super.onStart();
        com.sankuai.shangou.stone.util.log.a.a("mainactvity-", "[onStart]OrderListFragment", new Object[0]);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fdf4da3af1355beef933b4fee438d80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fdf4da3af1355beef933b4fee438d80");
            return;
        }
        super.onResume();
        com.sankuai.shangou.stone.util.log.a.a("mainactvity-", "[onResume]OrderListFragment", new Object[0]);
        c = false;
        if (this.o) {
            e();
            this.o = false;
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65a9b1d7b5059808ee9cb67fd3638501", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65a9b1d7b5059808ee9cb67fd3638501");
            return;
        }
        super.onStop();
        com.sankuai.shangou.stone.util.log.a.a("OrderListFragment", "onStop~~~~~", new Object[0]);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c4dc5f6dcd389ef1a75f73eee1740c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c4dc5f6dcd389ef1a75f73eee1740c4");
            return;
        }
        super.setUserVisibleHint(z);
        com.sankuai.shangou.stone.util.log.a.a("order-list", "[fragment]setUserVisibleHint", new Object[0]);
        if (getView() != null && z) {
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01299c8b70dab538d114635332e8122e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01299c8b70dab538d114635332e8122e");
            return;
        }
        com.sankuai.shangou.stone.util.log.a.a("order-list", "[fragment]onPageShown", new Object[0]);
        if (com.sankuai.waimai.store.manager.user.a.a().b()) {
            if (this.g == null || this.g.d()) {
                return;
            }
            this.g.b();
            return;
        }
        g();
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "290c42798c03a44cf626b4222cef691f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "290c42798c03a44cf626b4222cef691f");
            return;
        }
        super.a(z);
        if (z) {
            com.sankuai.waimai.store.manager.judas.d.c(this, "c_waimai_m5pcse9e");
        } else {
            com.sankuai.waimai.store.manager.judas.d.d(this, "c_waimai_m5pcse9e");
        }
    }

    @Override // com.sankuai.waimai.store.base.SCBaseFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment
    public final String q() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "369ef3977210f53c2eb7dbbe5f9cbc39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "369ef3977210f53c2eb7dbbe5f9cbc39");
            return;
        }
        if (i == 0) {
            this.g = this.d;
        } else if (i == 1) {
            this.g = this.e;
            b(false);
        } else {
            this.g = this.f;
            c(false);
        }
        this.i.setSelectIndex(i);
    }

    public void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e428097d788c34e7e49dfced44ea132a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e428097d788c34e7e49dfced44ea132a");
        } else {
            this.i.b(1, z);
        }
    }

    public void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd53b2f36c05cf9637d73e93e03b3bc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd53b2f36c05cf9637d73e93e03b3bc3");
        } else {
            this.i.b(2, z);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4287e20156d9564bac4d52db9034e294", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4287e20156d9564bac4d52db9034e294");
        } else {
            this.l.h();
        }
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7d12cc0bda98c379575b5fb72795435", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7d12cc0bda98c379575b5fb72795435");
        } else {
            com.sankuai.waimai.business.order.api.pay.e.a().handlePayResult(this.F, i, this.m, this.n, this.p, new com.sankuai.waimai.business.order.api.pay.f() { // from class: com.sankuai.waimai.store.orderlist.OrderListFragment.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.order.api.pay.f
                public final void a(Activity activity, String str, String str2) {
                    Object[] objArr2 = {activity, str, str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3cae862d8047653fde2654a6925f35f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3cae862d8047653fde2654a6925f35f0");
                        return;
                    }
                    if (aa.a(str2)) {
                        Object[] objArr3 = {activity, str, (byte) 1};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.orderlist.helper.b.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1e835517fdbac8f76ba4cdf928f5e0ad", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1e835517fdbac8f76ba4cdf928f5e0ad");
                        } else {
                            try {
                                Bundle bundle = new Bundle();
                                bundle.putString("hash_id", str);
                                bundle.putBoolean("first_time_visist", true);
                                bundle.putBoolean("is_sc_orderlist", true);
                                bundle.putBoolean("from_pay_to_order_detail", true);
                                com.sankuai.waimai.store.router.d.b(activity, com.sankuai.waimai.store.router.c.l, bundle, 113);
                            } catch (Exception e) {
                                com.sankuai.waimai.store.base.log.a.a(e);
                                HashMap hashMap = new HashMap();
                                hashMap.put("from_pay_to_order_detail", Boolean.toString(true));
                                hashMap.put("hash_id", str);
                                com.sankuai.waimai.store.orderlist.utils.b.a("router order detail page error after pay", hashMap);
                            }
                        }
                    } else {
                        com.sankuai.waimai.foundation.router.a.a(activity, str2);
                    }
                    com.sankuai.waimai.platform.domain.manager.location.a.b(activity);
                }
            });
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        int a2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "090c490ea8783ae5e05517ee4f76dee0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "090c490ea8783ae5e05517ee4f76dee0");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (i == 111) {
            c(i2);
        } else if (i == 112) {
            if (i2 == -1) {
                com.sankuai.waimai.business.order.api.submit.c.a().preOrder(this.F, "from_sc_order_list");
            }
        } else if (i == 113) {
            if (intent != null) {
                String a3 = com.sankuai.waimai.platform.utils.f.a(intent, "orderid");
                int a4 = com.sankuai.waimai.platform.utils.f.a(intent, "dingDanStatus", -1);
                int a5 = com.sankuai.waimai.platform.utils.f.a(intent, "pay_status", -1);
                int a6 = com.sankuai.waimai.platform.utils.f.a(intent, "logistics_status", -1);
                List<com.sankuai.waimai.store.orderlist.model.c> orders = this.g.getOrders();
                if (orders != null && !TextUtils.isEmpty(a3)) {
                    for (com.sankuai.waimai.store.orderlist.model.c cVar : orders) {
                        if (cVar != null && cVar.c != null) {
                            try {
                                Order order = cVar.c;
                                if (TextUtils.equals(String.valueOf(order.getOrderId()), a3) && ((a4 != -1 && a4 != order.getStatus()) || ((a5 != -1 && a5 != order.getPayStatus()) || (a6 != -1 && a6 != order.getDeliveryStatus())))) {
                                    e();
                                    break;
                                }
                            } catch (Exception e) {
                                com.sankuai.shangou.stone.util.log.a.a(e);
                            }
                        }
                    }
                }
            }
        } else if (i == 114) {
            if (intent != null && (a2 = com.sankuai.waimai.platform.utils.f.a(intent, "another_pay_result", -1)) != 0 && a2 != -1) {
                com.sankuai.waimai.business.order.api.submit.c.a().updateOrderStatus();
            }
        } else if (i2 == 0 && i != 26) {
            a(0);
        }
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // com.sankuai.waimai.store.base.SCBaseFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4db1758097b51209813d485dc525ea28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4db1758097b51209813d485dc525ea28");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int i;
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a70ac3c788cce9ba7c7a9d5c0ceff989", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a70ac3c788cce9ba7c7a9d5c0ceff989");
        }
        com.sankuai.waimai.store.manager.user.a.a().b((com.sankuai.waimai.store.i.user.a) this);
        com.sankuai.waimai.business.order.api.submit.c.a().registerOrderStatusObserver(this);
        com.sankuai.waimai.store.poi.subscribe.a.a().a(this);
        g.a().a(this, "OrderListFragment");
        View inflate = layoutInflater.inflate(R.layout.wm_sc_order_list_fragment_order_list, viewGroup, false);
        Object[] objArr2 = {inflate};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a71894533b5e563b58e0c9ab21b27bdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a71894533b5e563b58e0c9ab21b27bdd");
        } else {
            Object[] objArr3 = {inflate};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2bd541eaf3fdcbf8422983509a79cf02", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2bd541eaf3fdcbf8422983509a79cf02");
            } else {
                View findViewById = inflate.findViewById(R.id.empty_statubar);
                if (getArguments() != null && DefaultHeaderService.KEY_DRUG.equals(getArguments().get("from"))) {
                    findViewById.setVisibility(8);
                } else {
                    findViewById.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = u.a();
                        findViewById.setLayoutParams(layoutParams);
                    }
                }
                this.q = new f(getContext());
                this.q.bindView(inflate);
                f fVar = this.q;
                Object[] objArr4 = {"订单"};
                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "edaae86c7093110b64f0882245ba81d4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "edaae86c7093110b64f0882245ba81d4");
                } else if (!TextUtils.isEmpty("订单")) {
                    fVar.b.setText("订单");
                }
            }
            this.j = (ViewPager) inflate.findViewById(R.id.pager);
            Object[] objArr5 = {inflate};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4c737b5dcdf39a572ee5af909c533f2f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4c737b5dcdf39a572ee5af909c533f2f");
            } else {
                String str2 = "";
                if (getArguments() != null) {
                    str2 = getArguments().getString("fromCase");
                    try {
                        String string = getArguments().getString("orderType");
                        if (string == null) {
                            string = "0";
                        }
                        str = str2;
                        i = Integer.parseInt(string);
                    } catch (Exception unused) {
                    }
                    this.d = (OrderListView) LayoutInflater.from(this.F).inflate(R.layout.wm_sc_order_list_view, (ViewGroup) null);
                    this.e = (OrderListView) LayoutInflater.from(this.F).inflate(R.layout.wm_sc_order_list_view, (ViewGroup) null);
                    this.f = (OrderListView) LayoutInflater.from(this.F).inflate(R.layout.wm_sc_order_list_view, (ViewGroup) null);
                    String str3 = str;
                    this.d.a(this, this.F, this, 0, this.h, str3);
                    this.e.a(this, this.F, this, 1, this.h, str3);
                    this.f.a(this, this.F, this, 2, this.h, str3);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.d);
                    arrayList.add(this.e);
                    arrayList.add(this.f);
                    this.k = new TabPageViewPagerAdapter(arrayList);
                    this.j.setAdapter(this.k);
                    this.i = (FlashTab) inflate.findViewById(R.id.pagerindicator);
                    this.i.setOnTabSelectedListener(new FlashTabLayout.b() { // from class: com.sankuai.waimai.store.orderlist.OrderListFragment.2
                        public static ChangeQuickRedirect a;
                        private boolean c = true;

                        @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
                        public final void b(FlashTabLayout.e eVar) {
                        }

                        @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
                        public final void a(FlashTabLayout.e eVar) {
                            Object[] objArr6 = {eVar};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b1499b8dcc3386ffcf2fcc4dd53488ec", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b1499b8dcc3386ffcf2fcc4dd53488ec");
                                return;
                            }
                            OrderListFragment.this.j.setCurrentItem(eVar.h);
                            a();
                            Object[] objArr7 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "e5894d196dc298f45005528fb0b94c29", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "e5894d196dc298f45005528fb0b94c29");
                            } else {
                                com.sankuai.waimai.store.manager.judas.b.b("c_waimai_m5pcse9e", "b_waimai_j4rnuzpf_mv").a("page_type", Integer.valueOf(OrderListFragment.b(OrderListFragment.this))).a();
                            }
                        }

                        @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
                        public final void c(FlashTabLayout.e eVar) {
                            Object[] objArr6 = {eVar};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "40b91562c6dd76cd50607b9269dc98f5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "40b91562c6dd76cd50607b9269dc98f5");
                            } else {
                                a();
                            }
                        }

                        private void a() {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "52fdb62591979451e9e90638c6d54f8a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "52fdb62591979451e9e90638c6d54f8a");
                            } else if (com.sankuai.waimai.store.manager.user.a.a().b()) {
                                if (this.c) {
                                    this.c = false;
                                } else {
                                    com.sankuai.waimai.store.manager.judas.b.a("c_waimai_m5pcse9e", "b_waimai_u0yu8zaq_mc").a("page_type", Integer.valueOf(OrderListFragment.b(OrderListFragment.this))).a();
                                }
                            }
                        }
                    });
                    this.i.setTabs(new String[]{this.F.getString(R.string.wm_sc_order_list_left_tab), this.F.getString(R.string.wm_sc_order_list_middle_tab), this.F.getString(R.string.wm_sc_order_list_right_tab)});
                    this.i.setRelationMove(true);
                    b(i);
                }
                str = str2;
                i = 0;
                this.d = (OrderListView) LayoutInflater.from(this.F).inflate(R.layout.wm_sc_order_list_view, (ViewGroup) null);
                this.e = (OrderListView) LayoutInflater.from(this.F).inflate(R.layout.wm_sc_order_list_view, (ViewGroup) null);
                this.f = (OrderListView) LayoutInflater.from(this.F).inflate(R.layout.wm_sc_order_list_view, (ViewGroup) null);
                String str32 = str;
                this.d.a(this, this.F, this, 0, this.h, str32);
                this.e.a(this, this.F, this, 1, this.h, str32);
                this.f.a(this, this.F, this, 2, this.h, str32);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(this.d);
                arrayList2.add(this.e);
                arrayList2.add(this.f);
                this.k = new TabPageViewPagerAdapter(arrayList2);
                this.j.setAdapter(this.k);
                this.i = (FlashTab) inflate.findViewById(R.id.pagerindicator);
                this.i.setOnTabSelectedListener(new FlashTabLayout.b() { // from class: com.sankuai.waimai.store.orderlist.OrderListFragment.2
                    public static ChangeQuickRedirect a;
                    private boolean c = true;

                    @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
                    public final void b(FlashTabLayout.e eVar) {
                    }

                    @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
                    public final void a(FlashTabLayout.e eVar) {
                        Object[] objArr6 = {eVar};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b1499b8dcc3386ffcf2fcc4dd53488ec", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b1499b8dcc3386ffcf2fcc4dd53488ec");
                            return;
                        }
                        OrderListFragment.this.j.setCurrentItem(eVar.h);
                        a();
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "e5894d196dc298f45005528fb0b94c29", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "e5894d196dc298f45005528fb0b94c29");
                        } else {
                            com.sankuai.waimai.store.manager.judas.b.b("c_waimai_m5pcse9e", "b_waimai_j4rnuzpf_mv").a("page_type", Integer.valueOf(OrderListFragment.b(OrderListFragment.this))).a();
                        }
                    }

                    @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
                    public final void c(FlashTabLayout.e eVar) {
                        Object[] objArr6 = {eVar};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "40b91562c6dd76cd50607b9269dc98f5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "40b91562c6dd76cd50607b9269dc98f5");
                        } else {
                            a();
                        }
                    }

                    private void a() {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "52fdb62591979451e9e90638c6d54f8a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "52fdb62591979451e9e90638c6d54f8a");
                        } else if (com.sankuai.waimai.store.manager.user.a.a().b()) {
                            if (this.c) {
                                this.c = false;
                            } else {
                                com.sankuai.waimai.store.manager.judas.b.a("c_waimai_m5pcse9e", "b_waimai_u0yu8zaq_mc").a("page_type", Integer.valueOf(OrderListFragment.b(OrderListFragment.this))).a();
                            }
                        }
                    }
                });
                this.i.setTabs(new String[]{this.F.getString(R.string.wm_sc_order_list_left_tab), this.F.getString(R.string.wm_sc_order_list_middle_tab), this.F.getString(R.string.wm_sc_order_list_right_tab)});
                this.i.setRelationMove(true);
                b(i);
            }
            this.l = new d(inflate);
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "ef6db09b20b84c937934ad3f6d426b5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "ef6db09b20b84c937934ad3f6d426b5c");
        } else {
            this.j.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.waimai.store.orderlist.OrderListFragment.3
                public static ChangeQuickRedirect a;

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i2) {
                }

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageScrolled(int i2, float f, int i3) {
                    Object[] objArr7 = {Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "a8af9ec9c533b07ead062e0e3458cfb8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "a8af9ec9c533b07ead062e0e3458cfb8");
                    } else {
                        OrderListFragment.this.i.a(i2, f);
                    }
                }

                @Override // android.support.v4.view.ViewPager.OnPageChangeListener
                public void onPageSelected(int i2) {
                    Object[] objArr7 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "3c9e9b781f2e1257cbce05f1a5c0023d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "3c9e9b781f2e1257cbce05f1a5c0023d");
                        return;
                    }
                    OrderListFragment.this.b(i2);
                    OrderListFragment.this.h();
                }
            });
        }
        h();
        return inflate;
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b9cc0bb49dbbcc7917e186fb38286a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b9cc0bb49dbbcc7917e186fb38286a2");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87a92c5053d7af1bcf7485e422c7b008", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87a92c5053d7af1bcf7485e422c7b008");
        } else if (getActivity() instanceof SCBaseActivity) {
            this.r = new UnreadMessageBlock((SCBaseActivity) getActivity(), -999L);
            this.r.createAndReplaceView((ViewGroup) view.findViewById(R.id.fl_unread_message_container));
            com.sankuai.waimai.store.base.net.sg.a.a((Object) this.h).a(-1L, "-1", 3, new k<GetMenuResponse>() { // from class: com.sankuai.waimai.store.orderlist.OrderListFragment.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    GetMenuResponse getMenuResponse = (GetMenuResponse) obj;
                    Object[] objArr3 = {getMenuResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aad4e41f330481b3758ff5e39aef9781", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aad4e41f330481b3758ff5e39aef9781");
                    } else {
                        OrderListFragment.a(OrderListFragment.this, getMenuResponse);
                    }
                }
            });
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35a21228c7474f90798601e957060e4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35a21228c7474f90798601e957060e4f");
        } else {
            super.onActivityCreated(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a2a2dacbf715143d0b7c7ec308345a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a2a2dacbf715143d0b7c7ec308345a6");
            return;
        }
        super.onPause();
        com.sankuai.shangou.stone.util.log.a.a("OrderListFragment", "onPause~~~~~", new Object[0]);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "803d88432fd6e083c14dad71b93828da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "803d88432fd6e083c14dad71b93828da");
        } else if (isAdded() && this.F != null) {
            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.event.c(0));
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("from", String.valueOf(i));
            com.sankuai.waimai.store.orderlist.utils.b.a("router supermaket page error", hashMap);
        }
    }

    @Override // com.sankuai.waimai.store.orderlist.listener.b
    public final void a(long j, String str, String str2, String str3, int i) {
        Object[] objArr = {new Long(j), str, str2, str3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8af4de90316b405a515efd051f297072", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8af4de90316b405a515efd051f297072");
            return;
        }
        this.n = j;
        this.m = str3;
        this.p = str;
        if (this.F != null) {
            if (i != 0) {
                c(-1);
                return;
            }
            Activity activity = this.F;
            Object[] objArr2 = {activity, 111, str, str2, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.orderlist.utils.c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "758437149927f81f160805833df75dc5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "758437149927f81f160805833df75dc5");
                return;
            }
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    Uri.Builder buildUpon = Uri.parse("meituanpayment://cashier/launch").buildUpon();
                    buildUpon.appendQueryParameter("trade_number", str);
                    buildUpon.appendQueryParameter("pay_token", str2);
                    Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
                    intent.setPackage(activity.getPackageName());
                    activity.startActivityForResult(intent, 111);
                }
                com.sankuai.waimai.store.orderlist.utils.c.a(j, str, str2);
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.d("PayUtils-startPay", e.getMessage(), new Object[0]);
                com.sankuai.waimai.store.orderlist.utils.c.a(j, str, str2);
            }
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.a
    public final void a(String str, Uri uri) {
        Object[] objArr = {str, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb125213bb87aa247379533edcc2bf46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb125213bb87aa247379533edcc2bf46");
        } else if (isResumed()) {
            e();
        } else {
            this.o = true;
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.EnumC1205a enumC1205a) {
        Object[] objArr = {enumC1205a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12bc24053a3ea8fe08b6e35d4de07c3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12bc24053a3ea8fe08b6e35d4de07c3f");
            return;
        }
        if (enumC1205a == a.EnumC1205a.LOGIN) {
            if (com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_ORDER_LIST_PREORDER) {
                com.sankuai.waimai.business.order.api.submit.c.a().preOrder(this.F, "from_sc_order_list");
            }
            this.l.d();
        }
        if (this.d != null) {
            this.d.e();
        }
        if (this.e != null) {
            this.e.e();
        }
        if (this.f != null) {
            this.f.e();
        }
        h();
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db6b5caf02f15edd814d9a5f5d662297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db6b5caf02f15edd814d9a5f5d662297");
        } else if (bVar == a.b.PHONE && com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_ORDER_LIST_PREORDER) {
            com.sankuai.waimai.business.order.api.submit.c.a().preOrder(this.F, "from_sc_order_list");
        }
    }

    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a69ae900f7acaabb37b99ae6d9c44fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a69ae900f7acaabb37b99ae6d9c44fd");
        } else if (z) {
            n();
        } else {
            o();
        }
    }

    @Override // com.sankuai.waimai.foundation.location.v2.listener.c
    public void onPoiChange(WmAddress wmAddress, boolean z) {
        Object[] objArr = {wmAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8546c7bd408712912cd34a40c1187f12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8546c7bd408712912cd34a40c1187f12");
        } else if (this.F == null || com.sankuai.waimai.store.util.b.a(this.F)) {
        } else {
            e();
        }
    }

    @Override // com.sankuai.waimai.store.poi.subscribe.e
    public final void a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f359cb87efc5e4696d7a0dab49f4f6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f359cb87efc5e4696d7a0dab49f4f6c");
        } else if (this.F == null || com.sankuai.waimai.store.util.b.a(this.F)) {
        } else {
            this.d.a(j, i);
            this.e.a(j, i);
            this.f.a(j, i);
        }
    }
}
