package com.sankuai.model;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.Request;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.apache.http.client.methods.HttpUriRequest;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LocalComboRequest extends RequestBase<Map<Request, Object>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<Request> requestList;

    @Override // com.sankuai.model.Request
    public Uri getDataUri() {
        return null;
    }

    @Override // com.sankuai.model.Request
    public HttpUriRequest getHttpUriRequest() {
        return null;
    }

    @Override // com.sankuai.model.RequestBase
    public String getUrl() {
        return null;
    }

    @Override // com.sankuai.model.Request
    public boolean isLocalValid() {
        return false;
    }

    @Override // com.sankuai.model.RequestBase
    public void store(Map<Request, Object> map) {
    }

    public LocalComboRequest(Request... requestArr) {
        Object[] objArr = {requestArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9b7cf9f94b40cb64903e10239fe3f11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9b7cf9f94b40cb64903e10239fe3f11");
        } else {
            this.requestList = Arrays.asList(requestArr);
        }
    }

    public LocalComboRequest(List<Request> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dce0915c3f9c1b0f710d81c3684e5f64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dce0915c3f9c1b0f710d81c3684e5f64");
        } else {
            this.requestList = list;
        }
    }

    public List<Request> getRequestList() {
        return this.requestList;
    }

    @Override // com.sankuai.model.RequestBase, com.sankuai.model.Request
    public Map<Request, Object> execute(Request.Origin origin) throws IOException {
        Object[] objArr = {origin};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f7e721fb0b525d19e9380db573a85b1", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f7e721fb0b525d19e9380db573a85b1") : load(origin);
    }

    @Override // com.sankuai.model.RequestBase
    public Map<Request, Object> local() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93240d86419301a7b1968f5101f02378", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93240d86419301a7b1968f5101f02378") : load(Request.Origin.LOCAL);
    }

    @Override // com.sankuai.model.RequestBase
    public Map<Request, Object> net() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5143ae9cd4179e199ec0b741db9e188d", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5143ae9cd4179e199ec0b741db9e188d") : load(Request.Origin.NET);
    }

    private Map<Request, Object> load(Request.Origin origin) throws IOException {
        Object[] objArr = {origin};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7dd406de717cf20ab73c4d8ebb9629c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7dd406de717cf20ab73c4d8ebb9629c7");
        }
        ArrayList arrayList = new ArrayList();
        for (Request request : this.requestList) {
            arrayList.add(new RequestCallable(request, origin));
        }
        Hashtable<? extends Callable, Object> execute = new MultiTaskManager(arrayList).execute();
        if (execute != null) {
            Hashtable hashtable = new Hashtable();
            for (Map.Entry<? extends Callable, Object> entry : execute.entrySet()) {
                hashtable.put(((RequestCallable) entry.getKey()).getRequest(), entry.getValue());
            }
            return hashtable;
        }
        return null;
    }
}
