package com.sankuai.model;

import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.model.notify.DataNotifier;
import de.greenrobot.dao.AbstractDaoSession;
import org.apache.http.client.HttpClient;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DefaultRequestFactory implements RequestFactory {
    private static AccountProvider accountProvider;
    private static ApiProvider apiProvider;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static AbstractDaoSession daoSession;
    private static DataNotifier dataNotifier;
    private static GsonProvider gsonProvider;
    private static HttpClient httpClient;
    private static final DefaultRequestFactory instance = new DefaultRequestFactory();
    private static SharedPreferences preferences;

    public static DefaultRequestFactory getInstance() {
        return instance;
    }

    public static void setPreferences(SharedPreferences sharedPreferences) {
        preferences = sharedPreferences;
    }

    @Override // com.sankuai.model.RequestFactory
    public AbstractDaoSession getDaoSession() {
        return daoSession;
    }

    public static void setDaoSession(AbstractDaoSession abstractDaoSession) {
        daoSession = abstractDaoSession;
    }

    @Override // com.sankuai.model.RequestFactory
    public HttpClient getHttpClient() {
        return httpClient;
    }

    public static void setHttpClient(HttpClient httpClient2) {
        httpClient = httpClient2;
    }

    @Override // com.sankuai.model.RequestFactory
    public SharedPreferences getSharedPreferences() {
        return preferences;
    }

    @Override // com.sankuai.model.RequestFactory
    public DataNotifier getDataNotifier() {
        return dataNotifier;
    }

    public static void setDataNotifier(DataNotifier dataNotifier2) {
        dataNotifier = dataNotifier2;
    }

    @Override // com.sankuai.model.RequestFactory
    public AccountProvider getAccountProvider() {
        return accountProvider;
    }

    public static void setGsonProvider(GsonProvider gsonProvider2) {
        gsonProvider = gsonProvider2;
    }

    @Override // com.sankuai.model.RequestFactory
    public GsonProvider getGsonProvider() {
        return gsonProvider;
    }

    public static void setAccountProvider(AccountProvider accountProvider2) {
        accountProvider = accountProvider2;
    }

    @Override // com.sankuai.model.RequestFactory
    public ApiProvider getApiProvider() {
        return apiProvider;
    }

    public static void setApiProvider(ApiProvider apiProvider2) {
        apiProvider = apiProvider2;
    }
}
