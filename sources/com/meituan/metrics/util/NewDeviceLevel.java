package com.meituan.metrics.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NewDeviceLevel {
    private static final int CPU_SCORE_EXCEPTION = -2;
    private static final int CPU_SCORE_INVALID = -1;
    private static final int CPU_SCORE_NOT_FILLED = -2;
    private static final String DEVICE_CACHE_SP_CPU_INFO = "cpuInfo";
    public static final String DEVICE_CACHE_SP_ENABLE_SCORE = "enableScore";
    public static final String DEVICE_CACHE_SP_NEW_LEVEL = "newLevel";
    private static final String DEVICE_CACHE_SP_SCORE = "score";
    public static final String DEVICE_CACHE_SP_USE_NEW_LEVEL = "useNewLevel";
    private static final String JSON_KEY_CPU_CORES = "cpuCores";
    private static final String JSON_KEY_CPU_FREQUENCY = "cpuFrequency";
    private static final String JSON_KEY_CPU_PART = "cpuPart";
    private static final String JSON_KEY_CPU_SCORE = "cpuScore";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile long[] cpuMaxFreq;
    private static volatile double[] cpuPartScores;
    private static volatile String cpuPartStr;
    public static final Map<String, Double> cpuScoresFromHorn = new ConcurrentHashMap();
    private static float deviceScore;

    public static double getDeviceScore(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "96b6a43350aadd49f538b17774a44653", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "96b6a43350aadd49f538b17774a44653")).doubleValue();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(DeviceUtil.HORN_DEVICE_CONFIG_SP, 0);
        if (sharedPreferences.getBoolean(DEVICE_CACHE_SP_ENABLE_SCORE, true)) {
            if (deviceScore != 0.0f) {
                return deviceScore;
            }
            float f = sharedPreferences.getFloat(DEVICE_CACHE_SP_SCORE, 0.0f);
            deviceScore = f;
            if (f != 0.0f) {
                return deviceScore;
            }
            return updateDeviceScore(context);
        }
        return -1.0d;
    }

    public static double updateDeviceScore(Context context) {
        double d;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b78358524b1c76baafb0014a399eccdc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b78358524b1c76baafb0014a399eccdc")).doubleValue();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(DeviceUtil.HORN_DEVICE_CONFIG_SP, 0);
        if (sharedPreferences.getBoolean(DEVICE_CACHE_SP_ENABLE_SCORE, true)) {
            try {
                d = updateCpuScore(context);
            } catch (Exception unused) {
                d = -2.0d;
            }
            if (d < 0.0d) {
                deviceScore = (float) d;
            } else {
                deviceScore = (float) (d + (((float) (DeviceUtil.getMaxPhoneMemory(context) >> 20)) / 1024.0f));
            }
            sharedPreferences.edit().putFloat(DEVICE_CACHE_SP_SCORE, deviceScore).apply();
            return deviceScore;
        }
        return -1.0d;
    }

    public static String readCpuPart(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "de34451d59036525bd4edf6f1dc9e425", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "de34451d59036525bd4edf6f1dc9e425");
        }
        if (cpuPartStr == null) {
            cpuPartStr = context.getSharedPreferences(DeviceUtil.HORN_DEVICE_CONFIG_SP, 0).getString(DEVICE_CACHE_SP_CPU_INFO, null);
        }
        return cpuPartStr;
    }

    private static double updateCpuScore(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "96ce5b975ee4f8493030bf2cc299fb90", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "96ce5b975ee4f8493030bf2cc299fb90")).doubleValue();
        }
        prepareAllMaxCpuFreq();
        prepateCpuPartScore(context);
        double d = 0.0d;
        for (int i = 0; i < DeviceUtil.getNumOfCores(); i++) {
            double d2 = cpuPartScores[i];
            if (d2 < 0.0d) {
                return -1.0d;
            }
            d += (d2 * cpuMaxFreq[i]) / 1000000.0d;
        }
        return d;
    }

    private static void prepareAllMaxCpuFreq() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5a74f6d3c367f507669f8c467877c332", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5a74f6d3c367f507669f8c467877c332");
        } else if (cpuMaxFreq != null) {
        } else {
            cpuMaxFreq = obtainAllMaxCpuFreqByProc();
        }
    }

    private static void prepateCpuPartScore(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fd624d4e44c86589af090b362c58a964", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fd624d4e44c86589af090b362c58a964");
        } else if (cpuPartScores != null) {
        } else {
            cpuPartScores = getCpuPartScores(context);
        }
    }

    private static long[] obtainAllMaxCpuFreqByProc() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2cf6e7c5f9e5ccc6917773a12352953c", RobustBitConfig.DEFAULT_VALUE)) {
            return (long[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2cf6e7c5f9e5ccc6917773a12352953c");
        }
        long[] jArr = new long[DeviceUtil.getNumOfCores()];
        long j = -1;
        boolean z = true;
        for (int i = 0; i < DeviceUtil.getNumOfCores(); i++) {
            String obtainMaxCpuFreqByProc = obtainMaxCpuFreqByProc(i);
            long parseLong = obtainMaxCpuFreqByProc != null ? NumberUtils.parseLong(obtainMaxCpuFreqByProc, 0L) : -1L;
            if (parseLong <= 0) {
                if (j > 0) {
                    jArr[i] = j;
                }
            } else if (z) {
                Arrays.fill(jArr, parseLong);
                j = parseLong;
                z = false;
            } else {
                jArr[i] = parseLong;
                j = parseLong;
            }
        }
        return jArr;
    }

    private static String obtainMaxCpuFreqByProc(int i) {
        Process process;
        BufferedReader bufferedReader;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BufferedReader bufferedReader2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "05c3863068567be8fd2d7e5efe2e4a59", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "05c3863068567be8fd2d7e5efe2e4a59");
        }
        String str = "/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq";
        if (!new File(str).exists()) {
            return null;
        }
        try {
            process = Runtime.getRuntime().exec(new String[]{"cat", str});
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                try {
                    if (Build.VERSION.SDK_INT >= 26) {
                        if (!process.waitFor(1L, TimeUnit.SECONDS)) {
                            process.destroy();
                        }
                    } else {
                        process.waitFor();
                    }
                    String readLine = bufferedReader.readLine();
                    if (process != null) {
                        process.destroy();
                    }
                    DeviceUtil.closeBufferReader(bufferedReader);
                    return readLine;
                } catch (IOException | InterruptedException unused) {
                    if (process != null) {
                        process.destroy();
                    }
                    DeviceUtil.closeBufferReader(bufferedReader);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    if (process != null) {
                        process.destroy();
                    }
                    DeviceUtil.closeBufferReader(bufferedReader2);
                    throw th;
                }
            } catch (IOException | InterruptedException unused2) {
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException | InterruptedException unused3) {
            process = null;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            process = null;
        }
    }

    private static double[] getCpuPartScores(Context context) {
        BufferedReader bufferedReader;
        boolean z = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BufferedReader bufferedReader2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f96637b8553ebb1684856eb61dce33ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f96637b8553ebb1684856eb61dce33ab");
        }
        double[] dArr = new double[DeviceUtil.getNumOfCores()];
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        HashSet<Integer> hashSet = new HashSet(DeviceUtil.getNumOfCores());
        obtainAllMaxCpuFreqByProc();
        Arrays.fill(dArr, -2.0d);
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            try {
                JSONObject[] jSONObjectArr = new JSONObject[DeviceUtil.getNumOfCores()];
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    if (readLine.startsWith("processor\t: ")) {
                        hashSet.add(Integer.valueOf(Integer.parseInt(readLine.substring(12))));
                    } else if (readLine.startsWith("CPU part\t: ")) {
                        String substring = readLine.substring(11);
                        double scoreFromCpuPart = getScoreFromCpuPart(substring);
                        if (z) {
                            Arrays.fill(dArr, scoreFromCpuPart);
                            for (int i = 0; i < jSONObjectArr.length; i++) {
                                jSONObjectArr[i] = generateCpuCoreJSONObject(cpuMaxFreq[i], substring);
                            }
                            z = false;
                        } else {
                            for (Integer num : hashSet) {
                                if (num != null && num.intValue() < DeviceUtil.getNumOfCores()) {
                                    dArr[num.intValue()] = scoreFromCpuPart;
                                    jSONObjectArr[num.intValue()] = generateCpuCoreJSONObject(cpuMaxFreq[num.intValue()], substring);
                                    scoreFromCpuPart = scoreFromCpuPart;
                                }
                            }
                        }
                        hashSet.clear();
                    }
                }
                for (JSONObject jSONObject2 : jSONObjectArr) {
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put(JSON_KEY_CPU_CORES, jSONArray);
                jSONObject.put(Constants.MEMORY, (DeviceUtil.getMaxPhoneMemory(context) >> 20) / 1024.0d);
                DeviceUtil.closeBufferReader(bufferedReader);
            } catch (IOException | JSONException unused) {
                bufferedReader2 = bufferedReader;
                DeviceUtil.closeBufferReader(bufferedReader2);
                storeCpuPart2Sp(context, jSONObject);
                return dArr;
            } catch (Throwable th) {
                th = th;
                DeviceUtil.closeBufferReader(bufferedReader);
                throw th;
            }
        } catch (IOException | JSONException unused2) {
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        storeCpuPart2Sp(context, jSONObject);
        return dArr;
    }

    private static JSONObject generateCpuCoreJSONObject(long j, String str) throws JSONException {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8933a216dca5d4663a764f6e5920194a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8933a216dca5d4663a764f6e5920194a");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(JSON_KEY_CPU_PART, str);
        jSONObject.put(JSON_KEY_CPU_FREQUENCY, j);
        jSONObject.put(JSON_KEY_CPU_SCORE, getScoreFromCpuPart(str));
        return jSONObject;
    }

    private static void storeCpuPart2Sp(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a6f3927a4cfd9fa8467cd0def509a0b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a6f3927a4cfd9fa8467cd0def509a0b5");
            return;
        }
        cpuPartStr = jSONObject.toString();
        context.getSharedPreferences(DeviceUtil.HORN_DEVICE_CONFIG_SP, 0).edit().putString(DEVICE_CACHE_SP_CPU_INFO, cpuPartStr).apply();
    }

    private static double getScoreFromCpuPart(String str) {
        Double d;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c387e752b6e646fb90918894b965554b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c387e752b6e646fb90918894b965554b")).doubleValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1.0d;
        }
        if (cpuScoresFromHorn.containsKey(str) && (d = cpuScoresFromHorn.get(str)) != null) {
            if (d.doubleValue() < 0.0d) {
                return -1.0d;
            }
            return d.doubleValue();
        }
        return getDefaultScoreFromCpuPart(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ff, code lost:
        if (r12.equals("0x920") != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static double getDefaultScoreFromCpuPart(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.metrics.util.NewDeviceLevel.getDefaultScoreFromCpuPart(java.lang.String):double");
    }
}
