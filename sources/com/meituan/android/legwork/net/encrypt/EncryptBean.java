package com.meituan.android.legwork.net.encrypt;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class EncryptBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String position;
    public String rootName;
    public String value;

    public EncryptBean(String str) {
        this.rootName = str;
    }

    public EncryptBean(String str, String str2) {
        this.rootName = str;
        this.value = str2;
    }

    public EncryptBean(String str, String str2, String str3) {
        this.rootName = str;
        this.value = str2;
        this.position = str3;
    }
}
