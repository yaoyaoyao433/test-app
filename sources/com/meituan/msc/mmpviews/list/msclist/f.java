package com.meituan.msc.mmpviews.list.msclist;

import android.text.TextUtils;
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
public abstract class f {
    public static ChangeQuickRedirect b;
    protected f c;
    protected List<f> d;
    protected JSONObject e;
    public String f;
    protected int g;

    public abstract void a(MSCListNode mSCListNode, a aVar);

    public f(JSONObject jSONObject, f fVar, String str) {
        Object[] objArr = {jSONObject, fVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94255a15cc228e297787acc8412f8401", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94255a15cc228e297787acc8412f8401");
            return;
        }
        this.c = fVar;
        this.f = str;
        this.g = com.meituan.msc.mmpviews.list.common.b.a();
        try {
            this.e = jSONObject.getJSONObject("props");
            this.d = a(jSONObject, this);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static List<f> a(JSONObject jSONObject, f fVar) throws JSONException {
        Object[] objArr = {jSONObject, fVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6807e2b22a9c3bdb5038e30b5ecbc58", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6807e2b22a9c3bdb5038e30b5ecbc58");
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                if (TextUtils.equals("MSCListExpression", jSONObject2.getString(MSCListNode.MODULE_NAME))) {
                    arrayList.add(new d(jSONObject2, fVar, fVar.f));
                } else {
                    arrayList.add(new g(jSONObject2, fVar, fVar.f));
                }
            }
            return arrayList;
        }
        return null;
    }

    public JSONObject b(MSCListNode mSCListNode, a aVar) {
        Object[] objArr = {mSCListNode, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e75c16fb4b0014346f5b82e848f4bf69", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e75c16fb4b0014346f5b82e848f4bf69") : com.meituan.msc.mmpviews.list.common.a.a(this.e, aVar, mSCListNode.templateNode.f);
    }
}
