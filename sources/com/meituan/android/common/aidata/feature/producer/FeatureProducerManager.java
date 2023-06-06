package com.meituan.android.common.aidata.feature.producer;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.AiSwitchConfig;
import com.meituan.android.common.aidata.async.AsyncHashMap;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FeatureProducerManager implements IFeatureProducerManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile FeatureProducerManager sInstance;
    protected Map<String, IFeatureProducer> mFeatureProducorMap;

    public FeatureProducerManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22506578ad14335b4d17feeb08832495", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22506578ad14335b4d17feeb08832495");
        } else {
            this.mFeatureProducorMap = new AsyncHashMap();
        }
    }

    public static FeatureProducerManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "47abc2d359048842d4506cf1bd44bebe", RobustBitConfig.DEFAULT_VALUE)) {
            return (FeatureProducerManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "47abc2d359048842d4506cf1bd44bebe");
        }
        if (sInstance == null) {
            synchronized (FeatureProducerManager.class) {
                if (sInstance == null) {
                    sInstance = new FeatureProducerManager();
                }
            }
        }
        return sInstance;
    }

    @Override // com.meituan.android.common.aidata.feature.producer.IFeatureProducerManager
    public void registerFeatureProducer(IFeatureProducer iFeatureProducer) {
        Object[] objArr = {iFeatureProducer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cd3bb24af553a1ee4f82dafabd2e159", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cd3bb24af553a1ee4f82dafabd2e159");
        } else if (iFeatureProducer == null || TextUtils.isEmpty(iFeatureProducer.getIdentifier())) {
        } else {
            this.mFeatureProducorMap.put(iFeatureProducer.getIdentifier(), iFeatureProducer);
        }
    }

    @Override // com.meituan.android.common.aidata.feature.producer.IFeatureProducerManager
    public void unregisterFeatureProducer(IFeatureProducer iFeatureProducer) {
        Object[] objArr = {iFeatureProducer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6ddf693690497ff23c9046ddfe60ffb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6ddf693690497ff23c9046ddfe60ffb");
        } else if (iFeatureProducer == null) {
        } else {
            this.mFeatureProducorMap.remove(iFeatureProducer.getIdentifier());
        }
    }

    @Override // com.meituan.android.common.aidata.feature.producer.IFeatureProducerManager
    public void produceFeature(ProduceRequest produceRequest, @Nullable IFeatureProducerListener iFeatureProducerListener) {
        Object[] objArr = {produceRequest, iFeatureProducerListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cb2698872b82e97f2630c5505da2e2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cb2698872b82e97f2630c5505da2e2a");
        } else if (AiSwitchConfig.getInstance().isDisableFeatureService()) {
        } else {
            if (produceRequest == null) {
                if (iFeatureProducerListener != null) {
                    iFeatureProducerListener.onFailed(new BlueException("param invalid", BaseRaptorUploader.ERROR_ILLEGAL_PRODUCE_PARAMS));
                    return;
                }
                return;
            }
            IFeatureProducer iFeatureProducer = this.mFeatureProducorMap.get(produceRequest.mFeatureKey);
            if (iFeatureProducer != null) {
                iFeatureProducer.produceFeature(produceRequest, iFeatureProducerListener);
            }
        }
    }

    @Override // com.meituan.android.common.aidata.feature.producer.IFeatureProducerManager
    public Map<String, List<ResultRow>> produceFeature(ProduceRequest produceRequest) {
        IFeatureProducer iFeatureProducer;
        Object[] objArr = {produceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db3d44db0e1f7843287480e8e9045b51", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db3d44db0e1f7843287480e8e9045b51");
        }
        if (produceRequest == null || AiSwitchConfig.getInstance().isDisableFeatureService() || (iFeatureProducer = this.mFeatureProducorMap.get(produceRequest.mFeatureKey)) == null) {
            return null;
        }
        return iFeatureProducer.produceFeature(produceRequest);
    }
}
