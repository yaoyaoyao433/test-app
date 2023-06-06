package com.facebook.react;

import android.app.Application;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.uimanager.at;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class h {
    private final Application a;
    @Nullable
    private ReactInstanceManager b;

    public abstract boolean b();

    protected abstract List<i> c();

    public final ReactInstanceManager a() {
        if (this.b == null) {
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
            f builder = ReactInstanceManager.builder();
            builder.b = this.a;
            builder.a = "index.android";
            builder.c = b();
            builder.g = null;
            builder.h = null;
            builder.e = new at();
            builder.i = null;
            builder.d = LifecycleState.BEFORE_CREATE;
            for (i iVar : c()) {
                builder.a(iVar);
            }
            String str = (String) com.facebook.infer.annotation.a.a("index.android.bundle");
            if (!TextUtils.isEmpty(str)) {
                Application application = builder.b;
                builder.a(JSBundleLoader.createAssetLoader(application, "assets://" + str, false));
            }
            ReactInstanceManager a = builder.a();
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
            this.b = a;
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
        }
        return this.b;
    }
}
