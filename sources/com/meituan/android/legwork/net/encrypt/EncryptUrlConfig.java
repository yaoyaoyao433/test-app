package com.meituan.android.legwork.net.encrypt;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class EncryptUrlConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<EncryptConfigBean> body;
    public List<EncryptConfigBean> query;
    public String url;

    public EncryptUrlConfig(String str, List<EncryptConfigBean> list, List<EncryptConfigBean> list2) {
        this.url = str;
        this.query = list;
        this.body = list2;
    }
}
