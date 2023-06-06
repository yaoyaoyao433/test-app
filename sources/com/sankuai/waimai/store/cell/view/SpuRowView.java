package com.sankuai.waimai.store.cell.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.cell.creator.c;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SpuRowView extends LinearLayout implements com.sankuai.waimai.store.observers.a {
    public static ChangeQuickRedirect a;
    private static final c b = new com.sankuai.waimai.store.cell.creator.b();
    private int c;
    private c d;
    private List<GoodsSpu> e;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a f;
    private boolean g;
    private boolean h;
    private List<com.sankuai.waimai.store.cell.core.a> i;
    private GoodDetailResponse j;
    private com.sankuai.waimai.store.cell.core.impl.a k;
    private a l;
    private long m;
    private boolean n;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    public SpuRowView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "480627012fb21ce4f7ea1c385a285fdb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "480627012fb21ce4f7ea1c385a285fdb");
            return;
        }
        this.c = 3;
        this.d = b;
        this.e = new ArrayList();
        this.g = true;
        this.h = false;
        this.i = new ArrayList();
        this.k = new com.sankuai.waimai.store.cell.core.impl.a();
        a();
    }

    public SpuRowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0f01af8fcda2812550c31b9b7b8acf1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0f01af8fcda2812550c31b9b7b8acf1");
            return;
        }
        this.c = 3;
        this.d = b;
        this.e = new ArrayList();
        this.g = true;
        this.h = false;
        this.i = new ArrayList();
        this.k = new com.sankuai.waimai.store.cell.core.impl.a();
        a();
    }

    @UiThread
    public void setAlwaysWholeLine(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d4a41de3d50c88f77a7d7b021eba919", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d4a41de3d50c88f77a7d7b021eba919");
            return;
        }
        this.g = z;
        b();
    }

    @UiThread
    public void setData(List<GoodsSpu> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d22e776856a8595ad2155d71ba96c136", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d22e776856a8595ad2155d71ba96c136");
            return;
        }
        Object[] objArr2 = {list, -1L, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36f826a419783ac9623767857274789c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36f826a419783ac9623767857274789c");
            return;
        }
        this.e.clear();
        if (!com.sankuai.shangou.stone.util.a.b(list)) {
            this.e.addAll(list);
        }
        this.m = -1L;
        this.n = false;
        b();
    }

    public void setIItemActionCellCallback(@Nullable com.sankuai.waimai.store.cell.core.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "766e98615250d84bf33f7fba40897295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "766e98615250d84bf33f7fba40897295");
        } else {
            this.k.b = bVar;
        }
    }

    public void setSpuRowListener(@Nullable a aVar) {
        this.l = aVar;
    }

    public void setIItemEventCellCallback(@Nullable com.sankuai.waimai.store.cell.core.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3beff412d158e54d320b59e87d1d681", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3beff412d158e54d320b59e87d1d681");
        } else {
            this.k.c = cVar;
        }
    }

    public void setSpuViewCreator(c cVar) {
        if (cVar != null) {
            this.d = cVar;
        }
    }

    public void setListenerShopcart(boolean z) {
        this.h = z;
    }

    public void setRowColumn(int i) {
        if (i <= 0 || i > 5) {
            return;
        }
        this.c = i;
    }

    public void setPoiHelper(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f8f2edaf197ea316ff508db426086f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f8f2edaf197ea316ff508db426086f3");
            return;
        }
        this.f = aVar;
        if (com.sankuai.shangou.stone.util.a.b(this.i)) {
            return;
        }
        for (com.sankuai.waimai.store.cell.core.a aVar2 : this.i) {
            aVar2.setPoiHelper(aVar);
        }
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8165c925d8dceadea1e65205db599e76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8165c925d8dceadea1e65205db599e76");
        } else if (this.h) {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11f61a55f02e639a5d5d9e6bb1ab563d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11f61a55f02e639a5d5d9e6bb1ab563d");
            return;
        }
        super.onAttachedToWindow();
        com.sankuai.waimai.store.order.a.e().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8361b4e9833f042eeb109caad5240982", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8361b4e9833f042eeb109caad5240982");
            return;
        }
        super.onDetachedFromWindow();
        com.sankuai.waimai.store.order.a.e().b(this);
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eecd32579bb889c78b95c86e6cb72db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eecd32579bb889c78b95c86e6cb72db");
        } else {
            setOrientation(1);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b511d5956f3a0312b8fa1953b2555ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b511d5956f3a0312b8fa1953b2555ed");
        } else if (p.a(this.e, this.d)) {
        } else {
            List<GoodsSpu> list = this.e;
            int size = list.size();
            int i = size / this.c;
            int i2 = this.g ? this.c * i : size;
            if (this.i.size() == i2) {
                a(list);
            } else {
                a(list, size, i, i2);
            }
        }
    }

    private void a(List<GoodsSpu> list, int i, int i2, int i3) {
        Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6566bfd8c9d0fd7b590f56df4ece1314", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6566bfd8c9d0fd7b590f56df4ece1314");
            return;
        }
        removeAllViews();
        this.i.clear();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        LinearLayout linearLayout = null;
        for (int i4 = 0; i4 < i3; i4++) {
            GoodsSpu goodsSpu = list.get(i4);
            if (i4 % this.c == 0) {
                linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(0);
                addView(linearLayout, layoutParams);
            }
            com.sankuai.waimai.store.cell.core.a a2 = this.d.a(getContext());
            if (linearLayout != null) {
                linearLayout.addView(a2.getView(), layoutParams2);
            }
            a(a2, goodsSpu, i4);
            this.i.add(a2);
            if (this.l != null) {
                a2.getView();
            }
        }
        if (this.g || linearLayout == null || i % this.c <= 0) {
            return;
        }
        int i5 = this.c;
        for (int i6 = i5 - (i % i5); i6 > 0; i6--) {
            linearLayout.addView(new Space(getContext()), layoutParams2);
        }
    }

    private void a(List<GoodsSpu> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "425a7f5f03d752c9719bc4e6c7e6f525", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "425a7f5f03d752c9719bc4e6c7e6f525");
            return;
        }
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            com.sankuai.waimai.store.cell.core.a aVar = this.i.get(i);
            a(aVar, (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i), i);
            if (this.l != null) {
                aVar.getView();
                com.sankuai.shangou.stone.util.a.a((List) list, i);
            }
        }
    }

    private void a(com.sankuai.waimai.store.cell.core.a aVar, GoodsSpu goodsSpu, int i) {
        Object[] objArr = {aVar, goodsSpu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0e1e0de1ade19f7d1594dd296ce8200", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0e1e0de1ade19f7d1594dd296ce8200");
        } else if (p.a(aVar, goodsSpu)) {
        } else {
            if (this.m == goodsSpu.getId()) {
                aVar.a(true, this.n);
            } else {
                aVar.a(false, false);
            }
            aVar.setActionCallback(this.k);
            aVar.setEventCallback(this.k);
            aVar.setPoiHelper(this.f);
            aVar.setGoodDetailResponse(this.j);
            aVar.a(goodsSpu, i);
        }
    }

    public void setGoodDetailResponse(GoodDetailResponse goodDetailResponse) {
        this.j = goodDetailResponse;
    }
}
