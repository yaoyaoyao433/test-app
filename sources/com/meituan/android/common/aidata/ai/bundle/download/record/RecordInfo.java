package com.meituan.android.common.aidata.ai.bundle.download.record;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RecordInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String desc;
    private int errorCode;
    private long timestamp;
    private String trace;

    public RecordInfo(Builder builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6b3ffbfb442442de7820068f19f88ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6b3ffbfb442442de7820068f19f88ad");
            return;
        }
        this.trace = builder.trace;
        this.desc = builder.desc;
        this.errorCode = builder.errorCode;
        this.timestamp = builder.timestamp;
    }

    public String getTrace() {
        return this.trace;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String desc;
        private int errorCode;
        private long timestamp;
        private String trace;

        public Builder trace(String str) {
            this.trace = str;
            return this;
        }

        public Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public Builder errorCode(int i) {
            this.errorCode = i;
            return this;
        }

        public RecordInfo build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5084d8600a02dfa406f19e01e263a731", RobustBitConfig.DEFAULT_VALUE)) {
                return (RecordInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5084d8600a02dfa406f19e01e263a731");
            }
            this.timestamp = System.currentTimeMillis();
            return new RecordInfo(this);
        }
    }
}
