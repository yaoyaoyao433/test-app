package com.sankuai.xm.imui.common.processors;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.imui.common.entity.a;
import com.sankuai.xm.imui.common.util.h;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b implements c {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final List<com.sankuai.xm.imui.common.entity.a> c;
    private final Pattern d;
    private final Map<String, Integer> e;

    public b(Context context, int i) {
        this(context, h.b(context, h.b(context, i, 0)));
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d05cf982da3f62f5830d32c4f6488e02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d05cf982da3f62f5830d32c4f6488e02");
        }
    }

    public b(Context context, List<com.sankuai.xm.imui.common.entity.a> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f27a3dbf503058046f99e23e432b781f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f27a3dbf503058046f99e23e432b781f");
            return;
        }
        this.b = context.getApplicationContext();
        this.c = list;
        this.e = a(this.c);
        this.d = a(this.e.keySet());
    }

    @Override // com.sankuai.xm.imui.common.processors.c
    public final List<com.sankuai.xm.imui.common.entity.a> a() {
        return this.c;
    }

    private Pattern a(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9278f61dccdbbc17a32085f47aca2d6d", 6917529027641081856L)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9278f61dccdbbc17a32085f47aca2d6d");
        }
        if (com.sankuai.xm.base.util.b.a(set)) {
            return null;
        }
        StringBuilder sb = new StringBuilder((set.size() + 1) * 6);
        sb.append('(');
        for (String str : set) {
            if (str != null) {
                sb.append(Pattern.quote(str));
                sb.append('|');
            }
        }
        if (sb.indexOf(HiAnalyticsConstant.REPORT_VAL_SEPARATOR) != -1) {
            sb.replace(sb.length() - 1, sb.length(), CommonConstant.Symbol.BRACKET_RIGHT);
        } else {
            sb.append(')');
        }
        return Pattern.compile(sb.toString());
    }

    private Map<String, Integer> a(List<com.sankuai.xm.imui.common.entity.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e4271be43ade77e1f221061d370dfa5", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e4271be43ade77e1f221061d370dfa5");
        }
        if (com.sankuai.xm.base.util.b.a(list)) {
            return Collections.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (com.sankuai.xm.imui.common.entity.a aVar : list) {
            if (aVar != null && aVar.d == 1) {
                for (a.C1398a c1398a : aVar.m) {
                    linkedHashMap.put(c1398a.c, Integer.valueOf(c1398a.b));
                }
            }
        }
        return linkedHashMap;
    }

    @Override // com.sankuai.xm.imui.common.processors.e
    public final CharSequence a(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53cd8bd52c1e0ed63f42bb03501d6c1f", 6917529027641081856L) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53cd8bd52c1e0ed63f42bb03501d6c1f") : a(charSequence, 0);
    }

    @Override // com.sankuai.xm.imui.common.processors.c
    public final CharSequence a(CharSequence charSequence, int i) {
        Object[] objArr = {charSequence, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6cc17b0469f5a4a59a03c9209fce0d8", 6917529027641081856L)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6cc17b0469f5a4a59a03c9209fce0d8");
        }
        if (this.d == null) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        a(spannableStringBuilder, i, 0);
        return spannableStringBuilder;
    }

    private int a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        Object[] objArr = {spannableStringBuilder, Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c08df896406665591f7bd43811363513", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c08df896406665591f7bd43811363513")).intValue();
        }
        if (this.d == null || this.e.size() <= 0) {
            return 0;
        }
        Matcher matcher = this.d.matcher(spannableStringBuilder.toString());
        while (matcher.find()) {
            Integer num = this.e.get(matcher.group());
            if (num != null) {
                Drawable drawable = this.b.getResources().getDrawable(num.intValue());
                if (i > 0) {
                    drawable.setBounds(0, 0, i, i);
                }
                spannableStringBuilder.setSpan(new com.sankuai.xm.imui.common.view.b(drawable, 2), matcher.start(), matcher.end(), 33);
            }
        }
        return 0;
    }
}
