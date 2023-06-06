package com.dianping.gcmrnmodule.managers;

import com.dianping.shield.dynamic.utils.DMViewUtils;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = "MRNModuleMarginManager")
/* loaded from: classes.dex */
public class MRNModuleMarginManager extends BaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MRNModuleMarginManager";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c22932b9966d1a74d4fb2dbc0bb939f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c22932b9966d1a74d4fb2dbc0bb939f");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("defaultLeftMargin", Integer.valueOf(DMViewUtils.getDefaultAutoMargin()));
        hashMap.put("defaultRightMargin", Integer.valueOf(DMViewUtils.getDefaultAutoMargin()));
        hashMap.put("arrowDefaultRightMargin", 7);
        hashMap.put("arrowExtraRightMargin", Integer.valueOf(DMViewUtils.getDefaultAutoMargin() + 7));
        return hashMap;
    }
}
