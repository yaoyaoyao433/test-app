package com.tencent.map.tools;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class Condition<T> implements ReturnCallback<Boolean, T> {
    public abstract boolean condition(T t);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.map.tools.ReturnCallback
    public /* bridge */ /* synthetic */ Boolean callback(Object obj) {
        return callback((Condition<T>) obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.map.tools.ReturnCallback
    public final Boolean callback(T t) {
        return Boolean.valueOf(condition(t));
    }
}
