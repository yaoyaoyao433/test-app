package com.sankuai.waimai.alita.core.base.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    @Nullable
    public static JSONObject a(@Nullable JSONObject jSONObject, @Nullable com.sankuai.waimai.alita.core.feature.d dVar) {
        Iterator<String> it;
        Object[] objArr = {jSONObject, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        JSONObject jSONObject2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4311252682449690d67ce598d168711e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4311252682449690d67ce598d168711e");
        }
        if (dVar != null && jSONObject != null) {
            jSONObject2 = new JSONObject();
            List<String> a2 = a(dVar.d);
            if (!a2.isEmpty() && "*".equals(a2.get(0))) {
                it = jSONObject.keys();
            } else {
                it = a2.iterator();
            }
            while (it.hasNext()) {
                String next = it.next();
                if (!TextUtils.isEmpty(next)) {
                    try {
                        jSONObject2.put(next, jSONObject.opt(next));
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return jSONObject2;
    }

    @NonNull
    public static List<String> a(String str) {
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8563870df24bd75d4f412af6fa89717", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8563870df24bd75d4f412af6fa89717");
        }
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        String[] split = str.split(CommonConstant.Symbol.COMMA);
        if (split.length == 0) {
            return arrayList;
        }
        while (true) {
            if (i >= split.length) {
                break;
            }
            String trim = split[i].trim();
            if ("*".equals(trim)) {
                arrayList.clear();
                arrayList.add("*");
                break;
            }
            arrayList.add(trim);
            i++;
        }
        return arrayList;
    }

    public static String a(@Nullable Object obj) {
        boolean z = true;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed7e37fcd3df17ecadb51b55406e00e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed7e37fcd3df17ecadb51b55406e00e7");
        }
        if (!(obj instanceof List)) {
            return obj != null ? obj.toString() : StringUtil.NULL;
        }
        List list = (List) obj;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "22f41b3de2452760a29478a44e8da0ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "22f41b3de2452760a29478a44e8da0ff");
        }
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (Object obj2 : list) {
                if (z) {
                    sb.append(obj2);
                    z = false;
                } else {
                    sb.append(", ");
                    sb.append(obj2);
                }
            }
            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            return sb.toString();
        }
        return StringUtil.NULL;
    }

    public static String a(@Nullable Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92fd9ace956a4329db73206a7d6b0564", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92fd9ace956a4329db73206a7d6b0564") : a(exc, StringUtil.NULL);
    }

    public static String a(@Nullable Exception exc, @NonNull String str) {
        Object[] objArr = {exc, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48e11c09d4055784b964e29ae71c2796", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48e11c09d4055784b964e29ae71c2796") : exc == null ? str : exc.toString();
    }
}
