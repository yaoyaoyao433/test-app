package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.checkbox.RooCheckBox;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.SubmitQuestionBean;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends RecyclerView.a<RecyclerView.s> {
    public static ChangeQuickRedirect a;
    Map<String, String> b;
    Set<Integer> c;
    String d;
    Map<String, String> e;
    Gson f;
    private Map<String, String> g;
    private Set<String> h;
    private int i;
    private long j;
    private int k;
    private boolean l;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cad5662462d3ea2c1cda30dc4c0489b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cad5662462d3ea2c1cda30dc4c0489b");
            return;
        }
        this.c = new HashSet();
        this.e = new HashMap();
        this.f = new Gson();
    }

    public final void a(Map<String, String> map, Map<String, String> map2, int i, long j, String str, int i2, boolean z) {
        Object[] objArr = {map, map2, 2, new Long(j), str, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e6ee9f5759118f895e18dfa01a8f0ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e6ee9f5759118f895e18dfa01a8f0ed");
            return;
        }
        this.d = str;
        this.l = z;
        this.k = i2;
        this.i = 2;
        this.g = map;
        this.b = map2;
        this.j = j;
        if (this.g != null) {
            this.h = this.g.keySet();
        }
        if (z) {
            this.e.clear();
            this.c.clear();
            com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().d(a());
        }
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        return this.i;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final RecyclerView.s onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66795ee604db29989eb53faa89631298", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66795ee604db29989eb53faa89631298");
        }
        if (i == 2) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_page_home_feedback_checkbox_item, viewGroup, false));
        }
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_page_home_feedback_checkbox_item, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(@NonNull RecyclerView.s sVar, @SuppressLint({"RecyclerView"}) final int i) {
        SubmitQuestionBean c;
        Map<String, String> answerToMap;
        Map map;
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e6787f00f5fd56688fd277aa8e8efc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e6787f00f5fd56688fd277aa8e8efc3");
        } else if (this.h == null || this.h.size() <= 0) {
        } else {
            final String a2 = a(i);
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            final String str = this.g.get(a2);
            if (sVar instanceof a) {
                a aVar = (a) sVar;
                aVar.a.setText(str);
                aVar.a.setChecked(this.c.contains(Integer.valueOf(i)));
                if (com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().b && !this.l && (c = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().c(a())) != null && (answerToMap = c.answerToMap()) != null && answerToMap.containsKey(this.d) && (map = (Map) this.f.fromJson(answerToMap.get(this.d), (Class<Object>) Map.class)) != null && map.containsKey(a2)) {
                    this.c.add(Integer.valueOf(i));
                    aVar.a.setChecked(true);
                }
                aVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0547d8911e6a22893c68acc296ff0514", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0547d8911e6a22893c68acc296ff0514");
                            return;
                        }
                        if (b.this.c.contains(Integer.valueOf(i))) {
                            b.this.c.remove(Integer.valueOf(i));
                            b.this.e.remove(a2);
                            com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().a(b.this.a(), b.this.d, (b.this.e == null || b.this.e.size() <= 0) ? "" : b.this.f.toJson(b.this.e), b.this.b.get(a2), "", null);
                        } else {
                            b.this.e.put(a2, str);
                            com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().a(b.this.a(), b.this.d, b.this.f.toJson(b.this.e), b.this.b.get(a2), "", null);
                            b.this.c.add(Integer.valueOf(i));
                        }
                        b.this.notifyDataSetChanged();
                    }
                });
            }
        }
    }

    String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7754ba810d3fbd7016abe77b6ad9be2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7754ba810d3fbd7016abe77b6ad9be2");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.j);
        sb.append(this.k);
        return sb.toString();
    }

    private String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6b4024a35e65702fdd9f577f3f785e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6b4024a35e65702fdd9f577f3f785e4");
        }
        Iterator<String> it = this.h.iterator();
        for (int i2 = 0; i2 < i; i2++) {
            if (it.hasNext()) {
                it.next();
            }
        }
        return it.hasNext() ? it.next() : "";
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2094d8ffd22bf166a1ea2392fc26591c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2094d8ffd22bf166a1ea2392fc26591c")).intValue();
        }
        if (this.h == null) {
            return 0;
        }
        return this.h.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends RecyclerView.s {
        public RooCheckBox a;
        public LinearLayout b;

        public a(@NonNull View view) {
            super(view);
            this.a = (RooCheckBox) view.findViewById(R.id.cb_item);
            this.b = (LinearLayout) view.findViewById(R.id.ll_checkbox);
        }
    }
}
