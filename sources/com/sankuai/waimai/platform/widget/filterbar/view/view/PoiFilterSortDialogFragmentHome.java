package com.sankuai.waimai.platform.widget.filterbar.view.view;

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
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.h;
import com.sankuai.waimai.platform.widget.filterbar.view.view.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiFilterSortDialogFragmentHome extends DialogFragment implements AdapterView.OnItemClickListener {
    public static ChangeQuickRedirect a;
    private static int e;
    private static int f;
    public List<h.a> b;
    public int c;
    public b.a d;
    private DynamicHeightListView g;
    private View.OnClickListener h;

    public PoiFilterSortDialogFragmentHome() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "251f7a8c3cfb505d5a4fddaecf5ccdf3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "251f7a8c3cfb505d5a4fddaecf5ccdf3");
            return;
        }
        this.c = 0;
        this.h = new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterSortDialogFragmentHome.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1594250a859edf8742c0250fdb237e1", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1594250a859edf8742c0250fdb237e1");
                } else if (PoiFilterSortDialogFragmentHome.this.d != null) {
                    PoiFilterSortDialogFragmentHome.this.d.a();
                }
            }
        };
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba158c28fffe949fdf6281556f64d2d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba158c28fffe949fdf6281556f64d2d9");
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
            f = (int) (e * 0.5f);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a010594183524670c1c1a4fab99441b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a010594183524670c1c1a4fab99441b1");
            return;
        }
        super.onDetach();
        this.d = null;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e96b8e19751d4e13bb35c7175d664c16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e96b8e19751d4e13bb35c7175d664c16");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbfb8909646c6e85c7389883c496d7f6", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbfb8909646c6e85c7389883c496d7f6") : layoutInflater.inflate(R.layout.wm_widget_filter_bar_sort_dialog_fragment_home, (ViewGroup) null);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9f08c39e0fe183e3aba1560a0191f9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9f08c39e0fe183e3aba1560a0191f9c");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "517a4bb7f8d3d55935d44961e63acd6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "517a4bb7f8d3d55935d44961e63acd6b");
        } else {
            view.setOnClickListener(this.h);
            view.findViewById(R.id.block_filter).setOnClickListener(this.h);
            this.g = (DynamicHeightListView) view.findViewById(R.id.list_sort);
            this.g.setMaxHeight(f);
            this.g.setOnItemClickListener(this);
        }
        a();
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a060dcc5f98b45ead69e965ca133fdab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a060dcc5f98b45ead69e965ca133fdab");
            return;
        }
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        a();
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
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterSortDialogFragmentHome.a
            java.lang.String r11 = "51bfaf505a5351c386fa492c92ac5747"
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
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterSortDialogFragmentHome.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "856850153e00cf21929b5a14ef3ba0f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "856850153e00cf21929b5a14ef3ba0f7");
            return;
        }
        Context context = getContext();
        if (context != null) {
            g gVar = new g(context.getApplicationContext(), this.b);
            gVar.a(this.c);
            a(gVar);
        }
    }

    private void a(BaseAdapter baseAdapter) {
        Object[] objArr = {baseAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b438f949905a2b301a8a56684b77954f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b438f949905a2b301a8a56684b77954f");
        } else {
            this.g.setAdapter((ListAdapter) baseAdapter);
        }
    }
}
