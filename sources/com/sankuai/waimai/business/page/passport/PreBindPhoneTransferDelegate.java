package com.sankuai.waimai.business.page.passport;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.platform.domain.manager.user.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PreBindPhoneTransferDelegate extends BaseActivityDelegate {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void a(TransferActivity transferActivity, @Nullable Bundle bundle) {
        Object[] objArr = {transferActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69653e970f7938b631a5ad642026aaa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69653e970f7938b631a5ad642026aaa5");
        } else if (!a.i().a()) {
            transferActivity.finish();
        } else {
            if (com.sankuai.waimai.foundation.core.a.f()) {
                Object[] objArr2 = {transferActivity};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "05a0df3bf2929dc92b42f239f4cd349f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "05a0df3bf2929dc92b42f239f4cd349f");
                } else {
                    transferActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("dianping://modifyphone?url=https://maccount.dianping.com/account/modifymobile?newtoken=!&version=*")));
                }
            } else {
                com.sankuai.waimai.foundation.router.a.a(transferActivity, "https://passport.meituan.com/useraccount/changephone");
            }
            transferActivity.finish();
        }
    }
}
