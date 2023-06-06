package com.sankuai.waimai.platform.widget.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.recycler.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<Holder extends com.sankuai.waimai.platform.widget.recycler.b> extends d implements g<com.sankuai.waimai.platform.widget.recycler.b> {
    public static ChangeQuickRedirect d;
    @NonNull
    private final a<Holder>.b a;
    @NonNull
    private final a<Holder>.b b;
    @NonNull
    private final ItemInfo c;
    @NonNull
    protected final List<Object> e;
    @NonNull
    protected final List<Object> f;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.widget.recycler.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1098a {
        @NonNull
        final View a;
        boolean b;
    }

    public abstract com.sankuai.waimai.platform.widget.recycler.b a(ViewGroup viewGroup, int i);

    /* JADX WARN: Can't rename method to resolve collision */
    public abstract void a(Holder holder, int i);

    public abstract int b();

    public abstract int b(int i);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.platform.widget.recycler.g
    public final /* synthetic */ void a(com.sankuai.waimai.platform.widget.recycler.b bVar, int i) {
        com.sankuai.waimai.platform.widget.recycler.b bVar2 = bVar;
        Object[] objArr = {bVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cca672af962429934f951d21c8b78a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cca672af962429934f951d21c8b78a5");
            return;
        }
        a(i, this.c);
        int i2 = this.c.b;
        int i3 = this.c.c;
        switch (i2) {
            case -6:
                a((a<Holder>) bVar2, i3);
                break;
            case -5:
                ((c) bVar2).b(this.b.a(i3));
                break;
            case -4:
                ((c) bVar2).b(this.a.a(i3));
                break;
        }
        a(bVar2, i, i2, i3);
    }

    @Override // com.sankuai.waimai.platform.widget.recycler.g
    public final /* synthetic */ com.sankuai.waimai.platform.widget.recycler.b a_(ViewGroup viewGroup, int i) {
        com.sankuai.waimai.platform.widget.recycler.b cVar;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c7730533c4232af6d356da30d734058", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.widget.recycler.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c7730533c4232af6d356da30d734058");
        }
        switch (i) {
            case -2147483647:
            case -2147483646:
                Object[] objArr2 = {viewGroup};
                ChangeQuickRedirect changeQuickRedirect2 = c.a;
                if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ec675ce8aa63f6ab81be3ec8dd6c78c0", RobustBitConfig.DEFAULT_VALUE)) {
                    FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                    frameLayout.setLayoutParams(new RecyclerView.g(-1, -2));
                    cVar = new c(frameLayout);
                    break;
                } else {
                    cVar = (c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ec675ce8aa63f6ab81be3ec8dd6c78c0");
                    break;
                }
            default:
                cVar = a(viewGroup, i);
                break;
        }
        if (cVar != null) {
            cVar.g = this;
        }
        return cVar;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32c27f108f7d36f000863fa530c8dd15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32c27f108f7d36f000863fa530c8dd15");
            return;
        }
        this.a = new b();
        this.b = new b();
        this.c = new ItemInfo();
        this.e = new ArrayList(1);
        this.f = new ArrayList(1);
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71e45d9df5d9e2a41ccbb856f4d36635", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71e45d9df5d9e2a41ccbb856f4d36635")).intValue() : this.a.a();
    }

    private int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bbf4c3f200ef1be746ef7983655d058", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bbf4c3f200ef1be746ef7983655d058")).intValue() : this.b.a();
    }

    public final int f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aef77247ee4bb6cdaf94dab2c94ae355", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aef77247ee4bb6cdaf94dab2c94ae355")).intValue();
        }
        a(i, this.c);
        if (this.c.b == -6) {
            return this.c.c;
        }
        return -1;
    }

    private ItemInfo a(int i, @NonNull ItemInfo itemInfo) {
        Object[] objArr = {Integer.valueOf(i), itemInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72ea8d2ef066fb9f58ec193f336afcb4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ItemInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72ea8d2ef066fb9f58ec193f336afcb4");
        }
        if (itemInfo == null) {
            return null;
        }
        if (i < 0) {
            itemInfo.a();
            return itemInfo;
        }
        int d2 = d();
        if (i < d2) {
            itemInfo.b(i);
            return itemInfo;
        }
        int b2 = b();
        int i2 = d2 + b2;
        if (i < i2) {
            itemInfo.a(i - d2);
            return itemInfo;
        } else if (i < i2 + a()) {
            itemInfo.c((i - d2) - b2);
            return itemInfo;
        } else {
            itemInfo.a();
            return itemInfo;
        }
    }

    public final void a(com.sankuai.waimai.platform.widget.recycler.b bVar, View view) {
        Object[] objArr = {bVar, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36f6367b1a68ac82e42dc12ba209711d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36f6367b1a68ac82e42dc12ba209711d");
        } else if (view.getVisibility() == 0 && !this.e.isEmpty()) {
            a(bVar.getAdapterPosition(), this.c);
            int i = this.c.b;
            Iterator<Object> it = this.e.iterator();
            while (it.hasNext()) {
                it.next();
            }
            switch (i) {
                case -6:
                    Iterator<Object> it2 = this.e.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    return;
                case -5:
                    Iterator<Object> it3 = this.e.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                    return;
                case -4:
                    Iterator<Object> it4 = this.e.iterator();
                    while (it4.hasNext()) {
                        it4.next();
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.recycler.g
    public final int g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "371acab118437929e5485609c95e11b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "371acab118437929e5485609c95e11b4")).intValue();
        }
        a(i, this.c);
        int i2 = this.c.b;
        int i3 = this.c.c;
        switch (i2) {
            case -6:
                int b2 = b(i3);
                if (b2 == -2147483647 || b2 == -2147483646) {
                    throw new RuntimeException("getItemViewType() should not return HEADER or FOOTER");
                }
                return b2;
            case -5:
                return -2147483646;
            case -4:
                return -2147483647;
            default:
                return Integer.MIN_VALUE;
        }
    }

    private void a(com.sankuai.waimai.platform.widget.recycler.b bVar, int i, int i2, int i3) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0248727802037b0a4e79a1356690d88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0248727802037b0a4e79a1356690d88");
        } else if (this.f.isEmpty()) {
        } else {
            Iterator<Object> it = this.f.iterator();
            while (it.hasNext()) {
                it.next();
            }
            switch (i2) {
                case -6:
                    Iterator<Object> it2 = this.f.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                    return;
                case -5:
                    Iterator<Object> it3 = this.f.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                    return;
                case -4:
                    Iterator<Object> it4 = this.f.iterator();
                    while (it4.hasNext()) {
                        it4.next();
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.recycler.g
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0d60023724417037f3d4ac0651494ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0d60023724417037f3d4ac0651494ca")).intValue();
        }
        return d() + b() + a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b {
        public static ChangeQuickRedirect a;
        private final List<C1098a> c;

        private b() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aea2e40a11e268c1ae907ef8353b692", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aea2e40a11e268c1ae907ef8353b692");
            } else {
                this.c = new ArrayList();
            }
        }

        int a() {
            int i = 0;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ebee7f957fe0d71fa71dff032a17a64", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ebee7f957fe0d71fa71dff032a17a64")).intValue();
            }
            for (C1098a c1098a : this.c) {
                if (c1098a.b) {
                    i++;
                }
            }
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f530e566121ce122f58977a6ac0d6af8", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f530e566121ce122f58977a6ac0d6af8");
            }
            if (i < 0 || i >= this.c.size()) {
                return null;
            }
            for (C1098a c1098a : this.c) {
                if (c1098a.b) {
                    if (i == 0) {
                        return c1098a.a;
                    }
                    i--;
                }
            }
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class c extends com.sankuai.waimai.platform.widget.recycler.b {
        public static ChangeQuickRedirect a;
        private FrameLayout b;
        private View c;

        public c(FrameLayout frameLayout) {
            super(frameLayout);
            Object[] objArr = {frameLayout};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a6fe5bca4e748ce3ad8d8fdf7da39d6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a6fe5bca4e748ce3ad8d8fdf7da39d6");
            } else {
                this.b = frameLayout;
            }
        }

        void b(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "724523e648ebaeb8ef929cd45074e17f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "724523e648ebaeb8ef929cd45074e17f");
            } else if (view == null) {
            } else {
                this.b.removeAllViews();
                ViewParent parent = view.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(view);
                }
                this.b.addView(view, new FrameLayout.LayoutParams(-1, -2));
                this.c = view;
            }
        }
    }
}
