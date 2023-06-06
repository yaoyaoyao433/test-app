package com.meituan.android.legwork.common.util;

import android.text.TextUtils;
import com.meituan.android.legwork.bean.monitor.ClientConfigBean;
import com.meituan.android.legwork.bean.monitor.FuncConfigBean;
import com.meituan.android.legwork.bean.monitor.MRNAddCustomKeyBean;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final b b = new b();
    private Map<String, Map<String, String>> c;

    public static b a() {
        return b;
    }

    public final void a(ClientConfigBean clientConfigBean) {
        FuncConfigBean value;
        MRNAddCustomKeyBean mRNAddCustomKeyBean;
        Map<String, String> a2;
        Object[] objArr = {clientConfigBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59cc01cd13a6eb7ca41c66d708391b3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59cc01cd13a6eb7ca41c66d708391b3a");
            return;
        }
        if (clientConfigBean != null) {
            try {
                if (clientConfigBean.funcConfigResult != null && !clientConfigBean.funcConfigResult.isEmpty()) {
                    FuncConfigBean funcConfigBean = clientConfigBean.funcConfigResult.get("mrn_monitoring_add_customKey_enable");
                    if (funcConfigBean != null && funcConfigBean.support) {
                        if (this.c != null) {
                            this.c.clear();
                        }
                        for (Map.Entry<String, FuncConfigBean> entry : clientConfigBean.funcConfigResult.entrySet()) {
                            if (entry != null && (value = entry.getValue()) != null && !TextUtils.isEmpty(value.ext)) {
                                String key = entry.getKey();
                                if (!TextUtils.isEmpty(key) && key.contains("mrn_add_custom_key_") && (mRNAddCustomKeyBean = (MRNAddCustomKeyBean) com.meituan.android.legwork.net.util.b.a().fromJson(value.ext, (Class<Object>) MRNAddCustomKeyBean.class)) != null && mRNAddCustomKeyBean.bundleNames != null && !mRNAddCustomKeyBean.bundleNames.isEmpty() && (a2 = a(clientConfigBean, mRNAddCustomKeyBean)) != null && !a2.isEmpty()) {
                                    if (this.c == null) {
                                        this.c = new ConcurrentHashMap();
                                    }
                                    Iterator<String> it = mRNAddCustomKeyBean.bundleNames.iterator();
                                    while (it.hasNext()) {
                                        String next = it.next();
                                        if (this.c.containsKey(next)) {
                                            this.c.get(next).putAll(a2);
                                        } else {
                                            this.c.put(next, a2);
                                        }
                                    }
                                }
                            }
                        }
                        return;
                    }
                    this.c = null;
                    return;
                }
            } catch (Exception e) {
                x.e("DynamicallyAddCustomManager.parsingFuncConfigResult()", "parsingFuncConfigResult error, exception msg:", e);
                x.a(e);
                return;
            }
        }
        this.c = null;
    }

    private Map<String, String> a(ClientConfigBean clientConfigBean, MRNAddCustomKeyBean mRNAddCustomKeyBean) {
        Object[] objArr = {clientConfigBean, mRNAddCustomKeyBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f72c698dcc9c0a5f41a269cb2f00b5d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f72c698dcc9c0a5f41a269cb2f00b5d2");
        }
        ConcurrentHashMap concurrentHashMap = null;
        if (mRNAddCustomKeyBean.abTestKeys != null && !mRNAddCustomKeyBean.abTestKeys.isEmpty() && clientConfigBean.testIdMapping != null) {
            Iterator<String> it = mRNAddCustomKeyBean.abTestKeys.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String str = clientConfigBean.testIdMapping.get(next);
                if (str != null) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.put("bmlwab_" + next, str);
                }
            }
        }
        if (mRNAddCustomKeyBean.funcConfigResultKeys != null && !mRNAddCustomKeyBean.funcConfigResultKeys.isEmpty() && clientConfigBean.funcConfigResult != null) {
            Iterator<String> it2 = mRNAddCustomKeyBean.funcConfigResultKeys.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                FuncConfigBean funcConfigBean = clientConfigBean.funcConfigResult.get(next2);
                if (funcConfigBean != null) {
                    String str2 = "bmlw_" + next2;
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    concurrentHashMap.put(str2, String.valueOf(funcConfigBean.support));
                }
            }
        }
        return concurrentHashMap;
    }

    public final Map<String, String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56ebb5a037e72e5b0e929fb7ab7f9bc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56ebb5a037e72e5b0e929fb7ab7f9bc5");
        }
        try {
            if (this.c != null && !this.c.isEmpty()) {
                return this.c.get("rn_banma_" + str);
            }
            return null;
        } catch (Exception e) {
            x.e("DynamicallyAddCustomManager.getBusinessMetricsTags()", "getBusinessMetricsTags error, exception msg:", e);
            x.a(e);
            return null;
        }
    }
}
