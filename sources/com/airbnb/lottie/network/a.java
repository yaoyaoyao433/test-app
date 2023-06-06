package com.airbnb.lottie.network;

import com.meituan.android.mrn.engine.MRNBundleManager;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum a {
    Json(".json"),
    Zip(MRNBundleManager.MRN_BUNDLE_SUFFIX);
    
    public final String c;

    a(String str) {
        this.c = str;
    }

    public final String a() {
        return ".temp" + this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.c;
    }
}
