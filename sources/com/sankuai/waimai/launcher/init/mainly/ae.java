package com.sankuai.waimai.launcher.init.mainly;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.arbiter.hook.ArbiterHook;
import com.sankuai.meituan.arbiter.hook.Utils;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.utils.l;
import java.lang.reflect.InvocationTargetException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ae extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "UriRouterInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c37513291101dd7267f3a21d8a19ee0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c37513291101dd7267f3a21d8a19ee0");
            return;
        }
        com.sankuai.waimai.launcher.provider.scheme.d.a(application);
        com.sankuai.waimai.router.components.h.a(new a());
        com.sankuai.waimai.platform.utils.l.a(new l.a() { // from class: com.sankuai.waimai.launcher.init.mainly.ae.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.utils.l.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7beb73b1b228efdfa44340b773de4e42", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7beb73b1b228efdfa44340b773de4e42");
                } else {
                    com.sankuai.waimai.launcher.provider.scheme.d.a();
                }
            }
        }, (String) null);
        ArbiterHook.setNeedException(true);
        if (com.sankuai.meituan.takeoutnew.a.f) {
            ArbiterHook.setDebug(true);
        } else {
            ArbiterHook.setOnErrorListener(new b());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b implements ArbiterHook.OnErrorListener {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // com.sankuai.meituan.arbiter.hook.ArbiterHook.OnErrorListener
        public final void onError(Context context, String str, Throwable th, Bundle bundle) {
            ComponentName componentName;
            Uri uri;
            String str2;
            String str3;
            Object[] objArr = {context, str, th, bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4e7035947b1b326a51d4c0c199ee8bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4e7035947b1b326a51d4c0c199ee8bb");
                return;
            }
            Parcelable parcelable = bundle.getParcelable(Utils.INTENT_KEY_INTENT);
            String str4 = null;
            if (parcelable instanceof Intent) {
                Intent intent = (Intent) parcelable;
                uri = intent.getData();
                componentName = intent.getComponent();
            } else {
                componentName = null;
                uri = null;
            }
            Activity b = com.sankuai.waimai.foundation.utils.activity.a.a().b();
            if (b != null && b.getIntent() != null) {
                str4 = b.getIntent().getDataString();
            }
            a.AbstractC1040a b2 = new com.sankuai.waimai.launcher.log.a().a("arbiter_hook_error").b(str);
            StringBuilder sb = new StringBuilder();
            sb.append(uri != null ? uri.toString() : "");
            if (componentName != null) {
                str2 = CommonConstant.Symbol.BRACKET_LEFT + componentName + CommonConstant.Symbol.BRACKET_RIGHT;
            } else {
                str2 = "";
            }
            sb.append(str2);
            a.AbstractC1040a c = b2.c(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            if (str4 != null) {
                str3 = "source:" + str4 + "\n";
            } else {
                str3 = "";
            }
            sb2.append(str3);
            sb2.append("error:");
            sb2.append(Log.getStackTraceString(th));
            com.sankuai.waimai.platform.capacity.log.i.d(c.d(sb2.toString()).a(true).b());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.router.components.d {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.sankuai.waimai.router.components.d
        public final int a(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull Intent intent, Context context, Integer num, boolean z) {
            Object[] objArr = {jVar, intent, context, num, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9245ae8fe153970dba4d8390410f4487", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9245ae8fe153970dba4d8390410f4487")).intValue();
            }
            try {
                intent.putExtra(Utils.EXTRA_NEED_EXCEPTION, true);
                return super.a(jVar, intent, context, num, z);
            } catch (Throwable th) {
                com.sankuai.waimai.router.core.d.a(th);
                if ((th instanceof RuntimeException) && (th.getCause() instanceof InvocationTargetException)) {
                    Throwable targetException = ((InvocationTargetException) th.getCause()).getTargetException();
                    if (targetException instanceof ActivityNotFoundException) {
                        return 404;
                    }
                    return targetException instanceof SecurityException ? 403 : 500;
                }
                return 500;
            }
        }
    }
}
