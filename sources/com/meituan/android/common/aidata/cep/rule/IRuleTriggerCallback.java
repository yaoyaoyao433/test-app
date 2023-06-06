package com.meituan.android.common.aidata.cep.rule;

import android.support.annotation.Nullable;
import java.util.List;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.stateparser.a;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IRuleTriggerCallback {
    void ruleMatchSucceed(String str, String str2, a aVar, List<StreamData> list, @Nullable JSONObject jSONObject, int i, String str3);
}
