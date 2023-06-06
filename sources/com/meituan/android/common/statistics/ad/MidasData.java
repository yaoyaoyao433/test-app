package com.meituan.android.common.statistics.ad;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MidasData extends MidasInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String bid;
    public String category;
    public String cid;
    public String pageInfoKey;

    public MidasData(String str, String str2, String str3, Map<String, Object> map, String str4, Object obj, List<String> list, int i, List<String> list2, Map<String, String> map2) {
        super(obj, list, i, list2, map2);
        this.category = str;
        this.pageInfoKey = str2;
        this.bid = str3;
        this.cid = str4;
    }
}
