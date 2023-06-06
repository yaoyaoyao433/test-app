package com.sankuai.waimai.irmo.render.bean.assets;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.irmo.render.bean.IJSONArrayParser;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class IrmoAssetGroup implements IJSONArrayParser {
    private static final String TAG = "IrmoAssetGroup_Irmo";
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<IrmoAssetInfo> mAssets;

    public IrmoAssetGroup() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7877fb07d7b93b1cb1f550d842184537", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7877fb07d7b93b1cb1f550d842184537");
        } else {
            this.mAssets = new ArrayList();
        }
    }

    @Override // com.sankuai.waimai.irmo.render.bean.IJSONArrayParser
    public boolean parse(@Nullable JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86f07fd3d9d4b018242378915f7868a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86f07fd3d9d4b018242378915f7868a5")).booleanValue();
        }
        if (jSONArray == null) {
            return true;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                IrmoAssetInfo irmoAssetInfo = new IrmoAssetInfo();
                if (!irmoAssetInfo.parse(jSONObject)) {
                    return false;
                }
                this.mAssets.add(irmoAssetInfo);
            } catch (JSONException e) {
                a.a(TAG, "IrmoAssetGroup parse fail", e);
                return false;
            }
        }
        return true;
    }

    public List<IrmoAssetInfo> getAssets() {
        return this.mAssets;
    }
}
