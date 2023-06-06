package com.sankuai.mesh.core;

import android.content.Context;
import android.content.Intent;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mesh.bean.MeshBaseUrl;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class c {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Context mContext;
    protected a mIMeshApiCallBack;
    protected MeshBaseUrl mMeshBaseUrl;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(MeshBaseUrl meshBaseUrl);
    }

    public boolean consumeActivityResult() {
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void callBackOk(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edaca46bed8af475dd756e5b72661309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edaca46bed8af475dd756e5b72661309");
        } else {
            callBackOk(com.sankuai.mesh.util.c.a(str));
        }
    }

    public void callBackOk(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d10bec75ce0ac37cb86f218de5cc7cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d10bec75ce0ac37cb86f218de5cc7cb");
            return;
        }
        this.mMeshBaseUrl.setData(jsonObject);
        this.mIMeshApiCallBack.a(com.sankuai.mesh.util.e.a(this.mMeshBaseUrl, true, jsonObject));
    }

    public void callBackError(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36beefa2ca40213540582121b687def3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36beefa2ca40213540582121b687def3");
        } else {
            callBackError(com.sankuai.mesh.util.c.a(str));
        }
    }

    public void callBackError(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08271b4d05585d6aefc692900275ed21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08271b4d05585d6aefc692900275ed21");
            return;
        }
        this.mMeshBaseUrl.setError(jsonObject);
        this.mIMeshApiCallBack.a(com.sankuai.mesh.util.e.a(this.mMeshBaseUrl, false, jsonObject));
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public void setIMeshApiCallBack(a aVar) {
        this.mIMeshApiCallBack = aVar;
    }

    public void setMeshBaseUrl(MeshBaseUrl meshBaseUrl) {
        this.mMeshBaseUrl = meshBaseUrl;
    }
}
