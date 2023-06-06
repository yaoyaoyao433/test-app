package com.sankuai.waimai.store.goods.list.viewblocks.mbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.manager.judas.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.base.vessel.impl.a {
    public static ChangeQuickRedirect a;
    private SGScanProductDelegateImpl d;

    public c(@NonNull SCBaseActivity sCBaseActivity) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1616e5930028087139eae4395bc5237a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1616e5930028087139eae4395bc5237a");
        }
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.vessel.a
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22ff321ab282efd06a8bf65dcb02800b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22ff321ab282efd06a8bf65dcb02800b");
            return;
        }
        super.a(bundle);
        a(R.layout.wm_st_scan_product_layout);
        d.a(this.c);
        this.d = new SGScanProductDelegateImpl(n());
        this.d.a(n(), bundle);
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "219cac5734b53ba4a8f782e249852298", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "219cac5734b53ba4a8f782e249852298");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6babdad13ced35891d3abdf78e931b6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6babdad13ced35891d3abdf78e931b6e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a44aa2098425298d727cd7ff37329674", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a44aa2098425298d727cd7ff37329674");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b7b82b0e5e91d28d1f86fcd9040abc9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b7b82b0e5e91d28d1f86fcd9040abc9")).booleanValue();
        }
        SGScanProductDelegateImpl sGScanProductDelegateImpl = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = SGScanProductDelegateImpl.a;
        if (PatchProxy.isSupport(objArr2, sGScanProductDelegateImpl, changeQuickRedirect2, false, "13ccf76b312a08a7f27e04710855f186", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, sGScanProductDelegateImpl, changeQuickRedirect2, false, "13ccf76b312a08a7f27e04710855f186")).booleanValue();
        }
        if (sGScanProductDelegateImpl.p) {
            sGScanProductDelegateImpl.k();
            return true;
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f2728dc639aea0984fb49c87aeaf580", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f2728dc639aea0984fb49c87aeaf580");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bae327a8bba863c34fe288fbda127d3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bae327a8bba863c34fe288fbda127d3e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86b002e99b9274e15e8bb2a1024e7524", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86b002e99b9274e15e8bb2a1024e7524");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "958a14d1f0f6a53a7aaf3af275f9ba90", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "958a14d1f0f6a53a7aaf3af275f9ba90");
        }
        if (this.d != null) {
            return SGScanProductDelegateImpl.l();
        }
        com.sankuai.waimai.store.base.log.a.a("impossible!");
        return "";
    }

    @Override // com.sankuai.waimai.store.base.vessel.impl.a, com.sankuai.waimai.store.base.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4095997cf0728855632cf58aa4b9daa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4095997cf0728855632cf58aa4b9daa");
            return;
        }
        if (this.d != null) {
            this.d.c();
        }
        super.c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a extends com.sankuai.waimai.store.base.vessel.impl.b {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.base.vessel.b
        @NonNull
        public final /* synthetic */ com.sankuai.waimai.store.base.vessel.a a(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2fcc3f8de2c5b06465e0f64eab4951a", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2fcc3f8de2c5b06465e0f64eab4951a") : new c(sCBaseActivity);
        }

        @Override // com.sankuai.waimai.store.base.vessel.impl.b, com.sankuai.waimai.store.base.vessel.b
        public final void b(@NonNull SCBaseActivity sCBaseActivity) {
            Object[] objArr = {sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efc6543276605c846599646292bb7bde", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efc6543276605c846599646292bb7bde");
                return;
            }
            sCBaseActivity.a(true, true);
            if (sCBaseActivity.getWindow() != null) {
                Window window = sCBaseActivity.getWindow();
                window.addFlags(128);
                window.setSoftInputMode(3);
            }
        }
    }
}
