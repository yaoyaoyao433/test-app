package com.sankuai.waimai.business.address.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static List<com.sankuai.waimai.business.address.model.b> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8ec0d9f77d7531e349cbc47f24b6d2b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8ec0d9f77d7531e349cbc47f24b6d2b");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                com.sankuai.waimai.business.address.model.b bVar = new com.sankuai.waimai.business.address.model.b();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                bVar.b = jSONObject.optString("address_key");
                bVar.a(jSONObject.optLong("address_update_time"));
                arrayList.add(bVar);
            }
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return arrayList;
    }

    public static String a(List<com.sankuai.waimai.business.address.model.b> list) {
        int size;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be138d60cf5437a244ae4afa82dafb2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be138d60cf5437a244ae4afa82dafb2a");
        }
        if (!com.sankuai.waimai.foundation.utils.b.b(list) && (size = list.size()) > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = new JSONObject();
                com.sankuai.waimai.business.address.model.b bVar = list.get(i);
                try {
                    jSONObject.put("address_key", bVar.b);
                    jSONObject.put("address_update_time", bVar.c);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                }
            }
            return jSONArray.toString();
        }
        return "";
    }

    public static List<com.sankuai.waimai.business.address.model.b> a(List<com.sankuai.waimai.business.address.model.b> list, int i) {
        Object[] objArr = {list, 4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c21a0455301e6251e3578b3096dc375", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c21a0455301e6251e3578b3096dc375");
        }
        if (com.sankuai.waimai.foundation.utils.b.b(list)) {
            return list;
        }
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "15572f20bdbad7b182ad1f01e40e7f2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "15572f20bdbad7b182ad1f01e40e7f2a");
        } else {
            Collections.sort(list, new Comparator<com.sankuai.waimai.business.address.model.b>() { // from class: com.sankuai.waimai.business.address.util.b.1
                public static ChangeQuickRedirect a;

                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(com.sankuai.waimai.business.address.model.b bVar, com.sankuai.waimai.business.address.model.b bVar2) {
                    Object[] objArr3 = {bVar, bVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9d628a0833a738fe750d44ed0ff156e1", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9d628a0833a738fe750d44ed0ff156e1")).intValue();
                    }
                    try {
                        int i2 = (bVar.c > bVar2.c ? 1 : (bVar.c == bVar2.c ? 0 : -1));
                        if (i2 > 0) {
                            return -1;
                        }
                        return i2 < 0 ? 1 : 0;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return 0;
                    }
                }
            });
        }
        for (int size = list.size(); size > 4; size--) {
            list.remove(list.size() - 1);
        }
        return list;
    }

    public static void a(List<com.sankuai.waimai.business.address.model.b> list, com.sankuai.waimai.business.address.model.b bVar) {
        boolean z = false;
        Object[] objArr = {list, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a52e99c4cbd90e5c45319f3a04187fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a52e99c4cbd90e5c45319f3a04187fc");
        } else if (list == null || bVar == null) {
        } else {
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                com.sankuai.waimai.business.address.model.b bVar2 = list.get(i);
                if (bVar.b.equals(bVar2.b)) {
                    bVar2.a(bVar.c);
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return;
            }
            list.add(bVar);
        }
    }
}
