package com.meituan.android.mrn.update;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MRNCheckUpdateResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Body body;
    public int code;
    public String message;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public static class Body {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<ResponseBundle> bundles;
        public List<ResponseDeleteBundleInfo> bundlesToDel;
    }
}
