package com.speech.vadsdk.log;

import android.support.annotation.Keep;
import com.speech.vadsdk.nativelib.d;
import com.speech.vadsdk.nativelib.data.GlobalEngineInfoJni;
import com.speech.vadsdk.wakeup.WakeUpManager;
import com.speech.vadsdk.wakeup.WakeUpResult;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class WakeUpBabelReport {
    private static final String WAKEUP_BABEL_LOG_TYPE = "embed-wakeup";

    private static void reportBabel(String str, String str2, Map<String, Object> map) {
    }

    private WakeUpBabelReport() {
    }

    public static void uploadSdkError(int i, String str, String str2) {
        Map<String, Object> initStatsMap = initStatsMap();
        initStatsMap.put("embed_wakeup_sdk_error_code", Integer.valueOf(i));
        initStatsMap.put("embed_wakeup_sdk_error_msg", str);
        initStatsMap.put("embed_wakeup_sdk_session_id", str2);
        reportBabel(WAKEUP_BABEL_LOG_TYPE, str, initStatsMap);
    }

    public static void uploadSdkSuccess(int i, String str, String str2, WakeUpResult wakeUpResult) {
        Map<String, Object> initStatsMap = initStatsMap();
        initStatsMap.put("embed_wakeup_sdk_error_code", Integer.valueOf(i));
        initStatsMap.put("embed_wakeup_sdk_error_msg", str);
        initStatsMap.put("embed_wakeup_sdk_session_id", str2);
        if (wakeUpResult != null) {
            initStatsMap.put("embed_wakeup_keyword", wakeUpResult.getKeyword());
            initStatsMap.put("embed_wakeup_keyword_pinyin", wakeUpResult.getKeywordPinyin());
            initStatsMap.put("embed_wakeup_keyword_id", Integer.valueOf(wakeUpResult.getKeywordId()));
            initStatsMap.put("embed_wakeup_start_time", Integer.valueOf(wakeUpResult.getStartTime()));
            initStatsMap.put("embed_wakeup_end_time", Integer.valueOf(wakeUpResult.getEndTime()));
            initStatsMap.put("embed_wakeup_start_offset", Integer.valueOf(wakeUpResult.getStartOffset()));
            initStatsMap.put("embed_wakeup_end_offset", Integer.valueOf(wakeUpResult.getEndOffset()));
            initStatsMap.put("embed_wakeup_score", Float.valueOf(wakeUpResult.getScore()));
        }
        reportBabel(WAKEUP_BABEL_LOG_TYPE, str, initStatsMap);
    }

    public static void uploadEngineError(int i, String str) {
        Map<String, Object> initStatsMap = initStatsMap();
        initStatsMap.put("embed_wakeup_engine_error_code", Integer.valueOf(i));
        reportBabel(WAKEUP_BABEL_LOG_TYPE, str, initStatsMap);
    }

    public static void uploadEngineError(int i, com.speech.vadsdk.nativelib.data.a aVar) {
        Map<String, Object> initStatsMap = initStatsMap();
        initStatsMap.put("embed_wakeup_engine_error_code", Integer.valueOf(i));
        initStatsMap.put("embed_wakeup_debug_is_last", Boolean.valueOf(aVar.a));
        initStatsMap.put("embed_wakeup_debug_wav_data_len", Integer.valueOf(aVar.b));
        initStatsMap.put("embed_wakeup_debug_buffer_data_len", Integer.valueOf(aVar.c));
        initStatsMap.put("embed_wakeup_debug_total_buffer_data_len", Integer.valueOf(aVar.d));
        initStatsMap.put("embed_wakeup_debug_segment_start_len", Integer.valueOf(aVar.e));
        initStatsMap.put("embed_wakeup_debug_vad_result_str", aVar.f);
        initStatsMap.put("embed_wakeup_debug_num_frame", Integer.valueOf(aVar.b));
        initStatsMap.put("embed_wakeup_debug_threshold", Float.valueOf(aVar.h));
        initStatsMap.put("embed_wakeup_debug_decode_current_token_num", Integer.valueOf(aVar.i));
        initStatsMap.put("embed_wakeup_debug_decode_curr_cutoff", Float.valueOf(aVar.j));
        initStatsMap.put("embed_wakeup_debug_decode_next_cutoff", Float.valueOf(aVar.k));
        initStatsMap.put("embed_wakeup_debug_decode_num_frames", Integer.valueOf(aVar.l));
        initStatsMap.put("embed_wakeup_debug_decode_trace_pool_left", Integer.valueOf(aVar.n));
        reportBabel(WAKEUP_BABEL_LOG_TYPE, "engine error", initStatsMap);
    }

    private static Map<String, Object> initStatsMap() {
        GlobalEngineInfoJni versionInfo;
        HashMap hashMap = new HashMap();
        hashMap.put("embed_wakeup_sdk_version", "1.2.6");
        d c = com.speech.vadsdk.nativelib.b.c();
        if (c != null && (versionInfo = c.a.getVersionInfo()) != null) {
            hashMap.put("embed_wakeup_engine_version", versionInfo.enginVersion);
            hashMap.put("embed_wakeup_resource_version", versionInfo.wakeUpModelVersion);
        }
        hashMap.put("embed_wakeup_app_key", WakeUpManager.getInstance().getWakeUpEnvironment().getAppKey());
        hashMap.put("embed_wakeup_secret_key", WakeUpManager.getInstance().getWakeUpEnvironment().getSecretKey());
        hashMap.put("embed_wakeup_result_time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
        return hashMap;
    }
}
