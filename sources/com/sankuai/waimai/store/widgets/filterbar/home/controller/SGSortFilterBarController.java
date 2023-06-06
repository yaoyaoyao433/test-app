package com.sankuai.waimai.store.widgets.filterbar.home.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.widgets.filterbar.home.SGSortFilterBarBlock;
import com.sankuai.waimai.store.widgets.filterbar.home.controller.h;
import com.sankuai.waimai.store.widgets.filterbar.home.controller.i;
import com.sankuai.waimai.store.widgets.filterbar.home.model.BubbleInfoBean;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGSortFilterBarController implements com.sankuai.waimai.store.widgets.filterbar.home.b {
    public static ChangeQuickRedirect a;
    public SGSortFilterBarBlock b;
    public SGSortFilterBarBlock c;
    public h.a d;
    public e e;
    @NonNull
    public b f;
    protected c g;
    public com.sankuai.waimai.store.widgets.filterbar.home.a h;
    private final Context i;
    private final com.sankuai.waimai.store.base.statistic.a j;
    private long k;
    private String l;
    private int m;
    private int n;
    private long o;
    private com.sankuai.waimai.store.expose.v2.a p;
    private boolean q;
    private com.sankuai.waimai.store.param.a r;
    private final a s;
    private boolean t;

    public SGSortFilterBarController(c cVar, @NonNull Context context, @NonNull com.sankuai.waimai.store.param.a aVar, @NonNull a aVar2) {
        Object[] objArr = {cVar, context, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22fd681e2c17b01ed34204a2e8fd8698", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22fd681e2c17b01ed34204a2e8fd8698");
            return;
        }
        this.k = -1L;
        this.n = 0;
        this.o = 0L;
        this.q = false;
        this.t = false;
        this.g = cVar;
        this.i = context;
        this.r = aVar;
        this.s = aVar2;
        if (this.i instanceof com.sankuai.waimai.store.expose.v2.a) {
            this.p = (com.sankuai.waimai.store.expose.v2.a) this.i;
        }
        this.f = new f(aVar.G, this.i, aVar.c());
        this.j = new g((SCBaseActivity) this.i, aVar);
        com.meituan.android.bus.a.a().a(this);
    }

    public final void a(long j, String str, int i) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b15d720ad712174718cdf823fdb4fb4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b15d720ad712174718cdf823fdb4fb4b");
            return;
        }
        this.k = j;
        this.l = str;
        this.m = i;
        this.f.a(this.p, this.b.getView(), this.k, this.l);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a6eef7102486e1f8b068e2a3f3646e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a6eef7102486e1f8b068e2a3f3646e4");
        } else if (this.d != null) {
            this.d.a(this.d.a());
        }
    }

    public final void a(i.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4448d9201c3ec3d96435dfe6e1f66dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4448d9201c3ec3d96435dfe6e1f66dd");
        } else {
            this.d.a(this.k, this.l, this.m, aVar);
        }
    }

    public final void a(@NonNull FilterConditionResponse filterConditionResponse, i.a aVar) {
        Object[] objArr = {filterConditionResponse, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7967e1a0dc70c503e2f354880476f6ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7967e1a0dc70c503e2f354880476f6ee");
        } else {
            this.d.a(String.valueOf(this.k), this.l, filterConditionResponse, aVar);
        }
    }

    public final void a(boolean z, String str, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, viewGroup, viewGroup2, viewGroup3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fe61768ce68a2b21935c3df94cd53b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fe61768ce68a2b21935c3df94cd53b3");
            return;
        }
        this.q = z;
        this.b = new SGSortFilterBarBlock(z, this.i, viewGroup3, this, this.r, this.s, 1);
        viewGroup.addView(this.b.createView(viewGroup));
        this.b.a(this.q);
        this.b.a(this.j);
        this.c = new SGSortFilterBarBlock(z, this.i, viewGroup3, this, this.r, this.s, 2);
        viewGroup2.addView(this.c.createView(viewGroup2));
        this.c.a(this.q);
        this.c.a(this.j);
        this.d = new i(this.g, this.s, z, this.i, str, this.b, this.c);
        int dimensionPixelSize = this.b.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16);
        int dimensionPixelSize2 = this.b.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_12);
        this.b.b.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.b.c().setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, this.b.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_6));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0237c3d3dd6e9a3b49efb253154d45f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0237c3d3dd6e9a3b49efb253154d45f");
        } else {
            this.h = new com.sankuai.waimai.store.widgets.filterbar.home.a(this.i, this.r);
            this.c.d.addView(this.h.a());
        }
        e(true);
    }

    public final void a(com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67ba85d882b3992fb9f49ae7671867ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67ba85d882b3992fb9f49ae7671867ca");
            return;
        }
        if (this.b != null) {
            this.b.a(aVar);
        }
        if (this.c != null) {
            this.c.a(aVar);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a526ef5a8af0f5ce4116b7298195649", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a526ef5a8af0f5ce4116b7298195649");
        } else if (this.q == z) {
        } else {
            this.q = z;
            this.d.a(z);
            if (this.b != null) {
                this.b.a(this.q);
                int dimensionPixelSize = this.b.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16);
                int dimensionPixelSize2 = this.b.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_12);
                this.b.b.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                this.b.c().setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, this.b.getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_6));
            }
            if (this.c != null) {
                this.c.a(this.q);
            }
        }
    }

    public final void b(com.sankuai.waimai.store.widgets.filterbar.home.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2571a6d4fad674535fc375b5192e851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2571a6d4fad674535fc375b5192e851");
            return;
        }
        if (this.b != null) {
            this.b.b(aVar);
        }
        if (this.c != null) {
            this.c.b(aVar);
        }
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "291664a9600107935aa93d83c318a9d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "291664a9600107935aa93d83c318a9d5");
            return;
        }
        View view = this.c.getView();
        if (z && view.getVisibility() == 0) {
            return;
        }
        if (z || view.getVisibility() != 8) {
            d(z);
        }
    }

    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efdd72ba38dc9243428ad5ec1064a2b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efdd72ba38dc9243428ad5ec1064a2b6");
            return;
        }
        View view = this.c.getView();
        view.setVisibility(z ? 0 : 8);
        view.setTranslationY(0.0f);
        this.n = 0;
    }

    public final void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e630b0cc545b939c0fd5b154bd697ad6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e630b0cc545b939c0fd5b154bd697ad6");
            return;
        }
        if (!this.r.f() && (this.n == 0 || ((this.n > 0 && i < 0) || (this.n < 0 && i > 0)))) {
            View view = this.c.getView();
            View view2 = this.q ? view : this.c.b;
            if (view2.getVisibility() == 0 || this.r.bg == 1) {
                if (i < 0) {
                    u.a(view);
                    view.animate().translationYBy(-view2.getHeight()).translationY(0.0f).setDuration(200L).start();
                } else if (i > 0) {
                    view.animate().translationYBy(0.0f).translationY(-view2.getHeight()).setDuration(200L).start();
                }
            }
        }
        this.n = i;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.b
    public final void a(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81c0d93115d3aaf5795de062470b1b77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81c0d93115d3aaf5795de062470b1b77");
            return;
        }
        this.d.a(j);
        this.b.c = z;
        this.c.c = z;
        if (this.e != null) {
            this.e.a();
            this.e.a(j, true, this.d.c(), this.d.d());
        }
        this.f.a(this.k, this.l, String.valueOf(j));
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.b
    public final void a(int i, boolean z, String str, boolean z2, String str2) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e536cb2b989aea780aa7bf3d929ddabf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e536cb2b989aea780aa7bf3d929ddabf");
        } else {
            this.d.a(i, z, str, z2, str2, true);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.b
    public final void a(View view, boolean z, String str, boolean z2, String str2, BubbleInfoBean bubbleInfoBean) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2, bubbleInfoBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1910b291c578a73adcc13116f25fcc94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1910b291c578a73adcc13116f25fcc94");
            return;
        }
        com.sankuai.waimai.store.widgets.filterbar.home.model.b.a(this.i, str2, bubbleInfoBean);
        if (this.e != null) {
            this.e.a();
        }
        this.d.a(3, z, str, z2, str2, true);
        this.d.a(3, true);
        this.d.a(2);
        if (this.e != null) {
            this.e.a(this.d.a(), false, this.d.c(), str2.equals("-99") ? null : this.d.d());
        }
        this.f.a(this.k, this.l, str2, this.t, z2);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.b
    public final void b(View view, boolean z, String str, boolean z2, String str2, BubbleInfoBean bubbleInfoBean) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37bc5f8cc48f8453441478b0dfe042ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37bc5f8cc48f8453441478b0dfe042ef");
            return;
        }
        com.sankuai.waimai.store.widgets.filterbar.home.model.b.a(this.i, str2, null);
        this.d.a(3, z, str, z2, str2, false);
        this.d.a(3, false);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.b
    public final void a(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9708dfeacb221a461a7fe10370fb5dcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9708dfeacb221a461a7fe10370fb5dcf");
        } else if (this.e != null) {
            this.e.a();
            this.e.a(str);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e8a27dcacde654cb6397398b78df538", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e8a27dcacde654cb6397398b78df538");
            return;
        }
        if (this.e != null) {
            this.e.a();
        }
        SGSortFilterBarBlock sGSortFilterBarBlock = this.c;
        boolean z2 = !z ? 1 : 0;
        Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = SGSortFilterBarBlock.a;
        if (PatchProxy.isSupport(objArr2, sGSortFilterBarBlock, changeQuickRedirect2, false, "437dfef80ad05c4ac3e078be186f1962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, sGSortFilterBarBlock, changeQuickRedirect2, false, "437dfef80ad05c4ac3e078be186f1962");
        } else if (z2) {
            sGSortFilterBarBlock.a(1);
        } else {
            sGSortFilterBarBlock.a(0);
        }
        this.f.a(this.k, this.l, !z ? 1 : 0);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.b
    public final void a(int i, boolean z) {
        int i2 = 2;
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a94ad741c87afd01b7ea11071defbd3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a94ad741c87afd01b7ea11071defbd3e");
            return;
        }
        if (this.e != null) {
            this.e.a();
        }
        SGSortFilterBarBlock sGSortFilterBarBlock = this.c;
        boolean z2 = !z ? 1 : 0;
        Object[] objArr2 = {Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = SGSortFilterBarBlock.a;
        if (PatchProxy.isSupport(objArr2, sGSortFilterBarBlock, changeQuickRedirect2, false, "3505ee0eb6e8af50d0615d0edef7a84c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, sGSortFilterBarBlock, changeQuickRedirect2, false, "3505ee0eb6e8af50d0615d0edef7a84c");
        } else if (z2) {
            if (i == 0) {
                i2 = 3;
            } else if (i == 1) {
                i2 = 4;
            }
            sGSortFilterBarBlock.a(i2);
        } else {
            sGSortFilterBarBlock.a(0);
        }
        this.d.a(i, this.k, this.l, this.m);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.b
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5622362fe5cb89b87ec1a908b1702c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5622362fe5cb89b87ec1a908b1702c2");
            return;
        }
        this.d.c(i);
        this.d.e();
        if (this.e != null) {
            this.e.c();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a95238116030cb2c0a184affe439859", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a95238116030cb2c0a184affe439859");
        } else if (this.e != null) {
            this.e.c();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.b
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1f07f24325f3374d06abc133ece18ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1f07f24325f3374d06abc133ece18ae");
            return;
        }
        this.d.a(i, true);
        if (this.e != null) {
            this.e.a(this.d.a(), false, this.d.c(), this.d.d());
        }
        this.f.a(this.d.e(i), this.k, this.l, this.d.d(i));
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.b
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c865f176f264e46dbc2f052279473317", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c865f176f264e46dbc2f052279473317");
            return;
        }
        this.d.b(i);
        if (this.e != null) {
            this.e.a(this.d.a(), false, this.d.c(), this.d.d());
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ababf3b904b7e34c0af456d338738326", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ababf3b904b7e34c0af456d338738326");
            return;
        }
        this.f.a(this.k, this.l);
        if (this.e != null) {
            this.e.b();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bdae4b9104be5db274c391827bc4f2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bdae4b9104be5db274c391827bc4f2f");
            return;
        }
        this.f.a(this.d.e(i), this.k, this.l);
        if (this.e != null) {
            this.e.b();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.b
    public final void a(View view) {
        String f;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee7842f0db1ffa4e7b091eb7281aecf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee7842f0db1ffa4e7b091eb7281aecf9");
        } else if ((this.k >= 0 || !TextUtils.isEmpty(this.l)) && (f = this.d.f()) != null) {
            this.f.a(this.p, view, this.k, this.l, f, view == this.c.c());
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "175c4fb58cc5f3fae83f4aeb7d9456a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "175c4fb58cc5f3fae83f4aeb7d9456a5");
        } else {
            this.c.b();
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7738d6743fd86da828d78557c72e8415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7738d6743fd86da828d78557c72e8415");
            return;
        }
        this.d.b();
        this.b.a();
        this.c.a();
    }

    public final void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccb60165486a4211156ee612fe0decdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccb60165486a4211156ee612fe0decdd");
        } else {
            c(z);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onFilterBarStickyStatusChanged(com.sankuai.waimai.store.widgets.filterbar.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4594311a6296d8f9dd91180b50870fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4594311a6296d8f9dd91180b50870fb");
        } else if (aVar == null || aVar.c != System.identityHashCode(this.i)) {
        } else {
            this.t = aVar.a;
        }
    }

    public final void a(BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "682aa65efab7553f4b79d45aeb9274f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "682aa65efab7553f4b79d45aeb9274f2");
        } else if (!p.a(baseModuleDesc)) {
            this.h.a(baseModuleDesc, 0, true);
            this.c.d.setVisibility(0);
            this.b.d.setVisibility(0);
        } else {
            this.c.d.setVisibility(8);
            this.b.d.setVisibility(8);
        }
    }
}
