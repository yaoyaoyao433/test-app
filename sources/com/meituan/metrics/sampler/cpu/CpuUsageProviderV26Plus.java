package com.meituan.metrics.sampler.cpu;

import android.os.Process;
import android.os.SystemClock;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CpuUsageProviderV26Plus implements ICpuUsageProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long mAppCpuTimeLast;
    private long mLastTime;
    private boolean topFailed;

    public CpuUsageProviderV26Plus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d057675309940ec732e9d8d573610b22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d057675309940ec732e9d8d573610b22");
            return;
        }
        this.topFailed = false;
        this.mLastTime = 0L;
        this.mAppCpuTimeLast = 0L;
    }

    @Override // com.meituan.metrics.sampler.cpu.ICpuUsageProvider
    public double getCpuUsagePercent() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dc10ee35b71de99c1cbe4695e0f0be5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dc10ee35b71de99c1cbe4695e0f0be5")).doubleValue();
        }
        if (this.topFailed) {
            return getCpuRate();
        }
        double cpuRateFromTop = getCpuRateFromTop();
        if (cpuRateFromTop < 0.0d) {
            this.topFailed = true;
        }
        return cpuRateFromTop;
    }

    private double getCpuRate() {
        double d;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72010f0b6b08d136cb1d2587547a94e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72010f0b6b08d136cb1d2587547a94e0")).doubleValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (this.mLastTime > 0) {
            d = (((float) (elapsedCpuTime - this.mAppCpuTimeLast)) * 100.0f) / ((float) ((uptimeMillis - this.mLastTime) * DeviceUtil.getNumOfCores()));
        } else {
            d = 0.0d;
        }
        this.mLastTime = uptimeMillis;
        this.mAppCpuTimeLast = elapsedCpuTime;
        return d;
    }

    private double getCpuRateFromTop() throws IOException {
        BufferedReader bufferedReader;
        Throwable th;
        String readLine;
        StringBuilder sb;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fb8a8acc664e0393ea866542486744b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fb8a8acc664e0393ea866542486744b")).doubleValue();
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("top -n 1 -p " + Process.myPid()).getInputStream()));
            do {
                try {
                    readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb = new StringBuilder();
                    sb.append(Process.myPid());
                } catch (Throwable th2) {
                    th = th2;
                    IOUtils.close(bufferedReader);
                    throw th;
                }
            } while (!readLine.contains(sb.toString()));
            if (readLine != null) {
                String[] split = readLine.substring(readLine.indexOf(String.valueOf(Process.myPid()))).trim().split("\\s+");
                if (split.length >= 12) {
                    double parseDouble = Double.parseDouble(split[8]) / DeviceUtil.getNumOfCores();
                    IOUtils.close(bufferedReader);
                    return parseDouble;
                }
                IOUtils.close(bufferedReader);
                return -1.0d;
            }
            IOUtils.close(bufferedReader);
            return -1.0d;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }
}
