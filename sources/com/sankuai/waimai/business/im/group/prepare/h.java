package com.sankuai.waimai.business.im.group.prepare;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.model.e;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h implements e {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.business.im.group.prepare.e
    public final void a(@NonNull TransferActivity transferActivity, @NonNull Uri uri, long j, e.a aVar, int i, boolean z, int i2) {
        Object[] objArr = {transferActivity, uri, new Long(j), aVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70dd38e17c0a752d0e9631a466f0eabf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70dd38e17c0a752d0e9631a466f0eabf");
            return;
        }
        com.sankuai.waimai.business.im.api.a.a().a(transferActivity, transferActivity.w(), i, z, aVar.b, aVar.k, aVar.d, aVar.e);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10782bbdb52bb4bbcdf9a713be90cd4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10782bbdb52bb4bbcdf9a713be90cd4b");
        } else {
            com.sankuai.waimai.business.im.common.log.b.a("user_group_enter", "url");
        }
    }
}
