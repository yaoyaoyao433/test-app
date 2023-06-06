package com.sankuai.waimai.store.goods.list;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.j;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.goods.list.c
    public final boolean a(@NonNull j jVar) {
        Activity c;
        String queryParameter;
        boolean z;
        Bundle bundle;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "796da3cca0db257f61c6500ff08bae98", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "796da3cca0db257f61c6500ff08bae98")).booleanValue();
        }
        if (b()) {
            Object[] objArr2 = {jVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1487585fb93196fe0f0e1292d83ee58", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1487585fb93196fe0f0e1292d83ee58")).booleanValue();
            } else {
                z = (jVar == null || (((bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra", null)) == null || !bundle.getBoolean("KeyNotNewIntent", false)) && (jVar.d == null || !af.a(jVar.d, "KeyNotNewIntent", false)))) && (c = com.sankuai.waimai.foundation.utils.activity.a.a().c()) != null && com.sankuai.waimai.store.shopping.cart.data.a.c(c) && (queryParameter = c.getIntent().getData().getQueryParameter("targetPath")) != null && queryParameter.startsWith("/pages/store/index");
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.goods.list.c
    public final void a(@NonNull j jVar, @NonNull g gVar, @Nullable Bundle bundle) {
        boolean z = false;
        Object[] objArr = {jVar, gVar, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa83058d4dee30bad51571d254201688", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa83058d4dee30bad51571d254201688");
            return;
        }
        if (b() && a()) {
            z = true;
        }
        a(jVar, gVar, bundle, a(jVar, z, (Map<String, String>) null));
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0324eea8aea6020e6f76ab7015f8363", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0324eea8aea6020e6f76ab7015f8363")).booleanValue() : com.sankuai.waimai.store.base.abtest.a.c().c() && a();
    }

    @Override // com.sankuai.waimai.store.goods.list.c
    public final boolean b(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "586bc78357ecad664de6ff3c852848ce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "586bc78357ecad664de6ff3c852848ce")).booleanValue();
        }
        Uri uri = jVar.d;
        if (b()) {
            if (com.sankuai.waimai.foundation.router.interfaces.a.a.equals(uri == null ? "" : uri.toString())) {
                return true;
            }
        }
        return false;
    }
}
