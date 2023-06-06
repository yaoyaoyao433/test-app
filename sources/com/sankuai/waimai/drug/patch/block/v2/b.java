package com.sankuai.waimai.drug.patch.block.v2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public a b;
    public RecyclerView c;
    public final g d;
    public TextView e;
    private boolean f;

    public b(@NonNull @NotNull Context context, g gVar) {
        super(context);
        Object[] objArr = {context, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a95e3f23bbdcdfaf1bc04578aabe8ff6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a95e3f23bbdcdfaf1bc04578aabe8ff6");
            return;
        }
        this.f = true;
        this.d = gVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7241588755c0efb0f9de7d865e2d8157", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7241588755c0efb0f9de7d865e2d8157") : layoutInflater.inflate(R.layout.wm_drug_shopcart_patchwork_pinned_layout, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6510e29928305115d6884e9965a77bbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6510e29928305115d6884e9965a77bbc");
            return;
        }
        View view = this.mView;
        this.b = new a(this.d);
        this.c = (RecyclerView) view.findViewById(R.id.spus_interval_view);
        this.e = (TextView) view.findViewById(R.id.title);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        linearLayoutManager.setOrientation(0);
        this.c.setLayoutManager(linearLayoutManager);
        this.c.setAdapter(this.b);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29ba19ff25904199ea9ebfa5f596d1ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29ba19ff25904199ea9ebfa5f596d1ab");
        } else if (this.f != z) {
            this.f = z;
            for (T t : this.b.f) {
                t.d = !z ? 1 : 0;
            }
            this.mView.setBackgroundColor(this.f ? ViewCompat.MEASURED_SIZE_MASK : -1);
            this.b.notifyDataSetChanged();
        }
    }

    public final com.sankuai.waimai.drug.model.c a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23b69de8fc9433ebb33f7a8eea0eb23b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.drug.model.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23b69de8fc9433ebb33f7a8eea0eb23b");
        }
        com.sankuai.waimai.drug.model.c h = this.b.h(i);
        if (h == null || h.c) {
            return null;
        }
        for (T t : this.b.f) {
            t.c = false;
        }
        h.c = true;
        this.b.notifyDataSetChanged();
        return h;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.sankuai.waimai.store.newwidgets.list.f<com.sankuai.waimai.drug.model.c, SCRecyclerView.a> {
        public static ChangeQuickRedirect a;
        private final g b;

        @Override // com.sankuai.waimai.store.newwidgets.list.f
        @NonNull
        @NotNull
        public final /* synthetic */ com.sankuai.waimai.store.newwidgets.list.g a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b67f2c3c035554ea4a2a05641d4d662d", RobustBitConfig.DEFAULT_VALUE) ? (C0943b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b67f2c3c035554ea4a2a05641d4d662d") : new C0943b(this.b);
        }

        public a(g gVar) {
            super(new SCRecyclerView.a());
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "664c736beefd0a87632b4c6cdb3be014", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "664c736beefd0a87632b4c6cdb3be014");
            } else {
                this.b = gVar;
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.drug.patch.block.v2.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0943b extends com.sankuai.waimai.store.newwidgets.list.g<com.sankuai.waimai.drug.model.c, SCRecyclerView.a> {
        public static ChangeQuickRedirect a;
        final g b;
        private TextView c;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(com.sankuai.waimai.drug.model.c cVar, final int i) {
            com.sankuai.waimai.drug.model.c cVar2 = cVar;
            Object[] objArr = {cVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ce396f26a889361824b39718bfe2cb4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ce396f26a889361824b39718bfe2cb4");
                return;
            }
            if (cVar2.c) {
                this.c.setBackground(com.sankuai.waimai.store.util.e.b(this.p.getContext(), (int) R.color.wm_sg_color_FFF8E1, (int) R.dimen.wm_sc_common_dimen_28));
                this.c.setTextColor(-32768);
                this.c.getPaint().setFakeBoldText(true);
            } else {
                this.c.setBackground(com.sankuai.waimai.store.util.e.b(this.p.getContext(), cVar2.d ? R.color.wm_sg_color_F5F5F6 : R.color.wm_sg_color_FFFFFF, (int) R.dimen.wm_sc_common_dimen_28));
                this.c.setTextColor(-11052967);
                this.c.getPaint().setFakeBoldText(false);
            }
            this.c.setText(cVar2.a);
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.patch.block.v2.b.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e94d6e47e6f50ca0e238b3d3e5b03018", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e94d6e47e6f50ca0e238b3d3e5b03018");
                    } else {
                        C0943b.this.b.a(i);
                    }
                }
            });
        }

        public C0943b(g gVar) {
            Object[] objArr = {gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7edce6712fa8f556d2fef516b0e52087", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7edce6712fa8f556d2fef516b0e52087");
            } else {
                this.b = gVar;
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull @NotNull View view) {
            this.c = (TextView) view;
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final View a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68acedd21be231c46356e4592e969b02", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68acedd21be231c46356e4592e969b02");
            }
            TextView textView = new TextView(viewGroup.getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            int a2 = com.meituan.roodesign.widgets.internal.a.a(viewGroup.getContext(), 12.0f);
            int i = a2 / 2;
            marginLayoutParams.rightMargin = i;
            marginLayoutParams.leftMargin = i;
            textView.setLayoutParams(marginLayoutParams);
            textView.setPadding(a2, i, a2, i);
            textView.setGravity(17);
            textView.setTextSize(2, 12.0f);
            return textView;
        }
    }
}
