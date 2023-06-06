package com.sankuai.meituan.skyeye.library.core;

import android.support.annotation.Keep;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.URI;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class RuleParserImpl {
    public static ChangeQuickRedirect a;
    private volatile boolean b;
    private volatile Map<String, Boolean> c;
    private String d;
    private HashSet<String> e;
    private HashSet<String> f;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public class MonitorConfigBeanWrapper {
        public static ChangeQuickRedirect changeQuickRedirect;
        public MonitorConfigBean data;

        public MonitorConfigBeanWrapper() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public class MonitorConfigBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean enabled;
        public Module moduleList;

        public MonitorConfigBean() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public class Module {
        public static ChangeQuickRedirect changeQuickRedirect;
        public ModuleEnabled dataConvertMonitorEnabled;
        public ImageDownloadMonitorEnabled imageDownloadMonitorEnabled;
        public NetworkRequestMonitorModuleEnabled networkRequestMonitorEnabled;
        public ModuleEnabled otherBusinessMonitorEnabled;
        public ModuleEnabled protocolJumpMonitorEnabled;

        public Module() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public class ModuleEnabled {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Boolean enabled;
        public Map<String, Boolean> versionsControl;

        public ModuleEnabled() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public class ImageDownloadMonitorEnabled extends ModuleEnabled {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Long imageSizeThreshold;

        public ImageDownloadMonitorEnabled() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public class NetworkRequestMonitorModuleEnabled extends ModuleEnabled {
        public static ChangeQuickRedirect changeQuickRedirect;
        public HashSet<String> networkFilterHostList;
        public HashSet<String> networkFilterUrlList;

        public NetworkRequestMonitorModuleEnabled() {
            super();
        }
    }

    public RuleParserImpl(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edb43547e7b2aa14e66cbb6591575371", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edb43547e7b2aa14e66cbb6591575371");
            return;
        }
        this.b = false;
        this.c = null;
        this.d = str;
        a(str2);
    }

    public final void a(String str) {
        MonitorConfigBeanWrapper monitorConfigBeanWrapper;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "707179010058043f9c011f2c0be49421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "707179010058043f9c011f2c0be49421");
            return;
        }
        try {
            monitorConfigBeanWrapper = (MonitorConfigBeanWrapper) new Gson().fromJson(str, (Class<Object>) MonitorConfigBeanWrapper.class);
        } catch (Exception unused) {
            monitorConfigBeanWrapper = null;
        }
        MonitorConfigBean monitorConfigBean = monitorConfigBeanWrapper != null ? monitorConfigBeanWrapper.data : null;
        a(monitorConfigBean);
        b(monitorConfigBean);
    }

    private void a(MonitorConfigBean monitorConfigBean) {
        Object[] objArr = {monitorConfigBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eed98e208b2b27d36b96d92ce3c48d79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eed98e208b2b27d36b96d92ce3c48d79");
        } else if (monitorConfigBean == null) {
            this.b = false;
        } else {
            this.b = monitorConfigBean.enabled;
            this.c = new ConcurrentHashMap();
            if (monitorConfigBean.moduleList == null) {
                return;
            }
            Module module = monitorConfigBean.moduleList;
            if (module.imageDownloadMonitorEnabled != null) {
                a("image_download", module.imageDownloadMonitorEnabled, this.b);
            }
            if (module.networkRequestMonitorEnabled != null) {
                a("network_request", module.networkRequestMonitorEnabled, this.b);
            }
            if (module.dataConvertMonitorEnabled != null) {
                a("data_convert", module.dataConvertMonitorEnabled, this.b);
            }
            if (module.protocolJumpMonitorEnabled != null) {
                a("protocol_jump", module.protocolJumpMonitorEnabled, this.b);
            }
            if (module.otherBusinessMonitorEnabled != null) {
                a("other_business", module.otherBusinessMonitorEnabled, this.b);
            }
        }
    }

    private void a(String str, ModuleEnabled moduleEnabled, boolean z) {
        Object[] objArr = {str, moduleEnabled, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d1e6107eb853bf9d8d70198855930d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d1e6107eb853bf9d8d70198855930d7");
            return;
        }
        try {
            this.c.put(str, Boolean.valueOf(z));
            if (moduleEnabled.enabled != null) {
                this.c.put(str, moduleEnabled.enabled);
            }
            if (moduleEnabled.versionsControl == null || moduleEnabled.versionsControl.size() <= 0 || moduleEnabled.versionsControl.get(this.d) == null) {
                return;
            }
            this.c.put(str, moduleEnabled.versionsControl.get(this.d));
        } catch (Exception unused) {
        }
    }

    public final boolean a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4f2367029d43f6ab88f73c4415c10b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4f2367029d43f6ab88f73c4415c10b4")).booleanValue();
        }
        try {
            if (this.c != null && this.c.get(str) != null) {
                return this.c.get(str).booleanValue();
            }
            return this.b;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e59dd5dd4dda64f739aa628e21ab68dd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e59dd5dd4dda64f739aa628e21ab68dd")).booleanValue();
        }
        try {
            URI uri = new URI(str);
            if (this.f != null && this.f.size() > 0) {
                if (this.f.contains(uri.getAuthority() + uri.getPath())) {
                    return false;
                }
            }
            if (this.e != null && this.e.size() > 0) {
                if (this.e.contains(uri.getAuthority())) {
                    return false;
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    private void b(MonitorConfigBean monitorConfigBean) {
        Object[] objArr = {monitorConfigBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16d37234eae9354111b37f92309ebdb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16d37234eae9354111b37f92309ebdb5");
            return;
        }
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("dreport.meituan.net");
        hashSet.add("appmock.sankuai.com");
        hashSet.add("portal-portm.meituan.com");
        hashSet.add("hreport.meituan.com");
        hashSet.add("report.meituan.com");
        HashSet<String> hashSet2 = new HashSet<>();
        if (monitorConfigBean == null || monitorConfigBean.moduleList == null) {
            this.e = hashSet;
            this.f = hashSet2;
            return;
        }
        Module module = monitorConfigBean.moduleList;
        if (module != null) {
            ImageDownloadMonitorEnabled imageDownloadMonitorEnabled = module.imageDownloadMonitorEnabled;
            if (imageDownloadMonitorEnabled != null && imageDownloadMonitorEnabled.imageSizeThreshold != null) {
                com.sankuai.meituan.skyeye.library.image.a.a(imageDownloadMonitorEnabled.imageSizeThreshold);
            }
            NetworkRequestMonitorModuleEnabled networkRequestMonitorModuleEnabled = module.networkRequestMonitorEnabled;
            if (networkRequestMonitorModuleEnabled != null) {
                hashSet.addAll(networkRequestMonitorModuleEnabled.networkFilterHostList);
                hashSet2.addAll(networkRequestMonitorModuleEnabled.networkFilterUrlList);
            }
        }
        this.e = hashSet;
        this.f = hashSet2;
    }
}
