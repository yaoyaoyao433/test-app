package com.meituan.android.common.sniffer.bear;

import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Key {
    @VisibleForTesting
    static final Queue<Key> sPools = new ConcurrentLinkedQueue();
    public String business;
    public String module;

    private Key(String str, String str2) {
        this.business = str;
        this.module = str2;
    }

    public void recycle() {
        if (sPools.size() < 30) {
            sPools.add(this);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Key key = (Key) obj;
        return TextUtils.equals(this.business, key.business) && TextUtils.equals(this.module, key.module);
    }

    public int hashCode() {
        return Arrays.hashCode(new String[]{this.business, this.module});
    }

    public static Key of(String str, String str2) {
        Key poll = sPools.poll();
        if (poll == null) {
            return new Key(str, str2);
        }
        poll.business = str;
        poll.module = str2;
        return poll;
    }
}
