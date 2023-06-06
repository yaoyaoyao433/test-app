package com.meituan.mmp.lib.engine;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class RequestPrefetchParams {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String path;
    public final String query;
    public final int scene;

    public RequestPrefetchParams(String str, String str2, int i) {
        this.path = str;
        this.query = str2;
        this.scene = i;
    }
}
