package com.meituan.android.common.statistics.ad;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MidasInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int act;
    public Object adObject;
    public Map<String, String> extraParams;
    public List<String> feedback;
    public List<String> monitoUrls;

    public MidasInfo(Object obj, List<String> list, int i, List<String> list2, Map<String, String> map) {
        this.adObject = obj;
        this.feedback = list;
        this.act = i;
        this.monitoUrls = list2;
        this.extraParams = map;
    }
}
