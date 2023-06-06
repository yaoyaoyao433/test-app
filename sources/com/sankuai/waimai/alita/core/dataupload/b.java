package com.sankuai.waimai.alita.core.dataupload;

import android.support.annotation.NonNull;
import com.meituan.android.common.aidata.AIData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80e12f508b57efef0edcea571c6bd0c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80e12f508b57efef0edcea571c6bd0c9");
        } else {
            AIData.writeUpstreamDataWithType(AIData.AIDataUpStreamType.FeatureAndLabel, map);
        }
    }
}
