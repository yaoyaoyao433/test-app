package com.meituan.android.common.aidata.ai.mlmodel.operator.producer.js;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.android.common.aidata.ai.mlmodel.operator.IOperatorProducer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSOperatorProducer implements IOperatorProducer {
    public static final String ARG_KEY_FEATURE = "feature";
    private static final String ARG_KEY_OP_NAME = "opName";
    public static final String ARG_KEY_PARAMS = "params";
    private static final String DIVIDER_OPERATORS = ",";
    private static final String TAG = "JSOperatorProducer";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final AiBundle mJsBundle;

    public JSOperatorProducer(@NonNull AiBundle aiBundle) {
        Object[] objArr = {aiBundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd559f25a860c6919e1682f13a36abbc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd559f25a860c6919e1682f13a36abbc");
        } else {
            this.mJsBundle = aiBundle;
        }
    }

    @Override // com.meituan.android.common.aidata.ai.mlmodel.operator.IOperatorProducer
    @Nullable
    public List<String> getSupportedOperatorNames() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d051c6efdc12d9166b47b25326267cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d051c6efdc12d9166b47b25326267cd");
        }
        ArrayList arrayList = new ArrayList();
        if (this.mJsBundle != null && this.mJsBundle.getJsConfig() != null) {
            arrayList.add(this.mJsBundle.getJsConfig().getBundleScene());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    @Override // com.meituan.android.common.aidata.ai.mlmodel.operator.IOperatorProducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void operate(@android.support.annotation.NonNull java.lang.Object r19, @android.support.annotation.NonNull com.meituan.android.common.aidata.ai.mlmodel.operator.OperatorConfig r20, @android.support.annotation.Nullable final com.meituan.android.common.aidata.ai.mlmodel.operator.IInnerOperatorListener r21) {
        /*
            r18 = this;
            r8 = r18
            r0 = r19
            r9 = r20
            r10 = r21
            r1 = 3
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r12 = 0
            r11[r12] = r0
            r13 = 1
            r11[r13] = r9
            r14 = 2
            r11[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r15 = com.meituan.android.common.aidata.ai.mlmodel.operator.producer.js.JSOperatorProducer.changeQuickRedirect
            java.lang.String r6 = "98c42a4c3fa8c65735f5be7586f7fced"
            r4 = 0
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r11
            r2 = r18
            r3 = r15
            r5 = r6
            r13 = r6
            r6 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2d
            com.meituan.robust.PatchProxy.accessDispatch(r11, r8, r15, r12, r13)
            return
        L2d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "JSOperatorProducer.operate(): opName = "
            r1.<init>(r2)
            java.lang.String r2 = r9.opName
            r1.append(r2)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = r9.opName
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L7f
            java.lang.String r2 = "opName"
            java.lang.String r3 = r9.opName     // Catch: java.lang.Exception -> L70
            r1.putOpt(r2, r3)     // Catch: java.lang.Exception -> L70
            java.lang.String r2 = "feature"
            r1.putOpt(r2, r0)     // Catch: java.lang.Exception -> L70
            org.json.JSONArray r0 = r20.getParamArray()     // Catch: java.lang.Exception -> L70
            java.lang.String r2 = "params"
            r1.putOpt(r2, r0)     // Catch: java.lang.Exception -> L70
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6d
            java.lang.String r3 = "JSOperatorProducer.operate(): params = "
            r2.<init>(r3)     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L6d
            r2.append(r0)     // Catch: java.lang.Exception -> L6d
            r12 = 1
            goto L7f
        L6d:
            r0 = move-exception
            r12 = 1
            goto L71
        L70:
            r0 = move-exception
        L71:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "JSOperatorProducer.operate(): make params failed, e = "
            r2.<init>(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
        L7f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "JSOperatorProducer.operate(): isOperatorConfigAvailable = "
            r0.<init>(r2)
            r0.append(r12)
            if (r12 == 0) goto La0
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r0.put(r1)
            java.lang.String r1 = r9.opName
            com.meituan.android.common.aidata.ai.bundle.model.AiBundle r2 = r8.mJsBundle
            com.meituan.android.common.aidata.ai.mlmodel.operator.producer.js.JSOperatorProducer$1 r3 = new com.meituan.android.common.aidata.ai.mlmodel.operator.producer.js.JSOperatorProducer$1
            r3.<init>()
            com.meituan.android.common.aidata.jsengine.utils.JSExecuteUtil.execute(r14, r1, r2, r0, r3)
            return
        La0:
            com.meituan.android.common.aidata.raptoruploader.BlueException r0 = new com.meituan.android.common.aidata.raptoruploader.BlueException
            java.lang.String r1 = "operator config is not available"
            java.lang.String r2 = "-160003"
            r0.<init>(r1, r2)
            com.meituan.android.common.aidata.ai.mlmodel.operator.util.OperatorListenerUtil.callInnerFailed(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.aidata.ai.mlmodel.operator.producer.js.JSOperatorProducer.operate(java.lang.Object, com.meituan.android.common.aidata.ai.mlmodel.operator.OperatorConfig, com.meituan.android.common.aidata.ai.mlmodel.operator.IInnerOperatorListener):void");
    }

    public AiBundle getJSBundle() {
        return this.mJsBundle;
    }
}
