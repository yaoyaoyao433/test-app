package com.sankuai.waimai.alita.platform.init;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.init.h;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a implements h {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.alita.platform.init.h
    public String a() {
        return "";
    }

    @Override // com.sankuai.waimai.alita.platform.init.h
    public String c() {
        return "";
    }

    @Override // com.sankuai.waimai.alita.platform.init.h
    public String d() {
        return "";
    }

    @Override // com.sankuai.waimai.alita.platform.init.h
    public int e() {
        return 0;
    }

    @Override // com.sankuai.waimai.alita.platform.init.h
    public String f() {
        return "";
    }

    @Override // com.sankuai.waimai.alita.platform.init.h
    public String g() {
        return "";
    }

    @Override // com.sankuai.waimai.alita.platform.init.h
    public String h() {
        return "";
    }

    @Override // com.sankuai.waimai.alita.platform.init.h
    public String i() {
        return "";
    }

    @Override // com.sankuai.waimai.alita.platform.init.h
    public String j() {
        return "";
    }

    @Override // com.sankuai.waimai.alita.platform.init.h
    public String k() {
        return "";
    }

    @Override // com.sankuai.waimai.alita.platform.init.h
    public int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cb3f21b48c6efe165e13feb739e7533", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cb3f21b48c6efe165e13feb739e7533")).intValue() : a(c());
    }

    @Override // com.sankuai.waimai.alita.platform.init.h
    public h.a l() {
        return h.a.RELEASE;
    }

    private int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c852eb75becdcd56e7af22da9334caf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c852eb75becdcd56e7af22da9334caf")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        ArrayList<String> arrayList = new ArrayList();
        Matcher matcher = Pattern.compile("\\d+").matcher(str);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(0);
            if (!TextUtils.isEmpty(group) && b(group)) {
                if (i != 0) {
                    group = String.format(Locale.CHINA, "%04d", Integer.valueOf(Integer.parseInt(group)));
                }
                arrayList.add(group);
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : arrayList) {
            sb.append(str2);
        }
        if (!TextUtils.isEmpty(sb.toString()) && b(sb.toString())) {
            try {
                return Integer.parseInt(sb.toString());
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44ba9d75f8e88bd068562d5746af0de1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44ba9d75f8e88bd068562d5746af0de1")).booleanValue();
        }
        if (str.length() < 10) {
            return true;
        }
        return str.length() == 10 && str.compareTo("2147483647") <= 0;
    }
}
