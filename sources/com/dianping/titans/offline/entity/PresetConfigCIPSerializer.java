package com.dianping.titans.offline.entity;

import com.dianping.titans.offline.util.GsonProvider;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.ag;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PresetConfigCIPSerializer implements ag<PresetConfig> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.android.cipstorage.ag
    public PresetConfig deserializeFromString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "467a86dff07e21cf2b1fea2a73bed86c", RobustBitConfig.DEFAULT_VALUE)) {
            return (PresetConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "467a86dff07e21cf2b1fea2a73bed86c");
        }
        try {
            return (PresetConfig) GsonProvider.getGson().fromJson(str, new TypeToken<PresetConfig>() { // from class: com.dianping.titans.offline.entity.PresetConfigCIPSerializer.1
                public static ChangeQuickRedirect changeQuickRedirect;
            }.getType());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.meituan.android.cipstorage.ag
    public String serializeAsString(PresetConfig presetConfig) {
        Object[] objArr = {presetConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d93c927dc099aad8edfb211d2858ce23", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d93c927dc099aad8edfb211d2858ce23");
        }
        try {
            return GsonProvider.getGson().toJson(presetConfig);
        } catch (Exception unused) {
            return null;
        }
    }
}
