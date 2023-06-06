package com.meituan.android.common.aidata.ai.mlmodel.operator;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.AIDispatcher;
import com.meituan.android.common.aidata.ai.RegisterManager;
import com.meituan.android.common.aidata.ai.base.AbsStringRegisteredHolder;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.ai.bundle.model.CachedBundle;
import com.meituan.android.common.aidata.ai.mlmodel.MLContext;
import com.meituan.android.common.aidata.ai.mlmodel.operator.exception.OperatorNotFoundException;
import com.meituan.android.common.aidata.ai.mlmodel.operator.producer.js.JSOperatorProducer;
import com.meituan.android.common.aidata.ai.mlmodel.operator.util.OperatorListenerUtil;
import com.meituan.android.common.aidata.async.tasks.TaskSyncCallable;
import com.meituan.android.common.aidata.feature.utils.AiFeatureUtil;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.raptoruploader.BaseRaptorUploader;
import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OperatorManager {
    public static final String TAG = "OperatorManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mBizName;
    private final RegisterManager<String, OperatorProducerHolder> mOperatorSet;

    public OperatorManager(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46b7b88cb859cddf2778aa39bb1d5668", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46b7b88cb859cddf2778aa39bb1d5668");
            return;
        }
        this.mOperatorSet = new RegisterManager<>();
        this.mBizName = str;
    }

    @NonNull
    public String getBizName() {
        return this.mBizName;
    }

    public void registerOperatorProducer(@NonNull IOperatorProducer iOperatorProducer) {
        Object[] objArr = {iOperatorProducer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4687391a7b8f83d65b9b7a4321f599c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4687391a7b8f83d65b9b7a4321f599c7");
        } else {
            this.mOperatorSet.register(new OperatorProducerHolder(iOperatorProducer));
        }
    }

    public void operate(@NonNull final MLContext mLContext, @NonNull final Object obj, final String str, final String str2, @NonNull final OperatorConfig operatorConfig, @Nullable final ISingleOperatorListener iSingleOperatorListener, @NonNull final List<String> list) {
        Object[] objArr = {mLContext, obj, str, str2, operatorConfig, iSingleOperatorListener, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2737a0bbeb4e19b5f9483fb0593d900d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2737a0bbeb4e19b5f9483fb0593d900d");
            return;
        }
        if (LogUtil.isLogEnabled()) {
            StringBuilder sb = new StringBuilder();
            sb.append(TAG);
            sb.append(" operate(): opName = ");
            sb.append(operatorConfig.opName);
            sb.append(", featureName = ");
            sb.append(str);
            sb.append(",featureSubKey = ");
            sb.append(str2);
            sb.append(",feature = ");
            sb.append(AiFeatureUtil.objectToString(obj));
            sb.append(", params = ");
            sb.append(AiFeatureUtil.objectToString(operatorConfig.paramList));
        }
        if (!TextUtils.isEmpty(operatorConfig.opName)) {
            AIDispatcher.getInstance().addJSOperatorTask(mLContext, operatorConfig.opName, new TaskSyncCallable<AiBundle, Boolean>() { // from class: com.meituan.android.common.aidata.ai.mlmodel.operator.OperatorManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.async.tasks.TaskSyncCallable
                public Boolean syncCall(AiBundle aiBundle, long j, boolean z) {
                    Object[] objArr2 = {aiBundle, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "72c5be6c22fe09102d2ff50f2943cfea", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "72c5be6c22fe09102d2ff50f2943cfea");
                    }
                    OperatorManager.this.realOperate(mLContext, obj, str, str2, operatorConfig, iSingleOperatorListener, list);
                    return null;
                }
            });
            return;
        }
        LogUtil.aiLogE(TAG, "operate(): failed, operator name is empty");
        OperatorListenerUtil.callSingleFailed(iSingleOperatorListener, new OperatorNotFoundException("operator name is empty"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realOperate(@NonNull final MLContext mLContext, @NonNull final Object obj, final String str, final String str2, @NonNull final OperatorConfig operatorConfig, @Nullable final ISingleOperatorListener iSingleOperatorListener, @NonNull List<String> list) {
        Object[] objArr = {mLContext, obj, str, str2, operatorConfig, iSingleOperatorListener, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf600aa4e1f95b0c0f343d5f60fe992e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf600aa4e1f95b0c0f343d5f60fe992e");
            return;
        }
        final String str3 = operatorConfig.opName + CommonConstant.Symbol.MINUS + AppUtil.getUniqueId();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        OperatorProducerHolder operatorProducerHolder = this.mOperatorSet.get(operatorConfig.opName);
        if (operatorProducerHolder != null) {
            CatMonitorManager.getInstance().recordOperatorLoad(operatorConfig, str3, 0, SystemClock.elapsedRealtime() - elapsedRealtime, null, "0", 1, mLContext);
            IOperatorProducer value = operatorProducerHolder.getValue();
            CatMonitorManager.getInstance().recordOperatorStart(operatorConfig, str, str2, obj, operatorConfig.paramList, list, str3);
            final long elapsedRealtime2 = SystemClock.elapsedRealtime();
            StringBuilder sb = new StringBuilder();
            sb.append(TAG);
            sb.append(" operate opName=");
            sb.append(operatorConfig.opName);
            sb.append(", operatorUniqueId=");
            sb.append(str3);
            value.operate(obj, operatorConfig, new IInnerOperatorListener() { // from class: com.meituan.android.common.aidata.ai.mlmodel.operator.OperatorManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.aidata.ai.mlmodel.operator.IInnerOperatorListener
                public void onSuccess(@Nullable JSONArray jSONArray) {
                    Object[] objArr2 = {jSONArray};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "25675db1adc7ad9bf3ca78e709d57eaf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "25675db1adc7ad9bf3ca78e709d57eaf");
                        return;
                    }
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    if (LogUtil.isLogEnabled()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(OperatorManager.TAG);
                        sb2.append(" operate(): success, opName = ");
                        sb2.append(operatorConfig.opName);
                        sb2.append(",featureName = ");
                        sb2.append(str);
                        sb2.append(", featureSubKey=");
                        sb2.append(str2);
                        sb2.append(",result = ");
                        sb2.append(AiFeatureUtil.objectToString(jSONArray));
                    }
                    OperatorListenerUtil.callSingleSuccess(iSingleOperatorListener, jSONArray, str3);
                    if (TextUtils.isEmpty(str3)) {
                        return;
                    }
                    CatMonitorManager.getInstance().recordOperatorFinish(operatorConfig, obj, str3, 0, elapsedRealtime3, null, "0", AiFeatureUtil.objectToString(jSONArray), mLContext.modelName, str, str2, mLContext.getBiz());
                }

                @Override // com.meituan.android.common.aidata.ai.mlmodel.operator.IInnerOperatorListener
                public void onFailed(@Nullable BlueException blueException) {
                    Object[] objArr2 = {blueException};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "db6df001e01c260b60027259e853c6bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "db6df001e01c260b60027259e853c6bd");
                        return;
                    }
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    String str4 = OperatorManager.TAG;
                    OperatorListenerUtil.callSingleFailed(iSingleOperatorListener, new Exception("operate(): failed, opName = " + operatorConfig.opName + ",featureName = " + str + ", featureSubKey=" + str2 + ", e = " + AiFeatureUtil.exceptionToString(blueException)));
                    String str5 = "error message is empty";
                    String str6 = "-1";
                    if (blueException != null) {
                        str5 = blueException.getMessage();
                        str6 = blueException.getErrorCode();
                    }
                    CatMonitorManager.getInstance().recordOperatorFinish(operatorConfig, obj, str3, 1, elapsedRealtime3, str5, str6, null, mLContext.modelName, str, str2, mLContext.getBiz());
                }
            });
            return;
        }
        String str4 = "operate(): failed, opName = " + operatorConfig.opName + ",featureName = " + str + ", featureSubKey=" + str2 + ", operator not found";
        LogUtil.aiLogE(TAG, str4);
        CatMonitorManager.getInstance().recordOperatorLoad(operatorConfig, str3, 1, SystemClock.elapsedRealtime() - elapsedRealtime, ", operator not found", BaseRaptorUploader.ERROR_NOT_FIND_OPERATOR, 1, mLContext);
        OperatorListenerUtil.callSingleFailed(iSingleOperatorListener, new OperatorNotFoundException(operatorConfig.opName, str4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class OperatorProducerHolder extends AbsStringRegisteredHolder<IOperatorProducer> {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.meituan.android.common.aidata.ai.base.AbsStringRegisteredHolder, com.meituan.android.common.aidata.ai.base.IRegisteredMember
        public boolean isAllowed(String str) {
            List<String> supportedOperatorNames;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d26c4d307f977d8e13d3cc3f99f9c26", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d26c4d307f977d8e13d3cc3f99f9c26")).booleanValue();
            }
            if (!TextUtils.isEmpty(str) && (supportedOperatorNames = getValue().getSupportedOperatorNames()) != null) {
                for (String str2 : supportedOperatorNames) {
                    if (str2 != null && TextUtils.equals(str2, str)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public OperatorProducerHolder(@NonNull IOperatorProducer iOperatorProducer) {
            super("", iOperatorProducer);
            Object[] objArr = {iOperatorProducer};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85ccc165283a05e08338031742a12fea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85ccc165283a05e08338031742a12fea");
            }
        }
    }

    public IOperatorProducer unregisterOperator(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a3b696089af54251706bfa35aebd82e", RobustBitConfig.DEFAULT_VALUE)) {
            return (IOperatorProducer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a3b696089af54251706bfa35aebd82e");
        }
        JSOperatorProducer jSOperatorProducer = null;
        synchronized (this.mOperatorSet) {
            Iterator<OperatorProducerHolder> iterate = this.mOperatorSet.iterate();
            while (true) {
                if (!iterate.hasNext()) {
                    break;
                }
                IOperatorProducer value = iterate.next().getValue();
                if (value instanceof JSOperatorProducer) {
                    JSOperatorProducer jSOperatorProducer2 = (JSOperatorProducer) value;
                    CachedBundle cachedBundle = jSOperatorProducer2.getJSBundle().getCachedBundle();
                    if (cachedBundle != null && TextUtils.equals(cachedBundle.getBundleName(), str)) {
                        iterate.remove();
                        jSOperatorProducer = jSOperatorProducer2;
                        break;
                    }
                }
            }
        }
        return jSOperatorProducer;
    }
}
