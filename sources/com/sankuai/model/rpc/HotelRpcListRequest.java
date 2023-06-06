package com.sankuai.model.rpc;

import android.net.Uri;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.android.legwork.monitor.report.channel.dao.DaBaiDao;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
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
public abstract class HotelRpcListRequest extends RequestBaseAdapter<Map<RpcRequest, BaseRpcResult>> {
    private static final String URL = "http://api.hotel.meituan.com/group/hotel/grouporder/v1/";
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<RpcRequest> requestList;
    private boolean useHttps;

    public abstract String getName();

    @Override // com.sankuai.model.RequestBase
    public String getUrl() {
        return null;
    }

    public HotelRpcListRequest(List<RpcRequest> list) {
        this(list, false);
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "603889f92baa3c9333efad607c4a4f16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "603889f92baa3c9333efad607c4a4f16");
        }
    }

    public HotelRpcListRequest(List<RpcRequest> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4f256021e4cae97a0f5f05a3477008b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4f256021e4cae97a0f5f05a3477008b");
            return;
        }
        this.requestList = Collections.unmodifiableList(list);
        this.useHttps = z;
    }

    @Override // com.sankuai.model.Request
    public HttpUriRequest getHttpUriRequest() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bc7a9d0679eae64800b8a4d24b5c2a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpUriRequest) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bc7a9d0679eae64800b8a4d24b5c2a1");
        }
        Uri.Builder buildUpon = Uri.parse(URL + getName()).buildUpon();
        if (this.useHttps) {
            buildUpon.scheme("https");
        }
        if (tokenEnabled()) {
            buildUpon.appendQueryParameter("token", this.accountProvider.getToken());
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (RpcRequest rpcRequest : this.requestList) {
            arrayList.add(rpcRequest.genRpcBuilder());
            List<BasicNameValuePair> otherParams = rpcRequest.otherParams();
            if (otherParams != null && otherParams.size() > 0) {
                for (BasicNameValuePair basicNameValuePair : otherParams) {
                    hashMap.put(basicNameValuePair.getName(), basicNameValuePair.getValue());
                }
            }
        }
        if (arrayList.size() > 0) {
            String[] strArr = new String[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                strArr[i] = ((RpcBuilder) arrayList.get(i)).getMethod();
            }
            buildUpon.appendQueryParameter("method", Arrays.toString(strArr).replaceAll("[\\s\\[\\]]", ""));
        }
        hashMap.put(DaBaiDao.JSON_DATA, arrayList);
        return RequestUtils.buildStringEntityRequest(buildUpon.toString(), new Gson().toJson(hashMap), PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_JSON);
    }

    private boolean tokenEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2006cacafd948222d554b43c6adeedf4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2006cacafd948222d554b43c6adeedf4")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b6c7606bc90214c450d897e3f5ce374", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b6c7606bc90214c450d897e3f5ce374");
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
