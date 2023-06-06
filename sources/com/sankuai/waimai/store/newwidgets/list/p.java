package com.sankuai.waimai.store.newwidgets.list;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class p<T, Contract extends b> extends i<T, Contract> {
    public static ChangeQuickRedirect k;
    @NonNull
    private final Map<p<T, Contract>.a, RecyclerView.c> l;

    public p(@NonNull Contract contract) {
        super(contract);
        Object[] objArr = {contract};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "713f8042c7e5e65ad7171406f642c014", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "713f8042c7e5e65ad7171406f642c014");
        } else {
            this.l = new ArrayMap();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends RecyclerView.c {
        public static ChangeQuickRedirect a;
        @NonNull
        private final RecyclerView.c c;

        private a(@NonNull RecyclerView.c cVar) {
            Object[] objArr = {p.this, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f3eba53fd431a96aed2682751f7d0b0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f3eba53fd431a96aed2682751f7d0b0");
            } else {
                this.c = cVar;
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00d2fbef7cd84c97c9add5fcac43bdac", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00d2fbef7cd84c97c9add5fcac43bdac");
            } else {
                this.c.onChanged();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeChanged(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6757beadc489c3b5a647a7dd1a681907", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6757beadc489c3b5a647a7dd1a681907");
            } else {
                this.c.onItemRangeChanged(i + p.this.a(), i2);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5a1fa860270679ffa7f3a9d1d3a2455", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5a1fa860270679ffa7f3a9d1d3a2455");
            } else {
                this.c.onItemRangeChanged(i + p.this.a(), i2, obj);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeInserted(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77b69befb5109e19886469f2e762393c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77b69befb5109e19886469f2e762393c");
            } else {
                this.c.onItemRangeInserted(i + p.this.a(), i2);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeRemoved(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30c639d0da040fec4055f9959c3b953c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30c639d0da040fec4055f9959c3b953c");
            } else {
                this.c.onItemRangeRemoved(i + p.this.a(), i2);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.c
        public final void onItemRangeMoved(int i, int i2, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a780edc8106a9cfe2446f69b6fce30a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a780edc8106a9cfe2446f69b6fce30a");
            } else {
                this.c.onItemRangeMoved(i + p.this.a(), i2 + p.this.a(), i3);
            }
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.i, android.support.v7.widget.RecyclerView.a
    public final void registerAdapterDataObserver(@NonNull RecyclerView.c cVar) {
        p<T, Contract>.a aVar;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ad00f02475e56891d29ef3794376dc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ad00f02475e56891d29ef3794376dc9");
            return;
        }
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3751ab383aa0356446bf33c88fa04961", RobustBitConfig.DEFAULT_VALUE)) {
            Set<Map.Entry<p<T, Contract>.a, RecyclerView.c>> entrySet = this.l.entrySet();
            Iterator<Map.Entry<p<T, Contract>.a, RecyclerView.c>> it = entrySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                Map.Entry<p<T, Contract>.a, RecyclerView.c> next = it.next();
                if (entrySet != null && next.getValue() == cVar) {
                    aVar = next.getKey();
                    break;
                }
            }
        } else {
            aVar = (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3751ab383aa0356446bf33c88fa04961");
        }
        if (aVar == null) {
            aVar = new a(cVar);
            this.l.put(aVar, cVar);
        }
        super.registerAdapterDataObserver(aVar);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.i, android.support.v7.widget.RecyclerView.a
    public final void unregisterAdapterDataObserver(@NonNull RecyclerView.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1bcde442776a13119e81563692a14d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1bcde442776a13119e81563692a14d9");
            return;
        }
        super.unregisterAdapterDataObserver(cVar);
        this.l.remove(cVar);
    }
}
