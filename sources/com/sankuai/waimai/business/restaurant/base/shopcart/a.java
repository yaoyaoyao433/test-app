package com.sankuai.waimai.business.restaurant.base.shopcart;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements Serializable {
    public static ChangeQuickRedirect a;
    public List<d> b;
    public List<d> c;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.base.shopcart.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0824a implements Iterator<d> {
        public static ChangeQuickRedirect a;
        private int c = 0;
        private int d;

        @Override // java.util.Iterator
        public final void remove() {
        }

        public C0824a() {
            this.d = a.this.b.size();
        }

        @Override // java.util.Iterator
        public final /* synthetic */ d next() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a619bbfab3d51c2f9f5ba93e07f0761", RobustBitConfig.DEFAULT_VALUE)) {
                return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a619bbfab3d51c2f9f5ba93e07f0761");
            }
            d dVar = a.this.b.get(this.c);
            this.c++;
            return dVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c < this.d;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class b implements Iterator<d> {
        public static ChangeQuickRedirect a;
        private int c;
        private int d;

        @Override // java.util.Iterator
        public final void remove() {
        }

        public b() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8d1dcfdbb5db846be8555a56360aaf5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8d1dcfdbb5db846be8555a56360aaf5");
                return;
            }
            this.c = 0;
            this.d = a.this.b.size() + a.this.c.size();
        }

        @Override // java.util.Iterator
        public final /* synthetic */ d next() {
            d dVar;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f6919435ff4ff08f65cb25773df2b87", RobustBitConfig.DEFAULT_VALUE)) {
                return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f6919435ff4ff08f65cb25773df2b87");
            }
            if (this.c < a.this.b.size()) {
                dVar = a.this.b.get(this.c);
            } else {
                dVar = a.this.c.get(this.c - a.this.b.size());
            }
            this.c++;
            return dVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c < this.d;
        }
    }

    public final Iterator<d> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f334fe7296ce72c6a028fd5752055a7", RobustBitConfig.DEFAULT_VALUE) ? (Iterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f334fe7296ce72c6a028fd5752055a7") : new C0824a();
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b61010605b44129b19e44169f369dae5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b61010605b44129b19e44169f369dae5");
        }
        return "shop_list: " + this.b + " error_list:" + this.c;
    }
}
