package com.sankuai.waimai.business.page.homepage.controller;

import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.MainActivity;
import com.sankuai.waimai.business.page.homepage.WaimaiHomePageService;
import com.sankuai.waimai.business.page.homepage.bubble.g;
import com.sankuai.waimai.business.page.homepage.view.a;
import com.sankuai.waimai.business.page.homepage.view.d;
import com.sankuai.waimai.platform.utils.p;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements Runnable {
    public static ChangeQuickRedirect a;
    public final MainActivity b;
    public final Handler c;
    public final ViewGroup d;
    public d e;
    public Runnable f;
    private final String g;
    @Nullable
    private com.sankuai.waimai.business.page.homepage.view.a h;
    private InterfaceC0794a i;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.homepage.controller.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0794a {
        void d();

        void e();
    }

    public a(MainActivity mainActivity, Handler handler, ViewGroup viewGroup, String str, InterfaceC0794a interfaceC0794a) {
        Object[] objArr = {mainActivity, handler, viewGroup, str, interfaceC0794a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "627964cfcc633efb9eb538b449d42f2a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "627964cfcc633efb9eb538b449d42f2a");
            return;
        }
        this.h = null;
        this.e = null;
        this.f = new Runnable() { // from class: com.sankuai.waimai.business.page.homepage.controller.a.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "008b85e35242f5f3fec9f9fba7c0ebfd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "008b85e35242f5f3fec9f9fba7c0ebfd");
                } else {
                    a.this.e();
                }
            }
        };
        this.b = mainActivity;
        this.c = handler;
        this.d = viewGroup;
        this.g = str;
        this.i = interfaceC0794a;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95bc24828820448c9ca146a1ff3a6d88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95bc24828820448c9ca146a1ff3a6d88");
        } else {
            b();
        }
    }

    public void b() {
        com.sankuai.waimai.platform.domain.manager.bubble.modle.a c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d61d028041b66533e95ed584f5202d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d61d028041b66533e95ed584f5202d8");
        } else if (g.a().d()) {
        } else {
            try {
                if (!this.b.g() || (c = com.sankuai.waimai.platform.domain.manager.bubble.a.a().c()) == null) {
                    return;
                }
                a(c.a);
                a(c.c, a(c), c.d, c.b, new PopupWindow.OnDismissListener() { // from class: com.sankuai.waimai.business.page.homepage.controller.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f73391a6d5dbbfce96a4346a46e7bb31", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f73391a6d5dbbfce96a4346a46e7bb31");
                            return;
                        }
                        if (a.this.i != null) {
                            a.this.i.e();
                        }
                        a.this.b();
                    }
                });
            } catch (Throwable th) {
                com.sankuai.waimai.foundation.utils.log.a.e(getClass().getSimpleName(), th.getMessage(), new Object[0]);
            }
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71c2849451b3e72872dbc8ac4532b954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71c2849451b3e72872dbc8ac4532b954");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiHomePageService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiHomePageService.class)).consumeBubble(sb.toString()), null, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
    }

    private void a(String str, int i, String str2, int i2, PopupWindow.OnDismissListener onDismissListener) {
        Object[] objArr = {str, Integer.valueOf(i), str2, Integer.valueOf(i2), onDismissListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6b756a7174fbd422ddaa37633df85ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6b756a7174fbd422ddaa37633df85ee");
        } else if ((!TextUtils.isEmpty(str) || i > 0) && !TextUtils.isEmpty(str2) && i2 > 0 && i2 <= 3 && !c() && !this.b.isFinishing() && this.d != null && this.d.getChildCount() >= 0) {
            if (this.h == null) {
                this.h = new com.sankuai.waimai.business.page.homepage.view.a(this.b);
            }
            if (this.i != null) {
                this.i.d();
            }
            this.h.a(str2);
            this.h.a(str, i);
            this.h.setOnDismissListener(onDismissListener);
            this.h.update();
            int a2 = com.sankuai.waimai.foundation.utils.g.a(this.b, 10.0f);
            int i3 = 0;
            for (int i4 = 0; i4 < this.d.getChildCount(); i4++) {
                if (this.d.getChildAt(i4).getVisibility() == 0) {
                    i3++;
                }
            }
            if (i3 <= 0) {
                i3 = 3;
            }
            int i5 = i3 * 2;
            switch (i2) {
                case 2:
                    this.h.a(this.d, a.EnumC0797a.RIGHT, a2, (com.sankuai.waimai.platform.b.A().l() / i5) * 3);
                    break;
                case 3:
                    this.h.a(this.d, a.EnumC0797a.RIGHT, a2, com.sankuai.waimai.platform.b.A().l() / i5);
                    break;
                default:
                    this.h.a(this.d, a.EnumC0797a.LEFT, a2, com.sankuai.waimai.platform.b.A().l() / i5);
                    break;
            }
            this.c.removeCallbacks(this);
            this.c.postDelayed(this, 10000L);
        }
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d547c0ea10e40500e4c69c29e6bfb217", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d547c0ea10e40500e4c69c29e6bfb217")).booleanValue() : this.h != null && this.h.isShowing();
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d1d822db9b171d6e551ec40ee3a4fd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d1d822db9b171d6e551ec40ee3a4fd0");
            return;
        }
        try {
            if (this.h == null || !this.h.isShowing()) {
                return;
            }
            p.b(this.h);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.e(getClass().getSimpleName(), e.getMessage(), new Object[0]);
        }
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acf4b9709d6b8ad48054d9379d1f15d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acf4b9709d6b8ad48054d9379d1f15d5");
            return;
        }
        try {
            if (this.e == null || !this.e.isShowing()) {
                return;
            }
            p.b(this.e);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.e(getClass().getSimpleName(), e.getMessage(), new Object[0]);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbc8ab7c01d077f2b803d7af80631038", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbc8ab7c01d077f2b803d7af80631038");
        } else {
            d();
        }
    }

    private static int a(com.sankuai.waimai.platform.domain.manager.bubble.modle.a aVar) {
        switch (aVar.a) {
            case 1:
                return R.drawable.wm_ic_popup_bubble_poi_coupon;
            case 2:
                return R.drawable.wm_ic_popup_bubble_coupon;
            default:
                return 0;
        }
    }
}
