package com.meituan.passport.utils;

import android.support.v4.app.FragmentActivity;
import com.meituan.passport.LoginActivity;
import com.meituan.passport.api.OperatorLoginDialogProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class y {
    public static ChangeQuickRedirect a;

    public static void a(final FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd47622b4238b94fe6aac90998085ce6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd47622b4238b94fe6aac90998085ce6");
        } else if (ab.a() == 3 && (fragmentActivity instanceof LoginActivity)) {
            fragmentActivity.runOnUiThread(new Runnable() { // from class: com.meituan.passport.utils.y.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    List list;
                    OperatorLoginDialogProvider operatorLoginDialogProvider;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63f2e74316a262532b55def2e9bceaee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63f2e74316a262532b55def2e9bceaee");
                        return;
                    }
                    LoginActivity loginActivity = (LoginActivity) FragmentActivity.this;
                    Object[] objArr3 = {loginActivity};
                    ChangeQuickRedirect changeQuickRedirect3 = ag.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "c2d94730c2589e6dd9de7f3706bd4446", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "c2d94730c2589e6dd9de7f3706bd4446");
                        return;
                    }
                    try {
                        list = com.sankuai.meituan.serviceloader.b.a(OperatorLoginDialogProvider.class, "passport.operatorlogin.dialog", new Object[0]);
                    } catch (Exception unused) {
                        list = null;
                    }
                    if (CollectionUtils.isEmpty(list) || list.size() <= 0 || (operatorLoginDialogProvider = (OperatorLoginDialogProvider) list.get(0)) == null) {
                        return;
                    }
                    operatorLoginDialogProvider.hideOperatorLoginDialog(loginActivity);
                }
            });
        }
    }
}
