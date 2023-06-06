package com.sankuai.waimai.business.page.home.list.future.filterBar;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.BubbleHistory;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.implement.model.BubbleInfoBean;
import com.sankuai.waimai.platform.widget.filterbar.view.view.a;
import com.sankuai.waimai.platform.widget.filterbar.view.view.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends RecyclerView.a<a> {
    public static ChangeQuickRedirect a;
    private static final int d = g.a(com.meituan.android.singleton.b.a, 82.0f);
    private static final int e = g.a(com.meituan.android.singleton.b.a, 30.0f);
    private static final int f = g.a(com.meituan.android.singleton.b.a, 8.0f);
    public List<b.a.C1086a> b;
    b.c c;
    private Set<String> g;
    private boolean h;
    private com.sankuai.waimai.platform.widget.filterbar.domain.repository.b i;
    private com.sankuai.waimai.rocks.expose.c j;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull a aVar, final int i) {
        BubbleHistory a2;
        final a aVar2 = aVar;
        boolean z = true;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b853e456622504de9fec6fc69c69f273", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b853e456622504de9fec6fc69c69f273");
            return;
        }
        final b.a.C1086a c1086a = this.b.get(i);
        Object[] objArr2 = {c1086a, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "60012920d9434969a435761d6b8c31bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "60012920d9434969a435761d6b8c31bf");
            return;
        }
        boolean a3 = aVar2.a(c1086a.a);
        if (c1086a.g != null && c1086a.g.a) {
            com.sankuai.waimai.platform.widget.filterbar.domain.model.a aVar3 = c1086a.g;
            Object[] objArr3 = {c1086a};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.list.future.filterBar.a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4adcd7d274f933097f29c3eabae084c2", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4adcd7d274f933097f29c3eabae084c2")).booleanValue();
            } else if (c1086a.g == null || !c1086a.g.a || ((a2 = com.sankuai.waimai.business.page.home.list.future.filterBar.a.a(c1086a.a, c1086a.g.b)) != null && a2.d != null && a2.d.a)) {
                z = false;
            }
            aVar3.a = z;
        }
        aVar2.b.a(c1086a, a3, false, (a.InterfaceC1094a) null);
        aVar2.b.a(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.filterBar.c.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JSONArray jSONArray;
                com.sankuai.waimai.platform.widget.filterbar.implement.converter.a aVar4;
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8c142ee792b642bb3e720e5496037a4f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8c142ee792b642bb3e720e5496037a4f");
                    return;
                }
                b.a.C1086a c1086a2 = c1086a;
                Object[] objArr5 = {c1086a2};
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.home.list.future.filterBar.a.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "6c0486868fae6a26525d5231c088a8ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "6c0486868fae6a26525d5231c088a8ba");
                } else if (c1086a2.g != null && c1086a2.g.a) {
                    String str = c1086a2.a;
                    int i2 = c1086a2.g.b;
                    Object[] objArr6 = {str, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.page.home.list.future.filterBar.a.a;
                    if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "8209cf355a56844831b38c5557a12c77", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "8209cf355a56844831b38c5557a12c77");
                    } else {
                        String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "filter_bar_bubble_history_list", "");
                        int i3 = -1;
                        try {
                            if (!TextUtils.isEmpty(b)) {
                                jSONArray = new JSONArray(b);
                            } else {
                                jSONArray = new JSONArray();
                            }
                            int length = jSONArray.length();
                            if (length > 0) {
                                long currentTimeMillis = System.currentTimeMillis();
                                com.sankuai.waimai.platform.widget.filterbar.implement.converter.a aVar5 = new com.sankuai.waimai.platform.widget.filterbar.implement.converter.a();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= length) {
                                        break;
                                    }
                                    BubbleHistory a4 = aVar5.a(com.sankuai.waimai.platform.widget.filterbar.implement.model.a.a(jSONArray.optJSONObject(i4)));
                                    if (a4 != null && a4.a()) {
                                        aVar4 = aVar5;
                                        if (currentTimeMillis - a4.e <= 2592000000L && a4.a(6, str, i2)) {
                                            i3 = i4;
                                            break;
                                        }
                                    } else {
                                        aVar4 = aVar5;
                                    }
                                    i4++;
                                    aVar5 = aVar4;
                                }
                            }
                            if (i3 >= 0) {
                                jSONArray.remove(i3);
                            }
                            com.sankuai.waimai.platform.widget.filterbar.implement.model.a aVar6 = new com.sankuai.waimai.platform.widget.filterbar.implement.model.a();
                            aVar6.b = 6;
                            aVar6.c = str;
                            aVar6.d = new BubbleInfoBean();
                            aVar6.d.isShow = true;
                            aVar6.d.version = i2;
                            aVar6.e = System.currentTimeMillis();
                            jSONArray.put(aVar6.a());
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "filter_bar_bubble_history_list", jSONArray.toString());
                        } catch (Exception unused) {
                        }
                    }
                    com.sankuai.waimai.platform.widget.filterbar.domain.a.a().b();
                    c1086a2.g.a = false;
                }
                a.this.b.a(c1086a.b, false);
                if (c.this.j != null) {
                    c.this.j.b(i);
                }
                if (a.this.a(c1086a.a)) {
                    a.this.b.a(false);
                    if (c.this.c != null) {
                        c.this.c.a(c1086a, false, false, false);
                        return;
                    }
                    return;
                }
                a.this.b.a(true);
                if (c.this.c != null) {
                    c.this.c.a(c1086a, true, false, false);
                }
            }
        });
        if (a3) {
            return;
        }
        if (c.this.h) {
            aVar2.b.a(R.drawable.wm_widget_filter_bar_fastfilter_dialog_card_item_background_home_page_for_float);
        } else {
            aVar2.b.a(R.drawable.wm_widget_filter_bar_fastfilter_dialog_card_item_background_home_page);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71c9266ea164a6b521c01ea39def638d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71c9266ea164a6b521c01ea39def638d");
        }
        com.sankuai.waimai.platform.widget.filterbar.view.view.a aVar = new com.sankuai.waimai.platform.widget.filterbar.view.view.a(viewGroup.getContext());
        View a2 = aVar.a(viewGroup);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(d, e);
        layoutParams.setMarginEnd(f);
        a2.setLayoutParams(layoutParams);
        a2.findViewById(R.id.txt_bg_activity_cond).setLayoutParams(new RelativeLayout.LayoutParams(d, e));
        aVar.a();
        return new a(a2, aVar);
    }

    public c(com.sankuai.waimai.platform.widget.filterbar.domain.repository.b bVar, com.sankuai.waimai.rocks.expose.c cVar) {
        Object[] objArr = {bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7ce05b572ff38fbb1f1cdbb74023789", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7ce05b572ff38fbb1f1cdbb74023789");
            return;
        }
        this.b = new ArrayList();
        this.i = bVar;
        this.j = cVar;
    }

    public final void a(List<b.a.C1086a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f70fb3d53ab4e37b7de203fd9493216c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f70fb3d53ab4e37b7de203fd9493216c");
            return;
        }
        this.b.clear();
        if (list != null && !list.isEmpty()) {
            this.b.addAll(list);
        }
        notifyDataSetChanged();
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "065685e20f26abf0a6d37d7ee7daa902", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "065685e20f26abf0a6d37d7ee7daa902");
        } else if (this.h == z) {
        } else {
            this.h = z;
            notifyDataSetChanged();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31a91cd98596ee8ded9caf095dd2c087", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31a91cd98596ee8ded9caf095dd2c087");
            return;
        }
        this.g = this.i.j();
        notifyDataSetChanged();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cdc036de03e0616b48d3e47566fd9ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cdc036de03e0616b48d3e47566fd9ca")).intValue();
        }
        if (this.b != null) {
            return this.b.size();
        }
        return 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        com.sankuai.waimai.platform.widget.filterbar.view.view.a b;

        public a(View view, com.sankuai.waimai.platform.widget.filterbar.view.view.a aVar) {
            super(view);
            Object[] objArr = {c.this, view, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4238de656af7fd3e3fbce5a9468a3eab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4238de656af7fd3e3fbce5a9468a3eab");
            } else {
                this.b = aVar;
            }
        }

        boolean a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67b6f98d30cded41957bad43c2fa1c53", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67b6f98d30cded41957bad43c2fa1c53")).booleanValue() : c.this.g != null && c.this.g.contains(str);
        }
    }
}
