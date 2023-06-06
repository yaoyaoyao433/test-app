package com.sankuai.waimai.irmo.render.bean.layers;

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
public class IrmoLayerGroup implements IJSONArrayParser {
    private static final String TAG = "IrmoLayerGroup_Irmo";
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<IrmoLayerInfo> mLayerInfos;

    public IrmoLayerGroup() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27224a47a49e13e431e92eb282986b74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27224a47a49e13e431e92eb282986b74");
        } else {
            this.mLayerInfos = new ArrayList();
        }
    }

    @Override // com.sankuai.waimai.irmo.render.bean.IJSONArrayParser
    public boolean parse(@Nullable JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9f0d52b5cb05bb5c7638018f33b7da0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9f0d52b5cb05bb5c7638018f33b7da0")).booleanValue();
        }
        if (jSONArray == null) {
            return false;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                IrmoLayerInfo irmoLayerInfo = new IrmoLayerInfo();
                if (!irmoLayerInfo.parse(jSONObject)) {
                    return false;
                }
                if (!irmoLayerInfo.engineIsOff) {
                    this.mLayerInfos.add(irmoLayerInfo);
                }
            } catch (JSONException e) {
                a.a(TAG, "IrmoLayerGroup parse fail", e);
                return false;
            }
        }
        return true;
    }

    public List<IrmoLayerInfo> getLayers() {
        return this.mLayerInfos;
    }
}
