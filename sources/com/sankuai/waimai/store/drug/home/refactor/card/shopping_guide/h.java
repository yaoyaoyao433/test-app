package com.sankuai.waimai.store.drug.home.refactor.card.shopping_guide;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static void a(String str, @NonNull BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {str, baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebd9b5f907594e3939fdacef7df0c48f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebd9b5f907594e3939fdacef7df0c48f");
        } else if (t.a(str) || "mach".equals(baseModuleDesc.nativeId)) {
        } else {
            baseModuleDesc.nativeId = "mach";
            baseModuleDesc.moduleId = ConfigInfo.MODULE_DRUG_HOME_SHOPPING_NATIVE_TO_MACH;
            baseModuleDesc.templateId = str;
        }
    }
}
