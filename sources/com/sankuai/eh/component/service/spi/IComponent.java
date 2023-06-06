package com.sankuai.eh.component.service.spi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface IComponent {
    int a();

    <T> T a(Context context);

    void a(int i, int i2, Intent intent);

    void a(int i, @NonNull String[] strArr, @NonNull int[] iArr);

    void a(Activity activity, Bundle bundle);

    void b();

    boolean c();

    boolean d();
}
