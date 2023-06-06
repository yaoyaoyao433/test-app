package com.meituan.android.legwork.bean.monitor;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MrnShellConfigBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("need_login")
    public String needLogin;
    @SerializedName("mrn_shell_loading_timeout")
    public int timeout;
}
