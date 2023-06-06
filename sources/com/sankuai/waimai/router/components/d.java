package com.sankuai.waimai.router.components;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d implements a {
    public static ChangeQuickRedirect b;
    public static final d c = new d();
    private boolean a;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc01fee825634b24e45ed3fc82be11e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc01fee825634b24e45ed3fc82be11e5");
        } else {
            this.a = false;
        }
    }

    public int a(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull Intent intent, Context context, Integer num, boolean z) {
        Object[] objArr = {jVar, intent, context, num, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eeac211f6751640773a9c801df93c0c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eeac211f6751640773a9c801df93c0c")).intValue();
        }
        if (a(context, intent)) {
            if (a(jVar, intent, z) == 200) {
                return 200;
            }
            return a(jVar, context, intent, num, z);
        }
        return 404;
    }

    private boolean a(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "febd015a5aaa8e880a288f7b5187c890", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "febd015a5aaa8e880a288f7b5187c890")).booleanValue();
        }
        if (this.a) {
            try {
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
                if (queryIntentActivities != null) {
                    if (queryIntentActivities.size() > 0) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                com.sankuai.waimai.router.core.d.b(e);
                return false;
            }
        }
        return true;
    }

    private int a(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull Intent intent, boolean z) {
        Object[] objArr = {jVar, intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66c75e1da8990606438ba577d7af5fa9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66c75e1da8990606438ba577d7af5fa9")).intValue();
        }
        try {
            com.sankuai.waimai.router.activity.d dVar = (com.sankuai.waimai.router.activity.d) jVar.a(com.sankuai.waimai.router.activity.d.class, "com.sankuai.waimai.router.activity.start_activity_action");
            if (dVar != null && dVar.a(jVar, intent)) {
                a(jVar);
                if (z) {
                    jVar.a("com.sankuai.waimai.router.activity.started_activity", (String) 1);
                    com.sankuai.waimai.router.core.d.a("    internal activity started by StartActivityAction, request = %s", jVar);
                    return 200;
                }
                jVar.a("com.sankuai.waimai.router.activity.started_activity", (String) 2);
                com.sankuai.waimai.router.core.d.a("    external activity started by StartActivityAction, request = %s", jVar);
                return 200;
            }
            return 500;
        } catch (ActivityNotFoundException e) {
            com.sankuai.waimai.router.core.d.a(e);
            return 404;
        } catch (SecurityException e2) {
            com.sankuai.waimai.router.core.d.a(e2);
            return 403;
        }
    }

    private int a(com.sankuai.waimai.router.core.j jVar, @NonNull Context context, @NonNull Intent intent, Integer num, boolean z) {
        Object[] objArr = {jVar, context, intent, num, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3543de6bdfe4444aca21bb488826408e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3543de6bdfe4444aca21bb488826408e")).intValue();
        }
        try {
            Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.options");
            if (num != null && (context instanceof Activity)) {
                ActivityCompat.startActivityForResult((Activity) context, intent, num.intValue(), bundle);
            } else {
                ActivityCompat.startActivity(context, intent, bundle);
            }
            a(jVar);
            if (z) {
                jVar.a("com.sankuai.waimai.router.activity.started_activity", (String) 1);
                com.sankuai.waimai.router.core.d.a("    internal activity started, request = %s", jVar);
                return 200;
            }
            jVar.a("com.sankuai.waimai.router.activity.started_activity", (String) 2);
            com.sankuai.waimai.router.core.d.a("    external activity started, request = %s", jVar);
            return 200;
        } catch (ActivityNotFoundException e) {
            com.sankuai.waimai.router.core.d.a(e);
            return 404;
        } catch (SecurityException e2) {
            com.sankuai.waimai.router.core.d.a(e2);
            return 403;
        }
    }

    @Override // com.sankuai.waimai.router.components.a
    public final int a(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull Intent intent) {
        Object[] objArr = {jVar, intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a69b11a5cf82551b97d43d39e03acae2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a69b11a5cf82551b97d43d39e03acae2")).intValue();
        }
        if (jVar == null || intent == null) {
            return 500;
        }
        Context context = jVar.c;
        Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        Integer num = (Integer) jVar.a(Integer.class, "com.sankuai.waimai.router.activity.flags");
        if (num != null) {
            intent.setFlags(num.intValue());
        }
        Integer num2 = (Integer) jVar.a(Integer.class, "com.sankuai.waimai.router.activity.request_code");
        boolean b2 = jVar.b("com.sankuai.waimai.router.activity.limit_package", false);
        if (!"tel".equals(intent.getScheme())) {
            intent.setPackage(context.getPackageName());
            int a = a(jVar, intent, context, num2, true);
            if (b2 || a == 200) {
                return a;
            }
        }
        intent.setPackage(null);
        return a(jVar, intent, context, num2, false);
    }

    private void a(com.sankuai.waimai.router.core.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc1bf613e7845537244bb4ab3bc1b498", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc1bf613e7845537244bb4ab3bc1b498");
            return;
        }
        Context context = jVar.c;
        int[] iArr = (int[]) jVar.a(int[].class, "com.sankuai.waimai.router.activity.animation");
        if ((context instanceof Activity) && iArr != null && iArr.length == 2) {
            ((Activity) context).overridePendingTransition(iArr[0], iArr[1]);
        }
    }
}
