package com.facebook.react.common;

import android.support.annotation.Nullable;
import com.meituan.robust.common.StringUtil;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class e {
    @Nullable
    private Thread a = null;

    public void a() {
        Thread currentThread = Thread.currentThread();
        if (this.a == null) {
            this.a = currentThread;
        }
        if (this.a != currentThread) {
            StringBuilder sb = new StringBuilder("expected thread ");
            sb.append(this.a != null ? this.a.getName() : StringUtil.NULL);
            sb.append(", actually thread ");
            sb.append(currentThread.getName());
            com.facebook.infer.annotation.a.a(false, sb.toString());
        }
    }
}
