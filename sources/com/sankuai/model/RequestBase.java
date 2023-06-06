package com.sankuai.model;

import android.content.SharedPreferences;
import android.database.ContentObserver;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.Request;
import com.sankuai.model.notify.DataNotifier;
import de.greenrobot.dao.AbstractDaoSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpResponseException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class RequestBase<T> implements Request<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected static final JsonParser parser = new JsonParser();
    protected final AccountProvider accountProvider;
    protected ApiProvider apiProvider;
    protected final AbstractDaoSession daoSession;
    protected final DataNotifier dataNotifier;
    protected Gson gson;
    protected final HttpClient httpClient;
    private ContentObserver observer;
    protected final SharedPreferences preferences;

    public void convertOtherElement(JsonElement jsonElement) {
    }

    public String dataElementName() {
        return "data";
    }

    public abstract String getUrl();

    public abstract T local() throws IOException;

    @Override // com.sankuai.model.Request
    public void onDataGot(T t) {
    }

    public String otherElementName() {
        return null;
    }

    public abstract void store(T t);

    public RequestBase() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92157dd0a65282ad8552ae150fc55957", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92157dd0a65282ad8552ae150fc55957");
            return;
        }
        RequestFactory createRequestFactory = createRequestFactory();
        this.daoSession = createRequestFactory.getDaoSession();
        this.dataNotifier = createRequestFactory.getDataNotifier();
        this.httpClient = createRequestFactory.getHttpClient();
        this.preferences = createRequestFactory.getSharedPreferences();
        this.accountProvider = createRequestFactory.getAccountProvider();
        this.apiProvider = createRequestFactory.getApiProvider();
        this.gson = createRequestFactory.getGsonProvider().get();
    }

    public RequestFactory createRequestFactory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cb896b07a80cabb988f623eb9f45460", RobustBitConfig.DEFAULT_VALUE) ? (RequestFactory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cb896b07a80cabb988f623eb9f45460") : DefaultRequestFactory.getInstance();
    }

    @Override // com.sankuai.model.Request
    public void setContentObserver(ContentObserver contentObserver) {
        this.observer = contentObserver;
    }

    public Type getType() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3fb117c2f2d99f2144b68b9c00be583", RobustBitConfig.DEFAULT_VALUE)) {
            return (Type) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3fb117c2f2d99f2144b68b9c00be583");
        }
        Type genericSuperclass = getClass().getGenericSuperclass();
        while (true) {
            z = genericSuperclass instanceof Class;
            if (!z || genericSuperclass.equals(RequestBase.class)) {
                break;
            }
            genericSuperclass = ((Class) genericSuperclass).getGenericSuperclass();
        }
        if (z) {
            throw new RuntimeException("Missing type parameter.");
        }
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }

    public T handleResponse(HttpResponse httpResponse) throws ClientProtocolException, IOException {
        Object[] objArr = {httpResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "557ab69ec04344a6564532b0c16a6ca0", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "557ab69ec04344a6564532b0c16a6ca0");
        }
        if (httpResponse.getEntity() == null) {
            throw new IOException("Failed to get response's entity");
        }
        return convert(new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent(), "UTF-8")));
    }

    private T convert(Reader reader) throws IOException {
        Object[] objArr = {reader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e2198b5669e2e555965137b7f2abc19", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e2198b5669e2e555965137b7f2abc19");
        }
        try {
            try {
                T convert = convert(parser.parse(reader));
                try {
                    reader.close();
                } catch (IOException unused) {
                }
                return convert;
            } catch (JsonParseException e) {
                IOException iOException = new IOException("Parse exception converting JSON to object");
                iOException.initCause(e);
                throw iOException;
            }
        } catch (Throwable th) {
            try {
                reader.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    @Override // com.sankuai.model.Request
    public T convert(JsonElement jsonElement) throws IOException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb6c7d93b25dff169fb8364c25ff24b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb6c7d93b25dff169fb8364c25ff24b7");
        }
        if (!jsonElement.isJsonObject()) {
            throw new JsonParseException("Root is not JsonObject");
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String otherElementName = otherElementName();
        if (otherElementName != null && asJsonObject.has(otherElementName)) {
            convertOtherElement(asJsonObject.get(otherElementName));
        }
        String dataElementName = dataElementName();
        if (asJsonObject.has(dataElementName)) {
            return convertDataElement(asJsonObject.get(dataElementName));
        }
        if (asJsonObject.has("error")) {
            convertErrorElement(asJsonObject.get("error"));
        }
        throw new IOException("Fail to get data");
    }

    public void convertErrorElement(JsonElement jsonElement) throws HttpResponseException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4bb0e27e640513f30b8bf0624164d7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4bb0e27e640513f30b8bf0624164d7b");
        } else if (jsonElement.isJsonObject()) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            throw new HttpResponseException(asJsonObject.has("code") ? asJsonObject.get("code").getAsInt() : 400, asJsonObject.has("message") ? asJsonObject.get("message").getAsString() : "");
        }
    }

    public T convertDataElement(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dba1ed7b280a7f989cb0668fc364910", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dba1ed7b280a7f989cb0668fc364910") : (T) this.gson.fromJson(jsonElement, getType());
    }

    public T net() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06f81628692660bf60bef251a64a51c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06f81628692660bf60bef251a64a51c4");
        }
        return (T) this.httpClient.execute(getHttpUriRequest(), this);
    }

    public T performNet() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de48cb85a88c32602a50e4f434d44601", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de48cb85a88c32602a50e4f434d44601");
        }
        try {
            T net = net();
            onDataUpdate(net);
            onDataGot(net);
            return net;
        } catch (SecurityException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    public final T performLocal() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4dec90ef9b7a180406a479258aad2e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4dec90ef9b7a180406a479258aad2e4");
        }
        T local = local();
        onDataGot(local);
        return local;
    }

    @Override // com.sankuai.model.Request
    public void onDataUpdate(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d19ef80a40bef079b6e3294dc089406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d19ef80a40bef079b6e3294dc089406");
            return;
        }
        store(t);
        notifyChange();
    }

    private void notifyChange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb81501c6a36e07fbddaf80df524950c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb81501c6a36e07fbddaf80df524950c");
        } else if (getDataUri() != null) {
            this.dataNotifier.notifyChange(getDataUri(), this.observer);
        }
    }

    @Override // com.sankuai.model.Request
    public T execute(Request.Origin origin) throws IOException {
        Object[] objArr = {origin};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0c1de73d50bc98255c215b93d840bc9", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0c1de73d50bc98255c215b93d840bc9");
        }
        switch (origin) {
            case LOCAL:
                return performLocal();
            case NET:
                return performNet();
            case NET_PREFERED:
                try {
                    store(net());
                } catch (Exception unused) {
                }
                return performLocal();
            default:
                if (isLocalValid()) {
                    return performLocal();
                }
                return performNet();
        }
    }
}
