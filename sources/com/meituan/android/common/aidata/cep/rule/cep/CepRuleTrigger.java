package com.meituan.android.common.aidata.cep.rule.cep;

import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.common.aidata.ai.AiSwitchConfig;
import com.meituan.android.common.aidata.cep.rule.IRuleTrigger;
import com.meituan.android.common.aidata.cep.rule.IRuleTriggerCallback;
import com.meituan.android.common.aidata.entity.EventData;
import com.meituan.android.common.aidata.monitor.CatMonitorManager;
import com.meituan.android.common.aidata.monitor.LoganManager;
import com.meituan.android.common.aidata.resources.bean.FeatureBean;
import com.meituan.android.common.aidata.resources.bean.cep.CepBean;
import com.meituan.android.common.aidata.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.flink.cep.mlink.a;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.d;
import org.apache.flink.cep.mlink.e;
import org.apache.flink.cep.mlink.stateparser.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CepRuleTrigger extends IRuleTrigger {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IRuleTriggerCallback mCallback;
    public List<Pair<a, org.apache.flink.cep.mlink.stateparser.a>> mCepOperatorList;
    private b mCepParser;
    private FeatureBean mFeatureBean;
    private String mFeatureKey;
    private Map<StreamData, org.apache.flink.cep.mlink.stateparser.a> mMatchRecord;

    @Override // com.meituan.android.common.aidata.cep.rule.IRuleTrigger
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b46d00d44ba700ce8b3ac5d9f5ec7811", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b46d00d44ba700ce8b3ac5d9f5ec7811");
        }
    }

    public CepRuleTrigger(FeatureBean featureBean, IRuleTriggerCallback iRuleTriggerCallback) {
        super(featureBean != null ? featureBean.feature : "");
        Object[] objArr = {featureBean, iRuleTriggerCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf2456b00f0fd66c308937e254eb9508", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf2456b00f0fd66c308937e254eb9508");
            return;
        }
        this.mFeatureBean = null;
        this.mCallback = null;
        this.mCepParser = null;
        this.mMatchRecord = new HashMap();
        this.mFeatureBean = featureBean;
        if (this.mFeatureBean != null) {
            this.mFeatureKey = this.mFeatureBean.feature;
        }
        this.mCallback = iRuleTriggerCallback;
        this.mCepOperatorList = new ArrayList();
        this.mCepParser = new b();
        buildCepOperator(this.mFeatureBean.cep);
    }

    public void buildCepOperator(CepBean cepBean) {
        Object[] objArr = {cepBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "573eb538f38a7448085df2609cab35b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "573eb538f38a7448085df2609cab35b2");
            return;
        }
        ArrayList<String> arrayList = cepBean.mCepRuleList;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        for (String str : arrayList) {
            buildSingleCepOperator(str);
        }
    }

    public void buildSingleCepOperator(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfc792847f5d71947383be0c1ecd14b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfc792847f5d71947383be0c1ecd14b1");
            return;
        }
        try {
            final org.apache.flink.cep.mlink.stateparser.a a = this.mCepParser.a(str);
            final String str2 = a.e + AppUtil.getUniqueId();
            a aVar = new a(a.a, a.c, true, "NonOverlap".equals(a.g) ? org.apache.flink.cep.nfa.aftermatch.a.a() : org.apache.flink.cep.nfa.aftermatch.a.b(), new d<StreamData>() { // from class: com.meituan.android.common.aidata.cep.rule.cep.CepRuleTrigger.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // org.apache.flink.cep.mlink.d
                public void flatSelect(Map<String, List<StreamData>> map, int i) throws Exception {
                    ArrayList arrayList;
                    int i2;
                    org.apache.flink.cep.mlink.ikexpression.datameta.b a2;
                    org.apache.flink.cep.nfa.d dVar;
                    int i3 = 0;
                    Object[] objArr2 = {map, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e597d0f7689cf121ab4d2f5de567c884", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e597d0f7689cf121ab4d2f5de567c884");
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = null;
                    if (map == null || map.size() <= 0) {
                        arrayList = null;
                        i2 = 0;
                    } else {
                        arrayList = new ArrayList();
                        for (String str3 : map.keySet()) {
                            new StringBuilder("state key ").append(str3);
                            for (StreamData streamData : map.get(str3)) {
                                new StringBuilder("state value ").append(streamData.toString());
                                arrayList.add(streamData);
                                long j = streamData.tm;
                                i3 = streamData.is_cache;
                                currentTimeMillis = j;
                            }
                        }
                        i2 = i3;
                    }
                    if (FeatureBean.CepRelation.MUTEX.equals(CepRuleTrigger.this.mFeatureBean.cepRelation)) {
                        if (arrayList != null && arrayList.size() > 0) {
                            StreamData streamData2 = (StreamData) arrayList.get(arrayList.size() - 1);
                            org.apache.flink.cep.mlink.stateparser.a aVar2 = (org.apache.flink.cep.mlink.stateparser.a) CepRuleTrigger.this.mMatchRecord.get(streamData2);
                            if (aVar2 == null) {
                                CepRuleTrigger.this.mMatchRecord.put(streamData2, a);
                            } else if (!TextUtils.equals(aVar2.e, a.e)) {
                                StringBuilder sb = new StringBuilder("the last event has cause other cep match, other cep identifier=");
                                sb.append(aVar2.e);
                                sb.append(", current cep identifier=");
                                sb.append(a.e);
                                return;
                            }
                        }
                        for (Pair<a, org.apache.flink.cep.mlink.stateparser.a> pair : CepRuleTrigger.this.mCepOperatorList) {
                            if (!TextUtils.equals(((org.apache.flink.cep.mlink.stateparser.a) pair.second).e, a.e)) {
                                ((a) pair.first).a();
                                new StringBuilder("cep reset, cep identifier=").append(((org.apache.flink.cep.mlink.stateparser.a) pair.second).e);
                            }
                        }
                    }
                    if (a.a != null && a.a.size() > 1 && (dVar = (org.apache.flink.cep.nfa.d) a.a.get(a.a.size() - 2)) != null && dVar.c()) {
                        currentTimeMillis += dVar.d;
                    }
                    CatMonitorManager.getInstance().reportCepMatchData(CepRuleTrigger.this.mFeatureBean, a, arrayList, i, str2, System.currentTimeMillis() - currentTimeMillis, i2);
                    if (CepRuleTrigger.this.mCallback != null) {
                        new StringBuilder("cep match succeed:").append(CepRuleTrigger.this.mFeatureBean != null ? " biz:" + CepRuleTrigger.this.mFeatureBean.biz + " featureKey:" + CepRuleTrigger.this.mFeatureBean.feature : "feature bean is null");
                        if (a != null && a.h != null && (a2 = a.h.a(null, new org.apache.flink.cep.mlink.b(map), null)) != null && a2.b != null && (a2.b instanceof JSONObject)) {
                            jSONObject = (JSONObject) a2.b;
                        }
                        CepRuleTrigger.this.mCallback.ruleMatchSucceed(CepRuleTrigger.this.mFeatureBean.biz, CepRuleTrigger.this.mFeatureBean.feature, a, arrayList, jSONObject, i, str2);
                    }
                }
            }, new e() { // from class: com.meituan.android.common.aidata.cep.rule.cep.CepRuleTrigger.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // org.apache.flink.cep.mlink.e
                public void timeout(Map map) throws Exception {
                    Object[] objArr2 = {map};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1fe69464d49d055358ee7c65309922d5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1fe69464d49d055358ee7c65309922d5");
                        return;
                    }
                    CatMonitorManager.getInstance().recordCepMatchTimeoutData(CepRuleTrigger.this.mFeatureBean, a, str2);
                    LoganManager.getInstance().recordCepMatchTimeoutData(CepRuleTrigger.this.mFeatureBean, a);
                }
            });
            aVar.b = str2;
            aVar.a = a.e;
            aVar.c = a.f;
            this.mCepOperatorList.add(new Pair<>(aVar, a));
            LoganManager.getInstance().recordCreateCepRule(this.mFeatureBean, a, str2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.meituan.android.common.aidata.cep.rule.IRuleTrigger
    public void run(EventData eventData) {
        Object[] objArr = {eventData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93b4e1ccf84f8e6c542a6a8984cc9e6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93b4e1ccf84f8e6c542a6a8984cc9e6a");
        } else if (eventData != null && !AiSwitchConfig.getInstance().isDisableCepService() && iStarted() && this.mCepOperatorList != null && this.mCepOperatorList.size() > 0) {
            for (Pair<a, org.apache.flink.cep.mlink.stateparser.a> pair : this.mCepOperatorList) {
                if (pair != null && (pair.second == null || ((org.apache.flink.cep.mlink.stateparser.a) pair.second).b == null || ((org.apache.flink.cep.mlink.stateparser.a) pair.second).b.contains(eventData.nm))) {
                    StreamData convertToStreamData = CepDataConvertor.convertToStreamData(eventData);
                    if (convertToStreamData != null && pair.first != null) {
                        ((a) pair.first).a((a) convertToStreamData);
                    }
                }
            }
        }
    }

    public void run4Cache(EventData eventData) {
        Object[] objArr = {eventData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27d4965d72b365b222ae30a3dc8995ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27d4965d72b365b222ae30a3dc8995ed");
        } else if (eventData != null && !AiSwitchConfig.getInstance().isDisableCepService() && this.mCepOperatorList != null && this.mCepOperatorList.size() > 0) {
            for (Pair<a, org.apache.flink.cep.mlink.stateparser.a> pair : this.mCepOperatorList) {
                if (pair != null && (pair.second == null || ((org.apache.flink.cep.mlink.stateparser.a) pair.second).b == null || ((org.apache.flink.cep.mlink.stateparser.a) pair.second).b.contains(eventData.nm))) {
                    new StringBuilder("cep input stream data:").append(eventData != null ? eventData.toString() : "event is null");
                    StreamData convertToStreamData = CepDataConvertor.convertToStreamData(eventData);
                    if (convertToStreamData != null && pair.first != null) {
                        ((a) pair.first).a((a) convertToStreamData);
                    }
                }
            }
        }
    }

    @Override // com.meituan.android.common.aidata.cep.rule.IRuleTrigger
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db69891dde73e78b56219908c9000f6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db69891dde73e78b56219908c9000f6c");
        } else if (this.mCepOperatorList != null) {
            for (Pair<a, org.apache.flink.cep.mlink.stateparser.a> pair : this.mCepOperatorList) {
                a aVar = (a) pair.first;
                org.apache.flink.cep.mlink.stateparser.a aVar2 = (org.apache.flink.cep.mlink.stateparser.a) pair.second;
                if (aVar != null) {
                    CatMonitorManager.getInstance().recordCancelCepRule(this.mFeatureBean, aVar2, aVar.b);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class RuleTriggerBuilder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private IRuleTriggerCallback mCallback;
        private FeatureBean mFeatureBean;

        public RuleTriggerBuilder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fd47e4c0e8284bba0509429d45027d0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fd47e4c0e8284bba0509429d45027d0");
                return;
            }
            this.mFeatureBean = null;
            this.mCallback = null;
        }

        public RuleTriggerBuilder addFeatureConfig(FeatureBean featureBean) {
            this.mFeatureBean = featureBean;
            return this;
        }

        public RuleTriggerBuilder addRuleTriggerCallback(IRuleTriggerCallback iRuleTriggerCallback) {
            this.mCallback = iRuleTriggerCallback;
            return this;
        }

        public CepRuleTrigger build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4d8298d98bbc92da6d6baa37f0646a3", RobustBitConfig.DEFAULT_VALUE) ? (CepRuleTrigger) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4d8298d98bbc92da6d6baa37f0646a3") : new CepRuleTrigger(this.mFeatureBean, this.mCallback);
        }
    }
}
