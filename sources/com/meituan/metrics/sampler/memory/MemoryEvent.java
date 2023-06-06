package com.meituan.metrics.sampler.memory;

import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.sampler.AbstractSampleEvent;
import com.meituan.metrics.util.JSONUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MemoryEvent extends AbstractSampleEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int codeAvg;
    private int codeIncrease;
    private int codeInit;
    private int codeMax;
    private int dalvikHeapAvg;
    private int dalvikHeapIncrease;
    private int dalvikHeapInit;
    private int dalvikHeapMax;
    public int dalvikMax;
    private int graphicsAvg;
    private int graphicsIncrease;
    private int graphicsInit;
    private int graphicsMax;
    private int javaHeapAvg;
    private int javaHeapIncrease;
    private int javaHeapInit;
    private int javaHeapMax;
    private int nativeHeapAvg;
    private int nativeHeapIncrease;
    private int nativeHeapInit;
    private int nativeHeapMax;
    private String pageName;
    private int privateOtherAvg;
    private int privateOtherIncrease;
    private int privateOtherInit;
    private int privateOtherMax;
    private int pssMemoryAvg;
    private int pssMemoryIncrease;
    private int pssMemoryInit;
    private int pssMemoryMax;
    private int sampleCount;
    private int stackAvg;
    private int stackIncrease;
    private int stackInit;
    private int stackMax;
    private int vmAvg;
    private int vmIncrease;
    private int vmInit;
    private int vmMax;

    @Override // com.meituan.metrics.sampler.AbstractSampleEvent, com.meituan.metrics.model.AbstractEvent
    public String getLocalEventType() {
        return Constants.MEMORY_V2;
    }

    public String getOldEventType() {
        return Constants.MEMORY_AVG;
    }

    @Deprecated
    public double getOldMetricValue() {
        return -1.0d;
    }

    public MemoryEvent(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61dfddefcd4ff54888e54cc1e72a2746", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61dfddefcd4ff54888e54cc1e72a2746");
            return;
        }
        this.pssMemoryIncrease = Integer.MIN_VALUE;
        this.javaHeapIncrease = Integer.MIN_VALUE;
        this.nativeHeapIncrease = Integer.MIN_VALUE;
        this.codeIncrease = Integer.MIN_VALUE;
        this.stackIncrease = Integer.MIN_VALUE;
        this.graphicsIncrease = Integer.MIN_VALUE;
        this.dalvikHeapIncrease = Integer.MIN_VALUE;
        this.vmIncrease = Integer.MIN_VALUE;
        this.privateOtherIncrease = Integer.MIN_VALUE;
        this.pageName = str;
        this.dalvikMax = i;
    }

    public MemoryEvent(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d43878b12c9f53ca92a5591798a062ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d43878b12c9f53ca92a5591798a062ff");
            return;
        }
        this.pssMemoryIncrease = Integer.MIN_VALUE;
        this.javaHeapIncrease = Integer.MIN_VALUE;
        this.nativeHeapIncrease = Integer.MIN_VALUE;
        this.codeIncrease = Integer.MIN_VALUE;
        this.stackIncrease = Integer.MIN_VALUE;
        this.graphicsIncrease = Integer.MIN_VALUE;
        this.dalvikHeapIncrease = Integer.MIN_VALUE;
        this.vmIncrease = Integer.MIN_VALUE;
        this.privateOtherIncrease = Integer.MIN_VALUE;
        this.dalvikMax = i;
    }

    public void computeAvg(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        int i11;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f0c9be2ae55a24e7e73d2342375d77f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f0c9be2ae55a24e7e73d2342375d77f");
            return;
        }
        if (this.sampleCount == 0) {
            this.pssMemoryInit = i;
            this.javaHeapInit = i2;
            this.nativeHeapInit = i3;
            this.codeInit = i4;
            this.stackInit = i5;
            this.graphicsInit = i6;
            this.dalvikHeapInit = i7;
            i10 = i8;
            this.vmInit = i10;
            i11 = i9;
            this.privateOtherInit = i11;
        } else {
            i10 = i8;
            i11 = i9;
        }
        if (i > 0) {
            this.pssMemoryAvg = (int) ((((this.pssMemoryAvg * this.sampleCount) + i) * 1.0d) / (this.sampleCount + 1));
            if (this.pssMemoryMax < i) {
                this.pssMemoryMax = i;
            }
            if (this.sampleCount != 0 && this.pssMemoryInit > 0) {
                this.pssMemoryIncrease = i - this.pssMemoryInit;
            }
        }
        if (i2 > 0) {
            this.javaHeapAvg = (int) ((((this.javaHeapAvg * this.sampleCount) + i2) * 1.0d) / (this.sampleCount + 1));
            if (this.javaHeapMax < i2) {
                this.javaHeapMax = i2;
            }
            if (this.sampleCount != 0 && this.javaHeapInit > 0) {
                this.javaHeapIncrease = i2 - this.javaHeapInit;
            }
        }
        if (i3 > 0) {
            this.nativeHeapAvg = (int) ((((this.nativeHeapAvg * this.sampleCount) + i3) * 1.0d) / (this.sampleCount + 1));
            if (this.nativeHeapMax < i3) {
                this.nativeHeapMax = i3;
            }
            if (this.sampleCount != 0 && this.nativeHeapInit > 0) {
                this.nativeHeapIncrease = i3 - this.nativeHeapInit;
            }
        }
        if (i4 > 0) {
            this.codeAvg = (int) ((((this.codeAvg * this.sampleCount) + i4) * 1.0d) / (this.sampleCount + 1));
            if (this.codeMax < i4) {
                this.codeMax = i4;
            }
            if (this.sampleCount != 0 && this.codeInit > 0) {
                this.codeIncrease = i4 - this.codeInit;
            }
        }
        if (i5 > 0) {
            this.stackAvg = (int) ((((this.stackAvg * this.sampleCount) + i5) * 1.0d) / (this.sampleCount + 1));
            if (this.stackMax < i5) {
                this.stackMax = i5;
            }
            if (this.sampleCount != 0 && this.stackInit > 0) {
                this.stackIncrease = i5 - this.stackInit;
            }
        }
        if (i6 > 0) {
            this.graphicsAvg = (int) ((((this.graphicsAvg * this.sampleCount) + i6) * 1.0d) / (this.sampleCount + 1));
            if (this.graphicsMax < i6) {
                this.graphicsMax = i6;
            }
            if (this.sampleCount != 0 && this.graphicsInit > 0) {
                this.graphicsIncrease = i6 - this.graphicsInit;
            }
        }
        if (i7 > 0) {
            this.dalvikHeapAvg = (int) ((((this.dalvikHeapAvg * this.sampleCount) + i7) * 1.0d) / (this.sampleCount + 1));
            if (this.dalvikHeapMax < i7) {
                this.dalvikHeapMax = i7;
            }
            if (this.sampleCount != 0 && this.dalvikHeapInit > 0) {
                this.dalvikHeapIncrease = i7 - this.dalvikHeapInit;
            }
        }
        if (i10 > 0) {
            this.vmAvg = (int) ((((this.vmAvg * this.sampleCount) + i10) * 1.0d) / (this.sampleCount + 1));
            if (this.vmMax < i10) {
                this.vmMax = i10;
            }
            if (this.sampleCount != 0 && this.vmInit > 0) {
                this.vmIncrease = i10 - this.vmInit;
            }
        }
        if (i11 > 0) {
            this.privateOtherAvg = (int) ((((this.privateOtherAvg * this.sampleCount) + i11) * 1.0d) / (this.sampleCount + 1));
            if (this.privateOtherMax < i11) {
                this.privateOtherMax = i11;
            }
            if (this.sampleCount != 0 && this.privateOtherInit > 0) {
                this.privateOtherIncrease = i11 - this.privateOtherInit;
            }
        }
        this.sampleCount++;
        Logger.getMetricsLogger().d("MemoryEvent", toString());
    }

    public Map<String, Object> getDetails() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e32a4f3c88d292577d36289dbd621ca1", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e32a4f3c88d292577d36289dbd621ca1") : getDetails(true);
    }

    public Map<String, Object> getDetails(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "331154a9378f0282f77351d51e0523c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "331154a9378f0282f77351d51e0523c7");
        }
        HashMap hashMap = new HashMap();
        if (this.pssMemoryMax > 0) {
            hashMap.put("memoryMax", Integer.valueOf(this.pssMemoryMax));
        }
        if (z && this.pssMemoryIncrease > Integer.MIN_VALUE) {
            hashMap.put("memoryIncrease", Integer.valueOf(this.pssMemoryIncrease));
        }
        if (this.javaHeapAvg > 0) {
            hashMap.put("javaHeapAvg", Integer.valueOf(this.javaHeapAvg));
        }
        if (this.javaHeapMax > 0) {
            hashMap.put("javaHeapMax", Integer.valueOf(this.javaHeapMax));
        }
        if (z && this.javaHeapIncrease > Integer.MIN_VALUE) {
            hashMap.put("javaHeapIncrease", Integer.valueOf(this.javaHeapIncrease));
        }
        if (this.nativeHeapAvg > 0) {
            hashMap.put("nativeHeapAvg", Integer.valueOf(this.nativeHeapAvg));
        }
        if (this.nativeHeapMax > 0) {
            hashMap.put("nativeHeapMax", Integer.valueOf(this.nativeHeapMax));
        }
        if (z && this.nativeHeapIncrease > Integer.MIN_VALUE) {
            hashMap.put("nativeHeapIncrease", Integer.valueOf(this.nativeHeapIncrease));
        }
        if (this.codeAvg > 0) {
            hashMap.put("codeAvg", Integer.valueOf(this.codeAvg));
        }
        if (this.codeMax > 0) {
            hashMap.put("codeMax", Integer.valueOf(this.codeMax));
        }
        if (z && this.codeIncrease > Integer.MIN_VALUE) {
            hashMap.put("codeIncrease", Integer.valueOf(this.codeIncrease));
        }
        if (this.stackAvg > 0) {
            hashMap.put("stackAvg", Integer.valueOf(this.stackAvg));
        }
        if (this.stackMax > 0) {
            hashMap.put("stackMax", Integer.valueOf(this.stackMax));
        }
        if (z && this.stackIncrease > Integer.MIN_VALUE) {
            hashMap.put("stackIncrease", Integer.valueOf(this.stackIncrease));
        }
        if (this.graphicsAvg > 0) {
            hashMap.put("graphicsAvg", Integer.valueOf(this.graphicsAvg));
        }
        if (this.graphicsMax > 0) {
            hashMap.put("graphicsMax", Integer.valueOf(this.graphicsMax));
        }
        if (z && this.graphicsIncrease > Integer.MIN_VALUE) {
            hashMap.put("graphicsIncrease", Integer.valueOf(this.graphicsIncrease));
        }
        if (this.dalvikHeapAvg > 0) {
            hashMap.put("dalvikHeapAvg", Integer.valueOf(this.dalvikHeapAvg));
        }
        if (this.dalvikHeapMax > 0) {
            hashMap.put("dalvikHeapMax", Integer.valueOf(this.dalvikHeapMax));
        }
        if (z && this.dalvikHeapIncrease > Integer.MIN_VALUE) {
            hashMap.put("dalvikHeapIncrease", Integer.valueOf(this.dalvikHeapIncrease));
        }
        if (this.vmAvg > 0) {
            hashMap.put("virtualMemoryAvg", Integer.valueOf(this.vmAvg));
        }
        if (this.vmMax > 0) {
            hashMap.put("virtualMemoryMax", Integer.valueOf(this.vmMax));
        }
        if (z && this.vmIncrease > Integer.MIN_VALUE) {
            hashMap.put("virtualMemoryIncrease", Integer.valueOf(this.vmIncrease));
        }
        if (this.privateOtherAvg > 0) {
            hashMap.put("privateOtherAvg", Integer.valueOf(this.privateOtherAvg));
        }
        if (this.privateOtherMax > 0) {
            hashMap.put("privateOtherMax", Integer.valueOf(this.privateOtherMax));
        }
        if (z && this.privateOtherIncrease > Integer.MIN_VALUE) {
            hashMap.put("privateOtherIncrease", Integer.valueOf(this.privateOtherIncrease));
        }
        return hashMap;
    }

    public double getAvgMemoryUsage() {
        return this.pssMemoryAvg;
    }

    public double getMaxMemoryUsage() {
        return this.pssMemoryMax;
    }

    public int getSampleCount() {
        return this.sampleCount;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public String getPageName() {
        return this.pageName;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public double getMetricValue() {
        return this.pssMemoryAvg;
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public void convertToJson(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f52ac38133bd5e45469c0bac99b6ef6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f52ac38133bd5e45469c0bac99b6ef6");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("pageName", this.pageName);
        jSONArray.put(JSONUtils.buildLogUnit(Constants.MEMORY_AVG, df.format(this.pssMemoryAvg), jSONObject2, this.ts));
        jSONArray.put(JSONUtils.buildLogUnit(Constants.MEMORY_MAX, df.format(this.pssMemoryMax), jSONObject2, this.ts));
        jSONObject.put(Constants.METRICS, jSONArray);
    }
}
