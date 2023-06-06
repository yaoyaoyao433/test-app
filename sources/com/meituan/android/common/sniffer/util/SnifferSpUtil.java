package com.meituan.android.common.sniffer.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.metrics.util.TimeUtil;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SnifferSpUtil {
    private static final long APPLY_LENGTH_THRESHOLD = 100;
    private static final long APPLY_TIME_THRESHOLD = 30000;
    private static final String KEY_SNIFFER_TIME = "sniffer_log_time";
    private static final String REPORT_DATE = "report_date";
    private static final String SNIFFER_CHANNEL = "sniffer_log_channel";
    private static final String SNIFFER_SP = "sniffer_sp";
    private q cipStorageCenter;
    private SharedPreferences.Editor editor;
    private long lastApplyTime;
    private JSONObject logTimeJson;
    private SharedPreferences sharedPreferences;
    private static SnifferSpUtil sInstance = new SnifferSpUtil();
    private static volatile boolean isInit = false;
    private HashMap<String, Integer> logCacheCounter = new HashMap<>();
    private HashMap<String, Integer> indexCacheCounter = new HashMap<>();
    private String dateCache = "";

    private SnifferSpUtil() {
    }

    public static SnifferSpUtil getInstance() {
        return sInstance;
    }

    public void init(@NonNull Context context) {
        this.sharedPreferences = context.getSharedPreferences(SNIFFER_SP, 0);
        this.cipStorageCenter = q.a(context, SNIFFER_CHANNEL, 2);
        this.editor = this.sharedPreferences.edit();
        this.dateCache = this.sharedPreferences.getString(REPORT_DATE, "");
        this.lastApplyTime = TimeUtil.currentTimeMillisSNTP();
        loadJsonFromStorage();
        isInit = true;
    }

    private void loadJsonFromStorage() {
        String string = this.sharedPreferences.getString(KEY_SNIFFER_TIME, "");
        if (TextUtils.isEmpty(string)) {
            this.logTimeJson = new JSONObject();
            return;
        }
        try {
            this.logTimeJson = new JSONObject(string);
        } catch (Exception e) {
            e.printStackTrace();
            this.logTimeJson = new JSONObject();
        }
    }

    public int getLogLimit(@NonNull String str) {
        if (isInit) {
            if (this.logCacheCounter.containsKey(str)) {
                return this.logCacheCounter.get(str).intValue();
            }
            return this.sharedPreferences.getInt(str, 0);
        }
        return Integer.MAX_VALUE;
    }

    public void setLogLimit(@NonNull String str, int i) {
        if (isInit) {
            this.logCacheCounter.put(str, Integer.valueOf(i));
            checkSave();
        }
    }

    public int getIndexLimit(@NonNull String str) {
        if (isInit) {
            if (this.indexCacheCounter.containsKey(str)) {
                return this.indexCacheCounter.get(str).intValue();
            }
            return this.sharedPreferences.getInt(str, 0);
        }
        return Integer.MAX_VALUE;
    }

    public void setIndexLimit(@NonNull String str, int i) {
        if (isInit) {
            this.indexCacheCounter.put(str, Integer.valueOf(i));
            checkSave();
        }
    }

    public String getReportDate() {
        return this.dateCache;
    }

    public void setReportDate(String str) {
        this.dateCache = str;
        checkSave();
    }

    public void clear() {
        if (isInit) {
            this.editor.clear().apply();
            this.logCacheCounter.clear();
            this.indexCacheCounter.clear();
        }
    }

    private void checkSave() {
        if (TimeUtil.currentTimeMillisSNTP() - this.lastApplyTime >= 30000 || this.logCacheCounter.size() >= APPLY_LENGTH_THRESHOLD || this.indexCacheCounter.size() >= APPLY_LENGTH_THRESHOLD) {
            saveToSp();
        }
    }

    private void saveToSp() {
        if (isInit) {
            for (Map.Entry<String, Integer> entry : this.logCacheCounter.entrySet()) {
                this.editor.putInt(entry.getKey(), entry.getValue().intValue());
            }
            this.logCacheCounter.clear();
            for (Map.Entry<String, Integer> entry2 : this.indexCacheCounter.entrySet()) {
                this.editor.putInt(entry2.getKey(), entry2.getValue().intValue());
            }
            this.indexCacheCounter.clear();
            this.editor.putString(REPORT_DATE, this.dateCache);
            this.editor.apply();
            this.lastApplyTime = TimeUtil.currentTimeMillisSNTP();
        }
    }

    public void saveInBackground() {
        saveToSp();
    }

    public long getTimeByModule(String str) {
        return this.logTimeJson.optLong(str, 0L);
    }

    public void setTimeByModule(String str) {
        try {
            this.logTimeJson.put(str, TimeUtil.currentTimeMillisSNTP() / 1000);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.cipStorageCenter.a(KEY_SNIFFER_TIME, this.logTimeJson.toString());
    }
}
