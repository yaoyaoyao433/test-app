package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.sd;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface sa extends sd.a {
    Class a(String str);

    <T> Class<? extends T> a(String str, Class<T> cls);

    Object a(Class cls, String str, Class[] clsArr, Object[] objArr);

    <T> T a(Class<T> cls, Object... objArr);

    Object a(Object obj, String str, Class[] clsArr, Object[] objArr);

    Object a(Object obj, String str, Object... objArr);

    ClassLoader b();

    Object b(String str);

    int c();

    File d();
}
