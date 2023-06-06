package com.meituan.android.ptcommonim.cardrender;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.q;
import com.meituan.android.ptcommonim.cardrender.model.MachData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.common.utils.JsonHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private final q b;
    private Map<String, List<MachData.Data.Template>> c;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "046650135af1ee039a197feffa118435", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "046650135af1ee039a197feffa118435");
            return;
        }
        this.c = new HashMap();
        this.b = q.a(context, "ptcommonim");
    }

    public final synchronized void a(MachData.Data data, String str) {
        Object[] objArr = {data, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bad7c4d13c1e9d65a1bd4232778bfed4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bad7c4d13c1e9d65a1bd4232778bfed4");
            return;
        }
        Map<String, List<MachData.Data.Template>> a2 = a();
        if (data != null && !CollectionUtils.isEmpty(data.platformTemplateList)) {
            a2.put(str, data.platformTemplateList);
        }
        a(a2);
    }

    public final synchronized void a(MachData.Data data) {
        Map<String, List<MachData.Data.Template>> map;
        Object[] objArr = {data};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a9a8946927298b502ed08bdcf83fde8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a9a8946927298b502ed08bdcf83fde8");
            return;
        }
        Object[] objArr2 = {data};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0b7b34bd3b1393363a2463764a59c8b", RobustBitConfig.DEFAULT_VALUE)) {
            map = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0b7b34bd3b1393363a2463764a59c8b");
        } else {
            HashMap hashMap = new HashMap();
            if (data != null && !CollectionUtils.isEmpty(data.platformTemplateList)) {
                for (MachData.Data.Template template : data.platformTemplateList) {
                    if (template != null) {
                        String transformKey = template.getTransformKey();
                        List<MachData.Data.Template> list = hashMap.get(transformKey);
                        if (list == null) {
                            list = new ArrayList<>();
                        }
                        list.add(template);
                        hashMap.put(transformKey, list);
                    }
                }
            }
            map = hashMap;
        }
        a(map);
    }

    private synchronized void a(Map<String, List<MachData.Data.Template>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f98d5a37dbdc4284d5a3741bf3c9babd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f98d5a37dbdc4284d5a3741bf3c9babd");
            return;
        }
        this.c = map;
        this.b.a("platformTemplateList", JsonHelper.toJsonString(this.c));
    }

    public final synchronized Map<String, List<MachData.Data.Template>> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c71297d0d72a288f8a01bdfb8a6b912a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c71297d0d72a288f8a01bdfb8a6b912a");
        }
        try {
            if (this.c.isEmpty()) {
                Map<String, List<MachData.Data.Template>> map = (Map) com.sankuai.meituan.model.a.a().b().fromJson(this.b.b("platformTemplateList", ""), new TypeToken<Map<String, List<MachData.Data.Template>>>() { // from class: com.meituan.android.ptcommonim.cardrender.a.1
                }.getType());
                if (map != null) {
                    this.c = map;
                }
            }
        } catch (Exception unused) {
        }
        return this.c;
    }
}
