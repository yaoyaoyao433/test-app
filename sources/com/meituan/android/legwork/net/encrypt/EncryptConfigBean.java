package com.meituan.android.legwork.net.encrypt;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class EncryptConfigBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String position;
    public String rootName;

    public EncryptConfigBean(String str) {
        this.rootName = str;
    }

    public EncryptConfigBean(String str, String str2) {
        this.rootName = str;
        this.position = str2;
    }
}
