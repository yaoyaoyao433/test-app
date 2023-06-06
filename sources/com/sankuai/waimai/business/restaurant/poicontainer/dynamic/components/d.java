package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends a<LinearLayout> {
    public static ChangeQuickRedirect i;

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "915281cd83aa6ebe94a25c9cd2b06de5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "915281cd83aa6ebe94a25c9cd2b06de5");
        } else {
            this.b = new LinearLayout(context);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4645878df27332c40b7eb864fc34ed6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4645878df27332c40b7eb864fc34ed6");
            return;
        }
        super.a(jSONObject);
        ((LinearLayout) this.b).setOrientation(0);
        ((LinearLayout) this.b).setHorizontalGravity(16);
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void b(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07992416cb51e20f1031b51cbea79eeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07992416cb51e20f1031b51cbea79eeb");
        } else {
            super.b(jSONObject);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8b89fd8188e718794a6753a48abc75c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8b89fd8188e718794a6753a48abc75c");
        } else if (aVar == null || aVar.a() == null) {
        } else {
            this.f.add(aVar);
            if (this.b instanceof ViewGroup) {
                ((ViewGroup) this.b).addView(aVar.a(), new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) aVar.a().getLayoutParams()));
                aVar.b(this);
            }
        }
    }
}
