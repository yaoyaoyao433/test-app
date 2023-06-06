package com.meituan.android.common.aidata.cep;

import java.util.List;
import org.apache.flink.cep.mlink.bean.StreamData;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ICustomCepServiceListener {
    void onRuleMatchSucceed(String str, String str2, List<StreamData> list, int i, CustomCepContext customCepContext);
}
