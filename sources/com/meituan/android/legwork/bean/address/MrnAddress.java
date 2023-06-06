package com.meituan.android.legwork.bean.address;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MrnAddress implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String address;
    public int latitude;
    public int longitude;
    public String type;
}
