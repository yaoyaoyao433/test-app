package com.sankuai.waimai.business.search.global.filterbar;

import android.content.Context;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment;
import com.sankuai.waimai.business.search.global.filterbar.e;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends BaseAdapter {
    public static ChangeQuickRedirect a;
    public ArrayList<b.a.C1086a> b;
    private Context c;
    private PoiFilterActivityDialogFragment.a d;
    private boolean e;
    private String f;
    private ArrayMap g;
    private boolean h;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public g(Context context, b.a aVar, PoiFilterActivityDialogFragment.a aVar2, ArrayMap arrayMap, boolean z) {
        Object[] objArr = {context, aVar, aVar2, arrayMap, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a46c9c15f7c6ee792d732c22546aac1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a46c9c15f7c6ee792d732c22546aac1");
            return;
        }
        this.b = new ArrayList<>();
        this.d = null;
        this.e = false;
        this.f = "0";
        this.g = null;
        this.h = false;
        this.c = context;
        this.e = aVar.b;
        this.b.clear();
        if (aVar != null && aVar.c != null && aVar.c.size() > 0) {
            this.b.addAll(aVar.c);
        }
        this.d = aVar2;
        this.g = arrayMap;
        this.h = z;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f56a548266cc11eb882a6b5110ce5c5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f56a548266cc11eb882a6b5110ce5c5")).intValue() : this.b.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.Adapter
    /* renamed from: a */
    public b.a.C1086a getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eaa0b2449254483e2b4f622ff6065f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.a.C1086a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eaa0b2449254483e2b4f622ff6065f6");
        }
        if (i < this.b.size()) {
            return this.b.get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39060aecf6fc5be7df945f0f4b177d03", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39060aecf6fc5be7df945f0f4b177d03");
        }
        if (view == null) {
            e eVar = new e(this.c, this.h);
            View a2 = eVar.a(viewGroup);
            a2.setTag(eVar);
            view = a2;
        }
        final e eVar2 = (e) view.getTag();
        final b.a.C1086a item = getItem(i);
        if (!com.sankuai.waimai.platform.widget.filterbar.domain.model.b.a(item)) {
            boolean z = (this.g == null || ((Boolean) this.g.get(item.a)) == null) ? false : true;
            if (z && !this.e) {
                this.f = item.a;
            }
            eVar2.a(item, z, null);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.global.filterbar.g.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8065633448b80f3d70944cfc877f007e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8065633448b80f3d70944cfc877f007e");
                    } else if (g.this.e) {
                        if (eVar2.a()) {
                            eVar2.a(false);
                            g.this.d.b(item.a);
                            return;
                        }
                        eVar2.a(true);
                        g.this.d.a(item.a);
                    } else if (eVar2.a()) {
                        g.this.d.b(item.a);
                        g.this.f = "0";
                        eVar2.a(false);
                        eVar2.a(item.c, (e.a) null);
                    } else {
                        if (!TextUtils.isEmpty(g.this.f) && !"0".equals(g.this.f)) {
                            g.this.d.b(g.this.f);
                        }
                        g.this.f = item.a;
                        g.this.d.a(item.a);
                        eVar2.a(true);
                        g.this.notifyDataSetChanged();
                    }
                }
            };
            Object[] objArr2 = {onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar2, changeQuickRedirect2, false, "1a0acd13b95268b56f347f4683cda4e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar2, changeQuickRedirect2, false, "1a0acd13b95268b56f347f4683cda4e2");
            } else {
                eVar2.d.setOnClickListener(onClickListener);
            }
        }
        return view;
    }
}
