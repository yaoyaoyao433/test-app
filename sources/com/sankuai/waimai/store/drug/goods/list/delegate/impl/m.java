package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.goods.list.templet.drugselfbusiness.DrugSelfBusinessContainerBlock;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.w;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class m extends l {
    public static ChangeQuickRedirect N;
    private b O;

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c
    public final void p() {
    }

    public m(@NonNull @NotNull SCBaseActivity sCBaseActivity, int i) {
        super(sCBaseActivity, 1);
        Object[] objArr = {sCBaseActivity, 1};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b196c11056faceeae274eb2e2b9f3225", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b196c11056faceeae274eb2e2b9f3225");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.l, com.sankuai.waimai.store.drug.goods.list.delegate.impl.c, com.sankuai.waimai.store.base.a
    public final void a(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efd9dd2c5472d96d6c459dd7286bb467", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efd9dd2c5472d96d6c459dd7286bb467");
            return;
        }
        super.a(fragmentActivity, bundle);
        b(true);
        this.O = new b(this, this.C);
        com.sankuai.waimai.store.drug.goods.list.utils.c.a(n.a(this));
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64ffccb5828e3ca8edc4c4fb521e9867", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64ffccb5828e3ca8edc4c4fb521e9867");
        } else {
            com.sankuai.waimai.store.drug.goods.list.utils.c.a(o.a(this));
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c
    public final void c(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae8a01b21f2c7fa59123db1734cbb205", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae8a01b21f2c7fa59123db1734cbb205");
        } else {
            com.sankuai.waimai.store.drug.goods.list.utils.c.a(p.a(this, restMenuResponse));
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c
    public final void c(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d8d783dfb423bd38fb9b031cbe22b69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d8d783dfb423bd38fb9b031cbe22b69");
        } else {
            com.sankuai.waimai.store.drug.goods.list.utils.c.a(q.a(this, intent));
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c
    public final void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e4211c2660647bcd63b20cbb56ca707", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e4211c2660647bcd63b20cbb56ca707");
        } else {
            com.sankuai.waimai.store.drug.goods.list.utils.c.a(r.a(this));
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.l, com.sankuai.waimai.store.drug.goods.list.delegate.impl.c
    public final void a(@NonNull @NotNull RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef15f41c4d41369a8fe4fdd6946aabcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef15f41c4d41369a8fe4fdd6946aabcf");
        } else {
            com.sankuai.waimai.store.drug.goods.list.utils.c.a(s.a(this, restMenuResponse));
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.l
    public final void d(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "185acb45c68e77a4aa326d459e7b5bff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "185acb45c68e77a4aa326d459e7b5bff");
            return;
        }
        if (w.g(restMenuResponse.getPoi())) {
            this.z = this.O.a(DrugSelfBusinessContainerBlock.class);
        } else {
            this.z = this.O.a(com.sankuai.waimai.store.drug.goods.list.viewblocks.c.class);
        }
        if (this.z == null) {
            super.d(restMenuResponse);
        }
        this.z.a(this.C);
        b(restMenuResponse);
        if (this.I == 1 && u()) {
            com.sankuai.waimai.store.drug.goods.list.utils.a.b();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c
    public final String r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = N;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4824f91ea2258c2b0aa149355b3a5dd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4824f91ea2258c2b0aa149355b3a5dd") : com.sankuai.waimai.store.drug.goods.list.utils.e.a(this.y.getIntent(), "key_pre_request_cache", "key_pre_request_cache", "");
    }

    public static /* synthetic */ void a(m mVar, RestMenuResponse restMenuResponse) {
        Object[] objArr = {mVar, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04f23fbcd9de7acac4e71888aa0381aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04f23fbcd9de7acac4e71888aa0381aa");
        } else {
            super.a(restMenuResponse);
        }
    }

    public static /* synthetic */ void a(m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "699e5de001c5d79db91e291a035c6946", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "699e5de001c5d79db91e291a035c6946");
        } else {
            super.w();
        }
    }

    public static /* synthetic */ void a(m mVar, Intent intent) {
        Object[] objArr = {mVar, intent};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6049bbf6c2bcc25ab7fc8810bee99b7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6049bbf6c2bcc25ab7fc8810bee99b7d");
        } else {
            super.c(intent);
        }
    }

    public static /* synthetic */ void b(m mVar, RestMenuResponse restMenuResponse) {
        Object[] objArr = {mVar, restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5bde4288f226a3ceed78c254ca7047a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5bde4288f226a3ceed78c254ca7047a3");
        } else {
            super.c(restMenuResponse);
        }
    }

    public static /* synthetic */ void b(m mVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, mVar, changeQuickRedirect, false, "84e0b81c4c88adb047f3a276bd69d49c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mVar, changeQuickRedirect, false, "84e0b81c4c88adb047f3a276bd69d49c");
        } else {
            super.p();
        }
    }

    public static /* synthetic */ void c(m mVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = N;
        if (PatchProxy.isSupport(objArr, mVar, changeQuickRedirect, false, "2b644601e0878ea16972567ffc131ff4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mVar, changeQuickRedirect, false, "2b644601e0878ea16972567ffc131ff4");
        } else {
            super.q();
        }
    }
}
