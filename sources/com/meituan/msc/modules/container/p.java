package com.meituan.msc.modules.container;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.content.Intent;
import com.meituan.msi.bean.NavActivityInfo;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface p {
    boolean A();

    Activity C();

    boolean D();

    int F();

    r G();

    Intent H();

    d.b I();

    boolean M();

    void a(int i, Intent intent);

    void a(long j, int i);

    void a(Intent intent, int i);

    void a(Intent intent, int i, NavActivityInfo navActivityInfo);

    void a(com.meituan.msc.modules.api.input.c cVar);

    void b(com.meituan.msc.modules.api.input.c cVar);

    void b(String str);

    com.meituan.msc.common.framework.interfaces.b e();

    void m();

    void q();

    com.meituan.msc.modules.page.c t();

    @Deprecated
    com.meituan.msc.modules.page.m u();
}
