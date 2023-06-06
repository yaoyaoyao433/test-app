package com.meituan.android.legwork.ui.abfragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.legwork.bean.TabThemeBean;
import com.meituan.android.legwork.bean.UserHintBean;
import com.meituan.android.legwork.mvp.contract.c;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.android.legwork.ui.abbase.ABBaseFragment;
import com.meituan.android.legwork.ui.abbase.ABMVPFragment;
import com.meituan.android.legwork.ui.component.main.ComponentMainBPageAdapter;
import com.meituan.android.legwork.ui.view.EnableAndNoSmoothScrollViewPager;
import com.meituan.android.legwork.ui.view.FakeTabLayout;
import com.meituan.android.legwork.utils.g;
import com.meituan.android.legwork.utils.h;
import com.meituan.android.legwork.utils.l;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.legwork.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LegworkMainBFragment extends ABMVPFragment<c.a, com.meituan.android.legwork.mvp.presenter.d> implements c.a {
    public static ChangeQuickRedirect e;
    public ComponentMainBPageAdapter f;
    private TabLayout k;
    private FakeTabLayout l;
    private EnableAndNoSmoothScrollViewPager m;
    private RelativeLayout n;
    private RelativeLayout o;
    private View p;
    private String[] q;
    private int[] r;
    private int s;
    private k t;
    private Runnable u;
    private int v;
    private BroadcastReceiver w;
    private String x;
    private Map<String, Object> y;
    private boolean z;

    /* JADX INFO: Access modifiers changed from: private */
    public String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0eb9902648840cd55b23904130e462c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0eb9902648840cd55b23904130e462c");
        }
        switch (i) {
            case 1:
                return "paotui_c_ordlst_sw";
            case 2:
                return "c_banma_fbz0zxcs";
            default:
                return "c_banma_q5dm37ky";
        }
    }

    public LegworkMainBFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c66736f1afa897c944c9cfd7a3e5a23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c66736f1afa897c944c9cfd7a3e5a23");
            return;
        }
        this.q = new String[]{"首页", "订单", "我的"};
        this.r = new int[]{R.drawable.legwork_main_home_selector_icon, R.drawable.legwork_main_order_selector_icon, R.drawable.legwork_main_mine_selector_icon};
        this.s = 0;
        this.v = -1;
        this.y = new HashMap();
        this.z = false;
    }

    public static /* synthetic */ void a(LegworkMainBFragment legworkMainBFragment, int i) {
        String str;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, legworkMainBFragment, changeQuickRedirect, false, "b86541220291796340f5afd3f39405e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, legworkMainBFragment, changeQuickRedirect, false, "b86541220291796340f5afd3f39405e2");
            return;
        }
        String b = legworkMainBFragment.b(legworkMainBFragment.m != null ? legworkMainBFragment.m.getCurrentItem() : 0);
        switch (i) {
            case 1:
                str = "b_banma_6r3q95ou_mc";
                break;
            case 2:
                str = "b_banma_dt0k5ty9_mc";
                break;
            default:
                str = "b_banma_urx8uare_mc";
                break;
        }
        com.meituan.android.legwork.statistics.a.a(legworkMainBFragment, str, b);
    }

    @Override // com.meituan.android.legwork.ui.abbase.ABMVPFragment
    public final /* synthetic */ com.meituan.android.legwork.mvp.presenter.d f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c60dfa043be794eaf4f1d2b96d8617f8", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.legwork.mvp.presenter.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c60dfa043be794eaf4f1d2b96d8617f8") : new com.meituan.android.legwork.mvp.presenter.d();
    }

    @Override // com.meituan.android.legwork.ui.abbase.ABBaseFragment
    public final String e() {
        return com.meituan.android.legwork.utils.b.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.meituan.android.legwork.ui.abbase.ABMVPFragment, com.meituan.android.legwork.ui.base.BaseFragment, android.support.v4.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.ui.abfragment.LegworkMainBFragment.onCreate(android.os.Bundle):void");
    }

    public static /* synthetic */ void a(LegworkMainBFragment legworkMainBFragment, Integer num) {
        Object[] objArr = {legworkMainBFragment, num};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0f20a74a0519fa4fcd7d2985db80a11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0f20a74a0519fa4fcd7d2985db80a11");
        } else if (num.intValue() == 1) {
            ((com.meituan.android.legwork.mvp.presenter.d) legworkMainBFragment.d).d();
            ComponentMainBPageAdapter componentMainBPageAdapter = legworkMainBFragment.f;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = ComponentMainBPageAdapter.a;
            if (PatchProxy.isSupport(objArr2, componentMainBPageAdapter, changeQuickRedirect2, false, "de47911cf16f4a21da2b364ff83a02f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, componentMainBPageAdapter, changeQuickRedirect2, false, "de47911cf16f4a21da2b364ff83a02f7");
            } else {
                componentMainBPageAdapter.b.clear();
                componentMainBPageAdapter.b.add(componentMainBPageAdapter.b.get(0));
                componentMainBPageAdapter.b.add(componentMainBPageAdapter.a());
                componentMainBPageAdapter.b.add(componentMainBPageAdapter.b());
                componentMainBPageAdapter.notifyDataSetChanged();
            }
            legworkMainBFragment.k.setupWithViewPager(legworkMainBFragment.m);
            legworkMainBFragment.k.b();
            legworkMainBFragment.l.removeAllViews();
            legworkMainBFragment.a(legworkMainBFragment.getActivity());
            if (legworkMainBFragment.v == 1 || legworkMainBFragment.v == 2) {
                try {
                    legworkMainBFragment.k.a(legworkMainBFragment.v).c();
                } catch (Exception e2) {
                    x.e("LegworkMainBFragment.onCreate()", "exception msg:", e2);
                    x.a(e2);
                }
                legworkMainBFragment.v = -1;
            }
        }
    }

    @Override // com.meituan.android.legwork.ui.abbase.ABBaseFragment
    public final void a(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d0b55f130b74ec17b3f9d59e515543a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d0b55f130b74ec17b3f9d59e515543a");
            return;
        }
        Object[] objArr2 = {Integer.valueOf((int) R.color.legwork_white)};
        ChangeQuickRedirect changeQuickRedirect2 = ABBaseFragment.a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "441905a88563f7ddeb638b5250f0f581", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "441905a88563f7ddeb638b5250f0f581");
        } else if (this.b != null) {
            this.b.a(R.color.legwork_white);
        }
        if (view instanceof RelativeLayout) {
            this.n = (RelativeLayout) view;
        }
        this.o = (RelativeLayout) view.findViewById(R.id.rl_container);
        this.k = (TabLayout) view.findViewById(R.id.tab_layout);
        this.l = (FakeTabLayout) view.findViewById(R.id.tab_layout_fake);
        this.m = (EnableAndNoSmoothScrollViewPager) view.findViewById(R.id.view_pager);
        this.m.setOffscreenPageLimit(2);
    }

    @Override // com.meituan.android.legwork.ui.abbase.ABBaseFragment
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdd183c79b66a76c9b9b218440db915d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdd183c79b66a76c9b9b218440db915d");
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) new WeakReference(getActivity()).get();
        if (fragmentActivity == null) {
            return;
        }
        this.f = new ComponentMainBPageAdapter(fragmentActivity, fragmentActivity.getSupportFragmentManager());
        this.m.setAdapter(this.f);
        this.k.setupWithViewPager(this.m);
        this.k.b();
        this.l.removeAllViews();
        a(fragmentActivity);
    }

    @Override // com.meituan.android.legwork.mvp.contract.c.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "042c30a4995e2c6eb7d8ddb42fdd7d7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "042c30a4995e2c6eb7d8ddb42fdd7d7f");
        } else if (this.l != null) {
            boolean z = (com.meituan.android.legwork.ui.util.d.b() == this.r.length && com.meituan.android.legwork.ui.util.d.b() == this.l.getChildCount()) ? false : true;
            for (int i = 0; i < this.l.getChildCount(); i++) {
                View childAt = this.l.getChildAt(i);
                if (childAt != null) {
                    Object tag = childAt.getTag();
                    if (tag instanceof a) {
                        a aVar = (a) tag;
                        aVar.e = z ? null : com.meituan.android.legwork.ui.util.d.a(i);
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a.a;
                        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "6b0031cd5e4117275985a0358c676fb7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "6b0031cd5e4117275985a0358c676fb7");
                        } else if (aVar.e == null && aVar.f != null) {
                            aVar.c.setVisibility(8);
                            aVar.b.setVisibility(0);
                            aVar.b.setImageDrawable(aVar.f);
                            aVar.b.setSelected(aVar.g);
                        } else if (aVar.e != null) {
                            if (aVar.g) {
                                aVar.c.setVisibility(0);
                                aVar.b.setVisibility(8);
                                com.meituan.android.legwork.ui.util.d.a(aVar.c, aVar.e.selectUrl);
                            } else {
                                aVar.b.setVisibility(0);
                                aVar.c.setVisibility(8);
                                com.meituan.android.legwork.ui.util.d.a(aVar.b, aVar.e.unSelectUrl);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v6 */
    private void a(FragmentActivity fragmentActivity) {
        char c = 1;
        ?? r11 = 0;
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "120b7f794fed2bd76e8cbc0d45f56faa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "120b7f794fed2bd76e8cbc0d45f56faa");
            return;
        }
        if (this.s < 0 || this.s >= this.q.length) {
            this.s = 0;
        }
        this.k.a(new TabLayout.a() { // from class: com.meituan.android.legwork.ui.abfragment.LegworkMainBFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.support.design.widget.TabLayout.a
            public final void a(TabLayout.d dVar) {
                Object[] objArr2 = {dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e6da92b087c4cd19c31d7db2bfc9c8a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e6da92b087c4cd19c31d7db2bfc9c8a");
                    return;
                }
                if (dVar.a() instanceof a) {
                    ((a) dVar.a()).a(true);
                }
                String str = "【首页】";
                switch (dVar.b()) {
                    case 1:
                        str = "【订单】";
                        break;
                    case 2:
                        str = "【我的】";
                        break;
                }
                x.d("LegworkMainBFragment.initTabLayout()", "用户选择了" + str + "tab");
            }

            @Override // android.support.design.widget.TabLayout.a
            public final void b(TabLayout.d dVar) {
                Object[] objArr2 = {dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50dbc7a88bb5286bbd670217b38500c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50dbc7a88bb5286bbd670217b38500c6");
                    return;
                }
                if (dVar.a() instanceof a) {
                    ((a) dVar.a()).a(false);
                }
                if (dVar.b() == 0) {
                    com.meituan.android.legwork.statistics.a.a(this, "c_banma_41xzz403");
                }
            }

            @Override // android.support.design.widget.TabLayout.a
            public final void c(TabLayout.d dVar) {
                Object[] objArr2 = {dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6b55b958f376a8b4c1adf79781d4f51", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6b55b958f376a8b4c1adf79781d4f51");
                } else if (dVar.a() instanceof a) {
                    a aVar = (a) dVar.a();
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "b425dd0178385561f39b3fa77c210a7d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "b425dd0178385561f39b3fa77c210a7d");
                    } else if (aVar.e != null) {
                        com.meituan.android.legwork.ui.util.d.a(aVar.c, aVar.e.selectUrl);
                    }
                }
            }
        });
        final int i = 0;
        while (i < this.q.length) {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(fragmentActivity).inflate((int) R.layout.legwork_main_tab_view, (ViewGroup) null, (boolean) r11);
            View view = new View(fragmentActivity);
            a aVar = new a();
            Object[] objArr2 = new Object[3];
            objArr2[r11] = linearLayout;
            objArr2[c] = aVar;
            objArr2[2] = Integer.valueOf(i);
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85b841f0690c50cc4b8d7cf70ce75b98", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85b841f0690c50cc4b8d7cf70ce75b98");
            } else {
                ImageView imageView = (ImageView) linearLayout.findViewById(R.id.legwork_send_tab_icon);
                ImageView imageView2 = (ImageView) linearLayout.findViewById(R.id.legwork_send_tab_icon_anim);
                boolean z = i == this.s;
                if (com.meituan.android.legwork.ui.util.d.b() == this.r.length) {
                    TabThemeBean a2 = com.meituan.android.legwork.ui.util.d.a(i);
                    imageView2.setVisibility(z ? 0 : 8);
                    if (z) {
                        com.meituan.android.legwork.ui.util.d.a(imageView2, a2.selectUrl);
                    } else {
                        com.meituan.android.legwork.ui.util.d.a(imageView, a2.unSelectUrl);
                    }
                    aVar.e = a2;
                } else {
                    imageView.setSelected(i == this.s);
                    imageView.setImageDrawable(getResources().getDrawable(this.r[i]));
                }
                TextView textView = (TextView) linearLayout.findViewById(R.id.legwork_send_tab_text);
                textView.setSelected(z);
                textView.setText(this.q[i]);
                aVar.b = imageView;
                aVar.c = imageView2;
                aVar.d = textView;
                aVar.f = getResources().getDrawable(this.r[i]);
            }
            linearLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.meituan.android.legwork.ui.abfragment.LegworkMainBFragment.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    Object[] objArr3 = {view2, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5f04f05c7358e040478661afeebe5dd6", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5f04f05c7358e040478661afeebe5dd6")).booleanValue();
                    }
                    LegworkMainBFragment.a(LegworkMainBFragment.this, i);
                    if (i != 0 && !com.meituan.android.legwork.common.user.a.a().b()) {
                        LegworkMainBFragment.this.v = i;
                        com.meituan.android.legwork.common.user.a.a().a(com.meituan.android.legwork.a.a());
                        return true;
                    }
                    if (i == 0) {
                        com.meituan.android.legwork.statistics.a.b(this, "c_banma_41xzz403", LegworkMainBFragment.this.a((Map<String, Object>) null));
                    }
                    LegworkMainBFragment.this.s = i;
                    if (LegworkMainBFragment.this.p != null && LegworkMainBFragment.this.p.getVisibility() == 0) {
                        com.meituan.android.legwork.statistics.a.a(this, LegworkMainBFragment.this.x, LegworkMainBFragment.this.y, LegworkMainBFragment.this.b(i), (Map<String, Object>) null);
                    }
                    return false;
                }
            });
            linearLayout.setTag(aVar);
            FakeTabLayout fakeTabLayout = this.l;
            Object[] objArr3 = {linearLayout};
            ChangeQuickRedirect changeQuickRedirect3 = FakeTabLayout.a;
            if (PatchProxy.isSupport(objArr3, fakeTabLayout, changeQuickRedirect3, false, "26929dba53a5b12634ca036ef669d9cf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, fakeTabLayout, changeQuickRedirect3, false, "26929dba53a5b12634ca036ef669d9cf");
            } else {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.weight = 1.0f;
                fakeTabLayout.addView(linearLayout, layoutParams);
            }
            this.k.a(this.k.a().a(view).a(aVar), i == this.s);
            i++;
            c = 1;
            r11 = 0;
        }
    }

    @Override // com.meituan.android.legwork.ui.abbase.ABBaseFragment
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72f8df10cd3ab7614a1026db636b0fc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72f8df10cd3ab7614a1026db636b0fc8");
        } else if (this.m.getCurrentItem() != 0) {
            this.m.setCurrentItem(0);
        } else {
            if (this.f != null) {
                Object obj = this.f.c;
                if (obj instanceof LazyLoadHelperFragment) {
                    Fragment fragment = ((LazyLoadHelperFragment) obj).b;
                    if ((fragment instanceof LegworkMRNBaseFragment) && ((LegworkMRNBaseFragment) fragment).k()) {
                        return;
                    }
                }
            }
            super.c();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public ImageView b;
        public ImageView c;
        public TextView d;
        public TabThemeBean e;
        public Drawable f;
        boolean g;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dfbf8cc98303c26fedb1b363bd32b79", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dfbf8cc98303c26fedb1b363bd32b79");
            } else {
                this.g = false;
            }
        }

        public final void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "813d9e06198d0bad59343cce0f7af733", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "813d9e06198d0bad59343cce0f7af733");
                return;
            }
            this.g = z;
            if (this.e == null) {
                this.b.setVisibility(0);
                this.c.setVisibility(8);
                this.b.setSelected(z);
            } else if (z) {
                this.c.setVisibility(0);
                this.b.setVisibility(8);
                com.meituan.android.legwork.ui.util.d.a(this.c, this.e.selectUrl);
            } else {
                this.c.setVisibility(8);
                this.b.setVisibility(0);
                com.meituan.android.legwork.ui.util.d.a(this.b, this.e.unSelectUrl);
            }
            this.d.setSelected(z);
            this.d.getPaint().setFakeBoldText(z);
        }
    }

    @Override // com.meituan.android.legwork.ui.base.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a1df9ed2517e5b067b1ddb503b877b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a1df9ed2517e5b067b1ddb503b877b8");
            return;
        }
        super.onResume();
        if (!this.z && com.meituan.android.legwork.common.user.a.a().b()) {
            ((com.meituan.android.legwork.mvp.presenter.d) this.d).d();
        }
        this.z = true;
        if (this.s == 0) {
            com.meituan.android.legwork.statistics.a.b(this, "c_banma_41xzz403", a((Map<String, Object>) null));
        }
        x.d("LegworkMainBFragment.onResume()", "跑腿主页面onResume()");
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aca77bbd390e638884c21fe56d28f219", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aca77bbd390e638884c21fe56d28f219");
            return;
        }
        super.onPause();
        if (this.s == 0) {
            com.meituan.android.legwork.statistics.a.a(this, "c_banma_41xzz403");
        }
        x.d("LegworkMainBFragment.onPause()", "跑腿主页面onPause()");
    }

    @Override // com.meituan.android.legwork.ui.abbase.ABMVPFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c46be0d059f4d5b2b698e566f884746b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c46be0d059f4d5b2b698e566f884746b");
            return;
        }
        if (this.t != null && !this.t.isUnsubscribed()) {
            this.t.unsubscribe();
        }
        if (this.u != null && this.p != null) {
            this.p.removeCallbacks(this.u);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc0977d9684fbd848eaba537de52052c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc0977d9684fbd848eaba537de52052c");
        } else {
            try {
                com.meituan.android.legwork.a.a().unregisterReceiver(this.w);
            } catch (Exception e2) {
                x.e("LegworkMainBFragment.unRegisterReceiverHandler()", "exception msg:", e2);
            }
        }
        com.meituan.android.legwork.mvp.presenter.d dVar = (com.meituan.android.legwork.mvp.presenter.d) this.d;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.mvp.presenter.d.c;
        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "e3abe246a83818e6d5d0fec41322d6a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "e3abe246a83818e6d5d0fec41322d6a3");
        } else {
            l.b(com.meituan.android.legwork.a.a());
            if (dVar.e != null) {
                try {
                    com.meituan.android.legwork.a.a().unregisterReceiver(dVar.e);
                } catch (Exception e3) {
                    x.e("MainPagePresenter.unregisterNewSendHomeBroadcast()", "帮送首页状态反注册失败,exception msg:", e3);
                }
            }
            if (dVar.f != null) {
                try {
                    com.meituan.android.legwork.a.a().unregisterReceiver(dVar.f);
                } catch (Exception e4) {
                    x.e("MainPagePresenter.unregisterNewSendHomeBroadcast()", "mHomeSkinChangeReceiver反注册失败,exception msg:", e4);
                }
            }
        }
        x.d("LegworkMainBFragment.onDestroy()", "跑腿主页面onDestroy()");
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29b54fd2c300a84f86888eee3debdaf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29b54fd2c300a84f86888eee3debdaf2");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (this.f == null || this.f.c == null) {
            com.meituan.android.privacy.aop.a.f();
            return;
        }
        if (this.f.c instanceof Fragment) {
            ((Fragment) this.f.c).onActivityResult(i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // com.meituan.android.legwork.mvp.contract.c.a
    public final void a(UserHintBean userHintBean) {
        String string;
        Object[] objArr = {userHintBean};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72227f5244df64688e8ae03a066cc8a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72227f5244df64688e8ae03a066cc8a3");
        } else if (userHintBean == null) {
        } else {
            if (userHintBean.showInvoiceHints) {
                Context a2 = com.meituan.android.legwork.a.a();
                if (!z.b(a2, "new_invoice_tip_show_key_" + com.meituan.android.legwork.common.user.a.a().d(), false)) {
                    a(getResources().getString(R.string.legwork_new_invoice_tip), 1);
                    Context a3 = com.meituan.android.legwork.a.a();
                    z.a(a3, "new_invoice_tip_show_key_" + com.meituan.android.legwork.common.user.a.a().d(), true);
                    final com.meituan.android.legwork.mvp.presenter.d dVar = (com.meituan.android.legwork.mvp.presenter.d) this.d;
                    Object[] objArr2 = {1};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.legwork.mvp.presenter.d.c;
                    if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "177c6138f126ca8b8451e557e5f347b3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "177c6138f126ca8b8451e557e5f347b3");
                        return;
                    }
                    com.meituan.android.legwork.mvp.model.c cVar = dVar.d;
                    Object[] objArr3 = {1};
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.mvp.model.c.a;
                    dVar.a(rx.d.a(new com.meituan.android.legwork.net.subscriber.a() { // from class: com.meituan.android.legwork.mvp.presenter.d.2
                        @Override // com.meituan.android.legwork.net.subscriber.a
                        public final void a(Object obj) {
                        }

                        @Override // com.meituan.android.legwork.net.subscriber.a
                        public final void a(boolean z, int i, String str) {
                        }
                    }, (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "b54ae7a4433e6d769887a2f60bd5ae69", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "b54ae7a4433e6d769887a2f60bd5ae69") : ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).userAction(1)).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())));
                    return;
                }
            }
            if (userHintBean.validCouponCount <= 0) {
                return;
            }
            Context a4 = com.meituan.android.legwork.a.a();
            if (z.b(a4, "coupon_tip_show_key_" + com.meituan.android.legwork.common.user.a.a().d() + CommonConstant.Symbol.UNDERLINE + g.a("yyyy-MM-dd", com.meituan.android.time.c.b()), false)) {
                return;
            }
            this.y.put("coupon_num", Integer.valueOf(userHintBean.validCouponCount));
            if (userHintBean.validCouponCount <= 99) {
                string = getResources().getString(R.string.legwork_new_coupon_tip, String.valueOf(userHintBean.validCouponCount));
            } else {
                string = getResources().getString(R.string.legwork_new_coupon_tip, "99+");
            }
            a(string, 2);
            Context a5 = com.meituan.android.legwork.a.a();
            z.a(a5, "coupon_tip_show_key_" + com.meituan.android.legwork.common.user.a.a().d() + CommonConstant.Symbol.UNDERLINE + g.a("yyyy-MM-dd", com.meituan.android.time.c.b()), true);
        }
    }

    @Override // com.meituan.android.legwork.mvp.contract.c.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91bd87b21f36283a02b63f261916b193", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91bd87b21f36283a02b63f261916b193");
        } else if (this.k != null) {
            this.k.setVisibility(i);
        }
    }

    private void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3e77d82dfb4eee6a0b9d3d5bfa5323a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3e77d82dfb4eee6a0b9d3d5bfa5323a");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.p == null) {
                this.p = LayoutInflater.from(com.meituan.android.legwork.a.a()).inflate(R.layout.legwork_main_popup_tip_new, (ViewGroup) this.n, false);
                this.o.addView(this.p);
            } else {
                this.p.setVisibility(0);
            }
            this.p.findViewById(R.id.close).setOnClickListener(c.a(this, i));
            this.p.setOnClickListener(d.a(this, i));
            ((TextView) this.p.findViewById(R.id.content)).setText(str);
            g();
            this.u = new Runnable() { // from class: com.meituan.android.legwork.ui.abfragment.LegworkMainBFragment.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56d7813db30edfde79469e9c375a9816", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56d7813db30edfde79469e9c375a9816");
                    } else {
                        LegworkMainBFragment.this.p.setVisibility(8);
                    }
                }
            };
            this.p.postDelayed(this.u, 10000L);
            if (i == 1) {
                this.x = "b_banma_kht3t4ha_mv";
            } else {
                this.x = "b_banma_f066ytn1_mv";
            }
            com.meituan.android.legwork.statistics.a.a(this, this.x, this.y, b(this.m != null ? this.m.getCurrentItem() : 0), (Map<String, Object>) null);
        }
    }

    public static /* synthetic */ void b(LegworkMainBFragment legworkMainBFragment, int i, View view) {
        Object[] objArr = {legworkMainBFragment, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5eaca98c5b35a96861b55893aec27e8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5eaca98c5b35a96861b55893aec27e8b");
            return;
        }
        if (legworkMainBFragment.u != null) {
            legworkMainBFragment.p.removeCallbacks(legworkMainBFragment.u);
        }
        legworkMainBFragment.p.setVisibility(8);
        com.meituan.android.legwork.statistics.a.a(legworkMainBFragment, i == 2 ? "b_banma_7txqbygb_mc" : "b_banma_vas4ee7c_mc", legworkMainBFragment.b(legworkMainBFragment.m != null ? legworkMainBFragment.m.getCurrentItem() : 0), legworkMainBFragment.y, (Map<String, Object>) null);
    }

    public static /* synthetic */ void a(LegworkMainBFragment legworkMainBFragment, int i, View view) {
        Object[] objArr = {legworkMainBFragment, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0ac572b7a71d1bcb132bd99ac98503e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0ac572b7a71d1bcb132bd99ac98503e");
            return;
        }
        legworkMainBFragment.p.setVisibility(8);
        if (legworkMainBFragment.u != null) {
            legworkMainBFragment.p.removeCallbacks(legworkMainBFragment.u);
        }
        String b = legworkMainBFragment.b(legworkMainBFragment.m != null ? legworkMainBFragment.m.getCurrentItem() : 0);
        if (legworkMainBFragment.m != null) {
            legworkMainBFragment.m.setCurrentItem(2);
        }
        String str = "b_banma_kht3t4ha_mc";
        if (i == 2) {
            HashMap hashMap = new HashMap();
            hashMap.put("validate", Boolean.TRUE);
            com.meituan.android.legwork.mrn.b.a().a(legworkMainBFragment.getActivity(), "legwork", "legwork-my-coupon", hashMap);
            str = "b_banma_f066ytn1_mc";
        }
        com.meituan.android.legwork.statistics.a.a(legworkMainBFragment, str, b, legworkMainBFragment.y, (Map<String, Object>) null);
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65533a921e3d8c38b611f29002b3aaf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65533a921e3d8c38b611f29002b3aaf7");
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.p.getLayoutParams();
        layoutParams.bottomMargin = getResources().getDimensionPixelSize(R.dimen.legwork_main_tab_height);
        layoutParams.rightMargin = h.a(12);
        layoutParams.addRule(12, -1);
        this.p.setLayoutParams(layoutParams);
    }
}
