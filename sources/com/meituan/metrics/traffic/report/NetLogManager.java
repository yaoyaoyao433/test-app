package com.meituan.metrics.traffic.report;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.dianping.networklog.c;
import com.meituan.android.common.metricx.Internal;
import com.meituan.android.common.metricx.helpers.ContextProvider;
import com.meituan.android.common.metricx.utils.ApkUtil;
import com.meituan.android.common.metricx.utils.NetWorkUtils;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.metrics.traffic.report.NetLogContent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NetLogManager {
    private static final int LOGAN_MT_NET_LOG = 51;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final String[] LOGAN_REQUEST_TAG = {SocialConstants.TYPE_REQUEST};
    private static List<NetLogListener> netLogListeners = new ArrayList();
    private static Map<String, Object> netProbeMap = new LinkedHashMap();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface NetLogListener {
        void onRequestLog(Map<String, Object> map, JSONObject jSONObject);
    }

    public static void writeToLogan(Map<String, Object> map, JSONObject jSONObject) {
        Object[] objArr = {map, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86efd5f1ca555918a39168f422336ac6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86efd5f1ca555918a39168f422336ac6");
            return;
        }
        notifyRequestListeners(map, jSONObject);
        c.a(new NetLogContent.Builder().env(getEnv(ContextProvider.getInstance().getContext())).tags(map).details(jSONObject).build().toString(), 51, LOGAN_REQUEST_TAG);
    }

    public static void addRequestListener(NetLogListener netLogListener) {
        Object[] objArr = {netLogListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a67b8c02de7aaed95514efad1b0e7e4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a67b8c02de7aaed95514efad1b0e7e4b");
            return;
        }
        synchronized (netLogListeners) {
            netLogListeners.add(netLogListener);
        }
    }

    public static void removeRequestListener(NetLogListener netLogListener) {
        Object[] objArr = {netLogListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b1b8395b830ecfc725d06ed9bd16e12b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b1b8395b830ecfc725d06ed9bd16e12b");
            return;
        }
        synchronized (netLogListeners) {
            netLogListeners.remove(netLogListener);
        }
    }

    private static void notifyRequestListeners(Map<String, Object> map, JSONObject jSONObject) {
        Object[] objArr = {map, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c73640553025c7a95adbaf3f8f85c8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c73640553025c7a95adbaf3f8f85c8c");
            return;
        }
        synchronized (netLogListeners) {
            for (NetLogListener netLogListener : netLogListeners) {
                netLogListener.onRequestLog(map, jSONObject);
            }
        }
    }

    public static Map<String, Object> getNetProbeMap() {
        return netProbeMap;
    }

    public static void setNetProbeMap(Map<String, Object> map) {
        netProbeMap = map;
    }

    private static Map<String, Object> getEnv(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "88bce14e90e7e79f7ffb080a11a18b9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "88bce14e90e7e79f7ffb080a11a18b9b");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app", obtainValue(ApkUtil.obtainPackageName(context), ""));
        hashMap.put("appVersion", obtainValue(Internal.getAppEnvironment().getAppVersion(), ""));
        hashMap.put(NetLogConstants.Environment.BUILD_VERSION, obtainValue(Internal.getAppEnvironment().getBuildVersion(), ""));
        hashMap.put("uuid", obtainValue(Internal.getAppEnvironment().getUuid(), ""));
        hashMap.put("os", "Android");
        hashMap.put("osVersion", Build.VERSION.RELEASE);
        hashMap.put(NetLogConstants.Environment.DEVICE_PROVIDER, Build.MANUFACTURER);
        hashMap.put("deviceType", Build.MODEL);
        hashMap.put("city", obtainValue(Internal.getAppEnvironment().getCityName(), ""));
        hashMap.put(NetLogConstants.Environment.MCC_MNC, obtainValue(NetWorkUtils.getMccmnc(context), ""));
        hashMap.put(NetLogConstants.Environment.VPN, NetWorkUtils.getVpnState(context));
        hashMap.put(NetLogConstants.Environment.WIFI_NAME, NetWorkUtils.getWiFiName(context));
        if (netProbeMap != null && !netProbeMap.isEmpty()) {
            hashMap.put(NetLogConstants.Environment.PROBE_INFO, netProbeMap.get(NetLogConstants.Environment.PROBE_INFO));
            hashMap.put(NetLogConstants.Environment.NET_IP_STACK, netProbeMap.get(NetLogConstants.Environment.NET_IP_STACK));
            hashMap.put(NetLogConstants.Environment.NET_QUALITY, netProbeMap.get(NetLogConstants.Environment.NET_QUALITY));
            hashMap.put(NetLogConstants.Environment.IS_WEAK_NET, netProbeMap.get(NetLogConstants.Environment.IS_WEAK_NET));
        }
        return hashMap;
    }

    private static String obtainValue(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "60ae8ff142e1991e255eb9db341bda35", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "60ae8ff142e1991e255eb9db341bda35") : (TextUtils.isEmpty(str) || StringUtil.NULL.equals(str)) ? str2 : str;
    }
}
