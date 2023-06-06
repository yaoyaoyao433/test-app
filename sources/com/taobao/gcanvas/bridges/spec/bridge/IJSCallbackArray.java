package com.taobao.gcanvas.bridges.spec.bridge;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IJSCallbackArray {
    IJSCallbackArray getArray(int i);

    boolean getBoolean(int i);

    double getDouble(int i);

    int getInt(int i);

    IJSCallbackMap getMap(int i);

    String getString(int i);

    IJSCallbackType getType(int i);

    boolean isNull(int i);

    void pushArray(IJSCallbackArray iJSCallbackArray);

    void pushBoolean(boolean z);

    void pushDouble(double d);

    void pushInt(int i);

    void pushMap(IJSCallbackMap iJSCallbackMap);

    void pushNull();

    void pushString(String str);

    int size();
}
