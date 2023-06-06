package com.meituan.robust;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RobustArguments {
    public Object current;
    public boolean isStatic;
    public String methodNumber;
    public long methodValue;
    public Object[] paramsArray;

    public RobustArguments(Object[] objArr, Object obj, boolean z, String str, long j) {
        this.paramsArray = objArr;
        this.current = obj;
        this.isStatic = z;
        this.methodNumber = str;
        this.methodValue = j;
    }
}
