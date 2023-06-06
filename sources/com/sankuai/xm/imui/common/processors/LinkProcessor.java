package com.sankuai.xm.imui.common.processors;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class LinkProcessor implements e {
    public static ChangeQuickRedirect a;
    private static final String[] d = {AbsApiFactory.HTTP, AbsApiFactory.HTTPS, "rtsp://"};
    private static final String[] e = {"tel:"};
    private static final Pattern f = Pattern.compile("\\[[^\\[|\\]]+\\|[^\\[|\\]]+\\]");
    private static final Pattern g = Pattern.compile("((https?|itms-services)://)?(([0-9]{1,3}(\\.[0-9]{1,3}){3})|([a-zA-Z0-9-]{1,63}(\\.[a-zA-Z0-9-]{1,63})*(\\.(museum|travel|aero|arpa|asia|coop|info|jobs|mobi|name|biz|cat|com|edu|gov|int|mil|net|org|pro|tel|xxx|ac|ad|ae|af|ag|ai|al|am|an|ao|aq|ar|as|at|au|aw|ax|az|ba|bb|bd|be|bf|bg|bh|bi|bj|bm|bn|bo|br|bs|bt|bw|by|bz|ca|cc|cd|cf|cg|ch|ci|ck|cl|cm|cn|co|cr|cu|cv|cx|cy|cz|de|dj|dk|dm|do|dz|ec|ee|eg|er|es|et|eu|fi|fj|fk|fm|fo|fr|ga|gd|ge|gf|gg|gh|gi|gl|gm|gn|gp|gq|gr|gs|gt|gu|gw|gy|hk|hm|hn|hr|ht|hu|id|ie|il|im|in|io|iq|ir|is|it|je|jm|jo|jp|ke|kg|kh|ki|km|kn|kp|kr|kw|ky|kz|la|lb|lc|li|lk|lr|ls|lt|lu|lv|ly|ma|mc|md|me|mg|mh|mk|ml|mm|mn|mo|mp|mq|mr|ms|mt|mu|mv|mw|mx|my|mz|na|nc|ne|nf|ng|ni|nl|no|np|nr|nu|nz|om|pa|pe|pf|pg|ph|pk|pl|pm|pn|pr|ps|pt|pw|py|qa|re|ro|rs|ru|rw|sa|sb|sc|sd|se|sg|sh|si|sk|sl|sm|sn|so|sr|ss|st|sv|sy|sz|tc|td|tf|tg|th|tj|tk|tl|tm|tn|to|tr|tt|tv|tw|tz|ua|ug|uk|us|uy|uz|va|vc|ve|vg|vi|vn|vu|wf|ws|ye|yt|za|zm|zw))))(:[0-9]{1,5})?([/?#][a-zA-Z0-9:./?'=+_*&^%$#@!~-]*)?");
    private static final Pattern h = Pattern.compile("(?:\\+?(86)?-?)?1(3[0-9]{3}|5[01235-9][0-9]{2}|8[0-9]{3}|7([0-35-9][0-9]{2}|4(0[0-9]|1[0-2]|9[0-9]))|9[0-35-9][0-9]{2}|6[2567][0-9]{2}|4((10|4[01])[0-9]{3}|[68][0-9]{4}|[579][0-9]{2}))[0-9]{6}|(?:\\+?86)?(-)?0\\d{2,4}-\\d{7,8}");
    private static final HashMap<Set<String>, Pattern> j = new HashMap<>();
    public int b;
    public boolean c;
    @NonNull
    private Set<String> i;

    public LinkProcessor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af6d0003847300012cb8d755ed2dbee4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af6d0003847300012cb8d755ed2dbee4");
            return;
        }
        this.b = -1;
        this.c = false;
        this.i = new HashSet();
    }

    public final void a(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fc437ab26054f18100574451ea7c787", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fc437ab26054f18100574451ea7c787");
        } else if (!com.sankuai.xm.base.util.b.a(set)) {
            this.i = set;
            Object[] objArr2 = {set};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0c411ecc4c9982fa25f09476edfcec94", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0c411ecc4c9982fa25f09476edfcec94");
                return;
            }
            try {
                if (!com.sankuai.xm.base.util.b.a(set) && !j.containsKey(set)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("((");
                    for (String str : set) {
                        sb.append(str);
                        sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    sb.append(")://)");
                    sb.append("?(([0-9]{1,3}(\\.[0-9]{1,3}){3})|([a-zA-Z0-9-]{1,63}(\\.[a-zA-Z0-9-]{1,63})*(\\.(museum|travel|aero|arpa|asia|coop|info|jobs|mobi|name|biz|cat|com|edu|gov|int|mil|net|org|pro|tel|xxx|ac|ad|ae|af|ag|ai|al|am|an|ao|aq|ar|as|at|au|aw|ax|az|ba|bb|bd|be|bf|bg|bh|bi|bj|bm|bn|bo|br|bs|bt|bw|by|bz|ca|cc|cd|cf|cg|ch|ci|ck|cl|cm|cn|co|cr|cu|cv|cx|cy|cz|de|dj|dk|dm|do|dz|ec|ee|eg|er|es|et|eu|fi|fj|fk|fm|fo|fr|ga|gd|ge|gf|gg|gh|gi|gl|gm|gn|gp|gq|gr|gs|gt|gu|gw|gy|hk|hm|hn|hr|ht|hu|id|ie|il|im|in|io|iq|ir|is|it|je|jm|jo|jp|ke|kg|kh|ki|km|kn|kp|kr|kw|ky|kz|la|lb|lc|li|lk|lr|ls|lt|lu|lv|ly|ma|mc|md|me|mg|mh|mk|ml|mm|mn|mo|mp|mq|mr|ms|mt|mu|mv|mw|mx|my|mz|na|nc|ne|nf|ng|ni|nl|no|np|nr|nu|nz|om|pa|pe|pf|pg|ph|pk|pl|pm|pn|pr|ps|pt|pw|py|qa|re|ro|rs|ru|rw|sa|sb|sc|sd|se|sg|sh|si|sk|sl|sm|sn|so|sr|ss|st|sv|sy|sz|tc|td|tf|tg|th|tj|tk|tl|tm|tn|to|tr|tt|tv|tw|tz|ua|ug|uk|us|uy|uz|va|vc|ve|vg|vi|vn|vu|wf|ws|ye|yt|za|zm|zw))))(:[0-9]{1,5})?([/?#][a-zA-Z0-9:./?'=+_*&^%$#@!~-]*)?");
                    j.put(set, Pattern.compile(sb.toString()));
                }
            } catch (Throwable th) {
                com.sankuai.xm.imui.common.util.d.a(th);
            }
        }
    }

    @Override // com.sankuai.xm.imui.common.processors.e
    public final CharSequence a(CharSequence charSequence) {
        int i = 0;
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9e3121595b7f3aed15f9a393c5ac828", 6917529027641081856L)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9e3121595b7f3aed15f9a393c5ac828");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Pattern pattern = j.get(this.i);
        if (pattern != null) {
            Matcher matcher = pattern.matcher(charSequence);
            while (matcher.find()) {
                spannableStringBuilder.setSpan(new AutoURLSpan(matcher.group().trim(), this.b, this.c), matcher.start(), matcher.end(), 33);
            }
        }
        Matcher matcher2 = g.matcher(charSequence);
        while (matcher2.find()) {
            String a2 = a(matcher2.group().trim(), d);
            int start = matcher2.start();
            if (!a2.contains("@") && (start == 0 || charSequence.charAt(start - 1) != '@')) {
                spannableStringBuilder.setSpan(new AutoURLSpan(a2, this.b, this.c), matcher2.start(), matcher2.end(), 33);
            }
        }
        Matcher matcher3 = h.matcher(charSequence);
        while (matcher3.find()) {
            spannableStringBuilder.setSpan(new AutoURLSpan(a(matcher3.group(), e), this.b, this.c), matcher3.start(), matcher3.end(), 33);
        }
        Matcher matcher4 = f.matcher(charSequence);
        while (matcher4.find()) {
            int start2 = matcher4.start() - i;
            int end = matcher4.end() - i;
            String trim = matcher4.group().trim();
            int indexOf = trim.indexOf(124);
            String substring = trim.substring(1, indexOf);
            int length = substring.length();
            String trim2 = trim.substring(indexOf + 1, trim.length() - 1).trim();
            spannableStringBuilder.replace(start2, end, (CharSequence) substring);
            spannableStringBuilder.setSpan(new AutoURLSpan(a(trim2, d), this.b, this.c), start2, start2 + length, 33);
            i += (end - start2) - length;
        }
        return spannableStringBuilder;
    }

    private String a(String str, String[] strArr) {
        boolean z = true;
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc1429532400de0a3a6094f87309bb99", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc1429532400de0a3a6094f87309bb99");
        }
        Uri parse = Uri.parse(str);
        if (parse == null || TextUtils.isEmpty(parse.getScheme())) {
            int i = 0;
            while (true) {
                if (i >= strArr.length) {
                    z = false;
                    break;
                } else if (!str.regionMatches(true, 0, strArr[i], 0, strArr[i].length())) {
                    i++;
                } else if (!str.regionMatches(false, 0, strArr[i], 0, strArr[i].length())) {
                    str = strArr[i] + str.substring(strArr[i].length());
                }
            }
            if (z) {
                return str;
            }
            return strArr[0] + str;
        }
        return str;
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1105405115bfe5cba065a4a03198b3be", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1105405115bfe5cba065a4a03198b3be")).booleanValue() : b(str, d);
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f13f114e7dd0eca0437b18ceaa51ca4", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f13f114e7dd0eca0437b18ceaa51ca4")).booleanValue() : b(str, e);
    }

    private static boolean b(String str, String[] strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9dd88404104418cd111da422b9329300", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9dd88404104418cd111da422b9329300")).booleanValue();
        }
        for (int i = 0; i < strArr.length; i++) {
            if (str.regionMatches(true, 0, strArr[i], 0, strArr[i].length())) {
                return true;
            }
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class AutoURLSpan extends URLSpan {
        public static ChangeQuickRedirect a;
        private int c;
        private boolean d;

        public AutoURLSpan(String str, int i, boolean z) {
            super(str);
            Object[] objArr = {LinkProcessor.this, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a825d0ab244d83352eab085a0799d21e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a825d0ab244d83352eab085a0799d21e");
                return;
            }
            this.d = true;
            this.c = i;
            this.d = z;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            Object[] objArr = {textPaint};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fd2dd49cd72b6e285712e6d7f2e88fc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fd2dd49cd72b6e285712e6d7f2e88fc");
                return;
            }
            if (this.c == -1) {
                textPaint.setColor(textPaint.linkColor);
            } else {
                textPaint.setColor(this.c);
            }
            textPaint.setUnderlineText(this.d);
        }
    }
}
