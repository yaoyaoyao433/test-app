package com.meituan.android.common.statistics.channel;

import android.support.annotation.NonNull;
import com.meituan.android.common.statistics.channel.SearchHelper;
import com.meituan.android.common.statistics.entity.BusinessInfo;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.entity.EventName;
import java.util.Map;
import java.util.Queue;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public interface IDeprecatedInterface {
    @Deprecated
    String getEnvironment();

    String getEnvironment(String str);

    long getSeq();

    void reportCacheEventListAfterPv(Queue<SearchHelper.CacheItem> queue, JSONObject jSONObject, boolean z);

    void write(String str, EventInfo eventInfo);

    @Deprecated
    void writeAutoPageView(Map<String, Object> map);

    @Deprecated
    void writeAutoPageView(Map<String, Object> map, EventLevel eventLevel);

    void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map);

    void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z);

    @Deprecated
    void writeBizOrder(String str, Map<String, Object> map);

    @Deprecated
    void writeBizOrder(String str, Map<String, Object> map, String str2);

    void writeBizPay(@NonNull String str, String str2, Map<String, Object> map);

    void writeBizPay(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z);

    @Deprecated
    void writeBizPay(String str, Map<String, Object> map);

    @Deprecated
    void writeBizPay(String str, Map<String, Object> map, String str2);

    @Deprecated
    void writeEvent(EventInfo eventInfo);

    @Deprecated
    void writeEvent(EventName eventName, BusinessInfo businessInfo, Map<String, Object> map, String str, String str2, String str3, String str4, String str5);

    @Deprecated
    void writeEvent(EventName eventName, String str, String str2, String str3, String str4, String str5);

    @Deprecated
    void writeEvent(EventName eventName, String str, String str2, String str3, String str4, String str5, boolean z);

    @Deprecated
    void writeEvent(String str);

    void writeEvent(@NonNull String str, EventName eventName, BusinessInfo businessInfo, Map<String, Object> map, String str2, String str3, String str4, String str5, String str6);

    void writeModelClick(@NonNull String str, String str2, Map<String, Object> map);

    void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, int i);

    void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, int i);

    void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z, boolean z2);

    @Deprecated
    void writeModelClick(String str, Map<String, Object> map);

    @Deprecated
    void writeModelClick(String str, Map<String, Object> map, int i);

    @Deprecated
    void writeModelClick(String str, Map<String, Object> map, String str2);

    @Deprecated
    void writeModelClick(String str, Map<String, Object> map, String str2, int i);

    void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map);

    void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z);

    @Deprecated
    void writeModelEdit(String str, Map<String, Object> map);

    @Deprecated
    void writeModelEdit(String str, Map<String, Object> map, String str2);

    void writeModelView(@NonNull String str, String str2, Map<String, Object> map);

    @Deprecated
    void writeModelView(@NonNull String str, String str2, Map<String, Object> map, int i);

    void writeModelView(String str, String str2, Map<String, Object> map, String str3, int i);

    @Deprecated
    void writeModelView(String str, Map<String, Object> map);

    @Deprecated
    void writeModelView(String str, Map<String, Object> map, int i);

    @Deprecated
    void writeModelView(String str, Map<String, Object> map, String str2);

    @Deprecated
    void writeModelView(String str, Map<String, Object> map, String str2, int i);

    @Deprecated
    void writePageDisappear(@NonNull String str, Map<String, Object> map);

    @Deprecated
    void writePageDisappear(Map<String, Object> map);

    @Deprecated
    void writePageTrack(BusinessInfo businessInfo);

    @Deprecated
    void writePageTrack(String str, String str2);

    @Deprecated
    void writePageView(String str, Map<String, Object> map);

    @Deprecated
    void writeShow(String str, Map<String, Object> map, String str2, String str3);

    void writeSystemCheck(String str, String str2, Map<String, Object> map);
}
