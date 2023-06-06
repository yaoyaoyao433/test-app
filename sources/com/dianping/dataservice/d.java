package com.dianping.dataservice;

import com.dianping.dataservice.c;
import com.dianping.dataservice.e;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface d<T extends c, R extends e> {
    void onRequestFailed(T t, R r);

    void onRequestFinish(T t, R r);
}
