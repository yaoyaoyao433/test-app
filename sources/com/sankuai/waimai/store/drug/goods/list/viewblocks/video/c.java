package com.sankuai.waimai.store.drug.goods.list.viewblocks.video;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.viewblocks.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.drug.viewblocks.b {
    public static ChangeQuickRedirect a;
    d b;
    private a i;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    interface a {
        boolean b();
    }

    public c(@NonNull Context context, com.sankuai.waimai.store.drug.video.video.a aVar, a aVar2) {
        super(context, aVar);
        Object[] objArr = {context, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf8c7fc4f6ba1d650b19031fe4c7b6ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf8c7fc4f6ba1d650b19031fe4c7b6ae");
        } else {
            this.i = aVar2;
        }
    }

    @Override // com.sankuai.waimai.store.drug.viewblocks.b
    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f90b1917d4ef4d85b02961749a42468", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f90b1917d4ef4d85b02961749a42468");
        } else if (z) {
            if (this.i != null) {
                if (this.i.b()) {
                    return;
                }
                super.a(true, z2);
                return;
            }
            super.a(true, z2);
        } else {
            a();
        }
    }

    @Override // com.sankuai.waimai.store.drug.viewblocks.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d1656b837c2585f1327d7b1dae97610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d1656b837c2585f1327d7b1dae97610");
            return;
        }
        super.a();
        e();
    }

    @Override // com.sankuai.waimai.store.drug.viewblocks.b
    public final com.sankuai.waimai.store.drug.viewblocks.c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1530cfec689268ffc823ab68e6f968a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.drug.viewblocks.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1530cfec689268ffc823ab68e6f968a4");
        }
        this.b = new d(this);
        return this.b;
    }

    public final void b(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c266d5db4b6925b810121d1f34c9789e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c266d5db4b6925b810121d1f34c9789e");
        } else if (this.b != null) {
            this.b.a(i);
        }
    }
}
