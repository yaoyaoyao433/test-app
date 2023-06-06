package com.meituan.android.common.statistics.channel;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.android.common.statistics.ad.MidasInfo;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.exposure.ExposureInfo;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IPublicInterface {
    boolean createTagContainer(Object obj, Activity activity);

    Map<String, String> getAllEnvironment();

    String getChannelName();

    Map<String, Object> getTag(String str);

    void registerTag(String... strArr);

    boolean removeTag(String str);

    boolean removeTag(String str, String str2);

    boolean updateEnvironment(String str);

    boolean updateEnvironment(String str, String str2);

    boolean updateTag(String str, String str2, Map<String, Object> map);

    boolean updateTag(String str, Map<String, Object> map);

    void writeAdEvent(@NonNull String str, String str2, Map<String, Object> map, String str3, EventName eventName, MidasInfo midasInfo, boolean z);

    void writeAutoPageDisappear(@NonNull String str, Map<String, Object> map);

    void writeAutoPageView(@NonNull String str, Map<String, Object> map);

    void writeAutoPageView(@NonNull String str, Map<String, Object> map, EventLevel eventLevel);

    void writeBizOrder(@NonNull String str, String str2, Map<String, Object> map, String str3);

    void writeBizPay(@NonNull String str, String str2, Map<String, Object> map, String str3);

    void writeEvent(@NonNull String str, EventInfo eventInfo);

    void writeEvent(@NonNull String str, String str2);

    void writeModeViewMergable(@NonNull String str, String str2, Map<String, Object> map, String str3);

    void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3);

    void writeModelClick(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z);

    void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map, String str3);

    void writeModelEdit(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z);

    ExposureInfo writeModelExposure(String str, String str2, Map<String, Object> map, String str3);

    ExposureInfo writeModelExposureForMrnSDk(String str, String str2, Map<String, Object> map, String str3, String str4);

    void writeModelView(@NonNull String str, String str2, Map<String, Object> map, String str3);

    void writeModelView(@NonNull String str, String str2, Map<String, Object> map, String str3, boolean z);

    void writePageDisappear(@NonNull String str, String str2, Map<String, Object> map);

    void writePageView(@NonNull String str, @NonNull String str2, Map<String, Object> map);

    void writeShow(@NonNull String str, String str2, Map<String, Object> map, String str3, String str4);

    void writeSystemCheck(String str, String str2, Map<String, Object> map, String str3);
}
