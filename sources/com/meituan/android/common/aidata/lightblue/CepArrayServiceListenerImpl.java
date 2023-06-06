package com.meituan.android.common.aidata.lightblue;

import com.meituan.android.common.aidata.data.rule.ICepArrayServiceListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CepArrayServiceListenerImpl implements ICepArrayServiceListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ICepArrayListener mICepArrayListener;

    public void setICepListener(ICepArrayListener iCepArrayListener) {
        this.mICepArrayListener = iCepArrayListener;
    }

    @Override // com.meituan.android.common.aidata.data.rule.ICepArrayServiceListener
    public void onRuleMatchSucceed(String str, String str2, List<StreamData> list, int i) {
        Object[] objArr = {str, str2, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e4c28abfe6bb2945836e4049d65809d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e4c28abfe6bb2945836e4049d65809d");
        } else if (this.mICepArrayListener != null && list != null && list.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (StreamData streamData : list) {
                if (streamData != null) {
                    jSONArray.put(streamData.toJson());
                }
            }
            this.mICepArrayListener.onRuleMatchSucceed(str, str2, jSONArray.toString(), i);
        }
    }
}
