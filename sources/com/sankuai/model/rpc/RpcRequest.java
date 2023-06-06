package com.sankuai.model.rpc;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.meituan.android.legwork.monitor.report.channel.dao.DaBaiDao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.ApiProvider;
import com.sankuai.model.RequestBaseAdapter;
import com.sankuai.model.RequestUtils;
import com.sankuai.model.rpc.BaseRpcResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicNameValuePair;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class RpcRequest<T extends BaseRpcResult> extends RequestBaseAdapter<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract RpcBuilder genRpcBuilder();

    @Override // com.sankuai.model.RequestBase
    public String getUrl() {
        return null;
    }

    public boolean isHttps() {
        return false;
    }

    public List<BasicNameValuePair> otherParams() {
        return null;
    }

    public boolean tokenEnabled() {
        return false;
    }

    @Override // com.sankuai.model.Request
    public HttpUriRequest getHttpUriRequest() {
        Uri.Builder buildUpon;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95484ce296883f9001695afd8fab02ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpUriRequest) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95484ce296883f9001695afd8fab02ca");
        }
        RpcBuilder genRpcBuilder = genRpcBuilder();
        if (TextUtils.isEmpty(this.url)) {
            buildUpon = Uri.parse(this.apiProvider.get(ApiProvider.TYPE_RPC)).buildUpon();
            if (isHttps()) {
                buildUpon.scheme("https");
            }
            if (genRpcBuilder != null) {
                buildUpon.appendQueryParameter("method", genRpcBuilder.getMethod());
            }
            if (tokenEnabled()) {
                buildUpon.appendQueryParameter("token", this.accountProvider.getToken());
            }
            this.url = buildUpon.toString();
        } else {
            buildUpon = Uri.parse(this.url).buildUpon();
        }
        return RequestUtils.buildFormEntityRequest(buildUpon.toString(), genParams(genRpcBuilder));
    }

    private List<BasicNameValuePair> genParams(RpcBuilder rpcBuilder) {
        Object[] objArr = {rpcBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f96b7e7ee8058174516e7497ce48dc30", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f96b7e7ee8058174516e7497ce48dc30");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair(DaBaiDao.JSON_DATA, rpcBuilder.toString()));
        List<BasicNameValuePair> otherParams = otherParams();
        if (otherParams != null && otherParams.size() > 0) {
            arrayList.addAll(otherParams);
        }
        return arrayList;
    }

    @Override // com.sankuai.model.RequestBase, com.sankuai.model.Request
    public T convert(JsonElement jsonElement) throws IOException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2d36db9f80f168f7dd5efc454ff3edc", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2d36db9f80f168f7dd5efc454ff3edc");
        }
        if (!jsonElement.isJsonArray()) {
            throw new JsonParseException("Root is not JsonArray");
        }
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        if (asJsonArray == null || asJsonArray.size() <= 0) {
            throw new IOException("Fail to get data");
        }
        JsonObject asJsonObject = asJsonArray.get(0).getAsJsonObject();
        if (asJsonObject == null) {
            throw new IOException("Fail to get data");
        }
        return convertDataElement((JsonElement) asJsonObject);
    }

    @Override // com.sankuai.model.RequestBase
    public T convertDataElement(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "333e2ac3341e29d90fefd563027a834d", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "333e2ac3341e29d90fefd563027a834d") : (T) super.convertDataElement(jsonElement);
    }
}
