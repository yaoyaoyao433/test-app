package com.meituan.android.yoda.knb.plugin;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.context.ITitansContext;
import com.sankuai.titans.protocol.lifecycle.IContainerLifeCycle;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.lifecycle.IWebPageLifeCycle;
import com.sankuai.titans.protocol.lifecycle.annotation.TitansPlugin;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
@TitansPlugin(events = {}, name = "TitansBaseTopPlugin", version = "20.11.1")
/* loaded from: classes3.dex */
public final class a implements ITitansPlugin {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;
    private String d;
    private WeakReference<com.meituan.android.yoda.monitor.a> e;

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public final IContainerLifeCycle getContainerLifeCycle() {
        return null;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public final View getDebugItem(Activity activity) {
        return null;
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public final void onTitansReady(ITitansContext iTitansContext) {
    }

    public a(String str, String str2, String str3, com.meituan.android.yoda.monitor.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b1df07ce5987104070c13745cf6621f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b1df07ce5987104070c13745cf6621f");
            return;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = new WeakReference<>(aVar);
    }

    @Override // com.sankuai.titans.protocol.lifecycle.ITitansPlugin
    public final IWebPageLifeCycle getWebPageLifeCycle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a1327028f3da3357b182d606b8bb522", RobustBitConfig.DEFAULT_VALUE) ? (IWebPageLifeCycle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a1327028f3da3357b182d606b8bb522") : new b(this.b, this.c, this.d, this.e);
    }
}
