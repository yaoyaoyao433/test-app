package com.meituan.android.ptcommonim.model;

import android.support.annotation.Keep;
import com.meituan.android.ptcommonim.cardrender.model.MachInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class TemplateInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public MachInfo machDetail;
    public String templateType;

    public static MachInfo getModuleMachInfo(List<TemplateInfo> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ed67f406aa4d12e2c968fd0358f7c30", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ed67f406aa4d12e2c968fd0358f7c30");
        }
        if (!CollectionUtils.isEmpty(list)) {
            for (TemplateInfo templateInfo : list) {
                if (templateInfo != null && str != null && str.equalsIgnoreCase(templateInfo.templateType)) {
                    return templateInfo.machDetail;
                }
            }
        }
        return null;
    }
}
