package com.facebook.react.devsupport;

import com.facebook.proguard.annotations.DoNotStrip;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class JSException extends Exception {
    public final String a;

    @DoNotStrip
    public JSException(String str, String str2, Throwable th) {
        super(str, th);
        this.a = str2;
    }
}
