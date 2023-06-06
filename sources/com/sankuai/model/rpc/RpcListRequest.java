package com.sankuai.model.rpc;

import android.net.Uri;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.ApiProvider;
import com.sankuai.model.RequestBaseAdapter;
import com.sankuai.model.RequestUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicNameValuePair;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RpcListRequest extends RequestBaseAdapter<Map<RpcRequest, BaseRpcResult>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<RpcRequest> requestList;
    private boolean useHttps;

    @Override // com.sankuai.model.RequestBase
    public String getUrl() {
        return null;
    }

    public RpcListRequest(List<RpcRequest> list) {
        this(list, false);
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a4ca8386eb136b8a226d9fd98706021", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a4ca8386eb136b8a226d9fd98706021");
        }
    }

    public RpcListRequest(List<RpcRequest> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d2b78fef12b24bd6ac20ba6a77b1fb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d2b78fef12b24bd6ac20ba6a77b1fb2");
            return;
        }
        this.requestList = Collections.unmodifiableList(list);
        this.useHttps = z;
    }

    @Override // com.sankuai.model.Request
    public HttpUriRequest getHttpUriRequest() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3868c4501183e3096011a71325bfb29", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpUriRequest) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3868c4501183e3096011a71325bfb29");
        }
        Uri.Builder buildUpon = Uri.parse(this.apiProvider.get(ApiProvider.TYPE_RPC)).buildUpon();
        if (this.useHttps) {
            buildUpon.scheme("https");
        }
        if (tokenEnabled()) {
            buildUpon.appendQueryParameter("token", this.accountProvider.getToken());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (RpcRequest rpcRequest : this.requestList) {
            arrayList.add(rpcRequest.genRpcBuilder());
            List<BasicNameValuePair> otherParams = rpcRequest.otherParams();
            if (otherParams != null && otherParams.size() > 0) {
                arrayList2.addAll(otherParams);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        String[] genRpcParams = RpcBuilder.genRpcParams(arrayList);
        arrayList3.add(new BasicNameValuePair(genRpcParams[0], genRpcParams[1]));
        if (arrayList2.size() > 0) {
            arrayList3.addAll(arrayList2);
        }
        if (arrayList.size() > 0) {
            String[] strArr = new String[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                strArr[i] = ((RpcBuilder) arrayList.get(i)).getMethod();
            }
            buildUpon.appendQueryParameter("method", Arrays.toString(strArr).replaceAll("[\\s\\[\\]]", ""));
        }
        return RequestUtils.buildFormEntityRequest(buildUpon.toString(), arrayList3);
    }

    private boolean tokenEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "771fa75cfa8fd493ead97d0a6d70c962", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "771fa75cfa8fd493ead97d0a6d70c962")).booleanValue();
        }
        for (RpcRequest rpcRequest : this.requestList) {
            if (rpcRequest instanceof TokenRpcRequest) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sankuai.model.RequestBase, com.sankuai.model.Request
    public Map<RpcRequest, BaseRpcResult> convert(JsonElement jsonElement) throws IOException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2000b6928ad7eae17ab6c36cec6c2a15", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2000b6928ad7eae17ab6c36cec6c2a15");
        }
        if (!jsonElement.isJsonArray()) {
            throw new JsonParseException("Root is not JsonArray");
        }
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        if (asJsonArray == null || asJsonArray.size() <= 0) {
            throw new IOException("Fail to get data");
        }
        if (asJsonArray.size() != this.requestList.size()) {
            throw new IllegalStateException("rpc request size not equals list size");
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < this.requestList.size(); i++) {
            RpcRequest rpcRequest = this.requestList.get(i);
            JsonElement jsonElement2 = asJsonArray.get(i);
            if (rpcRequest instanceof TokenRpcRequest) {
                ((TokenRpcRequest) rpcRequest).handleUserLockedError(jsonElement2);
            }
            hashMap.put(rpcRequest, rpcRequest.convertDataElement(jsonElement2));
        }
        return hashMap;
    }
}
