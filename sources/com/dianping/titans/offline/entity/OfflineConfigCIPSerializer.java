package com.dianping.titans.offline.entity;

import com.dianping.titans.offline.util.GsonProvider;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.ag;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class OfflineConfigCIPSerializer implements ag<OfflineConfig> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.android.cipstorage.ag
    public OfflineConfig deserializeFromString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a92a24a9959bcb57a27854583d1c78de", RobustBitConfig.DEFAULT_VALUE)) {
            return (OfflineConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a92a24a9959bcb57a27854583d1c78de");
        }
        try {
            return (OfflineConfig) GsonProvider.getGson().fromJson(str, new TypeToken<OfflineConfig>() { // from class: com.dianping.titans.offline.entity.OfflineConfigCIPSerializer.1
                public static ChangeQuickRedirect changeQuickRedirect;
            }.getType());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cipstorage.ag
    public String serializeAsString(OfflineConfig offlineConfig) {
        Object[] objArr = {offlineConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03eb500dd73b69cb313d61bf6b794cfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03eb500dd73b69cb313d61bf6b794cfb");
        }
        try {
            return GsonProvider.getGson().toJson(offlineConfig);
        } catch (Exception unused) {
            return null;
        }
    }
}
