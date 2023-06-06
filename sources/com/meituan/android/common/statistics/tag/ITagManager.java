package com.meituan.android.common.statistics.tag;

import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ITagManager {
    void clear();

    void clear(String str);

    void clearMmpTag(String str);

    void clearMmpTag(String str, String str2);

    String getCurrentTagNodePageName();

    Map<String, Object> getTag(String str);

    Map<String, Object> getTag(String str, String str2);

    Map<String, Object> getTags();

    boolean insertPageName(String str, String str2, boolean z);

    boolean removeTag(String str);

    boolean removeTag(String str, String str2);

    boolean updatePageName(String str, String str2);

    boolean writeTag(String str, String str2, Map<String, Object> map);

    boolean writeTag(String str, String str2, JSONObject jSONObject);

    boolean writeTag(String str, Map<String, Object> map);

    boolean writeTag(String str, JSONObject jSONObject);
}
