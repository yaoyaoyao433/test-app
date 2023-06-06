package com.meituan.android.common.badge;

import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface CustomizedProvider {
    String category();

    Map<String, String> normalInfo();

    Map<String, String> urgentInfo();
}
