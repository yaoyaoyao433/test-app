package com.meituan.robust;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface RobustExtension {
    Object accessDispatch(RobustArguments robustArguments);

    String describeSelfFunction();

    boolean isSupport(RobustArguments robustArguments);

    void notifyListner(String str);
}
