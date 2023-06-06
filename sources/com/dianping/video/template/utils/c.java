package com.dianping.video.template.utils;

import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.util.d;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c {
    public static ChangeQuickRedirect a = null;
    public static Context b = null;
    private static final String c = "c";

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9708abf220b1f6f761e63d5608facbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9708abf220b1f6f761e63d5608facbf");
        } else if (context != null) {
            b = context.getApplicationContext();
        }
    }

    private static void a(List<JsonObject> list, List<JsonObject> list2, JsonArray jsonArray) {
        int i;
        Object[] objArr = {list, list2, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6c2e1462842220d3e6dc4d837c96a63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6c2e1462842220d3e6dc4d837c96a63");
        } else if (jsonArray != null) {
            for (int i2 = 0; i2 < jsonArray.size(); i2++) {
                JsonObject asJsonObject = jsonArray.get(i2).getAsJsonObject();
                Object[] objArr2 = {list, list2, asJsonObject};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2bf3772df43f51d6053fd36418fb877c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2bf3772df43f51d6053fd36418fb877c");
                } else if (asJsonObject != null) {
                    Iterator<Map.Entry<String, JsonElement>> it = asJsonObject.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = 0;
                            break;
                        }
                        Map.Entry<String, JsonElement> next = it.next();
                        if ("type".equals(next.getKey())) {
                            i = next.getValue().getAsInt();
                            break;
                        }
                    }
                    if (i == 200) {
                        if (list2 != null) {
                            list2.add(asJsonObject);
                        }
                    } else if (i == 400 && list != null) {
                        list.add(asJsonObject);
                    }
                }
            }
        }
    }

    public static void a(com.dianping.video.videofilter.template.b bVar, List<JsonObject> list) {
        Object[] objArr = {bVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1944f0333ea488b1fc48f16de5b0f70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1944f0333ea488b1fc48f16de5b0f70");
        } else if (bVar != null && list != null) {
            for (int i = 0; i < list.size(); i++) {
                String str = "";
                JsonElement jsonElement = null;
                int i2 = 1;
                for (Map.Entry<String, JsonElement> entry : list.get(i).entrySet()) {
                    String key = entry.getKey();
                    if ("type".equals(key)) {
                        entry.getValue().getAsInt();
                    } else if ("name".equals(key)) {
                        str = entry.getValue().getAsString();
                    } else if ("value".equals(key)) {
                        jsonElement = entry.getValue();
                    } else if ("uniformtype".equals(key)) {
                        i2 = entry.getValue().getAsInt();
                    }
                }
                if (jsonElement != null) {
                    switch (i2) {
                        case 0:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            break;
                        case 1:
                            bVar.a(str, jsonElement.getAsFloat());
                            continue;
                        default:
                            bVar.a(str, jsonElement.getAsFloat());
                            continue;
                    }
                }
            }
        }
    }

    public static void a(com.dianping.video.videofilter.template.b bVar, JsonObject jsonObject, float f) {
        Object[] objArr = {bVar, jsonObject, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23d008e8c22a3d7ad95d113b00901b39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23d008e8c22a3d7ad95d113b00901b39");
        } else if (bVar == null || jsonObject == null) {
        } else {
            Iterator<Map.Entry<String, JsonElement>> it = jsonObject.entrySet().iterator();
            String str = "";
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, JsonElement> next = it.next();
                if ("name".equals(next.getKey())) {
                    str = next.getValue().getAsString();
                    break;
                }
            }
            if (NotificationCompat.CATEGORY_PROGRESS.equals(str)) {
                bVar.a(str, f);
            }
        }
    }

    public static void a(List<JsonObject> list, List<JsonObject> list2, JsonArray jsonArray, JsonArray jsonArray2) {
        Object[] objArr = {list, list2, jsonArray, jsonArray2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b790f4e14c07f6e80d105ec1d383ee6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b790f4e14c07f6e80d105ec1d383ee6e");
            return;
        }
        a(list, list2, jsonArray);
        a(list, list2, jsonArray2);
    }

    public static List<String> a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8d79f668682f47ea3e201c340cdf25b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8d79f668682f47ea3e201c340cdf25b");
        }
        if (z) {
            Object[] objArr2 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "97e064d4f72e12e0f5d01fa2506a8915", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "97e064d4f72e12e0f5d01fa2506a8915");
            }
            if (b == null) {
                Log.e(c, MonitorManager.CONTEXT_IS_NULL_MSG);
            }
            ArrayList arrayList = new ArrayList();
            String a2 = com.dianping.video.util.c.a(b, str);
            String a3 = com.dianping.video.util.c.a(b, str2);
            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3)) {
                arrayList.add(a2);
                arrayList.add(a3);
            }
            return arrayList;
        }
        return a(str, str2);
    }

    private static List<String> a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "704574441e695eeef502d30450412dd8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "704574441e695eeef502d30450412dd8");
        }
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(str);
            File file2 = new File(str2);
            if (!file.exists() || !file2.exists()) {
                if (!file.exists()) {
                    String str3 = c;
                    Log.e(str3, " vertexShader file not exist " + str);
                }
                if (!file2.exists()) {
                    String str4 = c;
                    Log.e(str4, " fragmentShader file not exist " + str2);
                }
            }
            String a2 = d.a(file);
            String a3 = d.a(file2);
            if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(a3)) {
                if (TextUtils.isEmpty(a2)) {
                    String str5 = c;
                    Log.e(str5, " vertexShader file invalid " + str);
                }
                if (TextUtils.isEmpty(a3)) {
                    String str6 = c;
                    Log.e(str6, " fragmentShader file invalid " + str2);
                }
            }
            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3)) {
                arrayList.add(a2);
                arrayList.add(a3);
            }
        } catch (Exception e) {
            Log.e(c, e.getMessage());
        }
        return arrayList;
    }
}
