package com.meituan.android.common.aidata.data.rule;

import java.util.List;
import org.apache.flink.cep.mlink.bean.StreamData;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ICepServiceListener {
    void onRuleMatchSucceed(String str, List<StreamData> list, int i);
}
