package com.facebook.react.uimanager;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.ReadableMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ag {
    public final ReadableMap a;

    public ag(ReadableMap readableMap) {
        this.a = readableMap;
    }

    public final boolean a(String str) {
        return this.a.hasKey(str);
    }

    public final boolean a(String str, boolean z) {
        return this.a.isNull(str) ? z : this.a.getBoolean(str);
    }

    public final float a(String str, float f) {
        return this.a.isNull(str) ? f : (float) this.a.getDouble(str);
    }

    public final int a(String str, int i) {
        return this.a.isNull(str) ? i : this.a.getInt(str);
    }

    @Nullable
    public final String b(String str) {
        return this.a.getString(str);
    }

    public final String toString() {
        return "{ " + getClass().getSimpleName() + ": " + this.a.toString() + " }";
    }
}
