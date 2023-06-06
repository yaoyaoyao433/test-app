package com.meituan.android.common.sniffer.network;

import android.text.TextUtils;
import android.util.LruCache;
import com.meituan.android.common.sniffer.ConfigManager;
import com.meituan.android.common.sniffer.bean.MonitorConfig;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class NetworkProcessor {
    static LruCache<String, NetworkInfo> lruCache = new LruCache<>(5);
    static Map<String, Integer> handledUrl = new HashMap();

    public static boolean isNeedUrl(String str, int i) {
        Map<String, MonitorConfig.HttpCommand> httpCommandMap;
        try {
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!TextUtils.isEmpty(str) && (httpCommandMap = ConfigManager.getHttpCommandMap()) != null && httpCommandMap.size() != 0) {
            if (handledUrl.containsKey(str) && handledUrl.get(str).intValue() == i) {
                return false;
            }
            URI uri = new URI(str);
            String host = uri.getHost();
            String path = uri.getPath();
            for (Map.Entry<String, MonitorConfig.HttpCommand> entry : httpCommandMap.entrySet()) {
                MonitorConfig.HttpCommand value = entry.getValue();
                if (TextUtils.isEmpty(value.host) || value.host.equals(host)) {
                    if (value.path != null && Arrays.asList(value.path).contains(path)) {
                        value.urls.add(str);
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void addNetworkInfo(String str, int i, byte[] bArr, String str2) {
        addNetworkInfo(str, i, (bArr == null || bArr.length <= 0) ? null : new String(bArr), str2);
    }

    static void addNetworkInfo(String str, int i, String str2, String str3) {
        lruCache.put(str, new NetworkInfo(str, i, str2, str3));
    }

    public static NetworkInfo getNetworkInfo(String str) {
        return lruCache.get(str);
    }
}
