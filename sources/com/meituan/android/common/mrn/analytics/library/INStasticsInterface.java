package com.meituan.android.common.mrn.analytics.library;

import com.facebook.react.bridge.ReadableMap;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface INStasticsInterface {
    void moduleClick(String str, String str2, String str3, String str4, HashMap hashMap);

    void moduleEdit(String str, String str2, String str3, String str4, HashMap hashMap);

    void moduleView(String str, String str2, String str3, String str4, HashMap hashMap);

    void moduleViewList(String str, String str2, String str3, String str4, HashMap hashMap);

    void order(String str, String str2, String str3, String str4, String str5, HashMap hashMap);

    void pageDisappear(String str, String str2, String str3, HashMap hashMap);

    void pageView(String str, String str2, String str3, HashMap hashMap);

    void pay(String str, String str2, String str3, String str4, String str5, HashMap hashMap);

    void setTag(String str, ReadableMap readableMap);

    void systemCheck(String str, String str2, String str3, String str4, HashMap hashMap);
}
