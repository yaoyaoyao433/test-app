package com.sankuai.waimai.alita;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.feature.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a implements com.sankuai.waimai.alita.base.c<String>, h {
    public static ChangeQuickRedirect c;

    public abstract List<String> a();

    /* JADX WARN: Can't rename method to resolve collision */
    @Deprecated
    public JSONObject a(@NonNull String str) {
        return null;
    }

    public void d() {
    }

    @Override // com.sankuai.waimai.alita.base.c
    public final /* synthetic */ boolean a(String str) {
        List<String> a;
        String str2 = str;
        Object[] objArr = {str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d7260a705d105c589c8fe2e149944cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d7260a705d105c589c8fe2e149944cc")).booleanValue();
        }
        if (!TextUtils.isEmpty(str2) && (a = a()) != null) {
            for (String str3 : a) {
                if (str3 != null && TextUtils.equals(str3, str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> JSONArray a(List<T> list, int i) {
        Object[] objArr = {list, Integer.MAX_VALUE};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "052e3f1a9f5cd56e1743f1dc02bb6647", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "052e3f1a9f5cd56e1743f1dc02bb6647");
        }
        JSONArray jSONArray = new JSONArray();
        if (list != null && !list.isEmpty()) {
            List a = a((List) list);
            int size = list.size() > Integer.MAX_VALUE ? a.size() - Integer.MAX_VALUE : 0;
            for (int size2 = a.size() - 1; size2 >= size; size2--) {
                jSONArray.put(a.get(size2));
            }
        }
        return jSONArray;
    }

    private static <T> List<T> a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1899ed0db02039a059620a8ac67cbfe9", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1899ed0db02039a059620a8ac67cbfe9");
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (hashSet.add(t)) {
                arrayList.add(t);
            }
        }
        hashSet.clear();
        list.clear();
        list.addAll(arrayList);
        return list;
    }
}
