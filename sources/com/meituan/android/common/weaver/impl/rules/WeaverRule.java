package com.meituan.android.common.weaver.impl.rules;

import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.interfaces.WeaverEvent;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface WeaverRule {
    void consumerEvents(@NonNull LinkedList<WeaverEvent> linkedList);
}
