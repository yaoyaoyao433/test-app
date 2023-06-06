package com.sankuai.model;

import android.database.ContentObserver;
import android.net.Uri;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.Request;
import java.io.IOException;
import java.util.concurrent.Callable;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RequestCallable implements Request, Callable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Request.Origin origin;
    private Request request;

    public RequestCallable(Request request, Request.Origin origin) {
        Object[] objArr = {request, origin};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27921e8439426df4c527cce51aae7817", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27921e8439426df4c527cce51aae7817");
            return;
        }
        this.request = request;
        this.origin = origin;
    }

    public Request getRequest() {
        return this.request;
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "087babf34c3c76e59e7fa6423764192a", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "087babf34c3c76e59e7fa6423764192a") : this.request.execute(this.origin);
    }

    @Override // com.sankuai.model.Request
    public Object convert(JsonElement jsonElement) throws IOException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3417fb66c7ef88eb17070b049379fd36", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3417fb66c7ef88eb17070b049379fd36") : this.request.convert(jsonElement);
    }

    @Override // com.sankuai.model.Request
    public void onDataUpdate(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5138dc632a51a5a9ec8d22cef010834d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5138dc632a51a5a9ec8d22cef010834d");
        } else {
            this.request.onDataUpdate(obj);
        }
    }

    @Override // com.sankuai.model.Request
    public HttpUriRequest getHttpUriRequest() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41ce07d123773147c8cb67ed5c2b7aed", RobustBitConfig.DEFAULT_VALUE) ? (HttpUriRequest) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41ce07d123773147c8cb67ed5c2b7aed") : this.request.getHttpUriRequest();
    }

    @Override // com.sankuai.model.Request
    public Uri getDataUri() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efaa56a931ca8379c6ab4d0a2a130117", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efaa56a931ca8379c6ab4d0a2a130117") : this.request.getDataUri();
    }

    @Override // com.sankuai.model.Request
    public boolean isLocalValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d471980e8b2172a648fcf061f516c872", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d471980e8b2172a648fcf061f516c872")).booleanValue() : this.request.isLocalValid();
    }

    @Override // com.sankuai.model.Request
    public Object execute(Request.Origin origin) throws IOException {
        Object[] objArr = {origin};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0279fa3c25dc34927b915bef5a131cc1", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0279fa3c25dc34927b915bef5a131cc1") : this.request.execute(origin);
    }

    @Override // com.sankuai.model.Request
    public void onDataGot(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0663054087944689367dc18c17aa3c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0663054087944689367dc18c17aa3c4");
        } else {
            this.request.onDataGot(obj);
        }
    }

    @Override // com.sankuai.model.Request
    public void setContentObserver(ContentObserver contentObserver) {
        Object[] objArr = {contentObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b7728358564e32fbaf11f4659755dad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b7728358564e32fbaf11f4659755dad");
        } else {
            this.request.setContentObserver(contentObserver);
        }
    }

    public Object handleResponse(HttpResponse httpResponse) throws IOException {
        Object[] objArr = {httpResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a371adb81148fea744678090da5d54b0", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a371adb81148fea744678090da5d54b0") : this.request.handleResponse(httpResponse);
    }
}
