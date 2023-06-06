package com.meituan.android.common.sniffer;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.sniffer.bean.ExcludeConfig;
import com.meituan.android.common.sniffer.bean.MonitorConfig;
import com.meituan.android.common.sniffer.bean.WebConfig;
import com.meituan.android.common.sniffer.util.GsonUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ConfigManager {
    private static volatile boolean enabled = true;
    private static volatile Map<String, ExcludeConfig> excludeConfigMap;
    private static volatile Map<String, MonitorConfig.HttpCommand> httpCommandMap;
    private static volatile Map<String, MonitorConfig> monitorConfigMap;
    private static volatile WebConfig webConfig;

    public static void init(Context context) {
        loadServer(new HashMap());
        generateHttpCommandMap();
    }

    public static Map<String, MonitorConfig> getMonitorConfig() {
        return monitorConfigMap;
    }

    public static Map<String, ExcludeConfig> getExcludeConfigMap() {
        return excludeConfigMap;
    }

    public static WebConfig getWebConfig() {
        return webConfig;
    }

    public static Map<String, MonitorConfig.HttpCommand> getHttpCommandMap() {
        return httpCommandMap;
    }

    public static boolean isEnabled() {
        return enabled;
    }

    private static synchronized void generateHttpCommandMap() {
        synchronized (ConfigManager.class) {
            if (monitorConfigMap != null && monitorConfigMap.size() != 0) {
                if (httpCommandMap == null) {
                    httpCommandMap = new ConcurrentHashMap();
                }
                for (Map.Entry<String, MonitorConfig> entry : monitorConfigMap.entrySet()) {
                    for (MonitorConfig.Command command : entry.getValue().commandList) {
                        if (command instanceof MonitorConfig.HttpCommand) {
                            httpCommandMap.put(command.module, (MonitorConfig.HttpCommand) command);
                        }
                    }
                }
            }
        }
    }

    private static void loadServer(final Map<String, MonitorConfig> map) {
        Reporter.fetchConfig(new HornCallback() { // from class: com.meituan.android.common.sniffer.ConfigManager.1
            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                try {
                    if (Sniffer.isDebugMode()) {
                        StringBuilder sb = new StringBuilder("[Horn信令配置] enable:");
                        sb.append(z);
                        sb.append("; result: ");
                        sb.append(str);
                    }
                    ConfigManager.parseWebConfig(z, str, map);
                } catch (Exception e) {
                    if (Sniffer.isDebugMode()) {
                        e.getMessage();
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void parseWebConfig(boolean z, String str, Map<String, MonitorConfig> map) {
        Set<MonitorConfig.Command> set;
        if (!z || TextUtils.isEmpty(str)) {
            if (map.size() > 0) {
                monitorConfigMap = map;
                return;
            }
            return;
        }
        WebConfig webConfig2 = (WebConfig) GsonUtil.getCommandGson().fromJson(str, (Class<Object>) WebConfig.class);
        webConfig = webConfig2;
        enabled = webConfig2.enabled;
        if (!webConfig.enabled) {
            if (map.size() > 0) {
                monitorConfigMap = map;
                return;
            }
            return;
        }
        List<ExcludeConfig> list = webConfig.excludeConfigs;
        if (list != null && list.size() > 0) {
            HashMap hashMap = new HashMap();
            for (ExcludeConfig excludeConfig : list) {
                if (excludeConfig.module != null) {
                    hashMap.put(excludeConfig.module, excludeConfig);
                }
                if (excludeConfig.methodNumber != null) {
                    if (excludeConfig.module == null && excludeConfig.type == null) {
                        map.remove(excludeConfig.methodNumber);
                    } else {
                        MonitorConfig monitorConfig = map.get(excludeConfig.methodNumber);
                        if (monitorConfig != null && (set = monitorConfig.commandList) != null && set.size() != 0) {
                            HashSet hashSet = new HashSet();
                            for (MonitorConfig.Command command : set) {
                                if (!TextUtils.isEmpty(excludeConfig.module) && excludeConfig.module.equals(command.module)) {
                                    if (TextUtils.isEmpty(excludeConfig.type)) {
                                        hashSet.add(command);
                                    } else if (excludeConfig.type.equals(command.type)) {
                                        hashSet.add(command);
                                    }
                                }
                            }
                            set.removeAll(hashSet);
                        }
                    }
                }
            }
            if (hashMap.size() > 0) {
                excludeConfigMap = hashMap;
            }
        }
        List<MonitorConfig> list2 = webConfig.monitorConfigs;
        if (list2 != null) {
            for (MonitorConfig monitorConfig2 : list2) {
                if (map.containsKey(monitorConfig2.methodNumber)) {
                    map.get(monitorConfig2.methodNumber).commandList.addAll(monitorConfig2.commandList);
                } else {
                    map.put(monitorConfig2.methodNumber, monitorConfig2);
                }
            }
        }
        if (map.size() > 0) {
            monitorConfigMap = map;
        }
        generateHttpCommandMap();
    }
}
