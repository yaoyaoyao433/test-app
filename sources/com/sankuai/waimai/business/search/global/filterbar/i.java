package com.sankuai.waimai.business.search.global.filterbar;

import android.content.Context;
import android.graphics.PointF;
import android.widget.BaseAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.view.view.bezier.BezierView;
import com.sankuai.waimai.platform.widget.filterbar.view.view.rangeseekbar.RangeSeekBar;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i extends BaseAdapter {
    public static ChangeQuickRedirect a;
    private Context b;
    private ArrayList<b.a.C1086a> c;
    private Map<String, com.sankuai.waimai.platform.widget.filterbar.domain.model.g> d;
    private PoiFilterActivityDialogFragment.c e;
    private boolean f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public BezierView a;
        public RangeSeekBar<Integer> b;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public i(Context context, b.a aVar, PoiFilterActivityDialogFragment.c cVar, Map<String, com.sankuai.waimai.platform.widget.filterbar.domain.model.g> map) {
        Object[] objArr = {context, aVar, cVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1e0e061a8856ef31336c0c493303cc3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1e0e061a8856ef31336c0c493303cc3");
            return;
        }
        this.c = new ArrayList<>();
        this.f = true;
        this.b = context;
        this.c.addAll(aVar.c);
        this.d = map;
        this.e = cVar;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59db69b4866076777365577d05085720", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59db69b4866076777365577d05085720")).intValue() : this.c.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.Adapter
    /* renamed from: a */
    public b.a.C1086a getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f10ef28d872e3edba0656517acda05a", RobustBitConfig.DEFAULT_VALUE) ? (b.a.C1086a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f10ef28d872e3edba0656517acda05a") : this.c.get(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.search.global.filterbar.i.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    private ArrayList<PointF> a(List<b.a.C1086a.C1088b.C1089a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80b1883c3e6d827a18f1225ad34e5d58", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80b1883c3e6d827a18f1225ad34e5d58");
        }
        ArrayList<PointF> arrayList = new ArrayList<>();
        if (list == null) {
            return arrayList;
        }
        for (b.a.C1086a.C1088b.C1089a c1089a : list) {
            if (c1089a != null) {
                arrayList.add(new PointF(c1089a.a, c1089a.b));
            }
        }
        return arrayList;
    }
}
