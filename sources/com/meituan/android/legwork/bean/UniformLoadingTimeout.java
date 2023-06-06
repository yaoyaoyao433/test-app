package com.meituan.android.legwork.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class UniformLoadingTimeout implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("mrn_shell_loading_timeout")
    public int timeout;
}
