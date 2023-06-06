package com.dianping.picasso;

import android.content.Context;
import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.Value;
import com.dianping.jscore.model.Encoding;
import com.dianping.picasso.creator.BaseViewWrapper;
import com.dianping.picasso.creator.PicassoSizeToFitInterface;
import com.dianping.picasso.model.PicassoModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class Picasso implements Encoding {
    public static ChangeQuickRedirect changeQuickRedirect;
    public JavaScriptInterface sizeToFitFunction;

    public Picasso(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8946b2447d1f5271eb17c785c36228bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8946b2447d1f5271eb17c785c36228bb");
        } else if (context == null) {
        } else {
            this.sizeToFitFunction = new JavaScriptInterface() { // from class: com.dianping.picasso.Picasso.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.jscore.JavaScriptInterface
                public Value exec(Value[] valueArr) {
                    Object[] objArr2 = {valueArr};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bb191222e7c30070ff0558ded38696b6", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Value) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bb191222e7c30070ff0558ded38696b6");
                    }
                    try {
                        PicassoModel valueToModel = PicassoUtils.valueToModel(valueArr[0]);
                        if (valueToModel instanceof PicassoSizeToFitInterface) {
                            return new Value(((PicassoSizeToFitInterface) valueToModel).calculateSize());
                        }
                        return new Value(BaseViewWrapper.DEFAULT_SIZE);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return new Value(BaseViewWrapper.DEFAULT_SIZE);
                    }
                }
            };
        }
    }

    @Override // com.dianping.jscore.model.Encoding
    public JSONObject encode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee90120312688b6ec463b99870d72e39", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee90120312688b6ec463b99870d72e39") : new JSONObject();
    }

    @Override // com.dianping.jscore.model.Encoding
    public String[] getFunctionNames() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30db35b370d0f56dd6b10aea612341c1", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30db35b370d0f56dd6b10aea612341c1") : new String[]{"size_for_text"};
    }

    @Override // com.dianping.jscore.model.Encoding
    public JavaScriptInterface[] getFunctions() {
        return new JavaScriptInterface[]{this.sizeToFitFunction};
    }
}
