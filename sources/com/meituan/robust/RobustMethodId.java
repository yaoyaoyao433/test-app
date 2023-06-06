package com.meituan.robust;

import com.meituan.robust.common.MD5;
import java.io.PrintStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RobustMethodId {
    private RobustMethodId() {
    }

    public static String getMethodId(String str) {
        return MD5.getHashString(str);
    }

    public static void main(String[] strArr) {
        String methodId = getMethodId("com.dianping.util.WrapInputStream.available()");
        PrintStream printStream = System.err;
        printStream.println("getMethodId : " + methodId);
    }
}
