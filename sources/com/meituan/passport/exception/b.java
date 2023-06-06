package com.meituan.passport.exception;

import android.support.constraint.R;
import com.meituan.passport.utils.Utils;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends IOException {
    public b() {
        this(Utils.e(com.meituan.android.singleton.b.a(), R.string.passport_tips_io_error));
    }

    public b(Throwable th) {
        this(Utils.e(com.meituan.android.singleton.b.a(), R.string.passport_tips_io_error), th);
    }

    private b(String str) {
        super(str);
    }

    private b(String str, Throwable th) {
        super(str, th);
    }
}
