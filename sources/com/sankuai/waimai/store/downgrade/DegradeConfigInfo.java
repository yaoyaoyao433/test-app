package com.sankuai.waimai.store.downgrade;

import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class DegradeConfigInfo implements Serializable {
    private static final long serialVersionUID = 2305372077240383546L;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public @interface DegradeValue {
        public static final int DEFAULT = 0;
        public static final int DEGRADE = 1;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public @interface DomainType {
        public static final int SG_TYPE = 1;
        public static final int WM_TYPE = 2;
    }
}
