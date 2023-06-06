package com.sankuai.waimai.store.goods.list;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.util.ae;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.goods.list.c
    public final boolean a(@NonNull j jVar) {
        String queryParameter;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b81a659866e84eb43de4d505e4b606f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b81a659866e84eb43de4d505e4b606f")).booleanValue();
        }
        Activity c = com.sankuai.waimai.foundation.utils.activity.a.a().c();
        if (c == null || !com.sankuai.waimai.store.shopping.cart.data.a.c(c) || (queryParameter = c.getIntent().getData().getQueryParameter("targetPath")) == null || !queryParameter.startsWith("/pages/store/index")) {
            return false;
        }
        if (jVar != null) {
            Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra", null);
            if (bundle != null && bundle.getBoolean("KeyNotNewIntent", false)) {
                return false;
            }
            if (jVar.d != null && af.a(jVar.d, "KeyNotNewIntent", false)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.sankuai.waimai.store.goods.list.c
    public final void a(@NonNull final j jVar, @NonNull final g gVar, @Nullable final Bundle bundle) {
        Object[] objArr = {jVar, gVar, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b77feae42c867a2e516b4cf0a6c0be8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b77feae42c867a2e516b4cf0a6c0be8");
            return;
        }
        if (i.h().a("store_business_prefetch/value", false) && (jVar.c instanceof Activity)) {
            String a2 = a(jVar, null);
            if (!aa.a(a2)) {
                try {
                    Uri.parse(a2).getQueryParameter("targetPath");
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
        }
        Uri uri = jVar.d;
        com.sankuai.waimai.store.base.net.sg.a.c().c(a(uri), b(uri), new k<SCPoiFoodContainerResponse>() { // from class: com.sankuai.waimai.store.goods.list.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                SCPoiFoodContainerResponse sCPoiFoodContainerResponse = (SCPoiFoodContainerResponse) obj;
                boolean z = true;
                Object[] objArr2 = {sCPoiFoodContainerResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb74ffa45623bd1241b32fba004b153c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb74ffa45623bd1241b32fba004b153c");
                    return;
                }
                super.a((AnonymousClass1) sCPoiFoodContainerResponse);
                boolean a3 = b.this.a(jVar, (sCPoiFoodContainerResponse.isMsc && b.this.a()) ? false : false, sCPoiFoodContainerResponse.additionalInfo);
                String str = ae.b;
                ae.a(str, "SCBackendControlDispatchHandler.startActivity success request=" + jVar + ";isJumpMSC=" + a3);
                b.this.a(jVar, gVar, bundle, a3);
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8a42275c94862443aa9423ee8047d99", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8a42275c94862443aa9423ee8047d99");
                    return;
                }
                super.a(bVar);
                String str = ae.b;
                ae.a(str, "SCBackendControlDispatchHandler.startActivity fail request=" + jVar + ";isJumpMSC=false");
                b.this.a(jVar, gVar, bundle, false);
            }
        });
    }

    @Override // com.sankuai.waimai.store.goods.list.c
    public final boolean b(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "819861221edd1f840345be140d9e318d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "819861221edd1f840345be140d9e318d")).booleanValue();
        }
        Uri uri = jVar.d;
        return com.sankuai.waimai.foundation.router.interfaces.a.a.equals(uri == null ? "" : uri.toString());
    }
}
