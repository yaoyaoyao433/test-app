package com.meituan.android.common.aidata.monitor;

import android.text.TextUtils;
import com.meituan.android.common.aidata.AIDataDelegate;
import com.meituan.android.common.aidata.ai.bundle.cache.CacheException;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.cep.ICustomCepServiceListener;
import com.meituan.android.common.aidata.cep.rule.IRuleTrigger;
import com.meituan.android.common.aidata.data.EventBean;
import com.meituan.android.common.aidata.data.EventFilter;
import com.meituan.android.common.aidata.data.rule.CEPSubscriberConfig;
import com.meituan.android.common.aidata.data.rule.ICepArrayServiceListener;
import com.meituan.android.common.aidata.data.rule.ICepServiceListener;
import com.meituan.android.common.aidata.feature.GetFeatureRequest;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.aidata.resources.bean.FeatureBean;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.config.VallabConfig;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.apache.flink.cep.mlink.stateparser.a;
import org.apache.flink.cep.mlink.stateparser.b;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LoganManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ExecutorService mTpm = c.a("loganmanager");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerClass {
        public static LoganManager STUB = new LoganManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static LoganManager getInstance() {
        return InnerClass.STUB;
    }

    public void recordPvData(final String str, final String str2, final Map<String, Object> map, final String str3, final Boolean bool) {
        Object[] objArr = {str, str2, map, str3, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68322ce8f5260359c6293dd5718ba3a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68322ce8f5260359c6293dd5718ba3a5");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9b0776d293a33e3207b31f4642a70c1a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9b0776d293a33e3207b31f4642a70c1a");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("op", "aidata_write_pv");
                        jSONObject.put("page_info_key", str);
                        jSONObject.put("val_cid", str2);
                        if (map != null && map.size() > 0) {
                            jSONObject.put("val_lab", new JSONObject(map));
                        }
                        jSONObject.put("category", str3);
                        jSONObject.put("is_initialized", bool);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordPdData(final String str, final String str2, final Boolean bool) {
        Object[] objArr = {str, str2, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25282880bfaa3b451d4f1a739a863da6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25282880bfaa3b451d4f1a739a863da6");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b91a0f4a6bd385f500c13e43e9d5fa23", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b91a0f4a6bd385f500c13e43e9d5fa23");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("op", "aidata_write_pd");
                        jSONObject.put("page_info_key", str);
                        jSONObject.put("category", str2);
                        jSONObject.put("is_initialized", bool);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordMdData(final String str, final String str2, final String str3, final String str4, final Map<String, Object> map, final String str5, final Boolean bool, final Boolean bool2) {
        Object[] objArr = {str, str2, str3, str4, map, str5, bool, bool2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a8cc54525a8270d8207a53b054e47de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a8cc54525a8270d8207a53b054e47de");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "09e8472bf787a0632af3ade2d3ef3497", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "09e8472bf787a0632af3ade2d3ef3497");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("op", "aidata_write_module_event");
                        jSONObject.put("nm", str);
                        jSONObject.put("page_info_key", str2);
                        jSONObject.put("val_cid", str3);
                        jSONObject.put("val_bid", str4);
                        if (map != null && map.size() > 0) {
                            jSONObject.put("val_lab", new JSONObject(map));
                        }
                        jSONObject.put("category", str5);
                        jSONObject.put("is_local", bool);
                        jSONObject.put("is_initialized", bool2);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordUdData(final String str, final String str2, final String str3, final String str4, final Map<String, Object> map, final String str5, final Boolean bool, final Boolean bool2) {
        Object[] objArr = {str, str2, str3, str4, map, str5, bool, bool2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9de4ef2653ed21d55bad2741a1b52527", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9de4ef2653ed21d55bad2741a1b52527");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5d63210edd993526f63cc4db2980ea76", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5d63210edd993526f63cc4db2980ea76");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("op", "aidata_write_custom_event");
                        jSONObject.put("event_name", str);
                        jSONObject.put("page_info_key", str2);
                        jSONObject.put("val_cid", str3);
                        jSONObject.put("val_bid", str4);
                        if (map != null && map.size() > 0) {
                            jSONObject.put("val_lab", new JSONObject(map));
                        }
                        jSONObject.put("category", str5);
                        jSONObject.put("is_local", bool);
                        jSONObject.put("is_initialized", bool2);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordLxSourceEvent(final EventBean eventBean) {
        Object[] objArr = {eventBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3535e6bc8a0f721498d8a4d46c84b8e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3535e6bc8a0f721498d8a4d46c84b8e6");
        } else if (eventBean == null) {
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    int i;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eec5f4099c3f6cf24b9702c187a6a018", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eec5f4099c3f6cf24b9702c187a6a018");
                        return;
                    }
                    String str = eventBean.nm;
                    String str2 = eventBean.cid;
                    String str3 = eventBean.bid;
                    String str4 = eventBean.req_id;
                    String str5 = eventBean.msid;
                    long j = eventBean.seq;
                    long j2 = eventBean.lseq;
                    long j3 = eventBean.tm;
                    int i2 = eventBean.isLocal;
                    String str6 = eventBean.ext;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("op", "aidata_lx_callback");
                        jSONObject.put("nm", str);
                        jSONObject.put("cid", str2);
                        jSONObject.put("bid", str3);
                        jSONObject.put(Constants.EventInfoConsts.KEY_REQ_ID, str4);
                        jSONObject.put("msid", str5);
                        jSONObject.put("seq", j);
                        jSONObject.put("serial_seq", j2);
                        jSONObject.put("tm", j3);
                        jSONObject.put("is_local", i2);
                        try {
                            i = new JSONObject(str6).optInt("is_custom_event");
                        } catch (Exception unused) {
                            i = 0;
                        }
                        jSONObject.put("is_custom", i);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused2) {
                    }
                }
            });
        }
    }

    public void recordAddListener(final String str, final EventFilter eventFilter) {
        Object[] objArr = {str, eventFilter};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0453adf1a028729207706877402fcf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0453adf1a028729207706877402fcf3");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5128b54a5c2860bfcc4aed0c60180c1d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5128b54a5c2860bfcc4aed0c60180c1d");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("op", "aidata_listener_add");
                        jSONObject.put("listener_addr", str);
                        if (eventFilter != null) {
                            jSONObject.put("filter", eventFilter.toString());
                        }
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordRemoveListener(final String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6a4bec2d4ec20894023367d75400718", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6a4bec2d4ec20894023367d75400718");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d7eef9d4d63de7c9777b46e05bff42eb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d7eef9d4d63de7c9777b46e05bff42eb");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("op", "aidata_listener_remove");
                        jSONObject.put("listener_addr", str);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordEventNotAllowed(final EventBean eventBean, final boolean z) {
        Object[] objArr = {eventBean, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2727736da459b9ce641ba40ae450e336", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2727736da459b9ce641ba40ae450e336");
        } else if (eventBean == null) {
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    int i;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b5a07b22db725379ae2d31d6c3a476d9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b5a07b22db725379ae2d31d6c3a476d9");
                        return;
                    }
                    String str = eventBean.nm;
                    String str2 = eventBean.cid;
                    String str3 = eventBean.bid;
                    String str4 = eventBean.req_id;
                    String str5 = eventBean.msid;
                    long j = eventBean.seq;
                    long j2 = eventBean.lseq;
                    long j3 = eventBean.tm;
                    int i2 = eventBean.isLocal;
                    String str6 = eventBean.ext;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("op", "aidata_write_allowed");
                        jSONObject.put("nm", str);
                        jSONObject.put("cid", str2);
                        jSONObject.put("bid", str3);
                        jSONObject.put(Constants.EventInfoConsts.KEY_REQ_ID, str4);
                        jSONObject.put("msid", str5);
                        jSONObject.put("seq", j);
                        jSONObject.put("serial_seq", j2);
                        jSONObject.put("tm", j3);
                        jSONObject.put("is_local", i2);
                        jSONObject.put("status", z);
                        try {
                            i = new JSONObject(str6).optInt("is_custom_event");
                        } catch (Exception unused) {
                            i = 0;
                        }
                        jSONObject.put("is_custom", i);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused2) {
                    }
                }
            });
        }
    }

    public void recordTaskAbort(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62f53d4c48e09e94d15ef4bc10cf16ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62f53d4c48e09e94d15ef4bc10cf16ca");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.9
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "864785da9479db8821c16ae1f0d77f4c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "864785da9479db8821c16ae1f0d77f4c");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("content", str);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordFeatureUpdateData(final String str, final FeatureBean featureBean) {
        Object[] objArr = {str, featureBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18127fcc75a5d81de52d92a512ff0d1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18127fcc75a5d81de52d92a512ff0d1c");
        } else if (featureBean == null) {
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.10
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b0eadbc0e6b15ecc6eb23c81f76594e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b0eadbc0e6b15ecc6eb23c81f76594e3");
                    } else if (featureBean == null || featureBean.cep == null) {
                    } else {
                        b bVar = new b();
                        ArrayList<String> cepRuleList = featureBean.cep.getCepRuleList();
                        if (cepRuleList == null || cepRuleList.size() <= 0) {
                            return;
                        }
                        Iterator<String> it = cepRuleList.iterator();
                        while (it.hasNext()) {
                            a a = bVar.a(it.next());
                            JSONObject jSONObject = new JSONObject();
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("biz", featureBean.biz);
                                jSONObject2.put("feature", featureBean.feature);
                                jSONObject2.put("featureVersion", featureBean.ver);
                                jSONObject2.put("cepId", a.e);
                                jSONObject2.put(RaptorUploaderImpl.CEP_VERSION, a.d);
                                jSONObject2.put("type", "CEP");
                                jSONObject.put(str, jSONObject2);
                                com.dianping.networklog.c.a(jSONObject.toString(), 8);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            });
        }
    }

    public void recordBuildCepNFAStatus(final String str, final FeatureBean featureBean, final a aVar) {
        Object[] objArr = {str, featureBean, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfcacc01fc38fd06e8de2f6ae4d5c50a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfcacc01fc38fd06e8de2f6ae4d5c50a");
        } else if (aVar == null) {
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.11
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6e6028f3a476166257702877021d3fb4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6e6028f3a476166257702877021d3fb4");
                    } else if (aVar == null || str == null) {
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("biz", featureBean.biz);
                            jSONObject2.put("feature", featureBean.feature);
                            jSONObject2.put("featureVersion", featureBean.ver);
                            jSONObject2.put("cepId", aVar.e);
                            jSONObject2.put(RaptorUploaderImpl.CEP_VERSION, aVar.d);
                            if (aVar.a != null) {
                                jSONObject2.put("stateCount", aVar.a.size());
                            }
                            jSONObject2.put("windowTime", aVar.c);
                            jSONObject2.put("maxTimes", aVar.f);
                            jSONObject.put(str, jSONObject2);
                            com.dianping.networklog.c.a(jSONObject.toString(), 8);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public void recordStartCepServiceByBiz(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c5d3fb10404acd41628308a30005ded", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c5d3fb10404acd41628308a30005ded");
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.12
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fdcca4494080aae20474168bba277059", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fdcca4494080aae20474168bba277059");
                } else if (TextUtils.isEmpty(str)) {
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("biz", str);
                        jSONObject2.put(DeviceInfo.TM, currentTimeMillis);
                        jSONObject.put("aidata_cep_start_biz", jSONObject2);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            }
        });
    }

    public void recordStopCepServiceByBiz(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fe05aaa2d0b4b62c1b4e2e7b13747d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fe05aaa2d0b4b62c1b4e2e7b13747d7");
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.13
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "92475ebc180cfcb0556e54497c3a3d5d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "92475ebc180cfcb0556e54497c3a3d5d");
                } else if (TextUtils.isEmpty(str)) {
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("biz", str);
                        jSONObject2.put(DeviceInfo.TM, currentTimeMillis);
                        jSONObject.put("aidata_cep_stop_biz", jSONObject2);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            }
        });
    }

    public void recordCepServiceRunState(final String str, final String str2, final List<FeatureBean> list) {
        Object[] objArr = {str, str2, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b6520bd3023937d2ab9b81377fbe495", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b6520bd3023937d2ab9b81377fbe495");
        } else if (list == null || list.size() <= 0) {
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.14
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c590095d91447fded4a154e8af17aa89", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c590095d91447fded4a154e8af17aa89");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("biz", str);
                        jSONObject2.put(DeviceInfo.TM, currentTimeMillis);
                        JSONArray jSONArray = new JSONArray();
                        for (FeatureBean featureBean : list) {
                            jSONArray.put(featureBean.feature);
                        }
                        jSONObject2.put(Constants.SubscriberConstants.KEY_CEP_ID_LIST, jSONArray);
                        jSONObject.put(str2, jSONObject2);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordCepSubscribeState(final String str, final CEPSubscriberConfig cEPSubscriberConfig, final ICepServiceListener iCepServiceListener) {
        Object[] objArr = {str, cEPSubscriberConfig, iCepServiceListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e58a94047d7a436190a9458df611fd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e58a94047d7a436190a9458df611fd3");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.15
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b267bcbfa196e176a09ca0839af8ce42", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b267bcbfa196e176a09ca0839af8ce42");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("listener_addr", iCepServiceListener);
                        JSONArray jSONArray = null;
                        if (cEPSubscriberConfig != null) {
                            if (cEPSubscriberConfig.getFeatureList() != null && cEPSubscriberConfig.getFeatureList().size() > 0) {
                                jSONArray = new JSONArray();
                                for (String str2 : cEPSubscriberConfig.getFeatureList()) {
                                    jSONArray.put(str2);
                                }
                            }
                            if (jSONArray != null) {
                                jSONObject2.put(Constants.SubscriberConstants.KEY_CEP_ID_LIST, jSONArray);
                            }
                        }
                        jSONObject.put(str, jSONObject2);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordCepSubscribeState(final String str, final CEPSubscriberConfig cEPSubscriberConfig, final ICepArrayServiceListener iCepArrayServiceListener) {
        Object[] objArr = {str, cEPSubscriberConfig, iCepArrayServiceListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfa2f9992df8975a542e612d2259f359", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfa2f9992df8975a542e612d2259f359");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.16
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "22e930a667f0ab6f3fff6ee125b3eead", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "22e930a667f0ab6f3fff6ee125b3eead");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("listener_addr", iCepArrayServiceListener);
                        JSONArray jSONArray = null;
                        if (cEPSubscriberConfig != null) {
                            if (cEPSubscriberConfig.getFeatureList() != null && cEPSubscriberConfig.getFeatureList().size() > 0) {
                                jSONArray = new JSONArray();
                                for (String str2 : cEPSubscriberConfig.getFeatureList()) {
                                    jSONArray.put(str2);
                                }
                            }
                            if (jSONArray != null) {
                                jSONObject2.put(Constants.SubscriberConstants.KEY_CEP_ID_LIST, jSONArray);
                            }
                        }
                        jSONObject.put(str, jSONObject2);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordCepSubscribeState(final String str, final CEPSubscriberConfig cEPSubscriberConfig, final ICustomCepServiceListener iCustomCepServiceListener) {
        Object[] objArr = {str, cEPSubscriberConfig, iCustomCepServiceListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b734cbca4de8334f7924fe36a36d7010", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b734cbca4de8334f7924fe36a36d7010");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.17
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3c11ba2df164c60c74b717712ffa93d6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3c11ba2df164c60c74b717712ffa93d6");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("listener_addr", iCustomCepServiceListener);
                        JSONArray jSONArray = null;
                        if (cEPSubscriberConfig != null) {
                            if (cEPSubscriberConfig.getFeatureList() != null && cEPSubscriberConfig.getFeatureList().size() > 0) {
                                jSONArray = new JSONArray();
                                for (String str2 : cEPSubscriberConfig.getFeatureList()) {
                                    jSONArray.put(str2);
                                }
                            }
                            if (jSONArray != null) {
                                jSONObject2.put(Constants.SubscriberConstants.KEY_CEP_ID_LIST, jSONArray);
                            }
                        }
                        jSONObject.put(str, jSONObject2);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordCepMatchTimeoutData(final FeatureBean featureBean, final a aVar) {
        Object[] objArr = {featureBean, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c34b25c6648a26845e15594561378a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c34b25c6648a26845e15594561378a2");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.18
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "09926f2f0f117a9e3ea4106dd2d9330e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "09926f2f0f117a9e3ea4106dd2d9330e");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (featureBean != null) {
                            jSONObject2.put("biz", featureBean.biz);
                            jSONObject2.put("feature", featureBean.feature);
                            jSONObject2.put("featureVersion", featureBean.ver);
                        }
                        if (aVar != null) {
                            jSONObject2.put("cepId", aVar.e);
                            jSONObject2.put(RaptorUploaderImpl.CEP_VERSION, aVar.d);
                        }
                        jSONObject.put("aidata_nfa_callback_timeout", jSONObject2);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordGetFeatureRequest(final GetFeatureRequest getFeatureRequest, final long j, final Map<String, List<ResultRow>> map) {
        Object[] objArr = {getFeatureRequest, new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd8c2b868c063901ad754cc561b02d59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd8c2b868c063901ad754cc561b02d59");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.19
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6ac2af5a9ff20c33572ab5f163fcfadf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6ac2af5a9ff20c33572ab5f163fcfadf");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (getFeatureRequest != null) {
                            jSONObject2.put("feature", getFeatureRequest.feature);
                        }
                        jSONObject2.put("duration", j);
                        if (map != null && map.size() > 0) {
                            jSONObject2.put("isFeatureDataEmpty", false);
                        } else {
                            jSONObject2.put("isFeatureDataEmpty", true);
                        }
                        if (getFeatureRequest.isRealTime) {
                            jSONObject.put("aidata_feature_query_realtime", jSONObject2);
                        } else {
                            jSONObject.put("aidata_feature_query", jSONObject2);
                        }
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordSqlFeatureProduce(final String str, final FeatureBean featureBean, final String str2, List<StreamData> list, final int i) {
        Object[] objArr = {str, featureBean, str2, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2cd42b2dd96081cf308b792d45a1a3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2cd42b2dd96081cf308b792d45a1a3a");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.20
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e4b67f725326fb92cfbdde4cc0b95528", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e4b67f725326fb92cfbdde4cc0b95528");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("biz", str);
                        if (featureBean != null) {
                            jSONObject2.put("feature", featureBean.feature);
                            jSONObject2.put("featureVersion", featureBean.ver);
                        }
                        jSONObject2.put("cepId", str2);
                        jSONObject2.put("curMatchTime", i);
                        jSONObject.put("aidata_feature_produce_cep", jSONObject2);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordCancelCepRule(final FeatureBean featureBean, final IRuleTrigger iRuleTrigger) {
        Object[] objArr = {featureBean, iRuleTrigger};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38162db450cfc287e0b7e48f9ae7f5cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38162db450cfc287e0b7e48f9ae7f5cb");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.21
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fbc7b4cd45d9927b87840ffad7df1501", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fbc7b4cd45d9927b87840ffad7df1501");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (featureBean != null) {
                            jSONObject2.put("biz", featureBean.biz);
                            jSONObject2.put("feature", featureBean.feature);
                            jSONObject2.put("featureVersion", featureBean.ver);
                        }
                        if (iRuleTrigger != null) {
                            jSONObject2.put("cepId", iRuleTrigger.getIdentifier());
                        }
                        jSONObject.put("aidata_nfa_cancel", jSONObject2);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordLoadBundleError(final CacheException cacheException, final int i) {
        Object[] objArr = {cacheException, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30481e2558eebcebdf203667cc18e5bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30481e2558eebcebdf203667cc18e5bb");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.22
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "788ac782c2949d9e887902256a3479e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "788ac782c2949d9e887902256a3479e3");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("error_info", cacheException.getMessage());
                        jSONObject2.put("load_direct", i);
                        jSONObject.put("aidata_load_bundle_error", jSONObject2);
                        com.dianping.networklog.c.a(jSONObject.toString(), 8);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordHornConfig(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "439eb1ebd70efc265719677e5cf750ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "439eb1ebd70efc265719677e5cf750ec");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.23
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "da41792b70133e095100a874f953f869", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "da41792b70133e095100a874f953f869");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", str);
                        jSONObject2.put(VallabConfig.KEY_VALLAB_CONFIG_VER, str2);
                        jSONObject.put("aidata_horn_config_ver", jSONObject2);
                        com.dianping.networklog.c.a(jSONObject.toString(), 5);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordPreDeleteExpiredData(final long j, final long j2, final long j3, final String str) {
        Object[] objArr = {new Long(j), new Long(j2), new Long(j3), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32252597d0aee5976cb6d06a0873882d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32252597d0aee5976cb6d06a0873882d");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.24
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "97c26212b529c54e2edcc334a2174a17", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "97c26212b529c54e2edcc334a2174a17");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("total_count", j);
                        jSONObject2.put("disk_size", j2);
                        jSONObject2.put("last_cleanup_tm", j3);
                        jSONObject2.put("aidata_ver", str);
                        jSONObject.put("aidata_db_cleanup_before", jSONObject2);
                        com.dianping.networklog.c.a(jSONObject.toString(), 5);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void reportPostDeleteExpiredData(final long j, final long j2, final long j3, final boolean z, final String str, final long j4, final long j5, final String str2) {
        Object[] objArr = {new Long(j), new Long(j2), new Long(j3), Byte.valueOf(z ? (byte) 1 : (byte) 0), str, new Long(j4), new Long(j5), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9389a8d7484e1391ed29bfaaba6cc9cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9389a8d7484e1391ed29bfaaba6cc9cc");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.25
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "addd2d22c3e9fc80e796016c872d4491", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "addd2d22c3e9fc80e796016c872d4491");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("total_count", j);
                        jSONObject2.put("disk_size", j2);
                        jSONObject2.put("last_cleanup_tm", j3);
                        jSONObject2.put("cleanup_status", z);
                        jSONObject2.put("error", str);
                        jSONObject2.put("cleanup_duration", j4);
                        jSONObject2.put("cleanup_count", j5);
                        jSONObject2.put("aidata_ver", str2);
                        jSONObject.put("aidata_db_cleanup_after", jSONObject2);
                        com.dianping.networklog.c.a(jSONObject.toString(), 5);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void recordCreateCepRule(final FeatureBean featureBean, final a aVar, final String str) {
        Object[] objArr = {featureBean, aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f79f18a9c2b61911db1030b6d7683004", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f79f18a9c2b61911db1030b6d7683004");
        } else {
            mTpm.execute(new Runnable() { // from class: com.meituan.android.common.aidata.monitor.LoganManager.26
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3228bb7b6b17ab5a05b382fea65b9ef0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3228bb7b6b17ab5a05b382fea65b9ef0");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(RaptorUploaderImpl.CEP_UNIQUE_ID, str);
                        if (aVar != null) {
                            jSONObject2.put("cepId", aVar.e);
                            jSONObject2.put(RaptorUploaderImpl.CEP_VERSION, aVar.d);
                        }
                        if (featureBean != null) {
                            jSONObject2.put("biz", featureBean.biz);
                            jSONObject2.put("feature", featureBean.feature);
                            jSONObject2.put("featureVersion", featureBean.ver);
                        }
                        jSONObject.put("aidata_nfa_create_success", jSONObject2);
                        com.dianping.networklog.c.a(jSONObject.toString(), 5);
                        if (AIDataDelegate.getInstance().isDebugEnable()) {
                            LogUtil.aiLogD("【aidata_nfa_create_success】\n " + jSONObject2.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }
}
