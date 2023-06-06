package com.meituan.android.common.sniffer.bear;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.metrics.util.TimeUtil;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Honey {
    private static final Queue<Honey> sPools = new ConcurrentLinkedQueue();
    public long createMs;
    @Nullable
    public Map<String, String> customFieldMap;
    @Nullable
    public String describe;
    public boolean filtered;
    @Nullable
    public String log;
    public int metricsSample;
    public boolean normal = true;
    @Nullable
    public String page;
    public int snifferSample;
    @Nullable
    public String type;
    public long weight;

    private Honey() {
    }

    public void recycle() {
        if (sPools.size() < 50) {
            sPools.offer(this);
        }
    }

    public Honey withWeight(long j) {
        this.weight = j;
        return this;
    }

    public Honey withDescribe(@Nullable String str) {
        this.describe = str;
        return this;
    }

    public Honey withCustomField(@Nullable Map<String, String> map) {
        this.customFieldMap = map;
        return this;
    }

    public Honey withPage(@Nullable String str) {
        this.page = str;
        return this;
    }

    @NonNull
    public static Honey of(boolean z, @Nullable String str) {
        return of(z, str, null);
    }

    @NonNull
    public static Honey of(boolean z, @Nullable String str, @Nullable String str2) {
        Honey poll = sPools.poll();
        if (poll == null) {
            poll = new Honey();
        }
        poll.normal = z;
        poll.type = str;
        poll.log = str2;
        poll.page = null;
        poll.describe = null;
        poll.weight = 1L;
        poll.customFieldMap = null;
        poll.metricsSample = -1;
        poll.snifferSample = -1;
        poll.createMs = TimeUtil.currentTimeMillisSNTP();
        poll.filtered = false;
        return poll;
    }
}
