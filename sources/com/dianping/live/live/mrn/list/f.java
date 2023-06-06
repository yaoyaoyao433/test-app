package com.dianping.live.live.mrn.list;

import android.content.Context;
import android.os.Handler;
import android.support.constraint.R;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.aj;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.dianping.live.live.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class f extends RecyclerView.a<b> {
    public static ChangeQuickRedirect c;
    private final FragmentManager a;
    private RecyclerView.k b;
    public c d;
    protected List<c> e;
    aj f;
    public int g;
    protected Context h;
    Handler i;
    Runnable j;
    public boolean k;
    public long l;
    a m;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(int i);

        void a(long j, int i, String str, String str2, String str3);

        void a(c cVar);

        void b();

        boolean c();
    }

    public abstract c a(int i);

    @Override // android.support.v7.widget.RecyclerView.a
    public abstract int getItemViewType(int i);

    public f(FragmentManager fragmentManager, Context context) {
        Object[] objArr = {fragmentManager, context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "149cfcf351589886ff66c1db0af5bd90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "149cfcf351589886ff66c1db0af5bd90");
            return;
        }
        this.d = null;
        this.e = new ArrayList();
        this.g = 0;
        this.k = false;
        this.l = 0L;
        this.b = new RecyclerView.k() { // from class: com.dianping.live.live.mrn.list.f.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                View a2;
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a44acb9ca23e907b2f357ef171c138a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a44acb9ca23e907b2f357ef171c138a");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    f.this.m.b();
                }
                if (f.this.f == null || (a2 = f.this.f.a(recyclerView.getLayoutManager())) == null) {
                    return;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (i != 0 || layoutManager == null || a2 == null) {
                    return;
                }
                int position = layoutManager.getPosition(a2);
                f.this.m.a(position);
                if (f.this.g != position || (f.this.d != null && f.this.d.getMRNFragment() == null)) {
                    String str = i.g;
                    i.a(str, "测试只有声音：开始切换" + f.this.g + ":::" + position);
                    f.this.a((b) recyclerView.getChildViewHolder(a2), position);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8609134b7b0e3c65fdd3b634bc67336a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8609134b7b0e3c65fdd3b634bc67336a");
                } else {
                    super.onScrolled(recyclerView, i, i2);
                }
            }
        };
        this.a = fragmentManager;
        this.h = context;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    /* renamed from: a */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d37ee8eb925c9ff04a59f1fa260beab", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d37ee8eb925c9ff04a59f1fa260beab");
        }
        String str = i.g;
        i.a(str, "onCreateViewHolder called, viewTpe " + i);
        if (i == -1) {
            View inflate = LayoutInflater.from(this.h).inflate(R.layout.mlive_list_footer, (ViewGroup) null);
            inflate.setLayoutParams(new LinearLayout.LayoutParams(viewGroup.getWidth(), 200));
            return new b(inflate);
        }
        MLiveListRecyclerView mLiveListRecyclerView = (MLiveListRecyclerView) viewGroup;
        if (this.f == null) {
            this.f = new aj();
            mLiveListRecyclerView.addOnScrollListener(this.b);
            this.f.a(mLiveListRecyclerView);
        }
        return new b(new com.dianping.live.live.mrn.list.a(mLiveListRecyclerView, i));
    }

    @Override // android.support.v7.widget.RecyclerView.a
    /* renamed from: b */
    public void onBindViewHolder(b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09637ab8dd62f0c8b7620deb20d3bb99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09637ab8dd62f0c8b7620deb20d3bb99");
            return;
        }
        String str = i.g;
        i.a(str, "onBindViewHolder called, position " + i);
        if (getItemViewType(i) == -1) {
            return;
        }
        c a2 = a(bVar.b, bVar.getAdapterPosition(), getItemViewType(bVar.getAdapterPosition()));
        if (this.e.contains(a2)) {
            return;
        }
        this.e.add(a2);
    }

    public void a(b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bb0e70e9b6593f02aa5a452b6e78f14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bb0e70e9b6593f02aa5a452b6e78f14");
            return;
        }
        String str = i.g;
        i.a(str, "测试只有声音：setPrimaryItem0：" + i);
        if (this.i != null) {
            this.i.removeCallbacks(this.j);
            this.i = null;
            this.j = null;
        }
        c cVar = bVar.b.b;
        long j = 300;
        if (this.d != null && this.d.j && cVar != this.d) {
            String str2 = i.g;
            i.a(str2, "测试只有声音：checkCurrentDetached+set之前未销毁:" + this.g);
            this.d.c(this.g);
            j = 600;
        }
        int i2 = i < this.g ? 1 : 0;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - this.l;
        this.l = currentTimeMillis;
        if (this.d != null) {
            this.m.a(j2, i2, this.d.getLiveStatus(), this.d.getLiveId(), this.d.getEventTracking());
        }
        this.d = cVar;
        this.m.a(this.d);
        this.g = i;
        if (this.g >= getItemCount() - 2) {
            this.m.a();
        }
        if (this.i == null) {
            this.i = new Handler();
        }
        this.j = new Runnable() { // from class: com.dianping.live.live.mrn.list.f.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd7be529bd310268b7e51c30dcd002e9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd7be529bd310268b7e51c30dcd002e9");
                    return;
                }
                String str3 = i.g;
                i.a(str3, "测试只有声音：setPrimaryItem1：" + f.this.g);
                if (f.this.d != null) {
                    c cVar2 = f.this.d;
                    int i3 = f.this.g;
                    Object[] objArr3 = {Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "ffa198d96cfe99a39b8b9c69d227c6b8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "ffa198d96cfe99a39b8b9c69d227c6b8");
                    } else {
                        String str4 = cVar2.b;
                        i.a(str4, "fragmentVisible called: " + i3 + cVar2.n);
                        if (cVar2.g != null && cVar2.l && !cVar2.g.d) {
                            cVar2.g.c(false);
                        }
                        cVar2.a(i3);
                    }
                }
                if (f.this.i != null) {
                    f.this.i.removeCallbacks(f.this.j);
                    f.this.i = null;
                    f.this.j = null;
                }
            }
        };
        this.i.postDelayed(this.j, j);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    /* renamed from: c */
    public void onViewAttachedToWindow(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "418039a8035ee40af933a4fef51e41e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "418039a8035ee40af933a4fef51e41e6");
            return;
        }
        String str = i.g;
        i.a(str, "onViewAttachedToWindow called, viewType " + bVar.getItemViewType());
        super.onViewAttachedToWindow(bVar);
        if (getItemViewType(bVar.getAdapterPosition()) == -1) {
            return;
        }
        a(bVar.b, bVar.getAdapterPosition(), getItemViewType(bVar.getAdapterPosition())).b(bVar.getAdapterPosition());
        if (this.k) {
            a(bVar, bVar.getAdapterPosition());
            this.m.a(bVar.getAdapterPosition());
            this.k = false;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    /* renamed from: b */
    public void onViewDetachedFromWindow(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d5fb6aa0b7637041b5d97950cdf54f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d5fb6aa0b7637041b5d97950cdf54f3");
            return;
        }
        String str = i.g;
        i.a(str, "onViewDetachedFromWindow called, viewType " + bVar.getItemViewType());
        super.onViewDetachedFromWindow(bVar);
        if (bVar == null || bVar.b == null || bVar.b.b == null) {
            return;
        }
        c cVar = bVar.b.b;
        String str2 = i.g;
        i.a(str2, "测试只有声音：onViewDetachedFromWindow：" + bVar.getAdapterPosition());
        cVar.c(bVar.getAdapterPosition());
    }

    @Override // android.support.v7.widget.RecyclerView.a
    /* renamed from: a */
    public void onViewRecycled(b bVar) {
        c cVar;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7e17008a5b8cfd64fffcbd17d4f1e1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7e17008a5b8cfd64fffcbd17d4f1e1d");
            return;
        }
        String str = i.g;
        i.a(str, "onViewRecycled called, viewType " + bVar.getItemViewType());
        if (bVar.b == null || (cVar = bVar.b.b) == null) {
            return;
        }
        this.e.remove(cVar);
        com.dianping.live.live.mrn.list.a aVar = bVar.b;
        Object[] objArr2 = {Integer.valueOf(bVar.getAdapterPosition())};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.live.live.mrn.list.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0a5ebb2b16e833de49a0a896848bf54f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0a5ebb2b16e833de49a0a896848bf54f");
            return;
        }
        if (aVar.b != null) {
            aVar.b.e();
            aVar.b = null;
        }
        aVar.c.removeAllViews();
    }

    public void a(a aVar) {
        this.m = aVar;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d64abeb60778a69f6f788ecd454f17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d64abeb60778a69f6f788ecd454f17");
        } else {
            this.m.b();
        }
    }

    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94dbb3a13e024c3e6cf0b4f9b1f1fb03", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94dbb3a13e024c3e6cf0b4f9b1f1fb03")).booleanValue() : this.m.c();
    }

    public c a(com.dianping.live.live.mrn.list.a aVar, int i, int i2) {
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a6133f47c3c6050770c5dd70441a5f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a6133f47c3c6050770c5dd70441a5f9");
        }
        c cVar = aVar.b;
        if (cVar == null) {
            cVar = a(i);
            Object[] objArr2 = {cVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.live.live.mrn.list.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "bffb53c3399c8c478f60c5790e08c32f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "bffb53c3399c8c478f60c5790e08c32f");
            } else {
                aVar.b = cVar;
                aVar.c.addView(cVar);
            }
        }
        if (this.d == null) {
            this.d = cVar;
            this.m.a(this.d);
        }
        return cVar;
    }
}
