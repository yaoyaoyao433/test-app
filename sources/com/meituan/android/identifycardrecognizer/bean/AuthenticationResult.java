package com.meituan.android.identifycardrecognizer.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class AuthenticationResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6909242245559189183L;
    private int isAccessed;

    public int getIsAccessed() {
        return this.isAccessed;
    }

    public void setIsAccessed(int i) {
        this.isAccessed = i;
    }
}
