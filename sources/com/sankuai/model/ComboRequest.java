package com.sankuai.model;

import android.database.ContentObserver;
import android.net.Uri;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.Request;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ComboRequest extends RequestBase<Map<Request, Object>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static RequestProcessor requestProcessor = new DumpRequestProcessor();
    private final List<Request> localRequestList;
    private final List<Request> netRequestList;
    protected final List<Request> requestList;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface RequestProcessor {
        String processUrl(String str);
    }

    @Override // com.sankuai.model.Request
    public Uri getDataUri() {
        return null;
    }

    @Override // com.sankuai.model.Request
    public boolean isLocalValid() {
        return false;
    }

    @Override // com.sankuai.model.RequestBase
    public void store(Map<Request, Object> map) {
    }

    public ComboRequest(List<Request> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0860eaf666ade559de56180580ff2f4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0860eaf666ade559de56180580ff2f4d");
            return;
        }
        this.requestList = Collections.unmodifiableList(list);
        this.netRequestList = new ArrayList();
        this.localRequestList = new ArrayList();
    }

    public static void setRequestProcessor(RequestProcessor requestProcessor2) {
        Object[] objArr = {requestProcessor2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c793a31cc9fc05c47291f06887829e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c793a31cc9fc05c47291f06887829e9");
        } else if (requestProcessor2 == null) {
            throw new IllegalArgumentException();
        } else {
            requestProcessor = requestProcessor2;
        }
    }

    public List<Request> getRequestList() {
        return this.requestList;
    }

    @Override // com.sankuai.model.RequestBase
    public Map<Request, Object> local() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c57792e8ca59110e66cdc9131d3216a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c57792e8ca59110e66cdc9131d3216a7");
        }
        HashMap hashMap = new HashMap();
        for (Request request : this.localRequestList) {
            try {
                hashMap.put(request, request.execute(Request.Origin.LOCAL));
            } catch (IOException e) {
                hashMap.put(request, e);
            }
        }
        return hashMap;
    }

    @Override // com.sankuai.model.RequestBase
    public String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10fd7d922f6eb9cb64ae26c556f9798b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10fd7d922f6eb9cb64ae26c556f9798b") : this.apiProvider.get(ApiProvider.TYPE_COMBO);
    }

    @Override // com.sankuai.model.Request
    public HttpUriRequest getHttpUriRequest() {
        Header[] allHeaders;
        HttpEntity entity;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "217d77aa5b5441e2eb052602c4ba766a", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpUriRequest) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "217d77aa5b5441e2eb052602c4ba766a");
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("form", "map");
        JsonArray jsonArray = new JsonArray();
        jsonObject.add("resources", jsonArray);
        if (this.netRequestList.isEmpty()) {
            return null;
        }
        for (Request request : this.netRequestList) {
            HttpEntityEnclosingRequest httpUriRequest = request.getHttpUriRequest();
            if (httpUriRequest != null) {
                JsonObject jsonObject2 = new JsonObject();
                jsonArray.add(jsonObject2);
                jsonObject2.addProperty("method", httpUriRequest.getMethod());
                jsonObject2.addProperty("url", requestProcessor.processUrl(httpUriRequest.getURI().toString()));
                JsonObject jsonObject3 = new JsonObject();
                jsonObject2.add("headers", jsonObject3);
                for (Header header : httpUriRequest.getAllHeaders()) {
                    jsonObject3.addProperty(header.getName(), header.getValue());
                }
                if ((httpUriRequest instanceof HttpEntityEnclosingRequest) && (entity = httpUriRequest.getEntity()) != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        entity.writeTo(byteArrayOutputStream);
                        jsonObject2.addProperty("body", byteArrayOutputStream.toString("UTF-8"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        HttpPost httpPost = new HttpPost(getUrl());
        try {
            httpPost.setEntity(new StringEntity(jsonObject.toString(), "UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        return httpPost;
    }

    @Override // com.sankuai.model.RequestBase, com.sankuai.model.Request
    public void onDataUpdate(Map<Request, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e1c36366d796bfde647cdb9510836ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e1c36366d796bfde647cdb9510836ea");
        } else if (map != null) {
            for (Map.Entry<Request, Object> entry : map.entrySet()) {
                if (!(entry.getValue() instanceof Exception)) {
                    entry.getKey().onDataUpdate(entry.getValue());
                }
            }
        }
    }

    @Override // com.sankuai.model.RequestBase, com.sankuai.model.Request
    public void onDataGot(Map<Request, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28105bd9d24a0fdebe0b6babe1669460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28105bd9d24a0fdebe0b6babe1669460");
        } else if (map != null) {
            for (Map.Entry<Request, Object> entry : map.entrySet()) {
                if (!(entry.getValue() instanceof Exception)) {
                    entry.getKey().onDataGot(entry.getValue());
                }
            }
        }
    }

    @Override // com.sankuai.model.RequestBase, com.sankuai.model.Request
    public void setContentObserver(ContentObserver contentObserver) {
        Object[] objArr = {contentObserver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "991210c42faaa2130161332ca617989a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "991210c42faaa2130161332ca617989a");
            return;
        }
        for (Request request : this.requestList) {
            request.setContentObserver(contentObserver);
        }
    }

    @Override // com.sankuai.model.RequestBase, com.sankuai.model.Request
    public Map<Request, Object> convert(JsonElement jsonElement) throws IOException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37b745da6dd090ce0cd7490603cd3d78", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37b745da6dd090ce0cd7490603cd3d78");
        }
        if (!jsonElement.isJsonObject()) {
            throw new JsonParseException("Root is not JsonObject");
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject.has("data")) {
            return convertDataElement((JsonElement) asJsonObject.getAsJsonObject("data"));
        }
        if (asJsonObject.has("error")) {
            convertErrorElement(asJsonObject.get("error"));
        }
        throw new IOException("Fail to get data");
    }

    @Override // com.sankuai.model.RequestBase
    public Map<Request, Object> convertDataElement(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3eeb46d189991e9b811219b681763b0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3eeb46d189991e9b811219b681763b0f");
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        HashMap hashMap = new HashMap();
        for (Request request : this.netRequestList) {
            HttpUriRequest httpUriRequest = request.getHttpUriRequest();
            if (httpUriRequest != null) {
                String decodeUrl = decodeUrl(requestProcessor.processUrl(httpUriRequest.getURI().toString()));
                if (asJsonObject.has(decodeUrl)) {
                    try {
                        hashMap.put(request, request.convert(asJsonObject.getAsJsonObject(decodeUrl)));
                    } catch (Exception e) {
                        hashMap.put(request, e);
                    }
                }
            }
        }
        return hashMap;
    }

    private String decodeUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb94a74e555118c7491030f55ff9ec91", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb94a74e555118c7491030f55ff9ec91");
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    @Override // com.sankuai.model.RequestBase, com.sankuai.model.Request
    public Map<Request, Object> execute(Request.Origin origin) throws IOException {
        Object[] objArr = {origin};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62df8c752b35a270d10dd0fac23cc181", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62df8c752b35a270d10dd0fac23cc181");
        }
        this.netRequestList.clear();
        this.localRequestList.clear();
        switch (origin) {
            case LOCAL:
                this.localRequestList.addAll(this.requestList);
                break;
            case NET:
                this.netRequestList.addAll(this.requestList);
                break;
            case UNSPECIFIED:
                for (Request request : this.requestList) {
                    if (request.isLocalValid()) {
                        this.localRequestList.add(request);
                    } else {
                        this.netRequestList.add(request);
                    }
                }
                break;
        }
        HashMap hashMap = new HashMap();
        if (!this.localRequestList.isEmpty()) {
            hashMap.putAll(performLocal());
        }
        if (!this.netRequestList.isEmpty()) {
            hashMap.putAll(performNet());
        }
        return hashMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class DumpRequestProcessor implements RequestProcessor {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.sankuai.model.ComboRequest.RequestProcessor
        public String processUrl(String str) {
            return str;
        }

        public DumpRequestProcessor() {
        }
    }
}
