package com.meituan.android.pay.init;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.neohybrid.core.horn.a;
import com.meituan.android.pay.fragment.SignPayNeoFragment;
import com.meituan.android.pay.model.bean.HybridSignPayHornConfig;
import com.meituan.android.paycommon.lib.IInitSDK;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MeituanPayInit implements IInitSDK {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paycommon.lib.IInitSDK
    public final void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b0188fafb4e6f892b5e2442116b3682", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b0188fafb4e6f892b5e2442116b3682");
            return;
        }
        a.a().a("hybrid_sign_pay_config", HybridSignPayHornConfig.class);
        com.meituan.android.neohybrid.container.a.a("sign_pay", SignPayNeoFragment.class);
    }
}
