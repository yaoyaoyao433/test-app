package com.sankuai.meituan.model.datarequest.dealfilter;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.model.NoProguard;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@NoProguard
/* loaded from: classes4.dex */
public class Filter implements Serializable {
    public static final String SHOWTYPE_CHECKBOX = "checkbox";
    public static final String SHOWTYPE_CHECKLIST = "checklist";
    public static final String SHOWTYPE_DROPLIST = "droplist";
    public static final String SHOWTYPE_RAGGESELECT = "rangeselect";
    public static final String TYPE_MULTI = "multi";
    public static ChangeQuickRedirect changeQuickRedirect;
    String name;
    String selectkey;
    String showtype;
    String type;
    Map<String, String> values;
}
