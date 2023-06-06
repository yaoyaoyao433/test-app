package com.meituan.android.mrn.component.mrnwebview;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.services.IContainerAdapter;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBar;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends IContainerAdapter {
    public static ChangeQuickRedirect a;
    private WeakReference<a> b;

    @Override // com.sankuai.titans.protocol.services.IContainerAdapter
    public final String h5UrlParameterName() {
        return "webViewUrl";
    }

    @Override // com.sankuai.titans.protocol.services.IContainerAdapter
    public final boolean showTitleBar() {
        return false;
    }

    public c(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cadb87b13f8f99642823db51d80139f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cadb87b13f8f99642823db51d80139f");
        } else {
            this.b = new WeakReference<>(aVar);
        }
    }

    @Override // com.sankuai.titans.protocol.services.IContainerAdapter
    public final ITitansPlugin getBusinessPlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "188cf6fd73fc48141b0ce221e495b703", RobustBitConfig.DEFAULT_VALUE)) {
            return (ITitansPlugin) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "188cf6fd73fc48141b0ce221e495b703");
        }
        a aVar = this.b.get();
        if (aVar == null) {
            com.facebook.common.logging.a.b("MRNWebViewTitansContainerAdapter@getBusinessPlugin", "mrnTitansWebViewWrapper is null");
            return null;
        }
        return new d(aVar);
    }

    @Override // com.sankuai.titans.protocol.services.IContainerAdapter
    public final String scheme() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7003ba8a0c4fcd51f6b13510544d929e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7003ba8a0c4fcd51f6b13510544d929e");
        }
        if (this.b.get() != null) {
            return "fragment_" + this.b.get().getId();
        }
        return "fragment_scheme";
    }

    @Override // com.sankuai.titans.protocol.services.IContainerAdapter
    public final ITitleBar getTitleBar(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53ce143f8c7192bf51a0c4db952c9cb2", RobustBitConfig.DEFAULT_VALUE) ? (ITitleBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53ce143f8c7192bf51a0c4db952c9cb2") : super.getTitleBar(context);
    }

    @Override // com.sankuai.titans.protocol.services.IContainerAdapter
    public final Map<String, Object> getBridgeInterfaces(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "345577cf2c2f5e33b76baee427b138eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "345577cf2c2f5e33b76baee427b138eb");
        }
        a aVar = this.b.get();
        if (aVar == null) {
            return super.getBridgeInterfaces(context);
        }
        if (!aVar.c()) {
            return super.getBridgeInterfaces(context);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(MRNWebViewModule.MODULE_NAME, new f(aVar));
        return hashMap;
    }
}
