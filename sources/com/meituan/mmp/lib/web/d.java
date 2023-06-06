package com.meituan.mmp.lib.web;

import android.os.Trace;
import android.webkit.JavascriptInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private com.meituan.mmp.lib.interfaces.b b;

    public d(com.meituan.mmp.lib.interfaces.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "042bb3b68f325dcadda0f0f5299dca91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "042bb3b68f325dcadda0f0f5299dca91");
        } else {
            this.b = bVar;
        }
    }

    @JavascriptInterface
    public final void publishHandler(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "878befdb977bc368e7100a93ebad1d80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "878befdb977bc368e7100a93ebad1d80");
        } else if (this.b != null) {
            this.b.b(str, str2, str3);
        }
    }

    @JavascriptInterface
    public final String invokeHandler(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0669c7d56d2dfafd0e6dbc557018847b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0669c7d56d2dfafd0e6dbc557018847b");
        }
        if (this.b != null) {
            Trace.beginSection("invoke: " + str);
            try {
                return this.b.c(str, str2, str3);
            } finally {
                Trace.endSection();
            }
        }
        return null;
    }

    @JavascriptInterface
    public final String importScripts(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3d0751f22933ebf2f7c71dbac5a827e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3d0751f22933ebf2f7c71dbac5a827e") : importScripts(strArr, null);
    }

    @JavascriptInterface
    public final String importScripts(String[] strArr, String str) {
        Object[] objArr = {strArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "205ff9e7537db284a1a762716c791aec", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "205ff9e7537db284a1a762716c791aec");
        }
        if (this.b != null) {
            Trace.beginSection("importScripts");
            String a2 = this.b.a(strArr, str);
            Trace.endSection();
            return a2;
        }
        return null;
    }
}
