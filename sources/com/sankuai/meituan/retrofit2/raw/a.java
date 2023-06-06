package com.sankuai.meituan.retrofit2.raw;

import com.sankuai.meituan.retrofit2.aj;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.retrofit2.raw.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0637a {
        a get(aj ajVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b extends InterfaceC0637a {
        void a(boolean z);
    }

    void cancel();

    com.sankuai.meituan.retrofit2.raw.b execute() throws IOException;

    aj request();
}
