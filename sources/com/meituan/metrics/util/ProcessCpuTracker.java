package com.meituan.metrics.util;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.crashreporter.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import com.sankuai.common.utils.NumberUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ProcessCpuTracker {
    private static final long DEFAULT_CLOCK_TICKS_PER_SECOND = 100;
    private static final int LOAD_AVERAGE_15_MIN = 2;
    private static final int LOAD_AVERAGE_1_MIN = 0;
    private static final int LOAD_AVERAGE_5_MIN = 1;
    private static final int PROCESS_STATS_MAJOR_FAULTS = 9;
    private static final int PROCESS_STATS_MINOR_FAULTS = 7;
    private static final int PROCESS_STATS_STATUS = 0;
    private static final int PROCESS_STATS_STIME = 12;
    private static final int PROCESS_STATS_UTIME = 11;
    private static final int SYSTEM_STATS_IDLE_TIME = 5;
    private static final int SYSTEM_STATS_IOWAIT_TIME = 6;
    private static final int SYSTEM_STATS_IRQ_TIME = 7;
    private static final int SYSTEM_STATS_NICE_TIME = 3;
    private static final int SYSTEM_STATS_SOFT_IRQ_TIME = 8;
    private static final int SYSTEM_STATS_SYS_TIME = 4;
    private static final int SYSTEM_STATS_USER_TIME = 2;
    private static final String TAG = "ProcessCpuTracker";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Comparator<Stats> sLoadComparator = new Comparator<Stats>() { // from class: com.meituan.metrics.util.ProcessCpuTracker.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // java.util.Comparator
        public final int compare(Stats stats, Stats stats2) {
            Object[] objArr = {stats, stats2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db21a014da7840db54296155098025fa", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db21a014da7840db54296155098025fa")).intValue();
            }
            int i = stats.rel_utime + stats.rel_stime;
            int i2 = stats2.rel_utime + stats2.rel_stime;
            if (i != i2) {
                return i > i2 ? -1 : 1;
            }
            return 0;
        }
    };
    private boolean DEBUG;
    private long mBaseIdleTime;
    private long mBaseIoWaitTime;
    private long mBaseIrqTime;
    private long mBaseSoftIrqTime;
    private long mBaseSystemTime;
    private long mBaseUserTime;
    private byte[] mBuffer;
    private int mCurrentProcID;
    private Stats mCurrentProcStat;
    private long mCurrentSampleRealTime;
    private long mCurrentSampleTime;
    private long mCurrentSampleWallTime;
    private final long mJiffyMillis;
    private long mLastSampleRealTime;
    private long mLastSampleTime;
    private long mLastSampleWallTime;
    private float mLoad1;
    private float mLoad15;
    private float mLoad5;
    private boolean mLoadStatsAreGood;
    private int mRelIdleTime;
    private int mRelIoWaitTime;
    private int mRelIrqTime;
    private int mRelSoftIrqTime;
    private boolean mRelStatsAreGood;
    private int mRelSystemTime;
    private int mRelUserTime;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Stats {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String baseName;
        public long base_majfaults;
        public long base_minfaults;
        public long base_stime;
        public long base_uptime;
        public long base_utime;
        public final String cmdlineFile;
        public String name;
        public final int pid;
        public int rel_majfaults;
        public int rel_minfaults;
        public int rel_stime;
        public long rel_uptime;
        public int rel_utime;
        public final String statFile;
        public String status;
        public final String threadsDir;
        public final ArrayList<Stats> workingThreads;

        public Stats(int i, boolean z) {
            this.pid = i;
            if (z) {
                File file = new File("/proc/self/task", Integer.toString(this.pid));
                this.workingThreads = null;
                this.statFile = file + "/stat";
                this.cmdlineFile = new File(file, "comm").toString();
                this.threadsDir = null;
                return;
            }
            File file2 = new File("/proc", Integer.toString(this.pid));
            this.statFile = new File(file2, "stat").toString();
            this.cmdlineFile = new File(file2, "cmdline").toString();
            this.threadsDir = new File(file2, "task").toString();
            this.workingThreads = new ArrayList<>();
        }
    }

    public ProcessCpuTracker(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47dad542620b040ddb7543f34ca4f666", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47dad542620b040ddb7543f34ca4f666");
            return;
        }
        this.mLoad1 = 0.0f;
        this.mLoad5 = 0.0f;
        this.mLoad15 = 0.0f;
        this.mBuffer = new byte[4096];
        this.DEBUG = false;
        this.mJiffyMillis = DeviceUtil.getJiffyMillis();
        this.mCurrentProcID = i;
        this.mCurrentProcStat = new Stats(this.mCurrentProcID, false);
    }

    public void update() {
        long j;
        long j2;
        long j3;
        ProcessCpuTracker processCpuTracker;
        File[] listFiles;
        long j4;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2dd65bba22a34a54ba781ae6a871938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2dd65bba22a34a54ba781ae6a871938");
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillisSNTP = TimeUtil.currentTimeMillisSNTP();
        String[] readProcFile = readProcFile("/proc/stat");
        if (readProcFile != null) {
            long parseLong = (Long.parseLong(readProcFile[2]) + Long.parseLong(readProcFile[3])) * this.mJiffyMillis;
            long parseLong2 = Long.parseLong(readProcFile[4]) * this.mJiffyMillis;
            long parseLong3 = Long.parseLong(readProcFile[5]) * this.mJiffyMillis;
            j3 = currentTimeMillisSNTP;
            long parseLong4 = Long.parseLong(readProcFile[6]) * this.mJiffyMillis;
            j2 = elapsedRealtime;
            long parseLong5 = Long.parseLong(readProcFile[7]) * this.mJiffyMillis;
            j = uptimeMillis;
            long parseLong6 = Long.parseLong(readProcFile[8]) * this.mJiffyMillis;
            this.mRelUserTime = (int) (parseLong - this.mBaseUserTime);
            this.mRelSystemTime = (int) (parseLong2 - this.mBaseSystemTime);
            this.mRelIoWaitTime = (int) (parseLong4 - this.mBaseIoWaitTime);
            this.mRelIrqTime = (int) (parseLong5 - this.mBaseIrqTime);
            this.mRelSoftIrqTime = (int) (parseLong6 - this.mBaseSoftIrqTime);
            this.mRelIdleTime = (int) (parseLong3 - this.mBaseIdleTime);
            if (this.DEBUG) {
                StringBuilder sb = new StringBuilder("Total U:");
                j4 = parseLong;
                sb.append(j4);
                sb.append(" S:");
                sb.append(parseLong2);
                sb.append(" I:");
                sb.append(parseLong3);
                sb.append(" W:");
                sb.append(parseLong4);
                sb.append(" Q:");
                sb.append(parseLong5);
                sb.append(" O:");
                sb.append(parseLong6);
                StringBuilder sb2 = new StringBuilder("Rel U:");
                processCpuTracker = this;
                sb2.append(processCpuTracker.mRelUserTime);
                sb2.append(" S:");
                sb2.append(processCpuTracker.mRelSystemTime);
                sb2.append(" I:");
                sb2.append(processCpuTracker.mRelIdleTime);
                sb2.append(" Q:");
                sb2.append(processCpuTracker.mRelIrqTime);
            } else {
                processCpuTracker = this;
                j4 = parseLong;
            }
            processCpuTracker.mBaseUserTime = j4;
            processCpuTracker.mBaseSystemTime = parseLong2;
            processCpuTracker.mBaseIoWaitTime = parseLong4;
            processCpuTracker.mBaseIrqTime = parseLong5;
            processCpuTracker.mBaseSoftIrqTime = parseLong6;
            processCpuTracker.mBaseIdleTime = parseLong3;
            processCpuTracker.mRelStatsAreGood = true;
        } else {
            j = uptimeMillis;
            j2 = elapsedRealtime;
            j3 = currentTimeMillisSNTP;
            processCpuTracker = this;
        }
        processCpuTracker.mLastSampleTime = processCpuTracker.mCurrentSampleTime;
        processCpuTracker.mCurrentSampleTime = j;
        processCpuTracker.mLastSampleRealTime = processCpuTracker.mCurrentSampleRealTime;
        processCpuTracker.mCurrentSampleRealTime = j2;
        processCpuTracker.mLastSampleWallTime = processCpuTracker.mCurrentSampleWallTime;
        processCpuTracker.mCurrentSampleWallTime = j3;
        processCpuTracker.getName(processCpuTracker.mCurrentProcStat, processCpuTracker.mCurrentProcStat.cmdlineFile);
        processCpuTracker.collectProcsStats("/proc/self/stat", processCpuTracker.mCurrentProcStat);
        if (processCpuTracker.mCurrentProcStat.workingThreads != null && (listFiles = new File(processCpuTracker.mCurrentProcStat.threadsDir).listFiles()) != null) {
            for (File file : listFiles) {
                int parseInt = NumberUtils.parseInt(file.getName(), -1);
                if (parseInt > 0) {
                    Stats findThreadStat = processCpuTracker.findThreadStat(parseInt, processCpuTracker.mCurrentProcStat.workingThreads);
                    if (findThreadStat == null) {
                        findThreadStat = new Stats(parseInt, true);
                        processCpuTracker.getName(findThreadStat, findThreadStat.cmdlineFile);
                        processCpuTracker.mCurrentProcStat.workingThreads.add(findThreadStat);
                    }
                    processCpuTracker.collectProcsStats(findThreadStat.statFile, findThreadStat);
                }
            }
            Collections.sort(processCpuTracker.mCurrentProcStat.workingThreads, sLoadComparator);
        }
        String[] readProcFile2 = processCpuTracker.readProcFile("/proc/loadavg");
        if (readProcFile2 != null) {
            float parseFloat = Float.parseFloat(readProcFile2[0]);
            float parseFloat2 = Float.parseFloat(readProcFile2[1]);
            float parseFloat3 = Float.parseFloat(readProcFile2[2]);
            if (parseFloat != processCpuTracker.mLoad1 || parseFloat2 != processCpuTracker.mLoad5 || parseFloat3 != processCpuTracker.mLoad15) {
                processCpuTracker.mLoad1 = parseFloat;
                processCpuTracker.mLoad5 = parseFloat2;
                processCpuTracker.mLoad15 = parseFloat3;
            }
            processCpuTracker.mLoadStatsAreGood = true;
        }
    }

    @Nullable
    private Stats findThreadStat(int i, ArrayList<Stats> arrayList) {
        Object[] objArr = {Integer.valueOf(i), arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0889669563d5b3332711eff3e7984038", RobustBitConfig.DEFAULT_VALUE)) {
            return (Stats) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0889669563d5b3332711eff3e7984038");
        }
        Iterator<Stats> it = arrayList.iterator();
        while (it.hasNext()) {
            Stats next = it.next();
            if (next.pid == i) {
                return next;
            }
        }
        return null;
    }

    private void collectProcsStats(String str, Stats stats) {
        Object[] objArr = {str, stats};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9a9f24764d38bceb5d3c0903e4cd78e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9a9f24764d38bceb5d3c0903e4cd78e");
            return;
        }
        String[] readProcFile = readProcFile(str);
        if (readProcFile == null) {
            return;
        }
        try {
            String str2 = readProcFile[0];
            long parseLong = Long.parseLong(readProcFile[7]);
            long parseLong2 = Long.parseLong(readProcFile[9]);
            long parseLong3 = Long.parseLong(readProcFile[11]) * this.mJiffyMillis;
            long parseLong4 = Long.parseLong(readProcFile[12]) * this.mJiffyMillis;
            long uptimeMillis = SystemClock.uptimeMillis();
            stats.rel_uptime = uptimeMillis - stats.base_uptime;
            stats.base_uptime = uptimeMillis;
            stats.rel_utime = (int) (parseLong3 - stats.base_utime);
            stats.rel_stime = (int) (parseLong4 - stats.base_stime);
            stats.base_utime = parseLong3;
            stats.base_stime = parseLong4;
            stats.rel_minfaults = (int) (parseLong - stats.base_minfaults);
            stats.rel_majfaults = (int) (parseLong2 - stats.base_majfaults);
            stats.base_minfaults = parseLong;
            stats.base_majfaults = parseLong2;
            stats.status = str2;
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder();
            for (String str3 : readProcFile) {
                sb.append(str3);
                sb.append(StringUtil.SPACE);
            }
            c.a(new Throwable(sb.toString()), AppBus.getInstance().getCurrentPageName(), false);
        }
    }

    private final String printCurrentLoad() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3c81d275f8eb0a0fb6729b6fafb20c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3c81d275f8eb0a0fb6729b6fafb20c1");
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        printWriter.print("Load: ");
        printWriter.print(this.mLoad1);
        printWriter.print(" / ");
        printWriter.print(this.mLoad5);
        printWriter.print(" / ");
        printWriter.println(this.mLoad15);
        printWriter.flush();
        return stringWriter.toString();
    }

    @SuppressLint({"SimpleDateFormat"})
    public final String printCurrentState(long j) {
        PrintWriter printWriter;
        PrintWriter printWriter2;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "933425dbb6310b2ce01cdffbc5972645", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "933425dbb6310b2ce01cdffbc5972645");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter3 = new PrintWriter((Writer) stringWriter, false);
        printWriter3.println("");
        printWriter3.print("CPU usage from ");
        if (j > this.mLastSampleTime) {
            printWriter3.print(j - this.mLastSampleTime);
            printWriter3.print("ms to ");
            printWriter3.print(j - this.mCurrentSampleTime);
            printWriter3.print("ms ago");
        } else {
            printWriter3.print(this.mLastSampleTime - j);
            printWriter3.print("ms to ");
            printWriter3.print(this.mCurrentSampleTime - j);
            printWriter3.print("ms later");
        }
        printWriter3.print(" (");
        printWriter3.print(simpleDateFormat.format(new Date(this.mLastSampleWallTime)));
        printWriter3.print(" to ");
        printWriter3.print(simpleDateFormat.format(new Date(this.mCurrentSampleWallTime)));
        printWriter3.print(CommonConstant.Symbol.BRACKET_RIGHT);
        long j2 = this.mCurrentSampleTime - this.mLastSampleTime;
        long j3 = this.mCurrentSampleRealTime - this.mLastSampleRealTime;
        long j4 = j3 > 0 ? (j2 * DEFAULT_CLOCK_TICKS_PER_SECOND) / j3 : 0L;
        if (j4 != DEFAULT_CLOCK_TICKS_PER_SECOND) {
            printWriter3.print(" with ");
            printWriter3.print(j4);
            printWriter3.print("% awake");
        }
        printWriter3.println(CommonConstant.Symbol.COLON);
        int i = this.mRelUserTime + this.mRelSystemTime + this.mRelIoWaitTime + this.mRelIrqTime + this.mRelSoftIrqTime + this.mRelIdleTime;
        Stats stats = this.mCurrentProcStat;
        printProcessCPU(printWriter3, stats.pid, stats.name, stats.status, (int) stats.rel_uptime, stats.rel_utime, stats.rel_stime, 0, 0, 0, 0, stats.rel_minfaults, stats.rel_majfaults);
        if (stats.workingThreads != null) {
            PrintWriter printWriter4 = printWriter3;
            printWriter4.println("thread stats:");
            int size = stats.workingThreads.size();
            int i2 = 0;
            while (i2 < size) {
                Stats stats2 = stats.workingThreads.get(i2);
                printProcessCPU(printWriter4, stats2.pid, stats2.name, stats2.status, (int) stats.rel_uptime, stats2.rel_utime, stats2.rel_stime, 0, 0, 0, 0, stats2.rel_minfaults, stats2.rel_majfaults);
                i2++;
                size = size;
                printWriter4 = printWriter4;
            }
            printWriter = printWriter4;
        } else {
            printWriter = printWriter3;
        }
        if (this.mRelStatsAreGood) {
            printProcessCPU(printWriter, -1, "TOTAL", "", i, this.mRelUserTime, this.mRelSystemTime, this.mRelIoWaitTime, this.mRelIrqTime, this.mRelSoftIrqTime, this.mRelIdleTime, 0, 0);
        }
        if (this.mLoadStatsAreGood) {
            printWriter2 = printWriter;
            printWriter2.println(printCurrentLoad());
        } else {
            printWriter2 = printWriter;
        }
        if (this.DEBUG) {
            StringBuilder sb = new StringBuilder("totalTime ");
            sb.append(i);
            sb.append(" over sample time ");
            sb.append(this.mCurrentSampleTime - this.mLastSampleTime);
            sb.append(", real uptime:");
            sb.append(stats.rel_uptime);
        }
        printWriter2.flush();
        return stringWriter.toString();
    }

    private void printRatio(PrintWriter printWriter, long j, long j2) {
        Object[] objArr = {printWriter, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7782b4953095377353e8f920a9a4aa2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7782b4953095377353e8f920a9a4aa2b");
            return;
        }
        long j3 = (j * 1000) / j2;
        long j4 = j3 / 10;
        printWriter.print(j4);
        if (j4 < 10) {
            long j5 = j3 - (j4 * 10);
            if (j5 != 0) {
                printWriter.print(CommonConstant.Symbol.DOT_CHAR);
                printWriter.print(j5);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0175, code lost:
        if (r1 > 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void printProcessCPU(java.io.PrintWriter r24, int r25, java.lang.String r26, java.lang.String r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.metrics.util.ProcessCpuTracker.printProcessCPU(java.io.PrintWriter, int, java.lang.String, java.lang.String, int, int, int, int, int, int, int, int, int):void");
    }

    private String readFile(String str, char c) {
        FileInputStream fileInputStream;
        Object[] objArr = {str, Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62615513403ad9eb0d863ebb4318d1d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62615513403ad9eb0d863ebb4318d1d4");
        }
        try {
            fileInputStream = new FileInputStream(str);
            try {
                int read = fileInputStream.read(this.mBuffer);
                fileInputStream.close();
                if (read > 0) {
                    int i = 0;
                    while (i < read && this.mBuffer[i] != c && this.mBuffer[i] != 10) {
                        i++;
                    }
                    String str2 = new String(this.mBuffer, 0, i);
                    IOUtils.close(fileInputStream);
                    return str2;
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
                IOUtils.close(fileInputStream);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        IOUtils.close(fileInputStream);
        return null;
    }

    private void getName(Stats stats, String str) {
        Object[] objArr = {stats, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4923b18489f140d80c9cb4bf9826229", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4923b18489f140d80c9cb4bf9826229");
            return;
        }
        String str2 = stats.name;
        if (stats.name == null || stats.name.equals("app_process") || stats.name.equals("<pre-initialized>")) {
            String readFile = readFile(str, (char) 0);
            if (readFile != null && readFile.length() > 1) {
                int lastIndexOf = readFile.lastIndexOf("/");
                if (lastIndexOf > 0 && lastIndexOf < readFile.length() - 1) {
                    readFile = readFile.substring(lastIndexOf + 1);
                }
                str2 = readFile;
            }
            if (str2 == null) {
                str2 = stats.baseName;
            }
        }
        if (stats.name == null || !str2.equals(stats.name)) {
            stats.name = str2;
        }
    }

    @Nullable
    public String[] readProcFile(String str) {
        BufferedReader bufferedReader;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed6b547cee6d6f88a8e57e3768c28d4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed6b547cee6d6f88a8e57e3768c28d4a");
        }
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str), "UTF-8"), 4096);
        } catch (Exception unused) {
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = bufferedReader.readLine();
            int indexOf = readLine.indexOf(CommonConstant.Symbol.BRACKET_RIGHT);
            if (indexOf > 0) {
                readLine = readLine.substring(indexOf + 2);
            }
            String[] split = readLine.split(StringUtil.SPACE);
            IOUtils.close(bufferedReader);
            return split;
        } catch (Exception unused2) {
            IOUtils.close(bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            IOUtils.close(bufferedReader2);
            throw th;
        }
    }
}
