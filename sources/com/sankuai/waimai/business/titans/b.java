package com.sankuai.waimai.business.titans;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.support.annotation.NonNull;
import com.dianping.monitor.impl.m;
import com.dianping.titans.offline.OfflineInitConfig;
import com.dianping.titans.utils.TitansReporter;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.titans.StorageManager;
import com.sankuai.titans.adapter.base.IServiceManagerConfig;
import com.sankuai.titans.adapter.base.TitansServiceManager;
import com.sankuai.titans.adapter.base.observers.jsinject.JsInjectPlugin;
import com.sankuai.titans.adapter.base.observers.tail.BaseTailPlugin;
import com.sankuai.titans.adapter.base.observers.top.BaseTopPlugin;
import com.sankuai.titans.base.titlebar.BaseTitleBar;
import com.sankuai.titans.base.webkit.WebKitWebView;
import com.sankuai.titans.config.Config;
import com.sankuai.titans.config.ConfigManager;
import com.sankuai.titans.jsbridges.base.uiextensions.BaseTitleButtonJsHandler;
import com.sankuai.titans.live.video.VideoLivePlugin;
import com.sankuai.titans.offline.titans.adapter.plugin.TitansOfflinePlugin;
import com.sankuai.titans.protocol.adaptor.CookieChangeListener;
import com.sankuai.titans.protocol.adaptor.IAppTitansInfo;
import com.sankuai.titans.protocol.adaptor.IAppTitansPlugin;
import com.sankuai.titans.protocol.adaptor.IFileAccess;
import com.sankuai.titans.protocol.adaptor.ITitansAppAdaptor;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.lifecycle.annotation.TitansPlugin;
import com.sankuai.titans.protocol.services.ICookieService;
import com.sankuai.titans.protocol.services.IServiceManager;
import com.sankuai.titans.protocol.utils.AppUtils;
import com.sankuai.titans.protocol.webcompat.IWebView;
import com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarElementEntity;
import com.sankuai.titans.protocol.webcompat.elements.DynamicTitleBarEntity;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBar;
import com.sankuai.titans.proxy.localId.LocalIdPlugin;
import com.sankuai.waimai.business.knb.webview.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements ITitansAppAdaptor {
    public static ChangeQuickRedirect a;
    private static final DynamicTitleBarEntity c;
    private final TitansServiceManager b;
    private final Context d;
    private final List<ITitansPlugin> e;
    private final List<ITitansPlugin> f;
    private final Set<String> g;
    private final IAppTitansInfo h;

    public static /* synthetic */ String a(b bVar, Context context, String str, String str2) {
        Object[] objArr = {context, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "bcd808be09e0465cc17f6662c2d838ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "bcd808be09e0465cc17f6662c2d838ae");
        }
        String value = StorageManager.getInstance(context).getValue(str);
        if (value != null) {
            return value;
        }
        return null;
    }

    static {
        DynamicTitleBarEntity dynamicTitleBarEntity = new DynamicTitleBarEntity();
        c = dynamicTitleBarEntity;
        dynamicTitleBarEntity.setHeight(48);
        c.setBorderWidth(0);
        DynamicTitleBarElementEntity dynamicTitleBarElementEntity = new DynamicTitleBarElementEntity();
        dynamicTitleBarElementEntity.setName("LL");
        dynamicTitleBarElementEntity.setType("image");
        dynamicTitleBarElementEntity.setContent(BaseTitleButtonJsHandler.ACTION_TYPE_BACK);
        dynamicTitleBarElementEntity.setAction("back");
        dynamicTitleBarElementEntity.setWidth(0.15d);
        dynamicTitleBarElementEntity.setPaddingTop(12);
        dynamicTitleBarElementEntity.setPaddingBottom(12);
        DynamicTitleBarElementEntity dynamicTitleBarElementEntity2 = new DynamicTitleBarElementEntity();
        dynamicTitleBarElementEntity2.setName("main");
        dynamicTitleBarElementEntity2.setType("text");
        dynamicTitleBarElementEntity2.setPrimary(true);
        dynamicTitleBarElementEntity2.setContent("美团外卖");
        dynamicTitleBarElementEntity2.setTextAlign("center");
        dynamicTitleBarElementEntity2.setFontSize(18);
        dynamicTitleBarElementEntity2.setFontColor("#222222");
        DynamicTitleBarElementEntity dynamicTitleBarElementEntity3 = new DynamicTitleBarElementEntity();
        dynamicTitleBarElementEntity3.setName("RR");
        dynamicTitleBarElementEntity3.setType("image");
        dynamicTitleBarElementEntity3.setContent("");
        dynamicTitleBarElementEntity3.setAction("more");
        dynamicTitleBarElementEntity3.setWidth(0.15d);
        dynamicTitleBarElementEntity3.setPaddingTop(12);
        dynamicTitleBarElementEntity3.setPaddingBottom(12);
        c.setElements(new DynamicTitleBarElementEntity[]{dynamicTitleBarElementEntity, dynamicTitleBarElementEntity2, dynamicTitleBarElementEntity3});
    }

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f959125c6178b0799b9f19218c19d34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f959125c6178b0799b9f19218c19d34");
            return;
        }
        this.g = new c().getPrefixWhiteSet();
        this.h = new a();
        this.d = context;
        BaseTopPlugin baseTopPlugin = new BaseTopPlugin();
        JsInjectPlugin jsInjectPlugin = new JsInjectPlugin();
        TitansOfflinePlugin titansOfflinePlugin = new TitansOfflinePlugin(new OfflineInitConfig() { // from class: com.sankuai.waimai.business.titans.b.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.titans.offline.OfflineInitConfig
            public final int getCatId() {
                return 11;
            }

            @Override // com.dianping.titans.offline.OfflineInitConfig
            public final String getUUID() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "679bc4b68332a5731427462cc281102b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "679bc4b68332a5731427462cc281102b") : com.sankuai.waimai.business.knb.services.a.a();
            }

            @Override // com.dianping.titans.offline.OfflineInitConfig
            public final String getUserId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1953d1934aeca715679390deac2d2fb3", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1953d1934aeca715679390deac2d2fb3");
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.titans.utils.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "93389cab2d2cbcb1bf696c56865bfe87", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "93389cab2d2cbcb1bf696c56865bfe87");
                }
                User a2 = com.sankuai.waimai.business.knb.util.b.a(com.meituan.android.singleton.b.a);
                return a2 == null ? "" : String.valueOf(a2.id);
            }

            @Override // com.dianping.titans.offline.OfflineInitConfig
            public final String getChannel() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34636dfcc471dd46c791409881c49546", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34636dfcc471dd46c791409881c49546") : com.sankuai.waimai.platform.b.A().d();
            }

            @Override // com.dianping.titans.offline.OfflineInitConfig
            public final boolean isDebug() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cae7be9599cc12586c737953b99ebd8b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cae7be9599cc12586c737953b99ebd8b")).booleanValue() : b.this.h.isDebugMode();
            }

            @Override // com.dianping.titans.offline.OfflineInitConfig
            public final String getAppId() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b42d61ae9721dda0935350d1d5b6807", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b42d61ae9721dda0935350d1d5b6807") : b.this.h.titansAppId();
            }
        });
        LocalIdPlugin localIdPlugin = new LocalIdPlugin();
        this.e = new ArrayList();
        this.e.add(baseTopPlugin);
        this.e.add(jsInjectPlugin);
        b();
        this.e.add(titansOfflinePlugin);
        this.e.add(localIdPlugin);
        BaseTailPlugin baseTailPlugin = new BaseTailPlugin();
        this.f = new ArrayList();
        this.f.add(baseTailPlugin);
        this.b = new C0874b(context);
    }

    @Override // com.sankuai.titans.protocol.adaptor.ITitansAppAdaptor
    public final IWebView getIWebView(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eebc10b8467e7c0a3ae79d76ad3cea7d", RobustBitConfig.DEFAULT_VALUE) ? (IWebView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eebc10b8467e7c0a3ae79d76ad3cea7d") : new WebKitWebView(context);
    }

    @Override // com.sankuai.titans.protocol.adaptor.ITitansAppAdaptor
    public final boolean canWebViewDownload(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5593c2b1d4edfaf1508ede41e4ad60ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5593c2b1d4edfaf1508ede41e4ad60ae")).booleanValue();
        }
        try {
            m mVar = new m(KNBWebManager.getCatAppId(), this.d, GetUUID.getInstance().getUUID(this.d));
            mVar.a("appVersion", this.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 0).versionName);
            mVar.a("osVersion", Build.VERSION.RELEASE);
            mVar.a("url", str);
            PackageInfo packageInfo = this.d.getPackageManager().getPackageInfo("com.google.android.webview", 0);
            mVar.a("webviewVersion", packageInfo == null ? "未知" : packageInfo.versionName);
            mVar.a();
        } catch (Exception e) {
            TitansReporter.webviewLog("onDownloadStart", "cat exception:" + e.getMessage());
        }
        Config a2 = a();
        List<String> list = (a2 == null || a2.deploy == null || a2.deploy.white == null) ? Collections.EMPTY_LIST : a2.deploy.white;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (str.contains(list.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sankuai.titans.protocol.adaptor.ITitansAppAdaptor
    public final IAppTitansPlugin getAppTitansPlugin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08b136cbfaf9c6f110f656f9ab0e3056", RobustBitConfig.DEFAULT_VALUE) ? (IAppTitansPlugin) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08b136cbfaf9c6f110f656f9ab0e3056") : new IAppTitansPlugin() { // from class: com.sankuai.waimai.business.titans.b.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.titans.protocol.adaptor.IAppTitansPlugin
            @NonNull
            public final List<ITitansPlugin> getTopPlugins() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f09f3df2af5c0d418ce56d12071ad26", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f09f3df2af5c0d418ce56d12071ad26");
                }
                List<String> blackList = ConfigManager.getConfig().plugin.getBlackList();
                ArrayList arrayList = new ArrayList();
                for (ITitansPlugin iTitansPlugin : b.this.e) {
                    String name = ((TitansPlugin) iTitansPlugin.getClass().getAnnotation(TitansPlugin.class)).name();
                    if (blackList == null || !blackList.contains(name)) {
                        arrayList.add(iTitansPlugin);
                    }
                }
                return arrayList;
            }

            @Override // com.sankuai.titans.protocol.adaptor.IAppTitansPlugin
            public final Map<String, ITitansPlugin> getBusinessPlugins() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f232aa853eb7a862618d82ec3349be1", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f232aa853eb7a862618d82ec3349be1");
                }
                List<String> blackList = ConfigManager.getConfig().plugin.getBlackList();
                HashMap hashMap = new HashMap();
                hashMap.put("imeituan://www.meituan.com/weblive", new VideoLivePlugin());
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String name = ((TitansPlugin) ((ITitansPlugin) entry.getValue()).getClass().getAnnotation(TitansPlugin.class)).name();
                    if (blackList == null || !blackList.contains(name)) {
                        hashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                return hashMap2;
            }

            @Override // com.sankuai.titans.protocol.adaptor.IAppTitansPlugin
            @NonNull
            public final List<ITitansPlugin> getTailPlugins() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be3ec3ae122c31a8cd6d575f7f58f267", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be3ec3ae122c31a8cd6d575f7f58f267");
                }
                List<String> blackList = ConfigManager.getConfig().plugin.getBlackList();
                ArrayList arrayList = new ArrayList();
                for (ITitansPlugin iTitansPlugin : b.this.f) {
                    String name = ((TitansPlugin) iTitansPlugin.getClass().getAnnotation(TitansPlugin.class)).name();
                    if (blackList == null || !blackList.contains(name)) {
                        arrayList.add(iTitansPlugin);
                    }
                }
                return arrayList;
            }
        };
    }

    @Override // com.sankuai.titans.protocol.adaptor.ITitansAppAdaptor
    public final DynamicTitleBarEntity getDynamicTitleBar() {
        return c;
    }

    @Override // com.sankuai.titans.protocol.adaptor.ITitansAppAdaptor
    @NonNull
    public final IServiceManager getServiceManager() {
        return this.b;
    }

    @Override // com.sankuai.titans.protocol.adaptor.ITitansAppAdaptor
    public final void onCookieChange(final CookieChangeListener cookieChangeListener) {
        Object[] objArr = {cookieChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18d9add2a34ae570e2e8e40455bf11fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18d9add2a34ae570e2e8e40455bf11fe");
            return;
        }
        Map<String, String> a2 = a(UserCenter.getInstance(this.d).getCookies());
        if (a2 != null) {
            cookieChangeListener.updateCookies(a2);
        }
        UserCenter.getInstance(this.d).addUpdateCookieListener(new UserCenter.a() { // from class: com.sankuai.waimai.business.titans.b.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.passport.UserCenter.a
            public final void a(List<Map<String, Object>> list) {
                Map<String, String> a3;
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe27cadc35d13846f5e0c1e333a892ce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe27cadc35d13846f5e0c1e333a892ce");
                } else if (list == null || list.size() == 0 || (a3 = b.this.a(list)) == null) {
                } else {
                    cookieChangeListener.updateCookies(a3);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(List<Map<String, Object>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc78e833f57e7e276364ab3dc59be537", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc78e833f57e7e276364ab3dc59be537");
        }
        if (list == null || list.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map<String, Object> map : list) {
            hashMap.put((String) map.get("name"), (String) map.get("value"));
        }
        return hashMap;
    }

    @Override // com.sankuai.titans.protocol.adaptor.ITitansAppAdaptor
    public final ITitleBar getTitleBar(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "753a04520c13918acde51847b531ae51", RobustBitConfig.DEFAULT_VALUE)) {
            return (ITitleBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "753a04520c13918acde51847b531ae51");
        }
        BaseTitleBar baseTitleBar = new BaseTitleBar(context);
        baseTitleBar.getTitleLLBtn().setTextColor(-16777216);
        baseTitleBar.getTitleLRBtn().setTextColor(-16777216);
        baseTitleBar.getTitleRLBtn().setTextColor(-16777216);
        baseTitleBar.getTitleRRBtn().setTextColor(-16777216);
        return baseTitleBar;
    }

    @Override // com.sankuai.titans.protocol.adaptor.ITitansAppAdaptor
    public final IAppTitansInfo getAppInfo() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Config a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c6ae3aa67391b068a5b03a766c78ddc", RobustBitConfig.DEFAULT_VALUE) ? (Config) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c6ae3aa67391b068a5b03a766c78ddc") : (Config) ConfigManager.getConfig("webview", Config.class, new Config());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "411b55d385d7abba35293c155f50b2f0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "411b55d385d7abba35293c155f50b2f0")).booleanValue() : com.sankuai.waimai.foundation.core.a.b();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.titans.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0874b extends TitansServiceManager {
        public static ChangeQuickRedirect a;

        public C0874b(Context context) {
            super(context.getApplicationContext(), new IServiceManagerConfig() { // from class: com.sankuai.waimai.business.titans.b.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.titans.adapter.base.IServiceManagerConfig
                public final String appVersion() {
                    Object[] objArr = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect = a;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0aa30c69c53df358d039791b1cdf7a2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0aa30c69c53df358d039791b1cdf7a2") : com.sankuai.waimai.platform.b.A().i();
                }

                @Override // com.sankuai.titans.adapter.base.IServiceManagerConfig
                public final String appToken() {
                    Object[] objArr = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect = a;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd4f9be569047b027cdd835d88422ac1", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd4f9be569047b027cdd835d88422ac1");
                    }
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5cb94bb101382db8eddb27309c1c84cb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5cb94bb101382db8eddb27309c1c84cb")).booleanValue() : b.this.b() ? "5a583961502db3692d937b4b" : com.sankuai.meituan.takeoutnew.a.g;
                }

                @Override // com.sankuai.titans.adapter.base.IServiceManagerConfig
                public final String apkHash() {
                    Object[] objArr = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect = a;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83659c8a0918e5ea12af7267e05ebd01", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83659c8a0918e5ea12af7267e05ebd01") : com.sankuai.waimai.platform.b.A().G();
                }

                @Override // com.sankuai.titans.adapter.base.IServiceManagerConfig
                public final String apkChannel() {
                    Object[] objArr = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect = a;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0e5480b9bcb2488d88f60139c485d5e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0e5480b9bcb2488d88f60139c485d5e") : com.sankuai.waimai.platform.b.A().d();
                }

                @Override // com.sankuai.titans.adapter.base.IServiceManagerConfig
                public final String appBuildVersion() {
                    Object[] objArr = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect = a;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1afdf8880b77b5e7978ba6a3cdd28863", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1afdf8880b77b5e7978ba6a3cdd28863") : String.valueOf(com.sankuai.waimai.platform.b.A().k);
                }

                @Override // com.sankuai.titans.adapter.base.IServiceManagerConfig
                public final boolean isDebugMode() {
                    Object[] objArr = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect = a;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0f4ea3739b5ebe7c651390aa03b05f6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0f4ea3739b5ebe7c651390aa03b05f6")).booleanValue() : b.this.b();
                }

                @Override // com.sankuai.titans.adapter.base.IServiceManagerConfig
                public final String UUID() {
                    Object[] objArr = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect = a;
                    return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "748db2dda4ceb2660bdfe88f672318e3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "748db2dda4ceb2660bdfe88f672318e3") : com.sankuai.waimai.platform.b.A().c();
                }
            });
            Object[] objArr = {b.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cc5344b541af09cfd379f4d1de37b7d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cc5344b541af09cfd379f4d1de37b7d");
            }
        }

        @Override // com.sankuai.titans.adapter.base.TitansServiceManager, com.sankuai.titans.protocol.services.IServiceManager
        public final ICookieService getCookieService() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3059741cf1678ec30658239f27b3da52", RobustBitConfig.DEFAULT_VALUE) ? (ICookieService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3059741cf1678ec30658239f27b3da52") : new com.sankuai.waimai.business.titans.a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a implements IAppTitansInfo {
        public static ChangeQuickRedirect a;
        private final IFileAccess c;
        private final Set<String> d;

        @Override // com.sankuai.titans.protocol.adaptor.IAppTitansInfo
        public final String appName() {
            return "meituantakeout";
        }

        @Override // com.sankuai.titans.protocol.adaptor.IAppTitansInfo
        public final boolean usingSlowDraw() {
            return false;
        }

        private a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15189e5be0b8f9c4f62cecd49bfb2be9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15189e5be0b8f9c4f62cecd49bfb2be9");
                return;
            }
            this.c = new IFileAccess() { // from class: com.sankuai.waimai.business.titans.b.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.titans.protocol.adaptor.IFileAccess
                public final boolean isFileAccessAllowed() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cbd789a2206ebe49da010ee40124d450", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cbd789a2206ebe49da010ee40124d450")).booleanValue() : "1".equals(b.a(b.this, b.this.d, "isAllowFileAccess", null));
                }

                @Override // com.sankuai.titans.protocol.adaptor.IFileAccess
                public final boolean isFileAccessFromFileUrlsAllowed() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4cee591176c76cce9e9e9548621bae9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4cee591176c76cce9e9e9548621bae9")).booleanValue() : "1".equals(b.a(b.this, b.this.d, "isAllowFileAccessFromFileURLs", null));
                }

                @Override // com.sankuai.titans.protocol.adaptor.IFileAccess
                public final boolean isUniversalAccessFromFileURLSAllowed() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bfc9eec6ae97a882754e15a154491ab5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bfc9eec6ae97a882754e15a154491ab5")).booleanValue() : "1".equals(b.a(b.this, b.this.d, "isAllowUniversalAccessFromFileURLs", null));
                }
            };
            this.d = new HashSet();
        }

        @Override // com.sankuai.titans.protocol.adaptor.IAppTitansInfo
        public final IFileAccess getFileAccess() {
            return this.c;
        }

        @Override // com.sankuai.titans.protocol.adaptor.IAppTitansInfo
        public final boolean geolocationEnable() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d420c7c1f0ee18cca6dd68e382378aa1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d420c7c1f0ee18cca6dd68e382378aa1")).booleanValue() : b.this.a().switcher.allowGeolocation;
        }

        @Override // com.sankuai.titans.protocol.adaptor.IAppTitansInfo
        public final String titansAppId() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5d5d501be75a3d745774b4a4e9187b7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5d5d501be75a3d745774b4a4e9187b7") : isDebugMode() ? "10321" : "10320";
        }

        @Override // com.sankuai.titans.protocol.adaptor.IAppTitansInfo
        public final String appUa() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70d44847f83b374bad12d210b3aa1880", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70d44847f83b374bad12d210b3aa1880");
            }
            String packageName = AppUtils.getPackageName(b.this.d);
            String versionName = AppUtils.getVersionName(b.this.d);
            return "waimai/" + packageName + "/" + versionName;
        }

        @Override // com.sankuai.titans.protocol.adaptor.IAppTitansInfo
        public final Set<String> getSchemeWhiteSet() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad8e91eacb3175e5eb6d9a7270a508ed", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad8e91eacb3175e5eb6d9a7270a508ed") : b.this.g;
        }

        @Override // com.sankuai.titans.protocol.adaptor.IAppTitansInfo
        public final Set<String> CDNDomain() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6142697db5fd1cd686d76aafdb1c06ae", RobustBitConfig.DEFAULT_VALUE)) {
                return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6142697db5fd1cd686d76aafdb1c06ae");
            }
            if (this.d.size() == 0) {
                this.d.add(".meituan.net");
                this.d.add(".dpfile.com");
            }
            return this.d;
        }

        @Override // com.sankuai.titans.protocol.adaptor.IAppTitansInfo
        public final boolean isDebugMode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9f2238036993bcf9f5266a31651c30", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9f2238036993bcf9f5266a31651c30")).booleanValue() : b.this.b();
        }
    }
}
