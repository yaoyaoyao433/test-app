package com.sankuai.waimai.store.newwidgets.list;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.ViewTypeSpec;
import com.sankuai.waimai.store.newwidgets.list.b;
import com.sankuai.waimai.store.newwidgets.list.f;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class i<T, Contract extends com.sankuai.waimai.store.newwidgets.list.b> extends f<T, Contract> {
    public static ChangeQuickRedirect a;
    public final List<View> b;
    public final List<View> c;
    protected f<T, Contract> d;
    int j;
    private boolean k;

    private static boolean c(View view) {
        return view == null;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public /* synthetic */ void onViewAttachedToWindow(@NonNull f.c cVar) {
        f.c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55a3e4d5559847315e6533af588a4f04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55a3e4d5559847315e6533af588a4f04");
            return;
        }
        super.onViewAttachedToWindow(cVar2);
        if (this.d != null) {
            this.d.onViewAttachedToWindow(cVar2);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public /* synthetic */ void onViewDetachedFromWindow(@NonNull f.c cVar) {
        f.c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "507f18ab0ba9821a08010b8e488b445b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "507f18ab0ba9821a08010b8e488b445b");
            return;
        }
        super.onViewDetachedFromWindow(cVar2);
        if (this.d != null) {
            this.d.onViewDetachedFromWindow(cVar2);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public /* synthetic */ void onViewRecycled(@NonNull f.c cVar) {
        f.c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f227604e6910bf2acad23737d1e374c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f227604e6910bf2acad23737d1e374c4");
            return;
        }
        super.onViewRecycled(cVar2);
        if (this.d != null) {
            this.d.onViewRecycled(cVar2);
        }
    }

    public i(@NonNull Contract contract) {
        super(contract);
        Object[] objArr = {contract};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2fad5ce632e58061addf69d02df9bb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2fad5ce632e58061addf69d02df9bb6");
            return;
        }
        this.j = 1;
        this.k = false;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac63bc57fa119ffc151dd8e49b7377dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac63bc57fa119ffc151dd8e49b7377dc");
        }
        int i2 = (-1073741824) & i;
        if (i2 != Integer.MIN_VALUE) {
            if (i2 != 1073741824) {
                return this.d == null ? new a() : this.d.a(i & 1073741823);
            }
            return new b(this.j);
        }
        return new b(this.j);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    public final T h(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6d21c2c0b2ef1f77d66974ef7f80561", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6d21c2c0b2ef1f77d66974ef7f80561");
        }
        if (i >= this.b.size() && i < getItemCount() - this.c.size() && this.d != null) {
            return this.d.h(i - this.b.size());
        }
        return null;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    public final void a(@NonNull Contract contract) {
        Object[] objArr = {contract};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bd79da3a63e15df5cc0f23309ccd39f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bd79da3a63e15df5cc0f23309ccd39f");
        } else {
            super.a((i<T, Contract>) contract);
        }
    }

    public final void a(f<T, Contract> fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2504cec40fbdae6ab1f55f8ae1ec8ce3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2504cec40fbdae6ab1f55f8ae1ec8ce3");
            return;
        }
        this.d = fVar;
        if (this.d != null) {
            this.d.a(this.g);
        }
        if (this.d != null) {
            this.d.a(this.h);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    public final void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7f502c6b21f01d9c909c80b4c9b518a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7f502c6b21f01d9c909c80b4c9b518a");
            return;
        }
        super.a(kVar);
        if (this.d != null) {
            this.d.a(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    public final void a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2fdc57d85002ed6c62539206b9cb430", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2fdc57d85002ed6c62539206b9cb430");
            return;
        }
        super.a(lVar);
        if (this.d != null) {
            this.d.a(lVar);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f, android.support.v7.widget.RecyclerView.a
    /* renamed from: a */
    public final void onBindViewHolder(@NonNull f.c cVar, int i) {
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b419ab04332b12821ef389c9df659df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b419ab04332b12821ef389c9df659df");
        } else if (cVar.b instanceof b) {
            if (i < this.b.size()) {
                cVar.b.b(com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i), i);
            } else if (i >= getItemCount() - this.c.size()) {
                int itemCount = (i - getItemCount()) + this.c.size();
                cVar.b.b(com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, itemCount), itemCount);
            }
        } else if (cVar.b instanceof a) {
        } else {
            this.d.onBindViewHolder(cVar, i - this.b.size());
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f, android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e3fb7ff1cd83be7c6c606caf273209c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e3fb7ff1cd83be7c6c606caf273209c")).intValue();
        }
        int itemCount = this.d != null ? this.d.getItemCount() : 0;
        if (itemCount > 0 || this.k) {
            return itemCount + this.b.size() + this.c.size();
        }
        return 0;
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "343c5e4d50d6bf60cda2b2def7597324", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "343c5e4d50d6bf60cda2b2def7597324")).intValue() : this.b.size();
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34a11a28c675294e4016369e41e659a9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34a11a28c675294e4016369e41e659a9")).intValue() : this.c.size();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        int i2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2736101e48576650b76342042d406cc9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2736101e48576650b76342042d406cc9")).intValue();
        }
        int i3 = -1;
        if (i < this.b.size()) {
            i2 = 1073741824;
        } else if (i >= getItemCount() - this.c.size()) {
            i2 = Integer.MIN_VALUE;
        } else {
            i3 = this.d == null ? ViewTypeSpec.ViewType.TYPE_CONTENT : this.d.getItemViewType(i - this.b.size());
            i2 = ViewTypeSpec.ViewType.TYPE_CONTENT;
        }
        Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = ViewTypeSpec.a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "767485db700b337304a260cb0645999b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "767485db700b337304a260cb0645999b")).intValue() : (i3 & 1073741823) | (i2 & ViewTypeSpec.ViewType.TYPE_CONTENT);
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e08651cf95a67b48900c71e88fa0aa5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e08651cf95a67b48900c71e88fa0aa5c");
        } else if (c(view)) {
        } else {
            this.b.remove(view);
            this.b.add(view);
            notifyDataSetChanged();
        }
    }

    public final void a(int i, View view) {
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc39ef346274c498594c1f280438d058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc39ef346274c498594c1f280438d058");
        } else if (!c(view) && i >= 0 && i <= this.c.size()) {
            this.c.remove(view);
            this.c.add(i, view);
            notifyDataSetChanged();
        }
    }

    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b39e6276e45f5f6c2a0ca5c29c76d444", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b39e6276e45f5f6c2a0ca5c29c76d444");
        } else if (c(view)) {
        } else {
            this.c.remove(view);
            this.c.add(view);
            notifyDataSetChanged();
        }
    }

    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d9c320fecba8eacb861a6cba2b4ed2b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d9c320fecba8eacb861a6cba2b4ed2b")).intValue();
        }
        if (i >= a() && i < getItemCount() - b()) {
            return i - a();
        }
        return -1;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends g<View, com.sankuai.waimai.store.newwidgets.list.b> {
        public static ChangeQuickRedirect a;
        private ViewGroup b;
        private int c;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(View view, int i) {
            View view2 = view;
            Object[] objArr = {view2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0baee7d32287d1a535798a71e5464186", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0baee7d32287d1a535798a71e5464186");
                return;
            }
            this.b.removeAllViews();
            if (view2 != null) {
                ViewParent parent = view2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view2);
                }
                this.b.addView(view2, new ViewGroup.LayoutParams(-1, -2));
            }
        }

        public b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4be33b0a2ba72d9a7fc1b8a342be863b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4be33b0a2ba72d9a7fc1b8a342be863b");
            } else {
                this.c = i;
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            this.b = (ViewGroup) view;
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final View a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0afa3d3f38a9580bc4e4788ccd5b0077", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0afa3d3f38a9580bc4e4788ccd5b0077");
            }
            Object[] objArr2 = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b81b46ea1b0ec770f6448740ac644217", RobustBitConfig.DEFAULT_VALUE)) {
                return (ViewGroup) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b81b46ea1b0ec770f6448740ac644217");
            }
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(this.c == 1 ? -1 : -2, -2));
            return frameLayout;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void registerAdapterDataObserver(@NonNull RecyclerView.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0155fb20ba18995acfabf00b2d82696d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0155fb20ba18995acfabf00b2d82696d");
            return;
        }
        super.registerAdapterDataObserver(cVar);
        if (this.d != null) {
            this.d.registerAdapterDataObserver(cVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void unregisterAdapterDataObserver(@NonNull RecyclerView.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ba194bc285873689db218b693f7a9c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ba194bc285873689db218b693f7a9c6");
            return;
        }
        super.unregisterAdapterDataObserver(cVar);
        if (this.d != null) {
            this.d.unregisterAdapterDataObserver(cVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void setHasStableIds(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e75df385376ac9da4bf1b407312b76f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e75df385376ac9da4bf1b407312b76f3");
            return;
        }
        super.setHasStableIds(z);
        if (this.d != null) {
            this.d.setHasStableIds(z);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public long getItemId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "024eb91d14e2b70025b9ac8b1bd28885", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "024eb91d14e2b70025b9ac8b1bd28885")).longValue();
        }
        if (this.d != null && i >= this.b.size() && i < this.b.size() + this.d.getItemCount()) {
            return this.d.getItemId(i - this.b.size());
        }
        return i;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31c9f103e72c29a9455bf7e9b11b526e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31c9f103e72c29a9455bf7e9b11b526e");
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        if (this.d != null) {
            this.d.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eaa300641158ea3d5dde8a023a3938a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eaa300641158ea3d5dde8a023a3938a");
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        if (this.d != null) {
            this.d.onDetachedFromRecyclerView(recyclerView);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends g {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(Object obj, int i) {
        }

        public a() {
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final View a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f26ab88559633f56b66f45101615dc3", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f26ab88559633f56b66f45101615dc3") : new View(viewGroup.getContext());
        }
    }
}
