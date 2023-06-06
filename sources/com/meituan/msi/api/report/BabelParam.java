package com.meituan.msi.api.report;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.HashMap;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class BabelParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String category;
    @MsiParamChecker(required = true)
    public String content;
    public HashMap<String, Object> details;
    public boolean immediately;
    public boolean lv4LocalStatus = false;
    public boolean newLogStatus = false;
    public HashMap<String, Object> options;
    public HashMap<String, Object> raw;
    @MsiParamChecker(required = true)
    public String tag;
    public String token;
    public Long value;
}
