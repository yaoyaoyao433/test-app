package com.taobao.gcanvas.bridges.spec.bridge;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IJSCallbackMap {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface IJSCallbackMapKeySetIterator {
        boolean hasNextKey();

        String nextKey();
    }

    IJSCallbackArray getArray(String str);

    boolean getBoolean(String str);

    double getDouble(String str);

    int getInt(String str);

    IJSCallbackMap getMap(String str);

    String getString(String str);

    IJSCallbackType getType(String str);

    boolean hasKey(String str);

    boolean isNull(String str);

    IJSCallbackMapKeySetIterator keySetIterator();

    void merge(IJSCallbackMap iJSCallbackMap);

    void putArray(String str, IJSCallbackArray iJSCallbackArray);

    void putBoolean(String str, boolean z);

    void putDouble(String str, double d);

    void putInt(String str, int i);

    void putMap(String str, IJSCallbackMap iJSCallbackMap);

    void putNull(String str);

    void putString(String str, String str2);
}
