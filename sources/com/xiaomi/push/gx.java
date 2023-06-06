package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public final class gx {
    public static void a(Context context, gz gzVar, List<he> list) {
        HashMap<String, ArrayList<he>> a = a(context, list);
        if (a != null && a.size() != 0) {
            a(context, gzVar, a);
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.a("TinyData TinyDataCacheUploader.uploadTinyData itemsUploading == null || itemsUploading.size() == 0  ts:" + System.currentTimeMillis());
    }

    private static HashMap<String, ArrayList<he>> a(Context context, List<he> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        HashMap<String, ArrayList<he>> hashMap = new HashMap<>();
        for (he heVar : list) {
            a(context, heVar);
            ArrayList<he> arrayList = hashMap.get(heVar.h);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                hashMap.put(heVar.h, arrayList);
            }
            arrayList.add(heVar);
        }
        return hashMap;
    }

    private static void a(Context context, he heVar) {
        if (heVar.f) {
            heVar.a = "push_sdk_channel";
        }
        if (TextUtils.isEmpty(heVar.i)) {
            heVar.i = com.xiaomi.push.service.az.a();
        }
        heVar.b(System.currentTimeMillis());
        if (TextUtils.isEmpty(heVar.k)) {
            heVar.h = context.getPackageName();
        }
        if (TextUtils.isEmpty(heVar.h)) {
            heVar.h = heVar.k;
        }
    }

    private static void a(Context context, gz gzVar, HashMap<String, ArrayList<he>> hashMap) {
        for (Map.Entry<String, ArrayList<he>> entry : hashMap.entrySet()) {
            try {
                ArrayList<he> value = entry.getValue();
                if (value != null && value.size() != 0) {
                    gzVar.a(value, value.get(0).k, entry.getKey());
                }
            } catch (Exception unused) {
            }
        }
    }
}
