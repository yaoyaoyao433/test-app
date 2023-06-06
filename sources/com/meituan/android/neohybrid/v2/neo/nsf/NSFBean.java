package com.meituan.android.neohybrid.v2.neo.nsf;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class NSFBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2261417793753802548L;
    private String key;

    public String getKey() {
        return this.key;
    }
}
