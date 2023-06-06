package com.sankuai.waimai.platform.widget.filterbar.view.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v4.app.DialogFragment;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.view.view.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiFilterActivityDialogFragmentHome extends DialogFragment {
    public static ChangeQuickRedirect a;
    private static int g;
    private static int h;
    private static int i;
    private View.OnClickListener A;
    private View.OnClickListener B;
    private View.OnClickListener C;
    public String b;
    public List<b.a> c;
    public b.a d;
    public Set<String> e;
    public Map<String, com.sankuai.waimai.platform.widget.filterbar.domain.model.g> f;
    private View j;
    private View k;
    private View l;
    private View m;
    private View n;
    private DynamicHeightSrollView o;
    private LinearLayout p;
    private TextView q;
    private TextView r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private ArrayMap<String, Boolean> x;
    private b y;
    private c z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(Boolean bool);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(String str);

        void b(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a(String str, int i, int i2, boolean z);
    }

    public PoiFilterActivityDialogFragmentHome() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f522eb2e98396d284d06812ea7bf38c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f522eb2e98396d284d06812ea7bf38c4");
            return;
        }
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = 0;
        this.x = new ArrayMap<>();
        this.y = new b() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterActivityDialogFragmentHome.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterActivityDialogFragmentHome.b
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bfae275eb2be018f5a2d0227b52cdfb9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bfae275eb2be018f5a2d0227b52cdfb9");
                    return;
                }
                PoiFilterActivityDialogFragmentHome.this.x.put(str, Boolean.TRUE);
                PoiFilterActivityDialogFragmentHome.this.c();
                if (PoiFilterActivityDialogFragmentHome.this.d != null) {
                    PoiFilterActivityDialogFragmentHome.this.d.a(str, true);
                }
            }

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterActivityDialogFragmentHome.b
            public final void b(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1203f2570c61d1571e3da7c1dacbb65", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1203f2570c61d1571e3da7c1dacbb65");
                    return;
                }
                PoiFilterActivityDialogFragmentHome.this.x.remove(str);
                PoiFilterActivityDialogFragmentHome.this.c();
                if (PoiFilterActivityDialogFragmentHome.this.d != null) {
                    PoiFilterActivityDialogFragmentHome.this.d.a(str, false);
                }
            }
        };
        this.z = new c() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterActivityDialogFragmentHome.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterActivityDialogFragmentHome.c
            public final void a(String str, int i2, int i3, boolean z) {
                Object[] objArr2 = {str, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16efaef747f768a4a756c8ce6a386ba9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16efaef747f768a4a756c8ce6a386ba9");
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    if (z) {
                        PoiFilterActivityDialogFragmentHome.this.x.put(str, Boolean.TRUE);
                    } else {
                        PoiFilterActivityDialogFragmentHome.this.x.remove(str);
                    }
                    PoiFilterActivityDialogFragmentHome.this.c();
                }
                if (PoiFilterActivityDialogFragmentHome.this.d != null) {
                    PoiFilterActivityDialogFragmentHome.this.d.a(str, i2, i3);
                }
            }
        };
        this.A = new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterActivityDialogFragmentHome.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5a12dac6c9a2f0a6a59c65480e7d83f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5a12dac6c9a2f0a6a59c65480e7d83f");
                } else if (PoiFilterActivityDialogFragmentHome.this.d != null) {
                    PoiFilterActivityDialogFragmentHome.this.d.b();
                }
            }
        };
        this.B = new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterActivityDialogFragmentHome.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d592df48614f516c977a357de89b01bd", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d592df48614f516c977a357de89b01bd");
                    return;
                }
                PoiFilterActivityDialogFragmentHome.this.x.clear();
                PoiFilterActivityDialogFragmentHome.this.c();
                PoiFilterActivityDialogFragmentHome.this.e();
                if (PoiFilterActivityDialogFragmentHome.this.d != null) {
                    PoiFilterActivityDialogFragmentHome.this.d.c();
                }
                if (PoiFilterActivityDialogFragmentHome.this.w == 1) {
                    JudasManualManager.a a2 = JudasManualManager.a("b_D1QhS");
                    a2.b = PoiFilterActivityDialogFragmentHome.this.b;
                    a2.a("c_m84bv26").a();
                }
            }
        };
        this.C = new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterActivityDialogFragmentHome.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0496ea83fb21aa5f92339d03510a50c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0496ea83fb21aa5f92339d03510a50c");
                } else if (PoiFilterActivityDialogFragmentHome.this.d != null) {
                    PoiFilterActivityDialogFragmentHome.this.d.a(PoiFilterActivityDialogFragmentHome.this, PoiFilterActivityDialogFragmentHome.g(PoiFilterActivityDialogFragmentHome.this));
                    PoiFilterActivityDialogFragmentHome.this.d.a();
                }
            }
        };
    }

    public static /* synthetic */ ArrayList g(PoiFilterActivityDialogFragmentHome poiFilterActivityDialogFragmentHome) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, poiFilterActivityDialogFragmentHome, changeQuickRedirect, false, "aeaf5f4276d1bcf495a7d3cc2f807739", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, poiFilterActivityDialogFragmentHome, changeQuickRedirect, false, "aeaf5f4276d1bcf495a7d3cc2f807739");
        }
        if (poiFilterActivityDialogFragmentHome.x == null || poiFilterActivityDialogFragmentHome.x.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(poiFilterActivityDialogFragmentHome.x.keySet());
        return arrayList;
    }

    public static PoiFilterActivityDialogFragmentHome a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfbec872bf3ff1068eb008c8e08a09cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiFilterActivityDialogFragmentHome) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfbec872bf3ff1068eb008c8e08a09cb");
        }
        PoiFilterActivityDialogFragmentHome poiFilterActivityDialogFragmentHome = new PoiFilterActivityDialogFragmentHome();
        Bundle bundle = new Bundle();
        bundle.putInt("filterDialogType", i2);
        poiFilterActivityDialogFragmentHome.setArguments(bundle);
        return poiFilterActivityDialogFragmentHome;
    }

    private int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "652f253a9e5d70c1c5420145d25f4725", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "652f253a9e5d70c1c5420145d25f4725")).intValue();
        }
        if (getArguments() == null) {
            return 0;
        }
        return getArguments().getInt("filterDialogType", 0);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19de2fa43f80de464463ae1c165ceaad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19de2fa43f80de464463ae1c165ceaad");
            return;
        }
        super.onAttach(activity);
        if (g == 0) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                g = displayMetrics.heightPixels;
            } catch (Exception unused) {
            }
            h = (int) (g * 0.4f);
            i = (int) (g * 0.5f);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d4cdb0850abce518730e46a9f32cc04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d4cdb0850abce518730e46a9f32cc04");
            return;
        }
        super.onDetach();
        this.d = null;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c81a51f27ecb259d08fae49c8bf17ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c81a51f27ecb259d08fae49c8bf17ae");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "382f07612da7a164f38b6bc6f924daf9", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "382f07612da7a164f38b6bc6f924daf9") : layoutInflater.inflate(R.layout.wm_widget_filter_bar_filter_dialog_fragment_home, (ViewGroup) null);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e78d6dce89285c8b09e2993dbdf1aec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e78d6dce89285c8b09e2993dbdf1aec");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84f21e7f3c44b70ee166f02cf4cabcd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84f21e7f3c44b70ee166f02cf4cabcd2");
        } else {
            view.setOnClickListener(this.A);
            this.n = view.findViewById(R.id.block_filter);
            this.n.setOnClickListener(this.A);
            this.o = (DynamicHeightSrollView) view.findViewById(R.id.sroll_container);
            this.o.setDynamicHeight(i);
            this.l = view.findViewById(R.id.ll_container);
            this.p = (LinearLayout) view.findViewById(R.id.ll_cond_container);
            this.j = view.findViewById(R.id.ll_no_result);
            this.j.getLayoutParams().height = h;
            this.k = view.findViewById(R.id.page_load);
            this.k.getLayoutParams().height = h;
            ((TextView) view.findViewById(R.id.txt_clear_choose)).setOnClickListener(this.B);
            if (this.w == 1) {
                JudasManualManager.a a2 = JudasManualManager.b("b_24SVi").a("c_m84bv26");
                a2.b = this.b;
                a2.a();
            }
            this.q = (TextView) view.findViewById(R.id.txt_poi_activity_filter_num);
            this.r = (TextView) view.findViewById(R.id.txt_poi_activity_finish);
            this.q.getPaint().setFakeBoldText(true);
            this.r.getPaint().setFakeBoldText(true);
            view.findViewById(R.id.ll_submit_choose).setOnClickListener(this.C);
            this.m = view.findViewById(R.id.page_error);
            this.m.getLayoutParams().height = h;
            f();
        }
        d();
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97dc592230373b456c04d59799d9921c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97dc592230373b456c04d59799d9921c");
            return;
        }
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        this.x.clear();
        if (this.o != null) {
            this.o.smoothScrollTo(0, 0);
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad659f7d7d9c90700715f0f22c95998f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad659f7d7d9c90700715f0f22c95998f");
            return;
        }
        int size = this.x.size();
        if (size > 0) {
            TextView textView = this.q;
            textView.setText("(已选" + String.valueOf(size) + CommonConstant.Symbol.BRACKET_RIGHT);
            this.q.setVisibility(0);
            return;
        }
        this.q.setVisibility(8);
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6d5a1ef78194d39d1bf88594ec08f02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6d5a1ef78194d39d1bf88594ec08f02");
        } else if (this.c == null || this.c.isEmpty()) {
        } else {
            k();
            if (this.l != null) {
                c();
                e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c36517efe004b1035cff36debb01abfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c36517efe004b1035cff36debb01abfd");
            return;
        }
        this.p.removeAllViewsInLayout();
        for (b.a aVar : this.c) {
            Context context = getContext();
            int i2 = aVar.d;
            if (i2 == 0) {
                a(context, aVar, this.p);
            } else if (i2 == 2) {
                b(context, aVar, this.p);
            }
        }
    }

    private void a(Context context, b.a aVar, ViewGroup viewGroup) {
        int i2 = 0;
        Object[] objArr = {context, aVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "580090ede552637b552bab6a6228bb7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "580090ede552637b552bab6a6228bb7c");
        } else if (context == null || aVar == null || aVar.c == null || aVar.c.isEmpty()) {
        } else {
            View inflate = View.inflate(context, R.layout.wm_widget_filter_bar_filter_dialog_filter_group_with_title_home, null);
            TextView textView = (TextView) inflate.findViewById(R.id.txt_choose);
            textView.getPaint().setFakeBoldText(true);
            textView.setText(aVar.a);
            textView.setVisibility((b() == 1 || TextUtils.isEmpty(aVar.a)) ? 8 : 8);
            a(inflate, context, aVar, viewGroup);
            if (viewGroup == null || viewGroup.getChildCount() != 1) {
                return;
            }
            textView.sendAccessibilityEvent(128);
        }
    }

    private void a(View view, Context context, b.a aVar, ViewGroup viewGroup) {
        Object[] objArr = {view, context, aVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4828684dd0bcc230624549ace411a4d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4828684dd0bcc230624549ace411a4d2");
        } else if (aVar == null || aVar.c == null) {
        } else {
            TextView textView = (TextView) view.findViewById(R.id.txt_expand);
            int i2 = com.sankuai.waimai.platform.b.A().l() >= 720 ? 4 : 3;
            boolean z = b() == 0 && aVar.c.size() > i2 * 2;
            int size = z ? i2 * 2 : aVar.c.size();
            GridView gridView = (GridView) view.findViewById(R.id.gv_choose);
            gridView.setSelector(new ColorDrawable(0));
            final d dVar = new d(context, aVar, this.y, this.x, size);
            gridView.setNumColumns(i2);
            gridView.setAdapter((ListAdapter) dVar);
            viewGroup.addView(view);
            a(textView, z, new a() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterActivityDialogFragmentHome.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterActivityDialogFragmentHome.a
                public final void a(Boolean bool) {
                    Object[] objArr2 = {bool};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03994fbf2e33eab63c1b7d77f03c0516", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03994fbf2e33eab63c1b7d77f03c0516");
                        return;
                    }
                    d dVar2 = dVar;
                    boolean booleanValue = bool.booleanValue();
                    Object[] objArr3 = {Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "76dbc0e45ee363621b17928aea150ec8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "76dbc0e45ee363621b17928aea150ec8");
                        return;
                    }
                    dVar2.b = booleanValue;
                    dVar2.notifyDataSetChanged();
                }
            });
        }
    }

    private void a(final TextView textView, boolean z, final a aVar) {
        Object[] objArr = {textView, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5471bd1783a4123c4cd316dfc11d5400", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5471bd1783a4123c4cd316dfc11d5400");
        } else if (!z) {
            textView.setVisibility(8);
        } else {
            textView.setText("展开");
            textView.setTag(Boolean.FALSE);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, getResources().getDrawable(R.drawable.wm_widget_filter_bar_tab_icon_sort_drop_down_home), (Drawable) null);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterActivityDialogFragmentHome.7
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e75165f75b2958849a83da858b4e200", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e75165f75b2958849a83da858b4e200");
                        return;
                    }
                    Object tag = textView.getTag();
                    if (tag instanceof Boolean) {
                        Boolean valueOf = Boolean.valueOf(!((Boolean) tag).booleanValue());
                        if (valueOf.booleanValue()) {
                            textView.setText("收起");
                            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, PoiFilterActivityDialogFragmentHome.this.getResources().getDrawable(R.drawable.wm_widget_filter_bar_tab_icon_sort_drop_up_home), (Drawable) null);
                        } else {
                            textView.setText("展开");
                            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, PoiFilterActivityDialogFragmentHome.this.getResources().getDrawable(R.drawable.wm_widget_filter_bar_tab_icon_sort_drop_down_home), (Drawable) null);
                        }
                        if (aVar != null) {
                            aVar.a(valueOf);
                        }
                        textView.setTag(valueOf);
                        new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.PoiFilterActivityDialogFragmentHome.7.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0ae789378151c5cea50e37f7d0e2251e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0ae789378151c5cea50e37f7d0e2251e");
                                } else {
                                    PoiFilterActivityDialogFragmentHome.this.o.smoothScrollTo(0, ((ViewGroup) textView.getParent().getParent()).getTop());
                                }
                            }
                        }, 20L);
                    }
                }
            });
        }
    }

    private void b(Context context, b.a aVar, ViewGroup viewGroup) {
        Object[] objArr = {context, aVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff6a6351768cf5f589b6ae088d3dbfdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff6a6351768cf5f589b6ae088d3dbfdf");
        } else if (context == null || aVar == null || aVar.c == null || aVar.c.isEmpty()) {
        } else {
            View inflate = View.inflate(context, R.layout.wm_widget_filter_bar_filter_dialog_filter_slider_group, null);
            TextView textView = (TextView) inflate.findViewById(R.id.txt_title);
            if (b() == 1 || TextUtils.isEmpty(aVar.a)) {
                textView.setVisibility(8);
            } else {
                textView.setText(aVar.a);
            }
            NoScrollListView noScrollListView = (NoScrollListView) inflate.findViewById(R.id.list_slider_container);
            noScrollListView.setExpanded(true);
            noScrollListView.setDivider(null);
            noScrollListView.setAdapter((ListAdapter) new f(context, aVar, this.z, this.f));
            viewGroup.addView(inflate);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0760abb1fde8d3c199588cdc9b5be5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0760abb1fde8d3c199588cdc9b5be5e");
        } else {
            d();
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05505c0616a5764afe19e83a2cdb0f78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05505c0616a5764afe19e83a2cdb0f78");
            return;
        }
        this.t = z;
        if (z) {
            this.s = false;
            this.v = false;
            this.u = false;
        }
        f();
    }

    public final void b(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40e751b6f8d8fcb3822ee801b45f7361", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40e751b6f8d8fcb3822ee801b45f7361");
            return;
        }
        this.s = true;
        this.v = false;
        this.t = false;
        this.u = false;
        f();
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f57238465f590c71f12fdd7d36c40eae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f57238465f590c71f12fdd7d36c40eae");
            return;
        }
        this.u = z;
        if (z) {
            this.s = false;
            this.v = false;
            this.t = false;
        }
        f();
    }

    public final void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d60f4fff768b62edd714da18d5d512ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d60f4fff768b62edd714da18d5d512ea");
            return;
        }
        this.v = z;
        if (z) {
            this.s = false;
            this.t = false;
            this.u = false;
        }
        f();
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d174910cd380a9d716756fb3bb25218", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d174910cd380a9d716756fb3bb25218");
            return;
        }
        g();
        h();
        i();
        j();
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afb44dc2bd06ffa92af403361a5981fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afb44dc2bd06ffa92af403361a5981fd");
        } else if (this.l == null) {
        } else {
            this.l.setVisibility(this.s ? 0 : 8);
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ed482882d2ce027a6e1d6f8ff6b5c21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ed482882d2ce027a6e1d6f8ff6b5c21");
        } else if (this.k == null) {
        } else {
            this.k.setVisibility(this.t ? 0 : 8);
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38b02e90b042def09bcfb842c0becd87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38b02e90b042def09bcfb842c0becd87");
        } else if (this.j == null) {
        } else {
            this.j.setVisibility(this.u ? 0 : 8);
        }
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65321f4a7607e90f809d0ba0050b2562", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65321f4a7607e90f809d0ba0050b2562");
        } else if (this.m == null) {
        } else {
            this.m.setVisibility(this.v ? 0 : 8);
        }
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e318619a76528fae454f0dda4cbfb63a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e318619a76528fae454f0dda4cbfb63a");
            return;
        }
        this.x.clear();
        if (this.e != null) {
            for (String str : this.e) {
                if (str != null) {
                    this.x.put(str, Boolean.TRUE);
                }
            }
        }
        if (this.f != null) {
            for (Map.Entry<String, com.sankuai.waimai.platform.widget.filterbar.domain.model.g> entry : this.f.entrySet()) {
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
}
