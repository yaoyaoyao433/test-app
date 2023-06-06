package com.meituan.android.cube.pga.dynamic;

import com.google.gson.Gson;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface d<T> {
    <O extends com.meituan.android.cube.pga.block.b> O a(com.meituan.android.cube.pga.type.a aVar);

    com.meituan.android.cube.pga.viewmodel.a a(T t);

    T a(String str, Gson gson);

    Type a();
}
