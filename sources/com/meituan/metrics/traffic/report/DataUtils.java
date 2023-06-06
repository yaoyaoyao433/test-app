package com.meituan.metrics.traffic.report;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.common.metricx.Internal;
import com.meituan.android.common.metricx.MetricX;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.metricx.utils.NetWorkUtils;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.metrics.util.RequestContext;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.retrofit2.ext.b;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DataUtils {
    private static final String HEADER_TRACE_ID = "M-TraceId";
    public static final int PARSE_JSON_LIMIT_SIZE = 204800;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile int supportRetrofit = -1;

    private static long toNonTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "35a6f7c185cb1569964e9e7445d8f8fc", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "35a6f7c185cb1569964e9e7445d8f8fc")).longValue() : j > 0 ? j * 1000000 : j;
    }

    public static void init(TrafficRecord trafficRecord) {
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a4b9f077326b27a187319b272d9510d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a4b9f077326b27a187319b272d9510d");
            return;
        }
        initBase(trafficRecord);
        initCronetInfo(trafficRecord);
        initZstdInfo(trafficRecord);
        initRetrofitInfo(trafficRecord);
    }

    private static void initBase(TrafficRecord trafficRecord) {
        TrafficRecord.Detail detail;
        Map<String, Object> data;
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a335f4191f07edf10b40ae1ab6c6f35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a335f4191f07edf10b40ae1ab6c6f35");
        } else if (trafficRecord == null || (detail = trafficRecord.getDetail()) == null || detail.requestContext == null || (data = detail.requestContext.getData()) == null) {
        } else {
            detail.netLibPostStart = NumberUtils.parseLong(data.get(RequestContext.KEY_NET_START), detail.netLibPostStart);
            detail.netLibPostEnd = NumberUtils.parseLong(data.get(RequestContext.KEY_NET_END), detail.netLibPostEnd);
            if (TextUtils.isEmpty(detail.networkLibInfo)) {
                detail.networkLibInfo = String.valueOf(data.get("network_lib"));
            }
            Object obj = data.get("network_tunnel");
            if (obj != null) {
                detail.networkTunnel = String.valueOf(obj);
            }
            Map map = (Map) data.get(NetLogConstants.Details.DNS_EVENT);
            if (map != null) {
                detail.extra.put(NetLogConstants.Details.DNS_EVENT, map);
                if (map.containsKey("dnsType")) {
                    detail.dnsType = ((Integer) map.get("dnsType")).intValue();
                }
            }
        }
    }

    public static Map<String, Object> getTags(Uri uri, BusinessInfo businessInfo, boolean z) {
        Object[] objArr = {uri, businessInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4a415589c0e3988924d2b27cc10a6f63", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4a415589c0e3988924d2b27cc10a6f63");
        }
        if (businessInfo == null || businessInfo.record == null || uri == null) {
            return null;
        }
        TrafficRecord trafficRecord = businessInfo.record;
        Context context = Metrics.getInstance().getContext();
        HashMap hashMap = new HashMap();
        hashMap.put(NetLogConstants.Tags.LOCAL_TS, Long.valueOf(System.currentTimeMillis()));
        hashMap.put(NetLogConstants.Tags.SNTP_TS, Long.valueOf(TimeUtil.currentTimeMillisSNTP()));
        hashMap.put("foreground", Boolean.valueOf(AppBus.getInstance().isForeground()));
        hashMap.put("processName", ProcessUtils.getCurrentProcessName(context));
        hashMap.put("page", businessInfo.currentActivity);
        MetricX.AppEnvironment appEnvironment = Internal.getAppEnvironment();
        if (appEnvironment != null) {
            hashMap.put("user_id", appEnvironment.getUserId());
        }
        hashMap.put(NetLogConstants.Tags.REQ_ID, getReqTraceId(uri));
        hashMap.put(NetLogConstants.Tags.TRACE_ID, getTraceId(trafficRecord));
        hashMap.put("method", trafficRecord.getMethod());
        hashMap.put(NetLogConstants.Details.CONTENT_TYPE, businessInfo.mediaType);
        hashMap.put(NetLogConstants.Details.COMPRESS_ALGORITHM, businessInfo.contentEncoding);
        hashMap.put(NetLogConstants.Details.SCHEME, uri.getScheme());
        hashMap.put("host", uri.getHost());
        hashMap.put("path", uri.getPath());
        String xCDNRequestID = getXCDNRequestID(trafficRecord);
        if (!TextUtils.isEmpty(xCDNRequestID)) {
            hashMap.put(NetLogConstants.Tags.X_CDN_REQUEST_ID, xCDNRequestID);
        }
        TrafficRecord.Detail detail = trafficRecord.getDetail();
        Map<String, List<String>> responseHeaders = trafficRecord.getResponseHeaders();
        if (detail != null) {
            if (TextUtils.isEmpty(detail.protocol)) {
                detail.protocol = getHeader(responseHeaders, "X-Android-Selected-Protocol", null);
            }
            if (detail.protocol != null) {
                hashMap.put(NetLogConstants.Details.PROTOCOL, detail.protocol);
            }
            hashMap.put(NetLogConstants.Details.REQUEST_REUSE, Integer.valueOf(detail.requestReuse));
            if (TextUtils.isEmpty(detail.url)) {
                detail.url = uri.toString();
            }
            hashMap.put("url", detail.url);
            if (detail.extra.containsKey(NetLogConstants.Details.SCHEME)) {
                hashMap.put(NetLogConstants.Details.SCHEME, detail.extra.get(NetLogConstants.Details.SCHEME));
                detail.extra.remove(NetLogConstants.Details.SCHEME);
            }
            if (detail.extra.containsKey("host")) {
                hashMap.put("host", detail.extra.get("host"));
                detail.extra.remove("host");
            }
            if (detail.dnsType >= 0) {
                hashMap.put(NetLogConstants.Details.DNS_TYPE, Integer.valueOf(detail.dnsType));
            }
            if (detail.localIp != null) {
                hashMap.put(NetLogConstants.Details.LOCAL_IP, detail.localIp.getAddress().getHostAddress() + CommonConstant.Symbol.COLON + detail.localIp.getPort());
            }
            if (detail.extra.containsKey(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP)) {
                detail.connectIp = new InetSocketAddress((String) detail.extra.remove(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP), "https".equalsIgnoreCase((String) hashMap.get(NetLogConstants.Details.SCHEME)) ? 443 : 80);
            }
            if (detail.connectIp != null) {
                hashMap.put(NetLogConstants.Details.SERVER_IP, detail.connectIp.getAddress().getHostAddress() + CommonConstant.Symbol.COLON + detail.connectIp.getPort());
                hashMap.put(NetLogConstants.Details.IS_IP_V6, Boolean.valueOf(detail.connectIp.getAddress() instanceof Inet6Address));
            }
            hashMap.put(NetLogConstants.Details.REDIRECT, Boolean.valueOf(detail.redirect));
            hashMap.put(NetLogConstants.Tags.NETWORK_TYPE, NetWorkUtils.getNetWorkTypeForBabel(context));
            hashMap.put(NetLogConstants.Tags.REQUEST_NETWORK_TYPE, detail.requestNetworkType);
            setNetworkLinInfo(hashMap, detail.networkLibInfo);
            setNetworkTunnelInfo(hashMap, detail);
            hashMap.put("network_tunnel", detail.networkTunnel);
            if (detail.tunnelType != -1) {
                hashMap.put("tunnel_type", Integer.valueOf(detail.tunnelType));
            }
            if (detail.exception instanceof IOException) {
                hashMap.put("io_exception", 1);
            }
            hashMap.put(NetLogConstants.Details.NET_RESPONSE_CODE, Integer.valueOf(getResponseCode(trafficRecord.getResponseCode(), detail)));
            if (businessInfo.businessCode != Integer.MAX_VALUE) {
                hashMap.put("business_code", Integer.valueOf(businessInfo.businessCode));
            }
            if (detail.startTime > 0 && detail.endTime > 0) {
                hashMap.put(NetLogConstants.Details.REQUEST_START_TIME, Long.valueOf(detail.startTime));
                hashMap.put(NetLogConstants.Details.REQUEST_END_TIME, Long.valueOf(detail.endTime));
            } else {
                hashMap.put(NetLogConstants.Details.REQUEST_START_TIME, Long.valueOf(trafficRecord.getStartTime()));
                hashMap.put(NetLogConstants.Details.REQUEST_END_TIME, Long.valueOf(trafficRecord.getEndTime()));
            }
            hashMap.put(NetLogConstants.Details.CACHED, Boolean.valueOf(detail.cached));
            if (detail.tlsVersion != null) {
                hashMap.put(NetLogConstants.Details.TLS_VERSION, detail.tlsVersion);
            }
            if (detail.proxy != null) {
                hashMap.put(NetLogConstants.Details.PROXY, detail.proxy);
            }
            if (detail.connectTryNum >= 0) {
                hashMap.put(NetLogConstants.Details.CONNECT_TRY_NUM, Integer.valueOf(detail.connectTryNum));
            }
            if (detail.connectFailedNum >= 0) {
                hashMap.put(NetLogConstants.Details.CONNECT_FAILED_NUM, Integer.valueOf(detail.connectFailedNum));
            }
            List arrayList = new ArrayList();
            if (detail.ipList != null && !detail.ipList.isEmpty()) {
                for (InetAddress inetAddress : detail.ipList) {
                    if (inetAddress != null) {
                        arrayList.add(inetAddress.getHostAddress());
                    }
                }
            }
            if (detail.extra.containsKey(NetLogConstants.Details.IP_LIST)) {
                arrayList = (List) detail.extra.remove(NetLogConstants.Details.IP_LIST);
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                hashMap.put(NetLogConstants.Details.IP_LIST, arrayList);
            }
            if (detail.extra.containsKey(NetLogConstants.Details.DNS_EVENT)) {
                hashMap.put(NetLogConstants.Details.DNS_EVENT, detail.extra.remove(NetLogConstants.Details.DNS_EVENT));
            }
            String header = getHeader(responseHeaders, "Raptor-Api-Time", "");
            if (!TextUtils.isEmpty(header)) {
                detail.serverTime = (long) (NumberUtils.parseDouble(header, 0.0d) * 1000.0d);
            }
            setExtra(detail, hashMap, z);
            setErrorMsg(hashMap, detail.exception);
        }
        return hashMap;
    }

    private static void setExtra(TrafficRecord.Detail detail, Map<String, Object> map, boolean z) {
        Object[] objArr = {detail, map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e15b9af7a4d491359339f814ed078ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e15b9af7a4d491359339f814ed078ff");
        } else if (detail == null || detail.extra == null || map == null) {
        } else {
            if (detail.extra.containsKey(NetLogConstants.Details.SHARK_EXTRA)) {
                Map map2 = (Map) detail.extra.get(NetLogConstants.Details.SHARK_EXTRA);
                if (isSupportRetrofit() && (detail.responseExt instanceof b) && ((b) detail.responseExt).g() != null) {
                    detail.requestTime = -1000L;
                    detail.responseTime = -1000L;
                }
                map.put(NetLogConstants.Details.SHARK_EXTRA, map2);
                detail.extra.remove(NetLogConstants.Details.SHARK_EXTRA);
            }
            if (detail.extra.containsKey(NetLogConstants.Details.CRONET_EXTRA)) {
                map.put(NetLogConstants.Details.CRONET_EXTRA, detail.extra.remove(NetLogConstants.Details.CRONET_EXTRA));
            }
            if (detail.extra.size() > 0) {
                map.put("extra", detail.extra);
            }
        }
    }

    private static void setErrorMsg(Map<String, Object> map, Throwable th) {
        String th2;
        Object[] objArr = {map, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "947be645bed20de60b3ab9095c7b702f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "947be645bed20de60b3ab9095c7b702f");
        } else if (map != null && th != null && (th2 = th.toString()) != null) {
            if (th2.length() > 300) {
                th2 = th2.substring(0, 300);
            }
            if (!(th instanceof IOException)) {
                StringBuilder sb = new StringBuilder(th2);
                StackTraceElement[] stackTrace = th.getStackTrace();
                if (stackTrace != null) {
                    for (int i = 0; i < stackTrace.length; i++) {
                        if (i < 8) {
                            sb.append("\n");
                            sb.append(stackTrace[i]);
                        }
                    }
                }
                th2 = sb.toString();
            }
            map.put(NetLogConstants.Details.ERROR_MSG, th2);
        }
    }

    public static JSONObject getDetail(TrafficRecord trafficRecord, boolean z) {
        Object[] objArr = {trafficRecord, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fc90e7d2e8595d89dd78ee4caa71b2cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fc90e7d2e8595d89dd78ee4caa71b2cb");
        }
        if (trafficRecord == null) {
            return null;
        }
        TrafficRecord.Detail detail = trafficRecord.getDetail();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("net_request_reuse", 1);
            jSONObject.put(NetLogConstants.Details.NET_REQUEST_HEADER_SIZE, trafficRecord.getRequestHeaderSize());
            jSONObject.put(NetLogConstants.Details.NET_REQUEST_BODY_SIZE, trafficRecord.getRequestBodySize());
            jSONObject.put(NetLogConstants.Details.NET_REQUEST_SIZE, getRequestSize(trafficRecord));
            long responseHeaderSize = trafficRecord.getResponseHeaderSize();
            jSONObject.put(NetLogConstants.Details.NET_RESPONSE_HEADER_SIZE, responseHeaderSize);
            String header = getHeader(trafficRecord.getResponseHeaders(), "nt_responsebody_size", null);
            if (TextUtils.isEmpty(header)) {
                header = getHeader(trafficRecord.getResponseHeaders(), "Content-Length", null);
            }
            long parseLong = NumberUtils.parseLong(header, trafficRecord.getResponseBodySize());
            long parseLong2 = NumberUtils.parseLong(getHeader(trafficRecord.getResponseHeaders(), "nt_response_size", null), 0L);
            if (parseLong2 > 0 && parseLong2 > responseHeaderSize) {
                jSONObject.put(NetLogConstants.Details.NET_RESPONSE_SIZE, parseLong2);
                jSONObject.put(NetLogConstants.Details.NET_RESPONSE_BODY_SIZE, parseLong == 0 ? 0L : parseLong2 - responseHeaderSize);
            } else {
                jSONObject.put(NetLogConstants.Details.NET_RESPONSE_BODY_SIZE, parseLong);
                jSONObject.put(NetLogConstants.Details.NET_RESPONSE_SIZE, responseHeaderSize + parseLong);
            }
            if (detail != null) {
                if (detail.elapsedTime >= 0) {
                    putNumber(jSONObject, NetLogConstants.Details.NET_ELAPSED_TIME, detail.elapsedTime);
                } else {
                    putNumber(jSONObject, NetLogConstants.Details.NET_ELAPSED_TIME, trafficRecord.getDuration());
                }
                putNumber(jSONObject, NetLogConstants.Details.NET_DNS_TIME, getTimeInMillis(detail.dnsTime));
                putNumber(jSONObject, NetLogConstants.Details.NET_CONN_TIME, getTimeInMillis(detail.connTime));
                putNumber(jSONObject, NetLogConstants.Details.NET_TLS_TIME, getTimeInMillis(detail.tlsTime));
                putNumber(jSONObject, "net_request_header_time", getTimeInMillis(detail.requestHeaderTime));
                putNumber(jSONObject, "net_request_body_time", getTimeInMillis(detail.requestBodyTime));
                putNumber(jSONObject, NetLogConstants.Details.NET_REQUEST_TIME, getTimeInMillis(detail.requestTime));
                putNumber(jSONObject, "net_response_header_time", getTimeInMillis(detail.responseHeaderTime));
                putNumber(jSONObject, "net_response_body_time", getTimeInMillis(detail.responseBodyTime));
                putNumber(jSONObject, NetLogConstants.Details.NET_RESPONSE_TIME, getTimeInMillis(detail.responseTime));
                if (detail.netFramePreStart > 0 && detail.startTime > 0) {
                    putNumber(jSONObject, NetLogConstants.Details.NET_FRAME_PRE_TIME, detail.startTime - detail.netFramePreStart);
                }
                if (detail.netFramePreEnd > 0 && detail.endTime > 0) {
                    putNumber(jSONObject, NetLogConstants.Details.NET_FRAME_POST_TIME, detail.netFramePreEnd - detail.endTime);
                }
                if (detail.startTime > 0 && detail.netLibPostStart > 0) {
                    putNumber(jSONObject, NetLogConstants.Details.NET_LIB_PRE_TIME, detail.netLibPostStart - detail.startTime);
                }
                if (detail.netLibPostEnd > 0 && detail.endTime > 0) {
                    putNumber(jSONObject, NetLogConstants.Details.NET_LIB_POST_TIME, detail.endTime - detail.netLibPostEnd);
                }
                if (detail.ttfbTime > 0) {
                    putNumber(jSONObject, NetLogConstants.Details.NET_TTFB_TIME, getTimeInMillis(detail.ttfbTime));
                }
                if (detail.serverTime > 0) {
                    putNumber(jSONObject, "net_server_time", detail.serverTime);
                }
                if (!z) {
                    jSONObject.put("net_request_count_error", 1);
                }
            }
        } catch (JSONException unused) {
            Logger.getMetricxLogger().d("DataUtils json出错");
        }
        return jSONObject;
    }

    private static void setNetworkLinInfo(Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6668908f1a08eff59756b42ca515cd41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6668908f1a08eff59756b42ca515cd41");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("/");
            if (split.length == 2) {
                map.put("network_lib", split[0]);
                map.put(NetLogConstants.Tags.NETWORK_LIB_VERSION, split[1]);
                return;
            }
        }
        map.put("network_lib", "other");
    }

    private static void setNetworkTunnelInfo(Map<String, Object> map, TrafficRecord.Detail detail) {
        Object[] objArr = {map, detail};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0aadec353a9be62d3b5ae2e9330c2e07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0aadec353a9be62d3b5ae2e9330c2e07");
            return;
        }
        String str = detail.tunnelSource;
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        map.put(NetLogConstants.Tags.TUNNEL_SOURCE, str);
        if (TextUtils.isEmpty(detail.switchTunnel)) {
            return;
        }
        map.put("switch_tunnel", detail.switchTunnel);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    private static void initCronetInfo(TrafficRecord trafficRecord) {
        TrafficRecord.Detail detail;
        char c;
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8db0180f10bb3cc6b81e8654fad6137b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8db0180f10bb3cc6b81e8654fad6137b");
        } else if (trafficRecord != null && (detail = trafficRecord.getDetail()) != null && detail.requestContext != null) {
            Map<String, Object> data = detail.requestContext.getData();
            Object obj = data.get("cronet_interceptor_time");
            if (obj != null) {
                detail.extra.put("all_time", obj);
            }
            Object obj2 = data.get("metricx_detail");
            if (obj2 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj2;
                detail.protocol = jSONObject.optString(NetLogConstants.Details.PROTOCOL, detail.protocol);
                detail.dnsTime = toNonTime(jSONObject.optLong("dns_time", -1L));
                detail.connTime = toNonTime(jSONObject.optLong("conn_time", -1L));
                detail.tlsTime = toNonTime(jSONObject.optLong("tls_time", -1L));
                detail.requestTime = toNonTime(jSONObject.optLong("request_time", -1L));
                detail.responseTime = toNonTime(jSONObject.optLong("response_time", -1L));
                detail.ttfbTime = toNonTime(jSONObject.optLong("ttfb_time", -1L));
                detail.requestReuse = jSONObject.optBoolean(LaunchMode.LAUNCH_MODE_REUSE) ? 1 : 0;
            }
            Object obj3 = data.get("metricx_extra");
            if (obj3 instanceof Map) {
                for (Map.Entry entry : ((Map) obj3).entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        String str = (String) entry.getKey();
                        switch (str.hashCode()) {
                            case -1368047326:
                                if (str.equals(NetLogConstants.Details.CACHED)) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1111334571:
                                if (str.equals(NetLogConstants.Details.CONNECT_TRY_NUM)) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -776144932:
                                if (str.equals(NetLogConstants.Details.REDIRECT)) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 106941038:
                                if (str.equals(NetLogConstants.Details.PROXY)) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 412193936:
                                if (str.equals(NetLogConstants.Details.DNS_TYPE)) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1618670429:
                                if (str.equals("tlsVersion")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1634986047:
                                if (str.equals(NetLogConstants.Details.CONNECT_FAILED_NUM)) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1731536350:
                                if (str.equals("originalUrl")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                detail.url = entry.getValue().toString();
                                continue;
                            case 1:
                                detail.cached = ((Boolean) entry.getValue()).booleanValue();
                                continue;
                            case 2:
                                detail.dnsType = ((Integer) entry.getValue()).intValue();
                                continue;
                            case 3:
                                detail.redirect = ((Boolean) entry.getValue()).booleanValue();
                                continue;
                            case 4:
                                detail.proxy = entry.getValue().toString();
                                continue;
                            case 5:
                                detail.connectTryNum = ((Integer) entry.getValue()).intValue();
                                continue;
                            case 6:
                                detail.connectFailedNum = ((Integer) entry.getValue()).intValue();
                                continue;
                            case 7:
                                detail.tlsVersion = entry.getValue().toString();
                                continue;
                            default:
                                detail.extra.put(entry.getKey(), entry.getValue());
                                continue;
                        }
                    }
                }
            }
        }
    }

    private static void initZstdInfo(TrafficRecord trafficRecord) {
        String[] split;
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7b092ff34f2c607925ddce5fc3d9090e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7b092ff34f2c607925ddce5fc3d9090e");
        } else if (trafficRecord.getResponseHeaders() == null || trafficRecord.getDetail() == null) {
        } else {
            Map<String, Object> map = trafficRecord.getDetail().extra;
            String header = getHeader(trafficRecord.getResponseHeaders(), "nt_zstd", null);
            if (TextUtils.isEmpty(header) || (split = header.split(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR)) == null || split.length != 4) {
                return;
            }
            map.put("z_hit", split[0]);
            map.put("z_mode", split[1]);
            map.put("z_result", split[2]);
            map.put("z_time", split[3]);
        }
    }

    private static void initRetrofitInfo(TrafficRecord trafficRecord) {
        TrafficRecord.Detail detail;
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95198b70791514c559e91743a4fe2e90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95198b70791514c559e91743a4fe2e90");
        } else if (trafficRecord == null || (detail = trafficRecord.getDetail()) == null || detail.responseExt == null || !isSupportRetrofit() || !(detail.responseExt instanceof b)) {
        } else {
            b bVar = (b) detail.responseExt;
            if (bVar.e() > 0 && bVar.d() > 0) {
                detail.extra.put("rf_th", Long.valueOf(bVar.d() - bVar.e()));
            }
            if (bVar.e() > 0 && bVar.f() > 0) {
                detail.extra.put(NetLogConstants.Details.RF_T, Long.valueOf(bVar.f() - bVar.e()));
            }
            detail.netFramePreStart = bVar.e();
            detail.netFramePreEnd = bVar.f();
        }
    }

    public static long getDelayTime(TrafficRecord.Detail detail) {
        Object[] objArr = {detail};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4ffec24e57d9d3a57a1605ee6798d3aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4ffec24e57d9d3a57a1605ee6798d3aa")).longValue();
        }
        if (detail != null && isSupportRetrofit() && (detail.responseExt instanceof b)) {
            b bVar = (b) detail.responseExt;
            if (bVar.e() > 0 && bVar.f() <= 0) {
                return 100L;
            }
        }
        return 0L;
    }

    private static double getTimeInMillis(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c9e6a88d4836cd8912dfe24276f2f6a9", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c9e6a88d4836cd8912dfe24276f2f6a9")).doubleValue() : j <= 0 ? j : (j / 10000) / 100.0d;
    }

    private static void putNumber(JSONObject jSONObject, String str, double d) throws JSONException {
        Object[] objArr = {jSONObject, str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1cfa60d9af142ea0d53a4d69e7617344", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1cfa60d9af142ea0d53a4d69e7617344");
        } else if (d >= 0.0d) {
            jSONObject.put(str, d);
        }
    }

    private static String getHeader(Map<String, List<String>> map, String str, String str2) {
        List<String> list;
        Object[] objArr = {map, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e2c6aaee3b2a3465c12e04ec1c9a0c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e2c6aaee3b2a3465c12e04ec1c9a0c2");
        }
        if (map == null) {
            return str2;
        }
        List<String> list2 = map.get(str);
        if (list2 != null && list2.size() > 0) {
            return list2.get(0);
        }
        String lowerCase = str.toLowerCase();
        return (lowerCase.equals(str) || (list = map.get(lowerCase)) == null || list.size() <= 0) ? str2 : list.get(0);
    }

    private static long getRequestSize(TrafficRecord trafficRecord) {
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "50f058b7d35ec713c65e1ed3b6f21023", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "50f058b7d35ec713c65e1ed3b6f21023")).longValue();
        }
        if (trafficRecord == null) {
            return 0L;
        }
        String url = trafficRecord.getUrl();
        return (url != null ? url.getBytes().length : 0L) + trafficRecord.getRequestHeaderSize() + trafficRecord.getRequestBodySize();
    }

    private static int getResponseCode(int i, TrafficRecord.Detail detail) {
        Object[] objArr = {Integer.valueOf(i), detail};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ea1db57cefc64084e879cb4e85b27289", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ea1db57cefc64084e879cb4e85b27289")).intValue();
        }
        Throwable th = detail.exception;
        if (th != null) {
            if (th instanceof Exception) {
                return NetExceptionCodeUtil.getExceptionCode(detail);
            }
            return NetExceptionCodeUtil.getDefaultExceptionCode();
        }
        return i;
    }

    public static BusinessInfo prepareBusinessInfo(TrafficRecord trafficRecord) {
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "05278942cd9fec80434fa5e5572ff04b", RobustBitConfig.DEFAULT_VALUE)) {
            return (BusinessInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "05278942cd9fec80434fa5e5572ff04b");
        }
        BusinessInfo businessInfo = new BusinessInfo();
        businessInfo.record = trafficRecord;
        if (trafficRecord.getDetail() == null) {
            return businessInfo;
        }
        Map<String, List<String>> responseHeaders = trafficRecord.getResponseHeaders();
        if (NetExceptionCodeUtil.isHttpSuccess(trafficRecord.getResponseCode())) {
            parseContentType(businessInfo, responseHeaders);
            businessInfo.contentEncoding = getHeader(responseHeaders, "Content-Encoding", null);
            if (TextUtils.isEmpty(businessInfo.contentEncoding)) {
                businessInfo.contentEncoding = getHeader(responseHeaders, "nt_encoding", null);
            }
            String header = getHeader(responseHeaders, "nt_business_code", null);
            if (!TextUtils.isEmpty(header)) {
                businessInfo.businessCode = NumberUtils.parseInt(header, Integer.MAX_VALUE);
            }
        }
        businessInfo.currentActivity = trafficRecord.getDetail().currentActivity;
        return businessInfo;
    }

    public static boolean canParseJson(TrafficRecord trafficRecord) {
        String header;
        String[] split;
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb895d2c3c0cd921e202eb62bee66849", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb895d2c3c0cd921e202eb62bee66849")).booleanValue();
        }
        if (trafficRecord != null && NumberUtils.parseLong(getHeader(trafficRecord.getResponseHeaders(), "Content-Length", null), -1L) <= 204800 && (header = getHeader(trafficRecord.getResponseHeaders(), "Content-Type", null)) != null) {
            for (String str : header.split(";")) {
                if (str != null && str.trim().equals(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void parseContentType(BusinessInfo businessInfo, Map<String, List<String>> map) {
        String[] split;
        Object[] objArr = {businessInfo, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4128a20cc78f32fc9440783380e207ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4128a20cc78f32fc9440783380e207ee");
            return;
        }
        String header = getHeader(map, "Content-Type", null);
        if (header != null) {
            for (String str : header.split(";")) {
                if (str != null) {
                    String trim = str.trim();
                    if (trim.startsWith("charset")) {
                        if (trim.length() > 8) {
                            businessInfo.charset = trim.substring(8);
                        }
                    } else {
                        businessInfo.mediaType = trim;
                    }
                }
            }
        }
    }

    private static Charset getCharset(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Charset charset = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c9ada5ffc6d713807335281a92d9ac91", RobustBitConfig.DEFAULT_VALUE)) {
            return (Charset) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c9ada5ffc6d713807335281a92d9ac91");
        }
        if (str != null) {
            try {
                charset = Charset.forName(str);
            } catch (Throwable unused) {
            }
        }
        if (charset == null) {
            try {
                return Charset.forName("UTF-8");
            } catch (Throwable unused2) {
                return charset;
            }
        }
        return charset;
    }

    public static boolean isSuccessful(TrafficRecord trafficRecord) {
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "26e30cfd8edc1d45f7d4e6dffaed32e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "26e30cfd8edc1d45f7d4e6dffaed32e0")).booleanValue();
        }
        int responseCode = getResponseCode(trafficRecord.getResponseCode(), trafficRecord.getDetail());
        return (responseCode >= 100 && responseCode <= 103) || responseCode / 100 == 2 || (responseCode >= 300 && responseCode <= 307) || ((responseCode >= 450 && responseCode <= 460) || responseCode == -513 || responseCode == -596 || responseCode == -597);
    }

    public static String getReqTraceId(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fd441f230ced9e2060f92ef766007c00", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fd441f230ced9e2060f92ef766007c00");
        }
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("__reqTraceID");
        return TextUtils.isEmpty(queryParameter) ? UUID.randomUUID().toString() : queryParameter;
    }

    public static String getTraceId(TrafficRecord trafficRecord) {
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e0ccb341d5aa728017727621b9958f81", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e0ccb341d5aa728017727621b9958f81");
        }
        if (trafficRecord == null) {
            return null;
        }
        String header = getHeader(trafficRecord.getRequestHeaders(), HEADER_TRACE_ID, "");
        return TextUtils.isEmpty(header) ? getHeader(trafficRecord.getResponseHeaders(), HEADER_TRACE_ID, "") : header;
    }

    public static String getXCDNRequestID(TrafficRecord trafficRecord) {
        Object[] objArr = {trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "272004608d59072353a95d65f9655cb2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "272004608d59072353a95d65f9655cb2");
        }
        if (trafficRecord == null) {
            return null;
        }
        return getHeader(trafficRecord.getResponseHeaders(), "x-cdn-request-id", "");
    }

    public static boolean isSupportRetrofit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "075694057731d82ce812ea92b77fb2ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "075694057731d82ce812ea92b77fb2ed")).booleanValue();
        }
        if (supportRetrofit == -1) {
            try {
                supportRetrofit = 1;
            } catch (Throwable unused) {
                supportRetrofit = 0;
            }
        }
        return supportRetrofit == 1;
    }
}
