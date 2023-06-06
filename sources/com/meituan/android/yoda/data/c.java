package com.meituan.android.yoda.data;

import android.text.TextUtils;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    private static String c = "c";
    private static final Pattern d = Pattern.compile(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR);
    private static final Pattern e = Pattern.compile(CommonConstant.Symbol.COMMA);
    public ArrayList<ArrayList<Integer>> b;
    private List<a> f;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public int a;
        public String b;
        public String c;
        public boolean d;
    }

    private c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89444cb14d9211840fc8929c7507f76a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89444cb14d9211840fc8929c7507f76a");
            return;
        }
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>(8);
        this.b = arrayList;
        a(str, arrayList);
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16ddcbc397a7c6c8e5567d5d1c891514", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16ddcbc397a7c6c8e5567d5d1c891514");
        }
        return "TypeChecker{originTypeList=" + this.b + '}' + super.toString();
    }

    public static c a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5948e9847f0a575d1fc038575924a1b6", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5948e9847f0a575d1fc038575924a1b6") : new c(str);
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a3335a1df63b1754e3522ff62311f2e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a3335a1df63b1754e3522ff62311f2e")).intValue() : this.b.size();
    }

    public final ArrayList<Integer> a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b3c4dbf8591d9d74452363dc88e98ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b3c4dbf8591d9d74452363dc88e98ae");
        }
        if (i > a() - 1) {
            return null;
        }
        return this.b.get(i);
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2fdac59f12b76a0c262f7de182d26c1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2fdac59f12b76a0c262f7de182d26c1")).booleanValue() : a() <= 1 && a(0).size() <= 1;
    }

    public boolean a(ArrayList<ArrayList<Integer>> arrayList, int i) {
        Object[] objArr = {arrayList, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c70f71daa223f94ef60a2932ed483c9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c70f71daa223f94ef60a2932ed483c9")).booleanValue();
        }
        Iterator<ArrayList<Integer>> it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator<Integer> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (it2.next().intValue() == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ad95143d16fbbd899314366adddf445", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ad95143d16fbbd899314366adddf445");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, new JSONObject(jSONObject.get(next).toString()));
                }
                ArrayList arrayList = new ArrayList();
                Iterator<String> keys2 = jSONObject.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    a aVar = new a();
                    aVar.a = Integer.parseInt(next2);
                    aVar.b = jSONObject.getJSONObject(next2).getString("desc");
                    aVar.c = jSONObject.getJSONObject(next2).getString("name");
                    aVar.d = d.a(aVar.a);
                    arrayList.add(aVar);
                }
                this.f = arrayList;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final String a(List<Integer> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce6334f38f33e8efc9f09d8007f2e87d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce6334f38f33e8efc9f09d8007f2e87d");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                sb.append(b(list.get(i).intValue()));
            } else {
                sb.append('+');
                sb.append(b(list.get(i).intValue()));
            }
        }
        return sb.toString();
    }

    private String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "776799bf01cc56236ace205af8597209", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "776799bf01cc56236ace205af8597209");
        }
        for (a aVar : this.f) {
            if (aVar.a == i) {
                return aVar.b;
            }
        }
        return "";
    }

    private void a(String str, ArrayList<ArrayList<Integer>> arrayList) {
        String[] split;
        Object[] objArr = {str, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49973893f403de38ba13062382ed2c82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49973893f403de38ba13062382ed2c82");
        } else if (!TextUtils.isEmpty(str)) {
            for (String str2 : d.split(str.trim())) {
                if (!TextUtils.isEmpty(str2)) {
                    ArrayList<Integer> arrayList2 = new ArrayList<>(4);
                    b(str2, arrayList2);
                    arrayList.add(arrayList2);
                }
            }
        }
    }

    private void b(String str, ArrayList<Integer> arrayList) {
        Object[] objArr = {str, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4afc87ba3787817690024ae456676cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4afc87ba3787817690024ae456676cd");
            return;
        }
        for (String str2 : e.split(str.trim())) {
            arrayList.add(Integer.valueOf(x.a(str2)));
        }
    }
}
