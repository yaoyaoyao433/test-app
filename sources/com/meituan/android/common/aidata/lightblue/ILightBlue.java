package com.meituan.android.common.aidata.lightblue;

import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ILightBlue {
    void getFeature(List<FeatureRequestEntity> list, IJSFeatureOutParams iJSFeatureOutParams, IGetFeatureListener iGetFeatureListener);

    void registerInitCompleteListener(IAIDataInitCompleteListener iAIDataInitCompleteListener);

    void startServiceWithBiz(String str);

    void stopServiceWithBiz(String str);

    void subscribeCep(List<String> list, ICepArrayListener iCepArrayListener);

    void unsubscribeSpecificCep(String str);

    void unsubscribeSpecificCepLinstener(ICepArrayListener iCepArrayListener);
}
