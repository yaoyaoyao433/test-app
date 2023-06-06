package com.meituan.msi.api.sharedstorage;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.util.cipStorage.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SharedStorageApi implements IMsiApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "setSharedStorage", request = SharedStorageParam.class)
    public void setSharedStorageAsync(SharedStorageParam sharedStorageParam, MsiContext msiContext) {
        Object[] objArr = {sharedStorageParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "670fc6f7bdc9f62a7424387130f8a4a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "670fc6f7bdc9f62a7424387130f8a4a6");
        } else {
            setSharedStorageSync(sharedStorageParam, msiContext);
        }
    }

    @MsiApiMethod(name = "setSharedStorageSync", request = SharedStorageParam.class)
    public EmptyResponse setSharedStorageSync(SharedStorageParam sharedStorageParam, MsiContext msiContext) {
        Object[] objArr = {sharedStorageParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc36f47c25ddae74d3d151c2527c35f", RobustBitConfig.DEFAULT_VALUE)) {
            return (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc36f47c25ddae74d3d151c2527c35f");
        }
        if (c.a(sharedStorageParam.key, sharedStorageParam.data, sharedStorageParam.level)) {
            msiContext.onSuccess(null);
            return EmptyResponse.INSTANCE;
        }
        msiContext.onError("diskStorage is null or key is null");
        return EmptyResponse.INSTANCE;
    }

    @MsiApiMethod(name = "removeSharedStorageSync", request = SharedStorageParam.class)
    public EmptyResponse removeSharedStorageSync(SharedStorageParam sharedStorageParam, MsiContext msiContext) {
        Object[] objArr = {sharedStorageParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9608d0536f36a9ca3382b9a52cbdb4b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9608d0536f36a9ca3382b9a52cbdb4b5");
        }
        if (c.a(sharedStorageParam.key)) {
            msiContext.onSuccess(null);
            return EmptyResponse.INSTANCE;
        }
        msiContext.onError("diskStorage is null or key is null");
        return EmptyResponse.INSTANCE;
    }

    @MsiApiMethod(name = "removeSharedStorage", request = SharedStorageParam.class)
    public void removeSharedStorageAsync(SharedStorageParam sharedStorageParam, MsiContext msiContext) {
        Object[] objArr = {sharedStorageParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f30d5180b15ded6504bd5e86d18bf677", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f30d5180b15ded6504bd5e86d18bf677");
        } else {
            removeSharedStorageSync(sharedStorageParam, msiContext);
        }
    }

    @MsiApiMethod(name = "getSharedStorageSync", request = SharedStorageParam.class, response = SharedStorageResponse.class)
    public SharedStorageResponse getSharedStorageSync(SharedStorageParam sharedStorageParam, MsiContext msiContext) {
        Object[] objArr = {sharedStorageParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "065013ed67f92b6d021719cda2315352", RobustBitConfig.DEFAULT_VALUE)) {
            return (SharedStorageResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "065013ed67f92b6d021719cda2315352");
        }
        String b = c.b(sharedStorageParam.key);
        if (b == null) {
            msiContext.onError("data is null");
            return new SharedStorageResponse();
        }
        SharedStorageResponse sharedStorageResponse = new SharedStorageResponse();
        sharedStorageResponse.data = b;
        msiContext.onSuccess(sharedStorageResponse);
        return sharedStorageResponse;
    }

    @MsiApiMethod(name = "getSharedStorage", request = SharedStorageParam.class, response = SharedStorageResponse.class)
    public void getSharedStorageAsync(SharedStorageParam sharedStorageParam, MsiContext msiContext) {
        Object[] objArr = {sharedStorageParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d081150e95fbe39e133ba4952da5d01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d081150e95fbe39e133ba4952da5d01");
        } else {
            getSharedStorageSync(sharedStorageParam, msiContext);
        }
    }
}
