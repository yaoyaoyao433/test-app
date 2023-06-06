package com.meituan.android.common.aidata.feature;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.AIDispatcher;
import com.meituan.android.common.aidata.ai.AiSwitchConfig;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.entity.FeatureResult;
import com.meituan.android.common.aidata.feature.task.GenerateFeatureTask;
import com.meituan.android.common.aidata.feature.utils.AiFeatureListenerUtil;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FeatureService {
    public static final int FEATURE_CONSUME_TYPE_BUSINESS = 0;
    public static final int FEATURE_CONSUME_TYPE_CYCLE = 2;
    public static final int FEATURE_CONSUME_TYPE_OPERATOR = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile FeatureService sInstance;
    private FeatureManager mFeatureManager;

    public FeatureService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab248d71305b4e7345d523753c9295b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab248d71305b4e7345d523753c9295b7");
            return;
        }
        this.mFeatureManager = null;
        this.mFeatureManager = new FeatureManager();
    }

    public static FeatureService getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d998a80307e37fd3ad71e8617daa1150", RobustBitConfig.DEFAULT_VALUE)) {
            return (FeatureService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d998a80307e37fd3ad71e8617daa1150");
        }
        if (sInstance == null) {
            synchronized (FeatureService.class) {
                if (sInstance == null) {
                    sInstance = new FeatureService();
                }
            }
        }
        return sInstance;
    }

    public void getFeature(@NonNull MLContext mLContext, @Nullable List<GetFeatureRequest> list, @Nullable final IFeatureListener iFeatureListener, int i) {
        Object[] objArr = {mLContext, list, iFeatureListener, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40eeb245bd5f7be7e633b3fa4d98e99c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40eeb245bd5f7be7e633b3fa4d98e99c");
        } else if (AiSwitchConfig.getInstance().isDisableFeatureService()) {
        } else {
            if (list == null || iFeatureListener == null) {
                if (list == null) {
                    AiFeatureListenerUtil.callFailed(iFeatureListener, new Exception("invalid request"));
                    return;
                }
                return;
            }
            GenerateFeatureTask generateFeatureTask = new GenerateFeatureTask(mLContext, list, i, getFeatureManager());
            generateFeatureTask.addOnTaskFinishListener(new OnTaskFinishListener<GetFeatureRequest, Map<String, List<ResultRow>>>() { // from class: com.meituan.android.common.aidata.feature.FeatureService.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.async.tasks.OnTaskFinishListener
                public /* bridge */ /* synthetic */ void onTaskFinish(Map<GetFeatureRequest, Map<String, List<ResultRow>>> map, Map<String, List<ResultRow>> map2, long j, List list2) {
                    onTaskFinish2(map, map2, j, (List<Exception>) list2);
                }

                /* renamed from: onTaskFinish  reason: avoid collision after fix types in other method */
                public void onTaskFinish2(Map<GetFeatureRequest, Map<String, List<ResultRow>>> map, Map<String, List<ResultRow>> map2, long j, List<Exception> list2) {
                    Object[] objArr2 = {map, map2, new Long(j), list2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ffabfefc381f875291413d1088eb5899", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ffabfefc381f875291413d1088eb5899");
                        return;
                    }
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<GetFeatureRequest, Map<String, List<ResultRow>>> entry : map.entrySet()) {
                        if (entry == null || entry.getKey() == null || TextUtils.isEmpty(entry.getKey().feature) || entry.getValue() == null) {
                            if (LogUtil.isLogEnabled() && entry != null && entry.getKey() != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(entry.getKey().feature);
                                sb.append(" : final result is null");
                            }
                        } else {
                            hashMap.putAll(entry.getValue());
                        }
                    }
                    FeatureResult featureResult = new FeatureResult(hashMap);
                    if (LogUtil.isLogEnabled()) {
                        new StringBuilder("final result is ").append(featureResult.getJsonString());
                    }
                    iFeatureListener.onSuccess(featureResult);
                }
            });
            AIDispatcher.getInstance().addGenerateFeatureTask(mLContext, list, generateFeatureTask);
        }
    }

    public FeatureManager getFeatureManager() {
        return this.mFeatureManager;
    }
}
