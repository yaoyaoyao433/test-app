package com.meituan.android.common.aidata.feature.repo;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.feature.GetFeatureRequest;
import com.meituan.android.common.aidata.feature.IFeatureListener;
import com.meituan.android.common.aidata.feature.UpdateFeatureRequest;
import com.meituan.android.common.aidata.feature.repo.mem.MemFeatureTable;
import com.meituan.android.common.aidata.feature.utils.AiFeatureListenerUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FeatureTable implements IFeatureTable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private MemFeatureTable mMemTable;
    private String mTableName;

    public FeatureTable(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8304e97d2f808d902a6360003b396a73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8304e97d2f808d902a6360003b396a73");
            return;
        }
        this.mTableName = str;
        this.mMemTable = new MemFeatureTable(str);
    }

    @Override // com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public Map<String, List<ResultRow>> getFeature(@Nullable GetFeatureRequest getFeatureRequest) {
        Object[] objArr = {getFeatureRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edefd9682b5b8aa44ebc11b359a82e90", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edefd9682b5b8aa44ebc11b359a82e90") : this.mMemTable.getFeature(getFeatureRequest);
    }

    @Override // com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public void getFeature(@Nullable List<GetFeatureRequest> list, @Nullable IFeatureListener iFeatureListener) {
        Object[] objArr = {list, iFeatureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62eb8c705ebe6c8c840b69569fe0e93e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62eb8c705ebe6c8c840b69569fe0e93e");
        } else if (list != null && list.size() > 0) {
            this.mMemTable.getFeature(list, iFeatureListener);
        } else {
            AiFeatureListenerUtil.callFailed(iFeatureListener, new Exception("config is null"));
        }
    }

    @Override // com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public void getFeature(@Nullable GetFeatureRequest getFeatureRequest, @Nullable IFeatureListener iFeatureListener) {
        Object[] objArr = {getFeatureRequest, iFeatureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4eb665023652f1ba232ea698aa84c77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4eb665023652f1ba232ea698aa84c77");
        } else if (getFeatureRequest != null) {
            this.mMemTable.getFeature(getFeatureRequest, iFeatureListener);
        } else {
            AiFeatureListenerUtil.callFailed(iFeatureListener, new Exception("config is null"));
        }
    }

    @Override // com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public String updateFeature(@Nullable UpdateFeatureRequest updateFeatureRequest) {
        Object[] objArr = {updateFeatureRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73df1636decb0d53c1435eef3af57c37", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73df1636decb0d53c1435eef3af57c37") : this.mMemTable.updateFeature(updateFeatureRequest);
    }

    @Override // com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public void replaceFeature(@Nullable UpdateFeatureRequest updateFeatureRequest) {
        Object[] objArr = {updateFeatureRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f035e6e48d1f9b9425c452d2daced7bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f035e6e48d1f9b9425c452d2daced7bd");
        } else {
            this.mMemTable.replaceFeature(updateFeatureRequest);
        }
    }

    @Override // com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public void removeFeature(@Nullable UpdateFeatureRequest updateFeatureRequest) {
        Object[] objArr = {updateFeatureRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "352283409cd29527e059653e81f7a87b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "352283409cd29527e059653e81f7a87b");
        } else {
            this.mMemTable.removeFeature(updateFeatureRequest);
        }
    }

    @Override // com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public void clearAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b52a5de3dbb05fb74819a8956eea2069", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b52a5de3dbb05fb74819a8956eea2069");
        } else {
            this.mMemTable.clearAll();
        }
    }

    @Override // com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public String getTableName() {
        return this.mTableName;
    }
}
