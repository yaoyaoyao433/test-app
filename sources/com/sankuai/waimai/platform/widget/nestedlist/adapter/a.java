package com.sankuai.waimai.platform.widget.nestedlist.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.nestedlist.impl.GroupItemInfo;
import com.sankuai.waimai.platform.widget.nestedlist.interfaces.d;
import com.sankuai.waimai.platform.widget.recycler.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<Holder extends com.sankuai.waimai.platform.widget.recycler.b, Group, Child> extends com.sankuai.waimai.platform.widget.recycler.a<Holder> implements com.sankuai.waimai.platform.widget.nestedlist.interfaces.c<Holder, Group, Child>, d {
    public static ChangeQuickRedirect a;

    public int a(int i, Object obj, @NonNull GroupItemInfo groupItemInfo) {
        return -2147483645;
    }

    @NonNull
    public abstract d a();

    public boolean a(int i) {
        return i == -2147483645;
    }

    public int b(int i, Object obj, @NonNull GroupItemInfo groupItemInfo) {
        return -2147483644;
    }

    @Override // com.sankuai.waimai.platform.widget.recycler.a
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75112584616c5b964a35bbaf05092886", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75112584616c5b964a35bbaf05092886")).intValue() : a().c();
    }

    @Override // com.sankuai.waimai.platform.widget.recycler.a
    public final int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f20f1d2c8c9ecf03fca43ba0b49f5a2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f20f1d2c8c9ecf03fca43ba0b49f5a2")).intValue();
        }
        GroupItemInfo groupItemInfo = new GroupItemInfo();
        Object b = a().b(i, groupItemInfo);
        switch (groupItemInfo.a()) {
            case -3:
                return b(i, b, groupItemInfo);
            case -2:
                return a(i, b, groupItemInfo);
            default:
                a(String.format("getItemViewType failure, position = %d, info = %s", Integer.valueOf(i), groupItemInfo));
                return Integer.MIN_VALUE;
        }
    }

    @Override // com.sankuai.waimai.platform.widget.recycler.a
    public final Holder a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "935660463e818906d39c5f0a5c2b0156", RobustBitConfig.DEFAULT_VALUE)) {
            return (Holder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "935660463e818906d39c5f0a5c2b0156");
        }
        if (a(i)) {
            return (Holder) b(viewGroup, i);
        }
        return (Holder) c(viewGroup, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.platform.widget.recycler.a
    public final void a(Holder holder, int i) {
        Object[] objArr = {holder, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9228161afb16ca8fbc02237de9c8ad0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9228161afb16ca8fbc02237de9c8ad0e");
            return;
        }
        GroupItemInfo groupItemInfo = new GroupItemInfo();
        Object b = a().b(i, groupItemInfo);
        switch (groupItemInfo.a()) {
            case -3:
                b(holder, b, i, groupItemInfo);
                return;
            case -2:
                a((a<Holder, Group, Child>) holder, (Holder) b, i, groupItemInfo);
                return;
            default:
                return;
        }
    }

    @Override // com.sankuai.waimai.platform.widget.nestedlist.interfaces.b
    public final int c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "750f3c62caa89b88135c6344123cdce5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "750f3c62caa89b88135c6344123cdce5")).intValue();
        }
        int c = a().c(i);
        if (c == -1) {
            return -1;
        }
        Object[] objArr2 = {Integer.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.widget.recycler.a.d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "def043f43d616dd1b7f53d0a6ea7b6ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "def043f43d616dd1b7f53d0a6ea7b6ae")).intValue();
        }
        if (c < 0 || c >= b()) {
            return -1;
        }
        return c + d();
    }

    @Override // com.sankuai.waimai.platform.widget.nestedlist.interfaces.b
    public final int d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6d627fba4d0c484067db214e4a292ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6d627fba4d0c484067db214e4a292ed")).intValue();
        }
        int f = f(i);
        Object[] objArr2 = {Integer.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58b355e027e41f15f237d8c09ee912b2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58b355e027e41f15f237d8c09ee912b2")).intValue() : a().d(f);
    }

    @Override // com.sankuai.waimai.platform.widget.nestedlist.interfaces.b
    public final boolean e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "592d15f0d6807fcd9474d6990c14c31a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "592d15f0d6807fcd9474d6990c14c31a")).booleanValue();
        }
        int f = f(i);
        Object[] objArr2 = {Integer.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed16864dbe226a9f41b463de209f75af", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed16864dbe226a9f41b463de209f75af")).booleanValue() : a().e(f);
    }

    @Override // com.sankuai.waimai.platform.widget.nestedlist.interfaces.d
    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1f18d6d2f1b53dcd2c5cba3515b7d95", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1f18d6d2f1b53dcd2c5cba3515b7d95")).intValue() : a().c();
    }

    @Override // com.sankuai.waimai.platform.widget.nestedlist.interfaces.d
    @NonNull
    public final GroupItemInfo a(int i, @NonNull GroupItemInfo groupItemInfo) {
        Object[] objArr = {Integer.valueOf(i), groupItemInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f73340f4cad3bef1c2051d9304c6e8c", RobustBitConfig.DEFAULT_VALUE) ? (GroupItemInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f73340f4cad3bef1c2051d9304c6e8c") : a().a(f(i), groupItemInfo);
    }

    @Override // com.sankuai.waimai.platform.widget.nestedlist.interfaces.d
    public final Object b(int i, @Nullable GroupItemInfo groupItemInfo) {
        Object[] objArr = {Integer.valueOf(i), groupItemInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de81ef0ae00baf44d28f2e72c3a65b4c", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de81ef0ae00baf44d28f2e72c3a65b4c") : a().b(f(i), groupItemInfo);
    }
}
