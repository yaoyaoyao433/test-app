package com.sankuai.meituan.takeoutnew.provider.scheme.handler;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.transfer.LaunchModeProvider;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.sankuai.waimai.router.activity.c {
    public static ChangeQuickRedirect a;

    public d() {
        super(TransferActivity.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "583ba41e24525e225963b6d9a5de3a2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "583ba41e24525e225963b6d9a5de3a2d");
        }
    }

    @Override // com.sankuai.waimai.router.activity.c, com.sankuai.waimai.router.activity.a
    @NonNull
    public final Intent b(@NonNull j jVar) {
        boolean z = false;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12bfaa5e01ea424625b86a7253371114", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12bfaa5e01ea424625b86a7253371114");
        }
        Intent b = super.b(jVar);
        Context context = jVar.c;
        String path = jVar.d.getPath();
        Object[] objArr2 = {context, path};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0176b77e62d6aae28782eb54618d8266", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0176b77e62d6aae28782eb54618d8266")).booleanValue();
        } else if (!TextUtils.isEmpty(path) && (context instanceof TransferActivity)) {
            TransferActivity transferActivity = (TransferActivity) context;
            if (transferActivity.c != null && (transferActivity.c instanceof LaunchModeProvider)) {
                z = true;
            }
        }
        if (z) {
            b.setFlags(536870912);
        }
        b.putExtra("is_from_router_uri_handler", true);
        return b;
    }
}
