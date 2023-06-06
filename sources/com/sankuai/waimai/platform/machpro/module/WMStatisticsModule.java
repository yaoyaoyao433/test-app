package com.sankuai.waimai.platform.machpro.module;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSettingEx;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.machpro.util.a;
import com.sankuai.waimai.machpro.util.b;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMStatisticsModule extends MPModule {
    private static final String BUNDLE_NAME = "mach_pro_bundle_name";
    private static final String BUNDLE_VERSION = "mach_pro_bundle_version";
    private static final String CUSTOM = "custom";
    private static final String MP_CUSTOM = "mach_pro_custom";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mCid;
    private Object mPageInfoKey;

    public WMStatisticsModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca946e350f1cb8792bb171dad71ad528", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca946e350f1cb8792bb171dad71ad528");
        }
    }

    @JSMethod(methodName = "pv")
    public void pv(String str, MachMap machMap, Object obj) {
        Object[] objArr = {str, machMap, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "329d1128013b7fe6c9896013ac152be5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "329d1128013b7fe6c9896013ac152be5");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (obj == null) {
                obj = getMachContext() != null ? getMachContext().getContext() : null;
            }
            if (obj == null) {
                return;
            }
            this.mPageInfoKey = obj;
            this.mCid = str;
            try {
                HashMap<String, Object> b = b.b(machMap);
                if (getMachContext().getBundle() != null) {
                    if (b == null) {
                        b = new HashMap<>();
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(BUNDLE_NAME, getMachContext().getBundle().d);
                    hashMap.put(BUNDLE_VERSION, getMachContext().getBundle().e);
                    b.put(MP_CUSTOM, hashMap);
                    Object obj2 = b.get("custom");
                    if (obj2 instanceof HashMap) {
                        Map map = (Map) obj2;
                        map.put(BUNDLE_NAME, getMachContext().getBundle().d);
                        map.put(BUNDLE_VERSION, getMachContext().getBundle().e);
                    } else if (obj2 == null) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(BUNDLE_NAME, getMachContext().getBundle().d);
                        hashMap2.put(BUNDLE_VERSION, getMachContext().getBundle().e);
                        b.put("custom", hashMap2);
                    }
                }
                Statistics.getChannel("waimai").writePageView(AppUtil.generatePageInfoKey(obj), str, b);
            } catch (Exception e) {
                a.a("WMStatisticsModule pv error" + e.getMessage());
            }
        }
    }

    @JSMethod(methodName = AdvanceSettingEx.PRIORITY_DISPLAY)
    public void pd(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "904027273340ee68692efc50e7c3941b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "904027273340ee68692efc50e7c3941b");
            return;
        }
        if (obj == null) {
            obj = this.mPageInfoKey;
        }
        if (obj == null) {
            return;
        }
        if (str == null) {
            str = this.mCid;
        }
        if (str == null) {
            return;
        }
        JudasManualManager.a(str, 1, obj, null).b();
    }

    @JSMethod(methodName = Constants.EventType.VIEW)
    public void view(String str, String str2, MachMap machMap) {
        Object[] objArr = {str, str2, machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0b37be241877cd88e41005735caae2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0b37be241877cd88e41005735caae2b");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            Context context = getMachContext() != null ? getMachContext().getContext() : null;
            try {
                HashMap<String, Object> b = b.b(machMap);
                if (getMachContext() != null && getMachContext().getBundle() != null) {
                    if (b == null) {
                        b = new HashMap<>();
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(BUNDLE_NAME, getMachContext().getBundle().d);
                    hashMap.put(BUNDLE_VERSION, getMachContext().getBundle().e);
                    b.put(MP_CUSTOM, hashMap);
                    Object obj = b.get("custom");
                    if (obj instanceof HashMap) {
                        Map map = (Map) obj;
                        map.put(BUNDLE_NAME, getMachContext().getBundle().d);
                        map.put(BUNDLE_VERSION, getMachContext().getBundle().e);
                    } else if (obj == null) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(BUNDLE_NAME, getMachContext().getBundle().d);
                        hashMap2.put(BUNDLE_VERSION, getMachContext().getBundle().e);
                        b.put("custom", hashMap2);
                    }
                }
                JudasManualManager.b(str2, str, AppUtil.generatePageInfoKey(context)).a((Map<String, Object>) b).a();
            } catch (Exception e) {
                a.a("WMStatisticsModule view error" + e.getMessage());
            }
        }
    }

    @JSMethod(methodName = "viewL")
    public void viewL(String str, String str2, MachMap machMap) {
        Object[] objArr = {str, str2, machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d480caf05fcf024e3270420dde20a72a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d480caf05fcf024e3270420dde20a72a");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            HashMap<String, Object> b = b.b(machMap);
            JudasManualManager.a b2 = JudasManualManager.b(str2, str, AppUtil.generatePageInfoKey(getMachContext() != null ? getMachContext().getContext() : null));
            b2.c = true;
            b2.a((Map<String, Object>) b).a();
        }
    }

    @JSMethod(methodName = "click")
    public void click(String str, String str2, MachMap machMap) {
        Object[] objArr = {str, str2, machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea081482ed91dc9bee7fe5b22c50d4be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea081482ed91dc9bee7fe5b22c50d4be");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            Context context = getMachContext() != null ? getMachContext().getContext() : null;
            try {
                HashMap<String, Object> b = b.b(machMap);
                if (getMachContext() != null && getMachContext().getBundle() != null) {
                    if (b == null) {
                        b = new HashMap<>();
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(BUNDLE_NAME, getMachContext().getBundle().d);
                    hashMap.put(BUNDLE_VERSION, getMachContext().getBundle().e);
                    b.put(MP_CUSTOM, hashMap);
                    Object obj = b.get("custom");
                    if (obj instanceof HashMap) {
                        Map map = (Map) obj;
                        map.put(BUNDLE_NAME, getMachContext().getBundle().d);
                        map.put(BUNDLE_VERSION, getMachContext().getBundle().e);
                    } else if (obj == null) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(BUNDLE_NAME, getMachContext().getBundle().d);
                        hashMap2.put(BUNDLE_VERSION, getMachContext().getBundle().e);
                        b.put("custom", hashMap2);
                    }
                }
                JudasManualManager.a(str2, str, AppUtil.generatePageInfoKey(context)).a((Map<String, Object>) b).a();
            } catch (Exception e) {
                a.a("WMStatisticsModule click error" + e.getMessage());
            }
        }
    }

    @JSMethod(methodName = "setTag")
    public void setTag(String str, MachMap machMap) {
        Object[] objArr = {str, machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e2ea0639b17402788545064816eb407", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e2ea0639b17402788545064816eb407");
        } else if (TextUtils.isEmpty(str) || machMap == null) {
        } else {
            Statistics.getChannel().updateTag(str, b.b(machMap));
        }
    }
}
