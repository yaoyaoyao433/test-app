package com.meituan.android.common.aidata.feature;

import android.text.TextUtils;
import com.meituan.android.common.aidata.feature.repo.FeatureTable;
import com.meituan.android.common.aidata.feature.repo.IFeatureTable;
import com.meituan.android.common.aidata.feature.repo.TableSelector;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AbsFeatureManager implements IFeatureManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected static ConcurrentHashMap<String, IFeatureTable> mFeatureTableSet;

    static {
        ConcurrentHashMap<String, IFeatureTable> concurrentHashMap = new ConcurrentHashMap<>();
        mFeatureTableSet = concurrentHashMap;
        concurrentHashMap.put(TableSelector.TABLE_NAME_AI_GLOBAL, new FeatureTable(TableSelector.TABLE_NAME_AI_GLOBAL));
    }

    public IFeatureTable getFeatureTable(AbsFeatureRequest absFeatureRequest) {
        Object[] objArr = {absFeatureRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a22e901dd9a0ee3bd96131abde31d82c", RobustBitConfig.DEFAULT_VALUE)) {
            return (IFeatureTable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a22e901dd9a0ee3bd96131abde31d82c");
        }
        if (absFeatureRequest == null || TextUtils.isEmpty(TableSelector.getTable(absFeatureRequest))) {
            return null;
        }
        return mFeatureTableSet.get(TableSelector.getTable(absFeatureRequest));
    }
}
