package com.meituan.android.common.kitefly;

import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.common.utils.ProcessUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LogSampler {
    public static int SAMPLE_MAX = 10000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map<String, TypeSampler> type2Sampler;

    public LogSampler(@NonNull String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18d0c252c30d70696aca7ada052a9293", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18d0c252c30d70696aca7ada052a9293");
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> keys = jSONObject.keys();
        if (keys.hasNext()) {
            this.type2Sampler = new HashMap();
        } else {
            this.type2Sampler = Collections.emptyMap();
        }
        while (keys.hasNext()) {
            String next = keys.next();
            this.type2Sampler.put(next, new TypeSampler(next, jSONObject.getJSONObject(next)));
        }
    }

    public LogSampler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e908ac522e1c44924859c67af95bcfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e908ac522e1c44924859c67af95bcfe");
        } else {
            this.type2Sampler = Collections.emptyMap();
        }
    }

    public static LogSampler empty() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "97563a49e9ff2b73db616736018d7ff2", 6917529027641081856L) ? (LogSampler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "97563a49e9ff2b73db616736018d7ff2") : new LogSampler();
    }

    @AnyThread
    public boolean sampleFilterLog(@NonNull Log log) {
        Object[] objArr = {log};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f7ab9ca723eaabe2db5a8725318072b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f7ab9ca723eaabe2db5a8725318072b")).booleanValue();
        }
        TypeSampler typeSampler = this.type2Sampler.get(log.tag);
        if (typeSampler == null) {
            addLogTsAndSampleRate(log, 1.0d);
            return false;
        }
        int currentSample = typeSampler.currentSample(log);
        addLogTsAndSampleRate(log, (currentSample * 1.0d) / SAMPLE_MAX);
        if (currentSample == SAMPLE_MAX) {
            return false;
        }
        return currentSample == 0 || typeSampler.random.nextInt(SAMPLE_MAX) >= currentSample;
    }

    private static void addLogTsAndSampleRate(@NonNull Log log, double d) {
        Object[] objArr = {log, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "92a978dbe4a9e2b8997ab884746c4263", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "92a978dbe4a9e2b8997ab884746c4263");
            return;
        }
        log.innerProperty.afterSample = true;
        log.option.put("$sample_rate", Double.valueOf(d));
        if (log.ts <= 0) {
            log.ts = TimeUtil.currentTimeMillisSNTP();
        }
    }

    /* compiled from: ProGuard */
    @VisibleForTesting
    /* loaded from: classes2.dex */
    static class TypeSampler {
        public static ChangeQuickRedirect changeQuickRedirect;
        @NonNull
        private final List<String> blackProcessList;
        private Period currentPeriod;
        private long currentPeriodEnd;
        @VisibleForTesting
        @NonNull
        public final List<Period> periods;
        private final Random random;
        private final int sample;
        private final String type;

        public TypeSampler(@NonNull String str, JSONObject jSONObject) throws JSONException {
            Object[] objArr = {str, jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c2c7398c8e6e89518d31ac3243cc6ec", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c2c7398c8e6e89518d31ac3243cc6ec");
                return;
            }
            this.type = str;
            this.sample = jSONObject.optInt("sample", LogSampler.SAMPLE_MAX);
            JSONArray optJSONArray = jSONObject.optJSONArray("black_process_list");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                this.blackProcessList = Collections.emptyList();
            } else {
                this.blackProcessList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.blackProcessList.add(optJSONArray.getString(i));
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("period");
            if (optJSONObject == null || !optJSONObject.keys().hasNext()) {
                this.periods = Collections.emptyList();
            } else {
                LinkedList linkedList = new LinkedList();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    linkedList.add(new Period(next, optJSONObject.getInt(next)));
                }
                Collections.sort(linkedList);
                HourMinutes hourMinutes = new HourMinutes("00:00");
                HourMinutes hourMinutes2 = new HourMinutes("24:00");
                this.periods = new LinkedList();
                for (int i2 = 0; i2 < linkedList.size(); i2++) {
                    Period period = (Period) linkedList.get(i2);
                    if (hourMinutes.compareTo(period.start) < 0) {
                        this.periods.add(new Period(hourMinutes, period.start, this.sample));
                    }
                    this.periods.add(period);
                    hourMinutes = period.end;
                }
                if (hourMinutes.compareTo(hourMinutes2) < 0) {
                    this.periods.add(new Period(hourMinutes, hourMinutes2, this.sample));
                }
            }
            this.random = new Random();
        }

        public int currentSample(@NonNull Log log) {
            Object[] objArr = {log};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f32ec55fc31bc31898ed1f2d468f1501", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f32ec55fc31bc31898ed1f2d468f1501")).intValue();
            }
            long currentTimeMillisSNTP = TimeUtil.currentTimeMillisSNTP();
            if (log.ts <= 0) {
                log.ts = currentTimeMillisSNTP;
            }
            if (this.blackProcessList.contains(ProcessUtils.getCurrentProcessName())) {
                return 0;
            }
            Period period = this.currentPeriod;
            if (period == null || currentTimeMillisSNTP > this.currentPeriodEnd) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(currentTimeMillisSNTP);
                HourMinutes hourMinutes = new HourMinutes((byte) calendar.get(11), (byte) calendar.get(12));
                for (Period period2 : this.periods) {
                    if (period2.isInPeriod(hourMinutes)) {
                        this.currentPeriod = period2;
                        this.currentPeriodEnd = period2.end.toToday();
                        return period2.sample;
                    }
                }
                return this.sample;
            }
            return period.sample;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Period implements Comparable<Period> {
        public static ChangeQuickRedirect changeQuickRedirect;
        @VisibleForTesting
        public final HourMinutes end;
        private final int sample;
        @VisibleForTesting
        public final HourMinutes start;

        public Period(String str, int i) {
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e9ad8e937226545abbf6459d0067471", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e9ad8e937226545abbf6459d0067471");
                return;
            }
            String[] split = str.split(CommonConstant.Symbol.MINUS);
            this.start = new HourMinutes(split[0]);
            this.end = new HourMinutes(split[1]);
            this.sample = i;
        }

        public Period(HourMinutes hourMinutes, HourMinutes hourMinutes2, int i) {
            Object[] objArr = {hourMinutes, hourMinutes2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23d609075d3e779d7519010362832165", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23d609075d3e779d7519010362832165");
                return;
            }
            this.start = hourMinutes;
            this.end = hourMinutes2;
            this.sample = i;
        }

        public boolean isInPeriod(HourMinutes hourMinutes) {
            Object[] objArr = {hourMinutes};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "583924fe2ce7de38f745f830383b2e40", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "583924fe2ce7de38f745f830383b2e40")).booleanValue() : this.start.compareTo(hourMinutes) <= 0 && this.end.compareTo(hourMinutes) >= 0;
        }

        @Override // java.lang.Comparable
        public int compareTo(Period period) {
            Object[] objArr = {period};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2867f36af1efee56928a2816ce38af1", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2867f36af1efee56928a2816ce38af1")).intValue() : this.start.compareTo(period.start);
        }

        @NonNull
        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4603a152e2c0b167c3bbbe8388ccd1d4", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4603a152e2c0b167c3bbbe8388ccd1d4");
            }
            return this.start.toString() + CommonConstant.Symbol.MINUS + this.end.toString() + "->" + this.sample;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class HourMinutes implements Comparable<HourMinutes> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public byte hour;
        public byte minutes;

        public HourMinutes(@NonNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "096ac4db20801d67c00b23e77a4be47d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "096ac4db20801d67c00b23e77a4be47d");
                return;
            }
            String[] split = str.split(CommonConstant.Symbol.COLON);
            this.hour = Byte.parseByte(split[0]);
            this.minutes = Byte.parseByte(split[1]);
        }

        public HourMinutes(byte b, byte b2) {
            Object[] objArr = {Byte.valueOf(b), Byte.valueOf(b2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01cd3195927c794e557220ab1702fcea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01cd3195927c794e557220ab1702fcea");
                return;
            }
            this.hour = b;
            this.minutes = b2;
        }

        @Override // java.lang.Comparable
        public int compareTo(HourMinutes hourMinutes) {
            Object[] objArr = {hourMinutes};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42b1b48b0cc984e9acd5ba94725cf8de", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42b1b48b0cc984e9acd5ba94725cf8de")).intValue();
            }
            if (this.hour < hourMinutes.hour) {
                return -1;
            }
            if (this.hour > hourMinutes.hour) {
                return 1;
            }
            return this.minutes - hourMinutes.minutes;
        }

        @NonNull
        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26231bc1abc68aa28a071b1813793812", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26231bc1abc68aa28a071b1813793812");
            }
            StringBuilder sb = new StringBuilder();
            if (this.hour < 10) {
                sb.append("0");
            }
            sb.append((int) this.hour);
            sb.append(CommonConstant.Symbol.COLON);
            if (this.minutes < 10) {
                sb.append("0");
            }
            sb.append((int) this.minutes);
            return sb.toString();
        }

        public long toToday() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0a7c43d588ccf20dd257f145670306e", 6917529027641081856L)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0a7c43d588ccf20dd257f145670306e")).longValue();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date(TimeUtil.currentTimeMillisSNTP()));
            calendar.set(11, this.hour);
            calendar.set(12, this.minutes);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return calendar.getTimeInMillis();
        }
    }
}
