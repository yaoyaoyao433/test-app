package com.meituan.android.common.aidata.data.rule;

import java.util.List;
import org.apache.flink.cep.mlink.bean.StreamData;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ICepArrayServiceListener {
    void onRuleMatchSucceed(String str, String str2, List<StreamData> list, int i);
}
