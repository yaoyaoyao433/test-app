package com.meituan.android.common.aidata.cep.rule;

import com.meituan.android.common.aidata.data.api.IEvent;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IRuleMatcher {
    boolean filterAccept(IEvent iEvent);

    boolean match(IEvent iEvent);
}
