package com.meituan.android.common.aidata.ai.mlmodel.predictor.task;

import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MLModelInstancePool {
    private static final int EnginePoolSize = 3;
    private static final String TASK_PREFIX = "AiML";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile MLModelInstancePool sInstance;
    private final Map<String, Long> mBundleToEngineMap;
    private AtomicLong mMLInstanceIndex;
    private final ArrayList<MLModelEngine> mMLModelEngines;

    public MLModelInstancePool() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4aa5c9e0680f8c00d4b37cca9a3815e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4aa5c9e0680f8c00d4b37cca9a3815e2");
            return;
        }
        this.mMLInstanceIndex = new AtomicLong(0L);
        this.mMLModelEngines = new ArrayList<>();
        this.mBundleToEngineMap = new HashMap();
    }

    public static MLModelInstancePool getPool() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54635a3afca9cd733d3b43e0910808dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (MLModelInstancePool) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54635a3afca9cd733d3b43e0910808dd");
        }
        if (sInstance == null) {
            synchronized (MLModelInstancePool.class) {
                if (sInstance == null) {
                    sInstance = new MLModelInstancePool();
                }
            }
        }
        return sInstance;
    }

    public MLModelEngine getMLModelEngine(AiBundle aiBundle) {
        Object[] objArr = {aiBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d15813a169500492abeb7f4f266f118", RobustBitConfig.DEFAULT_VALUE)) {
            return (MLModelEngine) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d15813a169500492abeb7f4f266f118");
        }
        if (aiBundle == null || TextUtils.isEmpty(aiBundle.getBundleName()) || TextUtils.isEmpty(aiBundle.getBundleFilePath())) {
            return null;
        }
        synchronized (this) {
            String bundleKey = getBundleKey(aiBundle.getBundleName());
            if (this.mBundleToEngineMap.containsKey(bundleKey)) {
                return getMLModelEngine(this.mBundleToEngineMap.get(bundleKey).longValue());
            }
            long incrementExecutorInstanceIndex = incrementExecutorInstanceIndex();
            MLModelEngine mLModelEngine = getMLModelEngine(incrementExecutorInstanceIndex);
            this.mBundleToEngineMap.put(bundleKey, Long.valueOf(incrementExecutorInstanceIndex));
            return mLModelEngine;
        }
    }

    private MLModelEngine getMLModelEngine(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5df6674a5701c348fb5c3f2ada0eb652", RobustBitConfig.DEFAULT_VALUE)) {
            return (MLModelEngine) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5df6674a5701c348fb5c3f2ada0eb652");
        }
        int i = (int) ((j - 1) % 3);
        if (this.mMLModelEngines.size() < i + 1) {
            MLModelEngine mLModelEngine = new MLModelEngine(j);
            this.mMLModelEngines.add(mLModelEngine);
            return mLModelEngine;
        }
        return this.mMLModelEngines.get(i);
    }

    private long incrementExecutorInstanceIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bca9abf2fb32ab5568bddeb42ab380ee", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bca9abf2fb32ab5568bddeb42ab380ee")).longValue() : this.mMLInstanceIndex.incrementAndGet();
    }

    public synchronized void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b65eca7095fa1d5fe6f5b928cb163551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b65eca7095fa1d5fe6f5b928cb163551");
            return;
        }
        this.mMLInstanceIndex.set(0L);
        Iterator<MLModelEngine> it = this.mMLModelEngines.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.mMLModelEngines.clear();
    }

    public static String getBundleKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6545a52a4746a559a0c0f7215fe0228e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6545a52a4746a559a0c0f7215fe0228e");
        }
        return "AiML_" + str.replaceAll(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.UNDERLINE);
    }

    public void clearMLModelPredictor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab72f2a542fefad1a122465c9052e42a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab72f2a542fefad1a122465c9052e42a");
            return;
        }
        Iterator<MLModelEngine> it = this.mMLModelEngines.iterator();
        while (it.hasNext()) {
            it.next().clearMLModelPredictorCache();
        }
    }
}
