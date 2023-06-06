package com.sankuai.waimai.business.search.global.filterbar;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.h;
import com.sankuai.waimai.platform.widget.filterbar.view.view.DynamicHeightListView;
import com.sankuai.waimai.platform.widget.filterbar.view.view.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PoiFilterSortDialogFragment extends DialogFragment implements AdapterView.OnItemClickListener {
    public static ChangeQuickRedirect a;
    private static int e;
    private static int f;
    List<h.a> b;
    int c;
    b.a d;
    private DynamicHeightListView g;
    private View.OnClickListener h;

    public PoiFilterSortDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01c552af1c354cf2687ed1e0b378d5c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01c552af1c354cf2687ed1e0b378d5c5");
            return;
        }
        this.c = 0;
        this.h = new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.global.filterbar.PoiFilterSortDialogFragment.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ac2eecb072184a4085c1f9e87407063", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ac2eecb072184a4085c1f9e87407063");
                } else if (PoiFilterSortDialogFragment.this.d != null) {
                    PoiFilterSortDialogFragment.this.d.a();
                }
            }
        };
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42b2fcfa03d3e52e9afe07b1f15629d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42b2fcfa03d3e52e9afe07b1f15629d9");
            return;
        }
        super.onAttach(activity);
        if (e == 0) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                e = displayMetrics.heightPixels;
            } catch (Exception unused) {
            }
            f = (int) (e * 0.6f);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0a87b6b2f99f8d3c03ca2458940dc4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0a87b6b2f99f8d3c03ca2458940dc4f");
            return;
        }
        super.onDetach();
        this.d = null;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02fda635726d15603aa80333bca09a3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02fda635726d15603aa80333bca09a3b");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dd9584a8767726f686614b67e5aefab", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dd9584a8767726f686614b67e5aefab") : layoutInflater.inflate(R.layout.wm_widget_filter_bar_sort_dialog_fragment, (ViewGroup) null);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "959ce726a862165021e1f6a8b323f258", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "959ce726a862165021e1f6a8b323f258");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9d835bda5d1bc90a2ed7e341e17815b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9d835bda5d1bc90a2ed7e341e17815b");
        } else {
            view.setOnClickListener(this.h);
            view.findViewById(R.id.block_filter).setOnClickListener(this.h);
            this.g = (DynamicHeightListView) view.findViewById(R.id.list_sort);
            this.g.setMaxHeight(f);
            this.g.setOnItemClickListener(this);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b2a0d1d604de2215a0278825ccc530b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b2a0d1d604de2215a0278825ccc530b2");
            return;
        }
        Context context = getContext();
        if (context != null) {
            j jVar = new j(context.getApplicationContext(), this.b);
            int i = this.c;
            Object[] objArr4 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = j.a;
            if (PatchProxy.isSupport(objArr4, jVar, changeQuickRedirect4, false, "22ba753e01c75a7154f7c48aafcd4ef9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, jVar, changeQuickRedirect4, false, "22ba753e01c75a7154f7c48aafcd4ef9");
            } else {
                jVar.b = i;
                jVar.notifyDataSetChanged();
            }
            Object[] objArr5 = {jVar};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1eddf3b5ef4ee35f5b88f196af8a8130", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1eddf3b5ef4ee35f5b88f196af8a8130");
            } else {
                this.g.setAdapter((ListAdapter) jVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.AdapterView.OnItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onItemClick(android.widget.AdapterView<?> r10, android.view.View r11, int r12, long r13) {
        /*
            r9 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r10
            r10 = 1
            r0[r10] = r11
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r11 = 2
            r0[r11] = r10
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r13)
            r11 = 3
            r0[r11] = r10
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.search.global.filterbar.PoiFilterSortDialogFragment.a
            java.lang.String r11 = "566164c68b3ed4acddb0d463a1028842"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r9
            r3 = r10
            r5 = r11
            boolean r13 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r13 == 0) goto L2d
            com.meituan.robust.PatchProxy.accessDispatch(r0, r9, r10, r8, r11)
            return
        L2d:
            r10 = 0
            if (r12 < 0) goto L49
            java.util.List<com.sankuai.waimai.platform.widget.filterbar.domain.model.h$a> r13 = r9.b
            if (r13 == 0) goto L49
            java.util.List<com.sankuai.waimai.platform.widget.filterbar.domain.model.h$a> r13 = r9.b
            int r13 = r13.size()
            if (r13 <= r12) goto L49
            java.util.List<com.sankuai.waimai.platform.widget.filterbar.domain.model.h$a> r13 = r9.b     // Catch: java.lang.Exception -> L49
            java.lang.Object r13 = r13.get(r12)     // Catch: java.lang.Exception -> L49
            com.sankuai.waimai.platform.widget.filterbar.domain.model.h$a r13 = (com.sankuai.waimai.platform.widget.filterbar.domain.model.h.a) r13     // Catch: java.lang.Exception -> L49
            long r13 = r13.a     // Catch: java.lang.Exception -> L49
            r4 = r13
            goto L4a
        L49:
            r4 = r10
        L4a:
            com.sankuai.waimai.platform.widget.filterbar.view.view.b$a r10 = r9.d
            if (r10 == 0) goto L56
            com.sankuai.waimai.platform.widget.filterbar.view.view.b$a r0 = r9.d
            r3 = -1
            r1 = r9
            r2 = r12
            r0.a(r1, r2, r3, r4)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.search.global.filterbar.PoiFilterSortDialogFragment.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
