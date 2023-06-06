package com.meituan.mmp.lib.api;

import com.meituan.mmp.lib.model.Event;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b implements IApiCallback {
    public static ChangeQuickRedirect a;
    private IApiCallback b;

    public b(IApiCallback iApiCallback) {
        Object[] objArr = {iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b272fdbba2597491c0ee394385fc8416", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b272fdbba2597491c0ee394385fc8416");
        } else {
            this.b = iApiCallback;
        }
    }

    @Override // com.meituan.mmp.main.IApiCallback
    public Event getEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32b80d8962781c7de7c23a9197ec3dfa", RobustBitConfig.DEFAULT_VALUE) ? (Event) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32b80d8962781c7de7c23a9197ec3dfa") : this.b.getEvent();
    }

    @Override // com.meituan.mmp.main.IApiCallback
    public void onSuccess(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0179d0f48d476340e8a51c607252a18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0179d0f48d476340e8a51c607252a18");
        } else {
            this.b.onSuccess(jSONObject);
        }
    }

    @Override // com.meituan.mmp.main.IApiCallback
    @Deprecated
    public void onFail() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "036bfe17cb6aa5056c41a5127ce8a277", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "036bfe17cb6aa5056c41a5127ce8a277");
        } else {
            this.b.onFail();
        }
    }

    @Override // com.meituan.mmp.main.IApiCallback
    public void onFail(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "775b9fc0fe6dc150565622ac6c696c49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "775b9fc0fe6dc150565622ac6c696c49");
        } else {
            this.b.onFail(jSONObject);
        }
    }

    @Override // com.meituan.mmp.main.IApiCallback
    public void onCancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f452a36a305ba37c5b2404d118b7c61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f452a36a305ba37c5b2404d118b7c61");
        } else {
            this.b.onCancel();
        }
    }
}
