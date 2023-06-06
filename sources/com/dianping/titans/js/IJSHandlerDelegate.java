package com.dianping.titans.js;

import android.content.Context;
import android.content.Intent;
import com.dianping.titansmodel.g;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface IJSHandlerDelegate<T extends g> {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnActivityResultListener {
        void onActivityResult(int i, int i2, Intent intent);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnDestroyListener {
        void onDestroy();
    }

    void actionCallback(T t);

    void failCallback(T t);

    Context getContext();

    JsHost getJsHost();

    void setOnActivityResultListener(OnActivityResultListener onActivityResultListener);

    void setOnDestroyListener(OnDestroyListener onDestroyListener);

    void successCallback(T t);
}
