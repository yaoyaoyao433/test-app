package com.sankuai.waimai.store.poi.list.refactor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface PoiPageLifecycleObserver {

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface State {
        public static final int STATE_ON_DESTROY = 4;
        public static final int STATE_ON_PAUSE = 2;
        public static final int STATE_ON_RESUME = 1;
        public static final int STATE_ON_START = 0;
        public static final int STATE_ON_STOP = 3;
    }

    void f(int i);
}
