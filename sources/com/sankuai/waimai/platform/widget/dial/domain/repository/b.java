package com.sankuai.waimai.platform.widget.dial.domain.repository;

import com.sankuai.waimai.platform.widget.dial.domain.model.PrivacyInfo;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a<T> {
        void a(Exception exc);

        void a(T t);
    }

    void a(String str, List<String> list, String str2, int i, a<PrivacyInfo> aVar);

    void a(String str, List<String> list, String str2, int i, boolean z, a<PrivacyInfo> aVar);
}
