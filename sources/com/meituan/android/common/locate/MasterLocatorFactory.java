package com.meituan.android.common.locate;

import android.content.Context;
import com.meituan.android.common.locate.offline.IOfflineDataDownloader;
import com.meituan.android.common.locate.offline.IOfflineSeek;
import com.meituan.android.common.locate.offline.IOfflineUserDataDownloader;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.raw.a;
import okhttp3.OkHttpClient;
import org.apache.http.client.HttpClient;
/* loaded from: classes2.dex */
public interface MasterLocatorFactory {
    public static final int PROCESS_MAIN = 0;
    public static final int PROCESS_SUB = 1;
    public static final int REQUEST_DIANPING_CITYID = 2;
    public static final int REQUEST_MEITUAN_CITYID = 1;
    public static final int REQUEST_NO_CITYID = 0;

    MasterLocator createMasterLocator(Context context, a.InterfaceC0637a interfaceC0637a, Interceptor interceptor, String str, int i, int i2);

    MasterLocator createMasterLocator(Context context, a.InterfaceC0637a interfaceC0637a, Interceptor interceptor, String str, int i, int i2, IOfflineSeek iOfflineSeek, IOfflineDataDownloader iOfflineDataDownloader, IOfflineUserDataDownloader iOfflineUserDataDownloader);

    MasterLocator createMasterLocator(Context context, a.InterfaceC0637a interfaceC0637a, String str);

    MasterLocator createMasterLocator(Context context, a.InterfaceC0637a interfaceC0637a, String str, int i);

    MasterLocator createMasterLocator(Context context, a.InterfaceC0637a interfaceC0637a, String str, int i, int i2);

    MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient);

    MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient, a.InterfaceC0637a interfaceC0637a, Interceptor interceptor, String str, int i, int i2);

    MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient, a.InterfaceC0637a interfaceC0637a, Interceptor interceptor, String str, int i, int i2, IOfflineSeek iOfflineSeek, IOfflineDataDownloader iOfflineDataDownloader, IOfflineUserDataDownloader iOfflineUserDataDownloader);

    MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient, a.InterfaceC0637a interfaceC0637a, String str);

    MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient, a.InterfaceC0637a interfaceC0637a, String str, int i);

    MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient, a.InterfaceC0637a interfaceC0637a, String str, int i, int i2);

    MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient, String str);

    MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient, String str, int i);

    MasterLocator createMasterLocator(Context context, OkHttpClient okHttpClient, String str, int i, IOfflineSeek iOfflineSeek, IOfflineDataDownloader iOfflineDataDownloader, IOfflineUserDataDownloader iOfflineUserDataDownloader);

    @Deprecated
    MasterLocator createMasterLocator(Context context, HttpClient httpClient);

    @Deprecated
    MasterLocator createMasterLocator(Context context, HttpClient httpClient, a.InterfaceC0637a interfaceC0637a, Interceptor interceptor, String str, int i, int i2);

    @Deprecated
    MasterLocator createMasterLocator(Context context, HttpClient httpClient, a.InterfaceC0637a interfaceC0637a, String str);

    @Deprecated
    MasterLocator createMasterLocator(Context context, HttpClient httpClient, a.InterfaceC0637a interfaceC0637a, String str, int i);

    @Deprecated
    MasterLocator createMasterLocator(Context context, HttpClient httpClient, a.InterfaceC0637a interfaceC0637a, String str, int i, int i2);

    @Deprecated
    MasterLocator createMasterLocator(Context context, HttpClient httpClient, String str);
}
