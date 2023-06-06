package com.meituan.msc.modules.page;

import android.support.annotation.Size;
import android.view.View;
import com.meituan.msi.bean.MsiContext;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface e extends com.meituan.msc.modules.manager.c, d, i {
    b Q_();

    int R_();

    j S_();

    int T_();

    void a(int i);

    void a(int i, int i2, MsiContext msiContext);

    void a(int i, int i2, boolean z);

    void a(com.meituan.msi.page.d dVar);

    void a(boolean z);

    void a(@Size(2) int[] iArr);

    View b();

    int d();

    com.meituan.msc.b e();

    String f();

    boolean g();

    @Nullable
    h h();

    boolean i();

    int[] j();

    f k();

    com.meituan.msc.modules.page.render.a l();

    com.meituan.msc.modules.page.transition.c m();

    com.meituan.msc.modules.page.render.d n();

    int r();

    int u();

    int v();

    int w();

    Map<String, String> x();
}
