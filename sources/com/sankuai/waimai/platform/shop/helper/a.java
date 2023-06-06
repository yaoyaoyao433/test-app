package com.sankuai.waimai.platform.shop.helper;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.router.interfaces.c;
import com.sankuai.waimai.router.activity.d;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str, Bundle bundle) {
        Object[] objArr = {context, str, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c29227c6027c6331ab5a907630072f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c29227c6027c6331ab5a907630072f7");
            return;
        }
        d dVar = new d() { // from class: com.sankuai.waimai.platform.shop.helper.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.router.activity.d
            public final boolean a(@NonNull j jVar, @NonNull Intent intent) throws ActivityNotFoundException, SecurityException {
                Object[] objArr2 = {jVar, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5dffa4a66fd34ad9ea262c7e59994a4d", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5dffa4a66fd34ad9ea262c7e59994a4d")).booleanValue();
                }
                intent.addFlags(603979776);
                jVar.c.startActivity(intent);
                return true;
            }
        };
        if (TextUtils.isEmpty(str)) {
            com.sankuai.waimai.foundation.router.a.a().a(dVar).a(bundle).a(context, c.b);
        } else {
            com.sankuai.waimai.foundation.router.a.a().a(dVar).a(bundle).a(context, str);
        }
    }
}
