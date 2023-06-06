package com.meituan.android.neohybrid.util.gson.checker;

import com.meituan.android.neohybrid.util.gson.annotation.Regex;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements a<Regex> {
    public static ChangeQuickRedirect a;
    private static final Map<String, Pattern> b = new HashMap();

    @Override // com.meituan.android.neohybrid.util.gson.checker.a
    public final /* bridge */ /* synthetic */ String a(Regex regex, Object obj) {
        return a2(regex, (Regex) obj);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private <V> String a2(Regex regex, V v) {
        Pattern a2;
        Object[] objArr = {regex, v};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "182417b6c56f4397af1bc32a885bf67b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "182417b6c56f4397af1bc32a885bf67b");
        }
        if (regex == null || v == null || !(v instanceof String) || (a2 = a(regex.regex())) == null) {
            return null;
        }
        try {
            Matcher matcher = a2.matcher((String) v);
            if (regex.isFind() ? matcher.find() : matcher.matches()) {
                return null;
            }
            return "RegexChecker: value is " + v;
        } catch (Exception unused) {
            return null;
        }
    }

    private Pattern a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe8ee2dd9e18982b0211d2c2282d640a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe8ee2dd9e18982b0211d2c2282d640a");
        }
        Pattern pattern = b.get(str);
        if (pattern != null) {
            return pattern;
        }
        try {
            Pattern compile = Pattern.compile(str);
            b.put(str, compile);
            return compile;
        } catch (Exception unused) {
            return null;
        }
    }
}
