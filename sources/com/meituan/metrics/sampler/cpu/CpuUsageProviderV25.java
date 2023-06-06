package com.meituan.metrics.sampler.cpu;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CpuUsageProviderV25 implements ICpuUsageProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long mAppCpuTimeLast;
    private long mTotalLast;

    public CpuUsageProviderV25() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22f35d27947eb5565413e747e25885e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22f35d27947eb5565413e747e25885e8");
            return;
        }
        this.mTotalLast = 0L;
        this.mAppCpuTimeLast = 0L;
        this.mTotalLast = 0L;
        this.mAppCpuTimeLast = 0L;
    }

    @Override // com.meituan.metrics.sampler.cpu.ICpuUsageProvider
    public double getCpuUsagePercent() throws Throwable {
        Throwable th;
        BufferedReader bufferedReader;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e27f7caea842ea9cfa744076076ec5c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e27f7caea842ea9cfa744076076ec5c")).doubleValue();
        }
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/self/stat")), 1000);
                    try {
                        double parseCpuRate = parseCpuRate(readLine, bufferedReader3.readLine());
                        IOUtils.close(bufferedReader);
                        IOUtils.close(bufferedReader3);
                        return parseCpuRate;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader3;
                        IOUtils.close(bufferedReader);
                        IOUtils.close(bufferedReader2);
                        throw th;
                    }
                }
                IOUtils.close(bufferedReader);
                IOUtils.close((Closeable) null);
                return -1.0d;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
    }

    private long parseCpuRate(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71213cc21dc7b4276374e7ffc1f8715b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71213cc21dc7b4276374e7ffc1f8715b")).longValue();
        }
        String[] split = str.split(StringUtil.SPACE);
        if (split.length < 9) {
            return -1L;
        }
        long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[5]) + Long.parseLong(split[6]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
        String[] split2 = str2.split(StringUtil.SPACE);
        if (split2.length < 17) {
            return -1L;
        }
        long parseLong2 = Long.parseLong(split2[13]) + Long.parseLong(split2[14]) + Long.parseLong(split2[15]) + Long.parseLong(split2[16]);
        long j = 0;
        if (this.mTotalLast != 0) {
            long j2 = parseLong - this.mTotalLast;
            j = j2 > 0 ? ((parseLong2 - this.mAppCpuTimeLast) * 100) / j2 : -1L;
        }
        this.mTotalLast = parseLong;
        this.mAppCpuTimeLast = parseLong2;
        return j;
    }
}
