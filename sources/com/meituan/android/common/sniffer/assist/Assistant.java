package com.meituan.android.common.sniffer.assist;

import com.meituan.android.common.sniffer.util.GsonUtil;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Assistant {
    private Builder builder;

    private Assistant(Builder builder) {
        this.builder = builder;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder {
        public AssistInfo assistInfo = new AssistInfo();

        public Builder setTrack(String str) {
            this.assistInfo.track = str;
            return this;
        }

        public Builder setNetworkState(String str) {
            this.assistInfo.networkState = str;
            return this;
        }

        public Builder setExts(Map<String, Object> map) {
            this.assistInfo.exts = map;
            return this;
        }

        public Assistant build() {
            return new Assistant(this);
        }
    }

    public String toJson() {
        return GsonUtil.getGson().toJson(this.builder.assistInfo);
    }
}
