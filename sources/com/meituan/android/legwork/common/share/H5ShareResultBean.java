package com.meituan.android.legwork.common.share;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class H5ShareResultBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean canceled;
    public H5ShareChannel sharedTo;
    public boolean success;
}
