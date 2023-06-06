package com.sankuai.waimai.store.viewblocks;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.constraint.R;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.utils.p;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.util.ar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public Context b;
    PopupWindow c;
    public SparseArray<MenuItemView> d;
    String e;
    String f;
    ArrayList<Integer> g;
    int h;
    public a i;
    private ViewGroup j;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a k;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(int i, int i2, boolean z, String str);

        void a(int i, List<Integer> list, SparseArray<MenuItemView> sparseArray);

        void a(View view);

        void a(String str, int i);

        void b();

        void c();

        void d();

        void e();

        void f();

        void g();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements a {
        @Override // com.sankuai.waimai.store.viewblocks.e.a
        public void a() {
        }

        @Override // com.sankuai.waimai.store.viewblocks.e.a
        public void a(int i, int i2, boolean z, String str) {
        }

        @Override // com.sankuai.waimai.store.viewblocks.e.a
        public void a(int i, List<Integer> list, SparseArray<MenuItemView> sparseArray) {
        }

        @Override // com.sankuai.waimai.store.viewblocks.e.a
        public final void a(View view) {
        }

        @Override // com.sankuai.waimai.store.viewblocks.e.a
        public final void a(String str, int i) {
        }

        @Override // com.sankuai.waimai.store.viewblocks.e.a
        public void b() {
        }

        @Override // com.sankuai.waimai.store.viewblocks.e.a
        public final void c() {
        }

        @Override // com.sankuai.waimai.store.viewblocks.e.a
        public final void d() {
        }

        @Override // com.sankuai.waimai.store.viewblocks.e.a
        public final void e() {
        }

        @Override // com.sankuai.waimai.store.viewblocks.e.a
        public final void f() {
        }

        @Override // com.sankuai.waimai.store.viewblocks.e.a
        public final void g() {
        }
    }

    public e(Context context, int i, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {context, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7a87f944e684eaceea1611ea1948e25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7a87f944e684eaceea1611ea1948e25");
            return;
        }
        this.d = new SparseArray<>();
        this.e = null;
        this.f = null;
        this.g = new ArrayList<>();
        this.b = context;
        this.h = i;
        this.k = aVar;
        this.j = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.wm_sc_goods_list_pop_up_window, (ViewGroup) null);
        this.c = new PopupWindow(this.j, -2, -2);
        this.c.setFocusable(true);
        this.c.setTouchable(true);
        this.c.setOutsideTouchable(true);
        this.c.setBackgroundDrawable(new BitmapDrawable());
        MenuItemView menuItemView = new MenuItemView(context);
        menuItemView.setMenuIcon(R.drawable.wm_sc_goods_list_activity_menu_cart);
        menuItemView.setMenuName(R.string.wm_sc_goods_list_menu_share_cart);
        menuItemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.viewblocks.e.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45762c8dc3ff863fa7f429ebc36bb319", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45762c8dc3ff863fa7f429ebc36bb319");
                    return;
                }
                e.this.a(e.this.c);
                if (e.this.i != null) {
                    e.this.i.a();
                }
            }
        });
        this.d.put(1, menuItemView);
        MenuItemView menuItemView2 = new MenuItemView(context);
        menuItemView2.setMenuIcon(R.drawable.wm_sc_goods_list_activity_menu_share);
        menuItemView2.setMenuName(R.string.wm_sc_goods_list_menu_share_seller);
        menuItemView2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.viewblocks.e.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a139ea4909e418d0fc7078ffe08d2524", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a139ea4909e418d0fc7078ffe08d2524");
                    return;
                }
                e.this.a(e.this.c);
                if (e.this.i != null) {
                    e.this.i.b();
                }
            }
        });
        this.d.put(2, menuItemView2);
        MenuItemView menuItemView3 = new MenuItemView(context);
        menuItemView3.setMenuIcon(R.drawable.wm_sc_goods_list_activity_menu_contact_seller);
        menuItemView3.setMenuName(R.string.wm_sc_common_contact_seller);
        this.d.put(3, menuItemView3);
        menuItemView3.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.viewblocks.e.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb8698f3af55e1f37535de39984a624f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb8698f3af55e1f37535de39984a624f");
                    return;
                }
                e.this.a(e.this.c);
                if (e.this.i != null) {
                    e.this.i.c();
                }
            }
        });
        MenuItemView menuItemView4 = new MenuItemView(context);
        menuItemView4.setMenuIcon(R.drawable.wm_sc_goods_list_activity_menu_msg_center);
        menuItemView4.setMenuName(R.string.wm_sc_goods_list_menu_message_center);
        this.d.put(4, menuItemView4);
        menuItemView4.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.viewblocks.e.7
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c67a0d80e6aef0c4f9e50c8f9b25d0a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c67a0d80e6aef0c4f9e50c8f9b25d0a");
                    return;
                }
                e.this.a(e.this.c);
                if (e.this.i != null) {
                    e.this.i.a(e.this.h, e.this.g.indexOf(4), e.this.d.get(4).getUnReadOrRedDotVisible(), e.this.e);
                }
            }
        });
        MenuItemView menuItemView5 = new MenuItemView(context);
        menuItemView5.setMenuIcon(R.drawable.wm_sc_goods_list_activity_menu_seller_detail);
        menuItemView5.setMenuName(R.string.wm_sc_goods_list_menu_seller_detail);
        this.d.put(6, menuItemView5);
        menuItemView5.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.viewblocks.e.8
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "723853f4dd25244265be3cdf4541667d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "723853f4dd25244265be3cdf4541667d");
                    return;
                }
                e.this.a(e.this.c);
                if (e.this.i != null) {
                    e.this.i.d();
                }
            }
        });
        MenuItemView menuItemView6 = new MenuItemView(context);
        menuItemView6.setMenuIcon(R.drawable.wm_sc_goods_list_activity_menu_complaint);
        menuItemView6.setMenuName(R.string.wm_sc_goods_list_menu_complaint_seller);
        this.d.put(5, menuItemView6);
        menuItemView6.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.viewblocks.e.9
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b35bbf158768a4f1c4122812e85d6bcf", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b35bbf158768a4f1c4122812e85d6bcf");
                    return;
                }
                e.this.a(e.this.c);
                if (e.this.i != null) {
                    e.this.i.a(e.this.f, e.this.g.indexOf(5));
                }
            }
        });
        MenuItemView menuItemView7 = new MenuItemView(context);
        menuItemView7.setMenuName(R.string.wm_sc_common_collect);
        this.d.put(8, menuItemView7);
        menuItemView7.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.viewblocks.e.10
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62035b0961ceec5e5f82b921f5ec37de", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62035b0961ceec5e5f82b921f5ec37de");
                    return;
                }
                e.this.a(e.this.c);
                if (e.this.i != null) {
                    e.this.i.e();
                }
            }
        });
        MenuItemView menuItemView8 = new MenuItemView(context);
        menuItemView8.setMenuIcon(R.drawable.wm_st_header_comment);
        this.d.put(7, menuItemView8);
        menuItemView8.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.viewblocks.e.11
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a78aea2a445ea65d314289168b1330d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a78aea2a445ea65d314289168b1330d");
                    return;
                }
                e.this.a(e.this.c);
                if (e.this.i != null) {
                    e.this.i.f();
                }
            }
        });
        MenuItemView menuItemView9 = new MenuItemView(context);
        menuItemView9.setMenuIcon(R.drawable.wm_sc_goods_list_activity_menu_share);
        menuItemView9.setMenuName(R.string.wm_sc_goods_list_menu_share_goods);
        menuItemView9.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.viewblocks.e.12
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc5b5471f0aed8e12827e480736ecf60", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc5b5471f0aed8e12827e480736ecf60");
                    return;
                }
                e.this.a(e.this.c);
                if (e.this.i != null) {
                    e.this.i.b();
                }
            }
        });
        this.d.put(9, menuItemView9);
        final MenuItemView menuItemView10 = new MenuItemView(context);
        menuItemView10.setMenuIcon(R.drawable.wm_sc_goods_list_activity_menu_shortcut);
        menuItemView10.setMenuName(R.string.wm_sc_goods_list_menu_shortcut);
        this.d.put(10, menuItemView10);
        menuItemView10.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.viewblocks.e.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c60b115698d8f09a985b752256765473", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c60b115698d8f09a985b752256765473");
                    return;
                }
                e.this.a(e.this.c);
                if (e.this.i != null) {
                    e.this.i.a(menuItemView10);
                }
            }
        });
        MenuItemView menuItemView11 = new MenuItemView(context);
        menuItemView11.setMenuIcon(R.drawable.wm_sc_goods_list_activity_menu_scan_product);
        menuItemView11.setMenuName(R.string.wm_sc_goods_list_menu_scan_product);
        this.d.put(17, menuItemView11);
        menuItemView11.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.viewblocks.e.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "379a1738a38a9da93f66e9c61c635426", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "379a1738a38a9da93f66e9c61c635426");
                    return;
                }
                e.this.a(e.this.c);
                if (e.this.i != null) {
                    e.this.i.g();
                }
            }
        });
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "239dc36616f55a0e7ad73d0e4f254e91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "239dc36616f55a0e7ad73d0e4f254e91");
        } else if (this.k != null && this.k.c()) {
            long j = this.k.b.commentNumber;
            if (j == 0) {
                this.d.get(7).setMenuName(com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_goods_list_menu_comment_no_num));
                return;
            }
            String valueOf = String.valueOf(j);
            if (j > 999) {
                valueOf = "999+";
            }
            this.d.get(7).setMenuName(com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_goods_list_menu_comment, valueOf));
        } else {
            this.d.get(7).setMenuName(com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_goods_list_menu_comment_no_num));
        }
    }

    void a(PopupWindow popupWindow) {
        Object[] objArr = {popupWindow};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa7460c4c493c7ed75a6eebd03be982c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa7460c4c493c7ed75a6eebd03be982c");
            return;
        }
        try {
            p.b(popupWindow);
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }

    public final void a(final View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da37b1baf68a09874224a7465785c299", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da37b1baf68a09874224a7465785c299");
        } else {
            this.c.setTouchInterceptor(new View.OnTouchListener() { // from class: com.sankuai.waimai.store.viewblocks.e.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    Object[] objArr2 = {view2, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "500346ae1eb6e6945aa33c7d04e3f4d2", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "500346ae1eb6e6945aa33c7d04e3f4d2")).booleanValue();
                    }
                    if (motionEvent.getAction() != 4 || view == null) {
                        return false;
                    }
                    return u.a(view, motionEvent.getRawX(), motionEvent.getRawY());
                }
            });
        }
    }

    public final void a(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5629e2207a56b35f93eeaab6b317b885", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5629e2207a56b35f93eeaab6b317b885");
        } else if (iArr.length != 0) {
            this.j.removeAllViews();
            this.g.clear();
            for (int i : iArr) {
                this.j.addView(this.d.get(i));
                this.g.add(Integer.valueOf(i));
            }
        }
    }

    public final void a(GetMenuResponse getMenuResponse) {
        Object[] objArr = {getMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10733c6aead57ff071121d4d563b78d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10733c6aead57ff071121d4d563b78d2");
        } else if (getMenuResponse == null || getMenuResponse.getMenuCodes() == null || getMenuResponse.menuInfoArrayList == null) {
        } else {
            this.j.removeAllViews();
            this.g.clear();
            Iterator<GetMenuResponse.MenuInfo> it = getMenuResponse.menuInfoArrayList.iterator();
            while (it.hasNext()) {
                GetMenuResponse.MenuInfo next = it.next();
                if (next != null && this.d.get(next.b) != null) {
                    this.j.addView(this.d.get(next.b));
                    this.g.add(Integer.valueOf(next.b));
                    if (next.a()) {
                        this.d.get(next.b).setRedPointVisiable(true);
                    } else {
                        this.d.get(next.b).setRedPointVisiable(false);
                    }
                    if (next.b == 4 && next.g != null && next.g.b != null) {
                        this.e = next.g.b.a;
                    } else if (next.b == 5 && next.g != null && next.g.c != null) {
                        this.f = next.g.c.a;
                    }
                }
            }
            if (this.d.get(4) != null) {
                this.d.get(4).setRedPointVisiable(false);
            }
            if (this.k != null && this.k.c() && this.k.b.isFavorite()) {
                this.d.get(8).setMenuIcon(R.drawable.wm_sc_poi_collected);
                if (d()) {
                    this.d.get(8).setMenuName(R.string.wm_sc_common_has_collected);
                    return;
                } else {
                    this.d.get(8).setMenuName(R.string.wm_sc_common_collect);
                    return;
                }
            }
            this.d.get(8).setMenuIcon(R.drawable.wm_sc_poi_collect);
            if (d()) {
                this.d.get(8).setMenuName(R.string.wm_sc_common_can_collect);
            } else {
                this.d.get(8).setMenuName(R.string.wm_sc_common_collect);
            }
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84820d94194524a88cfb7970a404904b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84820d94194524a88cfb7970a404904b")).booleanValue() : this.k != null && this.k.c() && this.k.b.storeImNewStyle();
    }

    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fc7c8c0b0b483ce6192e2154678a6e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fc7c8c0b0b483ce6192e2154678a6e6");
            return;
        }
        c();
        this.j.requestFocus();
        int measuredHeight = view.getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        ar.a(this.c, view, 53, com.sankuai.shangou.stone.util.h.a(this.b, 0.0f), (iArr[1] + measuredHeight) - com.sankuai.shangou.stone.util.h.a(this.b, 8.0f));
        if (this.i != null) {
            this.i.a(this.h, this.g, this.d);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ee8c0357ace618d01396ce66c4424cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ee8c0357ace618d01396ce66c4424cf");
        } else {
            this.d.get(3).setUnreadMessageCount(i);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6d3f3d67c85fda0425f92d4d794cfc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6d3f3d67c85fda0425f92d4d794cfc4");
        } else {
            a(this.c);
        }
    }

    public final void a(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f08a4205ecbb3cca00b13b3f28e314f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f08a4205ecbb3cca00b13b3f28e314f");
        } else if (this.d.get(2) != null) {
            this.d.get(2).setOnClickListener(onClickListener);
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "462042a1eee2f8fb325c5bf9962b7631", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "462042a1eee2f8fb325c5bf9962b7631");
        } else if (this.d.get(4) != null) {
            this.d.get(4).setUnreadMessageCount(i);
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "972ea92d148d9fb4b4ba2d9f0fa9696f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "972ea92d148d9fb4b4ba2d9f0fa9696f")).booleanValue() : this.c.isShowing();
    }

    public final int c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60c4d78426da5688bfe864283d9e24da", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60c4d78426da5688bfe864283d9e24da")).intValue() : this.g.indexOf(Integer.valueOf(i));
    }

    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        Object[] objArr = {onDismissListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38a69dcae479edf1c00ac04bff65e152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38a69dcae479edf1c00ac04bff65e152");
        } else {
            this.c.setOnDismissListener(onDismissListener);
        }
    }
}
