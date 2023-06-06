package com.meituan.ai.speech.sdk.knb;

import android.support.annotation.Keep;
import com.dianping.titansmodel.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/meituan/ai/speech/sdk/knb/JsResult;", "DataType", "Lcom/dianping/titansmodel/TTResult;", "()V", "data", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "writeToJSON", "", "obj", "Lorg/json/JSONObject;", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class JsResult<DataType> extends g {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Keep
    @Nullable
    private DataType data;

    @Nullable
    public final DataType getData() {
        return this.data;
    }

    public final void setData(@Nullable DataType datatype) {
        this.data = datatype;
    }

    @Override // com.dianping.titansmodel.g
    public final void writeToJSON(@Nullable JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2514c98f6c47073033d390a3b793c5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2514c98f6c47073033d390a3b793c5d");
            return;
        }
        super.writeToJSON(jSONObject);
        if (jSONObject != null) {
            jSONObject.put("data", this.data);
        }
    }
}
