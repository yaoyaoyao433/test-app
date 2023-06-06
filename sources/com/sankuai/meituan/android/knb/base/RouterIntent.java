package com.sankuai.meituan.android.knb.base;

import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBRouterManager;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RouterIntent {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static Intent handle(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dcb793876165fa4511a9f9e13f222f1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dcb793876165fa4511a9f9e13f222f1e");
        }
        KNBRouterManager.getInstance().checkInit(context);
        Class publish = RouterIntentObserverManager.self().publish(context, intent);
        if (publish == null || publish == context.getClass()) {
            return intent;
        }
        Intent intent2 = new Intent(intent);
        intent2.putExtra("__router__", true);
        intent2.addFlags(y.a);
        if (intent2.getComponent() != null) {
            String packageName = intent2.getComponent().getPackageName();
            intent2.setComponent(null);
            intent2.setClassName(packageName, publish.getName());
        } else {
            intent2.setClassName(context.getPackageName(), publish.getName());
        }
        return intent2;
    }

    public static Intent getRedirectIntent(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "109d38dc8e836ef28626709b601fa038", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "109d38dc8e836ef28626709b601fa038") : (intent == null || f.a(intent, "__router__", false)) ? intent : handle(context, intent);
    }

    public static final boolean redirectIntent(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a64ef4af5f3e674f2899d594c39bb462", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a64ef4af5f3e674f2899d594c39bb462")).booleanValue();
        }
        Intent redirectIntent = getRedirectIntent(context, intent);
        if (intent != redirectIntent) {
            context.startActivity(redirectIntent);
            return true;
        }
        return false;
    }
}
