package com.dianping.picasso;

import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.Value;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.picasso.creator.PicassoSizeToFitInterface;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.model.PicassoValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SizeToFitListJavaScriptInterface extends JavaScriptInterface {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.jscore.JavaScriptInterface
    public Value exec(Value[] valueArr) {
        PicassoModel[] picassoModelArr;
        Object[] objArr = {valueArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61de6f68113ba81430b192a361d1e58e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61de6f68113ba81430b192a361d1e58e");
        }
        JSONObject jSONObject = new JSONObject();
        PicassoValue picassoValue = new PicassoValue(valueArr[0]);
        if (picassoValue.isArray()) {
            PicassoModel[] picassoModelArr2 = new PicassoModel[0];
            try {
                for (PicassoModel picassoModel : (PicassoModel[]) picassoValue.array(PicassoModel.PICASSO_DECODER)) {
                    if (picassoModel instanceof PicassoSizeToFitInterface) {
                        jSONObject.put(((PicassoSizeToFitInterface) picassoModel).sizeKey(), ((PicassoSizeToFitInterface) picassoModel).calculateSize());
                    }
                }
            } catch (ArchiveException | JSONException e) {
                e.printStackTrace();
                return new Value();
            }
        }
        return new Value(jSONObject);
    }
}
