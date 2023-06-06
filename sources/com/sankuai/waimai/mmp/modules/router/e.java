package com.sankuai.waimai.mmp.modules.router;

import android.content.Context;
import android.content.Intent;
import com.meituan.mmp.lib.AppBrandHeraActivity;
import com.meituan.mmp.lib.HeraActivity2;
import com.meituan.mmp.lib.HeraActivity3;
import com.meituan.mmp.lib.router.AppBrandMonitor;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements com.meituan.mmp.lib.router.b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.router.b
    public final void a(Class<? extends AppBrandHeraActivity> cls) {
        Class cls2;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c64410955ef5c0e9777caeeb144138a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c64410955ef5c0e9777caeeb144138a");
            return;
        }
        com.meituan.mmp.lib.trace.b.c("switchTaskTo: " + cls.getSimpleName());
        Context applicationContext = MMPEnvHelper.getEnvInfo().getApplicationContext();
        Class<? extends AppBrandHeraActivity> a2 = AppBrandMonitor.e.a(cls);
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76d5902cdb8cfb264947dbc50892364d", RobustBitConfig.DEFAULT_VALUE)) {
            cls2 = (Class) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76d5902cdb8cfb264947dbc50892364d");
        } else if (HeraActivity3.class.isAssignableFrom(a2)) {
            cls2 = EmptyActivity3.class;
        } else if (HeraActivity2.class.isAssignableFrom(a2)) {
            cls2 = EmptyActivity2.class;
        } else {
            cls2 = EmptyActivity1.class;
        }
        Intent intent = new Intent(applicationContext, cls2);
        intent.addFlags(y.a);
        MMPEnvHelper.getEnvInfo().getApplicationContext().startActivity(intent);
    }
}
