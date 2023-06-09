package com.huawei.hms.common.internal;

import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ConnectionManagerKey<TOption extends Api.ApiOptions> {
    private final Api<TOption> mApi;
    private final WeakReference<Context> mContextRef;
    private final int mHashKey;
    private final boolean mHaveOption;
    private final TOption mOption;
    private final String subAppId;

    private ConnectionManagerKey(Context context, Api<TOption> api, TOption toption, String str) {
        this.mHaveOption = false;
        this.mContextRef = new WeakReference<>(context);
        this.mApi = api;
        this.mOption = toption;
        this.mHashKey = Objects.hashCode(this.mContextRef.get(), this.mApi, this.mOption);
        this.subAppId = str;
    }

    public static <TOption extends Api.ApiOptions> ConnectionManagerKey<TOption> createConnectionManagerKey(Context context, Api<TOption> api, TOption toption, String str) {
        return new ConnectionManagerKey<>(context, api, toption, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConnectionManagerKey) {
            ConnectionManagerKey connectionManagerKey = (ConnectionManagerKey) obj;
            return (this.mContextRef == null || connectionManagerKey.mContextRef == null) ? this.mContextRef == null && connectionManagerKey.mContextRef == null && this.mHaveOption == connectionManagerKey.mHaveOption && Objects.equal(this.mApi, connectionManagerKey.mApi) && Objects.equal(this.mOption, connectionManagerKey.mOption) && Objects.equal(this.subAppId, connectionManagerKey.subAppId) : this.mHaveOption == connectionManagerKey.mHaveOption && Objects.equal(this.mApi, connectionManagerKey.mApi) && Objects.equal(this.mOption, connectionManagerKey.mOption) && Objects.equal(this.subAppId, connectionManagerKey.subAppId) && Objects.equal(this.mContextRef.get(), connectionManagerKey.mContextRef.get());
        }
        return false;
    }

    public final int hashCode() {
        return this.mHashKey;
    }

    public static <TOption extends Api.ApiOptions> ConnectionManagerKey<TOption> createConnectionManagerKey(Api<TOption> api, String str) {
        return new ConnectionManagerKey<>(api, str);
    }

    private ConnectionManagerKey(Api<TOption> api, String str) {
        this.mHaveOption = true;
        this.mApi = api;
        this.mOption = null;
        this.mHashKey = System.identityHashCode(this);
        this.subAppId = str;
        this.mContextRef = null;
    }
}
