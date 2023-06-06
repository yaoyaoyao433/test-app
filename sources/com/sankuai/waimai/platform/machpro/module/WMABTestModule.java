package com.sankuai.waimai.platform.machpro.module;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.xm.im.message.bean.Message;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMABTestModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public WMABTestModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c2ee8c7e11957df439b6f0bf0fe86ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c2ee8c7e11957df439b6f0bf0fe86ec");
        }
    }

    @JSMethod(methodName = "getStrategy")
    public MachMap getStrategy(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95e3378f34544f8dad2626901a3469d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95e3378f34544f8dad2626901a3469d6");
        }
        ABStrategy strategy = ABTestManager.getInstance().getStrategy(str, null);
        if (strategy != null) {
            MachMap machMap = new MachMap();
            machMap.put(Message.GROUP_NAME, strategy.groupName);
            machMap.put("expName", strategy.expName);
            machMap.put("sceneName", strategy.sceneName);
            machMap.put("modelName", strategy.modelName);
            machMap.put("configName", strategy.configName);
            machMap.put(Message.GROUP_NAME, strategy.configInfo);
            return machMap;
        }
        return null;
    }
}
