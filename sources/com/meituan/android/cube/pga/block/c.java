package com.meituan.android.cube.pga.block;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.meituan.android.cube.pga.type.a;
import com.meituan.android.cube.pga.viewmodel.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class c<ViewModelType extends com.meituan.android.cube.pga.viewmodel.b, ContextType extends com.meituan.android.cube.pga.type.a> extends com.meituan.android.cube.pga.block.a<com.meituan.android.cube.pga.view.b, ViewModelType, ContextType> {
    public static ChangeQuickRedirect r;
    private c<ViewModelType, ContextType>.a s;
    @Nullable
    private com.meituan.android.cube.pga.block.a t;
    @Nullable
    private View u;
    @Nullable
    private com.meituan.android.cube.pga.block.a v;
    @Nullable
    private View w;

    public static /* synthetic */ com.meituan.android.cube.pga.block.a d(c cVar) {
        return cVar;
    }

    public abstract Map<Class, Class> M();

    public static /* synthetic */ int a(c cVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "5b3d9235f6a848272dba9d4fb2d0cb03", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "5b3d9235f6a848272dba9d4fb2d0cb03")).intValue();
        }
        if (i != 0 || cVar.u == null) {
            return (i != cVar.P() - 1 || cVar.w == null) ? 0 : -2;
        }
        return -1;
    }

    public c(ContextType contexttype, ViewStub viewStub) {
        super(contexttype, viewStub);
        Object[] objArr = {contexttype, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dd725319f4be88b563173297a0ba7ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dd725319f4be88b563173297a0ba7ce");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ee6418c0ecf93fa8409f76d4e335085", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ee6418c0ecf93fa8409f76d4e335085");
            return;
        }
        super.s();
        ((com.meituan.android.cube.pga.view.b) this.g).a().setLayoutManager(((com.meituan.android.cube.pga.viewmodel.b) this.n).o());
        c<ViewModelType, ContextType>.a aVar = new a();
        this.s = aVar;
        ((com.meituan.android.cube.pga.view.b) this.g).a().setAdapter(aVar);
        ((com.meituan.android.cube.pga.view.b) this.g).a().setOnScrollListener(new RecyclerView.k() { // from class: com.meituan.android.cube.pga.block.c.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d51702392c4530bbf9482011f79fec6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d51702392c4530bbf9482011f79fec6");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                Iterator<com.meituan.android.cube.pga.block.a> it = c.this.O().iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        c.this.C();
                    }
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6903d9f691a8bd6e9ec44b1a836cd1b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6903d9f691a8bd6e9ec44b1a836cd1b1");
            return;
        }
        super.I();
        this.s.notifyDataSetChanged();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.a<b> {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e952a0cad6e1d683eef4b8a875dad5d4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e952a0cad6e1d683eef4b8a875dad5d4");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
        @Override // android.support.v7.widget.RecyclerView.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* synthetic */ void onBindViewHolder(com.meituan.android.cube.pga.block.c.b r14, int r15) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.cube.pga.block.c.a.onBindViewHolder(android.support.v7.widget.RecyclerView$s, int):void");
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i) {
            final b bVar;
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "658e5ab3ed246804d718067060304772", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "658e5ab3ed246804d718067060304772");
            }
            Context m = c.this.m();
            Object[] objArr2 = {m};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7e09e4f2b3ca4a89d83d1c277244856a", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7e09e4f2b3ca4a89d83d1c277244856a");
            } else {
                FrameLayout frameLayout = new FrameLayout(m);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                bVar = new b(frameLayout);
            }
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.cube.pga.block.c.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6022934cc14f431d0d6da0de367ae54f", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6022934cc14f431d0d6da0de367ae54f");
                    }
                }
            });
            return bVar;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onViewAttachedToWindow(b bVar) {
            b bVar2 = bVar;
            Object[] objArr = {bVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "248554eb13ecf799c99027db2542e68e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "248554eb13ecf799c99027db2542e68e");
                return;
            }
            super.onViewAttachedToWindow(bVar2);
            com.meituan.android.cube.pga.block.a aVar = bVar2.b;
            if (aVar != null) {
                aVar.c((com.meituan.android.cube.pga.block.b) c.d(c.this));
                aVar.a((com.meituan.android.cube.pga.block.b) c.d(c.this));
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onViewDetachedFromWindow(b bVar) {
            b bVar2 = bVar;
            Object[] objArr = {bVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ac5e9dfe35027e36dfdd31c3fe9e0a4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ac5e9dfe35027e36dfdd31c3fe9e0a4");
                return;
            }
            super.onViewDetachedFromWindow(bVar2);
            com.meituan.android.cube.pga.block.a aVar = bVar2.b;
            if (aVar != null) {
                aVar.c((com.meituan.android.cube.pga.block.b) null);
                aVar.a((com.meituan.android.cube.pga.block.b) null);
                c.d(c.this).C();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemViewType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48879b483967770bc4b3b19a213eeb34", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48879b483967770bc4b3b19a213eeb34")).intValue();
            }
            int a2 = c.a(c.this, i);
            if (a2 == 0) {
                int b = c.b(c.this, i);
                com.meituan.android.cube.pga.viewmodel.a b2 = ((com.meituan.android.cube.pga.viewmodel.b) c.this.n).b(b);
                b2.b_(b);
                return b2.m() == null ? c.this.M().get(b2.getClass()).hashCode() : b2.m().hashCode();
            }
            return a2;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dde158a26a0348ff23dff1d82a371c9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dde158a26a0348ff23dff1d82a371c9")).intValue() : c.this.P();
        }

        private static <T> boolean a(T[] tArr) {
            return tArr == null || tArr.length == 0;
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    /* renamed from: N */
    public com.meituan.android.cube.pga.view.b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3425fc3608b7c90bfea5872eae5701c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.view.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3425fc3608b7c90bfea5872eae5701c9");
        }
        if (this.h == null) {
            return new com.meituan.android.cube.pga.view.b(m());
        }
        return new com.meituan.android.cube.pga.view.b(m(), this.h);
    }

    public final ArrayList<com.meituan.android.cube.pga.block.a> O() {
        com.meituan.android.cube.pga.block.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be58e3ea5d80d388f83de401a6970a68", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be58e3ea5d80d388f83de401a6970a68");
        }
        ArrayList<com.meituan.android.cube.pga.block.a> arrayList = new ArrayList<>();
        RecyclerView a2 = ((com.meituan.android.cube.pga.view.b) this.g).a();
        int childCount = a2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.s childViewHolder = a2.getChildViewHolder(a2.getChildAt(i));
            if ((childViewHolder instanceof b) && (aVar = ((b) childViewHolder).b) != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    @Nullable
    public final com.meituan.android.cube.pga.block.a b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbc891aef569cbae4635ec92b4f2e286", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbc891aef569cbae4635ec92b4f2e286");
        }
        RecyclerView a2 = ((com.meituan.android.cube.pga.view.b) this.g).a();
        View findViewByPosition = a2.getLayoutManager().findViewByPosition(i);
        if (findViewByPosition == null) {
            return null;
        }
        RecyclerView.s childViewHolder = a2.getChildViewHolder(findViewByPosition);
        if (childViewHolder instanceof b) {
            return ((b) childViewHolder).b;
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public com.meituan.android.cube.pga.block.a b;

        public b(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1e8c9d067f963c9c1ad208f124b99b6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1e8c9d067f963c9c1ad208f124b99b6");
            }
        }

        public final void a(com.meituan.android.cube.pga.block.a aVar) {
            View i;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1261063b68eaf8d942d88af2ae4ac895", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1261063b68eaf8d942d88af2ae4ac895");
                return;
            }
            this.b = aVar;
            if (this.b == null || (i = this.b.i()) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = i.getLayoutParams();
            if (layoutParams == null) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
            } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
            }
            i.setLayoutParams(marginLayoutParams);
            if (i.getParent() instanceof ViewGroup) {
                ((ViewGroup) i.getParent()).removeView(i);
            }
            ((ViewGroup) this.itemView).addView(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6a53d24ce76d80845693bf414f5834e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6a53d24ce76d80845693bf414f5834e")).intValue();
        }
        return ((com.meituan.android.cube.pga.viewmodel.b) this.n).n() + (this.u == null ? 0 : 1) + (this.w != null ? 1 : 0);
    }

    public static /* synthetic */ int b(c cVar, int i) {
        return cVar.u != null ? i - 1 : i;
    }
}
