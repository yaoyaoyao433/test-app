package com.sankuai.waimai.store.goods.list;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.vessel.impl.a {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.goods.list.delegate.impl.b d;

    public a(@NonNull SCBaseActivity sCBaseActivity) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d22f2a7d0dea478cfcedd408aa75682e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d22f2a7d0dea478cfcedd408aa75682e");
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.vessel.a
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e7056bab0803c9f3436dec48c33bf53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e7056bab0803c9f3436dec48c33bf53");
            return;
        }
        super.a(bundle);
        a(R.layout.wm_st_promotion_aggregation_layout);
        com.sankuai.waimai.store.manager.judas.d.a(this.c);
        this.d = new com.sankuai.waimai.store.goods.list.delegate.impl.b(n(), 3);
        this.d.a(n(), bundle);
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39d4c6dd4dc0ad3a2370a184bdf0e763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39d4c6dd4dc0ad3a2370a184bdf0e763");
            return;
        }
        super.g();
        if (this.d != null) {
            this.d.g();
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad44465c6402159da177da93849a43c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad44465c6402159da177da93849a43c5");
            return;
        }
        if (this.d != null) {
            this.d.h();
        }
        super.h();
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1a6ea908aedf0955efaa896a1f10732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1a6ea908aedf0955efaa896a1f10732");
            return;
        }
        if (this.d != null) {
            this.d.i();
        }
        super.i();
    }

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "161296ab2f375292bc69dbe2a1734ec3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "161296ab2f375292bc69dbe2a1734ec3")).booleanValue() : this.d.a();
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fb43dbbfc7801150f5a30a51a75c2e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fb43dbbfc7801150f5a30a51a75c2e4");
            return;
        }
        if (this.d != null) {
            this.d.b(bundle);
        }
        super.b(bundle);
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "013173e971bf368e7fe5f4dedb8f0742", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "013173e971bf368e7fe5f4dedb8f0742");
            return;
        }
        if (this.d != null) {
            this.d.b(intent);
        }
        super.b(intent);
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68b531e865af32432faaf60a28ee4954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68b531e865af32432faaf60a28ee4954");
            return;
        }
        if (this.d != null) {
            this.d.a(i, i2, intent);
        }
        super.a(i, i2, intent);
    }

    @Override // com.sankuai.waimai.store.base.vessel.a
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f201c379124daf95501d438e84e10a8e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f201c379124daf95501d438e84e10a8e");
        }
        if (this.d != null) {
            com.sankuai.waimai.store.goods.list.delegate.impl.b bVar = this.d;
            return "c_waimai_sg_vya4pmi3";
        }
        com.sankuai.waimai.store.base.log.a.a("impossible!");
        return "";
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b41b9c836e1c6ac25b46ac7187a717d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b41b9c836e1c6ac25b46ac7187a717d4");
            return;
        }
        if (this.d != null) {
            this.d.c();
        }
        super.c();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.list.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C1180a extends com.sankuai.waimai.store.base.vessel.impl.b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.base.vessel.b
        @NonNull
        public final /* synthetic */ com.sankuai.waimai.store.base.vessel.a a(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd4d42a9d158c184c27ef81025062bd1", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd4d42a9d158c184c27ef81025062bd1") : new a(sCBaseActivity);
        }

        @Override // com.sankuai.waimai.store.base.vessel.impl.b, com.sankuai.waimai.store.base.vessel.b
        public final void b(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ed8535fe941ddac5da4e4629c3f80e6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ed8535fe941ddac5da4e4629c3f80e6");
                return;
            }
            sCBaseActivity.a(true, true);
            if (sCBaseActivity.getWindow() != null) {
                sCBaseActivity.getWindow().setSoftInputMode(3);
            }
        }
    }
}
