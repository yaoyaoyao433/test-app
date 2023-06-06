package com.meituan.passport.pojo;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BindStatus implements Serializable {
    public static final int BIND = 1;
    public static final int UN_BIND = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    public String avatarUrl;
    public int isBinded;
    public String nickName;

    public boolean isBinded() {
        return this.isBinded == 1;
    }
}
