package com.dianping.monitor;

import dianping.com.nvlinker.stub.IMonitorService;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface e extends IMonitorService {
    String getCommand(String str);

    void pv(long j, String str, int i, int i2, int i3, int i4, int i5, int i6);

    void pv3(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2);

    void pv3(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, int i7);

    void pvCat(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str2, String str3, int i8, String str4, String str5, String str6, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str7, String str8);
}
