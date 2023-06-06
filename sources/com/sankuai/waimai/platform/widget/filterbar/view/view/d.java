package com.sankuai.waimai.platform.widget.filterbar.view.view;

import android.content.Context;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterActivityDialogFragmentHome;
import com.sankuai.waimai.platform.widget.filterbar.view.view.c;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends BaseAdapter {
    public static ChangeQuickRedirect a;
    boolean b;
    public List<b.a.C1086a> c;
    private final int d;
    private Context e;
    private PoiFilterActivityDialogFragmentHome.b f;
    private boolean g;
    private String h;
    private ArrayMap i;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public d(Context context, b.a aVar, PoiFilterActivityDialogFragmentHome.b bVar, ArrayMap arrayMap, int i) {
        Object[] objArr = {context, aVar, bVar, arrayMap, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a43dd7d70cd4d93d05a7bceac2adff1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a43dd7d70cd4d93d05a7bceac2adff1f");
            return;
        }
        this.c = new ArrayList();
        this.f = null;
        this.g = false;
        this.h = "0";
        this.i = null;
        this.e = context;
        this.g = aVar.b;
        this.c.clear();
        if (aVar != null && aVar.c != null && aVar.c.size() > 0) {
            this.c.addAll(aVar.c);
        }
        this.f = bVar;
        this.i = arrayMap;
        this.d = i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3779188196d89b4a602d7b9137b4f85b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3779188196d89b4a602d7b9137b4f85b")).intValue() : this.b ? this.c.size() : this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.Adapter
    /* renamed from: a */
    public b.a.C1086a getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "242e90ea995b10d27087028d0f7a1e26", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.a.C1086a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "242e90ea995b10d27087028d0f7a1e26");
        }
        if (i < this.c.size()) {
            return this.c.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7050ca8ae52ccb867ab08b8e0e7e6f5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7050ca8ae52ccb867ab08b8e0e7e6f5b");
        }
        if (view == null) {
            c cVar = new c(this.e);
            View a2 = cVar.a(viewGroup);
            a2.setTag(cVar);
            view = a2;
        }
        final c cVar2 = (c) view.getTag();
        final b.a.C1086a item = getItem(i);
        if (!com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(item)) {
            boolean z = (this.i == null || ((Boolean) this.i.get(item.a)) == null) ? false : true;
            if (z && !this.g) {
                this.h = item.a;
            }
            cVar2.a(item, z, null);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.d.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6dbe36066b3f2c817159021d5c6100c", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6dbe36066b3f2c817159021d5c6100c");
                    } else if (d.this.g) {
                        if (cVar2.a()) {
                            cVar2.a(false);
                            d.this.f.b(item.a);
                            return;
                        }
                        cVar2.a(true);
                        d.this.f.a(item.a);
                    } else if (cVar2.a()) {
                        d.this.f.b(item.a);
                        d.this.h = "0";
                        cVar2.a(false);
                        cVar2.a(item.c, (c.a) null);
                    } else {
                        if (!TextUtils.isEmpty(d.this.h) && !"0".equals(d.this.h)) {
                            d.this.f.b(d.this.h);
                        }
                        d.this.h = item.a;
                        d.this.f.a(item.a);
                        cVar2.a(true);
                        d.this.notifyDataSetChanged();
                    }
                }
            };
            Object[] objArr2 = {onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar2, changeQuickRedirect2, false, "fb5a67ac210ef54b71d4fa8ab3d70f0f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar2, changeQuickRedirect2, false, "fb5a67ac210ef54b71d4fa8ab3d70f0f");
            } else {
                cVar2.e.setOnClickListener(onClickListener);
            }
        }
        return view;
    }
}
