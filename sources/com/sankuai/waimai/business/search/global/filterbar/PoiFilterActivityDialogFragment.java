package com.sankuai.waimai.business.search.global.filterbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.view.view.DynamicHeightSrollView;
import com.sankuai.waimai.platform.widget.filterbar.view.view.NoScrollListView;
import com.sankuai.waimai.platform.widget.filterbar.view.view.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PoiFilterActivityDialogFragment extends DialogFragment {
    public static ChangeQuickRedirect a;
    private static int j;
    private static int k;
    private static int l;
    private c A;
    private View.OnClickListener B;
    private View.OnClickListener C;
    private View.OnClickListener D;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    List<b.a> f;
    b.a g;
    Set<String> h;
    Map<String, com.sankuai.waimai.platform.widget.filterbar.domain.model.g> i;
    private View m;
    private View n;
    private View o;
    private View p;
    private View q;
    private LinearLayout r;
    private TextView s;
    private boolean t;
    private int u;
    private int v;
    private boolean w;
    private ArrayMap<String, Boolean> x;
    private a y;
    private b z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);

        void b(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(int i);

        void a(String str);

        void a(String str, int i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
        void a(String str, int i, int i2, boolean z);
    }

    public PoiFilterActivityDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7831655e312a0e71f49d889c9cbf4a37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7831655e312a0e71f49d889c9cbf4a37");
            return;
        }
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.t = false;
        this.u = 0;
        this.v = 0;
        this.w = false;
        this.x = new ArrayMap<>();
        this.y = new a() { // from class: com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e6ce8958515172d54d1bcb88e36be31", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e6ce8958515172d54d1bcb88e36be31");
                    return;
                }
                PoiFilterActivityDialogFragment.this.x.put(str, Boolean.TRUE);
                PoiFilterActivityDialogFragment.this.c();
                if (PoiFilterActivityDialogFragment.this.g != null) {
                    PoiFilterActivityDialogFragment.this.g.a(str, true);
                }
            }

            @Override // com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment.a
            public final void b(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cdbfdcf48d6ecb2b763984d26882a11d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cdbfdcf48d6ecb2b763984d26882a11d");
                    return;
                }
                PoiFilterActivityDialogFragment.this.x.remove(str);
                PoiFilterActivityDialogFragment.this.c();
                if (PoiFilterActivityDialogFragment.this.g != null) {
                    PoiFilterActivityDialogFragment.this.g.a(str, false);
                }
            }
        };
        this.z = new b() { // from class: com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment.b
            public final void a(String str, int i) {
                Object[] objArr2 = {str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c7b25655e97eff785068c6f539914c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c7b25655e97eff785068c6f539914c5");
                    return;
                }
                PoiFilterActivityDialogFragment.this.u = i;
                PoiFilterActivityDialogFragment.this.y.a(str);
            }

            @Override // com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment.b
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "755a25a3ca85b64908043d1f055f4ea4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "755a25a3ca85b64908043d1f055f4ea4");
                    return;
                }
                PoiFilterActivityDialogFragment.this.u = 0;
                PoiFilterActivityDialogFragment.this.y.b(str);
            }

            @Override // com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment.b
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4df2244c6cc5f9615b18dfb0980d9c54", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4df2244c6cc5f9615b18dfb0980d9c54");
                } else {
                    PoiFilterActivityDialogFragment.this.u = i;
                }
            }
        };
        this.A = new c() { // from class: com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment.c
            public final void a(String str, int i, int i2, boolean z) {
                Object[] objArr2 = {str, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7945169c7449394a0b6e8ddbf11fde59", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7945169c7449394a0b6e8ddbf11fde59");
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    if (z) {
                        PoiFilterActivityDialogFragment.this.x.put(str, Boolean.TRUE);
                    } else {
                        PoiFilterActivityDialogFragment.this.x.remove(str);
                    }
                    PoiFilterActivityDialogFragment.this.c();
                }
                if (PoiFilterActivityDialogFragment.this.g != null) {
                    PoiFilterActivityDialogFragment.this.g.a(str, i, i2);
                }
            }
        };
        this.B = new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "142e9f62a1b048933b3abe9d53d46e0c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "142e9f62a1b048933b3abe9d53d46e0c");
                } else if (PoiFilterActivityDialogFragment.this.g != null) {
                    PoiFilterActivityDialogFragment.this.g.b();
                }
            }
        };
        this.C = new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0fdb6e762b8b0df9f7064e232214f81f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0fdb6e762b8b0df9f7064e232214f81f");
                    return;
                }
                PoiFilterActivityDialogFragment.this.x.clear();
                PoiFilterActivityDialogFragment.this.c();
                PoiFilterActivityDialogFragment.this.e();
                if (PoiFilterActivityDialogFragment.this.g != null) {
                    PoiFilterActivityDialogFragment.this.g.c();
                }
                if (PoiFilterActivityDialogFragment.this.v == 1) {
                    com.sankuai.waimai.business.search.common.util.h.a(PoiFilterActivityDialogFragment.this.getActivity(), 1, "c_m84bv26", "b_D1QhS", (String) null, (Map<String, Object>) null);
                }
            }
        };
        this.D = new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.global.filterbar.PoiFilterActivityDialogFragment.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33a90eff4f7508b7a8305d13263cd740", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33a90eff4f7508b7a8305d13263cd740");
                } else if (PoiFilterActivityDialogFragment.this.g != null) {
                    PoiFilterActivityDialogFragment.this.g.a(PoiFilterActivityDialogFragment.this, PoiFilterActivityDialogFragment.g(PoiFilterActivityDialogFragment.this));
                    PoiFilterActivityDialogFragment.this.g.a();
                    if (PoiFilterActivityDialogFragment.this.u != 0) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("pricechoice", Integer.valueOf(PoiFilterActivityDialogFragment.this.u));
                        com.sankuai.waimai.business.search.common.util.h.a(PoiFilterActivityDialogFragment.this.getActivity(), 1, "c_m84bv26", "b_waimai_jiagezidingyi_mc", (String) null, hashMap);
                    }
                }
            }
        };
    }

    public static /* synthetic */ ArrayList g(PoiFilterActivityDialogFragment poiFilterActivityDialogFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, poiFilterActivityDialogFragment, changeQuickRedirect, false, "fe224b35d905007dcfe757b77c067c71", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, poiFilterActivityDialogFragment, changeQuickRedirect, false, "fe224b35d905007dcfe757b77c067c71");
        }
        if (poiFilterActivityDialogFragment.x == null || poiFilterActivityDialogFragment.x.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(poiFilterActivityDialogFragment.x.keySet());
        return arrayList;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce09bae9012c00227dc10052a1ef1c28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce09bae9012c00227dc10052a1ef1c28");
            return;
        }
        super.onAttach(activity);
        if (j == 0) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                j = displayMetrics.heightPixels;
            } catch (Exception unused) {
            }
            k = (int) (j * 0.4f);
            l = (int) (j * 0.6f);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc7f54179f18e4ec0c17d99bfd6ff961", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc7f54179f18e4ec0c17d99bfd6ff961");
            return;
        }
        super.onDetach();
        this.g = null;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26faba75a8bc082d973643a34972bfd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26faba75a8bc082d973643a34972bfd4");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd9a5c8a01386d8dfc9939bc2e341a9a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd9a5c8a01386d8dfc9939bc2e341a9a") : layoutInflater.inflate(R.layout.wm_widget_filter_bar_filter_dialog_fragment, (ViewGroup) null);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c07fc48d81aa78b63c7c7ee349f93a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c07fc48d81aa78b63c7c7ee349f93a9");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b092640aff45fec6d968d3cc5a3ab2a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b092640aff45fec6d968d3cc5a3ab2a9");
        } else {
            view.setOnClickListener(this.B);
            this.q = view.findViewById(R.id.block_filter);
            this.q.setOnClickListener(this.B);
            ((DynamicHeightSrollView) view.findViewById(R.id.sroll_container)).setDynamicHeight(l);
            this.o = view.findViewById(R.id.ll_container);
            this.r = (LinearLayout) view.findViewById(R.id.ll_cond_container);
            this.m = view.findViewById(R.id.ll_no_result);
            this.m.getLayoutParams().height = k;
            this.n = view.findViewById(R.id.page_load);
            this.n.getLayoutParams().height = k;
            ((TextView) view.findViewById(R.id.txt_clear_choose)).setOnClickListener(this.C);
            if (this.v == 1) {
                com.sankuai.waimai.business.search.common.util.h.a(getActivity(), 2, "c_m84bv26", "b_24SVi", (String) null, (Map<String, Object>) null);
            }
            this.s = (TextView) view.findViewById(R.id.txt_poi_activity_filter_num);
            view.findViewById(R.id.ll_submit_choose).setOnClickListener(this.D);
            this.p = view.findViewById(R.id.page_error);
            this.p.getLayoutParams().height = k;
            b();
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e10264c56c052532842725cf77223147", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e10264c56c052532842725cf77223147");
            return;
        }
        int size = this.x.size();
        if (size > 0) {
            this.s.setText(String.valueOf(size));
            this.s.setVisibility(0);
            return;
        }
        this.s.setVisibility(8);
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df8594449c03534332744e6e1a79d012", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df8594449c03534332744e6e1a79d012");
        } else if (this.f == null || this.f.isEmpty()) {
        } else {
            j();
            if (this.o != null) {
                c();
                e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76ba9242f1057bbf56407881bddfcfda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76ba9242f1057bbf56407881bddfcfda");
            return;
        }
        this.r.removeAllViewsInLayout();
        for (b.a aVar : this.f) {
            Context context = getContext();
            int i = aVar.d;
            if (i == 0) {
                a(context, aVar, this.r);
            } else if (i == 2) {
                b(context, aVar, this.r);
            } else if (i == 100) {
                c(context, aVar, this.r);
                z = true;
            }
        }
        if (this.t) {
            return;
        }
        this.t = true;
        HashMap hashMap = new HashMap();
        hashMap.put("price_view", z ? "1" : "0");
        com.sankuai.waimai.business.search.common.util.h.a(getContext(), 2, "c_m84bv26", "b_waimai_pricezidingyi_mv", AppUtil.generatePageInfoKey(getContext()), hashMap);
    }

    private void a(Context context, b.a aVar, ViewGroup viewGroup) {
        Object[] objArr = {context, aVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d827bfb0dd2254fa9daa9ca983f8572a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d827bfb0dd2254fa9daa9ca983f8572a");
        } else if (context == null || aVar == null || aVar.c == null || aVar.c.isEmpty()) {
        } else {
            View inflate = View.inflate(context, R.layout.wm_widget_filter_bar_filter_dialog_filter_group_with_title, null);
            TextView textView = (TextView) inflate.findViewById(R.id.txt_choose);
            textView.setText(aVar.a);
            textView.setVisibility(TextUtils.isEmpty(aVar.a) ? 8 : 0);
            a(inflate, context, aVar, viewGroup);
        }
    }

    private void a(View view, Context context, b.a aVar, ViewGroup viewGroup) {
        Object[] objArr = {view, context, aVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55630accd5c414ac350098d326bca80f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55630accd5c414ac350098d326bca80f");
            return;
        }
        GridView gridView = (GridView) view.findViewById(R.id.gv_choose);
        gridView.setSelector(new ColorDrawable(0));
        g gVar = new g(context, aVar, this.y, this.x, false);
        gridView.setNumColumns(4);
        gridView.setAdapter((ListAdapter) gVar);
        viewGroup.addView(view);
    }

    private void b(Context context, b.a aVar, ViewGroup viewGroup) {
        Object[] objArr = {context, aVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "521d62daa48928f613f73c8d1bbf2184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "521d62daa48928f613f73c8d1bbf2184");
        } else if (context == null || aVar == null || aVar.c == null || aVar.c.isEmpty()) {
        } else {
            View inflate = View.inflate(context, R.layout.wm_widget_filter_bar_filter_dialog_filter_slider_group_search, null);
            TextView textView = (TextView) inflate.findViewById(R.id.txt_title);
            if (TextUtils.isEmpty(aVar.a)) {
                textView.setVisibility(8);
            } else {
                textView.setText(aVar.a);
            }
            NoScrollListView noScrollListView = (NoScrollListView) inflate.findViewById(R.id.list_slider_container);
            noScrollListView.setExpanded(true);
            noScrollListView.setDivider(null);
            noScrollListView.setAdapter((ListAdapter) new i(context, aVar, this.A, this.i));
            viewGroup.addView(inflate);
        }
    }

    private void c(Context context, b.a aVar, ViewGroup viewGroup) {
        Object[] objArr = {context, aVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c835d48ee271d631e5580223b9ae335", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c835d48ee271d631e5580223b9ae335");
        } else if (context == null || aVar == null || aVar.c == null || aVar.c.isEmpty()) {
        } else {
            View inflate = View.inflate(context, R.layout.wm_widget_filter_bar_filter_dialog_filter_sg_mix_group, null);
            TextView textView = (TextView) inflate.findViewById(R.id.txt_title);
            if (TextUtils.isEmpty(aVar.a)) {
                textView.setVisibility(8);
            } else {
                textView.setText(aVar.a);
            }
            new h(context, inflate, aVar, this.z, this.x);
            viewGroup.addView(inflate);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "630ab0d4d7d686349fc7687f4442b8fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "630ab0d4d7d686349fc7687f4442b8fe");
        } else {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54c99d9c43628c6d7028f07e32617684", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54c99d9c43628c6d7028f07e32617684");
            return;
        }
        f();
        g();
        h();
        i();
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "658720159b33522d042df9d859d90a65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "658720159b33522d042df9d859d90a65");
        } else if (this.o == null) {
        } else {
            this.o.setVisibility(this.b ? 0 : 8);
            a(this.o);
            a(this.q);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d038fdc3a5a7ef1a1c7fdbeb64f8980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d038fdc3a5a7ef1a1c7fdbeb64f8980");
        } else if (this.n == null) {
        } else {
            this.n.setVisibility(this.c ? 0 : 8);
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6e3c7bf13e375a92575e350777b3e0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6e3c7bf13e375a92575e350777b3e0a");
        } else if (this.m == null) {
        } else {
            this.m.setVisibility(this.d ? 0 : 8);
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dcf32faf5c8c38d3d77e50fbb387a4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dcf32faf5c8c38d3d77e50fbb387a4b");
        } else if (this.p == null) {
        } else {
            this.p.setVisibility(this.e ? 0 : 8);
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d8a63116704917a9ff710928e9e8fff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d8a63116704917a9ff710928e9e8fff");
            return;
        }
        if (this.h != null) {
            for (String str : this.h) {
                if (str != null) {
                    this.x.put(str, Boolean.TRUE);
                }
            }
        }
        if (this.i != null) {
            for (Map.Entry<String, com.sankuai.waimai.platform.widget.filterbar.domain.model.g> entry : this.i.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    com.sankuai.waimai.platform.widget.filterbar.domain.model.g value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && value != null && value.a()) {
                        this.x.put(key, Boolean.TRUE);
                    }
                }
            }
        }
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b197435b7f5f2d3dc5aa607b1197226d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b197435b7f5f2d3dc5aa607b1197226d");
        } else if (!this.w || view == null) {
        } else {
            if (view.getId() == R.id.block_filter) {
                this.q.setVisibility(0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(250L);
                view.setAnimation(alphaAnimation);
                alphaAnimation.start();
            }
            if (view.getId() == R.id.ll_container) {
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
                translateAnimation.setDuration(200L);
                view.setAnimation(translateAnimation);
                translateAnimation.start();
            }
        }
    }
}
