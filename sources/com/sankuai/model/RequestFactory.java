package com.sankuai.model;

import android.content.SharedPreferences;
import com.sankuai.model.notify.DataNotifier;
import de.greenrobot.dao.AbstractDaoSession;
import org.apache.http.client.HttpClient;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface RequestFactory {
    AccountProvider getAccountProvider();

    ApiProvider getApiProvider();

    AbstractDaoSession getDaoSession();

    DataNotifier getDataNotifier();

    GsonProvider getGsonProvider();

    HttpClient getHttpClient();

    SharedPreferences getSharedPreferences();
}
