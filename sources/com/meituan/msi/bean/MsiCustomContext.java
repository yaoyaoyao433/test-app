package com.meituan.msi.bean;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.content.Intent;
import android.support.annotation.NonNull;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.msi.a;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.context.b;
import com.meituan.msi.context.i;
import com.meituan.msi.dispather.e;
import com.meituan.msi.page.IPage;
import com.meituan.msi.provider.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MsiCustomContext {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ApiRequest apiRequest;
    private MsiContext msiContext;

    public MsiCustomContext(@NonNull MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "beed4936f03c683833d943aee0e91e4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "beed4936f03c683833d943aee0e91e4d");
        } else if (msiContext == null) {
            throw new IllegalArgumentException("msiContext is null");
        } else {
            this.msiContext = msiContext;
            this.apiRequest = msiContext.request;
        }
    }

    public <T> void onSuccess(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6149b7f86dbc424533651d7b733d2dc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6149b7f86dbc424533651d7b733d2dc0");
        } else {
            this.msiContext.onSuccess(t);
        }
    }

    public void onError(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38e7f29972ad9bd8921e4493c536e322", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38e7f29972ad9bd8921e4493c536e322");
        } else if (i < 500 && a.i()) {
            throw new IllegalArgumentException("errorCode < 500");
        } else {
            this.msiContext.onError(i, str);
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb10c4bd2a73094d9c69e650852de764", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb10c4bd2a73094d9c69e650852de764");
        } else {
            this.msiContext.startActivityForResult(intent, i);
        }
    }

    public void startActivityForResult(Intent intent, b bVar) {
        Object[] objArr = {intent, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca2ed0c3a535edfbcb0f7d88aa9e2b65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca2ed0c3a535edfbcb0f7d88aa9e2b65");
        } else {
            this.msiContext.startActivityForResult(intent, bVar);
        }
    }

    public void dispatchEvent(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5cea1bbcbe9570808ae09303250cf54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5cea1bbcbe9570808ae09303250cf54");
        } else {
            this.msiContext.dispatchEvent(str, obj);
        }
    }

    public void dispatchEvent(String str, String str2, Object obj) {
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d621a8d86a6f2e2ee2613201c78894c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d621a8d86a6f2e2ee2613201c78894c");
        } else {
            this.msiContext.dispatchEvent(str, str2, obj);
        }
    }

    @NonNull
    public e getEventDispatcher() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5046c70235732d8ccdd31eae64c87b76", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5046c70235732d8ccdd31eae64c87b76") : this.msiContext.getEventDispatcher();
    }

    public i getSchemaContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b602b761a7715e325194e9c5543b5fe", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b602b761a7715e325194e9c5543b5fe") : this.msiContext.getSchemaContext();
    }

    public com.meituan.msi.provider.a getFileProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2e4741207602e22b9cbdbbb2306f348", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msi.provider.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2e4741207602e22b9cbdbbb2306f348") : this.msiContext.getFileProvider();
    }

    public f getSharedPreferencesProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a370b8b6d790c640fd21f4a740b72cc", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a370b8b6d790c640fd21f4a740b72cc") : this.msiContext.getSharedPreferencesProvider();
    }

    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86ca4cd5aa6825d6e377c48f877d9888", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86ca4cd5aa6825d6e377c48f877d9888") : this.msiContext.getActivity();
    }

    public JsonElement getArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d668c43d2c9c87cfcabee706dd432e6", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d668c43d2c9c87cfcabee706dd432e6") : this.msiContext.getArgs();
    }

    public d.b getLifecycleState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09fd270fb21fc5452c71fa22e7c33650", RobustBitConfig.DEFAULT_VALUE) ? (d.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09fd270fb21fc5452c71fa22e7c33650") : this.msiContext.getLifecycleState();
    }

    public JsonObject getInnerArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a384c391177678ca8f444d143e7d071b", RobustBitConfig.DEFAULT_VALUE) ? (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a384c391177678ca8f444d143e7d071b") : this.msiContext.getInnerArgs();
    }

    @NonNull
    public ContainerInfo getContainerInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41dc1abe79de24b8a0a15ca00621104b", RobustBitConfig.DEFAULT_VALUE) ? (ContainerInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41dc1abe79de24b8a0a15ca00621104b") : this.msiContext.getContainerInfo();
    }

    public String getTopPagePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a50b70de4dda9329819b7b4ef3d0a5dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a50b70de4dda9329819b7b4ef3d0a5dc");
        }
        IPage topPage = this.msiContext.getTopPage();
        if (topPage != null) {
            return topPage.getPagePath();
        }
        return null;
    }

    public String getPagePath(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0de7d7c389521df1e7a10a5cc9120c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0de7d7c389521df1e7a10a5cc9120c3");
        }
        IPage pageById = this.msiContext.getPageById(i);
        if (pageById != null) {
            return pageById.getPagePath();
        }
        return null;
    }

    public ApiRequest getApiRequest() {
        return this.apiRequest;
    }
}
