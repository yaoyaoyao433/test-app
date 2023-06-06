package com.meituan.android.neohybrid.framework.webcompat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.titans.ui.TitansUIManager;
import com.sankuai.meituan.android.knb.listener.OnWebViewInitFailedListener;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface b {
    View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup);

    void a();

    void a(int i, int i2, Intent intent);

    void a(int i, @NonNull String[] strArr, @NonNull int[] iArr);

    void a(Activity activity);

    void a(@NonNull Context context, @NonNull Bundle bundle);

    void a(Bundle bundle);

    void a(OnWebViewInitFailedListener onWebViewInitFailedListener);

    void a(Object obj);

    void b();

    void c();

    void d();

    void e();

    void f();

    com.meituan.android.neohybrid.protocol.kernel.c g();

    com.meituan.android.neohybrid.framework.webcompat.element.a h();

    void loadUrl(String str);

    void setUIManager(TitansUIManager titansUIManager);
}
