package com.meituan.msc.mmpviews.list.expression;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Pattern f = Pattern.compile("(__msc_list_index__)((\\d)+)");
    public String b;
    public Object c;
    public Object d;
    public Object e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "065f395d29e6dc748632fd68acb1f1ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "065f395d29e6dc748632fd68acb1f1ae");
            return;
        }
        this.c = null;
        this.d = null;
        this.e = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03de, code lost:
        if (r3.equals("<=") != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x045c, code lost:
        if (r3.equals("<=") != false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0517  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meituan.msc.mmpviews.list.expression.b a(org.json.JSONObject r26, int[] r27) {
        /*
            Method dump skipped, instructions count: 1610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.list.expression.a.a(org.json.JSONObject, int[]):com.meituan.msc.mmpviews.list.expression.b");
    }

    private b b(JSONObject jSONObject, int[] iArr) {
        Object[] objArr = {jSONObject, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "170110e13d4800a660be11eb462e6d10", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "170110e13d4800a660be11eb462e6d10");
        }
        b bVar = new b();
        bVar.d = "";
        if (this.c instanceof List) {
            List list = (List) this.c;
            for (int i = 0; i < list.size(); i++) {
                if (!(list.get(i) instanceof a)) {
                    throw new IllegalArgumentException("only expression can be in list");
                }
                bVar.d += com.meituan.msc.mmpviews.list.common.a.a(((a) list.get(i)).a(jSONObject, iArr));
            }
        }
        return bVar;
    }

    public static a a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "edbde2bf27d89dc6536657abff35504d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "edbde2bf27d89dc6536657abff35504d");
        }
        a aVar = new a();
        try {
            aVar.b = jSONObject.getString("type");
            aVar.c = a(jSONObject.get("param1"));
            if (jSONObject.has("param2")) {
                aVar.d = a(jSONObject.get("param2"));
            }
            if (jSONObject.has("param3")) {
                aVar.e = a(jSONObject.get("param3"));
            }
            return aVar;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    private static Object a(Object obj) throws JSONException {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90c3c497e786aaaeeea11cbb1e47ab00", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90c3c497e786aaaeeea11cbb1e47ab00");
        }
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < jSONArray.length(); i++) {
                linkedList.add(a((JSONObject) jSONArray.get(i)));
            }
            return linkedList;
        }
        return obj;
    }

    private static b a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "056cc527a492dfc156f835455a659162", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "056cc527a492dfc156f835455a659162");
        }
        b bVar2 = new b();
        bVar2.b = 2;
        if (bVar.b == 1) {
            bVar2.d = bVar.c ? "true" : "false";
        } else if (bVar.b != 3 && bVar.b == 4) {
            throw new IllegalArgumentException("Can't convert object to string");
        } else {
            bVar2.d = bVar.d;
        }
        return bVar2;
    }

    private static double b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5befde153db4d4ea88b88b50f128585", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5befde153db4d4ea88b88b50f128585")).doubleValue();
        }
        if (bVar.b == 1) {
            return bVar.c ? 1.0d : 0.0d;
        } else if (bVar.b != 3 && bVar.b == 4) {
            throw new IllegalArgumentException("Can't convert object to integer");
        } else {
            return Double.parseDouble(bVar.d);
        }
    }

    private static b c(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d228456b72d77a101a320ce82c7441cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d228456b72d77a101a320ce82c7441cb");
        }
        b bVar2 = new b();
        bVar2.b = 1;
        if (bVar.b == 0) {
            bVar2.c = false;
        } else if (bVar.b == 3) {
            bVar2.c = com.meituan.msc.mmpviews.list.common.a.a(bVar.d);
        } else if (bVar.b == 2) {
            bVar2.c = !TextUtils.equals("0", bVar.d);
        } else if (bVar.b == 4) {
            bVar2.c = true;
        } else {
            bVar2.c = bVar.c;
        }
        return bVar2;
    }

    private static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3079dd130f0f47c0137b9a8850a75a9d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3079dd130f0f47c0137b9a8850a75a9d")).intValue();
        }
        Matcher matcher = f.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(2));
        }
        throw new IllegalArgumentException("can't match index from expression");
    }
}
