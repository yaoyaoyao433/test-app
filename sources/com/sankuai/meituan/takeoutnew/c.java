package com.sankuai.meituan.takeoutnew;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.arbiter.hook.MTInstrumentation;
import com.sankuai.meituan.takeoutnew.ui.page.boot.AgreementActivity;
import com.sankuai.meituan.takeoutnew.ui.page.boot.SplashAdActivity;
import com.sankuai.meituan.takeoutnew.ui.page.boot.WelcomeActivity;
import com.sankuai.waimai.business.page.home.utils.i;
import com.sankuai.waimai.business.page.homepage.MainActivity;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.launcher.init.d;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends MTInstrumentation {
    public static ChangeQuickRedirect a;
    private static List<String> b = new ArrayList();
    private static List<String> c = new ArrayList();

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4726caedcd6a99dc2b31c8a0a877f647", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4726caedcd6a99dc2b31c8a0a877f647");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fe33062870467234b0abaeba4ff9d01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fe33062870467234b0abaeba4ff9d01");
        } else {
            c.add(WelcomeActivity.class.getName());
            c.add(AgreementActivity.class.getName());
            c.add(TransferActivity.class.getName());
            b.addAll(c);
            b.add(SplashAdActivity.class.getName());
            b.add(MainActivity.class.getName());
        }
        i.a(new i.a() { // from class: com.sankuai.meituan.takeoutnew.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.utils.i.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0749b55eb1c5f2a47d9a342b6dc9f18c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0749b55eb1c5f2a47d9a342b6dc9f18c");
                } else {
                    d.c((Application) com.meituan.android.singleton.b.a);
                }
            }
        });
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation, android.app.Instrumentation
    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Object[] objArr = {classLoader, str, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59e423ff11a62be63d945abc8deccd9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59e423ff11a62be63d945abc8deccd9f");
        }
        if (!d.a() && !c.contains(str)) {
            d.b((Application) com.meituan.android.singleton.b.a.getApplicationContext());
        }
        if (!i.a() && !b.contains(str)) {
            i.a(false);
        }
        return super.newActivity(classLoader, str, intent);
    }

    @Override // com.sankuai.meituan.arbiter.hook.MTInstrumentation
    public final Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle) {
        Object[] objArr = {context, iBinder, iBinder2, str, intent, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86d0292ce5e84761bd22f40c4a2b060f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Instrumentation.ActivityResult) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86d0292ce5e84761bd22f40c4a2b060f");
        }
        try {
            return super.execStartActivity(context, iBinder, iBinder2, str, intent, i, bundle);
        } catch (Exception e) {
            if ("vivo".equalsIgnoreCase(Build.MANUFACTURER) && 28 == Build.VERSION.SDK_INT && (("V1914A".equalsIgnoreCase(Build.MODEL) || "V1829A".equalsIgnoreCase(Build.MODEL)) && "android.content.pm.action.REQUEST_PERMISSIONS".equals(intent.getAction()) && "com.android.packageinstaller".equals(intent.getPackage()))) {
                return null;
            }
            throw e;
        }
    }
}
