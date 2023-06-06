package com.bumptech.glide.load.engine;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum b {
    ALL(true, true),
    NONE(false, false),
    SOURCE(true, false),
    RESULT(false, true);
    
    public final boolean e;
    public final boolean f;

    b(boolean z, boolean z2) {
        this.e = z;
        this.f = z2;
    }
}
