package com.tencent.mapsdk.engine.jni;

import android.support.annotation.Keep;
import java.util.Arrays;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class JNIEvent {
    public byte[] data;
    public Object extra;
    public int id;
    public String name;

    public String toString() {
        return "JNIEvent{id=" + this.id + ", name='" + this.name + "', data=" + Arrays.toString(this.data) + ", extra=" + this.extra + '}';
    }
}
