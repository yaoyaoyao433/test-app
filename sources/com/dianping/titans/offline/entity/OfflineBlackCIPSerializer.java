package com.dianping.titans.offline.entity;

import com.dianping.titans.offline.util.GsonProvider;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.ag;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class OfflineBlackCIPSerializer implements ag<List<String>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.cipstorage.ag
    public List<String> deserializeFromString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2b86c8163c190e0283ad33ca50149e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2b86c8163c190e0283ad33ca50149e8");
        }
        try {
            return (List) GsonProvider.getGson().fromJson(str, new TypeToken<List<String>>() { // from class: com.dianping.titans.offline.entity.OfflineBlackCIPSerializer.1
                public static ChangeQuickRedirect changeQuickRedirect;
            }.getType());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cipstorage.ag
    public String serializeAsString(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ce722f90a59f5aa040705c2bfd19126", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ce722f90a59f5aa040705c2bfd19126");
        }
        try {
            return GsonProvider.getGson().toJson(list);
        } catch (Exception unused) {
            return null;
        }
    }
}
