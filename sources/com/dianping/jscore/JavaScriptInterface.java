package com.dianping.jscore;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public abstract class JavaScriptInterface {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Keep
    public abstract Value exec(Value[] valueArr);
}
