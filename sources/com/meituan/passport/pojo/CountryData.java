package com.meituan.passport.pojo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CountryData {
    public static final String COUNTRY_CODE_FROM = "from";
    public static final String COUNTRY_INFO = "country_info";
    public static final String NO_TITLE_BAR = "noTitleBar";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String code;
    private String from;
    private String name;

    public CountryData(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "595085de5c0d6b5577edc69f842f3a6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "595085de5c0d6b5577edc69f842f3a6b");
            return;
        }
        this.code = str;
        this.name = str2;
        this.from = str3;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getFrom() {
        return this.from;
    }
}
