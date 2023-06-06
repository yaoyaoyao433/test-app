package com.sankuai.waimai.store.newwidgets.list;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.q;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.util.z;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCPinnedRecyclerView extends RelativeLayout {
    public static ChangeQuickRedirect b;
    private d a;
    public SCRecyclerView c;
    private ViewGroup d;
    private ViewGroup e;
    private NetInfoLoadView f;
    private int g;
    private final SparseArray<e> h;
    private RecyclerView.c i;
    private RecyclerView.k j;

    public static /* synthetic */ void a(SCPinnedRecyclerView sCPinnedRecyclerView) {
        int[] e;
        int[] iArr;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, sCPinnedRecyclerView, changeQuickRedirect, false, "fa386623c815995dda3470851755feb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sCPinnedRecyclerView, changeQuickRedirect, false, "fa386623c815995dda3470851755feb3");
            return;
        }
        sCPinnedRecyclerView.g = -1;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, sCPinnedRecyclerView, changeQuickRedirect2, false, "ab18bbdb10b833fe6910035dd46a0392", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, sCPinnedRecyclerView, changeQuickRedirect2, false, "ab18bbdb10b833fe6910035dd46a0392");
        } else if (sCPinnedRecyclerView.h.size() <= 0 && sCPinnedRecyclerView.a != null && (e = sCPinnedRecyclerView.a.e()) != null) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, sCPinnedRecyclerView, changeQuickRedirect3, false, "cbef8f2f3a5b3f26383ae52e19f99d3a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, sCPinnedRecyclerView, changeQuickRedirect3, false, "cbef8f2f3a5b3f26383ae52e19f99d3a");
            } else {
                sCPinnedRecyclerView.d.removeAllViews();
                sCPinnedRecyclerView.d.setTag(null);
            }
            int length = e.length;
            int i = 0;
            while (i < length) {
                int i2 = e[i];
                e a = sCPinnedRecyclerView.a.a(sCPinnedRecyclerView, i2);
                if (a != null) {
                    a.a((e) sCPinnedRecyclerView.a.f());
                    View c2 = a.c(sCPinnedRecyclerView.d);
                    if (c2 != null) {
                        Object[] objArr4 = new Object[1];
                        objArr4[c] = c2;
                        ChangeQuickRedirect changeQuickRedirect4 = b;
                        iArr = e;
                        if (PatchProxy.isSupport(objArr4, sCPinnedRecyclerView, changeQuickRedirect4, false, "54d53a55eda5a141ba83795726b0047f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, sCPinnedRecyclerView, changeQuickRedirect4, false, "54d53a55eda5a141ba83795726b0047f");
                        } else if (c2 != null) {
                            ViewParent parent = c2.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(c2);
                            }
                        }
                        sCPinnedRecyclerView.d.addView(c2);
                        sCPinnedRecyclerView.h.put(i2, a);
                        i++;
                        e = iArr;
                        c = 0;
                    }
                }
                iArr = e;
                i++;
                e = iArr;
                c = 0;
            }
        }
        sCPinnedRecyclerView.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int i;
        RecyclerView.LayoutManager layoutManager;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d336f71ab5ff248cd6187286617c1538", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d336f71ab5ff248cd6187286617c1538");
            return;
        }
        int a = q.a((RecyclerView) this.c);
        Object[] objArr2 = {Integer.valueOf(a)};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81ad28fc3c959ed43b78e621a80a17d5", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81ad28fc3c959ed43b78e621a80a17d5")).intValue();
        } else {
            if (this.a != null) {
                i = a;
                while (i >= 0 && i < this.a.getItemCount()) {
                    if (b(i)) {
                        break;
                    }
                    i--;
                }
            }
            i = -1;
        }
        if (i < 0) {
            d();
            return;
        }
        int headerCount = this.c.getHeaderCount() + i + 1;
        if (headerCount <= a) {
            e();
            return;
        }
        SCRecyclerView sCRecyclerView = this.c;
        Object[] objArr3 = {sCRecyclerView, Integer.valueOf(headerCount)};
        ChangeQuickRedirect changeQuickRedirect3 = q.a;
        View view = null;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "c4edf50b582a037b1a2d2f539349fea4", RobustBitConfig.DEFAULT_VALUE)) {
            view = (View) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "c4edf50b582a037b1a2d2f539349fea4");
        } else if (sCRecyclerView != null && (layoutManager = sCRecyclerView.getLayoutManager()) != null) {
            view = layoutManager.findViewByPosition(headerCount);
        }
        if (view != null && view.getY() <= getPinnedHeight()) {
            e();
        } else {
            d();
        }
    }

    public RecyclerView getRecyclerView() {
        return this.c;
    }

    public final void a(View view, int i) {
        Object[] objArr = {view, 0};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9626776651d9c7d7e59b56fedff8435", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9626776651d9c7d7e59b56fedff8435");
        } else if (this.e != null) {
            this.e.addView(view, 0);
        }
    }

    @NonNull
    public ViewGroup getPinnedLayout() {
        return this.e;
    }

    public SCPinnedRecyclerView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aa34fa96c77eeb3edcabc5a7cbf8516", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aa34fa96c77eeb3edcabc5a7cbf8516");
        }
    }

    public SCPinnedRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "276638263cf560e1bb01c92fb4bd5689", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "276638263cf560e1bb01c92fb4bd5689");
        }
    }

    public SCPinnedRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ed5e0bb3719d0fb3e6102bdb9073b77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ed5e0bb3719d0fb3e6102bdb9073b77");
            return;
        }
        this.g = -1;
        this.h = new SparseArray<>();
        this.i = new RecyclerView.c() { // from class: com.sankuai.waimai.store.newwidgets.list.SCPinnedRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.c
            public final void onChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1996cdf0bb635695cacb7b6c126bf8d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1996cdf0bb635695cacb7b6c126bf8d");
                } else {
                    SCPinnedRecyclerView.a(SCPinnedRecyclerView.this);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.c
            public final void onItemRangeChanged(int i2, int i3) {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5dfb76fae4c82173e796d9e3bc122564", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5dfb76fae4c82173e796d9e3bc122564");
                } else {
                    SCPinnedRecyclerView.this.g = -1;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.c
            public final void onItemRangeInserted(int i2, int i3) {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d743107e9b543c3c78bdc2c24b74b80", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d743107e9b543c3c78bdc2c24b74b80");
                } else {
                    SCPinnedRecyclerView.this.g = -1;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.c
            public final void onItemRangeRemoved(int i2, int i3) {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91baed6142b9a089bd2bf9de57697c2c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91baed6142b9a089bd2bf9de57697c2c");
                } else {
                    SCPinnedRecyclerView.this.g = -1;
                }
            }
        };
        this.j = new RecyclerView.k() { // from class: com.sankuai.waimai.store.newwidgets.list.SCPinnedRecyclerView.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c614cb2b1a9fe03d1c51c2dc46701b4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c614cb2b1a9fe03d1c51c2dc46701b4");
                } else {
                    super.onScrollStateChanged(recyclerView, i2);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c176052362231debdf49b54aaf9cc32f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c176052362231debdf49b54aaf9cc32f");
                    return;
                }
                super.onScrolled(recyclerView, i2, i3);
                SCPinnedRecyclerView.this.a();
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b028db40f3b33b89d6fc87359a6c26a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b028db40f3b33b89d6fc87359a6c26a");
            return;
        }
        z.a(getContext(), R.layout.wm_sc_pinned_recycler_view_layout, this, true);
        this.e = (ViewGroup) findViewById(R.id.top_pinned_layout);
        this.c = (SCRecyclerView) findViewById(R.id.recycler);
        this.d = (ViewGroup) findViewById(R.id.recycler_pinned_layout);
        this.f = (NetInfoLoadView) findViewById(R.id.net_info);
        this.c.addOnScrollListener(this.j);
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50ef21a8f73fcbbc481a4b2c98613714", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50ef21a8f73fcbbc481a4b2c98613714");
        } else if (this.d.getVisibility() != 8) {
            this.d.setVisibility(8);
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf31a95174deb07b56b5b819e974d54a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf31a95174deb07b56b5b819e974d54a");
            return;
        }
        if (this.d.getVisibility() != 0) {
            this.d.setVisibility(0);
        }
        g();
    }

    private int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "952365347aa0a9fac5da2efb91487325", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "952365347aa0a9fac5da2efb91487325")).intValue();
        }
        for (int min = Math.min(q.a((RecyclerView) this.c) - this.c.getHeaderCount(), this.a.getItemCount() - 1); min >= 0; min--) {
            if (b(min)) {
                return min;
            }
        }
        return -1;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afcc41658812a987f4a3c71b6d613520", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afcc41658812a987f4a3c71b6d613520");
        } else if (this.a == null) {
        } else {
            int f = f();
            if (f < 0) {
                this.g = f;
            } else if (f == this.g) {
            } else {
                this.g = f;
                e c = c(this.a.getItemViewType(this.g));
                if (c != null) {
                    c.a(this.g);
                }
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "140f8a71586ba7d771d60a40d4a09454", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "140f8a71586ba7d771d60a40d4a09454");
        } else {
            super.onMeasure(i, i2);
        }
    }

    private boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec1d6650af89839a67f8731a23e7bc9e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec1d6650af89839a67f8731a23e7bc9e")).booleanValue();
        }
        int[] e = this.a.e();
        if (e == null) {
            return false;
        }
        for (int i2 : e) {
            if (this.a.getItemViewType(i) == i2) {
                return true;
            }
        }
        return false;
    }

    public void setAdapter(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79cd3b2006bc3e079b8269f3cfe67344", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79cd3b2006bc3e079b8269f3cfe67344");
            return;
        }
        if (this.a != null) {
            this.a.unregisterAdapterDataObserver(this.i);
        }
        this.a = dVar;
        if (this.a != null) {
            this.a.registerAdapterDataObserver(this.i);
        }
        this.c.setAdapter((f<?, ?>) this.a);
    }

    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "373f0ab70ab8261d966635420c6a3ff3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "373f0ab70ab8261d966635420c6a3ff3");
        } else {
            this.c.setLayoutManager(layoutManager);
        }
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4207e03170355971c6ae30b27fc09bf7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4207e03170355971c6ae30b27fc09bf7")).intValue() : this.c.a(i);
    }

    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ea8559fc46d45675c06f043b786fd36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ea8559fc46d45675c06f043b786fd36");
        } else {
            this.c.addOnScrollListener(kVar);
        }
    }

    public void setOnScrollToBottomOrTopListener(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e0a98d077a3268fa4240b110e88a14c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e0a98d077a3268fa4240b110e88a14c");
        } else {
            this.c.setOnScrollToBottomOrTopListener(nVar);
        }
    }

    public void setDispatchNestedPreFling(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db23b5a30df4e6dd313b0a88c10ca239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db23b5a30df4e6dd313b0a88c10ca239");
        } else {
            this.c.setDispatchNestedPreFling(z);
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeafeba2ba368b852f7f785da507c9d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeafeba2ba368b852f7f785da507c9d4");
        } else {
            this.c.b(view);
        }
    }

    public void setBottomMargin(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f42c68b27e5dd380e199052481ad8f94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f42c68b27e5dd380e199052481ad8f94");
        } else {
            this.c.setBottomMargin(i);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4cf693a2523cb00e2ce13a87d8de086", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4cf693a2523cb00e2ce13a87d8de086");
            return;
        }
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.f.a(str, "");
        this.f.d();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cac69562087de66c74ef2497490ee82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cac69562087de66c74ef2497490ee82");
            return;
        }
        this.f.e();
        this.c.setVisibility(0);
        this.d.setVisibility(0);
        this.e.setVisibility(0);
    }

    private e c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1b65a8695753960770bac8b65cbd14d", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1b65a8695753960770bac8b65cbd14d");
        }
        e eVar = null;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            int keyAt = this.h.keyAt(i2);
            e eVar2 = this.h.get(keyAt);
            if (eVar2 != null && eVar2.p != null) {
                View view = eVar2.p;
                if (i == keyAt) {
                    if (view.getVisibility() != 0) {
                        view.setVisibility(0);
                    }
                    eVar = eVar2;
                } else if (view.getVisibility() != 8) {
                    view.setVisibility(8);
                }
            }
        }
        return eVar;
    }

    public int getPinnedHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ba717130357d8a400ebd48191e7ab5e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ba717130357d8a400ebd48191e7ab5e")).intValue();
        }
        int measuredHeight = this.d.getMeasuredHeight();
        return measuredHeight <= 0 ? getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_32) : measuredHeight;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b77e392c38a19ca9aa63081f745b6255", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b77e392c38a19ca9aa63081f745b6255");
            return;
        }
        for (int i = 0; i < this.h.size(); i++) {
            e valueAt = this.h.valueAt(i);
            if (valueAt != null) {
                valueAt.b();
            }
        }
    }
}
