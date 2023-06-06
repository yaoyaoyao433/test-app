package com.sankuai.waimai.sa.ui.assistant.chat;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.sa.ui.assistant.view.FastReplyView;
import com.sankuai.waimai.sa.ui.assistant.view.FocusNoLayoutManager;
import com.sankuai.waimai.sa.ui.assistant.view.SAChatBlockRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k extends com.sankuai.waimai.sa.ui.assistant.c {
    public static ChangeQuickRedirect c;
    final String d;
    SAChatBlockRecyclerView e;
    View f;
    ViewGroup g;
    ArrayList<Pair<a, com.sankuai.waimai.sa.model.b>> h;
    public m i;
    public com.sankuai.waimai.sa.ui.assistant.adapter.b j;
    LinearLayoutManager k;
    SparseIntArray l;
    com.sankuai.waimai.sa.ui.assistant.a m;
    int n;
    public i o;
    Activity p;
    l q;
    public String r;
    boolean s;
    Runnable t;
    private RecyclerView.k u;
    private Runnable v;

    public k(@NonNull Activity activity, @NonNull com.sankuai.waimai.sa.ui.assistant.a aVar, l lVar, String str) {
        super(activity);
        Object[] objArr = {activity, aVar, lVar, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "351001bf89f3772c5c0be674ed85d9c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "351001bf89f3772c5c0be674ed85d9c8");
            return;
        }
        this.h = new ArrayList<>();
        this.l = new SparseIntArray();
        this.n = com.sankuai.waimai.foundation.utils.g.a(this.y, 32.0f);
        this.r = "";
        this.s = false;
        this.u = new RecyclerView.k() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.k.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e372c6f89c3aa070d88eb5d20fb810a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e372c6f89c3aa070d88eb5d20fb810a");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (k.this.e == null || i != 0 || !k.this.s || k.this.t == null) {
                    return;
                }
                k.this.s = false;
                k.this.e.post(k.this.t);
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92beecb2762833686832e1402776ce2a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92beecb2762833686832e1402776ce2a");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                if (recyclerView.canScrollVertically(1)) {
                    k.this.f.setVisibility(0);
                    return;
                }
                k.this.f.setVisibility(4);
                if (k.this.e == null || !k.this.s || k.this.t == null) {
                    return;
                }
                k.this.s = false;
                k.this.e.post(k.this.t);
            }
        };
        this.v = new Runnable() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.k.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                boolean z = false;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3b0111d8ef12221afb3f535464b565f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3b0111d8ef12221afb3f535464b565f");
                    return;
                }
                com.sankuai.waimai.sa.ui.assistant.adapter.b bVar = k.this.j;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.sa.ui.assistant.adapter.b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "5ffec3546e2d91ccead463304b818078", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "5ffec3546e2d91ccead463304b818078")).booleanValue();
                } else if (bVar.d == bVar.getItemCount() - 1) {
                    z = true;
                }
                if (z) {
                    return;
                }
                k.this.a();
            }
        };
        this.p = activity;
        this.m = aVar;
        this.q = lVar;
        this.d = str;
    }

    public final void a(String str, String str2, Runnable runnable) {
        Object[] objArr = {str, str2, runnable};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d209704f31911852221725b5df4f9eb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d209704f31911852221725b5df4f9eb7");
            return;
        }
        this.s = true;
        this.g.setVisibility(4);
        this.g.postDelayed(new Runnable() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.k.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7879352a08f5a92ab036978053ca198", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7879352a08f5a92ab036978053ca198");
                } else {
                    k.this.g.setVisibility(0);
                }
            }
        }, 500L);
        this.t = runnable;
        this.h.add(new Pair<>(new a(str, str, str2), null));
        this.j.notifyDataSetChanged();
        this.k.startSmoothScroll(new b(this.y, this.j.getItemCount() - 1, 1));
    }

    public final void a(com.sankuai.waimai.sa.model.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f99f39acaf96c04d4cc9a0af021395", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f99f39acaf96c04d4cc9a0af021395");
            return;
        }
        this.g.setVisibility(4);
        this.g.postDelayed(new Runnable() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.k.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ea208443fb0d9eab00ef56e35fe1b0b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ea208443fb0d9eab00ef56e35fe1b0b");
                } else {
                    k.this.g.setVisibility(0);
                }
            }
        }, 500L);
        int i = bVar.b == 0 ? 1 : -1;
        if (this.h.size() > 0 && !TextUtils.isEmpty(bVar.q)) {
            int size = this.h.size() - 1;
            Pair<a, com.sankuai.waimai.sa.model.b> pair = this.h.get(size);
            if (pair.first != null && pair.second == null && !TextUtils.isEmpty(((a) pair.first).b) && ((a) pair.first).b.equals(bVar.q)) {
                this.h.remove(size);
                this.h.add(new Pair<>(pair.first, bVar));
            }
        } else {
            this.h.add(new Pair<>(null, bVar));
        }
        this.j.notifyDataSetChanged();
        if (bVar.b == 0 || this.j.getItemCount() == 1) {
            this.k.startSmoothScroll(new b(this.y, this.j.getItemCount() - 1, i));
        } else {
            this.e.post(new Runnable() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.k.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = 0;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b7d0b7a3de676e2a099bc139d8fb705", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b7d0b7a3de676e2a099bc139d8fb705");
                    } else if (k.this.e.getLayoutManager().findViewByPosition(k.this.j.getItemCount() - 1) == null) {
                    } else {
                        Pair<a, com.sankuai.waimai.sa.model.b> pair2 = k.this.h.get(k.this.h.size() - 1);
                        if (pair2 != null && pair2.first != null && !TextUtils.isEmpty(((a) pair2.first).b)) {
                            i2 = (-com.sankuai.waimai.foundation.utils.g.a(k.this.y, 15.0f)) - k.this.e.getLayoutManager().findViewByPosition(k.this.j.getItemCount() - 1).findViewById(R.id.sa_chat_item_question).getMeasuredHeight();
                        }
                        k.this.k.scrollToPositionWithOffset(k.this.j.getItemCount() - 1, i2);
                    }
                }
            });
        }
    }

    public final void a(com.sankuai.waimai.sa.model.m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d384ee4df0919c60eb694589e59f05e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d384ee4df0919c60eb694589e59f05e1");
            return;
        }
        int size = this.h.size() - 1;
        while (true) {
            if (size >= 0) {
                com.sankuai.waimai.sa.model.b bVar = (com.sankuai.waimai.sa.model.b) this.h.get(size).second;
                if (bVar != null && bVar.a == 8 && bVar.n != null) {
                    bVar.n.e = mVar;
                    break;
                }
                size--;
            } else {
                break;
            }
        }
        this.j.notifyDataSetChanged();
        this.k.startSmoothScroll(new b(this.y, this.j.getItemCount() - 1, 1));
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1de8f01e93159c3166dc8021dee8d111", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1de8f01e93159c3166dc8021dee8d111");
        }
        Object[] objArr2 = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca354996f5693cbe4b9e6f70c55ca2c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca354996f5693cbe4b9e6f70c55ca2c4");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_smart_assistant_chat_first_page_layout, viewGroup, false);
        Object[] objArr3 = {inflate};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.sa.ui.assistant.c.a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6dbdcd41037c89eea8044457ae7a8270", RobustBitConfig.DEFAULT_VALUE)) {
            inflate = (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6dbdcd41037c89eea8044457ae7a8270");
        } else {
            this.b = inflate;
        }
        this.e = (SAChatBlockRecyclerView) inflate.findViewById(R.id.sa_chat_recycler);
        this.f = inflate.findViewById(R.id.shadow_line);
        this.g = (ViewGroup) inflate.findViewById(R.id.shadow_line_container);
        final FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.vertical_multiperson_fastview_container);
        final FastReplyView fastReplyView = (FastReplyView) LayoutInflater.from(this.p).inflate(R.layout.wm_smart_assistant_fast_reply_button, (ViewGroup) null);
        fastReplyView.setSelectedListener(this.q);
        fastReplyView.setPadding(0, com.sankuai.waimai.foundation.utils.g.a(this.p, 10.0f), 0, 0);
        this.e.setClipChildren(false);
        this.k = new FocusNoLayoutManager(this.y);
        this.e.setLayoutManager(this.k);
        com.sankuai.waimai.sa.ui.assistant.view.a aVar = new com.sankuai.waimai.sa.ui.assistant.view.a(this.y, 1, 0, true);
        aVar.b = com.sankuai.waimai.foundation.utils.g.a(f(), 15.0f);
        this.e.addItemDecoration(aVar);
        this.e.addOnScrollListener(this.u);
        this.j = new com.sankuai.waimai.sa.ui.assistant.adapter.b<com.sankuai.waimai.sa.ui.assistant.chat.b>(this.e) { // from class: com.sankuai.waimai.sa.ui.assistant.chat.k.6
            public static ChangeQuickRedirect f;

            @Override // android.support.v7.widget.RecyclerView.a
            public final /* synthetic */ RecyclerView.s onCreateViewHolder(ViewGroup viewGroup2, int i) {
                Object[] objArr4 = {viewGroup2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = f;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c4efdab0f51459a65765389cbd2d7aa3", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.sa.ui.assistant.chat.b) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c4efdab0f51459a65765389cbd2d7aa3") : new d(k.this.p, frameLayout, fastReplyView, (LinearLayout) LayoutInflater.from(k.this.y).inflate(R.layout.wm_smart_assistant_chat_list_item, viewGroup2, false), k.this.e, k.this.m, k.this, k.this.i, k.this.o, k.this.q, k.this.d);
            }

            @Override // com.sankuai.waimai.sa.ui.assistant.adapter.b
            public final void a(com.sankuai.waimai.sa.ui.assistant.chat.b bVar, int i) {
                Object[] objArr4 = {bVar, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = f;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "953a3f2d7e10128d540369c87e65f0ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "953a3f2d7e10128d540369c87e65f0ea");
                } else if (bVar instanceof d) {
                    Pair<a, com.sankuai.waimai.sa.model.b> pair = k.this.h.get(i);
                    ((d) bVar).a(pair, k.this.h.get(k.this.h.size() - 1), k.this.l.get(i), i == getItemCount() - 1);
                    k.this.l.put(i, (pair.first == null ? 0 : 1) + (pair.second == null ? 0 : 2));
                }
            }

            @Override // android.support.v7.widget.RecyclerView.a
            public final int getItemViewType(int i) {
                Object[] objArr4 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = f;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "569dfc9f2b708bada5e7371d6dc19c8e", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "569dfc9f2b708bada5e7371d6dc19c8e")).intValue();
                }
                Pair<a, com.sankuai.waimai.sa.model.b> pair = k.this.h.get(i);
                if (pair.second == null) {
                    return 1;
                }
                switch (((com.sankuai.waimai.sa.model.b) pair.second).a) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                        return ((com.sankuai.waimai.sa.model.b) pair.second).a;
                    case 4:
                    default:
                        return 1;
                }
            }

            @Override // android.support.v7.widget.RecyclerView.a
            public final int getItemCount() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = f;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5a808ce74691bac39937e3ebc88f7815", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5a808ce74691bac39937e3ebc88f7815")).intValue() : k.this.h.size();
            }
        };
        this.j.e = this.o;
        this.e.setAdapter(this.j);
        return inflate;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f7f1970497cfdb2b350055c00a76163", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f7f1970497cfdb2b350055c00a76163");
        } else if (this.j.getItemCount() - 1 < 0) {
        } else {
            this.e.stopScroll();
            this.k.startSmoothScroll(new b(this.y, this.j.getItemCount() - 1, 1) { // from class: com.sankuai.waimai.sa.ui.assistant.chat.k.7
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.ad
                public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb4311e459db3081e64d9cddbc48fa27", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb4311e459db3081e64d9cddbc48fa27")).intValue();
                    }
                    com.sankuai.waimai.sa.ui.assistant.chat.b bVar = (com.sankuai.waimai.sa.ui.assistant.chat.b) k.this.e.getChildViewHolder(k.this.e.getChildAt(k.this.e.getChildCount() - 1));
                    if (bVar.getAdapterPosition() != k.this.j.getItemCount() - 1 || !bVar.c) {
                        return super.calculateDtToFit(i, i2, i3, i4, i5);
                    }
                    return i4 - ((bVar.b + i) + k.this.n);
                }
            });
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daec6534936b5157b77c934593d819c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daec6534936b5157b77c934593d819c7");
        } else if (z) {
            ad.c(this.v);
        } else {
            a();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcc6ad70a5e71322832e7500fef5b5e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcc6ad70a5e71322832e7500fef5b5e4");
            return;
        }
        Iterator<Pair<a, com.sankuai.waimai.sa.model.b>> it = this.h.iterator();
        while (it.hasNext()) {
            Pair<a, com.sankuai.waimai.sa.model.b> next = it.next();
            if (next != null && next.second != null && ((com.sankuai.waimai.sa.model.b) next.second).k != null && ((com.sankuai.waimai.sa.model.b) next.second).k.c == 1) {
                ((com.sankuai.waimai.sa.model.b) next.second).k = null;
                ((com.sankuai.waimai.sa.model.b) next.second).a = 0;
                ((com.sankuai.waimai.sa.model.b) next.second).m = null;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends android.support.v7.widget.ad {
        public static ChangeQuickRedirect c;
        private final int a;
        private final float b;

        public b(Context context, int i, int i2) {
            this(context, i, 1.0f, i2);
            Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a4fe61dffd3ce8c24cf2de7f856eca6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a4fe61dffd3ce8c24cf2de7f856eca6");
            }
        }

        private b(Context context, int i, float f, int i2) {
            super(context);
            Object[] objArr = {context, Integer.valueOf(i), Float.valueOf(1.0f), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85677382bce892c7980bd33b7519c01c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85677382bce892c7980bd33b7519c01c");
                return;
            }
            this.b = 1.0f;
            this.a = i2;
            setTargetPosition(i);
        }

        @Override // android.support.v7.widget.ad
        public int getVerticalSnapPreference() {
            return this.a;
        }

        @Override // android.support.v7.widget.ad
        public int calculateTimeForScrolling(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = c;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "478c9975bc2d0f4e6f638376cc471de6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "478c9975bc2d0f4e6f638376cc471de6")).intValue() : (int) (super.calculateTimeForScrolling(i) * this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }
}
