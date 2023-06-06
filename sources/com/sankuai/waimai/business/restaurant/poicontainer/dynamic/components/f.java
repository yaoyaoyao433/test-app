package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends a<TagCanvasView> {
    public static ChangeQuickRedirect i;
    public com.sankuai.waimai.platform.widget.tag.virtualtag.g j;

    public f(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af43627586987ca33cdb176c493eea42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af43627586987ca33cdb176c493eea42");
        } else {
            this.b = new TagCanvasView(this.c);
        }
    }

    public f(Context context, TagCanvasView tagCanvasView) {
        super(context);
        Object[] objArr = {context, tagCanvasView};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8931344d9fa2f384867bb4fbd89ea759", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8931344d9fa2f384867bb4fbd89ea759");
        } else {
            this.b = tagCanvasView;
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ff7a0fe18bdad273f0c943db2010a7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ff7a0fe18bdad273f0c943db2010a7f");
            return;
        }
        super.a(jSONObject);
        if (jSONObject == null || this.b == 0) {
            return;
        }
        ((TagCanvasView) this.b).setMaxLines(jSONObject.optInt("max_lines", 1));
        ((TagCanvasView) this.b).setTagSpace(com.sankuai.waimai.foundation.utils.g.a(this.c, (float) jSONObject.optDouble("tag_space", 4.0d)));
        ((TagCanvasView) this.b).setLineSpace(com.sankuai.waimai.foundation.utils.g.a(this.c, (float) jSONObject.optDouble("line_space", 4.0d)));
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void b(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bb538a5fd8823ca47acdbadb26bef22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bb538a5fd8823ca47acdbadb26bef22");
        } else if (jSONObject == null || this.b == 0) {
        } else {
            String optString = jSONObject.optString("tags", "");
            if (TextUtils.isEmpty(optString)) {
                a(8);
                return;
            }
            Object[] objArr2 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = i;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e42177433c97117f751370a5cb953e9e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e42177433c97117f751370a5cb953e9e");
            } else if (jSONObject != null) {
                if (jSONObject.has("max_lines")) {
                    ((TagCanvasView) this.b).setMaxLines(jSONObject.optInt("max_lines"));
                }
                if (jSONObject.has("tag_space")) {
                    ((TagCanvasView) this.b).setTagSpace(com.sankuai.waimai.foundation.utils.g.a(this.c, (float) jSONObject.optDouble("tag_space")));
                }
                if (jSONObject.has("line_space")) {
                    ((TagCanvasView) this.b).setLineSpace(com.sankuai.waimai.foundation.utils.g.a(this.c, (float) jSONObject.optDouble("line_space")));
                }
            }
            List<com.sankuai.waimai.platform.widget.tag.model.d> a = com.sankuai.waimai.platform.widget.tag.util.a.a(this.c, (List) k.a().fromJson(optString, new TypeToken<List<com.sankuai.waimai.platform.widget.tag.api.d>>() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.f.1
            }.getType()));
            if (this.j == null) {
                this.j = new com.sankuai.waimai.platform.widget.tag.virtualtag.g(this.c, a);
                ((TagCanvasView) this.b).setAdapter(this.j);
            } else {
                this.j.b(a);
                this.j.notifyChanged();
            }
            super.b(jSONObject);
        }
    }
}
