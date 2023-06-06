package com.meituan.msc.mmpviews.list.msclist.data;

import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public List<a> b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public JSONObject a;
        public String b;
        public boolean c;
        public JSONObject d;

        public a(JSONObject jSONObject, String str) {
            this.a = jSONObject;
            this.b = str;
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08407b4f530fe40dab920d1ad1fb361e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08407b4f530fe40dab920d1ad1fb361e");
        } else {
            this.b = new ArrayList();
        }
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9a101d780c49fd5f058ef843c79d08d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9a101d780c49fd5f058ef843c79d08d")).intValue();
        }
        if (this.b != null) {
            return this.b.size();
        }
        return 0;
    }

    public final a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75371fcc0c8920cde28329d2ab122aea", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75371fcc0c8920cde28329d2ab122aea");
        }
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return this.b.get(i);
    }

    public final int a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0df6571be9996724f844b6fa717b0e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0df6571be9996724f844b6fa717b0e2")).intValue();
        }
        if (aVar == null) {
            return -1;
        }
        return this.b.indexOf(aVar);
    }

    public final com.meituan.msc.mmpviews.list.msclist.data.a a(int i, JSONArray jSONArray) throws JSONException {
        Object[] objArr = {Integer.valueOf(i), jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5eeb43214763fde55d85cad1e3612f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.mmpviews.list.msclist.data.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5eeb43214763fde55d85cad1e3612f5");
        }
        com.meituan.msc.mmpviews.list.msclist.data.a aVar = new com.meituan.msc.mmpviews.list.msclist.data.a();
        if (jSONArray == null) {
            return aVar;
        }
        if (i < 0) {
            i = 0;
        }
        int length = jSONArray.length();
        int a2 = a();
        if (i > a2) {
            i = a2;
        }
        aVar.b = i;
        aVar.c = length;
        if (a2 == 0 || this.b == null) {
            this.b = new ArrayList();
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            this.b.add(aVar.b + i2, new a(optJSONObject, optJSONObject.optString("itemType")));
        }
        return aVar;
    }

    public final boolean a(int i, JSONObject jSONObject) {
        Object[] objArr = {Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcc140cb2ad51fea2e648c517315b3bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcc140cb2ad51fea2e648c517315b3bd")).booleanValue();
        }
        if (this.b == null || jSONObject == null) {
            g.a("[DataSection@updateItemData]", "items or data is null while updateItem");
            return false;
        }
        int a2 = a();
        if (i < 0 || i >= a2) {
            g.d("[DataManager@update] error, index out of range, total " + a2 + ", index: " + i);
            return false;
        }
        a aVar = this.b.get(i);
        if (aVar == null) {
            return false;
        }
        aVar.a = jSONObject;
        aVar.b = jSONObject.optString("itemType");
        return true;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbcbbc1ac01afac1f6c2ec3f346d25a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbcbbc1ac01afac1f6c2ec3f346d25a6");
        } else if (this.b == null || i2 == 0) {
            g.a("[DataSection@removeItems]", "items is null while removeItems");
        } else {
            if (i < 0) {
                i = 0;
            }
            int a2 = a();
            if (i > a2) {
                i = a2;
            }
            if (i2 > a2) {
                i2 = a2;
            }
            int i3 = a2 - i;
            if (i2 > i3) {
                i2 = i3;
            }
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < this.b.size(); i4++) {
                if (i4 >= i && i4 < i + i2) {
                    arrayList.add(this.b.get(i4));
                }
            }
            this.b.removeAll(arrayList);
        }
    }
}
