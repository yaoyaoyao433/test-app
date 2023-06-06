package com.meituan.android.common.aidata.feature.repo.mem;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.entity.FeatureResult;
import com.meituan.android.common.aidata.feature.GetFeatureRequest;
import com.meituan.android.common.aidata.feature.IFeatureListener;
import com.meituan.android.common.aidata.feature.UpdateFeatureRequest;
import com.meituan.android.common.aidata.feature.repo.AbsFeatureTable;
import com.meituan.android.common.aidata.feature.utils.AiFeatureListenerUtil;
import com.meituan.android.common.aidata.feature.utils.AiFeatureUtil;
import com.meituan.android.common.aidata.feature.utils.CommaSplitUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MemFeatureTable extends AbsFeatureTable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, List<ResultRow>> mData;
    private String mTableName;

    public MemFeatureTable(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee4f09fad3cd391f10e8cb25d07f4ecf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee4f09fad3cd391f10e8cb25d07f4ecf");
            return;
        }
        this.mTableName = str;
        clearData();
    }

    @Override // com.meituan.android.common.aidata.feature.repo.AbsFeatureTable, com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public String getTableName() {
        return this.mTableName;
    }

    @Override // com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public Map<String, List<ResultRow>> getFeature(@Nullable GetFeatureRequest getFeatureRequest) {
        Object[] objArr = {getFeatureRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17d063208c2aac68760de637a5b238c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17d063208c2aac68760de637a5b238c8");
        }
        if (getFeatureRequest == null) {
            return null;
        }
        return AiFeatureUtil.selectFeature(getData(), getFeatureRequest);
    }

    @Override // com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public void getFeature(@Nullable List<GetFeatureRequest> list, @Nullable IFeatureListener iFeatureListener) {
        Object[] objArr = {list, iFeatureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9da5dfd1b0a6523e555e044292ca6daf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9da5dfd1b0a6523e555e044292ca6daf");
        } else if (list != null) {
            AiFeatureListenerUtil.callSuccess(iFeatureListener, new FeatureResult(AiFeatureUtil.selectFeature(getData(), list)));
        } else {
            AiFeatureListenerUtil.callFailed(iFeatureListener, new Exception("config is null"));
        }
    }

    @Override // com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public void getFeature(@Nullable GetFeatureRequest getFeatureRequest, @Nullable IFeatureListener iFeatureListener) {
        Object[] objArr = {getFeatureRequest, iFeatureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd9f6378dc35a11803ea6fe0861491a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd9f6378dc35a11803ea6fe0861491a0");
        } else if (getFeatureRequest != null) {
            AiFeatureListenerUtil.callSuccess(iFeatureListener, new FeatureResult(AiFeatureUtil.selectFeature(getData(), getFeatureRequest)));
        } else {
            AiFeatureListenerUtil.callFailed(iFeatureListener, new Exception("config is null"));
        }
    }

    @Override // com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public String updateFeature(@Nullable UpdateFeatureRequest updateFeatureRequest) {
        Object[] objArr = {updateFeatureRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10566c94cd4c9a3dd2ff1c700a523c1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10566c94cd4c9a3dd2ff1c700a523c1a");
        }
        if (updateFeatureRequest == null || updateFeatureRequest.feature == null) {
            return "";
        }
        Map<String, List<ResultRow>> map = updateFeatureRequest.feature;
        CommaSplitUtil.SplitStrBuilder create = CommaSplitUtil.SplitStrBuilder.create(CommonConstant.Symbol.COMMA);
        for (String str : map.keySet()) {
            try {
                getData().put(str, map.get(str));
                create.add(str);
            } catch (Exception unused) {
            }
        }
        return create.build();
    }

    @Override // com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public void replaceFeature(@Nullable UpdateFeatureRequest updateFeatureRequest) {
        Object[] objArr = {updateFeatureRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24dc970d48dd279273bcd8e910f72c39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24dc970d48dd279273bcd8e910f72c39");
        } else if (updateFeatureRequest != null) {
            try {
                if (updateFeatureRequest.feature != null) {
                    setData(updateFeatureRequest.feature);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public void removeFeature(@Nullable UpdateFeatureRequest updateFeatureRequest) {
        Object[] objArr = {updateFeatureRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7b496fbcfd1da1faabc3e979d8e3c10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7b496fbcfd1da1faabc3e979d8e3c10");
        } else if (updateFeatureRequest != null && updateFeatureRequest.feature != null && updateFeatureRequest.feature.size() > 0) {
            for (String str : updateFeatureRequest.feature.keySet()) {
                try {
                    getData().remove(str);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public void clearAll() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "407fe4abe962409c3d0358ebfbd56332", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "407fe4abe962409c3d0358ebfbd56332");
        } else {
            clearData();
        }
    }

    @NonNull
    private Map<String, List<ResultRow>> getData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61bb502217eb0a490871696cb3fe9c90", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61bb502217eb0a490871696cb3fe9c90");
        }
        if (this.mData == null) {
            clearData();
        }
        return this.mData;
    }

    private void setData(Map<String, List<ResultRow>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67d7092f8ef2f29e485cf27bace94797", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67d7092f8ef2f29e485cf27bace94797");
        } else if (map != null) {
            this.mData = map;
        } else {
            clearData();
        }
    }

    private void clearData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8df0df354cba6171de76a390fda1eba4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8df0df354cba6171de76a390fda1eba4");
        } else if (this.mData == null) {
            this.mData = new HashMap();
        } else if (this.mData != null) {
            this.mData.clear();
        }
    }
}
