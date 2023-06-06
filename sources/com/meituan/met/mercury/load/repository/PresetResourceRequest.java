package com.meituan.met.mercury.load.repository;

import android.support.annotation.Keep;
import com.meituan.met.mercury.load.core.DDLoadStrategy;
import com.meituan.met.mercury.load.core.n;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class PresetResourceRequest extends BaseLoadRequest {
    public static ChangeQuickRedirect changeQuickRedirect;

    public PresetResourceRequest(String str) {
        super(str);
    }

    public PresetResourceRequest(String str, n nVar) {
        super(str, DDLoadStrategy.LOCAL_ONLY, null, nVar);
    }
}
