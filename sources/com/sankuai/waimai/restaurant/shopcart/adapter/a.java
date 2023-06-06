package com.sankuai.waimai.restaurant.shopcart.adapter;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.shopcart.g;
import com.sankuai.waimai.restaurant.shopcart.viewHolder.d;
import com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.platform.widget.listview.adapter.a<g> implements DragSortListView.c {
    public static ChangeQuickRedirect c;
    public LinkedList<g> d;
    private final LayoutInflater e;
    private Activity f;
    private ViewGroup g;
    private final com.sankuai.waimai.business.restaurant.base.manager.order.g h;
    private final com.sankuai.waimai.restaurant.shopcart.config.a i;
    private d.a j;
    private String k;
    private Typeface l;

    public a(Activity activity, ViewGroup viewGroup, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, com.sankuai.waimai.restaurant.shopcart.config.a aVar, d.a aVar2) {
        Object[] objArr = {activity, viewGroup, gVar, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7ae9f1e6c74d02cee22ad4290eaf879", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7ae9f1e6c74d02cee22ad4290eaf879");
            return;
        }
        this.k = "";
        this.l = null;
        this.e = LayoutInflater.from(new ContextThemeWrapper(activity, 2131558963));
        this.f = activity;
        this.g = viewGroup;
        this.h = gVar;
        this.i = aVar;
        this.j = aVar2;
        try {
            this.l = Typeface.createFromAsset(activity.getAssets(), "fonts/AvenirLTPro-Medium.ttf");
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return g.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0355, code lost:
        if (r0.r != false) goto L67;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r32, android.view.View r33, android.view.ViewGroup r34) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.restaurant.shopcart.adapter.a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfd637502619e8b6588f967e9664669d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfd637502619e8b6588f967e9664669d")).intValue();
        }
        if (getItem(i) == null) {
            return 3;
        }
        return getItem(i).e;
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.c
    public final void a(int i, int i2) {
        g next;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33568c9b3e3535a757d2a53cfc9551a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33568c9b3e3535a757d2a53cfc9551a2");
            return;
        }
        g gVar = null;
        if (this.d == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8cfcf86c62b8955324845ceecb08e88", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8cfcf86c62b8955324845ceecb08e88");
            } else {
                ArrayList<g> a = a();
                if (!com.sankuai.waimai.foundation.utils.d.a(a)) {
                    this.d = new LinkedList<>();
                    this.d.addAll(a);
                } else {
                    this.d = null;
                }
            }
        }
        if (com.sankuai.waimai.foundation.utils.d.a(this.d) || i == i2 || this.d.size() < i || this.d.size() < i2) {
            return;
        }
        g remove = this.d.remove(i2);
        this.d.add(i, remove);
        if (remove.e != 0) {
            return;
        }
        if (i2 > i) {
            this.g.announceForAccessibility(remove.j);
            return;
        }
        Iterator<g> it = this.d.iterator();
        while (it.hasNext() && (next = it.next()) != remove) {
            if (next.e == 0) {
                gVar = next;
            }
        }
        if (gVar != null) {
            this.g.announceForAccessibility(gVar.j);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.listview.adapter.a
    public final boolean a(@Nullable List<g> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d0c588726ae7056238a289cb6ed8ae7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d0c588726ae7056238a289cb6ed8ae7")).booleanValue();
        }
        this.d = null;
        return super.a(list);
    }
}
