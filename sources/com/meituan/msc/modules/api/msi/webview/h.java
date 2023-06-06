package com.meituan.msc.modules.api.msi.webview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import com.meituan.msi.bean.BroadcastEvent;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class h extends MTWebView implements c, e, com.meituan.msi.view.e {
    public static ChangeQuickRedirect a;
    public com.meituan.msi.dispather.e b;
    private final String c;
    private f d;

    @Override // com.meituan.msi.view.e
    public final boolean b() {
        return false;
    }

    @Override // com.meituan.msi.view.e
    public final boolean c(String str) {
        return false;
    }

    public h(String str, Context context, @NonNull d dVar, com.meituan.msi.dispather.e eVar) {
        super(str, context);
        Object[] objArr = {str, context, dVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc8c3760743ce951ff310cf0faed75bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc8c3760743ce951ff310cf0faed75bd");
            return;
        }
        this.c = "__msc__plugin_webview";
        this.d = new f((Activity) context, dVar);
        this.b = eVar;
    }

    @Override // com.meituan.mtwebkit.MTWebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f342aa01703ec88d376cf4789ea39d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f342aa01703ec88d376cf4789ea39d72");
            return;
        }
        super.onAttachedToWindow();
        addJavascriptInterface(this.d, "__msc__plugin_webview");
    }

    @Override // com.meituan.mtwebkit.MTWebView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "823bb6d11115496a64559d1b537cab87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "823bb6d11115496a64559d1b537cab87");
            return;
        }
        super.onDetachedFromWindow();
        removeJavascriptInterface("__msc__plugin_webview");
    }

    @Override // com.meituan.msi.view.e
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2d4fec4aef6d88aaa4b3e19b73dc700", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2d4fec4aef6d88aaa4b3e19b73dc700");
            return;
        }
        onPause();
        a.a(false, (e) this);
    }

    @Override // com.meituan.msi.view.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ad060a8ab006aebbfd44f7499000f2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ad060a8ab006aebbfd44f7499000f2e");
            return;
        }
        onResume();
        a.a(true, (e) this);
    }

    @Override // com.meituan.msc.modules.api.msi.webview.e
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f68d4c5b20aa12a7787dd23ec46dd98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f68d4c5b20aa12a7787dd23ec46dd98");
        } else if (Build.VERSION.SDK_INT >= 19) {
            evaluateJavascript(str, null);
        } else {
            loadUrl(str);
        }
    }

    @Override // com.meituan.msc.modules.api.msi.webview.e
    public final void a(String str, Object obj, int i, String str2) {
        Object[] objArr = {str, obj, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5420c883c2d1dcbc364a520791cc72d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5420c883c2d1dcbc364a520791cc72d");
            return;
        }
        BroadcastEvent broadcastEvent = new BroadcastEvent(str, obj);
        HashMap hashMap = new HashMap();
        hashMap.put("pageId", String.valueOf(i));
        hashMap.put("viewId", String.valueOf(str2));
        broadcastEvent.setUiData(hashMap);
        this.b.a(broadcastEvent);
    }

    @Override // com.meituan.msc.modules.api.msi.webview.c
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd3e1517cb25ac9b0d5f188daa21dd31", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd3e1517cb25ac9b0d5f188daa21dd31")).booleanValue();
        }
        if (canGoBack()) {
            goBack();
            return true;
        }
        return false;
    }
}
