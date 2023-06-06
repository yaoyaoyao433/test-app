package com.sankuai.waimai.launcher.provider.scheme.interceptor;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.waimai.launcher.provider.scheme.d;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements i {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.i
    public final void a(@NonNull final j jVar, @NonNull final g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0908e4c408e4882b06771862bccb7788", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0908e4c408e4882b06771862bccb7788");
        } else if (ProcessUtils.isMainProcess(com.meituan.android.singleton.b.a) && d.b(jVar.d)) {
            com.sankuai.waimai.platform.domain.manager.user.a.b(jVar.c, new Runnable() { // from class: com.sankuai.waimai.launcher.provider.scheme.interceptor.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31c09e81e9a12656008fdbd1906ffbec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31c09e81e9a12656008fdbd1906ffbec");
                    } else {
                        gVar.a();
                    }
                }
            }, new Runnable() { // from class: com.sankuai.waimai.launcher.provider.scheme.interceptor.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af80280a72468f7a698f41c3058887d3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af80280a72468f7a698f41c3058887d3");
                        return;
                    }
                    jVar.a(com.meituan.android.singleton.b.a.getString(R.string.wm_main_login_cancel));
                    gVar.a(-1);
                }
            }, new Runnable() { // from class: com.sankuai.waimai.launcher.provider.scheme.interceptor.a.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "066c74e383d83f2149997e657b60782b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "066c74e383d83f2149997e657b60782b");
                        return;
                    }
                    jVar.a(com.meituan.android.singleton.b.a.getString(R.string.wm_main_login_failed));
                    gVar.a(-2);
                }
            });
        } else {
            gVar.a();
        }
    }
}
