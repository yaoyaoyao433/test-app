package com.sankuai.meituan.android.knb.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PageNavigator {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void registerDefault(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f10cc9aa99e872d545e23895be1a7701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f10cc9aa99e872d545e23895be1a7701");
        } else {
            RouterIntentObserverManager.self().setDefaultClass(cls);
        }
    }

    public static boolean registerRouter(String str, IRouterObserver iRouterObserver, Class cls) {
        Object[] objArr = {str, iRouterObserver, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b000e2f3aa328d097c92c78dfb667fce", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b000e2f3aa328d097c92c78dfb667fce")).booleanValue() : RouterIntentObserverManager.self().addObserver(str, iRouterObserver, cls);
    }

    public static void openWebPage(Options options) {
        Object[] objArr = {options};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f975fcb85f4fbc6989f101ae7f337dec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f975fcb85f4fbc6989f101ae7f337dec");
            return;
        }
        Context context = options.context;
        Uri uri = options.uri;
        Bundle bundle = options.bundle;
        int i = options.requestCode;
        if (uri == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setData(uri);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (options.cls != null) {
            intent.setClass(context, options.cls);
        }
        Intent redirectIntent = RouterIntent.getRedirectIntent(context, intent);
        if (i != Integer.MIN_VALUE && (context instanceof Activity)) {
            ((Activity) context).startActivityForResult(redirectIntent, i);
        } else {
            context.startActivity(redirectIntent);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Options {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Bundle bundle;
        private Class cls;
        private Context context;
        public int requestCode;
        private Uri uri;

        public Options(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f71d7363d2a02fddd72cb964b065196d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f71d7363d2a02fddd72cb964b065196d");
                return;
            }
            this.requestCode = Integer.MIN_VALUE;
            this.context = context;
        }

        public Options uri(Uri uri) {
            this.uri = uri;
            return this;
        }

        public Options bundle(Bundle bundle) {
            this.bundle = bundle;
            return this;
        }

        public Options requestCode(int i) {
            this.requestCode = i;
            return this;
        }

        public Options className(Class cls) {
            this.cls = cls;
            return this;
        }
    }
}
