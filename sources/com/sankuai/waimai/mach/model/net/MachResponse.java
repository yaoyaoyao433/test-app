package com.sankuai.waimai.mach.model.net;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MachResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public Object data;
    public String msg;
    public long traceid;
}
