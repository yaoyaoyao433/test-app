package com.meituan.android.common.kitefly;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class Log implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static final long serialVersionUID = 1;
    public String details;
    public Map<String, Object> envMaps;
    public InnerProperty innerProperty;
    public boolean isMainThread;
    public boolean isSelf;
    public String log;
    public int logSource;
    public String logUUId;
    public Map<String, Object> option;
    public String raw;
    public String reportChannel;
    public int status;
    public String tag;
    public String threadId;
    public String threadName;
    public String token;
    public long ts;
    public Double value;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerProperty {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String dbId;
        public Boolean isLv4Local = Boolean.FALSE;
        public boolean isMainProcess = true;
        public Boolean isNewLog = Boolean.FALSE;
        public long trunkSize = 0;
        public boolean isGeneralChannel = false;
        public boolean afterSample = false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface ValueStrategy {
        Long calculate(Long l, Long l2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface ValueStrategy1 {
        Double calculate(Double d, Long l);
    }

    public Log(Builder builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d91504e6e7896084fc0603616b00237b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d91504e6e7896084fc0603616b00237b");
            return;
        }
        this.log = "";
        this.tag = "default";
        this.innerProperty = new InnerProperty();
        this.log = builder.log;
        this.option = builder.option;
        this.tag = builder.tag;
        this.reportChannel = builder.reportChannel;
        this.ts = builder.ts;
        this.status = builder.status;
        this.token = builder.token;
        this.value = builder.value;
        this.envMaps = builder.envMaps;
        this.details = builder.details;
        this.raw = builder.raw;
        this.logUUId = builder.logUUId;
        this.logSource = builder.logSource;
        this.innerProperty.isLv4Local = Boolean.valueOf(builder.isLv4Local);
        this.innerProperty.isNewLog = Boolean.valueOf(builder.isNewLog);
        this.innerProperty.isGeneralChannel = builder.isGeneralChannel;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String details;
        private Map<String, Object> envMaps;
        private boolean isGeneralChannel;
        private boolean isLv4Local;
        private boolean isNewLog;
        private String log;
        public int logSource;
        public String logUUId;
        private Map<String, Object> option;
        private String raw;
        private String reportChannel;
        private int status;
        private String tag;
        private String token;
        private long ts;
        private Double value;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ca18d7ba48f002a29d0115613f533df", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ca18d7ba48f002a29d0115613f533df");
                return;
            }
            this.log = "";
            this.tag = "";
            this.reportChannel = "";
            this.isLv4Local = false;
            this.isNewLog = false;
            this.isGeneralChannel = false;
        }

        public Builder(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a44611471807fcc07c7cb98325e599ac", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a44611471807fcc07c7cb98325e599ac");
                return;
            }
            this.log = "";
            this.tag = "";
            this.reportChannel = "";
            this.isLv4Local = false;
            this.isNewLog = false;
            this.isGeneralChannel = false;
            this.log = str;
        }

        public Builder reportChannel(String str) {
            this.reportChannel = str;
            return this;
        }

        public Builder log(String str) {
            this.log = str;
            return this;
        }

        public Builder status(int i) {
            this.status = i;
            return this;
        }

        public Builder ts(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2105fdc2db08d78c5cf9baac942ff14", 6917529027641081856L)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2105fdc2db08d78c5cf9baac942ff14");
            }
            this.ts = j;
            return this;
        }

        public Builder token(String str) {
            this.token = str;
            return this;
        }

        public Builder optional(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd705348062a1c925ab5b484f668b56a", 6917529027641081856L)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd705348062a1c925ab5b484f668b56a");
            }
            if (map == null) {
                map = new HashMap<>();
            }
            this.option = new HashMap(map);
            return this;
        }

        @Deprecated
        public Builder env(Map<String, Object> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bdf2e6b509a17754eaa97f1ba5237de", 6917529027641081856L)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bdf2e6b509a17754eaa97f1ba5237de");
            }
            if (map == null) {
                map = new HashMap<>();
            }
            this.envMaps = new HashMap(map);
            return this;
        }

        public Builder tag(String str) {
            this.tag = str;
            return this;
        }

        public Builder value(double d) {
            Object[] objArr = {Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c04a6136c2288023e50478f18bad6e73", 6917529027641081856L)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c04a6136c2288023e50478f18bad6e73");
            }
            this.value = Double.valueOf(d);
            return this;
        }

        public Builder value(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9725bf757ed8db511342117527d1aaa0", 6917529027641081856L)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9725bf757ed8db511342117527d1aaa0");
            }
            value(j);
            return this;
        }

        public Builder reduce(ValueStrategy1 valueStrategy1, long j, double d) {
            Object[] objArr = {valueStrategy1, new Long(j), Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "856c10f7fb5fbde1f26ad64479254117", 6917529027641081856L)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "856c10f7fb5fbde1f26ad64479254117");
            }
            if (this.value == null) {
                this.value = Double.valueOf(d);
            }
            if (valueStrategy1 == null) {
                this.value = Double.valueOf(this.value.doubleValue() + j);
            } else {
                this.value = valueStrategy1.calculate(this.value, Long.valueOf(j));
            }
            return this;
        }

        public Builder reduce(ValueStrategy valueStrategy, long j, long j2) {
            Object[] objArr = {valueStrategy, new Long(j), new Long(j2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df932f28582225890a47e17d75212357", 6917529027641081856L)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df932f28582225890a47e17d75212357");
            }
            if (this.value == null) {
                this.value = Double.valueOf(j2);
            }
            if (valueStrategy == null) {
                this.value = Double.valueOf(this.value.doubleValue() + j);
            } else {
                this.value = Double.valueOf(valueStrategy.calculate(Long.valueOf(Math.round(this.value.doubleValue())), Long.valueOf(j)).longValue());
            }
            return this;
        }

        public Builder details(String str) {
            this.details = str;
            return this;
        }

        public Builder raw(String str) {
            this.raw = str;
            return this;
        }

        public Builder logUUId(String str) {
            this.logUUId = str;
            return this;
        }

        public Builder logSource(int i) {
            this.logSource = i;
            return this;
        }

        public Builder lv4LocalStatus(boolean z) {
            this.isLv4Local = z;
            return this;
        }

        public Builder newLogStatus(boolean z) {
            this.isNewLog = z;
            return this;
        }

        public Builder generalChannelStatus(boolean z) {
            this.isGeneralChannel = z;
            return this;
        }

        public Log build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4407cfa1e96569c00b3030b2af0720f9", 6917529027641081856L)) {
                return (Log) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4407cfa1e96569c00b3030b2af0720f9");
            }
            if (this.option == null) {
                this.option = new HashMap();
            }
            if (this.envMaps == null) {
                this.envMaps = new HashMap();
            }
            return new Log(this);
        }
    }

    public final String getTag() {
        return this.tag;
    }
}
