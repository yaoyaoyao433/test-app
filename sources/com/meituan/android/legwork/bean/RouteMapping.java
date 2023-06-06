package com.meituan.android.legwork.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class RouteMapping implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nonnull
    public String errorText = "";
    @Nonnull
    public Map<String, String> matchingParam = new HashMap();
}
