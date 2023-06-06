package com.meituan.android.common.metricx.helpers;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CPUInfoParser {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mHardwareName;
    private String mProcessor;
    private final Comparator<CPUProcessor> mProcessorCompare;
    private List<CPUProcessor> mProcessors;

    public CPUInfoParser() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3746d67835efd40cce9e8344e20dce32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3746d67835efd40cce9e8344e20dce32");
            return;
        }
        this.mProcessors = new ArrayList();
        this.mProcessorCompare = new Comparator<CPUProcessor>() { // from class: com.meituan.android.common.metricx.helpers.CPUInfoParser.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.util.Comparator
            public int compare(CPUProcessor cPUProcessor, CPUProcessor cPUProcessor2) {
                Object[] objArr2 = {cPUProcessor, cPUProcessor2};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0b0313ca425bc1db428a69be6cafda01", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0b0313ca425bc1db428a69be6cafda01")).intValue() : (cPUProcessor.mVariant == null || cPUProcessor2.mVariant == null) ? cPUProcessor.mIndex - cPUProcessor2.mIndex : cPUProcessor.mVariant.compareTo(cPUProcessor2.mVariant);
            }
        };
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class CPUProcessor {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String mArchitecture;
        private String mImplementerCode;
        private int mIndex;
        private String mMIPS;
        private String mPart;
        private String mRevision;
        private String mVariant;

        public int getIndex() {
            return this.mIndex;
        }

        public String getMIPS() {
            return this.mMIPS;
        }

        public String getImplementerCode() {
            return this.mImplementerCode;
        }

        public String getArchitecture() {
            return this.mArchitecture;
        }

        public String getVariant() {
            return this.mVariant;
        }

        public String getPart() {
            return this.mPart;
        }

        public String getRevision() {
            return this.mRevision;
        }
    }

    public String getHardwareName() {
        return this.mHardwareName;
    }

    public void parse() throws IOException {
        BufferedReader bufferedReader;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d305e5fbff9c9f2924e5354e90e3f6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d305e5fbff9c9f2924e5354e90e3f6d");
            return;
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/cpuinfo")), 4096);
            try {
                this.mProcessor = bufferedReader.readLine();
                CPUProcessor cPUProcessor = new CPUProcessor();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (readLine.trim().length() == 0) {
                        this.mProcessors.add(cPUProcessor);
                        cPUProcessor = new CPUProcessor();
                    } else {
                        String[] split = readLine.trim().split(CommonConstant.Symbol.COLON);
                        String trim = split[0].trim();
                        String trim2 = split[1].trim();
                        if (trim.contains("processor")) {
                            cPUProcessor.mIndex = Integer.parseInt(trim2);
                        } else if (trim.contains("BogoMIPS")) {
                            cPUProcessor.mMIPS = trim2;
                        } else if (trim.contains("implementer")) {
                            cPUProcessor.mImplementerCode = trim2;
                        } else if (trim.contains("architecture")) {
                            cPUProcessor.mArchitecture = trim2;
                        } else if (trim.contains("variant")) {
                            cPUProcessor.mVariant = trim2;
                        } else if (trim.contains("CPU part")) {
                            cPUProcessor.mPart = trim2;
                        } else if (trim.contains("CPU revision")) {
                            cPUProcessor.mRevision = trim2;
                        } else if (trim.contains("Hardware")) {
                            this.mHardwareName = trim2;
                            break;
                        }
                    }
                }
                if (this.mProcessors.size() <= 0) {
                    throw new IOException("not parse processors");
                }
                Collections.sort(this.mProcessors, this.mProcessorCompare);
                if (TextUtils.isEmpty(this.mHardwareName)) {
                    this.mHardwareName = getProp("ro.config.cpu_info_display");
                }
                if (TextUtils.isEmpty(this.mHardwareName)) {
                    this.mHardwareName = getProp("ro.hardware.alter");
                }
                if (TextUtils.isEmpty(this.mHardwareName)) {
                    this.mHardwareName = getProp("ro.board.platform");
                }
                if (TextUtils.isEmpty(this.mHardwareName)) {
                    this.mHardwareName = Build.HARDWARE;
                }
                bufferedReader.close();
            } catch (Throwable th) {
                th = th;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    @SuppressLint({"PrivateApi"})
    private String getProp(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f32ad51bd40fd4a98d0154af237f4989", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f32ad51bd40fd4a98d0154af237f4989");
        }
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Throwable th) {
            Logger.getMetricxLogger().e("getprop failed: ", th);
            return null;
        }
    }

    public CPUProcessor getLargest() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1a823807d8d56a6a3e3ec68707afc48", RobustBitConfig.DEFAULT_VALUE) ? (CPUProcessor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1a823807d8d56a6a3e3ec68707afc48") : this.mProcessors.get(this.mProcessors.size() - 1);
    }
}
