package com.sankuai.waimai.irmo.render.bean.assets;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.irmo.render.bean.IJSONObjectParser;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class IrmoAssetInfo implements IJSONObjectParser {
    private static final String DSL_ASSETS_ID = "id";
    private static final String DSL_ASSETS_PATH = "path";
    private static final String DSL_ASSETS_TYPE = "type";
    private static final String DSL_ASSETS_URL = "url";
    private static final String TAG = "IrmoAssetInfo_Irmo";
    public static ChangeQuickRedirect changeQuickRedirect;
    public String id;
    public String path;
    public String type;
    public String url;

    @Override // com.sankuai.waimai.irmo.render.bean.IJSONObjectParser
    public boolean parse(@Nullable JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "616b41368fa80b5f69fc63bbd1018435", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "616b41368fa80b5f69fc63bbd1018435")).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            this.id = jSONObject.getString("id");
            this.type = jSONObject.getString("type");
            this.path = jSONObject.getString("path");
            this.url = jSONObject.getString("url");
            return true;
        } catch (JSONException e) {
            a.a(TAG, "IrmoAssetInfo parse fail", e);
            return false;
        }
    }
}
