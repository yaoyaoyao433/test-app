package com.dianping.titansadapter;

import android.content.Intent;
import com.dianping.titans.js.IJSHandlerDelegate;
import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titansmodel.g;
import com.dianping.titansmodel.h;
import com.meituan.robust.ChangeQuickRedirect;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class AbstractJSBPerformer implements IJSBPerformer {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titansadapter.IJSBPerformer
    public void getLocation(JSONObject jSONObject, IJSHandlerDelegate<JsBridgeResult> iJSHandlerDelegate) {
    }

    @Override // com.dianping.titansadapter.IJSBPerformer
    public boolean isCommonSupported(int i) {
        return true;
    }

    @Override // com.dianping.titansadapter.IJSBPerformer
    public boolean isPerformerApiSupported(int i) {
        return false;
    }

    @Override // com.dianping.titansadapter.IJSBPerformer
    public void onActivityResult(String str, int i, int i2, Intent intent, IJSHandlerDelegate<? extends g> iJSHandlerDelegate) {
    }

    @Override // com.dianping.titansadapter.IJSBPerformer
    public void onPerform(int i, JSONObject jSONObject, IJSHandlerDelegate<JsBridgeResult> iJSHandlerDelegate) {
    }

    @Override // com.dianping.titansadapter.IJSBPerformer
    public void shareImage(JSONObject jSONObject, IJSHandlerDelegate<h> iJSHandlerDelegate) {
    }

    @Override // com.dianping.titansadapter.IJSBPerformer
    public void stopLocating() {
    }
}
