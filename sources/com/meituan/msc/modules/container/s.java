package com.meituan.msc.modules.container;

import android.content.Intent;
import android.support.annotation.Nullable;
import com.meituan.msi.bean.NavActivityInfo;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface s {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(int i, Intent intent);

        void a(int i, String str);
    }

    void a(Intent intent);

    void a(Intent intent, int i, @Nullable a aVar);

    void a(Intent intent, int i, NavActivityInfo navActivityInfo, @Nullable a aVar);

    void a(p pVar, int i, int i2, Intent intent);
}
