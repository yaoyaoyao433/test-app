package com.meituan.android.common.aidata.lightblue;

import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.data.rule.CEPSubscriberConfig;
import com.meituan.android.common.aidata.feature.GetFeatureRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LightBlueImpl implements ILightBlue {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final AIDataInitCompleteImpl mAIDataInitCompleteImpl;
    private final ConcurrentHashMap<ICepArrayListener, CepArrayServiceListenerImpl> mCepArrayListenerMap;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerLightBlueImpl {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static LightBlueImpl sInstance = new LightBlueImpl();
    }

    public LightBlueImpl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fd82ead9891c1df985f80984bcc9946", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fd82ead9891c1df985f80984bcc9946");
            return;
        }
        this.mCepArrayListenerMap = new ConcurrentHashMap<>();
        this.mAIDataInitCompleteImpl = new AIDataInitCompleteImpl();
    }

    public static LightBlueImpl getInstance() {
        return InnerLightBlueImpl.sInstance;
    }

    @Override // com.meituan.android.common.aidata.lightblue.ILightBlue
    public void startServiceWithBiz(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "accd8972909e709764f4c0d5c22339ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "accd8972909e709764f4c0d5c22339ca");
        } else {
            AIData.startServiceWithBiz(str);
        }
    }

    @Override // com.meituan.android.common.aidata.lightblue.ILightBlue
    public void stopServiceWithBiz(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b52240bb0cb87ebf03e8420993777b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b52240bb0cb87ebf03e8420993777b7");
        } else {
            AIData.stopServiceWithBiz(str);
        }
    }

    @Override // com.meituan.android.common.aidata.lightblue.ILightBlue
    public void subscribeCep(List<String> list, ICepArrayListener iCepArrayListener) {
        Object[] objArr = {list, iCepArrayListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3006b86eb21fb6decf39e9bc5cc526b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3006b86eb21fb6decf39e9bc5cc526b");
        } else if (list == null || iCepArrayListener == null) {
        } else {
            CepArrayServiceListenerImpl cepArrayServiceListenerImpl = new CepArrayServiceListenerImpl();
            cepArrayServiceListenerImpl.setICepListener(iCepArrayListener);
            this.mCepArrayListenerMap.put(iCepArrayListener, cepArrayServiceListenerImpl);
            AIData.subscribeCepServiceCallback(new CEPSubscriberConfig.Builder().featureList(list).build(), cepArrayServiceListenerImpl);
        }
    }

    @Override // com.meituan.android.common.aidata.lightblue.ILightBlue
    public void unsubscribeSpecificCep(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd0ba1d8d98d87d37ada6cc136db0506", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd0ba1d8d98d87d37ada6cc136db0506");
        } else {
            AIDataDelegate.getInstance().unsubscribeSpecificCepServiceCallback(str);
        }
    }

    @Override // com.meituan.android.common.aidata.lightblue.ILightBlue
    public void unsubscribeSpecificCepLinstener(ICepArrayListener iCepArrayListener) {
        Object[] objArr = {iCepArrayListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b557a467dbe53d1f934b64095ac473f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b557a467dbe53d1f934b64095ac473f5");
        } else if (iCepArrayListener == null) {
        } else {
            AIData.unsubscribeCepServiceCallback(this.mCepArrayListenerMap.remove(iCepArrayListener));
        }
    }

    @Override // com.meituan.android.common.aidata.lightblue.ILightBlue
    public void registerInitCompleteListener(IAIDataInitCompleteListener iAIDataInitCompleteListener) {
        Object[] objArr = {iAIDataInitCompleteListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d577bfa45c278ed7020c740b34daa400", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d577bfa45c278ed7020c740b34daa400");
            return;
        }
        this.mAIDataInitCompleteImpl.setInitCompleteListener(iAIDataInitCompleteListener);
        AIData.registerInitCompleteListener(this.mAIDataInitCompleteImpl);
    }

    @Override // com.meituan.android.common.aidata.lightblue.ILightBlue
    public void getFeature(List<FeatureRequestEntity> list, IJSFeatureOutParams iJSFeatureOutParams, IGetFeatureListener iGetFeatureListener) {
        Object[] objArr = {list, iJSFeatureOutParams, iGetFeatureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9cecb4bd28fa71166aac641bb3ae26b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9cecb4bd28fa71166aac641bb3ae26b");
        } else if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (FeatureRequestEntity featureRequestEntity : list) {
                GetFeatureRequest getFeatureRequest = new GetFeatureRequest();
                getFeatureRequest.feature = featureRequestEntity.mFeatureName;
                getFeatureRequest.isRealTime = featureRequestEntity.mRealTime;
                arrayList.add(getFeatureRequest);
            }
            JSFeatureOutParamsCallbackImpl jSFeatureOutParamsCallbackImpl = new JSFeatureOutParamsCallbackImpl();
            jSFeatureOutParamsCallbackImpl.setJSFeatureOutParams(iJSFeatureOutParams);
            FeatureListenerImpl featureListenerImpl = new FeatureListenerImpl();
            featureListenerImpl.setGetFeatureListener(iGetFeatureListener);
            AIData.getFeature(arrayList, jSFeatureOutParamsCallbackImpl, featureListenerImpl);
        }
    }
}
